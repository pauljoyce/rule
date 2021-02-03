package com.clinical.service.impl;
import com.clinical.dao.cluster.AbdominalCtMapper;
import com.clinical.model.cluster.AbdominalCt;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.AbdominalCtService;
import org.springframework.stereotype.Service;

@Service
public class AbdominalCtServiceImpl implements AbdominalCtService {

    @Autowired
    AbdominalCtMapper    abdominalCtMapper;



    @Override
    public  void saveAbdominalCt(AbdominalCt abdominalCt) {
         abdominalCtMapper.saveAbdominalCt(abdominalCt);

     }

    @Override
    public  void deleteAbdominalCt(String  uniqueId) {
         abdominalCtMapper.deleteAbdominalCt(uniqueId);

     }
}