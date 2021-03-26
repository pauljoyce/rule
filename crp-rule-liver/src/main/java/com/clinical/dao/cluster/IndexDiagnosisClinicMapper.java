package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.IndexDiagnosisClinic;
public interface IndexDiagnosisClinicMapper {
    List<IndexDiagnosisClinic>  findIndexDiagnosisClinicByUniqueId(String uniqueId);
    void   saveIndexDiagnosisClinic(IndexDiagnosisClinic indexDiagnosisClinic);
    void   updateIndexDiagnosisClinic(IndexDiagnosisClinic indexDiagnosisClinic);
    void   deleteIndexDiagnosisClinic(List<String> unique_id);

}