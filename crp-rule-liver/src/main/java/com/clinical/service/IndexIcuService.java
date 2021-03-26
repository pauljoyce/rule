package com.clinical.service;
import com.clinical.model.cluster.IndexIcu;

import java.util.List;


public interface IndexIcuService {



    public  void saveIndexIcu(IndexIcu indexIcu);

    public  void deleteIndexIcu(List<String> uniqueId);

}