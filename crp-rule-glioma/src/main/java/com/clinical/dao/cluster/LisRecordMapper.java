package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.LisRecord;
public interface LisRecordMapper {
    List<LisRecord>  findLisRecord(String uniqueId);
    void   saveLisRecord(LisRecord lisRecord);
    void   updateLisRecord(LisRecord lisRecord);

}