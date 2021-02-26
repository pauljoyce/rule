package com.clinical.service.impl;
import com.clinical.dao.cluster.AbdomenUsDesMapper;
import com.clinical.model.cluster.AbdomenUsDes;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.AbdomenUsDesService;
import org.springframework.stereotype.Service;

@Service
public class AbdomenUsDesServiceImpl implements AbdomenUsDesService {

    @Autowired
    AbdomenUsDesMapper    abdomenUsDesMapper;



    @Override
    public  void saveAbdomenUsDes(AbdomenUsDes abdomenUsDes) {
         abdomenUsDesMapper.saveAbdomenUsDes(abdomenUsDes);

     }
}