package com.clinical.service.impl;
import com.clinical.dao.cluster.MarkerMapper;
import com.clinical.model.cluster.Marker;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.MarkerService;
import org.springframework.stereotype.Service;

@Service
public class MarkerServiceImpl implements MarkerService {

    @Autowired
    MarkerMapper    markerMapper;



    @Override
    public  void saveMarker(Marker marker) {
         markerMapper.saveMarker(marker);

     }

    @Override
    public  void deleteMarker(String  uniqueId) {
         markerMapper.deleteMarker(uniqueId);

     }
}