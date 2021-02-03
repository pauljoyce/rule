package com.clinical.service;
import com.clinical.model.cluster.OperationComplications;


public interface OperationComplicationsService {



    public  void saveOperationComplications(OperationComplications operationComplications);

    public  void deleteOperationComplications(String uniqueId);

}