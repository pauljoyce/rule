package com.clinical.service.impl;
import com.clinical.dao.cluster.TemOutpDischargeSummerMapper;
import com.clinical.model.cluster.TemOutpDischargeSummer;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.TemOutpDischargeSummerService;
import org.springframework.stereotype.Service;

@Service
public class TemOutpDischargeSummerServiceImpl implements TemOutpDischargeSummerService {

    @Autowired
    TemOutpDischargeSummerMapper    temOutpDischargeSummerMapper;



    @Override
    public  void saveTemOutpDischargeSummer(TemOutpDischargeSummer temOutpDischargeSummer) {
         temOutpDischargeSummerMapper.saveTemOutpDischargeSummer(temOutpDischargeSummer);

     }
}