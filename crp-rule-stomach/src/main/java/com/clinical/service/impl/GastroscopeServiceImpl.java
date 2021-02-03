package com.clinical.service.impl;
import com.clinical.dao.cluster.GastroscopeMapper;
import com.clinical.model.cluster.Gastroscope;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.GastroscopeService;
import org.springframework.stereotype.Service;

@Service
public class GastroscopeServiceImpl implements GastroscopeService {

    @Autowired
    GastroscopeMapper    gastroscopeMapper;



    @Override
    public  void saveGastroscope(Gastroscope gastroscope) {
         gastroscopeMapper.saveGastroscope(gastroscope);

     }

    @Override
    public  void deleteGastroscope(String  uniqueId) {
         gastroscopeMapper.deleteGastroscope(uniqueId);

     }
}