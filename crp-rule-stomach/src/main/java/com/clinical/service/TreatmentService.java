package com.clinical.service;
import com.clinical.model.cluster.Treatment;


public interface TreatmentService {



    public  void saveTreatment(Treatment treatment);

    public  void deleteTreatment(String uniqueId);

}