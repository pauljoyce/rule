package com.clinical.service;
import com.clinical.model.cluster.HisPerson;

import java.util.List;


public interface HisPersonService {



    public  void saveHisPerson(HisPerson hisPerson);

    public  void deleteHisPerson(List<String> uniqueId);

}