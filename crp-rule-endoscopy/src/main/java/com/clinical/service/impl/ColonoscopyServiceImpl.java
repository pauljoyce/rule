package com.clinical.service.impl;
import com.clinical.dao.cluster.ColonoscopyMapper;
import com.clinical.model.cluster.Colonoscopy;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.ColonoscopyService;
import org.springframework.stereotype.Service;

@Service
public class ColonoscopyServiceImpl implements ColonoscopyService {

    @Autowired
    ColonoscopyMapper    colonoscopyMapper;



    @Override
    public  void saveColonoscopy(Colonoscopy colonoscopy) {
         colonoscopyMapper.saveColonoscopy(colonoscopy);

     }
}