package com.clinical.service.impl;
import com.clinical.dao.cluster.PetCtMapper;
import com.clinical.model.cluster.PetCt;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.PetCtService;
import org.springframework.stereotype.Service;

@Service
public class PetCtServiceImpl implements PetCtService {

    @Autowired
    PetCtMapper    petCtMapper;



    @Override
    public  void savePetCt(PetCt petCt) {
         petCtMapper.savePetCt(petCt);

     }

    @Override
    public  void deletePetCt(String  uniqueId) {
         petCtMapper.deletePetCt(uniqueId);

     }
}