package com.clinical.service;
import com.clinical.model.cluster.AbdominalUsResult;

import java.util.List;


public interface AbdominalUsResultService {



    public  void saveAbdominalUsResult(AbdominalUsResult abdominalUsResult);

    public  void deleteAbdominalUsResult(List<String> uniqueId);

}