package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.PrimaryDiagnosis;
public interface PrimaryDiagnosisMapper {
    List<PrimaryDiagnosis>  findPrimaryDiagnosis(String uniqueId);
    void   savePrimaryDiagnosis(PrimaryDiagnosis primaryDiagnosis);
    void   updatePrimaryDiagnosis(PrimaryDiagnosis primaryDiagnosis);

}