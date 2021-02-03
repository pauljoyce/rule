package com.clinical.service;
import com.clinical.model.cluster.IndexPathologyIcd;


public interface IndexPathologyIcdService {



    public  void saveIndexPathologyIcd(IndexPathologyIcd indexPathologyIcd);

    public  void deleteIndexPathologyIcd(String uniqueId);

}