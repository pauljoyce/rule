package com.clinical.service;
import com.clinical.model.cluster.DiagnosisStage;

import java.util.List;


public interface DiagnosisStageService {



    public  void saveDiagnosisStage(DiagnosisStage diagnosisStage);

    public  void deleteDiagnosisStage(List<String> uniqueId);

}