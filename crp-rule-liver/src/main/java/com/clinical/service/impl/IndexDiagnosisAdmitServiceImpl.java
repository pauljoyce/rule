package com.clinical.service.impl;
import com.clinical.dao.cluster.IndexDiagnosisAdmitMapper;
import com.clinical.model.cluster.IndexDiagnosisAdmit;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.IndexDiagnosisAdmitService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IndexDiagnosisAdmitServiceImpl implements IndexDiagnosisAdmitService {

    @Autowired
    IndexDiagnosisAdmitMapper    indexDiagnosisAdmitMapper;



    @Override
    public  void saveIndexDiagnosisAdmit(IndexDiagnosisAdmit indexDiagnosisAdmit) {
         indexDiagnosisAdmitMapper.saveIndexDiagnosisAdmit(indexDiagnosisAdmit);

     }

    @Override
    public  void deleteIndexDiagnosisAdmit(List<String> uniqueId) {
         indexDiagnosisAdmitMapper.deleteIndexDiagnosisAdmit(uniqueId);

     }
}