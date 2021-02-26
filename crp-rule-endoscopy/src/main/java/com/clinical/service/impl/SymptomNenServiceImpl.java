package com.clinical.service.impl;
import com.clinical.dao.cluster.SymptomNenMapper;
import com.clinical.model.cluster.SymptomNen;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.SymptomNenService;
import org.springframework.stereotype.Service;

@Service
public class SymptomNenServiceImpl implements SymptomNenService {

    @Autowired
    SymptomNenMapper    symptomNenMapper;



    @Override
    public  void saveSymptomNen(SymptomNen symptomNen) {
         symptomNenMapper.saveSymptomNen(symptomNen);

     }
}