package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.Diagnosis;
public interface DiagnosisMapper {
    List<Diagnosis>  findDiagnosisByUniqueId(String uniqueId);
    void   saveDiagnosis(Diagnosis diagnosis);
    void   updateDiagnosis(Diagnosis diagnosis);
    void   deleteDiagnosis(String unique_id);

}