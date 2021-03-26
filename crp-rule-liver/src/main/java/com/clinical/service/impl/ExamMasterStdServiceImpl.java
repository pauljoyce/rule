package com.clinical.service.impl;
import com.clinical.dao.cluster.ExamMasterStdMapper;
import com.clinical.model.cluster.ExamMasterStd;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.ExamMasterStdService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExamMasterStdServiceImpl implements ExamMasterStdService {

    @Autowired
    ExamMasterStdMapper    examMasterStdMapper;



    @Override
    public  void saveExamMasterStd(ExamMasterStd examMasterStd) {
         examMasterStdMapper.saveExamMasterStd(examMasterStd);

     }

    @Override
    public  void deleteExamMasterStd(List<String> uniqueId) {
         examMasterStdMapper.deleteExamMasterStd(uniqueId);

     }
}