package com.clinical.service.impl;
import com.clinical.dao.cluster.ExamDescriptionMapper;
import com.clinical.model.cluster.ExamDescription;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.ExamDescriptionService;
import org.springframework.stereotype.Service;

@Service
public class ExamDescriptionServiceImpl implements ExamDescriptionService {

    @Autowired
    ExamDescriptionMapper    examDescriptionMapper;



    @Override
    public  void saveExamDescription(ExamDescription examDescription) {
         examDescriptionMapper.saveExamDescription(examDescription);

     }
}