package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.VisitRecord;
public interface VisitRecordMapper {
    List<VisitRecord>  findVisitRecord(String uniqueId);
    void   saveVisitRecord(VisitRecord visitRecord);
    void   updateVisitRecord(VisitRecord visitRecord);

}