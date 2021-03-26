package com.clinical.service;
import com.clinical.model.cluster.AbdominalMriResult;

import java.util.List;


public interface AbdominalMriResultService {



    public  void saveAbdominalMriResult(AbdominalMriResult abdominalMriResult);

    public  void deleteAbdominalMriResult(List<String> uniqueId);

}