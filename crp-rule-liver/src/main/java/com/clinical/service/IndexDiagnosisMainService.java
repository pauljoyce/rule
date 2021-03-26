package com.clinical.service;
import com.clinical.model.cluster.IndexDiagnosisMain;

import java.util.List;


public interface IndexDiagnosisMainService {



    public  void saveIndexDiagnosisMain(IndexDiagnosisMain indexDiagnosisMain);

    public  void deleteIndexDiagnosisMain(List<String> uniqueId);

}