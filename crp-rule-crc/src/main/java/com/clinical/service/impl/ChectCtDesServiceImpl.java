package com.clinical.service.impl;
import com.clinical.dao.cluster.ChectCtDesMapper;
import com.clinical.model.cluster.ChectCtDes;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.ChectCtDesService;
import org.springframework.stereotype.Service;

@Service
public class ChectCtDesServiceImpl implements ChectCtDesService {

    @Autowired
    ChectCtDesMapper    chectCtDesMapper;



    @Override
    public  void saveChectCtDes(ChectCtDes chectCtDes) {
         chectCtDesMapper.saveChectCtDes(chectCtDes);

     }
}