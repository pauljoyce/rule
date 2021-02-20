package com.clinical.service.impl;
import com.clinical.dao.cluster.IndexDiagnosisAdmitIcdMapper;
import com.clinical.model.cluster.IndexDiagnosisAdmitIcd;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.IndexDiagnosisAdmitIcdService;
import org.springframework.stereotype.Service;

@Service
public class IndexDiagnosisAdmitIcdServiceImpl implements IndexDiagnosisAdmitIcdService {

    @Autowired
    IndexDiagnosisAdmitIcdMapper    indexDiagnosisAdmitIcdMapper;



    @Override
    public  void saveIndexDiagnosisAdmitIcd(IndexDiagnosisAdmitIcd indexDiagnosisAdmitIcd) {
         indexDiagnosisAdmitIcdMapper.saveIndexDiagnosisAdmitIcd(indexDiagnosisAdmitIcd);

     }
}