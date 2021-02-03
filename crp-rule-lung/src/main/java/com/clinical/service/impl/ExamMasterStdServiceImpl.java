package com.clinical.service.impl;
import com.clinical.dao.cluster.ExamMasterStdMapper;
import com.clinical.model.cluster.ExamMasterStd;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.ExamMasterStdService;
import org.springframework.stereotype.Service;

@Service
public class ExamMasterStdServiceImpl implements ExamMasterStdService {

    @Autowired
    ExamMasterStdMapper    examMasterStdMapper;



    @Override
    public  void saveExamMasterStd(ExamMasterStd examMasterStd) {
         examMasterStdMapper.saveExamMasterStd(examMasterStd);

     }
}