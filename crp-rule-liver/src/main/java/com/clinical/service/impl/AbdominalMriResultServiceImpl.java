package com.clinical.service.impl;
import com.clinical.dao.cluster.AbdominalMriResultMapper;
import com.clinical.model.cluster.AbdominalMriResult;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.AbdominalMriResultService;
import org.springframework.stereotype.Service;

@Service
public class AbdominalMriResultServiceImpl implements AbdominalMriResultService {

    @Autowired
    AbdominalMriResultMapper    abdominalMriResultMapper;



    @Override
    public  void saveAbdominalMriResult(AbdominalMriResult abdominalMriResult) {
         abdominalMriResultMapper.saveAbdominalMriResult(abdominalMriResult);

     }
}