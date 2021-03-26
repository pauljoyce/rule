package com.clinical.service;
import com.clinical.model.cluster.IndexOperationIcd;

import java.util.List;


public interface IndexOperationIcdService {



    public  void saveIndexOperationIcd(IndexOperationIcd indexOperationIcd);

    public  void deleteIndexOperationIcd(List<String> uniqueId);

}