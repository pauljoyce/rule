package com.clinical.service.impl;
import com.clinical.dao.cluster.DurgOrderMapper;
import com.clinical.model.cluster.DurgOrder;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.DurgOrderService;
import org.springframework.stereotype.Service;

@Service
public class DurgOrderServiceImpl implements DurgOrderService {

    @Autowired
    DurgOrderMapper    durgOrderMapper;



    @Override
    public  void saveDurgOrder(DurgOrder durgOrder) {
         durgOrderMapper.saveDurgOrder(durgOrder);

     }
}