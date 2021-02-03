package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.ExamDescription;
public interface ExamDescriptionMapper {
    List<ExamDescription>  findExamDescription(String uniqueId);
    void   saveExamDescription(ExamDescription examDescription);
    void   updateExamDescription(ExamDescription examDescription);

}