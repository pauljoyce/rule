package com.clinical.service.impl;
import com.clinical.dao.cluster.AbdominalCtResultMapper;
import com.clinical.model.cluster.AbdominalCtResult;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.AbdominalCtResultService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AbdominalCtResultServiceImpl implements AbdominalCtResultService {

    @Autowired
    AbdominalCtResultMapper    abdominalCtResultMapper;



    @Override
    public  void saveAbdominalCtResult(AbdominalCtResult abdominalCtResult) {
         abdominalCtResultMapper.saveAbdominalCtResult(abdominalCtResult);

     }

    @Override
    public  void deleteAbdominalCtResult(List<String> uniqueId) {
         abdominalCtResultMapper.deleteAbdominalCtResult(uniqueId);

     }
}