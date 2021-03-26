package com.clinical.service;
import com.clinical.model.cluster.IndexDiagnosisOtherIcd;

import java.util.List;


public interface IndexDiagnosisOtherIcdService {



    public  void saveIndexDiagnosisOtherIcd(IndexDiagnosisOtherIcd indexDiagnosisOtherIcd);

    public  void deleteIndexDiagnosisOtherIcd(List<String> uniqueId);

}