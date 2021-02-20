package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.SurgicalRecord;
public interface SurgicalRecordMapper {
    List<SurgicalRecord>  findSurgicalRecord(String uniqueId);
    void   saveSurgicalRecord(SurgicalRecord surgicalRecord);
    void   updateSurgicalRecord(SurgicalRecord surgicalRecord);

}