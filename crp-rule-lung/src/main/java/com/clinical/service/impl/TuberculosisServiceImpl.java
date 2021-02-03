package com.clinical.service.impl;
import com.clinical.dao.cluster.TuberculosisMapper;
import com.clinical.model.cluster.Tuberculosis;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.TuberculosisService;
import org.springframework.stereotype.Service;

@Service
public class TuberculosisServiceImpl implements TuberculosisService {

    @Autowired
    TuberculosisMapper    tuberculosisMapper;



    @Override
    public  void saveTuberculosis(Tuberculosis tuberculosis) {
         tuberculosisMapper.saveTuberculosis(tuberculosis);

     }
}