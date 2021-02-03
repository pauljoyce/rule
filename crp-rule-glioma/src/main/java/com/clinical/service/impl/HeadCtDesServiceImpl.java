package com.clinical.service.impl;
import com.clinical.dao.cluster.HeadCtDesMapper;
import com.clinical.model.cluster.HeadCtDes;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.HeadCtDesService;
import org.springframework.stereotype.Service;

@Service
public class HeadCtDesServiceImpl implements HeadCtDesService {

    @Autowired
    HeadCtDesMapper    headCtDesMapper;



    @Override
    public  void saveHeadCtDes(HeadCtDes headCtDes) {
         headCtDesMapper.saveHeadCtDes(headCtDes);

     }
}