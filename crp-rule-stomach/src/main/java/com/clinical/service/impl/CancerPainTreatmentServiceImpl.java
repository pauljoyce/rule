package com.clinical.service.impl;
import com.clinical.dao.cluster.CancerPainTreatmentMapper;
import com.clinical.model.cluster.CancerPainTreatment;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.CancerPainTreatmentService;
import org.springframework.stereotype.Service;

@Service
public class CancerPainTreatmentServiceImpl implements CancerPainTreatmentService {

    @Autowired
    CancerPainTreatmentMapper    cancerPainTreatmentMapper;



    @Override
    public  void saveCancerPainTreatment(CancerPainTreatment cancerPainTreatment) {
         cancerPainTreatmentMapper.saveCancerPainTreatment(cancerPainTreatment);

     }

    @Override
    public  void deleteCancerPainTreatment(String  uniqueId) {
         cancerPainTreatmentMapper.deleteCancerPainTreatment(uniqueId);

     }
}