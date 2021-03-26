package com.clinical.service;
import com.clinical.model.cluster.Chemotherapy;

import java.util.List;


public interface ChemotherapyService {



    public  void saveChemotherapy(Chemotherapy chemotherapy);

    public  void deleteChemotherapy(List<String> uniqueId);

}