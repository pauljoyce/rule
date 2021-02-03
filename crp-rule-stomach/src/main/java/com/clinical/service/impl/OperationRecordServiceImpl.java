package com.clinical.service.impl;
import com.clinical.dao.cluster.OperationRecordMapper;
import com.clinical.model.cluster.OperationRecord;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.OperationRecordService;
import org.springframework.stereotype.Service;

@Service
public class OperationRecordServiceImpl implements OperationRecordService {

    @Autowired
    OperationRecordMapper    operationRecordMapper;



    @Override
    public  void saveOperationRecord(OperationRecord operationRecord) {
         operationRecordMapper.saveOperationRecord(operationRecord);

     }

    @Override
    public  void deleteOperationRecord(String  uniqueId) {
         operationRecordMapper.deleteOperationRecord(uniqueId);

     }
}