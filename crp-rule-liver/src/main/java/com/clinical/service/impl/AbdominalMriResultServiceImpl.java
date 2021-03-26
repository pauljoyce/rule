package com.clinical.service.impl;
import com.clinical.dao.cluster.AbdominalMriResultMapper;
import com.clinical.model.cluster.AbdominalMriResult;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.AbdominalMriResultService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AbdominalMriResultServiceImpl implements AbdominalMriResultService {

    @Autowired
    AbdominalMriResultMapper    abdominalMriResultMapper;



    @Override
    public  void saveAbdominalMriResult(AbdominalMriResult abdominalMriResult) {
         abdominalMriResultMapper.saveAbdominalMriResult(abdominalMriResult);

     }

    @Override
    public  void deleteAbdominalMriResult(List<String> uniqueId) {
         abdominalMriResultMapper.deleteAbdominalMriResult(uniqueId);

     }
}