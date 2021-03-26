package com.clinical.service;
import com.clinical.model.cluster.ChestCtResult;

import java.util.List;


public interface ChestCtResultService {



    public  void saveChestCtResult(ChestCtResult chestCtResult);

    public  void deleteChestCtResult(List<String> uniqueId);

}