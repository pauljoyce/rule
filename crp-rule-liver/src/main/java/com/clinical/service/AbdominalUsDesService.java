package com.clinical.service;
import com.clinical.model.cluster.AbdominalUsDes;

import java.util.List;


public interface AbdominalUsDesService {



    public  void saveAbdominalUsDes(AbdominalUsDes abdominalUsDes);

    public  void deleteAbdominalUsDes(List<String> uniqueId);

}