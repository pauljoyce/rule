package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.ExamMasterStd;
public interface ExamMasterStdMapper {
    List<ExamMasterStd>  findExamMasterStdByUniqueId(String uniqueId);
    void   saveExamMasterStd(ExamMasterStd examMasterStd);
    void   updateExamMasterStd(ExamMasterStd examMasterStd);
    void   deleteExamMasterStd(String unique_id);

}