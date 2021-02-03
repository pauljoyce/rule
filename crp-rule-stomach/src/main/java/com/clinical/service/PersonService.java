package com.clinical.service;
import com.clinical.model.cluster.Person;

import java.util.List;


public interface PersonService {



    public  void savePerson(Person person);

    public  void deletePerson(String uniqueId);

    public List<Person> findPersonByPersonId(String uniqueId);

}