package com.clinical.service.impl;
import com.clinical.dao.cluster.TemOutpDischargeStatusMapper;
import com.clinical.model.cluster.TemOutpDischargeStatus;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.TemOutpDischargeStatusService;
import org.springframework.stereotype.Service;

@Service
public class TemOutpDischargeStatusServiceImpl implements TemOutpDischargeStatusService {

    @Autowired
    TemOutpDischargeStatusMapper    temOutpDischargeStatusMapper;



    @Override
    public  void saveTemOutpDischargeStatus(TemOutpDischargeStatus temOutpDischargeStatus) {
         temOutpDischargeStatusMapper.saveTemOutpDischargeStatus(temOutpDischargeStatus);

     }
}