package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.BeforeTreatment;
public interface BeforeTreatmentMapper {
    List<BeforeTreatment>  findBeforeTreatment(String uniqueId);
    void   saveBeforeTreatment(BeforeTreatment beforeTreatment);
    void   updateBeforeTreatment(BeforeTreatment beforeTreatment);

}