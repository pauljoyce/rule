package com.clinical.service.impl;
import com.clinical.dao.cluster.SymptomCsgMapper;
import com.clinical.model.cluster.SymptomCsg;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.SymptomCsgService;
import org.springframework.stereotype.Service;

@Service
public class SymptomCsgServiceImpl implements SymptomCsgService {

    @Autowired
    SymptomCsgMapper    symptomCsgMapper;



    @Override
    public  void saveSymptomCsg(SymptomCsg symptomCsg) {
         symptomCsgMapper.saveSymptomCsg(symptomCsg);

     }
}