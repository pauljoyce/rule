package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.OperationRecord;
public interface OperationRecordMapper {
    List<OperationRecord>  findOperationRecord(String uniqueId);
    void   saveOperationRecord(OperationRecord operationRecord);
    void   updateOperationRecord(OperationRecord operationRecord);

}