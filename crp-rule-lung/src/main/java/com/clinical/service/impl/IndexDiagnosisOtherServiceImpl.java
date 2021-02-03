package com.clinical.service.impl;
import com.clinical.dao.cluster.IndexDiagnosisOtherMapper;
import com.clinical.model.cluster.IndexDiagnosisOther;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.IndexDiagnosisOtherService;
import org.springframework.stereotype.Service;

@Service
public class IndexDiagnosisOtherServiceImpl implements IndexDiagnosisOtherService {

    @Autowired
    IndexDiagnosisOtherMapper    indexDiagnosisOtherMapper;



    @Override
    public  void saveIndexDiagnosisOther(IndexDiagnosisOther indexDiagnosisOther) {
         indexDiagnosisOtherMapper.saveIndexDiagnosisOther(indexDiagnosisOther);

     }
}