package com.clinical.service;
import com.clinical.model.cluster.CancerPainMaster;

import java.util.List;


public interface CancerPainMasterService {



    public  void saveCancerPainMaster(CancerPainMaster cancerPainMaster);

    public  void deleteCancerPainMaster(List<String> uniqueId);

}