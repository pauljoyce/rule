package com.clinical.service.impl;
import com.clinical.dao.cluster.ThyroidPunctureMapper;
import com.clinical.model.cluster.ThyroidPuncture;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.ThyroidPunctureService;
import org.springframework.stereotype.Service;

@Service
public class ThyroidPunctureServiceImpl implements ThyroidPunctureService {

    @Autowired
    ThyroidPunctureMapper    thyroidPunctureMapper;



    @Override
    public  void saveThyroidPuncture(ThyroidPuncture thyroidPuncture) {
         thyroidPunctureMapper.saveThyroidPuncture(thyroidPuncture);

     }
}