package com.clinical.service.impl;

import com.clinical.dao.master.*;
import com.clinical.model.cluster.*;
import com.clinical.model.master.*;
import com.clinical.service.*;
import com.clinical.utils.JSONUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class RuleRunServiceImpl implements RuleRunService {

    private final Logger log= LoggerFactory.getLogger(RuleRunServiceImpl.class);
    @Autowired
    PersonService personService;


    @Autowired
    VisitRecordService    visitRecordService;


    @Autowired
    IndexPersonService    indexPersonService;


    @Autowired
    IndexDiagnosisAdmitService    indexDiagnosisAdmitService;


    @Autowired
    IndexDiagnosisAdmitIcdService    indexDiagnosisAdmitIcdService;


    @Autowired
    IndexDiagnosisClinicService    indexDiagnosisClinicService;


    @Autowired
    IndexDiagnosisClinicIcdService    indexDiagnosisClinicIcdService;


    @Autowired
    IndexOperationService    indexOperationService;


    @Autowired
    IndexOperationIcdService    indexOperationIcdService;


    @Autowired
    IndexDiagnosisMainService    indexDiagnosisMainService;


    @Autowired
    IndexDiagnosisMainIcdService    indexDiagnosisMainIcdService;


    @Autowired
    IndexDiagnosisOtherService    indexDiagnosisOtherService;


    @Autowired
    IndexDiagnosisOtherIcdService    indexDiagnosisOtherIcdService;


    @Autowired
    IndexIcuService    indexIcuService;


    @Autowired
    IndexPathologyService    indexPathologyService;


    @Autowired
    IndexPathologyIcdService    indexPathologyIcdService;

    @Autowired
    IndexInjuryService    indexInjuryService;

    @Autowired
    TemInpAdmissionStatusService    temInpAdmissionStatusService;

    @Autowired
    PersonGeneralService    personGeneralService;

    @Autowired
    HisPersonService    hisPersonService;

    @Autowired
    HisFamilyService    hisFamilyService;

    @Autowired
    HisPastService    hisPastService;

    @Autowired
    SymptomService    symptomService;

//    @Autowired
//    PrimaryDiagnosisService    primaryDiagnosisService;

    @Autowired
    ExamMasterService    examMasterService;

//    @Autowired
//    RabatService    rabatService;
//
//
//
//    @Autowired
//    PetCtDesService    petCtDesService;
//
//
//    @Autowired
//    PetCtResultService    petCtResultService;
//
//
//    @Autowired
//    OperationRecordService    operationRecordService;
//
//
//    @Autowired
//    TumorPunctureService    tumorPunctureService;

//    @Autowired
//    ImmuneService    immuneService;


//    @Autowired
//    TreatmentService    treatmentService;
//
//
//    @Autowired
//    ChemotherapyService    chemotherapyService;
//
//
//    @Autowired
//    RadiotherapyService    radiotherapyService;




    @Autowired
    FollowUpService    followUpService;



//    @Autowired
//    ZjBasyNstdMapper zjBasyNstdMapper;

    @Autowired
    ZjBasyDiagStdMapper    zjBasyDiagStdMapper;

    @Autowired
    ZjBasyOpStdMapper    zjBasyOpStdMapper;

    @Autowired
    ZjTemPatMasterIndexMapper    zjTemPatMasterIndexMapper;

    @Autowired
    ZjPatVisitMasterMapper    zjPatVisitMasterMapper;

    @Autowired
    ZjInpDiagnosisMapper    zjInpDiagnosisMapper;

    @Autowired
    ZjLisRecordMapper    zjLisRecordMapper;

    @Autowired
    ZjExamMasterMapper    zjExamMasterMapper;

    @Autowired
    ZjTemOperationRecordMapper    zjTemOperationRecordMapper;

    @Autowired
    ZjProcedureRecordMapper    zjProcedureRecordMapper;

    @Autowired
    ZjTemDeathRecordMapper    zjTemDeathRecordMapper;

    @Autowired
    ZjNursingRecordMapper    zjNursingRecordMapper;

    @Autowired
    ZjFollowUpMapper    zjFollowUpMapper;

    @Autowired
    ZjVitalRecordMapper    zjVitalRecordMapper;

    @Autowired
    ZjDrugOrderMapper    zjDrugOrderMapper;

    @Autowired
    ZjTemInpAdmissionStatusMapper    zjTemInpAdmissionStatusMapper;

    @Autowired
    ZjTemOutpDischargeStatusMapper    zjTemOutpDischargeStatusMapper;

    @Autowired
    ZjTem24hInOutMapper    zjTem24hInOutMapper;

    @Autowired
    ZjOutpRecordMapper    zjOutpRecordMapper;

    @Autowired
    ZjTemCourseDisMapper    zjTemCourseDisMapper;

    @Autowired
    ZjTemOutpDischargeSummerMapper    zjTemOutpDischargeSummerMapper;

    @Autowired
    ZjWardRoundRecordMapper    zjWardRoundRecordMapper;

    @Autowired
    ZjInpConsultationDoctorMasterMapper    zjInpConsultationDoctorMasterMapper;

    @Autowired
    ZjInpConsultationDoctorDetailMapper    zjInpConsultationDoctorDetailMapper;

    @Autowired
    ZjTemPreCourseDisMapper    zjTemPreCourseDisMapper;

    @Autowired
    ZjPreOpDiscussionMapper    zjPreOpDiscussionMapper;

    @Autowired
    ZjPostOpCourseMapper    zjPostOpCourseMapper;

    @Autowired
    ZjTransferDeptMapper    zjTransferDeptMapper;

    @Autowired
    ZjEmergencyRecordMapper    zjEmergencyRecordMapper;

    @Autowired
    ZjStageSummaryMapper    zjStageSummaryMapper;

    @Autowired
    ZjInpOrdersMapper    zjInpOrdersMapper;

    @Autowired
    ZjSympPresentMapper    zjSympPresentMapper;

    @Autowired
    ZjSmokeAndDrinkMapper    zjSmokeAndDrinkMapper;

    @Autowired
    ZjPriorDiseaseAndSurgeryMapper    zjPriorDiseaseAndSurgeryMapper;

    @Autowired
    ZjFamilyHistoryMapper    zjFamilyHistoryMapper;

//    @Autowired
//    ZjChestXrEntryResultsMapper    zjChestXrEntryResultsMapper;
//
//    @Autowired
//    ZjChestCtDescriptionMapper    zjChestCtDescriptionMapper;
//
//    @Autowired
//    ZjChestCtEntryResultsMapper    zjChestCtEntryResultsMapper;
//
//    @Autowired
//    ZjAbdomCtDescriptionMapper    zjAbdomCtDescriptionMapper;
//
//    @Autowired
//    ZjAbdomCtEntryResultsMapper    zjAbdomCtEntryResultsMapper;
//
//    @Autowired
//    ZjAbdomMrDescriptionMapper    zjAbdomMrDescriptionMapper;
//
//    @Autowired
//    ZjAbdomMrEntryResultsMapper    zjAbdomMrEntryResultsMapper;
//
//    @Autowired
//    ZjPostopCompMapper    zjPostopCompMapper;
//
//    @Autowired
//    ZjRadiotherapyMapper    zjRadiotherapyMapper;
//
//    @Autowired
//    ZjAbdomUsDescriptionMapper    zjAbdomUsDescriptionMapper;
//
//    @Autowired
//    ZjAbdomUsEntryResultsMapper    zjAbdomUsEntryResultsMapper;
//
//    @Autowired
//    ZjPetCtDescriptionMapper    zjPetCtDescriptionMapper;
//
//    @Autowired
//    ZjPetCtEntryResultsMapper    zjPetCtEntryResultsMapper;
//
//    @Autowired
//    ZjSurgicalRecordMapper    zjSurgicalRecordMapper;

    @Autowired
    ZjPhysicalExamParaMapper    zjPhysicalExamParaMapper;

//    @Autowired
//    ZjInterventionTherapyMapper    zjInterventionTherapyMapper;

    @Autowired
    ZjClinicalDiagMapper    zjClinicalDiagMapper;

    @Autowired
    ZjBasyNstdMapper zjBasyNstdMapper;

//    @Autowired
//    ZjSpecialityExamMapper zjSpecialityExamMapper;

    /**
     * 肠镜
     */
    @Autowired
    ZjColonEsDescriptionMapper zjColonEsDescriptionMapper;
    /**
     * 肠镜
     */
    @Autowired
    ColonEsDesService colonEsDesService;

    /**
     * 病理报告原文
     */
    @Autowired
    ZjHistologyReportMapper zjHistologyReportMapper;
    /**
     * 病理报告原文
     */
    @Autowired
    HistologyReportService histologyReportService;

    /**
     * 病理检查
     */
    @Autowired
    ZjPathologyMapper zjPathologyMapper;
    /**
     * 病理检查
     */
    @Autowired
    PathologicalService pathologicalService;

    /**
     * 免疫组化标志物
     */
    @Autowired
    ZjIhcMarkerMapper zjIhcMarkerMapper;
    /**
     * 免疫组化标志物
     */
    @Autowired
    ImmuneService immuneService;

    @Autowired
    StandardResultMapper standardResultMapper;

    @Override
    public void saveRuleRun(Integer pageNo, Integer pageSize, String flag) {

        Map<String,Integer> map=new HashMap<>();
        map.put("pageNo",pageNo);
        map.put("pageSize",pageSize);
        //查找患者列表
        List<TEM_PAT_MASTER_INDEX> zj_TEM_PAT_MASTER_INDEX = zjTemPatMasterIndexMapper.findZjTemPatMasterIndexByUniqueId(map);

        for(TEM_PAT_MASTER_INDEX index: zj_TEM_PAT_MASTER_INDEX) {
            //保存患者--------------------------------------------------
//            savePerson(index);

            //患者就诊列表
            List<PAT_VISIT_MASTER> zj_PAT_VISIT_MASTER = zjPatVisitMasterMapper.findZjPatVisitMasterByUniqueId(index.getUNIQUE_ID());
            //就诊其他数据
            for (PAT_VISIT_MASTER master : zj_PAT_VISIT_MASTER) {

                //保存就诊----------------------------------------------------
//                saveVisitRecord(master);

                String uniqueId = master.getUNIQUE_ID();

                Date visitdate=master.getADMISSION_DATE_TIME();
                //病案首页
//                List<BASY_NSTD> zj_BASY_NSTDs=zjBasyNstdMapper.findZjBasyNstdsByUniqueId(uniqueId);
//                BASY_NSTD zj_BASY_NSTD;
//                if (zj_BASY_NSTDs.size()==1){
//                    zj_BASY_NSTD = zj_BASY_NSTDs.get(0);
//                }else {
//                    zj_BASY_NSTD=  zjBasyNstdMapper.findZjBasyNstdByUniqueId(uniqueId);
//                }
//
//                List<BASY_OP_STD> zj_BASY_OP_STDs=zjBasyOpStdMapper.findZjBasyOpStdsByUniqueId(uniqueId);
//                BASY_OP_STD zj_BASY_OP_STD;
//                if (zj_BASY_OP_STDs.size()==1){
//                    zj_BASY_OP_STD = zj_BASY_OP_STDs.get(0);
//                }else {
//                    zj_BASY_OP_STD = zjBasyOpStdMapper.findZjBasyOpStdByUniqueId(uniqueId);
//                }
//
//                List<BASY_DIAG_STD> zj_BASY_DIAG_STDs=zjBasyDiagStdMapper.findZjBasyDiagStdsByUniqueId(uniqueId);
//                BASY_DIAG_STD  zj_BASY_DIAG_STD;
//                if (zj_BASY_DIAG_STDs.size()==1){
//                    zj_BASY_DIAG_STD = zj_BASY_DIAG_STDs.get(0);
//                }else {
//                    zj_BASY_DIAG_STD =  zjBasyDiagStdMapper.findZjBasyDiagStdByUniqueId(uniqueId);
//                }

//                List<INP_DIAGNOSIS>  zj_INP_DIAGNOSIS =  zjInpDiagnosisMapper.findZjInpDiagnosisByUniqueId(uniqueId);
//                List<LIS_RECORD>  zj_LIS_RECORD =  zjLisRecordMapper.findZjLisRecordByUniqueId(uniqueId);
//                List<EXAM_MASTER>  zj_EXAM_MASTER =  zjExamMasterMapper.findZjExamMasterByUniqueId(uniqueId);
//                List<HISTOLOGY_REPORT>  zj_HISTOLOGY_REPORT =  zjHistologyReportMapper.findZjHistologyReportByUniqueId(uniqueId);
//                List<TEM_OPERATION_RECORD>  zj_TEM_OPERATION_RECORD =  zjTemOperationRecordMapper.findZjTemOperationRecordByUniqueId(uniqueId);
//                List<PROCEDURE_RECORD>  zj_PROCEDURE_RECORD =  zjProcedureRecordMapper.findZjProcedureRecordByUniqueId(uniqueId);
//                List<TEM_DEATH_RECORD>  zj_TEM_DEATH_RECORD =  zjTemDeathRecordMapper.findZjTemDeathRecordByUniqueId(uniqueId);
//                List<NURSING_RECORD>  zj_NURSING_RECORD =  zjNursingRecordMapper.findZjNursingRecordByUniqueId(uniqueId);
//                List<FOLLOW_UP>  zj_FOLLOW_UP =  zjFollowUpMapper.findZjFollowUpByUniqueId(uniqueId);
//                List<VITAL_RECORD>  zj_VITAL_RECORD =  zjVitalRecordMapper.findZjVitalRecordByUniqueId(uniqueId);
//                List<DRUG_ORDER>  zj_DRUG_ORDER =  zjDrugOrderMapper.findZjDrugOrderByUniqueId(uniqueId);
//                List<TEM_INP_ADMISSION_STATUS>  zj_TEM_INP_ADMISSION_STATUS =  zjTemInpAdmissionStatusMapper.findZjTemInpAdmissionStatusByUniqueId(uniqueId);
//                List<TEM_OUTP_DISCHARGE_STATUS>  zj_TEM_OUTP_DISCHARGE_STATUS =  zjTemOutpDischargeStatusMapper.findZjTemOutpDischargeStatusByUniqueId(uniqueId);
//                List<TEM_24H_IN_OUT>  zj_TEM_24H_IN_OUT =  zjTem24hInOutMapper.findZjTem24hInOutByUniqueId(uniqueId);
//                List<OUTP_RECORD>  zj_OUTP_RECORD =  zjOutpRecordMapper.findZjOutpRecordByUniqueId(uniqueId);
//                List<TEM_COURSE_DIS>  zj_TEM_COURSE_DIS =  zjTemCourseDisMapper.findZjTemCourseDisByUniqueId(uniqueId);
//                List<TEM_OUTP_DISCHARGE_SUMMER>  zj_TEM_OUTP_DISCHARGE_SUMMER =  zjTemOutpDischargeSummerMapper.findZjTemOutpDischargeSummerByUniqueId(uniqueId);
//                List<WARD_ROUND_RECORD>  zj_WARD_ROUND_RECORD =  zjWardRoundRecordMapper.findZjWardRoundRecordByUniqueId(uniqueId);
//                List<INP_CONSULTATION_DOCTOR_MASTER>  zj_INP_CONSULTATION_DOCTOR_MASTER =  zjInpConsultationDoctorMasterMapper.findZjInpConsultationDoctorMasterByUniqueId(uniqueId);
//                List<INP_CONSULTATION_DOCTOR_DETAIL>  zj_INP_CONSULTATION_DOCTOR_DETAIL =  zjInpConsultationDoctorDetailMapper.findZjInpConsultationDoctorDetailByUniqueId(uniqueId);
//                List<TEM_PRE_COURSE_DIS>  zj_TEM_PRE_COURSE_DIS =  zjTemPreCourseDisMapper.findZjTemPreCourseDisByUniqueId(uniqueId);
//                List<PRE_OP_DISCUSSION>  zj_PRE_OP_DISCUSSION =  zjPreOpDiscussionMapper.findZjPreOpDiscussionByUniqueId(uniqueId);
//                List<POST_OP_COURSE>  zj_POST_OP_COURSE =  zjPostOpCourseMapper.findZjPostOpCourseByUniqueId(uniqueId);
//                List<TRANSFER_DEPT>  zj_TRANSFER_DEPT =  zjTransferDeptMapper.findZjTransferDeptByUniqueId(uniqueId);
//                List<EMERGENCY_RECORD>  zj_EMERGENCY_RECORD =  zjEmergencyRecordMapper.findZjEmergencyRecordByUniqueId(uniqueId);
//                List<STAGE_SUMMARY>  zj_STAGE_SUMMARY =  zjStageSummaryMapper.findZjStageSummaryByUniqueId(uniqueId);
//                List<INP_ORDERS>  zj_INP_ORDERS =  zjInpOrdersMapper.findZjInpOrdersByUniqueId(uniqueId);
//                List<SYMP_PRESENT>  zj_symp_present =  zjSympPresentMapper.findZjSympPresentByUniqueId(uniqueId);
//                List<SMOKE_AND_DRINK>  zj_smoke_and_drink =  zjSmokeAndDrinkMapper.findZjSmokeAndDrinkByUniqueId(uniqueId);
//                List<PRIOR_DISEASE_AND_SURGERY>  zj_prior_disease_and_surgery =  zjPriorDiseaseAndSurgeryMapper.findZjPriorDiseaseAndSurgeryByUniqueId(uniqueId);
//                List<FAMILY_HISTORY>  zj_family_history =  zjFamilyHistoryMapper.findZjFamilyHistoryByUniqueId(uniqueId);
//                List<CHEST_XR_ENTRY_RESULTS>  zj_chest_xr_entry_results =  zjChestXrEntryResultsMapper.findZjChestXrEntryResultsByUniqueId(uniqueId);
//                List<CHEST_CT_DESCRIPTION>  zj_chest_ct_description =  zjChestCtDescriptionMapper.findZjChestCtDescriptionByUniqueId(uniqueId);
//                List<CHEST_CT_ENTRY_RESULTS>  zj_chest_ct_entry_results =  zjChestCtEntryResultsMapper.findZjChestCtEntryResultsByUniqueId(uniqueId);
//                List<ABDOM_CT_DESCRIPTION>  zj_abdom_ct_description =  zjAbdomCtDescriptionMapper.findZjAbdomCtDescriptionByUniqueId(uniqueId);
//                List<ABDOM_CT_ENTRY_RESULTS>  zj_abdom_ct_entry_results =  zjAbdomCtEntryResultsMapper.findZjAbdomCtEntryResultsByUniqueId(uniqueId);
//                List<ABDOM_MR_DESCRIPTION>  zj_abdom_mr_description =  zjAbdomMrDescriptionMapper.findZjAbdomMrDescriptionByUniqueId(uniqueId);
//                List<ABDOM_MR_ENTRY_RESULTS>  zj_abdom_mr_entry_results =  zjAbdomMrEntryResultsMapper.findZjAbdomMrEntryResultsByUniqueId(uniqueId);
//                List<POSTOP_COMP>  zj_postop_comp =  zjPostopCompMapper.findZjPostopCompByUniqueId(uniqueId);
//                List<RADIOTHERAPY>  zj_radiotherapy =  zjRadiotherapyMapper.findZjRadiotherapyByUniqueId(uniqueId);
//                List<ABDOM_US_DESCRIPTION>  zj_abdom_us_description =  zjAbdomUsDescriptionMapper.findZjAbdomUsDescriptionByUniqueId(uniqueId);
//                List<ABDOM_US_ENTRY_RESULTS>  zj_abdom_us_entry_results =  zjAbdomUsEntryResultsMapper.findZjAbdomUsEntryResultsByUniqueId(uniqueId);
//                List<PET_CT_DESCRIPTION>  zj_pet_ct_description =  zjPetCtDescriptionMapper.findZjPetCtDescriptionByUniqueId(uniqueId);
//                List<PET_CT_ENTRY_RESULTS>  zj_pet_ct_entry_results =  zjPetCtEntryResultsMapper.findZjPetCtEntryResultsByUniqueId(uniqueId);
//                List<SURGICAL_RECORD>  zj_surgical_record =  zjSurgicalRecordMapper.findZjSurgicalRecordByUniqueId(uniqueId);
//                List<PHYSICAL_EXAM_PARA>  zj_physical_exam_para =  zjPhysicalExamParaMapper.findZjPhysicalExamParaByUniqueId(uniqueId);
//                List<INTERVENTION_THERAPY>  zj_intervention_therapy =  zjInterventionTherapyMapper.findZjInterventionTherapyByUniqueId(uniqueId);
//                List<CLINICAL_DIAG>  zj_clinical_diag =  zjClinicalDiagMapper.findZjClinicalDiagByUniqueId(uniqueId);
//                List<SYMP_PRESENT> zj_SYMPTOMS= zjSympPresentMapper.findZjSympPresentByUniqueId(uniqueId);
//                List<SPECIALITY_EXAM> zj_SPECICALITY_EXAM= zjSpecialityExamMapper.findZjSpecialityExamByUniqueId(uniqueId);

                // 肠镜
//                List<COLON_ES_DESCRIPTION> zj_COLON_ES_DESCRIPTION = zjColonEsDescriptionMapper.findZjColonEsDescriptionByUniqueId(uniqueId);
//                if (zj_COLON_ES_DESCRIPTION != null && zj_COLON_ES_DESCRIPTION.size() > 0) {
//                    saveColonEsDes(zj_COLON_ES_DESCRIPTION);
//                }
                // 病理报告原文
//                List<HISTOLOGY_REPORT> zj_HISTOLOGY_REPORT = zjHistologyReportMapper.findZjHistologyReportByUniqueId(uniqueId);
//                if (zj_HISTOLOGY_REPORT != null && zj_HISTOLOGY_REPORT.size() > 0) {
//                    saveHistologyReport(zj_HISTOLOGY_REPORT);
//                }
                // 病理检查
//                List<PATHOLOGY>  zj_PATHOLOGY = zjPathologyMapper.findZjPathologyByUniqueId(uniqueId);
//                if (zj_PATHOLOGY != null && zj_PATHOLOGY.size() > 0) {
//                    savePathological(zj_PATHOLOGY);
//                }
                // 免疫组化标志物
                List<IHC_MARKER> zj_IHC_MARKER = zjIhcMarkerMapper.findZjIhcMarkerByUniqueId(uniqueId);
                if (zj_IHC_MARKER != null && zj_IHC_MARKER.size() > 0) {
                    saveImmune(zj_IHC_MARKER);
                }

//                if(zj_BASY_NSTD!=null){
//                    saveIndexPerson(zj_BASY_NSTD,zj_BASY_DIAG_STD);
//                    saveIndexIcu(zj_BASY_NSTD);
//                }
//                if(zj_BASY_DIAG_STD!=null){
//
//                    Date admitdate=null;
//                    Date maindate=null;
//                    Date clinicdate=null;
//                    Date pathdate=null;
//                    for(INP_DIAGNOSIS diagnosis: zj_INP_DIAGNOSIS){
//                        if(diagnosis.getDIAGNOSIS_TYPE()!=null){
//                            if(diagnosis.getDIAGNOSIS_TYPE().contains("出院主要诊断")){
//                                maindate=diagnosis.getDIAGNOSIS_DATE();
//                            }
//                            if(diagnosis.getDIAGNOSIS_TYPE().contains("门诊诊断")){
//                                clinicdate=diagnosis.getDIAGNOSIS_DATE();
//                            }
//                            if(diagnosis.getDIAGNOSIS_TYPE().contains("入院初诊")){
//                                admitdate=diagnosis.getDIAGNOSIS_DATE();
//                            }
//                            if(diagnosis.getDIAGNOSIS_TYPE().contains("病理诊断")){
//                                pathdate=diagnosis.getDIAGNOSIS_DATE();
//                            }
//                        }
//
//                    }
//
//                    if (zj_BASY_NSTD==null){
//                        zj_BASY_NSTD = new BASY_NSTD();
//                        zj_BASY_NSTD.setDOP3("");
//                    }
//                    saveIndexDiagnosisAdmit(zj_BASY_DIAG_STD,visitdate,admitdate,zj_BASY_NSTD);
//                    saveIndexDiagnosisClinic(zj_BASY_DIAG_STD,visitdate,clinicdate,zj_BASY_NSTD);
//                    saveIndexDiagnosisMain(zj_BASY_DIAG_STD,visitdate,maindate,zj_BASY_NSTD);
//                    saveIndexDiagnosisOther(zj_BASY_DIAG_STD,visitdate,maindate,zj_BASY_NSTD);
//                    saveIndexInjury(zj_BASY_DIAG_STD,zj_BASY_NSTD);
//                    saveIndexPathology(zj_BASY_DIAG_STD,visitdate,pathdate,zj_BASY_NSTD);
//                }
//
//                if(zj_BASY_OP_STD!=null){
//                    saveIndexOperation(zj_BASY_OP_STD,zj_BASY_NSTD);
//                }


//                if(zj_NURSING_RECORD!=null&&zj_NURSING_RECORD.size()>0){
//                    savePersonGeneral(zj_NURSING_RECORD, zj_VITAL_RECORD);
//                }

//               if(zj_INP_DIAGNOSIS!=null&&zj_INP_DIAGNOSIS.size()>0){
//                   saveDiagnosis(zj_INP_DIAGNOSIS);
//               }
//               if(zj_TEM_INP_ADMISSION_STATUS!=null&&zj_TEM_INP_ADMISSION_STATUS.size()>0){
//                   saveHisMarriage(zj_TEM_INP_ADMISSION_STATUS);
//               }

//                if(zj_TEM_INP_ADMISSION_STATUS!=null&&zj_TEM_INP_ADMISSION_STATUS.size()>0){
//                    for(TEM_INP_ADMISSION_STATUS tem_inp_admission_status:zj_TEM_INP_ADMISSION_STATUS){
//                        saveInpAdmissionStatus(tem_inp_admission_status);
//                    }
//
//                }
//                if (zj_SYMPTOMS!=null&&zj_SYMPTOMS.size()!=0){
//                    saveSymptom(zj_SYMPTOMS, zj_SPECICALITY_EXAM);
//                }
//                if (zj_smoke_and_drink!=null&&zj_smoke_and_drink.size()!=0){
//                    saveHisPerson(zj_smoke_and_drink);
//                }
//                if (zj_family_history!=null&&zj_family_history.size()!=0){
//                    saveHisFamily(zj_family_history);
//                }
//                if (zj_prior_disease_and_surgery!=null&&zj_prior_disease_and_surgery.size()!=0){
//                    saveHisPast(zj_prior_disease_and_surgery);
//                }
            }
        }
    }

    /**
     * 免疫组化标志物
     */
    public void saveImmune(List<IHC_MARKER> zj_IHC_MARKER) {
        for (IHC_MARKER ihc_marker : zj_IHC_MARKER
             ) {
            HISTOLOGY_REPORT histology_report = zjHistologyReportMapper.findZjHistologyReportByUniqueId2(ihc_marker.getunique_id());
            Immune immune = new Immune();
            // unique_id	unique_id
            immune.setUniqueId(ihc_marker.getunique_id());
            // unique_id_lv1	标识患者身份唯一标识
            immune.setUniqueIdLv1(ihc_marker.getunique_id_lv1());
            // unique_id_lv2	唯一标识
            immune.setUniqueIdLv2(ihc_marker.getunique_id_lv2());
            // p900	医疗机构代码
            immune.setP900(ihc_marker.getp900());
            // patient_id	患者id
            immune.setPatientId(ihc_marker.getpatient_id());
            // visit_id	住院号
            immune.setVisitId(ihc_marker.getvisit_id());
            // marker_name	免疫组化检测项目
            immune.setMarkerName(getStandardResultTextById(ihc_marker.gettest_item_name_std(),"afterType1",
                    "/", ";"));
            // marker_qualitative	免疫组化标志物检测定性结果
            immune.setMarkerQualitative(getIhcMarkerMarkerQualita(ihc_marker.gettest_item_value_std()));
            // marker_quantify	免疫组化标志物检测定量结果
            // 质检反馈：这个字段应该转化成百分比而不是小数
            String markerQuantify = getStandardResultTextById(ihc_marker.gettest_item_value_std(), "afterType1",
                    "test_item_value_precise_std");
            String markerQuantifyTransfer = null;
            if (StringUtils.isEmpty(markerQuantify)) {
                markerQuantifyTransfer = null;
            } else {
                try {
                    markerQuantifyTransfer = Double.valueOf(markerQuantify) * 100 + "%";
                } catch (NumberFormatException e) {
                    markerQuantifyTransfer = markerQuantify;
                }
            }

            immune.setMarkerQuantify(markerQuantifyTransfer);
            // data_version	数据版本
            immune.setDataVersion(ihc_marker.getdata_version());
            // data_db_source	数据库来源
            immune.setDataDbSource(ihc_marker.getdata_db_source());
            // data_table_source	数据表来源
            immune.setDataTableSource(ihc_marker.getdata_table_source());
            // data_field_source	数据项来源
            immune.setDataFieldSource(ihc_marker.getdata_field_source());
            // created_at	创建时间
            immune.setCreatedAt(ihc_marker.getcreate_time());
            // creator	创建人
            immune.setCreator(ihc_marker.getcreator());
            // updated_at	修改时间
            immune.setUpdatedAt(histology_report.getUPDATED_AT());
            this.immuneService.saveImmune(immune);
            log.info("保存免疫组化标志物：" + immune.getUniqueId());
        }

    }

    /**
     * 病理检查
     */
    public void savePathological(List<PATHOLOGY>  zj_PATHOLOGY) {
        for (PATHOLOGY pathology : zj_PATHOLOGY
             ) {
            HISTOLOGY_REPORT histology_report = zjHistologyReportMapper.findZjHistologyReportByUniqueId2(pathology.getunique_id());
            Pathological pathological = new Pathological();
            // unique_id	unique_id
            pathological.setUniqueId(pathology.getunique_id());
            // unique_id_lv1	标识患者身份唯一标识
            pathological.setUniqueIdLv1(pathology.getunique_id_lv1());
            // unique_id_lv2	唯一标识
            pathological.setUniqueIdLv2(pathology.getunique_id_lv2());
            // p900	医疗机构代码
            pathological.setP900(pathology.getp900());
            // patient_id	患者id
            pathological.setPatientId(pathology.getpatient_id());
            // visit_id	住院号
            pathological.setVisitId(pathology.getvisit_id());
            // case_number	病理号
            pathological.setCaseNumber(histology_report.getPATHOLOGY_NO());
            // inspect_time	收到日期
            pathological.setInspectTime(histology_report.getSPECIMEN_RECEIVING_TIME());
            // reprot_time	报告日期
            pathological.setReprotTime(histology_report.getREPORT_TIME());
            // specimen_name	送检标本名称
            pathological.setSpecimenName(getStandardResultTextById(pathology.getstructure_std(),"afterType1",
                    "/", ";"));
            // pathological_types	病理组织类型
            pathological.setPathologicalTypes(getStandardResultTextById(pathology.getfeature_std(), "afterType1",
                    "/", ";"));
            // data_version	数据版本
            pathological.setDataVersion(pathology.getdata_version());
            // data_db_source	数据库来源
            pathological.setDataDbSource(pathology.getdata_db_source());
            // data_table_source	数据表来源
            pathological.setDataTableSource(pathology.getdata_table_source());
            // data_field_source	数据项来源
            pathological.setDataFieldSource(pathology.getdata_field_source());
            // created_at	创建时间
            pathological.setCreatedAt(pathology.getcreate_time());
            // creator	创建人
            pathological.setCreator(pathology.getcreator());
            // updated_at	修改时间
            pathological.setUpdatedAt(histology_report.getUPDATED_AT());
            this.pathologicalService.savePathological(pathological);
            log.info("保存病理检查：" + pathological.getUniqueId());
        }
    }

    /**
     * 病理报告原文
     * @param zj_HISTOLOGY_REPORT
     */
    public void saveHistologyReport(List<HISTOLOGY_REPORT> zj_HISTOLOGY_REPORT) {
        for (HISTOLOGY_REPORT histology_report : zj_HISTOLOGY_REPORT
                ) {
            HistologyReport histologyReport = new HistologyReport();
            // unique_id	unique_id
            histologyReport.setUniqueId(histology_report.getUNIQUE_ID());
            // unique_id_lv1	标识患者身份唯一标识
            histologyReport.setUniqueIdLv1(histology_report.getUNIQUE_ID_LV1());
            // unique_id_lv2	唯一标识
            histologyReport.setUniqueIdLv2(histology_report.getUNIQUE_ID_LV2());
            // p900	医疗机构代码
            histologyReport.setP900(histology_report.getP900());
            // patient_id	患者id
            histologyReport.setPatientId(histology_report.getPATIENT_ID());
            // visit_id	住院号
            histologyReport.setVisitId(histology_report.getVISIT_ID());
            // admission_number	住院次数
            histologyReport.setAdmissionNumber(histology_report.getADMISSION_NUMBER());
            // visit_type	就诊类型
            histologyReport.setVisitType(histology_report.getVISIT_TYPE());
            // pathology_no	病理系统编号
            histologyReport.setPathologyNo(histology_report.getPATHOLOGY_NO());
            // inspection_hospital	送检医院
            histologyReport.setInspectionHospital(histology_report.getINSPECTION_HOSPITAL());
            // inspection_department	送检科室
            histologyReport.setInspectionDepartment(histology_report.getINSPECTION_DEPARTMENT());
            // inspection_physician	送检医师
            histologyReport.setInspectionPhysician(histology_report.getINSPECTION_PHYSICIAN());
            // inspection_time	送检时间
            histologyReport.setInspectionTime(histology_report.getINSPECTION_TIME());
            // inspection_site	送检部位
            histologyReport.setInspectionSite(histology_report.getINSPECTION_SITE());
            // clinical_diagnosis	临床诊断
            histologyReport.setClinicalDiagnosis(histology_report.getCLINICAL_DIAGNOSIS());
            // name	姓名
            histologyReport.setName(histology_report.getNAME());
            // specimen_receiving_time	标本接收时间
            histologyReport.setSpecimenReceivingTime(histology_report.getSPECIMEN_RECEIVING_TIME());
            // report_time	报告时间
            histologyReport.setReportTime(histology_report.getREPORT_TIME());
            // review_time	审核时间
            histologyReport.setReviewTime(histology_report.getREVIEW_TIME());
            // path_eye	病理所见-肉眼所见
            histologyReport.setPathEye(histology_report.getPATH_EYE());
            // path_microscope	病理所见-镜下所见
            histologyReport.setPathMicroscope(histology_report.getPATH_MICROSCOPE());
            // path_diag	病理诊断
            histologyReport.setPathDiag(histology_report.getPATH_DIAG());
            // path_diag_code	病理诊断编码
            histologyReport.setPathDiagCode(histology_report.getPATH_DIAG_CODE());
            // report_doctor	报告医师
            histologyReport.setReportDoctor(histology_report.getREPORT_DOCTOR());
            // review_doctor	审核医师
            histologyReport.setReviewDoctor(histology_report.getREVIEW_DOCTOR());
            // report_status	报告状态
            histologyReport.setReportStatus(histology_report.getREPORT_STATUS());
            // data_version	数据版本
            histologyReport.setDataVersion(histology_report.getDATA_VERSION());
            // data_db_source	数据库来源
            histologyReport.setDataDbSource(histology_report.getDATA_DB_SOURCE());
            // data_table_source	数据表来源
            histologyReport.setDataTableSource(histology_report.getDATA_TABLE_SOURCE());
            // data_field_source	数据项来源
            histologyReport.setDataFieldSource(histology_report.getDATA_FIELD_SOURCE());
            // created_at	创建时间
            histologyReport.setCreatedAt(histology_report.getCREATED_AT());
            // creator	创建人
            histologyReport.setCreator(histology_report.getCREATOR());
            // updated_at	修改时间
            histologyReport.setUpdatedAt(histology_report.getUPDATED_AT());
            this.histologyReportService.saveHistologyReport(histologyReport);
            log.info("保存病理报告原文：" + histologyReport.getUniqueId());
        }
    }

    /**
     * 肠镜
     * @param zj_COLON_ES_DESCRIPTION
     */
    public void saveColonEsDes(List<COLON_ES_DESCRIPTION> zj_COLON_ES_DESCRIPTION) {
        for (COLON_ES_DESCRIPTION colon_es_description : zj_COLON_ES_DESCRIPTION) {
            EXAM_MASTER exam_master = zjExamMasterMapper.findZjExamMasterByUniqueId2(colon_es_description.getunique_id());
            ColonEsDes colonEsDes = new ColonEsDes();
            // unique_id
            colonEsDes.setUniqueId(colon_es_description.getunique_id());
            // unique_id_lv1	标识患者身份唯一标识
            colonEsDes.setUniqueIdLv1(colon_es_description.getunique_id_lv1());
            // unique_id_lv2	唯一标识
            colonEsDes.setUniqueIdLv2(colon_es_description.getunique_id_lv2());
            // p900	医疗机构代码
            colonEsDes.setP900(colon_es_description.getp900());
            // patient_id	患者id
            colonEsDes.setPatientId(colon_es_description.getpatient_id());
            // visit_id	就诊标识住院号
            colonEsDes.setVisitId(colon_es_description.getvisit_id());
            // exam_no	检查号
            colonEsDes.setExamNo(exam_master.getEXAM_NO());
            // exam_name	检查项目
            colonEsDes.setExamName(exam_master.getENTRY_NAME());
            // structure	部位
            colonEsDes.setStructure(colon_es_description.getstructure());
            // lesion	病灶
            colonEsDes.setLesion(colon_es_description.getlesion());
            // size	大小
            colonEsDes.setSize(colon_es_description.getsize());
            // quanity	数目
            colonEsDes.setQuanity(colon_es_description.getquantity());

            if (StringUtils.isNotEmpty(colon_es_description.getlesion_std())) {
                String lesion_std = getStandardResultTextById(colon_es_description.getlesion_std(), "afterType1", "lesion_std");
                if ("息肉".equalsIgnoreCase(StringUtils.trim(lesion_std)) && StringUtils.isEmpty(colon_es_description.getneg_std())) {
                    // structure_std	息肉位置
                    colonEsDes.setStructureStd(getCEDStructureStd(colon_es_description.getstructure_std()));
                    // distance_std	息肉距离肛门距离
                    colonEsDes.setDistanceStd(getStandardResultTextById(colon_es_description.getdistance_std(), "afterType1", "distance_std"));
                    // size_std	息肉大小
                    colonEsDes.setSizeStd(getcEDSizeStd(colon_es_description.getsize_std()));
                    // quantity_std	息肉数量
                    colonEsDes.setQuantityStd(getStandardResultTextById(colon_es_description.getquantity_std(), "afterType1", "quantity_std"));
                }
            }
            // treatment_std	是否行肠镜肿物切除
            if (StringUtils.isNotEmpty(colon_es_description.gettreatment_std())) {
                colonEsDes.setTreatmentStd("是");
            } else {
                colonEsDes.setTreatmentStd("否");
            }
            // data_version	数据版本
            colonEsDes.setDataVersion(colon_es_description.getdata_version());
            // data_db_source	数据库来源
            colonEsDes.setDataDbSource(colon_es_description.getdata_db_source());
            // data_table_source	数据表来源
            colonEsDes.setDataTableSource(colon_es_description.getdata_table_source());
            // data_field_source	数据项来源
            colonEsDes.setDataFieldSource(colon_es_description.getdata_field_source());
            // created_at	创建时间
            colonEsDes.setCreatedAt(colon_es_description.getcreate_time());
            // creator	创建人
            colonEsDes.setCreator(colon_es_description.getcreator());
            // updated_at	修改时间
//            colonEsDes.setUpdatedAt(null);
            colonEsDesService.saveColonEsDes(colonEsDes);
            log.info("保存肠镜：" + colonEsDes.getUniqueId());
        }
    }

    public String getIhcMarkerMarkerQualita(String standardTableId) {
        String resultJson = standardResultMapper.selectStandardResultById(standardTableId);
        return JSONUtils.ihcMarkerMarkerQualita(resultJson);
    }
    public String getCEDStructureStd(String standardTableId) {
        String resultJson = standardResultMapper.selectStandardResultById(standardTableId);
        return JSONUtils.cEDStructureStd(resultJson);
    }
    public String getcEDSizeStd(String standardTableId) {
        String resultJson = standardResultMapper.selectStandardResultById(standardTableId);
        return JSONUtils.cEDSizeStd(resultJson);
    }

    public String getStandardResultTextById(String standardTableId, String arrayField, String stdField) {
        String resultJson = standardResultMapper.selectStandardResultById(standardTableId);

        return JSONUtils.getDuplicatedConcatOne(resultJson, arrayField, stdField);
    }

    public String getStandardResultTextById(String standardTableId, String arrayField, String fieldSeparate, String objSeparate) {
        String resultJson = standardResultMapper.selectStandardResultById(standardTableId);
        return JSONUtils.getAllFieldGroupByObj(resultJson, arrayField, fieldSeparate, objSeparate);
    }

    public void savePerson(TEM_PAT_MASTER_INDEX index){
        Person person = new Person();
        //患者身份标识
        person.setUniqueId(index.getUNIQUE_ID());
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
   /*     //数据版本
        person.setDataVersion();
        //数据库来源
        person.setDataDbSource();
        //数据表来源
        person.setDataTableSource();
        //数据项来源
        person.setDataFieldSource();
        //创建时间
        person.setCreatedAt();
        //创建人
        person.setCreator();
        //修改时间
        person.setUpdatedAt();*/
        personService.savePerson(person);
        log.info("保存患者："+person.getUniqueId());
    }
    public void saveVisitRecord(PAT_VISIT_MASTER master) {
        VisitRecord visitRecord = new VisitRecord();
        //患者身份标识
        visitRecord.setUniqueIdLv1(master.getUNIQUE_ID_LV1());
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
    public void saveIndexOperation(BASY_OP_STD zj_BASY_STD,BASY_NSTD basy_nstd){
        log.info("保存病案首页手术："+zj_BASY_STD.getUNIQUE_ID());
        if (zj_BASY_STD.getP490()!=null&&zj_BASY_STD.getP492()!=null) {

            IndexOperation indexOperation = new IndexOperation();
            //unique_id
            indexOperation.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
            //标识患者身份唯一标识
            indexOperation.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
            //唯一标识
            indexOperation.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
            //医疗机构代码
            indexOperation.setP900(zj_BASY_STD.getP900());
            //患者id
            if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                indexOperation.setPatientId(zj_BASY_STD.getPATIENT_ID());
            }else {
                indexOperation.setPatientId(basy_nstd.getDOP3());
            }
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

                //unique_id
                indexOperationIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexOperationIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexOperationIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexOperationIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexOperationIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexOperationIcd.setPatientId(basy_nstd.getDOP3());
                }
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
                indexOperationIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexOperationIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexOperationIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexOperationIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexOperationIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexOperationIcd.setPatientId(basy_nstd.getDOP3());
                }
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
            indexOperation.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
            //标识患者身份唯一标识
            indexOperation.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
            //唯一标识
            indexOperation.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
            //医疗机构代码
            indexOperation.setP900(zj_BASY_STD.getP900());
            //患者id
            if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                indexOperation.setPatientId(zj_BASY_STD.getPATIENT_ID());
            }else {
                indexOperation.setPatientId(basy_nstd.getDOP3());
            }
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
                indexOperationIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexOperationIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexOperationIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexOperationIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexOperationIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexOperationIcd.setPatientId(basy_nstd.getDOP3());
                }
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
                indexOperationIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexOperationIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexOperationIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexOperationIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexOperationIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexOperationIcd.setPatientId(basy_nstd.getDOP3());
                }
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
            indexOperation.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
            //标识患者身份唯一标识
            indexOperation.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
            //唯一标识
            indexOperation.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
            //医疗机构代码
            indexOperation.setP900(zj_BASY_STD.getP900());
            //患者id
            if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                indexOperation.setPatientId(zj_BASY_STD.getPATIENT_ID());
            }else {
                indexOperation.setPatientId(basy_nstd.getDOP3());
            }
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
                indexOperationIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexOperationIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexOperationIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexOperationIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexOperationIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexOperationIcd.setPatientId(basy_nstd.getDOP3());
                }
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
                indexOperationIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexOperationIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexOperationIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexOperationIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexOperationIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexOperationIcd.setPatientId(basy_nstd.getDOP3());
                }
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
            indexOperation.setUniqueId(zj_BASY_STD.getUNIQUE_ID());

            //标识患者身份唯一标识
            indexOperation.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
            //唯一标识
            indexOperation.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
            //医疗机构代码
            indexOperation.setP900(zj_BASY_STD.getP900());
            //患者id
            if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                indexOperation.setPatientId(zj_BASY_STD.getPATIENT_ID());
            }else {
                indexOperation.setPatientId(basy_nstd.getDOP3());
            }
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
                indexOperationIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexOperationIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexOperationIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexOperationIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexOperationIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexOperationIcd.setPatientId(basy_nstd.getDOP3());
                }
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
                indexOperationIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexOperationIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexOperationIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexOperationIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexOperationIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexOperationIcd.setPatientId(basy_nstd.getDOP3());
                }
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
            indexOperation.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
            //标识患者身份唯一标识
            indexOperation.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
            //唯一标识
            indexOperation.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
            //医疗机构代码
            indexOperation.setP900(zj_BASY_STD.getP900());
            //患者id
            if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                indexOperation.setPatientId(zj_BASY_STD.getPATIENT_ID());
            }else {
                indexOperation.setPatientId(basy_nstd.getDOP3());
            }
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
                indexOperationIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexOperationIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexOperationIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexOperationIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexOperationIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexOperationIcd.setPatientId(basy_nstd.getDOP3());
                }
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
                indexOperationIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexOperationIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexOperationIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexOperationIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexOperationIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexOperationIcd.setPatientId(basy_nstd.getDOP3());
                }
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
            indexOperation.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
            //标识患者身份唯一标识
            indexOperation.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
            //唯一标识
            indexOperation.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
            //医疗机构代码
            indexOperation.setP900(zj_BASY_STD.getP900());
            //患者id
            if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                indexOperation.setPatientId(zj_BASY_STD.getPATIENT_ID());
            }else {
                indexOperation.setPatientId(basy_nstd.getDOP3());
            }
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
                indexOperationIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexOperationIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexOperationIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexOperationIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexOperationIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexOperationIcd.setPatientId(basy_nstd.getDOP3());
                }
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
                indexOperationIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexOperationIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexOperationIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexOperationIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexOperationIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexOperationIcd.setPatientId(basy_nstd.getDOP3());
                }
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
            indexOperation.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
            //标识患者身份唯一标识
            indexOperation.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
            //唯一标识
            indexOperation.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
            //医疗机构代码
            indexOperation.setP900(zj_BASY_STD.getP900());
            //患者id
            if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                indexOperation.setPatientId(zj_BASY_STD.getPATIENT_ID());
            }else {
                indexOperation.setPatientId(basy_nstd.getDOP3());
            }
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
                indexOperationIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());

                //标识患者身份唯一标识
                indexOperationIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexOperationIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexOperationIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexOperationIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexOperationIcd.setPatientId(basy_nstd.getDOP3());
                }
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
                indexOperationIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());

                //标识患者身份唯一标识
                indexOperationIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexOperationIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexOperationIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexOperationIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexOperationIcd.setPatientId(basy_nstd.getDOP3());
                }
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
            indexOperation.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
            //标识患者身份唯一标识
            indexOperation.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
            //唯一标识
            indexOperation.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
            //医疗机构代码
            indexOperation.setP900(zj_BASY_STD.getP900());
            //患者id
            if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                indexOperation.setPatientId(zj_BASY_STD.getPATIENT_ID());
            }else {
                indexOperation.setPatientId(basy_nstd.getDOP3());
            }
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
                indexOperationIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());

                //标识患者身份唯一标识
                indexOperationIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexOperationIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexOperationIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexOperationIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexOperationIcd.setPatientId(basy_nstd.getDOP3());
                }
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
                indexOperationIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());

                //标识患者身份唯一标识
                indexOperationIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexOperationIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexOperationIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexOperationIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexOperationIcd.setPatientId(basy_nstd.getDOP3());
                }
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
            indexOperation.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
            //标识患者身份唯一标识
            indexOperation.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
            //唯一标识
            indexOperation.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
            //医疗机构代码
            indexOperation.setP900(zj_BASY_STD.getP900());
            //患者id
            if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                indexOperation.setPatientId(zj_BASY_STD.getPATIENT_ID());
            }else {
                indexOperation.setPatientId(basy_nstd.getDOP3());
            }
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
                indexOperationIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());

                //标识患者身份唯一标识
                indexOperationIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexOperationIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexOperationIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexOperationIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexOperationIcd.setPatientId(basy_nstd.getDOP3());
                }
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
                indexOperationIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());

                //标识患者身份唯一标识
                indexOperationIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexOperationIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexOperationIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexOperationIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexOperationIcd.setPatientId(basy_nstd.getDOP3());
                }
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
            indexOperation.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
            //标识患者身份唯一标识
            indexOperation.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
            //唯一标识
            indexOperation.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
            //医疗机构代码
            indexOperation.setP900(zj_BASY_STD.getP900());
            //患者id
            if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                indexOperation.setPatientId(zj_BASY_STD.getPATIENT_ID());
            }else {
                indexOperation.setPatientId(basy_nstd.getDOP3());
            }
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
                indexOperationIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());

                //标识患者身份唯一标识
                indexOperationIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexOperationIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexOperationIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexOperationIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexOperationIcd.setPatientId(basy_nstd.getDOP3());
                }
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
                indexOperationIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());

                //标识患者身份唯一标识
                indexOperationIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexOperationIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexOperationIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexOperationIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexOperationIcd.setPatientId(basy_nstd.getDOP3());
                }
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
    public void saveIndexDiagnosisAdmit(BASY_DIAG_STD zj_BASY_STD,Date visitDate,Date diagnosisDate,BASY_NSTD basy_nstd){
        if(zj_BASY_STD.getP30()!=null&&zj_BASY_STD.getP301()!=null){
            IndexDiagnosisAdmit indexDiagnosisAdmit = new IndexDiagnosisAdmit();
            indexDiagnosisAdmit.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
            //标识患者身份唯一标识
            indexDiagnosisAdmit.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
            //唯一标识
            indexDiagnosisAdmit.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
            //医疗机构代码
            indexDiagnosisAdmit.setP900(zj_BASY_STD.getP900());
            //患者id
            if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                indexDiagnosisAdmit.setPatientId(zj_BASY_STD.getPATIENT_ID());
            }else {
                indexDiagnosisAdmit.setPatientId(basy_nstd.getDOP3());
            }

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
                indexDiagnosisAdmitIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisAdmitIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisAdmitIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisAdmitIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexDiagnosisAdmitIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexDiagnosisAdmitIcd.setPatientId(basy_nstd.getDOP3());
                }
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
                indexDiagnosisAdmitIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisAdmitIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisAdmitIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisAdmitIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexDiagnosisAdmitIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexDiagnosisAdmitIcd.setPatientId(basy_nstd.getDOP3());
                }
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
                indexDiagnosisAdmitIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisAdmitIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisAdmitIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisAdmitIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexDiagnosisAdmitIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexDiagnosisAdmitIcd.setPatientId(basy_nstd.getDOP3());
                }
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
                indexDiagnosisAdmitIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisAdmitIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisAdmitIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisAdmitIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexDiagnosisAdmitIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexDiagnosisAdmitIcd.setPatientId(basy_nstd.getDOP3());
                }
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
                indexDiagnosisAdmitIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisAdmitIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisAdmitIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisAdmitIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexDiagnosisAdmitIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexDiagnosisAdmitIcd.setPatientId(basy_nstd.getDOP3());
                }
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
            if(zj_BASY_STD.getP301_ICD10_NAME6()!=null&&zj_BASY_STD.getP301_ICD10_ID6()!=null&&!"".equals(zj_BASY_STD.getP301_ICD10_ID6())){
                IndexDiagnosisAdmitIcd indexDiagnosisAdmitIcd = new IndexDiagnosisAdmitIcd();
                indexDiagnosisAdmitIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisAdmitIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisAdmitIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisAdmitIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexDiagnosisAdmitIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexDiagnosisAdmitIcd.setPatientId(basy_nstd.getDOP3());
                }
                //住院号
                indexDiagnosisAdmitIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //入院诊断编码
                indexDiagnosisAdmitIcd.setAdmitId(indexDiagnosisAdmit.getId());
                //入院诊断编码
                indexDiagnosisAdmitIcd.setDiagnosisIcdcode(zj_BASY_STD.getP301_ICD10_ID6());
                //入院诊断描述名称
                indexDiagnosisAdmitIcd.setDiagnosisIcddesc(zj_BASY_STD.getP301_ICD10_NAME6());
                indexDiagnosisAdmitIcdService.saveIndexDiagnosisAdmitIcd(indexDiagnosisAdmitIcd);
            }
            if(zj_BASY_STD.getP301_ICD10_NAME7()!=null&&zj_BASY_STD.getP301_ICD10_ID7()!=null&&!"".equals(zj_BASY_STD.getP301_ICD10_ID7())){
                IndexDiagnosisAdmitIcd indexDiagnosisAdmitIcd = new IndexDiagnosisAdmitIcd();
                indexDiagnosisAdmitIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisAdmitIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisAdmitIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisAdmitIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexDiagnosisAdmitIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexDiagnosisAdmitIcd.setPatientId(basy_nstd.getDOP3());
                }
                //住院号
                indexDiagnosisAdmitIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //入院诊断编码
                indexDiagnosisAdmitIcd.setAdmitId(indexDiagnosisAdmit.getId());
                //入院诊断编码
                indexDiagnosisAdmitIcd.setDiagnosisIcdcode(zj_BASY_STD.getP301_ICD10_ID7());
                //入院诊断描述名称
                indexDiagnosisAdmitIcd.setDiagnosisIcddesc(zj_BASY_STD.getP301_ICD10_NAME7());
                indexDiagnosisAdmitIcdService.saveIndexDiagnosisAdmitIcd(indexDiagnosisAdmitIcd);
            }
