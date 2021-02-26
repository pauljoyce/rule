package com.clinical.service.impl;
import com.clinical.dao.cluster.SymptomGastricCancerMapper;
import com.clinical.model.cluster.SymptomGastricCancer;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.SymptomGastricCancerService;
import org.springframework.stereotype.Service;

@Service
public class SymptomGastricCancerServiceImpl implements SymptomGastricCancerService {

    @Autowired
    SymptomGastricCancerMapper    symptomGastricCancerMapper;



    @Override
    public  void saveSymptomGastricCancer(SymptomGastricCancer symptomGastricCancer) {
         symptomGastricCancerMapper.saveSymptomGastricCancer(symptomGastricCancer);

     }
}