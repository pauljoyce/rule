package com.clinical.service.impl;
import com.clinical.dao.cluster.AbdominalUsResultMapper;
import com.clinical.model.cluster.AbdominalUsResult;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.AbdominalUsResultService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AbdominalUsResultServiceImpl implements AbdominalUsResultService {

    @Autowired
    AbdominalUsResultMapper    abdominalUsResultMapper;



    @Override
    public  void saveAbdominalUsResult(AbdominalUsResult abdominalUsResult) {
         abdominalUsResultMapper.saveAbdominalUsResult(abdominalUsResult);

     }

    @Override
    public  void deleteAbdominalUsResult(List<String> uniqueId) {
         abdominalUsResultMapper.deleteAbdominalUsResult(uniqueId);

     }
}