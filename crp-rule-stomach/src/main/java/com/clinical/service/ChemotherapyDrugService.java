package com.clinical.service;
import com.clinical.model.cluster.ChemotherapyDrug;


public interface ChemotherapyDrugService {



    public  void saveChemotherapyDrug(ChemotherapyDrug chemotherapyDrug);

    public  void deleteChemotherapyDrug(String uniqueId);

}