package com.clinical.service.impl;
import com.clinical.dao.cluster.IndexPathologyMapper;
import com.clinical.model.cluster.IndexPathology;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.IndexPathologyService;
import org.springframework.stereotype.Service;

@Service
public class IndexPathologyServiceImpl implements IndexPathologyService {

    @Autowired
    IndexPathologyMapper    indexPathologyMapper;



    @Override
    public  void saveIndexPathology(IndexPathology indexPathology) {
         indexPathologyMapper.saveIndexPathology(indexPathology);

     }
}