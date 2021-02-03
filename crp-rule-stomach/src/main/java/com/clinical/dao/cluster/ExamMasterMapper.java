package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.ExamMaster;
public interface ExamMasterMapper {
    List<ExamMaster>  findExamMasterByUniqueId(String uniqueId);
    void   saveExamMaster(ExamMaster examMaster);
    void   updateExamMaster(ExamMaster examMaster);
    void   deleteExamMaster(String unique_id);

}