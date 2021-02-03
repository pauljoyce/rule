package com.clinical.service.impl;
import com.clinical.dao.cluster.AbdominalXResultMapper;
import com.clinical.model.cluster.AbdominalXResult;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.AbdominalXResultService;
import org.springframework.stereotype.Service;

@Service
public class AbdominalXResultServiceImpl implements AbdominalXResultService {

    @Autowired
    AbdominalXResultMapper    abdominalXResultMapper;



    @Override
    public  void saveAbdominalXResult(AbdominalXResult abdominalXResult) {
         abdominalXResultMapper.saveAbdominalXResult(abdominalXResult);

     }
}