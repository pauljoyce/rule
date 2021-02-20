package com.clinical.service.impl;
import com.clinical.dao.cluster.AbdomenCtResultMapper;
import com.clinical.model.cluster.AbdomenCtResult;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.AbdomenCtResultService;
import org.springframework.stereotype.Service;

@Service
public class AbdomenCtResultServiceImpl implements AbdomenCtResultService {

    @Autowired
    AbdomenCtResultMapper    abdomenCtResultMapper;



    @Override
    public  void saveAbdomenCtResult(AbdomenCtResult abdomenCtResult) {
         abdomenCtResultMapper.saveAbdomenCtResult(abdomenCtResult);

     }
}