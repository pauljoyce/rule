package com.clinical.service.impl;
import com.clinical.dao.cluster.IndexPathologyMapper;
import com.clinical.model.cluster.IndexPathology;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.IndexPathologyService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IndexPathologyServiceImpl implements IndexPathologyService {

    @Autowired
    IndexPathologyMapper    indexPathologyMapper;



    @Override
    public  void saveIndexPathology(IndexPathology indexPathology) {
         indexPathologyMapper.saveIndexPathology(indexPathology);

     }

    @Override
    public  void deleteIndexPathology(List<String> uniqueId) {
         indexPathologyMapper.deleteIndexPathology(uniqueId);

     }
}