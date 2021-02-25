package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.ExamMaster;
public interface ExamMasterMapper {
    List<ExamMaster>  findExamMaster(String uniqueId);
    void   saveExamMaster(ExamMaster examMaster);
    void   updateExamMaster(ExamMaster examMaster);
    List<ExamMaster>  findExamMasterALL();

}