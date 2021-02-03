package com.clinical.service;
import com.clinical.model.cluster.Inspection;


public interface InspectionService {



    public  void saveInspection(Inspection inspection);

    public  void deleteInspection(String uniqueId);

}