package com.clinical.service.impl;
import com.clinical.dao.cluster.TemOperationRecordMapper;
import com.clinical.model.cluster.TemOperationRecord;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.TemOperationRecordService;
import org.springframework.stereotype.Service;

@Service
public class TemOperationRecordServiceImpl implements TemOperationRecordService {

    @Autowired
    TemOperationRecordMapper    temOperationRecordMapper;



    @Override
    public  void saveTemOperationRecord(TemOperationRecord temOperationRecord) {
         temOperationRecordMapper.saveTemOperationRecord(temOperationRecord);

     }
}