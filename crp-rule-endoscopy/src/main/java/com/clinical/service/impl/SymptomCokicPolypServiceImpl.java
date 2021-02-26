package com.clinical.service.impl;
import com.clinical.dao.cluster.SymptomCokicPolypMapper;
import com.clinical.model.cluster.SymptomCokicPolyp;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.SymptomCokicPolypService;
import org.springframework.stereotype.Service;

@Service
public class SymptomCokicPolypServiceImpl implements SymptomCokicPolypService {

    @Autowired
    SymptomCokicPolypMapper    symptomCokicPolypMapper;



    @Override
    public  void saveSymptomCokicPolyp(SymptomCokicPolyp symptomCokicPolyp) {
         symptomCokicPolypMapper.saveSymptomCokicPolyp(symptomCokicPolyp);

     }
}