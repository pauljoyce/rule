package com.clinical.service;
import com.clinical.model.cluster.HisPast;

import java.util.List;


public interface HisPastService {



    public  void saveHisPast(HisPast hisPast);

    public  void deleteHisPast(List<String> uniqueId);

}