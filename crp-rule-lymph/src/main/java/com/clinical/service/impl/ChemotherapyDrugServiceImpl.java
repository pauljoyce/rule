package com.clinical.service.impl;
import com.clinical.dao.cluster.ChemotherapyDrugMapper;
import com.clinical.model.cluster.ChemotherapyDrug;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.ChemotherapyDrugService;
import org.springframework.stereotype.Service;

@Service
public class ChemotherapyDrugServiceImpl implements ChemotherapyDrugService {

    @Autowired
    ChemotherapyDrugMapper    chemotherapyDrugMapper;



    @Override
    public  void saveChemotherapyDrug(ChemotherapyDrug chemotherapyDrug) {
         chemotherapyDrugMapper.saveChemotherapyDrug(chemotherapyDrug);

     }
}