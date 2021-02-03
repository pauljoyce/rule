package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.IndexDiagnosisAdmitIcd;
public interface IndexDiagnosisAdmitIcdMapper {
    List<IndexDiagnosisAdmitIcd>  findIndexDiagnosisAdmitIcd(String uniqueId);
    void   saveIndexDiagnosisAdmitIcd(IndexDiagnosisAdmitIcd indexDiagnosisAdmitIcd);
    void   updateIndexDiagnosisAdmitIcd(IndexDiagnosisAdmitIcd indexDiagnosisAdmitIcd);

}