package com.clinical.service;
import com.clinical.model.cluster.VisitRecord;

import java.util.List;


public interface VisitRecordService {



    public  void saveVisitRecord(VisitRecord visitRecord);

    public  void deleteVisitRecord(String uniqueId);


}