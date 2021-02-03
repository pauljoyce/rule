package com.clinical.service.impl;
import com.clinical.dao.cluster.AbdominalMriDesMapper;
import com.clinical.model.cluster.AbdominalMriDes;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.AbdominalMriDesService;
import org.springframework.stereotype.Service;

@Service
public class AbdominalMriDesServiceImpl implements AbdominalMriDesService {

    @Autowired
    AbdominalMriDesMapper    abdominalMriDesMapper;



    @Override
    public  void saveAbdominalMriDes(AbdominalMriDes abdominalMriDes) {
         abdominalMriDesMapper.saveAbdominalMriDes(abdominalMriDes);

     }
}