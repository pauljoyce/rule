package com.clinical.service.impl;
import com.clinical.dao.cluster.HisVitalSignMapper;
import com.clinical.model.cluster.HisVitalSign;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.HisVitalSignService;
import org.springframework.stereotype.Service;

@Service
public class HisVitalSignServiceImpl implements HisVitalSignService {

    @Autowired
    HisVitalSignMapper    hisVitalSignMapper;



    @Override
    public  void saveHisVitalSign(HisVitalSign hisVitalSign) {
         hisVitalSignMapper.saveHisVitalSign(hisVitalSign);

     }
}