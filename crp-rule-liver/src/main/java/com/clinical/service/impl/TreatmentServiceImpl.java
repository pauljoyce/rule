package com.clinical.service.impl;
import com.clinical.dao.cluster.TreatmentMapper;
import com.clinical.model.cluster.Treatment;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.TreatmentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TreatmentServiceImpl implements TreatmentService {

    @Autowired
    TreatmentMapper    treatmentMapper;



    @Override
    public  void saveTreatment(Treatment treatment) {
         treatmentMapper.saveTreatment(treatment);

     }

    @Override
    public  void deleteTreatment(List<String> uniqueId) {
         treatmentMapper.deleteTreatment(uniqueId);

     }
}