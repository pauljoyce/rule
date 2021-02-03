package com.clinical.service.impl;
import com.clinical.dao.cluster.ColonEsDesMapper;
import com.clinical.model.cluster.ColonEsDes;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.ColonEsDesService;
import org.springframework.stereotype.Service;

@Service
public class ColonEsDesServiceImpl implements ColonEsDesService {

    @Autowired
    ColonEsDesMapper    colonEsDesMapper;



    @Override
    public  void saveColonEsDes(ColonEsDes colonEsDes) {
         colonEsDesMapper.saveColonEsDes(colonEsDes);

     }
}