package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.IndexDiagnosisOther;
public interface IndexDiagnosisOtherMapper {
    List<IndexDiagnosisOther>  findIndexDiagnosisOtherByUniqueId(String uniqueId);
    void   saveIndexDiagnosisOther(IndexDiagnosisOther indexDiagnosisOther);
    void   updateIndexDiagnosisOther(IndexDiagnosisOther indexDiagnosisOther);
    void   deleteIndexDiagnosisOther(List<String> unique_id);

}