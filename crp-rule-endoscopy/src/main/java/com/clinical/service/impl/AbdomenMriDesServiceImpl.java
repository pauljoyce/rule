package com.clinical.service.impl;
import com.clinical.dao.cluster.AbdomenMriDesMapper;
import com.clinical.model.cluster.AbdomenMriDes;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.AbdomenMriDesService;
import org.springframework.stereotype.Service;

@Service
public class AbdomenMriDesServiceImpl implements AbdomenMriDesService {

    @Autowired
    AbdomenMriDesMapper    abdomenMriDesMapper;



    @Override
    public  void saveAbdomenMriDes(AbdomenMriDes abdomenMriDes) {
         abdomenMriDesMapper.saveAbdomenMriDes(abdomenMriDes);

     }
}