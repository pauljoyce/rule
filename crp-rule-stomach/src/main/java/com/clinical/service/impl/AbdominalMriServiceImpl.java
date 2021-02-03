package com.clinical.service.impl;
import com.clinical.dao.cluster.AbdominalMriMapper;
import com.clinical.model.cluster.AbdominalMri;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.AbdominalMriService;
import org.springframework.stereotype.Service;

@Service
public class AbdominalMriServiceImpl implements AbdominalMriService {

    @Autowired
    AbdominalMriMapper    abdominalMriMapper;



    @Override
    public  void saveAbdominalMri(AbdominalMri abdominalMri) {
         abdominalMriMapper.saveAbdominalMri(abdominalMri);

     }

    @Override
    public  void deleteAbdominalMri(String  uniqueId) {
         abdominalMriMapper.deleteAbdominalMri(uniqueId);

     }
}