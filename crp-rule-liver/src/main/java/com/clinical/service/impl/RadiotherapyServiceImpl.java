package com.clinical.service.impl;
import com.clinical.dao.cluster.RadiotherapyMapper;
import com.clinical.model.cluster.Radiotherapy;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.RadiotherapyService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RadiotherapyServiceImpl implements RadiotherapyService {

    @Autowired
    RadiotherapyMapper    radiotherapyMapper;



    @Override
    public  void saveRadiotherapy(Radiotherapy radiotherapy) {
         radiotherapyMapper.saveRadiotherapy(radiotherapy);

     }

    @Override
    public  void deleteRadiotherapy(List<String> uniqueId) {
         radiotherapyMapper.deleteRadiotherapy(uniqueId);

     }
}