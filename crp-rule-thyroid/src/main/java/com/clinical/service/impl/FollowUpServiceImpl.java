package com.clinical.service.impl;
import com.clinical.dao.cluster.FollowUpMapper;
import com.clinical.model.cluster.FollowUp;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.FollowUpService;
import org.springframework.stereotype.Service;

@Service
public class FollowUpServiceImpl implements FollowUpService {

    @Autowired
    FollowUpMapper    followUpMapper;



    @Override
    public  void saveFollowUp(FollowUp followUp) {
         followUpMapper.saveFollowUp(followUp);

     }
}