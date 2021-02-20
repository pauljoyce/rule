package com.clinical.service.impl;
import com.clinical.dao.cluster.PostoperativeRecoveryMapper;
import com.clinical.model.cluster.PostoperativeRecovery;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.PostoperativeRecoveryService;
import org.springframework.stereotype.Service;

@Service
public class PostoperativeRecoveryServiceImpl implements PostoperativeRecoveryService {

    @Autowired
    PostoperativeRecoveryMapper    postoperativeRecoveryMapper;



    @Override
    public  void savePostoperativeRecovery(PostoperativeRecovery postoperativeRecovery) {
         postoperativeRecoveryMapper.savePostoperativeRecovery(postoperativeRecovery);

     }
}