package com.clinical.service.impl;
import com.clinical.dao.cluster.LisRecordMapper;
import com.clinical.model.cluster.LisRecord;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.LisRecordService;
import org.springframework.stereotype.Service;

@Service
public class LisRecordServiceImpl implements LisRecordService {

    @Autowired
    LisRecordMapper    lisRecordMapper;



    @Override
    public  void saveLisRecord(LisRecord lisRecord) {
         lisRecordMapper.saveLisRecord(lisRecord);

     }
}