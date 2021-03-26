package com.clinical.service.impl;
import com.clinical.dao.cluster.AbdominalUsDesMapper;
import com.clinical.model.cluster.AbdominalUsDes;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.AbdominalUsDesService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AbdominalUsDesServiceImpl implements AbdominalUsDesService {

    @Autowired
    AbdominalUsDesMapper    abdominalUsDesMapper;



    @Override
    public  void saveAbdominalUsDes(AbdominalUsDes abdominalUsDes) {
         abdominalUsDesMapper.saveAbdominalUsDes(abdominalUsDes);

     }

    @Override
    public  void deleteAbdominalUsDes(List<String> uniqueId) {
         abdominalUsDesMapper.deleteAbdominalUsDes(uniqueId);

     }
}