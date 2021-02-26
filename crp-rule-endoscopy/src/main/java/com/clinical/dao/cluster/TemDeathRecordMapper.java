package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.TemDeathRecord;
public interface TemDeathRecordMapper {
    List<TemDeathRecord>  findTemDeathRecord(String uniqueId);
    void   saveTemDeathRecord(TemDeathRecord temDeathRecord);
    void   updateTemDeathRecord(TemDeathRecord temDeathRecord);

}