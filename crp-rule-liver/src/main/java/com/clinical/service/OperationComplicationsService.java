package com.clinical.service;
import com.clinical.model.cluster.OperationComplications;

import java.util.List;


public interface OperationComplicationsService {



    public  void saveOperationComplications(OperationComplications operationComplications);

    public  void deleteOperationComplications(List<String> uniqueId);

}