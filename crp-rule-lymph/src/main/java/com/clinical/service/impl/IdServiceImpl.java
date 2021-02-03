package com.clinical.service.impl;
import com.clinical.dao.cluster.IdMapper;
import com.clinical.model.cluster.Id;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.IdService;
import org.springframework.stereotype.Service;

@Service
public class IdServiceImpl implements IdService {

    @Autowired
    IdMapper    idMapper;



    @Override
    public  void saveId(Id id) {
         idMapper.saveId(id);

     }
}