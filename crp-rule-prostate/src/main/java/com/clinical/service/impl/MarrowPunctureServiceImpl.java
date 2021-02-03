package com.clinical.service.impl;
import com.clinical.dao.cluster.MarrowPunctureMapper;
import com.clinical.model.cluster.MarrowPuncture;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.MarrowPunctureService;
import org.springframework.stereotype.Service;

@Service
public class MarrowPunctureServiceImpl implements MarrowPunctureService {

    @Autowired
    MarrowPunctureMapper    marrowPunctureMapper;



    @Override
    public  void saveMarrowPuncture(MarrowPuncture marrowPuncture) {
         marrowPunctureMapper.saveMarrowPuncture(marrowPuncture);

     }
}