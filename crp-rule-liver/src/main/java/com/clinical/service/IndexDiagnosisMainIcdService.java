package com.clinical.service;
import com.clinical.model.cluster.IndexDiagnosisMainIcd;

import java.util.List;


public interface IndexDiagnosisMainIcdService {



    public  void saveIndexDiagnosisMainIcd(IndexDiagnosisMainIcd indexDiagnosisMainIcd);

    public  void deleteIndexDiagnosisMainIcd(List<String> uniqueId);

}