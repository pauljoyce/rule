package com.clinical.service.impl;
import com.clinical.dao.cluster.SymptomMapper;
import com.clinical.model.cluster.Symptom;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.SymptomService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SymptomServiceImpl implements SymptomService {

    @Autowired
    SymptomMapper    symptomMapper;



    @Override
    public  void saveSymptom(Symptom symptom) {
         symptomMapper.saveSymptom(symptom);

     }

    @Override
    public  void deleteSymptom(List<String> uniqueId) {
         symptomMapper.deleteSymptom(uniqueId);

     }
}