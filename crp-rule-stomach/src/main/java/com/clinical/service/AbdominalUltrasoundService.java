package com.clinical.service;
import com.clinical.model.cluster.AbdominalUltrasound;


public interface AbdominalUltrasoundService {



    public  void saveAbdominalUltrasound(AbdominalUltrasound abdominalUltrasound);

    public  void deleteAbdominalUltrasound(String uniqueId);

}