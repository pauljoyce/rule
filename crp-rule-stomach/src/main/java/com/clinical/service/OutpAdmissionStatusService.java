package com.clinical.service;
import com.clinical.model.cluster.OutpAdmissionStatus;


public interface OutpAdmissionStatusService {



    public  void saveOutpAdmissionStatus(OutpAdmissionStatus outpAdmissionStatus);

    public  void deleteOutpAdmissionStatus(String uniqueId);

}