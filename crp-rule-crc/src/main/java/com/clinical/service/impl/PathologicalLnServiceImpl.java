package com.clinical.service.impl;
import com.clinical.dao.cluster.PathologicalLnMapper;
import com.clinical.model.cluster.PathologicalLn;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.PathologicalLnService;
import org.springframework.stereotype.Service;

@Service
public class PathologicalLnServiceImpl implements PathologicalLnService {

    @Autowired
    PathologicalLnMapper    pathologicalLnMapper;



    @Override
    public  void savePathologicalLn(PathologicalLn pathologicalLn) {
         pathologicalLnMapper.savePathologicalLn(pathologicalLn);

     }
}