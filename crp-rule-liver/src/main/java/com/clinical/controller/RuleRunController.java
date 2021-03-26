package com.clinical.controller;

import com.clinical.config.ApplicationContextProvider;
import com.clinical.config.SystemPath;
import com.clinical.service.RuleRunService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rule")
public class RuleRunController{
    private final Logger log= LoggerFactory.getLogger(RuleRunController.class);

    @Autowired
    RuleRunService ruleRunService;

    @Autowired
    SystemPath systemPath;

    @RequestMapping("/run")
    public void ruleRun(Integer pageNo,Integer pageSize,String flag){
        ruleRunService.saveRuleRun(pageNo,pageSize,flag);

        System.out.println("完成导入。。");
    }



    @RequestMapping("/runStep")
    public void ruleRunStep(Integer pageNo,Integer pageSize,String flag){

        Integer size=Integer.parseInt(flag);
        Integer step= (pageSize/size)+1;
        for(int i=0;i<step;i++){
            ruleRunService.saveRuleRun(i*size,size,"");
        }
        System.out.println("完成导入。。");
    }


    @RequestMapping("/runStepMid")
    public void ruleRunStepMid(Integer start,Integer end,String flag){

        Integer size=Integer.parseInt(flag);
        Integer step=((end-start)/size)+1;
        Integer startNo=start;
        for(int i=0;i<step;i++){
            ruleRunService.saveRuleRun(startNo,size,"");
            startNo=startNo+size;
        }
        System.out.println("完成导入。。");
    }


    @RequestMapping("/deleteAll")
    public Integer truncateAllTable(){
        return ruleRunService.runTruncateAllTable();

    }

    @RequestMapping("/runShell")
    public String runShell(String shellCommand){
        ShellUtil javaShellUtil = new ShellUtil();
        try {
            javaShellUtil.executeShell("sh /opt/clinical/rule/aa.sh");
        }catch (Exception e){
            e.printStackTrace();
        }
        return  "完成";

    }

    @RequestMapping("/runMultThread")
    public String runTask() {
        try {
            //清除所有表数据并得到全量数据条数
            //测试数据条数应大于5
            Integer all = ruleRunService.runTruncateAllTable();
            log.info("获取中间库全量人数为：" + all);
            int size = all / 5;
            for (int i = 0; i < 5; i++) {
                int start = i * size;
                int end = ((i + 1) * size);
                if (i == 4) {
                    end = all;
                }
                ThreadRunTask task = ApplicationContextProvider.getBean("threadRunTask", ThreadRunTask.class);
                task.setFirst(start);
                task.setLast(end);
                log.info("本线程开始偏移量：" + start + "-----结束偏移量" + end);
                Thread t1 = new Thread(task);
                t1.start();

            }

            ShellUtil javaShellUtil = new ShellUtil();
            try {
                log.info("执行shell脚本开始-------");
                javaShellUtil.executeShell("sh " + systemPath.getShellPath());
            } catch (Exception e) {
               throw  e;
            }
        }catch (Exception e){
            e.printStackTrace();
            return "执行失败";
        }
        log.info("完成shell脚本的执行-------");
        return "执行成功";
        
    }


    public static void main(String[] args){
        Integer all=102;
        int size=all/5;
        for(int i=0;i<5;i++) {
            int start = i * size;
            int end = ((i + 1) * size);
            if (i == 4) {
                end = all;
            }
            System.out.println("start:"+start+"---end:"+end);
        }

     /*   Integer last=24;
        Integer first=0;
        Integer size=5;
        Integer step=((last-first)/size)+1;
        Integer startNo=0;
        for(int i=0;i<step;i++){
            if(i==step-1){
                size=last-startNo;
            }
           System.out.println(startNo+"---"+size);
            startNo=startNo+size;
        }
*/

    }

    @RequestMapping("/runTaskEveryDay")
    public String runTaskEveryDay() {

        try {
            Integer everyDayAll = ruleRunService.deleteAlltableByUniqueid();

            if (everyDayAll <= 10) {
                ruleRunService.saveRuleRun(0, everyDayAll, "");
            } else {
                Integer size = 10;
                Integer step = (everyDayAll / size) + 1;
                for (int i = 0; i < step; i++) {
                    ruleRunService.saveRuleRun(i * size, size, "");
                }
            }


            ShellUtil javaShellUtil = new ShellUtil();
            try {
                log.info("执行shell脚本开始-------");
                javaShellUtil.executeShell("sh " + systemPath.getShellPath());
            } catch (Exception e) {
                e.printStackTrace();
            }


            System.out.println("完成日增导入。。");
        }catch (Exception e){
            e.printStackTrace();
            return "执行失败";
        }
          return "执行成功";

    }
}
