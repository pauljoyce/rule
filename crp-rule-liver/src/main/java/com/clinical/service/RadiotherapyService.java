package com.clinical.service;
import com.clinical.model.cluster.Radiotherapy;

import java.util.List;


public interface RadiotherapyService {



    public  void saveRadiotherapy(Radiotherapy radiotherapy);

    public  void deleteRadiotherapy(List<String> uniqueId);

}