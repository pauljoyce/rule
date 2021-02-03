package com.clinical.service.impl;
import com.clinical.dao.cluster.RadiotherapySiteMapper;
import com.clinical.model.cluster.RadiotherapySite;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.RadiotherapySiteService;
import org.springframework.stereotype.Service;

@Service
public class RadiotherapySiteServiceImpl implements RadiotherapySiteService {

    @Autowired
    RadiotherapySiteMapper    radiotherapySiteMapper;



    @Override
    public  void saveRadiotherapySite(RadiotherapySite radiotherapySite) {
         radiotherapySiteMapper.saveRadiotherapySite(radiotherapySite);

     }
}