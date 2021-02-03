package com.clinical.service.impl;
import com.clinical.dao.cluster.InspectionMapper;
import com.clinical.model.cluster.Inspection;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.InspectionService;
import org.springframework.stereotype.Service;

@Service
public class InspectionServiceImpl implements InspectionService {

    @Autowired
    InspectionMapper    inspectionMapper;



    @Override
    public  void saveInspection(Inspection inspection) {
         inspectionMapper.saveInspection(inspection);

     }

    @Override
    public  void deleteInspection(String  uniqueId) {
         inspectionMapper.deleteInspection(uniqueId);

     }
}