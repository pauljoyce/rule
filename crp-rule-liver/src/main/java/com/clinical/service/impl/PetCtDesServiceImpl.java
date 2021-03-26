package com.clinical.service.impl;
import com.clinical.dao.cluster.PetCtDesMapper;
import com.clinical.model.cluster.PetCtDes;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.PetCtDesService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetCtDesServiceImpl implements PetCtDesService {

    @Autowired
    PetCtDesMapper    petCtDesMapper;



    @Override
    public  void savePetCtDes(PetCtDes petCtDes) {
         petCtDesMapper.savePetCtDes(petCtDes);

     }

    @Override
    public  void deletePetCtDes(List<String> uniqueId) {
         petCtDesMapper.deletePetCtDes(uniqueId);

     }
}