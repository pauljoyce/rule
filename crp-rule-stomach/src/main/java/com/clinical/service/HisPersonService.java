package com.clinical.service;
import com.clinical.model.cluster.HisPerson;


public interface HisPersonService {



    public  void saveHisPerson(HisPerson hisPerson);

    public  void deleteHisPerson(String uniqueId);

}