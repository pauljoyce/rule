package com.clinical.service.impl;
import com.clinical.dao.cluster.ChestCtMapper;
import com.clinical.model.cluster.ChestCt;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.ChestCtService;
import org.springframework.stereotype.Service;

@Service
public class ChestCtServiceImpl implements ChestCtService {

    @Autowired
    ChestCtMapper    chestCtMapper;



    @Override
    public  void saveChestCt(ChestCt chestCt) {
         chestCtMapper.saveChestCt(chestCt);

     }

    @Override
    public  void deleteChestCt(String  uniqueId) {
         chestCtMapper.deleteChestCt(uniqueId);

     }
}