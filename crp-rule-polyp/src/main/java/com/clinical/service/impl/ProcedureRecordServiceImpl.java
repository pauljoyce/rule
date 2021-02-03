package com.clinical.service.impl;
import com.clinical.dao.cluster.ProcedureRecordMapper;
import com.clinical.model.cluster.ProcedureRecord;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.ProcedureRecordService;
import org.springframework.stereotype.Service;

@Service
public class ProcedureRecordServiceImpl implements ProcedureRecordService {

    @Autowired
    ProcedureRecordMapper    procedureRecordMapper;



    @Override
    public  void saveProcedureRecord(ProcedureRecord procedureRecord) {
         procedureRecordMapper.saveProcedureRecord(procedureRecord);

     }
}