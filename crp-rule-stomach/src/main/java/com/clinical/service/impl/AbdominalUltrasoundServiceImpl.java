package com.clinical.service.impl;
import com.clinical.dao.cluster.AbdominalUltrasoundMapper;
import com.clinical.model.cluster.AbdominalUltrasound;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.AbdominalUltrasoundService;
import org.springframework.stereotype.Service;

@Service
public class AbdominalUltrasoundServiceImpl implements AbdominalUltrasoundService {

    @Autowired
    AbdominalUltrasoundMapper    abdominalUltrasoundMapper;



    @Override
    public  void saveAbdominalUltrasound(AbdominalUltrasound abdominalUltrasound) {
         abdominalUltrasoundMapper.saveAbdominalUltrasound(abdominalUltrasound);

     }

    @Override
    public  void deleteAbdominalUltrasound(String  uniqueId) {
         abdominalUltrasoundMapper.deleteAbdominalUltrasound(uniqueId);

     }
}