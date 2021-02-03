package com.clinical.service.impl;
import com.clinical.dao.cluster.IndexIcuMapper;
import com.clinical.model.cluster.IndexIcu;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.IndexIcuService;
import org.springframework.stereotype.Service;

@Service
public class IndexIcuServiceImpl implements IndexIcuService {

    @Autowired
    IndexIcuMapper    indexIcuMapper;



    @Override
    public  void saveIndexIcu(IndexIcu indexIcu) {
         indexIcuMapper.saveIndexIcu(indexIcu);

     }
}