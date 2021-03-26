package com.clinical.service.impl;
import com.clinical.dao.cluster.ChestCtDesMapper;
import com.clinical.model.cluster.ChestCtDes;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.ChestCtDesService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChestCtDesServiceImpl implements ChestCtDesService {

    @Autowired
    ChestCtDesMapper    chestCtDesMapper;



    @Override
    public  void saveChestCtDes(ChestCtDes chestCtDes) {
         chestCtDesMapper.saveChestCtDes(chestCtDes);

     }

    @Override
    public  void deleteChestCtDes(List<String> uniqueId) {
         chestCtDesMapper.deleteChestCtDes(uniqueId);

     }
}