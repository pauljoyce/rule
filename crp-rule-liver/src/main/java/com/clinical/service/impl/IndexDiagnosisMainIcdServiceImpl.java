package com.clinical.service.impl;
import com.clinical.dao.cluster.IndexDiagnosisMainIcdMapper;
import com.clinical.model.cluster.IndexDiagnosisMainIcd;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.IndexDiagnosisMainIcdService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IndexDiagnosisMainIcdServiceImpl implements IndexDiagnosisMainIcdService {

    @Autowired
    IndexDiagnosisMainIcdMapper    indexDiagnosisMainIcdMapper;



    @Override
    public  void saveIndexDiagnosisMainIcd(IndexDiagnosisMainIcd indexDiagnosisMainIcd) {
         indexDiagnosisMainIcdMapper.saveIndexDiagnosisMainIcd(indexDiagnosisMainIcd);

     }

    @Override
    public  void deleteIndexDiagnosisMainIcd(List<String> uniqueId) {
         indexDiagnosisMainIcdMapper.deleteIndexDiagnosisMainIcd(uniqueId);

     }
}