package com.clinical.service;
import com.clinical.model.cluster.IndexInjury;

import java.util.List;


public interface IndexInjuryService {



    public  void saveIndexInjury(IndexInjury indexInjury);

    public  void deleteIndexInjury(List<String> uniqueId);

}