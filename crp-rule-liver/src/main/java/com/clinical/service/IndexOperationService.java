package com.clinical.service;
import com.clinical.model.cluster.IndexOperation;

import java.util.List;


public interface IndexOperationService {



    public  void saveIndexOperation(IndexOperation indexOperation);

    public  void deleteIndexOperation(List<String> uniqueId);

}