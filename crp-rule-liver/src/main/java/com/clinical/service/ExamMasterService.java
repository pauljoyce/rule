package com.clinical.service;
import com.clinical.model.cluster.ExamMaster;

import java.util.List;


public interface ExamMasterService {



    public  void saveExamMaster(ExamMaster examMaster);

    public  void deleteExamMaster(List<String> uniqueId);

}