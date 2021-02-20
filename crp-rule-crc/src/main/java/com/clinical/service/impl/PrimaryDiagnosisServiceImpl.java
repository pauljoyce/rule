package com.clinical.service.impl;
import com.clinical.dao.cluster.PrimaryDiagnosisMapper;
import com.clinical.model.cluster.PrimaryDiagnosis;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.PrimaryDiagnosisService;
import org.springframework.stereotype.Service;

@Service
public class PrimaryDiagnosisServiceImpl implements PrimaryDiagnosisService {

    @Autowired
    PrimaryDiagnosisMapper    primaryDiagnosisMapper;



    @Override
    public  void savePrimaryDiagnosis(PrimaryDiagnosis primaryDiagnosis) {
         primaryDiagnosisMapper.savePrimaryDiagnosis(primaryDiagnosis);

     }
}