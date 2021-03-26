package com.clinical.service;
import com.clinical.model.cluster.AbdominalCtDes;

import java.util.List;


public interface AbdominalCtDesService {



    public  void saveAbdominalCtDes(AbdominalCtDes abdominalCtDes);

    public  void deleteAbdominalCtDes(List<String> uniqueId);

}