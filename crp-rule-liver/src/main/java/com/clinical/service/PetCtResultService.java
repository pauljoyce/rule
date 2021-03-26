package com.clinical.service;
import com.clinical.model.cluster.PetCtResult;

import java.util.List;


public interface PetCtResultService {



    public  void savePetCtResult(PetCtResult petCtResult);

    public  void deletePetCtResult(List<String> uniqueId);

}