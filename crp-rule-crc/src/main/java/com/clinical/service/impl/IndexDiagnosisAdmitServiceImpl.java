package com.clinical.service.impl;
import com.clinical.dao.cluster.IndexDiagnosisAdmitMapper;
import com.clinical.model.cluster.IndexDiagnosisAdmit;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.IndexDiagnosisAdmitService;
import org.springframework.stereotype.Service;

@Service
public class IndexDiagnosisAdmitServiceImpl implements IndexDiagnosisAdmitService {

    @Autowired
    IndexDiagnosisAdmitMapper    indexDiagnosisAdmitMapper;



    @Override
    public  void saveIndexDiagnosisAdmit(IndexDiagnosisAdmit indexDiagnosisAdmit) {
         indexDiagnosisAdmitMapper.saveIndexDiagnosisAdmit(indexDiagnosisAdmit);

     }
}