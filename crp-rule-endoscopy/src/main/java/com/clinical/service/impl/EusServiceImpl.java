package com.clinical.service.impl;
import com.clinical.dao.cluster.EusMapper;
import com.clinical.model.cluster.Eus;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.EusService;
import org.springframework.stereotype.Service;

@Service
public class EusServiceImpl implements EusService {

    @Autowired
    EusMapper    eusMapper;



    @Override
    public  void saveEus(Eus eus) {
         eusMapper.saveEus(eus);

     }
}