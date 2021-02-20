package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.PreoperativePreparation;
public interface PreoperativePreparationMapper {
    List<PreoperativePreparation>  findPreoperativePreparation(String uniqueId);
    void   savePreoperativePreparation(PreoperativePreparation preoperativePreparation);
    void   updatePreoperativePreparation(PreoperativePreparation preoperativePreparation);

}