//            if(zj_BASY_STD.getP301_ICD10_NAME8()!=null&&zj_BASY_STD.getP301_ICD10_ID8()!=null&&!"".equals(zj_BASY_STD.getP301_ICD10_ID8())){
//                IndexDiagnosisAdmitIcd indexDiagnosisAdmitIcd = new IndexDiagnosisAdmitIcd();
//                //标识患者身份唯一标识
//                indexDiagnosisAdmitIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
//                //唯一标识
//                indexDiagnosisAdmitIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
//                //医疗机构代码
//                indexDiagnosisAdmitIcd.setP900(zj_BASY_STD.getP900());
//                //患者id
//                indexDiagnosisAdmitIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
//                //住院号
//                indexDiagnosisAdmitIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
//                //入院诊断编码
//                indexDiagnosisAdmitIcd.setAdmitId(indexDiagnosisAdmit.getId());
//                //入院诊断编码
//                indexDiagnosisAdmitIcd.setDiagnosisIcdcode(zj_BASY_STD.getP301_ICD10_ID8());
//                //入院诊断描述名称
//                indexDiagnosisAdmitIcd.setDiagnosisIcddesc(zj_BASY_STD.getP301_ICD10_NAME8());
//                indexDiagnosisAdmitIcdService.saveIndexDiagnosisAdmitIcd(indexDiagnosisAdmitIcd);
//            }
//            if(zj_BASY_STD.getP301_ICD10_NAME9()!=null&&zj_BASY_STD.getP301_ICD10_ID9()!=null&&!"".equals(zj_BASY_STD.getP301_ICD10_ID9())){
//                IndexDiagnosisAdmitIcd indexDiagnosisAdmitIcd = new IndexDiagnosisAdmitIcd();
//                //标识患者身份唯一标识
//                indexDiagnosisAdmitIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
//                //唯一标识
//                indexDiagnosisAdmitIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
//                //医疗机构代码
//                indexDiagnosisAdmitIcd.setP900(zj_BASY_STD.getP900());
//                //患者id
//                indexDiagnosisAdmitIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
//                //住院号
//                indexDiagnosisAdmitIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
//                //入院诊断编码
//                indexDiagnosisAdmitIcd.setAdmitId(indexDiagnosisAdmit.getId());
//                //入院诊断编码
//                indexDiagnosisAdmitIcd.setDiagnosisIcdcode(zj_BASY_STD.getP301_ICD10_ID9());
//                //入院诊断描述名称
//                indexDiagnosisAdmitIcd.setDiagnosisIcddesc(zj_BASY_STD.getP301_ICD10_NAME9());
//                indexDiagnosisAdmitIcdService.saveIndexDiagnosisAdmitIcd(indexDiagnosisAdmitIcd);
//            }
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
    public void saveIndexDiagnosisClinic(BASY_DIAG_STD zj_BASY_STD,Date visitDate,Date diagnosisDate,BASY_NSTD basy_nstd){
        log.info("保存病案首页门诊诊断："+zj_BASY_STD.getUNIQUE_ID()+"---"+zj_BASY_STD.getP281_ICD10_ID1()+"------"+zj_BASY_STD.getP281_ICD10_NAME1());
        if(zj_BASY_STD.getP28()!=null&&zj_BASY_STD.getP281()!=null){

            IndexDiagnosisClinic indexDiagnosisClinic = new IndexDiagnosisClinic();
            indexDiagnosisClinic.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
            //标识患者身份唯一标识
            indexDiagnosisClinic.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
            //唯一标识
            indexDiagnosisClinic.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
            //医疗机构代码
            indexDiagnosisClinic.setP900(zj_BASY_STD.getP900());
            //患者id
            if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                indexDiagnosisClinic.setPatientId(zj_BASY_STD.getPATIENT_ID());
            }else {
                indexDiagnosisClinic.setPatientId(basy_nstd.getDOP3());
            }
            //住院号
            indexDiagnosisClinic.setVisitId(zj_BASY_STD.getVISIT_ID());
            //门诊诊断编码
            indexDiagnosisClinic.setP28(zj_BASY_STD.getP28());
            //门诊诊断名称
            indexDiagnosisClinic.setP281(zj_BASY_STD.getP281());
            indexDiagnosisClinic.setVisitDate(visitDate);
            indexDiagnosisClinic.setDiagnosisDate(diagnosisDate);
            indexDiagnosisClinicService.saveIndexDiagnosisClinic(indexDiagnosisClinic);

            if(zj_BASY_STD.getP281_ICD10_NAME1()!=null&&zj_BASY_STD.getP281_ICD10_ID1()!=null&&!"".equals(zj_BASY_STD.getP281_ICD10_ID1())){
                IndexDiagnosisClinicIcd indexDiagnosisClinicIcd = new IndexDiagnosisClinicIcd();
                indexDiagnosisClinicIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisClinicIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisClinicIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisClinicIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexDiagnosisClinicIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexDiagnosisClinicIcd.setPatientId(basy_nstd.getDOP3());
                }
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
                indexDiagnosisClinicIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisClinicIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisClinicIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisClinicIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexDiagnosisClinicIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexDiagnosisClinicIcd.setPatientId(basy_nstd.getDOP3());
                }
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
                indexDiagnosisClinicIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisClinicIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisClinicIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisClinicIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexDiagnosisClinicIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexDiagnosisClinicIcd.setPatientId(basy_nstd.getDOP3());
                }
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
                indexDiagnosisClinicIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisClinicIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisClinicIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisClinicIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexDiagnosisClinicIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexDiagnosisClinicIcd.setPatientId(basy_nstd.getDOP3());
                }
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
                indexDiagnosisClinicIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisClinicIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisClinicIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisClinicIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexDiagnosisClinicIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexDiagnosisClinicIcd.setPatientId(basy_nstd.getDOP3());
                }
                //住院号
                indexDiagnosisClinicIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                indexDiagnosisClinicIcd.setClinicId(indexDiagnosisClinic.getId());
                //门诊诊断编码
                indexDiagnosisClinicIcd.setDiagnosisIcdcode(zj_BASY_STD.getP281_ICD10_ID5());
                //门诊诊断名称
                indexDiagnosisClinicIcd.setDiagnosisIcddesc(zj_BASY_STD.getP281_ICD10_NAME5());
                indexDiagnosisClinicIcdService.saveIndexDiagnosisClinicIcd(indexDiagnosisClinicIcd);
            }
            if(zj_BASY_STD.getP281_ICD10_NAME6()!=null&&zj_BASY_STD.getP281_ICD10_ID6()!=null&&!"".equals(zj_BASY_STD.getP281_ICD10_ID6())){
                IndexDiagnosisClinicIcd indexDiagnosisClinicIcd = new IndexDiagnosisClinicIcd();
                indexDiagnosisClinicIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisClinicIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisClinicIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisClinicIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexDiagnosisClinicIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexDiagnosisClinicIcd.setPatientId(basy_nstd.getDOP3());
                }
                //住院号
                indexDiagnosisClinicIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                indexDiagnosisClinicIcd.setClinicId(indexDiagnosisClinic.getId());
                //门诊诊断编码
                indexDiagnosisClinicIcd.setDiagnosisIcdcode(zj_BASY_STD.getP281_ICD10_ID6());
                //门诊诊断名称
                indexDiagnosisClinicIcd.setDiagnosisIcddesc(zj_BASY_STD.getP281_ICD10_NAME6());
                indexDiagnosisClinicIcdService.saveIndexDiagnosisClinicIcd(indexDiagnosisClinicIcd);
            }
            if(zj_BASY_STD.getP281_ICD10_NAME7()!=null&&zj_BASY_STD.getP281_ICD10_ID7()!=null&&!"".equals(zj_BASY_STD.getP281_ICD10_ID7())){
                IndexDiagnosisClinicIcd indexDiagnosisClinicIcd = new IndexDiagnosisClinicIcd();
                indexDiagnosisClinicIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisClinicIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisClinicIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisClinicIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexDiagnosisClinicIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexDiagnosisClinicIcd.setPatientId(basy_nstd.getDOP3());
                }
                //住院号
                indexDiagnosisClinicIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                indexDiagnosisClinicIcd.setClinicId(indexDiagnosisClinic.getId());
                //门诊诊断编码
                indexDiagnosisClinicIcd.setDiagnosisIcdcode(zj_BASY_STD.getP281_ICD10_ID7());
                //门诊诊断名称
                indexDiagnosisClinicIcd.setDiagnosisIcddesc(zj_BASY_STD.getP281_ICD10_NAME7());
                indexDiagnosisClinicIcdService.saveIndexDiagnosisClinicIcd(indexDiagnosisClinicIcd);
            }
