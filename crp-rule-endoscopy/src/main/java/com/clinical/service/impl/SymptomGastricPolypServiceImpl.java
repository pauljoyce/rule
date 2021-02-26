package com.clinical.service.impl;
import com.clinical.dao.cluster.SymptomGastricPolypMapper;
import com.clinical.model.cluster.SymptomGastricPolyp;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.SymptomGastricPolypService;
import org.springframework.stereotype.Service;

@Service
public class SymptomGastricPolypServiceImpl implements SymptomGastricPolypService {

    @Autowired
    SymptomGastricPolypMapper    symptomGastricPolypMapper;



    @Override
    public  void saveSymptomGastricPolyp(SymptomGastricPolyp symptomGastricPolyp) {
         symptomGastricPolypMapper.saveSymptomGastricPolyp(symptomGastricPolyp);

     }
}