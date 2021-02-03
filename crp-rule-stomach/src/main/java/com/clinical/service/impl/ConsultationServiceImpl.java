package com.clinical.service.impl;
import com.clinical.dao.cluster.ConsultationMapper;
import com.clinical.model.cluster.Consultation;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.ConsultationService;
import org.springframework.stereotype.Service;

@Service
public class ConsultationServiceImpl implements ConsultationService {

    @Autowired
    ConsultationMapper    consultationMapper;



    @Override
    public  void saveConsultation(Consultation consultation) {
         consultationMapper.saveConsultation(consultation);

     }

    @Override
    public  void deleteConsultation(String  uniqueId) {
         consultationMapper.deleteConsultation(uniqueId);

     }
}