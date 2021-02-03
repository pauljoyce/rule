package com.clinical.service;
import com.clinical.model.cluster.IndexPerson;


public interface IndexPersonService {



    public  void saveIndexPerson(IndexPerson indexPerson);

    public  void deleteIndexPerson(String uniqueId);

}