package com.clinical.service.impl;
import com.clinical.dao.cluster.EmergencyRecordMapper;
import com.clinical.model.cluster.EmergencyRecord;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.EmergencyRecordService;
import org.springframework.stereotype.Service;

@Service
public class EmergencyRecordServiceImpl implements EmergencyRecordService {

    @Autowired
    EmergencyRecordMapper    emergencyRecordMapper;



    @Override
    public  void saveEmergencyRecord(EmergencyRecord emergencyRecord) {
         emergencyRecordMapper.saveEmergencyRecord(emergencyRecord);

     }
}