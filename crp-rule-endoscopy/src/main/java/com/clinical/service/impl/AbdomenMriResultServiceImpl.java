package com.clinical.service.impl;
import com.clinical.dao.cluster.AbdomenMriResultMapper;
import com.clinical.model.cluster.AbdomenMriResult;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.AbdomenMriResultService;
import org.springframework.stereotype.Service;

@Service
public class AbdomenMriResultServiceImpl implements AbdomenMriResultService {

    @Autowired
    AbdomenMriResultMapper    abdomenMriResultMapper;



    @Override
    public  void saveAbdomenMriResult(AbdomenMriResult abdomenMriResult) {
         abdomenMriResultMapper.saveAbdomenMriResult(abdomenMriResult);

     }
}