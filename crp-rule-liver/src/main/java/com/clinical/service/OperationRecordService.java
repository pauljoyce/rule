package com.clinical.service;
import com.clinical.model.cluster.OperationRecord;

import java.util.List;


public interface OperationRecordService {



    public  void saveOperationRecord(OperationRecord operationRecord);

    public  void deleteOperationRecord(List<String> uniqueId);

}