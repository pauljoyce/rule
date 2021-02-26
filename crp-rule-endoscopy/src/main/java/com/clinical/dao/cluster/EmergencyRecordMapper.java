package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.EmergencyRecord;
public interface EmergencyRecordMapper {
    List<EmergencyRecord>  findEmergencyRecord(String uniqueId);
    void   saveEmergencyRecord(EmergencyRecord emergencyRecord);
    void   updateEmergencyRecord(EmergencyRecord emergencyRecord);

}