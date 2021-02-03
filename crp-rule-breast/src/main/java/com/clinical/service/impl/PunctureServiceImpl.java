package com.clinical.service.impl;
import com.clinical.dao.cluster.PunctureMapper;
import com.clinical.model.cluster.Puncture;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.PunctureService;
import org.springframework.stereotype.Service;

@Service
public class PunctureServiceImpl implements PunctureService {

    @Autowired
    PunctureMapper    punctureMapper;



    @Override
    public  void savePuncture(Puncture puncture) {
         punctureMapper.savePuncture(puncture);

     }
}