package com.clinical.service;
import com.clinical.model.cluster.Symptom;


public interface SymptomService {



    public  void saveSymptom(Symptom symptom);

    public  void deleteSymptom(String uniqueId);

}