package com.clinical.service.impl;
import com.clinical.dao.cluster.AbdominalCtResultMapper;
import com.clinical.model.cluster.AbdominalCtResult;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.AbdominalCtResultService;
import org.springframework.stereotype.Service;

@Service
public class AbdominalCtResultServiceImpl implements AbdominalCtResultService {

    @Autowired
    AbdominalCtResultMapper    abdominalCtResultMapper;



    @Override
    public  void saveAbdominalCtResult(AbdominalCtResult abdominalCtResult) {
         abdominalCtResultMapper.saveAbdominalCtResult(abdominalCtResult);

     }
}