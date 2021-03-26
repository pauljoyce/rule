package com.clinical.service;
import com.clinical.model.cluster.Symptom;

import java.util.List;


public interface SymptomService {



    public  void saveSymptom(Symptom symptom);

    public  void deleteSymptom(List<String> uniqueId);

}