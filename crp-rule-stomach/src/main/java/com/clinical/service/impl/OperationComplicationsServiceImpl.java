package com.clinical.service.impl;
import com.clinical.dao.cluster.OperationComplicationsMapper;
import com.clinical.model.cluster.OperationComplications;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.OperationComplicationsService;
import org.springframework.stereotype.Service;

@Service
public class OperationComplicationsServiceImpl implements OperationComplicationsService {

    @Autowired
    OperationComplicationsMapper    operationComplicationsMapper;



    @Override
    public  void saveOperationComplications(OperationComplications operationComplications) {
         operationComplicationsMapper.saveOperationComplications(operationComplications);

     }

    @Override
    public  void deleteOperationComplications(String  uniqueId) {
         operationComplicationsMapper.deleteOperationComplications(uniqueId);

     }
}