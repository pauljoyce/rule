package com.clinical.service.impl;
import com.clinical.dao.cluster.AbdominalCtDesMapper;
import com.clinical.model.cluster.AbdominalCtDes;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.AbdominalCtDesService;
import org.springframework.stereotype.Service;

@Service
public class AbdominalCtDesServiceImpl implements AbdominalCtDesService {

    @Autowired
    AbdominalCtDesMapper    abdominalCtDesMapper;



    @Override
    public  void saveAbdominalCtDes(AbdominalCtDes abdominalCtDes) {
         abdominalCtDesMapper.saveAbdominalCtDes(abdominalCtDes);

     }
}