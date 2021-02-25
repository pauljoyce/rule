package com.clinical.controller;

import com.clinical.dao.master.ZjFollowUpMapper;
import com.clinical.model.cluster.FollowUp;
import com.clinical.model.cluster.LisRecord;
import com.clinical.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/MQ")
public class MQSaveController {
    @Autowired
    FollowUpService followUpService;
    @Autowired
    LisRecordService lisRecordService;
    @Autowired
    AbdominalXResultService abdominalXResultService;
    @Autowired
    ExamMasterService examMasterService;
    @Autowired
    BeforeTreatmentService beforeTreatmentService;
    @RequestMapping("/followUp")
    public void ruleRun(){

        followUpService.inFollowUp();
        System.out.println("完成导入。。");
    }

    @RequestMapping("/LisRecord")
    public void LisRecordRun(){

        lisRecordService.inLisRecord();
        System.out.println("完成导入。。");
    }

    @RequestMapping("/abdominalXResult")
    public void abdominalXResultRun(){
        abdominalXResultService.inAbdominalXResult();
        System.out.println("完成导入。。");
    }
    @RequestMapping("/examMaster")
    public void examMasterRun(){
        examMasterService.inExamMaster();
        System.out.println("完成导入。。");
    }

    @RequestMapping("/beforeTreatment")

    public void beforeTreatmentRun(){
        beforeTreatmentService.inBeforeTreatment();
        System.out.println("完成导入。。");
    }
}
