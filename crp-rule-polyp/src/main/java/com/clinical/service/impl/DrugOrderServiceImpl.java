package com.clinical.service.impl;
import com.clinical.dao.cluster.DrugOrderMapper;
import com.clinical.model.cluster.DrugOrder;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.DrugOrderService;
import org.springframework.stereotype.Service;

@Service
public class DrugOrderServiceImpl implements DrugOrderService {

    @Autowired
    DrugOrderMapper    drugOrderMapper;



    @Override
    public  void saveDrugOrder(DrugOrder drugOrder) {
         drugOrderMapper.saveDrugOrder(drugOrder);

     }
}