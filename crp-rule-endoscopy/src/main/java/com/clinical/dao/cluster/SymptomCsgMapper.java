package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.SymptomCsg;
public interface SymptomCsgMapper {
    List<SymptomCsg>  findSymptomCsg(String uniqueId);
    void   saveSymptomCsg(SymptomCsg symptomCsg);
    void   updateSymptomCsg(SymptomCsg symptomCsg);

}