package com.clinical.service.impl;
import com.clinical.dao.cluster.IndexPathologyIcdMapper;
import com.clinical.model.cluster.IndexPathologyIcd;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.IndexPathologyIcdService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IndexPathologyIcdServiceImpl implements IndexPathologyIcdService {

    @Autowired
    IndexPathologyIcdMapper    indexPathologyIcdMapper;



    @Override
    public  void saveIndexPathologyIcd(IndexPathologyIcd indexPathologyIcd) {
         indexPathologyIcdMapper.saveIndexPathologyIcd(indexPathologyIcd);

     }

    @Override
    public  void deleteIndexPathologyIcd(List<String> uniqueId) {
         indexPathologyIcdMapper.deleteIndexPathologyIcd(uniqueId);

     }
}