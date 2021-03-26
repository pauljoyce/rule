package com.clinical.service;
import com.clinical.model.cluster.PetCtDes;

import java.util.List;


public interface PetCtDesService {



    public  void savePetCtDes(PetCtDes petCtDes);

    public  void deletePetCtDes(List<String> uniqueId);

}