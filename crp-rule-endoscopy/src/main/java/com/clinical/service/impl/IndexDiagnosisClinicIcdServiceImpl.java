package com.clinical.service.impl;
import com.clinical.dao.cluster.IndexDiagnosisClinicIcdMapper;
import com.clinical.model.cluster.IndexDiagnosisClinicIcd;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.IndexDiagnosisClinicIcdService;
import org.springframework.stereotype.Service;

@Service
public class IndexDiagnosisClinicIcdServiceImpl implements IndexDiagnosisClinicIcdService {

    @Autowired
    IndexDiagnosisClinicIcdMapper    indexDiagnosisClinicIcdMapper;



    @Override
    public  void saveIndexDiagnosisClinicIcd(IndexDiagnosisClinicIcd indexDiagnosisClinicIcd) {
         indexDiagnosisClinicIcdMapper.saveIndexDiagnosisClinicIcd(indexDiagnosisClinicIcd);

     }
}