package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.CancerPainTreatment;
public interface CancerPainTreatmentMapper {
    List<CancerPainTreatment>  findCancerPainTreatment(String uniqueId);
    void   saveCancerPainTreatment(CancerPainTreatment cancerPainTreatment);
    void   updateCancerPainTreatment(CancerPainTreatment cancerPainTreatment);

}