package com.clinical.service.impl;
import com.clinical.dao.cluster.ExamMasterMapper;
import com.clinical.model.cluster.ExamMaster;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.ExamMasterService;
import org.springframework.stereotype.Service;

@Service
public class ExamMasterServiceImpl implements ExamMasterService {

    @Autowired
    ExamMasterMapper    examMasterMapper;



    @Override
    public  void saveExamMaster(ExamMaster examMaster) {
         examMasterMapper.saveExamMaster(examMaster);

     }
}