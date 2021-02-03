package com.clinical.service.impl;
import com.clinical.dao.cluster.IndexDiagnosisOtherIcdMapper;
import com.clinical.model.cluster.IndexDiagnosisOtherIcd;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.IndexDiagnosisOtherIcdService;
import org.springframework.stereotype.Service;

@Service
public class IndexDiagnosisOtherIcdServiceImpl implements IndexDiagnosisOtherIcdService {

    @Autowired
    IndexDiagnosisOtherIcdMapper    indexDiagnosisOtherIcdMapper;



    @Override
    public  void saveIndexDiagnosisOtherIcd(IndexDiagnosisOtherIcd indexDiagnosisOtherIcd) {
         indexDiagnosisOtherIcdMapper.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);

     }

    @Override
    public  void deleteIndexDiagnosisOtherIcd(String  uniqueId) {
         indexDiagnosisOtherIcdMapper.deleteIndexDiagnosisOtherIcd(uniqueId);

     }
}