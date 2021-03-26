package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.OperationRecord;
public interface OperationRecordMapper {
    List<OperationRecord>  findOperationRecordByUniqueId(String uniqueId);
    void   saveOperationRecord(OperationRecord operationRecord);
    void   updateOperationRecord(OperationRecord operationRecord);
    void   deleteOperationRecord(List<String> unique_id);

}