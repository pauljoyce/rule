package com.clinical.service.impl;
import com.clinical.dao.cluster.GeneMapper;
import com.clinical.model.cluster.Gene;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.GeneService;
import org.springframework.stereotype.Service;

@Service
public class GeneServiceImpl implements GeneService {

    @Autowired
    GeneMapper    geneMapper;



    @Override
    public  void saveGene(Gene gene) {
         geneMapper.saveGene(gene);

     }
}