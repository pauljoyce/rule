package com.clinical.service.impl;
import com.clinical.dao.cluster.FollowUpMapper;
import com.clinical.model.cluster.FollowUp;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.FollowUpService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FollowUpServiceImpl implements FollowUpService {

    @Autowired
    FollowUpMapper    followUpMapper;



    @Override
    public  void saveFollowUp(FollowUp followUp) {
         followUpMapper.saveFollowUp(followUp);

     }

    @Override
    public  void deleteFollowUp(List<String> uniqueId) {
         followUpMapper.deleteFollowUp(uniqueId);

     }
}