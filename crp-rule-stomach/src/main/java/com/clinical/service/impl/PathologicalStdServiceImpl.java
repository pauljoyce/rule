package com.clinical.service.impl;
import com.clinical.dao.cluster.PathologicalStdMapper;
import com.clinical.model.cluster.PathologicalStd;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.PathologicalStdService;
import org.springframework.stereotype.Service;

@Service
public class PathologicalStdServiceImpl implements PathologicalStdService {

    @Autowired
    PathologicalStdMapper    pathologicalStdMapper;



    @Override
    public  void savePathologicalStd(PathologicalStd pathologicalStd) {
         pathologicalStdMapper.savePathologicalStd(pathologicalStd);

     }

    @Override
    public  void deletePathologicalStd(String  uniqueId) {
         pathologicalStdMapper.deletePathologicalStd(uniqueId);

     }
}