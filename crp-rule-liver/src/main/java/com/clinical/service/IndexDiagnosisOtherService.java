package com.clinical.service;
import com.clinical.model.cluster.IndexDiagnosisOther;

import java.util.List;


public interface IndexDiagnosisOtherService {



    public  void saveIndexDiagnosisOther(IndexDiagnosisOther indexDiagnosisOther);

    public  void deleteIndexDiagnosisOther(List<String> uniqueId);

}