package com.clinical.service.impl;
import com.clinical.dao.cluster.HisPastMapper;
import com.clinical.model.cluster.HisPast;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.HisPastService;
import org.springframework.stereotype.Service;

@Service
public class HisPastServiceImpl implements HisPastService {

    @Autowired
    HisPastMapper    hisPastMapper;



    @Override
    public  void saveHisPast(HisPast hisPast) {
         hisPastMapper.saveHisPast(hisPast);

     }
}