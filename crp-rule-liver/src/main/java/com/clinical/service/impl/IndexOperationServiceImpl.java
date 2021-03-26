package com.clinical.service.impl;
import com.clinical.dao.cluster.IndexOperationMapper;
import com.clinical.model.cluster.IndexOperation;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.IndexOperationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IndexOperationServiceImpl implements IndexOperationService {

    @Autowired
    IndexOperationMapper    indexOperationMapper;



    @Override
    public  void saveIndexOperation(IndexOperation indexOperation) {
         indexOperationMapper.saveIndexOperation(indexOperation);

     }

    @Override
    public  void deleteIndexOperation(List<String> uniqueId) {
         indexOperationMapper.deleteIndexOperation(uniqueId);

     }
}