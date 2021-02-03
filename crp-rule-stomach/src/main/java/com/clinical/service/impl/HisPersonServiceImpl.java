package com.clinical.service.impl;
import com.clinical.dao.cluster.HisPersonMapper;
import com.clinical.model.cluster.HisPerson;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.HisPersonService;
import org.springframework.stereotype.Service;

@Service
public class HisPersonServiceImpl implements HisPersonService {

    @Autowired
    HisPersonMapper    hisPersonMapper;



    @Override
    public  void saveHisPerson(HisPerson hisPerson) {
         hisPersonMapper.saveHisPerson(hisPerson);

     }

    @Override
    public  void deleteHisPerson(String  uniqueId) {
         hisPersonMapper.deleteHisPerson(uniqueId);

     }
}