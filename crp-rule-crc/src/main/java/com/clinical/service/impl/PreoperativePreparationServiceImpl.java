package com.clinical.service.impl;
import com.clinical.dao.cluster.PreoperativePreparationMapper;
import com.clinical.model.cluster.PreoperativePreparation;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.PreoperativePreparationService;
import org.springframework.stereotype.Service;

@Service
public class PreoperativePreparationServiceImpl implements PreoperativePreparationService {

    @Autowired
    PreoperativePreparationMapper    preoperativePreparationMapper;



    @Override
    public  void savePreoperativePreparation(PreoperativePreparation preoperativePreparation) {
         preoperativePreparationMapper.savePreoperativePreparation(preoperativePreparation);

     }
}