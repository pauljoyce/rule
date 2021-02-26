package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.SymptomIbd;
public interface SymptomIbdMapper {
    List<SymptomIbd>  findSymptomIbd(String uniqueId);
    void   saveSymptomIbd(SymptomIbd symptomIbd);
    void   updateSymptomIbd(SymptomIbd symptomIbd);

}