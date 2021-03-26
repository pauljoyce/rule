package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.PrimaryDiagnosis;
public interface PrimaryDiagnosisMapper {
    List<PrimaryDiagnosis>  findPrimaryDiagnosisByUniqueId(String uniqueId);
    void   savePrimaryDiagnosis(PrimaryDiagnosis primaryDiagnosis);
    void   updatePrimaryDiagnosis(PrimaryDiagnosis primaryDiagnosis);
    void   deletePrimaryDiagnosis(List<String> unique_id);

}