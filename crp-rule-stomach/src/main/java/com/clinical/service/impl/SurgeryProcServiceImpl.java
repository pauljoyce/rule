package com.clinical.service.impl;
import com.clinical.dao.cluster.SurgeryProcMapper;
import com.clinical.model.cluster.SurgeryProc;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.SurgeryProcService;
import org.springframework.stereotype.Service;

@Service
public class SurgeryProcServiceImpl implements SurgeryProcService {

    @Autowired
    SurgeryProcMapper    surgeryProcMapper;



    @Override
    public  void saveSurgeryProc(SurgeryProc surgeryProc) {
         surgeryProcMapper.saveSurgeryProc(surgeryProc);

     }

    @Override
    public  void deleteSurgeryProc(String  uniqueId) {
         surgeryProcMapper.deleteSurgeryProc(uniqueId);

     }
}