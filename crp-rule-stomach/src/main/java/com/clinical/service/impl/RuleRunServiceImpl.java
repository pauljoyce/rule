package com.clinical.service.impl;

import com.clinical.constant.Constant;
import com.clinical.constant.DrugConstant;
import com.clinical.model.cluster.*;
import com.clinical.model.master.*;
import com.clinical.dao.master.*;
import com.clinical.service.*;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUnit;

@Service
public class RuleRunServiceImpl implements RuleRunService {

    private final Logger log= LoggerFactory.getLogger(RuleRunServiceImpl.class);
    @Autowired
    PersonService  personService;

    @Autowired
    VisitRecordService  visitRecordService;

    @Autowired
    IndexPersonService  indexPersonService;

    @Autowired
    IndexDiagnosisAdmitService  indexDiagnosisAdmitService;

    @Autowired
    IndexDiagnosisAdmitIcdService  indexDiagnosisAdmitIcdService;

    @Autowired
    IndexDiagnosisClinicService  indexDiagnosisClinicService;

    @Autowired
    IndexDiagnosisClinicIcdService  indexDiagnosisClinicIcdService;

    @Autowired
    IndexOperationService  indexOperationService;

    @Autowired
    IndexOperationIcdService  indexOperationIcdService;

    @Autowired
    IndexDiagnosisMainService  indexDiagnosisMainService;

    @Autowired
    IndexDiagnosisMainIcdService  indexDiagnosisMainIcdService;

    @Autowired
    IndexDiagnosisOtherService  indexDiagnosisOtherService;

    @Autowired
    IndexDiagnosisOtherIcdService  indexDiagnosisOtherIcdService;

    @Autowired
    IndexIcuService  indexIcuService;

    @Autowired
    IndexPathologyService  indexPathologyService;

    @Autowired
    IndexPathologyIcdService  indexPathologyIcdService;

    @Autowired
    IndexInjuryService  indexInjuryService;

    @Autowired
    InpAdmissionStatusService  inpAdmissionStatusService;

    @Autowired
    PersonGeneralService  personGeneralService;

    @Autowired
    HisFamilyService  hisFamilyService;

    @Autowired
    HisPersonService  hisPersonService;

    @Autowired
    HisPastService  hisPastService;

    @Autowired
    HisMarriageService  hisMarriageService;

    @Autowired
    ConsultationService  consultationService;

    @Autowired
    SymptomService  symptomService;

    @Autowired
    DiagnosisService  diagnosisService;

    @Autowired
    InspectionService  inspectionService;

    @Autowired
    ExamMasterService  examMasterService;

    @Autowired
    ExamMasterStdService  examMasterStdService;

    @Autowired
    GastroscopeService  gastroscopeService;

    @Autowired
    EusGastroscopeService  eusGastroscopeService;

    @Autowired
    ColonoscopyService  colonoscopyService;

    @Autowired
    UgiService  ugiService;

    @Autowired
    RabatService  rabatService;

    @Autowired
    ChestCtService  chestCtService;

    @Autowired
    AbdominalCtService  abdominalCtService;

    @Autowired
    AbdominalMriService  abdominalMriService;

    @Autowired
    AbdominalUltrasoundService  abdominalUltrasoundService;

    @Autowired
    NeckUltrasoundService  neckUltrasoundService;

    @Autowired
    PetCtService  petCtService;

    @Autowired
    OperationRecordService  operationRecordService;

    @Autowired
    SurgeryProcService  surgeryProcService;

    @Autowired
    PostoperativeRecoveryService  postoperativeRecoveryService;

    @Autowired
    OperationComplicationsService  operationComplicationsService;

    @Autowired
    PathologicalStdService  pathologicalStdService;

    @Autowired
    PathologicalService  pathologicalService;

    @Autowired
    MarkerService  markerService;

    @Autowired
    TreatmentService  treatmentService;

    @Autowired
    OutpAdmissionStatusService  outpAdmissionStatusService;

    @Autowired
    RadiotherapyService  radiotherapyService;

    @Autowired
    ChemotherapyDrugService  chemotherapyDrugService;

    @Autowired
    CancerPainTreatmentService  cancerPainTreatmentService;

    @Autowired
    FollowUpService  followUpService;



    @Autowired
    ZjBasyNstdMapper zjBasyNstdMapper;

    @Autowired
    ZjBasyDiagStdMapper zjBasyDiagStdMapper;

    @Autowired
    ZjBasyOpStdMapper zjBasyOpStdMapper;

    @Autowired
    ZjTemPatMasterIndexMapper zjTemPatMasterIndexMapper;

    @Autowired
    ZjPatVisitMasterMapper zjPatVisitMasterMapper;

    @Autowired
    ZjInpDiagnosisMapper zjInpDiagnosisMapper;

    @Autowired
    ZjLisRecordMapper zjLisRecordMapper;

    @Autowired
    ZjExamMasterMapper zjExamMasterMapper;

    @Autowired
    ZjHistologyReportMapper zjHistologyReportMapper;

    @Autowired
    ZjTemOperationRecordMapper zjTemOperationRecordMapper;

    @Autowired
    ZjProcedureRecordMapper zjProcedureRecordMapper;

    @Autowired
    ZjTemDeathRecordMapper zjTemDeathRecordMapper;

    @Autowired
    ZjFollowUpMapper zjFollowUpMapper;

    @Autowired
    ZjNursingRecordMapper zjNursingRecordMapper;

    @Autowired
    ZjVitalRecordMapper zjVitalRecordMapper;

    @Autowired
    ZjDrugOrderMapper zjDrugOrderMapper;

    @Autowired
    ZjTemInpAdmissionStatusMapper zjTemInpAdmissionStatusMapper;

    @Autowired
    ZjTemOutpDischargeStatusMapper zjTemOutpDischargeStatusMapper;

    @Autowired
    ZjTem24hInOutMapper zjTem24hInOutMapper;

    @Autowired
    ZjOutpRecordMapper zjOutpRecordMapper;

    @Autowired
    ZjTemCourseDisMapper zjTemCourseDisMapper;

    @Autowired
    ZjTemOutpDischargeSummerMapper zjTemOutpDischargeSummerMapper;

    @Autowired
    ZjWardRoundRecordMapper zjWardRoundRecordMapper;

    @Autowired
    ZjInpConsultationDoctorMasterMapper zjInpConsultationDoctorMasterMapper;

    @Autowired
    ZjInpConsultationDoctorDetailMapper zjInpConsultationDoctorDetailMapper;

    @Autowired
    ZjTemPreCourseDisMapper zjTemPreCourseDisMapper;

    @Autowired
    ZjPreOpDiscussionMapper zjPreOpDiscussionMapper;

    @Autowired
    ZjPostOpCourseMapper zjPostOpCourseMapper;

    @Autowired
    ZjTransferDeptMapper zjTransferDeptMapper;

    @Autowired
    ZjEmergencyRecordMapper zjEmergencyRecordMapper;

    @Autowired
    ZjStageSummaryMapper zjStageSummaryMapper;

    @Autowired
    ZjInpBillDetailMapper zjInpBillDetailMapper;

    @Autowired
    ZjTransfusionOrderMapper zjTransfusionOrderMapper;

    @Autowired
    ZjDietOrderMapper zjDietOrderMapper;

    @Autowired
    ZjInpOrdersMapper zjInpOrdersMapper;

    @Autowired
    ZjOutpDiagnosisSplitMapper zjOutpDiagnosisSplitMapper;

    @Autowired
    ZjSymptomsMapper zjSymptomsMapper;

    @Autowired
    ZjFamilyHistoryMapper zjFamilyHistoryMapper;

    @Autowired
    ZjSurgeryHistoryMapper zjSurgeryHistoryMapper;

    @Autowired
    ZjAllergyHistoryMapper zjAllergyHistoryMapper;

    @Autowired
    ZjTransfusionHistoryMapper zjTransfusionHistoryMapper;

    @Autowired
    ZjPossibleCauseMapper zjPossibleCauseMapper;

    @Autowired
    ZjDietMapper zjDietMapper;

    @Autowired
    ZjConcomitantDiseaseMapper zjConcomitantDiseaseMapper;

    @Autowired
    ZjPhysicalExamMapper zjPhysicalExamMapper;

    @Autowired
    ZjImagingMapper zjImagingMapper;

    @Autowired
    ZjEndoscopyMapper zjEndoscopyMapper;

    @Autowired
    ZjDrugCourseMapper zjDrugCourseMapper;

    @Autowired
    ZjBiomarkerMapper zjBiomarkerMapper;

    @Autowired
    ZjPathologyMapper zjPathologyMapper;

    @Autowired
    ZjSurgeryProcMapper zjSurgeryProcMapper;

    @Autowired
    ZjPostopFunctionMapper zjPostopFunctionMapper;

    @Autowired
    ZjRadiotherapyMapper zjRadiotherapyMapper;

    @Autowired
    DiagnosisStageService diagnosisStageService;

    @Override
    public void saveRuleRun(Integer pageNo, Integer pageSize, String flag) {

        Map<String, Integer> map = new HashMap<>();
        map.put("pageNo", pageNo);
        map.put("pageSize", pageSize);
        //查找患者列表
        List<TEM_PAT_MASTER_INDEX> zj_TEM_PAT_MASTER_INDEX = zjTemPatMasterIndexMapper.findZjTemPatMasterIndexByUniqueId(map);


        for (TEM_PAT_MASTER_INDEX index : zj_TEM_PAT_MASTER_INDEX) {
            //保存患者--------------------------------------------------
//            savePerson(index);
            String patientId=index.getPATIENT_ID();
            String visitId=index.getVISIT_ID();
            //患者就诊列表
            List<PAT_VISIT_MASTER> zj_PAT_VISIT_MASTER = zjPatVisitMasterMapper.findZjPatVisitMasterByUniqueId(index.getUNIQUE_ID());
            //就诊其他数据
            for (PAT_VISIT_MASTER master : zj_PAT_VISIT_MASTER) {

                //保存就诊----------------------------------------------------
                 saveVisitRecord(master);

                String uniqueId = master.getUNIQUE_ID();

                Date visitdate=master.getADMISSION_DATE_TIME();

                //病案首页
                List<BASY_NSTD> zj_BASY_NSTDs=zjBasyNstdMapper.findZjBasyNstdsByUniqueId(uniqueId);
                BASY_NSTD zj_BASY_NSTD;
                if (zj_BASY_NSTDs.size()==1){
                    zj_BASY_NSTD = zj_BASY_NSTDs.get(0);
                }else {
                    zj_BASY_NSTD=  zjBasyNstdMapper.findZjBasyNstdByUniqueId(uniqueId);
                }

                List<BASY_OP_STD> zj_BASY_OP_STDs=zjBasyOpStdMapper.findZjBasyOpStdsByUniqueId(uniqueId);
                BASY_OP_STD zj_BASY_OP_STD;
                if (zj_BASY_OP_STDs.size()==1){
                    zj_BASY_OP_STD = zj_BASY_OP_STDs.get(0);
                }else {
                    zj_BASY_OP_STD = zjBasyOpStdMapper.findZjBasyOpStdByUniqueId(uniqueId);
                }

                List<BASY_DIAG_STD> zj_BASY_DIAG_STDs=zjBasyDiagStdMapper.findZjBasyDiagStdsByUniqueId(uniqueId);
                BASY_DIAG_STD  zj_BASY_DIAG_STD;
                if (zj_BASY_DIAG_STDs.size()==1){
                    zj_BASY_DIAG_STD = zj_BASY_DIAG_STDs.get(0);
                }else {
                    zj_BASY_DIAG_STD =  zjBasyDiagStdMapper.findZjBasyDiagStdByUniqueId(uniqueId);
                }

                List<INP_DIAGNOSIS> zj_INP_DIAGNOSIS = zjInpDiagnosisMapper.findZjInpDiagnosisByUniqueId(uniqueId);


//                List<NURSING_RECORD> zj_NURSING_RECORD = zjNursingRecordMapper.findZjNursingRecordByUniqueId(uniqueId);
//                List<VITAL_RECORD> zj_VITAL_RECORD = zjVitalRecordMapper.findZjVitalRecordByUniqueId(uniqueId);
//                List<TEM_INP_ADMISSION_STATUS> zj_TEM_INP_ADMISSION_STATUS = zjTemInpAdmissionStatusMapper.findZjTemInpAdmissionStatusByUniqueId(uniqueId);
                //List<INP_DIAGNOSIS> zj_INP_DIAGNOSIS = zjInpDiagnosisMapper.findZjInpDiagnosisByUniqueId(uniqueId);
              //  List<INP_CONSULTATION_DOCTOR_DETAIL> zj_INP_CONSULTATION_DOCTOR_DETAIL = zjInpConsultationDoctorDetailMapper.findZjInpConsultationDoctorDetailByUniqueId(uniqueId);*/
                //List<LIS_RECORD> zj_LIS_RECORD = zjLisRecordMapper.findZjLisRecordByUniqueId(uniqueId);
//                List<DRUG_ORDER> zj_DRUG_ORDER = zjDrugOrderMapper.findZjDrugOrderByUniqueId(uniqueId);
//                List<DRUG_COURSE> zj_DRUG_COURSE = zjDrugCourseMapper.findZjDrugCourseByUniqueId(uniqueId);
               // List<POSSIBLE_CAUSE> zj_POSSIBLE_CAUSE = zjPossibleCauseMapper.findZjPossibleCauseByUniqueId(uniqueId);
               // List<FAMILY_HISTORY> zj_FAMILY_HISTORY = zjFamilyHistoryMapper.findZjFamilyHistoryByUniqueId(uniqueId);
                //List<CONCOMITANT_DISEASE> zj_CONCOMITANT_DISEASE = zjConcomitantDiseaseMapper.findZjConcomitantDiseaseByUniqueId(uniqueId);
              //  List<SYMPTOMS> zj_SYMPTOMS = zjSymptomsMapper.findZjSymptomsByUniqueId(uniqueId);
//                List<EXAM_MASTER> zj_EXAM_MASTER = zjExamMasterMapper.findZjExamMasterByUniqueId(uniqueId);


//                List<HISTOLOGY_REPORT> zj_HISTOLOGY_REPORT = zjHistologyReportMapper.findZjHistologyReportByUniqueId(uniqueId);
//                List<TEM_OPERATION_RECORD> zj_TEM_OPERATION_RECORD = zjTemOperationRecordMapper.findZjTemOperationRecordByUniqueId(uniqueId);
//                List<PROCEDURE_RECORD> zj_PROCEDURE_RECORD = zjProcedureRecordMapper.findZjProcedureRecordByUniqueId(uniqueId);
//                List<TEM_DEATH_RECORD> zj_TEM_DEATH_RECORD = zjTemDeathRecordMapper.findZjTemDeathRecordByUniqueId(uniqueId);
//                List<FOLLOW_UP> zj_FOLLOW_UP = zjFollowUpMapper.findZjFollowUpByUniqueId(uniqueId);
//
//                List<TEM_OUTP_DISCHARGE_STATUS> zj_TEM_OUTP_DISCHARGE_STATUS = zjTemOutpDischargeStatusMapper.findZjTemOutpDischargeStatusByUniqueId(uniqueId);
//                List<TEM_24H_IN_OUT> zj_TEM_24H_IN_OUT = zjTem24hInOutMapper.findZjTem24hInOutByUniqueId(uniqueId);
//                List<OUTP_RECORD> zj_OUTP_RECORD = zjOutpRecordMapper.findZjOutpRecordByUniqueId(uniqueId);
//                List<TEM_COURSE_DIS> zj_TEM_COURSE_DIS = zjTemCourseDisMapper.findZjTemCourseDisByUniqueId(uniqueId);
//                List<TEM_OUTP_DISCHARGE_SUMMER> zj_TEM_OUTP_DISCHARGE_SUMMER = zjTemOutpDischargeSummerMapper.findZjTemOutpDischargeSummerByUniqueId(uniqueId);
//                List<WARD_ROUND_RECORD> zj_WARD_ROUND_RECORD = zjWardRoundRecordMapper.findZjWardRoundRecordByUniqueId(uniqueId);
//                List<INP_CONSULTATION_DOCTOR_MASTER> zj_INP_CONSULTATION_DOCTOR_MASTER = zjInpConsultationDoctorMasterMapper.findZjInpConsultationDoctorMasterByUniqueId(uniqueId);
//                List<INP_CONSULTATION_DOCTOR_DETAIL> zj_INP_CONSULTATION_DOCTOR_DETAIL = zjInpConsultationDoctorDetailMapper.findZjInpConsultationDoctorDetailByUniqueId(uniqueId);
//                List<TEM_PRE_COURSE_DIS> zj_TEM_PRE_COURSE_DIS = zjTemPreCourseDisMapper.findZjTemPreCourseDisByUniqueId(uniqueId);
//                List<PRE_OP_DISCUSSION> zj_PRE_OP_DISCUSSION = zjPreOpDiscussionMapper.findZjPreOpDiscussionByUniqueId(uniqueId);
//                List<POST_OP_COURSE> zj_POST_OP_COURSE = zjPostOpCourseMapper.findZjPostOpCourseByUniqueId(uniqueId);
//                List<TRANSFER_DEPT> zj_TRANSFER_DEPT = zjTransferDeptMapper.findZjTransferDeptByUniqueId(uniqueId);
//                List<EMERGENCY_RECORD> zj_EMERGENCY_RECORD = zjEmergencyRecordMapper.findZjEmergencyRecordByUniqueId(uniqueId);
//                List<STAGE_SUMMARY> zj_STAGE_SUMMARY = zjStageSummaryMapper.findZjStageSummaryByUniqueId(uniqueId);
//                List<INP_BILL_DETAIL> zj_INP_BILL_DETAIL = zjInpBillDetailMapper.findZjInpBillDetailByUniqueId(uniqueId);
//                List<TRANSFUSION_ORDER> zj_TRANSFUSION_ORDER = zjTransfusionOrderMapper.findZjTransfusionOrderByUniqueId(uniqueId);
//                List<DIET_ORDER> zj_DIET_ORDER = zjDietOrderMapper.findZjDietOrderByUniqueId(uniqueId);
//                List<INP_ORDERS> zj_INP_ORDERS = zjInpOrdersMapper.findZjInpOrdersByUniqueId(uniqueId);
//                List<OUTP_DIAGNOSIS_SPLIT> zj_OUTP_DIAGNOSIS_SPLIT = zjOutpDiagnosisSplitMapper.findZjOutpDiagnosisSplitByUniqueId(uniqueId);
//                List<SYMPTOMS> zj_SYMPTOMS = zjSymptomsMapper.findZjSymptomsByUniqueId(uniqueId);
//                List<FAMILY_HISTORY> zj_FAMILY_HISTORY = zjFamilyHistoryMapper.findZjFamilyHistoryByUniqueId(uniqueId);
//                List<SURGERY_HISTORY> zj_SURGERY_HISTORY = zjSurgeryHistoryMapper.findZjSurgeryHistoryByUniqueId(uniqueId);
//                List<ALLERGY_HISTORY> zj_ALLERGY_HISTORY = zjAllergyHistoryMapper.findZjAllergyHistoryByUniqueId(uniqueId);
//                List<TRANSFUSION_HISTORY> zj_TRANSFUSION_HISTORY = zjTransfusionHistoryMapper.findZjTransfusionHistoryByUniqueId(uniqueId);
//                List<POSSIBLE_CAUSE> zj_POSSIBLE_CAUSE = zjPossibleCauseMapper.findZjPossibleCauseByUniqueId(uniqueId);
//                List<DIET> zj_DIET = zjDietMapper.findZjDietByUniqueId(uniqueId);
//                List<CONCOMITANT_DISEASE> zj_CONCOMITANT_DISEASE = zjConcomitantDiseaseMapper.findZjConcomitantDiseaseByUniqueId(uniqueId);
//                List<PHYSICAL_EXAM> zj_PHYSICAL_EXAM = zjPhysicalExamMapper.findZjPhysicalExamByUniqueId(uniqueId);
//                List<IMAGING> zj_IMAGING = zjImagingMapper.findZjImagingByUniqueId(uniqueId);
//                List<ENDOSCOPY> zj_ENDOSCOPY = zjEndoscopyMapper.findZjEndoscopyByUniqueId(uniqueId);
//                List<DRUG_COURSE> zj_DRUG_COURSE = zjDrugCourseMapper.findZjDrugCourseByUniqueId(uniqueId);
//                List<BIOMARKER> zj_BIOMARKER = zjBiomarkerMapper.findZjBiomarkerByUniqueId(uniqueId);
//                List<PATHOLOGY> zj_PATHOLOGY = zjPathologyMapper.findZjPathologyByUniqueId(uniqueId);
//                List<SURGERY_PROC> zj_SURGERY_PROC = zjSurgeryProcMapper.findZjSurgeryProcByUniqueId(uniqueId);
//                List<POSTOP_FUNCTION> zj_POSTOP_FUNCTION = zjPostopFunctionMapper.findZjPostopFunctionByUniqueId(uniqueId);
//                List<RADIOTHERAPY> zj_RADIOTHERAPY = zjRadiotherapyMapper.findZjRadiotherapyByUniqueId(uniqueId);
//
//                List<IMAGING> zj_IMAGING = zjImagingMapper.findZjImagingByUniqueId(uniqueId);



               if(zj_BASY_NSTD!=null){
                    saveIndexPerson(zj_BASY_NSTD,zj_BASY_DIAG_STD);
                    saveIndexIcu(zj_BASY_NSTD);
                }
                if(zj_BASY_DIAG_STD!=null){

                    Date admitdate=null;
                    Date maindate=null;
                    Date clinicdate=null;
                    Date pathdate=null;
                    for(INP_DIAGNOSIS diagnosis: zj_INP_DIAGNOSIS){
                        if(diagnosis.getDIAGNOSIS_TYPE()!=null){
                            if(diagnosis.getDIAGNOSIS_TYPE().contains("出院主要诊断")){
                                maindate=diagnosis.getDIAGNOSIS_DATE();
                            }
                            if(diagnosis.getDIAGNOSIS_TYPE().contains("门诊诊断")){
                                clinicdate=diagnosis.getDIAGNOSIS_DATE();
                            }
                            if(diagnosis.getDIAGNOSIS_TYPE().contains("入院初诊")){
                                admitdate=diagnosis.getDIAGNOSIS_DATE();
                            }
                            if(diagnosis.getDIAGNOSIS_TYPE().contains("病理诊断")){
                                pathdate=diagnosis.getDIAGNOSIS_DATE();
                            }
                        }

                    }


                    saveIndexDiagnosisAdmit(zj_BASY_DIAG_STD,visitdate,admitdate);
                    saveIndexDiagnosisClinic(zj_BASY_DIAG_STD,visitdate,clinicdate);
                    saveIndexDiagnosisMain(zj_BASY_DIAG_STD,visitdate,maindate);
                    saveIndexDiagnosisOther(zj_BASY_DIAG_STD,visitdate,maindate);
                    saveIndexInjury(zj_BASY_DIAG_STD);
                    saveIndexPathology(zj_BASY_DIAG_STD,visitdate,pathdate);
                }

                if(zj_BASY_OP_STD!=null){
                    saveIndexOperation(zj_BASY_OP_STD);
                }

/*

                if(zj_NURSING_RECORD!=null&&zj_NURSING_RECORD.size()>0){
                    savePersonGeneral(zj_NURSING_RECORD, zj_VITAL_RECORD);
                }
*/

/*
               if(zj_TEM_INP_ADMISSION_STATUS!=null&&zj_TEM_INP_ADMISSION_STATUS.size()>0){
                    saveHisMarriage(zj_TEM_INP_ADMISSION_STATUS);
                }*/

            /*    if(zj_INP_DIAGNOSIS!=null&&zj_INP_DIAGNOSIS.size()>0){
                    saveDiagnosis(zj_INP_DIAGNOSIS);
                }*/

   /*             if(zj_INP_CONSULTATION_DOCTOR_DETAIL!=null&&zj_INP_CONSULTATION_DOCTOR_DETAIL.size()>0){

                    saveConsultation(patientId,visitId,zj_INP_CONSULTATION_DOCTOR_DETAIL);
                }*/

             /*   if(zj_LIS_RECORD!=null&&zj_LIS_RECORD.size()>0){
                    saveInspection(zj_LIS_RECORD);
                }*/

      /*          if(zj_POSSIBLE_CAUSE!=null&&zj_POSSIBLE_CAUSE.size()>0){
                    saveHisPerson(zj_POSSIBLE_CAUSE,null);
                }

                if(zj_FAMILY_HISTORY!=null&&zj_FAMILY_HISTORY.size()>0){
                    saveHisFamily( zj_FAMILY_HISTORY );
                }

                if(zj_CONCOMITANT_DISEASE!=null&&zj_CONCOMITANT_DISEASE.size()>0){
                    saveHisPast( zj_CONCOMITANT_DISEASE );
                }

                if(zj_SYMPTOMS!=null&&zj_SYMPTOMS.size()>0){
                    saveSymptom(zj_SYMPTOMS);
                }*/


//                if(zj_DRUG_ORDER!=null&&zj_DRUG_ORDER.size()>0){
//                    saveTreatment(zj_DRUG_ORDER);
//                }
//                if(zj_DRUG_COURSE!=null&&zj_DRUG_COURSE.size()>0){
//                    saveChemotherapyDrug( zj_DRUG_COURSE);
//                }
/*
                if(zj_TEM_INP_ADMISSION_STATUS!=null&&zj_TEM_INP_ADMISSION_STATUS.size()>0){
                    for(TEM_INP_ADMISSION_STATUS tem_inp_admission_status:zj_TEM_INP_ADMISSION_STATUS){
                        saveInpAdmissionStatus(tem_inp_admission_status);
                    }

                }

                if(zj_EXAM_MASTER!=null&&zj_EXAM_MASTER.size()>0){
                    saveExamMaster(zj_EXAM_MASTER);
                    saveExamMasterStd(zj_EXAM_MASTER);
                }*/
//                if(zj_EXAM_MASTER!=null&&zj_EXAM_MASTER.size()>0){
//                    saveExamMaster(zj_EXAM_MASTER);
//                    saveExamMasterStd(zj_EXAM_MASTER);
//
//                    for (EXAM_MASTER exam_master:zj_EXAM_MASTER
//                         ) {
//
//                        if (zj_IMAGING==null||zj_IMAGING.size()==0){
//                            continue;
//                        }
//                        String examName = exam_master.getEXAM_NAME1_STD() + ","
//                                + exam_master.getEXAM_NAME2_STD() + ","
//                                + exam_master.getEXAM_NAME3_STD() + ","
//                                + exam_master.getEXAM_NAME4_STD() + ","
//                                + exam_master.getEXAM_NAME5_STD() + ","
//                                + exam_master.getEXAM_NAME6_STD();
//
//                        try {
//                            saveUgi(examName,exam_master,zj_IMAGING);
//                            saveRabat(examName,exam_master,zj_IMAGING);
//                            saveChestCt(examName,exam_master,zj_IMAGING);
//                            saveAbdominalCt(examName,exam_master,zj_IMAGING);
//                            saveAbdominalMri(examName,exam_master,zj_IMAGING);
//                            saveAbdominalUltrasound(examName,exam_master,zj_IMAGING);
//                            saveNeckUltrasound(examName,exam_master,zj_IMAGING);
//                            savePetCt(examName,exam_master,zj_IMAGING);
//                        } catch (ParseException e) {
//                            e.printStackTrace();
//                        }
//                    }
//                }
//                if(zj_INP_DIAGNOSIS!=null&&zj_INP_DIAGNOSIS.size()>0){
//                    saveDiagnosis(zj_INP_DIAGNOSIS);
//                    saveDiagnosisStage(zj_INP_DIAGNOSIS);
//                }

//                if(zj_NURSING_RECORD!=null&&zj_NURSING_RECORD.size()>0){
//                    savePersonGeneral(zj_NURSING_RECORD, zj_VITAL_RECORD);
//                }


            }

        }









    }




    public void savePerson(TEM_PAT_MASTER_INDEX index){
        Person person = new Person();
        //患者身份标识
        person.setPersonId(index.getUNIQUE_ID());
        //医疗机构代码
        person.setP900(index.getP900());
        //患者id
        person.setPatientId(index.getPATIENT_ID());
        //住院号
        person.setVisitId(index.getVISIT_ID());
        //姓名
        person.setName(index.getNAME());
        //性别
        person.setSex(index.getSEX());
        //出生日期
        person.setDateOfBirth(index.getDATE_OF_BIRTH());
        //出生地
        person.setBirthPlace(index.getBIRTH_PLACE());
        //国籍
        person.setCitizenship(index.getCITIZENSHIP());
        //民族
        person.setNation(index.getNATION());
        //身份证号
        person.setIdNo(index.getID_NO());
        //合同单位
        person.setUnitInContract(index.getUNIT_IN_CONTRACT());
        //住址
        person.setMailingAddress(index.getMAILING_ADDRESS());
        //联系人
        person.setNextOfKin(index.getNEXT_OF_KIN());
        //联系电话
        person.setTelephone(index.getTELEPHONE());
        //与联系人关系
        person.setRelationship(index.getRELATIONSHIP());
        //入院来源
        person.setPatientClass(index.getPATIENT_CLASS());

        List<String> neededDiagList = Arrays.asList(
                "食管胃连接处恶性肿瘤",
                "胃底恶性肿瘤",
                "胃体恶性肿瘤",
                "胃窦恶性肿瘤",
                "胃小弯恶性肿瘤",
                "胃大弯恶性肿瘤",
                "胃交搭跨越恶性肿瘤的损害",
                "胃体和胃窦及胃大弯恶性肿瘤",
                "贲门胃底恶性肿瘤",
                "贲门胃体恶性肿瘤",
                "胃窦胃体恶性肿瘤",
                "胃底胃体恶性肿瘤",
                "胃恶性肿瘤",
                "胃多处恶性肿瘤",
                "残胃恶性肿瘤",
                "胃体及横结肠恶性肿瘤",
                "胃肠道恶性肿瘤",
                "胃肠道继发恶性肿瘤",
                "胃底继发恶性肿瘤",
                "胃食管连接部继发恶性肿瘤",
                "胃继发恶性肿瘤",
                "胃肠道恶性肿瘤家族史",
                "胃恶性肿瘤个人史",
                "贲门恶性肿瘤",
                "贲门口恶性肿瘤",
                "食管贲门连接处恶性肿瘤",
                "幽门窦恶性肿瘤",
                "幽门恶性肿瘤",
                "幽门前恶性肿瘤",
                "幽门管恶性肿瘤",
                "胃溃疡癌变",
                "消化系统部位不明确的恶性肿瘤",
                "消化道恶性肿瘤"
        );
        List<String> visits = new ArrayList<>();
        //患者就诊列表
        List<PAT_VISIT_MASTER> zj_PAT_VISIT_MASTER = zjPatVisitMasterMapper.findZjPatVisitMasterByUniqueId(index.getUNIQUE_ID());
        zj_PAT_VISIT_MASTER.forEach(master -> visits.add(master.getUNIQUE_ID()));
        List<INP_DIAGNOSIS> diagnosisList = new ArrayList<>();
        List<INP_DIAGNOSIS> finalDiagnosisList = new ArrayList<>();
        List<Date> diagnosisDateList = new ArrayList<>();
        visits.forEach(visit -> diagnosisList.addAll(zjInpDiagnosisMapper.findZjInpDiagnosisByUniqueId(visit)));
        finalDiagnosisList=diagnosisList.stream().filter(diagnosis -> diagnosis != null && diagnosis.getDIAGNOSIS_DATE() != null&&diagnosis.getDIAGNOSIS_DESC()!=null)
                .filter(diagnosis -> neededDiagList.contains(diagnosis.getDIAGNOSIS_DESC()))
                .collect(Collectors.toList());
        finalDiagnosisList.forEach(diag -> diagnosisDateList.add(diag.getDIAGNOSIS_DATE()));

        Date birthDate = index.getDATE_OF_BIRTH();
        if (diagnosisDateList.size()==0||birthDate==null){
            personService.savePerson(person);
            log.info("无法计算首次诊断日期，保存患者："+person.getPersonId());
        }else {
            Date firstDiagDate = Collections.min(diagnosisDateList);

            DateTime birthDateTime = DateTime.of(birthDate);
            DateTime firstDiagDateTime = DateTime.of(firstDiagDate);
            log.info("id:" + index.getUNIQUE_ID());
            log.info("出生日期：" + birthDateTime.toString());
            log.info("首次诊断日期：" + firstDiagDateTime.toString());
            long betweenDays = birthDateTime.between(firstDiagDateTime, DateUnit.DAY);
            double betweenYears = betweenDays / 365;
            log.info("日期相差天数：" + betweenDays + "，年数：" + new BigDecimal(betweenYears).setScale(0, RoundingMode.DOWN).toString());
            person.setFirstVisitAge(new BigDecimal(betweenYears).setScale(0, RoundingMode.DOWN).toString());

            personService.savePerson(person);
            log.info("保存患者："+person.getPersonId());
        }
    }
    public void saveVisitRecord(PAT_VISIT_MASTER master) {
        VisitRecord visitRecord = new VisitRecord();
        //患者身份标识
        visitRecord.setPersonId(master.getUNIQUE_ID_LV1());
        //唯一标识
        visitRecord.setUniqueId(master.getUNIQUE_ID());
        //医疗机构代码
        visitRecord.setP900(master.getP900());
        //患者id
        visitRecord.setPatientId(master.getPATIENT_ID());
        //就诊类型
        visitRecord.setVisitType(Integer.valueOf(master.getVISIT_TYPE()));
        //住院号
        visitRecord.setVisitId(master.getVISIT_ID());
        //入院日期
        visitRecord.setAdmissionDateTime(master.getADMISSION_DATE_TIME());
        //出院日期
        visitRecord.setDischargeDateTime(master.getDISCHARGE_DATE_TIME());
        //入院科室
        visitRecord.setDeptAdmissionTo(master.getDEPT_ADMISSION_TO());
        //出院科室
        visitRecord.setDeptDischargeFrom(master.getDEPT_DISCHARGE_FROM());
        //住院次数
        visitRecord.setAdmissionNumber(master.getADMISSION_NUMBER());
        //就诊医院
        visitRecord.setP900Name(master.getP900());
        //就诊类型汉字
        if (master.getVISIT_TYPE().equals("1")) {
            visitRecord.setVisitSourceValue("住院");
        } else if (master.getVISIT_TYPE().equals("2")) {
            visitRecord.setVisitSourceValue("门诊");
        } else if (master.getVISIT_TYPE().equals("3")) {
            visitRecord.setVisitSourceValue("急诊");
        } else if (master.getVISIT_TYPE().equals("4")) {
            visitRecord.setVisitSourceValue("体检");
        }
       /* //数据版本
        visitRecord.setDataVersion();
        //数据库来源
        visitRecord.setDataDbSource();
        //数据表来源
        visitRecord.setDataTableSource();
        //数据项来源
        visitRecord.setDataFieldSource();
        //创建时间
        visitRecord.setCreatedAt();
        //创建人
        visitRecord.setCreator();
        //修改时间
        visitRecord.setUpdatedAt();*/
        visitRecordService.saveVisitRecord(visitRecord);
        log.info("保存就诊："+visitRecord.getUniqueId());
    }
    public void saveIndexOperation(BASY_OP_STD zj_BASY_STD){
        log.info("保存病案首页手术："+zj_BASY_STD.getUNIQUE_ID());
        if (zj_BASY_STD.getP490()!=null&&zj_BASY_STD.getP492()!=null) {

                IndexOperation indexOperation = new IndexOperation();
                //标识患者身份唯一标识
                indexOperation.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexOperation.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexOperation.setP900(zj_BASY_STD.getP900());
                //患者id
                indexOperation.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexOperation.setVisitId(zj_BASY_STD.getVISIT_ID());
                //手术/操作日期
                indexOperation.setP491(zj_BASY_STD.getP491());
                //手术级别
                indexOperation.setP820(zj_BASY_STD.getP820());
                //手术/操作部位
                indexOperation.setP493(zj_BASY_STD.getP493());
                //手术持续时间
                indexOperation.setP494(String.valueOf(zj_BASY_STD.getP494()));
                //术者
                indexOperation.setP495(zj_BASY_STD.getP495());
                //Ⅰ助
                indexOperation.setP496(zj_BASY_STD.getP496());
                //Ⅱ助
                indexOperation.setP497(zj_BASY_STD.getP497());
                //麻醉方式
                indexOperation.setP498(zj_BASY_STD.getP498());
                //麻醉分级
                indexOperation.setP4981(zj_BASY_STD.getP4981());
                //切口愈合等级
                indexOperation.setP499(zj_BASY_STD.getP499());
                //麻醉医师
                indexOperation.setP4910(zj_BASY_STD.getP4910());
                //手术/操作编码
                indexOperation.setP490(zj_BASY_STD.getP490());
                //手术/操作名称
                indexOperation.setP492(zj_BASY_STD.getP492());
                indexOperationService.saveIndexOperation(indexOperation);


                if(zj_BASY_STD.getP492_ICD9_NAME1()!=null){
                    IndexOperationIcd indexOperationIcd =new IndexOperationIcd();

                    //标识患者身份唯一标识
                    indexOperationIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                    //唯一标识
                    indexOperationIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                    //医疗机构代码
                    indexOperationIcd.setP900(zj_BASY_STD.getP900());
                    //患者id
                    indexOperationIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                    //住院号
                    indexOperationIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                    indexOperationIcd.setOptId(indexOperation.getId());
                    //手术/操作编码
                    indexOperationIcd.setOptIcdcode(zj_BASY_STD.getP492_ICD9_ID1());
                    //手术/操作名称
                    indexOperationIcd.setOptIcddesc(zj_BASY_STD.getP492_ICD9_NAME1());
                    indexOperationIcdService.saveIndexOperationIcd(indexOperationIcd);


                }
                if(zj_BASY_STD.getP492_ICD9_NAME2()!=null){
                    IndexOperationIcd indexOperationIcd =new IndexOperationIcd();
                    //标识患者身份唯一标识
                    indexOperationIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                    //唯一标识
                    indexOperationIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                    //医疗机构代码
                    indexOperationIcd.setP900(zj_BASY_STD.getP900());
                    //患者id
                    indexOperationIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                    //住院号
                    indexOperationIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                    indexOperationIcd.setOptId(indexOperation.getId());
                    //手术/操作编码
                    indexOperationIcd.setOptIcdcode(zj_BASY_STD.getP492_ICD9_ID2());
                    //手术/操作名称
                    indexOperationIcd.setOptIcddesc(zj_BASY_STD.getP492_ICD9_NAME2());
                    indexOperationIcdService.saveIndexOperationIcd(indexOperationIcd);
                }


        }
        if (zj_BASY_STD.getP4911()!=null&&zj_BASY_STD.getP4913()!=null) {

                IndexOperation indexOperation = new IndexOperation();
                //标识患者身份唯一标识
                indexOperation.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexOperation.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexOperation.setP900(zj_BASY_STD.getP900());
                //患者id
                indexOperation.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexOperation.setVisitId(zj_BASY_STD.getVISIT_ID());
                //手术/操作日期
                indexOperation.setP491(zj_BASY_STD.getP4912());
                //手术级别
                indexOperation.setP820(zj_BASY_STD.getP821());
                //手术/操作部位
                indexOperation.setP493(zj_BASY_STD.getP4914());
                //手术持续时间
                indexOperation.setP494(String.valueOf(zj_BASY_STD.getP4915()));
                //术者
                indexOperation.setP495(zj_BASY_STD.getP4916());
                //Ⅰ助
                indexOperation.setP496(zj_BASY_STD.getP4917());
                //Ⅱ助
                indexOperation.setP497(zj_BASY_STD.getP4918());
                //麻醉方式
                indexOperation.setP498(zj_BASY_STD.getP4919());
                //麻醉分级
                indexOperation.setP4981(zj_BASY_STD.getP4982());
                //切口愈合等级
                indexOperation.setP499(zj_BASY_STD.getP4920());
                //麻醉医师
                indexOperation.setP4910(zj_BASY_STD.getP4921());
                //手术/操作编码
                indexOperation.setP490(zj_BASY_STD.getP4911());
                //手术/操作名称
                indexOperation.setP492(zj_BASY_STD.getP4913());
                indexOperationService.saveIndexOperation(indexOperation);

                if(zj_BASY_STD.getP4913_ICD9_NAME1()!=null){

                    IndexOperationIcd indexOperationIcd =new IndexOperationIcd();

                    //标识患者身份唯一标识
                    indexOperationIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                    //唯一标识
                    indexOperationIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                    //医疗机构代码
                    indexOperationIcd.setP900(zj_BASY_STD.getP900());
                    //患者id
                    indexOperationIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                    //住院号
                    indexOperationIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                    indexOperationIcd.setOptId(indexOperation.getId());
                    //手术/操作编码
                    indexOperationIcd.setOptIcdcode(zj_BASY_STD.getP4913_ICD9_ID1());
                    //手术/操作名称
                    indexOperationIcd.setOptIcddesc(zj_BASY_STD.getP4913_ICD9_NAME1());
                    indexOperationIcdService.saveIndexOperationIcd(indexOperationIcd);

                }
                if(zj_BASY_STD.getP4913_ICD9_NAME2()!=null){

                    IndexOperationIcd indexOperationIcd =new IndexOperationIcd();

                    //标识患者身份唯一标识
                    indexOperationIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                    //唯一标识
                    indexOperationIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                    //医疗机构代码
                    indexOperationIcd.setP900(zj_BASY_STD.getP900());
                    //患者id
                    indexOperationIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                    //住院号
                    indexOperationIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                    indexOperationIcd.setOptId(indexOperation.getId());
                    //手术/操作编码
                    indexOperationIcd.setOptIcdcode(zj_BASY_STD.getP4913_ICD9_ID2());
                    //手术/操作名称
                    indexOperationIcd.setOptIcddesc(zj_BASY_STD.getP4913_ICD9_NAME2());
                    indexOperationIcdService.saveIndexOperationIcd(indexOperationIcd);
                }


        }
        if (zj_BASY_STD.getP4922()!=null&&zj_BASY_STD.getP4924()!=null){
            IndexOperation indexOperation = new IndexOperation();
            //标识患者身份唯一标识
            indexOperation.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
            //唯一标识
            indexOperation.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
            //医疗机构代码
            indexOperation.setP900(zj_BASY_STD.getP900());
            //患者id
            indexOperation.setPatientId(zj_BASY_STD.getPATIENT_ID());
            //住院号
            indexOperation.setVisitId(zj_BASY_STD.getVISIT_ID());
            //手术/操作日期
            indexOperation.setP491(zj_BASY_STD.getP4923());
            //手术级别
            indexOperation.setP820(zj_BASY_STD.getP822());
            //手术/操作部位
            indexOperation.setP493(zj_BASY_STD.getP4925());
            //手术持续时间
            indexOperation.setP494(String.valueOf(zj_BASY_STD.getP4526()));
            //术者
            indexOperation.setP495(zj_BASY_STD.getP4527());
            //Ⅰ助
            indexOperation.setP496(zj_BASY_STD.getP4528());
            //Ⅱ助
            indexOperation.setP497(zj_BASY_STD.getP4529());
            //麻醉方式
            indexOperation.setP498(zj_BASY_STD.getP4530());
            //麻醉分级
            indexOperation.setP4981(zj_BASY_STD.getP4983());
            //切口愈合等级
            indexOperation.setP499(zj_BASY_STD.getP4531());
            //麻醉医师
            indexOperation.setP4910(zj_BASY_STD.getP4532());
            //手术/操作编码
            indexOperation.setP490(zj_BASY_STD.getP4922());
            //手术/操作名称
            indexOperation.setP492(zj_BASY_STD.getP4924());
            indexOperationService.saveIndexOperation(indexOperation);

            if (zj_BASY_STD.getP4924_ICD9_NAME1() != null) {

                IndexOperationIcd indexOperationIcd =new IndexOperationIcd();

                //标识患者身份唯一标识
                indexOperationIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexOperationIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexOperationIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexOperationIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexOperationIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                indexOperationIcd.setOptId(indexOperation.getId());
                //手术/操作编码
                indexOperationIcd.setOptIcdcode(zj_BASY_STD.getP4924_ICD9_ID1());
                //手术/操作名称
                indexOperationIcd.setOptIcddesc(zj_BASY_STD.getP4924_ICD9_NAME1());
                indexOperationIcdService.saveIndexOperationIcd(indexOperationIcd);
            }
            if (zj_BASY_STD.getP4924_ICD9_NAME2() != null) {
                IndexOperationIcd indexOperationIcd =new IndexOperationIcd();

                //标识患者身份唯一标识
                indexOperationIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexOperationIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexOperationIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexOperationIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexOperationIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                indexOperationIcd.setOptId(indexOperation.getId());
                //手术/操作编码
                indexOperationIcd.setOptIcdcode(zj_BASY_STD.getP4924_ICD9_ID2());
                //手术/操作名称
                indexOperationIcd.setOptIcddesc(zj_BASY_STD.getP4924_ICD9_NAME2());
                indexOperationIcdService.saveIndexOperationIcd(indexOperationIcd);
            }
        }
        if (zj_BASY_STD.getP4533()!=null&&zj_BASY_STD.getP4535()!=null){
            IndexOperation indexOperation = new IndexOperation();
            //标识患者身份唯一标识
            indexOperation.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
            //唯一标识
            indexOperation.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
            //医疗机构代码
            indexOperation.setP900(zj_BASY_STD.getP900());
            //患者id
            indexOperation.setPatientId(zj_BASY_STD.getPATIENT_ID());
            //住院号
            indexOperation.setVisitId(zj_BASY_STD.getVISIT_ID());
            //手术/操作日期
            indexOperation.setP491(zj_BASY_STD.getP4534());
            //手术级别
            indexOperation.setP820(zj_BASY_STD.getP823());
            //手术/操作部位
            indexOperation.setP493(zj_BASY_STD.getP4535());
            //手术持续时间
            indexOperation.setP494(String.valueOf(zj_BASY_STD.getP4537()));
            //术者
            indexOperation.setP495(zj_BASY_STD.getP4538());
            //Ⅰ助
            indexOperation.setP496(zj_BASY_STD.getP4539());
            //Ⅱ助
            indexOperation.setP497(zj_BASY_STD.getP4540());
            //麻醉方式
            indexOperation.setP498(zj_BASY_STD.getP4541());
            //麻醉分级
            indexOperation.setP4981(zj_BASY_STD.getP4984());
            //切口愈合等级
            indexOperation.setP499(zj_BASY_STD.getP4542());
            //麻醉医师
            indexOperation.setP4910(zj_BASY_STD.getP4543());
            //手术/操作编码
            indexOperation.setP490(zj_BASY_STD.getP4533());
            //手术/操作名称
            indexOperation.setP492(zj_BASY_STD.getP4535());
            indexOperationService.saveIndexOperation(indexOperation);

            if (zj_BASY_STD.getP4535_ICD9_NAME1() != null) {
                IndexOperationIcd indexOperationIcd =new IndexOperationIcd();

                //标识患者身份唯一标识
                indexOperationIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexOperationIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexOperationIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexOperationIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexOperationIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                indexOperationIcd.setOptId(indexOperation.getId());
                //手术/操作编码
                indexOperationIcd.setOptIcdcode(zj_BASY_STD.getP4535_ICD9_ID1());
                //手术/操作名称
                indexOperationIcd.setOptIcddesc(zj_BASY_STD.getP4535_ICD9_NAME1());
                indexOperationIcdService.saveIndexOperationIcd(indexOperationIcd);
            }
            if (zj_BASY_STD.getP4535_ICD9_NAME2() != null) {
                IndexOperationIcd indexOperationIcd =new IndexOperationIcd();
                //标识患者身份唯一标识
                indexOperationIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexOperationIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexOperationIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexOperationIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexOperationIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                indexOperationIcd.setOptId(indexOperation.getId());
                //手术/操作编码
                indexOperationIcd.setOptIcdcode(zj_BASY_STD.getP4535_ICD9_ID2());
                //手术/操作名称
                indexOperationIcd.setOptIcddesc(zj_BASY_STD.getP4535_ICD9_NAME2());
                indexOperationIcdService.saveIndexOperationIcd(indexOperationIcd);
            }
        }
        if (zj_BASY_STD.getP4544()!=null&&zj_BASY_STD.getP4546()!=null){
            IndexOperation indexOperation = new IndexOperation();
            //标识患者身份唯一标识
            indexOperation.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
            //唯一标识
            indexOperation.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
            //医疗机构代码
            indexOperation.setP900(zj_BASY_STD.getP900());
            //患者id
            indexOperation.setPatientId(zj_BASY_STD.getPATIENT_ID());
            //住院号
            indexOperation.setVisitId(zj_BASY_STD.getVISIT_ID());
            //手术/操作日期
            indexOperation.setP491(zj_BASY_STD.getP4545());
            //手术级别
            indexOperation.setP820(zj_BASY_STD.getP824());
            //手术/操作部位
            indexOperation.setP493(zj_BASY_STD.getP4547());
            //手术持续时间
            indexOperation.setP494(String.valueOf(zj_BASY_STD.getP4548()));
            //术者
            indexOperation.setP495(zj_BASY_STD.getP4549());
            //Ⅰ助
            indexOperation.setP496(zj_BASY_STD.getP4550());
            //Ⅱ助
            indexOperation.setP497(zj_BASY_STD.getP4551());
            //麻醉方式
            indexOperation.setP498(zj_BASY_STD.getP4552());
            //麻醉分级
            indexOperation.setP4981(zj_BASY_STD.getP4985());
            //切口愈合等级
            indexOperation.setP499(zj_BASY_STD.getP4553());
            //麻醉医师
            indexOperation.setP4910(zj_BASY_STD.getP4554());
            //手术/操作编码
            indexOperation.setP490(zj_BASY_STD.getP4544());
            //手术/操作名称
            indexOperation.setP492(zj_BASY_STD.getP4546());
            indexOperationService.saveIndexOperation(indexOperation);
            if (zj_BASY_STD.getP4546_ICD9_NAME1() != null) {
                IndexOperationIcd indexOperationIcd =new IndexOperationIcd();

                //标识患者身份唯一标识
                indexOperationIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexOperationIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexOperationIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexOperationIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexOperationIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                indexOperationIcd.setOptId(indexOperation.getId());
                //手术/操作编码
                indexOperationIcd.setOptIcdcode(zj_BASY_STD.getP4546_ICD9_ID1());
                //手术/操作名称
                indexOperationIcd.setOptIcddesc(zj_BASY_STD.getP4546_ICD9_NAME1());
                indexOperationIcdService.saveIndexOperationIcd(indexOperationIcd);

            }
            if( zj_BASY_STD.getP4546_ICD9_NAME2() != null) {
                IndexOperationIcd indexOperationIcd =new IndexOperationIcd();

                //标识患者身份唯一标识
                indexOperationIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexOperationIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexOperationIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexOperationIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexOperationIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                indexOperationIcd.setOptId(indexOperation.getId());
                //手术/操作编码
                indexOperationIcd.setOptIcdcode(zj_BASY_STD.getP4546_ICD9_ID2());
                //手术/操作名称
                indexOperationIcd.setOptIcddesc(zj_BASY_STD.getP4546_ICD9_NAME2());
                indexOperationIcdService.saveIndexOperationIcd(indexOperationIcd);
            }
        }
        if (zj_BASY_STD.getP45002()!=null&&zj_BASY_STD.getP45004()!=null){
            IndexOperation indexOperation = new IndexOperation();
            //标识患者身份唯一标识
            indexOperation.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
            //唯一标识
            indexOperation.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
            //医疗机构代码
            indexOperation.setP900(zj_BASY_STD.getP900());
            //患者id
            indexOperation.setPatientId(zj_BASY_STD.getPATIENT_ID());
            //住院号
            indexOperation.setVisitId(zj_BASY_STD.getVISIT_ID());
            //手术/操作日期
            indexOperation.setP491(zj_BASY_STD.getP45003());
            //手术级别
            indexOperation.setP820(zj_BASY_STD.getP825());
            //手术/操作部位
            indexOperation.setP493(zj_BASY_STD.getP45005());
            //手术持续时间
            indexOperation.setP494(String.valueOf(zj_BASY_STD.getP45006()));
            //术者
            indexOperation.setP495(zj_BASY_STD.getP45007());
            //Ⅰ助
            indexOperation.setP496(zj_BASY_STD.getP45008());
            //Ⅱ助
            indexOperation.setP497(zj_BASY_STD.getP45009());
            //麻醉方式
            indexOperation.setP498(zj_BASY_STD.getP45010());
            //麻醉分级
            indexOperation.setP4981(zj_BASY_STD.getP45011());
            //切口愈合等级
            indexOperation.setP499(zj_BASY_STD.getP45012());
            //麻醉医师
            indexOperation.setP4910(zj_BASY_STD.getP45013());
            //手术/操作编码
            indexOperation.setP490(zj_BASY_STD.getP45002());
            //手术/操作名称
            indexOperation.setP492(zj_BASY_STD.getP45004());
            indexOperationService.saveIndexOperation(indexOperation);

            if (zj_BASY_STD.getP45004_ICD9_NAME1() != null) {
                IndexOperationIcd indexOperationIcd =new IndexOperationIcd();

                //标识患者身份唯一标识
                indexOperationIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexOperationIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexOperationIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexOperationIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexOperationIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                indexOperationIcd.setOptId(indexOperation.getId());
                //手术/操作编码
                indexOperationIcd.setOptIcdcode(zj_BASY_STD.getP45004_ICD9_ID1());
                //手术/操作名称
                indexOperationIcd.setOptIcddesc(zj_BASY_STD.getP45004_ICD9_NAME1());
                indexOperationIcdService.saveIndexOperationIcd(indexOperationIcd);
            }
            if ( zj_BASY_STD.getP45004_ICD9_NAME2() != null) {
                IndexOperationIcd indexOperationIcd =new IndexOperationIcd();

                //标识患者身份唯一标识
                indexOperationIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexOperationIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexOperationIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexOperationIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexOperationIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                indexOperationIcd.setOptId(indexOperation.getId());
                //手术/操作编码
                indexOperationIcd.setOptIcdcode(zj_BASY_STD.getP45004_ICD9_ID2());
                //手术/操作名称
                indexOperationIcd.setOptIcddesc(zj_BASY_STD.getP45004_ICD9_NAME2());
                indexOperationIcdService.saveIndexOperationIcd(indexOperationIcd);
            }
        }
        if (zj_BASY_STD.getP45014()!=null&&zj_BASY_STD.getP45016()!=null){
            IndexOperation indexOperation = new IndexOperation();
            //标识患者身份唯一标识
            indexOperation.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
            //唯一标识
            indexOperation.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
            //医疗机构代码
            indexOperation.setP900(zj_BASY_STD.getP900());
            //患者id
            indexOperation.setPatientId(zj_BASY_STD.getPATIENT_ID());
            //住院号
            indexOperation.setVisitId(zj_BASY_STD.getVISIT_ID());
            //手术/操作日期
            indexOperation.setP491(zj_BASY_STD.getP45015());
            //手术级别
            indexOperation.setP820(zj_BASY_STD.getP826());
            //手术/操作部位
            indexOperation.setP493(zj_BASY_STD.getP45017());
            //手术持续时间
            indexOperation.setP494(String.valueOf(zj_BASY_STD.getP45018()));
            //术者
            indexOperation.setP495(zj_BASY_STD.getP45019());
            //Ⅰ助
            indexOperation.setP496(zj_BASY_STD.getP45020());
            //Ⅱ助
            indexOperation.setP497(zj_BASY_STD.getP45021());
            //麻醉方式
            indexOperation.setP498(zj_BASY_STD.getP45022());
            //麻醉分级
            indexOperation.setP4981(zj_BASY_STD.getP45023());
            //切口愈合等级
            indexOperation.setP499(zj_BASY_STD.getP45024());
            //麻醉医师
            indexOperation.setP4910(zj_BASY_STD.getP45025());

            //手术/操作编码
            indexOperation.setP490(zj_BASY_STD.getP45014());
            //手术/操作名称
            indexOperation.setP492(zj_BASY_STD.getP45016());
            indexOperationService.saveIndexOperation(indexOperation);
            if ( zj_BASY_STD.getP45016_ICD9_NAME1() != null) {
                IndexOperationIcd indexOperationIcd =new IndexOperationIcd();

                //标识患者身份唯一标识
                indexOperationIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexOperationIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexOperationIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexOperationIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexOperationIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                indexOperationIcd.setOptId(indexOperation.getId());
                //手术/操作编码
                indexOperationIcd.setOptIcdcode(zj_BASY_STD.getP45016_ICD9_ID1());
                //手术/操作名称
                indexOperationIcd.setOptIcddesc(zj_BASY_STD.getP45016_ICD9_NAME1());
                indexOperationIcdService.saveIndexOperationIcd(indexOperationIcd);
            }
            if (zj_BASY_STD.getP45016_ICD9_NAME2() != null) {
                IndexOperationIcd indexOperationIcd =new IndexOperationIcd();

                //标识患者身份唯一标识
                indexOperationIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexOperationIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexOperationIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexOperationIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexOperationIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                indexOperationIcd.setOptId(indexOperation.getId());
                //手术/操作编码
                indexOperationIcd.setOptIcdcode(zj_BASY_STD.getP45016_ICD9_ID2());
                //手术/操作名称
                indexOperationIcd.setOptIcddesc(zj_BASY_STD.getP45016_ICD9_NAME2());
                indexOperationIcdService.saveIndexOperationIcd(indexOperationIcd);
            }
        }
        if (zj_BASY_STD.getP45026()!=null&&zj_BASY_STD.getP45028()!=null){
            IndexOperation indexOperation = new IndexOperation();
            //标识患者身份唯一标识
            indexOperation.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
            //唯一标识
            indexOperation.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
            //医疗机构代码
            indexOperation.setP900(zj_BASY_STD.getP900());
            //患者id
            indexOperation.setPatientId(zj_BASY_STD.getPATIENT_ID());
            //住院号
            indexOperation.setVisitId(zj_BASY_STD.getVISIT_ID());
            //手术/操作编码
            indexOperation.setP490(zj_BASY_STD.getP45026());
            //手术/操作日期
            indexOperation.setP491(zj_BASY_STD.getP45027());
            //手术级别
            indexOperation.setP820(zj_BASY_STD.getP827());
            //手术/操作名称
            indexOperation.setP492(zj_BASY_STD.getP45028());
            //手术/操作部位
            indexOperation.setP493(zj_BASY_STD.getP45029());
            //手术持续时间
            indexOperation.setP494(String.valueOf(zj_BASY_STD.getP45030()));
            //术者
            indexOperation.setP495(zj_BASY_STD.getP45031());
            //Ⅰ助
            indexOperation.setP496(zj_BASY_STD.getP45032());
            //Ⅱ助
            indexOperation.setP497(zj_BASY_STD.getP45033());
            //麻醉方式
            indexOperation.setP498(zj_BASY_STD.getP45034());
            //麻醉分级
            indexOperation.setP4981(zj_BASY_STD.getP45035());
            //切口愈合等级
            indexOperation.setP499(zj_BASY_STD.getP45036());
            //麻醉医师
            indexOperation.setP4910(zj_BASY_STD.getP45037());
            //手术/操作编码
            indexOperation.setP490(zj_BASY_STD.getP45026());
            //手术/操作名称
            indexOperation.setP492(zj_BASY_STD.getP45028());
            indexOperationService.saveIndexOperation(indexOperation);

            if (zj_BASY_STD.getP45028_ICD9_NAME1() != null) {
                IndexOperationIcd indexOperationIcd =new IndexOperationIcd();

                //标识患者身份唯一标识
                indexOperationIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexOperationIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexOperationIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexOperationIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexOperationIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                indexOperationIcd.setOptId(indexOperation.getId());
                //手术/操作编码
                indexOperationIcd.setOptIcdcode(zj_BASY_STD.getP45028_ICD9_ID1());
                //手术/操作名称
                indexOperationIcd.setOptIcddesc(zj_BASY_STD.getP45028_ICD9_NAME1());
                indexOperationIcdService.saveIndexOperationIcd(indexOperationIcd);
            }
            if ( zj_BASY_STD.getP45028_ICD9_NAME2() != null) {
                IndexOperationIcd indexOperationIcd =new IndexOperationIcd();

                //标识患者身份唯一标识
                indexOperationIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexOperationIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexOperationIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexOperationIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexOperationIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                indexOperationIcd.setOptId(indexOperation.getId());
                //手术/操作编码
                indexOperationIcd.setOptIcdcode(zj_BASY_STD.getP45028_ICD9_ID2());
                //手术/操作名称
                indexOperationIcd.setOptIcddesc(zj_BASY_STD.getP45028_ICD9_NAME2());
                indexOperationIcdService.saveIndexOperationIcd(indexOperationIcd);
            }
        }
        if (zj_BASY_STD.getP45038()!=null&&zj_BASY_STD.getP45040()!=null){
            IndexOperation indexOperation = new IndexOperation();
            //标识患者身份唯一标识
            indexOperation.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
            //唯一标识
            indexOperation.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
            //医疗机构代码
            indexOperation.setP900(zj_BASY_STD.getP900());
            //患者id
            indexOperation.setPatientId(zj_BASY_STD.getPATIENT_ID());
            //住院号
            indexOperation.setVisitId(zj_BASY_STD.getVISIT_ID());
            //手术/操作日期
            indexOperation.setP491(zj_BASY_STD.getP45039());
            //手术级别
            indexOperation.setP820(zj_BASY_STD.getP828());
            //手术/操作部位
            indexOperation.setP493(zj_BASY_STD.getP45041());
            //手术持续时间
            indexOperation.setP494(String.valueOf(zj_BASY_STD.getP45042()));
            //术者
            indexOperation.setP495(zj_BASY_STD.getP45043());
            //Ⅰ助
            indexOperation.setP496(zj_BASY_STD.getP45044());
            //Ⅱ助
            indexOperation.setP497(zj_BASY_STD.getP45045());
            //麻醉方式
            indexOperation.setP498(zj_BASY_STD.getP45046());
            //麻醉分级
            indexOperation.setP4981(zj_BASY_STD.getP45047());
            //切口愈合等级
            indexOperation.setP499(zj_BASY_STD.getP45048());
            //麻醉医师
            indexOperation.setP4910(zj_BASY_STD.getP45049());
            //手术/操作编码
            indexOperation.setP490(zj_BASY_STD.getP45038());
            //手术/操作名称
            indexOperation.setP492(zj_BASY_STD.getP45040());
            indexOperationService.saveIndexOperation(indexOperation);
            if (zj_BASY_STD.getP45040_ICD9_NAME1() != null) {
                IndexOperationIcd indexOperationIcd =new IndexOperationIcd();

                //标识患者身份唯一标识
                indexOperationIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexOperationIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexOperationIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexOperationIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexOperationIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                indexOperationIcd.setOptId(indexOperation.getId());
                //手术/操作编码
                indexOperationIcd.setOptIcdcode(zj_BASY_STD.getP45040_ICD9_ID1());
                //手术/操作名称
                indexOperationIcd.setOptIcddesc(zj_BASY_STD.getP45040_ICD9_NAME1());
                indexOperationIcdService.saveIndexOperationIcd(indexOperationIcd);
            }
            if (zj_BASY_STD.getP45040_ICD9_NAME2() != null) {
                IndexOperationIcd indexOperationIcd =new IndexOperationIcd();

                //标识患者身份唯一标识
                indexOperationIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexOperationIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexOperationIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexOperationIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexOperationIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                indexOperationIcd.setOptId(indexOperation.getId());
                //手术/操作编码
                indexOperationIcd.setOptIcdcode(zj_BASY_STD.getP45040_ICD9_ID2());
                //手术/操作名称
                indexOperationIcd.setOptIcddesc(zj_BASY_STD.getP45040_ICD9_NAME2());
                indexOperationIcdService.saveIndexOperationIcd(indexOperationIcd);
            }
        }
        if (zj_BASY_STD.getP45050()!=null&&zj_BASY_STD.getP45052()!=null){
            IndexOperation indexOperation = new IndexOperation();
            //标识患者身份唯一标识
            indexOperation.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
            //唯一标识
            indexOperation.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
            //医疗机构代码
            indexOperation.setP900(zj_BASY_STD.getP900());
            //患者id
            indexOperation.setPatientId(zj_BASY_STD.getPATIENT_ID());
            //住院号
            indexOperation.setVisitId(zj_BASY_STD.getVISIT_ID());
            //手术/操作编码
            indexOperation.setP490(zj_BASY_STD.getP45050());
            //手术/操作日期
            indexOperation.setP491(zj_BASY_STD.getP45051());
            //手术级别
            indexOperation.setP820(zj_BASY_STD.getP829());
            //手术/操作名称
            indexOperation.setP492(zj_BASY_STD.getP45052());
            //手术/操作部位
            indexOperation.setP493(zj_BASY_STD.getP45053());
            //手术持续时间
            indexOperation.setP494(String.valueOf(zj_BASY_STD.getP45054()));
            //术者
            indexOperation.setP495(zj_BASY_STD.getP45055());
            //Ⅰ助
            indexOperation.setP496(zj_BASY_STD.getP45056());
            //Ⅱ助
            indexOperation.setP497(zj_BASY_STD.getP45057());
            //麻醉方式
            indexOperation.setP498(zj_BASY_STD.getP45058());
            //麻醉分级
            indexOperation.setP4981(zj_BASY_STD.getP45059());
            //切口愈合等级
            indexOperation.setP499(zj_BASY_STD.getP45060());
            //麻醉医师
            indexOperation.setP4910(zj_BASY_STD.getP45061());
            //手术/操作编码
            indexOperation.setP490(zj_BASY_STD.getP45050());
            //手术/操作名称
            indexOperation.setP492(zj_BASY_STD.getP45052());
            indexOperationService.saveIndexOperation(indexOperation);
            if (zj_BASY_STD.getP45052_ICD9_NAME1() != null) {
                IndexOperationIcd indexOperationIcd =new IndexOperationIcd();

                //标识患者身份唯一标识
                indexOperationIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexOperationIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexOperationIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexOperationIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexOperationIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                indexOperationIcd.setOptId(indexOperation.getId());
                //手术/操作编码
                indexOperationIcd.setOptIcdcode(zj_BASY_STD.getP45052_ICD9_ID1());
                //手术/操作名称
                indexOperationIcd.setOptIcddesc(zj_BASY_STD.getP45052_ICD9_NAME1());
                indexOperationIcdService.saveIndexOperationIcd(indexOperationIcd);
            }
            if ( zj_BASY_STD.getP45052_ICD9_NAME2() != null) {
                IndexOperationIcd indexOperationIcd =new IndexOperationIcd();

                //标识患者身份唯一标识
                indexOperationIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexOperationIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexOperationIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexOperationIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexOperationIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                indexOperationIcd.setOptId(indexOperation.getId());
                //手术/操作编码
                indexOperationIcd.setOptIcdcode(zj_BASY_STD.getP45052_ICD9_ID1());
                //手术/操作名称
                indexOperationIcd.setOptIcddesc(zj_BASY_STD.getP45052_ICD9_NAME1());
                indexOperationIcdService.saveIndexOperationIcd(indexOperationIcd);
            }
        }




      /*  //数据版本
        indexOperation.setDataVersion();
        //数据库来源
        indexOperation.setDataDbSource();
        //数据表来源
        indexOperation.setDataTableSource();
        //数据项来源
        indexOperation.setDataFieldSource();
        //创建时间
        indexOperation.setCreatedAt();
        //创建人
        indexOperation.setCreator();
        //修改时间
        indexOperation.setUpdatedAt();*/

    }
    public void saveIndexDiagnosisAdmit(BASY_DIAG_STD zj_BASY_STD,Date visitDate,Date diagnosisDate){

        if(zj_BASY_STD.getP30()!=null&&zj_BASY_STD.getP301()!=null){
            IndexDiagnosisAdmit indexDiagnosisAdmit = new IndexDiagnosisAdmit();
            //标识患者身份唯一标识
            indexDiagnosisAdmit.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
            //唯一标识
            indexDiagnosisAdmit.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
            //医疗机构代码
            indexDiagnosisAdmit.setP900(zj_BASY_STD.getP900());
            //患者id
            indexDiagnosisAdmit.setPatientId(zj_BASY_STD.getPATIENT_ID());
            //住院号
            indexDiagnosisAdmit.setVisitId(zj_BASY_STD.getVISIT_ID());
            //入院诊断编码
            indexDiagnosisAdmit.setP30(zj_BASY_STD.getP30());
            //入院诊断描述名称
            indexDiagnosisAdmit.setP301(zj_BASY_STD.getP301());
            indexDiagnosisAdmit.setVisitDate(visitDate);
            indexDiagnosisAdmit.setDiagnosisDate(diagnosisDate);
            indexDiagnosisAdmitService.saveIndexDiagnosisAdmit(indexDiagnosisAdmit);
            log.info("保存病案入院诊断"+zj_BASY_STD.getUNIQUE_ID_LV2()+"---"+zj_BASY_STD.getP301()+"--"+zj_BASY_STD.getP30());

            if(zj_BASY_STD.getP301_ICD10_NAME1()!=null&&zj_BASY_STD.getP301_ICD10_ID1()!=null&&!"".equals(zj_BASY_STD.getP301_ICD10_ID1())){
                IndexDiagnosisAdmitIcd indexDiagnosisAdmitIcd = new IndexDiagnosisAdmitIcd();
                //标识患者身份唯一标识
                indexDiagnosisAdmitIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisAdmitIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisAdmitIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisAdmitIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexDiagnosisAdmitIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                indexDiagnosisAdmitIcd.setAdmitId(indexDiagnosisAdmit.getId());
                //入院诊断编码
                indexDiagnosisAdmitIcd.setDiagnosisIcdcode(zj_BASY_STD.getP301_ICD10_ID1());
                //入院诊断描述名称
                indexDiagnosisAdmitIcd.setDiagnosisIcddesc(zj_BASY_STD.getP301_ICD10_NAME1());
                indexDiagnosisAdmitIcdService.saveIndexDiagnosisAdmitIcd(indexDiagnosisAdmitIcd);
            }
            if(zj_BASY_STD.getP301_ICD10_NAME2()!=null&&zj_BASY_STD.getP301_ICD10_ID2()!=null&&!"".equals(zj_BASY_STD.getP301_ICD10_ID2())){
                IndexDiagnosisAdmitIcd indexDiagnosisAdmitIcd = new IndexDiagnosisAdmitIcd();
                //标识患者身份唯一标识
                indexDiagnosisAdmitIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisAdmitIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisAdmitIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisAdmitIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexDiagnosisAdmitIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //入院诊断编码
                indexDiagnosisAdmitIcd.setAdmitId(indexDiagnosisAdmit.getId());
                //入院诊断编码
                indexDiagnosisAdmitIcd.setDiagnosisIcdcode(zj_BASY_STD.getP301_ICD10_ID2());
                //入院诊断描述名称
                indexDiagnosisAdmitIcd.setDiagnosisIcddesc(zj_BASY_STD.getP301_ICD10_NAME2());
                indexDiagnosisAdmitIcdService.saveIndexDiagnosisAdmitIcd(indexDiagnosisAdmitIcd);
            }
            if(zj_BASY_STD.getP301_ICD10_NAME3()!=null&&zj_BASY_STD.getP301_ICD10_ID3()!=null&&!"".equals(zj_BASY_STD.getP301_ICD10_ID3())){
                IndexDiagnosisAdmitIcd indexDiagnosisAdmitIcd = new IndexDiagnosisAdmitIcd();
                //标识患者身份唯一标识
                indexDiagnosisAdmitIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisAdmitIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisAdmitIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisAdmitIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexDiagnosisAdmitIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //入院诊断编码
                indexDiagnosisAdmitIcd.setAdmitId(indexDiagnosisAdmit.getId());
                //入院诊断编码
                indexDiagnosisAdmitIcd.setDiagnosisIcdcode(zj_BASY_STD.getP301_ICD10_ID3());
                //入院诊断描述名称
                indexDiagnosisAdmitIcd.setDiagnosisIcddesc(zj_BASY_STD.getP301_ICD10_NAME3());
                indexDiagnosisAdmitIcdService.saveIndexDiagnosisAdmitIcd(indexDiagnosisAdmitIcd);
            }
            if(zj_BASY_STD.getP301_ICD10_NAME4()!=null&&zj_BASY_STD.getP301_ICD10_ID4()!=null&&!"".equals(zj_BASY_STD.getP301_ICD10_ID4())){
                IndexDiagnosisAdmitIcd indexDiagnosisAdmitIcd = new IndexDiagnosisAdmitIcd();
                //标识患者身份唯一标识
                indexDiagnosisAdmitIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisAdmitIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisAdmitIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisAdmitIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexDiagnosisAdmitIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //入院诊断编码
                indexDiagnosisAdmitIcd.setAdmitId(indexDiagnosisAdmit.getId());
                //入院诊断编码
                indexDiagnosisAdmitIcd.setDiagnosisIcdcode(zj_BASY_STD.getP301_ICD10_ID4());
                //入院诊断描述名称
                indexDiagnosisAdmitIcd.setDiagnosisIcddesc(zj_BASY_STD.getP301_ICD10_NAME4());
                indexDiagnosisAdmitIcdService.saveIndexDiagnosisAdmitIcd(indexDiagnosisAdmitIcd);
            }
            if(zj_BASY_STD.getP301_ICD10_NAME5()!=null&&zj_BASY_STD.getP301_ICD10_ID5()!=null&&!"".equals(zj_BASY_STD.getP301_ICD10_ID5())){
                IndexDiagnosisAdmitIcd indexDiagnosisAdmitIcd = new IndexDiagnosisAdmitIcd();
                //标识患者身份唯一标识
                indexDiagnosisAdmitIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisAdmitIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisAdmitIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisAdmitIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexDiagnosisAdmitIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //入院诊断编码
                indexDiagnosisAdmitIcd.setAdmitId(indexDiagnosisAdmit.getId());
                //入院诊断编码
                indexDiagnosisAdmitIcd.setDiagnosisIcdcode(zj_BASY_STD.getP301_ICD10_ID5());
                //入院诊断描述名称
                indexDiagnosisAdmitIcd.setDiagnosisIcddesc(zj_BASY_STD.getP301_ICD10_NAME5());
                indexDiagnosisAdmitIcdService.saveIndexDiagnosisAdmitIcd(indexDiagnosisAdmitIcd);
            }


        }


     /*   //数据版本
        indexDiagnsisAdmit.setDataVersion();
        //数据库来源
        indexDiagnsisAdmit.setDataDbSource();
        //数据表来源
        indexDiagnsisAdmit.setDataTableSource();
        //数据项来源
        indexDiagnsisAdmit.setDataFieldSource();
        //创建时间
        indexDiagnsisAdmit.setCreatedAt();
        //创建人
        indexDiagnsisAdmit.setCreator();
        //修改时间
        indexDiagnsisAdmit.setUpdatedAt();*/

    }
    public void saveIndexDiagnosisClinic(BASY_DIAG_STD zj_BASY_STD,Date visitDate,Date diagnosisDate){
        log.info("保存病案首页门诊诊断："+zj_BASY_STD.getUNIQUE_ID()+"---"+zj_BASY_STD.getP281_ICD10_ID1()+"------"+zj_BASY_STD.getP281_ICD10_NAME1());
        if(zj_BASY_STD.getP28()!=null&&zj_BASY_STD.getP281()!=null){

            IndexDiagnosisClinic indexDiagnosisClinic = new IndexDiagnosisClinic();
            //标识患者身份唯一标识
            indexDiagnosisClinic.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
            //唯一标识
            indexDiagnosisClinic.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
            //医疗机构代码
            indexDiagnosisClinic.setP900(zj_BASY_STD.getP900());
            //患者id
            indexDiagnosisClinic.setPatientId(zj_BASY_STD.getPATIENT_ID());
            //住院号
            indexDiagnosisClinic.setVisitId(zj_BASY_STD.getVISIT_ID());
            //门诊诊断编码
            indexDiagnosisClinic.setP28(zj_BASY_STD.getP28());
            //门诊诊断名称
            indexDiagnosisClinic.setP281(zj_BASY_STD.getP28());
            indexDiagnosisClinic.setVisitDate(visitDate);
            indexDiagnosisClinic.setDiagnosisDate(diagnosisDate);
            indexDiagnosisClinicService.saveIndexDiagnosisClinic(indexDiagnosisClinic);

            if(zj_BASY_STD.getP281_ICD10_NAME1()!=null&&zj_BASY_STD.getP281_ICD10_ID1()!=null&&!"".equals(zj_BASY_STD.getP281_ICD10_ID1())){
                IndexDiagnosisClinicIcd indexDiagnosisClinicIcd = new IndexDiagnosisClinicIcd();
                //标识患者身份唯一标识
                indexDiagnosisClinicIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisClinicIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisClinicIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisClinicIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexDiagnosisClinicIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                indexDiagnosisClinicIcd.setClinicId(indexDiagnosisClinic.getId());
                //门诊诊断编码
                indexDiagnosisClinicIcd.setDiagnosisIcdcode(zj_BASY_STD.getP281_ICD10_ID1());
                //门诊诊断名称
                indexDiagnosisClinicIcd.setDiagnosisIcddesc(zj_BASY_STD.getP281_ICD10_NAME1());
                indexDiagnosisClinicIcdService.saveIndexDiagnosisClinicIcd(indexDiagnosisClinicIcd);

            }
            if(zj_BASY_STD.getP281_ICD10_NAME2()!=null&&zj_BASY_STD.getP281_ICD10_ID2()!=null&&!"".equals(zj_BASY_STD.getP281_ICD10_ID2())){
                IndexDiagnosisClinicIcd indexDiagnosisClinicIcd = new IndexDiagnosisClinicIcd();
                //标识患者身份唯一标识
                indexDiagnosisClinicIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisClinicIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisClinicIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisClinicIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexDiagnosisClinicIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                indexDiagnosisClinicIcd.setClinicId(indexDiagnosisClinic.getId());
                //门诊诊断编码
                indexDiagnosisClinicIcd.setDiagnosisIcdcode(zj_BASY_STD.getP281_ICD10_ID2());
                //门诊诊断名称
                indexDiagnosisClinicIcd.setDiagnosisIcddesc(zj_BASY_STD.getP281_ICD10_NAME2());
                indexDiagnosisClinicIcdService.saveIndexDiagnosisClinicIcd(indexDiagnosisClinicIcd);
            }
            if(zj_BASY_STD.getP281_ICD10_NAME3()!=null&&zj_BASY_STD.getP281_ICD10_ID3()!=null&&!"".equals(zj_BASY_STD.getP281_ICD10_ID3())){
                IndexDiagnosisClinicIcd indexDiagnosisClinicIcd = new IndexDiagnosisClinicIcd();
                //标识患者身份唯一标识
                indexDiagnosisClinicIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisClinicIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisClinicIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisClinicIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexDiagnosisClinicIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                indexDiagnosisClinicIcd.setClinicId(indexDiagnosisClinic.getId());
                //门诊诊断编码
                indexDiagnosisClinicIcd.setDiagnosisIcdcode(zj_BASY_STD.getP281_ICD10_ID3());
                //门诊诊断名称
                indexDiagnosisClinicIcd.setDiagnosisIcddesc(zj_BASY_STD.getP281_ICD10_NAME3());
                indexDiagnosisClinicIcdService.saveIndexDiagnosisClinicIcd(indexDiagnosisClinicIcd);
            }
            if(zj_BASY_STD.getP281_ICD10_NAME4()!=null&&zj_BASY_STD.getP281_ICD10_ID4()!=null&&!"".equals(zj_BASY_STD.getP281_ICD10_ID4())){
                IndexDiagnosisClinicIcd indexDiagnosisClinicIcd = new IndexDiagnosisClinicIcd();
                //标识患者身份唯一标识
                indexDiagnosisClinicIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisClinicIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisClinicIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisClinicIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexDiagnosisClinicIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                indexDiagnosisClinicIcd.setClinicId(indexDiagnosisClinic.getId());
                //门诊诊断编码
                indexDiagnosisClinicIcd.setDiagnosisIcdcode(zj_BASY_STD.getP281_ICD10_ID4());
                //门诊诊断名称
                indexDiagnosisClinicIcd.setDiagnosisIcddesc(zj_BASY_STD.getP281_ICD10_NAME4());
                indexDiagnosisClinicIcdService.saveIndexDiagnosisClinicIcd(indexDiagnosisClinicIcd);
            }
            if(zj_BASY_STD.getP281_ICD10_NAME5()!=null&&zj_BASY_STD.getP281_ICD10_ID5()!=null&&!"".equals(zj_BASY_STD.getP281_ICD10_ID5())){
                IndexDiagnosisClinicIcd indexDiagnosisClinicIcd = new IndexDiagnosisClinicIcd();
                //标识患者身份唯一标识
                indexDiagnosisClinicIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisClinicIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisClinicIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisClinicIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexDiagnosisClinicIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                indexDiagnosisClinicIcd.setClinicId(indexDiagnosisClinic.getId());
                //门诊诊断编码
                indexDiagnosisClinicIcd.setDiagnosisIcdcode(zj_BASY_STD.getP281_ICD10_ID5());
                //门诊诊断名称
                indexDiagnosisClinicIcd.setDiagnosisIcddesc(zj_BASY_STD.getP281_ICD10_NAME5());
                indexDiagnosisClinicIcdService.saveIndexDiagnosisClinicIcd(indexDiagnosisClinicIcd);
            }

        }




/*
        //数据版本
        indexDiagnosisClinic.setDataVersion();
        //数据库来源
        indexDiagnosisClinic.setDataDbSource();
        //数据表来源
        indexDiagnosisClinic.setDataTableSource();
        //数据项来源
        indexDiagnosisClinic.setDataFieldSource();
        //创建时间
        indexDiagnosisClinic.setCreatedAt();
        //创建人
        indexDiagnosisClinic.setCreator();
        //修改时间
        indexDiagnosisClinic.setUpdatedAt();*/
    }
    public void saveIndexDiagnosisMain(BASY_DIAG_STD zj_BASY_STD,Date visitDate,Date diagnosisDate){
        log.info("保存病案首页主要诊断："+zj_BASY_STD.getUNIQUE_ID());

        if(zj_BASY_STD.getP321()!=null&&zj_BASY_STD.getP322()!=null){
            IndexDiagnosisMain indexDiagnosisMain = new IndexDiagnosisMain();
            //标识患者身份唯一标识
            indexDiagnosisMain.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
            //唯一标识
            indexDiagnosisMain.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
            //医疗机构代码
            indexDiagnosisMain.setP900(zj_BASY_STD.getP900());
            //患者id
            indexDiagnosisMain.setPatientId(zj_BASY_STD.getPATIENT_ID());
            //住院号
            indexDiagnosisMain.setVisitId(zj_BASY_STD.getVISIT_ID());
            //主要诊断入院病情
            indexDiagnosisMain.setP805(zj_BASY_STD.getP805());
            //主要诊断出院情况
            indexDiagnosisMain.setP323(zj_BASY_STD.getP323());
            //主要诊断编码
            indexDiagnosisMain.setP321(zj_BASY_STD.getP321());
            //主要诊断疾病描述
            indexDiagnosisMain.setP322(zj_BASY_STD.getP322());
            indexDiagnosisMain.setVisitDate(visitDate);
            indexDiagnosisMain.setDiagnosisDate(diagnosisDate);
            indexDiagnosisMainService.saveIndexDiagnosisMain(indexDiagnosisMain);


            if(zj_BASY_STD.getP322_ICD10_NAME1()!=null&&zj_BASY_STD.getP322_ICD10_ID1()!=null&&!"".equals(zj_BASY_STD.getP322_ICD10_ID1())){
                IndexDiagnosisMainIcd indexDiagnosisMainIcd = new IndexDiagnosisMainIcd();
                //标识患者身份唯一标识
                indexDiagnosisMainIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisMainIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisMainIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisMainIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexDiagnosisMainIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                indexDiagnosisMainIcd.setMainId(indexDiagnosisMain.getId());
                //主要诊断编码
                indexDiagnosisMainIcd.setDiagnosisIcdcode(zj_BASY_STD.getP322_ICD10_ID1());
                //主要诊断疾病描述
                indexDiagnosisMainIcd.setDiagnosisIcddesc(zj_BASY_STD.getP322_ICD10_NAME1());
                indexDiagnosisMainIcdService.saveIndexDiagnosisMainIcd(indexDiagnosisMainIcd);
            }
            if(zj_BASY_STD.getP322_ICD10_NAME2()!=null&&zj_BASY_STD.getP322_ICD10_ID2()!=null&&!"".equals(zj_BASY_STD.getP322_ICD10_ID2())){
                IndexDiagnosisMainIcd indexDiagnosisMainIcd = new IndexDiagnosisMainIcd();
                //标识患者身份唯一标识
                indexDiagnosisMainIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisMainIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisMainIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisMainIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexDiagnosisMainIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                indexDiagnosisMainIcd.setMainId(indexDiagnosisMain.getId());
                //主要诊断编码
                indexDiagnosisMainIcd.setDiagnosisIcdcode(zj_BASY_STD.getP322_ICD10_ID2());
                //主要诊断疾病描述
                indexDiagnosisMainIcd.setDiagnosisIcddesc(zj_BASY_STD.getP322_ICD10_NAME2());
                indexDiagnosisMainIcdService.saveIndexDiagnosisMainIcd(indexDiagnosisMainIcd);
            }
            if(zj_BASY_STD.getP322_ICD10_NAME3()!=null&&zj_BASY_STD.getP322_ICD10_ID3()!=null&&!"".equals(zj_BASY_STD.getP322_ICD10_ID3())){
                IndexDiagnosisMainIcd indexDiagnosisMainIcd = new IndexDiagnosisMainIcd();
                //标识患者身份唯一标识
                indexDiagnosisMainIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisMainIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisMainIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisMainIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexDiagnosisMainIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                indexDiagnosisMainIcd.setMainId(indexDiagnosisMain.getId());
                //主要诊断编码
                indexDiagnosisMainIcd.setDiagnosisIcdcode(zj_BASY_STD.getP322_ICD10_ID3());
                //主要诊断疾病描述
                indexDiagnosisMainIcd.setDiagnosisIcddesc(zj_BASY_STD.getP322_ICD10_NAME3());
                indexDiagnosisMainIcdService.saveIndexDiagnosisMainIcd(indexDiagnosisMainIcd);
            }
            if(zj_BASY_STD.getP322_ICD10_NAME4()!=null&&zj_BASY_STD.getP322_ICD10_ID4()!=null&&!"".equals(zj_BASY_STD.getP322_ICD10_ID4())){
                IndexDiagnosisMainIcd indexDiagnosisMainIcd = new IndexDiagnosisMainIcd();
                //标识患者身份唯一标识
                indexDiagnosisMainIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisMainIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisMainIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisMainIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexDiagnosisMainIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                indexDiagnosisMainIcd.setMainId(indexDiagnosisMain.getId());
                //主要诊断编码
                indexDiagnosisMainIcd.setDiagnosisIcdcode(zj_BASY_STD.getP322_ICD10_ID4());
                //主要诊断疾病描述
                indexDiagnosisMainIcd.setDiagnosisIcddesc(zj_BASY_STD.getP322_ICD10_NAME4());
                indexDiagnosisMainIcdService.saveIndexDiagnosisMainIcd(indexDiagnosisMainIcd);
            }
            if(zj_BASY_STD.getP322_ICD10_NAME5()!=null&&zj_BASY_STD.getP322_ICD10_ID5()!=null&&!"".equals(zj_BASY_STD.getP322_ICD10_ID5())){
                IndexDiagnosisMainIcd indexDiagnosisMainIcd = new IndexDiagnosisMainIcd();
                //标识患者身份唯一标识
                indexDiagnosisMainIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisMainIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisMainIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisMainIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexDiagnosisMainIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                indexDiagnosisMainIcd.setMainId(indexDiagnosisMain.getId());
                //主要诊断编码
                indexDiagnosisMainIcd.setDiagnosisIcdcode(zj_BASY_STD.getP322_ICD10_ID5());
                //主要诊断疾病描述
                indexDiagnosisMainIcd.setDiagnosisIcddesc(zj_BASY_STD.getP322_ICD10_NAME5());
                indexDiagnosisMainIcdService.saveIndexDiagnosisMainIcd(indexDiagnosisMainIcd);
            }




        }


     /*   //数据版本
        indexDiagnosisMain.setDataVersion();
        //数据库来源
        indexDiagnosisMain.setDataDbSource();
        //数据表来源
        indexDiagnosisMain.setDataTableSource();
        //数据项来源
        indexDiagnosisMain.setDataFieldSource();
        //创建时间
        indexDiagnosisMain.setCreatedAt();
        //创建人
        indexDiagnosisMain.setCreator();
        //修改时间
        indexDiagnosisMain.setUpdatedAt();*/
    }
    public void saveIndexDiagnosisOther(BASY_DIAG_STD zj_BASY_STD,Date visitDate,Date diagnosisDate){
        log.info("保存病案首页其他诊断："+zj_BASY_STD.getUNIQUE_ID());

        if(zj_BASY_STD.getP324()!=null&&zj_BASY_STD.getP325()!=null){

            IndexDiagnosisOther indexDiagnosisOther = new IndexDiagnosisOther();
            //标识患者身份唯一标识
            indexDiagnosisOther.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
            //唯一标识
            indexDiagnosisOther.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
            //医疗机构代码
            indexDiagnosisOther.setP900(zj_BASY_STD.getP900());
            //患者id
            indexDiagnosisOther.setPatientId(zj_BASY_STD.getPATIENT_ID());
            //住院号
            indexDiagnosisOther.setVisitId(zj_BASY_STD.getVISIT_ID());
            //诊断编码
            indexDiagnosisOther.setP324(zj_BASY_STD.getP324());
            //诊断疾病描述
            indexDiagnosisOther.setP325(zj_BASY_STD.getP325());
            //诊断入院病情
            indexDiagnosisOther.setP806(zj_BASY_STD.getP806());
            //诊断出院情况
            indexDiagnosisOther.setP326(zj_BASY_STD.getP326());
            indexDiagnosisOther.setVisitDate(visitDate);
            indexDiagnosisOther.setDiagnosisDate(diagnosisDate);
            indexDiagnosisOtherService.saveIndexDiagnosisOther(indexDiagnosisOther);


            if(zj_BASY_STD.getP325_ICD10_NAME1()!=null&&zj_BASY_STD.getP325_ICD10_ID1()!=null&&!"".equals(zj_BASY_STD.getP325_ICD10_ID1())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP325_ICD10_ID1());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP325_ICD10_NAME1());

                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP325_ICD10_NAME2()!=null&&zj_BASY_STD.getP325_ICD10_ID2()!=null&&!"".equals(zj_BASY_STD.getP325_ICD10_ID2())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP325_ICD10_ID2());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP325_ICD10_NAME2());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP325_ICD10_NAME3()!=null&&zj_BASY_STD.getP325_ICD10_ID3()!=null&&!"".equals(zj_BASY_STD.getP325_ICD10_ID3())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP325_ICD10_ID3());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP325_ICD10_NAME3());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP325_ICD10_NAME4()!=null&&zj_BASY_STD.getP325_ICD10_ID4()!=null&&!"".equals(zj_BASY_STD.getP325_ICD10_ID4())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP325_ICD10_ID4());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP325_ICD10_NAME4());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP325_ICD10_NAME5()!=null&&zj_BASY_STD.getP325_ICD10_ID5()!=null&&!"".equals(zj_BASY_STD.getP325_ICD10_ID5())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP325_ICD10_ID5());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP325_ICD10_NAME5());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }


        }
        if(zj_BASY_STD.getP327()!=null&&zj_BASY_STD.getP328()!=null){

            IndexDiagnosisOther indexDiagnosisOther = new IndexDiagnosisOther();
            //标识患者身份唯一标识
            indexDiagnosisOther.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
            //唯一标识
            indexDiagnosisOther.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
            //医疗机构代码
            indexDiagnosisOther.setP900(zj_BASY_STD.getP900());
            //患者id
            indexDiagnosisOther.setPatientId(zj_BASY_STD.getPATIENT_ID());
            //住院号
            indexDiagnosisOther.setVisitId(zj_BASY_STD.getVISIT_ID());
            //诊断编码
            indexDiagnosisOther.setP324(zj_BASY_STD.getP327());
            //诊断疾病描述
            indexDiagnosisOther.setP325(zj_BASY_STD.getP328());
            //诊断入院病情
            indexDiagnosisOther.setP806(zj_BASY_STD.getP807());
            //诊断出院情况
            indexDiagnosisOther.setP326(zj_BASY_STD.getP329());
            indexDiagnosisOther.setVisitDate(visitDate);
            indexDiagnosisOther.setDiagnosisDate(diagnosisDate);
            indexDiagnosisOtherService.saveIndexDiagnosisOther(indexDiagnosisOther);

            if(zj_BASY_STD.getP328_ICD10_NAME1()!=null&&zj_BASY_STD.getP328_ICD10_ID1()!=null&&!"".equals(zj_BASY_STD.getP328_ICD10_ID1())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP328_ICD10_ID1());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP328_ICD10_NAME1());

                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP328_ICD10_NAME2()!=null&&zj_BASY_STD.getP328_ICD10_ID2()!=null&&!"".equals(zj_BASY_STD.getP328_ICD10_ID2())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP328_ICD10_ID2());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP328_ICD10_NAME2());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP328_ICD10_NAME3()!=null&&zj_BASY_STD.getP328_ICD10_ID3()!=null&&!"".equals(zj_BASY_STD.getP328_ICD10_ID3())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP328_ICD10_ID3());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP328_ICD10_NAME3());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP328_ICD10_NAME4()!=null&&zj_BASY_STD.getP328_ICD10_ID4()!=null&&!"".equals(zj_BASY_STD.getP328_ICD10_ID4())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP328_ICD10_ID4());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP328_ICD10_NAME4());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP328_ICD10_NAME5()!=null&&zj_BASY_STD.getP328_ICD10_ID5()!=null&&!"".equals(zj_BASY_STD.getP328_ICD10_ID5())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP328_ICD10_ID5());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP328_ICD10_NAME5());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }

        }
        if(zj_BASY_STD.getP3291()!=null&&zj_BASY_STD.getP3292()!=null){

            IndexDiagnosisOther indexDiagnosisOther = new IndexDiagnosisOther();
            //标识患者身份唯一标识
            indexDiagnosisOther.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
            //唯一标识
            indexDiagnosisOther.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
            //医疗机构代码
            indexDiagnosisOther.setP900(zj_BASY_STD.getP900());
            //患者id
            indexDiagnosisOther.setPatientId(zj_BASY_STD.getPATIENT_ID());
            //住院号
            indexDiagnosisOther.setVisitId(zj_BASY_STD.getVISIT_ID());
            //诊断编码
            indexDiagnosisOther.setP324(zj_BASY_STD.getP3291());
            //诊断疾病描述
            indexDiagnosisOther.setP325(zj_BASY_STD.getP3292());
            //诊断入院病情
            indexDiagnosisOther.setP806(zj_BASY_STD.getP808());
            //诊断出院情况
            indexDiagnosisOther.setP326(zj_BASY_STD.getP3293());
            indexDiagnosisOther.setVisitDate(visitDate);
            indexDiagnosisOther.setDiagnosisDate(diagnosisDate);
            indexDiagnosisOtherService.saveIndexDiagnosisOther(indexDiagnosisOther);



            if(zj_BASY_STD.getP3292_ICD10_NAME1()!=null&&zj_BASY_STD.getP3292_ICD10_ID1()!=null&&!"".equals(zj_BASY_STD.getP3292_ICD10_ID1())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3292_ICD10_ID1());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3292_ICD10_NAME1());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3292_ICD10_NAME2()!=null&&zj_BASY_STD.getP3292_ICD10_ID2()!=null&&!"".equals(zj_BASY_STD.getP3292_ICD10_ID2())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3292_ICD10_ID2());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3292_ICD10_NAME2());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3292_ICD10_NAME3()!=null&&zj_BASY_STD.getP3292_ICD10_ID3()!=null&&!"".equals(zj_BASY_STD.getP3292_ICD10_ID3())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3292_ICD10_ID3());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3292_ICD10_NAME3());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3292_ICD10_NAME4()!=null&&zj_BASY_STD.getP3292_ICD10_ID4()!=null&&!"".equals(zj_BASY_STD.getP3292_ICD10_ID4())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3292_ICD10_ID4());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3292_ICD10_NAME4());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3292_ICD10_NAME5()!=null&&zj_BASY_STD.getP3292_ICD10_ID5()!=null&&!"".equals(zj_BASY_STD.getP3292_ICD10_ID5())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3292_ICD10_ID5());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3292_ICD10_NAME5());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }

        }
        if(zj_BASY_STD.getP3294()!=null&&zj_BASY_STD.getP3295()!=null){

            IndexDiagnosisOther indexDiagnosisOther = new IndexDiagnosisOther();
            //标识患者身份唯一标识
            indexDiagnosisOther.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
            //唯一标识
            indexDiagnosisOther.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
            //医疗机构代码
            indexDiagnosisOther.setP900(zj_BASY_STD.getP900());
            //患者id
            indexDiagnosisOther.setPatientId(zj_BASY_STD.getPATIENT_ID());
            //住院号
            indexDiagnosisOther.setVisitId(zj_BASY_STD.getVISIT_ID());
            //诊断编码
            indexDiagnosisOther.setP324(zj_BASY_STD.getP3294());
            //诊断疾病描述
            indexDiagnosisOther.setP325(zj_BASY_STD.getP3295());
            //诊断入院病情
            indexDiagnosisOther.setP806(zj_BASY_STD.getP809());
            //诊断出院情况
            indexDiagnosisOther.setP326(zj_BASY_STD.getP3296());
            indexDiagnosisOther.setVisitDate(visitDate);
            indexDiagnosisOther.setDiagnosisDate(diagnosisDate);
            indexDiagnosisOtherService.saveIndexDiagnosisOther(indexDiagnosisOther);

            if(zj_BASY_STD.getP3295_ICD10_NAME1()!=null&&zj_BASY_STD.getP3295_ICD10_ID1()!=null&&!"".equals(zj_BASY_STD.getP3295_ICD10_ID1())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3295_ICD10_ID1());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3295_ICD10_NAME1());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3295_ICD10_NAME2()!=null&&zj_BASY_STD.getP3295_ICD10_ID2()!=null&&!"".equals(zj_BASY_STD.getP3295_ICD10_ID2())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3295_ICD10_ID2());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3295_ICD10_NAME2());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3295_ICD10_NAME3()!=null&&zj_BASY_STD.getP3295_ICD10_ID3()!=null&&!"".equals(zj_BASY_STD.getP3295_ICD10_ID3())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3295_ICD10_ID3());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3295_ICD10_NAME3());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3295_ICD10_NAME4()!=null&&zj_BASY_STD.getP3295_ICD10_ID4()!=null&&!"".equals(zj_BASY_STD.getP3295_ICD10_ID4())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3295_ICD10_ID4());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3295_ICD10_NAME4());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3295_ICD10_NAME5()!=null&&zj_BASY_STD.getP3295_ICD10_ID5()!=null&&!"".equals(zj_BASY_STD.getP3295_ICD10_ID5())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3295_ICD10_ID5());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3295_ICD10_NAME5());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
        }
        if(zj_BASY_STD.getP3297()!=null&&zj_BASY_STD.getP3298()!=null){

            IndexDiagnosisOther indexDiagnosisOther = new IndexDiagnosisOther();
            //标识患者身份唯一标识
            indexDiagnosisOther.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
            //唯一标识
            indexDiagnosisOther.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
            //医疗机构代码
            indexDiagnosisOther.setP900(zj_BASY_STD.getP900());
            //患者id
            indexDiagnosisOther.setPatientId(zj_BASY_STD.getPATIENT_ID());
            //住院号
            indexDiagnosisOther.setVisitId(zj_BASY_STD.getVISIT_ID());
            //诊断编码
            indexDiagnosisOther.setP324(zj_BASY_STD.getP3297());
            //诊断疾病描述
            indexDiagnosisOther.setP325(zj_BASY_STD.getP3298());
            //诊断入院病情
            indexDiagnosisOther.setP806(zj_BASY_STD.getP810());
            //诊断出院情况
            indexDiagnosisOther.setP326(zj_BASY_STD.getP3299());
            indexDiagnosisOther.setVisitDate(visitDate);
            indexDiagnosisOther.setDiagnosisDate(diagnosisDate);
            indexDiagnosisOtherService.saveIndexDiagnosisOther(indexDiagnosisOther);


            if(zj_BASY_STD.getP3298_ICD10_NAME1()!=null&&zj_BASY_STD.getP3298_ICD10_ID1()!=null&&!"".equals(zj_BASY_STD.getP3298_ICD10_ID1())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3298_ICD10_ID1());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3298_ICD10_NAME1());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3298_ICD10_NAME2()!=null&&zj_BASY_STD.getP3298_ICD10_ID2()!=null&&!"".equals(zj_BASY_STD.getP3298_ICD10_ID2())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3298_ICD10_ID2());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3298_ICD10_NAME2());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3298_ICD10_NAME3()!=null&&zj_BASY_STD.getP3298_ICD10_ID3()!=null&&!"".equals(zj_BASY_STD.getP3298_ICD10_ID3())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3298_ICD10_ID3());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3298_ICD10_NAME3());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3298_ICD10_NAME4()!=null&&zj_BASY_STD.getP3298_ICD10_ID4()!=null&&!"".equals(zj_BASY_STD.getP3298_ICD10_ID4())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3298_ICD10_ID4());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3298_ICD10_NAME4());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3298_ICD10_NAME5()!=null&&zj_BASY_STD.getP3298_ICD10_ID5()!=null&&!"".equals(zj_BASY_STD.getP3298_ICD10_ID5())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3298_ICD10_ID5());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3298_ICD10_NAME5());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }


        }
        if(zj_BASY_STD.getP3281()!=null&&zj_BASY_STD.getP3282()!=null){
            IndexDiagnosisOther indexDiagnosisOther = new IndexDiagnosisOther();
            //标识患者身份唯一标识
            indexDiagnosisOther.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
            //唯一标识
            indexDiagnosisOther.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
            //医疗机构代码
            indexDiagnosisOther.setP900(zj_BASY_STD.getP900());
            //患者id
            indexDiagnosisOther.setPatientId(zj_BASY_STD.getPATIENT_ID());
            //住院号
            indexDiagnosisOther.setVisitId(zj_BASY_STD.getVISIT_ID());
            //诊断编码
            indexDiagnosisOther.setP324(zj_BASY_STD.getP3281());
            //诊断疾病描述
            indexDiagnosisOther.setP325(zj_BASY_STD.getP3282());
            //诊断入院病情
            indexDiagnosisOther.setP806(zj_BASY_STD.getP811());
            //诊断出院情况
            indexDiagnosisOther.setP326(zj_BASY_STD.getP3283());
            indexDiagnosisOther.setVisitDate(visitDate);
            indexDiagnosisOther.setDiagnosisDate(diagnosisDate);
            indexDiagnosisOtherService.saveIndexDiagnosisOther(indexDiagnosisOther);




            if(zj_BASY_STD.getP3282_ICD10_NAME1()!=null&&zj_BASY_STD.getP3282_ICD10_ID1()!=null&&!"".equals(zj_BASY_STD.getP3282_ICD10_ID1())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3282_ICD10_ID1());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3282_ICD10_NAME1());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3282_ICD10_NAME2()!=null&&zj_BASY_STD.getP3282_ICD10_ID2()!=null&&!"".equals(zj_BASY_STD.getP3282_ICD10_ID2())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3282_ICD10_ID2());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3282_ICD10_NAME2());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3282_ICD10_NAME3()!=null&&zj_BASY_STD.getP3282_ICD10_ID3()!=null&&!"".equals(zj_BASY_STD.getP3282_ICD10_ID3())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3282_ICD10_ID3());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3282_ICD10_NAME3());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3282_ICD10_NAME4()!=null&&zj_BASY_STD.getP3282_ICD10_ID4()!=null&&!"".equals(zj_BASY_STD.getP3282_ICD10_ID4())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3282_ICD10_ID4());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3282_ICD10_NAME4());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3282_ICD10_NAME5()!=null&&zj_BASY_STD.getP3282_ICD10_ID5()!=null&&!"".equals(zj_BASY_STD.getP3282_ICD10_ID5())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3282_ICD10_ID5());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3282_ICD10_NAME5());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }

        }
        if(zj_BASY_STD.getP3284()!=null&&zj_BASY_STD.getP3285()!=null){


            IndexDiagnosisOther indexDiagnosisOther = new IndexDiagnosisOther();
            //标识患者身份唯一标识
            indexDiagnosisOther.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
            //唯一标识
            indexDiagnosisOther.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
            //医疗机构代码
            indexDiagnosisOther.setP900(zj_BASY_STD.getP900());
            //患者id
            indexDiagnosisOther.setPatientId(zj_BASY_STD.getPATIENT_ID());
            //住院号
            indexDiagnosisOther.setVisitId(zj_BASY_STD.getVISIT_ID());
            //诊断编码
            indexDiagnosisOther.setP324(zj_BASY_STD.getP3284());
            //诊断疾病描述
            indexDiagnosisOther.setP325(zj_BASY_STD.getP3285());
            //诊断入院病情
            indexDiagnosisOther.setP806(zj_BASY_STD.getP812());
            //诊断出院情况
            indexDiagnosisOther.setP326(zj_BASY_STD.getP3286());
            indexDiagnosisOther.setVisitDate(visitDate);
            indexDiagnosisOther.setDiagnosisDate(diagnosisDate);
            indexDiagnosisOtherService.saveIndexDiagnosisOther(indexDiagnosisOther);

            if(zj_BASY_STD.getP3285_ICD10_NAME1()!=null&&zj_BASY_STD.getP3285_ICD10_ID1()!=null&&!"".equals(zj_BASY_STD.getP3285_ICD10_ID1())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3285_ICD10_ID1());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3285_ICD10_NAME1());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3285_ICD10_NAME2()!=null&&zj_BASY_STD.getP3285_ICD10_ID2()!=null&&!"".equals(zj_BASY_STD.getP3285_ICD10_ID2())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3285_ICD10_ID2());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3285_ICD10_NAME2());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3285_ICD10_NAME3()!=null&&zj_BASY_STD.getP3285_ICD10_ID3()!=null&&!"".equals(zj_BASY_STD.getP3285_ICD10_ID3())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3285_ICD10_ID3());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3285_ICD10_NAME3());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3285_ICD10_NAME4()!=null&&zj_BASY_STD.getP3285_ICD10_ID4()!=null&&!"".equals(zj_BASY_STD.getP3285_ICD10_ID4())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3285_ICD10_ID4());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3285_ICD10_NAME4());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3285_ICD10_NAME5()!=null&&zj_BASY_STD.getP3285_ICD10_ID5()!=null&&!"".equals(zj_BASY_STD.getP3285_ICD10_ID5())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3285_ICD10_ID5());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3285_ICD10_NAME5());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }

        }
        if(zj_BASY_STD.getP3287()!=null&&zj_BASY_STD.getP3288()!=null){

            IndexDiagnosisOther indexDiagnosisOther = new IndexDiagnosisOther();
            //标识患者身份唯一标识
            indexDiagnosisOther.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
            //唯一标识
            indexDiagnosisOther.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
            //医疗机构代码
            indexDiagnosisOther.setP900(zj_BASY_STD.getP900());
            //患者id
            indexDiagnosisOther.setPatientId(zj_BASY_STD.getPATIENT_ID());
            //住院号
            indexDiagnosisOther.setVisitId(zj_BASY_STD.getVISIT_ID());
            //诊断编码
            indexDiagnosisOther.setP324(zj_BASY_STD.getP3287());
            //诊断疾病描述
            indexDiagnosisOther.setP325(zj_BASY_STD.getP3288());
            //诊断入院病情
            indexDiagnosisOther.setP806(zj_BASY_STD.getP813());
            //诊断出院情况
            indexDiagnosisOther.setP326(zj_BASY_STD.getP3289());
            indexDiagnosisOther.setVisitDate(visitDate);
            indexDiagnosisOther.setDiagnosisDate(diagnosisDate);
            indexDiagnosisOtherService.saveIndexDiagnosisOther(indexDiagnosisOther);


            if(zj_BASY_STD.getP3288_ICD10_NAME1()!=null&&zj_BASY_STD.getP3288_ICD10_ID1()!=null&&!"".equals(zj_BASY_STD.getP3288_ICD10_ID1())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3288_ICD10_ID1());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3288_ICD10_NAME1());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3288_ICD10_NAME2()!=null&&zj_BASY_STD.getP3288_ICD10_ID2()!=null&&!"".equals(zj_BASY_STD.getP3288_ICD10_ID2())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3288_ICD10_ID2());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3288_ICD10_NAME2());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3288_ICD10_NAME3()!=null&&zj_BASY_STD.getP3288_ICD10_ID3()!=null&&!"".equals(zj_BASY_STD.getP3288_ICD10_ID3())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3288_ICD10_ID3());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3288_ICD10_NAME3());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3288_ICD10_NAME4()!=null&&zj_BASY_STD.getP3288_ICD10_ID4()!=null&&!"".equals(zj_BASY_STD.getP3288_ICD10_ID4())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3288_ICD10_ID4());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3288_ICD10_NAME4());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3288_ICD10_NAME5()!=null&&zj_BASY_STD.getP3288_ICD10_ID5()!=null&&!"".equals(zj_BASY_STD.getP3288_ICD10_ID5())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3288_ICD10_ID5());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3288_ICD10_NAME5());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }


        }
        if(zj_BASY_STD.getP3271()!=null&&zj_BASY_STD.getP3272()!=null){
            IndexDiagnosisOther indexDiagnosisOther = new IndexDiagnosisOther();
            //标识患者身份唯一标识
            indexDiagnosisOther.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
            //唯一标识
            indexDiagnosisOther.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
            //医疗机构代码
            indexDiagnosisOther.setP900(zj_BASY_STD.getP900());
            //患者id
            indexDiagnosisOther.setPatientId(zj_BASY_STD.getPATIENT_ID());
            //住院号
            indexDiagnosisOther.setVisitId(zj_BASY_STD.getVISIT_ID());
            //诊断编码
            indexDiagnosisOther.setP324(zj_BASY_STD.getP3271());
            //诊断疾病描述
            indexDiagnosisOther.setP325(zj_BASY_STD.getP3272());
            //诊断入院病情
            indexDiagnosisOther.setP806(zj_BASY_STD.getP814());
            //诊断出院情况
            indexDiagnosisOther.setP326(zj_BASY_STD.getP3273());
            indexDiagnosisOther.setVisitDate(visitDate);
            indexDiagnosisOther.setDiagnosisDate(diagnosisDate);
            indexDiagnosisOtherService.saveIndexDiagnosisOther(indexDiagnosisOther);


            if(zj_BASY_STD.getP3272_ICD10_NAME1()!=null&&zj_BASY_STD.getP3272_ICD10_ID1()!=null&&!"".equals(zj_BASY_STD.getP3272_ICD10_ID1())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3272_ICD10_ID1());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3272_ICD10_NAME1());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3272_ICD10_NAME2()!=null&&zj_BASY_STD.getP3272_ICD10_ID2()!=null&&!"".equals(zj_BASY_STD.getP3272_ICD10_ID2())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3272_ICD10_ID2());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3272_ICD10_NAME2());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3272_ICD10_NAME3()!=null&&zj_BASY_STD.getP3272_ICD10_ID3()!=null&&!"".equals(zj_BASY_STD.getP3272_ICD10_ID3())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3272_ICD10_ID3());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3272_ICD10_NAME3());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3272_ICD10_NAME4()!=null&&zj_BASY_STD.getP3272_ICD10_ID4()!=null&&!"".equals(zj_BASY_STD.getP3272_ICD10_ID4())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3272_ICD10_ID4());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3272_ICD10_NAME4());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3272_ICD10_NAME5()!=null&&zj_BASY_STD.getP3272_ICD10_ID5()!=null&&!"".equals(zj_BASY_STD.getP3272_ICD10_ID5())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3272_ICD10_ID5());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3272_ICD10_NAME5());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }

        }
        if(zj_BASY_STD.getP3274()!=null&&zj_BASY_STD.getP3275()!=null){
            IndexDiagnosisOther indexDiagnosisOther = new IndexDiagnosisOther();
            //标识患者身份唯一标识
            indexDiagnosisOther.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
            //唯一标识
            indexDiagnosisOther.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
            //医疗机构代码
            indexDiagnosisOther.setP900(zj_BASY_STD.getP900());
            //患者id
            indexDiagnosisOther.setPatientId(zj_BASY_STD.getPATIENT_ID());
            //住院号
            indexDiagnosisOther.setVisitId(zj_BASY_STD.getVISIT_ID());
            //诊断编码
            indexDiagnosisOther.setP324(zj_BASY_STD.getP3274());
            //诊断疾病描述
            indexDiagnosisOther.setP325(zj_BASY_STD.getP3275());
            //诊断入院病情
            indexDiagnosisOther.setP806(zj_BASY_STD.getP815());
            //诊断出院情况
            indexDiagnosisOther.setP326(zj_BASY_STD.getP3276());
            indexDiagnosisOther.setVisitDate(visitDate);
            indexDiagnosisOther.setDiagnosisDate(diagnosisDate);
            indexDiagnosisOtherService.saveIndexDiagnosisOther(indexDiagnosisOther);



            if(zj_BASY_STD.getP3275_ICD10_NAME1()!=null&&zj_BASY_STD.getP3275_ICD10_ID1()!=null&&!"".equals(zj_BASY_STD.getP3275_ICD10_ID1())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3275_ICD10_ID1());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3275_ICD10_NAME1());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3275_ICD10_NAME2()!=null&&zj_BASY_STD.getP3275_ICD10_ID2()!=null&&!"".equals(zj_BASY_STD.getP3275_ICD10_ID2())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3275_ICD10_ID2());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3275_ICD10_NAME2());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3275_ICD10_NAME3()!=null&&zj_BASY_STD.getP3275_ICD10_ID3()!=null&&!"".equals(zj_BASY_STD.getP3275_ICD10_ID3())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3275_ICD10_ID3());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3275_ICD10_NAME3());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3275_ICD10_NAME4()!=null&&zj_BASY_STD.getP3275_ICD10_ID4()!=null&&!"".equals(zj_BASY_STD.getP3275_ICD10_ID4())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3275_ICD10_ID4());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3275_ICD10_NAME4());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3275_ICD10_NAME5()!=null&&zj_BASY_STD.getP3275_ICD10_ID5()!=null&&!"".equals(zj_BASY_STD.getP3275_ICD10_ID5())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3275_ICD10_ID5());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3275_ICD10_NAME5());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }

        }





     /*   //数据版本
        indexDiagnosisOther.setDataVersion();
        //数据库来源
        indexDiagnosisOther.setDataDbSource();
        //数据表来源
        indexDiagnosisOther.setDataTableSource();
        //数据项来源
        indexDiagnosisOther.setDataFieldSource();
        //创建时间
        indexDiagnosisOther.setCreatedAt();
        //创建人
        indexDiagnosisOther.setCreator();
        //修改时间
        indexDiagnosisOther.setUpdatedAt();*/
    }
    public void saveIndexIcu(BASY_NSTD zj_BASY_NSTD){
        log.info("保存病案首页重症监护："+zj_BASY_NSTD.getUNIQUE_ID());
        if(zj_BASY_NSTD.getP6911()!=null&&!"".equals(zj_BASY_NSTD.getP6911())){
            IndexIcu indexIcu = new IndexIcu();

            //标识患者身份唯一标识
            indexIcu.setPersonId(zj_BASY_NSTD.getUNIQUE_ID_LV1());
            //唯一标识
            indexIcu.setUniqueId(zj_BASY_NSTD.getUNIQUE_ID_LV2());
            //医疗机构代码
            indexIcu.setP900(zj_BASY_NSTD.getP900());
            //患者id
            indexIcu.setPatientId(zj_BASY_NSTD.getPATIENT_ID());
            //住院号
            indexIcu.setVisitId(zj_BASY_NSTD.getVISIT_ID());
            //重症监护室名称
            indexIcu.setP6911(zj_BASY_NSTD.getP6911());
            //进入时间
            indexIcu.setP6912(zj_BASY_NSTD.getP6912());
            //退出时间
            indexIcu.setP6913(zj_BASY_NSTD.getP6913());
            indexIcuService.saveIndexIcu(indexIcu);

        }
        if(zj_BASY_NSTD.getP6914()!=null&&!"".equals(zj_BASY_NSTD.getP6914())){
            IndexIcu indexIcu = new IndexIcu();

            //标识患者身份唯一标识
            indexIcu.setPersonId(zj_BASY_NSTD.getUNIQUE_ID_LV1());
            //唯一标识
            indexIcu.setUniqueId(zj_BASY_NSTD.getUNIQUE_ID_LV2());
            //医疗机构代码
            indexIcu.setP900(zj_BASY_NSTD.getP900());
            //患者id
            indexIcu.setPatientId(zj_BASY_NSTD.getPATIENT_ID());
            //住院号
            indexIcu.setVisitId(zj_BASY_NSTD.getVISIT_ID());
            //重症监护室名称
            indexIcu.setP6911(zj_BASY_NSTD.getP6914());
            //进入时间
            indexIcu.setP6912(zj_BASY_NSTD.getP6915());
            //退出时间
            indexIcu.setP6913(zj_BASY_NSTD.getP6916());
            indexIcuService.saveIndexIcu(indexIcu);

        }
        if(zj_BASY_NSTD.getP6917()!=null&&!"".equals(zj_BASY_NSTD.getP6917())){
            IndexIcu indexIcu = new IndexIcu();

            //标识患者身份唯一标识
            indexIcu.setPersonId(zj_BASY_NSTD.getUNIQUE_ID_LV1());
            //唯一标识
            indexIcu.setUniqueId(zj_BASY_NSTD.getUNIQUE_ID_LV2());
            //医疗机构代码
            indexIcu.setP900(zj_BASY_NSTD.getP900());
            //患者id
            indexIcu.setPatientId(zj_BASY_NSTD.getPATIENT_ID());
            //住院号
            indexIcu.setVisitId(zj_BASY_NSTD.getVISIT_ID());
            //重症监护室名称
            indexIcu.setP6911(zj_BASY_NSTD.getP6917());
            //进入时间
            indexIcu.setP6912(zj_BASY_NSTD.getP6918());
            //退出时间
            indexIcu.setP6913(zj_BASY_NSTD.getP6919());
            indexIcuService.saveIndexIcu(indexIcu);

        }
        if(zj_BASY_NSTD.getP6920()!=null&&!"".equals(zj_BASY_NSTD.getP6920())){
            IndexIcu indexIcu = new IndexIcu();

            //标识患者身份唯一标识
            indexIcu.setPersonId(zj_BASY_NSTD.getUNIQUE_ID_LV1());
            //唯一标识
            indexIcu.setUniqueId(zj_BASY_NSTD.getUNIQUE_ID_LV2());
            //医疗机构代码
            indexIcu.setP900(zj_BASY_NSTD.getP900());
            //患者id
            indexIcu.setPatientId(zj_BASY_NSTD.getPATIENT_ID());
            //住院号
            indexIcu.setVisitId(zj_BASY_NSTD.getVISIT_ID());
            //重症监护室名称
            indexIcu.setP6911(zj_BASY_NSTD.getP6920());
            //进入时间
            indexIcu.setP6912(zj_BASY_NSTD.getP6921());
            //退出时间
            indexIcu.setP6913(zj_BASY_NSTD.getP6922());
            indexIcuService.saveIndexIcu(indexIcu);

        }
        if(zj_BASY_NSTD.getP6923()!=null&&!"".equals(zj_BASY_NSTD.getP6923())){
            IndexIcu indexIcu = new IndexIcu();

            //标识患者身份唯一标识
            indexIcu.setPersonId(zj_BASY_NSTD.getUNIQUE_ID_LV1());
            //唯一标识
            indexIcu.setUniqueId(zj_BASY_NSTD.getUNIQUE_ID_LV2());
            //医疗机构代码
            indexIcu.setP900(zj_BASY_NSTD.getP900());
            //患者id
            indexIcu.setPatientId(zj_BASY_NSTD.getPATIENT_ID());
            //住院号
            indexIcu.setVisitId(zj_BASY_NSTD.getVISIT_ID());
            //重症监护室名称
            indexIcu.setP6911(zj_BASY_NSTD.getP6923());
            //进入时间
            indexIcu.setP6912(zj_BASY_NSTD.getP6924());
            //退出时间
            indexIcu.setP6913(zj_BASY_NSTD.getP6925());
            indexIcuService.saveIndexIcu(indexIcu);

        }



/*
        //数据版本
        indexIcu.setDataVersion();
        //数据库来源
        indexIcu.setDataDbSource();
        //数据表来源
        indexIcu.setDataTableSource();
        //数据项来源
        indexIcu.setDataFieldSource();
        //创建时间
        indexIcu.setCreatedAt();
        //创建人
        indexIcu.setCreator();
        //修改时间
        indexIcu.setUpdatedAt();*/
    }
    public void saveIndexPathology(BASY_DIAG_STD zj_BASY_STD,Date visitDate,Date diagnosisDate){
        log.info("保存病案首页病理诊断："+zj_BASY_STD.getUNIQUE_ID());

        if(zj_BASY_STD.getP351()!=null&&zj_BASY_STD.getP352()!=null){

            IndexPathology indexPathology = new IndexPathology();
            //标识患者身份唯一标识
            indexPathology.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
            //唯一标识
            indexPathology.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
            //医疗机构代码
            indexPathology.setP900(zj_BASY_STD.getP900());
            //患者id
            indexPathology.setPatientId(zj_BASY_STD.getPATIENT_ID());
            //住院号
            indexPathology.setVisitId(zj_BASY_STD.getVISIT_ID());
            //病理号
            indexPathology.setP816(zj_BASY_STD.getP816());
            //病理诊断编码
            indexPathology.setP351(zj_BASY_STD.getP351());
            //病理诊断名称
            indexPathology.setP352(zj_BASY_STD.getP352());
            indexPathology.setVisitDate(visitDate);
            indexPathology.setDiagnosisDate(diagnosisDate);
            indexPathologyService.saveIndexPathology(indexPathology);

            if(zj_BASY_STD.getP352_ICD10_NAME1()!=null&&zj_BASY_STD.getP352_ICD10_ID1()!=null&&!"".equals(zj_BASY_STD.getP352_ICD10_ID1())){
                IndexPathologyIcd indexPathologyIcd = new IndexPathologyIcd();
                //标识患者身份唯一标识
                indexPathologyIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexPathologyIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexPathologyIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexPathologyIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexPathologyIcd.setVisitId(zj_BASY_STD.getVISIT_ID());

                //病理诊断编码
                indexPathologyIcd.setPathologyId(indexPathology.getId());
                //病理诊断编码
                indexPathologyIcd.setDiagnosisIcdcode(zj_BASY_STD.getP352_ICD10_ID1());
                //病理诊断名称
                indexPathologyIcd.setDiagnosisIcddesc(zj_BASY_STD.getP352_ICD10_NAME1());
                indexPathologyIcdService.saveIndexPathologyIcd(indexPathologyIcd);
            }
            if(zj_BASY_STD.getP352_ICD10_NAME2()!=null&&zj_BASY_STD.getP352_ICD10_ID2()!=null&&!"".equals(zj_BASY_STD.getP352_ICD10_ID2())){
                IndexPathologyIcd indexPathologyIcd = new IndexPathologyIcd();
                //标识患者身份唯一标识
                indexPathologyIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexPathologyIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexPathologyIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexPathologyIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexPathologyIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //病理诊断编码
                indexPathologyIcd.setPathologyId(indexPathology.getId());
                //病理诊断编码
                indexPathologyIcd.setDiagnosisIcdcode(zj_BASY_STD.getP352_ICD10_ID2());
                //病理诊断名称
                indexPathologyIcd.setDiagnosisIcddesc(zj_BASY_STD.getP352_ICD10_NAME2());
                indexPathologyIcdService.saveIndexPathologyIcd(indexPathologyIcd);
            }
            if(zj_BASY_STD.getP352_ICD10_NAME3()!=null&&zj_BASY_STD.getP352_ICD10_ID3()!=null&&!"".equals(zj_BASY_STD.getP352_ICD10_ID3())){
                IndexPathologyIcd indexPathologyIcd = new IndexPathologyIcd();
                //标识患者身份唯一标识
                indexPathologyIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexPathologyIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexPathologyIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexPathologyIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexPathologyIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //病理诊断编码
                indexPathologyIcd.setPathologyId(indexPathology.getId());
                //病理诊断编码
                indexPathologyIcd.setDiagnosisIcdcode(zj_BASY_STD.getP352_ICD10_ID3());
                //病理诊断名称
                indexPathologyIcd.setDiagnosisIcddesc(zj_BASY_STD.getP352_ICD10_NAME3());
                indexPathologyIcdService.saveIndexPathologyIcd(indexPathologyIcd);
            }
            if(zj_BASY_STD.getP352_ICD10_NAME4()!=null&&zj_BASY_STD.getP352_ICD10_ID4()!=null&&!"".equals(zj_BASY_STD.getP352_ICD10_ID4())){
                IndexPathologyIcd indexPathologyIcd = new IndexPathologyIcd();
                //标识患者身份唯一标识
                indexPathologyIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexPathologyIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexPathologyIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexPathologyIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexPathologyIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //病理诊断编码
                indexPathologyIcd.setPathologyId(indexPathology.getId());
                //病理诊断编码
                indexPathologyIcd.setDiagnosisIcdcode(zj_BASY_STD.getP352_ICD10_ID4());
                //病理诊断名称
                indexPathologyIcd.setDiagnosisIcddesc(zj_BASY_STD.getP352_ICD10_NAME4());
                indexPathologyIcdService.saveIndexPathologyIcd(indexPathologyIcd);
            }
            if(zj_BASY_STD.getP352_ICD10_NAME5()!=null&&zj_BASY_STD.getP352_ICD10_ID5()!=null&&!"".equals(zj_BASY_STD.getP352_ICD10_ID5())){
                IndexPathologyIcd indexPathologyIcd = new IndexPathologyIcd();
                //标识患者身份唯一标识
                indexPathologyIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexPathologyIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexPathologyIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexPathologyIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexPathologyIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //病理诊断编码
                indexPathologyIcd.setPathologyId(indexPathology.getId());
                //病理诊断编码
                indexPathologyIcd.setDiagnosisIcdcode(zj_BASY_STD.getP352_ICD10_ID5());
                //病理诊断名称
                indexPathologyIcd.setDiagnosisIcddesc(zj_BASY_STD.getP352_ICD10_NAME5());
                indexPathologyIcdService.saveIndexPathologyIcd(indexPathologyIcd);
            }
        }


        if(zj_BASY_STD.getP353()!=null&&zj_BASY_STD.getP354()!=null){

            IndexPathology indexPathology = new IndexPathology();
            //标识患者身份唯一标识
            indexPathology.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
            //唯一标识
            indexPathology.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
            //医疗机构代码
            indexPathology.setP900(zj_BASY_STD.getP900());
            //患者id
            indexPathology.setPatientId(zj_BASY_STD.getPATIENT_ID());
            //住院号
            indexPathology.setVisitId(zj_BASY_STD.getVISIT_ID());
            //病理号
            indexPathology.setP816(zj_BASY_STD.getP817());
            //病理诊断编码
            indexPathology.setP351(zj_BASY_STD.getP353());
            //病理诊断名称
            indexPathology.setP352(zj_BASY_STD.getP354());
            indexPathology.setVisitDate(visitDate);
            indexPathology.setDiagnosisDate(diagnosisDate);
            indexPathologyService.saveIndexPathology(indexPathology);

            if(zj_BASY_STD.getP354_ICD10_NAME1()!=null&&zj_BASY_STD.getP354_ICD10_ID1()!=null&&!"".equals(zj_BASY_STD.getP354_ICD10_ID1())){
                IndexPathologyIcd indexPathologyIcd = new IndexPathologyIcd();
                //标识患者身份唯一标识
                indexPathologyIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexPathologyIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexPathologyIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexPathologyIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexPathologyIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //病理诊断编码
                indexPathologyIcd.setPathologyId(indexPathology.getId());
                //病理诊断编码
                indexPathologyIcd.setDiagnosisIcdcode(zj_BASY_STD.getP354_ICD10_ID1());
                //病理诊断名称
                indexPathologyIcd.setDiagnosisIcddesc(zj_BASY_STD.getP354_ICD10_NAME1());
                indexPathologyIcdService.saveIndexPathologyIcd(indexPathologyIcd);
            }
            if(zj_BASY_STD.getP354_ICD10_NAME2()!=null&&zj_BASY_STD.getP354_ICD10_ID2()!=null&&!"".equals(zj_BASY_STD.getP354_ICD10_ID2())){
                IndexPathologyIcd indexPathologyIcd = new IndexPathologyIcd();
                //标识患者身份唯一标识
                indexPathologyIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexPathologyIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexPathologyIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexPathologyIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexPathologyIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //病理诊断编码
                indexPathologyIcd.setPathologyId(indexPathology.getId());
                //病理诊断编码
                indexPathologyIcd.setDiagnosisIcdcode(zj_BASY_STD.getP354_ICD10_ID2());
                //病理诊断名称
                indexPathologyIcd.setDiagnosisIcddesc(zj_BASY_STD.getP354_ICD10_NAME2());
                indexPathologyIcdService.saveIndexPathologyIcd(indexPathologyIcd);
            }
            if(zj_BASY_STD.getP354_ICD10_NAME3()!=null&&zj_BASY_STD.getP354_ICD10_ID3()!=null&&!"".equals(zj_BASY_STD.getP354_ICD10_ID3())){
                IndexPathologyIcd indexPathologyIcd = new IndexPathologyIcd();
                //标识患者身份唯一标识
                indexPathologyIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexPathologyIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexPathologyIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexPathologyIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexPathologyIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //病理诊断编码
                indexPathologyIcd.setPathologyId(indexPathology.getId());
                //病理诊断编码
                indexPathologyIcd.setDiagnosisIcdcode(zj_BASY_STD.getP354_ICD10_ID3());
                //病理诊断名称
                indexPathologyIcd.setDiagnosisIcddesc(zj_BASY_STD.getP354_ICD10_NAME3());
                indexPathologyIcdService.saveIndexPathologyIcd(indexPathologyIcd);
            }
            if(zj_BASY_STD.getP354_ICD10_NAME4()!=null&&zj_BASY_STD.getP354_ICD10_ID4()!=null&&!"".equals(zj_BASY_STD.getP354_ICD10_ID4())){
                IndexPathologyIcd indexPathologyIcd = new IndexPathologyIcd();
                //标识患者身份唯一标识
                indexPathologyIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexPathologyIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexPathologyIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexPathologyIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexPathologyIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //病理诊断编码
                indexPathologyIcd.setPathologyId(indexPathology.getId());
                //病理诊断编码
                indexPathologyIcd.setDiagnosisIcdcode(zj_BASY_STD.getP354_ICD10_ID4());
                //病理诊断名称
                indexPathologyIcd.setDiagnosisIcddesc(zj_BASY_STD.getP354_ICD10_NAME4());
                indexPathologyIcdService.saveIndexPathologyIcd(indexPathologyIcd);
            }
            if(zj_BASY_STD.getP354_ICD10_NAME5()!=null&&zj_BASY_STD.getP354_ICD10_ID5()!=null&&!"".equals(zj_BASY_STD.getP354_ICD10_ID5())){
                IndexPathologyIcd indexPathologyIcd = new IndexPathologyIcd();
                //标识患者身份唯一标识
                indexPathologyIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexPathologyIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexPathologyIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexPathologyIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexPathologyIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //病理诊断编码
                indexPathologyIcd.setPathologyId(indexPathology.getId());
                //病理诊断编码
                indexPathologyIcd.setDiagnosisIcdcode(zj_BASY_STD.getP354_ICD10_ID5());
                //病理诊断名称
                indexPathologyIcd.setDiagnosisIcddesc(zj_BASY_STD.getP354_ICD10_NAME5());
                indexPathologyIcdService.saveIndexPathologyIcd(indexPathologyIcd);
            }



        }

        if(zj_BASY_STD.getP355()!=null&&zj_BASY_STD.getP356()!=null){

            IndexPathology indexPathology = new IndexPathology();
            //标识患者身份唯一标识
            indexPathology.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
            //唯一标识
            indexPathology.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
            //医疗机构代码
            indexPathology.setP900(zj_BASY_STD.getP900());
            //患者id
            indexPathology.setPatientId(zj_BASY_STD.getPATIENT_ID());
            //住院号
            indexPathology.setVisitId(zj_BASY_STD.getVISIT_ID());
            //病理号
            indexPathology.setP816(zj_BASY_STD.getP818());
            //病理诊断编码
            indexPathology.setP351(zj_BASY_STD.getP355());
            //病理诊断名称
            indexPathology.setP352(zj_BASY_STD.getP356());
            indexPathology.setVisitDate(visitDate);
            indexPathology.setDiagnosisDate(diagnosisDate);
            indexPathologyService.saveIndexPathology(indexPathology);


            if(zj_BASY_STD.getP356_ICD10_NAME1()!=null&&zj_BASY_STD.getP356_ICD10_ID1()!=null&&!"".equals(zj_BASY_STD.getP356_ICD10_ID1())){
                IndexPathologyIcd indexPathologyIcd = new IndexPathologyIcd();
                //标识患者身份唯一标识
                indexPathologyIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexPathologyIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexPathologyIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexPathologyIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexPathologyIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //病理诊断编码
                indexPathologyIcd.setPathologyId(indexPathology.getId());
                //病理诊断编码
                indexPathologyIcd.setDiagnosisIcdcode(zj_BASY_STD.getP356_ICD10_ID1());
                //病理诊断名称
                indexPathologyIcd.setDiagnosisIcddesc(zj_BASY_STD.getP356_ICD10_NAME1());
                indexPathologyIcdService.saveIndexPathologyIcd(indexPathologyIcd);
            }
            if(zj_BASY_STD.getP356_ICD10_NAME2()!=null&&zj_BASY_STD.getP356_ICD10_ID2()!=null&&!"".equals(zj_BASY_STD.getP356_ICD10_ID2())){
                IndexPathologyIcd indexPathologyIcd = new IndexPathologyIcd();
                //标识患者身份唯一标识
                indexPathologyIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexPathologyIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexPathologyIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexPathologyIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexPathologyIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //病理诊断编码
                indexPathologyIcd.setPathologyId(indexPathology.getId());
                //病理诊断编码
                indexPathologyIcd.setDiagnosisIcdcode(zj_BASY_STD.getP356_ICD10_ID2());
                //病理诊断名称
                indexPathologyIcd.setDiagnosisIcddesc(zj_BASY_STD.getP356_ICD10_NAME2());
                indexPathologyIcdService.saveIndexPathologyIcd(indexPathologyIcd);
            }
            if(zj_BASY_STD.getP356_ICD10_NAME3()!=null&&zj_BASY_STD.getP356_ICD10_ID3()!=null&&!"".equals(zj_BASY_STD.getP356_ICD10_ID3())){
                IndexPathologyIcd indexPathologyIcd = new IndexPathologyIcd();
                //标识患者身份唯一标识
                indexPathologyIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexPathologyIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexPathologyIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexPathologyIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexPathologyIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //病理诊断编码
                indexPathologyIcd.setPathologyId(indexPathology.getId());
                //病理诊断编码
                indexPathologyIcd.setDiagnosisIcdcode(zj_BASY_STD.getP356_ICD10_ID3());
                //病理诊断名称
                indexPathologyIcd.setDiagnosisIcddesc(zj_BASY_STD.getP356_ICD10_NAME3());
                indexPathologyIcdService.saveIndexPathologyIcd(indexPathologyIcd);
            }
            if(zj_BASY_STD.getP356_ICD10_NAME4()!=null&&zj_BASY_STD.getP356_ICD10_ID4()!=null&&!"".equals(zj_BASY_STD.getP356_ICD10_ID4())){
                IndexPathologyIcd indexPathologyIcd = new IndexPathologyIcd();
                //标识患者身份唯一标识
                indexPathologyIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexPathologyIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexPathologyIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexPathologyIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexPathologyIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //病理诊断编码
                indexPathologyIcd.setPathologyId(indexPathology.getId());
                //病理诊断编码
                indexPathologyIcd.setDiagnosisIcdcode(zj_BASY_STD.getP356_ICD10_ID4());
                //病理诊断名称
                indexPathologyIcd.setDiagnosisIcddesc(zj_BASY_STD.getP356_ICD10_NAME4());
                indexPathologyIcdService.saveIndexPathologyIcd(indexPathologyIcd);
            }
            if(zj_BASY_STD.getP356_ICD10_NAME5()!=null&&zj_BASY_STD.getP356_ICD10_ID5()!=null&&!"".equals(zj_BASY_STD.getP356_ICD10_ID5())){
                IndexPathologyIcd indexPathologyIcd = new IndexPathologyIcd();
                //标识患者身份唯一标识
                indexPathologyIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexPathologyIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexPathologyIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexPathologyIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexPathologyIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //病理诊断编码
                indexPathologyIcd.setPathologyId(indexPathology.getId());
                //病理诊断编码
                indexPathologyIcd.setDiagnosisIcdcode(zj_BASY_STD.getP356_ICD10_ID5());
                //病理诊断名称
                indexPathologyIcd.setDiagnosisIcddesc(zj_BASY_STD.getP356_ICD10_NAME5());
                indexPathologyIcdService.saveIndexPathologyIcd(indexPathologyIcd);
            }


        }


            /*//数据版本
            indexPathology.setDataVersion();
            //数据库来源
            indexPathology.setDataDbSource();
            //数据表来源
            indexPathology.setDataTableSource();
            //数据项来源
            indexPathology.setDataFieldSource();
            //创建时间
            indexPathology.setCreatedAt();
            //创建人
            indexPathology.setCreator();
            //修改时间
            indexPathology.setUpdatedAt();*/
    }
    public void saveIndexInjury(BASY_DIAG_STD zj_BASY_STD){
        log.info("保存病案首页中毒损伤："+zj_BASY_STD.getUNIQUE_ID());
        if(zj_BASY_STD.getP362()!=null&&!"".equals(zj_BASY_STD.getP362())){
            IndexInjury indexInjury = new IndexInjury();
            //标识患者身份唯一标识
            indexInjury.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
            //唯一标识
            indexInjury.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
            //医疗机构代码
            indexInjury.setP900(zj_BASY_STD.getP900());
            //患者id
            indexInjury.setPatientId(zj_BASY_STD.getPATIENT_ID());
            //住院号
            indexInjury.setVisitId(zj_BASY_STD.getVISIT_ID());
            //损伤、中毒的外部因素编码
            indexInjury.setP361(zj_BASY_STD.getP361());
            //损伤、中毒的外部因素名称
            indexInjury.setP362(zj_BASY_STD.getP362());

            indexInjuryService.saveIndexInjury(indexInjury);
        }
        if(zj_BASY_STD.getP364()!=null&&!"".equals(zj_BASY_STD.getP364())){
            IndexInjury indexInjury = new IndexInjury();
            //标识患者身份唯一标识
            indexInjury.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
            //唯一标识
            indexInjury.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
            //医疗机构代码
            indexInjury.setP900(zj_BASY_STD.getP900());
            //患者id
            indexInjury.setPatientId(zj_BASY_STD.getPATIENT_ID());
            //住院号
            indexInjury.setVisitId(zj_BASY_STD.getVISIT_ID());
            //损伤、中毒的外部因素编码
            indexInjury.setP361(zj_BASY_STD.getP363());
            //损伤、中毒的外部因素名称
            indexInjury.setP362(zj_BASY_STD.getP364());

            indexInjuryService.saveIndexInjury(indexInjury);
        }
        if(zj_BASY_STD.getP366()!=null&&!"".equals(zj_BASY_STD.getP366())){
            IndexInjury indexInjury = new IndexInjury();
            //标识患者身份唯一标识
            indexInjury.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
            //唯一标识
            indexInjury.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
            //医疗机构代码
            indexInjury.setP900(zj_BASY_STD.getP900());
            //患者id
            indexInjury.setPatientId(zj_BASY_STD.getPATIENT_ID());
            //住院号
            indexInjury.setVisitId(zj_BASY_STD.getVISIT_ID());
            //损伤、中毒的外部因素编码
            indexInjury.setP361(zj_BASY_STD.getP365());
            //损伤、中毒的外部因素名称
            indexInjury.setP362(zj_BASY_STD.getP366());

            indexInjuryService.saveIndexInjury(indexInjury);
        }

/*

        //数据版本
        indexInjury.setDataVersion();
        //数据库来源
        indexInjury.setDataDbSource();
        //数据表来源
        indexInjury.setDataTableSource();
        //数据项来源
        indexInjury.setDataFieldSource();
        //创建时间
        indexInjury.setCreatedAt();
        //创建人
        indexInjury.setCreator();
        //修改时间
        indexInjury.setUpdatedAt();*/

    }
    public void saveIndexPerson(BASY_NSTD zj_BASY_NSTD,BASY_DIAG_STD zj_BASY_STD){
        log.info("保存病案首页基本信息"+zj_BASY_NSTD.getUNIQUE_ID());
        IndexPerson indexPerson = new IndexPerson();
        //标识患者身份唯一标识
        indexPerson.setPersonId(zj_BASY_NSTD.getUNIQUE_ID_LV1());
        //唯一标识
        indexPerson.setUniqueId(zj_BASY_NSTD.getUNIQUE_ID_LV2());
        //患者ID
        indexPerson.setPatientId(zj_BASY_NSTD.getPATIENT_ID());
        //住院号
        indexPerson.setVisitId(zj_BASY_NSTD.getVISIT_ID());
        //医疗机构代码
        indexPerson.setP900(zj_BASY_NSTD.getP900());
        //机构名称
        indexPerson.setP6891(zj_BASY_NSTD.getP6891());
        //医疗保险手册（卡）号
        indexPerson.setP686(zj_BASY_NSTD.getP686());
        //健康卡号
        indexPerson.setP800(zj_BASY_NSTD.getP800());
        //医疗付款方式
        indexPerson.setP1(zj_BASY_NSTD.getP1());
        //住院次数
        indexPerson.setP2(zj_BASY_NSTD.getP2());
        //病案号
        indexPerson.setP3(zj_BASY_NSTD.getP3());
        //姓名
        indexPerson.setP4(zj_BASY_NSTD.getP4());
        //性别
        indexPerson.setP5(zj_BASY_NSTD.getP5());
        //出生日期
        indexPerson.setP6(zj_BASY_NSTD.getP6());
        //年龄
        indexPerson.setP7(zj_BASY_NSTD.getP7());
        //婚姻状况
        indexPerson.setP8(zj_BASY_NSTD.getP8());
        //职业
        indexPerson.setP9(zj_BASY_NSTD.getP9());
        //出生省份
        indexPerson.setP101(zj_BASY_NSTD.getP101());
        //出生地市
        indexPerson.setP102(zj_BASY_NSTD.getP102());
        //出生地县
        indexPerson.setP103(zj_BASY_NSTD.getP103());
        //民族
        indexPerson.setP11(zj_BASY_NSTD.getP11());
        //国籍
        indexPerson.setP12(zj_BASY_NSTD.getP12());
        //身份证号
        indexPerson.setP13(zj_BASY_NSTD.getP13());
        //现住址
        indexPerson.setP801(zj_BASY_NSTD.getP801());
        //住宅电话
        indexPerson.setP802(zj_BASY_NSTD.getP802());
        //现住址邮政编码
        indexPerson.setP803(zj_BASY_NSTD.getP803());
        //工作单位及地址
        indexPerson.setP14(zj_BASY_NSTD.getP14());
        //电话
        indexPerson.setP15(zj_BASY_NSTD.getP15());
        //工作单位邮政编码
        indexPerson.setP16(zj_BASY_NSTD.getP16());
        //户口地址
        indexPerson.setP17(zj_BASY_NSTD.getP17());
        //户口所在地邮政编码
        indexPerson.setP171(zj_BASY_NSTD.getP171());
        //联系人姓名
        indexPerson.setP18(zj_BASY_NSTD.getP18());
        //关系
        indexPerson.setP19(zj_BASY_NSTD.getP19());
        //联系人地址
        indexPerson.setP20(zj_BASY_NSTD.getP20());
        //入院途径
        indexPerson.setP804(zj_BASY_NSTD.getP804());
        //联系人电话
        indexPerson.setP21(zj_BASY_NSTD.getP21());
        //入院日期
        indexPerson.setP22(zj_BASY_NSTD.getP22());
        //入院科室
        indexPerson.setP23(zj_BASY_NSTD.getP23());
        //入院病室
        indexPerson.setP231(zj_BASY_NSTD.getP231());
        //转科科室
        indexPerson.setP24(zj_BASY_NSTD.getP24());
        //出院日期
        indexPerson.setP25(zj_BASY_NSTD.getP25());
        //出院科室
        indexPerson.setP26(zj_BASY_NSTD.getP26());
        //出院病室
        indexPerson.setP261(zj_BASY_NSTD.getP261());
        //实际住院天数
        indexPerson.setP27(zj_BASY_NSTD.getP27());
        //--------
        //入院时情况
        indexPerson.setP29(zj_BASY_STD.getP29());
        //入院后确诊日期
        indexPerson.setP31(zj_BASY_STD.getP31());
        //医院感染总次数
        indexPerson.setP689(zj_BASY_NSTD.getP689());
        //过敏源
        indexPerson.setP371(zj_BASY_NSTD.getP371());
        //过敏药物名称
        indexPerson.setP372(zj_BASY_NSTD.getP372());
        //HBsAg
        indexPerson.setP38(zj_BASY_NSTD.getP38());
        //HCV-Ab
        indexPerson.setP39(zj_BASY_NSTD.getP39());
        //HIV-Ab
        indexPerson.setP40(zj_BASY_NSTD.getP40());
        //门诊与出院诊断符合情况
        indexPerson.setP411(zj_BASY_STD.getP411());
        //入院与出院诊断符合情况
        indexPerson.setP412(zj_BASY_STD.getP412());
        //术前与术后诊断符合情况
        indexPerson.setP413(zj_BASY_STD.getP413());
        //临床与病理诊断符合情况
        indexPerson.setP414(zj_BASY_STD.getP414());
        //放射与病理诊断符合情况
        indexPerson.setP415(zj_BASY_STD.getP415());
        //抢救次数
        indexPerson.setP421(zj_BASY_NSTD.getP421());
        //抢救成功次数
        indexPerson.setP422(zj_BASY_NSTD.getP422());
        //最高诊断依据
        indexPerson.setP687(zj_BASY_NSTD.getP687());
        //分化程度
        indexPerson.setP688(zj_BASY_NSTD.getP688());
        //科主任
        indexPerson.setP431(zj_BASY_NSTD.getP431());
        //主(副主)任医师
        indexPerson.setP432(zj_BASY_NSTD.getP432());
        //主治医师
        indexPerson.setP433(zj_BASY_NSTD.getP433());
        //住院医师
        indexPerson.setP434(zj_BASY_NSTD.getP434());
        //责任护士
        indexPerson.setP819(zj_BASY_NSTD.getP819());
        //进修医师
        indexPerson.setP435(zj_BASY_NSTD.getP435());
        //研究生实习医师
        indexPerson.setP436(zj_BASY_NSTD.getP436());
        //实习医师
        indexPerson.setP437(zj_BASY_NSTD.getP437());
        //编码员
        indexPerson.setP438(zj_BASY_NSTD.getP438());
        //病案质量
        indexPerson.setP44(zj_BASY_NSTD.getP44());
        //质控医师
        indexPerson.setP45(zj_BASY_NSTD.getP45());
        //质控护师
        indexPerson.setP46(zj_BASY_NSTD.getP46());
        //质控日期
        indexPerson.setP47(zj_BASY_NSTD.getP47());
        //特级护理天数
        indexPerson.setP561(zj_BASY_NSTD.getP561());
        //一级护理天数
        indexPerson.setP562(zj_BASY_NSTD.getP562());
        //二级护理天数
        indexPerson.setP563(zj_BASY_NSTD.getP563());
        //三级护理天数
        indexPerson.setP564(zj_BASY_NSTD.getP564());
        //死亡患者尸检
        indexPerson.setP57(zj_BASY_NSTD.getP57());
        //手术、治疗、检查、诊断为本院第一例
        indexPerson.setP58(zj_BASY_NSTD.getP58());
        //手术患者类型
        indexPerson.setP581(zj_BASY_NSTD.getP581());
        //随诊
        indexPerson.setP60(zj_BASY_NSTD.getP60());
        //随诊周数
        indexPerson.setP611(zj_BASY_NSTD.getP611());
        //随诊月数
        indexPerson.setP612(zj_BASY_NSTD.getP612());
        //随诊年数
        indexPerson.setP613(zj_BASY_NSTD.getP613());
        //示教病例
        indexPerson.setP59(zj_BASY_NSTD.getP59());
        //ABO血型
        indexPerson.setP62(zj_BASY_NSTD.getP62());
        //Rh血型
        indexPerson.setP63(zj_BASY_NSTD.getP63());
        //输血反应
        indexPerson.setP64(zj_BASY_NSTD.getP64());
        //红细胞
        indexPerson.setP651(zj_BASY_NSTD.getP651());
        //血小板
        indexPerson.setP652(zj_BASY_NSTD.getP652());
        //血浆
        indexPerson.setP653(zj_BASY_NSTD.getP653());
        //全血
        indexPerson.setP654(zj_BASY_NSTD.getP654());
        //自体回收
        indexPerson.setP655(zj_BASY_NSTD.getP655());
        //其它
        indexPerson.setP656(zj_BASY_NSTD.getP656());
        //（年龄不足1周岁的）年龄
        indexPerson.setP66(zj_BASY_NSTD.getP66());
        //新生儿出生体重
        indexPerson.setP681(zj_BASY_NSTD.getP681());
        //新生儿入院体重
        indexPerson.setP67(zj_BASY_NSTD.getP67());
        //入院前多少小时(颅脑损伤患者昏迷时间)
        indexPerson.setP731(zj_BASY_NSTD.getP731());
        //入院前多少分钟(颅脑损伤患者昏迷时间)
        indexPerson.setP732(zj_BASY_NSTD.getP732());
        //入院后多少小时(颅脑损伤患者昏迷时间)
        indexPerson.setP733(zj_BASY_NSTD.getP733());
        //入院后多少分钟(颅脑损伤患者昏迷时间)
        indexPerson.setP734(zj_BASY_NSTD.getP734());
        //呼吸机使用时间
        indexPerson.setP72(zj_BASY_NSTD.getP72());
        //是否有出院31天内再住院计划
        indexPerson.setP830(zj_BASY_NSTD.getP830());
        //出院31天再住院计划目的
        indexPerson.setP831(zj_BASY_NSTD.getP831());
        //离院方式
        indexPerson.setP741(zj_BASY_NSTD.getP741());
        //转入医院名称
        indexPerson.setP742(zj_BASY_NSTD.getP742());
        //转入社区服务机构/乡镇卫生院名称
        indexPerson.setP743(zj_BASY_NSTD.getP743());
        //住院总费用
        indexPerson.setP782(zj_BASY_NSTD.getP782());
        //住院总费用其中自付金额
        indexPerson.setP751(zj_BASY_NSTD.getP751());
        //一般医疗服务费
        indexPerson.setP752(zj_BASY_NSTD.getP752());
        //一般治疗操作费
        indexPerson.setP754(zj_BASY_NSTD.getP754());
        //护理费
        indexPerson.setP755(zj_BASY_NSTD.getP755());
        //综合医疗服务类其他费用
        indexPerson.setP756(zj_BASY_NSTD.getP756());
        //病理诊断费
        indexPerson.setP757(zj_BASY_NSTD.getP757());
        //实验室诊断费
        indexPerson.setP758(zj_BASY_NSTD.getP758());
        //影像学诊断费
        indexPerson.setP759(zj_BASY_NSTD.getP759());
        //临床诊断项目费
        indexPerson.setP760(zj_BASY_NSTD.getP760());
        //非手术治疗项目费
        indexPerson.setP761(zj_BASY_NSTD.getP761());
        //临床物理治疗费
        indexPerson.setP762(zj_BASY_NSTD.getP762());
        //手术治疗费
        indexPerson.setP763(zj_BASY_NSTD.getP763());
        //麻醉费
        indexPerson.setP764(zj_BASY_NSTD.getP764());
        //手术费
        indexPerson.setP765(zj_BASY_NSTD.getP765());
        //康复费
        indexPerson.setP767(zj_BASY_NSTD.getP767());
        //中医治疗费
        indexPerson.setP768(zj_BASY_NSTD.getP768());
        //西药费
        indexPerson.setP769(zj_BASY_NSTD.getP769());
        //抗菌药物费用
        indexPerson.setP770(zj_BASY_NSTD.getP770());
        //中成药费
        indexPerson.setP771(zj_BASY_NSTD.getP771());
        //中草药费
        indexPerson.setP772(zj_BASY_NSTD.getP772());
        //血费
        indexPerson.setP773(zj_BASY_NSTD.getP773());
        //白蛋白类制品费
        indexPerson.setP774(zj_BASY_NSTD.getP774());
        //球蛋白类制品费
        indexPerson.setP775(zj_BASY_NSTD.getP775());
        //凝血因子类制品费
        indexPerson.setP776(zj_BASY_NSTD.getP776());
        //细胞因子类制品费
        indexPerson.setP777(zj_BASY_NSTD.getP777());
        //检查用一次性医用材料费
        indexPerson.setP778(zj_BASY_NSTD.getP778());
        //治疗用一次性医用材料费
        indexPerson.setP779(zj_BASY_NSTD.getP779());
        //手术用一次性医用材料费
        indexPerson.setP780(zj_BASY_NSTD.getP780());
        //其他费
        indexPerson.setP781(zj_BASY_NSTD.getP781());
        /*//数据版本
        indexPerson.setDataVersion();
        //数据库来源
        indexPerson.setDataDbSource();
        //数据表来源
        indexPerson.setDataTableSource();
        //数据项来源
        indexPerson.setDataFieldSource();
        //创建时间
        indexPerson.setCreatedAt();
        //创建人
        indexPerson.setCreator();
        //修改时间
        indexPerson.setUpdatedAt();*/
        indexPersonService.saveIndexPerson(indexPerson);
    }
//    public void saveInpAdmissionStatus(TEM_INP_ADMISSION_STATUS zj_TEM_INP_ADMISSION_STATUS){
//        InpAdmissionStatus inpAdmissionStatus = new InpAdmissionStatus();
//        //标识患者身份唯一标识
//        inpAdmissionStatus.setPersonId(zj_TEM_INP_ADMISSION_STATUS.getunique_id_lv1());
//        //唯一标识
//        inpAdmissionStatus.setUniqueId(zj_TEM_INP_ADMISSION_STATUS.getunique_id_lv2());
//        //医疗机构代码
//        inpAdmissionStatus.setP900(zj_TEM_INP_ADMISSION_STATUS.getp900());
//        //患者id
//        inpAdmissionStatus.setPatientId(zj_TEM_INP_ADMISSION_STATUS.getpatient_id());
//        //住院号
//        inpAdmissionStatus.setVisitId(zj_TEM_INP_ADMISSION_STATUS.getvisit_id());
//        //主诉
//        inpAdmissionStatus.setChiefComplaint(zj_TEM_INP_ADMISSION_STATUS.getchief_complaint());
//        //现病史
//        inpAdmissionStatus.setHyPresent(zj_TEM_INP_ADMISSION_STATUS.gethy_present());
//        //既往史
//        inpAdmissionStatus.setHyPats(zj_TEM_INP_ADMISSION_STATUS.gethy_pats());
//        //个人史
//        inpAdmissionStatus.setHyIndividual(zj_TEM_INP_ADMISSION_STATUS.gethy_individual());
//        //家族史
//        inpAdmissionStatus.setHyFamily(zj_TEM_INP_ADMISSION_STATUS.gethy_family());
//        //月经史
//        inpAdmissionStatus.setMenstrualHistorySta(zj_TEM_INP_ADMISSION_STATUS.getmenstrual_history_sta());
//        //婚育史
//        inpAdmissionStatus.setHistoryOfMarrChild(zj_TEM_INP_ADMISSION_STATUS.gethistory_of_marr_child());
//        //体格检查
//        inpAdmissionStatus.setPhysicalExam(zj_TEM_INP_ADMISSION_STATUS.getphysical_exam());
//        //专科检查
//        inpAdmissionStatus.setSpecialityExam(zj_TEM_INP_ADMISSION_STATUS.getspeciality_exam());
//        //辅助检查
//        inpAdmissionStatus.setSupplementaryExam(zj_TEM_INP_ADMISSION_STATUS.getsupplementary_exam());
//        //身高
//        inpAdmissionStatus.setByHeight(zj_TEM_INP_ADMISSION_STATUS.getby_height());
//        //体重
//        inpAdmissionStatus.setByWeight(zj_TEM_INP_ADMISSION_STATUS.getby_weight());
//        //ECOG评分
//        inpAdmissionStatus.setTEcogWhops(zj_TEM_INP_ADMISSION_STATUS.gett_ecog_whops());
//        //KPS评分
//        inpAdmissionStatus.setTKps(zj_TEM_INP_ADMISSION_STATUS.gett_kps());
//        //体表面积
//        inpAdmissionStatus.setBySurfaceArea(zj_TEM_INP_ADMISSION_STATUS.getby_surface_area());
//        //疼痛评分_nrs法
//        inpAdmissionStatus.setTNrs(zj_TEM_INP_ADMISSION_STATUS.gett_nrs());
//        /*//数据版本
//        inpAdmissionStatus.setDataVersion();
//        //数据库来源
//        inpAdmissionStatus.setDataDbSource();
//        //数据表来源
//        inpAdmissionStatus.setDataTableSource();
//        //数据项来源
//        inpAdmissionStatus.setDataFieldSource();
//        //创建时间
//        inpAdmissionStatus.setCreatedAt();
//        //创建人
//        inpAdmissionStatus.setCreator();
//        //修改时间
//        inpAdmissionStatus.setUpdatedAt();*/
//        inpAdmissionStatusService.saveInpAdmissionStatus(inpAdmissionStatus);
//    }
    public void saveInspection(List<LIS_RECORD> zj_LIS_RECORD){
        for(LIS_RECORD lis_record: zj_LIS_RECORD){
            log.info("保存患者检验信息"+lis_record.getUNIQUE_ID_LV2());
            Inspection inspection = new Inspection();
            //标识患者身份唯一标识
            inspection.setPersonId(lis_record.getUNIQUE_ID_LV1());
            //唯一标识
            inspection.setUniqueId(lis_record.getUNIQUE_ID_LV2());
            //医疗机构代码
            inspection.setP900(lis_record.getP900());
            //患者id
            inspection.setPatientId(lis_record.getPATIENT_ID());
            //就诊类型
            inspection.setVisitType(lis_record.getVISIT_TYPE());
            //门诊/住院号
            inspection.setVisitId(lis_record.getVISIT_ID());
            //住院次数
            inspection.setAdmissionNumber(lis_record.getADMISSION_NUMBER());
            //检验系统编号
            inspection.setTestNo(lis_record.getTEST_NO());
            //标本类型
            inspection.setSpcmType(lis_record.getSPCM_TYPE_STD());
            //标本采样时间
            inspection.setSpcmSampleDateTime(lis_record.getSPCM_SAMPLE_DATE_TIME());
            //标本接收时间
            inspection.setSpcmReceivedDateTime(lis_record.getSPCM_RECEIVED_DATE_TIME());
            //申请时间
            inspection.setRequestedDateTime(lis_record.getREQUESTED_DATE_TIME());
            //报告时间
            inspection.setResultRptDateTime(lis_record.getRESULT_RPT_DATE_TIME());
            //检查时间
            inspection.setResultDateTime(lis_record.getRESULT_DATE_TIME());
            //打印序号
            inspection.setPrintOrder(lis_record.getPRINT_ORDER());
            //检验套餐名称
            inspection.setTestPackageName(lis_record.getTEST_PACKAGE_NAME());
            //检验项目名称
            inspection.setTestItemName(lis_record.getTEST_ITEM_NAME_STD());
            //检验结果值
            inspection.setResult(lis_record.getRESULT());
            //检验结果单位
            inspection.setUnits(lis_record.getUNITS());
            //异常标识
            inspection.setAbnormalIndicator(lis_record.getABNORMAL_INDICATOR());
            //参考区间
            inspection.setReferenceInterval(lis_record.getREFERENCE_INTERVAL());
            inspection.setSpcmTypeStd(lis_record.getSPCM_TYPE_STD());
            inspection.setTestItemNameStd(lis_record.getTEST_ITEM_NAME_STD());
           /* //数据版本
            inspection.setDataVersion();
            //数据库来源
            inspection.setDataDbSource();
            //数据表来源
            inspection.setDataTableSource();
            //数据项来源
            inspection.setDataFieldSource();
            //创建时间
            inspection.setCreatedAt();
            //创建人
            inspection.setCreator();
            //修改时间
            inspection.setUpdatedAt();*/
            inspectionService.saveInspection(inspection);
        }

    }
    public void saveExamMaster(List<EXAM_MASTER> zj_EXAM_MASTER){

        for(EXAM_MASTER zj_EXAM: zj_EXAM_MASTER){
            log.info("保存患者检查信息"+zj_EXAM.getUNIQUE_ID_LV2());
            ExamMaster examMaster = new ExamMaster();
            //标识患者身份唯一标识
            examMaster.setPersonId(zj_EXAM.getUNIQUE_ID_LV1());
            //唯一标识
            examMaster.setUniqueId(zj_EXAM.getUNIQUE_ID_LV2());
            //医疗机构代码
            examMaster.setP900(zj_EXAM.getP900());
            //患者id
            examMaster.setPatientId(zj_EXAM.getPATIENT_ID());
            //就诊标识住院号
            examMaster.setVisitId(zj_EXAM.getVISIT_ID());
            //检查号
            examMaster.setExamNo(zj_EXAM.getEXAM_NO());
            //检查类型
            examMaster.setExamClass(zj_EXAM.getEXAM_CLASS());
            //检查部位
            examMaster.setExamPosition(zj_EXAM.getEXAM_POSITION());
            //检查项目
            examMaster.setExamName(zj_EXAM.getENTRY_NAME());
            //活检病理
            examMaster.setExamPara(zj_EXAM.getEXAM_PARA());
            //送检日期
            examMaster.setExamDateTime(zj_EXAM.getEXAM_DATE_TIME());
            //报告日期
            examMaster.setReportDateTime(zj_EXAM.getREPORT_DATE_TIME());
            //检查所见
            examMaster.setDescription(zj_EXAM.getDESCRIPTION());
            //检查结论
            examMaster.setEntryResults(zj_EXAM.getENTRY_RESULTS());
          /*  //数据版本
            examMaster.setDataVersion();
            //数据库来源
            examMaster.setDataDbSource();
            //数据表来源
            examMaster.setDataTableSource();
            //数据项来源
            examMaster.setDataFieldSource();
            //创建时间
            examMaster.setCreatedAt();
            //创建人
            examMaster.setCreator();
            //修改时间
            examMaster.setUpdatedAt();*/
            examMasterService.saveExamMaster(examMaster);
        }


    }
    public void saveExamMasterStd(List<EXAM_MASTER> zj_EXAM_MASTER){
        for(EXAM_MASTER exam_master: zj_EXAM_MASTER){
            log.info("保存患者检查标化信息"+exam_master.getUNIQUE_ID_LV2());
            Map<Integer, String> classstdMap = new HashMap<>();
            if(exam_master.getEXAM_NAME1_STD()!=null){
                String[] names = exam_master.getEXAM_NAME1_STD().split(";");
                Map<Integer, String> structureMap = new HashMap<>();
                Map<Integer, String> modesMap = new HashMap<>();

                if(exam_master.getSTRUCTURE1_STD()!=null){
                    String[] structures = exam_master.getSTRUCTURE1_STD().split(";");
                    for (int i = 0; i < structures.length; i++) {
                        structureMap.put(i, structures[i]);
                    }
                }
                if(exam_master.getEXAM_MODE1_STD()!=null){
                    String[] modes = exam_master.getEXAM_MODE1_STD().split(";");
                    for (int i = 0; i < modes.length; i++) {
                        modesMap.put(i, modes[i]);
                    }
                }
                if(exam_master.getEXAM_CLASS_STD()!=null){
                    String[] classstds= exam_master.getEXAM_CLASS_STD().split(";");
                    for (int i = 0; i < classstds.length; i++) {
                        classstdMap.put(i, classstds[i]);
                    }
                }

                List<String> ListName = new ArrayList<>();
                if (names != null && !"".equals(names) && names.length > 0) {
                    for (String name : names) {
                        if (!"无效".equals(name)) {
                            ListName.add(name);
                        }
                    }
                }

                for (int i = 0; i < ListName.size(); i++) {
                    ExamMasterStd examMasterStd = new ExamMasterStd();
                    //标识患者身份唯一标识
                    examMasterStd.setPersonId(exam_master.getUNIQUE_ID_LV1());
                    //唯一标识
                    examMasterStd.setUniqueId(exam_master.getUNIQUE_ID_LV2());
                    //医疗机构代码
                    examMasterStd.setP900(exam_master.getP900());
                    //患者id
                    examMasterStd.setPatientId(exam_master.getPATIENT_ID());
                    //就诊标识住院号
                    examMasterStd.setVisitId(exam_master.getVISIT_ID());
                    //检查号
                    examMasterStd.setExamNo(exam_master.getEXAM_NO());
                    if (classstdMap.get(i) != null) {
                        //检查类型标化
                        examMasterStd.setExamClassStd(classstdMap.get(i));
                    } else {
                        //检查类型标化
                        examMasterStd.setExamClassStd(classstdMap.get(i));
                    }

                    //检查方式标化
                    examMasterStd.setExamModeStd(modesMap.get(i));
                    //检查部位标化
                    examMasterStd.setStructureStd(structureMap.get(i));
                    //检查名称标化
                    examMasterStd.setExamNameStd(ListName.get(i));
                /*//数据版本
                examMasterStd.setDataVersion();
                //数据库来源
                examMasterStd.setDataDbSource();
                //数据表来源
                examMasterStd.setDataTableSource();
                //数据项来源
                examMasterStd.setDataFieldSource();
                //创建时间
                examMasterStd.setCreatedAt();
                //创建人
                examMasterStd.setCreator();
                //修改时间
                examMasterStd.setUpdatedAt();*/
                    examMasterStdService.saveExamMasterStd(examMasterStd);
                }
            }
            if(exam_master.getEXAM_NAME2_STD()!=null){
                String[] names = exam_master.getEXAM_NAME2_STD().split(";");
                Map<Integer, String> structureMap = new HashMap<>();
                Map<Integer, String> modesMap = new HashMap<>();

                if(exam_master.getSTRUCTURE2_STD()!=null){
                    String[] structures = exam_master.getSTRUCTURE2_STD().split(";");
                    for (int i = 0; i < structures.length; i++) {
                        structureMap.put(i, structures[i]);
                    }
                }
                if(exam_master.getEXAM_MODE2_STD()!=null){
                    String[] modes = exam_master.getEXAM_MODE2_STD().split(";");
                    for (int i = 0; i < modes.length; i++) {
                        modesMap.put(i, modes[i]);
                    }
                }


                List<String> ListName = new ArrayList<>();
                if (names != null && !"".equals(names) && names.length > 0) {
                    for (String name : names) {
                        if (!"无效".equals(name)) {
                            ListName.add(name);
                        }
                    }
                }

                for (int i = 0; i < ListName.size(); i++) {
                    ExamMasterStd examMasterStd = new ExamMasterStd();
                    //标识患者身份唯一标识
                    examMasterStd.setPersonId(exam_master.getUNIQUE_ID_LV1());
                    //唯一标识
                    examMasterStd.setUniqueId(exam_master.getUNIQUE_ID_LV2());
                    //医疗机构代码
                    examMasterStd.setP900(exam_master.getP900());
                    //患者id
                    examMasterStd.setPatientId(exam_master.getPATIENT_ID());
                    //就诊标识住院号
                    examMasterStd.setVisitId(exam_master.getVISIT_ID());
                    //检查号
                    examMasterStd.setExamNo(exam_master.getEXAM_NO());
                    //检查类型标化
                    examMasterStd.setExamClassStd(classstdMap.get(0));
                    //检查方式标化
                    examMasterStd.setExamModeStd(modesMap.get(i));
                    //检查部位标化
                    examMasterStd.setStructureStd(structureMap.get(i));
                    //检查名称标化
                    examMasterStd.setExamNameStd(ListName.get(i));
                /*//数据版本
                examMasterStd.setDataVersion();
                //数据库来源
                examMasterStd.setDataDbSource();
                //数据表来源
                examMasterStd.setDataTableSource();
                //数据项来源
                examMasterStd.setDataFieldSource();
                //创建时间
                examMasterStd.setCreatedAt();
                //创建人
                examMasterStd.setCreator();
                //修改时间
                examMasterStd.setUpdatedAt();*/
                    examMasterStdService.saveExamMasterStd(examMasterStd);
                }
            }
            if(exam_master.getEXAM_NAME3_STD()!=null){
                String[] names = exam_master.getEXAM_NAME3_STD().split(";");
                Map<Integer, String> structureMap = new HashMap<>();
                Map<Integer, String> modesMap = new HashMap<>();

                if(exam_master.getSTRUCTURE3_STD()!=null){
                    String[] structures = exam_master.getSTRUCTURE3_STD().split(";");
                    for (int i = 0; i < structures.length; i++) {
                        structureMap.put(i, structures[i]);
                    }
                }
                if(exam_master.getEXAM_MODE3_STD()!=null){
                    String[] modes = exam_master.getEXAM_MODE3_STD().split(";");
                    for (int i = 0; i < modes.length; i++) {
                        modesMap.put(i, modes[i]);
                    }
                }


                List<String> ListName = new ArrayList<>();
                if (names != null && !"".equals(names) && names.length > 0) {
                    for (String name : names) {
                        if (!"无效".equals(name)) {
                            ListName.add(name);
                        }
                    }
                }

                for (int i = 0; i < ListName.size(); i++) {
                    ExamMasterStd examMasterStd = new ExamMasterStd();
                    //标识患者身份唯一标识
                    examMasterStd.setPersonId(exam_master.getUNIQUE_ID_LV1());
                    //唯一标识
                    examMasterStd.setUniqueId(exam_master.getUNIQUE_ID_LV2());
                    //医疗机构代码
                    examMasterStd.setP900(exam_master.getP900());
                    //患者id
                    examMasterStd.setPatientId(exam_master.getPATIENT_ID());
                    //就诊标识住院号
                    examMasterStd.setVisitId(exam_master.getVISIT_ID());
                    //检查号
                    examMasterStd.setExamNo(exam_master.getEXAM_NO());
                    //检查类型标化
                    examMasterStd.setExamClassStd(classstdMap.get(0));
                    //检查方式标化
                    examMasterStd.setExamModeStd(modesMap.get(i));
                    //检查部位标化
                    examMasterStd.setStructureStd(structureMap.get(i));
                    //检查名称标化
                    examMasterStd.setExamNameStd(ListName.get(i));
                /*//数据版本
                examMasterStd.setDataVersion();
                //数据库来源
                examMasterStd.setDataDbSource();
                //数据表来源
                examMasterStd.setDataTableSource();
                //数据项来源
                examMasterStd.setDataFieldSource();
                //创建时间
                examMasterStd.setCreatedAt();
                //创建人
                examMasterStd.setCreator();
                //修改时间
                examMasterStd.setUpdatedAt();*/
                    examMasterStdService.saveExamMasterStd(examMasterStd);
                }
            }
            if(exam_master.getEXAM_NAME4_STD()!=null){
                String[] names = exam_master.getEXAM_NAME4_STD().split(";");
                Map<Integer, String> structureMap = new HashMap<>();
                Map<Integer, String> modesMap = new HashMap<>();

                if(exam_master.getSTRUCTURE4_STD()!=null){
                    String[] structures = exam_master.getSTRUCTURE4_STD().split(";");
                    for (int i = 0; i < structures.length; i++) {
                        structureMap.put(i, structures[i]);
                    }
                }
                if(exam_master.getEXAM_MODE4_STD()!=null){
                    String[] modes = exam_master.getEXAM_MODE4_STD().split(";");
                    for (int i = 0; i < modes.length; i++) {
                        modesMap.put(i, modes[i]);
                    }
                }


                List<String> ListName = new ArrayList<>();
                if (names != null && !"".equals(names) && names.length > 0) {
                    for (String name : names) {
                        if (!"无效".equals(name)) {
                            ListName.add(name);
                        }
                    }
                }

                for (int i = 0; i < ListName.size(); i++) {
                    ExamMasterStd examMasterStd = new ExamMasterStd();
                    //标识患者身份唯一标识
                    examMasterStd.setPersonId(exam_master.getUNIQUE_ID_LV1());
                    //唯一标识
                    examMasterStd.setUniqueId(exam_master.getUNIQUE_ID_LV2());
                    //医疗机构代码
                    examMasterStd.setP900(exam_master.getP900());
                    //患者id
                    examMasterStd.setPatientId(exam_master.getPATIENT_ID());
                    //就诊标识住院号
                    examMasterStd.setVisitId(exam_master.getVISIT_ID());
                    //检查号
                    examMasterStd.setExamNo(exam_master.getEXAM_NO());
                    //检查类型标化
                    examMasterStd.setExamClassStd(classstdMap.get(0));
                    //检查方式标化
                    examMasterStd.setExamModeStd(modesMap.get(i));
                    //检查部位标化
                    examMasterStd.setStructureStd(structureMap.get(i));
                    //检查名称标化
                    examMasterStd.setExamNameStd(ListName.get(i));
                /*//数据版本
                examMasterStd.setDataVersion();
                //数据库来源
                examMasterStd.setDataDbSource();
                //数据表来源
                examMasterStd.setDataTableSource();
                //数据项来源
                examMasterStd.setDataFieldSource();
                //创建时间
                examMasterStd.setCreatedAt();
                //创建人
                examMasterStd.setCreator();
                //修改时间
                examMasterStd.setUpdatedAt();*/
                    examMasterStdService.saveExamMasterStd(examMasterStd);
                }
            }
            if(exam_master.getEXAM_NAME5_STD()!=null){
                String[] names = exam_master.getEXAM_NAME5_STD().split(";");
                Map<Integer, String> structureMap = new HashMap<>();
                Map<Integer, String> modesMap = new HashMap<>();

                if(exam_master.getSTRUCTURE5_STD()!=null){
                    String[] structures = exam_master.getSTRUCTURE5_STD().split(";");
                    for (int i = 0; i < structures.length; i++) {
                        structureMap.put(i, structures[i]);
                    }
                }
                if(exam_master.getEXAM_MODE5_STD()!=null){
                    String[] modes = exam_master.getEXAM_MODE5_STD().split(";");
                    for (int i = 0; i < modes.length; i++) {
                        modesMap.put(i, modes[i]);
                    }
                }


                List<String> ListName = new ArrayList<>();
                if (names != null && !"".equals(names) && names.length > 0) {
                    for (String name : names) {
                        if (!"无效".equals(name)) {
                            ListName.add(name);
                        }
                    }
                }

                for (int i = 0; i < ListName.size(); i++) {
                    ExamMasterStd examMasterStd = new ExamMasterStd();
                    //标识患者身份唯一标识
                    examMasterStd.setPersonId(exam_master.getUNIQUE_ID_LV1());
                    //唯一标识
                    examMasterStd.setUniqueId(exam_master.getUNIQUE_ID_LV2());
                    //医疗机构代码
                    examMasterStd.setP900(exam_master.getP900());
                    //患者id
                    examMasterStd.setPatientId(exam_master.getPATIENT_ID());
                    //就诊标识住院号
                    examMasterStd.setVisitId(exam_master.getVISIT_ID());
                    //检查号
                    examMasterStd.setExamNo(exam_master.getEXAM_NO());
                    //检查类型标化
                    examMasterStd.setExamClassStd(classstdMap.get(0));
                    //检查方式标化
                    examMasterStd.setExamModeStd(modesMap.get(i));
                    //检查部位标化
                    examMasterStd.setStructureStd(structureMap.get(i));
                    //检查名称标化
                    examMasterStd.setExamNameStd(ListName.get(i));
                /*//数据版本
                examMasterStd.setDataVersion();
                //数据库来源
                examMasterStd.setDataDbSource();
                //数据表来源
                examMasterStd.setDataTableSource();
                //数据项来源
                examMasterStd.setDataFieldSource();
                //创建时间
                examMasterStd.setCreatedAt();
                //创建人
                examMasterStd.setCreator();
                //修改时间
                examMasterStd.setUpdatedAt();*/
                    examMasterStdService.saveExamMasterStd(examMasterStd);
                }
            }
            if(exam_master.getEXAM_NAME6_STD()!=null){
                String[] names = exam_master.getEXAM_NAME6_STD().split(";");
                Map<Integer, String> structureMap = new HashMap<>();
                Map<Integer, String> modesMap = new HashMap<>();

                if(exam_master.getSTRUCTURE6_STD()!=null){
                    String[] structures = exam_master.getSTRUCTURE6_STD().split(";");
                    for (int i = 0; i < structures.length; i++) {
                        structureMap.put(i, structures[i]);
                    }
                }
                if(exam_master.getEXAM_MODE6_STD()!=null){
                    String[] modes = exam_master.getEXAM_MODE6_STD().split(";");
                    for (int i = 0; i < modes.length; i++) {
                        modesMap.put(i, modes[i]);
                    }
                }


                List<String> ListName = new ArrayList<>();
                if (names != null && !"".equals(names) && names.length > 0) {
                    for (String name : names) {
                        if (!"无效".equals(name)) {
                            ListName.add(name);
                        }
                    }
                }

                for (int i = 0; i < ListName.size(); i++) {
                    ExamMasterStd examMasterStd = new ExamMasterStd();
                    //标识患者身份唯一标识
                    examMasterStd.setPersonId(exam_master.getUNIQUE_ID_LV1());
                    //唯一标识
                    examMasterStd.setUniqueId(exam_master.getUNIQUE_ID_LV2());
                    //医疗机构代码
                    examMasterStd.setP900(exam_master.getP900());
                    //患者id
                    examMasterStd.setPatientId(exam_master.getPATIENT_ID());
                    //就诊标识住院号
                    examMasterStd.setVisitId(exam_master.getVISIT_ID());
                    //检查号
                    examMasterStd.setExamNo(exam_master.getEXAM_NO());
                    //检查类型标化
                    examMasterStd.setExamClassStd(classstdMap.get(0));
                    //检查方式标化
                    examMasterStd.setExamModeStd(modesMap.get(i));
                    //检查部位标化
                    examMasterStd.setStructureStd(structureMap.get(i));
                    //检查名称标化
                    examMasterStd.setExamNameStd(ListName.get(i));
                /*//数据版本
                examMasterStd.setDataVersion();
                //数据库来源
                examMasterStd.setDataDbSource();
                //数据表来源
                examMasterStd.setDataTableSource();
                //数据项来源
                examMasterStd.setDataFieldSource();
                //创建时间
                examMasterStd.setCreatedAt();
                //创建人
                examMasterStd.setCreator();
                //修改时间
                examMasterStd.setUpdatedAt();*/
                    examMasterStdService.saveExamMasterStd(examMasterStd);
                }
            }
        }

    }


    public void saveHisMarriage(List<TEM_INP_ADMISSION_STATUS> zj_TEM_INP_ADMISSION_STATUS){
        String MarriageChildbirth="";
        String MenstrualHistorySta="";
        for(TEM_INP_ADMISSION_STATUS inp: zj_TEM_INP_ADMISSION_STATUS){
           if(inp.gethistory_of_marr_child()!=null){
               MarriageChildbirth=inp.gethistory_of_marr_child();
           }
            if(inp.gethistory_of_marr_child()!=null){
                MenstrualHistorySta=inp.getmenstrual_history_sta();
            }
        }
        log.info("保存患者婚育史信息"+zj_TEM_INP_ADMISSION_STATUS.get(0).getunique_id_lv2());
        HisMarriage hisMarriage = new HisMarriage();
        //标识患者身份唯一标识
        hisMarriage.setPersonId(zj_TEM_INP_ADMISSION_STATUS.get(0).getunique_id_lv1());
        //唯一标识
        hisMarriage.setUniqueId(zj_TEM_INP_ADMISSION_STATUS.get(0).getunique_id_lv2());
        //医疗机构代码
        hisMarriage.setP900(zj_TEM_INP_ADMISSION_STATUS.get(0).getp900());
        //患者id
        hisMarriage.setPatientId(zj_TEM_INP_ADMISSION_STATUS.get(0).getpatient_id());
        //住院号
        hisMarriage.setVisitId(zj_TEM_INP_ADMISSION_STATUS.get(0).getvisit_id());
        //婚育史
        hisMarriage.setMarriageChildbirth(MarriageChildbirth);
        hisMarriage.setMenstrualHistorySta(MenstrualHistorySta);
        //修改时间
        hisMarriage.setUpdatedAt(new Date());
        hisMarriageService.saveHisMarriage(hisMarriage);
    }
    public void savePersonGeneral(List<NURSING_RECORD> zj_NURSING_RECORD,List<VITAL_RECORD> zj_VITAL_RECORD){

        DateFormat format=new SimpleDateFormat("yyyy-MM-dd");
        Map<String,String> map=new HashMap<>();
        if(zj_VITAL_RECORD!=null&&zj_VITAL_RECORD.size()>0){
            for(VITAL_RECORD vital_record:zj_VITAL_RECORD){
                if(vital_record.getEXAM_TIME()!=null&&vital_record.getEXAM_RESULT()!=null){
                    String date= format.format( vital_record.getEXAM_TIME());
                    map.put(date,vital_record.getEXAM_RESULT());
                }

            }
        }



        for(NURSING_RECORD nursing_record:zj_NURSING_RECORD){
            PersonGeneral personGeneral = new PersonGeneral();
            if (zj_VITAL_RECORD.size()!=0){
                log.info("保存患者一般情况"+zj_VITAL_RECORD.get(0).getUNIQUE_ID_LV2());
                //标识患者身份唯一标识
                personGeneral.setPersonId(zj_VITAL_RECORD.get(0).getUNIQUE_ID_LV1());
                //唯一标识
                personGeneral.setUniqueId(zj_VITAL_RECORD.get(0).getUNIQUE_ID_LV2());
                //医疗机构代码
                personGeneral.setP900(zj_VITAL_RECORD.get(0).getP900());
                //患者id
                personGeneral.setPatientId(zj_VITAL_RECORD.get(0).getPATIENT_ID());
                //住院号
                personGeneral.setVisitId(zj_VITAL_RECORD.get(0).getVISIT_ID());
                //日期
                personGeneral.setRecordTime(zj_VITAL_RECORD.get(0).getEXAM_TIME());
            }
             if(nursing_record!=null&&nursing_record.getBREATHING_FREQUENCY()!=null&&nursing_record.getSYSTOLIC_BLOOD_PRESSURE()!=null&&nursing_record.getDIASTOLIC_BLOOD_PRESSURE()!=null){

                if(nursing_record.getBODY_TEMPERATURE()!=null){
                    try {
                        Double temp = Double.parseDouble(nursing_record.getBODY_TEMPERATURE());
                        personGeneral.setBodyTemperature(temp);
                    }catch (Exception e){

                    }
                }else{
                   String date =format.format(nursing_record.getNURSE_SIGNATURE_TIME());
                   String temperature=  map.get(date);
                   try{
                       Double temp = Double.parseDouble(temperature);
                       personGeneral.setBodyTemperature(temp);
                   }catch (Exception e){

                   }
                }

                try {
                    Integer temp = Integer.parseInt(nursing_record.getBREATHING_FREQUENCY());
                    personGeneral.setBreathingFrequency(temp);
                }catch (Exception e){

                }

                try {
                    Integer temp = Integer.parseInt(nursing_record.getPULSE());
                    personGeneral.setHeartRate(temp);
                }catch (Exception e){

                }
//                 personGeneral.setSystolicBloodPressure(nursing_record.getSYSTOLIC_BLOOD_PRESSURE());
//                 personGeneral.setDiastolicBloodPressure(nursing_record.getDIASTOLIC_BLOOD_PRESSURE());
                 personGeneral.setRecordTime(nursing_record.getNURSE_SIGNATURE_TIME());

                 //舒张压(低压)，收缩压(高压)
                 String lowPressure = nursing_record.getDIASTOLIC_BLOOD_PRESSURE();
                 String[] lowPressures=lowPressure.split("/");
                 if (lowPressures.length==2){
                     String highString = lowPressures[0];
                     String lowString = lowPressures[1];
                     int lowInt=-1;
                     int highInt =-1;
                     try{
                         lowInt = Integer.parseInt(lowString);
                         highInt = Integer.parseInt(highString);
                     }catch (Exception e){

                     }
                     if (lowInt>highInt){
                         int temp;
                         temp = lowInt;
                         lowInt = highInt;
                         highInt = lowInt;
                     }
                     if (lowInt>=0&&lowInt<300&&highInt>=0&&highInt<300){
                         personGeneral.setDiastolicBloodPressure(lowInt);
                         personGeneral.setSystolicBloodPressure(highInt);
                     }
                 }
                 personGeneralService.savePersonGeneral(personGeneral);
             }
            //personGeneralService.savePersonGeneral(personGeneral);

        }
    }
    public void saveDiagnosis(List<INP_DIAGNOSIS>  zj_INP_DIAGNOSIS){

        List<String> ICD10LIST= Constant.getICD10LIST();
        for(INP_DIAGNOSIS inp_diagnosis : zj_INP_DIAGNOSIS){
            log.info("保存患者诊断信息"+inp_diagnosis.getUNIQUE_ID_LV2());

            if(inp_diagnosis.getDIAGNOSIS_DESC()!=null&&inp_diagnosis.getDIAGNOSIS_CODE()!=null&&!"".equals(inp_diagnosis.getDIAGNOSIS_CODE())&&inp_diagnosis.getDIAGNOSIS_CODE().length()>=3){
                String ICD10_ID1=inp_diagnosis.getDIAGNOSIS_CODE().substring(0,3);
                if(ICD10LIST.contains(ICD10_ID1)&&inp_diagnosis!=null){
                    Diagnosis diagnosis = new Diagnosis();
                    //标识患者身份唯一标识
                    diagnosis.setPersonId(inp_diagnosis.getUNIQUE_ID_LV1());
                    //唯一标识
                    diagnosis.setUniqueId(inp_diagnosis.getUNIQUE_ID_LV2());
                    //医疗机构代码
                    diagnosis.setP900(inp_diagnosis.getP900());
                    //患者id
                    diagnosis.setPatientId(inp_diagnosis.getPATIENT_ID());
                    //住院门诊号
                    diagnosis.setVisitId(inp_diagnosis.getVISIT_ID());
                    //诊断日期
                    diagnosis.setDiagnosisDate(inp_diagnosis.getDIAGNOSIS_DATE());
                    //诊断名称
                    diagnosis.setDiagnosisName(inp_diagnosis.getDIAGNOSIS_DESC());
                    //诊断类型
                    diagnosis.setDiagnosisType(inp_diagnosis.getDIAGNOSIS_TYPE());

                    //出现转移
                    if(inp_diagnosis.getDIAGNOSIS_DESC().contains("继发")){
                        if(inp_diagnosis.getDIAGNOSIS_DESC().contains("可疑")){
                            diagnosis.setIfTransfer("未知");
                        }else{
                            diagnosis.setIfTransfer("是");
                        }
                        String part= inp_diagnosis.getDIAGNOSIS_DESC().split("继发")[0];

                        //转移部位
                        if(part.contains("脑")){
                            diagnosis.setTransferPosition("脑");
                        }else if(part.contains("肺")){
                            diagnosis.setTransferPosition("肺");
                        }else if(part.contains("肝")){
                            diagnosis.setTransferPosition("肝");
                        }else if(part.contains("骨")){
                            diagnosis.setTransferPosition("骨");
                        }else if(part.contains("淋巴结")){
                            diagnosis.setTransferPosition("淋巴结");
                        }else if(part.contains("骨")){
                            diagnosis.setTransferPosition("骨");
                        }

                    }else{
                        diagnosis.setIfTransfer("否");
                    }

                    if(inp_diagnosis.getDIAGNOSIS_DESC().contains("复发")||inp_diagnosis.getDIAGNOSIS_DESC().contains("继发")){

                        //复发
                        diagnosis.setIfRecrudescence("是");
                        diagnosis.setRecrudescenceType("局部复发");
                        //复发或转移时间
                        diagnosis.setRecrudescenceDate(inp_diagnosis.getDIAGNOSIS_DATE());
                        //复发形式
                        if(inp_diagnosis.getDIAGNOSIS_DESC().contains("继发")&&!inp_diagnosis.getDIAGNOSIS_DESC().contains("胃")){
                            diagnosis.setRecrudescenceType("远处转移");
                        }


                    }else{
                        diagnosis.setIfRecrudescence("否");
                    }

                    diagnosisService.saveDiagnosis(diagnosis);
                }
            }




        }

    }
    public void saveDiagnosisStage(List<INP_DIAGNOSIS> zj_INP_DIAGNOSIS) {
        DiagnosisStage diagnosisStage;
        for(INP_DIAGNOSIS inpDiagnosis:zj_INP_DIAGNOSIS){
            if(inpDiagnosis.getDIAGNOSIS_DESC() != null && inpDiagnosis.getDIAGNOSIS_DESC().contains("T") &&
                    inpDiagnosis.getDIAGNOSIS_DESC().contains("N") && inpDiagnosis.getDIAGNOSIS_DESC().contains("M")){
                String tnm = DrugConstant.getTNM(inpDiagnosis.getDIAGNOSIS_DESC());
                System.out.println("TNM分期：" + tnm);
                diagnosisStage = new DiagnosisStage();
                //标识患者身份唯一标识
                diagnosisStage.setPersonId(inpDiagnosis.getUNIQUE_ID_LV1());
                //唯一标识
                diagnosisStage.setUniqueId(inpDiagnosis.getUNIQUE_ID_LV2());
                diagnosisStage.setUniqueIdLv3(inpDiagnosis.getUNIQUE_ID());
                //医疗机构代码
                diagnosisStage.setP900(inpDiagnosis.getP900());
                //患者id
                diagnosisStage.setPatientId(inpDiagnosis.getPATIENT_ID());
                //住院门诊号
                diagnosisStage.setVisitId(inpDiagnosis.getVISIT_ID());
                diagnosisStage.setDiagName(inpDiagnosis.getDIAGNOSIS_DESC());
//                diagnosisStage.setDiagNameStd(inpDiagnosis.);
                //T分期
                diagnosisStage.setTStage(DrugConstant.getT(tnm));
                //N分期
                diagnosisStage.setNStage(DrugConstant.getN(tnm));
                //M分期
                diagnosisStage.setMStage(DrugConstant.getM(tnm));
                //TNM综合分期
                diagnosisStage.setTnmStage(tnm + " " + DrugConstant.getTNM_a(inpDiagnosis.getDIAGNOSIS_DESC()));
                //数据版本
//                diagnosisStage.setDataVersion();
//                //数据库来源
//                diagnosisStage.setDataDbSource();
//                //数据表来源
//                diagnosisStage.setDataTableSource();
//                //数据项来源
//                diagnosisStage.setDataFieldSource();
//                //创建时间
//                diagnosisStage.setCreatedAt();
//                //创建人
//                diagnosisStage.setCreator();
//                //修改时间
//                diagnosisStage.setUpdatedAt();
                diagnosisStageService.saveDiagnosisStage(diagnosisStage);
            }

        }

    }
    public void saveConsultation(String  patientId,String visitId,List<INP_CONSULTATION_DOCTOR_DETAIL> zj_INP_CONSULTATION_DOCTOR_DETAIL){

        for(INP_CONSULTATION_DOCTOR_DETAIL inp_consultation :  zj_INP_CONSULTATION_DOCTOR_DETAIL){
            log.info("保存患者会诊信息"+inp_consultation.getunique_id_lv2());
            Consultation consultation = new Consultation();
            //标识患者身份唯一标识
            consultation.setPersonId(inp_consultation.getunique_id_lv1());
            //唯一标识
            consultation.setUniqueId(inp_consultation.getunique_id_lv2());
            //医疗机构代码
            consultation.setP900(inp_consultation.getp900());
            //患者id
            consultation.setPatientId(patientId);
            //住院号
            consultation.setVisitId(visitId);
            //会诊日期
            consultation.setAffirmDateTime(inp_consultation.getaffirm_date_time());
            //会诊科室
            consultation.setConsultationDept(inp_consultation.getconsultation_dept());
            //会诊结果
            consultation.setConsultIdea(inp_consultation.getconsult_idea());
           /* //数据版本
            consultation.setDataVersion();
            //数据库来源
            consultation.setDataDbSource();
            //数据表来源
            consultation.setDataTableSource();
            //数据项来源
            consultation.setDataFieldSource();

            //创建人
            consultation.setCreator();
            //修改时间
            */
            //创建时间
            Date date=new Date();
            consultation.setCreatedAt(date);
            consultation.setUpdatedAt(date);
            consultationService.saveConsultation(consultation);
        }


    }

    public void saveHisPerson(List<POSSIBLE_CAUSE> zj_POSSIBLE_CAUSE, List<TEM_INP_ADMISSION_STATUS> zj_TEM_INP_ADMISSION_STATUS){
        log.info("保存个人史："+zj_POSSIBLE_CAUSE.get(0).getUNIQUE_ID());

        HisPerson hisPerson = new HisPerson();
        //标识患者身份唯一标识
        hisPerson.setPersonId(zj_POSSIBLE_CAUSE.get(0).getUNIQUE_ID_LV1());
        //唯一标识
        hisPerson.setUniqueId(zj_POSSIBLE_CAUSE.get(0).getUNIQUE_ID_LV2());
        //医疗机构代码
        hisPerson.setP900(zj_POSSIBLE_CAUSE.get(0).getP900());
        //患者id
        hisPerson.setPatientId(zj_POSSIBLE_CAUSE.get(0).getPATIENT_ID());
        //住院号
        hisPerson.setVisitId(zj_POSSIBLE_CAUSE.get(0).getVISIT_ID());

        if(zj_TEM_INP_ADMISSION_STATUS!=null){
            BigDecimal wight=new BigDecimal(zj_TEM_INP_ADMISSION_STATUS.get(0).getby_weight());
            BigDecimal height=new BigDecimal(zj_TEM_INP_ADMISSION_STATUS.get(0).getby_height());

            if(wight!=null&&height!=null){
                BigDecimal fat=   wight.divide((height.multiply(height)));
                //肥胖
                hisPerson.setFat(fat.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());

                Double area=((0.61*height.doubleValue())+((0.0128*wight.doubleValue()))-0.1529);

                //体表面积
                hisPerson.setBodyarea(area);

            }

        }





        for(POSSIBLE_CAUSE possible_cause: zj_POSSIBLE_CAUSE){

            if(possible_cause.getSMOKER_STD()==null){
                //吸烟
                hisPerson.setSmoke("是");
                    //吸烟年限
                    hisPerson.setSmokeYear(possible_cause.getYEAR_OF_SMOKE_STD());

                    //吸烟量
                    hisPerson.setDailySmoke(possible_cause.getSMOKE_PER_TIME_STD()+","+possible_cause.getSMOKE_COUNT_STD());

            }else{
                //吸烟
                hisPerson.setSmoke("否");
            }


            if(possible_cause.getSMOKE_QUITTER_STD()!=null){
                //戒烟
                hisPerson.setStopSmoke("是");
                hisPerson.setStopSmokeYear(possible_cause.getYEAR_OF_DRINK_QUITTING_STD());
            }


            if(possible_cause.getDRINKER_STD()==null){
                //饮酒
                hisPerson.setDrink("是");
                //饮酒年限
                hisPerson.setDrinkYear(possible_cause.getYEAR_OF_DRINK_STD());
                //饮酒量
                hisPerson.setDailyDrink(possible_cause.getDRINK_TYPE1_STD()+":"+possible_cause.getDRINK_PER_TIME1_STD()+","+possible_cause.getDRINK_COUNT1_STD());
                //饮酒量
                hisPerson.setDailyDrink(possible_cause.getDRINK_TYPE2_STD()+":"+possible_cause.getDRINK_PER_TIME2_STD()+","+possible_cause.getDRINK_COUNT2_STD()+" "+hisPerson.getDailyDrink());

            }


            if(possible_cause.getDRINK_QUITTER_STD()!=null){

                //戒酒
                hisPerson.setStopDrink("是");
                //戒酒年限
                hisPerson.setStopDrinkYear(possible_cause.getYEAR_OF_DRINK_QUITTING_STD());
            }


        }












      /*  //数据版本
        hisPerson.setDataVersion();
        //数据库来源
        hisPerson.setDataDbSource();
        //数据表来源
        hisPerson.setDataTableSource();
        //数据项来源
        hisPerson.setDataFieldSource();
        //创建时间
        hisPerson.setCreatedAt();
        //创建人
        hisPerson.setCreator();*/
        //修改时间
        hisPerson.setUpdatedAt(new Date());
        hisPersonService.saveHisPerson(hisPerson);


    }
    public void saveHisFamily( List<FAMILY_HISTORY> zj_FAMILY_HISTORY ){

        log.info("保存家族史："+ zj_FAMILY_HISTORY.get(0).getUNIQUE_ID());
        HisFamily hisFamily = new HisFamily();
        //标识患者身份唯一标识
        hisFamily.setPersonId(zj_FAMILY_HISTORY.get(0).getUNIQUE_ID_LV1());
        //唯一标识
        hisFamily.setUniqueId(zj_FAMILY_HISTORY.get(0).getUNIQUE_ID_LV2());
        //医疗机构代码
        hisFamily.setP900(zj_FAMILY_HISTORY.get(0).getP900());
        //患者id
        hisFamily.setPatientId(zj_FAMILY_HISTORY.get(0).getPATIENT_ID());
        //住院号
        hisFamily.setVisitId(zj_FAMILY_HISTORY.get(0).getVISIT_ID());

        Boolean flag=true;

        boolean isNot=false;

        for(FAMILY_HISTORY family_history: zj_FAMILY_HISTORY){

           if(family_history.getWHETHER_STD()!=null){
               isNot=true;
           }

            if(family_history.getICD10_NAME1()!=null){
                if(family_history.getWHETHER_STD()==null&&(family_history.getICD10_NAME1().contains("肿瘤")
                        ||family_history.getICD10_NAME1().contains("癌")||family_history.getICD10_NAME1().contains("淋巴瘤")
                        ||family_history.getICD10_NAME1().contains("白血病"))){
                    //肿瘤家族史
                    hisFamily.setFamilyTumour("是");
                    //肿瘤血缘亲属与患者的关系
                    hisFamily.setTumourRelative(family_history.getRELATION_STD());

                    //肿瘤血缘亲属肿瘤疾病名称
                    hisFamily.setRelativeTumourName(family_history.getICD10_NAME1());
                }
                if(family_history.getWHETHER_STD()==null&&(family_history.getICD10_NAME1().contains("循环")
                        ||family_history.getICD10_NAME1().contains("脑卒中")||family_history.getICD10_NAME1().contains("冠心病")
                        ||family_history.getICD10_NAME1().contains("高血压"))){
                    //心脑血管疾病家族史
                    hisFamily.setFamilyCcvd("是");
                    //血缘亲属与患者的关系
                    hisFamily.setCcvdRelative(family_history.getRELATION_STD());
                    //血缘亲属患心脑血管疾病名称
                    hisFamily.setRelativeCcvdName(family_history.getICD10_NAME1());
                }

                if(hisFamily.getFamilyTumour()!=null||hisFamily.getFamilyCcvd()!=null){
                    //修改时间
                    hisFamily.setUpdatedAt(new Date());
                    hisFamilyService.saveHisFamily(hisFamily);
                    flag=false;
                }

            }


            if(family_history.getICD10_NAME2()!=null){
                if(family_history.getWHETHER_STD()==null&&(family_history.getICD10_NAME2().contains("肿瘤")
                        ||family_history.getICD10_NAME2().contains("癌")||family_history.getICD10_NAME2().contains("淋巴瘤")
                        ||family_history.getICD10_NAME2().contains("白血病"))){

                    //肿瘤家族史
                    hisFamily.setFamilyTumour("是");
                    //肿瘤血缘亲属与患者的关系
                    hisFamily.setTumourRelative(family_history.getRELATION_STD());

                    //肿瘤血缘亲属肿瘤疾病名称
                    hisFamily.setRelativeTumourName(family_history.getICD10_NAME2());
                }


                if(family_history.getWHETHER_STD()==null&&(family_history.getICD10_NAME2().contains("循环")
                        ||family_history.getICD10_NAME2().contains("脑卒中")||family_history.getICD10_NAME2().contains("冠心病")
                        ||family_history.getICD10_NAME2().contains("高血压"))){

                    //心脑血管疾病家族史
                    hisFamily.setFamilyCcvd("是");
                    //血缘亲属与患者的关系
                    hisFamily.setCcvdRelative(family_history.getRELATION_STD());
                    //血缘亲属患心脑血管疾病名称
                    hisFamily.setRelativeCcvdName(family_history.getICD10_NAME2());


                }

                if(hisFamily.getFamilyTumour()!=null||hisFamily.getFamilyCcvd()!=null){
                    //修改时间
                    hisFamily.setUpdatedAt(new Date());
                    hisFamilyService.saveHisFamily(hisFamily);
                    flag=false;
                }

            }


        }
        //否认并且 其他都没有
        if(flag&&isNot){
            //肿瘤家族史
            hisFamily.setFamilyTumour("否");
            //心脑血管疾病家族史
            hisFamily.setFamilyCcvd("否");
            //修改时间
            hisFamily.setUpdatedAt(new Date());
            hisFamilyService.saveHisFamily(hisFamily);
        }

    }
    public void saveHisPast(List<CONCOMITANT_DISEASE> zj_CONCOMITANT_DISEASE) {
        log.info("保存既往史："+zj_CONCOMITANT_DISEASE.get(0).getUNIQUE_ID());
        HisPast hisPast = new HisPast();
        //标识患者身份唯一标识
        hisPast.setPersonId(zj_CONCOMITANT_DISEASE.get(0).getUNIQUE_ID_LV1());
        //唯一标识
        hisPast.setUniqueId(zj_CONCOMITANT_DISEASE.get(0).getUNIQUE_ID_LV2());
        //医疗机构代码
        hisPast.setP900(zj_CONCOMITANT_DISEASE.get(0).getP900());
        //患者id
        hisPast.setPatientId(zj_CONCOMITANT_DISEASE.get(0).getPATIENT_ID());
        //住院号
        hisPast.setVisitId(zj_CONCOMITANT_DISEASE.get(0).getVISIT_ID());

        for (CONCOMITANT_DISEASE concomitant_disease : zj_CONCOMITANT_DISEASE) {
            String name=concomitant_disease.getICD10_NAME1()+concomitant_disease.getICD10_NAME2()+concomitant_disease.getICD10_NAME3()+concomitant_disease.getICD10_NAME4();


            if(name!=null&&!"".equals(name)&&name.contains("高血压")&&concomitant_disease.getWHETHER_STD()==null){
                //高血压
                hisPast.setHypertension("是");
            }else{
                //高血压
                hisPast.setHypertension("否");
            }

            if(name!=null&&!"".equals(name)&&name.contains("糖尿病")&&concomitant_disease.getWHETHER_STD()==null){
                //糖尿病
                hisPast.setGlycuresis("是");
            }else{
                //糖尿病
                hisPast.setGlycuresis("否");
            }

            if(name!=null&&!"".equals(name)&&name.contains("慢性阻塞性肺病")&&concomitant_disease.getWHETHER_STD()==null){
                //慢性阻塞性肺病(COpD)
                hisPast.setCopd("是");
            }else{
                //慢性阻塞性肺病(COpD)
                hisPast.setCopd("否");
            }

            if(name!=null&&!"".equals(name)&&name.contains("肺气肿")&&concomitant_disease.getWHETHER_STD()==null){
                //是否有肺气肿
                hisPast.setEmphysema("是");
            }else{
                //是否有肺气肿
                hisPast.setEmphysema("否");
            }


            if(name!=null&&!"".equals(name)&&name.contains("哮喘")&&concomitant_disease.getWHETHER_STD()==null){
                //是否有哮喘
                hisPast.setAsthma("是");
            }else{
                //是否有哮喘
                hisPast.setAsthma("否");
            }

            if(name!=null&&!"".equals(name)&&name.contains("支气管肺炎")&&concomitant_disease.getWHETHER_STD()==null){
                //是否有支气管肺炎
                hisPast.setBronchitis("是");
            }else{
                //是否有支气管肺炎
                hisPast.setBronchitis("否");
            }
            if(name!=null&&!"".equals(name)&&name.contains("甲状腺")&&concomitant_disease.getWHETHER_STD()==null){
                //甲状腺疾病
                hisPast.setThyroid("是");
            }else{
                //甲状腺疾病
                hisPast.setThyroid("否");
            }


            if(name!=null&&!"".equals(name)&&name.contains("心脏病")&&concomitant_disease.getWHETHER_STD()==null){
                //心脏病
                hisPast.setHeartDisease("是");
            }else{
                //心脏病
                hisPast.setHeartDisease("否");
            }


            if(name!=null&&!"".equals(name)&&name.contains("慢性贫血")&&"是".equals(concomitant_disease.getWHETHER_STD())){
                //慢性贫血
                hisPast.setChronicAnemia("是");
            }else{
                //慢性贫血
                hisPast.setChronicAnemia("否");
            }

            if(name!=null&&!"".equals(name)&&name.contains("风湿热病")&&concomitant_disease.getWHETHER_STD()==null){
                //风湿热病史
                hisPast.setRheumaticFever("是");
            }else{
                //风湿热病史
                hisPast.setRheumaticFever("否");
            }

            if(name!=null&&!"".equals(name)&&name.contains("血脂异常")&&concomitant_disease.getWHETHER_STD()==null){
                //血脂异常
                hisPast.setBloodFat("是");
            }else{
                //血脂异常
                hisPast.setBloodFat("否");
            }

            if(name!=null&&!"".equals(name)&&name.contains("慢性肾脏病")&&concomitant_disease.getWHETHER_STD()==null){
                //慢性肾脏病
                hisPast.setChronicKidney("是");
            }else{
                //慢性肾脏病
                hisPast.setChronicKidney("否");
            }


            if(name!=null&&!"".equals(name)&&name.contains("乙肝")&&concomitant_disease.getWHETHER_STD()==null){
                //乙肝
                hisPast.setHepatitisB("是");
            }else{
                //乙肝
                hisPast.setHepatitisB("否");
            }


            if(name!=null&&!"".equals(name)&&name.contains("丙肝")&&concomitant_disease.getWHETHER_STD()==null){
                //丙肝
                hisPast.setHcv("是");
            }else{
                //丙肝
                hisPast.setHcv("否");
            }

            if(name!=null&&!"".equals(name)&&name.contains("结核")&&concomitant_disease.getWHETHER_STD()==null){
                //结核
                hisPast.setTuberculosis("是");
            }else{
                //结核
                hisPast.setTuberculosis("否");
            }

            if(name!=null&&!"".equals(name)&&name.contains("HIV")&&concomitant_disease.getWHETHER_STD()==null){
                //HIV感染病史
                hisPast.setHiv("是");
            }else{
                //HIV感染病史
                hisPast.setHiv("否");
            }


        }

      /*  //数据版本
        hisPast.setDataVersion();
        //数据库来源
        hisPast.setDataDbSource();
        //数据表来源
        hisPast.setDataTableSource();
        //数据项来源
        hisPast.setDataFieldSource();
        //创建时间
        hisPast.setCreatedAt();
        //创建人
        hisPast.setCreator();*/
        //修改时间
        hisPast.setUpdatedAt(new Date());
        hisPastService.saveHisPast(hisPast);
    }
    public void saveSymptom(List<SYMPTOMS> zj_SYMPTOMS){
        log.info("保存症状体征："+zj_SYMPTOMS.get(0).getUNIQUE_ID());

        Symptom symptom = new Symptom();
        //标识患者身份唯一标识
        symptom.setPersonId(zj_SYMPTOMS.get(0).getUNIQUE_ID_LV1());
        //唯一标识
        symptom.setUniqueId(zj_SYMPTOMS.get(0).getUNIQUE_ID_LV2());
        //医疗机构代码
        symptom.setP900(zj_SYMPTOMS.get(0).getP900());
        //患者id
        symptom.setPatientId(zj_SYMPTOMS.get(0).getPATIENT_ID());
        //门诊/住院号
        symptom.setVisitId(zj_SYMPTOMS.get(0).getVISIT_ID());



        //腹部压痛
        symptom.setAbdominalTenderness("否");

        //肌抵抗
        symptom.setMuscularResistance("否");
        //腹部肿物
        symptom.setAbdominalTumour("否");

        //胃型
        symptom.setGastricType("否");
        //振水音
        symptom.setVibrationWater("否");
        //移动性浊音
        symptom.setMobileVoiced("否");
        //直肠指检
        symptom.setDigitalRectalExam("否");
        //盆底结节
        symptom.setTuberclePelvic("否");
        //指套染血
        symptom.setBloodFingering("否");
        //左锁骨上淋巴结肿大
        symptom.setLymphadenopathy("否");



        for(SYMPTOMS zj_symptom: zj_SYMPTOMS){

            if(zj_symptom.getNEG()==null){
                if(zj_symptom.getDESC1_STD()!=null&&!"".equals(zj_symptom.getDESC1_STD())&&!"null".equals(zj_symptom.getDESC1_STD())){
                    //症状
                    symptom.setSymptoms(zj_symptom.getDESC1_STD()+","+symptom.getSymptoms());
                }
                if(zj_symptom.getDESC2_STD()!=null&&!"".equals(zj_symptom.getDESC2_STD())&&!"null".equals(zj_symptom.getDESC2_STD())){
                    //症状
                    symptom.setSymptoms(zj_symptom.getDESC2_STD()+","+symptom.getSymptoms());
                }
                if(zj_symptom.getDESC3_STD()!=null&&!"".equals(zj_symptom.getDESC3_STD())&&!"null".equals(zj_symptom.getDESC3_STD())){
                    //症状
                    symptom.setSymptoms(zj_symptom.getDESC3_STD()+","+symptom.getSymptoms());
                }
                if(zj_symptom.getDESC4_STD()!=null&&!"".equals(zj_symptom.getDESC4_STD())&&!"null".equals(zj_symptom.getDESC4_STD())){
                    //症状
                    symptom.setSymptoms(zj_symptom.getDESC4_STD()+","+symptom.getSymptoms());
                }
                if(zj_symptom.getDESC5_STD()!=null&&!"".equals(zj_symptom.getDESC5_STD())&&!"null".equals(zj_symptom.getDESC5_STD())){
                    //症状
                    symptom.setSymptoms(zj_symptom.getDESC5_STD()+","+symptom.getSymptoms());
                }
                if(zj_symptom.getDESC6_STD()!=null&&!"".equals(zj_symptom.getDESC6_STD())&&!"null".equals(zj_symptom.getDESC6_STD())){
                    //症状
                    symptom.setSymptoms(zj_symptom.getDESC6_STD()+","+symptom.getSymptoms());
                }


                if(zj_symptom.getDESC()!=null){
                      if(zj_symptom.getDESC().contains("压痛")){
                        //腹部压痛
                        symptom.setAbdominalTenderness("是");

                        if(zj_symptom.getDESC1_STD()!=null&&!"".equals(zj_symptom.getDESC1_STD())&&!"null".equals(zj_symptom.getDESC1_STD())){
                            zj_symptom.getDESC1_STD().contains("腹部疼痛");
                            String site= zj_symptom.getDESC1_STD().split("腹部")[0]+"腹";
                            //腹部压痛部位
                            symptom.setAbdominalTendernessSite(site);
                        }

                        if(zj_symptom.getDESC2_STD()!=null&&!"".equals(zj_symptom.getDESC2_STD())&&!"null".equals(zj_symptom.getDESC2_STD())&& symptom.getAbdominalTendernessSite()==null){
                            zj_symptom.getDESC2_STD().contains("腹部疼痛");
                            String site= zj_symptom.getDESC2_STD().split("腹部")[0]+"腹";
                            //腹部压痛部位
                            symptom.setAbdominalTendernessSite(site);
                        }
                        if(zj_symptom.getDESC3_STD()!=null&&!"".equals(zj_symptom.getDESC3_STD())&&!"null".equals(zj_symptom.getDESC3_STD())&& symptom.getAbdominalTendernessSite()==null){
                            zj_symptom.getDESC3_STD().contains("腹部疼痛");
                            String site= zj_symptom.getDESC3_STD().split("腹部")[0]+"腹";
                            //腹部压痛部位
                            symptom.setAbdominalTendernessSite(site);
                        }
                        if(zj_symptom.getDESC4_STD()!=null&&!"".equals(zj_symptom.getDESC4_STD())&&!"null".equals(zj_symptom.getDESC4_STD())&& symptom.getAbdominalTendernessSite()==null){
                            zj_symptom.getDESC4_STD().contains("腹部疼痛");
                            String site= zj_symptom.getDESC4_STD().split("腹部")[0]+"腹";
                            //腹部压痛部位
                            symptom.setAbdominalTendernessSite(site);
                        }

                        if(zj_symptom.getDESC5_STD()!=null&&!"".equals(zj_symptom.getDESC5_STD())&&!"null".equals(zj_symptom.getDESC5_STD())&& symptom.getAbdominalTendernessSite()==null){
                            zj_symptom.getDESC5_STD().contains("腹部疼痛");
                            String site= zj_symptom.getDESC5_STD().split("腹部")[0]+"腹";
                            //腹部压痛部位
                            symptom.setAbdominalTendernessSite(site);
                        }
                        if(zj_symptom.getDESC6_STD()!=null&&!"".equals(zj_symptom.getDESC6_STD())&&!"null".equals(zj_symptom.getDESC6_STD())&& symptom.getAbdominalTendernessSite()==null){
                            zj_symptom.getDESC6_STD().contains("腹部疼痛");
                            String site= zj_symptom.getDESC6_STD().split("腹部")[0]+"腹";
                            //腹部压痛部位
                            symptom.setAbdominalTendernessSite(site);
                        }

                    }




                        if(zj_symptom.getDESC().contains("肌抵抗")){
                            //肌抵抗
                            symptom.setMuscularResistance("是");
                        }

                        if(zj_symptom.getDESC().contains("腹部肿物")){
                            //腹部肿物
                            symptom.setAbdominalTumour("是");



                            if(zj_symptom.getDESC1_STD()!=null&&!"".equals(zj_symptom.getDESC1_STD())&&!"null".equals(zj_symptom.getDESC1_STD())){
                                zj_symptom.getDESC1_STD().contains("腹部肿物");
                                String site= zj_symptom.getDESC1_STD().split("腹部")[0]+"腹";
                                //腹部肿物位置
                                symptom.setAbdominalTumourSite(site);
                                //腹部肿物大小
                                symptom.setAbdominalTumourSize(zj_symptom.getSIZE());

                            }

                            if(zj_symptom.getDESC2_STD()!=null&&!"".equals(zj_symptom.getDESC2_STD())&&!"null".equals(zj_symptom.getDESC2_STD())&& symptom.getAbdominalTendernessSite()==null){
                                zj_symptom.getDESC2_STD().contains("腹部肿物");
                                String site= zj_symptom.getDESC2_STD().split("腹部")[0]+"腹";
                                //腹部肿物位置
                                symptom.setAbdominalTumourSite(site);
                                //腹部肿物大小
                                symptom.setAbdominalTumourSize(zj_symptom.getSIZE());

                            }
                            if(zj_symptom.getDESC3_STD()!=null&&!"".equals(zj_symptom.getDESC3_STD())&&!"null".equals(zj_symptom.getDESC3_STD())&& symptom.getAbdominalTendernessSite()==null){
                                zj_symptom.getDESC3_STD().contains("腹部肿物");
                                String site= zj_symptom.getDESC3_STD().split("腹部")[0]+"腹";
                                //腹部肿物位置
                                symptom.setAbdominalTumourSite(site);
                                //腹部肿物大小
                                symptom.setAbdominalTumourSize(zj_symptom.getSIZE());

                            }
                            if(zj_symptom.getDESC4_STD()!=null&&!"".equals(zj_symptom.getDESC4_STD())&&!"null".equals(zj_symptom.getDESC4_STD())&& symptom.getAbdominalTendernessSite()==null){
                                zj_symptom.getDESC4_STD().contains("腹部肿物");
                                String site= zj_symptom.getDESC4_STD().split("腹部")[0]+"腹";
                                //腹部肿物位置
                                symptom.setAbdominalTumourSite(site);
                                //腹部肿物大小
                                symptom.setAbdominalTumourSize(zj_symptom.getSIZE());

                            }

                            if(zj_symptom.getDESC5_STD()!=null&&!"".equals(zj_symptom.getDESC5_STD())&&!"null".equals(zj_symptom.getDESC5_STD())&& symptom.getAbdominalTendernessSite()==null){
                                zj_symptom.getDESC5_STD().contains("腹部肿物");
                                String site= zj_symptom.getDESC5_STD().split("腹部")[0]+"腹";
                                //腹部肿物位置
                                symptom.setAbdominalTumourSite(site);
                                //腹部肿物大小
                                symptom.setAbdominalTumourSize(zj_symptom.getSIZE());

                            }
                            if(zj_symptom.getDESC6_STD()!=null&&!"".equals(zj_symptom.getDESC6_STD())&&!"null".equals(zj_symptom.getDESC6_STD())&& symptom.getAbdominalTendernessSite()==null){
                                zj_symptom.getDESC6_STD().contains("腹部肿物");
                                String site= zj_symptom.getDESC6_STD().split("腹部")[0]+"腹";
                                //腹部肿物位置
                                symptom.setAbdominalTumourSite(site);
                                //腹部肿物大小
                                symptom.setAbdominalTumourSize(zj_symptom.getSIZE());

                            }








                        }
                        if(zj_symptom.getDESC().contains("胃型")){
                            //胃型
                            symptom.setGastricType("是");
                        }
                        if(zj_symptom.getDESC().contains("振水音")) {
                            //振水音
                            symptom.setVibrationWater("是");
                        }
                        if(zj_symptom.getDESC().contains("移动性浊音")) {
                            //移动性浊音
                            symptom.setMobileVoiced("是");
                        }


                        if(zj_symptom.getDESC().contains("直肠指检")) {
                            //直肠指检
                            symptom.setDigitalRectalExam("是");
                        }

                        if(zj_symptom.getDESC().contains("盆底结节")) {
                            //盆底结节
                            symptom.setTuberclePelvic("是");
                        }

                        if(zj_symptom.getDESC().contains("指套染血")) {
                            //指套染血
                            symptom.setBloodFingering("是");
                        }
                        if(zj_symptom.getDESC().contains("左锁骨上淋巴结肿大")) {
                            //左锁骨上淋巴结肿大
                            symptom.setLymphadenopathy("是");
                        }

                }


            }



        }
        //修改时间
        symptom.setUpdatedAt(new Date());
        symptomService.saveSymptom(symptom);

    }



    public void saveEusGastroscope(ENDOSCOPY endoscopy,List<EXAM_MASTER> zj_EXAM_MASTER) throws ParseException {
        EusGastroscope eusGastroscope = new EusGastroscope();
        //标识患者身份唯一标识
        eusGastroscope.setPersonId(endoscopy.getUNIQUE_ID_LV1());
        //唯一标识
        eusGastroscope.setUniqueId(endoscopy.getUNIQUE_ID_LV2());
        //医疗机构代码
        eusGastroscope.setP900(endoscopy.getP900());
        //患者id
        eusGastroscope.setPatientId(endoscopy.getPATIENT_ID());
        //就诊标识住院号
        eusGastroscope.setVisitId(endoscopy.getVISIT_ID());
        //检查项目名称
        eusGastroscope.setExamName("超声胃镜");
        if(endoscopy.getSTRUCTURE_STD() != null){
            //病灶位置
            //String structure = DrugConstant.getStructure(endoscopy.getSTRUCTURE_STD());
            String structure = endoscopy.getSTRUCTURE_STD();
            if(!"".equals(structure)){
                eusGastroscope.setStructure(structure);
                //病灶大小
                //eusGastroscope.setFocusSize(endoscopy.getSIZE1_STD());
                eusGastroscope.setFocusSize(DrugConstant.getConcatString(
                        endoscopy.getSIZE1_STD(),
                        endoscopy.getSIZE2_STD(),
                        endoscopy.getSIZE3_STD(),
                        endoscopy.getSIZE4_STD(),
                        endoscopy.getSIZE5_STD(),
                        endoscopy.getSIZE6_STD(),
                        endoscopy.getSIZE7_STD()
                ));
                //病灶数量
                eusGastroscope.setFocusCount(endoscopy.getCOUNT_STD());
                //病灶上缘距齿状线距离
                if(endoscopy.getSUB_STRUCTURE_STD() != null && endoscopy.getSUB_STRUCTURE_STD().contains("门齿")){
                    eusGastroscope.setSubStructure(endoscopy.getSUB_STRUCTURE_STD());
                }
            }
            // 胃周肿大淋巴结
            String finding = endoscopy.getFINDING1_STD() + "," + endoscopy.getFINDING2_STD();
            if(structure.contains("胃") && finding.contains("淋巴结肿大") && endoscopy.getNEG_STD() == null){
                eusGastroscope.setPerigastricEnlargedLymph("有");
            }else{
                eusGastroscope.setPerigastricEnlargedLymph("无");
            }
        }
        //山田分型
        String stType = "";
        if(endoscopy.getTYPE1_STD() != null && endoscopy.getTYPE1_STD().contains("山田分型")){
            stType = endoscopy.getTYPE1_STD();
        }else if(endoscopy.getTYPE2_STD() != null && endoscopy.getTYPE2_STD().contains("山田分型")){
            stType = endoscopy.getTYPE2_STD();
        }else if(endoscopy.getTYPE3_STD() != null && endoscopy.getTYPE3_STD().contains("山田分型")){
            stType = endoscopy.getTYPE3_STD();
        }
        if(!"".equals(stType)){
            eusGastroscope.setStType(stType);
        }
        //pit 分型
        String pitType = "";
        if(endoscopy.getTYPE1_STD() != null && (endoscopy.getTYPE1_STD().contains("pit分型") || endoscopy.getTYPE1_STD().contains("Pit分型"))){
            pitType = endoscopy.getTYPE1_STD();
        }else if(endoscopy.getTYPE2_STD() != null && (endoscopy.getTYPE2_STD().contains("pit分型") || endoscopy.getTYPE1_STD().contains("Pit分型"))){
            pitType = endoscopy.getTYPE2_STD();
        }else if(endoscopy.getTYPE3_STD() != null && (endoscopy.getTYPE3_STD().contains("pit分型") || endoscopy.getTYPE1_STD().contains("Pit分型"))){
            pitType = endoscopy.getTYPE3_STD();
        }
        if(!"".equals(pitType)){
            eusGastroscope.setPitType(pitType);
        }
        //JNET分型
        String jnetType = "";
        if(endoscopy.getTYPE1_STD() != null && (endoscopy.getTYPE1_STD().contains("JNET分型")||endoscopy.getTYPE1_STD().contains("Jnet分型"))){
            jnetType = endoscopy.getTYPE1_STD();
        }else if(endoscopy.getTYPE2_STD() != null && (endoscopy.getTYPE2_STD().contains("JNET分型")||endoscopy.getTYPE2_STD().contains("Jnet分型"))){
            jnetType = endoscopy.getTYPE2_STD();
        }else if(endoscopy.getTYPE3_STD() != null && (endoscopy.getTYPE3_STD().contains("JNET分型")||endoscopy.getTYPE3_STD().contains("Jnet分型"))){
            jnetType = endoscopy.getTYPE3_STD();
        }
        if(!"".equals(jnetType)){
            eusGastroscope.setJnetType(jnetType);
        }
        //HP 试验
        eusGastroscope.setExamParaHp(endoscopy.getHP_TEST_STD());
        //腹水
        if(endoscopy.getDIAG_STD() != null){
            eusGastroscope.setAscites(endoscopy.getDIAG_STD().contains("腹水")?"是":"否");
        }
        for(EXAM_MASTER examMaster:zj_EXAM_MASTER){
            if(examMaster.getEXAM_DATE_TIME() != null && endoscopy.getDATE_TIME_P() != null) {
                DateFormat df1 = DateFormat.getDateInstance();
                String fdate = df1.format(examMaster.getEXAM_DATE_TIME());
                if (fdate.compareTo(df1.format(endoscopy.getDATE_TIME_P())) == 0 && examMaster.getUNIQUE_ID().equals(endoscopy.getUNIQUE_ID())) {
                    //检查号
                    eusGastroscope.setExamNo(examMaster.getEXAM_NO());
                }
            }
        }

        //数据版本
//        eusGastroscope.setDataVersion();
//        //数据库来源
//        eusGastroscope.setDataDbSource();
//        //数据表来源
//        eusGastroscope.setDataTableSource();
//        //数据项来源
//        eusGastroscope.setDataFieldSource();
//        //创建时间
//        eusGastroscope.setCreatedAt();
//        //创建人
//        eusGastroscope.setCreator();
//        //修改时间
//        eusGastroscope.setUpdatedAt();
        eusGastroscopeService.saveEusGastroscope(eusGastroscope);
    }

//    public void saveGastroscope(String examName,ENDOSCOPY endoscopy,List<EXAM_MASTER> zj_EXAM_MASTER) throws ParseException {
//        Gastroscope gastroscope = new Gastroscope();
//        //标识患者身份唯一标识
//        gastroscope.setPersonId(endoscopy.getUNIQUE_ID_LV1());
//        //唯一标识
//        gastroscope.setUniqueId(endoscopy.getUNIQUE_ID_LV2());
//        //医疗机构代码
//        gastroscope.setP900(endoscopy.getP900());
//        //患者id
//        gastroscope.setPatientId(endoscopy.getPATIENT_ID());
//        //就诊标识住院号
//        gastroscope.setVisitId(endoscopy.getVISIT_ID());
//        //检查项目名称
//        if(examName.contains("胃镜")){
//            gastroscope.setExamName("胃镜");
//        }else if(examName.contains("电子胃十二指肠镜")){
//            gastroscope.setExamName("电子胃十二指肠镜");
//        }else{
//            gastroscope.setExamName("胃十二指肠镜");
//        }
//        if(endoscopy.getSTRUCTURE_STD() != null){
//            //病灶位置
//            String structure = DrugConstant.getStructure(endoscopy.getSTRUCTURE_STD());
//            if(!"".equals(structure)){
//                gastroscope.setStructure(endoscopy.getSTRUCTURE_STD());
//                //病灶大小
//                //gastroscope.setFocusSize(endoscopy.getSIZE1_STD());
//                gastroscope.setFocusSize(DrugConstant.getConcatString(
//                        endoscopy.getSIZE1_STD(),
//                        endoscopy.getSIZE2_STD(),
//                        endoscopy.getSIZE3_STD(),
//                        endoscopy.getSIZE4_STD(),
//                        endoscopy.getSIZE5_STD(),
//                        endoscopy.getSIZE6_STD(),
//                        endoscopy.getSIZE7_STD()
//                ));
//                //病灶数量
//                gastroscope.setFocusCount(endoscopy.getCOUNT_STD());
//                //病灶上缘距齿状线距离
//                if(endoscopy.getSUB_STRUCTURE_STD() != null && endoscopy.getSUB_STRUCTURE_STD().contains("门齿")){
//                    gastroscope.setSubStructure(endoscopy.getSUB_STRUCTURE_STD());
//                }
//            }
//        }
//        //山田分型
//        String stType = "";
//        if(endoscopy.getTYPE1_STD() != null && endoscopy.getTYPE1_STD().contains("山田分型")){
//            stType = endoscopy.getTYPE1_STD();
//        }else if(endoscopy.getTYPE2_STD() != null && endoscopy.getTYPE2_STD().contains("山田分型")){
//            stType = endoscopy.getTYPE2_STD();
//        }else if(endoscopy.getTYPE3_STD() != null && endoscopy.getTYPE3_STD().contains("山田分型")){
//            stType = endoscopy.getTYPE3_STD();
//        }
//        if(!"".equals(stType)){
//            gastroscope.setStType(stType);
//        }
//        //pit 分型
//        String pitType = "";
//        if(endoscopy.getTYPE1_STD() != null && (endoscopy.getTYPE1_STD().contains("pit分型") || endoscopy.getTYPE1_STD().contains("Pit分型"))){
//            pitType = endoscopy.getTYPE1_STD();
//        }else if(endoscopy.getTYPE2_STD() != null && (endoscopy.getTYPE2_STD().contains("pit分型") || endoscopy.getTYPE1_STD().contains("Pit分型"))){
//            pitType = endoscopy.getTYPE2_STD();
//        }else if(endoscopy.getTYPE3_STD() != null && (endoscopy.getTYPE3_STD().contains("pit分型")|| endoscopy.getTYPE1_STD().contains("Pit分型"))){
//            pitType = endoscopy.getTYPE3_STD();
//        }
//        if(!"".equals(pitType)){
//            gastroscope.setPitType(pitType);
//        }
//        //JNET分型
//        String jnetType = "";
//        if(endoscopy.getTYPE1_STD() != null && (endoscopy.getTYPE1_STD().contains("JNET分型")||endoscopy.getTYPE1_STD().contains("Jnet分型"))){
//            jnetType = endoscopy.getTYPE1_STD();
//        }else if(endoscopy.getTYPE2_STD() != null && (endoscopy.getTYPE2_STD().contains("JNET分型")||endoscopy.getTYPE2_STD().contains("Jnet分型"))){
//            jnetType = endoscopy.getTYPE2_STD();
//        }else if(endoscopy.getTYPE3_STD() != null && (endoscopy.getTYPE3_STD().contains("JNET分型")||endoscopy.getTYPE3_STD().contains("Jnet分型"))){
//            jnetType = endoscopy.getTYPE3_STD();
//        }
//        if(!"".equals(jnetType)){
//            gastroscope.setJnetType(jnetType);
//        }
//        //HP 试验
//        gastroscope.setExamParaHp(endoscopy.getHP_TEST_STD());
//        for(EXAM_MASTER examMaster : zj_EXAM_MASTER){
//            if(examMaster.getEXAM_DATE_TIME() != null && endoscopy.getDATE_TIME_P() != null){
//                DateFormat df1 = DateFormat.getDateInstance();
//                String fdate = df1.format(examMaster.getEXAM_DATE_TIME());
//                if (fdate.compareTo(df1.format(endoscopy.getDATE_TIME_P())) == 0 && examMaster.getUNIQUE_ID().equals(endoscopy.getUNIQUE_ID())) {
//                    //检查号
//                    gastroscope.setExamNo(examMaster.getEXAM_NO());
//                }
//            }
//        }
//        //数据版本
//        gastroscopeService.saveGastroscope(gastroscope);
//    }
    public void saveGastroscope(List<ENDOSCOPY> endoscopys,List<EXAM_MASTER> zj_EXAM_MASTER) throws ParseException {
        Gastroscope gastroscope = new Gastroscope();
        //标识患者身份唯一标识
        gastroscope.setPersonId(endoscopys.get(0).getUNIQUE_ID_LV1());
        //唯一标识
        gastroscope.setUniqueId(endoscopys.get(0).getUNIQUE_ID_LV2());
        //医疗机构代码
        gastroscope.setP900(endoscopys.get(0).getP900());
        //患者id
        gastroscope.setPatientId(endoscopys.get(0).getPATIENT_ID());
        //就诊标识住院号
        gastroscope.setVisitId(endoscopys.get(0).getVISIT_ID());
        //检查项目名称
        for (EXAM_MASTER exam_master:zj_EXAM_MASTER
             ) {
            if (exam_master.getEXAM_NAME1_STD().contains("胃镜")){
                gastroscope.setExamName("胃镜");
                for(ENDOSCOPY endoscopy:endoscopys){
                    if (endoscopy.getUNIQUE_ID().equals(exam_master.getUNIQUE_ID())) {
                        if(endoscopy.getSTRUCTURE_STD() != null){
                            //病灶位置
                            String structure = DrugConstant.getStructure(endoscopy.getSTRUCTURE_STD());
                            if(!"".equals(structure)){
                                gastroscope.setStructure(endoscopy.getSTRUCTURE_STD());
                                //病灶大小
                                //gastroscope.setFocusSize(endoscopy.getSIZE1_STD());
                                gastroscope.setFocusSize(DrugConstant.getConcatString(
                                        endoscopy.getSIZE1_STD(),
                                        endoscopy.getSIZE2_STD(),
                                        endoscopy.getSIZE3_STD(),
                                        endoscopy.getSIZE4_STD(),
                                        endoscopy.getSIZE5_STD(),
                                        endoscopy.getSIZE6_STD(),
                                        endoscopy.getSIZE7_STD()
                                ));
                                //病灶数量
                                if (endoscopy.getCOUNT_STD()!=null&&endoscopy.getCOUNT_STD().equals("1")){
                                    gastroscope.setFocusCount("单发");
                                }else {
                                    gastroscope.setFocusCount(endoscopy.getCOUNT_STD());
                                }

                                //病灶上缘距齿状线距离
                                if(endoscopy.getSUB_STRUCTURE_STD() != null && endoscopy.getSUB_STRUCTURE_STD().contains("肛门")){
                                    gastroscope.setSubStructure(endoscopy.getSUB_STRUCTURE_STD());
                                }
                            }
                        }
                        //山田分型
                        String stType = "";
                        if(endoscopy.getTYPE1_STD() != null && endoscopy.getTYPE1_STD().contains("山田分型")){
                            stType = endoscopy.getTYPE1_STD();
                        }else if(endoscopy.getTYPE2_STD() != null && endoscopy.getTYPE2_STD().contains("山田分型")){
                            stType = endoscopy.getTYPE2_STD();
                        }else if(endoscopy.getTYPE3_STD() != null && endoscopy.getTYPE3_STD().contains("山田分型")){
                            stType = endoscopy.getTYPE3_STD();
                        }
                        if(!"".equals(stType)){
                            gastroscope.setStType(stType);
                        }
                        //pit 分型
                        String pitType = "";
                        if(endoscopy.getTYPE1_STD() != null && (endoscopy.getTYPE1_STD().contains("pit分型") || endoscopy.getTYPE1_STD().contains("Pit分型"))){
                            pitType = endoscopy.getTYPE1_STD();
                        }else if(endoscopy.getTYPE2_STD() != null && (endoscopy.getTYPE2_STD().contains("pit分型") || endoscopy.getTYPE1_STD().contains("Pit分型"))){
                            pitType = endoscopy.getTYPE2_STD();
                        }else if(endoscopy.getTYPE3_STD() != null && (endoscopy.getTYPE3_STD().contains("pit分型")|| endoscopy.getTYPE1_STD().contains("Pit分型"))){
                            pitType = endoscopy.getTYPE3_STD();
                        }
                        if(!"".equals(pitType)){
                            gastroscope.setPitType(pitType);
                        }
                        //JNET分型
                        String jnetType = "";
                        if(endoscopy.getTYPE1_STD() != null && (endoscopy.getTYPE1_STD().contains("JNET分型")||endoscopy.getTYPE1_STD().contains("Jnet分型"))){
                            jnetType = endoscopy.getTYPE1_STD();
                        }else if(endoscopy.getTYPE2_STD() != null && (endoscopy.getTYPE2_STD().contains("JNET分型")||endoscopy.getTYPE2_STD().contains("Jnet分型"))){
                            jnetType = endoscopy.getTYPE2_STD();
                        }else if(endoscopy.getTYPE3_STD() != null && (endoscopy.getTYPE3_STD().contains("JNET分型")||endoscopy.getTYPE3_STD().contains("Jnet分型"))){
                            jnetType = endoscopy.getTYPE3_STD();
                        }
                        if(!"".equals(jnetType)){
                            gastroscope.setJnetType(jnetType);
                        }
                        //HP 试验
                        gastroscope.setExamParaHp(endoscopy.getHP_TEST_STD());
                        for(EXAM_MASTER examMaster : zj_EXAM_MASTER){
                            if(examMaster.getEXAM_DATE_TIME() != null && endoscopy.getDATE_TIME_P() != null){
                                DateFormat df1 = DateFormat.getDateInstance();
                                String fdate = df1.format(examMaster.getEXAM_DATE_TIME());
                                if (fdate.compareTo(df1.format(endoscopy.getDATE_TIME_P())) == 0 && examMaster.getUNIQUE_ID().equals(endoscopy.getUNIQUE_ID())) {
                                    //检查号
                                    gastroscope.setExamNo(examMaster.getEXAM_NO());
                                }
                            }
                        }
                    }else {

                    }
                }
            }

        }


        //数据版本
        gastroscopeService.saveGastroscope(gastroscope);
    }

    public void saveColonoscopy(ENDOSCOPY endoscopy,List<EXAM_MASTER> zj_EXAM_MASTER) throws ParseException {
        Colonoscopy colonoscopy = new Colonoscopy();
        //标识患者身份唯一标识
        colonoscopy.setPersonId(endoscopy.getUNIQUE_ID_LV1());
        //唯一标识
        colonoscopy.setUniqueId(endoscopy.getUNIQUE_ID_LV2());
        //医疗机构代码
        colonoscopy.setP900(endoscopy.getP900());
        //患者id
        colonoscopy.setPatientId(endoscopy.getPATIENT_ID());
        //就诊标识住院号
        colonoscopy.setVisitId(endoscopy.getVISIT_ID());
        //检查项目名称
        if(endoscopy.getIMAGING_NAME().contains("结肠镜")){
            colonoscopy.setExamName("结肠镜");
        }else if(endoscopy.getIMAGING_NAME().contains("小肠镜")){
            colonoscopy.setExamName("小肠镜");
        }else{
            colonoscopy.setExamName("肠镜");
        }
        if(endoscopy.getSTRUCTURE_STD() != null){
            //病灶位置
            //String structure = DrugConstant.getStructure_colonoscopy(endoscopy.getSTRUCTURE_STD());
            String structure = endoscopy.getSTRUCTURE_STD();
            if(!"".equals(structure)){
                colonoscopy.setStructure(endoscopy.getSTRUCTURE_STD());
                //病灶大小
                //colonoscopy.setFocusSize(endoscopy.getSIZE1_STD());
                colonoscopy.setFocusSize(DrugConstant.getConcatString(
                        endoscopy.getSIZE1_STD(),
                        endoscopy.getSIZE2_STD(),
                        endoscopy.getSIZE3_STD(),
                        endoscopy.getSIZE4_STD(),
                        endoscopy.getSIZE5_STD(),
                        endoscopy.getSIZE6_STD(),
                        endoscopy.getSIZE7_STD()
                ));
                //病灶数量
                colonoscopy.setFocusCount(endoscopy.getCOUNT_STD());
                //病灶距离肛门距离
                if(endoscopy.getSUB_STRUCTURE_STD() != null && endoscopy.getSUB_STRUCTURE_STD().contains("肛门")){
                    colonoscopy.setSubStructure(endoscopy.getSUB_STRUCTURE_STD());
                }
            }
        }
        for(EXAM_MASTER examMaster:zj_EXAM_MASTER){
            if(examMaster.getEXAM_DATE_TIME() != null && endoscopy.getDATE_TIME_P() != null) {
                DateFormat df1 = DateFormat.getDateInstance();
                String fdate = df1.format(examMaster.getEXAM_DATE_TIME());
                if (fdate.compareTo(df1.format(endoscopy.getDATE_TIME_P())) == 0  && examMaster.getUNIQUE_ID().equals(endoscopy.getUNIQUE_ID())) {
                    //检查号
                    colonoscopy.setExamNo(examMaster.getEXAM_NO());
//                    //送检日期
//                    colonoscopy.setExamDateTime(examMaster.getEXAM_DATE_TIME());
//                    //报告日期
//                    colonoscopy.setReportDateTime(examMaster.getREPORT_DATE_TIME());
//                    //检查所见
//                    colonoscopy.setDescription(examMaster.getDESCRIPTION());
//                    //检查结论
//                    colonoscopy.setEntryResults(examMaster.getENTRY_RESULTS());
//                    //活检病理
//                    colonoscopy.setExamParaBiopsy(examMaster.getEXAM_PARA());
                }
            }
        }
        //数据版本
//        colonoscopy.setDataVersion();
//        //数据库来源
//        colonoscopy.setDataDbSource();
//        //数据表来源
//        colonoscopy.setDataTableSource();
//        //数据项来源
//        colonoscopy.setDataFieldSource();
//        //创建时间
//        colonoscopy.setCreatedAt();
//        //创建人
//        colonoscopy.setCreator();
//        //修改时间
//        colonoscopy.setUpdatedAt();
        colonoscopyService.saveColonoscopy(colonoscopy);
    }

    public void saveUgi(String examName,EXAM_MASTER examMaster,List<IMAGING> zj_IMAGING) throws ParseException {
        Ugi ugi;
        int i = 0;
        for(IMAGING imaging : zj_IMAGING){
            log.info("field_source:"+imaging.getDATA_FIELD_SOURCE());
            log.info("unique_id:"+examMaster.getUNIQUE_ID());
            if(imaging.getDATA_FIELD_SOURCE().equals(examMaster.getUNIQUE_ID())){
                i++;
                ugi = new Ugi();
                //标识患者身份唯一标识
                ugi.setPersonId(examMaster.getUNIQUE_ID_LV1());
                //唯一标识
                ugi.setUniqueId(examMaster.getUNIQUE_ID_LV2());
                //医疗机构代码
                ugi.setP900(examMaster.getP900());
                //患者id
                ugi.setPatientId(examMaster.getPATIENT_ID());
                //就诊标识住院号
                ugi.setVisitId(examMaster.getVISIT_ID());
                //检查项目名称
                if(examName.contains("上消化道钡餐")){
                    ugi.setExamName("上消化道钡餐");
                }
                if(examName.contains("上消化道造影")){
                    ugi.setExamName("上消化道造影");
                }
                //检查号
                ugi.setExamNo(examMaster.getEXAM_NO());
//                //送检日期
//                ugi.setExamDateTime(examMaster.getEXAM_DATE_TIME());
//                //报告日期
//                ugi.setReportDateTime(examMaster.getREPORT_DATE_TIME());
//                //检查所见
//                ugi.setDescription(examMaster.getDESCRIPTION());
//                //检查结论
//                ugi.setEntryResults(examMaster.getENTRY_RESULTS());
                //病灶位置
                ugi.setStructure(DrugConstant.getStructure_imaging(imaging));
                //病灶大小
                ugi.setFocusSize(DrugConstant.getStructure_size(imaging));
                //病灶数量
                if (imaging.getCOUNT_STD()!=null&&imaging.getCOUNT_STD().equals("1")) {
                    ugi.setFocusCount("单发");
                } else {
                    ugi.setFocusCount(imaging.getCOUNT_STD());
                }
                ugiService.saveUgi(ugi);
            }
        }
        if(i == 0){
            ugi = new Ugi();
            //标识患者身份唯一标识
            ugi.setPersonId(examMaster.getUNIQUE_ID_LV1());
            //唯一标识
            ugi.setUniqueId(examMaster.getUNIQUE_ID_LV2());
            //医疗机构代码
            ugi.setP900(examMaster.getP900());
            //患者id
            ugi.setPatientId(examMaster.getPATIENT_ID());
            //就诊标识住院号
            ugi.setVisitId(examMaster.getVISIT_ID());
            //检查项目名称
            if(examName.contains("上消化道钡餐")){
                ugi.setExamName("上消化道钡餐");
            }
            if(examName.contains("上消化道造影")){
                ugi.setExamName("上消化道造影");
            }
            //检查号
            ugi.setExamNo(examMaster.getEXAM_NO());
//            //送检日期
//            ugi.setExamDateTime(examMaster.getEXAM_DATE_TIME());
//            //报告日期
//            ugi.setReportDateTime(examMaster.getREPORT_DATE_TIME());
//            //检查所见
//            ugi.setDescription(examMaster.getDESCRIPTION());
//            //检查结论
//            ugi.setEntryResults(examMaster.getENTRY_RESULTS());
            ugiService.saveUgi(ugi);
        }
        //数据版本
//        ugi.setDataVersion();
//        //数据库来源
//        ugi.setDataDbSource();
//        //数据表来源
//        ugi.setDataTableSource();
//        //数据项来源
//        ugi.setDataFieldSource();
//        //创建时间
//        ugi.setCreatedAt();
//        //创建人
//        ugi.setCreator();
//        //修改时间
//        ugi.setUpdatedAt();

    }

    public void saveRabat(String examName,EXAM_MASTER examMaster,List<IMAGING> zj_IMAGING) {
        Rabat rabat ;
        int i= 0;
        for(IMAGING imaging : zj_IMAGING){
            if(imaging.getDATA_FIELD_SOURCE().equals(examMaster.getUNIQUE_ID())){
                i++;
                rabat = new Rabat();
                //标识患者身份唯一标识
                rabat.setPersonId(examMaster.getUNIQUE_ID_LV1());
                //唯一标识
                rabat.setUniqueId(examMaster.getUNIQUE_ID_LV2());
                //医疗机构代码
                rabat.setP900(examMaster.getP900());
                //患者id
                rabat.setPatientId(examMaster.getPATIENT_ID());
                //就诊标识住院号
                rabat.setVisitId(examMaster.getVISIT_ID());
                //检查项目
                if(examName.contains("胸片")){
                    rabat.setExamName("胸片");
                }else if(examName.contains("胸部X线")){
                    rabat.setExamName("胸部X线");
                }
                //检查号
                rabat.setExamNo(examMaster.getEXAM_NO());
//                //检查日期
//                rabat.setExamDateTime(examMaster.getEXAM_DATE_TIME());
//                //报告日期
//                rabat.setReportDateTime(examMaster.getREPORT_DATE_TIME());
//                //影像所见
//                rabat.setDescription(examMaster.getDESCRIPTION());
//                //影像结论
//                rabat.setEntryResults(examMaster.getENTRY_RESULTS());
                //转移
                String finding = imaging.getFINDING1_STD() + "," + imaging.getFINDING2_STD() + "," + imaging.getFINDING3_STD() + "," + imaging.getFINDING4_STD();
                if(finding.contains("转移") || (examMaster.getENTRY_RESULTS() != null && examMaster.getENTRY_RESULTS().contains("转移"))){
                    rabat.setTransfer("是");
                }else{
                    rabat.setTransfer("否");
                }
                rabatService.saveRabat(rabat);
            }
        }
        if(i == 0){
            rabat = new Rabat();
            //标识患者身份唯一标识
            rabat.setPersonId(examMaster.getUNIQUE_ID_LV1());
            //唯一标识
            rabat.setUniqueId(examMaster.getUNIQUE_ID_LV2());
            //医疗机构代码
            rabat.setP900(examMaster.getP900());
            //患者id
            rabat.setPatientId(examMaster.getPATIENT_ID());
            //就诊标识住院号
            rabat.setVisitId(examMaster.getVISIT_ID());
            //检查项目
            if(examName.contains("胸片")){
                rabat.setExamName("胸片");
            }else if(examName.contains("胸部X线")){
                rabat.setExamName("胸部X线");
            }
            //检查号
            rabat.setExamNo(examMaster.getEXAM_NO());
//            //检查日期
//            rabat.setExamDateTime(examMaster.getEXAM_DATE_TIME());
//            //报告日期
//            rabat.setReportDateTime(examMaster.getREPORT_DATE_TIME());
//            //影像所见
//            rabat.setDescription(examMaster.getDESCRIPTION());
//            //影像结论
//            rabat.setEntryResults(examMaster.getENTRY_RESULTS());
            rabatService.saveRabat(rabat);
        }
        //数据版本
//        rabat.setDataVersion();
//        //数据库来源
//        rabat.setDataDbSource();
//        //数据表来源
//        rabat.setDataTableSource();
//        //数据项来源
//        rabat.setDataFieldSource();
//        //创建时间
//        rabat.setCreatedAt();
//        //创建人
//        rabat.setCreator();
//        //修改时间
//        rabat.setUpdatedAt();

    }

    public void saveChestCt(String examName,EXAM_MASTER examMaster,List<IMAGING> zj_IMAGING) {
        ChestCt chestCt;
        int i = 0;
        for(IMAGING imaging : zj_IMAGING){
            if(imaging.getDATA_FIELD_SOURCE().equals(examMaster.getUNIQUE_ID())){
                i++;
                chestCt = new ChestCt();
                //标识患者身份唯一标识
                chestCt.setPersonId(examMaster.getUNIQUE_ID_LV1());
                //唯一标识
                chestCt.setUniqueId(examMaster.getUNIQUE_ID_LV2());
                //医疗机构代码
                chestCt.setP900(examMaster.getP900());
                //患者id
                chestCt.setPatientId(examMaster.getPATIENT_ID());
                //就诊标识住院号
                chestCt.setVisitId(examMaster.getVISIT_ID());
                //检查项目
                chestCt.setExamName("胸部CT");
                //检查号
                chestCt.setExamNo(examMaster.getEXAM_NO());
//                //检查日期
//                chestCt.setExamDateTime(examMaster.getEXAM_DATE_TIME());
//                //报告日期
//                chestCt.setReportDateTime(examMaster.getREPORT_DATE_TIME());
                //转移
                String finding = imaging.getFINDING1_STD() + "," + imaging.getFINDING2_STD() + "," + imaging.getFINDING3_STD() + "," + imaging.getFINDING4_STD();
                String site = imaging.getSITE1_STD() + "," + imaging.getSITE1_STD() + "," + imaging.getSITE1_STD() + "," + imaging.getSITE1_STD() + ","
                        + imaging.getSITE1_STD() + "," + imaging.getSITE1_STD() + "," + imaging.getSITE1_STD() + "," + imaging.getSITE1_STD();
                if(finding.contains("转移") || finding.contains("继发") || (examMaster.getENTRY_RESULTS() != null && (examMaster.getENTRY_RESULTS().contains("转移") || examMaster.getENTRY_RESULTS().contains("继发")))){
                    chestCt.setTransfer("是");
                    //转移部位
                    if(finding.contains("肺") || site.contains("肺")){
                        chestCt.setDesTransferSite("肺");
                    }else if(finding.contains("骨") || site.contains("骨")){
                        chestCt.setDesTransferSite("骨");
                    }else if(finding.contains("淋巴结") || site.contains("淋巴结")){
                        chestCt.setDesTransferSite("淋巴结");
                    }
                    //转移灶数目
                    if (imaging.getCOUNT_STD()!=null&&imaging.getCOUNT_STD().equals("1")){
                        chestCt.setDesTransferCount("单发");
                    }else {
                        chestCt.setDesTransferCount(imaging.getCOUNT_STD());
                    }

                    //转移灶大小
                    chestCt.setDesTransferSize(DrugConstant.getStructure_size(imaging));
                }else{
                    chestCt.setTransfer("否");
                }
//                //影像所见
//                chestCt.setDescription(examMaster.getDESCRIPTION());
                //转移部位
                chestCt.setResTransferSite(chestCt.getDesTransferSite());
                //转移灶数目
                chestCt.setResTransferCount(chestCt.getDesTransferCount());
                //转移灶大小
                chestCt.setResTransferSize(chestCt.getDesTransferSize());
//                //影像结论
//                chestCt.setEntryResults(examMaster.getENTRY_RESULTS());
                chestCtService.saveChestCt(chestCt);
            }
        }
        if(i == 0){
            chestCt = new ChestCt();
            //标识患者身份唯一标识
            chestCt.setPersonId(examMaster.getUNIQUE_ID_LV1());
            //唯一标识
            chestCt.setUniqueId(examMaster.getUNIQUE_ID_LV2());
            //医疗机构代码
            chestCt.setP900(examMaster.getP900());
            //患者id
            chestCt.setPatientId(examMaster.getPATIENT_ID());
            //就诊标识住院号
            chestCt.setVisitId(examMaster.getVISIT_ID());
            //检查项目
            chestCt.setExamName("胸部CT");
            //检查号
            chestCt.setExamNo(examMaster.getEXAM_NO());
//            //检查日期
//            chestCt.setExamDateTime(examMaster.getEXAM_DATE_TIME());
//            //报告日期
//            chestCt.setReportDateTime(examMaster.getREPORT_DATE_TIME());
//            //影像所见
//            chestCt.setDescription(examMaster.getDESCRIPTION());
//            //影像结论
//            chestCt.setEntryResults(examMaster.getENTRY_RESULTS());
            chestCtService.saveChestCt(chestCt);
        }

        //数据版本
//        chestCt.setDataVersion();
//        //数据库来源
//        chestCt.setDataDbSource();
//        //数据表来源
//        chestCt.setDataTableSource();
//        //数据项来源
//        chestCt.setDataFieldSource();
//        //创建时间
//        chestCt.setCreatedAt();
//        //创建人
//        chestCt.setCreator();
//        //修改时间
//        chestCt.setUpdatedAt();
    }

    public void saveAbdominalCt(String examName,EXAM_MASTER examMaster,List<IMAGING> zj_IMAGING) {
        AbdominalCt abdominalCt;
        int i = 0;
        for(IMAGING imaging : zj_IMAGING){
            log.info("field_source:"+imaging.getDATA_FIELD_SOURCE());
            log.info("unique_id:"+examMaster.getUNIQUE_ID());
            log.info(imaging.getDATA_FIELD_SOURCE().equals(examMaster.getUNIQUE_ID()) ? "equal" : "not equal");
            if(imaging.getDATA_FIELD_SOURCE().equals(examMaster.getUNIQUE_ID())){
                i++;
                abdominalCt = new AbdominalCt();
                //标识患者身份唯一标识
                abdominalCt.setPersonId(examMaster.getUNIQUE_ID_LV1());
                //唯一标识
                abdominalCt.setUniqueId(examMaster.getUNIQUE_ID_LV2());
                //医疗机构代码
                abdominalCt.setP900(examMaster.getP900());
                //患者id
                abdominalCt.setPatientId(examMaster.getPATIENT_ID());
                //就诊标识住院号
                abdominalCt.setVisitId(examMaster.getVISIT_ID());
                //检查项目
                abdominalCt.setExamName("腹部CT");
                //检查号
                abdominalCt.setExamNo(examMaster.getEXAM_NO());
//                //检查日期
//                abdominalCt.setExamDateTime(examMaster.getEXAM_DATE_TIME());
//                //报告日期
//                abdominalCt.setReportDateTime(examMaster.getREPORT_DATE_TIME());
//                //影像所见
//                abdominalCt.setDescription(examMaster.getDESCRIPTION());
//                //影像结论
//                abdominalCt.setEntryResults(examMaster.getENTRY_RESULTS());
                //胃部肿物
                String finding = imaging.getFINDING1_STD() + "," + imaging.getFINDING2_STD() + "," + imaging.getFINDING3_STD() + "," + imaging.getFINDING4_STD();
                String site = DrugConstant.getStructure_imaging(imaging);
                if(site != null && site.contains("胃") && !finding.contains("淋巴结")){
                    abdominalCt.setTumor("是");
                    //胃部肿物数目
                    if (imaging.getCOUNT_STD()!=null&&imaging.getCOUNT_STD().equals("1")){
                        abdominalCt.setTumorCount("单发");
                    }else {
                        abdominalCt.setTumorCount(imaging.getCOUNT_STD());
                    }
                    //胃部肿物大小
                    abdominalCt.setTumorSize(DrugConstant.getStructure_size(imaging));
                }else {
                    abdominalCt.setTumor("否");
                }
                //复发
                if(finding.contains("复发") || (examMaster.getENTRY_RESULTS() != null && examMaster.getENTRY_RESULTS().contains("复发"))){
                    abdominalCt.setRecrudescence("是");
                }else{
                    abdominalCt.setRecrudescence("否");
                }
                //转移
                if(finding.contains("转移") || finding.contains("继发") || (examMaster.getENTRY_RESULTS() != null && (examMaster.getENTRY_RESULTS().contains("转移") || examMaster.getENTRY_RESULTS().contains("继发")))){
                    abdominalCt.setTransfer("是");
                    //转移部位 肝、肾、肾上腺、卵巢、腹膜、淋巴结、骨
                    if(finding.contains("肝") || site.contains("肝")){
                        abdominalCt.setTransferSite("肝");
                    }else if(finding.contains("肾") || site.contains("肾")){
                        abdominalCt.setTransferSite("肾");
                    }else if(finding.contains("肾上腺") || site.contains("肾上腺")){
                        abdominalCt.setTransferSite("肾上腺");
                    }else if(finding.contains("卵巢") || site.contains("子宫附件")){
                        abdominalCt.setTransferSite("卵巢");
                    }else if(finding.contains("腹膜") || site.contains("腹部")){
                        abdominalCt.setTransferSite("腹膜");
                    }else if(finding.contains("淋巴结") || site.contains("淋巴结")){
                        abdominalCt.setTransferSite("淋巴结");
                    }else if(finding.contains("骨") || site.contains("骨")){
                        abdominalCt.setTransferSite("骨");
                    }
                    //转移灶数目
                    if (imaging.getCOUNT_STD()!=null&&imaging.getCOUNT_STD().equals("1")){
                        abdominalCt.setTransferCount("单发");
                    }else {
                        abdominalCt.setTransferCount(imaging.getCOUNT_STD());
                    }

                    //转移灶大小
                    abdominalCt.setTransferSize(DrugConstant.getStructure_size(imaging));
                }else{
                    abdominalCt.setTransfer("否");
                }
                //腹水 腹水/腹腔积液/液性
                String diag = imaging.getDIAG1_STD() + "," + imaging.getDIAG2_STD();
                if(StringUtils.isEmpty(imaging.getNEG())){
                    if(diag.contains("腹水") || diag.contains("腹腔积液") || diag.contains("液性")){
                        abdominalCt.setAscites("是");
                    }else{
                        abdominalCt.setAscites("否");
                    }
                }else{
                    abdominalCt.setAscites("否");
                }
                abdominalCtService.saveAbdominalCt(abdominalCt);
            }
        }
        if(i == 0){
            abdominalCt = new AbdominalCt();
            //标识患者身份唯一标识
            abdominalCt.setPersonId(examMaster.getUNIQUE_ID_LV1());
            //唯一标识
            abdominalCt.setUniqueId(examMaster.getUNIQUE_ID_LV2());
            //医疗机构代码
            abdominalCt.setP900(examMaster.getP900());
            //患者id
            abdominalCt.setPatientId(examMaster.getPATIENT_ID());
            //就诊标识住院号
            abdominalCt.setVisitId(examMaster.getVISIT_ID());
            //检查项目
            abdominalCt.setExamName("腹部CT");
            //检查号
            abdominalCt.setExamNo(examMaster.getEXAM_NO());
//            //检查日期
//            abdominalCt.setExamDateTime(examMaster.getEXAM_DATE_TIME());
//            //报告日期
//            abdominalCt.setReportDateTime(examMaster.getREPORT_DATE_TIME());
//            //影像所见
//            abdominalCt.setDescription(examMaster.getDESCRIPTION());
//            //影像结论
//            abdominalCt.setEntryResults(examMaster.getENTRY_RESULTS());
            abdominalCtService.saveAbdominalCt(abdominalCt);
        }

        //数据版本
//        abdominalCt.setDataVersion();
//        //数据库来源
//        abdominalCt.setDataDbSource();
//        //数据表来源
//        abdominalCt.setDataTableSource();
//        //数据项来源
//        abdominalCt.setDataFieldSource();
//        //创建时间
//        abdominalCt.setCreatedAt();
//        //创建人
//        abdominalCt.setCreator();
//        //修改时间
//        abdominalCt.setUpdatedAt();
    }

    public void saveAbdominalMri(String examName,EXAM_MASTER examMaster,List<IMAGING> zj_IMAGING) {
        AbdominalMri abdominalMri;
        int i = 0;
        for(IMAGING imaging:zj_IMAGING){
            if(imaging.getDATA_FIELD_SOURCE().equals(examMaster.getUNIQUE_ID())){
                i++;
                abdominalMri = new AbdominalMri();
                //标识患者身份唯一标识
                abdominalMri.setPersonId(examMaster.getUNIQUE_ID_LV1());
                //唯一标识
                abdominalMri.setUniqueId(examMaster.getUNIQUE_ID_LV2());
                //医疗机构代码
                abdominalMri.setP900(examMaster.getP900());
                //患者id
                abdominalMri.setPatientId(examMaster.getPATIENT_ID());
                //就诊标识住院号
                abdominalMri.setVisitId(examMaster.getVISIT_ID());
                //检查项目
                abdominalMri.setExamName("腹部磁共振");
                //检查号
                abdominalMri.setExamNo(examMaster.getEXAM_NO());
//                //检查日期
//                abdominalMri.setExamDateTime(examMaster.getEXAM_DATE_TIME());
//                //报告日期
//                abdominalMri.setReportDateTime(examMaster.getREPORT_DATE_TIME());
//                //影像所见
//                abdominalMri.setDescription(examMaster.getDESCRIPTION());
//                //影像结论
//                abdominalMri.setEntryResults(examMaster.getENTRY_RESULTS());
                //胃部肿物
                String finding = imaging.getFINDING1_STD() + "," + imaging.getFINDING2_STD() + "," + imaging.getFINDING3_STD() + "," + imaging.getFINDING4_STD();
                String site = DrugConstant.getStructure_imaging(imaging);
                if(site != null && site.contains("胃") && !finding.contains("淋巴结")){
                    abdominalMri.setTumor("是");
                    //胃部肿物数目
                    if (imaging.getCOUNT_STD()!=null&&imaging.getCOUNT_STD().equals("1")){
                        abdominalMri.setTumorCount("单发");
                    }else {
                        abdominalMri.setTumorCount(imaging.getCOUNT_STD());
                    }

                    //胃部肿物大小
                    abdominalMri.setTumorSize(DrugConstant.getStructure_size(imaging));
                }else {
                    abdominalMri.setTumor("否");
                }
                //复发
                if(finding.contains("复发") || (examMaster.getENTRY_RESULTS() != null && examMaster.getENTRY_RESULTS().contains("复发"))){
                    abdominalMri.setRecrudescence("是");
                }else{
                    abdominalMri.setRecrudescence("否");
                }
                //转移
                if(finding.contains("转移") || finding.contains("继发") || (examMaster.getENTRY_RESULTS() != null && (examMaster.getENTRY_RESULTS().contains("转移") || examMaster.getENTRY_RESULTS().contains("继发")))){
                    abdominalMri.setTransfer("是");
                    //转移部位 肝、肾、肾上腺、卵巢、腹膜、淋巴结、骨
                    if(finding.contains("肝") || site.contains("肝")){
                        abdominalMri.setTransferSite("肝");
                    }else if(finding.contains("肾") || site.contains("肾")){
                        abdominalMri.setTransferSite("肾");
                    }else if(finding.contains("肾上腺") || site.contains("肾上腺")){
                        abdominalMri.setTransferSite("肾上腺");
                    }else if(finding.contains("卵巢") || site.contains("子宫附件")){
                        abdominalMri.setTransferSite("卵巢");
                    }else if(finding.contains("腹膜") || site.contains("腹部")){
                        abdominalMri.setTransferSite("腹膜");
                    }else if(finding.contains("淋巴结") || site.contains("淋巴结")){
                        abdominalMri.setTransferSite("淋巴结");
                    }else if(finding.contains("骨") || site.contains("骨")){
                        abdominalMri.setTransferSite("骨");
                    }
                    //转移灶数目
                    if (imaging.getCOUNT_STD()!=null&&imaging.getCOUNT_STD().equals("1")){
                        abdominalMri.setTransferCount("单发");
                    }else {
                        abdominalMri.setTransferCount(imaging.getCOUNT_STD());
                    }
                    //转移灶大小
                    abdominalMri.setTransferSize(DrugConstant.getStructure_size(imaging));
                }else{
                    abdominalMri.setTransfer("否");
                }
                //腹水 腹水/腹腔积液/液性
                String diag = imaging.getDIAG1_STD() + "," + imaging.getDIAG2_STD();
                if(StringUtils.isEmpty(imaging.getNEG())){
                    if(diag.contains("腹水") || diag.contains("腹腔积液") || diag.contains("液性")){
                        abdominalMri.setAscites("是");
                    }else{
                        abdominalMri.setAscites("否");
                    }
                }else{
                    abdominalMri.setAscites("否");
                }
                abdominalMriService.saveAbdominalMri(abdominalMri);
            }
        }
        if(i == 0){
            abdominalMri = new AbdominalMri();
            //标识患者身份唯一标识
            abdominalMri.setPersonId(examMaster.getUNIQUE_ID_LV1());
            //唯一标识
            abdominalMri.setUniqueId(examMaster.getUNIQUE_ID_LV2());
            //医疗机构代码
            abdominalMri.setP900(examMaster.getP900());
            //患者id
            abdominalMri.setPatientId(examMaster.getPATIENT_ID());
            //就诊标识住院号
            abdominalMri.setVisitId(examMaster.getVISIT_ID());
            //检查项目
            abdominalMri.setExamName("腹部磁共振");
            //检查号
            abdominalMri.setExamNo(examMaster.getEXAM_NO());
//            //检查日期
//            abdominalMri.setExamDateTime(examMaster.getEXAM_DATE_TIME());
//            //报告日期
//            abdominalMri.setReportDateTime(examMaster.getREPORT_DATE_TIME());
//            //影像所见
//            abdominalMri.setDescription(examMaster.getDESCRIPTION());
//            //影像结论
//            abdominalMri.setEntryResults(examMaster.getENTRY_RESULTS());
            abdominalMriService.saveAbdominalMri(abdominalMri);
        }
        //数据版本
//        abdominalMri.setDataVersion();
//        //数据库来源
//        abdominalMri.setDataDbSource();
//        //数据表来源
//        abdominalMri.setDataTableSource();
//        //数据项来源
//        abdominalMri.setDataFieldSource();
//        //创建时间
//        abdominalMri.setCreatedAt();
//        //创建人
//        abdominalMri.setCreator();
//        //修改时间
//        abdominalMri.setUpdatedAt();
    }

    public void saveAbdominalUltrasound(String examName,EXAM_MASTER examMaster,List<IMAGING> zj_IMAGING) {
        AbdominalUltrasound abdominalUltrasound;
        int i = 0;
        for(IMAGING imaging:zj_IMAGING) {
            if (imaging.getDATA_FIELD_SOURCE().equals(examMaster.getUNIQUE_ID())) {
                i++;
                abdominalUltrasound = new AbdominalUltrasound();
                //标识患者身份唯一标识
                abdominalUltrasound.setPersonId(examMaster.getUNIQUE_ID_LV1());
                //唯一标识
                abdominalUltrasound.setUniqueId(examMaster.getUNIQUE_ID_LV2());
                //医疗机构代码
                abdominalUltrasound.setP900(examMaster.getP900());
                //患者id
                abdominalUltrasound.setPatientId(examMaster.getPATIENT_ID());
                //就诊标识住院号
                abdominalUltrasound.setVisitId(examMaster.getVISIT_ID());
                //检查项目
                if(examName.contains("腹部超声")){
                    abdominalUltrasound.setExamName("腹部超声");
                }
                if(examName.contains("肝胆胰脾")){
                    abdominalUltrasound.setExamName("肝胆胰脾超声");
                }
                if(examName.contains("肾超声")){
                    abdominalUltrasound.setExamName("肾超声");
                }
                if(examName.contains("子宫及附件超声")){
                    abdominalUltrasound.setExamName("子宫及附件超声");
                }
                if(examName.contains("卵巢输卵管超声")){
                    abdominalUltrasound.setExamName("卵巢输卵管超声");
                }
                //检查号
                abdominalUltrasound.setExamNo(examMaster.getEXAM_NO());
//                //检查日期
//                abdominalUltrasound.setExamDateTime(examMaster.getEXAM_DATE_TIME());
//                //报告日期
//                abdominalUltrasound.setReportDateTime(examMaster.getREPORT_DATE_TIME());
//                //影像所见
//                abdominalUltrasound.setDescription(examMaster.getDESCRIPTION());
//                //影像结论
//                abdominalUltrasound.setEntryResults(examMaster.getENTRY_RESULTS());
                String finding = imaging.getFINDING1_STD() + "," + imaging.getFINDING2_STD() + "," + imaging.getFINDING3_STD() + "," + imaging.getFINDING4_STD();
                String site = DrugConstant.getStructure_imaging(imaging);
                //转移
                if(finding.contains("转移") || finding.contains("继发") || (examMaster.getENTRY_RESULTS() != null && (examMaster.getENTRY_RESULTS().contains("转移") || examMaster.getENTRY_RESULTS().contains("继发")))){
                    abdominalUltrasound.setTransfer("是");
                    //转移部位 肝、肾、肾上腺、卵巢、腹膜、淋巴结、骨
                    if(finding.contains("肝") || site.contains("肝")){
                        abdominalUltrasound.setTransferSite("肝");
                    }else if(finding.contains("肾") || site.contains("肾")){
                        abdominalUltrasound.setTransferSite("肾");
                    }else if(finding.contains("肾上腺") || site.contains("肾上腺")){
                        abdominalUltrasound.setTransferSite("肾上腺");
                    }else if(finding.contains("卵巢") || site.contains("子宫附件")){
                        abdominalUltrasound.setTransferSite("卵巢");
                    }else if(finding.contains("腹膜") || site.contains("腹部")){
                        abdominalUltrasound.setTransferSite("腹膜");
                    }else if(finding.contains("淋巴结") || site.contains("淋巴结")){
                        abdominalUltrasound.setTransferSite("淋巴结");
                    }else if(finding.contains("骨") || site.contains("骨")){
                        abdominalUltrasound.setTransferSite("骨");
                    }
                    //转移灶数目
                    if (imaging.getCOUNT_STD()!=null&&imaging.getCOUNT_STD().equals("1")){
                        abdominalUltrasound.setTransferCount("单发");
                    }else {
                        abdominalUltrasound.setTransferCount(imaging.getCOUNT_STD());
                    }
                    //转移灶大小
                    abdominalUltrasound.setTransferSize(DrugConstant.getStructure_size(imaging));
                }else{
                    abdominalUltrasound.setTransfer("否");
                }
                //腹水 腹水/腹腔积液/液性
                String diag = imaging.getDIAG1_STD() + "," + imaging.getDIAG2_STD();
                if(StringUtils.isEmpty(imaging.getNEG())){
                    if(diag.contains("腹水") || diag.contains("腹腔积液") || diag.contains("液性")){
                        abdominalUltrasound.setAscites("是");
                    }else{
                        abdominalUltrasound.setAscites("否");
                    }
                }else{
                    abdominalUltrasound.setAscites("否");
                }

                abdominalUltrasoundService.saveAbdominalUltrasound(abdominalUltrasound);
            }
        }
        if(i == 0){
            abdominalUltrasound = new AbdominalUltrasound();
            //标识患者身份唯一标识
            abdominalUltrasound.setPersonId(examMaster.getUNIQUE_ID_LV1());
            //唯一标识
            abdominalUltrasound.setUniqueId(examMaster.getUNIQUE_ID_LV2());
            //医疗机构代码
            abdominalUltrasound.setP900(examMaster.getP900());
            //患者id
            abdominalUltrasound.setPatientId(examMaster.getPATIENT_ID());
            //就诊标识住院号
            abdominalUltrasound.setVisitId(examMaster.getVISIT_ID());
            //检查项目
            if(examName.contains("腹部超声")){
                abdominalUltrasound.setExamName("腹部超声");
            }
            if(examName.contains("肝胆胰脾")){
                abdominalUltrasound.setExamName("肝胆胰脾超声");
            }
            if(examName.contains("肾超声")){
                abdominalUltrasound.setExamName("肾超声");
            }
            if(examName.contains("子宫及附件超声")){
                abdominalUltrasound.setExamName("子宫及附件超声");
            }
            if(examName.contains("卵巢输卵管超声")){
                abdominalUltrasound.setExamName("卵巢输卵管超声");
            }
            //检查号
            abdominalUltrasound.setExamNo(examMaster.getEXAM_NO());
//            //检查日期
//            abdominalUltrasound.setExamDateTime(examMaster.getEXAM_DATE_TIME());
//            //报告日期
//            abdominalUltrasound.setReportDateTime(examMaster.getREPORT_DATE_TIME());
//            //影像所见
//            abdominalUltrasound.setDescription(examMaster.getDESCRIPTION());
//            //影像结论
//            abdominalUltrasound.setEntryResults(examMaster.getENTRY_RESULTS());
            abdominalUltrasoundService.saveAbdominalUltrasound(abdominalUltrasound);
        }

        //数据版本
//        abdominalUltrasound.setDataVersion();
//        //数据库来源
//        abdominalUltrasound.setDataDbSource();
//        //数据表来源
//        abdominalUltrasound.setDataTableSource();
//        //数据项来源
//        abdominalUltrasound.setDataFieldSource();
//        //创建时间
//        abdominalUltrasound.setCreatedAt();
//        //创建人
//        abdominalUltrasound.setCreator();
//        //修改时间
//        abdominalUltrasound.setUpdatedAt();

    }

    public void saveNeckUltrasound(String examName,EXAM_MASTER examMaster,List<IMAGING> zj_IMAGING) {
        NeckUltrasound neckUltrasound;
        int i = 0;
        for(IMAGING imaging:zj_IMAGING) {
            if (imaging.getDATA_FIELD_SOURCE().equals(examMaster.getUNIQUE_ID())) {
                i++;
                neckUltrasound = new NeckUltrasound();
                //标识患者身份唯一标识
                neckUltrasound.setPersonId(examMaster.getUNIQUE_ID_LV1());
                //唯一标识
                neckUltrasound.setUniqueId(examMaster.getUNIQUE_ID_LV2());
                //医疗机构代码
                neckUltrasound.setP900(examMaster.getP900());
                //患者id
                neckUltrasound.setPatientId(examMaster.getPATIENT_ID());
                //就诊标识住院号
                neckUltrasound.setVisitId(examMaster.getVISIT_ID());
                //检查项目
                if(examName.contains("颈部超声")){
                    neckUltrasound.setExamName("颈部超声");
                }
                if(examName.contains("浅表淋巴结超声")){
                    neckUltrasound.setExamName("浅表淋巴结超声");
                }
                //检查号
                neckUltrasound.setExamNo(examMaster.getEXAM_NO());
//                //检查日期
//                neckUltrasound.setExamDateTime(examMaster.getEXAM_DATE_TIME());
//                //报告日期
//                neckUltrasound.setReportDateTime(examMaster.getREPORT_DATE_TIME());
//                //影像所见
//                neckUltrasound.setDescription(examMaster.getDESCRIPTION());
//                //影像结论
//                neckUltrasound.setEntryResults(examMaster.getENTRY_RESULTS());
                String finding = imaging.getFINDING1_STD() + "," + imaging.getFINDING2_STD() + "," + imaging.getFINDING3_STD() + "," + imaging.getFINDING4_STD();
                String site = DrugConstant.getStructure_imaging(imaging);
                //转移
                if(finding.contains("转移") || finding.contains("继发") || (examMaster.getENTRY_RESULTS() != null && (examMaster.getENTRY_RESULTS().contains("转移") || examMaster.getENTRY_RESULTS().contains("继发")))){
                    neckUltrasound.setTransfer("是");
                    //转移部位 肝、肾、肾上腺、卵巢、腹膜、淋巴结、骨
                    if(finding.contains("颈部淋巴结") || site.contains("颈部淋巴结")){
                        neckUltrasound.setTransferSite("颈部淋巴结");
                    }else if(finding.contains("锁骨上淋巴结") || site.contains("锁骨上淋巴结")){
                        neckUltrasound.setTransferSite("锁骨上淋巴结");
                    }else if(finding.contains("锁骨下淋巴结") || site.contains("锁骨下淋巴结")){
                        neckUltrasound.setTransferSite("锁骨下淋巴结");
                    }
                }else{
                    neckUltrasound.setTransfer("否");
                }
                neckUltrasoundService.saveNeckUltrasound(neckUltrasound);
            }
        }
        if(i == 0){
            neckUltrasound = new NeckUltrasound();
            //标识患者身份唯一标识
            neckUltrasound.setPersonId(examMaster.getUNIQUE_ID_LV1());
            //唯一标识
            neckUltrasound.setUniqueId(examMaster.getUNIQUE_ID_LV2());
            //医疗机构代码
            neckUltrasound.setP900(examMaster.getP900());
            //患者id
            neckUltrasound.setPatientId(examMaster.getPATIENT_ID());
            //就诊标识住院号
            neckUltrasound.setVisitId(examMaster.getVISIT_ID());
            //检查项目
            if(examName.contains("颈部超声")){
                neckUltrasound.setExamName("颈部超声");
            }
            if(examName.contains("浅表淋巴结超声")){
                neckUltrasound.setExamName("浅表淋巴结超声");
            }
            //检查号
            neckUltrasound.setExamNo(examMaster.getEXAM_NO());
//            //检查日期
//            neckUltrasound.setExamDateTime(examMaster.getEXAM_DATE_TIME());
//            //报告日期
//            neckUltrasound.setReportDateTime(examMaster.getREPORT_DATE_TIME());
//            //影像所见
//            neckUltrasound.setDescription(examMaster.getDESCRIPTION());
//            //影像结论
//            neckUltrasound.setEntryResults(examMaster.getENTRY_RESULTS());
            neckUltrasoundService.saveNeckUltrasound(neckUltrasound);
        }

        //数据版本
//        neckUltrasound.setDataVersion();
//        //数据库来源
//        neckUltrasound.setDataDbSource();
//        //数据表来源
//        neckUltrasound.setDataTableSource();
//        //数据项来源
//        neckUltrasound.setDataFieldSource();
//        //创建时间
//        neckUltrasound.setCreatedAt();
//        //创建人
//        neckUltrasound.setCreator();
//        //修改时间
//        neckUltrasound.setUpdatedAt();

    }

    public void savePetCt(String examName,EXAM_MASTER examMaster,List<IMAGING> zj_IMAGING) {
        PetCt petCt;
        int i = 0;
        for(IMAGING imaging:zj_IMAGING) {
            if (imaging.getDATA_FIELD_SOURCE().equals(examMaster.getUNIQUE_ID())) {
                i++;
                petCt = new PetCt();
                //标识患者身份唯一标识
                petCt.setPersonId(examMaster.getUNIQUE_ID_LV1());
                //唯一标识
                petCt.setUniqueId(examMaster.getUNIQUE_ID_LV2());
                //医疗机构代码
                petCt.setP900(examMaster.getP900());
                //患者id
                petCt.setPatientId(examMaster.getPATIENT_ID());
                //就诊标识住院号
                petCt.setVisitId(examMaster.getVISIT_ID());
                //检查项目
                petCt.setExamName("PET-CT");
                //检查号
                petCt.setExamNo(examMaster.getEXAM_NO());
//                //检查日期
//                petCt.setExamDateTime(examMaster.getEXAM_DATE_TIME());
//                //报告日期
//                petCt.setReportDateTime(examMaster.getREPORT_DATE_TIME());
//                //影像所见
//                petCt.setDescription(examMaster.getDESCRIPTION());
//                //影像结论
//                petCt.setEntryResults(examMaster.getENTRY_RESULTS());
                //胃部肿物
                String finding = imaging.getFINDING1_STD() + "," + imaging.getFINDING2_STD() + "," + imaging.getFINDING3_STD() + "," + imaging.getFINDING4_STD();
                String site = DrugConstant.getStructure_imaging(imaging);
                if(site != null && site.contains("胃") && !finding.contains("淋巴结")){
                    petCt.setTumor("是");
                    //胃部肿物数目
                    if (imaging.getCOUNT_STD()!=null&&imaging.getCOUNT_STD().equals("1")){
                        petCt.setTumorCount("单发");
                    }else {
                        petCt.setTumorCount(imaging.getCOUNT_STD());
                    }
                    //胃部肿物大小
                    petCt.setTumorSize(DrugConstant.getStructure_size(imaging));
                }else {
                    petCt.setTumor("否");
                }
                //复发
                if(finding.contains("复发") || (examMaster.getENTRY_RESULTS() != null && examMaster.getENTRY_RESULTS().contains("复发"))){
                    petCt.setRecrudescence("是");
                }else{
                    petCt.setRecrudescence("否");
                }
                //转移
                if(finding.contains("转移") || finding.contains("继发") || (examMaster.getENTRY_RESULTS() != null && (examMaster.getENTRY_RESULTS().contains("转移") || examMaster.getENTRY_RESULTS().contains("继发")))){
                    petCt.setTransfer("是");
                    //转移部位 肝、肾、肾上腺、卵巢、腹膜、淋巴结、骨
                    if(finding.contains("肝") || site.contains("肝")){
                        petCt.setTransferSite("肝");
                    }else if(finding.contains("肾") || site.contains("肾")){
                        petCt.setTransferSite("肾");
                    }else if(finding.contains("肾上腺") || site.contains("肾上腺")){
                        petCt.setTransferSite("肾上腺");
                    }else if(finding.contains("卵巢") || site.contains("子宫附件")){
                        petCt.setTransferSite("卵巢");
                    }else if(finding.contains("腹膜") || site.contains("腹部")){
                        petCt.setTransferSite("腹膜");
                    }else if(finding.contains("淋巴结") || site.contains("淋巴结")){
                        petCt.setTransferSite("淋巴结");
                    }else if(finding.contains("骨") || site.contains("骨")){
                        petCt.setTransferSite("骨");
                    }
                    //转移灶数目
                    if (imaging.getCOUNT_STD()!=null&&imaging.getCOUNT_STD().equals("1")){
                        petCt.setTransferCount("单发");
                    }else {
                        petCt.setTransferCount(imaging.getCOUNT_STD());
                    }

                    //转移灶大小
                    petCt.setTransferSize(DrugConstant.getStructure_size(imaging));
                }else{
                    petCt.setTransfer("否");
                }
                petCtService.savePetCt(petCt);
            }
        }
        if(i == 0){
            petCt = new PetCt();
            //标识患者身份唯一标识
            petCt.setPersonId(examMaster.getUNIQUE_ID_LV1());
            //唯一标识
            petCt.setUniqueId(examMaster.getUNIQUE_ID_LV2());
            //医疗机构代码
            petCt.setP900(examMaster.getP900());
            //患者id
            petCt.setPatientId(examMaster.getPATIENT_ID());
            //就诊标识住院号
            petCt.setVisitId(examMaster.getVISIT_ID());
            //检查项目
            petCt.setExamName("PET-CT");
            //检查号
            petCt.setExamNo(examMaster.getEXAM_NO());
//            //检查日期
//            petCt.setExamDateTime(examMaster.getEXAM_DATE_TIME());
//            //报告日期
//            petCt.setReportDateTime(examMaster.getREPORT_DATE_TIME());
//            //影像所见
//            petCt.setDescription(examMaster.getDESCRIPTION());
//            //影像结论
//            petCt.setEntryResults(examMaster.getENTRY_RESULTS());
            petCtService.savePetCt(petCt);
        }
        //数据版本
//        petCt.setDataVersion();
//        //数据库来源
//        petCt.setDataDbSource();
//        //数据表来源
//        petCt.setDataTableSource();
//        //数据项来源
//        petCt.setDataFieldSource();
//        //创建时间
//        petCt.setCreatedAt();
//        //创建人
//        petCt.setCreator();
//        //修改时间
//        petCt.setUpdatedAt();

    }

//    public void saveOtherExam(EXAM_MASTER examMaster) {
//        OtherExam otherExam = new OtherExam();
//        //标识患者身份唯一标识
//        otherExam.setPersonId(examMaster.getUNIQUE_ID_LV1());
//        //唯一标识
//        otherExam.setUniqueId(examMaster.getUNIQUE_ID_LV2());
//        //医疗机构代码
//        otherExam.setP900(examMaster.getP900());
//        //患者id
//        otherExam.setPatientId(examMaster.getPATIENT_ID());
//        //就诊标识住院号
//        otherExam.setVisitId(examMaster.getVISIT_ID());
//        //检查项目
//        otherExam.setExamName(examMaster.getEXAM_NAME1_STD());
//        //检查号
//        otherExam.setExamNo(examMaster.getEXAM_NO());
//        //检查日期
//        otherExam.setExamDateTime(examMaster.getEXAM_DATE_TIME());
//        //报告日期
//        otherExam.setReportDateTime(examMaster.getREPORT_DATE_TIME());
//        //影像所见
//        otherExam.setDescription(examMaster.getDESCRIPTION());
//        //影像结论
//        otherExam.setEntryResults(examMaster.getENTRY_RESULTS());
//        //数据版本
////        otherExam.setDataVersion();
////        //数据库来源
////        otherExam.setDataDbSource();
////        //数据表来源
////        otherExam.setDataTableSource();
////        //数据项来源
////        otherExam.setDataFieldSource();
////        //创建时间
////        otherExam.setCreatedAt();
////        //创建人
////        otherExam.setCreator();
////        //修改时间
////        otherExam.setUpdatedAt();
//        otherExamService.saveOtherExam(otherExam);
//    }

    public void saveOperationRecord(List<TEM_OPERATION_RECORD> zj_TEM_OPERATION_RECORD, List<TRANSFUSION_ORDER> zj_TRANSFUSION_ORDER) {
        OperationRecord operationRecord;
        for(TEM_OPERATION_RECORD temOperationRecord:zj_TEM_OPERATION_RECORD){
            operationRecord = new OperationRecord();
            //标识患者身份唯一标识
            operationRecord.setPersonId(temOperationRecord.getUNIQUE_ID_LV1());
            //唯一标识
            operationRecord.setUniqueId(temOperationRecord.getUNIQUE_ID_LV2());
            //医疗机构代码
            operationRecord.setP900(temOperationRecord.getP900());
            //患者id
            operationRecord.setPatientId(temOperationRecord.getPATIENT_ID());
            //住院号
            operationRecord.setVisitId(temOperationRecord.getVISIT_ID());
            //手术名称
            operationRecord.setRcptName(temOperationRecord.getRCPT_NO());
            //手术记录
            operationRecord.setSurgicalProcess(temOperationRecord.getSURGICAL_PROCESS());
            //术者姓名
            operationRecord.setNameOfSurgeon(temOperationRecord.getNAME_OF_SURGEON());
            //Ⅰ助姓名
            operationRecord.setName1(temOperationRecord.getNAME_1());
            //Ⅱ助姓名
            operationRecord.setName2(temOperationRecord.getNAME_2());
            //麻醉方式
            operationRecord.setAnesthesiaMethod(temOperationRecord.getANESTHESIA_METHOD());
            //麻醉医师姓名
            operationRecord.setAnesthesiologist(temOperationRecord.getANESTHESIOLOGIST());
            //手术开始时间
            operationRecord.setItemBeginDate(temOperationRecord.getITEM_BEGIN_DATE());
            //手术结束时间
            operationRecord.setItemEndDate(temOperationRecord.getITEM_END_DATE());
            //输血
            operationRecord.setBloodTransfusion(StringUtils.isNotEmpty(temOperationRecord.getBLOOD_TRANSFUSION_VOLUME())?"是":"否");
            //输血量
            operationRecord.setBloodTransfusionVolume(temOperationRecord.getBLOOD_TRANSFUSION_VOLUME());
            //输入成分
            for(TRANSFUSION_ORDER transfusionOrder: zj_TRANSFUSION_ORDER){
                if(temOperationRecord.getITEM_BEGIN_DATE() != null && temOperationRecord.getITEM_END_DATE() != null){
                    if(transfusionOrder.getENTER_DATE_TIME()!= null && transfusionOrder.getSTOP_ORDER_DATE_TIME() != null && transfusionOrder.getENTER_DATE_TIME().after(temOperationRecord.getITEM_BEGIN_DATE()) && transfusionOrder.getSTOP_ORDER_DATE_TIME().before(temOperationRecord.getITEM_END_DATE())){
                        operationRecord.setInputComponents(DrugConstant.getInputComponents(transfusionOrder.getBLOOD_COMPONENT()));
                    }
                }
            }
            //数据版本
//            operationRecord.setDataVersion();
//            //数据库来源
//            operationRecord.setDataDbSource();
//            //数据表来源
//            operationRecord.setDataTableSource();
//            //数据项来源
//            operationRecord.setDataFieldSource();
//            //创建时间
//            operationRecord.setCreatedAt();
//            //创建人
//            operationRecord.setCreator();
//            //修改时间
//            operationRecord.setUpdatedAt();
            operationRecordService.saveOperationRecord(operationRecord);
        }
    }

    public void saveSurgeryProc(List<SURGERY_PROC> zj_SURGERY_PROC) {
        SurgeryProc surgeryProc;
        for(SURGERY_PROC surgery_proc : zj_SURGERY_PROC){
            surgeryProc = new SurgeryProc();
            //标识患者身份唯一标识
            surgeryProc.setPersonId(surgery_proc.getUNIQUE_ID_LV1());
            //唯一标识
            surgeryProc.setUniqueId(surgery_proc.getUNIQUE_ID_LV2());
            //医疗机构代码
            surgeryProc.setP900(surgery_proc.getP900());
            //患者id
            surgeryProc.setPatientId(surgery_proc.getPATIENT_ID());
            //住院号
            surgeryProc.setVisitId(surgery_proc.getVISIT_ID());
            //手术入路
            if(surgery_proc.getMETHOD_STD()!=null) {
                if (surgery_proc.getMETHOD_STD().contains("机器人")) {
                    surgeryProc.setSurgicalApproach("机器人");
                } else if (surgery_proc.getMETHOD_STD().contains("全腹腔镜")) {
                    surgeryProc.setSurgicalApproach("全腹腔镜");
                } else if (surgery_proc.getMETHOD_STD().contains("腹腔镜辅助")) {
                    surgeryProc.setSurgicalApproach("腹腔镜辅助");
                } else if (surgery_proc.getMETHOD_STD().contains("机器人中转")) {
                    surgeryProc.setSurgicalApproach("机器人中转");
                } else if (surgery_proc.getMETHOD_STD().contains("腹腔镜中转")) {
                    surgeryProc.setSurgicalApproach("腹腔镜中转");
                } else if (surgery_proc.getMETHOD_STD().contains("开腹")) {
                    surgeryProc.setSurgicalApproach("开腹");
                } else if (surgery_proc.getMETHOD_STD().contains("胸腹联合")) {
                    surgeryProc.setSurgicalApproach("胸腹联合");
                }

                //淋巴结清扫
                if(surgery_proc.getMETHOD_STD().contains("淋巴结清扫") || (surgery_proc.getSUB_STRUCTURE_STD()!= null && surgery_proc.getSUB_STRUCTURE_STD() != "")){
                    surgeryProc.setLymphadenectomy("是");
                }else{
                    surgeryProc.setLymphadenectomy("否");
                }
            }
            //术中出血量
            if(surgery_proc.getPARAMETER_STD() != null){
                surgeryProc.setBleedingVolume(surgery_proc.getPARAMETER_STD().contains("术中出血")?surgery_proc.getVALUE_STD():null);
            }
            //粘连
            if(surgery_proc.getFINDING_STD() != null){
                if(surgery_proc.getFINDING_STD().contains("粘连") && (surgery_proc.getNEG_STD() == null || surgery_proc.getNEG_STD() == "")){
                    surgeryProc.setAdhesion("是");
                    //粘连部位
                    surgeryProc.setAdhesionSite(surgery_proc.getSTRUCTURE_STD());
                }else{
                    surgeryProc.setAdhesion("否");
                }
            }
            //切除方式
            if(surgery_proc.getRESECTION_STD() != null){
                if(surgery_proc.getRESECTION_STD().contains("远端胃切除")){
                    surgeryProc.setResectionMode("远端胃切除");
                }else if(surgery_proc.getRESECTION_STD().contains("全胃切除")){
                    surgeryProc.setResectionMode("全胃切除");
                }else if(surgery_proc.getRESECTION_STD().contains("保留贲门近全胃切除")){
                    surgeryProc.setResectionMode("保留贲门近全胃切除");
                }else if(surgery_proc.getRESECTION_STD().contains("全胃切除")){
                    surgeryProc.setResectionMode("近端胃切除");
                }else if(surgery_proc.getRESECTION_STD().contains("保留幽门的胃切除")){
                    surgeryProc.setResectionMode("保留幽门的胃切除");
                }else if(surgery_proc.getRESECTION_STD().contains("局部切除")){
                    surgeryProc.setResectionMode("局部切除");
                }else if(surgery_proc.getRESECTION_STD().contains("节段切除")){
                    surgeryProc.setResectionMode("节段切除");
                }else{
                    surgeryProc.setResectionMode("其他");
                }
            }

            //主要重建方式
            String reconstruction = "";
            if(surgery_proc.getRECONSTRUCTION1_STD() != null){
                reconstruction = surgery_proc.getRECONSTRUCTION1_STD();
            }
            if(surgery_proc.getRECONSTRUCTION2_STD() != null){
                if(surgery_proc.getRECONSTRUCTION1_STD() == null){
                    reconstruction  = surgery_proc.getRECONSTRUCTION2_STD();
                }else{
                    reconstruction = reconstruction + "," + surgery_proc.getRECONSTRUCTION2_STD();
                }
            }
            if(reconstruction.contains("管形")){
                surgeryProc.setReconstructionMain("管形");
            }
            if(reconstruction.contains("线型")){
                surgeryProc.setReconstructionMain("线型");
            }
            //重建具体方式
            surgeryProc.setReconstructionDetail(reconstruction);
            //淋巴结清扫范围
            surgeryProc.setSubStructure(DrugConstant.getSubStructure(surgery_proc.getSUB_STRUCTURE_STD()));
            //淋巴结清扫范围-D2+范围
            surgeryProc.setD2Plus(surgery_proc.getD2_PLUS_STD());
            //切口长度（指手术切口）
            if(surgery_proc.getMEDIAN_DIAM1_STD() == null && surgery_proc.getMEDIAN_DIAM2_STD() == null &&
                    surgery_proc.getMIN_DIAM1_STD() == null && surgery_proc.getMIN_DIAM2_STD() == null){
                StringBuffer sb = new StringBuffer();
                if(surgery_proc.getMAX_DIAM1_STD() != null){
                    sb.append(surgery_proc.getMAX_DIAM1_STD());
                    sb.append(surgery_proc.getUNIT1_STD());
                }
                if(surgery_proc.getMAX_DIAM2_STD() != null){
                    sb.append(",");
                    sb.append(surgery_proc.getMAX_DIAM2_STD());
                    sb.append(surgery_proc.getUNIT2_STD());
                }
                if(surgery_proc.getMAX_DIAM3_STD() != null){
                    sb.append(",");
                    sb.append(surgery_proc.getMAX_DIAM3_STD());
                    sb.append(surgery_proc.getUNIT3_STD());
                }
                if(surgery_proc.getMAX_DIAM4_STD() != null){
                    sb.append(",");
                    sb.append(surgery_proc.getMAX_DIAM4_STD());
                    sb.append(surgery_proc.getUNIT4_STD());
                }
                surgeryProc.setCutSize(sb.toString());
            }
            //切口位置
            surgeryProc.setCutLocation(surgery_proc.getLOCATION());
            //联合切除
            surgeryProc.setCombinedCut(surgery_proc.getCOMBINED_ORGAN_STD() != null?"有":"无");
            //联合切除器官
            surgeryProc.setCombined_cutOrgan(surgery_proc.getCOMBINED_ORGAN_STD());
//            //数据版本
//            surgeryProc.setDataVersion();
//            //数据库来源
//            surgeryProc.setDataDbSource();
//            //数据表来源
//            surgeryProc.setDataTableSource();
//            //数据项来源
//            surgeryProc.setDataFieldSource();
//            //创建时间
//            surgeryProc.setCreatedAt();
//            //创建人
//            surgeryProc.setCreator();
//            //修改时间
//            surgeryProc.setUpdatedAt();
            surgeryProcService.saveSurgeryProc(surgeryProc);
        }

    }

    public void savePostoperativeRecovery(List<TRANSFER_DEPT> zj_TRANSFER_DEPT,List<TEM_OPERATION_RECORD> zj_TEM_OPERATION_RECORD,
                                          List<TEM_OUTP_DISCHARGE_STATUS> zj_TEM_OUTP_DISCHARGE_STATUS,List<PHYSICAL_EXAM> zj_PHYSICAL_EXAM,
                                          List<POSTOP_FUNCTION> zj_POSTOP_FUNCTION,List<INP_ORDERS> zj_INP_ORDERS,List<TRANSFUSION_ORDER> zj_TRANSFUSION_ORDER) {
        PostoperativeRecovery postoperativeRecovery;
        for(TEM_OPERATION_RECORD temOperationRecord:zj_TEM_OPERATION_RECORD){
            postoperativeRecovery = new PostoperativeRecovery();
            //标识患者身份唯一标识
            postoperativeRecovery.setPersonId(temOperationRecord.getUNIQUE_ID_LV1());
            //唯一标识
            postoperativeRecovery.setUniqueId(temOperationRecord.getUNIQUE_ID_LV2());
            //医疗机构代码
            postoperativeRecovery.setP900(temOperationRecord.getP900());
            //患者id
            postoperativeRecovery.setPatientId(temOperationRecord.getPATIENT_ID());
            //住院号
            postoperativeRecovery.setVisitId(temOperationRecord.getVISIT_ID());
            for(TRANSFER_DEPT transferDept:zj_TRANSFER_DEPT){
                if(transferDept.gettransfer_to_dept() != null &&  transferDept.getvisit_type() == 1 && temOperationRecord.getITEM_END_DATE() != null &&
                        transferDept.gettransfer_to_dept().contains("ICU") && transferDept.gettransfer_in_time().after(temOperationRecord.getITEM_END_DATE())){
                    //术后转入ICU
                    postoperativeRecovery.setToIcu("是");
                    //术后转入ICU原因
                    postoperativeRecovery.setToIcuReason(transferDept.gettransfer_purpose());
                    //转入ICU日期
                    postoperativeRecovery.setToIcuDate(transferDept.gettransfer_in_time());
                }else{
                    //术后转入ICU
                    postoperativeRecovery.setToIcu("否");
                }
                //转出ICU日期
                if(transferDept.gettransfer_from_dept() != null){
                    postoperativeRecovery.setOffIcuDate(transferDept.gettransfer_from_dept().contains("ICU")?transferDept.gettransfer_out_time():null);
                }
            }
            for(TEM_OUTP_DISCHARGE_STATUS temOutpDischargeStatus:zj_TEM_OUTP_DISCHARGE_STATUS){
                //入院日期
                postoperativeRecovery.setAdmissionDateTime(temOutpDischargeStatus.getadmission_date_time());
                //出院日期
                postoperativeRecovery.setDischargeDateTime(temOutpDischargeStatus.getdischarge_date_time());
                //总住院天数
                postoperativeRecovery.setInDaysTotal(temOutpDischargeStatus.gettzy_days());
                //术后住院天数
                if(temOperationRecord.getITEM_END_DATE() != null && temOutpDischargeStatus.getdischarge_date_time() != null){
                    Long start = temOperationRecord.getITEM_END_DATE().getTime();
                    Long end = temOutpDischargeStatus.getdischarge_date_time().getTime();
                    Long between = (end-start)/(24*60*60*1000);
                    postoperativeRecovery.setVlineDays(between.intValue());
                }
                //出院前体重
                for(PHYSICAL_EXAM physicalExam:zj_PHYSICAL_EXAM){
                    if(physicalExam.getSIGN_NAME() != null && physicalExam.getSIGN_NAME().contains("体重")){
                        postoperativeRecovery.setPreDischargeWeight(physicalExam.getSIGN_VALUE_STD());
                    }
                }

                //术后转归
                if(temOutpDischargeStatus.gettreatment_effect() != null){
                    //无并发症出院，并发症治愈出院，自动出院，死亡
                    if(temOutpDischargeStatus.gettreatment_effect().contains("无并发症出院")){
                        postoperativeRecovery.setOutcomes("无并发症出院");
                    }else if(temOutpDischargeStatus.gettreatment_effect().contains("并发症治愈出院")){
                        postoperativeRecovery.setOutcomes("并发症治愈出院");
                    }else if(temOutpDischargeStatus.gettreatment_effect().contains("自动出院")){
                        postoperativeRecovery.setOutcomes("自动出院");
                    }else if(temOutpDischargeStatus.gettreatment_effect().contains("死亡")){
                        postoperativeRecovery.setOutcomes("死亡");
                    }
                }
            }
            for(POSTOP_FUNCTION postopFunction : zj_POSTOP_FUNCTION){
                if(postopFunction.getFUNCTION() != null){
                    //首次离床日期
                    postoperativeRecovery.setFirstBedAwayDate(postopFunction.getFUNCTION().contains("离床")?(postopFunction.getDATE_TIME_P()==null?postopFunction.getDATE_TIME_ESTIMATE():postopFunction.getDATE_TIME_P()):null);
                    //肠功能恢复(肠鸣音/排气)日期
                    if (postopFunction.getNEG_STD() == null ) {
                        if(postopFunction.getFUNCTION() != null && postopFunction.getFUNCTION().contains("排气") || postopFunction.getFUNCTION().contains("排便") ||postopFunction.getFUNCTION().contains("肠鸣音恢复")){
                            postoperativeRecovery.setIntestinalRecoveryDate(postopFunction.getDATE_TIME_P()==null?postopFunction.getDATE_TIME_ESTIMATE():postopFunction.getDATE_TIME_P());
                        }
                    }
                    //恢复全流食日期
                    postoperativeRecovery.setLiquidDietsRecoveryDate(postopFunction.getFUNCTION().contains("全流食")?(postopFunction.getDATE_TIME_P()==null?postopFunction.getDATE_TIME_ESTIMATE():postopFunction.getDATE_TIME_P()):null);
                    //恢复半流食日期
                    postoperativeRecovery.setHalfDietsRecoveryDate(postopFunction.getFUNCTION().contains("半流食")?(postopFunction.getDATE_TIME_P()==null?postopFunction.getDATE_TIME_ESTIMATE():postopFunction.getDATE_TIME_P()):null);
                }
                for(INP_ORDERS inpOrders : zj_INP_ORDERS){
                    if(inpOrders.getORDER_TEXT() != null && temOperationRecord.getITEM_END_DATE() != null && inpOrders.getENTER_DATE_TIME().after(temOperationRecord.getITEM_END_DATE())){
                        //留置胃管
                        postoperativeRecovery.setIsGastricIntubation(inpOrders.getORDER_TEXT().contains("胃管")?"是":"否");
                        //拔除胃管日期
                        postoperativeRecovery.setGastricOutDate(inpOrders.getORDER_TEXT().contains("拔除胃管")?inpOrders.getENTER_DATE_TIME():null);
                        //留置腹腔引流管
                        postoperativeRecovery.setIsShuntIntubation(inpOrders.getORDER_TEXT().contains("腹腔引流管")?"是":"否");
                        //留置腹腔引流管数目
                        if(inpOrders.getORDER_TEXT().contains("腹腔引流管")){
                            String num = DrugConstant.getDigit(inpOrders.getORDER_TEXT());
                            if("0".equals(num)){
                                postoperativeRecovery.setShuntCount(1);
                            }else{
                                postoperativeRecovery.setShuntCount(Integer.valueOf(num));
                            }
                        }
                        //拔除最后一根引流管日期
                        postoperativeRecovery.setLastShuntOutDate(inpOrders.getORDER_TEXT().contains("拔除最后一根引流管")?inpOrders.getENTER_DATE_TIME():null);
                    }
                }
            }
            for(TRANSFUSION_ORDER transfusionOrder : zj_TRANSFUSION_ORDER){
                //输血
                postoperativeRecovery.setTransfusion(StringUtils.isNotEmpty(transfusionOrder.getORDER_TEXT())?"是":"否");
                //输血量
                postoperativeRecovery.setBloodTransfusionVolume(Double.valueOf(DrugConstant.getDigit(transfusionOrder.getORDER_TEXT())));
                //输血成分
                postoperativeRecovery.setBloodComponent(DrugConstant.getInputComponents(transfusionOrder.getBLOOD_COMPONENT()));
            }
//
//            //数据版本
//            postoperativeRecovery.setDataVersion();
//            //数据库来源
//            postoperativeRecovery.setDataDbSource();
//            //数据表来源
//            postoperativeRecovery.setDataTableSource();
//            //数据项来源
//            postoperativeRecovery.setDataFieldSource();
//            //创建时间
//            postoperativeRecovery.setCreatedAt();
//            //创建人
//            postoperativeRecovery.setCreator();
//            //修改时间
//            postoperativeRecovery.setUpdatedAt();
            postoperativeRecoveryService.savePostoperativeRecovery(postoperativeRecovery);
        }
    }

    public void saveOperationComplications(List<TEM_OUTP_DISCHARGE_STATUS> zj_TEM_OUTP_DISCHARGE_STATUS) {
        OperationComplications operationComplications;
        for(TEM_OUTP_DISCHARGE_STATUS temOutpDischargeStatus:zj_TEM_OUTP_DISCHARGE_STATUS){
            operationComplications = new OperationComplications();
            //标识患者身份唯一标识
            operationComplications.setPersonId(temOutpDischargeStatus.getunique_id_lv1());
            //唯一标识
            operationComplications.setUniqueId(temOutpDischargeStatus.getunique_id_lv2());
            //医疗机构代码
            operationComplications.setP900(temOutpDischargeStatus.getp900());
            //患者id
            operationComplications.setPatientId(temOutpDischargeStatus.getpatient_id());
            //住院号
            operationComplications.setVisitId(temOutpDischargeStatus.getvisit_id());
            if(temOutpDischargeStatus.gettzl_process() != null){
                String tzlProcess = temOutpDischargeStatus.gettzl_process();
                //脂肪液化
                operationComplications.setFatLiquefaction(tzlProcess.contains("脂肪液化")?"是":"否");
                //皮下积液
                operationComplications.setScalpHydrops(tzlProcess.contains("皮下积液")?"是":"否");
                //切口血肿
                operationComplications.setIncisionHematoma(tzlProcess.contains("切口血肿")?"是":"否");
                //切口愈合不良
                operationComplications.setPoorWoundHealing(tzlProcess.contains("切口愈合不良")?"是":"否");
                //切口感染
                operationComplications.setIncisionInfection(tzlProcess.contains("切口感染")?"是":"否");
                //切口裂开
                operationComplications.setWoundDisruption(tzlProcess.contains("切口裂开")?"是":"否");
                //吻合口瘘
                operationComplications.setStomaFistula(tzlProcess.contains("吻合口瘘")?"是":"否");
                //肠瘘
                operationComplications.setIntestinalFistula(tzlProcess.contains("肠瘘")?"是":"否");
                //十二指肠残端瘘
                operationComplications.setDuodenalStumpFistula(tzlProcess.contains("十二指肠残端瘘")?"是":"否");
                //淋巴漏
                operationComplications.setLymphLeakage(tzlProcess.contains("淋巴漏")?"是":"否");
                //胰瘘
                operationComplications.setPancreaticFistula(tzlProcess.contains("胰瘘")?"是":"否");
                //腹腔内出血
                operationComplications.setAbdominalBleeding(tzlProcess.contains("腹腔内出血")?"是":"否");
                //消化道内出血（消化道溃疡并出血）
                operationComplications.setInAlimentaryBleeding(tzlProcess.contains("消化道内出血")||tzlProcess.contains("消化道溃疡并出血")?"是":"否");
                //吻合口出血
                operationComplications.setAnastomoticBleeding(tzlProcess.contains("吻合口出血")?"是":"否");
                //手术周围器官损伤出血
                operationComplications.setOpsDamageBleeding(tzlProcess.contains("手术周围器官损伤出血")?"是":"否");
                //脾出血
                operationComplications.setSplenorrhagia(tzlProcess.contains("脾出血")?"是":"否");
                //胰腺出血
                operationComplications.setPancreasBleeding(tzlProcess.contains("胰腺出血")?"是":"否");
                //肝出血
                operationComplications.setLiverBleeding(tzlProcess.contains("肝出血")?"是":"否");
                //肠出血
                operationComplications.setEnterorrhagid(tzlProcess.contains("肠出血")?"是":"否");
                //肾出血
                operationComplications.setNephrorrhagia(tzlProcess.contains("肾出血")?"是":"否");
                //吻合口狭窄
                operationComplications.setAnastomoticStenosis(tzlProcess.contains("吻合口狭窄")?"是":"否");
                //腹腔积液
                operationComplications.setAscites(tzlProcess.contains("腹腔积液")?"是":"否");
                //腹腔脓肿
                operationComplications.setAbdominalAbscess(tzlProcess.contains("腹腔积液")?"是":"否");
                //腹腔感染
                operationComplications.setAbdominalInfection(tzlProcess.contains("腹腔感染")?"是":"否");
                //肠梗阻
                operationComplications.setIntestinalObstruction(tzlProcess.contains("肠梗阻")?"是":"否");
                //残胃炎（残胃溃疡）
                operationComplications.setRemnantGastritis(tzlProcess.contains("残胃炎")||tzlProcess.contains("残胃溃疡")?"是":"否");
                //胃瘫
                operationComplications.setGastroparesis(tzlProcess.contains("胃瘫")?"是":"否");
                //十二指肠球炎（十二指肠溃疡）
                operationComplications.setBulbarDuodenitis(tzlProcess.contains("十二指肠球炎")||tzlProcess.contains("十二指肠溃疡")?"是":"否");
                //胰腺炎
                operationComplications.setPancreatitis(tzlProcess.contains("胰腺炎")?"是":"否");
                //肝炎
                operationComplications.setHepatitis(tzlProcess.contains("肝炎")?"是":"否");
                //胆囊炎
                operationComplications.setCholecystitis(tzlProcess.contains("胆囊炎")?"是":"否");
                //肺炎
                operationComplications.setPneumonia(tzlProcess.contains("肺炎")?"是":"否");
                //胸腔积液
                operationComplications.setPleuralEffusion(tzlProcess.contains("胸腔积液")?"是":"否");
                //肾衰竭
                operationComplications.setRenalFailure(tzlProcess.contains("肾衰竭")?"是":"否");
                //心脑血管意外
                operationComplications.setCardiovascularAccident(tzlProcess.contains("心脑血管意外")?"是":"否");
                //深静脉血栓
                operationComplications.setDeepVenousThrombosis(tzlProcess.contains("深静脉血栓")?"是":"否");
                //肺栓塞
                operationComplications.setPulmonaryEmbolism(tzlProcess.contains("肺栓塞")?"是":"否");
                //并发症发生日期
                operationComplications.setComplicationDate(temOutpDischargeStatus.getrecord_date_time());
            }
            //数据版本
//            operationComplications.setDataVersion();
//            //数据库来源
//            operationComplications.setDataDbSource();
//            //数据表来源
//            operationComplications.setDataTableSource();
//            //数据项来源
//            operationComplications.setDataFieldSource();
//            //创建时间
//            operationComplications.setCreatedAt();
//            //创建人
//            operationComplications.setCreator();
//            //修改时间
//            operationComplications.setUpdatedAt();
            operationComplicationsService.saveOperationComplications(operationComplications);
        }

    }

//    public void savePathological(List<HISTOLOGY_REPORT> zj_HISTOLOGY_REPORT, List<PATHOLOGY> zj_PATHOLOGY) {
//        Pathological pathological ;
//        for(HISTOLOGY_REPORT histologyReport : zj_HISTOLOGY_REPORT){
//            pathological = new Pathological();
//            //标识患者身份唯一标识
//            pathological.setPersonId(histologyReport.getUNIQUE_ID_LV1());
//            //唯一标识
//            pathological.setUniqueId(histologyReport.getUNIQUE_ID_LV2());
//            //医疗机构代码
//            pathological.setP900(histologyReport.getP900());
//            //患者id
//            pathological.setPatientId(histologyReport.getPATIENT_ID());
//            //住院号
//            pathological.setVisitId(histologyReport.getVISIT_ID());
//            //病理号
//            pathological.setCaseNumber(histologyReport.getPATHOLOGY_NO());
//            //送检标本名称
//            pathological.setSpecimenName(histologyReport.getINSPECTION_SITE());
//            //送检日期
//            pathological.setInspectTime(histologyReport.getINSPECTION_TIME());
//            //收到日期
//            pathological.setReceiveTime(histologyReport.getSPECIMEN_RECEIVING_TIME());
//            //报告日期
//            pathological.setReprotTime(histologyReport.getREPORT_TIME());
//            //肉眼所见
//            pathological.setVisible(histologyReport.getPATH_EYE());
//            //镜下所见
//            pathological.setMirror(histologyReport.getPATH_MICROSCOPE());
//            //原位癌
//            if(histologyReport.getPATH_DIAG_CODE()!= null){
//                String d = histologyReport.getPATH_DIAG_CODE();
//                if(d.contains("D")){
//                    if(d.contains("D01") || d.contains("D02") || d.contains("D03") || d.contains("D04") || d.contains("D05") || d.contains("D06") ||
//                            d.contains("D07") || d.contains("D08") || d.contains("D09")){
//                        pathological.setCarcinomaSitu("是");
//                    }else{
//                        pathological.setCarcinomaSitu("否");
//                    }
//                }else{
//                    pathological.setCarcinomaSitu("无法判断");
//                }
//            }
//            String tumorSite = "";
//            String tumorSize = "";
//            String lesionType = "";
//            String lesionGrade = "";
//            // 血管侵犯
//            String vnascularInvasion = "否";
//            // 淋巴管侵犯
//            String lymphaticInvasion = "否";
//            // 神经侵犯
//            String nerveInvasion = "否";
//            String statusLayer = "";
//            String invasionOrgans = "";
//            String distanceCut = "";
//            String distanceFarCut = "";
//            int totalNodes = 0;
//            int lymphNodeNumber = 0;
//            String lymphFlag = "0";
//            String[] strArray;
//            String locationLymphNode = "";
//            for(PATHOLOGY pathology:zj_PATHOLOGY){
//                if(pathology.getDATA_FIELD_SOURCE().equals(histologyReport.getUNIQUE_ID())){
//                    if(pathology.getTUMOR_SITE1_STD() != null){
//                        if(!"".equals(tumorSite)){
//                            tumorSite = tumorSite + "," + pathology.getTUMOR_SITE1_STD();
//                        }else{
//                            tumorSite = pathology.getTUMOR_SITE1_STD();
//                        }
//                    }
//                    if(pathology.getTUMOR_SITE2_STD() != null){
//                        if(!"".equals(tumorSite)){
//                            tumorSite = tumorSite + "," + pathology.getTUMOR_SITE2_STD();
//                        }else{
//                            tumorSite = pathology.getTUMOR_SITE2_STD();
//                        }
//                    }
//                    if(pathology.getTUMOR_SITE3_STD() != null){
//                        if(!"".equals(tumorSite)){
//                            tumorSite = tumorSite + "," + pathology.getTUMOR_SITE3_STD();
//                        }else{
//                            tumorSite = pathology.getTUMOR_SITE3_STD();
//                        }
//                    }
//                    if(pathology.getTUMOR_SITE4_STD() != null){
//                        if(!"".equals(tumorSite)){
//                            tumorSite = tumorSite + "," + pathology.getTUMOR_SITE4_STD();
//                        }else{
//                            tumorSite = pathology.getTUMOR_SITE4_STD();
//                        }
//                    }
//                    String tumorSize1 = "";
//                    if(pathology.getMAX_DIAM1_STD() != null){
//                        tumorSize1 = pathology.getMAX_DIAM1_STD() + "*" + pathology.getMEDIAN_DIAM1_STD() + "*" + pathology.getMIN_DIAM1_STD() + pathology.getUNIT1_STD();
//                    }
//                    if(pathology.getMAX_DIAM2_STD() != null){
//                        if("".equals(tumorSize1)){
//                            tumorSize1 = pathology.getMAX_DIAM2_STD() + pathology.getUNIT2_STD();
//                        }else{
//                            tumorSize1 = "," + pathology.getMAX_DIAM2_STD() + pathology.getUNIT2_STD();
//                        }
//                    }
//                    if(!"".equals(tumorSize1)){
//                        if("".equals(tumorSize)){
//                            tumorSize = tumorSize1.replace("*null","");
//                        }else{
//                            tumorSize = "," + tumorSize1.replace("*null","");
//                        }
//                    }
//                    if(pathology.getLESION_TYPE_STD() != null){
//                        lesionType = lesionType + pathology.getLESION_TYPE_STD();
//                    }
//                    if(pathology.getLESION_GRADE_STD() != null){
//                        lesionGrade = lesionGrade + pathology.getLESION_GRADE_STD();
//                    }
//                    String site = pathology.getSTATUS_SITE1_STD() + "," + pathology.getSTATUS_SITE1_STD() + "," + pathology.getSTATUS_SITE1_STD() + "," +
//                            pathology.getSTATUS_SITE1_STD() + "," + pathology.getSTATUS_SITE1_STD() + ",";
//                    site = site.replace("null,","");
//                    String layer = "";
//                    if(pathology.getNEG_STD() == null && (pathology.getSTATUS_INVASION1_STD() != null || pathology.getSTATUS_INVASION2_STD() != null)){
//                        layer = pathology.getSTATUS_LAYER1_STD() + "," + pathology.getSTATUS_LAYER2_STD() + "," + pathology.getSTATUS_LAYER3_STD()
//                                + "," + pathology.getSTATUS_LAYER4_STD() + "," + pathology.getSTATUS_LAYER5_STD() + ",";
//                        layer = layer.replace("null,","");
//                        if(site.contains("血管") && "否".equals(vnascularInvasion)){
//                            vnascularInvasion = "是";
//                        }
//                        if(site.contains("淋巴管") && "否".equals(lymphaticInvasion)){
//                            lymphaticInvasion = "是";
//                        }
//                        if(site.contains("血管") && "否".equals(nerveInvasion)){
//                            nerveInvasion = "是";
//                        }
//                    }
//                    if(!"".equals(layer)){
//                        statusLayer = layer + statusLayer;
//                    }
//                    if(!"".equals(site)){
//                        invasionOrgans = site + invasionOrgans;
//                    }
//                    String edgeType = pathology.getEDGE_TYPE1_STD() + "," + pathology.getEDGE_TYPE2_STD() + "," + pathology.getEDGE_TYPE3_STD() + "," + pathology.getEDGE_TYPE4_STD();
//                    if(edgeType.contains("近切缘")){
//                        if(pathology.getEDGE_DISTANCE1_STD() != null){
//                            if("".equals(distanceCut)){
//                                distanceCut = pathology.getEDGE_DISTANCE1_STD() + pathology.getEDGE_UNIT1_STD()==null?"":pathology.getEDGE_UNIT1_STD();
//                            }else{
//                                distanceCut = distanceCut + "," + pathology.getEDGE_DISTANCE1_STD() + pathology.getEDGE_UNIT1_STD()==null?"":pathology.getEDGE_UNIT1_STD();
//                            }
//                        }
//                    }
//                    if(edgeType.contains("远切缘")){
//                        if(pathology.getEDGE_DISTANCE1_STD() != null){
//                            if("".equals(distanceFarCut)){
//                                distanceFarCut = pathology.getEDGE_DISTANCE1_STD() + pathology.getEDGE_UNIT1_STD()==null?"":pathology.getEDGE_UNIT1_STD();
//                            }else{
//                                distanceFarCut = distanceCut + "," + pathology.getEDGE_DISTANCE1_STD() + pathology.getEDGE_UNIT1_STD()==null?"":pathology.getEDGE_UNIT1_STD();
//                            }
//                        }
//                    }
//                    if(pathology.getCOUNT1_STD() != null && pathology.getCOUNT1_STD().contains("/")){
//                        strArray = pathology.getCOUNT1_STD().split("/");
//                        totalNodes = totalNodes + Integer.valueOf(strArray[1]);
//                        lymphNodeNumber = lymphNodeNumber + Integer.valueOf(strArray[0]);
//                        lymphFlag = "1";
//                        if(!"0".equals(strArray[0])){
//                            locationLymphNode = locationLymphNode + "," + pathology.getLN_SITE1_STD() + "," + pathology.getLN_LOCATION1_STD();
//                        }
//                    }
//                    if(pathology.getCOUNT2_STD() != null && pathology.getCOUNT2_STD().contains("/")){
//                        strArray = pathology.getCOUNT2_STD().split("/");
//                        totalNodes = totalNodes + Integer.valueOf(strArray[1]);
//                        lymphNodeNumber = lymphNodeNumber + Integer.valueOf(strArray[0]);
//                        lymphFlag = "1";
//                        if(!"0".equals(strArray[0])){
//                            locationLymphNode = locationLymphNode + "," + pathology.getLN_SITE2_STD() + "," + pathology.getLN_LOCATION2_STD();
//                        }
//                    }
//                    if(pathology.getCOUNT3_STD() != null && pathology.getCOUNT3_STD().contains("/")){
//                        strArray = pathology.getCOUNT3_STD().split("/");
//                        totalNodes = totalNodes + Integer.valueOf(strArray[1]);
//                        lymphNodeNumber = lymphNodeNumber + Integer.valueOf(strArray[0]);
//                        lymphFlag = "1";
//                        if(!"0".equals(strArray[0])){
//                            locationLymphNode = locationLymphNode + "," + pathology.getLN_SITE3_STD() + "," + pathology.getLN_LOCATION3_STD();
//                        }
//                    }
//                    if(pathology.getCOUNT4_STD() != null && pathology.getCOUNT4_STD().contains("/")){
//                        strArray = pathology.getCOUNT4_STD().split("/");
//                        totalNodes = totalNodes + Integer.valueOf(strArray[1]);
//                        lymphNodeNumber = lymphNodeNumber + Integer.valueOf(strArray[0]);
//                        lymphFlag = "1";
//                        if(!"0".equals(strArray[0])){
//                            locationLymphNode = locationLymphNode + "," + pathology.getLN_SITE4_STD() + "," + pathology.getLN_LOCATION4_STD();
//                        }
//                    }
//                    if(pathology.getCOUNT5_STD() != null && pathology.getCOUNT5_STD().contains("/")){
//                        strArray = pathology.getCOUNT5_STD().split("/");
//                        totalNodes = totalNodes + Integer.valueOf(strArray[1]);
//                        lymphNodeNumber = lymphNodeNumber + Integer.valueOf(strArray[0]);
//                        lymphFlag = "1";
//                        if(!"0".equals(strArray[0])){
//                            locationLymphNode = locationLymphNode + "," + pathology.getLN_SITE5_STD() + "," + pathology.getLN_LOCATION5_STD();
//                        }
//                    }
//                    if(pathology.getCOUNT6_STD() != null && pathology.getCOUNT6_STD().contains("/")){
//                        strArray = pathology.getCOUNT6_STD().split("/");
//                        totalNodes = totalNodes + Integer.valueOf(strArray[1]);
//                        lymphNodeNumber = lymphNodeNumber + Integer.valueOf(strArray[0]);
//                        lymphFlag = "1";
//                        if(!"0".equals(strArray[0])){
//                            locationLymphNode = locationLymphNode + "," + pathology.getLN_SITE6_STD() + "," + pathology.getLN_LOCATION6_STD();
//                        }
//                    }
//                    if(pathology.getCOUNT7_STD() != null && pathology.getCOUNT7_STD().contains("/")){
//                        strArray = pathology.getCOUNT7_STD().split("/");
//                        totalNodes = totalNodes + Integer.valueOf(strArray[1]);
//                        lymphNodeNumber = lymphNodeNumber + Integer.valueOf(strArray[0]);
//                        lymphFlag = "1";
//                        if(!"0".equals(strArray[0])){
//                            locationLymphNode = locationLymphNode + "," + pathology.getLN_SITE7_STD() + "," + pathology.getLN_LOCATION7_STD();
//                        }
//                    }
//                    if(pathology.getCOUNT8_STD() != null && pathology.getCOUNT8_STD().contains("/")){
//                        strArray = pathology.getCOUNT8_STD().split("/");
//                        totalNodes = totalNodes + Integer.valueOf(strArray[1]);
//                        lymphNodeNumber = lymphNodeNumber + Integer.valueOf(strArray[0]);
//                        lymphFlag = "1";
//                        if(!"0".equals(strArray[0])){
//                            locationLymphNode = locationLymphNode + "," + pathology.getLN_SITE8_STD() + "," + pathology.getLN_LOCATION8_STD();
//                        }
//                    }
//                    if(pathology.getCOUNT9_STD() != null && pathology.getCOUNT9_STD().contains("/")){
//                        strArray = pathology.getCOUNT9_STD().split("/");
//                        totalNodes = totalNodes + Integer.valueOf(strArray[1]);
//                        lymphNodeNumber = lymphNodeNumber + Integer.valueOf(strArray[0]);
//                        lymphFlag = "1";
//                        if(!"0".equals(strArray[0])){
//                            locationLymphNode = locationLymphNode + "," + pathology.getLN_SITE9_STD() + "," + pathology.getLN_LOCATION9_STD();
//                        }
//                    }
//                    if(pathology.getCOUNT10_STD() != null && pathology.getCOUNT10_STD().contains("/")){
//                        strArray = pathology.getCOUNT10_STD().split("/");
//                        totalNodes = totalNodes + Integer.valueOf(strArray[1]);
//                        lymphNodeNumber = lymphNodeNumber + Integer.valueOf(strArray[0]);
//                        lymphFlag = "1";
//                        if(!"0".equals(strArray[0])){
//                            locationLymphNode = locationLymphNode + "," + pathology.getLN_SITE10_STD() + "," + pathology.getLN_LOCATION10_STD();
//                        }
//                    }
//                    if(pathology.getCOUNT11_STD() != null && pathology.getCOUNT11_STD().contains("/")){
//                        strArray = pathology.getCOUNT11_STD().split("/");
//                        totalNodes = totalNodes + Integer.valueOf(strArray[1]);
//                        lymphNodeNumber = lymphNodeNumber + Integer.valueOf(strArray[0]);
//                        lymphFlag = "1";
//                        if(!"0".equals(strArray[0])){
//                            locationLymphNode = locationLymphNode + "," + pathology.getLN_SITE11_STD() + "," + pathology.getLN_LOCATION11_STD();
//                        }
//                    }
//                    if(pathology.getCOUNT12_STD() != null && pathology.getCOUNT12_STD().contains("/")){
//                        strArray = pathology.getCOUNT12_STD().split("/");
//                        totalNodes = totalNodes + Integer.valueOf(strArray[1]);
//                        lymphNodeNumber = lymphNodeNumber + Integer.valueOf(strArray[0]);
//                        lymphFlag = "1";
//                        if(!"0".equals(strArray[0])){
//                            locationLymphNode = locationLymphNode + "," + pathology.getLN_SITE12_STD() + "," + pathology.getLN_LOCATION12_STD();
//                        }
//                    }
//                    if(pathology.getCOUNT13_STD() != null && pathology.getCOUNT13_STD().contains("/")){
//                        strArray = pathology.getCOUNT13_STD().split("/");
//                        totalNodes = totalNodes + Integer.valueOf(strArray[1]);
//                        lymphNodeNumber = lymphNodeNumber + Integer.valueOf(strArray[0]);
//                        lymphFlag = "1";
//                        if(!"0".equals(strArray[0])){
//                            locationLymphNode = locationLymphNode + "," + pathology.getLN_SITE13_STD() + "," + pathology.getLN_LOCATION13_STD();
//                        }
//                    }
//                }
//            }
//            //肿瘤部位
//            if(tumorSite.startsWith(",")){
//                tumorSite = tumorSite.substring(1);
//            }
//            if(!"".equals(tumorSite)){
//                pathological.setTumorSite(tumorSite);
//            }
//            //肿瘤大小
//            if(tumorSize.startsWith(",")){
//                tumorSize = tumorSize.substring(1);
//            }
//            if(!"".equals(tumorSize)){
//                pathological.setTumorSize(tumorSize);
//            }
//            //大体分型-早期胃癌
//            String pathdiag = histologyReport.getPATH_DIAG()!= null?histologyReport.getPATH_DIAG():"";
//            if(lesionType.contains("隆起") || pathdiag.contains("隆起")){
//                pathological.setEarlyType("I 隆起型");
//            }else if(lesionType.contains("浅表隆起") || pathdiag.contains("浅表隆起")){
//                pathological.setEarlyType("IIa 浅表隆起型");
//            }else if(lesionType.contains("浅表平坦") || pathdiag.contains("浅表平坦")){
//                pathological.setEarlyType("IIb 浅表平坦型");
//            }else if(lesionType.contains("凹陷") || pathdiag.contains("凹陷")){
//                pathological.setEarlyType("III 凹陷型");
//            }else if(lesionType.contains("浅表凹陷") || pathdiag.contains("浅表凹陷")){
//                pathological.setEarlyType("IIc 浅表凹陷型");
//            }
//            //大体分型-进展期胃癌
//            if(lesionType.contains("结节隆起") || pathdiag.contains("结节隆起")){
//                pathological.setAdvType("I 结节隆起型");
//            }else if(lesionType.contains("局限溃疡") || pathdiag.contains("局限溃疡")){
//                pathological.setAdvType("II 局限溃疡型");
//            }else if(lesionType.contains("浸润溃疡") || pathdiag.contains("浸润溃疡")){
//                pathological.setAdvType("III 浸润溃疡型");
//            }else if(lesionType.contains("弥漫浸润") || pathdiag.contains("弥漫浸润")){
//                pathological.setAdvType("IV 弥漫浸润型");
//            }
//            //Lauren 分型
//            if(lesionType.contains("肠型") || pathdiag.contains("肠型")){
//                pathological.setLaurenClassification("肠型");
//            }else if(lesionType.contains("弥漫型") || pathdiag.contains("弥漫型")){
//                pathological.setLaurenClassification("弥漫型");
//            }else if(lesionType.contains("混合型") || pathdiag.contains("混合型")){
//                pathological.setLaurenClassification("混合型");
//            }
//            //病理类型
//            if(!"".equals(lesionType)){
//                pathological.setPathologicaltype(lesionType);
//            }
//            //分化程度 高分化、中分化、中低分化、低分化、未分化、分化无法评估
//            if("".equals(lesionGrade)){
//                pathological.setDifferentiationDegree("分化无法评估");
//            }else{
//                if(lesionGrade.contains("高分化")){
//                    pathological.setDifferentiationDegree("高分化");
//                }else if(lesionGrade.contains("中分化")){
//                    pathological.setDifferentiationDegree("中分化");
//                }else if(lesionGrade.contains("低分化")){
//                    pathological.setDifferentiationDegree("低分化");
//                }else if(lesionGrade.contains("中低分化")){
//                    pathological.setDifferentiationDegree("中低分化");
//                }else if(lesionGrade.contains("未分化")){
//                    pathological.setDifferentiationDegree("未分化");
//                }
//            }
//            //浸润深度
//            if(!"".equals(statusLayer)){
//                pathological.setDepthInfiltration(statusLayer);
//            }
//            //血管侵犯
//            pathological.setVascularInvasion(vnascularInvasion);
//            //淋巴管侵犯
//            pathological.setLymphaticInvasion(lymphaticInvasion);
//            //神经侵犯
//            pathological.setNerveInvasion(nerveInvasion);
//            //侵犯邻近脏器或组织名称
//            if(!"".equals(invasionOrgans)){
//                pathological.setInvasionOrgans(invasionOrgans.replace("胃",""));
//            }
//            //近切缘
//            if(pathdiag.contains("近切缘阴性")){
//                pathological.setProximalMargin("阴性");
//            }else if(pathdiag.contains("近切缘阳性") || pathdiag.contains("近切缘见瘤细胞") || pathdiag.contains("近切缘见癌浸润")){
//                pathological.setProximalMargin("阳性");
//            }else{
//                pathological.setProximalMargin("无法判断");
//            }
//            //近切缘距离
//            if(!"".equals(distanceCut)){
//                pathological.setDistanceCut(distanceCut);
//            }
//            //远切缘
//            if(pathdiag.contains("远切缘阴性")){
//                pathological.setProximalMargin("阴性");
//            }else if(pathdiag.contains("远切缘阳性") || pathdiag.contains("远切缘见瘤细胞") || pathdiag.contains("远切缘见癌浸润")){
//                pathological.setProximalMargin("阳性");
//            }else{
//                pathological.setProximalMargin("无法判断");
//            }
//            //远切缘距离
//            if(!"".equals(distanceFarCut)){
//                pathological.setDistanceCut(distanceFarCut);
//            }
//            //送检淋巴结总数
//            pathological.setTotalNodes(totalNodes);
//            //淋巴结转移
//            if(lymphNodeNumber > 0){
//                pathological.setLymphNodeMetastasis("是");
//            }else{
//                if("1".equals(lymphFlag)){
//                    pathological.setLymphNodeMetastasis("否");
//                }else{
//                    pathological.setLymphNodeMetastasis("无法判断");
//                }
//            }
//            //淋巴结转移数量
//            pathological.setLymphNodeNumber(lymphNodeNumber);
//            //阳性淋巴结的部位
//            locationLymphNode = locationLymphNode.replace(",null","");
//            if(!"".equals(locationLymphNode)){
//                if(locationLymphNode.startsWith(",")){
//                    locationLymphNode = locationLymphNode.substring(1);
//                }
//                pathological.setLocationLymphNode(locationLymphNode);
//            }
//            pathologicalService.savePathological(pathological);
//        }
//
////        //数据版本
////        pathological.setDataVersion();
////        //数据库来源
////        pathological.setDataDbSource();
////        //数据表来源
////        pathological.setDataTableSource();
////        //数据项来源
////        pathological.setDataFieldSource();
////        //创建时间
////        pathological.setCreatedAt();
////        //创建人
////        pathological.setCreator();
////        //修改时间
////        pathological.setUpdatedAt();
//    }
    public void saveMarker(List<BIOMARKER> zj_BIOMARKER) {
        Marker marker;
        for(BIOMARKER biomarker:zj_BIOMARKER){
            if(biomarker.getTEST_ITEM_NAME() != null){
                marker = new Marker();
                //标识患者身份唯一标识
                marker.setPersonId(biomarker.getUNIQUE_ID_LV1());
                //唯一标识
                marker.setUniqueId(biomarker.getUNIQUE_ID_LV2());
                //医疗机构代码
                marker.setP900(biomarker.getP900());
                //患者id
                marker.setPatientId(biomarker.getPATIENT_ID());
                //住院号
                marker.setVisitId(biomarker.getVISIT_ID());
                //免疫组化标志物名称
                marker.setMarkerName(biomarker.getTEST_ITEM_NAME());
                //免疫组化标志物检测定性结果
                if(biomarker.getTEST_ITEM_VALUE_ROUGH1_STD() != null){
                    if(biomarker.getTEST_ITEM_VALUE_ROUGH2_STD() != null){
                        marker.setMarkerQualitative(biomarker.getTEST_ITEM_VALUE_ROUGH1_STD() + "," + biomarker.getTEST_ITEM_VALUE_ROUGH2_STD());
                    }else{
                        marker.setMarkerQualitative(biomarker.getTEST_ITEM_VALUE_ROUGH1_STD());
                    }
                }else{
                    if(biomarker.getTEST_ITEM_VALUE_ROUGH2_STD() != null){
                        marker.setMarkerQualitative(biomarker.getTEST_ITEM_VALUE_ROUGH2_STD());
                    }
                }
                //免疫组化标志物检测定量结果
                if(biomarker.getTEST_ITEM_VALUE_PRECISE1_STD() != null){
                    if(biomarker.getTEST_ITEM_VALUE_PRECISE2_STD() != null){
                        marker.setMarkerQuantify(biomarker.getTEST_ITEM_VALUE_PRECISE1_STD() + "," + biomarker.getTEST_ITEM_VALUE_PRECISE2_STD());
                    }else{
                        marker.setMarkerQuantify(biomarker.getTEST_ITEM_VALUE_PRECISE1_STD());
                    }
                }else{
                    if(biomarker.getTEST_ITEM_VALUE_PRECISE2_STD() != null){
                        marker.setMarkerQuantify(biomarker.getTEST_ITEM_VALUE_PRECISE2_STD());
                    }
                }
                //免疫组化标志物检测性质结果
                marker.setMarkerType(biomarker.getTEST_ITEM_VALUE_NATURE1_STD());
                markerService.saveMarker(marker);
            }
        }

    }

    public void saveTreatment(List<DRUG_ORDER> zj_DRUG_ORDER) {
        Treatment treatment;
        ChemotherapyDrug chemotherapyDrug;
        CancerPainTreatment cancerPainTreatment;
        String drugType;
        for (DRUG_ORDER drug_order : zj_DRUG_ORDER) {
            drugType = DrugConstant.getDrugType(drug_order.getDRUG_NAME());
            if ("化疗药物".equals(drugType)) {
                chemotherapyDrug = new ChemotherapyDrug();
                //标识患者身份唯一标识
                chemotherapyDrug.setPersonId(drug_order.getUNIQUE_ID_LV1());
                //唯一标识
                chemotherapyDrug.setUniqueId(drug_order.getUNIQUE_ID_LV2());
                //医疗机构代码
                chemotherapyDrug.setP900(drug_order.getP900());
                //患者id
                chemotherapyDrug.setPatientId(drug_order.getPATIENT_ID());
                //住院号
                chemotherapyDrug.setVisitId(drug_order.getVISIT_ID());
                //具体药物名称
                chemotherapyDrug.setDrugName(drug_order.getDRUG_NAME());
                //给药途径
                chemotherapyDrug.setChannel(drug_order.getADMINISTRATION());
                //用药频率
                chemotherapyDrug.setFrequency(drug_order.getFREQUENCY());
                //药物剂量
                chemotherapyDrug.setDose(drug_order.getDOSAGE());
                //剂量单位
                chemotherapyDrug.setUnit(drug_order.getDOSAGE_UNITS());
                //用药开始日期
                chemotherapyDrug.setStartDate(drug_order.getENTER_DATE_TIME());
                //用药结束日期
                chemotherapyDrug.setEndDate(drug_order.getSTOP_ORDER_DATE_TIME());
                chemotherapyDrugService.saveChemotherapyDrug(chemotherapyDrug);
            } else if ("癌痛治疗药物".equals(drugType)) {
                cancerPainTreatment = new CancerPainTreatment();
                //标识患者身份唯一标识
                cancerPainTreatment.setPersonId(drug_order.getUNIQUE_ID_LV1());
                //唯一标识
                cancerPainTreatment.setUniqueId(drug_order.getUNIQUE_ID_LV2());
                //医疗机构代码
                cancerPainTreatment.setP900(drug_order.getP900());
                //患者id
                cancerPainTreatment.setPatientId(drug_order.getPATIENT_ID());
                //住院号
                cancerPainTreatment.setVisitId(drug_order.getVISIT_ID());
                //癌痛治疗药物名称
                cancerPainTreatment.setDrugName(drug_order.getDRUG_NAME());
                //给药途径
                cancerPainTreatment.setAdministration(drug_order.getADMINISTRATION());
                //药物剂量
                cancerPainTreatment.setDosage(drug_order.getDOSAGE());
                //用药开始日期
                cancerPainTreatment.setEnterDateTime(drug_order.getENTER_DATE_TIME());
                //用药结束日期
                cancerPainTreatment.setStopOrderDateTime(drug_order.getSTOP_ORDER_DATE_TIME());
                cancerPainTreatmentService.saveCancerPainTreatment(cancerPainTreatment);
            } else {
                if(drug_order.getDRUG_NAME() != null){
                    treatment = new Treatment();
                    //标识患者身份唯一标识
                    treatment.setPersonId(drug_order.getUNIQUE_ID_LV1());
                    //唯一标识
                    treatment.setUniqueId(drug_order.getUNIQUE_ID_LV2());
                    //医疗机构代码
                    treatment.setP900(drug_order.getP900());
                    //患者id
                    treatment.setPatientId(drug_order.getPATIENT_ID());
                    //住院号
                    treatment.setVisitId(drug_order.getVISIT_ID());
                    //医嘱类别
                    treatment.setOrderClass(drug_order.getORDER_CLASS());
                    //用药分类
                    treatment.setDrugType(drugType);
                    //具体药物名称
                    treatment.setDrugName(drug_order.getDRUG_NAME());
                    //给药途径
                    treatment.setChannel(drug_order.getADMINISTRATION());
                    //药物剂量
                    treatment.setDose(drug_order.getDOSAGE());
                    //剂量单位
                    treatment.setUnit(drug_order.getDOSAGE_UNITS());
                    //用药开始日期
                    treatment.setStartDate(drug_order.getENTER_DATE_TIME());
                    //用药结束日期
                    treatment.setEndDate(drug_order.getSTOP_ORDER_DATE_TIME());
                    treatmentService.saveTreatment(treatment);
                }
                //数据版本
//                     treatment.setDataVersion();
//                     //数据库来源
//                     treatment.setDataDbSource();
//                     //数据表来源
//                     treatment.setDataTableSource();
//                     //数据项来源
//                     treatment.setDataFieldSource();
//                     //创建时间
//                     treatment.setCreatedAt();
//                     //创建人
//                     treatment.setCreator();
//                     //修改时间
//                     treatment.setUpdatedAt();
            }
        }
    }

    public void saveChemotherapyDrug(List<DRUG_COURSE> zj_DRUG_COURSE) {
        ChemotherapyDrug chemotherapyDrug;
        for(DRUG_COURSE drugCourse : zj_DRUG_COURSE){
            if(StringUtils.isNotEmpty(drugCourse.getDRUG_NAME())){
                chemotherapyDrug = new ChemotherapyDrug();
                //标识患者身份唯一标识
                chemotherapyDrug.setPersonId(drugCourse.getUNIQUE_ID_LV1());
                //唯一标识
                chemotherapyDrug.setUniqueId(drugCourse.getUNIQUE_ID_LV2());
                //医疗机构代码
                chemotherapyDrug.setP900(drugCourse.getP900());
                //患者id
                chemotherapyDrug.setPatientId(drugCourse.getPATIENT_ID());
                //住院号
                chemotherapyDrug.setVisitId(drugCourse.getVISIT_ID());
                //具体药物名称
                chemotherapyDrug.setDrugName(drugCourse.getDRUG_NAME());
                //给药途径
                chemotherapyDrug.setChannel(drugCourse.getADMIN_ROUTE());
                //用药频率
                chemotherapyDrug.setFrequency(drugCourse.getADMIN_FREQ());
                //药物剂量
                chemotherapyDrug.setDose(drugCourse.getDRUG_DOSE());
                //剂量单位
//            chemotherapyDrug.setUnit();
                //用药开始日期
                chemotherapyDrug.setStartDate(drugCourse.getDATE_TIME_P());
                //用药结束日期
//                chemotherapyDrug.setEndDate(drugCourse.getDATE_TIME_ESTIMATE());
                //数据版本
//            chemotherapyDrug.setDataVersion();
//            //数据库来源
//            chemotherapyDrug.setDataDbSource();
//            //数据表来源
//            chemotherapyDrug.setDataTableSource();
//            //数据项来源
//            chemotherapyDrug.setDataFieldSource();
//            //创建时间
//            chemotherapyDrug.setCreatedAt();
//            //创建人
//            chemotherapyDrug.setCreator();
//            //修改时间
//            chemotherapyDrug.setUpdatedAt();
                chemotherapyDrugService.saveChemotherapyDrug(chemotherapyDrug);
            }
        }
    }

    public void saveRadiotherapy(List<RADIOTHERAPY> zj_RADIOTHERAPY) {
        Radiotherapy radiotherapy;
        for(RADIOTHERAPY radiotherapy1 : zj_RADIOTHERAPY){
            radiotherapy = new Radiotherapy();
            //标识患者身份唯一标识
            radiotherapy.setPersonId(radiotherapy1.getUNIQUE_ID_LV1());
            //唯一标识
            radiotherapy.setUniqueId(radiotherapy1.getUNIQUE_ID_LV2());
            //医疗机构代码
            radiotherapy.setP900(radiotherapy1.getP900());
            //患者id
            radiotherapy.setPatientId(radiotherapy1.getPATIENT_ID());
            //住院号
            radiotherapy.setVisitId(radiotherapy1.getVISIT_ID());
            //放疗开始日期
            // 后期修改
            radiotherapy.setRadioBeginTime(radiotherapy1.getDATE_TIME_P());
            //放疗结束日期
            // 后期修改
            radiotherapy.setRadioEndTime(radiotherapy1.getDATE_TIME_P());
            //放疗目的
            radiotherapy.setPurpose(radiotherapy1.getPURPOSE_STD());
            if(radiotherapy1.getTREATMENT1_STD() != null){
                //放疗模式
                if(radiotherapy1.getTREATMENT1_STD().contains("外照射")){
                    radiotherapy.setMode("外照射");
                }
                if(radiotherapy1.getTREATMENT1_STD().contains("近距离治疗")){
                    radiotherapy.setMode("近距离治疗");
                }
                //放疗方式
                radiotherapy.setWay(DrugConstant.getWay(radiotherapy1.getTREATMENT1_STD()));
                //射线类型
                radiotherapy.setRayType(DrugConstant.getRayType(radiotherapy1.getTREATMENT1_STD()));

            }
            if(radiotherapy1.getSTRUCTURE1_STD() != null){
                //放疗部位类型
                if(radiotherapy1.getSTRUCTURE1_STD().contains("原发灶")){
                    radiotherapy.setSiteType("原发灶");
                }
                if(radiotherapy1.getSTRUCTURE1_STD().contains("区域淋巴结")){
                    radiotherapy.setSiteType("区域淋巴结");
                }
                if(radiotherapy1.getSTRUCTURE1_STD().contains("转移灶")){
                    radiotherapy.setSiteType("转移灶");
                }
            }
            //靶区部位
            radiotherapy.setTargetSite(DrugConstant.getTargetSite(radiotherapy1.getTARGET1_STD()));
            if(radiotherapy1.getDOSE_TYPE_STD() != null){
                String doseTYPE = radiotherapy1.getDOSE_TYPE_STD();
                if(radiotherapy1.getMIN_DOSE_STD() != null){
                    //放疗总量
                    radiotherapy.setTotalDose(doseTYPE.contains("累计剂量")?Double.valueOf(radiotherapy1.getMIN_DOSE_STD()):null);
                    //放疗单次剂量
                    radiotherapy.setSingleDose(doseTYPE.contains("累计剂量")?Double.valueOf(radiotherapy1.getMIN_DOSE_STD()/radiotherapy1.getMIN_FREQ_STD()):null);
                    //放疗次数
                    radiotherapy.setRadioNumber(doseTYPE.contains("累计剂量")?radiotherapy1.getMIN_FREQ_STD().toString():null);
                    //处方放疗总量
                    radiotherapy.setPrescriptRadioTotal(doseTYPE.contains("计划剂量") || doseTYPE.contains("处方剂量")?radiotherapy1.getMIN_DOSE_STD().toString() + radiotherapy1.getDOSE_UNIT_STD():null);
                    //处方放疗单次剂量
                    Double d = Double.valueOf(radiotherapy1.getMIN_DOSE_STD())/Double.valueOf(radiotherapy1.getMIN_FREQ_STD());
                    radiotherapy.setPrescriptRadioSingle(doseTYPE.contains("计划剂量") || doseTYPE.contains("处方剂量")?d.toString() + radiotherapy1.getDOSE_UNIT_STD():null);
                    //处方放疗次数
                    radiotherapy.setPrescriptRadioTotal(doseTYPE.contains("计划剂量") || doseTYPE.contains("处方剂量")?radiotherapy1.getMIN_FREQ_STD().toString() + radiotherapy1.getDOSE_UNIT_STD():null);
                }
            }
            //数据版本
//            radiotherapy.setDataVersion();
//            //数据库来源
//            radiotherapy.setDataDbSource();
//            //数据表来源
//            radiotherapy.setDataTableSource();
//            //数据项来源
//            radiotherapy.setDataFieldSource();
//            //创建时间
//            radiotherapy.setCreatedAt();
//            //创建人
//            radiotherapy.setCreator();
//            //修改时间
//            radiotherapy.setUpdatedAt();
            radiotherapyService.saveRadiotherapy(radiotherapy);
        }
    }

    //         public void saveCancerPainTreatment(){
//                 CancerPainTreatment cancerPainTreatment = new CancerPainTreatment();
//                    //标识患者身份唯一标识
//                   cancerPainTreatment.setPersonId();
//                    //唯一标识
//                   cancerPainTreatment.setUniqueId();
//                    //医疗机构代码
//                   cancerPainTreatment.setP900();
//                    //患者id
//                   cancerPainTreatment.setPatientId();
//                    //住院号
//                   cancerPainTreatment.setVisitId();
//                    //癌痛治疗药物名称
//                   cancerPainTreatment.setDrugName();
//                    //给药途径
//                   cancerPainTreatment.setAdministration();
//                    //药物剂量
//                   cancerPainTreatment.setDosage();
//                    //用药开始日期
//                   cancerPainTreatment.setEnterDateTime();
//                    //用药结束日期
//                   cancerPainTreatment.setStopOrderDateTime();
//                    //数据版本
//                   cancerPainTreatment.setDataVersion();
//                    //数据库来源
//                   cancerPainTreatment.setDataDbSource();
//                    //数据表来源
//                   cancerPainTreatment.setDataTableSource();
//                    //数据项来源
//                   cancerPainTreatment.setDataFieldSource();
//                    //创建时间
//                   cancerPainTreatment.setCreatedAt();
//                    //创建人
//                   cancerPainTreatment.setCreator();
//                    //修改时间
//                    cancerPainTreatment.setUpdatedAt();
//            cancerPainTreatmentService.saveCancerPainTreatment(cancerPainTreatment);
//            }
    public void saveFollowUp(List<FOLLOW_UP> zj_FOLLOW_UP) {
        FollowUp followUp;
        for (FOLLOW_UP follow_up : zj_FOLLOW_UP) {
            followUp = new FollowUp();
            //标识患者身份唯一标识
            followUp.setPersonId(follow_up.getUNIQUE_ID_LV1());
            //唯一标识
            followUp.setUniqueId(follow_up.getUNIQUE_ID_LV2());
            //医疗机构代码
            followUp.setP900(follow_up.getP900());
            //患者id
            followUp.setPatientId(follow_up.getPATIENT_ID());
            //住院号
            followUp.setVisitId(follow_up.getVISIT_ID());
            //随访方式
            followUp.setFollowMethod(follow_up.getFOLLOW_METHOD());
            //随访日期
            followUp.setFollowupTime(follow_up.getFOLLOWUP_TIME());
            //疾病状态
            followUp.setTumourSta(follow_up.getTUMOUR_STA());
            //生存情况
            followUp.setFollowupStatus(follow_up.getFOLLOWUP_STATUS());
            //死亡原因
            followUp.setCauseOfDeath(follow_up.getCAUSE_OF_DEATH());
            //死亡日期
            followUp.setDateOfDeath(follow_up.getDATE_OF_DEATH());
            //末次随访日期
            followUp.setLastContactDate(follow_up.getLAST_CONTACT_DATE());
            //数据版本
//                 followUp.setDataVersion();
//                 //数据库来源
//                 followUp.setDataDbSource();
//                 //数据表来源
//                 followUp.setDataTableSource();
//                 //数据项来源
//                 followUp.setDataFieldSource();
//                 //创建时间
//                 followUp.setCreatedAt();
//                 //创建人
//                 followUp.setCreator();
//                 //修改时间
//                 followUp.setUpdatedAt();
            followUpService.saveFollowUp(followUp);
        }
    }


}