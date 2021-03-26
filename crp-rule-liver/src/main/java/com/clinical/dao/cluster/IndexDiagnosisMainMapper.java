package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.IndexDiagnosisMain;
public interface IndexDiagnosisMainMapper {
    List<IndexDiagnosisMain>  findIndexDiagnosisMainByUniqueId(String uniqueId);
    void   saveIndexDiagnosisMain(IndexDiagnosisMain indexDiagnosisMain);
    void   updateIndexDiagnosisMain(IndexDiagnosisMain indexDiagnosisMain);
    void   deleteIndexDiagnosisMain(List<String> unique_id);

}