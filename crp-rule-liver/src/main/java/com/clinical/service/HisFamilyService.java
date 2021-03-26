package com.clinical.service;
import com.clinical.model.cluster.HisFamily;

import java.util.List;


public interface HisFamilyService {



    public  void saveHisFamily(HisFamily hisFamily);

    public  void deleteHisFamily(List<String> uniqueId);

}