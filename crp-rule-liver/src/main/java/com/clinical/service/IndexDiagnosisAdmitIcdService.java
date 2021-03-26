package com.clinical.service;
import com.clinical.model.cluster.IndexDiagnosisAdmitIcd;

import java.util.List;


public interface IndexDiagnosisAdmitIcdService {



    public  void saveIndexDiagnosisAdmitIcd(IndexDiagnosisAdmitIcd indexDiagnosisAdmitIcd);

    public  void deleteIndexDiagnosisAdmitIcd(List<String> uniqueId);

}