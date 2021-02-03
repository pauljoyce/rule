package com.clinical.service.impl;
import com.clinical.dao.cluster.BeforeTreatmentMapper;
import com.clinical.model.cluster.BeforeTreatment;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.BeforeTreatmentService;
import org.springframework.stereotype.Service;

@Service
public class BeforeTreatmentServiceImpl implements BeforeTreatmentService {

    @Autowired
    BeforeTreatmentMapper    beforeTreatmentMapper;



    @Override
    public  void saveBeforeTreatment(BeforeTreatment beforeTreatment) {
         beforeTreatmentMapper.saveBeforeTreatment(beforeTreatment);

     }
}