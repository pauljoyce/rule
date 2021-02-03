package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.Diagnosis;
public interface DiagnosisMapper {
    List<Diagnosis>  findDiagnosis(String uniqueId);
    void   saveDiagnosis(Diagnosis diagnosis);
    void   updateDiagnosis(Diagnosis diagnosis);

}