package com.clinical.service;
import com.clinical.model.cluster.AbdominalMriDes;

import java.util.List;


public interface AbdominalMriDesService {



    public  void saveAbdominalMriDes(AbdominalMriDes abdominalMriDes);

    public  void deleteAbdominalMriDes(List<String> uniqueId);

}