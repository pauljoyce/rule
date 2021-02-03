package com.clinical.service.impl;
import com.clinical.dao.cluster.HisFamilyMapper;
import com.clinical.model.cluster.HisFamily;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.HisFamilyService;
import org.springframework.stereotype.Service;

@Service
public class HisFamilyServiceImpl implements HisFamilyService {

    @Autowired
    HisFamilyMapper    hisFamilyMapper;



    @Override
    public  void saveHisFamily(HisFamily hisFamily) {
         hisFamilyMapper.saveHisFamily(hisFamily);

     }

    @Override
    public  void deleteHisFamily(String  uniqueId) {
         hisFamilyMapper.deleteHisFamily(uniqueId);

     }
}