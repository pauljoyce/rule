package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.ExamResult;
public interface ExamResultMapper {
    List<ExamResult>  findExamResult(String uniqueId);
    void   saveExamResult(ExamResult examResult);
    void   updateExamResult(ExamResult examResult);

}