package com.clinical.service.impl;
import com.clinical.dao.cluster.PathologicalEyeMapper;
import com.clinical.model.cluster.PathologicalEye;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.PathologicalEyeService;
import org.springframework.stereotype.Service;

@Service
public class PathologicalEyeServiceImpl implements PathologicalEyeService {

    @Autowired
    PathologicalEyeMapper    pathologicalEyeMapper;



    @Override
    public  void savePathologicalEye(PathologicalEye pathologicalEye) {
         pathologicalEyeMapper.savePathologicalEye(pathologicalEye);

     }
}