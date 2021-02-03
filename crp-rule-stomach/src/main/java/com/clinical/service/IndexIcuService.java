package com.clinical.service;
import com.clinical.model.cluster.IndexIcu;


public interface IndexIcuService {



    public  void saveIndexIcu(IndexIcu indexIcu);

    public  void deleteIndexIcu(String uniqueId);

}