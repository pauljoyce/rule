package com.clinical.service.impl;
import com.clinical.dao.cluster.IndexDiagnosisClinicMapper;
import com.clinical.model.cluster.IndexDiagnosisClinic;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.IndexDiagnosisClinicService;
import org.springframework.stereotype.Service;

@Service
public class IndexDiagnosisClinicServiceImpl implements IndexDiagnosisClinicService {

    @Autowired
    IndexDiagnosisClinicMapper    indexDiagnosisClinicMapper;



    @Override
    public  void saveIndexDiagnosisClinic(IndexDiagnosisClinic indexDiagnosisClinic) {
         indexDiagnosisClinicMapper.saveIndexDiagnosisClinic(indexDiagnosisClinic);

     }

    @Override
    public  void deleteIndexDiagnosisClinic(String  uniqueId) {
         indexDiagnosisClinicMapper.deleteIndexDiagnosisClinic(uniqueId);

     }
}