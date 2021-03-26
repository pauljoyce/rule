package com.clinical.service;
import com.clinical.model.cluster.IndexPathologyIcd;

import java.util.List;


public interface IndexPathologyIcdService {



    public  void saveIndexPathologyIcd(IndexPathologyIcd indexPathologyIcd);

    public  void deleteIndexPathologyIcd(List<String> uniqueId);

}