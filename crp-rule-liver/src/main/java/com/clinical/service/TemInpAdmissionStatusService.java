package com.clinical.service;
import com.clinical.model.cluster.TemInpAdmissionStatus;

import java.util.List;


public interface TemInpAdmissionStatusService {



    public  void saveTemInpAdmissionStatus(TemInpAdmissionStatus temInpAdmissionStatus);

    public  void deleteTemInpAdmissionStatus(List<String> uniqueId);

}