package com.clinical.service.impl;
import com.clinical.dao.cluster.SymptomEcdtMapper;
import com.clinical.model.cluster.SymptomEcdt;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.SymptomEcdtService;
import org.springframework.stereotype.Service;

@Service
public class SymptomEcdtServiceImpl implements SymptomEcdtService {

    @Autowired
    SymptomEcdtMapper    symptomEcdtMapper;



    @Override
    public  void saveSymptomEcdt(SymptomEcdt symptomEcdt) {
         symptomEcdtMapper.saveSymptomEcdt(symptomEcdt);

     }
}