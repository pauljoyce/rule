package com.clinical.service.impl;
import com.clinical.dao.cluster.NeckUltrasoundMapper;
import com.clinical.model.cluster.NeckUltrasound;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.NeckUltrasoundService;
import org.springframework.stereotype.Service;

@Service
public class NeckUltrasoundServiceImpl implements NeckUltrasoundService {

    @Autowired
    NeckUltrasoundMapper    neckUltrasoundMapper;



    @Override
    public  void saveNeckUltrasound(NeckUltrasound neckUltrasound) {
         neckUltrasoundMapper.saveNeckUltrasound(neckUltrasound);

     }

    @Override
    public  void deleteNeckUltrasound(String  uniqueId) {
         neckUltrasoundMapper.deleteNeckUltrasound(uniqueId);

     }
}