//            if(zj_BASY_STD.getP281_ICD10_NAME8()!=null&&zj_BASY_STD.getP281_ICD10_ID8()!=null&&!"".equals(zj_BASY_STD.getP281_ICD10_ID8())){
//                IndexDiagnosisClinicIcd indexDiagnosisClinicIcd = new IndexDiagnosisClinicIcd();
//                //标识患者身份唯一标识
//                indexDiagnosisClinicIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
//                //唯一标识
//                indexDiagnosisClinicIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
//                //医疗机构代码
//                indexDiagnosisClinicIcd.setP900(zj_BASY_STD.getP900());
//                //患者id
//                indexDiagnosisClinicIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
//                //住院号
//                indexDiagnosisClinicIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
//                indexDiagnosisClinicIcd.setClinicId(indexDiagnosisClinic.getId());
//                //门诊诊断编码
//                indexDiagnosisClinicIcd.setDiagnosisIcdcode(zj_BASY_STD.getP281_ICD10_ID8());
//                //门诊诊断名称
//                indexDiagnosisClinicIcd.setDiagnosisIcddesc(zj_BASY_STD.getP281_ICD10_NAME8());
//                indexDiagnosisClinicIcdService.saveIndexDiagnosisClinicIcd(indexDiagnosisClinicIcd);
//            }
//            if(zj_BASY_STD.getP281_ICD10_NAME9()!=null&&zj_BASY_STD.getP281_ICD10_ID9()!=null&&!"".equals(zj_BASY_STD.getP281_ICD10_ID9())){
//                IndexDiagnosisClinicIcd indexDiagnosisClinicIcd = new IndexDiagnosisClinicIcd();
//                //标识患者身份唯一标识
//                indexDiagnosisClinicIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
//                //唯一标识
//                indexDiagnosisClinicIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
//                //医疗机构代码
//                indexDiagnosisClinicIcd.setP900(zj_BASY_STD.getP900());
//                //患者id
//                indexDiagnosisClinicIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
//                //住院号
//                indexDiagnosisClinicIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
//                indexDiagnosisClinicIcd.setClinicId(indexDiagnosisClinic.getId());
//                //门诊诊断编码
//                indexDiagnosisClinicIcd.setDiagnosisIcdcode(zj_BASY_STD.getP281_ICD10_ID9());
//                //门诊诊断名称
//                indexDiagnosisClinicIcd.setDiagnosisIcddesc(zj_BASY_STD.getP281_ICD10_NAME9());
//                indexDiagnosisClinicIcdService.saveIndexDiagnosisClinicIcd(indexDiagnosisClinicIcd);
//            }
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
    public void saveIndexDiagnosisMain(BASY_DIAG_STD zj_BASY_STD,Date visitDate,Date diagnosisDate,BASY_NSTD basy_nstd){
        log.info("保存病案首页主要诊断："+zj_BASY_STD.getUNIQUE_ID());

        if(zj_BASY_STD.getP321()!=null&&zj_BASY_STD.getP322()!=null){
            IndexDiagnosisMain indexDiagnosisMain = new IndexDiagnosisMain();
            indexDiagnosisMain.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
            //标识患者身份唯一标识
            indexDiagnosisMain.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
            //唯一标识
            indexDiagnosisMain.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
            //医疗机构代码
            indexDiagnosisMain.setP900(zj_BASY_STD.getP900());
            //患者id
            if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                indexDiagnosisMain.setPatientId(zj_BASY_STD.getPATIENT_ID());
            }else {
                indexDiagnosisMain.setPatientId(basy_nstd.getDOP3());
            }
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
                indexDiagnosisMainIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisMainIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisMainIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisMainIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexDiagnosisMainIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexDiagnosisMainIcd.setPatientId(basy_nstd.getDOP3());
                }
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
                indexDiagnosisMainIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisMainIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisMainIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisMainIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexDiagnosisMainIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexDiagnosisMainIcd.setPatientId(basy_nstd.getDOP3());
                }
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
                indexDiagnosisMainIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisMainIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisMainIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisMainIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexDiagnosisMainIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexDiagnosisMainIcd.setPatientId(basy_nstd.getDOP3());
                }
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
                indexDiagnosisMainIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisMainIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisMainIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisMainIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexDiagnosisMainIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexDiagnosisMainIcd.setPatientId(basy_nstd.getDOP3());
                }
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
                indexDiagnosisMainIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisMainIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisMainIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisMainIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexDiagnosisMainIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexDiagnosisMainIcd.setPatientId(basy_nstd.getDOP3());
                }
                //住院号
                indexDiagnosisMainIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                indexDiagnosisMainIcd.setMainId(indexDiagnosisMain.getId());
                //主要诊断编码
                indexDiagnosisMainIcd.setDiagnosisIcdcode(zj_BASY_STD.getP322_ICD10_ID5());
                //主要诊断疾病描述
                indexDiagnosisMainIcd.setDiagnosisIcddesc(zj_BASY_STD.getP322_ICD10_NAME5());
                indexDiagnosisMainIcdService.saveIndexDiagnosisMainIcd(indexDiagnosisMainIcd);
            }
            if(zj_BASY_STD.getP322_ICD10_NAME6()!=null&&zj_BASY_STD.getP322_ICD10_ID6()!=null&&!"".equals(zj_BASY_STD.getP322_ICD10_ID6())){
                IndexDiagnosisMainIcd indexDiagnosisMainIcd = new IndexDiagnosisMainIcd();
                indexDiagnosisMainIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisMainIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisMainIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisMainIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexDiagnosisMainIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexDiagnosisMainIcd.setPatientId(basy_nstd.getDOP3());
                }
                //住院号
                indexDiagnosisMainIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                indexDiagnosisMainIcd.setMainId(indexDiagnosisMain.getId());
                //主要诊断编码
                indexDiagnosisMainIcd.setDiagnosisIcdcode(zj_BASY_STD.getP322_ICD10_ID6());
                //主要诊断疾病描述
                indexDiagnosisMainIcd.setDiagnosisIcddesc(zj_BASY_STD.getP322_ICD10_NAME6());
                indexDiagnosisMainIcdService.saveIndexDiagnosisMainIcd(indexDiagnosisMainIcd);
            }
            if(zj_BASY_STD.getP322_ICD10_NAME7()!=null&&zj_BASY_STD.getP322_ICD10_ID7()!=null&&!"".equals(zj_BASY_STD.getP322_ICD10_ID7())){
                IndexDiagnosisMainIcd indexDiagnosisMainIcd = new IndexDiagnosisMainIcd();
                indexDiagnosisMainIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisMainIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisMainIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisMainIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexDiagnosisMainIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexDiagnosisMainIcd.setPatientId(basy_nstd.getDOP3());
                }
                //住院号
                indexDiagnosisMainIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                indexDiagnosisMainIcd.setMainId(indexDiagnosisMain.getId());
                //主要诊断编码
                indexDiagnosisMainIcd.setDiagnosisIcdcode(zj_BASY_STD.getP322_ICD10_ID7());
                //主要诊断疾病描述
                indexDiagnosisMainIcd.setDiagnosisIcddesc(zj_BASY_STD.getP322_ICD10_NAME7());
                indexDiagnosisMainIcdService.saveIndexDiagnosisMainIcd(indexDiagnosisMainIcd);
            }
