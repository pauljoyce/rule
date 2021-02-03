package com.clinical.service.impl;
import com.clinical.dao.cluster.TemDeathRecordMapper;
import com.clinical.model.cluster.TemDeathRecord;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.TemDeathRecordService;
import org.springframework.stereotype.Service;

@Service
public class TemDeathRecordServiceImpl implements TemDeathRecordService {

    @Autowired
    TemDeathRecordMapper    temDeathRecordMapper;



    @Override
    public  void saveTemDeathRecord(TemDeathRecord temDeathRecord) {
         temDeathRecordMapper.saveTemDeathRecord(temDeathRecord);

     }
}