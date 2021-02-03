package com.clinical.service;
import com.clinical.model.cluster.AbdominalMri;


public interface AbdominalMriService {



    public  void saveAbdominalMri(AbdominalMri abdominalMri);

    public  void deleteAbdominalMri(String uniqueId);

}