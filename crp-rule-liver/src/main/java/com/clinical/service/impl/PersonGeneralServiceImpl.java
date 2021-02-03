package com.clinical.service.impl;
import com.clinical.dao.cluster.PersonGeneralMapper;
import com.clinical.model.cluster.PersonGeneral;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.PersonGeneralService;
import org.springframework.stereotype.Service;

@Service
public class PersonGeneralServiceImpl implements PersonGeneralService {

    @Autowired
    PersonGeneralMapper    personGeneralMapper;



    @Override
    public  void savePersonGeneral(PersonGeneral personGeneral) {
         personGeneralMapper.savePersonGeneral(personGeneral);

     }
}