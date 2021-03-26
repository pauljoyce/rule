package com.clinical.service.impl;

import com.clinical.dao.cluster.PersonMapper;
import com.clinical.model.cluster.Person;
import com.clinical.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    PersonMapper    personMapper;



    @Override
    public  void savePerson(Person person) {
         personMapper.savePerson(person);

     }

    @Override
    public  void deletePerson(List<String>  uniqueId) {
         personMapper.deletePerson(uniqueId);

     }



    @Override
    public List<Person> findPersonByPersonId(String uniqueId) {
        return personMapper.findPersonByPersonId(uniqueId);
    }

}