package com.clinical.service.impl;
import com.clinical.dao.cluster.PetCtResultMapper;
import com.clinical.model.cluster.PetCtResult;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.PetCtResultService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetCtResultServiceImpl implements PetCtResultService {

    @Autowired
    PetCtResultMapper    petCtResultMapper;



    @Override
    public  void savePetCtResult(PetCtResult petCtResult) {
         petCtResultMapper.savePetCtResult(petCtResult);

     }

    @Override
    public  void deletePetCtResult(List<String> uniqueId) {
         petCtResultMapper.deletePetCtResult(uniqueId);

     }
}