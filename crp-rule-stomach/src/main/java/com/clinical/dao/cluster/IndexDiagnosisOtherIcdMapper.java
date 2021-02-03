package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.IndexDiagnosisOtherIcd;
public interface IndexDiagnosisOtherIcdMapper {
    List<IndexDiagnosisOtherIcd>  findIndexDiagnosisOtherIcdByUniqueId(String uniqueId);
    void   saveIndexDiagnosisOtherIcd(IndexDiagnosisOtherIcd indexDiagnosisOtherIcd);
    void   updateIndexDiagnosisOtherIcd(IndexDiagnosisOtherIcd indexDiagnosisOtherIcd);
    void   deleteIndexDiagnosisOtherIcd(String unique_id);

}