package com.clinical.service;
import com.clinical.model.cluster.IndexDiagnosisClinic;

import java.util.List;


public interface IndexDiagnosisClinicService {



    public  void saveIndexDiagnosisClinic(IndexDiagnosisClinic indexDiagnosisClinic);

    public  void deleteIndexDiagnosisClinic(List<String> uniqueId);

}