package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.Person;
public interface PersonMapper {
    List<Person>  findPerson(String uniqueId);
    void   savePerson(Person person);
    void   updatePerson(Person person);

}