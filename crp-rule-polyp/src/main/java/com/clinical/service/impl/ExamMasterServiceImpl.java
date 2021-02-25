package com.clinical.service.impl;

import com.clinical.dao.cluster.ExamMasterMapper;
import com.clinical.dao.master.ZjExamMasterMapper;
import com.clinical.model.cluster.ExamMaster;
import com.clinical.model.master.EXAM_MASTER;
import org.springframework.beans.factory.annotation.Autowired;
import com.clinical.service.ExamMasterService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExamMasterServiceImpl implements ExamMasterService {

    @Autowired
    ExamMasterMapper examMasterMapper;

    @Autowired
    ZjExamMasterMapper zjExamMasterMapper;

    @Override
    public void saveExamMaster(ExamMaster examMaster) {
        examMasterMapper.saveExamMaster(examMaster);

    }

    @Override
    public void inExamMaster() {
        List<EXAM_MASTER> zjExamMasterByAll = zjExamMasterMapper.findZjExamMasterByAll();
        for (EXAM_MASTER exam_master : zjExamMasterByAll) {
            System.out.println("创建对象");
            ExamMaster examMaster = new ExamMaster();
            System.out.println("赋值");
            examMaster.setUniqueId(exam_master.getUNIQUE_ID());
            examMaster.setUniqueIdLv1(exam_master.getUNIQUE_ID_LV1());
            examMaster.setUniqueIdLv2(exam_master.getUNIQUE_ID_LV2());
            examMaster.setP900(exam_master.getP900());
            examMaster.setPatientId(exam_master.getPATIENT_ID());
            examMaster.setVisitType(exam_master.getVISIT_TYPE());
            examMaster.setVisitId(exam_master.getVISIT_ID());
            examMaster.setAdmissionNumber(exam_master.getADMISSION_NUMBER());
            examMaster.setExamNo(exam_master.getEXAM_NO());
            examMaster.setFullName(exam_master.getFULL_NAME());
            examMaster.setSex(exam_master.getSEX());
            examMaster.setAge(exam_master.getAGE());
            examMaster.setExamClass(exam_master.getEXAM_CLASS());
            examMaster.setClinSymp(exam_master.getCLIN_SYMP());
            examMaster.setPhysSign(exam_master.getPHYS_SIGN());
            examMaster.setRelevantLabTest(exam_master.getRELEVANT_LAB_TEST());
            examMaster.setRelevantDiag(exam_master.getRELEVANT_DIAG());
            examMaster.setClinDiag(exam_master.getCLIN_DIAG());
            examMaster.setExamMode(exam_master.getEXAM_MODE());
            examMaster.setDevice(exam_master.getDEVICE());
            examMaster.setPerformedBy(exam_master.getPERFORMED_BY());
            examMaster.setPatientSource(exam_master.getPATIENT_SOURCE());
            examMaster.setReqDateTime(exam_master.getREQ_DATE_TIME());
            examMaster.setReqDept(exam_master.getREQ_DEPT());
            examMaster.setReqPhysician(exam_master.getREQ_PHYSICIAN());
            examMaster.setNotice(exam_master.getNOTICE());
            examMaster.setExamDateTime(exam_master.getEXAM_DATE_TIME());
            examMaster.setReportDateTime(exam_master.getREPORT_DATE_TIME());
            examMaster.setExamPosition(exam_master.getEXAM_POSITION());
            examMaster.setDiagDoctor(exam_master.getDIAG_DOCTOR());
            examMaster.setReviewDoctor(exam_master.getREVIEW_DOCTOR());
            examMaster.setEntryName(exam_master.getENTRY_NAME());
            examMaster.setEntryResults(exam_master.getENTRY_RESULTS());
            examMaster.setExamPara(exam_master.getEXAM_PARA());
            exam_master.setDESCRIPTION(exam_master.getDESCRIPTION());
            examMaster.setIsAbnormal(exam_master.getIS_ABNORMAL());
            examMaster.setMemo(exam_master.getMEMO());
            examMaster.setUseImage(exam_master.getUSE_IMAGE());
            examMaster.setExamClassStd(exam_master.getEXAM_CLASS_STD());
            StringBuffer ModeStd = new StringBuffer();

            if (!(exam_master.getEXAM_MODE1_STD()== null || exam_master.getEXAM_MODE1_STD().equals(""))){
                ModeStd.append(exam_master.getEXAM_MODE1_STD());
            }
            if (!(exam_master.getEXAM_MODE2_STD()== null || exam_master.getEXAM_MODE2_STD().equals(""))){
                ModeStd.append(exam_master.getEXAM_MODE2_STD());
            }
            if (!(exam_master.getEXAM_MODE3_STD()== null || exam_master.getEXAM_MODE3_STD().equals(""))){
                ModeStd.append(exam_master.getEXAM_MODE3_STD());
            }
            if (!(exam_master.getEXAM_MODE4_STD()== null || exam_master.getEXAM_MODE4_STD().equals(""))){
                ModeStd.append(exam_master.getEXAM_MODE4_STD());
            }
            if (!(exam_master.getEXAM_MODE5_STD()== null || exam_master.getEXAM_MODE5_STD().equals(""))){
                ModeStd.append(exam_master.getEXAM_MODE5_STD());
            }
            if (!(exam_master.getEXAM_MODE6_STD()== null || exam_master.getEXAM_MODE6_STD().equals(""))){
                ModeStd.append(exam_master.getEXAM_MODE6_STD());
            }
            examMaster.setExamModeStd(ModeStd.toString());
            StringBuffer STRUCTURESTD = new StringBuffer();
            if (!(exam_master.getSTRUCTURE1_STD()== null || exam_master.getSTRUCTURE1_STD().equals(""))){
                STRUCTURESTD.append(exam_master.getSTRUCTURE1_STD());
            }
            if (!(exam_master.getSTRUCTURE2_STD()== null || exam_master.getSTRUCTURE2_STD().equals(""))){
                STRUCTURESTD.append(exam_master.getSTRUCTURE2_STD());
            }
            if (!(exam_master.getSTRUCTURE3_STD()== null || exam_master.getSTRUCTURE3_STD().equals(""))){
                STRUCTURESTD.append(exam_master.getSTRUCTURE3_STD());
            }
            if (!(exam_master.getSTRUCTURE4_STD()== null || exam_master.getSTRUCTURE4_STD().equals(""))){
                STRUCTURESTD.append(exam_master.getSTRUCTURE4_STD());
            }
            if (!(exam_master.getSTRUCTURE5_STD()== null || exam_master.getSTRUCTURE5_STD().equals(""))){
                STRUCTURESTD.append(exam_master.getSTRUCTURE5_STD());
            }
            if (!(exam_master.getSTRUCTURE6_STD()== null || exam_master.getSTRUCTURE6_STD().equals(""))){
                STRUCTURESTD.append(exam_master.getSTRUCTURE6_STD());
            }
            //examMaster.setExamModeStd(exam_master.getEXAM_MODE1_STD()+" "+exam_master.getEXAM_MODE2_STD()+" "+exam_master.getEXAM_MODE3_STD()+" "+exam_master.getEXAM_MODE4_STD()+" "+exam_master.getEXAM_MODE5_STD()+" "+exam_master.getEXAM_MODE6_STD());
            examMaster.setStructureStd(STRUCTURESTD.toString());
                    //exam_master.getSTRUCTURE1_STD()+" "+exam_master.getSTRUCTURE2_STD()+" "+exam_master.getSTRUCTURE3_STD()+" "+exam_master.getSTRUCTURE4_STD()+" "+exam_master.getSTRUCTURE5_STD()+" "+exam_master.getSTRUCTURE6_STD());
            StringBuffer EXAM_NAME_STD = new StringBuffer();
            if (!(exam_master.getEXAM_NAME1_STD()== null || exam_master.getEXAM_NAME1_STD().equals(""))){
                EXAM_NAME_STD.append(exam_master.getEXAM_NAME1_STD());
            }
            if (!(exam_master.getEXAM_NAME2_STD()== null || exam_master.getEXAM_NAME2_STD().equals(""))){
                EXAM_NAME_STD.append(exam_master.getEXAM_NAME2_STD());
            }
            if (!(exam_master.getEXAM_NAME3_STD()== null || exam_master.getEXAM_NAME3_STD().equals(""))){
                EXAM_NAME_STD.append(exam_master.getEXAM_NAME3_STD());
            }
            if (!(exam_master.getEXAM_NAME4_STD()== null || exam_master.getEXAM_NAME4_STD().equals(""))){
                EXAM_NAME_STD.append(exam_master.getEXAM_NAME4_STD());
            }
            if (!(exam_master.getEXAM_NAME5_STD()== null || exam_master.getEXAM_NAME5_STD().equals(""))){
                EXAM_NAME_STD.append(exam_master.getEXAM_NAME5_STD());
            }
            if (!(exam_master.getEXAM_NAME6_STD()== null || exam_master.getEXAM_NAME6_STD().equals(""))){
                EXAM_NAME_STD.append(exam_master.getEXAM_NAME6_STD());
            }

            examMaster.setExamNameStd(EXAM_NAME_STD.toString());
               //     exam_master.getEXAM_NAME1_STD()+" "+exam_master.getEXAM_NAME2_STD()+" "+exam_master.getEXAM_NAME3_STD()+" "+exam_master.getEXAM_NAME4_STD()+" "+exam_master.getEXAM_NAME5_STD()+" "+exam_master.getEXAM_NAME6_STD());
            examMaster.setDataVersion(exam_master.getDATA_VERSION());
            examMaster.setDataDbSource(exam_master.getDATA_DB_SOURCE());
            examMaster.setDataTableSource(exam_master.getDATA_TABLE_SOURCE());
            examMaster.setDataFieldSource(exam_master.getDATA_FIELD_SOURCE());
            examMaster.setCreatedAt(exam_master.getCREATED_AT());
            examMaster.setCreator(exam_master.getCREATOR());
            examMaster.setUpdatedAt(exam_master.getUPDATED_AT());
            examMasterMapper.saveExamMaster(examMaster);
        }
    }
}