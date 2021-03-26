package com.clinical.service;
import com.clinical.model.cluster.ChestCtDes;

import java.util.List;


public interface ChestCtDesService {



    public  void saveChestCtDes(ChestCtDes chestCtDes);

    public  void deleteChestCtDes(List<String> uniqueId);

}