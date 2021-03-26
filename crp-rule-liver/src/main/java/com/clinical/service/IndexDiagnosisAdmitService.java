package com.clinical.service;
import com.clinical.model.cluster.IndexDiagnosisAdmit;

import java.util.List;


public interface IndexDiagnosisAdmitService {



    public  void saveIndexDiagnosisAdmit(IndexDiagnosisAdmit indexDiagnosisAdmit);

    public  void deleteIndexDiagnosisAdmit(List<String> uniqueId);

}