package com.clinical.service;
import com.clinical.model.cluster.IndexPerson;

import java.util.List;


public interface IndexPersonService {



    public  void saveIndexPerson(IndexPerson indexPerson);

    public  void deleteIndexPerson(List<String> uniqueId);

}