//            if(zj_BASY_STD.getP322_ICD10_NAME8()!=null&&zj_BASY_STD.getP322_ICD10_ID8()!=null&&!"".equals(zj_BASY_STD.getP322_ICD10_ID8())){
//                IndexDiagnosisMainIcd indexDiagnosisMainIcd = new IndexDiagnosisMainIcd();
//                //标识患者身份唯一标识
//                indexDiagnosisMainIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
//                //唯一标识
//                indexDiagnosisMainIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
//                //医疗机构代码
//                indexDiagnosisMainIcd.setP900(zj_BASY_STD.getP900());
//                //患者id
//                indexDiagnosisMainIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
//                //住院号
//                indexDiagnosisMainIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
//                indexDiagnosisMainIcd.setMainId(indexDiagnosisMain.getId());
//                //主要诊断编码
//                indexDiagnosisMainIcd.setDiagnosisIcdcode(zj_BASY_STD.getP322_ICD10_ID8());
//                //主要诊断疾病描述
//                indexDiagnosisMainIcd.setDiagnosisIcddesc(zj_BASY_STD.getP322_ICD10_NAME8());
//                indexDiagnosisMainIcdService.saveIndexDiagnosisMainIcd(indexDiagnosisMainIcd);
//            }
//            if(zj_BASY_STD.getP322_ICD10_NAME9()!=null&&zj_BASY_STD.getP322_ICD10_ID9()!=null&&!"".equals(zj_BASY_STD.getP322_ICD10_ID9())){
//                IndexDiagnosisMainIcd indexDiagnosisMainIcd = new IndexDiagnosisMainIcd();
//                //标识患者身份唯一标识
//                indexDiagnosisMainIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
//                //唯一标识
//                indexDiagnosisMainIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
//                //医疗机构代码
//                indexDiagnosisMainIcd.setP900(zj_BASY_STD.getP900());
//                //患者id
//                indexDiagnosisMainIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
//                //住院号
//                indexDiagnosisMainIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
//                indexDiagnosisMainIcd.setMainId(indexDiagnosisMain.getId());
//                //主要诊断编码
//                indexDiagnosisMainIcd.setDiagnosisIcdcode(zj_BASY_STD.getP322_ICD10_ID9());
//                //主要诊断疾病描述
//                indexDiagnosisMainIcd.setDiagnosisIcddesc(zj_BASY_STD.getP322_ICD10_NAME9());
//                indexDiagnosisMainIcdService.saveIndexDiagnosisMainIcd(indexDiagnosisMainIcd);
//            }




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
    public void saveIndexDiagnosisOther(BASY_DIAG_STD zj_BASY_STD,Date visitDate,Date diagnosisDate,BASY_NSTD basy_nstd){
        log.info("保存病案首页其他诊断："+zj_BASY_STD.getUNIQUE_ID());

        if(zj_BASY_STD.getP324()!=null&&zj_BASY_STD.getP325()!=null){

            IndexDiagnosisOther indexDiagnosisOther = new IndexDiagnosisOther();
            indexDiagnosisOther.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
            //标识患者身份唯一标识
            indexDiagnosisOther.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
            //唯一标识
            indexDiagnosisOther.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
            //医疗机构代码
            indexDiagnosisOther.setP900(zj_BASY_STD.getP900());
            //患者id
            if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                indexDiagnosisOther.setPatientId(zj_BASY_STD.getPATIENT_ID());
            }else {
                indexDiagnosisOther.setPatientId(basy_nstd.getDOP3());
            }
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
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexDiagnosisOtherIcd.setPatientId(basy_nstd.getDOP3());
                }
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
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexDiagnosisOtherIcd.setPatientId(basy_nstd.getDOP3());
                }
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
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexDiagnosisOtherIcd.setPatientId(basy_nstd.getDOP3());
                }
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
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexDiagnosisOtherIcd.setPatientId(basy_nstd.getDOP3());
                }
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
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexDiagnosisOtherIcd.setPatientId(basy_nstd.getDOP3());
                }
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP325_ICD10_ID5());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP325_ICD10_NAME5());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP325_ICD10_NAME6()!=null&&zj_BASY_STD.getP325_ICD10_ID6()!=null&&!"".equals(zj_BASY_STD.getP325_ICD10_ID6())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexDiagnosisOtherIcd.setPatientId(basy_nstd.getDOP3());
                }
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP325_ICD10_ID6());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP325_ICD10_NAME6());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP325_ICD10_NAME7()!=null&&zj_BASY_STD.getP325_ICD10_ID7()!=null&&!"".equals(zj_BASY_STD.getP325_ICD10_ID7())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexDiagnosisOtherIcd.setPatientId(basy_nstd.getDOP3());
                }
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP325_ICD10_ID7());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP325_ICD10_NAME7());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
//            if(zj_BASY_STD.getP325_ICD10_NAME8()!=null&&zj_BASY_STD.getP325_ICD10_ID8()!=null&&!"".equals(zj_BASY_STD.getP325_ICD10_ID8())){
//                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
//                //标识患者身份唯一标识
//                indexDiagnosisOtherIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
//                //唯一标识
//                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
//                //医疗机构代码
//                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
//                //患者id
//                indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
//                //住院号
//                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
//                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
//                //诊断编码
//                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP325_ICD10_ID8());
//                //诊断疾病描述
//                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP325_ICD10_NAME8());
//                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
//            }
//            if(zj_BASY_STD.getP325_ICD10_NAME9()!=null&&zj_BASY_STD.getP325_ICD10_ID9()!=null&&!"".equals(zj_BASY_STD.getP325_ICD10_ID9())){
//                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
//                //标识患者身份唯一标识
//                indexDiagnosisOtherIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
//                //唯一标识
//                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
//                //医疗机构代码
//                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
//                //患者id
//                indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
//                //住院号
//                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
//                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
//                //诊断编码
//                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP325_ICD10_ID9());
//                //诊断疾病描述
//                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP325_ICD10_NAME9());
//                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
//            }
        }
        if(zj_BASY_STD.getP327()!=null&&zj_BASY_STD.getP328()!=null){

            IndexDiagnosisOther indexDiagnosisOther = new IndexDiagnosisOther();
            indexDiagnosisOther.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
            //标识患者身份唯一标识
            indexDiagnosisOther.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
            //唯一标识
            indexDiagnosisOther.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
            //医疗机构代码
            indexDiagnosisOther.setP900(zj_BASY_STD.getP900());
            //患者id
            if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                indexDiagnosisOther.setPatientId(zj_BASY_STD.getPATIENT_ID());
            }else {
                indexDiagnosisOther.setPatientId(basy_nstd.getDOP3());
            }
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
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexDiagnosisOtherIcd.setPatientId(basy_nstd.getDOP3());
                }
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
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexDiagnosisOtherIcd.setPatientId(basy_nstd.getDOP3());
                }
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
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexDiagnosisOtherIcd.setPatientId(basy_nstd.getDOP3());
                }
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
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexDiagnosisOtherIcd.setPatientId(basy_nstd.getDOP3());
                }
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
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexDiagnosisOtherIcd.setPatientId(basy_nstd.getDOP3());
                }
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
            if(zj_BASY_STD.getP328_ICD10_NAME6()!=null&&zj_BASY_STD.getP328_ICD10_ID6()!=null&&!"".equals(zj_BASY_STD.getP328_ICD10_ID6())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexDiagnosisOtherIcd.setPatientId(basy_nstd.getDOP3());
                }
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP328_ICD10_ID6());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP328_ICD10_NAME6());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP328_ICD10_NAME7()!=null&&zj_BASY_STD.getP328_ICD10_ID7()!=null&&!"".equals(zj_BASY_STD.getP328_ICD10_ID7())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexDiagnosisOtherIcd.setPatientId(basy_nstd.getDOP3());
                }
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP328_ICD10_ID7());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP328_ICD10_NAME7());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
//            if(zj_BASY_STD.getP328_ICD10_NAME8()!=null&&zj_BASY_STD.getP328_ICD10_ID8()!=null&&!"".equals(zj_BASY_STD.getP328_ICD10_ID8())){
//                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
//                //标识患者身份唯一标识
//                indexDiagnosisOtherIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
//                //唯一标识
//                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
//                //医疗机构代码
//                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
//                //患者id
//                indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
//                //住院号
//                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
//                //诊断编码
//                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
//                //诊断编码
//                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP328_ICD10_ID8());
//                //诊断疾病描述
//                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP328_ICD10_NAME8());
//                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
//            }
//            if(zj_BASY_STD.getP328_ICD10_NAME9()!=null&&zj_BASY_STD.getP328_ICD10_ID9()!=null&&!"".equals(zj_BASY_STD.getP328_ICD10_ID9())){
//                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
//                //标识患者身份唯一标识
//                indexDiagnosisOtherIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
//                //唯一标识
//                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
//                //医疗机构代码
//                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
//                //患者id
//                indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
//                //住院号
//                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
//                //诊断编码
//                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
//                //诊断编码
//                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP328_ICD10_ID9());
//                //诊断疾病描述
//                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP328_ICD10_NAME9());
//                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
//            }

        }
        if(zj_BASY_STD.getP3291()!=null&&zj_BASY_STD.getP3292()!=null){

            IndexDiagnosisOther indexDiagnosisOther = new IndexDiagnosisOther();
            indexDiagnosisOther.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
            //标识患者身份唯一标识
            indexDiagnosisOther.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
            //唯一标识
            indexDiagnosisOther.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
            //医疗机构代码
            indexDiagnosisOther.setP900(zj_BASY_STD.getP900());
            //患者id
            if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                indexDiagnosisOther.setPatientId(zj_BASY_STD.getPATIENT_ID());
            }else {
                indexDiagnosisOther.setPatientId(basy_nstd.getDOP3());
            }
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
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexDiagnosisOtherIcd.setPatientId(basy_nstd.getDOP3());
                }
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
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexDiagnosisOtherIcd.setPatientId(basy_nstd.getDOP3());
                }
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
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexDiagnosisOtherIcd.setPatientId(basy_nstd.getDOP3());
                }
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
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexDiagnosisOtherIcd.setPatientId(basy_nstd.getDOP3());
                }
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
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexDiagnosisOtherIcd.setPatientId(basy_nstd.getDOP3());
                }
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
            if(zj_BASY_STD.getP3292_ICD10_NAME6()!=null&&zj_BASY_STD.getP3292_ICD10_ID6()!=null&&!"".equals(zj_BASY_STD.getP3292_ICD10_ID6())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexDiagnosisOtherIcd.setPatientId(basy_nstd.getDOP3());
                }
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3292_ICD10_ID6());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3292_ICD10_NAME6());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3292_ICD10_NAME7()!=null&&zj_BASY_STD.getP3292_ICD10_ID7()!=null&&!"".equals(zj_BASY_STD.getP3292_ICD10_ID7())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexDiagnosisOtherIcd.setPatientId(basy_nstd.getDOP3());
                }
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3292_ICD10_ID7());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3292_ICD10_NAME7());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
//            if(zj_BASY_STD.getP3292_ICD10_NAME8()!=null&&zj_BASY_STD.getP3292_ICD10_ID8()!=null&&!"".equals(zj_BASY_STD.getP3292_ICD10_ID8())){
//                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
//                //标识患者身份唯一标识
//                indexDiagnosisOtherIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
//                //唯一标识
//                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
//                //医疗机构代码
//                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
//                //患者id
//                indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
//                //住院号
//                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
//                //诊断编码
//                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
//                //诊断编码
//                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3292_ICD10_ID8());
//                //诊断疾病描述
//                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3292_ICD10_NAME8());
//                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
//            }
//            if(zj_BASY_STD.getP3292_ICD10_NAME9()!=null&&zj_BASY_STD.getP3292_ICD10_ID9()!=null&&!"".equals(zj_BASY_STD.getP3292_ICD10_ID9())){
//                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
//                //标识患者身份唯一标识
//                indexDiagnosisOtherIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
//                //唯一标识
//                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
//                //医疗机构代码
//                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
//                //患者id
//                indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
//                //住院号
//                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
//                //诊断编码
//                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
//                //诊断编码
//                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3292_ICD10_ID9());
//                //诊断疾病描述
//                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3292_ICD10_NAME9());
//                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
//            }
        }
        if(zj_BASY_STD.getP3294()!=null&&zj_BASY_STD.getP3295()!=null){

            IndexDiagnosisOther indexDiagnosisOther = new IndexDiagnosisOther();
            indexDiagnosisOther.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
            //标识患者身份唯一标识
            indexDiagnosisOther.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
            //唯一标识
            indexDiagnosisOther.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
            //医疗机构代码
            indexDiagnosisOther.setP900(zj_BASY_STD.getP900());
            //患者id
            if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                indexDiagnosisOther.setPatientId(zj_BASY_STD.getPATIENT_ID());
            }else {
                indexDiagnosisOther.setPatientId(basy_nstd.getDOP3());
            }
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
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexDiagnosisOtherIcd.setPatientId(basy_nstd.getDOP3());
                }
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
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexDiagnosisOtherIcd.setPatientId(basy_nstd.getDOP3());
                }
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
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexDiagnosisOtherIcd.setPatientId(basy_nstd.getDOP3());
                }
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
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexDiagnosisOtherIcd.setPatientId(basy_nstd.getDOP3());
                }
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
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexDiagnosisOtherIcd.setPatientId(basy_nstd.getDOP3());
                }
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
            if(zj_BASY_STD.getP3295_ICD10_NAME6()!=null&&zj_BASY_STD.getP3295_ICD10_ID6()!=null&&!"".equals(zj_BASY_STD.getP3295_ICD10_ID6())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexDiagnosisOtherIcd.setPatientId(basy_nstd.getDOP3());
                }
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3295_ICD10_ID6());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3295_ICD10_NAME6());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3295_ICD10_NAME7()!=null&&zj_BASY_STD.getP3295_ICD10_ID7()!=null&&!"".equals(zj_BASY_STD.getP3295_ICD10_ID7())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexDiagnosisOtherIcd.setPatientId(basy_nstd.getDOP3());
                }
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3295_ICD10_ID7());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3295_ICD10_NAME7());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
//            if(zj_BASY_STD.getP3295_ICD10_NAME8()!=null&&zj_BASY_STD.getP3295_ICD10_ID8()!=null&&!"".equals(zj_BASY_STD.getP3295_ICD10_ID8())){
//                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
//                //标识患者身份唯一标识
//                indexDiagnosisOtherIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
//                //唯一标识
//                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
//                //医疗机构代码
//                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
//                //患者id
//                indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
//                //住院号
//                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
//                //诊断编码
//                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
//                //诊断编码
//                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3295_ICD10_ID8());
//                //诊断疾病描述
//                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3295_ICD10_NAME8());
//                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
//            }
//            if(zj_BASY_STD.getP3295_ICD10_NAME9()!=null&&zj_BASY_STD.getP3295_ICD10_ID9()!=null&&!"".equals(zj_BASY_STD.getP3295_ICD10_ID9())){
//                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
//                //标识患者身份唯一标识
//                indexDiagnosisOtherIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
//                //唯一标识
//                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
//                //医疗机构代码
//                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
//                //患者id
//                indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
//                //住院号
//                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
//                //诊断编码
//                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
//                //诊断编码
//                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3295_ICD10_ID9());
//                //诊断疾病描述
//                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3295_ICD10_NAME9());
//                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
//            }
        }
        if(zj_BASY_STD.getP3297()!=null&&zj_BASY_STD.getP3298()!=null){

            IndexDiagnosisOther indexDiagnosisOther = new IndexDiagnosisOther();
            indexDiagnosisOther.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
            //标识患者身份唯一标识
            indexDiagnosisOther.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
            //唯一标识
            indexDiagnosisOther.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
            //医疗机构代码
            indexDiagnosisOther.setP900(zj_BASY_STD.getP900());
            //患者id
            if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                indexDiagnosisOther.setPatientId(zj_BASY_STD.getPATIENT_ID());
            }else {
                indexDiagnosisOther.setPatientId(basy_nstd.getDOP3());
            }
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
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexDiagnosisOtherIcd.setPatientId(basy_nstd.getDOP3());
                }
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
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexDiagnosisOtherIcd.setPatientId(basy_nstd.getDOP3());
                }
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
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexDiagnosisOtherIcd.setPatientId(basy_nstd.getDOP3());
                }
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
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexDiagnosisOtherIcd.setPatientId(basy_nstd.getDOP3());
                }
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
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexDiagnosisOtherIcd.setPatientId(basy_nstd.getDOP3());
                }
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
            if(zj_BASY_STD.getP3298_ICD10_NAME6()!=null&&zj_BASY_STD.getP3298_ICD10_ID6()!=null&&!"".equals(zj_BASY_STD.getP3298_ICD10_ID6())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexDiagnosisOtherIcd.setPatientId(basy_nstd.getDOP3());
                }
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3298_ICD10_ID6());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3298_ICD10_NAME6());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3298_ICD10_NAME7()!=null&&zj_BASY_STD.getP3298_ICD10_ID7()!=null&&!"".equals(zj_BASY_STD.getP3298_ICD10_ID7())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexDiagnosisOtherIcd.setPatientId(basy_nstd.getDOP3());
                }
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3298_ICD10_ID7());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3298_ICD10_NAME7());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
//            if(zj_BASY_STD.getP3298_ICD10_NAME8()!=null&&zj_BASY_STD.getP3298_ICD10_ID8()!=null&&!"".equals(zj_BASY_STD.getP3298_ICD10_ID8())){
//                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
//                //标识患者身份唯一标识
//                indexDiagnosisOtherIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
//                //唯一标识
//                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
//                //医疗机构代码
//                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
//                //患者id
//                indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
//                //住院号
//                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
//                //诊断编码
//                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
//                //诊断编码
//                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3298_ICD10_ID8());
//                //诊断疾病描述
//                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3298_ICD10_NAME8());
//                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
//            }
//            if(zj_BASY_STD.getP3298_ICD10_NAME9()!=null&&zj_BASY_STD.getP3298_ICD10_ID9()!=null&&!"".equals(zj_BASY_STD.getP3298_ICD10_ID9())){
//                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
//                //标识患者身份唯一标识
//                indexDiagnosisOtherIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
//                //唯一标识
//                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
//                //医疗机构代码
//                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
//                //患者id
//                indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
//                //住院号
//                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
//                //诊断编码
//                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
//                //诊断编码
//                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3298_ICD10_ID9());
//                //诊断疾病描述
//                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3298_ICD10_NAME9());
//                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
//            }

        }
        if(zj_BASY_STD.getP3281()!=null&&zj_BASY_STD.getP3282()!=null){
            IndexDiagnosisOther indexDiagnosisOther = new IndexDiagnosisOther();
            indexDiagnosisOther.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
            //标识患者身份唯一标识
            indexDiagnosisOther.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
            //唯一标识
            indexDiagnosisOther.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
            //医疗机构代码
            indexDiagnosisOther.setP900(zj_BASY_STD.getP900());
            //患者id
            if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                indexDiagnosisOther.setPatientId(zj_BASY_STD.getPATIENT_ID());
            }else {
                indexDiagnosisOther.setPatientId(basy_nstd.getDOP3());
            }
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
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexDiagnosisOtherIcd.setPatientId(basy_nstd.getDOP3());
                }
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
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexDiagnosisOtherIcd.setPatientId(basy_nstd.getDOP3());
                }
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
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexDiagnosisOtherIcd.setPatientId(basy_nstd.getDOP3());
                }
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
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexDiagnosisOtherIcd.setPatientId(basy_nstd.getDOP3());
                }
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
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexDiagnosisOtherIcd.setPatientId(basy_nstd.getDOP3());
                }
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
            if(zj_BASY_STD.getP3282_ICD10_NAME5()!=null&&zj_BASY_STD.getP3282_ICD10_ID5()!=null&&!"".equals(zj_BASY_STD.getP3282_ICD10_ID5())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexDiagnosisOtherIcd.setPatientId(basy_nstd.getDOP3());
                }
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
            indexDiagnosisOther.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
            //标识患者身份唯一标识
            indexDiagnosisOther.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
            //唯一标识
            indexDiagnosisOther.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
            //医疗机构代码
            indexDiagnosisOther.setP900(zj_BASY_STD.getP900());
            //患者id
            if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                indexDiagnosisOther.setPatientId(zj_BASY_STD.getPATIENT_ID());
            }else {
                indexDiagnosisOther.setPatientId(basy_nstd.getDOP3());
            }
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
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexDiagnosisOtherIcd.setPatientId(basy_nstd.getDOP3());
                }
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
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexDiagnosisOtherIcd.setPatientId(basy_nstd.getDOP3());
                }
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
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexDiagnosisOtherIcd.setPatientId(basy_nstd.getDOP3());
                }
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
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexDiagnosisOtherIcd.setPatientId(basy_nstd.getDOP3());
                }
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
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexDiagnosisOtherIcd.setPatientId(basy_nstd.getDOP3());
                }
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
            if(zj_BASY_STD.getP3285_ICD10_NAME6()!=null&&zj_BASY_STD.getP3285_ICD10_ID6()!=null&&!"".equals(zj_BASY_STD.getP3285_ICD10_ID6())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexDiagnosisOtherIcd.setPatientId(basy_nstd.getDOP3());
                }
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3285_ICD10_ID6());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3285_ICD10_NAME6());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3285_ICD10_NAME7()!=null&&zj_BASY_STD.getP3285_ICD10_ID7()!=null&&!"".equals(zj_BASY_STD.getP3285_ICD10_ID7())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexDiagnosisOtherIcd.setPatientId(basy_nstd.getDOP3());
                }
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3285_ICD10_ID7());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3285_ICD10_NAME7());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
//            if(zj_BASY_STD.getP3285_ICD10_NAME8()!=null&&zj_BASY_STD.getP3285_ICD10_ID8()!=null&&!"".equals(zj_BASY_STD.getP3285_ICD10_ID8())){
//                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
//                //标识患者身份唯一标识
//                indexDiagnosisOtherIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
//                //唯一标识
//                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
//                //医疗机构代码
//                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
//                //患者id
//                indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
//                //住院号
//                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
//                //诊断编码
//                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
//                //诊断编码
//                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3285_ICD10_ID8());
//                //诊断疾病描述
//                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3285_ICD10_NAME8());
//                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
//            }
//            if(zj_BASY_STD.getP3285_ICD10_NAME9()!=null&&zj_BASY_STD.getP3285_ICD10_ID9()!=null&&!"".equals(zj_BASY_STD.getP3285_ICD10_ID9())){
//                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
//                //标识患者身份唯一标识
//                indexDiagnosisOtherIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
//                //唯一标识
//                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
//                //医疗机构代码
//                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
//                //患者id
//                indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
//                //住院号
//                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
//                //诊断编码
//                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
//                //诊断编码
//                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3285_ICD10_ID9());
//                //诊断疾病描述
//                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3285_ICD10_NAME9());
//                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
//            }
        }
        if(zj_BASY_STD.getP3287()!=null&&zj_BASY_STD.getP3288()!=null){

            IndexDiagnosisOther indexDiagnosisOther = new IndexDiagnosisOther();
            indexDiagnosisOther.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
            //标识患者身份唯一标识
            indexDiagnosisOther.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
            //唯一标识
            indexDiagnosisOther.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
            //医疗机构代码
            indexDiagnosisOther.setP900(zj_BASY_STD.getP900());
            //患者id
            if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                indexDiagnosisOther.setPatientId(zj_BASY_STD.getPATIENT_ID());
            }else {
                indexDiagnosisOther.setPatientId(basy_nstd.getDOP3());
            }
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
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexDiagnosisOtherIcd.setPatientId(basy_nstd.getDOP3());
                }
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
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexDiagnosisOtherIcd.setPatientId(basy_nstd.getDOP3());
                }
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
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexDiagnosisOtherIcd.setPatientId(basy_nstd.getDOP3());
                }
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
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexDiagnosisOtherIcd.setPatientId(basy_nstd.getDOP3());
                }
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
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexDiagnosisOtherIcd.setPatientId(basy_nstd.getDOP3());
                }
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
            if(zj_BASY_STD.getP3288_ICD10_NAME6()!=null&&zj_BASY_STD.getP3288_ICD10_ID6()!=null&&!"".equals(zj_BASY_STD.getP3288_ICD10_ID6())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexDiagnosisOtherIcd.setPatientId(basy_nstd.getDOP3());
                }
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3288_ICD10_ID6());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3288_ICD10_NAME6());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3288_ICD10_NAME7()!=null&&zj_BASY_STD.getP3288_ICD10_ID7()!=null&&!"".equals(zj_BASY_STD.getP3288_ICD10_ID7())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexDiagnosisOtherIcd.setPatientId(basy_nstd.getDOP3());
                }
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3288_ICD10_ID7());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3288_ICD10_NAME7());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
//            if(zj_BASY_STD.getP3288_ICD10_NAME8()!=null&&zj_BASY_STD.getP3288_ICD10_ID8()!=null&&!"".equals(zj_BASY_STD.getP3288_ICD10_ID8())){
//                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
//                //标识患者身份唯一标识
//                indexDiagnosisOtherIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
//                //唯一标识
//                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
//                //医疗机构代码
//                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
//                //患者id
//                indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
//                //住院号
//                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
//                //诊断编码
//                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
//                //诊断编码
//                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3288_ICD10_ID8());
//                //诊断疾病描述
//                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3288_ICD10_NAME8());
//                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
//            }
//            if(zj_BASY_STD.getP3288_ICD10_NAME9()!=null&&zj_BASY_STD.getP3288_ICD10_ID9()!=null&&!"".equals(zj_BASY_STD.getP3288_ICD10_ID9())){
//                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
//                //标识患者身份唯一标识
//                indexDiagnosisOtherIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
//                //唯一标识
//                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
//                //医疗机构代码
//                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
//                //患者id
//                indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
//                //住院号
//                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
//                //诊断编码
//                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
//                //诊断编码
//                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3288_ICD10_ID9());
//                //诊断疾病描述
//                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3288_ICD10_NAME9());
//                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
//            }


        }
        if(zj_BASY_STD.getP3271()!=null&&zj_BASY_STD.getP3272()!=null){
            IndexDiagnosisOther indexDiagnosisOther = new IndexDiagnosisOther();
            indexDiagnosisOther.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
            //标识患者身份唯一标识
            indexDiagnosisOther.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
            //唯一标识
            indexDiagnosisOther.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
            //医疗机构代码
            indexDiagnosisOther.setP900(zj_BASY_STD.getP900());
            //患者id
            if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                indexDiagnosisOther.setPatientId(zj_BASY_STD.getPATIENT_ID());
            }else {
                indexDiagnosisOther.setPatientId(basy_nstd.getDOP3());
            }
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
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexDiagnosisOtherIcd.setPatientId(basy_nstd.getDOP3());
                }
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
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexDiagnosisOtherIcd.setPatientId(basy_nstd.getDOP3());
                }
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
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexDiagnosisOtherIcd.setPatientId(basy_nstd.getDOP3());
                }
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
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexDiagnosisOtherIcd.setPatientId(basy_nstd.getDOP3());
                }
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
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexDiagnosisOtherIcd.setPatientId(basy_nstd.getDOP3());
                }
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
            if(zj_BASY_STD.getP3272_ICD10_NAME6()!=null&&zj_BASY_STD.getP3272_ICD10_ID6()!=null&&!"".equals(zj_BASY_STD.getP3272_ICD10_ID6())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexDiagnosisOtherIcd.setPatientId(basy_nstd.getDOP3());
                }
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3272_ICD10_ID6());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3272_ICD10_NAME6());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3272_ICD10_NAME7()!=null&&zj_BASY_STD.getP3272_ICD10_ID7()!=null&&!"".equals(zj_BASY_STD.getP3272_ICD10_ID7())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexDiagnosisOtherIcd.setPatientId(basy_nstd.getDOP3());
                }
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3272_ICD10_ID7());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3272_ICD10_NAME7());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
//            if(zj_BASY_STD.getP3272_ICD10_NAME8()!=null&&zj_BASY_STD.getP3272_ICD10_ID8()!=null&&!"".equals(zj_BASY_STD.getP3272_ICD10_ID8())){
//                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
//                //标识患者身份唯一标识
//                indexDiagnosisOtherIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
//                //唯一标识
//                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
//                //医疗机构代码
//                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
//                //患者id
//                indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
//                //住院号
//                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
//                //诊断编码
//                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
//                //诊断编码
//                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3272_ICD10_ID8());
//                //诊断疾病描述
//                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3272_ICD10_NAME8());
//                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
//            }
//            if(zj_BASY_STD.getP3272_ICD10_NAME9()!=null&&zj_BASY_STD.getP3272_ICD10_ID9()!=null&&!"".equals(zj_BASY_STD.getP3272_ICD10_ID9())){
//                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
//                //标识患者身份唯一标识
//                indexDiagnosisOtherIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
//                //唯一标识
//                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
//                //医疗机构代码
//                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
//                //患者id
//                indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
//                //住院号
//                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
//                //诊断编码
//                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
//                //诊断编码
//                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3272_ICD10_ID9());
//                //诊断疾病描述
//                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3272_ICD10_NAME9());
//                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
//            }

        }
        if(zj_BASY_STD.getP3274()!=null&&zj_BASY_STD.getP3275()!=null){
            IndexDiagnosisOther indexDiagnosisOther = new IndexDiagnosisOther();
            indexDiagnosisOther.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
            //标识患者身份唯一标识
            indexDiagnosisOther.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
            //唯一标识
            indexDiagnosisOther.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
            //医疗机构代码
            indexDiagnosisOther.setP900(zj_BASY_STD.getP900());
            //患者id
            if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                indexDiagnosisOther.setPatientId(zj_BASY_STD.getPATIENT_ID());
            }else {
                indexDiagnosisOther.setPatientId(basy_nstd.getDOP3());
            }
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
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexDiagnosisOtherIcd.setPatientId(basy_nstd.getDOP3());
                }
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
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexDiagnosisOtherIcd.setPatientId(basy_nstd.getDOP3());
                }
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
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexDiagnosisOtherIcd.setPatientId(basy_nstd.getDOP3());
                }
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
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexDiagnosisOtherIcd.setPatientId(basy_nstd.getDOP3());
                }
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
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexDiagnosisOtherIcd.setPatientId(basy_nstd.getDOP3());
                }
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
            if(zj_BASY_STD.getP3275_ICD10_NAME6()!=null&&zj_BASY_STD.getP3275_ICD10_ID6()!=null&&!"".equals(zj_BASY_STD.getP3275_ICD10_ID6())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexDiagnosisOtherIcd.setPatientId(basy_nstd.getDOP3());
                }
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3275_ICD10_ID6());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3275_ICD10_NAME6());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3275_ICD10_NAME7()!=null&&zj_BASY_STD.getP3275_ICD10_ID7()!=null&&!"".equals(zj_BASY_STD.getP3275_ICD10_ID7())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexDiagnosisOtherIcd.setPatientId(basy_nstd.getDOP3());
                }
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3275_ICD10_ID7());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3275_ICD10_NAME7());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
//            if(zj_BASY_STD.getP3275_ICD10_NAME8()!=null&&zj_BASY_STD.getP3275_ICD10_ID8()!=null&&!"".equals(zj_BASY_STD.getP3275_ICD10_ID8())){
//                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
//                //标识患者身份唯一标识
//                indexDiagnosisOtherIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
//                //唯一标识
//                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
//                //医疗机构代码
//                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
//                //患者id
//                indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
//                //住院号
//                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
//                //诊断编码
//                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
//                //诊断编码
//                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3275_ICD10_ID8());
//                //诊断疾病描述
//                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3275_ICD10_NAME8());
//                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
//            }
//            if(zj_BASY_STD.getP3275_ICD10_NAME9()!=null&&zj_BASY_STD.getP3275_ICD10_ID9()!=null&&!"".equals(zj_BASY_STD.getP3275_ICD10_ID9())){
//                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
//                //标识患者身份唯一标识
//                indexDiagnosisOtherIcd.setPersonId(zj_BASY_STD.getUNIQUE_ID_LV1());
//                //唯一标识
//                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID_LV2());
//                //医疗机构代码
//                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
//                //患者id
//                indexDiagnosisOtherIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
//                //住院号
//                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
//                //诊断编码
//                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
//                //诊断编码
//                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3275_ICD10_ID9());
//                //诊断疾病描述
//                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3275_ICD10_NAME9());
//                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
//            }

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
            indexIcu.setUniqueId(zj_BASY_NSTD.getUNIQUE_ID());
            //标识患者身份唯一标识
            indexIcu.setUniqueIdLv1(zj_BASY_NSTD.getUNIQUE_ID_LV1());
            //唯一标识
            indexIcu.setUniqueIdLv2(zj_BASY_NSTD.getUNIQUE_ID_LV2());
            //医疗机构代码
            indexIcu.setP900(zj_BASY_NSTD.getP900());
            //患者id
            if (zj_BASY_NSTD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_NSTD.getPATIENT_ID())){
                indexIcu.setPatientId(zj_BASY_NSTD.getPATIENT_ID());
            }else {
                indexIcu.setPatientId(zj_BASY_NSTD.getDOP3());
            }
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

            indexIcu.setUniqueId(zj_BASY_NSTD.getUNIQUE_ID());
            //标识患者身份唯一标识
            indexIcu.setUniqueIdLv1(zj_BASY_NSTD.getUNIQUE_ID_LV1());
            //唯一标识
            indexIcu.setUniqueIdLv2(zj_BASY_NSTD.getUNIQUE_ID_LV2());
            //医疗机构代码
            indexIcu.setP900(zj_BASY_NSTD.getP900());
            //患者id
            if (zj_BASY_NSTD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_NSTD.getPATIENT_ID())){
                indexIcu.setPatientId(zj_BASY_NSTD.getPATIENT_ID());
            }else {
                indexIcu.setPatientId(zj_BASY_NSTD.getDOP3());
            }
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

            indexIcu.setUniqueId(zj_BASY_NSTD.getUNIQUE_ID());
            //标识患者身份唯一标识
            indexIcu.setUniqueIdLv1(zj_BASY_NSTD.getUNIQUE_ID_LV1());
            //唯一标识
            indexIcu.setUniqueIdLv2(zj_BASY_NSTD.getUNIQUE_ID_LV2());
            //医疗机构代码
            indexIcu.setP900(zj_BASY_NSTD.getP900());
            //患者id
            if (zj_BASY_NSTD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_NSTD.getPATIENT_ID())){
                indexIcu.setPatientId(zj_BASY_NSTD.getPATIENT_ID());
            }else {
                indexIcu.setPatientId(zj_BASY_NSTD.getDOP3());
            }
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

            indexIcu.setUniqueId(zj_BASY_NSTD.getUNIQUE_ID());
            //标识患者身份唯一标识
            indexIcu.setUniqueIdLv1(zj_BASY_NSTD.getUNIQUE_ID_LV1());
            //唯一标识
            indexIcu.setUniqueIdLv2(zj_BASY_NSTD.getUNIQUE_ID_LV2());
            //医疗机构代码
            indexIcu.setP900(zj_BASY_NSTD.getP900());
            //患者id
            if (zj_BASY_NSTD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_NSTD.getPATIENT_ID())){
                indexIcu.setPatientId(zj_BASY_NSTD.getPATIENT_ID());
            }else {
                indexIcu.setPatientId(zj_BASY_NSTD.getDOP3());
            }
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

            indexIcu.setUniqueId(zj_BASY_NSTD.getUNIQUE_ID());
            //标识患者身份唯一标识
            indexIcu.setUniqueIdLv1(zj_BASY_NSTD.getUNIQUE_ID_LV1());
            //唯一标识
            indexIcu.setUniqueIdLv2(zj_BASY_NSTD.getUNIQUE_ID_LV2());
            //医疗机构代码
            indexIcu.setP900(zj_BASY_NSTD.getP900());
            //患者id
            if (zj_BASY_NSTD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_NSTD.getPATIENT_ID())){
                indexIcu.setPatientId(zj_BASY_NSTD.getPATIENT_ID());
            }else {
                indexIcu.setPatientId(zj_BASY_NSTD.getDOP3());
            }
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
    public void saveIndexPathology(BASY_DIAG_STD zj_BASY_STD,Date visitDate,Date diagnosisDate,BASY_NSTD basy_nstd){
        log.info("保存病案首页病理诊断："+zj_BASY_STD.getUNIQUE_ID());

        if(zj_BASY_STD.getP351()!=null&&zj_BASY_STD.getP352()!=null){

            IndexPathology indexPathology = new IndexPathology();
            indexPathology.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
            //标识患者身份唯一标识
            indexPathology.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
            //唯一标识
            indexPathology.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
            //医疗机构代码
            indexPathology.setP900(zj_BASY_STD.getP900());
            //患者id
            indexPathology.setPatientId(zj_BASY_STD.getPATIENT_ID());
            //住院号
            if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                indexPathology.setPatientId(zj_BASY_STD.getPATIENT_ID());
            }else {
                indexPathology.setPatientId(basy_nstd.getDOP3());
            }
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
                indexPathologyIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexPathologyIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexPathologyIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexPathologyIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexPathologyIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexPathologyIcd.setPatientId(basy_nstd.getDOP3());
                }
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
                indexPathologyIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexPathologyIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexPathologyIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexPathologyIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexPathologyIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexPathologyIcd.setPatientId(basy_nstd.getDOP3());
                }
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
                indexPathologyIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexPathologyIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexPathologyIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexPathologyIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexPathologyIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexPathologyIcd.setPatientId(basy_nstd.getDOP3());
                }
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
        }


        if(zj_BASY_STD.getP353()!=null&&zj_BASY_STD.getP354()!=null){

            IndexPathology indexPathology = new IndexPathology();
            indexPathology.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
            //标识患者身份唯一标识
            indexPathology.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
            //唯一标识
            indexPathology.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
            //医疗机构代码
            indexPathology.setP900(zj_BASY_STD.getP900());
            //患者id
            if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                indexPathology.setPatientId(zj_BASY_STD.getPATIENT_ID());
            }else {
                indexPathology.setPatientId(basy_nstd.getDOP3());
            }
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
                indexPathologyIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexPathologyIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexPathologyIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexPathologyIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexPathologyIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexPathologyIcd.setPatientId(basy_nstd.getDOP3());
                }
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
                indexPathologyIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexPathologyIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexPathologyIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexPathologyIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexPathologyIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexPathologyIcd.setPatientId(basy_nstd.getDOP3());
                }
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
                indexPathologyIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexPathologyIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexPathologyIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexPathologyIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexPathologyIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexPathologyIcd.setPatientId(basy_nstd.getDOP3());
                }
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



        }

        if(zj_BASY_STD.getP355()!=null&&zj_BASY_STD.getP356()!=null){

            IndexPathology indexPathology = new IndexPathology();
            indexPathology.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
            //标识患者身份唯一标识
            indexPathology.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
            //唯一标识
            indexPathology.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
            //医疗机构代码
            indexPathology.setP900(zj_BASY_STD.getP900());
            //患者id
            if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                indexPathology.setPatientId(zj_BASY_STD.getPATIENT_ID());
            }else {
                indexPathology.setPatientId(basy_nstd.getDOP3());
            }
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
                indexPathologyIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexPathologyIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexPathologyIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexPathologyIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexPathologyIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexPathologyIcd.setPatientId(basy_nstd.getDOP3());
                }
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
                indexPathologyIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexPathologyIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexPathologyIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexPathologyIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexPathologyIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexPathologyIcd.setPatientId(basy_nstd.getDOP3());
                }
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
                indexPathologyIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexPathologyIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexPathologyIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexPathologyIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                    indexPathologyIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                }else {
                    indexPathologyIcd.setPatientId(basy_nstd.getDOP3());
                }
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
    public void saveIndexInjury(BASY_DIAG_STD zj_BASY_STD,BASY_NSTD basy_nstd){
        log.info("保存病案首页中毒损伤："+zj_BASY_STD.getUNIQUE_ID());
        if(zj_BASY_STD.getP362()!=null&&!"".equals(zj_BASY_STD.getP362())){
            IndexInjury indexInjury = new IndexInjury();
            indexInjury.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
            //标识患者身份唯一标识
            indexInjury.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
            //唯一标识
            indexInjury.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
            //医疗机构代码
            indexInjury.setP900(zj_BASY_STD.getP900());
            //患者id
            if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                indexInjury.setPatientId(zj_BASY_STD.getPATIENT_ID());
            }else {
                indexInjury.setPatientId(basy_nstd.getDOP3());
            }
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
            indexInjury.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
            //标识患者身份唯一标识
            indexInjury.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
            //唯一标识
            indexInjury.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
            //医疗机构代码
            indexInjury.setP900(zj_BASY_STD.getP900());
            //患者id
            if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                indexInjury.setPatientId(zj_BASY_STD.getPATIENT_ID());
            }else {
                indexInjury.setPatientId(basy_nstd.getDOP3());
            }
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
            indexInjury.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
            //标识患者身份唯一标识
            indexInjury.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
            //唯一标识
            indexInjury.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
            //医疗机构代码
            indexInjury.setP900(zj_BASY_STD.getP900());
            //患者id
            if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
                indexInjury.setPatientId(zj_BASY_STD.getPATIENT_ID());
            }else {
                indexInjury.setPatientId(basy_nstd.getDOP3());
            }
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
        indexPerson.setUniqueId(zj_BASY_NSTD.getUNIQUE_ID());
        //标识患者身份唯一标识
        indexPerson.setUniqueIdLv1(zj_BASY_NSTD.getUNIQUE_ID_LV1());
        //唯一标识
        indexPerson.setUniqueIdLv2(zj_BASY_NSTD.getUNIQUE_ID_LV2());
        //患者ID
        if (zj_BASY_STD.getPATIENT_ID()!=null&&!"".equals(zj_BASY_STD.getPATIENT_ID())){
            indexPerson.setPatientId(zj_BASY_STD.getPATIENT_ID());
        }else {
            indexPerson.setPatientId(zj_BASY_NSTD.getDOP3());
        }
        //住院号
        indexPerson.setVisitId(zj_BASY_NSTD.getVISIT_ID());
        //医疗机构代码
        indexPerson.setP900(zj_BASY_NSTD.getP900());
        //机构名称
        indexPerson.setP6891(zj_BASY_NSTD.getP6891());
        //医疗保险手册（卡）号
        indexPerson.setP686(zj_BASY_NSTD.getP686());
        //健康卡号
        indexPerson.setP800("─".equals(zj_BASY_NSTD.getP800()) ? null : zj_BASY_NSTD.getP800());
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
        indexPerson.setP103("─".equals(zj_BASY_NSTD.getP103()) ? null : zj_BASY_NSTD.getP103());
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
        indexPerson.setP16("─".equals(zj_BASY_NSTD.getP16()) ? null : zj_BASY_NSTD.getP16());
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
    public void saveInpAdmissionStatus(TEM_INP_ADMISSION_STATUS zj_TEM_INP_ADMISSION_STATUS){
        TemInpAdmissionStatus temInpAdmissionStatus = new TemInpAdmissionStatus();
        //标识患者身份唯一标识
        temInpAdmissionStatus.setUniqueIdLv1(zj_TEM_INP_ADMISSION_STATUS.getunique_id_lv1());
        //唯一标识
        temInpAdmissionStatus.setUniqueIdLv2(zj_TEM_INP_ADMISSION_STATUS.getunique_id_lv2());
        //中间库unique_id
        temInpAdmissionStatus.setUniqueId(zj_TEM_INP_ADMISSION_STATUS.getunique_id());
        //医疗机构代码
        temInpAdmissionStatus.setP900(zj_TEM_INP_ADMISSION_STATUS.getp900());
        //患者id
        temInpAdmissionStatus.setPatientId(zj_TEM_INP_ADMISSION_STATUS.getpatient_id());
        //住院号
        temInpAdmissionStatus.setVisitId(zj_TEM_INP_ADMISSION_STATUS.getvisit_id());
        //病房号
        temInpAdmissionStatus.setRoomNo(zj_TEM_INP_ADMISSION_STATUS.getroom_no());
        //病床号
        temInpAdmissionStatus.setBedNo(zj_TEM_INP_ADMISSION_STATUS.getbed_no());
        //活动记录状态
        temInpAdmissionStatus.setRecordStatus(zj_TEM_INP_ADMISSION_STATUS.getrecord_status());
        //就诊类型
        temInpAdmissionStatus.setVisitType(zj_TEM_INP_ADMISSION_STATUS.getvisit_type());
        //科室名称
        temInpAdmissionStatus.setDepartmentName(zj_TEM_INP_ADMISSION_STATUS.getdepartment_name());
        //病区
        temInpAdmissionStatus.setInpatientArea(zj_TEM_INP_ADMISSION_STATUS.getinpatient_area());
        //病人姓名
        temInpAdmissionStatus.setTpatname(zj_TEM_INP_ADMISSION_STATUS.gettpatname());
        //就诊时间
        temInpAdmissionStatus.setAdmissionDateTime(zj_TEM_INP_ADMISSION_STATUS.getadmission_date_time());
        //住院次数
        temInpAdmissionStatus.setAdmissionNumber(zj_TEM_INP_ADMISSION_STATUS.getadmission_number());
        //病案号
        temInpAdmissionStatus.setTpatno(zj_TEM_INP_ADMISSION_STATUS.gettpatno());
        //临床初步诊断
        temInpAdmissionStatus.setPreliminaryClinicalDiagnosis(zj_TEM_INP_ADMISSION_STATUS.getpreliminary_clinical_diagnosis());
        //临床初步诊断日期
        temInpAdmissionStatus.setPreliminaryDiagnosisDate(zj_TEM_INP_ADMISSION_STATUS.getpreliminary_diagnosis_date());
        //医生签名_初步诊断
        temInpAdmissionStatus.setDoctorPreliminaryDiagnosis(zj_TEM_INP_ADMISSION_STATUS.getdoctor_preliminary_diagnosis());
        //临床确定诊断
        temInpAdmissionStatus.setClinicalDefiniteDiagnosis(zj_TEM_INP_ADMISSION_STATUS.getclinical_definite_diagnosis());
        //临床确定诊断日期
        temInpAdmissionStatus.setDefiniteDiagnosisDate(zj_TEM_INP_ADMISSION_STATUS.getdefinite_diagnosis_date());
        //医生签名_确定诊断
        temInpAdmissionStatus.setDoctorDefiniteDiagnosis(zj_TEM_INP_ADMISSION_STATUS.getdoctor_definite_diagnosis());
        //现病史
        temInpAdmissionStatus.setHyPresent(zj_TEM_INP_ADMISSION_STATUS.gethy_present());
        //既往史
        temInpAdmissionStatus.setHyPats(zj_TEM_INP_ADMISSION_STATUS.gethy_pats());
        //个人史
        temInpAdmissionStatus.setHyIndividual(zj_TEM_INP_ADMISSION_STATUS.gethy_individual());
        //月经史
        temInpAdmissionStatus.setMenstrualHistorySta(zj_TEM_INP_ADMISSION_STATUS.getmenstrual_history_sta());
        //身高
        temInpAdmissionStatus.setByHeight(zj_TEM_INP_ADMISSION_STATUS.getby_height());
        //体重
        temInpAdmissionStatus.setByWeight(zj_TEM_INP_ADMISSION_STATUS.getby_weight());
        //肥胖
        temInpAdmissionStatus.setFat("");
        //体表面积
        temInpAdmissionStatus.setBySurfaceArea(zj_TEM_INP_ADMISSION_STATUS.getby_surface_area());
        //ecog_whops评分
        temInpAdmissionStatus.setTEcogWhops(zj_TEM_INP_ADMISSION_STATUS.gett_ecog_whops());
        //kps评分
        temInpAdmissionStatus.setTKps(zj_TEM_INP_ADMISSION_STATUS.gett_kps());
        //疼痛评分_nrs法
        temInpAdmissionStatus.setTNrs(zj_TEM_INP_ADMISSION_STATUS.gett_nrs());
        //家族史
        temInpAdmissionStatus.setHyFamily(zj_TEM_INP_ADMISSION_STATUS.gethy_family());
        //体格检查
        temInpAdmissionStatus.setPhysicalExam(zj_TEM_INP_ADMISSION_STATUS.getphysical_exam());
        //主诉
        temInpAdmissionStatus.setChiefComplaint(zj_TEM_INP_ADMISSION_STATUS.getchief_complaint());
        //专科检查
        temInpAdmissionStatus.setSpecialityExam(zj_TEM_INP_ADMISSION_STATUS.getspeciality_exam());
        //辅助检查
        temInpAdmissionStatus.setSupplementaryExam(zj_TEM_INP_ADMISSION_STATUS.getsupplementary_exam());
        //婚姻状况
        temInpAdmissionStatus.setMarriage(zj_TEM_INP_ADMISSION_STATUS.getmarriage());
        //性别
        temInpAdmissionStatus.setSex(zj_TEM_INP_ADMISSION_STATUS.getsex());
        //年龄
        temInpAdmissionStatus.setAge(zj_TEM_INP_ADMISSION_STATUS.getage());
        //民族
        temInpAdmissionStatus.setNation(zj_TEM_INP_ADMISSION_STATUS.getnation());
        //职业
        temInpAdmissionStatus.setOccupation(zj_TEM_INP_ADMISSION_STATUS.getoccupation());
        //记录时间
        temInpAdmissionStatus.setRecordTime(zj_TEM_INP_ADMISSION_STATUS.getrecord_time());
        //病史陈述者
        temInpAdmissionStatus.setMedicalHistoryNarrator(zj_TEM_INP_ADMISSION_STATUS.getmedical_history_narrator());
        //患者病史陈述者与患者关系
        temInpAdmissionStatus.setRelationshipBetweenPatient(zj_TEM_INP_ADMISSION_STATUS.getrelationship_between_patient());
        //婚育史
        temInpAdmissionStatus.setHistoryOfMarrChild(zj_TEM_INP_ADMISSION_STATUS.gethistory_of_marr_child());
        //哺乳史
        temInpAdmissionStatus.setReproductiveHistory(zj_TEM_INP_ADMISSION_STATUS.getreproductive_history());
        //过敏史
        temInpAdmissionStatus.setAllergyHistory(zj_TEM_INP_ADMISSION_STATUS.getallergy_history());
        //暴露史
        temInpAdmissionStatus.setExposureHistory(zj_TEM_INP_ADMISSION_STATUS.getexposure_history());
        //母孕史
        temInpAdmissionStatus.setMotherFertileHistory(zj_TEM_INP_ADMISSION_STATUS.getmother_fertile_history());
        //修正诊断
        temInpAdmissionStatus.setCorrectDiagnosis(zj_TEM_INP_ADMISSION_STATUS.getcorrect_diagnosis());
        //修正诊断时间
        temInpAdmissionStatus.setCorrectDiagnosisTime(zj_TEM_INP_ADMISSION_STATUS.getcorrect_diagnosis_time());
        //修正诊断医师签名
        temInpAdmissionStatus.setCorrectDiagnosisDoctor(zj_TEM_INP_ADMISSION_STATUS.getcorrect_diagnosis_doctor());
        //补充诊断
        temInpAdmissionStatus.setSupDiagnosis(zj_TEM_INP_ADMISSION_STATUS.getsup_diagnosis());
        //补充诊断时间
        temInpAdmissionStatus.setSupDiagnosisTime(zj_TEM_INP_ADMISSION_STATUS.getsup_diagnosis_time());
        //补充诊断医师签名
        temInpAdmissionStatus.setSupDiagnosisDoctor(zj_TEM_INP_ADMISSION_STATUS.getsup_diagnosis_doctor());
        //病历小结
        temInpAdmissionStatus.setRecordSummary(zj_TEM_INP_ADMISSION_STATUS.getrecord_summary());
        //数据版本
        temInpAdmissionStatus.setDataVersion(zj_TEM_INP_ADMISSION_STATUS.getdata_version());
        //数据库来源
        temInpAdmissionStatus.setDataDbSource(zj_TEM_INP_ADMISSION_STATUS.getdata_db_source());
        //数据表来源
        temInpAdmissionStatus.setDataTableSource(zj_TEM_INP_ADMISSION_STATUS.getdata_table_source());
        //数据项来源
        temInpAdmissionStatus.setDataFieldSource(zj_TEM_INP_ADMISSION_STATUS.getdata_field_source());
        //创建时间
        temInpAdmissionStatus.setCreatedAt(zj_TEM_INP_ADMISSION_STATUS.getcreated_at());
        //创建人
        temInpAdmissionStatus.setCreator(zj_TEM_INP_ADMISSION_STATUS.getcreator());
        //修改时间
        temInpAdmissionStatus.setUpdatedAt(zj_TEM_INP_ADMISSION_STATUS.getupdated_at());
        temInpAdmissionStatusService.saveTemInpAdmissionStatus(temInpAdmissionStatus);
    }


