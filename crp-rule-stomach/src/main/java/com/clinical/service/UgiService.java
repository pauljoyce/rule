package com.clinical.service;
import com.clinical.model.cluster.Ugi;


public interface UgiService {



    public  void saveUgi(Ugi ugi);

    public  void deleteUgi(String uniqueId);

}