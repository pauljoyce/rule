package com.clinical.service;
import com.clinical.model.cluster.Consultation;


public interface ConsultationService {



    public  void saveConsultation(Consultation consultation);

    public  void deleteConsultation(String uniqueId);

}