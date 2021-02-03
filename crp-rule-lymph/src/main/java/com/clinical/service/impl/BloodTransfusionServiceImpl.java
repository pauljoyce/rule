package com.clinical.service.impl;
import com.clinical.dao.cluster.BloodTransfusionMapper;
import com.clinical.model.cluster.BloodTransfusion;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.BloodTransfusionService;
import org.springframework.stereotype.Service;

@Service
public class BloodTransfusionServiceImpl implements BloodTransfusionService {

    @Autowired
    BloodTransfusionMapper    bloodTransfusionMapper;



    @Override
    public  void saveBloodTransfusion(BloodTransfusion bloodTransfusion) {
         bloodTransfusionMapper.saveBloodTransfusion(bloodTransfusion);

     }
}