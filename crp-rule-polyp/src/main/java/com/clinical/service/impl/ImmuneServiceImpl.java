package com.clinical.service.impl;
import com.clinical.dao.cluster.ImmuneMapper;
import com.clinical.model.cluster.Immune;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.ImmuneService;
import org.springframework.stereotype.Service;

@Service
public class ImmuneServiceImpl implements ImmuneService {

    @Autowired
    ImmuneMapper    immuneMapper;



    @Override
    public  void saveImmune(Immune immune) {
         immuneMapper.saveImmune(immune);

     }
}