package com.clinical.service.impl;
import com.clinical.dao.cluster.VisitRecordMapper;
import com.clinical.model.cluster.VisitRecord;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.VisitRecordService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisitRecordServiceImpl implements VisitRecordService {

    @Autowired
    VisitRecordMapper    visitRecordMapper;



    @Override
    public  void saveVisitRecord(VisitRecord visitRecord) {
         visitRecordMapper.saveVisitRecord(visitRecord);

     }

    @Override
    public  void deleteVisitRecord(List<String> uniqueId) {
         visitRecordMapper.deleteVisitRecord(uniqueId);

     }
}