package com.clinical.controller;

import com.clinical.service.RuleRunService;
import com.clinical.service.impl.RuleRunServiceImpl;
import io.swagger.models.auth.In;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("threadRunTask")
@Scope("prototype")
public class ThreadRunTask implements Runnable {
    private final Logger log= LoggerFactory.getLogger(ThreadRunTask.class);

    Integer last;
    Integer first;


    @Autowired
    RuleRunService  ruleRunService;

    @Override
    public void run() {

        log.info(Thread.currentThread().getName()+"--开始");
        Integer size=10;
        Integer step=((last-first)/size)+1;
        Integer startNo=first;
        for(int i=0;i<step;i++){
            if(i==step-1){
                size=last-startNo;
            }
            ruleRunService.saveRuleRun(startNo,size,"");
            startNo=startNo+size;
        }
        log.info(Thread.currentThread().getName()+"--结束");
    }

    public Integer getLast() {
        return last;
    }

    public void setLast(Integer last) {
        this.last = last;
    }

    public Integer getFirst() {
        return first;
    }

    public void setFirst(Integer first) {
        this.first = first;
    }
}
