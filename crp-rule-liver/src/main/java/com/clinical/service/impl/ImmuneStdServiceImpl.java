package com.clinical.service.impl;
import com.clinical.dao.cluster.ImmuneStdMapper;
import com.clinical.model.cluster.ImmuneStd;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.ImmuneStdService;
import org.springframework.stereotype.Service;

@Service
public class ImmuneStdServiceImpl implements ImmuneStdService {

    @Autowired
    ImmuneStdMapper    immuneStdMapper;



    @Override
    public  void saveImmuneStd(ImmuneStd immuneStd) {
         immuneStdMapper.saveImmuneStd(immuneStd);

     }
}