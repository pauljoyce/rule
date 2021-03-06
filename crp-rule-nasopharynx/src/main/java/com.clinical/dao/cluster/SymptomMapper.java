package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.Symptom;
public interface SymptomMapper {
    List<Symptom>  findSymptom(String uniqueId);
    void   saveSymptom(Symptom symptom);
    void   updateSymptom(Symptom symptom);

}