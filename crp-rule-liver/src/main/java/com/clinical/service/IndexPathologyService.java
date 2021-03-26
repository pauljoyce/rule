package com.clinical.service;
import com.clinical.model.cluster.IndexPathology;

import java.util.List;


public interface IndexPathologyService {



    public  void saveIndexPathology(IndexPathology indexPathology);

    public  void deleteIndexPathology(List<String> uniqueId);

}