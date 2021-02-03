package com.clinical.service.impl;
import com.clinical.dao.cluster.SurgicalRecordMapper;
import com.clinical.model.cluster.SurgicalRecord;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.SurgicalRecordService;
import org.springframework.stereotype.Service;

@Service
public class SurgicalRecordServiceImpl implements SurgicalRecordService {

    @Autowired
    SurgicalRecordMapper    surgicalRecordMapper;



    @Override
    public  void saveSurgicalRecord(SurgicalRecord surgicalRecord) {
         surgicalRecordMapper.saveSurgicalRecord(surgicalRecord);

     }
}