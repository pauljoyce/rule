package com.clinical.service.impl;
import com.clinical.dao.cluster.ExamResultMapper;
import com.clinical.model.cluster.ExamResult;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.ExamResultService;
import org.springframework.stereotype.Service;

@Service
public class ExamResultServiceImpl implements ExamResultService {

    @Autowired
    ExamResultMapper    examResultMapper;



    @Override
    public  void saveExamResult(ExamResult examResult) {
         examResultMapper.saveExamResult(examResult);

     }
}