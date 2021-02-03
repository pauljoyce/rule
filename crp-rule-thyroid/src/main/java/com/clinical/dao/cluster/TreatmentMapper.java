package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.Treatment;
public interface TreatmentMapper {
    List<Treatment>  findTreatment(String uniqueId);
    void   saveTreatment(Treatment treatment);
    void   updateTreatment(Treatment treatment);

}