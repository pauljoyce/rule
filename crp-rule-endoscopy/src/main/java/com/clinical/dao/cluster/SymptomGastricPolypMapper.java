package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.SymptomGastricPolyp;
public interface SymptomGastricPolypMapper {
    List<SymptomGastricPolyp>  findSymptomGastricPolyp(String uniqueId);
    void   saveSymptomGastricPolyp(SymptomGastricPolyp symptomGastricPolyp);
    void   updateSymptomGastricPolyp(SymptomGastricPolyp symptomGastricPolyp);

}