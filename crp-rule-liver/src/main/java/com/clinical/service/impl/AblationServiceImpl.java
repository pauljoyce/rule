package com.clinical.service.impl;
import com.clinical.dao.cluster.AblationMapper;
import com.clinical.model.cluster.Ablation;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.AblationService;
import org.springframework.stereotype.Service;

@Service
public class AblationServiceImpl implements AblationService {

    @Autowired
    AblationMapper    ablationMapper;



    @Override
    public  void saveAblation(Ablation ablation) {
         ablationMapper.saveAblation(ablation);

     }
}