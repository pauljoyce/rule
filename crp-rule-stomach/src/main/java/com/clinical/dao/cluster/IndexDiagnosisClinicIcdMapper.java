package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.IndexDiagnosisClinicIcd;
public interface IndexDiagnosisClinicIcdMapper {
    List<IndexDiagnosisClinicIcd>  findIndexDiagnosisClinicIcdByUniqueId(String uniqueId);
    void   saveIndexDiagnosisClinicIcd(IndexDiagnosisClinicIcd indexDiagnosisClinicIcd);
    void   updateIndexDiagnosisClinicIcd(IndexDiagnosisClinicIcd indexDiagnosisClinicIcd);
    void   deleteIndexDiagnosisClinicIcd(String unique_id);

}