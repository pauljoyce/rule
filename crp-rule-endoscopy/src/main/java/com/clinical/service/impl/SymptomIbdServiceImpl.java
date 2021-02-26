package com.clinical.service.impl;
import com.clinical.dao.cluster.SymptomIbdMapper;
import com.clinical.model.cluster.SymptomIbd;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.SymptomIbdService;
import org.springframework.stereotype.Service;

@Service
public class SymptomIbdServiceImpl implements SymptomIbdService {

    @Autowired
    SymptomIbdMapper    symptomIbdMapper;



    @Override
    public  void saveSymptomIbd(SymptomIbd symptomIbd) {
         symptomIbdMapper.saveSymptomIbd(symptomIbd);

     }
}