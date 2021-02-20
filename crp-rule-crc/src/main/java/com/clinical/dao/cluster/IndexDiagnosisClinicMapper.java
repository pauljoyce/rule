package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.IndexDiagnosisClinic;
public interface IndexDiagnosisClinicMapper {
    List<IndexDiagnosisClinic>  findIndexDiagnosisClinic(String uniqueId);
    void   saveIndexDiagnosisClinic(IndexDiagnosisClinic indexDiagnosisClinic);
    void   updateIndexDiagnosisClinic(IndexDiagnosisClinic indexDiagnosisClinic);

}