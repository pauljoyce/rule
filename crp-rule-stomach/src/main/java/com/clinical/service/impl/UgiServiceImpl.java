package com.clinical.service.impl;
import com.clinical.dao.cluster.UgiMapper;
import com.clinical.model.cluster.Ugi;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.UgiService;
import org.springframework.stereotype.Service;

@Service
public class UgiServiceImpl implements UgiService {

    @Autowired
    UgiMapper    ugiMapper;



    @Override
    public  void saveUgi(Ugi ugi) {
         ugiMapper.saveUgi(ugi);

     }

    @Override
    public  void deleteUgi(String  uniqueId) {
         ugiMapper.deleteUgi(uniqueId);

     }
}