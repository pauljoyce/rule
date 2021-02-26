package com.clinical.service.impl;
import com.clinical.dao.cluster.EnteroscopyMapper;
import com.clinical.model.cluster.Enteroscopy;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.EnteroscopyService;
import org.springframework.stereotype.Service;

@Service
public class EnteroscopyServiceImpl implements EnteroscopyService {

    @Autowired
    EnteroscopyMapper    enteroscopyMapper;



    @Override
    public  void saveEnteroscopy(Enteroscopy enteroscopy) {
         enteroscopyMapper.saveEnteroscopy(enteroscopy);

     }
}