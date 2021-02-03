package com.clinical.service.impl;
import com.clinical.dao.cluster.EncephlogramMapper;
import com.clinical.model.cluster.Encephlogram;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.EncephlogramService;
import org.springframework.stereotype.Service;

@Service
public class EncephlogramServiceImpl implements EncephlogramService {

    @Autowired
    EncephlogramMapper    encephlogramMapper;



    @Override
    public  void saveEncephlogram(Encephlogram encephlogram) {
         encephlogramMapper.saveEncephlogram(encephlogram);

     }
}