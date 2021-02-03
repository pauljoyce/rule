package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.DiagnosisStage;
public interface DiagnosisStageMapper {
    List<DiagnosisStage>  findDiagnosisStage(String uniqueId);
    void   saveDiagnosisStage(DiagnosisStage diagnosisStage);
    void   updateDiagnosisStage(DiagnosisStage diagnosisStage);

}