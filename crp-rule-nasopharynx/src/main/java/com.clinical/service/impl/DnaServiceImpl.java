package com.clinical.service.impl;
import com.clinical.dao.cluster.DnaMapper;
import com.clinical.model.cluster.Dna;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.DnaService;
import org.springframework.stereotype.Service;

@Service
public class DnaServiceImpl implements DnaService {

    @Autowired
    DnaMapper    dnaMapper;



    @Override
    public  void saveDna(Dna dna) {
         dnaMapper.saveDna(dna);

     }
}