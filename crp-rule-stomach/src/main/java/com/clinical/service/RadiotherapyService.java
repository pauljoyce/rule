package com.clinical.service;
import com.clinical.model.cluster.Radiotherapy;


public interface RadiotherapyService {



    public  void saveRadiotherapy(Radiotherapy radiotherapy);

    public  void deleteRadiotherapy(String uniqueId);

}