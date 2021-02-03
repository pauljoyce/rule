package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.ExamMasterStd;
public interface ExamMasterStdMapper {
    List<ExamMasterStd>  findExamMasterStd(String uniqueId);
    void   saveExamMasterStd(ExamMasterStd examMasterStd);
    void   updateExamMasterStd(ExamMasterStd examMasterStd);

}