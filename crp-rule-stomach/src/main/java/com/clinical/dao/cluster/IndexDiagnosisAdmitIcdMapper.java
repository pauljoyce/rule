package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.IndexDiagnosisAdmitIcd;
public interface IndexDiagnosisAdmitIcdMapper {
    List<IndexDiagnosisAdmitIcd>  findIndexDiagnosisAdmitIcdByUniqueId(String uniqueId);
    void   saveIndexDiagnosisAdmitIcd(IndexDiagnosisAdmitIcd indexDiagnosisAdmitIcd);
    void   updateIndexDiagnosisAdmitIcd(IndexDiagnosisAdmitIcd indexDiagnosisAdmitIcd);
    void   deleteIndexDiagnosisAdmitIcd(String unique_id);

}