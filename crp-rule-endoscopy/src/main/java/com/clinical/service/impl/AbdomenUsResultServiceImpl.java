package com.clinical.service.impl;
import com.clinical.dao.cluster.AbdomenUsResultMapper;
import com.clinical.model.cluster.AbdomenUsResult;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.AbdomenUsResultService;
import org.springframework.stereotype.Service;

@Service
public class AbdomenUsResultServiceImpl implements AbdomenUsResultService {

    @Autowired
    AbdomenUsResultMapper    abdomenUsResultMapper;



    @Override
    public  void saveAbdomenUsResult(AbdomenUsResult abdomenUsResult) {
         abdomenUsResultMapper.saveAbdomenUsResult(abdomenUsResult);

     }
}