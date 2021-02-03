package com.clinical.service;
import com.clinical.model.cluster.EusGastroscope;


public interface EusGastroscopeService {



    public  void saveEusGastroscope(EusGastroscope eusGastroscope);

    public  void deleteEusGastroscope(String uniqueId);

}