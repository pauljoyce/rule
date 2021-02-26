package com.clinical.service.impl;
import com.clinical.dao.cluster.ErcpMapper;
import com.clinical.model.cluster.Ercp;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.ErcpService;
import org.springframework.stereotype.Service;

@Service
public class ErcpServiceImpl implements ErcpService {

    @Autowired
    ErcpMapper    ercpMapper;



    @Override
    public  void saveErcp(Ercp ercp) {
         ercpMapper.saveErcp(ercp);

     }
}