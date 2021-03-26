package com.clinical.service;
import com.clinical.model.cluster.AbdominalCtResult;

import java.util.List;


public interface AbdominalCtResultService {



    public  void saveAbdominalCtResult(AbdominalCtResult abdominalCtResult);

    public  void deleteAbdominalCtResult(List<String> uniqueId);

}