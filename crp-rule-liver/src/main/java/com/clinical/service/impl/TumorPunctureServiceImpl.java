package com.clinical.service.impl;
import com.clinical.dao.cluster.TumorPunctureMapper;
import com.clinical.model.cluster.TumorPuncture;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.TumorPunctureService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TumorPunctureServiceImpl implements TumorPunctureService {

    @Autowired
    TumorPunctureMapper    tumorPunctureMapper;



    @Override
    public  void saveTumorPuncture(TumorPuncture tumorPuncture) {
         tumorPunctureMapper.saveTumorPuncture(tumorPuncture);

     }

    @Override
    public  void deleteTumorPuncture(List<String> uniqueId) {
         tumorPunctureMapper.deleteTumorPuncture(uniqueId);

     }
}