package com.clinical.dao.cluster;

import com.clinical.model.cluster.Person;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PersonMapper {
    List<Person>  findPersonByPersonId(String uniqueId);
    void   savePerson(Person person);
    void   updatePerson(Person person);
    void   deletePerson(List<String> unique_id);
    void   truncateAllTable(@Param("tableName") String tableName);
}