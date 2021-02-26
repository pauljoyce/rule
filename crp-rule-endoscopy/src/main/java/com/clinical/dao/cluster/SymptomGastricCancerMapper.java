package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.SymptomGastricCancer;
public interface SymptomGastricCancerMapper {
    List<SymptomGastricCancer>  findSymptomGastricCancer(String uniqueId);
    void   saveSymptomGastricCancer(SymptomGastricCancer symptomGastricCancer);
    void   updateSymptomGastricCancer(SymptomGastricCancer symptomGastricCancer);

}