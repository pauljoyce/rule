package com.clinical.service.impl;
import com.clinical.dao.cluster.Tem24hInOutMapper;
import com.clinical.model.cluster.Tem24hInOut;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.Tem24hInOutService;
import org.springframework.stereotype.Service;

@Service
public class Tem24hInOutServiceImpl implements Tem24hInOutService {

    @Autowired
    Tem24hInOutMapper    tem24hInOutMapper;



    @Override
    public  void saveTem24hInOut(Tem24hInOut tem24hInOut) {
         tem24hInOutMapper.saveTem24hInOut(tem24hInOut);

     }
}