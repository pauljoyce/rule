package com.clinical.service.impl;
import com.clinical.dao.cluster.OperativeComplicationsMapper;
import com.clinical.model.cluster.OperativeComplications;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.OperativeComplicationsService;
import org.springframework.stereotype.Service;

@Service
public class OperativeComplicationsServiceImpl implements OperativeComplicationsService {

    @Autowired
    OperativeComplicationsMapper    operativeComplicationsMapper;



    @Override
    public  void saveOperativeComplications(OperativeComplications operativeComplications) {
         operativeComplicationsMapper.saveOperativeComplications(operativeComplications);

     }
}