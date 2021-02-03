package com.clinical.service;
import com.clinical.model.cluster.DiagnosisStage;


public interface DiagnosisStageService {



    public  void saveDiagnosisStage(DiagnosisStage diagnosisStage);

    public  void deleteDiagnosisStage(String uniqueId);

}