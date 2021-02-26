package com.clinical.service.impl;
import com.clinical.dao.cluster.SymptomPepticUlcerMapper;
import com.clinical.model.cluster.SymptomPepticUlcer;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.SymptomPepticUlcerService;
import org.springframework.stereotype.Service;

@Service
public class SymptomPepticUlcerServiceImpl implements SymptomPepticUlcerService {

    @Autowired
    SymptomPepticUlcerMapper    symptomPepticUlcerMapper;



    @Override
    public  void saveSymptomPepticUlcer(SymptomPepticUlcer symptomPepticUlcer) {
         symptomPepticUlcerMapper.saveSymptomPepticUlcer(symptomPepticUlcer);

     }
}