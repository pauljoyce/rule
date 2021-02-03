package com.clinical.controller;

import com.clinical.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rule")
public class RuleRunController {


    @Autowired
    RuleRunService ruleRunService;

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
}
