package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.CancerPainTreatment;
public interface CancerPainTreatmentMapper {
    List<CancerPainTreatment>  findCancerPainTreatmentByUniqueId(String uniqueId);
    void   saveCancerPainTreatment(CancerPainTreatment cancerPainTreatment);
    void   updateCancerPainTreatment(CancerPainTreatment cancerPainTreatment);
    void   deleteCancerPainTreatment(String unique_id);

}