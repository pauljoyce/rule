package com.clinical.service.impl;
import com.clinical.dao.cluster.OutpAdmissionStatusMapper;
import com.clinical.model.cluster.OutpAdmissionStatus;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.OutpAdmissionStatusService;
import org.springframework.stereotype.Service;

@Service
public class OutpAdmissionStatusServiceImpl implements OutpAdmissionStatusService {

    @Autowired
    OutpAdmissionStatusMapper    outpAdmissionStatusMapper;



    @Override
    public  void saveOutpAdmissionStatus(OutpAdmissionStatus outpAdmissionStatus) {
         outpAdmissionStatusMapper.saveOutpAdmissionStatus(outpAdmissionStatus);

     }

    @Override
    public  void deleteOutpAdmissionStatus(String  uniqueId) {
         outpAdmissionStatusMapper.deleteOutpAdmissionStatus(uniqueId);

     }
}