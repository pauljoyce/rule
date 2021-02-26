package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.SymptomCokicPolyp;
public interface SymptomCokicPolypMapper {
    List<SymptomCokicPolyp>  findSymptomCokicPolyp(String uniqueId);
    void   saveSymptomCokicPolyp(SymptomCokicPolyp symptomCokicPolyp);
    void   updateSymptomCokicPolyp(SymptomCokicPolyp symptomCokicPolyp);

}