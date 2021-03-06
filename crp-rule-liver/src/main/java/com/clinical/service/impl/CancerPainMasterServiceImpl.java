package com.clinical.service.impl;
import com.clinical.dao.cluster.CancerPainMasterMapper;
import com.clinical.model.cluster.CancerPainMaster;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.CancerPainMasterService;
import org.springframework.stereotype.Service;

@Service
public class CancerPainMasterServiceImpl implements CancerPainMasterService {

    @Autowired
    CancerPainMasterMapper    cancerPainMasterMapper;



    @Override
    public  void saveCancerPainMaster(CancerPainMaster cancerPainMaster) {
         cancerPainMasterMapper.saveCancerPainMaster(cancerPainMaster);

     }
}