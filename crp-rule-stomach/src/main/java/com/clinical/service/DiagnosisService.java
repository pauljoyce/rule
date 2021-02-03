package com.clinical.service;
import com.clinical.model.cluster.Diagnosis;


public interface DiagnosisService {



    public  void saveDiagnosis(Diagnosis diagnosis);

    public  void deleteDiagnosis(String uniqueId);

}