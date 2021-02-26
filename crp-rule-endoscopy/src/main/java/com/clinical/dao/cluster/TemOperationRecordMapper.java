package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.TemOperationRecord;
public interface TemOperationRecordMapper {
    List<TemOperationRecord>  findTemOperationRecord(String uniqueId);
    void   saveTemOperationRecord(TemOperationRecord temOperationRecord);
    void   updateTemOperationRecord(TemOperationRecord temOperationRecord);

}