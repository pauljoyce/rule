package com.clinical.service.impl;
import com.clinical.dao.cluster.RabatMapper;
import com.clinical.model.cluster.Rabat;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.RabatService;
import org.springframework.stereotype.Service;

@Service
public class RabatServiceImpl implements RabatService {

    @Autowired
    RabatMapper    rabatMapper;



    @Override
    public  void saveRabat(Rabat rabat) {
         rabatMapper.saveRabat(rabat);

     }
}