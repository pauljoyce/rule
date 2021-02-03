package com.clinical.service;
import com.clinical.model.cluster.InpAdmissionStatus;


public interface InpAdmissionStatusService {



    public  void saveInpAdmissionStatus(InpAdmissionStatus inpAdmissionStatus);

    public  void deleteInpAdmissionStatus(String uniqueId);

}