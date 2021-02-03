package com.clinical.service.impl;
import com.clinical.dao.cluster.InpAdmissionStatusMapper;
import com.clinical.model.cluster.InpAdmissionStatus;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.InpAdmissionStatusService;
import org.springframework.stereotype.Service;

@Service
public class InpAdmissionStatusServiceImpl implements InpAdmissionStatusService {

    @Autowired
    InpAdmissionStatusMapper    inpAdmissionStatusMapper;



    @Override
    public  void saveInpAdmissionStatus(InpAdmissionStatus inpAdmissionStatus) {
         inpAdmissionStatusMapper.saveInpAdmissionStatus(inpAdmissionStatus);

     }

    @Override
    public  void deleteInpAdmissionStatus(String  uniqueId) {
         inpAdmissionStatusMapper.deleteInpAdmissionStatus(uniqueId);

     }
}