package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.SymptomEcdt;
public interface SymptomEcdtMapper {
    List<SymptomEcdt>  findSymptomEcdt(String uniqueId);
    void   saveSymptomEcdt(SymptomEcdt symptomEcdt);
    void   updateSymptomEcdt(SymptomEcdt symptomEcdt);

}