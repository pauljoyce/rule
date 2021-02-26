package com.clinical.service.impl;
import com.clinical.dao.cluster.AbdomenCtDesMapper;
import com.clinical.model.cluster.AbdomenCtDes;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.AbdomenCtDesService;
import org.springframework.stereotype.Service;

@Service
public class AbdomenCtDesServiceImpl implements AbdomenCtDesService {

    @Autowired
    AbdomenCtDesMapper    abdomenCtDesMapper;



    @Override
    public  void saveAbdomenCtDes(AbdomenCtDes abdomenCtDes) {
         abdomenCtDesMapper.saveAbdomenCtDes(abdomenCtDes);

     }
}