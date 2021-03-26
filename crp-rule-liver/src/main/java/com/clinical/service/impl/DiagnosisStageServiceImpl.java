package com.clinical.service.impl;
import com.clinical.dao.cluster.DiagnosisStageMapper;
import com.clinical.model.cluster.DiagnosisStage;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.DiagnosisStageService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiagnosisStageServiceImpl implements DiagnosisStageService {

    @Autowired
    DiagnosisStageMapper    diagnosisStageMapper;



    @Override
    public  void saveDiagnosisStage(DiagnosisStage diagnosisStage) {
         diagnosisStageMapper.saveDiagnosisStage(diagnosisStage);

     }

    @Override
    public  void deleteDiagnosisStage(List<String> uniqueId) {
         diagnosisStageMapper.deleteDiagnosisStage(uniqueId);

     }
}