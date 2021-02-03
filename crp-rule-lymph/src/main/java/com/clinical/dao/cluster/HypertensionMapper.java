package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.Hypertension;
public interface HypertensionMapper {
    List<Hypertension>  findHypertension(String uniqueId);
    void   saveHypertension(Hypertension hypertension);
    void   updateHypertension(Hypertension hypertension);

}