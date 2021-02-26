package com.clinical.service.impl;
import com.clinical.dao.cluster.SymptomCagMapper;
import com.clinical.model.cluster.SymptomCag;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.SymptomCagService;
import org.springframework.stereotype.Service;

@Service
public class SymptomCagServiceImpl implements SymptomCagService {

    @Autowired
    SymptomCagMapper    symptomCagMapper;



    @Override
    public  void saveSymptomCag(SymptomCag symptomCag) {
         symptomCagMapper.saveSymptomCag(symptomCag);

     }
}