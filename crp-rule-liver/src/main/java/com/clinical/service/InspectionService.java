package com.clinical.service;
import com.clinical.model.cluster.Inspection;

import java.util.List;


public interface InspectionService {



    public  void saveInspection(Inspection inspection);

    public  void deleteInspection(List<String> uniqueId);

}