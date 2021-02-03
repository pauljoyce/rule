package com.clinical.service.impl;
import com.clinical.dao.cluster.HypertensionMapper;
import com.clinical.model.cluster.Hypertension;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.HypertensionService;
import org.springframework.stereotype.Service;

@Service
public class HypertensionServiceImpl implements HypertensionService {

    @Autowired
    HypertensionMapper    hypertensionMapper;



    @Override
    public  void saveHypertension(Hypertension hypertension) {
         hypertensionMapper.saveHypertension(hypertension);

     }
}