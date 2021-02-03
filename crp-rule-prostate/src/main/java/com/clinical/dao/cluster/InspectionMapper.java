package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.Inspection;
public interface InspectionMapper {
    List<Inspection>  findInspection(String uniqueId);
    void   saveInspection(Inspection inspection);
    void   updateInspection(Inspection inspection);

}