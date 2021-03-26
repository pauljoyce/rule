package com.clinical.controller;



import com.clinical.service.RuleRunService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TaskTimeRun {

    @Autowired
    RuleRunController ruleRunController;

    private final Logger log= LoggerFactory.getLogger(TaskTimeRun.class);

    @Scheduled(cron="0 0 6 * * ?")  //每天6点执行一次
    //@Scheduled(cron="0 * * * * ?")  //每分钟执行一次
    public void RunTaskEveryMonth(){
        log.info("开始执行定时人物。。。。");
        ruleRunController.runTask();
        log.info("任务已经结束。。。。");
    }



   // @Scheduled(cron="0 0 6 * * ?")  //每天6点执行一次
    //@Scheduled(cron="0 * * * * ?")  //每分钟执行一次
    public void RunTaskEveryDay(){
        log.info("开始执行定时人物。。。。");
        ruleRunController.runTaskEveryDay();
        log.info("任务已经结束。。。。");
    }



}
