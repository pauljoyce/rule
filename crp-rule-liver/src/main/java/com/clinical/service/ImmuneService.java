package com.clinical.service;
import com.clinical.model.cluster.Immune;

import java.util.List;


public interface ImmuneService {



    public  void saveImmune(Immune immune);

    public  void deleteImmune(List<String> uniqueId);

}