//    public void savePersonGeneral(List<NURSING_RECORD> zj_NURSING_RECORD,List<VITAL_RECORD> zj_VITAL_RECORD,
//                                  List<PHYSICAL_EXAM_PARA>  zj_physical_exam_para){
//        //体温map，数据来自体温单
//        DateFormat format1=new SimpleDateFormat("yyyy-MM-dd");
//        Map<String,String> vitalMap=new HashMap<>();
//        if(zj_VITAL_RECORD!=null&&zj_VITAL_RECORD.size()>0){
//            for(VITAL_RECORD vital_record:zj_VITAL_RECORD){
//                if(vital_record.getEXAM_TIME()!=null&&vital_record.getEXAM_RESULT()!=null){
//                    String date= format1.format( vital_record.getEXAM_TIME());
//                    vitalMap.put(date,vital_record.getEXAM_RESULT());
//                }
//            }
//        }
//        //体格检查map
//        DateFormat format2=new SimpleDateFormat("yyyy-MM-dd");
//        Map<String,String> phyMap=new HashMap<>();
//        if(zj_physical_exam_para!=null&&zj_physical_exam_para.size()>0){
//            for(PHYSICAL_EXAM_PARA physical_exam_para:zj_physical_exam_para){
//                if(physical_exam_para.getrecord_time()!=null&&physical_exam_para.getpara_value()!=null){
//                    String date= format2.format(physical_exam_para.getrecord_time());
//                    phyMap.put(date+"-"+physical_exam_para.getparameter(),physical_exam_para.getpara_value());
//                }
//            }
//        }
//
//
//
//
//        for(NURSING_RECORD nursing_record:zj_NURSING_RECORD){
//            PersonGeneral personGeneral = new PersonGeneral();
//            log.info("保存患者一般情况"+nursing_record.getUNIQUE_ID_LV2());
//            personGeneral.setUniqueId(nursing_record.getUNIQUE_ID());
//            //标识患者身份唯一标识
//            personGeneral.setUniqueIdLv1(nursing_record.getUNIQUE_ID_LV1());
//            //唯一标识
//            personGeneral.setUniqueIdLv2(nursing_record.getUNIQUE_ID_LV2());
//            //医疗机构代码
//            personGeneral.setP900(nursing_record.getP900());
//            //患者id
//            personGeneral.setPatientId(nursing_record.getPATIENT_ID());
//            //住院号
//            personGeneral.setVisitId(nursing_record.getVISIT_ID());
//            //日期
//            personGeneral.setRecordTime(nursing_record.getRECORD_TIME());
//            //if(nursing_record!=null&&nursing_record.getBREATHING_FREQUENCY()!=null&&nursing_record.getSYSTOLIC_BLOOD_PRESSURE()!=null&&nursing_record.getDIASTOLIC_BLOOD_PRESSURE()!=null){
//
//            //呼吸频率
//            if(nursing_record!=null&&nursing_record.getBREATHING_FREQUENCY()!=null){
//                try {
//                    Integer temp = Integer.parseInt(nursing_record.getBREATHING_FREQUENCY());
//                    personGeneral.setBreathingFrequency(temp);
//                }catch (Exception e1){
//                    if (personGeneral.getBreathingFrequency()==null){
//                        try {
//                            Integer temp = Integer.parseInt(phyMap.get(personGeneral.getRecordTime()+"-"+"呼吸"));
//                            personGeneral.setBreathingFrequency(temp);
//                        }catch (Exception e2){
//
//                        }
//                    }
//                }
//            }else {
//                if (personGeneral.getBreathingFrequency()==null){
//                    try {
//                        Integer temp = Integer.parseInt(phyMap.get(personGeneral.getRecordTime()+"-"+"呼吸"));
//                        personGeneral.setBreathingFrequency(temp);
//                    }catch (Exception e2){
//
//                    }
//                }
//            }
//
//            //脉搏
//            if(nursing_record!=null&&nursing_record.getPULSE()!=null){
//                try {
//                    Integer temp = Integer.parseInt(nursing_record.getPULSE());
//                    personGeneral.setHeartRate(temp);
//                }catch (Exception e1){
//                    if (personGeneral.getHeartRate()==null){
//                        try {
//                            Integer temp = Integer.parseInt(phyMap.get(personGeneral.getRecordTime()+"-"+"脉搏"));
//                            personGeneral.setHeartRate(temp);
//                        }catch (Exception e2){
//
//                        }
//                    }
//                }
//            }else {
//                try {
//                    Integer temp = Integer.parseInt(phyMap.get(personGeneral.getRecordTime()+"-"+"脉搏"));
//                    personGeneral.setHeartRate(temp);
//                }catch (Exception e2){
//
//                }
//            }
//
//            //体温
//            if(nursing_record!=null&&nursing_record.getBODY_TEMPERATURE()!=null){
//                try {
//                    Double temp = Double.parseDouble(nursing_record.getBODY_TEMPERATURE());
//                    personGeneral.setBodyTemperature(temp);
//                }catch (Exception e){
//                    if (personGeneral.getBodyTemperature()==null){
//                        try {
//                            Double temp = Double.parseDouble(vitalMap.get(personGeneral.getRecordTime()));
//                            personGeneral.setBodyTemperature(temp);
//                        }catch (Exception e2){
//                            Double temp = Double.parseDouble(phyMap.get(personGeneral.getRecordTime()+"-"+"体温"));
//                            personGeneral.setBodyTemperature(temp);
//                        }
//                    }
//                }
//            }else {
//                if (personGeneral.getBodyTemperature()==null){
//                    try {
//                        Double temp = Double.parseDouble(vitalMap.get(personGeneral.getRecordTime()));
//                        personGeneral.setBodyTemperature(temp);
//                    }catch (Exception e2){
//                        Double temp = Double.parseDouble(phyMap.get(personGeneral.getRecordTime()+"-"+"体温"));
//                        personGeneral.setBodyTemperature(temp);
//                    }
//                }
//            }
//
//            //血压
//            //舒张压(低压)，收缩压(高压)
//            int lowInt=-1;
//            int highInt =-1;
//            if(nursing_record!=null&&nursing_record.getDIASTOLIC_BLOOD_PRESSURE()!=null){
//                String lowPressure = nursing_record.getDIASTOLIC_BLOOD_PRESSURE();
//                String[] lowPressures=lowPressure.split("/");
//                if (lowPressures.length==2){
//                    String highString = lowPressures[0];
//                    String lowString = lowPressures[1];
//                    try{
//                        lowInt = Integer.parseInt(lowString);
//                        highInt = Integer.parseInt(highString);
//                    }catch (Exception e){
//                        try {
//                            lowInt = Integer.parseInt(phyMap.get(personGeneral.getRecordTime()+"-"+"舒张压"));
//                            highInt = Integer.parseInt(phyMap.get(personGeneral.getRecordTime()+"-"+"收缩压"));
//                        }catch (Exception exception){
//
//                        }
//                    }
//                }
//            }else {
//                lowInt = Integer.parseInt(phyMap.get(personGeneral.getRecordTime()+"-"+"舒张压"));
//                highInt = Integer.parseInt(phyMap.get(personGeneral.getRecordTime()+"-"+"收缩压"));
//            }
//
//            if (lowInt>highInt){
//                int temp;
//                temp = lowInt;
//                lowInt = highInt;
//                highInt = lowInt;
//            }
//            if (lowInt>=0&&lowInt<300&&highInt>=0&&highInt<300){
//                personGeneral.setDiastolicBloodPressure(lowInt);
//                personGeneral.setSystolicBloodPressure(highInt);
//            }
//
//            personGeneralService.savePersonGeneral(personGeneral);
//
//        }
//    }

//    public void savePersonGeneral(List<NURSING_RECORD> zj_NURSING_RECORD,List<VITAL_RECORD> zj_VITAL_RECORD){
//
//        DateFormat format=new SimpleDateFormat("yyyy-MM-dd");
//        Map<String,String> map=new HashMap<>();
//        if(zj_VITAL_RECORD!=null&&zj_VITAL_RECORD.size()>0){
//            for(VITAL_RECORD vital_record:zj_VITAL_RECORD){
//                if(vital_record.getEXAM_TIME()!=null&&vital_record.getEXAM_RESULT()!=null){
//                    String date= format.format( vital_record.getEXAM_TIME());
//                    map.put(date,vital_record.getEXAM_RESULT());
//                }
//
//            }
//        }
//        if (zj_NURSING_RECORD.size()!=0&&zj_NURSING_RECORD.get(0).getNURSE_SIGNATURE_TIME()!=null){
//            for(NURSING_RECORD nursing_record:zj_NURSING_RECORD){
//                PersonGeneral personGeneral = new PersonGeneral();
//                log.info("保存患者一般情况"+nursing_record.getUNIQUE_ID_LV2());
//                personGeneral.setUniqueId(nursing_record.getUNIQUE_ID());
//                //标识患者身份唯一标识
//                personGeneral.setUniqueIdLv1(nursing_record.getUNIQUE_ID_LV1());
//                //唯一标识
//                personGeneral.setUniqueIdLv2(nursing_record.getUNIQUE_ID_LV2());
//                //医疗机构代码
//                personGeneral.setP900(nursing_record.getP900());
//                //患者id
//                personGeneral.setPatientId(nursing_record.getPATIENT_ID());
//                //住院号
//                personGeneral.setVisitId(nursing_record.getVISIT_ID());
//                //日期
//                personGeneral.setRecordTime(nursing_record.getNURSE_SIGNATURE_TIME());
////                if (zj_VITAL_RECORD.size()!=0){
////                    log.info("保存患者一般情况"+zj_VITAL_RECORD.get(0).getUNIQUE_ID_LV2());
////                    personGeneral.setUniqueId(nursing_record.getUNIQUE_ID());
////                    //标识患者身份唯一标识
////                    personGeneral.setUniqueIdLv1(zj_VITAL_RECORD.get(0).getUNIQUE_ID_LV1());
////                    //唯一标识
////                    personGeneral.setUniqueIdLv2(zj_VITAL_RECORD.get(0).getUNIQUE_ID_LV2());
////                    //医疗机构代码
////                    personGeneral.setP900(zj_VITAL_RECORD.get(0).getP900());
////                    //患者id
////                    personGeneral.setPatientId(zj_VITAL_RECORD.get(0).getPATIENT_ID());
////                    //住院号
////                    personGeneral.setVisitId(zj_VITAL_RECORD.get(0).getVISIT_ID());
////                    //日期
////                    personGeneral.setRecordTime(nursing_record.getNURSE_SIGNATURE_TIME());
////                }
//                if(nursing_record!=null&&nursing_record.getNURSE_SIGNATURE_TIME()!=null){
//
//                    //体温
//                    try {
//                        Double temp = Double.parseDouble(nursing_record.getBODY_TEMPERATURE());
//                        personGeneral.setBodyTemperature(temp);
//                    }catch (Exception e){
//                        if (nursing_record.getNURSE_SIGNATURE_TIME()!=null){
//                            String date =format.format(nursing_record.getNURSE_SIGNATURE_TIME());
//                            String temperature=  map.get(date);
//                            try{
//                                Double temp = Double.parseDouble(temperature);
//                                personGeneral.setBodyTemperature(temp);
//                            }catch (Exception e1){
//                            }
//                        }
//                    }
//
//                    //呼吸
//                    try {
//                        Integer temp = Integer.parseInt(nursing_record.getBREATHING_FREQUENCY());
//                        personGeneral.setBreathingFrequency(temp);
//                    }catch (Exception e){
//
//                    }
//
//                    //脉搏
//                    try {
//                        Integer temp = Integer.parseInt(nursing_record.getPULSE());
//                        personGeneral.setHeartRate(temp);
//                    }catch (Exception e){
//
//                    }
//
//                    personGeneral.setRecordTime(nursing_record.getNURSE_SIGNATURE_TIME());
//
//                    //舒张压(低压)，收缩压(高压)
//                    String lowPressure = nursing_record.getDIASTOLIC_BLOOD_PRESSURE();
//                    if (lowPressure==null){
//                        lowPressure = "";
//                    }
//                    String[] lowPressures=lowPressure.split("/");
//                    int lowInt=-1;
//                    int highInt =-1;
//                    if (lowPressures.length==2){
//                        String highString = lowPressures[0];
//                        String lowString = lowPressures[1];
//
//                        try{
//                            lowInt = Integer.parseInt(lowString);
//                            highInt = Integer.parseInt(highString);
//                        }catch (Exception e){
//                        }
//                        if (lowInt>highInt){
//                            int temp;
//                            temp = lowInt;
//                            lowInt = highInt;
//                            highInt = lowInt;
//                        }
//                        if (lowInt>=0&&lowInt<300&&highInt>=0&&highInt<300){
//                            personGeneral.setDiastolicBloodPressure(lowInt);
//                            personGeneral.setSystolicBloodPressure(highInt);
//                        }
//                    }else {
//                    }
//                    personGeneralService.savePersonGeneral(personGeneral);
//                }
//
//            }
//        }else if (zj_NURSING_RECORD.size()!=0&&zj_NURSING_RECORD.get(0).getRECORD_TIME()!=null){
//            log.info("保存患者一般情况"+zj_NURSING_RECORD.get(0).getUNIQUE_ID_LV2());
//            PersonGeneral personGeneral = new PersonGeneral();
//            personGeneral.setUniqueId(zj_NURSING_RECORD.get(0).getUNIQUE_ID());
//            //标识患者身份唯一标识
//            personGeneral.setUniqueIdLv1(zj_NURSING_RECORD.get(0).getUNIQUE_ID_LV1());
//            //唯一标识
//            personGeneral.setUniqueIdLv2(zj_NURSING_RECORD.get(0).getUNIQUE_ID_LV2());
//            //医疗机构代码
//            personGeneral.setP900(zj_NURSING_RECORD.get(0).getP900());
//            //患者id
//            personGeneral.setPatientId(zj_NURSING_RECORD.get(0).getPATIENT_ID());
//            //住院号
//            personGeneral.setVisitId(zj_NURSING_RECORD.get(0).getVISIT_ID());
//            //日期
//            personGeneral.setRecordTime(zj_NURSING_RECORD.get(0).getRECORD_TIME());
//
//            for(NURSING_RECORD nursing_record:zj_NURSING_RECORD){
//                if (personGeneral.getBreathingFrequency()==null&&nursing_record.getBREATHING_FREQUENCY()!=null&&!nursing_record.getBREATHING_FREQUENCY().equals("")){
//                    try {
//                        Integer temp = Integer.parseInt(nursing_record.getBREATHING_FREQUENCY());
//                        personGeneral.setBreathingFrequency(temp);
//                    }catch (Exception e){
//
//                    }
//                }
//                if (personGeneral.getHeartRate()==null&&nursing_record.getPULSE()!=null&&!nursing_record.getPULSE().equals("")){
//                    try {
//                        Integer temp1 = Integer.parseInt(nursing_record.getPULSE());
//                        personGeneral.setHeartRate(temp1);
//                    }catch (Exception e){
//
//                    }
//
//                }
//                if (personGeneral.getBodyTemperature()==null&&nursing_record.getBODY_TEMPERATURE()!=null&&!nursing_record.getBODY_TEMPERATURE().equals("")){
//                    try {
//                        Double temp = Double.parseDouble(nursing_record.getBODY_TEMPERATURE());
//                        personGeneral.setBodyTemperature(temp);
//                    }catch (Exception e){
//
//                    }
//                }else {
//                    String date =format.format(nursing_record.getRECORD_TIME());
//                    String temperature=  map.get(date);
//                    if (temperature!=null){
//                        try{
//                            Double temp = Double.parseDouble(temperature);
//                            personGeneral.setBodyTemperature(temp);
//                        }catch (Exception e1){
//                        }
//                    }
//                }
//                if (personGeneral.getDiastolicBloodPressure()==null&&nursing_record.getDIASTOLIC_BLOOD_PRESSURE()!=null&&!nursing_record.getDIASTOLIC_BLOOD_PRESSURE().equals("")){
//                    try {
//                        Integer temp2 = Integer.parseInt(nursing_record.getDIASTOLIC_BLOOD_PRESSURE());
//                        personGeneral.setDiastolicBloodPressure(temp2);
//                    }catch (Exception e){
//
//                    }
//                }
//                if (personGeneral.getSystolicBloodPressure()==null&&nursing_record.getSYSTOLIC_BLOOD_PRESSURE()!=null&&!nursing_record.getSYSTOLIC_BLOOD_PRESSURE().equals("")){
//                    try {
//                        Integer temp2 = Integer.parseInt(nursing_record.getSYSTOLIC_BLOOD_PRESSURE());
//                        personGeneral.setSystolicBloodPressure(temp2);
//                    }catch (Exception e){
//
//                    }
//
//                }
//            }
//            personGeneralService.savePersonGeneral(personGeneral);
//        }
//
//
//    }

