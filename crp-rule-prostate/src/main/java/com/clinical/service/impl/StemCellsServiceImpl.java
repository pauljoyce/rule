package com.clinical.service.impl;
import com.clinical.dao.cluster.StemCellsMapper;
import com.clinical.model.cluster.StemCells;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.StemCellsService;
import org.springframework.stereotype.Service;

@Service
public class StemCellsServiceImpl implements StemCellsService {

    @Autowired
    StemCellsMapper    stemCellsMapper;



    @Override
    public  void saveStemCells(StemCells stemCells) {
         stemCellsMapper.saveStemCells(stemCells);

     }
}