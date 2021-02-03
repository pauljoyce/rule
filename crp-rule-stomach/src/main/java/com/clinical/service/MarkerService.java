package com.clinical.service;
import com.clinical.model.cluster.Marker;


public interface MarkerService {



    public  void saveMarker(Marker marker);

    public  void deleteMarker(String uniqueId);

}