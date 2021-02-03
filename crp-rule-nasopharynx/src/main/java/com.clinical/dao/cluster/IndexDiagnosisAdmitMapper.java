package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.IndexDiagnosisAdmit;
public interface IndexDiagnosisAdmitMapper {
    List<IndexDiagnosisAdmit>  findIndexDiagnosisAdmit(String uniqueId);
    void   saveIndexDiagnosisAdmit(IndexDiagnosisAdmit indexDiagnosisAdmit);
    void   updateIndexDiagnosisAdmit(IndexDiagnosisAdmit indexDiagnosisAdmit);

}