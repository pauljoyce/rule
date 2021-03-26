package com.clinical.service.impl;
import com.clinical.dao.cluster.ChemotherapyMapper;
import com.clinical.model.cluster.Chemotherapy;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.ChemotherapyService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChemotherapyServiceImpl implements ChemotherapyService {

    @Autowired
    ChemotherapyMapper    chemotherapyMapper;



    @Override
    public  void saveChemotherapy(Chemotherapy chemotherapy) {
         chemotherapyMapper.saveChemotherapy(chemotherapy);

     }

    @Override
    public  void deleteChemotherapy(List<String> uniqueId) {
         chemotherapyMapper.deleteChemotherapy(uniqueId);

     }
}