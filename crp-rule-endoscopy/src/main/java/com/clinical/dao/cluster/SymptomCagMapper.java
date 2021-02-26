package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.SymptomCag;
public interface SymptomCagMapper {
    List<SymptomCag>  findSymptomCag(String uniqueId);
    void   saveSymptomCag(SymptomCag symptomCag);
    void   updateSymptomCag(SymptomCag symptomCag);

}