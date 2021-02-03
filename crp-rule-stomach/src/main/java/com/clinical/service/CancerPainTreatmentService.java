package com.clinical.service;
import com.clinical.model.cluster.CancerPainTreatment;


public interface CancerPainTreatmentService {



    public  void saveCancerPainTreatment(CancerPainTreatment cancerPainTreatment);

    public  void deleteCancerPainTreatment(String uniqueId);

}