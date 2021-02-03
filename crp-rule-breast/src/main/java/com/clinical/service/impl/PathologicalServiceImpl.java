package com.clinical.service.impl;
import com.clinical.dao.cluster.PathologicalMapper;
import com.clinical.model.cluster.Pathological;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.PathologicalService;
import org.springframework.stereotype.Service;

@Service
public class PathologicalServiceImpl implements PathologicalService {

    @Autowired
    PathologicalMapper    pathologicalMapper;



    @Override
    public  void savePathological(Pathological pathological) {
         pathologicalMapper.savePathological(pathological);

     }
}