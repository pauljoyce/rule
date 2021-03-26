package com.clinical.service;
import com.clinical.model.cluster.Treatment;

import java.util.List;


public interface TreatmentService {



    public  void saveTreatment(Treatment treatment);

    public  void deleteTreatment(List<String> uniqueId);

}