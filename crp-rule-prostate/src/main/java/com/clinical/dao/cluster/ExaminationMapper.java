package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.Examination;
public interface ExaminationMapper {
    List<Examination>  findExamination(String uniqueId);
    void   saveExamination(Examination examination);
    void   updateExamination(Examination examination);

}