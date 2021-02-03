package com.clinical.service.impl;
import com.clinical.dao.cluster.EusGastroscopeMapper;
import com.clinical.model.cluster.EusGastroscope;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.EusGastroscopeService;
import org.springframework.stereotype.Service;

@Service
public class EusGastroscopeServiceImpl implements EusGastroscopeService {

    @Autowired
    EusGastroscopeMapper    eusGastroscopeMapper;



    @Override
    public  void saveEusGastroscope(EusGastroscope eusGastroscope) {
         eusGastroscopeMapper.saveEusGastroscope(eusGastroscope);

     }

    @Override
    public  void deleteEusGastroscope(String  uniqueId) {
         eusGastroscopeMapper.deleteEusGastroscope(uniqueId);

     }
}