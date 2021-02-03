package com.clinical.service.impl;
import com.clinical.dao.cluster.CervicalSmearCytologyMapper;
import com.clinical.model.cluster.CervicalSmearCytology;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.CervicalSmearCytologyService;
import org.springframework.stereotype.Service;

@Service
public class CervicalSmearCytologyServiceImpl implements CervicalSmearCytologyService {

    @Autowired
    CervicalSmearCytologyMapper    cervicalSmearCytologyMapper;



    @Override
    public  void saveCervicalSmearCytology(CervicalSmearCytology cervicalSmearCytology) {
         cervicalSmearCytologyMapper.saveCervicalSmearCytology(cervicalSmearCytology);

     }
}