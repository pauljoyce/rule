package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.IndexDiagnosisAdmit;
public interface IndexDiagnosisAdmitMapper {
    List<IndexDiagnosisAdmit>  findIndexDiagnosisAdmitByUniqueId(String uniqueId);
    void   saveIndexDiagnosisAdmit(IndexDiagnosisAdmit indexDiagnosisAdmit);
    void   updateIndexDiagnosisAdmit(IndexDiagnosisAdmit indexDiagnosisAdmit);
    void   deleteIndexDiagnosisAdmit(String unique_id);

}