package com.clinical.service;
import com.clinical.model.cluster.AbdominalCt;


public interface AbdominalCtService {



    public  void saveAbdominalCt(AbdominalCt abdominalCt);

    public  void deleteAbdominalCt(String uniqueId);

}