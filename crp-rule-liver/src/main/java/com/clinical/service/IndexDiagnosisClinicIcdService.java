package com.clinical.service;
import com.clinical.model.cluster.IndexDiagnosisClinicIcd;

import java.util.List;


public interface IndexDiagnosisClinicIcdService {



    public  void saveIndexDiagnosisClinicIcd(IndexDiagnosisClinicIcd indexDiagnosisClinicIcd);

    public  void deleteIndexDiagnosisClinicIcd(List<String> uniqueId);

}