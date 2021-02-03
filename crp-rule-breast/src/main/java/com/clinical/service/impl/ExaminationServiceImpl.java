package com.clinical.service.impl;
import com.clinical.dao.cluster.ExaminationMapper;
import com.clinical.model.cluster.Examination;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.ExaminationService;
import org.springframework.stereotype.Service;

@Service
public class ExaminationServiceImpl implements ExaminationService {

    @Autowired
    ExaminationMapper    examinationMapper;



    @Override
    public  void saveExamination(Examination examination) {
         examinationMapper.saveExamination(examination);

     }
}