package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.IndexDiagnosisMainIcd;
public interface IndexDiagnosisMainIcdMapper {
    List<IndexDiagnosisMainIcd>  findIndexDiagnosisMainIcdByUniqueId(String uniqueId);
    void   saveIndexDiagnosisMainIcd(IndexDiagnosisMainIcd indexDiagnosisMainIcd);
    void   updateIndexDiagnosisMainIcd(IndexDiagnosisMainIcd indexDiagnosisMainIcd);
    void   deleteIndexDiagnosisMainIcd(List<String> unique_id);

}