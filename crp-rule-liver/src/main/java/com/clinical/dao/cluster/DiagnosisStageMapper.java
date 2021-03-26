package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.DiagnosisStage;
public interface DiagnosisStageMapper {
    List<DiagnosisStage>  findDiagnosisStageByUniqueId(String uniqueId);
    void   saveDiagnosisStage(DiagnosisStage diagnosisStage);
    void   updateDiagnosisStage(DiagnosisStage diagnosisStage);
    void   deleteDiagnosisStage(List<String> unique_id);

}