package com.clinical.service.impl;
import com.clinical.dao.cluster.IndexInjuryMapper;
import com.clinical.model.cluster.IndexInjury;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.IndexInjuryService;
import org.springframework.stereotype.Service;

@Service
public class IndexInjuryServiceImpl implements IndexInjuryService {

    @Autowired
    IndexInjuryMapper    indexInjuryMapper;



    @Override
    public  void saveIndexInjury(IndexInjury indexInjury) {
         indexInjuryMapper.saveIndexInjury(indexInjury);

     }
}