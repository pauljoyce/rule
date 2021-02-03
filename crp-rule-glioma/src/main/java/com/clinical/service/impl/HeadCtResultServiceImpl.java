package com.clinical.service.impl;
import com.clinical.dao.cluster.HeadCtResultMapper;
import com.clinical.model.cluster.HeadCtResult;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.HeadCtResultService;
import org.springframework.stereotype.Service;

@Service
public class HeadCtResultServiceImpl implements HeadCtResultService {

    @Autowired
    HeadCtResultMapper    headCtResultMapper;



    @Override
    public  void saveHeadCtResult(HeadCtResult headCtResult) {
         headCtResultMapper.saveHeadCtResult(headCtResult);

     }
}