//    public void saveSymptom(List<SYMP_PRESENT> zj_SYMPTOMS, List<SPECIALITY_EXAM> speciality_exams){
//        log.info("保存症状体征："+zj_SYMPTOMS.get(0).getunique_id());
//
//        Symptom symptom = new Symptom();
//        //标识患者身份唯一标识
//        symptom.setUniqueId(zj_SYMPTOMS.get(0).getunique_id());
//        //唯一标识
//        symptom.setUniqueIdLv1(zj_SYMPTOMS.get(0).getunique_id_lv1());
//        symptom.setUniqueIdLv2(zj_SYMPTOMS.get(0).getunique_id_lv2());
//        //医疗机构代码
//        symptom.setP900(zj_SYMPTOMS.get(0).getp900());
//        //患者id
//        symptom.setPatientId(zj_SYMPTOMS.get(0).getpatient_id());
//        //门诊/住院号
//        symptom.setVisitId(zj_SYMPTOMS.get(0).getvisit_id());
//
//        Set<String> set = new HashSet<>();
//
//        for (SYMP_PRESENT symp_present:zj_SYMPTOMS
//             ) {
//            if (symp_present.getneg()==null||symp_present.getneg().equals("")){
//                if (symp_present.getfinding1_std()!=null&&!symp_present.getfinding1_std().equals("")){
//                    set.add(symp_present.getfinding1_std());
//                }
//                if (symp_present.getfinding2_std()!=null&&!symp_present.getfinding2_std().equals("")){
//                    set.add(symp_present.getfinding2_std());
//                }
//                if (symp_present.getfinding3_std()!=null&&!symp_present.getfinding3_std().equals("")){
//                    set.add(symp_present.getfinding3_std());
//                }
//                if (symp_present.getfinding4_std()!=null&&!symp_present.getfinding4_std().equals("")){
//                    set.add(symp_present.getfinding4_std());
//                }
//                if (symp_present.getfinding5_std()!=null&&!symp_present.getfinding5_std().equals("")){
//                    set.add(symp_present.getfinding5_std());
//                }
//                if (symp_present.getfinding6_std()!=null&&!symp_present.getfinding6_std().equals("")){
//                    set.add(symp_present.getfinding6_std());
//                }
//            }
//        }
//        String s = set.stream().reduce("", (a, b) -> a + b + ",");
//        if (s.endsWith(",")){
//            s = s.substring(0, s.length() - 1);
//        }
//        symptom.setSymptoms(s);
//
//        for (SPECIALITY_EXAM sp:speciality_exams
//             ) {
//            //左上肢肌力
//            if ("肌力".equals(sp.getforce_entity_std())){
//                List<String> list = Arrays.asList(
//                    "左上肢", "左侧上肢","双上肢前臂肌群","双上肢上臂肌群","双上肢","上肢","左侧肢体","四肢","肢体", "双侧肢体","两侧肢体"
//                );
//                int i = containsStructure(list, sp.getstructure1_std(), sp.getstructure2_std(), sp.getstructure3_std());
//                if (i != -1) {
//                    StringBuilder sb = new StringBuilder();
//                    sb.append(i == 0 ? sp.getstructure1_std() : i == 1 ? sp.getstructure2_std() : i == 2 ? sp.getstructure3_std() : "");
//                    sb.append(sp.getforce_entity_std());
//                    if (sp.getpara_value_std()!=null){
//                        sb.append(sp.getpara_value_std());
//                    }
//                    symptom.setLeftUpMuscle(sb.toString());
//                }
//            }
//            //左下肢肌力
//            if ("肌力".equals(sp.getforce_entity_std())){
//                List<String> list = Arrays.asList(
//                        "左下肢", "左侧肢体","双下肢肌群","双下肢","双下肢肌群","下肢","四肢","肢体","双侧肢体", "两侧肢体"
//                );
//                int i = containsStructure(list, sp.getstructure1_std(), sp.getstructure2_std(), sp.getstructure3_std());
//                if (i != -1) {
//                    StringBuilder sb = new StringBuilder();
//                    sb.append(i == 0 ? sp.getstructure1_std() : i == 1 ? sp.getstructure2_std() : i == 2 ? sp.getstructure3_std() : "");
//                    sb.append(sp.getforce_entity_std());
//                    if (sp.getpara_value_std()!=null){
//                        sb.append(sp.getpara_value_std());
//                    }
//                    symptom.setLeftDownMuscle(sb.toString());
//                }
//            }
//            //右上肢肌力
//            if ("肌力".equals(sp.getforce_entity_std())){
//                List<String> list = Arrays.asList(
//                        "右上肢", "双上肢前臂肌群","双上肢上臂肌群","双上肢","上肢","右侧肢体","四肢","肢体","双侧肢体", "两侧肢体"
//                );
//                int i = containsStructure(list, sp.getstructure1_std(), sp.getstructure2_std(), sp.getstructure3_std());
//                if (i != -1) {
//                    StringBuilder sb = new StringBuilder();
//                    sb.append(i == 0 ? sp.getstructure1_std() : i == 1 ? sp.getstructure2_std() : i == 2 ? sp.getstructure3_std() : "");
//                    sb.append(sp.getforce_entity_std());
//                    if (sp.getpara_value_std()!=null){
//                        sb.append(sp.getpara_value_std());
//                    }
//                    symptom.setRightUpMuscle(sb.toString());
//                }
//            }
//            //右下肢肌力
//            if ("肌力".equals(sp.getforce_entity_std())){
//                List<String> list = Arrays.asList(
//                        "右下肢", "右侧肢体","双下肢肌群","双下肢","双下肢肌群","下肢","四肢","肢体","双侧肢体", "两侧肢体"
//                );
//                int i = containsStructure(list, sp.getstructure1_std(), sp.getstructure2_std(), sp.getstructure3_std());
//                if (i != -1) {
//                    StringBuilder sb = new StringBuilder();
//                    sb.append(i == 0 ? sp.getstructure1_std() : i == 1 ? sp.getstructure2_std() : i == 2 ? sp.getstructure3_std() : "");
//                    sb.append(sp.getforce_entity_std());
//                    if (sp.getpara_value_std()!=null){
//                        sb.append(sp.getpara_value_std());
//                    }
//                    symptom.setRightDownMuscle(sb.toString());
//                }
//            }
//
//
//
//            //左上肢肌张力
//            if ("肌张力".equals(sp.gettension_entity_std())){
//                List<String> list = Arrays.asList(
//                        "左上肢", "左侧上肢","双上肢前臂肌群","双上肢上臂肌群","双上肢","上肢","左侧肢体","四肢","肢体", "双侧肢体","两侧肢体"
//                );
//                int i = containsStructure(list, sp.getstructure1_std(), sp.getstructure2_std(), sp.getstructure3_std());
//                if (i != -1) {
//                    StringBuilder sb = new StringBuilder();
//                    sb.append(i == 0 ? sp.getstructure1_std() : i == 1 ? sp.getstructure2_std() : i == 2 ? sp.getstructure3_std() : "");
//                    sb.append(sp.gettension_entity_std());
//                    if (sp.getpara_value_std()!=null){
//                        sb.append(sp.getpara_value_std());
//                    }
//                    symptom.setLeftUpMuscleTone(sb.toString());
//                }
//            }
//            //左下肢肌张力
//            if ("肌张力".equals(sp.gettension_entity_std())){
//                List<String> list = Arrays.asList(
//                        "左下肢", "左侧肢体","双下肢肌群","双下肢","双下肢肌群","下肢","四肢","肢体","双侧肢体", "两侧肢体"
//                );
//                int i = containsStructure(list, sp.getstructure1_std(), sp.getstructure2_std(), sp.getstructure3_std());
//                if (i != -1) {
//                    StringBuilder sb = new StringBuilder();
//                    sb.append(i == 0 ? sp.getstructure1_std() : i == 1 ? sp.getstructure2_std() : i == 2 ? sp.getstructure3_std() : "");
//                    sb.append(sp.gettension_entity_std());
//                    if (sp.getpara_value_std()!=null){
//                        sb.append(sp.getpara_value_std());
//                    }
//                    symptom.setLeftDownMuscleTone(sb.toString());
//                }
//            }
//            //右上肢肌张力
//            if ("肌张力".equals(sp.gettension_entity_std())){
//                List<String> list = Arrays.asList(
//                        "右上肢", "双上肢前臂肌群","双上肢上臂肌群","双上肢","上肢","右侧肢体","四肢","肢体","双侧肢体", "两侧肢体"
//                );
//                int i = containsStructure(list, sp.getstructure1_std(), sp.getstructure2_std(), sp.getstructure3_std());
//                if (i != -1) {
//                    StringBuilder sb = new StringBuilder();
//                    sb.append(i == 0 ? sp.getstructure1_std() : i == 1 ? sp.getstructure2_std() : i == 2 ? sp.getstructure3_std() : "");
//                    sb.append(sp.gettension_entity_std());
//                    if (sp.getpara_value_std()!=null){
//                        sb.append(sp.getpara_value_std());
//                    }
//                    symptom.setRightUpMuscleTone(sb.toString());
//                }
//            }
//            //右下肢肌张力
//            if ("肌张力".equals(sp.gettension_entity_std())){
//                List<String> list = Arrays.asList(
//                        "右下肢", "右侧肢体","双下肢肌群","双下肢","双下肢肌群","下肢","四肢","肢体","双侧肢体", "两侧肢体"
//                );
//                int i = containsStructure(list, sp.getstructure1_std(), sp.getstructure2_std(), sp.getstructure3_std());
//                if (i != -1) {
//                    StringBuilder sb = new StringBuilder();
//                    sb.append(i == 0 ? sp.getstructure1_std() : i == 1 ? sp.getstructure2_std() : i == 2 ? sp.getstructure3_std() : "");
//                    sb.append(sp.gettension_entity_std());
//                    if (sp.getpara_value_std()!=null){
//                        sb.append(sp.getpara_value_std());
//                    }
//                    symptom.setRightDownMuscleTone(sb.toString());
//                }
//            }
//
//        }
//        symptomService.saveSymptom(symptom);
//    }

    private int containsStructure(List<String> list, String... string){
        if (string.length==0){
            return -1;
        }else {
            for (int i = 0; i < string.length; i++) {
                if (list.contains(string[i])){
                    return i;
                }
            }
        }
        return -1;
    }


//    public void saveHisPerson(List<SMOKE_AND_DRINK> zj_SMOKE_AND_DRINK){
//        log.info("保存个人史："+zj_SMOKE_AND_DRINK.get(0).getunique_id());
//
//        HisPerson hisPerson = new HisPerson();
//        //唯一标识
//        hisPerson.setUniqueId(zj_SMOKE_AND_DRINK.get(0).getunique_id());
//        hisPerson.setUniqueIdLv1(zj_SMOKE_AND_DRINK.get(0).getunique_id_lv1());
//        hisPerson.setUniqueIdLv2(zj_SMOKE_AND_DRINK.get(0).getunique_id_lv2());
//        //医疗机构代码
//        hisPerson.setP900(zj_SMOKE_AND_DRINK.get(0).getp900());
//        //患者id
//        hisPerson.setPatientId(zj_SMOKE_AND_DRINK.get(0).getpatient_id());
//        //住院号
//        hisPerson.setVisitId(zj_SMOKE_AND_DRINK.get(0).getvisit_id());
//
////        if(zj_TEM_INP_ADMISSION_STATUS!=null){
////            BigDecimal wight=new BigDecimal(zj_TEM_INP_ADMISSION_STATUS.get(0).getby_weight());
////            BigDecimal height=new BigDecimal(zj_TEM_INP_ADMISSION_STATUS.get(0).getby_height());
////
////            if(wight!=null&&height!=null){
////                BigDecimal fat=   wight.divide((height.multiply(height)));
////                //肥胖
////                hisPerson.(fat.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());
////
////                Double area=((0.61*height.doubleValue())+((0.0128*wight.doubleValue()))-0.1529);
////
////                //体表面积
////                hisPerson.setBodyarea(area);
////
////            }
////
////        }
//        for(SMOKE_AND_DRINK smoke_and_drink: zj_SMOKE_AND_DRINK){
//            //吸烟
//            if (smoke_and_drink.getsmoker_std() != null && !smoke_and_drink.getsmoker_std().equals("")) {
//                hisPerson.setSmoke(smoke_and_drink.getsmoker_std());
//            }
//            if (smoke_and_drink.getyear_of_smoke_std() != null && !smoke_and_drink.getyear_of_smoke_std().equals("")
//                &&!smoke_and_drink.getyear_of_smoke_std().equals("无效")) {
//                hisPerson.setSmokeYear(smoke_and_drink.getyear_of_smoke_std());
//            }
//            if (smoke_and_drink.getconsumption_smoke_std() != null && !smoke_and_drink.getconsumption_smoke_std().equals("")
//                &&!smoke_and_drink.getconsumption_smoke_std().equals("无效")) {
//                hisPerson.setDailySmoke(smoke_and_drink.getconsumption_smoke_std()
//                        + smoke_and_drink.getconsumption_smoke_unit_std()==null?"":smoke_and_drink.getconsumption_smoke_unit_std()
//                        + smoke_and_drink.getsmoke_freq_std()==null?"": smoke_and_drink.getsmoke_freq_std()
//                        + smoke_and_drink.getsmoke_freq_unit_std()==null?"":smoke_and_drink.getsmoke_freq_unit_std());
//            }
//            if (smoke_and_drink.getsmoke_quitter_std() != null && !smoke_and_drink.getsmoke_quitter_std().equals("")) {
//                hisPerson.setStopSmoke(smoke_and_drink.getsmoke_quitter_std());
//            }
//            if (smoke_and_drink.getyear_of_smoke_q_std() != null && !smoke_and_drink.getyear_of_smoke_q_std().equals("")
//                    && !smoke_and_drink.getyear_of_smoke_q_std().equals("无效")) {
//                hisPerson.setStopSmokeYear(smoke_and_drink.getyear_of_smoke_q_std());
//            }
//
//            //饮酒
//            if (smoke_and_drink.getdrinker_std() != null && !smoke_and_drink.getdrinker_std().equals("")) {
//                hisPerson.setDrink(smoke_and_drink.getdrinker_std());
//            }
//            if (smoke_and_drink.getyear_of_drink_std() != null && !smoke_and_drink.getyear_of_drink_std().equals("")
//                &&!smoke_and_drink.getyear_of_drink_std().equals("无效")) {
//                hisPerson.setDrinkYear(smoke_and_drink.getyear_of_drink_std());
//            }
//            StringBuilder stringBuilder = new StringBuilder();
//            if (smoke_and_drink.getconsumption_drink_std() != null && !smoke_and_drink.getconsumption_drink_std().equals("")) {
//                stringBuilder
//                        .append(smoke_and_drink.getdrink_type_std() == null ? "" : smoke_and_drink.getdrink_type_std())
//                        .append(smoke_and_drink.getconsumption_drink_std() == null ? "" : smoke_and_drink.getconsumption_drink_std())
//                        .append(smoke_and_drink.getconsumption_drink_unit_std() == null ? "" : smoke_and_drink.getconsumption_drink_unit_std())
//                        .append(smoke_and_drink.getdrink_freq_std() == null ? "" : smoke_and_drink.getdrink_freq_std())
//                        .append(smoke_and_drink.getdrink_freq_unit_std() == null ? "" : smoke_and_drink.getdrink_freq_unit_std());
//            }
//
////            if (smoke_and_drink.getconsumption_drink1_std() != null && !smoke_and_drink.getconsumption_drink1_std().equals("")) {
////                stringBuilder
////                        .append(smoke_and_drink.getdrink_type1_std()==null?"":smoke_and_drink.getdrink_type1_std())
////                        .append(smoke_and_drink.getconsumption_drink1_std()==null?"":smoke_and_drink.getconsumption_drink1_std())
////                        .append(smoke_and_drink.getconsumption_drink_unit1_std()==null?"":smoke_and_drink.getconsumption_drink_unit1_std())
////                        .append(smoke_and_drink.getdrink_freq1_std()==null?"":smoke_and_drink.getdrink_freq1_std())
////                        .append(smoke_and_drink.getdrink_freq_unit1_std()==null?"":smoke_and_drink.getdrink_freq_unit1_std());
////                if (smoke_and_drink.getconsumption_drink2_std() != null && !smoke_and_drink.getconsumption_drink2_std().equals("")){
////                    stringBuilder
////                            .append(",")
////                            .append(smoke_and_drink.getdrink_type2_std()==null?"":smoke_and_drink.getdrink_type2_std())
////                            .append(smoke_and_drink.getconsumption_drink2_std()==null?"":smoke_and_drink.getconsumption_drink2_std())
////                            .append(smoke_and_drink.getconsumption_drink_unit2_std()==null?"":smoke_and_drink.getconsumption_drink_unit2_std())
////                            .append(smoke_and_drink.getdrink_freq2_std()==null?"":smoke_and_drink.getdrink_freq2_std())
////                            .append(smoke_and_drink.getdrink_freq_unit2_std()==null?"":smoke_and_drink.getdrink_freq_unit2_std());
////                }
////            }
//            if (stringBuilder.length()!=0){
//                hisPerson.setDailyDrink(stringBuilder.toString());
//            }
//            if (smoke_and_drink.getdrink_quitter_std() != null && !smoke_and_drink.getdrink_quitter_std().equals("")) {
//                hisPerson.setStopDrink(smoke_and_drink.getdrink_quitter_std());
//            }
//            if (smoke_and_drink.getyear_of_drink_q_std() != null && !smoke_and_drink.getyear_of_drink_q_std().equals("")
//                    && !smoke_and_drink.getyear_of_drink_q_std().equals("无效")) {
//                hisPerson.setStopDrinkYear(smoke_and_drink.getyear_of_drink_q_std());
//            }
//
//        }
//        //修改时间
//        hisPerson.setUpdatedAt(new Date());
//        hisPersonService.saveHisPerson(hisPerson);
//    }

//    public void saveHisFamily( List<FAMILY_HISTORY> zj_FAMILY_HISTORY ){
//
//        log.info("保存家族史："+ zj_FAMILY_HISTORY.get(0).getunique_id());
//
//        for (FAMILY_HISTORY family_history:zj_FAMILY_HISTORY
//             ) {
//            HisFamily hisFamily = new HisFamily();
//            hisFamily.setUniqueId(family_history.getunique_id());
//            //唯一标识
//            hisFamily.setUniqueIdLv1(zj_FAMILY_HISTORY.get(0).getunique_id_lv1());
//            hisFamily.setUniqueIdLv2(zj_FAMILY_HISTORY.get(0).getunique_id_lv2());
//            //医疗机构代码
//            hisFamily.setP900(zj_FAMILY_HISTORY.get(0).getp900());
//            //患者id
//            hisFamily.setPatientId(zj_FAMILY_HISTORY.get(0).getpatient_id());
//            //住院号
//            hisFamily.setVisitId(zj_FAMILY_HISTORY.get(0).getvisit_id());
//
////            if ((family_history.getneg()==null||family_history.getneg().equals(""))&&(family_history.getdiag()!=null)&&
////                    (family_history.getdiag().contains("肿瘤")||family_history.getdiag().contains("癌")||
////                            family_history.getdiag().contains("淋巴瘤")||family_history.getdiag().contains("白血病"))){
////                hisFamily.setFamilyTumour("是");
////                hisFamily.setTumourRelative(family_history.getrelation());
////                hisFamily.setRelativeTumourName(family_history.getdiag());
////            }else {
////                hisFamily.setFamilyTumour("否");
////            }
////
////            if ((family_history.getneg()==null||family_history.getneg().equals(""))&&(family_history.getdiag()!=null)&&
////                    (family_history.getdiag().contains("循环")||family_history.getdiag().contains("脑卒中")||
////                            family_history.getdiag().contains("冠心病")||family_history.getdiag().contains("高血压"))){
////                hisFamily.setFamilyCcvd("是");
////                hisFamily.setCcvdRelative(family_history.getrelation());
////                hisFamily.setRelativeCcvdName(family_history.getdiag());
////            }else {
////                hisFamily.setFamilyCcvd("否");
////            }
//            if ((family_history.getneg_std()==null||family_history.getneg_std().equals(""))&&(family_history.geticd10_name1()!=null)&&
//                    (family_history.geticd10_name1().contains("肿瘤")||family_history.geticd10_name1().contains("癌"))){
//                hisFamily.setFamilyTumour("是");
//                hisFamily.setTumourRelative(family_history.getrelation_std());
//                hisFamily.setRelativeTumourName(family_history.geticd10_name1());
//            }else if ((family_history.getneg_std()==null||family_history.getneg_std().equals(""))&&(family_history.geticd10_name2()!=null)&&
//                    (family_history.geticd10_name2().contains("肿瘤")||family_history.geticd10_name2().contains("癌"))){
//                hisFamily.setFamilyTumour("是");
//                hisFamily.setTumourRelative(family_history.getrelation_std());
//                hisFamily.setRelativeTumourName(family_history.geticd10_name2());
//            }else {
//                hisFamily.setFamilyTumour("否");
//            }
//
//            if ((family_history.getneg_std()==null||family_history.getneg_std().equals(""))&&(family_history.geticd10_name1()!=null)&&
//                    (family_history.geticd10_name1().contains("心脏病")||family_history.geticd10_name1().contains("脑卒中"))){
//                hisFamily.setFamilyCcvd("是");
//                hisFamily.setCcvdRelative(family_history.getrelation_std());
//                hisFamily.setRelativeCcvdName(family_history.geticd10_name1());
//            }else
//            if ((family_history.getneg_std()==null||family_history.getneg_std().equals(""))&&(family_history.geticd10_name2()!=null)&&
//                    (family_history.geticd10_name2().contains("心脏病")||family_history.geticd10_name2().contains("脑卒中"))){
//                hisFamily.setFamilyCcvd("是");
//                hisFamily.setCcvdRelative(family_history.getrelation_std());
//                hisFamily.setRelativeCcvdName(family_history.geticd10_name2());
//            }else {
//                hisFamily.setFamilyCcvd("否");
//            }
//
//            hisFamilyService.saveHisFamily(hisFamily);
//        }
//
//
//    }



