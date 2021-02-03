package com.clinical.service;
import com.clinical.model.cluster.HisFamily;


public interface HisFamilyService {



    public  void saveHisFamily(HisFamily hisFamily);

    public  void deleteHisFamily(String uniqueId);

}