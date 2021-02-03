package com.clinical.service;
import com.clinical.model.cluster.ChestCt;


public interface ChestCtService {



    public  void saveChestCt(ChestCt chestCt);

    public  void deleteChestCt(String uniqueId);

}