//    public void saveHisPast(List<PRIOR_DISEASE_AND_SURGERY> zj_PRIOR_DISEASE_AND_SURGERY) {
//        log.info("保存既往史："+zj_PRIOR_DISEASE_AND_SURGERY.get(0).getunique_id());
//        HisPast hisPast = new HisPast();
//        hisPast.setUniqueId(zj_PRIOR_DISEASE_AND_SURGERY.get(0).getunique_id());
//        //标识患者身份唯一标识
//        hisPast.setUniqueIdLv1(zj_PRIOR_DISEASE_AND_SURGERY.get(0).getunique_id_lv1());
//        //唯一标识
//        hisPast.setUniqueIdLv2(zj_PRIOR_DISEASE_AND_SURGERY.get(0).getunique_id_lv2());
//        //医疗机构代码
//        hisPast.setP900(zj_PRIOR_DISEASE_AND_SURGERY.get(0).getp900());
//        //患者id
//        hisPast.setPatientId(zj_PRIOR_DISEASE_AND_SURGERY.get(0).getpatient_id());
//        //住院号
//        hisPast.setVisitId(zj_PRIOR_DISEASE_AND_SURGERY.get(0).getvisit_id());
//
//        for (PRIOR_DISEASE_AND_SURGERY prior:zj_PRIOR_DISEASE_AND_SURGERY
//             ) {
//            //高血压
//            hisPast.setHypertension(hisPast.getHypertension()!=null&&hisPast.getHypertension().equals("是")?"是":
//                    parsePast(Constant.gxyKeyword,prior.getneg_std(),prior.geticd10_name1(),prior.geticd10_name2()));
//            //糖尿病
//            hisPast.setGlycuresis(hisPast.getGlycuresis()!=null&&hisPast.getGlycuresis().equals("是")?"是":
//                    parsePast(Constant.tnbKeyword,prior.getneg_std(),prior.geticd10_name1(),prior.geticd10_name2()));
//            //慢性阻塞性肺病(COPD)
//            hisPast.setCopd(hisPast.getCopd()!=null&&hisPast.getCopd().equals("是")?"是":
//                    parsePast1(Arrays.asList("慢性阻塞性肺病"),prior.getneg_std(),prior.geticd10_name1(),prior.geticd10_name2()));
//            //肺气肿
//            hisPast.setEmphysema(hisPast.getEmphysema()!=null&&hisPast.getEmphysema().equals("是")?"是":
//                    parsePast1(Arrays.asList("肺气肿"),prior.getneg_std(),prior.geticd10_name1(),prior.geticd10_name2()));
//            //哮喘
//            hisPast.setAsthma(hisPast.getAsthma()!=null&&hisPast.getAsthma().equals("是")?"是":
//                    parsePast(Constant.xcKeyword,prior.getneg_std(),prior.geticd10_name1(),prior.geticd10_name2()));
//            //支气管肺炎
//            hisPast.setBronchitis(hisPast.getBronchitis()!=null&&hisPast.getBronchitis().equals("是")?"是":
//                    parsePast(Constant.fyKeyword,prior.getneg_std(),prior.geticd10_name1(),prior.geticd10_name2()));
//            //甲状腺疾病
//            hisPast.setThyroid(hisPast.getThyroid()!=null&&hisPast.getThyroid().equals("是")?"是":
//                    parsePast(Constant.jzxKeyword,prior.getneg_std(),prior.geticd10_name1(),prior.geticd10_name2()));
//            //心脏病
//            hisPast.setHeartDisease(hisPast.getHeartDisease()!=null&&hisPast.getHeartDisease().equals("是")?"是":
//                    parsePast(Constant.xzbKeyword,prior.getneg_std(),prior.geticd10_name1(),prior.geticd10_name2()));
//            //慢性贫血
//            hisPast.setChronicAnemia(hisPast.getChronicAnemia()!=null&&hisPast.getChronicAnemia().equals("是")?"是":
//                    parsePast(Constant.mxpxKeyword,prior.getneg_std(),prior.geticd10_name1(),prior.geticd10_name2()));
//            //风湿热病史
//            hisPast.setRheumaticFever(hisPast.getRheumaticFever()!=null&&hisPast.getRheumaticFever().equals("是")?"是":
//                    parsePast1(Arrays.asList("风湿病"),prior.getneg_std(),prior.geticd10_name1(),prior.geticd10_name2()));
//            //血脂异常
//            hisPast.setBloodFat(hisPast.getBloodFat()!=null&&hisPast.getBloodFat().equals("是")?"是":
//                    parsePast1(Arrays.asList("高脂血症"),prior.getneg_std(),prior.geticd10_name1(),prior.geticd10_name2()));
//            //慢性肾脏病
//            hisPast.setChronicKidney(hisPast.getChronicKidney()!=null&&hisPast.getChronicKidney().equals("是")?"是":
//                    parsePast(Constant.mxszbKeyword,prior.getneg_std(),prior.geticd10_name1(),prior.geticd10_name2()));
//            //乙肝
//            hisPast.setHepatitisB(hisPast.getHepatitisB()!=null&&hisPast.getHepatitisB().equals("是")?"是":
//                    parsePast(Constant.ygKeyword,prior.getneg_std(),prior.geticd10_name1(),prior.geticd10_name2()));
//            //丙肝
//            hisPast.setHcv(hisPast.getHcv()!=null&&hisPast.getHcv().equals("是")?"是":
//                    parsePast1(Arrays.asList("慢性丙型病毒性肝炎"),prior.getneg_std(),prior.geticd10_name1(),prior.geticd10_name2()));
//            //结核
//            hisPast.setTuberculosis(hisPast.getTuberculosis()!=null&&hisPast.getTuberculosis().equals("是")?"是":
//                    parsePast(Constant.jhKeyword,prior.getneg_std(),prior.geticd10_name1(),prior.geticd10_name2()));
//            //HIV感染病史
//            hisPast.setHiv(hisPast.getHiv()!=null&&hisPast.getHiv().equals("是")?"是":
//                    parsePast1(Arrays.asList("艾滋病"),prior.getneg_std(),prior.geticd10_name1(),prior.geticd10_name2()));
//
//        }
//        hisPast.setUpdatedAt(new Date());
//        hisPastService.saveHisPast(hisPast);
//
//    }

    private String parsePast(List<String> keyword,String... icd10s){
        String neg = icd10s[0];
        if (neg != null) {
            return "否";
        }
        for (String icd10:icd10s
             ) {
            if (keyword.contains(icd10)){
                return "是";
            }
        }
        return "否";
    }
    private String parsePast1(List<String> keywords,String... icd10s){
        String neg = icd10s[0];
        if (neg != null) {
            return "否";
        }
        String keyword = keywords.get(0);
        for (String icd10:icd10s
        ) {
            if (icd10==null){
                continue;
            }
            if (icd10.contains(keyword)){
                return "是";
            }
        }
        return "否";
    }

