package com.clinical.service;
import com.clinical.model.cluster.NeckUltrasound;


public interface NeckUltrasoundService {



    public  void saveNeckUltrasound(NeckUltrasound neckUltrasound);

    public  void deleteNeckUltrasound(String uniqueId);

}