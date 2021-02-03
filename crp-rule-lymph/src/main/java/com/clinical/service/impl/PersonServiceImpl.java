package com.clinical.service.impl;
import com.clinical.dao.cluster.PersonMapper;
import com.clinical.model.cluster.Person;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.PersonService;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    PersonMapper    personMapper;



    @Override
    public  void savePerson(Person person) {
         personMapper.savePerson(person);

     }
}