//    public void saveSymptom(){
//        Symptom symptom = new Symptom();
//        //标识患者身份唯一标识
//        symptom.setPersonId();
//        //唯一标识
//        symptom.setUniqueId();
//        //中间库unique_id
//        symptom.setUniqueIdLv3();
//        //医疗机构代码
//        symptom.setP900();
//        //患者id
//        symptom.setPatientId();
//        //门诊/住院号
//        symptom.setVisitId();
//        //其他症状和体征
//        symptom.setSymptoms();
//        //数据版本
//        symptom.setDataVersion();
//        //数据库来源
//        symptom.setDataDbSource();
//        //数据表来源
//        symptom.setDataTableSource();
//        //数据项来源
//        symptom.setDataFieldSource();
//        //创建时间
//        symptom.setCreatedAt();
//        //创建人
//        symptom.setCreator();
//        //修改时间
//        symptom.setUpdatedAt();
//        symptomService.saveSymptom(symptom);
//    }
//    public void savePrimaryDiagnosis(){
//        PrimaryDiagnosis primaryDiagnosis = new PrimaryDiagnosis();
//        //标识患者身份唯一标识
//        primaryDiagnosis.setPersonId();
//        //唯一标识
//        primaryDiagnosis.setUniqueId();
//        //中间库unique_id
//        primaryDiagnosis.setUniqueIdLv3();
//        //医疗机构代码
//        primaryDiagnosis.setP900();
//        //患者id
//        primaryDiagnosis.setPatientId();
//        //住院门诊号
//        primaryDiagnosis.setVisitId();
//        //诊断日期
//        primaryDiagnosis.setDiagnosisDate();
//        //诊断名称
//        primaryDiagnosis.setDiagnosisName();
//        //诊断类型
//        primaryDiagnosis.setDiagnosisType();
//        //出现转移
//        primaryDiagnosis.setIfTransfer();
//        //转移部位
//        primaryDiagnosis.setTransferPosition();
//        //复发
//        primaryDiagnosis.setIfRecrudescence();
//        //复发形式
//        primaryDiagnosis.setRecrudescenceType();
//        //复发或转移时间
//        primaryDiagnosis.setRecrudescenceDate();
//        //数据版本
//        primaryDiagnosis.setDataVersion();
//        //数据库来源
//        primaryDiagnosis.setDataDbSource();
//        //数据表来源
//        primaryDiagnosis.setDataTableSource();
//        //数据项来源
//        primaryDiagnosis.setDataFieldSource();
//        //创建时间
//        primaryDiagnosis.setCreatedAt();
//        //创建人
//        primaryDiagnosis.setCreator();
//        //修改时间
//        primaryDiagnosis.setUpdatedAt();
//        primaryDiagnosisService.savePrimaryDiagnosis(primaryDiagnosis);
//    }
//    public void saveDiagnosisStage(){
//        DiagnosisStage diagnosisStage = new DiagnosisStage();
//        //标识患者身份唯一标识
//        diagnosisStage.setPersonId();
//        //唯一标识
//        diagnosisStage.setUniqueId();
//        //中间库unique_id
//        diagnosisStage.setUniqueIdLv3();
//        //医疗机构代码
//        diagnosisStage.setP900();
//        //患者id
//        diagnosisStage.setPatientId();
//        //住院门诊号
//        diagnosisStage.setVisitId();
//        //诊断名称
//        diagnosisStage.setDiagName();
//        //诊断名称标化结果合并
//        diagnosisStage.setDiagNameStd();
//        //T分期
//        diagnosisStage.setTStage();
//        //N分期
//        diagnosisStage.setNStage();
//        //M分期
//        diagnosisStage.setMStage();
//        //TNM综合分期
//        diagnosisStage.setTnmStage();
//        //数据版本
//        diagnosisStage.setDataVersion();
//        //数据库来源
//        diagnosisStage.setDataDbSource();
//        //数据表来源
//        diagnosisStage.setDataTableSource();
//        //数据项来源
//        diagnosisStage.setDataFieldSource();
//        //创建时间
//        diagnosisStage.setCreatedAt();
//        //创建人
//        diagnosisStage.setCreator();
//        //修改时间
//        diagnosisStage.setUpdatedAt();
//        diagnosisStageService.saveDiagnosisStage(diagnosisStage);
//    }
//    public void saveInspection(){
//        Inspection inspection = new Inspection();
//        //标识患者身份唯一标识
//        inspection.setPersonId();
//        //唯一标识
//        inspection.setUniqueId();
//        //中间库unique_id
//        inspection.setUniqueIdLv3();
//        //医疗机构代码
//        inspection.setP900();
//        //患者id
//        inspection.setPatientId();
//        //就诊类型
//        inspection.setVisitType();
//        //门诊/住院号
//        inspection.setVisitId();
//        //住院次数
//        inspection.setAdmissionNumber();
//        //检验系统编号
//        inspection.setTestNo();
//        //标本类型
//        inspection.setSpcmType();
//        //标本采样时间
//        inspection.setSpcmSampleDateTime();
//        //标本接收时间
//        inspection.setSpcmReceivedDateTime();
//        //申请时间
//        inspection.setRequestedDateTime();
//        //报告时间
//        inspection.setResultRptDateTime();
//        //检查时间
//        inspection.setResultDateTime();
//        //打印序号
//        inspection.setPrintOrder();
//        //检验套餐名称
//        inspection.setTestPackageName();
//        //检验项目名称
//        inspection.setTestItemName();
//        //检验结果值
//        inspection.setResult();
//        //检验结果单位
//        inspection.setUnits();
//        //异常标识
//        inspection.setAbnormalIndicator();
//        //参考区间
//        inspection.setReferenceInterval();
//        //标准化标本类型
//        inspection.setSpcmTypeStd();
//        //标准化项目名称1
//        inspection.setTestItemName1Std();
//        //标准化项目名称2
//        inspection.setTestItemName2Std();
//        //标准化项目名称3
//        inspection.setTestItemName3Std();
//        //标准化项目名称4
//        inspection.setTestItemName4Std();
//        //数据版本
//        inspection.setDataVersion();
//        //数据库来源
//        inspection.setDataDbSource();
//        //数据表来源
//        inspection.setDataTableSource();
//        //数据项来源
//        inspection.setDataFieldSource();
//        //创建时间
//        inspection.setCreatedAt();
//        //创建人
//        inspection.setCreator();
//        //修改时间
//        inspection.setUpdatedAt();
//        inspectionService.saveInspection(inspection);
//    }
//    public void saveExamMaster(){
//        ExamMaster examMaster = new ExamMaster();
//        //标识患者身份唯一标识
//        examMaster.setPersonId();
//        //唯一标识
//        examMaster.setUniqueId();
//        //中间库unique_id
//        examMaster.setUniqueIdLv3();
//        //医疗机构代码
//        examMaster.setP900();
//        //患者id
//        examMaster.setPatientId();
//        //住院号
//        examMaster.setVisitId();
//        //检查号
//        examMaster.setExamNo();
//        //检查类别
//        examMaster.setExamClass();
//        //临床症状
//        examMaster.setClinSymp();
//        //体征
//        examMaster.setPhysSign();
//        //相关化验结果
//        examMaster.setRelevantLabTest();
//        //其他诊断
//        examMaster.setRelevantDiag();
//        //临床诊断
//        examMaster.setClinDiag();
//        //检查方式
//        examMaster.setExamMode();
//        //使用仪器
//        examMaster.setDevice();
//        //执行科室
//        examMaster.setPerformedBy();
//        //病人来源
//        examMaster.setPatientSource();
//        //申请日期时间
//        examMaster.setReqDateTime();
//        //申请科室
//        examMaster.setReqDept();
//        //申请医生
//        examMaster.setReqPhysician();
//        //注意事项
//        examMaster.setNotice();
//        //检查日期时间
//        examMaster.setExamDateTime();
//        //报告日期时间
//        examMaster.setReportDateTime();
//        //检查部位
//        examMaster.setExamPosition();
//        //报告医师
//        examMaster.setDiagDoctor();
//        //审核医生
//        examMaster.setReviewDoctor();
//        //检查项目
//        examMaster.setEntryName();
//        //检查结论
//        examMaster.setEntryResults();
//        //检查参数
//        examMaster.setExamPara();
//        //检查所见
//        examMaster.setDescription();
//        //是否阳性
//        examMaster.setIsAbnormal();
//        //报告中图像编号
//        examMaster.setUseImage();
//        //备注
//        examMaster.setMemo();
//        //数据版本
//        examMaster.setDataVersion();
//        //数据库来源
//        examMaster.setDataDbSource();
//        //数据表来源
//        examMaster.setDataTableSource();
//        //数据项来源
//        examMaster.setDataFieldSource();
//        //创建时间
//        examMaster.setCreatedAt();
//        //创建人
//        examMaster.setCreator();
//        //修改时间
//        examMaster.setUpdatedAt();
//        examMasterService.saveExamMaster(examMaster);
//    }
//    public void saveExamMasterStd(){
//        ExamMasterStd examMasterStd = new ExamMasterStd();
//        //标识患者身份唯一标识
//        examMasterStd.setPersonId();
//        //唯一标识
//        examMasterStd.setUniqueId();
//        //关联检查表
//        examMasterStd.setUniqueIdLv3();
//        //医疗机构代码
//        examMasterStd.setP900();
//        //患者id
//        examMasterStd.setPatientId();
//        //就诊标识住院号
//        examMasterStd.setVisitId();
//        //检查号
//        examMasterStd.setExamNo();
//        //检查类型标化
//        examMasterStd.setExamClassStd();
//        //检查方式标化
//        examMasterStd.setExamModeStd();
//        //检查部位标化
//        examMasterStd.setStructureStd();
//        //数据版本
//        examMasterStd.setDataVersion();
//        //数据库来源
//        examMasterStd.setDataDbSource();
//        //数据表来源
//        examMasterStd.setDataTableSource();
//        //数据项来源
//        examMasterStd.setDataFieldSource();
//        //创建时间
//        examMasterStd.setCreatedAt();
//        //创建人
//        examMasterStd.setCreator();
//        //修改时间
//        examMasterStd.setUpdatedAt();
//        examMasterStdService.saveExamMasterStd(examMasterStd);
//    }
//    public void saveRabat(){
//        Rabat rabat = new Rabat();
//        //标识患者身份唯一标识
//        rabat.setPersonId();
//        //唯一标识
//        rabat.setUniqueId();
//        //医疗机构代码
//        rabat.setP900();
//        //患者id
//        rabat.setPatientId();
//        //就诊标识住院号
//        rabat.setVisitId();
//        //检查号
//        rabat.setExamNo();
//        //检查项目
//        rabat.setExamName();
//        //转移
//        rabat.setTransfer();
//        //数据版本
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
//        rabatService.saveRabat(rabat);
//    }
//    public void saveChestCtDes(){
//        ChestCtDes chestCtDes = new ChestCtDes();
//        //标识患者身份唯一标识
//        chestCtDes.setPersonId();
//        //唯一标识
//        chestCtDes.setUniqueId();
//        //医疗机构代码
//        chestCtDes.setP900();
//        //患者id
//        chestCtDes.setPatientId();
//        //就诊标识住院号
//        chestCtDes.setVisitId();
//        //检查号
//        chestCtDes.setExamNo();
//        //检查项目
//        chestCtDes.setExamName();
//        //转移灶数目
//        chestCtDes.setDesTransferCount();
//        //转移灶大小
//        chestCtDes.setDesTransferSize();
//        //数据版本
//        chestCtDes.setDataVersion();
//        //数据库来源
//        chestCtDes.setDataDbSource();
//        //数据表来源
//        chestCtDes.setDataTableSource();
//        //数据项来源
//        chestCtDes.setDataFieldSource();
//        //创建时间
//        chestCtDes.setCreatedAt();
//        //创建人
//        chestCtDes.setCreator();
//        //修改时间
//        chestCtDes.setUpdatedAt();
//        chestCtDesService.saveChestCtDes(chestCtDes);
//    }
//    public void saveChestCtResult(){
//        ChestCtResult chestCtResult = new ChestCtResult();
//        //标识患者身份唯一标识
//        chestCtResult.setPersonId();
//        //唯一标识
//        chestCtResult.setUniqueId();
//        //医疗机构代码
//        chestCtResult.setP900();
//        //患者id
//        chestCtResult.setPatientId();
//        //就诊标识住院号
//        chestCtResult.setVisitId();
//        //检查号
//        chestCtResult.setExamNo();
//        //检查项目
//        chestCtResult.setExamName();
//        //转移
//        chestCtResult.setTransfer();
//        //转移部位
//        chestCtResult.setResTransferSite();
//        //数据版本
//        chestCtResult.setDataVersion();
//        //数据库来源
//        chestCtResult.setDataDbSource();
//        //数据表来源
//        chestCtResult.setDataTableSource();
//        //数据项来源
//        chestCtResult.setDataFieldSource();
//        //创建时间
//        chestCtResult.setCreatedAt();
//        //创建人
//        chestCtResult.setCreator();
//        //修改时间
//        chestCtResult.setUpdatedAt();
//        chestCtResultService.saveChestCtResult(chestCtResult);
//    }
//    public void saveAbdominalCtResult(){
//        AbdominalCtResult abdominalCtResult = new AbdominalCtResult();
//        //标识患者身份唯一标识
//        abdominalCtResult.setPersonId();
//        //唯一标识
//        abdominalCtResult.setUniqueId();
//        //医疗机构代码
//        abdominalCtResult.setP900();
//        //患者id
//        abdominalCtResult.setPatientId();
//        //就诊标识住院号
//        abdominalCtResult.setVisitId();
//        //检查号
//        abdominalCtResult.setExamNo();
//        //检查项目
//        abdominalCtResult.setExamName();
//        //肝病灶是否恶性
//        abdominalCtResult.setTumor();
//        //复发
//        abdominalCtResult.setRecrudescence();
//        //转移
//        abdominalCtResult.setTransfer();
//        //转移部位
//        abdominalCtResult.setTransferSite();
//        //腹水
//        abdominalCtResult.setAscites();
//        //数据版本
//        abdominalCtResult.setDataVersion();
//        //数据库来源
//        abdominalCtResult.setDataDbSource();
//        //数据表来源
//        abdominalCtResult.setDataTableSource();
//        //数据项来源
//        abdominalCtResult.setDataFieldSource();
//        //创建时间
//        abdominalCtResult.setCreatedAt();
//        //创建人
//        abdominalCtResult.setCreator();
//        //修改时间
//        abdominalCtResult.setUpdatedAt();
//        abdominalCtResultService.saveAbdominalCtResult(abdominalCtResult);
//    }
//    public void saveAbdominalCtDes(){
//        AbdominalCtDes abdominalCtDes = new AbdominalCtDes();
//        //标识患者身份唯一标识
//        abdominalCtDes.setPersonId();
//        //唯一标识
//        abdominalCtDes.setUniqueId();
//        //医疗机构代码
//        abdominalCtDes.setP900();
//        //患者id
//        abdominalCtDes.setPatientId();
//        //就诊标识住院号
//        abdominalCtDes.setVisitId();
//        //检查号
//        abdominalCtDes.setExamNo();
//        //检查项目
//        abdominalCtDes.setExamName();
//        //肝恶性病灶数目
//        abdominalCtDes.setTumorCount();
//        //肝恶性病灶大小
//        abdominalCtDes.setTumorSize();
//        //转移灶数目
//        abdominalCtDes.setTransferCount();
//        //转移灶大小
//        abdominalCtDes.setTransferSize();
//        //数据版本
//        abdominalCtDes.setDataVersion();
//        //数据库来源
//        abdominalCtDes.setDataDbSource();
//        //数据表来源
//        abdominalCtDes.setDataTableSource();
//        //数据项来源
//        abdominalCtDes.setDataFieldSource();
//        //创建时间
//        abdominalCtDes.setCreatedAt();
//        //创建人
//        abdominalCtDes.setCreator();
//        //修改时间
//        abdominalCtDes.setUpdatedAt();
//        abdominalCtDesService.saveAbdominalCtDes(abdominalCtDes);
//    }
//    public void saveAbdominalMriDes(){
//        AbdominalMriDes abdominalMriDes = new AbdominalMriDes();
//        //标识患者身份唯一标识
//        abdominalMriDes.setPersonId();
//        //唯一标识
//        abdominalMriDes.setUniqueId();
//        //医疗机构代码
//        abdominalMriDes.setP900();
//        //患者id
//        abdominalMriDes.setPatientId();
//        //就诊标识住院号
//        abdominalMriDes.setVisitId();
//        //检查号
//        abdominalMriDes.setExamNo();
//        //检查项目
//        abdominalMriDes.setExamName();
//        //肝恶性病灶数目
//        abdominalMriDes.setTumorCount();
//        //肝恶性病灶大小
//        abdominalMriDes.setTumorSize();
//        //转移灶数目
//        abdominalMriDes.setTransferCount();
//        //转移灶大小
//        abdominalMriDes.setTransferSize();
//        //数据版本
//        abdominalMriDes.setDataVersion();
//        //数据库来源
//        abdominalMriDes.setDataDbSource();
//        //数据表来源
//        abdominalMriDes.setDataTableSource();
//        //数据项来源
//        abdominalMriDes.setDataFieldSource();
//        //创建时间
//        abdominalMriDes.setCreatedAt();
//        //创建人
//        abdominalMriDes.setCreator();
//        //修改时间
//        abdominalMriDes.setUpdatedAt();
//        abdominalMriDesService.saveAbdominalMriDes(abdominalMriDes);
//    }
//    public void saveAbdominalMriResult(){
//        AbdominalMriResult abdominalMriResult = new AbdominalMriResult();
//        //标识患者身份唯一标识
//        abdominalMriResult.setPersonId();
//        //唯一标识
//        abdominalMriResult.setUniqueId();
//        //医疗机构代码
//        abdominalMriResult.setP900();
//        //患者id
//        abdominalMriResult.setPatientId();
//        //就诊标识住院号
//        abdominalMriResult.setVisitId();
//        //检查号
//        abdominalMriResult.setExamNo();
//        //检查项目
//        abdominalMriResult.setExamName();
//        //肝病灶是否恶性
//        abdominalMriResult.setTumor();
//        //复发
//        abdominalMriResult.setRecrudescence();
//        //转移
//        abdominalMriResult.setTransfer();
//        //转移部位
//        abdominalMriResult.setTransferSite();
//        //腹水
//        abdominalMriResult.setAscites();
//        //数据版本
//        abdominalMriResult.setDataVersion();
//        //数据库来源
//        abdominalMriResult.setDataDbSource();
//        //数据表来源
//        abdominalMriResult.setDataTableSource();
//        //数据项来源
//        abdominalMriResult.setDataFieldSource();
//        //创建时间
//        abdominalMriResult.setCreatedAt();
//        //创建人
//        abdominalMriResult.setCreator();
//        //修改时间
//        abdominalMriResult.setUpdatedAt();
//        abdominalMriResultService.saveAbdominalMriResult(abdominalMriResult);
//    }
//    public void saveAbdominalUsDes(){
//        AbdominalUsDes abdominalUsDes = new AbdominalUsDes();
//        //标识患者身份唯一标识
//        abdominalUsDes.setPersonId();
//        //唯一标识
//        abdominalUsDes.setUniqueId();
//        //医疗机构代码
//        abdominalUsDes.setP900();
//        //患者id
//        abdominalUsDes.setPatientId();
//        //就诊标识住院号
//        abdominalUsDes.setVisitId();
//        //检查号
//        abdominalUsDes.setExamNo();
//        //检查项目
//        abdominalUsDes.setExamName();
//        //肝恶性病灶数目
//        abdominalUsDes.setTumorCount();
//        //肝恶性病灶大小
//        abdominalUsDes.setTumorSize();
//        //转移灶数目
//        abdominalUsDes.setTransferCount();
//        //转移灶大小
//        abdominalUsDes.setTransferSize();
//        //数据版本
//        abdominalUsDes.setDataVersion();
//        //数据库来源
//        abdominalUsDes.setDataDbSource();
//        //数据表来源
//        abdominalUsDes.setDataTableSource();
//        //数据项来源
//        abdominalUsDes.setDataFieldSource();
//        //创建时间
//        abdominalUsDes.setCreatedAt();
//        //创建人
//        abdominalUsDes.setCreator();
//        //修改时间
//        abdominalUsDes.setUpdatedAt();
//        abdominalUsDesService.saveAbdominalUsDes(abdominalUsDes);
//    }
//    public void saveAbdominalUsResult(){
//        AbdominalUsResult abdominalUsResult = new AbdominalUsResult();
//        //标识患者身份唯一标识
//        abdominalUsResult.setPersonId();
//        //唯一标识
//        abdominalUsResult.setUniqueId();
//        //医疗机构代码
//        abdominalUsResult.setP900();
//        //患者id
//        abdominalUsResult.setPatientId();
//        //就诊标识住院号
//        abdominalUsResult.setVisitId();
//        //检查号
//        abdominalUsResult.setExamNo();
//        //检查项目
//        abdominalUsResult.setExamName();
//        //肝病灶是否恶性
//        abdominalUsResult.setTumor();
//        //复发
//        abdominalUsResult.setRecrudescence();
//        //转移
//        abdominalUsResult.setTransfer();
//        //转移部位
//        abdominalUsResult.setTransferSite();
//        //腹水
//        abdominalUsResult.setAscites();
//        //数据版本
//        abdominalUsResult.setDataVersion();
//        //数据库来源
//        abdominalUsResult.setDataDbSource();
//        //数据表来源
//        abdominalUsResult.setDataTableSource();
//        //数据项来源
//        abdominalUsResult.setDataFieldSource();
//        //创建时间
//        abdominalUsResult.setCreatedAt();
//        //创建人
//        abdominalUsResult.setCreator();
//        //修改时间
//        abdominalUsResult.setUpdatedAt();
//        abdominalUsResultService.saveAbdominalUsResult(abdominalUsResult);
//    }
//    public void savePetCtDes(){
//        PetCtDes petCtDes = new PetCtDes();
//        //标识患者身份唯一标识
//        petCtDes.setPersonId();
//        //唯一标识
//        petCtDes.setUniqueId();
//        //医疗机构代码
//        petCtDes.setP900();
//        //患者id
//        petCtDes.setPatientId();
//        //就诊标识住院号
//        petCtDes.setVisitId();
//        //检查号
//        petCtDes.setExamNo();
//        //检查项目
//        petCtDes.setExamName();
//        //肝恶性病灶数目
//        petCtDes.setTumorCount();
//        //肝恶性病灶大小
//        petCtDes.setTumorSize();
//        //转移灶数目
//        petCtDes.setTransferCount();
//        //转移灶大小
//        petCtDes.setTransferSize();
//        //数据版本
//        petCtDes.setDataVersion();
//        //数据库来源
//        petCtDes.setDataDbSource();
//        //数据表来源
//        petCtDes.setDataTableSource();
//        //数据项来源
//        petCtDes.setDataFieldSource();
//        //创建时间
//        petCtDes.setCreatedAt();
//        //创建人
//        petCtDes.setCreator();
//        //修改时间
//        petCtDes.setUpdatedAt();
//        petCtDesService.savePetCtDes(petCtDes);
//    }
//    public void savePetCtResult(){
//        PetCtResult petCtResult = new PetCtResult();
//        //标识患者身份唯一标识
//        petCtResult.setPersonId();
//        //唯一标识
//        petCtResult.setUniqueId();
//        //医疗机构代码
//        petCtResult.setP900();
//        //患者id
//        petCtResult.setPatientId();
//        //就诊标识住院号
//        petCtResult.setVisitId();
//        //检查号
//        petCtResult.setExamNo();
//        //检查项目
//        petCtResult.setExamName();
//        //肝病灶是否恶性
//        petCtResult.setTumor();
//        //复发
//        petCtResult.setRecrudescence();
//        //转移
//        petCtResult.setTransfer();
//        //转移部位
//        petCtResult.setTransferSite();
//        //数据版本
//        petCtResult.setDataVersion();
//        //数据库来源
//        petCtResult.setDataDbSource();
//        //数据表来源
//        petCtResult.setDataTableSource();
//        //数据项来源
//        petCtResult.setDataFieldSource();
//        //创建时间
//        petCtResult.setCreatedAt();
//        //创建人
//        petCtResult.setCreator();
//        //修改时间
//        petCtResult.setUpdatedAt();
//        petCtResultService.savePetCtResult(petCtResult);
//    }
//    public void saveOperationRecord(){
//        OperationRecord operationRecord = new OperationRecord();
//        //标识患者身份唯一标识
//        operationRecord.setPersonId();
//        //唯一标识
//        operationRecord.setUniqueId();
//        //医疗机构代码
//        operationRecord.setP900();
//        //患者id
//        operationRecord.setPatientId();
//        //住院号
//        operationRecord.setVisitId();
//        //手术记录
//        operationRecord.setSurgicalProcess();
//        //手术入路
//        operationRecord.setRote();
//        //手术名称
//        operationRecord.setRcptName();
//        //是否机器人辅助
//        operationRecord.setRobot();
//        //术中是否肝门阻断
//        operationRecord.setCrossclamp();
//        //肝门阻断时间
//        operationRecord.setCrossclampTime();
//        //手术类型
//        operationRecord.setRcptType();
//        //淋巴结清扫
//        operationRecord.setLymphadenectomy();
//        //术中出血量
//        operationRecord.setBleedingVolume();
//        //手术开始时间
//        operationRecord.setItemBeginDate();
//        //手术结束时间
//        operationRecord.setItemEndDate();
//        //术中输血
//        operationRecord.setBloodTransfusion();
//        //术中输血量
//        operationRecord.setBloodTransfusionVolume();
//        //术中输血成分
//        operationRecord.setInputComponents();
//        //术中补液量
//        operationRecord.setInputComponentsVolume();
//        //数据版本
//        operationRecord.setDataVersion();
//        //数据库来源
//        operationRecord.setDataDbSource();
//        //数据表来源
//        operationRecord.setDataTableSource();
//        //数据项来源
//        operationRecord.setDataFieldSource();
//        //创建时间
//        operationRecord.setCreatedAt();
//        //创建人
//        operationRecord.setCreator();
//        //修改时间
//        operationRecord.setUpdatedAt();
//        operationRecordService.saveOperationRecord(operationRecord);
//    }
//    public void saveTumorPuncture(){
//        TumorPuncture tumorPuncture = new TumorPuncture();
//        //标识患者身份唯一标识
//        tumorPuncture.setPersonId();
//        //唯一标识
//        tumorPuncture.setUniqueId();
//        //中间库unique_id
//        tumorPuncture.setUniqueIdLv3();
//        //医疗机构代码
//        tumorPuncture.setP900();
//        //患者id
//        tumorPuncture.setPatientId();
//        //住院号
//        tumorPuncture.setVisitId();
//        //穿刺日期
//        tumorPuncture.setInspectDate();
//        //穿刺记录
//        tumorPuncture.setInspectRecord();
//        //数据版本
//        tumorPuncture.setDataVersion();
//        //数据库来源
//        tumorPuncture.setDataDbSource();
//        //数据表来源
//        tumorPuncture.setDataTableSource();
//        //数据项来源
//        tumorPuncture.setDataFieldSource();
//        //创建时间
//        tumorPuncture.setCreatedAt();
//        //创建人
//        tumorPuncture.setCreator();
//        //修改时间
//        tumorPuncture.setUpdatedAt();
//        tumorPunctureService.saveTumorPuncture(tumorPuncture);
//    }
//    public void saveOperationComplications(){
//        OperationComplications operationComplications = new OperationComplications();
//        //标识患者身份唯一标识
//        operationComplications.setPersonId();
//        //唯一标识
//        operationComplications.setUniqueId();
//        //医疗机构代码
//        operationComplications.setP900();
//        //患者id
//        operationComplications.setPatientId();
//        //住院号
//        operationComplications.setVisitId();
//        //脂肪液化
//        operationComplications.setFatLiquefaction();
//        //皮下积液
//        operationComplications.setScalpHydrops();
//        //切口血肿
//        operationComplications.setIncisionHematoma();
//        //切口愈合不良
//        operationComplications.setPoorWoundHealing();
//        //切口感染
//        operationComplications.setIncisionInfection();
//        //切口裂开
//        operationComplications.setWoundDisruption();
//        //吻合口瘘
//        operationComplications.setStomaFistula();
//        //肛瘘
//        operationComplications.setAnalFistula();
//        //肠瘘
//        operationComplications.setIntestinalFistula();
//        //十二指肠残端瘘
//        operationComplications.setDuodenalStumpFistula();
//        //淋巴漏
//        operationComplications.setLymphLeakage();
//        //胰瘘
//        operationComplications.setPancreaticFistula();
//        //腹腔内出血
//        operationComplications.setAbdominalBleeding();
//        //消化道内出血（消化道溃疡并出血）
//        operationComplications.setInAlimentaryBleeding();
//        //手术周围器官损伤出血
//        operationComplications.setOpsDamageBleeding();
//        //脾出血
//        operationComplications.setSplenorrhagia();
//        //胰腺出血
//        operationComplications.setPancreasBleeding();
//        //肝出血
//        operationComplications.setLiverBleeding();
//        //肠出血
//        operationComplications.setEnterorrhagid();
//        //肾出血
//        operationComplications.setNephrorrhagia();
//        //吻合口瘘
//        operationComplications.setAnastomoticLeakage();
//        //吻合口出血
//        operationComplications.setAnastomoticBleeding();
//        //吻合口狭窄
//        operationComplications.setAnastomoticStenosis();
//        //腹腔积液
//        operationComplications.setAscites();
//        //腹腔脓肿
//        operationComplications.setAbdominalAbscess();
//        //腹腔感染
//        operationComplications.setAbdominalInfection();
//        //肠梗阻
//        operationComplications.setIntestinalObstruction();
//        //残胃炎（残胃溃疡）
//        operationComplications.setRemnantGastritis();
//        //胃瘫
//        operationComplications.setGastroparesis();
//        //十二指肠球炎（十二指肠溃疡）
//        operationComplications.setBulbarDuodenitis();
//        //胰腺炎
//        operationComplications.setPancreatitis();
//        //肝炎
//        operationComplications.setHepatitis();
//        //胆囊炎
//        operationComplications.setCholecystitis();
//        //肺炎
//        operationComplications.setPneumonia();
//        //胸腔积液
//        operationComplications.setPleuralEffusion();
//        //肝衰竭
//        operationComplications.setHepaticFailure();
//        //肾衰竭
//        operationComplications.setRenalFailure();
//        //心脑血管意外
//        operationComplications.setCardiovascularAccident();
//        //深静脉血栓
//        operationComplications.setDeepVenousThrombosis();
//        //肺栓塞
//        operationComplications.setPulmonaryEmbolism();
//        //并发症发生日期
//        operationComplications.setComplicationDate();
//        //数据版本
//        operationComplications.setDataVersion();
//        //数据库来源
//        operationComplications.setDataDbSource();
//        //数据表来源
//        operationComplications.setDataTableSource();
//        //数据项来源
//        operationComplications.setDataFieldSource();
//        //创建时间
//        operationComplications.setCreatedAt();
//        //创建人
//        operationComplications.setCreator();
//        //修改时间
//        operationComplications.setUpdatedAt();
//        operationComplicationsService.saveOperationComplications(operationComplications);
//    }
//    public void saveHistologyReport(){
//        HistologyReport histologyReport = new HistologyReport();
//        //标识患者身份唯一标识
//        histologyReport.setPersonId();
//        //唯一标识
//        histologyReport.setUniqueId();
//        //中间库unique_id
//        histologyReport.setUniqueIdLv3();
//        //医疗机构代码
//        histologyReport.setP900();
//        //患者id
//        histologyReport.setPatientId();
//        //住院号
//        histologyReport.setVisitId();
//        //病理系统编号
//        histologyReport.setPathologyNo();
//        //送检医院
//        histologyReport.setInspectionHospital();
//        //送检科室
//        histologyReport.setInspectionDepartment();
//        //送检医师
//        histologyReport.setInspectionPhysician();
//        //送检时间
//        histologyReport.setInspectionTime();
//        //送检部位
//        histologyReport.setInspectionSite();
//        //临床诊断
//        histologyReport.setClinicalDiagnosis();
//        //姓名
//        histologyReport.setName();
//        //标本接收时间
//        histologyReport.setSpecimenReceivingTime();
//        //报告时间
//        histologyReport.setReportTime();
//        //审核时间
//        histologyReport.setReviewTime();
//        //病理所见-肉眼所见
//        histologyReport.setPathEye();
//        //病理所见-镜下所见
//        histologyReport.setPathMicroscope();
//        //病理诊断
//        histologyReport.setPathDiag();
//        //病理诊断编码
//        histologyReport.setPathDiagCode();
//        //数据版本
//        histologyReport.setDataVersion();
//        //数据库来源
//        histologyReport.setDataDbSource();
//        //数据表来源
//        histologyReport.setDataTableSource();
//        //数据项来源
//        histologyReport.setDataFieldSource();
//        //创建时间
//        histologyReport.setCreatedAt();
//        //创建人
//        histologyReport.setCreator();
//        //修改时间
//        histologyReport.setUpdatedAt();
//        histologyReportService.saveHistologyReport(histologyReport);
//    }
//    public void savePathological(){
//        Pathological pathological = new Pathological();
//        //标识患者身份唯一标识
//        pathological.setPersonId();
//        //唯一标识
//        pathological.setUniqueId();
//        //中间库unique_id
//        pathological.setUniqueIdLv3();
//        //医疗机构代码
//        pathological.setP900();
//        //患者id
//        pathological.setPatientId();
//        //住院号
//        pathological.setVisitId();
//        //病理号
//        pathological.setPathologyNo();
//        //收到日期
//        pathological.setInspectTime();
//        //报告日期
//        pathological.setReprotTime();
//        //病理来源
//        pathological.setOrigin();
//        //肝细胞癌的组织学类型
//        pathological.setHistologicalTypes();
//        //癌细胞分化程度
//        pathological.setDegree();
//        //原发性肝细胞癌的分化程度
//        pathological.setPrimaryDegree();
//        //肿瘤与血管关系
//        pathological.setRelationship();
//        //是否侵犯胆管
//        pathological.setInvadeBile();
//        //是否侵犯肝包膜
//        pathological.setInvadeLiver();
//        //是否有肿瘤卫星结节
//        pathological.setInvadeNodule();
//        //是否侵犯淋巴管
//        pathological.setInvadeLymphatic();
//        //脉管侵犯
//        pathological.setInvadeVascular();
//        //是否侵犯神经
//        pathological.setInvadeNerve();
//        //切缘
//        pathological.setCutEdge();
//        //切缘距离
//        pathological.setEdgeDistance();
//        //送检淋巴结总数
//        pathological.setLymphNodeTotal();
//        //淋巴结转移
//        pathological.setIfTransfer();
//        //淋巴结转移数量
//        pathological.setTransferNumber();
//        //阳性淋巴结的部位
//        pathological.setTransferSite();
//        //数据版本
//        pathological.setDataVersion();
//        //数据库来源
//        pathological.setDataDbSource();
//        //数据表来源
//        pathological.setDataTableSource();
//        //数据项来源
//        pathological.setDataFieldSource();
//        //创建时间
//        pathological.setCreatedAt();
//        //创建人
//        pathological.setCreator();
//        //修改时间
//        pathological.setUpdatedAt();
//        pathologicalService.savePathological(pathological);
//    }
//    public void saveImmune(){
//        Immune immune = new Immune();
//        //标识患者身份唯一标识
//        immune.setPersonId();
//        //唯一标识
//        immune.setUniqueId();
//        //中间库unique_id
//        immune.setUniqueIdLv3();
//        //医疗机构代码
//        immune.setP900();
//        //患者id
//        immune.setPatientId();
//        //住院号
//        immune.setVisitId();
//        //检测报告日期时间
//        immune.setDateTime();
//        //检测方法
//        immune.setTestMethod();
//        //检测项目具体名称
//        immune.setTestItemName();
//        //具体检测结果
//        immune.setTestItemValue();
//        //检测位点
//        immune.setMutationSite();
//        //数据版本
//        immune.setDataVersion();
//        //数据库来源
//        immune.setDataDbSource();
//        //数据表来源
//        immune.setDataTableSource();
//        //数据项来源
//        immune.setDataFieldSource();
//        //创建时间
//        immune.setCreatedAt();
//        //创建人
//        immune.setCreator();
//        //修改时间
//        immune.setUpdatedAt();
//        immuneService.saveImmune(immune);
//    }
//    public void saveImmuneStd(){
//        ImmuneStd immuneStd = new ImmuneStd();
//        //标识患者身份唯一标识
//        immuneStd.setPersonId();
//        //唯一标识
//        immuneStd.setUniqueId();
//        //中间库unique_id
//        immuneStd.setUniqueIdLv3();
//        //医疗机构代码
//        immuneStd.setP900();
//        //患者id
//        immuneStd.setPatientId();
//        //住院号
//        immuneStd.setVisitId();
//        //免疫组化检测项目
//        immuneStd.setMarkerName();
//        //免疫组化检测位点
//        immuneStd.setMutationSite();
//        //免疫组化标志物检测定性结果
//        immuneStd.setMarkerQualitative();
//        //免疫组化标志物检测定量结果
//        immuneStd.setMarkerQuantify();
//        //数据版本
//        immuneStd.setDataVersion();
//        //数据库来源
//        immuneStd.setDataDbSource();
//        //数据表来源
//        immuneStd.setDataTableSource();
//        //数据项来源
//        immuneStd.setDataFieldSource();
//        //创建时间
//        immuneStd.setCreatedAt();
//        //创建人
//        immuneStd.setCreator();
//        //修改时间
//        immuneStd.setUpdatedAt();
//        immuneStdService.saveImmuneStd(immuneStd);
//    }
//    public void saveTreatment(){
//        Treatment treatment = new Treatment();
//        //标识患者身份唯一标识
//        treatment.setPersonId();
//        //唯一标识
//        treatment.setUniqueId();
//        //中间库unique_id
//        treatment.setUniqueIdLv3();
//        //医疗机构代码
//        treatment.setP900();
//        //患者id
//        treatment.setPatientId();
//        //住院号
//        treatment.setVisitId();
//        //医嘱类别
//        treatment.setOrderClass();
//        //用药分类
//        treatment.setDrugType();
//        //具体药物名称
//        treatment.setDrugName();
//        //给药途径
//        treatment.setChannel();
//        //药物剂量
//        treatment.setDose();
//        //剂量单位
//        treatment.setUnit();
//        //用药开始日期
//        treatment.setStartDate();
//        //用药结束日期
//        treatment.setEndDate();
//        //数据版本
//        treatment.setDataVersion();
//        //数据库来源
//        treatment.setDataDbSource();
//        //数据表来源
//        treatment.setDataTableSource();
//        //数据项来源
//        treatment.setDataFieldSource();
//        //创建时间
//        treatment.setCreatedAt();
//        //创建人
//        treatment.setCreator();
//        //修改时间
//        treatment.setUpdatedAt();
//        treatmentService.saveTreatment(treatment);
//    }
//    public void saveChemotherapy(){
//        Chemotherapy chemotherapy = new Chemotherapy();
//        //标识患者身份唯一标识
//        chemotherapy.setPersonId();
//        //唯一标识
//        chemotherapy.setUniqueId();
//        //医疗机构代码
//        chemotherapy.setP900();
//        //患者id
//        chemotherapy.setPatientId();
//        //住院号
//        chemotherapy.setVisitId();
//        //中间库unique_id
//        chemotherapy.setUniqueIdLv3();
//        //具体药物名称
//        chemotherapy.setDrugName();
//        //给药途径
//        chemotherapy.setChannel();
//        //药物剂量
//        chemotherapy.setDose();
//        //剂量单位
//        chemotherapy.setUnit();
//        //用药频率
//        chemotherapy.setRate();
//        //用药开始日期
//        chemotherapy.setStartDate();
//        //用药结束日期
//        chemotherapy.setEndDate();
//        //数据版本
//        chemotherapy.setDataVersion();
//        //数据库来源
//        chemotherapy.setDataDbSource();
//        //数据表来源
//        chemotherapy.setDataTableSource();
//        //数据项来源
//        chemotherapy.setDataFieldSource();
//        //创建时间
//        chemotherapy.setCreatedAt();
//        //创建人
//        chemotherapy.setCreator();
//        //修改时间
//        chemotherapy.setUpdatedAt();
//        chemotherapyService.saveChemotherapy(chemotherapy);
//    }
//    public void saveRadiotherapy(){
//        Radiotherapy radiotherapy = new Radiotherapy();
//        //标识患者身份唯一标识
//        radiotherapy.setPersonId();
//        //唯一标识
//        radiotherapy.setUniqueId();
//        //放疗的子表关联
//        radiotherapy.setUniqueIdLv3();
//        //医疗机构代码
//        radiotherapy.setP900();
//        //患者id
//        radiotherapy.setPatientId();
//        //住院号
//        radiotherapy.setVisitId();
//        //放疗开始日期
//        radiotherapy.setRadioBeginTime();
//        //放疗结束日期
//        radiotherapy.setRadioEndTime();
//        //放射源
//        radiotherapy.setRadioSource();
//        //放疗模式
//        radiotherapy.setRadioStyle();
//        //放疗射线能量
//        radiotherapy.setRadioRayEnergy();
//        //放疗部位及剂量
//        radiotherapy.setRadioSiteAndDose();
//        //放疗副反应与分级
//        radiotherapy.setRadioLevel();
//        //责任医生
//        radiotherapy.setRadioDoctor();
//        //疗效评估
//        radiotherapy.setEfficacyEvaluation();
//        //数据版本
//        radiotherapy.setDataVersion();
//        //数据库来源
//        radiotherapy.setDataDbSource();
//        //数据表来源
//        radiotherapy.setDataTableSource();
//        //数据项来源
//        radiotherapy.setDataFieldSource();
//        //创建时间
//        radiotherapy.setCreatedAt();
//        //创建人
//        radiotherapy.setCreator();
//        //修改时间
//        radiotherapy.setUpdatedAt();
//        radiotherapyService.saveRadiotherapy(radiotherapy);
//    }
//    public void saveRadiotherapySite(){
//        RadiotherapySite radiotherapySite = new RadiotherapySite();
//        //标识患者身份唯一标识
//        radiotherapySite.setPersonId();
//        //唯一标识
//        radiotherapySite.setUniqueId();
//        //医疗机构代码
//        radiotherapySite.setP900();
//        //患者id
//        radiotherapySite.setPatientId();
//        //住院号
//        radiotherapySite.setVisitId();
//        //放疗表对应unique_id的外键
//        radiotherapySite.setUniqueIdLv3();
//        //照射部位
//        radiotherapySite.setRadioSite();
//        //放疗总剂量
//        radiotherapySite.setRadioTotal();
//        //数据版本
//        radiotherapySite.setDataVersion();
//        //数据库来源
//        radiotherapySite.setDataDbSource();
//        //数据表来源
//        radiotherapySite.setDataTableSource();
//        //数据项来源
//        radiotherapySite.setDataFieldSource();
//        //创建时间
//        radiotherapySite.setCreatedAt();
//        //创建人
//        radiotherapySite.setCreator();
//        //修改时间
//        radiotherapySite.setUpdatedAt();
//        radiotherapySiteService.saveRadiotherapySite(radiotherapySite);
//    }
//    public void saveCancerPainMaster(){
//        CancerPainMaster cancerPainMaster = new CancerPainMaster();
//        //标识患者身份唯一标识
//        cancerPainMaster.setPersonId();
//        //唯一标识
//        cancerPainMaster.setUniqueId();
//        //医疗机构代码
//        cancerPainMaster.setP900();
//        //患者id
//        cancerPainMaster.setPatientId();
//        //住院号
//        cancerPainMaster.setVisitId();
//        //中间库unique_id
//        cancerPainMaster.setUniqueIdLv3();
//        //具体药物名称
//        cancerPainMaster.setDrugName();
//        //给药途径
//        cancerPainMaster.setChannel();
//        //药物剂量
//        cancerPainMaster.setDose();
//        //用药开始日期
//        cancerPainMaster.setStartDate();
//        //用药结束日期
//        cancerPainMaster.setEndDate();
//        //数据版本
//        cancerPainMaster.setDataVersion();
//        //数据库来源
//        cancerPainMaster.setDataDbSource();
//        //数据表来源
//        cancerPainMaster.setDataTableSource();
//        //数据项来源
//        cancerPainMaster.setDataFieldSource();
//        //创建时间
//        cancerPainMaster.setCreatedAt();
//        //创建人
//        cancerPainMaster.setCreator();
//        //修改时间
//        cancerPainMaster.setUpdatedAt();
//        cancerPainMasterService.saveCancerPainMaster(cancerPainMaster);
//    }
//    public void saveAblation(){
//        Ablation ablation = new Ablation();
//        //标识患者身份唯一标识
//        ablation.setPersonId();
//        //唯一标识
//        ablation.setUniqueId();
//        //医疗机构代码
//        ablation.setP900();
//        //患者id
//        ablation.setPatientId();
//        //住院号
//        ablation.setVisitId();
//        //中间库unique_id
//        ablation.setUniqueIdLv3();
//        //局部消融
//        ablation.setAblation();
//        //局部消融治疗开始日期
//        ablation.setAblationStartDate();
//        //局部消融治疗结束日期
//        ablation.setAblationEndDate();
//        //局部消融治疗通道
//        ablation.setAblationPathway();
//        //局部消融治疗方式（可多种局部消融方式）
//        ablation.setAblationMethods();
//        //肝动脉介入治疗
//        ablation.setTherapy();
//        //肝动脉介入治疗开始日期
//        ablation.setTherapyStartDate();
//        //肝动脉介入治疗结束日期
//        ablation.setTherapyEndDate();
//        //肝动脉介入治疗方式
//        ablation.setTherapyMethods();
//        //肝动脉介入治疗栓塞剂（可多种栓塞剂）
//        ablation.setEmbolic();
//        //肝动脉介入治疗化疗药物（可多种化疗药物）
//        ablation.setDrug();
//        //介入治疗肝肿瘤部位
//        ablation.setSite();
//        //介入治疗肝肿瘤数目
//        ablation.setNumber();
//        //数据版本
//        ablation.setDataVersion();
//        //数据库来源
//        ablation.setDataDbSource();
//        //数据表来源
//        ablation.setDataTableSource();
//        //数据项来源
//        ablation.setDataFieldSource();
//        //创建时间
//        ablation.setCreatedAt();
//        //创建人
//        ablation.setCreator();
//        //修改时间
//        ablation.setUpdatedAt();
//        ablationService.saveAblation(ablation);
//    }
//    public void saveFollowUp(){
//        FollowUp followUp = new FollowUp();
//        //标识患者身份唯一标识
//        followUp.setPersonId();
//        //唯一标识
//        followUp.setUniqueId();
//        //中间库unique_id
//        followUp.setUniqueIdLv3();
//        //医疗机构代码
//        followUp.setP900();
//        //患者id
//        followUp.setPatientId();
//        //住院号
//        followUp.setVisitId();
//        //随访方式
//        followUp.setFollowUpType();
//        //随访日期
//        followUp.setFollowUpDate();
//        //疾病状态
//        followUp.setFollowUpState();
//        //生存情况
//        followUp.setSituation();
//        //药物治疗
//        followUp.setIfMedicine();
//        //药物名称
//        followUp.setMedicineName();
//        //用药剂量
//        followUp.setMedicineDose();
//        //用药持续时间
//        followUp.setMedicineDuration();
//        //死亡原因
//        followUp.setDeathCause ();
//        //死亡日期
//        followUp.setDeathDate();
//        //末次随访日期
//        followUp.setLastDate();
//        //随访检查项目
//        followUp.setFollowItem();
//        //疗效评估
//        followUp.setEfficacyEvaluation();
//        //数据版本
//        followUp.setDataVersion();
//        //数据库来源
//        followUp.setDataDbSource();
//        //数据表来源
//        followUp.setDataTableSource();
//        //数据项来源
//        followUp.setDataFieldSource();
//        //创建时间
//        followUp.setCreatedAt();
//        //创建人
//        followUp.setCreator();
//        //修改时间
//        followUp.setUpdatedAt();
//        followUpService.saveFollowUp(followUp);
//    }


}