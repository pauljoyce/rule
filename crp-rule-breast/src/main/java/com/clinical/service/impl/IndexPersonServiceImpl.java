package com.clinical.service.impl;
import com.clinical.dao.cluster.IndexPersonMapper;
import com.clinical.model.cluster.IndexPerson;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.IndexPersonService;
import org.springframework.stereotype.Service;

@Service
public class IndexPersonServiceImpl implements IndexPersonService {

    @Autowired
    IndexPersonMapper    indexPersonMapper;



    @Override
    public  void saveIndexPerson(IndexPerson indexPerson) {
         indexPersonMapper.saveIndexPerson(indexPerson);

     }
}