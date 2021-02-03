package com.clinical.service.impl;
import com.clinical.dao.cluster.OutpRecordMapper;
import com.clinical.model.cluster.OutpRecord;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.OutpRecordService;
import org.springframework.stereotype.Service;

@Service
public class OutpRecordServiceImpl implements OutpRecordService {

    @Autowired
    OutpRecordMapper    outpRecordMapper;



    @Override
    public  void saveOutpRecord(OutpRecord outpRecord) {
         outpRecordMapper.saveOutpRecord(outpRecord);

     }
}