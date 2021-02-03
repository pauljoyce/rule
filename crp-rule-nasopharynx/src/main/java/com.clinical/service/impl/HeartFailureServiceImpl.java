package com.clinical.service.impl;
import com.clinical.dao.cluster.HeartFailureMapper;
import com.clinical.model.cluster.HeartFailure;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.HeartFailureService;
import org.springframework.stereotype.Service;

@Service
public class HeartFailureServiceImpl implements HeartFailureService {

    @Autowired
    HeartFailureMapper    heartFailureMapper;



    @Override
    public  void saveHeartFailure(HeartFailure heartFailure) {
         heartFailureMapper.saveHeartFailure(heartFailure);

     }
}