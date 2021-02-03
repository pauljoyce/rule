package com.clinical.service.impl;
import com.clinical.dao.cluster.TemInpAdmissionStatusMapper;
import com.clinical.model.cluster.TemInpAdmissionStatus;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.TemInpAdmissionStatusService;
import org.springframework.stereotype.Service;

@Service
public class TemInpAdmissionStatusServiceImpl implements TemInpAdmissionStatusService {

    @Autowired
    TemInpAdmissionStatusMapper    temInpAdmissionStatusMapper;



    @Override
    public  void saveTemInpAdmissionStatus(TemInpAdmissionStatus temInpAdmissionStatus) {
         temInpAdmissionStatusMapper.saveTemInpAdmissionStatus(temInpAdmissionStatus);

     }
}