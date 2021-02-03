package com.clinical.service;
import com.clinical.model.cluster.SurgeryProc;


public interface SurgeryProcService {



    public  void saveSurgeryProc(SurgeryProc surgeryProc);

    public  void deleteSurgeryProc(String uniqueId);

}