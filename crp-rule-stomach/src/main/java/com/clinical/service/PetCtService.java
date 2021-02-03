package com.clinical.service;
import com.clinical.model.cluster.PetCt;


public interface PetCtService {



    public  void savePetCt(PetCt petCt);

    public  void deletePetCt(String uniqueId);

}