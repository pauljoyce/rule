package com.clinical.service.impl;
import com.clinical.dao.cluster.IndexOperationIcdMapper;
import com.clinical.model.cluster.IndexOperationIcd;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.IndexOperationIcdService;
import org.springframework.stereotype.Service;

@Service
public class IndexOperationIcdServiceImpl implements IndexOperationIcdService {

    @Autowired
    IndexOperationIcdMapper    indexOperationIcdMapper;



    @Override
    public  void saveIndexOperationIcd(IndexOperationIcd indexOperationIcd) {
         indexOperationIcdMapper.saveIndexOperationIcd(indexOperationIcd);

     }
}