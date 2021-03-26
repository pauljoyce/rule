package com.clinical.service;
import com.clinical.model.cluster.ExamMasterStd;

import java.util.List;


public interface ExamMasterStdService {



    public  void saveExamMasterStd(ExamMasterStd examMasterStd);

    public  void deleteExamMasterStd(List<String> uniqueId);

}