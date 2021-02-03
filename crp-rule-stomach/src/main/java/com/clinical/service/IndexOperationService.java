package com.clinical.service;
import com.clinical.model.cluster.IndexOperation;


public interface IndexOperationService {



    public  void saveIndexOperation(IndexOperation indexOperation);

    public  void deleteIndexOperation(String uniqueId);

}