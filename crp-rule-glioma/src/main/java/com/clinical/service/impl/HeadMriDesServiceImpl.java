package com.clinical.service.impl;
import com.clinical.dao.cluster.HeadMriDesMapper;
import com.clinical.model.cluster.HeadMriDes;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.HeadMriDesService;
import org.springframework.stereotype.Service;

@Service
public class HeadMriDesServiceImpl implements HeadMriDesService {

    @Autowired
    HeadMriDesMapper    headMriDesMapper;



    @Override
    public  void saveHeadMriDes(HeadMriDes headMriDes) {
         headMriDesMapper.saveHeadMriDes(headMriDes);

     }
}