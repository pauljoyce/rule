package com.clinical.service.impl;
import com.clinical.dao.cluster.HeadMriResultMapper;
import com.clinical.model.cluster.HeadMriResult;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.HeadMriResultService;
import org.springframework.stereotype.Service;

@Service
public class HeadMriResultServiceImpl implements HeadMriResultService {

    @Autowired
    HeadMriResultMapper    headMriResultMapper;



    @Override
    public  void saveHeadMriResult(HeadMriResult headMriResult) {
         headMriResultMapper.saveHeadMriResult(headMriResult);

     }
}