package com.clinical.service.impl;
import com.clinical.dao.cluster.IndexDiagnosisMainMapper;
import com.clinical.model.cluster.IndexDiagnosisMain;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.IndexDiagnosisMainService;
import org.springframework.stereotype.Service;

@Service
public class IndexDiagnosisMainServiceImpl implements IndexDiagnosisMainService {

    @Autowired
    IndexDiagnosisMainMapper    indexDiagnosisMainMapper;



    @Override
    public  void saveIndexDiagnosisMain(IndexDiagnosisMain indexDiagnosisMain) {
         indexDiagnosisMainMapper.saveIndexDiagnosisMain(indexDiagnosisMain);

     }

    @Override
    public  void deleteIndexDiagnosisMain(String  uniqueId) {
         indexDiagnosisMainMapper.deleteIndexDiagnosisMain(uniqueId);

     }
}