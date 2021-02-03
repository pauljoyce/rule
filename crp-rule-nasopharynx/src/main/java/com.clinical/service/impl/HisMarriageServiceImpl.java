package com.clinical.service.impl;
import com.clinical.dao.cluster.HisMarriageMapper;
import com.clinical.model.cluster.HisMarriage;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.HisMarriageService;
import org.springframework.stereotype.Service;

@Service
public class HisMarriageServiceImpl implements HisMarriageService {

    @Autowired
    HisMarriageMapper    hisMarriageMapper;



    @Override
    public  void saveHisMarriage(HisMarriage hisMarriage) {
         hisMarriageMapper.saveHisMarriage(hisMarriage);

     }
}