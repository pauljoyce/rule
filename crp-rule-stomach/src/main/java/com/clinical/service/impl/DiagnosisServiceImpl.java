package com.clinical.service.impl;
import com.clinical.dao.cluster.DiagnosisMapper;
import com.clinical.model.cluster.Diagnosis;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.DiagnosisService;
import org.springframework.stereotype.Service;

@Service
public class DiagnosisServiceImpl implements DiagnosisService {

    @Autowired
    DiagnosisMapper    diagnosisMapper;



    @Override
    public  void saveDiagnosis(Diagnosis diagnosis) {
         diagnosisMapper.saveDiagnosis(diagnosis);

     }

    @Override
    public  void deleteDiagnosis(String  uniqueId) {
         diagnosisMapper.deleteDiagnosis(uniqueId);

     }
}