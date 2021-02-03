package com.clinical.service.impl;
import com.clinical.dao.cluster.ChestCtResultMapper;
import com.clinical.model.cluster.ChestCtResult;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.ChestCtResultService;
import org.springframework.stereotype.Service;

@Service
public class ChestCtResultServiceImpl implements ChestCtResultService {

    @Autowired
    ChestCtResultMapper    chestCtResultMapper;



    @Override
    public  void saveChestCtResult(ChestCtResult chestCtResult) {
         chestCtResultMapper.saveChestCtResult(chestCtResult);

     }
}