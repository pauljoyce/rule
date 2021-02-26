package com.clinical.service.impl;
import com.clinical.dao.cluster.ChectCtResultMapper;
import com.clinical.model.cluster.ChectCtResult;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.ChectCtResultService;
import org.springframework.stereotype.Service;

@Service
public class ChectCtResultServiceImpl implements ChectCtResultService {

    @Autowired
    ChectCtResultMapper    chectCtResultMapper;



    @Override
    public  void saveChectCtResult(ChectCtResult chectCtResult) {
         chectCtResultMapper.saveChectCtResult(chectCtResult);

     }
}