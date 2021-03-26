package com.clinical.service.impl;

import com.clinical.constant.Constant;
import com.clinical.dao.cluster.PersonMapper;
import com.clinical.dao.master.*;
import com.clinical.model.cluster.*;
import com.clinical.model.master.*;
import com.clinical.service.*;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;


@Service
public class RuleRunServiceImpl implements RuleRunService {

    private final Logger log= LoggerFactory.getLogger(RuleRunServiceImpl.class);
    @Autowired
    PersonService    personService;


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


    @Autowired
    PrimaryDiagnosisService    primaryDiagnosisService;


    @Autowired
    DiagnosisStageService    diagnosisStageService;


    @Autowired
    InspectionService    inspectionService;


    @Autowired
    ExamMasterService    examMasterService;


    @Autowired
    ExamMasterStdService    examMasterStdService;


    @Autowired
    RabatService    rabatService;


    @Autowired
    ChestCtDesService    chestCtDesService;


    @Autowired
    ChestCtResultService    chestCtResultService;


    @Autowired
    AbdominalCtResultService    abdominalCtResultService;


    @Autowired
    AbdominalCtDesService    abdominalCtDesService;


    @Autowired
    AbdominalMriDesService    abdominalMriDesService;


    @Autowired
    AbdominalMriResultService    abdominalMriResultService;


    @Autowired
    AbdominalUsDesService    abdominalUsDesService;


    @Autowired
    AbdominalUsResultService    abdominalUsResultService;


    @Autowired
    PetCtDesService    petCtDesService;


    @Autowired
    PetCtResultService    petCtResultService;


    @Autowired
    OperationRecordService    operationRecordService;


    @Autowired
    TumorPunctureService    tumorPunctureService;


    @Autowired
    OperationComplicationsService    operationComplicationsService;


    @Autowired
    HistologyReportService    histologyReportService;


    @Autowired
    PathologicalService    pathologicalService;


    @Autowired
    ImmuneService    immuneService;


    @Autowired
    ImmuneStdService    immuneStdService;


    @Autowired
    TreatmentService    treatmentService;


    @Autowired
    ChemotherapyService    chemotherapyService;


    @Autowired
    RadiotherapyService    radiotherapyService;



    @Autowired
    CancerPainMasterService    cancerPainMasterService;


    @Autowired
    AblationService    ablationService;

    @Autowired
    PathologicalLnService  pathologicalLnService;


    @Autowired
    FollowUpService    followUpService;



    @Autowired
    ZjBasyNstdMapper zjBasyNstdMapper;

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
    ZjHistologyReportMapper    zjHistologyReportMapper;

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

    @Autowired
    ZjChestXrEntryResultsMapper    zjChestXrEntryResultsMapper;

    @Autowired
    ZjChestCtDescriptionMapper    zjChestCtDescriptionMapper;

    @Autowired
    ZjChestCtEntryResultsMapper    zjChestCtEntryResultsMapper;

    @Autowired
    ZjAbdomCtDescriptionMapper    zjAbdomCtDescriptionMapper;

    @Autowired
    ZjAbdomCtEntryResultsMapper    zjAbdomCtEntryResultsMapper;

    @Autowired
    ZjAbdomMrDescriptionMapper    zjAbdomMrDescriptionMapper;

    @Autowired
    ZjAbdomMrEntryResultsMapper    zjAbdomMrEntryResultsMapper;

    @Autowired
    ZjPostopCompMapper    zjPostopCompMapper;

    @Autowired
    ZjRadiotherapyMapper    zjRadiotherapyMapper;

    @Autowired
    ZjAbdomUsDescriptionMapper    zjAbdomUsDescriptionMapper;

    @Autowired
    ZjAbdomUsEntryResultsMapper    zjAbdomUsEntryResultsMapper;

    @Autowired
    ZjPetCtDescriptionMapper    zjPetCtDescriptionMapper;

    @Autowired
    ZjPetCtEntryResultsMapper    zjPetCtEntryResultsMapper;

    @Autowired
    ZjSurgicalRecordMapper    zjSurgicalRecordMapper;

    @Autowired
    ZjPhysicalExamParaMapper    zjPhysicalExamParaMapper;

    @Autowired
    ZjInterventionTherapyMapper    zjInterventionTherapyMapper;

    @Autowired
    ZjClinicalDiagMapper    zjClinicalDiagMapper;

    @Autowired
    PersonMapper personMapper;



    @Override
    public Integer runTruncateAllTable(){

        List<String> list=new ArrayList<>();
        list.add("person");
        list.add("visit_record");
        list.add("index_person");
        list.add("index_diagnosis_admit");
        list.add("index_diagnosis_admit_icd");
        list.add("index_diagnosis_clinic");
        list.add("index_diagnosis_clinic_icd");
        list.add("index_operation");
        list.add("index_operation_icd");
        list.add("index_diagnosis_main");
        list.add("index_diagnosis_main_icd");
        list.add("index_diagnosis_other");
        list.add("index_diagnosis_other_icd");
        list.add("index_icu");
        list.add("index_pathology");
        list.add("index_pathology_icd");
        list.add("index_injury");
        list.add("tem_inp_admission_status");
        list.add("person_general");
        list.add("his_person");
        list.add("his_family");
        list.add("his_past");
        list.add("symptom");
        list.add("primary_diagnosis");
        list.add("diagnosis_stage");
        list.add("inspection");
        list.add("exam_master");
        list.add("exam_master_std");
        list.add("chest_ct_result");
        list.add("rabat");
        list.add("chest_ct_des");
        list.add("abdominal_ct_result");
        list.add("abdominal_ct_des");
        list.add("abdominal_mri_result");
        list.add("abdominal_mri_des");
        list.add("abdominal_us_result");
        list.add("abdominal_us_des");
        list.add("pet_ct_result");
        list.add("pet_ct_des");
        list.add("operation_record");
        list.add("tumor_puncture");
        list.add("operation_complications");
        list.add("histology_report");
        list.add("pathological");
        list.add("pathological_ln");
        list.add("immune");
        list.add("immune_std");
        list.add("treatment");
        list.add("chemotherapy");
        list.add("radiotherapy");
        list.add("cancer_pain_master");
        list.add("ablation");
        list.add("follow_up");

        for(String tableName:list){
            personMapper.truncateAllTable(tableName);
        }
        log.info("完成清库操作。。。");

        return  zjTemPatMasterIndexMapper.countAllPerson();
    }


    @Override
    public Integer deleteAlltableByUniqueid(){
        List<String> uniqueId= zjTemPatMasterIndexMapper.findAllUniqueidEveryDayIncr();
        log.info("日更新人数："+uniqueId.size()+"所有表数据");
            personService.deletePerson(uniqueId);
            visitRecordService.deleteVisitRecord(uniqueId);
            indexPersonService.deleteIndexPerson(uniqueId);
            indexDiagnosisAdmitService.deleteIndexDiagnosisAdmit(uniqueId);
            indexDiagnosisAdmitIcdService.deleteIndexDiagnosisAdmitIcd(uniqueId);
            indexDiagnosisClinicService.deleteIndexDiagnosisClinic(uniqueId);
            indexDiagnosisClinicIcdService.deleteIndexDiagnosisClinicIcd(uniqueId);
            indexOperationService.deleteIndexOperation(uniqueId);
            indexOperationIcdService.deleteIndexOperationIcd(uniqueId);
            indexDiagnosisMainService.deleteIndexDiagnosisMain(uniqueId);
            indexDiagnosisMainIcdService.deleteIndexDiagnosisMainIcd(uniqueId);
            indexDiagnosisOtherService.deleteIndexDiagnosisOther(uniqueId);
            indexDiagnosisOtherIcdService.deleteIndexDiagnosisOtherIcd(uniqueId);
            indexIcuService.deleteIndexIcu(uniqueId);
            indexPathologyService.deleteIndexPathology(uniqueId);
            indexPathologyIcdService.deleteIndexPathologyIcd(uniqueId);
            indexInjuryService.deleteIndexInjury(uniqueId);
            temInpAdmissionStatusService.deleteTemInpAdmissionStatus(uniqueId);
            personGeneralService.deletePersonGeneral(uniqueId);
            hisPersonService.deleteHisPerson(uniqueId);
            hisFamilyService.deleteHisFamily(uniqueId);
            hisPastService.deleteHisPast(uniqueId);
            symptomService.deleteSymptom(uniqueId);
            primaryDiagnosisService.deletePrimaryDiagnosis(uniqueId);
            diagnosisStageService.deleteDiagnosisStage(uniqueId);
            inspectionService.deleteInspection(uniqueId);
            examMasterService.deleteExamMaster(uniqueId);
            examMasterStdService.deleteExamMasterStd(uniqueId);
            chestCtResultService.deleteChestCtResult(uniqueId);
            rabatService.deleteRabat(uniqueId);
            chestCtDesService.deleteChestCtDes(uniqueId);
            abdominalCtResultService.deleteAbdominalCtResult(uniqueId);
            abdominalCtDesService.deleteAbdominalCtDes(uniqueId);
            abdominalMriResultService.deleteAbdominalMriResult(uniqueId);
            abdominalMriDesService.deleteAbdominalMriDes(uniqueId);
            abdominalUsResultService.deleteAbdominalUsResult(uniqueId);
            abdominalUsDesService.deleteAbdominalUsDes(uniqueId);
            petCtResultService.deletePetCtResult(uniqueId);
            petCtDesService.deletePetCtDes(uniqueId);
            operationRecordService.deleteOperationRecord(uniqueId);
            tumorPunctureService.deleteTumorPuncture(uniqueId);
            operationComplicationsService.deleteOperationComplications(uniqueId);
            histologyReportService.deleteHistologyReport(uniqueId);
            pathologicalService.deletePathological(uniqueId);
            pathologicalLnService.deletePathologicalLn(uniqueId);
            immuneService.deleteImmune(uniqueId);
            immuneStdService.deleteImmuneStd(uniqueId);
            treatmentService.deleteTreatment(uniqueId);
            chemotherapyService.deleteChemotherapy(uniqueId);
            radiotherapyService.deleteRadiotherapy(uniqueId);
            cancerPainMasterService.deleteCancerPainMaster(uniqueId);
            ablationService.deleteAblation(uniqueId);
            followUpService.deleteFollowUp(uniqueId);




        log.info("完成删除日增人群操作。。。");
        return uniqueId.size();

    }



    @Override
    public void saveRuleRun(Integer pageNo, Integer pageSize, String flag) {

        Map<String,Integer> map=new HashMap<>();
        map.put("pageNo",pageNo);
        map.put("pageSize",pageSize);
        //查找患者列表
        List<TEM_PAT_MASTER_INDEX> zj_TEM_PAT_MASTER_INDEX = zjTemPatMasterIndexMapper.findZjTemPatMasterIndexByUniqueId(map);


        for(TEM_PAT_MASTER_INDEX index: zj_TEM_PAT_MASTER_INDEX) {
            log.info("患者："+index.getUNIQUE_ID());
            //保存患者--------------------------------------------------
//           savePerson(index);

           //患者就诊列表
            List<PAT_VISIT_MASTER> zj_PAT_VISIT_MASTER = zjPatVisitMasterMapper.findZjPatVisitMasterByUniqueId(index.getUNIQUE_ID());
            //就诊其他数据
            for (PAT_VISIT_MASTER master : zj_PAT_VISIT_MASTER) {
                log.info("就诊："+master.getUNIQUE_ID());

                //保存就诊----------------------------------------------------
//                saveVisitRecord(master);

                String uniqueId = master.getUNIQUE_ID();

                Date visitdate=master.getADMISSION_DATE_TIME();

                /*String patient_id=master.getPATIENT_ID();
                //病案首页
                List<BASY_NSTD> zj_BASY_NSTDs = zjBasyNstdMapper.findZjBasyNstdByUniqueId(uniqueId);
                BASY_NSTD zj_BASY_NSTD = null;
                if (zj_BASY_NSTDs.size() > 0) {
                    zj_BASY_NSTD = zj_BASY_NSTDs.get(0);
                }

                List<BASY_OP_STD> zj_BASY_OP_STDs = zjBasyOpStdMapper.findZjBasyOpStdByUniqueId(uniqueId);
                BASY_OP_STD zj_BASY_OP_STD = null;
                if (zj_BASY_OP_STDs.size() > 0) {
                    zj_BASY_OP_STD = zj_BASY_OP_STDs.get(0);
                }

                List<BASY_DIAG_STD> zj_BASY_DIAG_STDs = zjBasyDiagStdMapper.findZjBasyDiagStdByUniqueId(uniqueId);
                BASY_DIAG_STD zj_BASY_DIAG_STD = null;
                if (zj_BASY_DIAG_STDs.size() > 0) {
                    zj_BASY_DIAG_STD = zj_BASY_DIAG_STDs.get(0);
                }
                List<PRIOR_DISEASE_AND_SURGERY>  zj_prior_disease_and_surgery =  zjPriorDiseaseAndSurgeryMapper.findZjPriorDiseaseAndSurgeryByUniqueId(uniqueId);
                List<FAMILY_HISTORY>  zj_family_history =  zjFamilyHistoryMapper.findZjFamilyHistoryByUniqueId(uniqueId);
                List<INP_DIAGNOSIS>  zj_INP_DIAGNOSIS =  zjInpDiagnosisMapper.findZjInpDiagnosisByUniqueId(uniqueId);
                List<NURSING_RECORD>  zj_NURSING_RECORD =  zjNursingRecordMapper.findZjNursingRecordByUniqueId(uniqueId);
                List<SMOKE_AND_DRINK>  zj_smoke_and_drink =  zjSmokeAndDrinkMapper.findZjSmokeAndDrinkByUniqueId(uniqueId);
                List<TEM_INP_ADMISSION_STATUS>  zj_TEM_INP_ADMISSION_STATUS =  zjTemInpAdmissionStatusMapper.findZjTemInpAdmissionStatusByUniqueId(uniqueId);
                List<SYMP_PRESENT> zj_SYMPTOMS= zjSympPresentMapper.findZjSympPresentByUniqueId(uniqueId);
                List<ABDOM_US_DESCRIPTION>  zj_abdom_us_description =  zjAbdomUsDescriptionMapper.findZjAbdomUsDescriptionByUniqueId(uniqueId);
                List<ABDOM_US_ENTRY_RESULTS>  zj_abdom_us_entry_results =  zjAbdomUsEntryResultsMapper.findZjAbdomUsEntryResultsByUniqueId(uniqueId);
                List<EXAM_MASTER>  zj_EXAM_MASTER =  zjExamMasterMapper.findZjExamMasterByUniqueId(uniqueId);
                List<VITAL_RECORD>  zj_VITAL_RECORD =  zjVitalRecordMapper.findZjVitalRecordByUniqueId(uniqueId);

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

                    saveIndexDiagnosisAdmit(zj_BASY_DIAG_STD,patient_id,visitdate,admitdate);
                    saveIndexDiagnosisClinic(zj_BASY_DIAG_STD,patient_id,visitdate,clinicdate);
                    saveIndexDiagnosisMain(zj_BASY_DIAG_STD,patient_id,visitdate,maindate);
                    saveIndexDiagnosisOther(zj_BASY_DIAG_STD,patient_id,visitdate,maindate);
                    saveIndexInjury(zj_BASY_DIAG_STD,patient_id);
                    saveIndexPathology(zj_BASY_DIAG_STD,patient_id,visitdate,pathdate);
                }

                if(zj_BASY_OP_STD!=null){
                    saveIndexOperation(zj_BASY_OP_STD);
                }

                if(zj_NURSING_RECORD!=null&&zj_NURSING_RECORD.size()>0){
                    savePersonGeneral(zj_NURSING_RECORD, zj_VITAL_RECORD);
                }

                if(zj_TEM_INP_ADMISSION_STATUS!=null&&zj_TEM_INP_ADMISSION_STATUS.size()>0){
                    for(TEM_INP_ADMISSION_STATUS tem_inp_admission_status:zj_TEM_INP_ADMISSION_STATUS){
                        saveInpAdmissionStatus(tem_inp_admission_status);
                    }
                }
                if (zj_SYMPTOMS!=null&&zj_SYMPTOMS.size()!=0){
                    saveSymptom(zj_SYMPTOMS);
                }
                if (zj_smoke_and_drink!=null&&zj_smoke_and_drink.size()!=0){
                    saveHisPerson(zj_smoke_and_drink);
                }
                if (zj_family_history!=null&&zj_family_history.size()!=0){
                    saveHisFamily(zj_family_history);
                }
                if (zj_prior_disease_and_surgery!=null&&zj_prior_disease_and_surgery.size()!=0){
                    saveHisPast(zj_prior_disease_and_surgery);
                }
               if(zj_EXAM_MASTER!=null){
                    saveAbdominalUsResult(zj_abdom_us_entry_results, zj_EXAM_MASTER,zj_abdom_us_description);
                }*/

                List<CHEST_CT_ENTRY_RESULTS> zj_CHEST_CT_ENTRY_RESULTS = zjChestCtEntryResultsMapper.findZjChestCtEntryResultsByUniqueId(uniqueId);
                if (zj_CHEST_CT_ENTRY_RESULTS != null && zj_CHEST_CT_ENTRY_RESULTS.size() > 0) {
                    // chest_ct_result and chest_ct_des
                    saveChestCtResultAndChestCtDes(zj_CHEST_CT_ENTRY_RESULTS);
                }

                List<ABDOM_CT_ENTRY_RESULTS> zj_ABDOM_CT_ENTRY_RESULTS = zjAbdomCtEntryResultsMapper.findZjAbdomCtEntryResultsByUniqueId(uniqueId);
                if (zj_ABDOM_CT_ENTRY_RESULTS != null && zj_ABDOM_CT_ENTRY_RESULTS.size() > 0) {
                    // abdom_ct_entry_results and abdom_ct_description
                    saveAbdomCtEntryResultsAndAbdomCtDescription(zj_ABDOM_CT_ENTRY_RESULTS);
                }

                List<ABDOM_MR_ENTRY_RESULTS> zj_ABDOM_MR_ENTRY_RESULTS = zjAbdomMrEntryResultsMapper.findZjAbdomMrEntryResultsByUniqueId(uniqueId);
                if (zj_ABDOM_MR_ENTRY_RESULTS != null && zj_ABDOM_MR_ENTRY_RESULTS.size() > 0) {
                    // abdom_mr_entry_results and abdom_mr_description
                    saveAbdomMrEntryResultsAndAbdomMrDescription(zj_ABDOM_MR_ENTRY_RESULTS);
                }

                List<ABDOM_US_ENTRY_RESULTS> zj_ABDOM_US_ENTRY_RESULTS = zjAbdomUsEntryResultsMapper.findZjAbdomUsEntryResultsByUniqueId(uniqueId);
                if (zj_ABDOM_US_ENTRY_RESULTS != null && zj_ABDOM_US_ENTRY_RESULTS.size() > 0) {
                    // abdom_us_entry_results and abdom_us_description
                    saveAbdominalUsResultAndAbdominalUsDes(zj_ABDOM_US_ENTRY_RESULTS);
                }

                List<PET_CT_ENTRY_RESULTS> zj_PET_CT_ENTRY_RESULTS = zjPetCtEntryResultsMapper.findZjPetCtEntryResultsByUniqueId(uniqueId);
                if (zj_PET_CT_ENTRY_RESULTS != null && zj_PET_CT_ENTRY_RESULTS.size() > 0) {
                    // pet_ct_entry_results and pet_ct_description
                    savePetCtResultsAndPetCtDes(zj_PET_CT_ENTRY_RESULTS);
                }

            }
        }
    }

    public void savePetCtResultsAndPetCtDes(List<PET_CT_ENTRY_RESULTS> zj_PET_CT_ENTRY_RESULTS) {
        List<String> transferSiteList = new ArrayList<>();
        transferSiteList.add("肝");
        transferSiteList.add("腹部");
        transferSiteList.add("颈部");
        transferSiteList.add("锁骨");
        transferSiteList.add("脾");
        transferSiteList.add("胸部");
        transferSiteList.add("盆部");
        transferSiteList.add("肾上腺");
        transferSiteList.add("血管");
        transferSiteList.add("肾");
        transferSiteList.add("胆囊");
        transferSiteList.add("胰");
        transferSiteList.add("膈肌");
        transferSiteList.add("腹股沟");
        transferSiteList.add("头部");
        transferSiteList.add("子宫");
        transferSiteList.add("乳房");
        transferSiteList.add("背部");
        transferSiteList.add("髂骨");
        transferSiteList.add("腋窝");
        transferSiteList.add("膀胱");
        HashSet<String> uniqueIdSet = new HashSet<>();
        // 去重uniqueId
        for (PET_CT_ENTRY_RESULTS pet_ct_entry_results : zj_PET_CT_ENTRY_RESULTS
                ) {
            uniqueIdSet.add(pet_ct_entry_results.getunique_id());
        }
        for (String uniqueId : uniqueIdSet
                ) {
            EXAM_MASTER exam_master = null;
            List<EXAM_MASTER> exam_masterList = zjExamMasterMapper.findZjExamMasterByUniqueId2(uniqueId);
            if (exam_masterList != null && exam_masterList.size() > 0) {
                exam_master = exam_masterList.get(0);
            } else {
                exam_master = new EXAM_MASTER();
            }

            List<PET_CT_ENTRY_RESULTS> pet_ct_entry_resultsList = zjPetCtEntryResultsMapper.findZjPetCtEntryResultsByUniqueId2(uniqueId);
            List<PET_CT_DESCRIPTION> pet_ct_descriptionList = zjPetCtDescriptionMapper.findZjPetCtDescriptionByUniqueId2(uniqueId);

            String examName = exam_master.getEXAM_NAME1_STD() + "," + exam_master.getEXAM_NAME2_STD() + ","
                    + exam_master.getEXAM_NAME3_STD() + "," + exam_master.getEXAM_NAME4_STD() + ","
                    + exam_master.getEXAM_NAME5_STD() + "," + exam_master.getEXAM_NAME6_STD();
            examName = examName.replace("null", "");

            String tumor = null;
            String recrudescence = null;
            String transfer = null;
            String transferSite = null;
            String ascites = null;
            for (PET_CT_ENTRY_RESULTS pet_ct_entry_results : pet_ct_entry_resultsList
                 ) {
                if (StringUtils.isEmpty(pet_ct_entry_results.getneg_std())) {
                    if (((StringUtils.isNotEmpty(pet_ct_entry_results.getstructure_site1_std())
                            && pet_ct_entry_results.getstructure_site1_std().indexOf("肝") != -1)
                            || (StringUtils.isNotEmpty(pet_ct_entry_results.getstructure_site2_std())
                            && pet_ct_entry_results.getstructure_site2_std().indexOf("肝") != -1)
                            || (StringUtils.isNotEmpty(pet_ct_entry_results.getstructure_site3_std())
                            && pet_ct_entry_results.getstructure_site3_std().indexOf("肝") != -1)
                            || (StringUtils.isNotEmpty(pet_ct_entry_results.getstructure_site4_std())
                            && pet_ct_entry_results.getstructure_site4_std().indexOf("肝") != -1)
                            || (StringUtils.isNotEmpty(pet_ct_entry_results.getstructure_site5_std())
                            && pet_ct_entry_results.getstructure_site5_std().indexOf("肝") != -1)
                            || (StringUtils.isNotEmpty(pet_ct_entry_results.getstructure_site6_std())
                            && pet_ct_entry_results.getstructure_site6_std().indexOf("肝") != -1))) {
                        if ((StringUtils.isNotEmpty(pet_ct_entry_results.getnature1_std())
                                && (pet_ct_entry_results.getnature1_std().indexOf("恶性") != -1
                                || pet_ct_entry_results.getnature1_std().indexOf("转移") != -1
                                || pet_ct_entry_results.getnature1_std().indexOf("复发") != -1))
                                || (StringUtils.isNotEmpty(pet_ct_entry_results.getnature2_std())
                                && (pet_ct_entry_results.getnature2_std().indexOf("恶性") != -1
                                || pet_ct_entry_results.getnature2_std().indexOf("转移") != -1
                                || pet_ct_entry_results.getnature2_std().indexOf("复发") != -1))) {
                            tumor = "是";
                        } else if ((StringUtils.isNotEmpty(pet_ct_entry_results.getnature1_std())
                                && (pet_ct_entry_results.getnature1_std().indexOf("良性") != -1))
                                || (StringUtils.isNotEmpty(pet_ct_entry_results.getnature2_std())
                                && (pet_ct_entry_results.getnature2_std().indexOf("良性") != -1))) {
                            tumor = "否";
                        } else if ((StringUtils.isNotEmpty(pet_ct_entry_results.getnature1_std())
                                && (pet_ct_entry_results.getnature1_std().indexOf("无法判断") != -1))
                                || (StringUtils.isNotEmpty(pet_ct_entry_results.getnature2_std())
                                && (pet_ct_entry_results.getnature2_std().indexOf("无法判断") != -1))) {
                            tumor = "无法判断";
                        }

                    }
                    if ((StringUtils.isNotEmpty(pet_ct_entry_results.getnature1_std())
                            && (pet_ct_entry_results.getnature1_std().indexOf("复发") != -1))
                            || (StringUtils.isNotEmpty(pet_ct_entry_results.getnature2_std())
                            && (pet_ct_entry_results.getnature2_std().indexOf("复发") != -1))) {
                        recrudescence = "是";
                    } else if ((StringUtils.isNotEmpty(pet_ct_entry_results.getnature1_std())
                            && (pet_ct_entry_results.getnature1_std().indexOf("无法判断") != -1
                            || pet_ct_entry_results.getnature1_std().indexOf("淋巴结性质无法判断") != -1))
                            || (StringUtils.isNotEmpty(pet_ct_entry_results.getnature2_std())
                            && (pet_ct_entry_results.getnature2_std().indexOf("无法判断") != -1
                            || pet_ct_entry_results.getnature2_std().indexOf("淋巴结性质无法判断") != -1))
                            || (StringUtils.isNotEmpty(pet_ct_entry_results.getmodifier_std())
                            && pet_ct_entry_results.getmodifier_std().indexOf("可能") != -1)) {
                        recrudescence = "无法判断";
                    } else {
                        recrudescence = "否";
                    }
                } else {
                    recrudescence = "否";
                }
                if (StringUtils.isNotEmpty(pet_ct_entry_results.getmodifier_std())
                        && pet_ct_entry_results.getmodifier_std().indexOf("可能") != -1) {
                    tumor = "无法判断";
                }
                // nature-std(1-3)检索到“转移或淋巴结转移”+neg-std为空，为是；
                // nature-std(1-3) 检索到“无法判断或淋巴结性质无法判断”或   modifier-std检索到可能，两者满足其一，为无法判断；
                // 其他情况为否
                if (((StringUtils.isNotEmpty(pet_ct_entry_results.getnature1_std())
                        && (pet_ct_entry_results.getnature1_std().indexOf("转移") != -1
                        || pet_ct_entry_results.getnature1_std().indexOf("淋巴结转移") != -1))
                        || (StringUtils.isNotEmpty(pet_ct_entry_results.getnature2_std())
                        && (pet_ct_entry_results.getnature2_std().indexOf("转移") != -1
                        || pet_ct_entry_results.getnature2_std().indexOf("淋巴结转移") != -1)))
                        && StringUtils.isEmpty(pet_ct_entry_results.getneg_std())) {
                    transfer = "是";
                } else if (((StringUtils.isNotEmpty(pet_ct_entry_results.getnature1_std())
                        && (pet_ct_entry_results.getnature1_std().indexOf("无法判断") != -1
                        || pet_ct_entry_results.getnature1_std().indexOf("淋巴结性质无法判断") != -1))
                        || (StringUtils.isNotEmpty(pet_ct_entry_results.getnature2_std())
                        && (pet_ct_entry_results.getnature2_std().indexOf("无法判断") != -1
                        || pet_ct_entry_results.getnature2_std().indexOf("淋巴结性质无法判断") != -1)))
                        || (StringUtils.isNotEmpty(pet_ct_entry_results.getmodifier_std())
                        && pet_ct_entry_results.getmodifier_std().indexOf("可能") != -1)) {
                    transfer = "无法判断";
                } else {
                    transfer = "否";
                }
                if (StringUtils.isEmpty(pet_ct_entry_results.getneg_std())) {
                    if (((StringUtils.isNotEmpty(pet_ct_entry_results.getlesion1_std())
                            && pet_ct_entry_results.getlesion1_std().indexOf("淋巴结") != -1)
                            || (StringUtils.isNotEmpty(pet_ct_entry_results.getlesion2_std())
                            && pet_ct_entry_results.getlesion2_std().indexOf("淋巴结") != -1)
                            || (StringUtils.isNotEmpty(pet_ct_entry_results.getlesion3_std())
                            && pet_ct_entry_results.getlesion3_std().indexOf("淋巴结") != -1))
                            && ((StringUtils.isNotEmpty(pet_ct_entry_results.getnature1_std())
                            && pet_ct_entry_results.getnature1_std().indexOf("转移") != -1)
                            || (StringUtils.isNotEmpty(pet_ct_entry_results.getnature2_std())
                            && pet_ct_entry_results.getnature2_std().indexOf("转移") != -1))) {
                        transferSite = "淋巴结";
                    } else if (((StringUtils.isNotEmpty(pet_ct_entry_results.getnature1_std())
                            && pet_ct_entry_results.getnature1_std().indexOf("转移") != -1)
                            || (StringUtils.isNotEmpty(pet_ct_entry_results.getnature2_std())
                            && pet_ct_entry_results.getnature2_std().indexOf("转移") != -1))) {
                        if (StringUtils.isNotEmpty(pet_ct_entry_results.getstructure_site1_std())
                                && transferSiteList.contains(pet_ct_entry_results.getstructure_site1_std())) {
                            transferSite = pet_ct_entry_results.getstructure_site1_std();
                        } else if (StringUtils.isNotEmpty(pet_ct_entry_results.getstructure_site2_std())
                                && transferSiteList.contains(pet_ct_entry_results.getstructure_site2_std())) {
                            transferSite = pet_ct_entry_results.getstructure_site2_std();
                        } else if (StringUtils.isNotEmpty(pet_ct_entry_results.getstructure_site3_std())
                                && transferSiteList.contains(pet_ct_entry_results.getstructure_site3_std())) {
                            transferSite = pet_ct_entry_results.getstructure_site3_std();
                        } else if (StringUtils.isNotEmpty(pet_ct_entry_results.getstructure_site4_std())
                                && transferSiteList.contains(pet_ct_entry_results.getstructure_site4_std())) {
                            transferSite = pet_ct_entry_results.getstructure_site4_std();
                        } else if (StringUtils.isNotEmpty(pet_ct_entry_results.getstructure_site5_std())
                                && transferSiteList.contains(pet_ct_entry_results.getstructure_site5_std())) {
                            transferSite = pet_ct_entry_results.getstructure_site5_std();
                        } else if (StringUtils.isNotEmpty(pet_ct_entry_results.getstructure_site6_std())
                                && transferSiteList.contains(pet_ct_entry_results.getstructure_site6_std())) {
                            transferSite = pet_ct_entry_results.getstructure_site6_std();
                        }
                    }
                }

                if (StringUtils.isEmpty(pet_ct_entry_results.getneg_std())) {
                    if (((StringUtils.isNotEmpty(pet_ct_entry_results.getlesion1_std())
                            && pet_ct_entry_results.getlesion1_std().indexOf("腹水") != -1)
                            || (StringUtils.isNotEmpty(pet_ct_entry_results.getlesion2_std())
                            && pet_ct_entry_results.getlesion2_std().indexOf("腹水") != -1)
                            || (StringUtils.isNotEmpty(pet_ct_entry_results.getlesion3_std())
                            && pet_ct_entry_results.getlesion3_std().indexOf("腹水") != -1))
                            && ((StringUtils.isNotEmpty(pet_ct_entry_results.getnature1_std())
                            && pet_ct_entry_results.getnature1_std().indexOf("积液") != -1)
                            || (StringUtils.isNotEmpty(pet_ct_entry_results.getnature2_std())
                            && pet_ct_entry_results.getnature2_std().indexOf("积液") != -1))
                            && ((StringUtils.isNotEmpty(pet_ct_entry_results.getstructure_site1_std())
                            && pet_ct_entry_results.getstructure_site1_std().indexOf("腹部") != -1)
                            || (StringUtils.isNotEmpty(pet_ct_entry_results.getstructure_site2_std())
                            && pet_ct_entry_results.getstructure_site2_std().indexOf("腹部") != -1)
                            || (StringUtils.isNotEmpty(pet_ct_entry_results.getstructure_site3_std())
                            && pet_ct_entry_results.getstructure_site3_std().indexOf("腹部") != -1)
                            || (StringUtils.isNotEmpty(pet_ct_entry_results.getstructure_site4_std())
                            && pet_ct_entry_results.getstructure_site4_std().indexOf("腹部") != -1)
                            || (StringUtils.isNotEmpty(pet_ct_entry_results.getstructure_site5_std())
                            && pet_ct_entry_results.getstructure_site5_std().indexOf("腹部") != -1)
                            || (StringUtils.isNotEmpty(pet_ct_entry_results.getstructure_site6_std())
                            && pet_ct_entry_results.getstructure_site6_std().indexOf("腹部") != -1))) {
                        ascites = "是";
                    }
                }
            }

            // pet_ct_result
            PetCtResult petCtResult = new PetCtResult();
            // unique_id	unique_id
            petCtResult.setUniqueId(exam_master.getUNIQUE_ID());
            // unique_id_lv1	标识患者身份唯一标识
            petCtResult.setUniqueIdLv1(exam_master.getUNIQUE_ID_LV1());
            // unique_id_lv2	唯一标识
            petCtResult.setUniqueIdLv2(exam_master.getUNIQUE_ID_LV2());
            // p900	医疗机构代码
            petCtResult.setP900(exam_master.getP900());
            // patient_id	患者id
            petCtResult.setPatientId(exam_master.getPATIENT_ID());
            // visit_id	就诊标识住院号
            petCtResult.setVisitId(exam_master.getVISIT_ID());
            // exam_no	检查号
            petCtResult.setExamNo(exam_master.getEXAM_NO());
            // exam_name	检查项目
            petCtResult.setExamName(examName);
            // tumor	肝病灶是否恶性
            petCtResult.setTumor(tumor);
            // recrudescence	复发
            petCtResult.setRecrudescence(recrudescence);
            // transfer_site	转移部位
            petCtResult.setTransferSite(transferSite);
            // ascites	腹水
            petCtResult.setAscites(ascites);
            // data_version	数据版本
            petCtResult.setDataVersion(exam_master.getDATA_VERSION());
            // data_db_source	数据库来源
            petCtResult.setDataDbSource(exam_master.getDATA_DB_SOURCE());
            // data_table_source	数据表来源
            petCtResult.setDataTableSource(exam_master.getDATA_TABLE_SOURCE());
            // data_field_source	数据项来源
            petCtResult.setDataFieldSource(exam_master.getDATA_FIELD_SOURCE());
            // created_at	创建时间
            petCtResult.setCreatedAt(exam_master.getCREATED_AT());
            // creator	创建人
            petCtResult.setCreator(exam_master.getCREATOR());
            // updated_at	修改时间
            petCtResult.setUpdatedAt(exam_master.getUPDATED_AT());
            petCtResultService.savePetCtResult(petCtResult);
            log.info("保存petct结论：" + petCtResult.getUniqueId());

            for (PET_CT_DESCRIPTION pet_ct_description : pet_ct_descriptionList
                 ) {
                // pet_ct_des
                PetCtDes petCtDes = new PetCtDes();
                // unique_id	unique_id
                petCtDes.setUniqueId(pet_ct_description.getunique_id());
                // unique_id_lv1	标识患者身份唯一标识
                petCtDes.setUniqueIdLv1(pet_ct_description.getunique_id_lv1());
                // unique_id_lv2	唯一标识
                petCtDes.setUniqueIdLv2(pet_ct_description.getunique_id_lv2());
                // p900	医疗机构代码
                petCtDes.setP900(pet_ct_description.getp900());
                // patient_id	患者id
                petCtDes.setPatientId(pet_ct_description.getpatient_id());
                // visit_id	就诊标识住院号
                petCtDes.setVisitId(pet_ct_description.getvisit_id());
                // exam_no	检查号
                petCtDes.setExamNo(exam_master.getEXAM_NO());
                // exam_name	检查项目
                petCtDes.setExamName(examName);
                // structure	部位
                petCtDes.setStructure(pet_ct_description.getstructure());
                // location	定位
                petCtDes.setLocation(pet_ct_description.getlocation());
                // lesion	病灶
                petCtDes.setLesion(pet_ct_description.getlesion());
                // size	大小
                petCtDes.setSize(pet_ct_description.getsize());
                // quanity	数目
                petCtDes.setQuanity(pet_ct_description.getquantity());
                // structure_std	部位标化
                String structureStd = pet_ct_description.getstructure_sub_site1_std() + ","
                        + pet_ct_description.getstructure_sub_site2_std() + ","
                        + pet_ct_description.getstructure_sub_site3_std() + ","
                        + pet_ct_description.getstructure_sub_site4_std() + ","
                        + pet_ct_description.getstructure_sub_site5_std() + ","
                        + pet_ct_description.getstructure_sub_site6_std();
                structureStd = structureStd.replace("null", "");
                petCtDes.setStructureStd(structureStd);
                // structure_site_std	定位标化
                String structureSiteStd = pet_ct_description.getstructure_site1_std() + ","
                        + pet_ct_description.getstructure_site2_std() + ","
                        + pet_ct_description.getstructure_site3_std() + ","
                        + pet_ct_description.getstructure_site4_std() + ","
                        + pet_ct_description.getstructure_site5_std() + ","
                        + pet_ct_description.getstructure_site6_std();
                structureSiteStd = structureSiteStd.replace("null", "");
                petCtDes.setStructureSiteStd(structureSiteStd);
                // lesion_std	病灶标化
                String lesionStd = pet_ct_description.getlesion1_std() + ","
                        + pet_ct_description.getlesion2_std() + ","
                        + pet_ct_description.getlesion3_std();
                lesionStd = lesionStd.replace("null", "");
                petCtDes.setLesionStd(lesionStd);
                // lesion_type_std	病灶类型标化
                String lesionTypeStd = pet_ct_description.getlesion_type1_std() + ","
                        + pet_ct_description.getlesion_type2_std() + ","
                        + pet_ct_description.getlesion_type3_std();
                lesionTypeStd = lesionTypeStd.replace("null", "");
                petCtDes.setLesionTypeStd(lesionTypeStd);
                // size_std	大小标化
                String sizeStd = pet_ct_description.getsize_max_diam_std() + "*"
                        + pet_ct_description.getsize_median_diam_std() + "*"
                        + pet_ct_description.getsize_min_diam_std()
                        + pet_ct_description.getsize_unit_std();
                sizeStd = sizeStd.replace("null", "");
                petCtDes.setSizeStd(sizeStd);
                // quantity_std	数目标化
                petCtDes.setQuantityStd(pet_ct_description.getquantity_std());
                // tumor_count	肝恶性病灶数目
                String tumorCount = null;
                if (StringUtils.isNotEmpty(tumor) && tumor.indexOf("是") != -1) {
                    if (StringUtils.isNotEmpty(pet_ct_description.getquantity_std())) {
                        tumorCount = pet_ct_description.getquantity_std() + pet_ct_description.getquantity_unit_std();
                    } else {
                        String quantityStd = pet_ct_description.getquantity_std();
                        int quantity = 0;
                        try {
                            quantity = Integer.valueOf(quantityStd);
                        } catch (NumberFormatException e) {
                            quantity = 0;
                        }
                        if (quantity > 1) {
                            tumorCount = "多发";
                        } else {
                            tumorCount = pet_ct_description.getstructure_sub_site1_std() + ","
                                    + pet_ct_description.getstructure_site1_std() + ","
                                    + pet_ct_description.getstructure_sub_site2_std() + ","
                                    + pet_ct_description.getstructure_site2_std() + ","
                                    + pet_ct_description.getstructure_sub_site3_std() + ","
                                    + pet_ct_description.getstructure_site3_std() + ","
                                    + pet_ct_description.getstructure_sub_site4_std() + ","
                                    + pet_ct_description.getstructure_site4_std() + ","
                                    + pet_ct_description.getstructure_sub_site5_std() + ","
                                    + pet_ct_description.getstructure_site5_std() + ","
                                    + pet_ct_description.getstructure_sub_site6_std() + ","
                                    + pet_ct_description.getstructure_site6_std();
                            tumorCount = tumorCount.replace("null", "");
                        }
                    }
                }
                petCtDes.setTumorCount(tumorCount);
                // tumor_size	肝恶性病灶大小
                String tumorSize = null;
                if (StringUtils.isNotEmpty(tumor) && tumor.indexOf("是") != -1) {
                    tumorSize = pet_ct_description.getsize_max_diam_std() + "*"
                            + pet_ct_description.getsize_median_diam_std() + "*"
                            + pet_ct_description.getsize_min_diam_std() + pet_ct_description.getsize_unit_std();
                }
                petCtDes.setTumorSize(tumorSize);
                // transfer_count	转移灶数目
                String transferCount = null;
                if (StringUtils.isNotEmpty(transferSite)) {
                    if (StringUtils.isNotEmpty(pet_ct_description.getquantity_std())) {
                        transferCount = pet_ct_description.getquantity_std() + pet_ct_description.getquantity_unit_std();
                    } else {
                        String quantityStd = pet_ct_description.getquantity_std();
                        int quantity = 0;
                        try {
                            quantity = Integer.valueOf(quantityStd);
                        } catch (NumberFormatException e) {
                            quantity = 0;
                        }
                        if (quantity > 1) {
                            transferCount = "多发";
                        } else {
                            transferCount = pet_ct_description.getstructure_sub_site1_std() + ","
                                    + pet_ct_description.getstructure_site1_std() + ","
                                    + pet_ct_description.getstructure_sub_site2_std() + ","
                                    + pet_ct_description.getstructure_site2_std() + ","
                                    + pet_ct_description.getstructure_sub_site3_std() + ","
                                    + pet_ct_description.getstructure_site3_std() + ","
                                    + pet_ct_description.getstructure_sub_site4_std() + ","
                                    + pet_ct_description.getstructure_site4_std() + ","
                                    + pet_ct_description.getstructure_sub_site5_std() + ","
                                    + pet_ct_description.getstructure_site5_std() + ","
                                    + pet_ct_description.getstructure_sub_site6_std() + ","
                                    + pet_ct_description.getstructure_site6_std();
                            transferCount = tumorCount.replace("null", "");
                        }
                    }
                }
                petCtDes.setTransferCount(transferCount);
                // transfer_size	转移灶大小
                String transferSize = null;
                if (StringUtils.isNotEmpty(transferSite)) {
                    transferSize = pet_ct_description.getsize_max_diam_std() + "*"
                            + pet_ct_description.getsize_median_diam_std() + "*"
                            + pet_ct_description.getsize_min_diam_std() + pet_ct_description.getsize_unit_std();
                }
                petCtDes.setTransferSize(transferSize);
                // data_version	数据版本
                petCtDes.setDataVersion(pet_ct_description.getdata_version());
                // data_db_source	数据库来源
                petCtDes.setDataDbSource(pet_ct_description.getdata_db_source());
                // data_table_source	数据表来源
                petCtDes.setDataTableSource(pet_ct_description.getdata_table_source());
                // data_field_source	数据项来源
                petCtDes.setDataFieldSource(pet_ct_description.getdata_field_source());
                // created_at	创建时间
                petCtDes.setCreatedAt(pet_ct_description.getcreate_time());
                // creator	创建人
                petCtDes.setCreator(pet_ct_description.getcreator());
                // updated_at	修改时间
                petCtDes.setUpdatedAt(exam_master.getUPDATED_AT());
                petCtDesService.savePetCtDes(petCtDes);
                log.info("保存petct描述：" + petCtDes.getUniqueId());

            }

        }
    }

    public void saveAbdominalUsResultAndAbdominalUsDes(List<ABDOM_US_ENTRY_RESULTS> zj_ABDOM_US_ENTRY_RESULTS) {
        List<String> transferSiteList = new ArrayList<>();
        transferSiteList.add("肝");
        transferSiteList.add("腹部");
        transferSiteList.add("颈部");
        transferSiteList.add("锁骨");
        transferSiteList.add("脾");
        transferSiteList.add("胸部");
        transferSiteList.add("盆部");
        transferSiteList.add("肾上腺");
        transferSiteList.add("血管");
        transferSiteList.add("肾");
        transferSiteList.add("胆囊");
        transferSiteList.add("胰");
        transferSiteList.add("膈肌");
        transferSiteList.add("腹股沟");
        transferSiteList.add("头部");
        transferSiteList.add("子宫");
        transferSiteList.add("乳房");
        transferSiteList.add("背部");
        transferSiteList.add("髂骨");
        transferSiteList.add("腋窝");
        transferSiteList.add("膀胱");
        HashSet<String> uniqueIdSet = new HashSet<>();
        // 去重uniqueId
        for (ABDOM_US_ENTRY_RESULTS abdom_us_entry_results : zj_ABDOM_US_ENTRY_RESULTS
                ) {
            uniqueIdSet.add(abdom_us_entry_results.getunique_id());
        }
        for (String uniqueId : uniqueIdSet
                ) {
            EXAM_MASTER exam_master = null;
            List<EXAM_MASTER> exam_masterList = zjExamMasterMapper.findZjExamMasterByUniqueId2(uniqueId);
            if (exam_masterList != null && exam_masterList.size() > 0) {
                exam_master = exam_masterList.get(0);
            } else {
                exam_master = new EXAM_MASTER();
            }

            List<ABDOM_US_ENTRY_RESULTS> abdom_us_entry_resultsList = zjAbdomUsEntryResultsMapper.findZjAbdomUsEntryResultsByUniqueId2(uniqueId);
            List<ABDOM_US_DESCRIPTION> abdom_us_descriptionList = zjAbdomUsDescriptionMapper.findZjAbdomUsDescriptionByUniqueId2(uniqueId);

            String examName = exam_master.getEXAM_NAME1_STD() + "," + exam_master.getEXAM_NAME2_STD() + ","
                    + exam_master.getEXAM_NAME3_STD() + "," + exam_master.getEXAM_NAME4_STD() + ","
                    + exam_master.getEXAM_NAME5_STD() + "," + exam_master.getEXAM_NAME6_STD();
            examName = examName.replace("null", "");

            String tumor = null;
            String recrudescence = null;
            String transfer = null;
            String transferSite = null;
            String ascites = null;
            for (ABDOM_US_ENTRY_RESULTS abdom_us_entry_results : abdom_us_entry_resultsList
                 ) {
                if (StringUtils.isEmpty(abdom_us_entry_results.getneg_std())) {
                    if (((StringUtils.isNotEmpty(abdom_us_entry_results.getstructure_site1_std())
                            && abdom_us_entry_results.getstructure_site1_std().indexOf("肝") != -1)
                            || (StringUtils.isNotEmpty(abdom_us_entry_results.getstructure_site2_std())
                            && abdom_us_entry_results.getstructure_site2_std().indexOf("肝") != -1)
                            || (StringUtils.isNotEmpty(abdom_us_entry_results.getstructure_site3_std())))) {
                        if ((StringUtils.isNotEmpty(abdom_us_entry_results.getnature1_std())
                                && (abdom_us_entry_results.getnature1_std().indexOf("恶性") != -1
                                || abdom_us_entry_results.getnature1_std().indexOf("转移") != -1
                                || abdom_us_entry_results.getnature1_std().indexOf("复发") != -1))
                                || (StringUtils.isNotEmpty(abdom_us_entry_results.getnature2_std())
                                && (abdom_us_entry_results.getnature2_std().indexOf("恶性") != -1
                                || abdom_us_entry_results.getnature2_std().indexOf("转移") != -1
                                || abdom_us_entry_results.getnature2_std().indexOf("复发") != -1))) {
                            tumor = "是";
                        } else if ((StringUtils.isNotEmpty(abdom_us_entry_results.getnature1_std())
                                && (abdom_us_entry_results.getnature1_std().indexOf("良性") != -1))
                                || (StringUtils.isNotEmpty(abdom_us_entry_results.getnature2_std())
                                && (abdom_us_entry_results.getnature2_std().indexOf("良性") != -1))) {
                            tumor = "否";
                        } else if ((StringUtils.isNotEmpty(abdom_us_entry_results.getnature1_std())
                                && (abdom_us_entry_results.getnature1_std().indexOf("无法判断") != -1))
                                || (StringUtils.isNotEmpty(abdom_us_entry_results.getnature2_std())
                                && (abdom_us_entry_results.getnature2_std().indexOf("无法判断") != -1))) {
                            tumor = "无法判断";
                        }

                    }
                    if ((StringUtils.isNotEmpty(abdom_us_entry_results.getnature1_std())
                            && (abdom_us_entry_results.getnature1_std().indexOf("复发") != -1))
                            || (StringUtils.isNotEmpty(abdom_us_entry_results.getnature2_std())
                            && (abdom_us_entry_results.getnature2_std().indexOf("复发") != -1))) {
                        recrudescence = "是";
                    } else if ((StringUtils.isNotEmpty(abdom_us_entry_results.getnature1_std())
                            && (abdom_us_entry_results.getnature1_std().indexOf("无法判断") != -1
                            || abdom_us_entry_results.getnature1_std().indexOf("淋巴结性质无法判断") != -1))
                            || (StringUtils.isNotEmpty(abdom_us_entry_results.getnature2_std())
                            && (abdom_us_entry_results.getnature2_std().indexOf("无法判断") != -1
                            || abdom_us_entry_results.getnature2_std().indexOf("淋巴结性质无法判断") != -1))
                            || (StringUtils.isNotEmpty(abdom_us_entry_results.getmodifier_std())
                            && abdom_us_entry_results.getmodifier_std().indexOf("可能") != -1)) {
                        recrudescence = "无法判断";
                    } else {
                        recrudescence = "否";
                    }
                } else {
                    recrudescence = "否";
                }
                if (StringUtils.isNotEmpty(abdom_us_entry_results.getmodifier_std())
                        && abdom_us_entry_results.getmodifier_std().indexOf("可能") != -1) {
                    tumor = "无法判断";
                }
                // nature-std(1-3)检索到“转移或淋巴结转移”+neg-std为空，为是；
                // nature-std(1-3) 检索到“无法判断或淋巴结性质无法判断”或   modifier-std检索到可能，两者满足其一，为无法判断；
                // 其他情况为否
                if (((StringUtils.isNotEmpty(abdom_us_entry_results.getnature1_std())
                        && (abdom_us_entry_results.getnature1_std().indexOf("转移") != -1
                        || abdom_us_entry_results.getnature1_std().indexOf("淋巴结转移") != -1))
                        || (StringUtils.isNotEmpty(abdom_us_entry_results.getnature2_std())
                        && (abdom_us_entry_results.getnature2_std().indexOf("转移") != -1
                        || abdom_us_entry_results.getnature2_std().indexOf("淋巴结转移") != -1)))
                        && StringUtils.isEmpty(abdom_us_entry_results.getneg_std())) {
                    transfer = "是";
                } else if (((StringUtils.isNotEmpty(abdom_us_entry_results.getnature1_std())
                        && (abdom_us_entry_results.getnature1_std().indexOf("无法判断") != -1
                        || abdom_us_entry_results.getnature1_std().indexOf("淋巴结性质无法判断") != -1))
                        || (StringUtils.isNotEmpty(abdom_us_entry_results.getnature2_std())
                        && (abdom_us_entry_results.getnature2_std().indexOf("无法判断") != -1
                        || abdom_us_entry_results.getnature2_std().indexOf("淋巴结性质无法判断") != -1)))
                        || (StringUtils.isNotEmpty(abdom_us_entry_results.getmodifier_std())
                        && abdom_us_entry_results.getmodifier_std().indexOf("可能") != -1)) {
                    transfer = "无法判断";
                } else {
                    transfer = "否";
                }
                if (StringUtils.isEmpty(abdom_us_entry_results.getneg_std())) {
                    if (((StringUtils.isNotEmpty(abdom_us_entry_results.getlesion1_std())
                            && abdom_us_entry_results.getlesion1_std().indexOf("淋巴结") != -1)
                            || (StringUtils.isNotEmpty(abdom_us_entry_results.getlesion2_std())
                            && abdom_us_entry_results.getlesion2_std().indexOf("淋巴结") != -1))
                            && ((StringUtils.isNotEmpty(abdom_us_entry_results.getnature1_std())
                            && abdom_us_entry_results.getnature1_std().indexOf("转移") != -1)
                            || (StringUtils.isNotEmpty(abdom_us_entry_results.getnature2_std())
                            && abdom_us_entry_results.getnature2_std().indexOf("转移") != -1))) {
                        transferSite = "淋巴结";
                    } else if (((StringUtils.isNotEmpty(abdom_us_entry_results.getnature1_std())
                            && abdom_us_entry_results.getnature1_std().indexOf("转移") != -1)
                            || (StringUtils.isNotEmpty(abdom_us_entry_results.getnature2_std())
                            && abdom_us_entry_results.getnature2_std().indexOf("转移") != -1))) {
                        if (StringUtils.isNotEmpty(abdom_us_entry_results.getstructure_site1_std())
                                && transferSiteList.contains(abdom_us_entry_results.getstructure_site1_std())) {
                            transferSite = abdom_us_entry_results.getstructure_site1_std();
                        } else if (StringUtils.isNotEmpty(abdom_us_entry_results.getstructure_site2_std())
                                && transferSiteList.contains(abdom_us_entry_results.getstructure_site2_std())) {
                            transferSite = abdom_us_entry_results.getstructure_site2_std();
                        } else if (StringUtils.isNotEmpty(abdom_us_entry_results.getstructure_site3_std())
                                && transferSiteList.contains(abdom_us_entry_results.getstructure_site3_std())) {
                            transferSite = abdom_us_entry_results.getstructure_site3_std();
                        }
                    }
                }

                if (StringUtils.isEmpty(abdom_us_entry_results.getneg_std())) {
                    if (((StringUtils.isNotEmpty(abdom_us_entry_results.getlesion1_std())
                            && abdom_us_entry_results.getlesion1_std().indexOf("腹水") != -1)
                            || (StringUtils.isNotEmpty(abdom_us_entry_results.getlesion2_std())
                            && abdom_us_entry_results.getlesion2_std().indexOf("腹水") != -1))
                            && ((StringUtils.isNotEmpty(abdom_us_entry_results.getnature1_std())
                            && abdom_us_entry_results.getnature1_std().indexOf("积液") != -1)
                            || (StringUtils.isNotEmpty(abdom_us_entry_results.getnature2_std())
                            && abdom_us_entry_results.getnature2_std().indexOf("积液") != -1))
                            && ((StringUtils.isNotEmpty(abdom_us_entry_results.getstructure_site1_std())
                            && abdom_us_entry_results.getstructure_site1_std().indexOf("腹部") != -1)
                            || (StringUtils.isNotEmpty(abdom_us_entry_results.getstructure_site2_std())
                            && abdom_us_entry_results.getstructure_site2_std().indexOf("腹部") != -1)
                            || (StringUtils.isNotEmpty(abdom_us_entry_results.getstructure_site3_std())
                            && abdom_us_entry_results.getstructure_site3_std().indexOf("腹部") != -1))) {
                        ascites = "是";
                    }
                }
            }

            // abdominal_us_result
            AbdominalUsResult abdominalUsResult = new AbdominalUsResult();
            // unique_id	unique_id
            abdominalUsResult.setUniqueId(exam_master.getUNIQUE_ID());
            // unique_id_lv1	标识患者身份唯一标识
            abdominalUsResult.setUniqueIdLv1(exam_master.getUNIQUE_ID_LV1());
            // unique_id_lv2	唯一标识
            abdominalUsResult.setUniqueIdLv2(exam_master.getUNIQUE_ID_LV2());
            // p900	医疗机构代码
            abdominalUsResult.setP900(exam_master.getP900());
            // patient_id	患者id
            abdominalUsResult.setPatientId(exam_master.getPATIENT_ID());
            // visit_id	就诊标识住院号
            abdominalUsResult.setVisitId(exam_master.getVISIT_ID());
            // exam_no	检查号
            abdominalUsResult.setExamNo(exam_master.getEXAM_NO());
            // exam_name	检查项目
            abdominalUsResult.setExamName(examName);
            // tumor	肝病灶是否恶性
            abdominalUsResult.setTumor(tumor);
            // recrudescence	复发
            abdominalUsResult.setRecrudescence(recrudescence);
            // transfer	转移
            abdominalUsResult.setTransfer(transfer);
            // transfer_site	转移部位
            abdominalUsResult.setTransferSite(transferSite);
            // ascites	腹水
            abdominalUsResult.setAscites(ascites);
            // data_version	数据版本
            abdominalUsResult.setDataVersion(exam_master.getDATA_VERSION());
            // data_db_source	数据库来源
            abdominalUsResult.setDataDbSource(exam_master.getDATA_DB_SOURCE());
            // data_table_source	数据表来源
            abdominalUsResult.setDataTableSource(exam_master.getDATA_TABLE_SOURCE());
            // data_field_source	数据项来源
            abdominalUsResult.setDataFieldSource(exam_master.getDATA_FIELD_SOURCE());
            // created_at	创建时间
            abdominalUsResult.setCreatedAt(exam_master.getCREATED_AT());
            // creator	创建人
            abdominalUsResult.setCreator(exam_master.getCREATOR());
            // updated_at	修改时间
            abdominalUsResult.setUpdatedAt(exam_master.getUPDATED_AT());
            abdominalUsResultService.saveAbdominalUsResult(abdominalUsResult);
            log.info("保存腹部超声结论：" + abdominalUsResult.getUniqueId());

            for (ABDOM_US_DESCRIPTION abdom_us_description : abdom_us_descriptionList
                 ) {
                // abdominal_us_des
                AbdominalUsDes abdominalUsDes = new AbdominalUsDes();
                // unique_id	unique_id
                abdominalUsDes.setUniqueId(abdom_us_description.getunique_id());
                // unique_id_lv1	标识患者身份唯一标识
                abdominalUsDes.setUniqueIdLv1(abdom_us_description.getunique_id_lv1());
                // unique_id_lv2	唯一标识
                abdominalUsDes.setUniqueIdLv2(abdom_us_description.getunique_id_lv2());
                // p900	医疗机构代码
                abdominalUsDes.setP900(abdom_us_description.getp900());
                // patient_id	患者id
                abdominalUsDes.setPatientId(abdom_us_description.getpatient_id());
                // visit_id	就诊标识住院号
                abdominalUsDes.setVisitId(abdom_us_description.getvisit_id());
                // exam_no	检查号
                abdominalUsDes.setExamNo(exam_master.getEXAM_NO());
                // exam_name	检查项目
                abdominalUsDes.setExamName(examName);
                // structure	部位
                abdominalUsDes.setStructure(abdom_us_description.getstructure());
                // location	定位
                abdominalUsDes.setLocation(abdom_us_description.getfs_location().toString());
                // lesion	病灶
                abdominalUsDes.setLesion(abdom_us_description.getlesion());
                // size	大小
                abdominalUsDes.setSize(abdom_us_description.getsize());
                // quanity	数目
                abdominalUsDes.setQuanity(abdom_us_description.getquantity());
                // structure_std	部位标化
                String structureStd = abdom_us_description.getstructure1_std() + ","
                        + abdom_us_description.getstructure2_std() + ","
                        + abdom_us_description.getstructure3_std() + ","
                        + abdom_us_description.getstructure4_std();
                structureStd = structureStd.replace("null", "");
                abdominalUsDes.setStructureStd(structureStd);
                // structure_site_std	定位标化
                String structureSiteStd = abdom_us_description.getstructure_site1_std() + ","
                        + abdom_us_description.getstructure_site2_std() + ","
                        + abdom_us_description.getstructure_site3_std() + ","
                        + abdom_us_description.getstructure_site4_std();
                structureSiteStd = structureSiteStd.replace("null", "");
                abdominalUsDes.setStructureSiteStd(structureSiteStd);
                // lesion_std	病灶标化
                String lesionStd = abdom_us_description.getlesion_std();
                lesionStd = lesionStd.replace("null", "");
                abdominalUsDes.setLesionStd(lesionStd);
                // lesion_type_std	病灶类型标化
                abdominalUsDes.setLesionTypeStd(null);
                // size_std	大小标化
                String sizeStd = abdom_us_description.getsize_max_diam1_std() + "*"
                        + abdom_us_description.getsize_median_diam1_std() + "*"
                        + abdom_us_description.getsize_min_diam1_std()
                        + abdom_us_description.getsize_unit1_std() + ";"
                        + abdom_us_description.getsize_max_diam2_std() + "*"
                        + abdom_us_description.getsize_median_diam2_std() + "*"
                        + abdom_us_description.getsize_min_diam2_std()
                        + abdom_us_description.getsize_unit2_std();
                sizeStd = sizeStd.replace("null", "");
                abdominalUsDes.setSizeStd(sizeStd);
                // quantity_std	数目标化
                abdominalUsDes.setQuantityStd(abdom_us_description.getquantity_std());
                // tumor_count	肝恶性病灶数目
                String tumorCount = null;
                if (StringUtils.isNotEmpty(tumor) && tumor.indexOf("是") != -1) {
                    if (StringUtils.isNotEmpty(abdom_us_description.getquantity_std())) {
                        tumorCount = abdom_us_description.getquantity_std() + abdom_us_description.getquantity_unit_std();
                    } else {
                        String quantityStd = abdom_us_description.getquantity_std();
                        int quantity = 0;
                        try {
                            quantity = Integer.valueOf(quantityStd);
                        } catch (NumberFormatException e) {
                            quantity = 0;
                        }
                        if (quantity > 1) {
                            tumorCount = "多发";
                        } else {
                            tumorCount = abdom_us_description.getstructure1_std() + ","
                                    + abdom_us_description.getstructure_site1_std() + ","
                                    + abdom_us_description.getstructure2_std() + ","
                                    + abdom_us_description.getstructure_site2_std() + ","
                                    + abdom_us_description.getstructure3_std() + ","
                                    + abdom_us_description.getstructure_site3_std() + ","
                                    + abdom_us_description.getstructure4_std() + ","
                                    + abdom_us_description.getstructure_site4_std();
                            tumorCount = tumorCount.replace("null", "");
                        }
                    }
                }
                abdominalUsDes.setTumorCount(tumorCount);
                // tumor_size	肝恶性病灶大小
                String tumorSize = null;
                if (StringUtils.isNotEmpty(tumor) && tumor.indexOf("是") != -1) {
                    tumorSize = abdom_us_description.getsize_max_diam1_std() + "*"
                            + abdom_us_description.getsize_median_diam1_std() + "*"
                            + abdom_us_description.getsize_min_diam1_std() + abdom_us_description.getsize_unit1_std();
                }
                abdominalUsDes.setTumorSize(tumorSize);
                // transfer_count	转移灶数目
                String transferCount = null;
                if (StringUtils.isNotEmpty(transferSite)) {
                    if (StringUtils.isNotEmpty(abdom_us_description.getquantity_std())) {
                        transferCount = abdom_us_description.getquantity_std() + abdom_us_description.getquantity_unit_std();
                    } else {
                        String quantityStd = abdom_us_description.getquantity_std();
                        int quantity = 0;
                        try {
                            quantity = Integer.valueOf(quantityStd);
                        } catch (NumberFormatException e) {
                            quantity = 0;
                        }
                        if (quantity > 1) {
                            transferCount = "多发";
                        } else {
                            transferCount = abdom_us_description.getstructure1_std() + ","
                                    + abdom_us_description.getstructure_site1_std() + ","
                                    + abdom_us_description.getstructure2_std() + ","
                                    + abdom_us_description.getstructure_site2_std() + ","
                                    + abdom_us_description.getstructure3_std() + ","
                                    + abdom_us_description.getstructure_site3_std() + ","
                                    + abdom_us_description.getstructure4_std() + ","
                                    + abdom_us_description.getstructure_site4_std();
                            transferCount = tumorCount.replace("null", "");
                        }
                    }
                }
                abdominalUsDes.setTransferCount(transferCount);
                // transfer_size	转移灶大小
                String transferSize = null;
                if (StringUtils.isNotEmpty(transferSite)) {
                    transferSize = abdom_us_description.getsize_max_diam1_std() + "*"
                            + abdom_us_description.getsize_median_diam1_std() + "*"
                            + abdom_us_description.getsize_min_diam1_std() + abdom_us_description.getsize_unit1_std();
                }
                abdominalUsDes.setTransferSize(transferSize);
                // data_version	数据版本
                abdominalUsDes.setDataVersion(abdom_us_description.getdata_version());
                // data_db_source	数据库来源
                abdominalUsDes.setDataDbSource(abdom_us_description.getdata_db_source());
                // data_table_source	数据表来源
                abdominalUsDes.setDataTableSource(abdom_us_description.getdata_table_source());
                // data_field_source	数据项来源
                abdominalUsDes.setDataFieldSource(abdom_us_description.getdata_field_source());
                // created_at	创建时间
                abdominalUsDes.setCreatedAt(abdom_us_description.getcreate_time());
                // creator	创建人
                abdominalUsDes.setCreator(abdom_us_description.getcreator());
                // updated_at	修改时间
                abdominalUsDes.setUpdatedAt(exam_master.getUPDATED_AT());
                abdominalUsDesService.saveAbdominalUsDes(abdominalUsDes);
                log.info("保存腹部ct描述：" + abdominalUsDes.getUniqueId());
            }

        }
    }

    public void saveAbdomMrEntryResultsAndAbdomMrDescription(List<ABDOM_MR_ENTRY_RESULTS> zj_ABDOM_MR_ENTRY_RESULTS) {
        List<String> transferSiteList = new ArrayList<>();
        transferSiteList.add("肝");
        transferSiteList.add("腹部");
        transferSiteList.add("颈部");
        transferSiteList.add("锁骨");
        transferSiteList.add("脾");
        transferSiteList.add("胸部");
        transferSiteList.add("盆部");
        transferSiteList.add("肾上腺");
        transferSiteList.add("血管");
        transferSiteList.add("肾");
        transferSiteList.add("胆囊");
        transferSiteList.add("胰");
        transferSiteList.add("膈肌");
        transferSiteList.add("腹股沟");
        transferSiteList.add("头部");
        transferSiteList.add("子宫");
        transferSiteList.add("乳房");
        transferSiteList.add("背部");
        transferSiteList.add("髂骨");
        transferSiteList.add("腋窝");
        transferSiteList.add("膀胱");
        HashSet<String> uniqueIdSet = new HashSet<>();
        // 去重uniqueId
        for (ABDOM_MR_ENTRY_RESULTS abdom_mr_entry_results : zj_ABDOM_MR_ENTRY_RESULTS
                ) {
            uniqueIdSet.add(abdom_mr_entry_results.getunique_id());
        }
        for (String uniqueId : uniqueIdSet
                ) {
            EXAM_MASTER exam_master = null;
            List<EXAM_MASTER> exam_masterList = zjExamMasterMapper.findZjExamMasterByUniqueId2(uniqueId);
            if (exam_masterList != null && exam_masterList.size() > 0) {
                exam_master = exam_masterList.get(0);
            } else {
                exam_master = new EXAM_MASTER();
            }

            List<ABDOM_MR_ENTRY_RESULTS> abdom_mr_entry_resultsList = zjAbdomMrEntryResultsMapper.findZjAbdomMrEntryResultsByUniqueId2(uniqueId);
            List<ABDOM_MR_DESCRIPTION> abdom_mr_descriptionList = zjAbdomMrDescriptionMapper.findZjAbdomMrDescriptionByUniqueId2(uniqueId);

            String examName = exam_master.getEXAM_NAME1_STD() + "," + exam_master.getEXAM_NAME2_STD() + ","
                    + exam_master.getEXAM_NAME3_STD() + "," + exam_master.getEXAM_NAME4_STD() + ","
                    + exam_master.getEXAM_NAME5_STD() + "," + exam_master.getEXAM_NAME6_STD();
            examName = examName.replace("null", "");

            String tumor = null;
            String recrudescence = null;
            String transfer = null;
            String transferSite = null;
            String ascites = null;
            for (ABDOM_MR_ENTRY_RESULTS abdom_mr_entry_results : abdom_mr_entry_resultsList
                 ) {
                if (StringUtils.isEmpty(abdom_mr_entry_results.getneg_std())) {
                    if (((StringUtils.isNotEmpty(abdom_mr_entry_results.getstructure_site1_std())
                            && abdom_mr_entry_results.getstructure_site1_std().indexOf("肝") != -1)
                            || (StringUtils.isNotEmpty(abdom_mr_entry_results.getstructure_site2_std())
                            && abdom_mr_entry_results.getstructure_site2_std().indexOf("肝") != -1)
                            || (StringUtils.isNotEmpty(abdom_mr_entry_results.getstructure_site3_std())
                            && abdom_mr_entry_results.getstructure_site3_std().indexOf("肝") != -1)
                            || (StringUtils.isNotEmpty(abdom_mr_entry_results.getstructure_site4_std())
                            && abdom_mr_entry_results.getstructure_site4_std().indexOf("肝") != -1)
                            || (StringUtils.isNotEmpty(abdom_mr_entry_results.getstructure_site5_std())
                            && abdom_mr_entry_results.getstructure_site5_std().indexOf("肝") != -1)
                            || (StringUtils.isNotEmpty(abdom_mr_entry_results.getstructure_site6_std())
                            && abdom_mr_entry_results.getstructure_site6_std().indexOf("肝") != -1)
                            || (StringUtils.isNotEmpty(abdom_mr_entry_results.getstructure_site7_std())
                            && abdom_mr_entry_results.getstructure_site7_std().indexOf("肝") != -1))) {
                        if ((StringUtils.isNotEmpty(abdom_mr_entry_results.getnature1_std())
                                && (abdom_mr_entry_results.getnature1_std().indexOf("恶性") != -1
                                || abdom_mr_entry_results.getnature1_std().indexOf("转移") != -1
                                || abdom_mr_entry_results.getnature1_std().indexOf("复发") != -1))
                                || (StringUtils.isNotEmpty(abdom_mr_entry_results.getnature2_std())
                                && (abdom_mr_entry_results.getnature2_std().indexOf("恶性") != -1
                                || abdom_mr_entry_results.getnature2_std().indexOf("转移") != -1
                                || abdom_mr_entry_results.getnature2_std().indexOf("复发") != -1))) {
                            tumor = "是";
                        } else if ((StringUtils.isNotEmpty(abdom_mr_entry_results.getnature1_std())
                                && (abdom_mr_entry_results.getnature1_std().indexOf("良性") != -1))
                                || (StringUtils.isNotEmpty(abdom_mr_entry_results.getnature2_std())
                                && (abdom_mr_entry_results.getnature2_std().indexOf("良性") != -1))) {
                            tumor = "否";
                        } else if ((StringUtils.isNotEmpty(abdom_mr_entry_results.getnature1_std())
                                && (abdom_mr_entry_results.getnature1_std().indexOf("无法判断") != -1))
                                || (StringUtils.isNotEmpty(abdom_mr_entry_results.getnature2_std())
                                && (abdom_mr_entry_results.getnature2_std().indexOf("无法判断") != -1))) {
                            tumor = "无法判断";
                        }

                    }
                    if ((StringUtils.isNotEmpty(abdom_mr_entry_results.getnature1_std())
                            && (abdom_mr_entry_results.getnature1_std().indexOf("复发") != -1))
                            || (StringUtils.isNotEmpty(abdom_mr_entry_results.getnature2_std())
                            && (abdom_mr_entry_results.getnature2_std().indexOf("复发") != -1))) {
                        recrudescence = "是";
                    } else if ((StringUtils.isNotEmpty(abdom_mr_entry_results.getnature1_std())
                            && (abdom_mr_entry_results.getnature1_std().indexOf("无法判断") != -1
                            || abdom_mr_entry_results.getnature1_std().indexOf("淋巴结性质无法判断") != -1))
                            || (StringUtils.isNotEmpty(abdom_mr_entry_results.getnature2_std())
                            && (abdom_mr_entry_results.getnature2_std().indexOf("无法判断") != -1
                            || abdom_mr_entry_results.getnature2_std().indexOf("淋巴结性质无法判断") != -1))
                            || (StringUtils.isNotEmpty(abdom_mr_entry_results.getmodifier_std())
                            && abdom_mr_entry_results.getmodifier_std().indexOf("可能") != -1)) {
                        recrudescence = "无法判断";
                    } else {
                        recrudescence = "否";
                    }
                } else {
                    recrudescence = "否";
                }
                if (StringUtils.isNotEmpty(abdom_mr_entry_results.getmodifier_std())
                        && abdom_mr_entry_results.getmodifier_std().indexOf("可能") != -1) {
                    tumor = "无法判断";
                }
                // nature-std(1-3)检索到“转移或淋巴结转移”+neg-std为空，为是；
                // nature-std(1-3) 检索到“无法判断或淋巴结性质无法判断”或   modifier-std检索到可能，两者满足其一，为无法判断；
                // 其他情况为否
                if (((StringUtils.isNotEmpty(abdom_mr_entry_results.getnature1_std())
                        && (abdom_mr_entry_results.getnature1_std().indexOf("转移") != -1
                        || abdom_mr_entry_results.getnature1_std().indexOf("淋巴结转移") != -1))
                        || (StringUtils.isNotEmpty(abdom_mr_entry_results.getnature2_std())
                        && (abdom_mr_entry_results.getnature2_std().indexOf("转移") != -1
                        || abdom_mr_entry_results.getnature2_std().indexOf("淋巴结转移") != -1)))
                        && StringUtils.isEmpty(abdom_mr_entry_results.getneg_std())) {
                    transfer = "是";
                } else if (((StringUtils.isNotEmpty(abdom_mr_entry_results.getnature1_std())
                        && (abdom_mr_entry_results.getnature1_std().indexOf("无法判断") != -1
                        || abdom_mr_entry_results.getnature1_std().indexOf("淋巴结性质无法判断") != -1))
                        || (StringUtils.isNotEmpty(abdom_mr_entry_results.getnature2_std())
                        && (abdom_mr_entry_results.getnature2_std().indexOf("无法判断") != -1
                        || abdom_mr_entry_results.getnature2_std().indexOf("淋巴结性质无法判断") != -1)))
                        || (StringUtils.isNotEmpty(abdom_mr_entry_results.getmodifier_std())
                        && abdom_mr_entry_results.getmodifier_std().indexOf("可能") != -1)) {
                    transfer = "无法判断";
                } else {
                    transfer = "否";
                }
                if (StringUtils.isEmpty(abdom_mr_entry_results.getneg_std())) {
                    if (((StringUtils.isNotEmpty(abdom_mr_entry_results.getlesion1_std())
                            && abdom_mr_entry_results.getlesion1_std().indexOf("淋巴结") != -1)
                            || (StringUtils.isNotEmpty(abdom_mr_entry_results.getlesion2_std())
                            && abdom_mr_entry_results.getlesion2_std().indexOf("淋巴结") != -1)
                            || (StringUtils.isNotEmpty(abdom_mr_entry_results.getlesion3_std())
                            && abdom_mr_entry_results.getlesion3_std().indexOf("淋巴结") != -1))
                            && ((StringUtils.isNotEmpty(abdom_mr_entry_results.getnature1_std())
                            && abdom_mr_entry_results.getnature1_std().indexOf("转移") != -1)
                            || (StringUtils.isNotEmpty(abdom_mr_entry_results.getnature2_std())
                            && abdom_mr_entry_results.getnature2_std().indexOf("转移") != -1))) {
                        transferSite = "淋巴结";
                    } else if (((StringUtils.isNotEmpty(abdom_mr_entry_results.getnature1_std())
                            && abdom_mr_entry_results.getnature1_std().indexOf("转移") != -1)
                            || (StringUtils.isNotEmpty(abdom_mr_entry_results.getnature2_std())
                            && abdom_mr_entry_results.getnature2_std().indexOf("转移") != -1))) {
                        if (StringUtils.isNotEmpty(abdom_mr_entry_results.getstructure_site1_std())
                                && transferSiteList.contains(abdom_mr_entry_results.getstructure_site1_std())) {
                            transferSite = abdom_mr_entry_results.getstructure_site1_std();
                        } else if (StringUtils.isNotEmpty(abdom_mr_entry_results.getstructure_site2_std())
                                && transferSiteList.contains(abdom_mr_entry_results.getstructure_site2_std())) {
                            transferSite = abdom_mr_entry_results.getstructure_site2_std();
                        } else if (StringUtils.isNotEmpty(abdom_mr_entry_results.getstructure_site3_std())
                                && transferSiteList.contains(abdom_mr_entry_results.getstructure_site3_std())) {
                            transferSite = abdom_mr_entry_results.getstructure_site3_std();
                        } else if (StringUtils.isNotEmpty(abdom_mr_entry_results.getstructure_site4_std())
                                && transferSiteList.contains(abdom_mr_entry_results.getstructure_site4_std())) {
                            transferSite = abdom_mr_entry_results.getstructure_site4_std();
                        } else if (StringUtils.isNotEmpty(abdom_mr_entry_results.getstructure_site5_std())
                                && transferSiteList.contains(abdom_mr_entry_results.getstructure_site5_std())) {
                            transferSite = abdom_mr_entry_results.getstructure_site5_std();
                        } else if (StringUtils.isNotEmpty(abdom_mr_entry_results.getstructure_site6_std())
                                && transferSiteList.contains(abdom_mr_entry_results.getstructure_site6_std())) {
                            transferSite = abdom_mr_entry_results.getstructure_site6_std();
                        } else if (StringUtils.isNotEmpty(abdom_mr_entry_results.getstructure_site7_std())
                                && transferSiteList.contains(abdom_mr_entry_results.getstructure_site7_std())) {
                            transferSite = abdom_mr_entry_results.getstructure_site7_std();
                        }
                    }
                }

                if (StringUtils.isEmpty(abdom_mr_entry_results.getneg_std())) {
                    if (((StringUtils.isNotEmpty(abdom_mr_entry_results.getlesion1_std())
                            && abdom_mr_entry_results.getlesion1_std().indexOf("腹水") != -1)
                            || (StringUtils.isNotEmpty(abdom_mr_entry_results.getlesion2_std())
                            && abdom_mr_entry_results.getlesion2_std().indexOf("腹水") != -1)
                            || (StringUtils.isNotEmpty(abdom_mr_entry_results.getlesion3_std())
                            && abdom_mr_entry_results.getlesion3_std().indexOf("腹水") != -1))
                            && ((StringUtils.isNotEmpty(abdom_mr_entry_results.getnature1_std())
                            && abdom_mr_entry_results.getnature1_std().indexOf("积液") != -1)
                            || (StringUtils.isNotEmpty(abdom_mr_entry_results.getnature2_std())
                            && abdom_mr_entry_results.getnature2_std().indexOf("积液") != -1))
                            && ((StringUtils.isNotEmpty(abdom_mr_entry_results.getstructure_site1_std())
                            && abdom_mr_entry_results.getstructure_site1_std().indexOf("腹部") != -1)
                            || (StringUtils.isNotEmpty(abdom_mr_entry_results.getstructure_site2_std())
                            && abdom_mr_entry_results.getstructure_site2_std().indexOf("腹部") != -1)
                            || (StringUtils.isNotEmpty(abdom_mr_entry_results.getstructure_site3_std())
                            && abdom_mr_entry_results.getstructure_site3_std().indexOf("腹部") != -1)
                            || (StringUtils.isNotEmpty(abdom_mr_entry_results.getstructure_site4_std())
                            && abdom_mr_entry_results.getstructure_site4_std().indexOf("腹部") != -1)
                            || (StringUtils.isNotEmpty(abdom_mr_entry_results.getstructure_site5_std())
                            && abdom_mr_entry_results.getstructure_site5_std().indexOf("腹部") != -1)
                            || (StringUtils.isNotEmpty(abdom_mr_entry_results.getstructure_site6_std())
                            && abdom_mr_entry_results.getstructure_site6_std().indexOf("腹部") != -1)
                            || (StringUtils.isNotEmpty(abdom_mr_entry_results.getstructure_site7_std())
                            && abdom_mr_entry_results.getstructure_site7_std().indexOf("腹部") != -1))) {
                        ascites = "是";
                    }
                }
            }

            // abdominal_mri_result
            AbdominalMriResult abdominalMriResult = new AbdominalMriResult();
            // unique_id	unique_id
            abdominalMriResult.setUniqueId(exam_master.getUNIQUE_ID());
            // unique_id_lv1	标识患者身份唯一标识
            abdominalMriResult.setUniqueIdLv1(exam_master.getUNIQUE_ID_LV1());
            // unique_id_lv2	唯一标识
            abdominalMriResult.setUniqueIdLv2(exam_master.getUNIQUE_ID_LV2());
            // p900	医疗机构代码
            abdominalMriResult.setP900(exam_master.getP900());
            // patient_id	患者id
            abdominalMriResult.setPatientId(exam_master.getPATIENT_ID());
            // visit_id	就诊标识住院号
            abdominalMriResult.setVisitId(exam_master.getVISIT_ID());
            // exam_no	检查号
            abdominalMriResult.setExamNo(exam_master.getEXAM_NO());
            // exam_name	检查项目
            abdominalMriResult.setExamName(examName);
            // tumor	肝病灶是否恶性
            abdominalMriResult.setTumor(tumor);
            // recrudescence	复发
            abdominalMriResult.setRecrudescence(recrudescence);
            // transfer	转移
            abdominalMriResult.setTransfer(transfer);
            // transfer_site	转移部位
            abdominalMriResult.setTransferSite(transferSite);
            // ascites	腹水
            abdominalMriResult.setAscites(ascites);
            // data_version	数据版本
            abdominalMriResult.setDataVersion(exam_master.getDATA_VERSION());
            // data_db_source	数据库来源
            abdominalMriResult.setDataDbSource(exam_master.getDATA_DB_SOURCE());
            // data_table_source	数据表来源
            abdominalMriResult.setDataTableSource(exam_master.getDATA_TABLE_SOURCE());
            // data_field_source	数据项来源
            abdominalMriResult.setDataFieldSource(exam_master.getDATA_FIELD_SOURCE());
            // created_at	创建时间
            abdominalMriResult.setCreatedAt(exam_master.getCREATED_AT());
            // creator	创建人
            abdominalMriResult.setCreator(exam_master.getCREATOR());
            // updated_at	修改时间
            abdominalMriResult.setUpdatedAt(exam_master.getUPDATED_AT());
            abdominalMriResultService.saveAbdominalMriResult(abdominalMriResult);
            log.info("保存腹部mri结论：" + abdominalMriResult.getUniqueId());
            for (ABDOM_MR_DESCRIPTION abdom_mr_description : abdom_mr_descriptionList
                 ) {
                // abdominal_mri_des
                AbdominalMriDes abdominalMriDes = new AbdominalMriDes();
                // unique_id	unique_id
                abdominalMriDes.setUniqueId(abdom_mr_description.getunique_id());
                // unique_id_lv1	标识患者身份唯一标识
                abdominalMriDes.setUniqueIdLv1(abdom_mr_description.getunique_id_lv1());
                // unique_id_lv2	唯一标识
                abdominalMriDes.setUniqueIdLv2(abdom_mr_description.getunique_id_lv2());
                // p900	医疗机构代码
                abdominalMriDes.setP900(abdom_mr_description.getp900());
                // patient_id	患者id
                abdominalMriDes.setPatientId(abdom_mr_description.getpatient_id());
                // visit_id	就诊标识住院号
                abdominalMriDes.setVisitId(abdom_mr_description.getvisit_id());
                // exam_no	检查号
                abdominalMriDes.setExamNo(exam_master.getEXAM_NO());
                // exam_name	检查项目
                abdominalMriDes.setExamName(examName);
                // structure	部位
                abdominalMriDes.setStructure(abdom_mr_description.getstructure());
                // location	定位
                abdominalMriDes.setLocation(abdom_mr_description.getlocation());
                // lesion	病灶
                abdominalMriDes.setLesion(abdom_mr_description.getlesion());
                // size	大小
                abdominalMriDes.setSize(abdom_mr_description.getsize());
                // quanity	数目
                abdominalMriDes.setQuanity(abdom_mr_description.getquantity());
                // structure_std	部位标化
                String structureStd = abdom_mr_description.getstructure1_std() + ","
                        + abdom_mr_description.getstructure2_std() + ","
                        + abdom_mr_description.getstructure3_std() + ","
                        + abdom_mr_description.getstructure4_std();
                structureStd = structureStd.replace("null", "");
                abdominalMriDes.setStructureStd(structureStd);
                // structure_site_std	定位标化
                String structureSiteStd = abdom_mr_description.getstructure_site1_std() + ","
                        + abdom_mr_description.getstructure_site2_std() + ","
                        + abdom_mr_description.getstructure_site3_std() + ","
                        + abdom_mr_description.getstructure_site4_std();
                structureSiteStd = structureSiteStd.replace("null", "");
                abdominalMriDes.setStructureSiteStd(structureSiteStd);
                // lesion_std	病灶标化
                String lesionStd = abdom_mr_description.getlesion1_std() + ","
                        + abdom_mr_description.getlesion2_std() + ","
                        + abdom_mr_description.getlesion3_std();
                lesionStd = lesionStd.replace("null", "");
                abdominalMriDes.setLesionStd(lesionStd);
                // lesion_type_std	病灶类型标化
                String lesionTypeStd = abdom_mr_description.getlesion_type1_std() + ","
                        + abdom_mr_description.getlesion_type2_std() + ","
                        + abdom_mr_description.getlesion_type3_std();
                lesionTypeStd = lesionTypeStd.replace("null", "");
                abdominalMriDes.setLesionTypeStd(lesionTypeStd);
                // size_std	大小标化
                String sizeStd = abdom_mr_description.getsize_max_diam1_std() + "*"
                        + abdom_mr_description.getsize_min_diam1_std()
                        + abdom_mr_description.getsize_unit1_std() + ";"
                        + abdom_mr_description.getsize_max_diam2_std() + "*"
                        + abdom_mr_description.getsize_min_diam2_std()
                        + abdom_mr_description.getsize_unit2_std();
                sizeStd = sizeStd.replace("null", "");
                abdominalMriDes.setSizeStd(sizeStd);
                // quantity_std	数目标化
                abdominalMriDes.setQuantityStd(abdom_mr_description.getquantity_std());
                // tumor_count	肝恶性病灶数目
                String tumorCount = null;
                if (StringUtils.isNotEmpty(tumor) && tumor.indexOf("是") != -1) {
                    if (StringUtils.isNotEmpty(abdom_mr_description.getquantity_std())) {
                        tumorCount = abdom_mr_description.getquantity_std() + abdom_mr_description.getquantity_unit_std();
                    } else {
                        String quantityStd = abdom_mr_description.getquantity_std();
                        int quantity = 0;
                        try {
                            quantity = Integer.valueOf(quantityStd);
                        } catch (NumberFormatException e) {
                            quantity = 0;
                        }
                        if (quantity > 1) {
                            tumorCount = "多发";
                        } else {
                            tumorCount = abdom_mr_description.getstructure1_std() + ","
                                    + abdom_mr_description.getstructure_site1_std() + ","
                                    + abdom_mr_description.getstructure2_std() + ","
                                    + abdom_mr_description.getstructure_site2_std() + ","
                                    + abdom_mr_description.getstructure3_std() + ","
                                    + abdom_mr_description.getstructure_site3_std() + ","
                                    + abdom_mr_description.getstructure4_std() + ","
                                    + abdom_mr_description.getstructure_site4_std();
                            tumorCount = tumorCount.replace("null", "");
                        }
                    }
                }
                abdominalMriDes.setTumorCount(tumorCount);
                // tumor_size	肝恶性病灶大小
                String tumorSize = null;
                if (StringUtils.isNotEmpty(tumor) && tumor.indexOf("是") != -1) {
                    tumorSize = abdom_mr_description.getsize_max_diam1_std() + "*"
                            + abdom_mr_description.getsize_min_diam1_std() + abdom_mr_description.getsize_unit1_std();
                }
                abdominalMriDes.setTumorSize(tumorSize);
                // transfer_count	转移灶数目
                String transferCount = null;
                if (StringUtils.isNotEmpty(transferSite)) {
                    if (StringUtils.isNotEmpty(abdom_mr_description.getquantity_std())) {
                        transferCount = abdom_mr_description.getquantity_std() + abdom_mr_description.getquantity_unit_std();
                    } else {
                        String quantityStd = abdom_mr_description.getquantity_std();
                        int quantity = 0;
                        try {
                            quantity = Integer.valueOf(quantityStd);
                        } catch (NumberFormatException e) {
                            quantity = 0;
                        }
                        if (quantity > 1) {
                            transferCount = "多发";
                        } else {
                            transferCount = abdom_mr_description.getstructure1_std() + ","
                                    + abdom_mr_description.getstructure_site1_std() + ","
                                    + abdom_mr_description.getstructure2_std() + ","
                                    + abdom_mr_description.getstructure_site2_std() + ","
                                    + abdom_mr_description.getstructure3_std() + ","
                                    + abdom_mr_description.getstructure_site3_std() + ","
                                    + abdom_mr_description.getstructure4_std() + ","
                                    + abdom_mr_description.getstructure_site4_std();
                            transferCount = tumorCount.replace("null", "");
                        }
                    }
                }
                abdominalMriDes.setTransferCount(transferCount);
                // transfer_size	转移灶大小
                String transferSize = null;
                if (StringUtils.isNotEmpty(transferSite)) {
                    transferSize = abdom_mr_description.getsize_max_diam1_std() + "*"
                            + abdom_mr_description.getsize_min_diam1_std() + abdom_mr_description.getsize_unit1_std();
                }
                abdominalMriDes.setTransferSize(transferSize);
                // data_version	数据版本
                abdominalMriDes.setDataVersion(abdom_mr_description.getdata_version());
                // data_db_source	数据库来源
                abdominalMriDes.setDataDbSource(abdom_mr_description.getdata_db_source());
                // data_table_source	数据表来源
                abdominalMriDes.setDataTableSource(abdom_mr_description.getdata_table_source());
                // data_field_source	数据项来源
                abdominalMriDes.setDataFieldSource(abdom_mr_description.getdata_field_source());
                // created_at	创建时间
                abdominalMriDes.setCreatedAt(abdom_mr_description.getcreate_time());
                // creator	创建人
                abdominalMriDes.setCreator(abdom_mr_description.getcreator());
                // updated_at	修改时间
                abdominalMriDes.setUpdatedAt(exam_master.getUPDATED_AT());
                abdominalMriDesService.saveAbdominalMriDes(abdominalMriDes);
                log.info("保存腹部mri描述：" + abdominalMriDes.getUniqueId());
            }
        }
    }

    public void saveAbdomCtEntryResultsAndAbdomCtDescription(List<ABDOM_CT_ENTRY_RESULTS> zj_ABDOM_CT_ENTRY_RESULTS) {
        List<String> transferSiteList = new ArrayList<>();
        transferSiteList.add("肝");
        transferSiteList.add("腹部");
        transferSiteList.add("颈部");
        transferSiteList.add("锁骨");
        transferSiteList.add("脾");
        transferSiteList.add("胸部");
        transferSiteList.add("盆部");
        transferSiteList.add("肾上腺");
        transferSiteList.add("血管");
        transferSiteList.add("肾");
        transferSiteList.add("胆囊");
        transferSiteList.add("胰");
        transferSiteList.add("膈肌");
        transferSiteList.add("腹股沟");
        transferSiteList.add("头部");
        transferSiteList.add("子宫");
        transferSiteList.add("乳房");
        transferSiteList.add("背部");
        transferSiteList.add("髂骨");
        transferSiteList.add("腋窝");
        transferSiteList.add("膀胱");
        HashSet<String> uniqueIdSet = new HashSet<>();
        // 去重uniqueId
        for (ABDOM_CT_ENTRY_RESULTS abdom_ct_entry_results : zj_ABDOM_CT_ENTRY_RESULTS
                ) {
            uniqueIdSet.add(abdom_ct_entry_results.getunique_id());
        }
        for (String uniqueId : uniqueIdSet
                ) {
            EXAM_MASTER exam_master = null;
            List<EXAM_MASTER> exam_masterList = zjExamMasterMapper.findZjExamMasterByUniqueId2(uniqueId);
            if (exam_masterList != null && exam_masterList.size() > 0) {
                exam_master = exam_masterList.get(0);
            } else {
                exam_master = new EXAM_MASTER();
            }

            List<ABDOM_CT_ENTRY_RESULTS> abdom_ct_entry_resultsList = zjAbdomCtEntryResultsMapper.findZjAbdomCtEntryResultsByUniqueId2(uniqueId);
            List<ABDOM_CT_DESCRIPTION> abdom_ct_descriptionList = zjAbdomCtDescriptionMapper.findZjAbdomCtDescriptionByUniqueId2(uniqueId);

            String examName = exam_master.getEXAM_NAME1_STD() + "," + exam_master.getEXAM_NAME2_STD() + ","
                    + exam_master.getEXAM_NAME3_STD() + "," + exam_master.getEXAM_NAME4_STD() + ","
                    + exam_master.getEXAM_NAME5_STD() + "," + exam_master.getEXAM_NAME6_STD();
            examName = examName.replace("null", "");

            String tumor = null;
            String recrudescence = null;
            String transfer = null;
            String transferSite = null;
            String ascites = null;
            for (ABDOM_CT_ENTRY_RESULTS abdom_ct_entry_results : abdom_ct_entry_resultsList
                 ) {
                if (StringUtils.isEmpty(abdom_ct_entry_results.getneg_std())) {
                    if (((StringUtils.isNotEmpty(abdom_ct_entry_results.getstructure_site1_std())
                        && abdom_ct_entry_results.getstructure_site1_std().indexOf("肝") != -1)
                        || (StringUtils.isNotEmpty(abdom_ct_entry_results.getstructure_site2_std())
                        && abdom_ct_entry_results.getstructure_site2_std().indexOf("肝") != -1)
                        || (StringUtils.isNotEmpty(abdom_ct_entry_results.getstructure_site3_std())
                        && abdom_ct_entry_results.getstructure_site3_std().indexOf("肝") != -1)
                        || (StringUtils.isNotEmpty(abdom_ct_entry_results.getstructure_site4_std())
                        && abdom_ct_entry_results.getstructure_site4_std().indexOf("肝") != -1)
                        || (StringUtils.isNotEmpty(abdom_ct_entry_results.getstructure_site5_std())
                        && abdom_ct_entry_results.getstructure_site5_std().indexOf("肝") != -1)
                        || (StringUtils.isNotEmpty(abdom_ct_entry_results.getstructure_site6_std())
                        && abdom_ct_entry_results.getstructure_site6_std().indexOf("肝") != -1)
                        || (StringUtils.isNotEmpty(abdom_ct_entry_results.getstructure_site7_std())
                        && abdom_ct_entry_results.getstructure_site7_std().indexOf("肝") != -1)
                        || (StringUtils.isNotEmpty(abdom_ct_entry_results.getstructure_site8_std())
                        && abdom_ct_entry_results.getstructure_site8_std().indexOf("肝") != -1)
                        || (StringUtils.isNotEmpty(abdom_ct_entry_results.getstructure_site9_std())
                        && abdom_ct_entry_results.getstructure_site9_std().indexOf("肝") != -1))) {
                        if ((StringUtils.isNotEmpty(abdom_ct_entry_results.getnature1_std())
                                && (abdom_ct_entry_results.getnature1_std().indexOf("恶性") != -1
                                || abdom_ct_entry_results.getnature1_std().indexOf("转移") != -1
                                || abdom_ct_entry_results.getnature1_std().indexOf("复发") != -1))
                                || (StringUtils.isNotEmpty(abdom_ct_entry_results.getnature2_std())
                                && (abdom_ct_entry_results.getnature2_std().indexOf("恶性") != -1
                                || abdom_ct_entry_results.getnature2_std().indexOf("转移") != -1
                                || abdom_ct_entry_results.getnature2_std().indexOf("复发") != -1))
                                || (StringUtils.isNotEmpty(abdom_ct_entry_results.getnature3_std())
                                && (abdom_ct_entry_results.getnature3_std().indexOf("恶性") != -1
                                || abdom_ct_entry_results.getnature3_std().indexOf("转移") != -1
                                || abdom_ct_entry_results.getnature3_std().indexOf("复发") != -1))) {
                            tumor = "是";
                        } else if ((StringUtils.isNotEmpty(abdom_ct_entry_results.getnature1_std())
                                && (abdom_ct_entry_results.getnature1_std().indexOf("良性") != -1))
                                || (StringUtils.isNotEmpty(abdom_ct_entry_results.getnature2_std())
                                && (abdom_ct_entry_results.getnature2_std().indexOf("良性") != -1))
                                || (StringUtils.isNotEmpty(abdom_ct_entry_results.getnature3_std())
                                && (abdom_ct_entry_results.getnature3_std().indexOf("良性") != -1))) {
                            tumor = "否";
                        } else if ((StringUtils.isNotEmpty(abdom_ct_entry_results.getnature1_std())
                                && (abdom_ct_entry_results.getnature1_std().indexOf("无法判断") != -1))
                                || (StringUtils.isNotEmpty(abdom_ct_entry_results.getnature2_std())
                                && (abdom_ct_entry_results.getnature2_std().indexOf("无法判断") != -1))
                                || (StringUtils.isNotEmpty(abdom_ct_entry_results.getnature3_std())
                                && (abdom_ct_entry_results.getnature3_std().indexOf("无法判断") != -1))) {
                            tumor = "无法判断";
                        }

                    }
                    if ((StringUtils.isNotEmpty(abdom_ct_entry_results.getnature1_std())
                            && (abdom_ct_entry_results.getnature1_std().indexOf("复发") != -1))
                            || (StringUtils.isNotEmpty(abdom_ct_entry_results.getnature2_std())
                            && (abdom_ct_entry_results.getnature2_std().indexOf("复发") != -1))
                            || (StringUtils.isNotEmpty(abdom_ct_entry_results.getnature3_std())
                            && (abdom_ct_entry_results.getnature3_std().indexOf("复发") != -1))) {
                        recrudescence = "是";
                    } else if ((StringUtils.isNotEmpty(abdom_ct_entry_results.getnature1_std())
                            && (abdom_ct_entry_results.getnature1_std().indexOf("无法判断") != -1
                                || abdom_ct_entry_results.getnature1_std().indexOf("淋巴结性质无法判断") != -1))
                            || (StringUtils.isNotEmpty(abdom_ct_entry_results.getnature2_std())
                            && (abdom_ct_entry_results.getnature2_std().indexOf("无法判断") != -1
                            || abdom_ct_entry_results.getnature2_std().indexOf("淋巴结性质无法判断") != -1))
                            || (StringUtils.isNotEmpty(abdom_ct_entry_results.getnature3_std())
                            && (abdom_ct_entry_results.getnature3_std().indexOf("无法判断") != -1
                                || abdom_ct_entry_results.getnature3_std().indexOf("淋巴结性质无法判断") != -1))
                            || (StringUtils.isNotEmpty(abdom_ct_entry_results.getmodifier_std())
                                && abdom_ct_entry_results.getmodifier_std().indexOf("可能") != -1)) {
                        recrudescence = "无法判断";
                    } else {
                        recrudescence = "否";
                    }
                } else {
                    recrudescence = "否";
                }
                if (StringUtils.isNotEmpty(abdom_ct_entry_results.getmodifier_std())
                        && abdom_ct_entry_results.getmodifier_std().indexOf("可能") != -1) {
                    tumor = "无法判断";
                }
                // nature-std(1-3)检索到“转移或淋巴结转移”+neg-std为空，为是；
                // nature-std(1-3) 检索到“无法判断或淋巴结性质无法判断”或   modifier-std检索到可能，两者满足其一，为无法判断；
                // 其他情况为否
                if (((StringUtils.isNotEmpty(abdom_ct_entry_results.getnature1_std())
                        && (abdom_ct_entry_results.getnature1_std().indexOf("转移") != -1
                        || abdom_ct_entry_results.getnature1_std().indexOf("淋巴结转移") != -1))
                        || (StringUtils.isNotEmpty(abdom_ct_entry_results.getnature2_std())
                        && (abdom_ct_entry_results.getnature2_std().indexOf("转移") != -1
                        || abdom_ct_entry_results.getnature2_std().indexOf("淋巴结转移") != -1))
                        || (StringUtils.isNotEmpty(abdom_ct_entry_results.getnature3_std())
                        && (abdom_ct_entry_results.getnature3_std().indexOf("转移") != -1
                        || abdom_ct_entry_results.getnature3_std().indexOf("淋巴结转移") != -1)))
                        && StringUtils.isEmpty(abdom_ct_entry_results.getneg_std())) {
                    transfer = "是";
                } else if (((StringUtils.isNotEmpty(abdom_ct_entry_results.getnature1_std())
                        && (abdom_ct_entry_results.getnature1_std().indexOf("无法判断") != -1
                        || abdom_ct_entry_results.getnature1_std().indexOf("淋巴结性质无法判断") != -1))
                        || (StringUtils.isNotEmpty(abdom_ct_entry_results.getnature2_std())
                        && (abdom_ct_entry_results.getnature2_std().indexOf("无法判断") != -1
                        || abdom_ct_entry_results.getnature2_std().indexOf("淋巴结性质无法判断") != -1))
                        || (StringUtils.isNotEmpty(abdom_ct_entry_results.getnature3_std())
                        && (abdom_ct_entry_results.getnature3_std().indexOf("无法判断") != -1
                        || abdom_ct_entry_results.getnature3_std().indexOf("淋巴结性质无法判断") != -1)))
                        || (StringUtils.isNotEmpty(abdom_ct_entry_results.getmodifier_std())
                            && abdom_ct_entry_results.getmodifier_std().indexOf("可能") != -1)) {
                    transfer = "无法判断";
                } else {
                    transfer = "否";
                }
                if (StringUtils.isEmpty(abdom_ct_entry_results.getneg_std())) {
                    if (((StringUtils.isNotEmpty(abdom_ct_entry_results.getlesion1_std())
                            && abdom_ct_entry_results.getlesion1_std().indexOf("淋巴结") != -1)
                            || (StringUtils.isNotEmpty(abdom_ct_entry_results.getlesion2_std())
                            && abdom_ct_entry_results.getlesion2_std().indexOf("淋巴结") != -1)
                            || (StringUtils.isNotEmpty(abdom_ct_entry_results.getlesion3_std())
                            && abdom_ct_entry_results.getlesion3_std().indexOf("淋巴结") != -1))
                            && ((StringUtils.isNotEmpty(abdom_ct_entry_results.getnature1_std())
                    && abdom_ct_entry_results.getnature1_std().indexOf("转移") != -1)
                    || (StringUtils.isNotEmpty(abdom_ct_entry_results.getnature2_std())
                    && abdom_ct_entry_results.getnature2_std().indexOf("转移") != -1)
                    || (StringUtils.isNotEmpty(abdom_ct_entry_results.getnature3_std())
                    && abdom_ct_entry_results.getnature3_std().indexOf("转移") != -1))) {
                        transferSite = "淋巴结";
                    } else if (((StringUtils.isNotEmpty(abdom_ct_entry_results.getnature1_std())
                            && abdom_ct_entry_results.getnature1_std().indexOf("转移") != -1)
                            || (StringUtils.isNotEmpty(abdom_ct_entry_results.getnature2_std())
                            && abdom_ct_entry_results.getnature2_std().indexOf("转移") != -1)
                            || (StringUtils.isNotEmpty(abdom_ct_entry_results.getnature3_std())
                            && abdom_ct_entry_results.getnature3_std().indexOf("转移") != -1))) {
                        if (StringUtils.isNotEmpty(abdom_ct_entry_results.getstructure_site1_std())
                                && transferSiteList.contains(abdom_ct_entry_results.getstructure_site1_std())) {
                            transferSite = abdom_ct_entry_results.getstructure_site1_std();
                        } else if (StringUtils.isNotEmpty(abdom_ct_entry_results.getstructure_site2_std())
                                && transferSiteList.contains(abdom_ct_entry_results.getstructure_site2_std())) {
                            transferSite = abdom_ct_entry_results.getstructure_site2_std();
                        } else if (StringUtils.isNotEmpty(abdom_ct_entry_results.getstructure_site3_std())
                                && transferSiteList.contains(abdom_ct_entry_results.getstructure_site3_std())) {
                            transferSite = abdom_ct_entry_results.getstructure_site3_std();
                        } else if (StringUtils.isNotEmpty(abdom_ct_entry_results.getstructure_site4_std())
                                && transferSiteList.contains(abdom_ct_entry_results.getstructure_site4_std())) {
                            transferSite = abdom_ct_entry_results.getstructure_site4_std();
                        } else if (StringUtils.isNotEmpty(abdom_ct_entry_results.getstructure_site5_std())
                                && transferSiteList.contains(abdom_ct_entry_results.getstructure_site5_std())) {
                            transferSite = abdom_ct_entry_results.getstructure_site5_std();
                        } else if (StringUtils.isNotEmpty(abdom_ct_entry_results.getstructure_site6_std())
                                && transferSiteList.contains(abdom_ct_entry_results.getstructure_site6_std())) {
                            transferSite = abdom_ct_entry_results.getstructure_site6_std();
                        } else if (StringUtils.isNotEmpty(abdom_ct_entry_results.getstructure_site7_std())
                                && transferSiteList.contains(abdom_ct_entry_results.getstructure_site7_std())) {
                            transferSite = abdom_ct_entry_results.getstructure_site7_std();
                        } else if (StringUtils.isNotEmpty(abdom_ct_entry_results.getstructure_site8_std())
                                && transferSiteList.contains(abdom_ct_entry_results.getstructure_site8_std())) {
                            transferSite = abdom_ct_entry_results.getstructure_site8_std();
                        } else if (StringUtils.isNotEmpty(abdom_ct_entry_results.getstructure_site9_std())
                                && transferSiteList.contains(abdom_ct_entry_results.getstructure_site9_std())) {
                            transferSite = abdom_ct_entry_results.getstructure_site9_std();
                        }
                    }
                }

                if (StringUtils.isEmpty(abdom_ct_entry_results.getneg_std())) {
                    if (((StringUtils.isNotEmpty(abdom_ct_entry_results.getlesion1_std())
                    && abdom_ct_entry_results.getlesion1_std().indexOf("腹水") != -1)
                    || (StringUtils.isNotEmpty(abdom_ct_entry_results.getlesion2_std())
                            && abdom_ct_entry_results.getlesion2_std().indexOf("腹水") != -1)
                    || (StringUtils.isNotEmpty(abdom_ct_entry_results.getlesion3_std())
                            && abdom_ct_entry_results.getlesion3_std().indexOf("腹水") != -1))
                            && ((StringUtils.isNotEmpty(abdom_ct_entry_results.getnature1_std())
                    && abdom_ct_entry_results.getnature1_std().indexOf("积液") != -1)
                    || (StringUtils.isNotEmpty(abdom_ct_entry_results.getnature2_std())
                            && abdom_ct_entry_results.getnature2_std().indexOf("积液") != -1)
                    || (StringUtils.isNotEmpty(abdom_ct_entry_results.getnature3_std())
                            && abdom_ct_entry_results.getnature3_std().indexOf("积液") != -1))
                            && ((StringUtils.isNotEmpty(abdom_ct_entry_results.getstructure_site1_std())
                    && abdom_ct_entry_results.getstructure_site1_std().indexOf("腹部") != -1)
                    || (StringUtils.isNotEmpty(abdom_ct_entry_results.getstructure_site2_std())
                            && abdom_ct_entry_results.getstructure_site2_std().indexOf("腹部") != -1)
                    || (StringUtils.isNotEmpty(abdom_ct_entry_results.getstructure_site3_std())
                            && abdom_ct_entry_results.getstructure_site3_std().indexOf("腹部") != -1)
                    || (StringUtils.isNotEmpty(abdom_ct_entry_results.getstructure_site4_std())
                            && abdom_ct_entry_results.getstructure_site4_std().indexOf("腹部") != -1)
                    || (StringUtils.isNotEmpty(abdom_ct_entry_results.getstructure_site5_std())
                            && abdom_ct_entry_results.getstructure_site5_std().indexOf("腹部") != -1)
                    || (StringUtils.isNotEmpty(abdom_ct_entry_results.getstructure_site6_std())
                            && abdom_ct_entry_results.getstructure_site6_std().indexOf("腹部") != -1)
                    || (StringUtils.isNotEmpty(abdom_ct_entry_results.getstructure_site7_std())
                            && abdom_ct_entry_results.getstructure_site7_std().indexOf("腹部") != -1)
                    || (StringUtils.isNotEmpty(abdom_ct_entry_results.getstructure_site8_std())
                            && abdom_ct_entry_results.getstructure_site8_std().indexOf("腹部") != -1)
                    || (StringUtils.isNotEmpty(abdom_ct_entry_results.getstructure_site9_std())
                            && abdom_ct_entry_results.getstructure_site9_std().indexOf("腹部") != -1))) {
                        ascites = "是";
                    }
                }
            }
            // abdominal_ct_result
            AbdominalCtResult abdominalCtResult = new AbdominalCtResult();
            //unique_id	unique_id
            abdominalCtResult.setUniqueId(exam_master.getUNIQUE_ID());
            // unique_id_lv1	标识患者身份唯一标识
            abdominalCtResult.setUniqueIdLv1(exam_master.getUNIQUE_ID_LV1());
            // unique_id_lv2	唯一标识
            abdominalCtResult.setUniqueIdLv2(exam_master.getUNIQUE_ID_LV2());
            // p900	医疗机构代码
            abdominalCtResult.setP900(exam_master.getP900());
            // patient_id	患者id
            abdominalCtResult.setPatientId(exam_master.getPATIENT_ID());
            // visit_id	就诊标识住院号
            abdominalCtResult.setVisitId(exam_master.getVISIT_ID());
            // exam_no	检查号
            abdominalCtResult.setExamNo(exam_master.getEXAM_NO());
            // exam_name	检查项目
            abdominalCtResult.setExamName(examName);
            // tumor	肝病灶是否恶性
            abdominalCtResult.setTumor(tumor);
            // recrudescence	复发
            abdominalCtResult.setRecrudescence(recrudescence);
            // transfer	转移
            abdominalCtResult.setTransfer(transfer);
            // transfer_site	转移部位
            abdominalCtResult.setTransferSite(transferSite);
            // ascites	腹水
            abdominalCtResult.setAscites(ascites);
            // data_version	数据版本
            abdominalCtResult.setDataVersion(exam_master.getDATA_VERSION());
            // data_db_source	数据库来源
            abdominalCtResult.setDataDbSource(exam_master.getDATA_DB_SOURCE());
            // data_table_source	数据表来源
            abdominalCtResult.setDataTableSource(exam_master.getDATA_TABLE_SOURCE());
            // data_field_source	数据项来源
            abdominalCtResult.setDataFieldSource(exam_master.getDATA_FIELD_SOURCE());
            // created_at	创建时间
            abdominalCtResult.setCreatedAt(exam_master.getCREATED_AT());
            // creator	创建人
            abdominalCtResult.setCreator(exam_master.getCREATOR());
            // updated_at	修改时间
            abdominalCtResult.setUpdatedAt(exam_master.getUPDATED_AT());
            abdominalCtResultService.saveAbdominalCtResult(abdominalCtResult);
            log.info("保存腹部ct结论：" + abdominalCtResult.getUniqueId());

            for (ABDOM_CT_DESCRIPTION abdom_ct_description : abdom_ct_descriptionList
                 ) {
                // abdominal_ct_des
                AbdominalCtDes abdominalCtDes = new AbdominalCtDes();
                // unique_id	unique_id
                abdominalCtDes.setUniqueId(abdom_ct_description.getunique_id());
                // unique_id_lv1	标识患者身份唯一标识
                abdominalCtDes.setUniqueIdLv1(abdom_ct_description.getunique_id_lv1());
                // unique_id_lv2	唯一标识
                abdominalCtDes.setUniqueIdLv2(abdom_ct_description.getunique_id_lv2());
                // p900	医疗机构代码
                abdominalCtDes.setP900(abdom_ct_description.getp900());
                // patient_id	患者id
                abdominalCtDes.setPatientId(abdom_ct_description.getpatient_id());
                // visit_id	就诊标识住院号
                abdominalCtDes.setVisitId(abdom_ct_description.getvisit_id());
                // exam_no	检查号
                abdominalCtDes.setExamNo(exam_master.getEXAM_NO());
                // exam_name	检查项目
                abdominalCtDes.setExamName(examName);
                // structure	部位
                abdominalCtDes.setStructure(abdom_ct_description.getstructure());
                // location	定位
                abdominalCtDes.setLocation(abdom_ct_description.getlocation());
                // lesion	病灶
                abdominalCtDes.setLesion(abdom_ct_description.getlesion());
                // size	大小
                abdominalCtDes.setSize(abdom_ct_description.getsize());
                // quanity	数目
                abdominalCtDes.setQuanity(abdom_ct_description.getquantity());
                // structure_std	部位标化
                String structureStd = abdom_ct_description.getstructure1_std() + ","
                        + abdom_ct_description.getstructure2_std() + ","
                        + abdom_ct_description.getstructure3_std() + ","
                        + abdom_ct_description.getstructure4_std() + ","
                        + abdom_ct_description.getstructure5_std() + ","
                        + abdom_ct_description.getstructure6_std() + ","
                        + abdom_ct_description.getstructure7_std() + ","
                        + abdom_ct_description.getstructure8_std();
                structureStd = structureStd.replace("null", "");
                abdominalCtDes.setStructureStd(structureStd);
                // structure_site_std	定位标化
                String structureSiteStd = abdom_ct_description.getstructure_site1_std() + ","
                        + abdom_ct_description.getstructure_site2_std() + ","
                        + abdom_ct_description.getstructure_site3_std() + ","
                        + abdom_ct_description.getstructure_site4_std() + ","
                        + abdom_ct_description.getstructure_site5_std() + ","
                        + abdom_ct_description.getstructure_site6_std() + ","
                        + abdom_ct_description.getstructure_site7_std() + ","
                        + abdom_ct_description.getstructure_site8_std();
                structureSiteStd = structureSiteStd.replace("null", "");
                abdominalCtDes.setStructureSiteStd(structureSiteStd);
                // lesion_std	病灶标化
                String lesionStd = abdom_ct_description.getlesion1_std() + ","
                        + abdom_ct_description.getlesion2_std() + ","
                        + abdom_ct_description.getlesion3_std() + ","
                        + abdom_ct_description.getlesion4_std();
                lesionStd = lesionStd.replace("null", "");
                abdominalCtDes.setLesionStd(lesionStd);
                // lesion_type_std	病灶类型标化
                String lesionTypeStd = abdom_ct_description.getlesion_type1_std() + ","
                        + abdom_ct_description.getlesion_type2_std() + ","
                        + abdom_ct_description.getlesion_type3_std() + ","
                        + abdom_ct_description.getlesion_type4_std();
                lesionTypeStd = lesionTypeStd.replace("null", "");
                abdominalCtDes.setLesionTypeStd(lesionTypeStd);
                // size_std	大小标化
                String sizeStd = abdom_ct_description.getsize_max_diam1_std() + "*"
                        + abdom_ct_description.getsize_median_diam1_std() + "*"
                        + abdom_ct_description.getsize_min_diam1_std()
                        + abdom_ct_description.getsize_unit1_std() + ";"
                        + abdom_ct_description.getsize_max_diam2_std() + "*"
                        + abdom_ct_description.getsize_median_diam2_std() + "*"
                        + abdom_ct_description.getsize_min_diam2_std()
                        + abdom_ct_description.getsize_unit2_std();
                sizeStd = sizeStd.replace("null", "");
                abdominalCtDes.setSizeStd(sizeStd);
                // quantity_std	数目标化
                abdominalCtDes.setQuantityStd(abdom_ct_description.getquantity_std());
                // tumor_count	肝恶性病灶数目
                String tumorCount = null;
                if (StringUtils.isNotEmpty(tumor) && tumor.indexOf("是") != -1) {
                    if (StringUtils.isNotEmpty(abdom_ct_description.getquantity_std())) {
                        tumorCount = abdom_ct_description.getquantity_std() + abdom_ct_description.getquantity_unit_std();
                    } else {
                        String quantityStd = abdom_ct_description.getquantity_std();
                        int quantity = 0;
                        try {
                            quantity = Integer.valueOf(quantityStd);
                        } catch (NumberFormatException e) {
                            quantity = 0;
                        }
                        if (quantity > 1) {
                            tumorCount = "多发";
                        } else {
                            tumorCount = abdom_ct_description.getstructure1_std() + ","
                                    + abdom_ct_description.getstructure_site1_std() + ","
                                    + abdom_ct_description.getstructure2_std() + ","
                                    + abdom_ct_description.getstructure_site2_std() + ","
                                    + abdom_ct_description.getstructure3_std() + ","
                                    + abdom_ct_description.getstructure_site3_std() + ","
                                    + abdom_ct_description.getstructure4_std() + ","
                                    + abdom_ct_description.getstructure_site4_std() + ","
                                    + abdom_ct_description.getstructure5_std() + ","
                                    + abdom_ct_description.getstructure_site5_std() + ","
                                    + abdom_ct_description.getstructure6_std() + ","
                                    + abdom_ct_description.getstructure_site6_std() + ","
                                    + abdom_ct_description.getstructure7_std() + ","
                                    + abdom_ct_description.getstructure_site7_std() + ","
                                    + abdom_ct_description.getstructure8_std() + ","
                                    + abdom_ct_description.getstructure_site8_std();
                            tumorCount = tumorCount.replace("null", "");
                        }
                    }
                }
                abdominalCtDes.setTumorCount(tumorCount);
                // tumor_size	肝恶性病灶大小
                String tumorSize = null;
                if (StringUtils.isNotEmpty(tumor) && tumor.indexOf("是") != -1) {
                    tumorSize = abdom_ct_description.getsize_max_diam1_std() + "*"
                            + abdom_ct_description.getsize_median_diam1_std() + "*"
                            + abdom_ct_description.getsize_min_diam1_std() + abdom_ct_description.getsize_unit1_std();
                }
                abdominalCtDes.setTumorSize(tumorSize);
                // transfer_count	转移灶数目
                String transferCount = null;
                if (StringUtils.isNotEmpty(transferSite)) {
                    if (StringUtils.isNotEmpty(abdom_ct_description.getquantity_std())) {
                        transferCount = abdom_ct_description.getquantity_std() + abdom_ct_description.getquantity_unit_std();
                    } else {
                        String quantityStd = abdom_ct_description.getquantity_std();
                        int quantity = 0;
                        try {
                            quantity = Integer.valueOf(quantityStd);
                        } catch (NumberFormatException e) {
                            quantity = 0;
                        }
                        if (quantity > 1) {
                            transferCount = "多发";
                        } else {
                            transferCount = abdom_ct_description.getstructure1_std() + ","
                                    + abdom_ct_description.getstructure_site1_std() + ","
                                    + abdom_ct_description.getstructure2_std() + ","
                                    + abdom_ct_description.getstructure_site2_std() + ","
                                    + abdom_ct_description.getstructure3_std() + ","
                                    + abdom_ct_description.getstructure_site3_std() + ","
                                    + abdom_ct_description.getstructure4_std() + ","
                                    + abdom_ct_description.getstructure_site4_std() + ","
                                    + abdom_ct_description.getstructure5_std() + ","
                                    + abdom_ct_description.getstructure_site5_std() + ","
                                    + abdom_ct_description.getstructure6_std() + ","
                                    + abdom_ct_description.getstructure_site6_std() + ","
                                    + abdom_ct_description.getstructure7_std() + ","
                                    + abdom_ct_description.getstructure_site7_std() + ","
                                    + abdom_ct_description.getstructure8_std() + ","
                                    + abdom_ct_description.getstructure_site8_std();
                            transferCount = tumorCount.replace("null", "");
                        }
                    }
                }
                abdominalCtDes.setTransferCount(transferCount);
                // transfer_size	转移灶大小
                String transferSize = null;
                if (StringUtils.isNotEmpty(transferSite)) {
                    transferSize = abdom_ct_description.getsize_max_diam1_std() + "*"
                            + abdom_ct_description.getsize_median_diam1_std() + "*"
                            + abdom_ct_description.getsize_min_diam1_std() + abdom_ct_description.getsize_unit1_std();
                }
                abdominalCtDes.setTransferSize(transferSize);
                // data_version	数据版本
                abdominalCtDes.setDataVersion(abdom_ct_description.getdata_version());
                // data_db_source	数据库来源
                abdominalCtDes.setDataDbSource(abdom_ct_description.getdata_db_source());
                // data_table_source	数据表来源
                abdominalCtDes.setDataTableSource(abdom_ct_description.getdata_table_source());
                // data_field_source	数据项来源
                abdominalCtDes.setDataFieldSource(abdom_ct_description.getdata_field_source());
                // created_at	创建时间
                abdominalCtDes.setCreatedAt(abdom_ct_description.getcreate_time());
                // creator	创建人
                abdominalCtDes.setCreator(abdom_ct_description.getcreator());
                // updated_at	修改时间
                abdominalCtDes.setUpdatedAt(exam_master.getUPDATED_AT());
                abdominalCtDesService.saveAbdominalCtDes(abdominalCtDes);
                log.info("保存腹部ct描述：" + abdominalCtDes.getUniqueId());
            }
        }
    }

    public void saveChestCtResultAndChestCtDes(List<CHEST_CT_ENTRY_RESULTS> zj_CHEST_CT_ENTRY_RESULTS) {
        HashSet<String> uniqueIdSet = new HashSet<>();
        // 去重uniqueId
        for (CHEST_CT_ENTRY_RESULTS chest_ct_entry_results : zj_CHEST_CT_ENTRY_RESULTS
                ) {
            uniqueIdSet.add(chest_ct_entry_results.getunique_id());
        }
        for (String uniqueId : uniqueIdSet
                ) {
            EXAM_MASTER exam_master = null;
            List<EXAM_MASTER> exam_masterList = zjExamMasterMapper.findZjExamMasterByUniqueId2(uniqueId);
            if (exam_masterList != null && exam_masterList.size() > 0) {
                exam_master = exam_masterList.get(0);
            } else {
                exam_master = new EXAM_MASTER();
            }
            // 结论
            List<CHEST_CT_ENTRY_RESULTS> chest_ct_entry_resultsList = zjChestCtEntryResultsMapper.findZjChestCtEntryResultsByUniqueId2(uniqueId);
            // 描述
            List<CHEST_CT_DESCRIPTION> chest_ct_descriptionsList = zjChestCtDescriptionMapper.findZjChestCtDescriptionByUniqueId2(uniqueId);
            String transfer = null;
            String resTransferSite = null;
            String natureQuantityStd = null;
            for (CHEST_CT_ENTRY_RESULTS chest_ct_entry_results : chest_ct_entry_resultsList
                 ) {
                if (((StringUtils.isNotEmpty(chest_ct_entry_results.getnature1_std())
                        && chest_ct_entry_results.getnature1_std().indexOf("转移") != -1)
                        || (StringUtils.isNotEmpty(chest_ct_entry_results.getnature2_std())
                        && chest_ct_entry_results.getnature2_std().indexOf("转移") != -1))
                        && StringUtils.isEmpty(chest_ct_entry_results.getneg_std())) {
                    transfer = "是";
                } else if ((StringUtils.isNotEmpty(chest_ct_entry_results.getnature1_std())
                        && chest_ct_entry_results.getnature1_std().indexOf("无法判断") != -1)
                        || (StringUtils.isNotEmpty(chest_ct_entry_results.getnature2_std())
                        && chest_ct_entry_results.getnature2_std().indexOf("淋巴结性质无法判断") != -1)
                        || (StringUtils.isNotEmpty(chest_ct_entry_results.getmodifier_std())
                        && chest_ct_entry_results.getmodifier_std().indexOf("可能") != -1)) {
                    transfer = "无法判断";
                } else {
                    transfer = "否";
                }

                if (((StringUtils.isNotEmpty(chest_ct_entry_results.getlesion1_std())
                        && chest_ct_entry_results.getlesion1_std().indexOf("淋巴结") != -1)
                        || (StringUtils.isNotEmpty(chest_ct_entry_results.getlesion2_std())
                        && chest_ct_entry_results.getlesion2_std().indexOf("淋巴结") != -1)
                        || (StringUtils.isNotEmpty(chest_ct_entry_results.getlesion3_std())
                        && chest_ct_entry_results.getlesion3_std().indexOf("淋巴结") != -1))
                        && ((StringUtils.isNotEmpty(chest_ct_entry_results.getnature1_std())
                        && chest_ct_entry_results.getnature1_std().indexOf("转移") != -1)
                        || (StringUtils.isNotEmpty(chest_ct_entry_results.getnature2_std())
                        && chest_ct_entry_results.getnature2_std().indexOf("转移") != -1))) {
                    resTransferSite = "淋巴结";
                } else {
                    String structure = chest_ct_entry_results.getstructure1_std() + ","
                            + chest_ct_entry_results.getstructure_site1_std() + ","
                            + chest_ct_entry_results.getstructure2_std() + ","
                            + chest_ct_entry_results.getstructure_site2_std() + ","
                            + chest_ct_entry_results.getstructure3_std() + ","
                            + chest_ct_entry_results.getstructure_site3_std() + ","
                            + chest_ct_entry_results.getstructure4_std() + ","
                            + chest_ct_entry_results.getstructure_site4_std() + ","
                            + chest_ct_entry_results.getstructure5_std() + ","
                            + chest_ct_entry_results.getstructure_site5_std();
                    structure = structure.replace("null", "");
                    resTransferSite = structure;
                }

                if (StringUtils.isNotEmpty(chest_ct_entry_results.getnature_quantity_std())) {
                    natureQuantityStd = chest_ct_entry_results.getnature_quantity_std();
                }
            }
            String examName = exam_master.getEXAM_NAME1_STD() + "," + exam_master.getEXAM_NAME2_STD() + ","
                    + exam_master.getEXAM_NAME3_STD() + "," + exam_master.getEXAM_NAME4_STD() + ","
                    + exam_master.getEXAM_NAME5_STD() + "," + exam_master.getEXAM_NAME6_STD();
            examName = examName.replace("null", "");
            // chest_ct_result
            ChestCtResult chestCtResult = new ChestCtResult();
            // unique_id	unique_id
            chestCtResult.setUniqueId(exam_master.getUNIQUE_ID());
            // unique_id_lv1	标识患者身份唯一标识
            chestCtResult.setUniqueIdLv1(exam_master.getUNIQUE_ID_LV1());
            // unique_id_lv2	唯一标识
            chestCtResult.setUniqueIdLv2(exam_master.getUNIQUE_ID_LV2());
            // p900	医疗机构代码
            chestCtResult.setP900(exam_master.getP900());
            // patient_id	患者id
            chestCtResult.setPatientId(exam_master.getPATIENT_ID());
            // visit_id	就诊标识住院号
            chestCtResult.setVisitId(exam_master.getVISIT_ID());
            // exam_no	检查号
            chestCtResult.setExamNo(exam_master.getEXAM_NO());
            // exam_name	检查项目
            chestCtResult.setExamName(examName);
            // transfer	转移
            chestCtResult.setTransfer(transfer);
            // res_transfer_site	转移部位
            chestCtResult.setResTransferSite(resTransferSite);
            // data_version	数据版本
            chestCtResult.setDataVersion(exam_master.getDATA_VERSION());
            // data_db_source	数据库来源
            chestCtResult.setDataDbSource(exam_master.getDATA_DB_SOURCE());
            // data_table_source	数据表来源
            chestCtResult.setDataTableSource(exam_master.getDATA_TABLE_SOURCE());
            // data_field_source	数据项来源
            chestCtResult.setDataFieldSource(exam_master.getDATA_FIELD_SOURCE());
            // created_at	创建时间
            chestCtResult.setCreatedAt(exam_master.getCREATED_AT());
            // creator	创建人
            chestCtResult.setCreator(exam_master.getCREATOR());
            // updated_at	修改时间
            chestCtResult.setUpdatedAt(exam_master.getUPDATED_AT());
            chestCtResultService.saveChestCtResult(chestCtResult);
            log.info("保存胸部ct结论：" + chestCtResult.getUniqueId());

            for (CHEST_CT_DESCRIPTION chest_ct_description : chest_ct_descriptionsList
                 ) {
                // chest_ct_result
                ChestCtDes chestCtDes = new ChestCtDes();
                // unique_id	unique_id
                chestCtDes.setUniqueId(chest_ct_description.getunique_id());
                // unique_id_lv1	标识患者身份唯一标识
                chestCtDes.setUniqueIdLv1(chest_ct_description.getunique_id_lv1());
                // unique_id_lv2	唯一标识
                chestCtDes.setUniqueIdLv2(chest_ct_description.getunique_id_lv2());
                // p900	医疗机构代码
                chestCtDes.setP900(chest_ct_description.getp900());
                // patient_id	患者id
                chestCtDes.setPatientId(chest_ct_description.getpatient_id());
                // visit_id	就诊标识住院号
                chestCtDes.setVisitId(chest_ct_description.getvisit_id());
                // exam_no	检查号
                chestCtDes.setExamNo(exam_master.getEXAM_NO());
                // exam_name	检查项目
                chestCtDes.setExamName(examName);
                // structure	部位
                chestCtDes.setStructure(chest_ct_description.getstructure());
                // location	定位
                chestCtDes.setLocation(chest_ct_description.getlocation());
                // lesion	病灶
                chestCtDes.setLesion(chest_ct_description.getlesion());
                // size	大小
                chestCtDes.setSize(chest_ct_description.getsize());
                // quanity	数目
                chestCtDes.setQuanity(chest_ct_description.getquantity());
                // structure_std	部位标化
                String structureStd = chest_ct_description.getstructure1_std() + ","
                        + chest_ct_description.getstructure2_std() + ","
                        + chest_ct_description.getstructure3_std() + ","
                        + chest_ct_description.getstructure4_std() + ","
                        + chest_ct_description.getstructure5_std() + ","
                        + chest_ct_description.getstructure6_std() + ","
                        + chest_ct_description.getstructure7_std();
                structureStd = structureStd.replace("null", "");
                chestCtDes.setStructureStd(structureStd);
                // structure_site_std	定位标化
                String structureSiteStd = chest_ct_description.getstructure_site1_std() + ","
                        + chest_ct_description.getstructure_site2_std() + ","
                        + chest_ct_description.getstructure_site3_std() + ","
                        + chest_ct_description.getstructure_site4_std() + ","
                        + chest_ct_description.getstructure_site5_std() + ","
                        + chest_ct_description.getstructure_site6_std() + ","
                        + chest_ct_description.getstructure_site7_std();
                structureSiteStd.replace("null", "");
                chestCtDes.setStructureSiteStd(structureSiteStd);
                // lesion_std	病灶标化
                String lesionStd = chest_ct_description.getlesion1_std() + ","
                        + chest_ct_description.getlesion2_std() + ","
                        + chest_ct_description.getlesion3_std() + ","
                        + chest_ct_description.getlesion4_std();
                lesionStd.replace("null", "");
                chestCtDes.setLesionStd(lesionStd);
                // lesion_type_std	病灶类型标化
                String lesionTypeStd = chest_ct_description.getlesion_type1_std() + ","
                        + chest_ct_description.getlesion_type2_std() + ","
                        + chest_ct_description.getlesion_type3_std() + ","
                        + chest_ct_description.getlesion_type4_std();
                lesionTypeStd = lesionTypeStd.replace("null", "");
                chestCtDes.setLesionTypeStd(lesionTypeStd);
                // size_std	大小标化
                String sizeStd = chest_ct_description.getsize_max_diam1_std() + "*"
                        + chest_ct_description.getsize_median_diam1_std() + "*" + chest_ct_description.getsize_min_diam1_std()
                        + chest_ct_description.getsize_unit1_std() + ";"
                        + chest_ct_description.getsize_max_diam2_std() + "*"
                         + chest_ct_description.getsize_min_diam2_std()
                        + chest_ct_description.getsize_unit2_std() + ";"
                        + chest_ct_description.getsize_max_diam3_std() + "*"
                        + chest_ct_description.getsize_min_diam3_std()
                        + chest_ct_description.getsize_unit3_std();
                sizeStd = sizeStd.replace("null", "");
                chestCtDes.setSizeStd(sizeStd);
                // quantity_std	数目标化
                chestCtDes.setQuantityStd(chest_ct_description.getquantity_std());
                // des_transfer_count	转移灶数目
                String desTransferCount = null;
                if (StringUtils.isNotEmpty(transfer) && transfer.indexOf("是") != -1) {
                    if (StringUtils.isNotEmpty(chest_ct_description.getquantity_std())) {
                        desTransferCount = chest_ct_description.getquantity_std() + chest_ct_description.getquantity_unit_std();
                    } else if (StringUtils.isNotEmpty(natureQuantityStd)) {
                        desTransferCount = natureQuantityStd + chest_ct_description.getquantity_unit_std();
                    } else {
                        String quantityStd = chest_ct_description.getquantity_std();
                        int quantity = 0;
                        try {
                            quantity = Integer.valueOf(quantityStd);
                        } catch (NumberFormatException e) {
                            quantity = 0;
                        }
                        if (quantity > 1) {
                            desTransferCount = "多发";
                        } else {
                            desTransferCount = chest_ct_description.getstructure1_std() + ","
                                    + chest_ct_description.getstructure_site1_std() + ","
                                    + chest_ct_description.getstructure2_std() + ","
                                    + chest_ct_description.getstructure_site2_std() + ","
                                    + chest_ct_description.getstructure3_std() + ","
                                    + chest_ct_description.getstructure_site3_std() + ","
                                    + chest_ct_description.getstructure4_std() + ","
                                    + chest_ct_description.getstructure_site4_std() + ","
                                    + chest_ct_description.getstructure5_std() + ","
                                    + chest_ct_description.getstructure_site5_std() + ","
                                    + chest_ct_description.getstructure6_std() + ","
                                    + chest_ct_description.getstructure_site6_std() + ","
                                    + chest_ct_description.getstructure7_std() + ","
                                    + chest_ct_description.getstructure_site7_std();
                            desTransferCount = desTransferCount.replace("null", "");
                        }
                    }
                }
                chestCtDes.setDesTransferCount(desTransferCount);
                // des_transfer_size	转移灶大小
                String desTransferSize = null;
                if (StringUtils.isNotEmpty(transfer) && transfer.indexOf("是") != -1) {
                    desTransferSize = sizeStd;
                }
                chestCtDes.setDesTransferSize(desTransferSize);
                // data_version	数据版本
                chestCtDes.setDataVersion(chest_ct_description.getdata_version());
                // data_db_source	数据库来源
                chestCtDes.setDataDbSource(chest_ct_description.getdata_db_source());
                // data_table_source	数据表来源
                chestCtDes.setDataTableSource(chest_ct_description.getdata_table_source());
                // data_field_source	数据项来源
                chestCtDes.setDataFieldSource(chest_ct_description.getdata_field_source());
                // created_at	创建时间
                chestCtDes.setCreatedAt(chest_ct_description.getcreate_time());
                // creator	创建人
                chestCtDes.setCreator(chest_ct_description.getcreator());
                // updated_at	修改时间
                chestCtDes.setUpdatedAt(exam_master.getUPDATED_AT());
                chestCtDesService.saveChestCtDes(chestCtDes);
                log.info("保存胸部ct描述：" + chestCtDes.getUniqueId());
            }

        }
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
        person.setUpdatedAt(new Date());
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
    public void saveIndexOperation(BASY_OP_STD zj_BASY_STD){
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


            if(zj_BASY_STD.getP492_ICD9_NAME1_STD()!=null){
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
                indexOperationIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexOperationIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                indexOperationIcd.setOptId(indexOperation.getId());
                //手术/操作编码
                indexOperationIcd.setOptIcdcode(zj_BASY_STD.getP492_ICD9_ID1_STD());
                //手术/操作名称
                indexOperationIcd.setOptIcddesc(zj_BASY_STD.getP492_ICD9_NAME1_STD());
                indexOperationIcdService.saveIndexOperationIcd(indexOperationIcd);


            }
            if(zj_BASY_STD.getP492_ICD9_NAME2_STD()!=null){
                IndexOperationIcd indexOperationIcd =new IndexOperationIcd();
                indexOperationIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexOperationIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexOperationIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexOperationIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexOperationIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexOperationIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                indexOperationIcd.setOptId(indexOperation.getId());
                //手术/操作编码
                indexOperationIcd.setOptIcdcode(zj_BASY_STD.getP492_ICD9_ID2_STD());
                //手术/操作名称
                indexOperationIcd.setOptIcddesc(zj_BASY_STD.getP492_ICD9_NAME2_STD());
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

            if(zj_BASY_STD.getP4913_ICD9_NAME1_STD()!=null){

                IndexOperationIcd indexOperationIcd =new IndexOperationIcd();
                indexOperationIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexOperationIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexOperationIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexOperationIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexOperationIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexOperationIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                indexOperationIcd.setOptId(indexOperation.getId());
                //手术/操作编码
                indexOperationIcd.setOptIcdcode(zj_BASY_STD.getP4913_ICD9_ID1_STD());
                //手术/操作名称
                indexOperationIcd.setOptIcddesc(zj_BASY_STD.getP4913_ICD9_NAME1_STD());
                indexOperationIcdService.saveIndexOperationIcd(indexOperationIcd);

            }
            if(zj_BASY_STD.getP4913_ICD9_NAME2_STD()!=null){

                IndexOperationIcd indexOperationIcd =new IndexOperationIcd();
                indexOperationIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexOperationIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexOperationIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexOperationIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexOperationIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexOperationIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                indexOperationIcd.setOptId(indexOperation.getId());
                //手术/操作编码
                indexOperationIcd.setOptIcdcode(zj_BASY_STD.getP4913_ICD9_ID2_STD());
                //手术/操作名称
                indexOperationIcd.setOptIcddesc(zj_BASY_STD.getP4913_ICD9_NAME2_STD());
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

            if (zj_BASY_STD.getP4924_ICD9_NAME1_STD() != null) {

                IndexOperationIcd indexOperationIcd =new IndexOperationIcd();
                indexOperationIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexOperationIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexOperationIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexOperationIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexOperationIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexOperationIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                indexOperationIcd.setOptId(indexOperation.getId());
                //手术/操作编码
                indexOperationIcd.setOptIcdcode(zj_BASY_STD.getP4924_ICD9_ID1_STD());
                //手术/操作名称
                indexOperationIcd.setOptIcddesc(zj_BASY_STD.getP4924_ICD9_NAME1_STD());
                indexOperationIcdService.saveIndexOperationIcd(indexOperationIcd);
            }
            if (zj_BASY_STD.getP4924_ICD9_NAME2_STD() != null) {
                IndexOperationIcd indexOperationIcd =new IndexOperationIcd();
                indexOperationIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexOperationIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexOperationIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexOperationIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexOperationIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexOperationIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                indexOperationIcd.setOptId(indexOperation.getId());
                //手术/操作编码
                indexOperationIcd.setOptIcdcode(zj_BASY_STD.getP4924_ICD9_ID2_STD());
                //手术/操作名称
                indexOperationIcd.setOptIcddesc(zj_BASY_STD.getP4924_ICD9_NAME2_STD());
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

            if (zj_BASY_STD.getP4535_ICD9_NAME1_STD() != null) {
                IndexOperationIcd indexOperationIcd =new IndexOperationIcd();
                indexOperationIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexOperationIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexOperationIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexOperationIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexOperationIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexOperationIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                indexOperationIcd.setOptId(indexOperation.getId());
                //手术/操作编码
                indexOperationIcd.setOptIcdcode(zj_BASY_STD.getP4535_ICD9_ID1_STD());
                //手术/操作名称
                indexOperationIcd.setOptIcddesc(zj_BASY_STD.getP4535_ICD9_NAME1_STD());
                indexOperationIcdService.saveIndexOperationIcd(indexOperationIcd);
            }
            if (zj_BASY_STD.getP4535_ICD9_NAME2_STD() != null) {
                IndexOperationIcd indexOperationIcd =new IndexOperationIcd();
                indexOperationIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexOperationIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexOperationIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexOperationIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexOperationIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexOperationIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                indexOperationIcd.setOptId(indexOperation.getId());
                //手术/操作编码
                indexOperationIcd.setOptIcdcode(zj_BASY_STD.getP4535_ICD9_ID2_STD());
                //手术/操作名称
                indexOperationIcd.setOptIcddesc(zj_BASY_STD.getP4535_ICD9_NAME2_STD());
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
            if (zj_BASY_STD.getP4546_ICD9_NAME1_STD() != null) {
                IndexOperationIcd indexOperationIcd =new IndexOperationIcd();
                indexOperationIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexOperationIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexOperationIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexOperationIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexOperationIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexOperationIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                indexOperationIcd.setOptId(indexOperation.getId());
                //手术/操作编码
                indexOperationIcd.setOptIcdcode(zj_BASY_STD.getP4546_ICD9_ID1_STD());
                //手术/操作名称
                indexOperationIcd.setOptIcddesc(zj_BASY_STD.getP4546_ICD9_NAME1_STD());
                indexOperationIcdService.saveIndexOperationIcd(indexOperationIcd);

            }
            if( zj_BASY_STD.getP4546_ICD9_NAME2_STD() != null) {
                IndexOperationIcd indexOperationIcd =new IndexOperationIcd();
                indexOperationIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexOperationIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexOperationIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexOperationIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexOperationIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexOperationIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                indexOperationIcd.setOptId(indexOperation.getId());
                //手术/操作编码
                indexOperationIcd.setOptIcdcode(zj_BASY_STD.getP4546_ICD9_ID2_STD());
                //手术/操作名称
                indexOperationIcd.setOptIcddesc(zj_BASY_STD.getP4546_ICD9_NAME2_STD());
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

            if (zj_BASY_STD.getP45004_ICD9_NAME1_STD() != null) {
                IndexOperationIcd indexOperationIcd =new IndexOperationIcd();
                indexOperationIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexOperationIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexOperationIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexOperationIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexOperationIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexOperationIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                indexOperationIcd.setOptId(indexOperation.getId());
                //手术/操作编码
                indexOperationIcd.setOptIcdcode(zj_BASY_STD.getP45004_ICD9_ID1_STD());
                //手术/操作名称
                indexOperationIcd.setOptIcddesc(zj_BASY_STD.getP45004_ICD9_NAME1_STD());
                indexOperationIcdService.saveIndexOperationIcd(indexOperationIcd);
            }
            if ( zj_BASY_STD.getP45004_ICD9_NAME2_STD() != null) {
                IndexOperationIcd indexOperationIcd =new IndexOperationIcd();
                indexOperationIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexOperationIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexOperationIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexOperationIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexOperationIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexOperationIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                indexOperationIcd.setOptId(indexOperation.getId());
                //手术/操作编码
                indexOperationIcd.setOptIcdcode(zj_BASY_STD.getP45004_ICD9_ID2_STD());
                //手术/操作名称
                indexOperationIcd.setOptIcddesc(zj_BASY_STD.getP45004_ICD9_NAME2_STD());
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
            if ( zj_BASY_STD.getP45016_ICD9_NAME1_STD() != null) {
                IndexOperationIcd indexOperationIcd =new IndexOperationIcd();
                indexOperationIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());

                //标识患者身份唯一标识
                indexOperationIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexOperationIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexOperationIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexOperationIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexOperationIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                indexOperationIcd.setOptId(indexOperation.getId());
                //手术/操作编码
                indexOperationIcd.setOptIcdcode(zj_BASY_STD.getP45016_ICD9_ID1_STD());
                //手术/操作名称
                indexOperationIcd.setOptIcddesc(zj_BASY_STD.getP45016_ICD9_NAME1_STD());
                indexOperationIcdService.saveIndexOperationIcd(indexOperationIcd);
            }
            if (zj_BASY_STD.getP45016_ICD9_NAME2_STD() != null) {
                IndexOperationIcd indexOperationIcd =new IndexOperationIcd();
                indexOperationIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());

                //标识患者身份唯一标识
                indexOperationIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexOperationIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexOperationIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexOperationIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexOperationIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                indexOperationIcd.setOptId(indexOperation.getId());
                //手术/操作编码
                indexOperationIcd.setOptIcdcode(zj_BASY_STD.getP45016_ICD9_ID2_STD());
                //手术/操作名称
                indexOperationIcd.setOptIcddesc(zj_BASY_STD.getP45016_ICD9_NAME2_STD());
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

            if (zj_BASY_STD.getP45028_ICD9_NAME1_STD() != null) {
                IndexOperationIcd indexOperationIcd =new IndexOperationIcd();
                indexOperationIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());

                //标识患者身份唯一标识
                indexOperationIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexOperationIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexOperationIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexOperationIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexOperationIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                indexOperationIcd.setOptId(indexOperation.getId());
                //手术/操作编码
                indexOperationIcd.setOptIcdcode(zj_BASY_STD.getP45028_ICD9_ID1_STD());
                //手术/操作名称
                indexOperationIcd.setOptIcddesc(zj_BASY_STD.getP45028_ICD9_NAME1_STD());
                indexOperationIcdService.saveIndexOperationIcd(indexOperationIcd);
            }
            if ( zj_BASY_STD.getP45028_ICD9_NAME2_STD() != null) {
                IndexOperationIcd indexOperationIcd =new IndexOperationIcd();
                indexOperationIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());

                //标识患者身份唯一标识
                indexOperationIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexOperationIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexOperationIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexOperationIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexOperationIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                indexOperationIcd.setOptId(indexOperation.getId());
                //手术/操作编码
                indexOperationIcd.setOptIcdcode(zj_BASY_STD.getP45028_ICD9_ID2_STD());
                //手术/操作名称
                indexOperationIcd.setOptIcddesc(zj_BASY_STD.getP45028_ICD9_NAME2_STD());
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
            if (zj_BASY_STD.getP45040_ICD9_NAME1_STD() != null) {
                IndexOperationIcd indexOperationIcd =new IndexOperationIcd();
                indexOperationIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());

                //标识患者身份唯一标识
                indexOperationIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexOperationIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexOperationIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexOperationIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexOperationIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                indexOperationIcd.setOptId(indexOperation.getId());
                //手术/操作编码
                indexOperationIcd.setOptIcdcode(zj_BASY_STD.getP45040_ICD9_ID1_STD());
                //手术/操作名称
                indexOperationIcd.setOptIcddesc(zj_BASY_STD.getP45040_ICD9_NAME1_STD());
                indexOperationIcdService.saveIndexOperationIcd(indexOperationIcd);
            }
            if (zj_BASY_STD.getP45040_ICD9_NAME2_STD() != null) {
                IndexOperationIcd indexOperationIcd =new IndexOperationIcd();
                indexOperationIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());

                //标识患者身份唯一标识
                indexOperationIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexOperationIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexOperationIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexOperationIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexOperationIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                indexOperationIcd.setOptId(indexOperation.getId());
                //手术/操作编码
                indexOperationIcd.setOptIcdcode(zj_BASY_STD.getP45040_ICD9_ID2_STD());
                //手术/操作名称
                indexOperationIcd.setOptIcddesc(zj_BASY_STD.getP45040_ICD9_NAME2_STD());
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
            if (zj_BASY_STD.getP45052_ICD9_NAME1_STD() != null) {
                IndexOperationIcd indexOperationIcd =new IndexOperationIcd();
                indexOperationIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());

                //标识患者身份唯一标识
                indexOperationIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexOperationIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexOperationIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexOperationIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexOperationIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                indexOperationIcd.setOptId(indexOperation.getId());
                //手术/操作编码
                indexOperationIcd.setOptIcdcode(zj_BASY_STD.getP45052_ICD9_ID1_STD());
                //手术/操作名称
                indexOperationIcd.setOptIcddesc(zj_BASY_STD.getP45052_ICD9_NAME1_STD());
                indexOperationIcdService.saveIndexOperationIcd(indexOperationIcd);
            }
            if ( zj_BASY_STD.getP45052_ICD9_NAME2_STD() != null) {
                IndexOperationIcd indexOperationIcd =new IndexOperationIcd();
                indexOperationIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());

                //标识患者身份唯一标识
                indexOperationIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexOperationIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexOperationIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexOperationIcd.setPatientId(zj_BASY_STD.getPATIENT_ID());
                //住院号
                indexOperationIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                indexOperationIcd.setOptId(indexOperation.getId());
                //手术/操作编码
                indexOperationIcd.setOptIcdcode(zj_BASY_STD.getP45052_ICD9_ID1_STD());
                //手术/操作名称
                indexOperationIcd.setOptIcddesc(zj_BASY_STD.getP45052_ICD9_NAME1_STD());
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
    public void saveIndexDiagnosisAdmit(BASY_DIAG_STD zj_BASY_STD,String paterntId,Date visitDate,Date diagnosisDate){

        if(zj_BASY_STD.getP30()!=null&&zj_BASY_STD.getP301()!=null&&zj_BASY_STD.getP301()!=""){
            IndexDiagnosisAdmit indexDiagnosisAdmit = new IndexDiagnosisAdmit();
            indexDiagnosisAdmit.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
            //标识患者身份唯一标识
            indexDiagnosisAdmit.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
            //唯一标识
            indexDiagnosisAdmit.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
            //医疗机构代码
            indexDiagnosisAdmit.setP900(zj_BASY_STD.getP900());
            //患者id
            indexDiagnosisAdmit.setPatientId(paterntId);
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

            if(zj_BASY_STD.getP301_ICD10_NAME1_STD()!=null&&zj_BASY_STD.getP301_ICD10_ID1_STD()!=null&&!"".equals(zj_BASY_STD.getP301_ICD10_ID1_STD())){
                IndexDiagnosisAdmitIcd indexDiagnosisAdmitIcd = new IndexDiagnosisAdmitIcd();
                indexDiagnosisAdmitIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisAdmitIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisAdmitIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisAdmitIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisAdmitIcd.setPatientId(paterntId);
                //住院号
                indexDiagnosisAdmitIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                indexDiagnosisAdmitIcd.setAdmitId(indexDiagnosisAdmit.getId());
                //入院诊断编码
                indexDiagnosisAdmitIcd.setDiagnosisIcdcode(zj_BASY_STD.getP301_ICD10_ID1_STD());
                //入院诊断描述名称
                indexDiagnosisAdmitIcd.setDiagnosisIcddesc(zj_BASY_STD.getP301_ICD10_NAME1_STD());
                indexDiagnosisAdmitIcdService.saveIndexDiagnosisAdmitIcd(indexDiagnosisAdmitIcd);
            }
            if(zj_BASY_STD.getP301_ICD10_NAME2_STD()!=null&&zj_BASY_STD.getP301_ICD10_ID2_STD()!=null&&!"".equals(zj_BASY_STD.getP301_ICD10_ID2_STD())){
                IndexDiagnosisAdmitIcd indexDiagnosisAdmitIcd = new IndexDiagnosisAdmitIcd();
                indexDiagnosisAdmitIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisAdmitIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisAdmitIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisAdmitIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisAdmitIcd.setPatientId(paterntId);
                //住院号
                indexDiagnosisAdmitIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //入院诊断编码
                indexDiagnosisAdmitIcd.setAdmitId(indexDiagnosisAdmit.getId());
                //入院诊断编码
                indexDiagnosisAdmitIcd.setDiagnosisIcdcode(zj_BASY_STD.getP301_ICD10_ID2_STD());
                //入院诊断描述名称
                indexDiagnosisAdmitIcd.setDiagnosisIcddesc(zj_BASY_STD.getP301_ICD10_NAME2_STD());
                indexDiagnosisAdmitIcdService.saveIndexDiagnosisAdmitIcd(indexDiagnosisAdmitIcd);
            }
            if(zj_BASY_STD.getP301_ICD10_NAME3_STD()!=null&&zj_BASY_STD.getP301_ICD10_ID3_STD()!=null&&!"".equals(zj_BASY_STD.getP301_ICD10_ID3_STD())){
                IndexDiagnosisAdmitIcd indexDiagnosisAdmitIcd = new IndexDiagnosisAdmitIcd();
                indexDiagnosisAdmitIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisAdmitIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisAdmitIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisAdmitIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisAdmitIcd.setPatientId(paterntId);
                //住院号
                indexDiagnosisAdmitIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //入院诊断编码
                indexDiagnosisAdmitIcd.setAdmitId(indexDiagnosisAdmit.getId());
                //入院诊断编码
                indexDiagnosisAdmitIcd.setDiagnosisIcdcode(zj_BASY_STD.getP301_ICD10_ID3_STD());
                //入院诊断描述名称
                indexDiagnosisAdmitIcd.setDiagnosisIcddesc(zj_BASY_STD.getP301_ICD10_NAME3_STD());
                indexDiagnosisAdmitIcdService.saveIndexDiagnosisAdmitIcd(indexDiagnosisAdmitIcd);
            }
            if(zj_BASY_STD.getP301_ICD10_NAME4_STD()!=null&&zj_BASY_STD.getP301_ICD10_ID4_STD()!=null&&!"".equals(zj_BASY_STD.getP301_ICD10_ID4_STD())){
                IndexDiagnosisAdmitIcd indexDiagnosisAdmitIcd = new IndexDiagnosisAdmitIcd();
                indexDiagnosisAdmitIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisAdmitIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisAdmitIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisAdmitIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisAdmitIcd.setPatientId(paterntId);
                //住院号
                indexDiagnosisAdmitIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //入院诊断编码
                indexDiagnosisAdmitIcd.setAdmitId(indexDiagnosisAdmit.getId());
                //入院诊断编码
                indexDiagnosisAdmitIcd.setDiagnosisIcdcode(zj_BASY_STD.getP301_ICD10_ID4_STD());
                //入院诊断描述名称
                indexDiagnosisAdmitIcd.setDiagnosisIcddesc(zj_BASY_STD.getP301_ICD10_NAME4_STD());
                indexDiagnosisAdmitIcdService.saveIndexDiagnosisAdmitIcd(indexDiagnosisAdmitIcd);
            }
            if(zj_BASY_STD.getP301_ICD10_NAME5_STD()!=null&&zj_BASY_STD.getP301_ICD10_ID5_STD()!=null&&!"".equals(zj_BASY_STD.getP301_ICD10_ID5_STD())){
                IndexDiagnosisAdmitIcd indexDiagnosisAdmitIcd = new IndexDiagnosisAdmitIcd();
                indexDiagnosisAdmitIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisAdmitIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisAdmitIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisAdmitIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisAdmitIcd.setPatientId(paterntId);
                //住院号
                indexDiagnosisAdmitIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //入院诊断编码
                indexDiagnosisAdmitIcd.setAdmitId(indexDiagnosisAdmit.getId());
                //入院诊断编码
                indexDiagnosisAdmitIcd.setDiagnosisIcdcode(zj_BASY_STD.getP301_ICD10_ID5_STD());
                //入院诊断描述名称
                indexDiagnosisAdmitIcd.setDiagnosisIcddesc(zj_BASY_STD.getP301_ICD10_NAME5_STD());
                indexDiagnosisAdmitIcdService.saveIndexDiagnosisAdmitIcd(indexDiagnosisAdmitIcd);
            }
            if(zj_BASY_STD.getP301_ICD10_NAME6_STD()!=null&&zj_BASY_STD.getP301_ICD10_ID6_STD()!=null&&!"".equals(zj_BASY_STD.getP301_ICD10_ID6_STD())){
                IndexDiagnosisAdmitIcd indexDiagnosisAdmitIcd = new IndexDiagnosisAdmitIcd();
                indexDiagnosisAdmitIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisAdmitIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisAdmitIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisAdmitIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisAdmitIcd.setPatientId(paterntId);
                //住院号
                indexDiagnosisAdmitIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //入院诊断编码
                indexDiagnosisAdmitIcd.setAdmitId(indexDiagnosisAdmit.getId());
                //入院诊断编码
                indexDiagnosisAdmitIcd.setDiagnosisIcdcode(zj_BASY_STD.getP301_ICD10_ID6_STD());
                //入院诊断描述名称
                indexDiagnosisAdmitIcd.setDiagnosisIcddesc(zj_BASY_STD.getP301_ICD10_NAME6_STD());
                indexDiagnosisAdmitIcdService.saveIndexDiagnosisAdmitIcd(indexDiagnosisAdmitIcd);
            }
            if(zj_BASY_STD.getP301_ICD10_NAME7_STD()!=null&&zj_BASY_STD.getP301_ICD10_ID7_STD()!=null&&!"".equals(zj_BASY_STD.getP301_ICD10_ID7_STD())){
                IndexDiagnosisAdmitIcd indexDiagnosisAdmitIcd = new IndexDiagnosisAdmitIcd();
                indexDiagnosisAdmitIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisAdmitIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisAdmitIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisAdmitIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisAdmitIcd.setPatientId(paterntId);
                //住院号
                indexDiagnosisAdmitIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //入院诊断编码
                indexDiagnosisAdmitIcd.setAdmitId(indexDiagnosisAdmit.getId());
                //入院诊断编码
                indexDiagnosisAdmitIcd.setDiagnosisIcdcode(zj_BASY_STD.getP301_ICD10_ID7_STD());
                //入院诊断描述名称
                indexDiagnosisAdmitIcd.setDiagnosisIcddesc(zj_BASY_STD.getP301_ICD10_NAME7_STD());
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
//                indexDiagnosisAdmitIcd.setPatientId(paterntId);
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
//                indexDiagnosisAdmitIcd.setPatientId(paterntId);
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
    public void saveIndexDiagnosisClinic(BASY_DIAG_STD zj_BASY_STD,String paterntId,Date visitDate,Date diagnosisDate){
        log.info("保存病案首页门诊诊断："+zj_BASY_STD.getUNIQUE_ID()+"---"+zj_BASY_STD.getP281_ICD10_ID1_STD()+"------"+zj_BASY_STD.getP281_ICD10_NAME1_STD());
        if(zj_BASY_STD.getP28()!=null&&zj_BASY_STD.getP281()!=null&&zj_BASY_STD.getP281()!=""){

            IndexDiagnosisClinic indexDiagnosisClinic = new IndexDiagnosisClinic();
            indexDiagnosisClinic.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
            //标识患者身份唯一标识
            indexDiagnosisClinic.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
            //唯一标识
            indexDiagnosisClinic.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
            //医疗机构代码
            indexDiagnosisClinic.setP900(zj_BASY_STD.getP900());
            //患者id
            indexDiagnosisClinic.setPatientId(paterntId);
            //住院号
            indexDiagnosisClinic.setVisitId(zj_BASY_STD.getVISIT_ID());
            //门诊诊断编码
            indexDiagnosisClinic.setP28(zj_BASY_STD.getP28());
            //门诊诊断名称
            indexDiagnosisClinic.setP281(zj_BASY_STD.getP281());
            indexDiagnosisClinic.setVisitDate(visitDate);
            indexDiagnosisClinic.setDiagnosisDate(diagnosisDate);
            indexDiagnosisClinicService.saveIndexDiagnosisClinic(indexDiagnosisClinic);

            if(zj_BASY_STD.getP281_ICD10_NAME1_STD()!=null&&zj_BASY_STD.getP281_ICD10_ID1_STD()!=null&&!"".equals(zj_BASY_STD.getP281_ICD10_ID1_STD())){
                IndexDiagnosisClinicIcd indexDiagnosisClinicIcd = new IndexDiagnosisClinicIcd();
                indexDiagnosisClinicIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisClinicIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisClinicIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisClinicIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisClinicIcd.setPatientId(paterntId);
                //住院号
                indexDiagnosisClinicIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                indexDiagnosisClinicIcd.setClinicId(indexDiagnosisClinic.getId());
                //门诊诊断编码
                indexDiagnosisClinicIcd.setDiagnosisIcdcode(zj_BASY_STD.getP281_ICD10_ID1_STD());
                //门诊诊断名称
                indexDiagnosisClinicIcd.setDiagnosisIcddesc(zj_BASY_STD.getP281_ICD10_NAME1_STD());
                indexDiagnosisClinicIcdService.saveIndexDiagnosisClinicIcd(indexDiagnosisClinicIcd);

            }
            if(zj_BASY_STD.getP281_ICD10_NAME2_STD()!=null&&zj_BASY_STD.getP281_ICD10_ID2_STD()!=null&&!"".equals(zj_BASY_STD.getP281_ICD10_ID2_STD())){
                IndexDiagnosisClinicIcd indexDiagnosisClinicIcd = new IndexDiagnosisClinicIcd();
                indexDiagnosisClinicIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisClinicIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisClinicIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisClinicIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisClinicIcd.setPatientId(paterntId);
                //住院号
                indexDiagnosisClinicIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                indexDiagnosisClinicIcd.setClinicId(indexDiagnosisClinic.getId());
                //门诊诊断编码
                indexDiagnosisClinicIcd.setDiagnosisIcdcode(zj_BASY_STD.getP281_ICD10_ID2_STD());
                //门诊诊断名称
                indexDiagnosisClinicIcd.setDiagnosisIcddesc(zj_BASY_STD.getP281_ICD10_NAME2_STD());
                indexDiagnosisClinicIcdService.saveIndexDiagnosisClinicIcd(indexDiagnosisClinicIcd);
            }
            if(zj_BASY_STD.getP281_ICD10_NAME3_STD()!=null&&zj_BASY_STD.getP281_ICD10_ID3_STD()!=null&&!"".equals(zj_BASY_STD.getP281_ICD10_ID3_STD())){
                IndexDiagnosisClinicIcd indexDiagnosisClinicIcd = new IndexDiagnosisClinicIcd();
                indexDiagnosisClinicIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisClinicIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisClinicIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisClinicIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisClinicIcd.setPatientId(paterntId);
                //住院号
                indexDiagnosisClinicIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                indexDiagnosisClinicIcd.setClinicId(indexDiagnosisClinic.getId());
                //门诊诊断编码
                indexDiagnosisClinicIcd.setDiagnosisIcdcode(zj_BASY_STD.getP281_ICD10_ID3_STD());
                //门诊诊断名称
                indexDiagnosisClinicIcd.setDiagnosisIcddesc(zj_BASY_STD.getP281_ICD10_NAME3_STD());
                indexDiagnosisClinicIcdService.saveIndexDiagnosisClinicIcd(indexDiagnosisClinicIcd);
            }
            if(zj_BASY_STD.getP281_ICD10_NAME4_STD()!=null&&zj_BASY_STD.getP281_ICD10_ID4_STD()!=null&&!"".equals(zj_BASY_STD.getP281_ICD10_ID4_STD())){
                IndexDiagnosisClinicIcd indexDiagnosisClinicIcd = new IndexDiagnosisClinicIcd();
                indexDiagnosisClinicIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisClinicIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisClinicIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisClinicIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisClinicIcd.setPatientId(paterntId);
                //住院号
                indexDiagnosisClinicIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                indexDiagnosisClinicIcd.setClinicId(indexDiagnosisClinic.getId());
                //门诊诊断编码
                indexDiagnosisClinicIcd.setDiagnosisIcdcode(zj_BASY_STD.getP281_ICD10_ID4_STD());
                //门诊诊断名称
                indexDiagnosisClinicIcd.setDiagnosisIcddesc(zj_BASY_STD.getP281_ICD10_NAME4_STD());
                indexDiagnosisClinicIcdService.saveIndexDiagnosisClinicIcd(indexDiagnosisClinicIcd);
            }
            if(zj_BASY_STD.getP281_ICD10_NAME5_STD()!=null&&zj_BASY_STD.getP281_ICD10_ID5_STD()!=null&&!"".equals(zj_BASY_STD.getP281_ICD10_ID5_STD())){
                IndexDiagnosisClinicIcd indexDiagnosisClinicIcd = new IndexDiagnosisClinicIcd();
                indexDiagnosisClinicIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisClinicIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisClinicIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisClinicIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisClinicIcd.setPatientId(paterntId);
                //住院号
                indexDiagnosisClinicIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                indexDiagnosisClinicIcd.setClinicId(indexDiagnosisClinic.getId());
                //门诊诊断编码
                indexDiagnosisClinicIcd.setDiagnosisIcdcode(zj_BASY_STD.getP281_ICD10_ID5_STD());
                //门诊诊断名称
                indexDiagnosisClinicIcd.setDiagnosisIcddesc(zj_BASY_STD.getP281_ICD10_NAME5_STD());
                indexDiagnosisClinicIcdService.saveIndexDiagnosisClinicIcd(indexDiagnosisClinicIcd);
            }
            if(zj_BASY_STD.getP281_ICD10_NAME6_STD()!=null&&zj_BASY_STD.getP281_ICD10_ID6_STD()!=null&&!"".equals(zj_BASY_STD.getP281_ICD10_ID6_STD())){
                IndexDiagnosisClinicIcd indexDiagnosisClinicIcd = new IndexDiagnosisClinicIcd();
                indexDiagnosisClinicIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisClinicIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisClinicIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisClinicIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisClinicIcd.setPatientId(paterntId);
                //住院号
                indexDiagnosisClinicIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                indexDiagnosisClinicIcd.setClinicId(indexDiagnosisClinic.getId());
                //门诊诊断编码
                indexDiagnosisClinicIcd.setDiagnosisIcdcode(zj_BASY_STD.getP281_ICD10_ID6_STD());
                //门诊诊断名称
                indexDiagnosisClinicIcd.setDiagnosisIcddesc(zj_BASY_STD.getP281_ICD10_NAME6_STD());
                indexDiagnosisClinicIcdService.saveIndexDiagnosisClinicIcd(indexDiagnosisClinicIcd);
            }
            if(zj_BASY_STD.getP281_ICD10_NAME7_STD()!=null&&zj_BASY_STD.getP281_ICD10_ID7_STD()!=null&&!"".equals(zj_BASY_STD.getP281_ICD10_ID7_STD())){
                IndexDiagnosisClinicIcd indexDiagnosisClinicIcd = new IndexDiagnosisClinicIcd();
                indexDiagnosisClinicIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisClinicIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisClinicIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisClinicIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisClinicIcd.setPatientId(paterntId);
                //住院号
                indexDiagnosisClinicIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                indexDiagnosisClinicIcd.setClinicId(indexDiagnosisClinic.getId());
                //门诊诊断编码
                indexDiagnosisClinicIcd.setDiagnosisIcdcode(zj_BASY_STD.getP281_ICD10_ID7_STD());
                //门诊诊断名称
                indexDiagnosisClinicIcd.setDiagnosisIcddesc(zj_BASY_STD.getP281_ICD10_NAME7_STD());
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
//                indexDiagnosisClinicIcd.setPatientId(paterntId);
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
//                indexDiagnosisClinicIcd.setPatientId(paterntId);
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
    public void saveIndexDiagnosisMain(BASY_DIAG_STD zj_BASY_STD,String paterntId,Date visitDate,Date diagnosisDate){
        log.info("保存病案首页主要诊断："+zj_BASY_STD.getUNIQUE_ID());

        if(zj_BASY_STD.getP321()!=null&&zj_BASY_STD.getP322()!=null&&zj_BASY_STD.getP322()!=""){
            IndexDiagnosisMain indexDiagnosisMain = new IndexDiagnosisMain();
            indexDiagnosisMain.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
            //标识患者身份唯一标识
            indexDiagnosisMain.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
            //唯一标识
            indexDiagnosisMain.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
            //医疗机构代码
            indexDiagnosisMain.setP900(zj_BASY_STD.getP900());
            //患者id
            indexDiagnosisMain.setPatientId(paterntId);
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


            if(zj_BASY_STD.getP322_ICD10_NAME1_STD()!=null&&zj_BASY_STD.getP322_ICD10_ID1_STD()!=null&&!"".equals(zj_BASY_STD.getP322_ICD10_ID1_STD())){
                IndexDiagnosisMainIcd indexDiagnosisMainIcd = new IndexDiagnosisMainIcd();
                indexDiagnosisMainIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisMainIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisMainIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisMainIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisMainIcd.setPatientId(paterntId);
                //住院号
                indexDiagnosisMainIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                indexDiagnosisMainIcd.setMainId(indexDiagnosisMain.getId());
                //主要诊断编码
                indexDiagnosisMainIcd.setDiagnosisIcdcode(zj_BASY_STD.getP322_ICD10_ID1_STD());
                //主要诊断疾病描述
                indexDiagnosisMainIcd.setDiagnosisIcddesc(zj_BASY_STD.getP322_ICD10_NAME1_STD());
                indexDiagnosisMainIcdService.saveIndexDiagnosisMainIcd(indexDiagnosisMainIcd);
            }
            if(zj_BASY_STD.getP322_ICD10_NAME2_STD()!=null&&zj_BASY_STD.getP322_ICD10_ID2_STD()!=null&&!"".equals(zj_BASY_STD.getP322_ICD10_ID2_STD())){
                IndexDiagnosisMainIcd indexDiagnosisMainIcd = new IndexDiagnosisMainIcd();
                indexDiagnosisMainIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisMainIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisMainIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisMainIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisMainIcd.setPatientId(paterntId);
                //住院号
                indexDiagnosisMainIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                indexDiagnosisMainIcd.setMainId(indexDiagnosisMain.getId());
                //主要诊断编码
                indexDiagnosisMainIcd.setDiagnosisIcdcode(zj_BASY_STD.getP322_ICD10_ID2_STD());
                //主要诊断疾病描述
                indexDiagnosisMainIcd.setDiagnosisIcddesc(zj_BASY_STD.getP322_ICD10_NAME2_STD());
                indexDiagnosisMainIcdService.saveIndexDiagnosisMainIcd(indexDiagnosisMainIcd);
            }
            if(zj_BASY_STD.getP322_ICD10_NAME3_STD()!=null&&zj_BASY_STD.getP322_ICD10_ID3_STD()!=null&&!"".equals(zj_BASY_STD.getP322_ICD10_ID3_STD())){
                IndexDiagnosisMainIcd indexDiagnosisMainIcd = new IndexDiagnosisMainIcd();
                indexDiagnosisMainIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisMainIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisMainIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisMainIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisMainIcd.setPatientId(paterntId);
                //住院号
                indexDiagnosisMainIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                indexDiagnosisMainIcd.setMainId(indexDiagnosisMain.getId());
                //主要诊断编码
                indexDiagnosisMainIcd.setDiagnosisIcdcode(zj_BASY_STD.getP322_ICD10_ID3_STD());
                //主要诊断疾病描述
                indexDiagnosisMainIcd.setDiagnosisIcddesc(zj_BASY_STD.getP322_ICD10_NAME3_STD());
                indexDiagnosisMainIcdService.saveIndexDiagnosisMainIcd(indexDiagnosisMainIcd);
            }
            if(zj_BASY_STD.getP322_ICD10_NAME4_STD()!=null&&zj_BASY_STD.getP322_ICD10_ID4_STD()!=null&&!"".equals(zj_BASY_STD.getP322_ICD10_ID4_STD())){
                IndexDiagnosisMainIcd indexDiagnosisMainIcd = new IndexDiagnosisMainIcd();
                indexDiagnosisMainIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisMainIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisMainIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisMainIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisMainIcd.setPatientId(paterntId);
                //住院号
                indexDiagnosisMainIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                indexDiagnosisMainIcd.setMainId(indexDiagnosisMain.getId());
                //主要诊断编码
                indexDiagnosisMainIcd.setDiagnosisIcdcode(zj_BASY_STD.getP322_ICD10_ID4_STD());
                //主要诊断疾病描述
                indexDiagnosisMainIcd.setDiagnosisIcddesc(zj_BASY_STD.getP322_ICD10_NAME4_STD());
                indexDiagnosisMainIcdService.saveIndexDiagnosisMainIcd(indexDiagnosisMainIcd);
            }
            if(zj_BASY_STD.getP322_ICD10_NAME5_STD()!=null&&zj_BASY_STD.getP322_ICD10_ID5_STD()!=null&&!"".equals(zj_BASY_STD.getP322_ICD10_ID5_STD())){
                IndexDiagnosisMainIcd indexDiagnosisMainIcd = new IndexDiagnosisMainIcd();
                indexDiagnosisMainIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisMainIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisMainIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisMainIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisMainIcd.setPatientId(paterntId);
                //住院号
                indexDiagnosisMainIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                indexDiagnosisMainIcd.setMainId(indexDiagnosisMain.getId());
                //主要诊断编码
                indexDiagnosisMainIcd.setDiagnosisIcdcode(zj_BASY_STD.getP322_ICD10_ID5_STD());
                //主要诊断疾病描述
                indexDiagnosisMainIcd.setDiagnosisIcddesc(zj_BASY_STD.getP322_ICD10_NAME5_STD());
                indexDiagnosisMainIcdService.saveIndexDiagnosisMainIcd(indexDiagnosisMainIcd);
            }
            if(zj_BASY_STD.getP322_ICD10_NAME6_STD()!=null&&zj_BASY_STD.getP322_ICD10_ID6_STD()!=null&&!"".equals(zj_BASY_STD.getP322_ICD10_ID6_STD())){
                IndexDiagnosisMainIcd indexDiagnosisMainIcd = new IndexDiagnosisMainIcd();
                indexDiagnosisMainIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisMainIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisMainIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisMainIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisMainIcd.setPatientId(paterntId);
                //住院号
                indexDiagnosisMainIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                indexDiagnosisMainIcd.setMainId(indexDiagnosisMain.getId());
                //主要诊断编码
                indexDiagnosisMainIcd.setDiagnosisIcdcode(zj_BASY_STD.getP322_ICD10_ID6_STD());
                //主要诊断疾病描述
                indexDiagnosisMainIcd.setDiagnosisIcddesc(zj_BASY_STD.getP322_ICD10_NAME6_STD());
                indexDiagnosisMainIcdService.saveIndexDiagnosisMainIcd(indexDiagnosisMainIcd);
            }
            if(zj_BASY_STD.getP322_ICD10_NAME7_STD()!=null&&zj_BASY_STD.getP322_ICD10_ID7_STD()!=null&&!"".equals(zj_BASY_STD.getP322_ICD10_ID7_STD())){
                IndexDiagnosisMainIcd indexDiagnosisMainIcd = new IndexDiagnosisMainIcd();
                indexDiagnosisMainIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisMainIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisMainIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisMainIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisMainIcd.setPatientId(paterntId);
                //住院号
                indexDiagnosisMainIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                indexDiagnosisMainIcd.setMainId(indexDiagnosisMain.getId());
                //主要诊断编码
                indexDiagnosisMainIcd.setDiagnosisIcdcode(zj_BASY_STD.getP322_ICD10_ID7_STD());
                //主要诊断疾病描述
                indexDiagnosisMainIcd.setDiagnosisIcddesc(zj_BASY_STD.getP322_ICD10_NAME7_STD());
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
//                indexDiagnosisMainIcd.setPatientId(paterntId);
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
//                indexDiagnosisMainIcd.setPatientId(paterntId);
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
    public void saveIndexDiagnosisOther(BASY_DIAG_STD zj_BASY_STD,String paterntId,Date visitDate,Date diagnosisDate){
        log.info("保存病案首页其他诊断："+zj_BASY_STD.getUNIQUE_ID());

        if(zj_BASY_STD.getP324()!=null&&zj_BASY_STD.getP325()!=null&&zj_BASY_STD.getP325()!=""){

            IndexDiagnosisOther indexDiagnosisOther = new IndexDiagnosisOther();
            indexDiagnosisOther.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
            //标识患者身份唯一标识
            indexDiagnosisOther.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
            //唯一标识
            indexDiagnosisOther.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
            //医疗机构代码
            indexDiagnosisOther.setP900(zj_BASY_STD.getP900());
            //患者id
            indexDiagnosisOther.setPatientId(paterntId);
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


            if(zj_BASY_STD.getP325_ICD10_NAME1_STD()!=null&&zj_BASY_STD.getP325_ICD10_ID1_STD()!=null&&!"".equals(zj_BASY_STD.getP325_ICD10_ID1_STD())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(paterntId);
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP325_ICD10_ID1_STD());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP325_ICD10_NAME1_STD());

                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP325_ICD10_NAME2_STD()!=null&&zj_BASY_STD.getP325_ICD10_ID2_STD()!=null&&!"".equals(zj_BASY_STD.getP325_ICD10_ID2_STD())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(paterntId);
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP325_ICD10_ID2_STD());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP325_ICD10_NAME2_STD());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP325_ICD10_NAME3_STD()!=null&&zj_BASY_STD.getP325_ICD10_ID3_STD()!=null&&!"".equals(zj_BASY_STD.getP325_ICD10_ID3_STD())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(paterntId);
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP325_ICD10_ID3_STD());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP325_ICD10_NAME3_STD());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP325_ICD10_NAME4_STD()!=null&&zj_BASY_STD.getP325_ICD10_ID4_STD()!=null&&!"".equals(zj_BASY_STD.getP325_ICD10_ID4_STD())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(paterntId);
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP325_ICD10_ID4_STD());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP325_ICD10_NAME4_STD());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP325_ICD10_NAME5_STD()!=null&&zj_BASY_STD.getP325_ICD10_ID5_STD()!=null&&!"".equals(zj_BASY_STD.getP325_ICD10_ID5_STD())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(paterntId);
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP325_ICD10_ID5_STD());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP325_ICD10_NAME5_STD());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP325_ICD10_NAME6_STD()!=null&&zj_BASY_STD.getP325_ICD10_ID6_STD()!=null&&!"".equals(zj_BASY_STD.getP325_ICD10_ID6_STD())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(paterntId);
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP325_ICD10_ID6_STD());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP325_ICD10_NAME6_STD());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP325_ICD10_NAME7_STD()!=null&&zj_BASY_STD.getP325_ICD10_ID7_STD()!=null&&!"".equals(zj_BASY_STD.getP325_ICD10_ID7_STD())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(paterntId);
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP325_ICD10_ID7_STD());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP325_ICD10_NAME7_STD());
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
//                indexDiagnosisOtherIcd.setPatientId(paterntId);
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
//                indexDiagnosisOtherIcd.setPatientId(paterntId);
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
        if(zj_BASY_STD.getP327()!=null&&zj_BASY_STD.getP328()!=null&&zj_BASY_STD.getP328()!=""){

            IndexDiagnosisOther indexDiagnosisOther = new IndexDiagnosisOther();
            indexDiagnosisOther.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
            //标识患者身份唯一标识
            indexDiagnosisOther.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
            //唯一标识
            indexDiagnosisOther.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
            //医疗机构代码
            indexDiagnosisOther.setP900(zj_BASY_STD.getP900());
            //患者id
            indexDiagnosisOther.setPatientId(paterntId);
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

            if(zj_BASY_STD.getP328_ICD10_NAME1_STD()!=null&&zj_BASY_STD.getP328_ICD10_ID1_STD()!=null&&!"".equals(zj_BASY_STD.getP328_ICD10_ID1_STD())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(paterntId);
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP328_ICD10_ID1_STD());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP328_ICD10_NAME1_STD());

                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP328_ICD10_NAME2_STD()!=null&&zj_BASY_STD.getP328_ICD10_ID2_STD()!=null&&!"".equals(zj_BASY_STD.getP328_ICD10_ID2_STD())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(paterntId);
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP328_ICD10_ID2_STD());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP328_ICD10_NAME2_STD());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP328_ICD10_NAME3_STD()!=null&&zj_BASY_STD.getP328_ICD10_ID3_STD()!=null&&!"".equals(zj_BASY_STD.getP328_ICD10_ID3_STD())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(paterntId);
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP328_ICD10_ID3_STD());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP328_ICD10_NAME3_STD());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP328_ICD10_NAME4_STD()!=null&&zj_BASY_STD.getP328_ICD10_ID4_STD()!=null&&!"".equals(zj_BASY_STD.getP328_ICD10_ID4_STD())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(paterntId);
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP328_ICD10_ID4_STD());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP328_ICD10_NAME4_STD());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP328_ICD10_NAME5_STD()!=null&&zj_BASY_STD.getP328_ICD10_ID5_STD()!=null&&!"".equals(zj_BASY_STD.getP328_ICD10_ID5_STD())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(paterntId);
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP328_ICD10_ID5_STD());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP328_ICD10_NAME5_STD());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP328_ICD10_NAME6_STD()!=null&&zj_BASY_STD.getP328_ICD10_ID6_STD()!=null&&!"".equals(zj_BASY_STD.getP328_ICD10_ID6_STD())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(paterntId);
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP328_ICD10_ID6_STD());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP328_ICD10_NAME6_STD());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP328_ICD10_NAME7_STD()!=null&&zj_BASY_STD.getP328_ICD10_ID7_STD()!=null&&!"".equals(zj_BASY_STD.getP328_ICD10_ID7_STD())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(paterntId);
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP328_ICD10_ID7_STD());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP328_ICD10_NAME7_STD());
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
//                indexDiagnosisOtherIcd.setPatientId(paterntId);
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
//                indexDiagnosisOtherIcd.setPatientId(paterntId);
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
        if(zj_BASY_STD.getP3291()!=null&&zj_BASY_STD.getP3292()!=null&&zj_BASY_STD.getP3292()!=""){

            IndexDiagnosisOther indexDiagnosisOther = new IndexDiagnosisOther();
            indexDiagnosisOther.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
            //标识患者身份唯一标识
            indexDiagnosisOther.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
            //唯一标识
            indexDiagnosisOther.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
            //医疗机构代码
            indexDiagnosisOther.setP900(zj_BASY_STD.getP900());
            //患者id
            indexDiagnosisOther.setPatientId(paterntId);
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



            if(zj_BASY_STD.getP3292_ICD10_NAME1_STD()!=null&&zj_BASY_STD.getP3292_ICD10_ID1_STD()!=null&&!"".equals(zj_BASY_STD.getP3292_ICD10_ID1_STD())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(paterntId);
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3292_ICD10_ID1_STD());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3292_ICD10_NAME1_STD());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3292_ICD10_NAME2_STD()!=null&&zj_BASY_STD.getP3292_ICD10_ID2_STD()!=null&&!"".equals(zj_BASY_STD.getP3292_ICD10_ID2_STD())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(paterntId);
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3292_ICD10_ID2_STD());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3292_ICD10_NAME2_STD());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3292_ICD10_NAME3_STD()!=null&&zj_BASY_STD.getP3292_ICD10_ID3_STD()!=null&&!"".equals(zj_BASY_STD.getP3292_ICD10_ID3_STD())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(paterntId);
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3292_ICD10_ID3_STD());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3292_ICD10_NAME3_STD());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3292_ICD10_NAME4_STD()!=null&&zj_BASY_STD.getP3292_ICD10_ID4_STD()!=null&&!"".equals(zj_BASY_STD.getP3292_ICD10_ID4_STD())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(paterntId);
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3292_ICD10_ID4_STD());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3292_ICD10_NAME4_STD());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3292_ICD10_NAME5_STD()!=null&&zj_BASY_STD.getP3292_ICD10_ID5_STD()!=null&&!"".equals(zj_BASY_STD.getP3292_ICD10_ID5_STD())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(paterntId);
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3292_ICD10_ID5_STD());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3292_ICD10_NAME5_STD());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3292_ICD10_NAME6_STD()!=null&&zj_BASY_STD.getP3292_ICD10_ID6_STD()!=null&&!"".equals(zj_BASY_STD.getP3292_ICD10_ID6_STD())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(paterntId);
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3292_ICD10_ID6_STD());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3292_ICD10_NAME6_STD());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3292_ICD10_NAME7_STD()!=null&&zj_BASY_STD.getP3292_ICD10_ID7_STD()!=null&&!"".equals(zj_BASY_STD.getP3292_ICD10_ID7_STD())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(paterntId);
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3292_ICD10_ID7_STD());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3292_ICD10_NAME7_STD());
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
//                indexDiagnosisOtherIcd.setPatientId(paterntId);
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
//                indexDiagnosisOtherIcd.setPatientId(paterntId);
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
        if(zj_BASY_STD.getP3294()!=null&&zj_BASY_STD.getP3295()!=null&&zj_BASY_STD.getP3295()!=""){

            IndexDiagnosisOther indexDiagnosisOther = new IndexDiagnosisOther();
            indexDiagnosisOther.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
            //标识患者身份唯一标识
            indexDiagnosisOther.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
            //唯一标识
            indexDiagnosisOther.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
            //医疗机构代码
            indexDiagnosisOther.setP900(zj_BASY_STD.getP900());
            //患者id
            indexDiagnosisOther.setPatientId(paterntId);
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

            if(zj_BASY_STD.getP3295_ICD10_NAME1_STD()!=null&&zj_BASY_STD.getP3295_ICD10_ID1_STD()!=null&&!"".equals(zj_BASY_STD.getP3295_ICD10_ID1_STD())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(paterntId);
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3295_ICD10_ID1_STD());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3295_ICD10_NAME1_STD());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3295_ICD10_NAME2_STD()!=null&&zj_BASY_STD.getP3295_ICD10_ID2_STD()!=null&&!"".equals(zj_BASY_STD.getP3295_ICD10_ID2_STD())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(paterntId);
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3295_ICD10_ID2_STD());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3295_ICD10_NAME2_STD());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3295_ICD10_NAME3_STD()!=null&&zj_BASY_STD.getP3295_ICD10_ID3_STD()!=null&&!"".equals(zj_BASY_STD.getP3295_ICD10_ID3_STD())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(paterntId);
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3295_ICD10_ID3_STD());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3295_ICD10_NAME3_STD());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3295_ICD10_NAME4_STD()!=null&&zj_BASY_STD.getP3295_ICD10_ID4_STD()!=null&&!"".equals(zj_BASY_STD.getP3295_ICD10_ID4_STD())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(paterntId);
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3295_ICD10_ID4_STD());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3295_ICD10_NAME4_STD());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3295_ICD10_NAME5_STD()!=null&&zj_BASY_STD.getP3295_ICD10_ID5_STD()!=null&&!"".equals(zj_BASY_STD.getP3295_ICD10_ID5_STD())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(paterntId);
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3295_ICD10_ID5_STD());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3295_ICD10_NAME5_STD());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3295_ICD10_NAME6_STD()!=null&&zj_BASY_STD.getP3295_ICD10_ID6_STD()!=null&&!"".equals(zj_BASY_STD.getP3295_ICD10_ID6_STD())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(paterntId);
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3295_ICD10_ID6_STD());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3295_ICD10_NAME6_STD());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3295_ICD10_NAME7_STD()!=null&&zj_BASY_STD.getP3295_ICD10_ID7_STD()!=null&&!"".equals(zj_BASY_STD.getP3295_ICD10_ID7_STD())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(paterntId);
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3295_ICD10_ID7_STD());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3295_ICD10_NAME7_STD());
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
//                indexDiagnosisOtherIcd.setPatientId(paterntId);
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
//                indexDiagnosisOtherIcd.setPatientId(paterntId);
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
        if(zj_BASY_STD.getP3297()!=null&&zj_BASY_STD.getP3298()!=null&&zj_BASY_STD.getP3298()!=""){

            IndexDiagnosisOther indexDiagnosisOther = new IndexDiagnosisOther();
            indexDiagnosisOther.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
            //标识患者身份唯一标识
            indexDiagnosisOther.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
            //唯一标识
            indexDiagnosisOther.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
            //医疗机构代码
            indexDiagnosisOther.setP900(zj_BASY_STD.getP900());
            //患者id
            indexDiagnosisOther.setPatientId(paterntId);
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


            if(zj_BASY_STD.getP3298_ICD10_NAME1_STD()!=null&&zj_BASY_STD.getP3298_ICD10_ID1_STD()!=null&&!"".equals(zj_BASY_STD.getP3298_ICD10_ID1_STD())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(paterntId);
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3298_ICD10_ID1_STD());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3298_ICD10_NAME1_STD());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3298_ICD10_NAME2_STD()!=null&&zj_BASY_STD.getP3298_ICD10_ID2_STD()!=null&&!"".equals(zj_BASY_STD.getP3298_ICD10_ID2_STD())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(paterntId);
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3298_ICD10_ID2_STD());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3298_ICD10_NAME2_STD());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3298_ICD10_NAME3_STD()!=null&&zj_BASY_STD.getP3298_ICD10_ID3_STD()!=null&&!"".equals(zj_BASY_STD.getP3298_ICD10_ID3_STD())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(paterntId);
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3298_ICD10_ID3_STD());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3298_ICD10_NAME3_STD());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3298_ICD10_NAME4_STD()!=null&&zj_BASY_STD.getP3298_ICD10_ID4_STD()!=null&&!"".equals(zj_BASY_STD.getP3298_ICD10_ID4_STD())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(paterntId);
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3298_ICD10_ID4_STD());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3298_ICD10_NAME4_STD());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3298_ICD10_NAME5_STD()!=null&&zj_BASY_STD.getP3298_ICD10_ID5_STD()!=null&&!"".equals(zj_BASY_STD.getP3298_ICD10_ID5_STD())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(paterntId);
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3298_ICD10_ID5_STD());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3298_ICD10_NAME5_STD());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3298_ICD10_NAME6_STD()!=null&&zj_BASY_STD.getP3298_ICD10_ID6_STD()!=null&&!"".equals(zj_BASY_STD.getP3298_ICD10_ID6_STD())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(paterntId);
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3298_ICD10_ID6_STD());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3298_ICD10_NAME6_STD());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3298_ICD10_NAME7_STD()!=null&&zj_BASY_STD.getP3298_ICD10_ID7_STD()!=null&&!"".equals(zj_BASY_STD.getP3298_ICD10_ID7_STD())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(paterntId);
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3298_ICD10_ID7_STD());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3298_ICD10_NAME7_STD());
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
//                indexDiagnosisOtherIcd.setPatientId(paterntId);
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
//                indexDiagnosisOtherIcd.setPatientId(paterntId);
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
        if(zj_BASY_STD.getP3281()!=null&&zj_BASY_STD.getP3282()!=null&&zj_BASY_STD.getP3282()!=""){
            IndexDiagnosisOther indexDiagnosisOther = new IndexDiagnosisOther();
            indexDiagnosisOther.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
            //标识患者身份唯一标识
            indexDiagnosisOther.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
            //唯一标识
            indexDiagnosisOther.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
            //医疗机构代码
            indexDiagnosisOther.setP900(zj_BASY_STD.getP900());
            //患者id
            indexDiagnosisOther.setPatientId(paterntId);
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




            if(zj_BASY_STD.getP3282_ICD10_NAME1_STD()!=null&&zj_BASY_STD.getP3282_ICD10_ID1_STD()!=null&&!"".equals(zj_BASY_STD.getP3282_ICD10_ID1_STD())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(paterntId);
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3282_ICD10_ID1_STD());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3282_ICD10_NAME1_STD());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3282_ICD10_NAME2_STD()!=null&&zj_BASY_STD.getP3282_ICD10_ID2_STD()!=null&&!"".equals(zj_BASY_STD.getP3282_ICD10_ID2_STD())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(paterntId);
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3282_ICD10_ID2_STD());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3282_ICD10_NAME2_STD());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3282_ICD10_NAME3_STD()!=null&&zj_BASY_STD.getP3282_ICD10_ID3_STD()!=null&&!"".equals(zj_BASY_STD.getP3282_ICD10_ID3_STD())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(paterntId);
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3282_ICD10_ID3_STD());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3282_ICD10_NAME3_STD());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3282_ICD10_NAME4_STD()!=null&&zj_BASY_STD.getP3282_ICD10_ID4_STD()!=null&&!"".equals(zj_BASY_STD.getP3282_ICD10_ID4_STD())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(paterntId);
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3282_ICD10_ID4_STD());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3282_ICD10_NAME4_STD());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3282_ICD10_NAME5_STD()!=null&&zj_BASY_STD.getP3282_ICD10_ID5_STD()!=null&&!"".equals(zj_BASY_STD.getP3282_ICD10_ID5_STD())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(paterntId);
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3282_ICD10_ID5_STD());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3282_ICD10_NAME5_STD());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3282_ICD10_NAME5_STD()!=null&&zj_BASY_STD.getP3282_ICD10_ID5_STD()!=null&&!"".equals(zj_BASY_STD.getP3282_ICD10_ID5_STD())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(paterntId);
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3282_ICD10_ID5_STD());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3282_ICD10_NAME5_STD());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }

        }
        if(zj_BASY_STD.getP3284()!=null&&zj_BASY_STD.getP3285()!=null&&zj_BASY_STD.getP3285()!=""){


            IndexDiagnosisOther indexDiagnosisOther = new IndexDiagnosisOther();
            indexDiagnosisOther.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
            //标识患者身份唯一标识
            indexDiagnosisOther.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
            //唯一标识
            indexDiagnosisOther.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
            //医疗机构代码
            indexDiagnosisOther.setP900(zj_BASY_STD.getP900());
            //患者id
            indexDiagnosisOther.setPatientId(paterntId);
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

            if(zj_BASY_STD.getP3285_ICD10_NAME1_STD()!=null&&zj_BASY_STD.getP3285_ICD10_ID1_STD()!=null&&!"".equals(zj_BASY_STD.getP3285_ICD10_ID1_STD())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(paterntId);
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3285_ICD10_ID1_STD());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3285_ICD10_NAME1_STD());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3285_ICD10_NAME2_STD()!=null&&zj_BASY_STD.getP3285_ICD10_ID2_STD()!=null&&!"".equals(zj_BASY_STD.getP3285_ICD10_ID2_STD())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(paterntId);
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3285_ICD10_ID2_STD());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3285_ICD10_NAME2_STD());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3285_ICD10_NAME3_STD()!=null&&zj_BASY_STD.getP3285_ICD10_ID3_STD()!=null&&!"".equals(zj_BASY_STD.getP3285_ICD10_ID3_STD())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(paterntId);
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3285_ICD10_ID3_STD());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3285_ICD10_NAME3_STD());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3285_ICD10_NAME4_STD()!=null&&zj_BASY_STD.getP3285_ICD10_ID4_STD()!=null&&!"".equals(zj_BASY_STD.getP3285_ICD10_ID4_STD())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(paterntId);
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3285_ICD10_ID4_STD());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3285_ICD10_NAME4_STD());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3285_ICD10_NAME5_STD()!=null&&zj_BASY_STD.getP3285_ICD10_ID5_STD()!=null&&!"".equals(zj_BASY_STD.getP3285_ICD10_ID5_STD())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(paterntId);
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3285_ICD10_ID5_STD());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3285_ICD10_NAME5_STD());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3285_ICD10_NAME6_STD()!=null&&zj_BASY_STD.getP3285_ICD10_ID6_STD()!=null&&!"".equals(zj_BASY_STD.getP3285_ICD10_ID6_STD())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(paterntId);
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3285_ICD10_ID6_STD());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3285_ICD10_NAME6_STD());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3285_ICD10_NAME7_STD()!=null&&zj_BASY_STD.getP3285_ICD10_ID7_STD()!=null&&!"".equals(zj_BASY_STD.getP3285_ICD10_ID7_STD())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(paterntId);
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3285_ICD10_ID7_STD());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3285_ICD10_NAME7_STD());
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
//                indexDiagnosisOtherIcd.setPatientId(paterntId);
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
//                indexDiagnosisOtherIcd.setPatientId(paterntId);
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
        if(zj_BASY_STD.getP3287()!=null&&zj_BASY_STD.getP3288()!=null&&zj_BASY_STD.getP3288()!=""){

            IndexDiagnosisOther indexDiagnosisOther = new IndexDiagnosisOther();
            indexDiagnosisOther.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
            //标识患者身份唯一标识
            indexDiagnosisOther.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
            //唯一标识
            indexDiagnosisOther.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
            //医疗机构代码
            indexDiagnosisOther.setP900(zj_BASY_STD.getP900());
            //患者id
            indexDiagnosisOther.setPatientId(paterntId);
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


            if(zj_BASY_STD.getP3288_ICD10_NAME1_STD()!=null&&zj_BASY_STD.getP3288_ICD10_ID1_STD()!=null&&!"".equals(zj_BASY_STD.getP3288_ICD10_ID1_STD())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(paterntId);
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3288_ICD10_ID1_STD());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3288_ICD10_NAME1_STD());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3288_ICD10_NAME2_STD()!=null&&zj_BASY_STD.getP3288_ICD10_ID2_STD()!=null&&!"".equals(zj_BASY_STD.getP3288_ICD10_ID2_STD())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(paterntId);
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3288_ICD10_ID2_STD());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3288_ICD10_NAME2_STD());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3288_ICD10_NAME3_STD()!=null&&zj_BASY_STD.getP3288_ICD10_ID3_STD()!=null&&!"".equals(zj_BASY_STD.getP3288_ICD10_ID3_STD())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(paterntId);
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3288_ICD10_ID3_STD());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3288_ICD10_NAME3_STD());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3288_ICD10_NAME4_STD()!=null&&zj_BASY_STD.getP3288_ICD10_ID4_STD()!=null&&!"".equals(zj_BASY_STD.getP3288_ICD10_ID4_STD())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(paterntId);
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3288_ICD10_ID4_STD());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3288_ICD10_NAME4_STD());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3288_ICD10_NAME5_STD()!=null&&zj_BASY_STD.getP3288_ICD10_ID5_STD()!=null&&!"".equals(zj_BASY_STD.getP3288_ICD10_ID5_STD())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(paterntId);
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3288_ICD10_ID5_STD());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3288_ICD10_NAME5_STD());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3288_ICD10_NAME6_STD()!=null&&zj_BASY_STD.getP3288_ICD10_ID6_STD()!=null&&!"".equals(zj_BASY_STD.getP3288_ICD10_ID6_STD())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(paterntId);
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3288_ICD10_ID6_STD());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3288_ICD10_NAME6_STD());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3288_ICD10_NAME7_STD()!=null&&zj_BASY_STD.getP3288_ICD10_ID7_STD()!=null&&!"".equals(zj_BASY_STD.getP3288_ICD10_ID7_STD())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(paterntId);
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3288_ICD10_ID7_STD());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3288_ICD10_NAME7_STD());
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
//                indexDiagnosisOtherIcd.setPatientId(paterntId);
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
//                indexDiagnosisOtherIcd.setPatientId(paterntId);
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
        if(zj_BASY_STD.getP3271()!=null&&zj_BASY_STD.getP3272()!=null&&zj_BASY_STD.getP3272()!=""){
            IndexDiagnosisOther indexDiagnosisOther = new IndexDiagnosisOther();
            indexDiagnosisOther.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
            //标识患者身份唯一标识
            indexDiagnosisOther.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
            //唯一标识
            indexDiagnosisOther.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
            //医疗机构代码
            indexDiagnosisOther.setP900(zj_BASY_STD.getP900());
            //患者id
            indexDiagnosisOther.setPatientId(paterntId);
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


            if(zj_BASY_STD.getP3272_ICD10_NAME1_STD()!=null&&zj_BASY_STD.getP3272_ICD10_ID1_STD()!=null&&!"".equals(zj_BASY_STD.getP3272_ICD10_ID1_STD())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(paterntId);
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3272_ICD10_ID1_STD());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3272_ICD10_NAME1_STD());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3272_ICD10_NAME2_STD()!=null&&zj_BASY_STD.getP3272_ICD10_ID2_STD()!=null&&!"".equals(zj_BASY_STD.getP3272_ICD10_ID2_STD())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(paterntId);
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3272_ICD10_ID2_STD());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3272_ICD10_NAME2_STD());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3272_ICD10_NAME3_STD()!=null&&zj_BASY_STD.getP3272_ICD10_ID3_STD()!=null&&!"".equals(zj_BASY_STD.getP3272_ICD10_ID3_STD())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(paterntId);
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3272_ICD10_ID3_STD());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3272_ICD10_NAME3_STD());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3272_ICD10_NAME4_STD()!=null&&zj_BASY_STD.getP3272_ICD10_ID4_STD()!=null&&!"".equals(zj_BASY_STD.getP3272_ICD10_ID4_STD())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(paterntId);
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3272_ICD10_ID4_STD());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3272_ICD10_NAME4_STD());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3272_ICD10_NAME5_STD()!=null&&zj_BASY_STD.getP3272_ICD10_ID5_STD()!=null&&!"".equals(zj_BASY_STD.getP3272_ICD10_ID5_STD())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(paterntId);
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3272_ICD10_ID5_STD());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3272_ICD10_NAME5_STD());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3272_ICD10_NAME6_STD()!=null&&zj_BASY_STD.getP3272_ICD10_ID6_STD()!=null&&!"".equals(zj_BASY_STD.getP3272_ICD10_ID6_STD())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(paterntId);
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3272_ICD10_ID6_STD());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3272_ICD10_NAME6_STD());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3272_ICD10_NAME7_STD()!=null&&zj_BASY_STD.getP3272_ICD10_ID7_STD()!=null&&!"".equals(zj_BASY_STD.getP3272_ICD10_ID7_STD())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(paterntId);
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3272_ICD10_ID7_STD());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3272_ICD10_NAME7_STD());
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
//                indexDiagnosisOtherIcd.setPatientId(paterntId);
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
//                indexDiagnosisOtherIcd.setPatientId(paterntId);
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
        if(zj_BASY_STD.getP3274()!=null&&zj_BASY_STD.getP3275()!=null&&zj_BASY_STD.getP3275()!=""){
            IndexDiagnosisOther indexDiagnosisOther = new IndexDiagnosisOther();
            indexDiagnosisOther.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
            //标识患者身份唯一标识
            indexDiagnosisOther.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
            //唯一标识
            indexDiagnosisOther.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
            //医疗机构代码
            indexDiagnosisOther.setP900(zj_BASY_STD.getP900());
            //患者id
            indexDiagnosisOther.setPatientId(paterntId);
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



            if(zj_BASY_STD.getP3275_ICD10_NAME1_STD()!=null&&zj_BASY_STD.getP3275_ICD10_ID1_STD()!=null&&!"".equals(zj_BASY_STD.getP3275_ICD10_ID1_STD())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(paterntId);
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3275_ICD10_ID1_STD());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3275_ICD10_NAME1_STD());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3275_ICD10_NAME2_STD()!=null&&zj_BASY_STD.getP3275_ICD10_ID2_STD()!=null&&!"".equals(zj_BASY_STD.getP3275_ICD10_ID2_STD())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(paterntId);
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3275_ICD10_ID2_STD());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3275_ICD10_NAME2_STD());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3275_ICD10_NAME3_STD()!=null&&zj_BASY_STD.getP3275_ICD10_ID3_STD()!=null&&!"".equals(zj_BASY_STD.getP3275_ICD10_ID3_STD())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(paterntId);
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3275_ICD10_ID3_STD());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3275_ICD10_NAME3_STD());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3275_ICD10_NAME4_STD()!=null&&zj_BASY_STD.getP3275_ICD10_ID4_STD()!=null&&!"".equals(zj_BASY_STD.getP3275_ICD10_ID4_STD())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(paterntId);
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3275_ICD10_ID4_STD());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3275_ICD10_NAME4_STD());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3275_ICD10_NAME5_STD()!=null&&zj_BASY_STD.getP3275_ICD10_ID5_STD()!=null&&!"".equals(zj_BASY_STD.getP3275_ICD10_ID5_STD())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(paterntId);
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3275_ICD10_ID5_STD());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3275_ICD10_NAME5_STD());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3275_ICD10_NAME6_STD()!=null&&zj_BASY_STD.getP3275_ICD10_ID6_STD()!=null&&!"".equals(zj_BASY_STD.getP3275_ICD10_ID6_STD())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(paterntId);
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3275_ICD10_ID6_STD());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3275_ICD10_NAME6_STD());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3275_ICD10_NAME7_STD()!=null&&zj_BASY_STD.getP3275_ICD10_ID7_STD()!=null&&!"".equals(zj_BASY_STD.getP3275_ICD10_ID7_STD())){
                IndexDiagnosisOtherIcd indexDiagnosisOtherIcd = new IndexDiagnosisOtherIcd();
                indexDiagnosisOtherIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexDiagnosisOtherIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexDiagnosisOtherIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexDiagnosisOtherIcd.setPatientId(paterntId);
                //住院号
                indexDiagnosisOtherIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //诊断编码
                indexDiagnosisOtherIcd.setOtherId(indexDiagnosisOther.getId());
                //诊断编码
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3275_ICD10_ID7_STD());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3275_ICD10_NAME7_STD());
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
//                indexDiagnosisOtherIcd.setPatientId(paterntId);
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
//                indexDiagnosisOtherIcd.setPatientId(paterntId);
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
    public void saveIndexPathology(BASY_DIAG_STD zj_BASY_STD,String paterntId,Date visitDate,Date diagnosisDate){
        log.info("保存病案首页病理诊断："+zj_BASY_STD.getUNIQUE_ID());

        if(zj_BASY_STD.getP351()!=null&&zj_BASY_STD.getP352()!=null&&zj_BASY_STD.getP352()!=""){

            IndexPathology indexPathology = new IndexPathology();
            indexPathology.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
            //标识患者身份唯一标识
            indexPathology.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
            //唯一标识
            indexPathology.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
            //医疗机构代码
            indexPathology.setP900(zj_BASY_STD.getP900());
            //患者id
            indexPathology.setPatientId(paterntId);
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

            if(zj_BASY_STD.getP352_ICD10_NAME1_STD()!=null&&zj_BASY_STD.getP352_ICD10_ID1_STD()!=null&&!"".equals(zj_BASY_STD.getP352_ICD10_ID1_STD())){
                IndexPathologyIcd indexPathologyIcd = new IndexPathologyIcd();
                indexPathologyIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexPathologyIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexPathologyIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexPathologyIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexPathologyIcd.setPatientId(paterntId);
                //住院号
                indexPathologyIcd.setVisitId(zj_BASY_STD.getVISIT_ID());

                //病理诊断编码
                indexPathologyIcd.setPathologyId(indexPathology.getId());
                //病理诊断编码
                indexPathologyIcd.setDiagnosisIcdcode(zj_BASY_STD.getP352_ICD10_ID1_STD());
                //病理诊断名称
                indexPathologyIcd.setDiagnosisIcddesc(zj_BASY_STD.getP352_ICD10_NAME1_STD());
                indexPathologyIcdService.saveIndexPathologyIcd(indexPathologyIcd);
            }
            if(zj_BASY_STD.getP352_ICD10_NAME2_STD()!=null&&zj_BASY_STD.getP352_ICD10_ID2_STD()!=null&&!"".equals(zj_BASY_STD.getP352_ICD10_ID2_STD())){
                IndexPathologyIcd indexPathologyIcd = new IndexPathologyIcd();
                indexPathologyIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexPathologyIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexPathologyIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexPathologyIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexPathologyIcd.setPatientId(paterntId);
                //住院号
                indexPathologyIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //病理诊断编码
                indexPathologyIcd.setPathologyId(indexPathology.getId());
                //病理诊断编码
                indexPathologyIcd.setDiagnosisIcdcode(zj_BASY_STD.getP352_ICD10_ID2_STD());
                //病理诊断名称
                indexPathologyIcd.setDiagnosisIcddesc(zj_BASY_STD.getP352_ICD10_NAME2_STD());
                indexPathologyIcdService.saveIndexPathologyIcd(indexPathologyIcd);
            }
            if(zj_BASY_STD.getP352_ICD10_NAME3_STD()!=null&&zj_BASY_STD.getP352_ICD10_ID3_STD()!=null&&!"".equals(zj_BASY_STD.getP352_ICD10_ID3_STD())){
                IndexPathologyIcd indexPathologyIcd = new IndexPathologyIcd();
                indexPathologyIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexPathologyIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexPathologyIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexPathologyIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexPathologyIcd.setPatientId(paterntId);
                //住院号
                indexPathologyIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //病理诊断编码
                indexPathologyIcd.setPathologyId(indexPathology.getId());
                //病理诊断编码
                indexPathologyIcd.setDiagnosisIcdcode(zj_BASY_STD.getP352_ICD10_ID3_STD());
                //病理诊断名称
                indexPathologyIcd.setDiagnosisIcddesc(zj_BASY_STD.getP352_ICD10_NAME3_STD());
                indexPathologyIcdService.saveIndexPathologyIcd(indexPathologyIcd);
            }
        }

        if(zj_BASY_STD.getP353()!=null&&zj_BASY_STD.getP354()!=null&&zj_BASY_STD.getP354()!=""){

            IndexPathology indexPathology = new IndexPathology();
            indexPathology.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
            //标识患者身份唯一标识
            indexPathology.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
            //唯一标识
            indexPathology.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
            //医疗机构代码
            indexPathology.setP900(zj_BASY_STD.getP900());
            //患者id
            indexPathology.setPatientId(paterntId);
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

            if(zj_BASY_STD.getP354_ICD10_NAME1_STD()!=null&&zj_BASY_STD.getP354_ICD10_ID1_STD()!=null&&!"".equals(zj_BASY_STD.getP354_ICD10_ID1_STD())){
                IndexPathologyIcd indexPathologyIcd = new IndexPathologyIcd();
                indexPathologyIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexPathologyIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexPathologyIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexPathologyIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexPathologyIcd.setPatientId(paterntId);
                //住院号
                indexPathologyIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //病理诊断编码
                indexPathologyIcd.setPathologyId(indexPathology.getId());
                //病理诊断编码
                indexPathologyIcd.setDiagnosisIcdcode(zj_BASY_STD.getP354_ICD10_ID1_STD());
                //病理诊断名称
                indexPathologyIcd.setDiagnosisIcddesc(zj_BASY_STD.getP354_ICD10_NAME1_STD());
                indexPathologyIcdService.saveIndexPathologyIcd(indexPathologyIcd);
            }
            if(zj_BASY_STD.getP354_ICD10_NAME2_STD()!=null&&zj_BASY_STD.getP354_ICD10_ID2_STD()!=null&&!"".equals(zj_BASY_STD.getP354_ICD10_ID2_STD())){
                IndexPathologyIcd indexPathologyIcd = new IndexPathologyIcd();
                indexPathologyIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexPathologyIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexPathologyIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexPathologyIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexPathologyIcd.setPatientId(paterntId);
                //住院号
                indexPathologyIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //病理诊断编码
                indexPathologyIcd.setPathologyId(indexPathology.getId());
                //病理诊断编码
                indexPathologyIcd.setDiagnosisIcdcode(zj_BASY_STD.getP354_ICD10_ID2_STD());
                //病理诊断名称
                indexPathologyIcd.setDiagnosisIcddesc(zj_BASY_STD.getP354_ICD10_NAME2_STD());
                indexPathologyIcdService.saveIndexPathologyIcd(indexPathologyIcd);
            }
            if(zj_BASY_STD.getP354_ICD10_NAME3_STD()!=null&&zj_BASY_STD.getP354_ICD10_ID3_STD()!=null&&!"".equals(zj_BASY_STD.getP354_ICD10_ID3_STD())){
                IndexPathologyIcd indexPathologyIcd = new IndexPathologyIcd();
                indexPathologyIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexPathologyIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexPathologyIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexPathologyIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexPathologyIcd.setPatientId(paterntId);
                //住院号
                indexPathologyIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //病理诊断编码
                indexPathologyIcd.setPathologyId(indexPathology.getId());
                //病理诊断编码
                indexPathologyIcd.setDiagnosisIcdcode(zj_BASY_STD.getP354_ICD10_ID3_STD());
                //病理诊断名称
                indexPathologyIcd.setDiagnosisIcddesc(zj_BASY_STD.getP354_ICD10_NAME3_STD());
                indexPathologyIcdService.saveIndexPathologyIcd(indexPathologyIcd);
            }



        }

        if(zj_BASY_STD.getP355()!=null&&zj_BASY_STD.getP356()!=null&&zj_BASY_STD.getP356()!=""){

            IndexPathology indexPathology = new IndexPathology();
            indexPathology.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
            //标识患者身份唯一标识
            indexPathology.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
            //唯一标识
            indexPathology.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
            //医疗机构代码
            indexPathology.setP900(zj_BASY_STD.getP900());
            //患者id
            indexPathology.setPatientId(paterntId);
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


            if(zj_BASY_STD.getP356_ICD10_NAME1_STD()!=null&&zj_BASY_STD.getP356_ICD10_ID1_STD()!=null&&!"".equals(zj_BASY_STD.getP356_ICD10_ID1_STD())){
                IndexPathologyIcd indexPathologyIcd = new IndexPathologyIcd();
                indexPathologyIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexPathologyIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexPathologyIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexPathologyIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexPathologyIcd.setPatientId(paterntId);
                //住院号
                indexPathologyIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //病理诊断编码
                indexPathologyIcd.setPathologyId(indexPathology.getId());
                //病理诊断编码
                indexPathologyIcd.setDiagnosisIcdcode(zj_BASY_STD.getP356_ICD10_ID1_STD());
                //病理诊断名称
                indexPathologyIcd.setDiagnosisIcddesc(zj_BASY_STD.getP356_ICD10_NAME1_STD());
                indexPathologyIcdService.saveIndexPathologyIcd(indexPathologyIcd);
            }
            if(zj_BASY_STD.getP356_ICD10_NAME2_STD()!=null&&zj_BASY_STD.getP356_ICD10_ID2_STD()!=null&&!"".equals(zj_BASY_STD.getP356_ICD10_ID2_STD())){
                IndexPathologyIcd indexPathologyIcd = new IndexPathologyIcd();
                indexPathologyIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexPathologyIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexPathologyIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexPathologyIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexPathologyIcd.setPatientId(paterntId);
                //住院号
                indexPathologyIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //病理诊断编码
                indexPathologyIcd.setPathologyId(indexPathology.getId());
                //病理诊断编码
                indexPathologyIcd.setDiagnosisIcdcode(zj_BASY_STD.getP356_ICD10_ID2_STD());
                //病理诊断名称
                indexPathologyIcd.setDiagnosisIcddesc(zj_BASY_STD.getP356_ICD10_NAME2_STD());
                indexPathologyIcdService.saveIndexPathologyIcd(indexPathologyIcd);
            }
            if(zj_BASY_STD.getP356_ICD10_NAME3_STD()!=null&&zj_BASY_STD.getP356_ICD10_ID3_STD()!=null&&!"".equals(zj_BASY_STD.getP356_ICD10_ID3_STD())){
                IndexPathologyIcd indexPathologyIcd = new IndexPathologyIcd();
                indexPathologyIcd.setUniqueId(zj_BASY_STD.getUNIQUE_ID());
                //标识患者身份唯一标识
                indexPathologyIcd.setUniqueIdLv1(zj_BASY_STD.getUNIQUE_ID_LV1());
                //唯一标识
                indexPathologyIcd.setUniqueIdLv2(zj_BASY_STD.getUNIQUE_ID_LV2());
                //医疗机构代码
                indexPathologyIcd.setP900(zj_BASY_STD.getP900());
                //患者id
                indexPathologyIcd.setPatientId(paterntId);
                //住院号
                indexPathologyIcd.setVisitId(zj_BASY_STD.getVISIT_ID());
                //病理诊断编码
                indexPathologyIcd.setPathologyId(indexPathology.getId());
                //病理诊断编码
                indexPathologyIcd.setDiagnosisIcdcode(zj_BASY_STD.getP356_ICD10_ID3_STD());
                //病理诊断名称
                indexPathologyIcd.setDiagnosisIcddesc(zj_BASY_STD.getP356_ICD10_NAME3_STD());
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

            indexIcu.setUniqueId(zj_BASY_NSTD.getUNIQUE_ID());
            //标识患者身份唯一标识
            indexIcu.setUniqueIdLv1(zj_BASY_NSTD.getUNIQUE_ID_LV1());
            //唯一标识
            indexIcu.setUniqueIdLv2(zj_BASY_NSTD.getUNIQUE_ID_LV2());
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

            indexIcu.setUniqueId(zj_BASY_NSTD.getUNIQUE_ID());
            //标识患者身份唯一标识
            indexIcu.setUniqueIdLv1(zj_BASY_NSTD.getUNIQUE_ID_LV1());
            //唯一标识
            indexIcu.setUniqueIdLv2(zj_BASY_NSTD.getUNIQUE_ID_LV2());
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

            indexIcu.setUniqueId(zj_BASY_NSTD.getUNIQUE_ID());
            //标识患者身份唯一标识
            indexIcu.setUniqueIdLv1(zj_BASY_NSTD.getUNIQUE_ID_LV1());
            //唯一标识
            indexIcu.setUniqueIdLv2(zj_BASY_NSTD.getUNIQUE_ID_LV2());
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

            indexIcu.setUniqueId(zj_BASY_NSTD.getUNIQUE_ID());
            //标识患者身份唯一标识
            indexIcu.setUniqueIdLv1(zj_BASY_NSTD.getUNIQUE_ID_LV1());
            //唯一标识
            indexIcu.setUniqueIdLv2(zj_BASY_NSTD.getUNIQUE_ID_LV2());
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
    public void saveIndexInjury(BASY_DIAG_STD zj_BASY_STD,String paterntId){
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
            indexInjury.setPatientId(paterntId);
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
            indexInjury.setPatientId(paterntId);
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
            indexInjury.setPatientId(paterntId);
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
        if (zj_NURSING_RECORD.size()!=0&&zj_NURSING_RECORD.get(0).getNURSE_SIGNATURE_TIME()!=null){
            for(NURSING_RECORD nursing_record:zj_NURSING_RECORD){
                PersonGeneral personGeneral = new PersonGeneral();
                log.info("保存患者一般情况"+nursing_record.getUNIQUE_ID_LV2());
                personGeneral.setUniqueId(nursing_record.getUNIQUE_ID());
                //标识患者身份唯一标识
                personGeneral.setUniqueIdLv1(nursing_record.getUNIQUE_ID_LV1());
                //唯一标识
                personGeneral.setUniqueIdLv2(nursing_record.getUNIQUE_ID_LV2());
                //医疗机构代码
                personGeneral.setP900(nursing_record.getP900());
                //患者id
                personGeneral.setPatientId(nursing_record.getPATIENT_ID());
                //住院号
                personGeneral.setVisitId(nursing_record.getVISIT_ID());
                //日期
                personGeneral.setRecordTime(nursing_record.getNURSE_SIGNATURE_TIME());
//                if (zj_VITAL_RECORD.size()!=0){
//                    log.info("保存患者一般情况"+zj_VITAL_RECORD.get(0).getUNIQUE_ID_LV2());
//                    personGeneral.setUniqueId(nursing_record.getUNIQUE_ID());
//                    //标识患者身份唯一标识
//                    personGeneral.setUniqueIdLv1(zj_VITAL_RECORD.get(0).getUNIQUE_ID_LV1());
//                    //唯一标识
//                    personGeneral.setUniqueIdLv2(zj_VITAL_RECORD.get(0).getUNIQUE_ID_LV2());
//                    //医疗机构代码
//                    personGeneral.setP900(zj_VITAL_RECORD.get(0).getP900());
//                    //患者id
//                    personGeneral.setPatientId(zj_VITAL_RECORD.get(0).getPATIENT_ID());
//                    //住院号
//                    personGeneral.setVisitId(zj_VITAL_RECORD.get(0).getVISIT_ID());
//                    //日期
//                    personGeneral.setRecordTime(nursing_record.getNURSE_SIGNATURE_TIME());
//                }
                if(nursing_record!=null&&nursing_record.getNURSE_SIGNATURE_TIME()!=null){

                    //体温
                    try {
                        Double temp = Double.parseDouble(nursing_record.getBODY_TEMPERATURE());
                        personGeneral.setBodyTemperature(temp);
                    }catch (Exception e){
                        if (nursing_record.getNURSE_SIGNATURE_TIME()!=null){
                            String date =format.format(nursing_record.getNURSE_SIGNATURE_TIME());
                            String temperature=  map.get(date);
                            try{
                                Double temp = Double.parseDouble(temperature);
                                personGeneral.setBodyTemperature(temp);
                            }catch (Exception e1){
                            }
                        }
                    }

                    //呼吸
                    try {
                        Integer temp = Integer.parseInt(nursing_record.getBREATHING_FREQUENCY());
                        personGeneral.setBreathingFrequency(temp);
                    }catch (Exception e){

                    }

                    //脉搏
                    try {
                        Integer temp = Integer.parseInt(nursing_record.getPULSE());
                        personGeneral.setHeartRate(temp);
                    }catch (Exception e){

                    }

                    personGeneral.setRecordTime(nursing_record.getNURSE_SIGNATURE_TIME());

                    //舒张压(低压)，收缩压(高压)
                    String lowPressure = nursing_record.getDIASTOLIC_BLOOD_PRESSURE();
                    if (lowPressure==null){
                        lowPressure = "";
                    }
                    String[] lowPressures=lowPressure.split("/");
                    int lowInt=-1;
                    int highInt =-1;
                    if (lowPressures.length==2){
                        String highString = lowPressures[0];
                        String lowString = lowPressures[1];

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
                    }else {
                    }
                    personGeneralService.savePersonGeneral(personGeneral);
                }

            }
        }else if (zj_NURSING_RECORD.size()!=0&&zj_NURSING_RECORD.get(0).getRECORD_TIME()!=null){
            log.info("保存患者一般情况"+zj_NURSING_RECORD.get(0).getUNIQUE_ID_LV2());
            PersonGeneral personGeneral = new PersonGeneral();
            personGeneral.setUniqueId(zj_NURSING_RECORD.get(0).getUNIQUE_ID());
            //标识患者身份唯一标识
            personGeneral.setUniqueIdLv1(zj_NURSING_RECORD.get(0).getUNIQUE_ID_LV1());
            //唯一标识
            personGeneral.setUniqueIdLv2(zj_NURSING_RECORD.get(0).getUNIQUE_ID_LV2());
            //医疗机构代码
            personGeneral.setP900(zj_NURSING_RECORD.get(0).getP900());
            //患者id
            personGeneral.setPatientId(zj_NURSING_RECORD.get(0).getPATIENT_ID());
            //住院号
            personGeneral.setVisitId(zj_NURSING_RECORD.get(0).getVISIT_ID());
            //日期
            personGeneral.setRecordTime(zj_NURSING_RECORD.get(0).getRECORD_TIME());

            for(NURSING_RECORD nursing_record:zj_NURSING_RECORD){
                if (personGeneral.getBreathingFrequency()==null&&nursing_record.getBREATHING_FREQUENCY()!=null&&!nursing_record.getBREATHING_FREQUENCY().equals("")){
                    try {
                        Integer temp = Integer.parseInt(nursing_record.getBREATHING_FREQUENCY());
                        personGeneral.setBreathingFrequency(temp);
                    }catch (Exception e){

                    }
                }
                if (personGeneral.getHeartRate()==null&&nursing_record.getPULSE()!=null&&!nursing_record.getPULSE().equals("")){
                    try {
                        Integer temp1 = Integer.parseInt(nursing_record.getPULSE());
                        personGeneral.setHeartRate(temp1);
                    }catch (Exception e){

                    }

                }
                if (personGeneral.getBodyTemperature()==null&&nursing_record.getBODY_TEMPERATURE()!=null&&!nursing_record.getBODY_TEMPERATURE().equals("")){
                    try {
                        Double temp = Double.parseDouble(nursing_record.getBODY_TEMPERATURE());
                        personGeneral.setBodyTemperature(temp);
                    }catch (Exception e){

                    }
                }else {
                    String date =format.format(nursing_record.getRECORD_TIME());
                    String temperature=  map.get(date);
                    if (temperature!=null){
                        try{
                            Double temp = Double.parseDouble(temperature);
                            personGeneral.setBodyTemperature(temp);
                        }catch (Exception e1){
                        }
                    }
                }
                if (personGeneral.getDiastolicBloodPressure()==null&&nursing_record.getDIASTOLIC_BLOOD_PRESSURE()!=null&&!nursing_record.getDIASTOLIC_BLOOD_PRESSURE().equals("")){
                    try {
                        Integer temp2 = Integer.parseInt(nursing_record.getDIASTOLIC_BLOOD_PRESSURE());
                        personGeneral.setDiastolicBloodPressure(temp2);
                    }catch (Exception e){

                    }
                }
                if (personGeneral.getSystolicBloodPressure()==null&&nursing_record.getSYSTOLIC_BLOOD_PRESSURE()!=null&&!nursing_record.getSYSTOLIC_BLOOD_PRESSURE().equals("")){
                    try {
                        Integer temp2 = Integer.parseInt(nursing_record.getSYSTOLIC_BLOOD_PRESSURE());
                        personGeneral.setSystolicBloodPressure(temp2);
                    }catch (Exception e){

                    }

                }
            }
            personGeneralService.savePersonGeneral(personGeneral);
        }


    }

    public void saveSymptom(List<SYMP_PRESENT> zj_SYMPTOMS){
        log.info("保存症状体征："+zj_SYMPTOMS.get(0).getunique_id());

        Symptom symptom = new Symptom();
        //标识患者身份唯一标识
        symptom.setUniqueId(zj_SYMPTOMS.get(0).getunique_id());
        //唯一标识
        symptom.setUniqueIdLv1(zj_SYMPTOMS.get(0).getunique_id_lv1());
        symptom.setUniqueIdLv2(zj_SYMPTOMS.get(0).getunique_id_lv2());
        //医疗机构代码
        symptom.setP900(zj_SYMPTOMS.get(0).getp900());
        //患者id
        symptom.setPatientId(zj_SYMPTOMS.get(0).getpatient_id());
        //门诊/住院号
        symptom.setVisitId(zj_SYMPTOMS.get(0).getvisit_id());

        Set<String> set = new HashSet<>();
        List<String> list = Arrays.asList(
                "肝区疼痛",
                "腹胀",
                "纳差",
                "乏力",
                "消瘦",
                "上腹部包块",
                "腹部肿物",
                "低热",
                "发热",
                "黄疸",
                "梗阻性黄疸",
                "腹泻",
                "上消化道出血",
                "消化道出血",
                "呕血",
                "黑便",
                "便血",
                "肝破裂",
                "腹水",
                "肝掌",
                "蜘蛛痣",
                "下肢水肿",
                "男性乳腺增生"
        );
        for (SYMP_PRESENT symp_present:zj_SYMPTOMS
             ) {
            if (symp_present.getneg()==null||symp_present.getneg().equals("")){
                if (symp_present.getfinding1_std()!=null&&!symp_present.getfinding1_std().equals("")&&list.contains(symp_present.getfinding1_std())){
                    set.add(symp_present.getfinding1_std());
                }
                if (symp_present.getfinding2_std()!=null&&!symp_present.getfinding2_std().equals("")&&list.contains(symp_present.getfinding2_std())){
                    set.add(symp_present.getfinding2_std());
                }
                if (symp_present.getfinding3_std()!=null&&!symp_present.getfinding3_std().equals("")&&list.contains(symp_present.getfinding3_std())){
                    set.add(symp_present.getfinding3_std());
                }
                if (symp_present.getfinding4_std()!=null&&!symp_present.getfinding4_std().equals("")&&list.contains(symp_present.getfinding4_std())){
                    set.add(symp_present.getfinding4_std());
                }
                if (symp_present.getfinding5_std()!=null&&!symp_present.getfinding5_std().equals("")&&list.contains(symp_present.getfinding5_std())){
                    set.add(symp_present.getfinding5_std());
                }
                if (symp_present.getfinding6_std()!=null&&!symp_present.getfinding6_std().equals("")&&list.contains(symp_present.getfinding6_std())){
                    set.add(symp_present.getfinding6_std());
                }
            }
        }
        String s = set.stream().reduce("", (a, b) -> a + b + ",");
        if (s.endsWith(",")){
            s = s.substring(0, s.length() - 1);
        }
        symptom.setSymptoms(s);
        symptomService.saveSymptom(symptom);
    }

    public void saveHisPerson(List<SMOKE_AND_DRINK> zj_SMOKE_AND_DRINK){
        log.info("保存个人史："+zj_SMOKE_AND_DRINK.get(0).getunique_id());

        HisPerson hisPerson = new HisPerson();
        //唯一标识
        hisPerson.setUniqueId(zj_SMOKE_AND_DRINK.get(0).getunique_id());
        hisPerson.setUniqueIdLv1(zj_SMOKE_AND_DRINK.get(0).getunique_id_lv1());
        hisPerson.setUniqueIdLv2(zj_SMOKE_AND_DRINK.get(0).getunique_id_lv2());
        //医疗机构代码
        hisPerson.setP900(zj_SMOKE_AND_DRINK.get(0).getp900());
        //患者id
        hisPerson.setPatientId(zj_SMOKE_AND_DRINK.get(0).getpatient_id());
        //住院号
        hisPerson.setVisitId(zj_SMOKE_AND_DRINK.get(0).getvisit_id());

//        if(zj_TEM_INP_ADMISSION_STATUS!=null){
//            BigDecimal wight=new BigDecimal(zj_TEM_INP_ADMISSION_STATUS.get(0).getby_weight());
//            BigDecimal height=new BigDecimal(zj_TEM_INP_ADMISSION_STATUS.get(0).getby_height());
//
//            if(wight!=null&&height!=null){
//                BigDecimal fat=   wight.divide((height.multiply(height)));
//                //肥胖
//                hisPerson.(fat.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());
//
//                Double area=((0.61*height.doubleValue())+((0.0128*wight.doubleValue()))-0.1529);
//
//                //体表面积
//                hisPerson.setBodyarea(area);
//
//            }
//
//        }
        for(SMOKE_AND_DRINK smoke_and_drink: zj_SMOKE_AND_DRINK){
            //吸烟
            if (smoke_and_drink.getsmoker_std() != null && !smoke_and_drink.getsmoker_std().equals("")) {
                hisPerson.setSmoke(smoke_and_drink.getsmoker_std());
            }
            if (smoke_and_drink.getyear_of_smoke_std() != null && !smoke_and_drink.getyear_of_smoke_std().equals("")
                &&!smoke_and_drink.getyear_of_smoke_std().equals("无效")) {
                hisPerson.setSmokeYear(Double.parseDouble(smoke_and_drink.getyear_of_smoke_std()));
            }
            if (smoke_and_drink.getconsumption_smoke_std() != null && !smoke_and_drink.getconsumption_smoke_std().equals("")
                &&!smoke_and_drink.getconsumption_smoke_std().equals("无效")) {
                hisPerson.setDailySmoke(smoke_and_drink.getconsumption_smoke_std()
                        + smoke_and_drink.getconsumption_smoke_unit_std()==null?"":smoke_and_drink.getconsumption_smoke_unit_std()
                        + smoke_and_drink.getsmoke_freq_std()==null?"": smoke_and_drink.getsmoke_freq_std()
                        + smoke_and_drink.getsmoke_freq_unit_std()==null?"":smoke_and_drink.getsmoke_freq_unit_std());
            }
            if (smoke_and_drink.getsmoke_quitter_std() != null && !smoke_and_drink.getsmoke_quitter_std().equals("")) {
                hisPerson.setStopSmoke(smoke_and_drink.getsmoke_quitter_std());
            }
            if (smoke_and_drink.getyear_of_smoke_q_std() != null && !smoke_and_drink.getyear_of_smoke_q_std().equals("")
                    && !smoke_and_drink.getyear_of_smoke_q_std().equals("无效")) {
                hisPerson.setStopSmokeYear(Double.parseDouble(smoke_and_drink.getyear_of_smoke_q_std()));
            }

            //饮酒
            if (smoke_and_drink.getdrinker_std() != null && !smoke_and_drink.getdrinker_std().equals("")) {
                hisPerson.setDrink(smoke_and_drink.getdrinker_std());
            }
            if (smoke_and_drink.getyear_of_drink_std() != null && !smoke_and_drink.getyear_of_drink_std().equals("")
                &&!smoke_and_drink.getyear_of_drink_std().equals("无效")) {
                hisPerson.setDrinkYear(Double.parseDouble(smoke_and_drink.getyear_of_drink_std()));
            }
            StringBuilder stringBuilder = new StringBuilder();
            if (smoke_and_drink.getconsumption_drink1_std() != null && !smoke_and_drink.getconsumption_drink1_std().equals("")) {
                stringBuilder
                        .append(smoke_and_drink.getdrink_type1_std()==null?"":smoke_and_drink.getdrink_type1_std())
                        .append(smoke_and_drink.getconsumption_drink1_std()==null?"":smoke_and_drink.getconsumption_drink1_std())
                        .append(smoke_and_drink.getconsumption_drink_unit1_std()==null?"":smoke_and_drink.getconsumption_drink_unit1_std())
                        .append(smoke_and_drink.getdrink_freq1_std()==null?"":smoke_and_drink.getdrink_freq1_std())
                        .append(smoke_and_drink.getdrink_freq_unit1_std()==null?"":smoke_and_drink.getdrink_freq_unit1_std());
                if (smoke_and_drink.getconsumption_drink2_std() != null && !smoke_and_drink.getconsumption_drink2_std().equals("")){
                    stringBuilder
                            .append(",")
                            .append(smoke_and_drink.getdrink_type2_std()==null?"":smoke_and_drink.getdrink_type2_std())
                            .append(smoke_and_drink.getconsumption_drink2_std()==null?"":smoke_and_drink.getconsumption_drink2_std())
                            .append(smoke_and_drink.getconsumption_drink_unit2_std()==null?"":smoke_and_drink.getconsumption_drink_unit2_std())
                            .append(smoke_and_drink.getdrink_freq2_std()==null?"":smoke_and_drink.getdrink_freq2_std())
                            .append(smoke_and_drink.getdrink_freq_unit2_std()==null?"":smoke_and_drink.getdrink_freq_unit2_std());
                }
            }
            if (stringBuilder.length()!=0){
                hisPerson.setDailyDrink(stringBuilder.toString());
            }
            if (smoke_and_drink.getdrink_quitter_std() != null && !smoke_and_drink.getdrink_quitter_std().equals("")) {
                hisPerson.setStopDrink(smoke_and_drink.getdrink_quitter_std());
            }
            if (smoke_and_drink.getyear_of_drink_q_std() != null && !smoke_and_drink.getyear_of_drink_q_std().equals("")
                    && !smoke_and_drink.getyear_of_drink_q_std().equals("无效")) {
                hisPerson.setStopDrinkYear(Double.parseDouble(smoke_and_drink.getyear_of_drink_q_std()));
            }

        }
        //修改时间
        hisPerson.setUpdatedAt(new Date());
        hisPersonService.saveHisPerson(hisPerson);
    }

    public void saveHisFamily( List<FAMILY_HISTORY> zj_FAMILY_HISTORY ){

        log.info("保存家族史："+ zj_FAMILY_HISTORY.get(0).getunique_id());

        for (FAMILY_HISTORY family_history:zj_FAMILY_HISTORY
             ) {
            HisFamily hisFamily = new HisFamily();
            hisFamily.setUniqueId(family_history.getunique_id());
            //唯一标识
            hisFamily.setUniqueIdLv1(zj_FAMILY_HISTORY.get(0).getunique_id_lv1());
            hisFamily.setUniqueIdLv2(zj_FAMILY_HISTORY.get(0).getunique_id_lv2());
            //医疗机构代码
            hisFamily.setP900(zj_FAMILY_HISTORY.get(0).getp900());
            //患者id
            hisFamily.setPatientId(zj_FAMILY_HISTORY.get(0).getpatient_id());
            //住院号
            hisFamily.setVisitId(zj_FAMILY_HISTORY.get(0).getvisit_id());

//            if ((family_history.getneg()==null||family_history.getneg().equals(""))&&(family_history.getdiag()!=null)&&
//                    (family_history.getdiag().contains("肿瘤")||family_history.getdiag().contains("癌")||
//                            family_history.getdiag().contains("淋巴瘤")||family_history.getdiag().contains("白血病"))){
//                hisFamily.setFamilyTumour("是");
//                hisFamily.setTumourRelative(family_history.getrelation());
//                hisFamily.setRelativeTumourName(family_history.getdiag());
//            }else {
//                hisFamily.setFamilyTumour("否");
//            }
//
//            if ((family_history.getneg()==null||family_history.getneg().equals(""))&&(family_history.getdiag()!=null)&&
//                    (family_history.getdiag().contains("循环")||family_history.getdiag().contains("脑卒中")||
//                            family_history.getdiag().contains("冠心病")||family_history.getdiag().contains("高血压"))){
//                hisFamily.setFamilyCcvd("是");
//                hisFamily.setCcvdRelative(family_history.getrelation());
//                hisFamily.setRelativeCcvdName(family_history.getdiag());
//            }else {
//                hisFamily.setFamilyCcvd("否");
//            }
            if ((family_history.getneg_std()==null||family_history.getneg_std().equals(""))&&(family_history.geticd10_name1()!=null)&&
                    (family_history.geticd10_name1().contains("肿瘤")||family_history.geticd10_name1().contains("癌")||
                            family_history.geticd10_name1().contains("淋巴瘤")||family_history.geticd10_name1().contains("白血病"))){
                hisFamily.setFamilyTumour("是");
                hisFamily.setTumourRelative(family_history.getrelation1_std());
                hisFamily.setRelativeTumourName(family_history.geticd10_name1());
            }else if ((family_history.getneg_std()==null||family_history.getneg_std().equals(""))&&(family_history.geticd10_name2()!=null)&&
                    (family_history.geticd10_name2().contains("肿瘤")||family_history.geticd10_name2().contains("癌")||
                            family_history.geticd10_name2().contains("淋巴瘤")||family_history.geticd10_name2().contains("白血病"))){
                hisFamily.setFamilyTumour("是");
                hisFamily.setTumourRelative(family_history.getrelation1_std());
                hisFamily.setRelativeTumourName(family_history.geticd10_name2());
            }else {
                hisFamily.setFamilyTumour("否");
            }

            if ((family_history.getneg_std()==null||family_history.getneg_std().equals(""))&&(family_history.geticd10_name1()!=null)&&
                    (family_history.geticd10_name1().contains("循环")||family_history.geticd10_name1().contains("脑卒中")||
                            family_history.geticd10_name1().contains("冠心病")||family_history.geticd10_name1().contains("高血压"))){
                hisFamily.setFamilyCcvd("是");
                hisFamily.setCcvdRelative(family_history.getrelation1_std());
                hisFamily.setRelativeCcvdName(family_history.geticd10_name1());
            }else
            if ((family_history.getneg_std()==null||family_history.getneg_std().equals(""))&&(family_history.geticd10_name2()!=null)&&
                    (family_history.geticd10_name2().contains("循环")||family_history.geticd10_name2().contains("脑卒中")||
                            family_history.geticd10_name2().contains("冠心病")||family_history.geticd10_name2().contains("高血压"))){
                hisFamily.setFamilyCcvd("是");
                hisFamily.setCcvdRelative(family_history.getrelation1_std());
                hisFamily.setRelativeCcvdName(family_history.geticd10_name2());
            }else {
                hisFamily.setFamilyCcvd("否");
            }

            hisFamilyService.saveHisFamily(hisFamily);
        }


    }

//    public void saveHisPerson(List<SMOKE_AND_DRINK> zj_SMOKE_AND_DRINK, List<TEM_INP_ADMISSION_STATUS> zj_TEM_INP_ADMISSION_STATUS){
//        log.info("保存个人史："+zj_SMOKE_AND_DRINK.get(0).getunique_id());
//        HisPerson hisPerson = new HisPerson();
//        if (zj_SMOKE_AND_DRINK.size()!=0){
//            //标识患者身份唯一标识
//            hisPerson.setPersonId(zj_SMOKE_AND_DRINK.get(0).getunique_id_lv1());
//            //唯一标识
//            hisPerson.setUniqueId(zj_SMOKE_AND_DRINK.get(0).getunique_id_lv2());
//            //医疗机构代码
//            hisPerson.setP900(zj_SMOKE_AND_DRINK.get(0).getp900());
//            //患者id
//            hisPerson.setPatientId(zj_SMOKE_AND_DRINK.get(0).getpatient_id());
//            //住院号
//            hisPerson.setVisitId(zj_SMOKE_AND_DRINK.get(0).getvisit_id());
//        }
//
//        for (SMOKE_AND_DRINK smoke_and_drink:zj_SMOKE_AND_DRINK
//             ) {
//            if (smoke_and_drink.getsmoker()!=null&&!smoke_and_drink.getsmoker().equals("")){
//                hisPerson.setSmoke(smoke_and_drink.getsmoker());
//            }
//            if (smoke_and_drink.getyear_of_smoke()!=null&&!smoke_and_drink.getyear_of_smoke().equals("")){
//                hisPerson.setSmokeYear(Double.valueOf(smoke_and_drink.getyear_of_smoke()));
//            }
//
//        }
//
//        //修改时间
//        hisPerson.setUpdatedAt(new Date());
//        hisPersonService.saveHisPerson(hisPerson);
//    }


//    public void saveHisFamily(){
//        HisFamily hisFamily = new HisFamily();
//        //标识患者身份唯一标识
//        hisFamily.setPersonId();
//        //唯一标识
//        hisFamily.setUniqueId();
//        //中间库unique_id
//        hisFamily.setUniqueIdLv3();
//        //医疗机构代码
//        hisFamily.setP900();
//        //患者id
//        hisFamily.setPatientId();
//        //住院号
//        hisFamily.setVisitId();
//        //肿瘤家族史
//        hisFamily.setFamilyTumour();
//        //肿瘤血缘亲属与患者的关系
//        hisFamily.setTumourRelative();
//        //肿瘤血缘亲属肿瘤疾病名称
//        hisFamily.setRelativeTumourName();
//        //心脑血管疾病家族史
//        hisFamily.setFamilyCcvd();
//        //血缘亲属与患者的关系
//        hisFamily.setCcvdRelative();
//        //血缘亲属患心脑血管疾病名称
//        hisFamily.setRelativeCcvdName();
//        //数据版本
//        hisFamily.setDataVersion();
//        //数据库来源
//        hisFamily.setDataDbSource();
//        //数据表来源
//        hisFamily.setDataTableSource();
//        //数据项来源
//        hisFamily.setDataFieldSource();
//        //创建时间
//        hisFamily.setCreatedAt();
//        //创建人
//        hisFamily.setCreator();
//        //修改时间
//        hisFamily.setUpdatedAt();
//        hisFamilyService.saveHisFamily(hisFamily);
//    }
    public void saveHisPast(List<PRIOR_DISEASE_AND_SURGERY> zj_PRIOR_DISEASE_AND_SURGERY) {
        log.info("保存既往史："+zj_PRIOR_DISEASE_AND_SURGERY.get(0).getunique_id());
        HisPast hisPast = new HisPast();
        hisPast.setUniqueId(zj_PRIOR_DISEASE_AND_SURGERY.get(0).getunique_id());
        //标识患者身份唯一标识
        hisPast.setUniqueIdLv1(zj_PRIOR_DISEASE_AND_SURGERY.get(0).getunique_id_lv1());
        //唯一标识
        hisPast.setUniqueIdLv2(zj_PRIOR_DISEASE_AND_SURGERY.get(0).getunique_id_lv2());
        //医疗机构代码
        hisPast.setP900(zj_PRIOR_DISEASE_AND_SURGERY.get(0).getp900());
        //患者id
        hisPast.setPatientId(zj_PRIOR_DISEASE_AND_SURGERY.get(0).getpatient_id());
        //住院号
        hisPast.setVisitId(zj_PRIOR_DISEASE_AND_SURGERY.get(0).getvisit_id());

        for (PRIOR_DISEASE_AND_SURGERY prior:zj_PRIOR_DISEASE_AND_SURGERY
             ) {
            //高血压
            hisPast.setHypertension(hisPast.getHypertension()!=null&&hisPast.getHypertension().equals("是")?"是":parsePast(Constant.gxyKeyword,prior.getneg_std(),prior.geticd10_name1(),prior.geticd10_name2(),
                    prior.geticd10_name3(),prior.geticd10_name4(),prior.geticd10_name5()));
            //糖尿病
            hisPast.setGlycuresis(hisPast.getGlycuresis()!=null&&hisPast.getGlycuresis().equals("是")?"是":parsePast(Constant.tnbKeyword,prior.getneg_std(),prior.geticd10_name1(),prior.geticd10_name2(),
                    prior.geticd10_name3(),prior.geticd10_name4(),prior.geticd10_name5()));
            //慢性阻塞性肺病(COPD)
            hisPast.setCopd(hisPast.getCopd()!=null&&hisPast.getCopd().equals("是")?"是":parsePast1(Arrays.asList("慢性阻塞性肺病"),prior.getneg_std(),prior.geticd10_name1(),prior.geticd10_name2(),
                    prior.geticd10_name3(),prior.geticd10_name4(),prior.geticd10_name5()));
            //心脏病
            hisPast.setHeartDisease(hisPast.getHeartDisease()!=null&&hisPast.getHeartDisease().equals("是")?"是":parsePast(Constant.xzbKeyword,prior.getneg_std(),prior.geticd10_name1(),prior.geticd10_name2(),
                    prior.geticd10_name3(),prior.geticd10_name4(),prior.geticd10_name5()));
            //肝炎
            hisPast.setHepatitis(hisPast.getHepatitis()!=null&&hisPast.getHepatitis().equals("是")?"是":parsePast(Constant.gyKeyword,prior.getneg_std(),prior.geticd10_name1(),prior.geticd10_name2(),
                    prior.geticd10_name3(),prior.geticd10_name4(),prior.geticd10_name5()));
            //甲肝
            hisPast.setHepatitisA(hisPast.getHepatitisA()!=null&&hisPast.getHepatitisA().equals("是")?"是":parsePast1(Arrays.asList("甲型病毒性肝炎"),prior.getneg_std(),prior.geticd10_name1(),prior.geticd10_name2(),
                    prior.geticd10_name3(),prior.geticd10_name4(),prior.geticd10_name5()));
            //乙肝
            hisPast.setHepatitisB(hisPast.getHepatitisB()!=null&&hisPast.getHepatitisB().equals("是")?"是":parsePast1(Arrays.asList("乙型病毒性肝炎"),prior.getneg_std(),prior.geticd10_name1(),prior.geticd10_name2(),
                    prior.geticd10_name3(),prior.geticd10_name4(),prior.geticd10_name5()));
            //丙肝
            hisPast.setHepatitisC(hisPast.getHepatitisC()!=null&&hisPast.getHepatitisC().equals("是")?"是":parsePast1(Arrays.asList("丙型病毒性肝炎"),prior.getneg_std(),prior.geticd10_name1(),prior.geticd10_name2(),
                    prior.geticd10_name3(),prior.geticd10_name4(),prior.geticd10_name5()));
            //丁肝
            hisPast.setHepatitisD(hisPast.getHepatitisD()!=null&&hisPast.getHepatitisD().equals("是")?"是":parsePast1(Arrays.asList("丁型病毒性肝炎"),prior.getneg_std(),prior.geticd10_name1(),prior.geticd10_name2(),
                    prior.geticd10_name3(),prior.geticd10_name4(),prior.geticd10_name5()));
            //戊肝
            hisPast.setHepatitisE(hisPast.getHepatitisE()!=null&&hisPast.getHepatitisE().equals("是")?"是":parsePast1(Arrays.asList("戊型病毒性肝炎"),prior.getneg_std(),prior.geticd10_name1(),prior.geticd10_name2(),
                    prior.geticd10_name3(),prior.geticd10_name4(),prior.geticd10_name5()));
            //新型病毒性肝炎
            hisPast.setNewHepatitis(hisPast.getNewHepatitis()!=null&&hisPast.getNewHepatitis().equals("是")?"是":parsePast1(Arrays.asList("新型病毒性肝炎"),prior.getneg_std(),prior.geticd10_name1(),prior.geticd10_name2(),
                    prior.geticd10_name3(),prior.geticd10_name4(),prior.geticd10_name5()));
            //药物性肝炎
            hisPast.setDurgHepatitis(hisPast.getDurgHepatitis()!=null&&hisPast.getDurgHepatitis().equals("是")?"是":parsePast1(Arrays.asList("药物性肝炎"),prior.getneg_std(),prior.geticd10_name1(),prior.geticd10_name2(),
                    prior.geticd10_name3(),prior.geticd10_name4(),prior.geticd10_name5()));
            //酒精性肝炎
            hisPast.setAlcoholicHepatitis(hisPast.getAlcoholicHepatitis()!=null&&hisPast.getAlcoholicHepatitis().equals("是")?"是":parsePast1(Arrays.asList("酒精性肝炎"),prior.getneg_std(),prior.geticd10_name1(),prior.geticd10_name2(),
                    prior.geticd10_name3(),prior.geticd10_name4(),prior.geticd10_name5()));
            //脂肪性肝炎
            hisPast.setSteatohepatitis(hisPast.getSteatohepatitis()!=null&&hisPast.getSteatohepatitis().equals("是")?"是":parsePast1(Arrays.asList("脂肪性肝炎"),prior.getneg_std(),prior.geticd10_name1(),prior.geticd10_name2(),
                    prior.geticd10_name3(),prior.geticd10_name4(),prior.geticd10_name5()));
            //自身免疫肝炎
            hisPast.setAutoimmuneHepatitis(hisPast.getAutoimmuneHepatitis()!=null&&hisPast.getAutoimmuneHepatitis().equals("是")?"是":parsePast1(Arrays.asList("自身免疫肝炎"),prior.getneg_std(),prior.geticd10_name1(),prior.geticd10_name2(),
                    prior.geticd10_name3(),prior.geticd10_name4(),prior.geticd10_name5()));
            //肝硬化
            hisPast.setCirrhosis(hisPast.getCirrhosis()!=null&&hisPast.getCirrhosis().equals("是")?"是":parsePast1(Arrays.asList("肝硬化"),prior.getneg_std(),prior.geticd10_name1(),prior.geticd10_name2(),
                    prior.geticd10_name3(),prior.geticd10_name4(),prior.geticd10_name5()));
            //结核
            hisPast.setTuberculosis(hisPast.getTuberculosis()!=null&&hisPast.getTuberculosis().equals("是")?"是":parsePast1(Arrays.asList("结核"),prior.getneg_std(),prior.geticd10_name1(),prior.geticd10_name2(),
                    prior.geticd10_name3(),prior.geticd10_name4(),prior.geticd10_name5()));
            //HIV感染病史
            hisPast.setHiv(hisPast.getHiv()!=null&&hisPast.getHiv().equals("是")?"是":parsePast1(Arrays.asList("HIV感染病史"),prior.getneg_std(),prior.geticd10_name1(),prior.geticd10_name2(),
                    prior.geticd10_name3(),prior.geticd10_name4(),prior.geticd10_name5()));

        }
        hisPast.setUpdatedAt(new Date());
        hisPastService.saveHisPast(hisPast);

    }
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



    public void saveAbdominalUsResult(List<ABDOM_US_ENTRY_RESULTS> zj_abdom_us_entry_results,List<EXAM_MASTER>  zj_EXAM_MASTER,List<ABDOM_US_DESCRIPTION>  zj_abdom_us_description){


        for(EXAM_MASTER examMaster:zj_EXAM_MASTER){
            log.info("插入检查"+examMaster.getUNIQUE_ID_LV2());
            AbdominalUsResult abdominalUsResult = new AbdominalUsResult();
            //unique_id
            abdominalUsResult.setUniqueId(examMaster.getUNIQUE_ID());
            //标识患者身份唯一标识
            abdominalUsResult.setUniqueIdLv1(examMaster.getUNIQUE_ID_LV1());
            //唯一标识
            abdominalUsResult.setUniqueIdLv2(examMaster.getUNIQUE_ID_LV2());
            //医疗机构代码
            abdominalUsResult.setP900(examMaster.getP900());
            //患者id
            abdominalUsResult.setPatientId(examMaster.getPATIENT_ID());
            //就诊标识住院号
            abdominalUsResult.setVisitId(examMaster.getVISIT_ID());
            //检查号
            abdominalUsResult.setExamNo(examMaster.getEXAM_NO());
            //检查项目
            abdominalUsResult.setExamName(examMaster.getENTRY_NAME());

            String tumor="";
            String recrudescence="";
            String transferSite="";
            String ascites="";

            String lesion1="";
            String structure_sub_site1="";
            String structure_site1="";
            String nature="";

            for(ABDOM_US_ENTRY_RESULTS results:zj_abdom_us_entry_results){
                if(results.getunique_id()!=null&&results.getunique_id().equals(examMaster.getUNIQUE_ID())){
                    if(tumor!=""&&(results.getlesion1_std()!=null||results.getlesion2_std()!=null)) {
                        if (results.getneg_std() == null &&
                                ((results.getstructure_site1_std()!=null&&results.getstructure_site1_std().contains("肝"))
                                        || (results.getstructure_site2_std()!=null&&results.getstructure_site2_std().contains("肝"))
                                        || (results.getstructure_site3_std()!=null&&results.getstructure_site3_std().contains("肝")))
                                && ((results.getnature1_std()!=null&&results.getnature1_std().contains("恶性"))
                                || (results.getnature1_std()!=null&&results.getnature2_std().contains("恶性")))) {
                            //肝病灶是否恶性
                            tumor+="是";

                            lesion1=results.getlesion1_std();
                            structure_sub_site1=results.getstructure_sub_site1_std();
                            structure_site1=results.getstructure_site1_std();
                            nature+=results.getnature1_std();

                        } else if  (results.getneg_std() == null &&
                                ((results.getstructure_site1_std()!=null&&results.getstructure_site1_std().contains("肝"))
                                        || (results.getstructure_site2_std()!=null&&results.getstructure_site2_std().contains("肝"))
                                        || (results.getstructure_site3_std()!=null&&results.getstructure_site3_std().contains("肝")))
                                && ((results.getnature1_std()!=null&&results.getnature1_std().contains("良性"))
                                || (results.getnature1_std()!=null&&results.getnature2_std().contains("良性"))))  {
                            //肝病灶是否恶性
                            tumor+="否";

                        } else {
                            //肝病灶是否恶性
                            tumor+="无法判断";
                        }
                    }


                    if(recrudescence!=""&&(results.getlesion1_std()!=null||results.getlesion2_std()!=null)){
                        if (results.getneg_std() == null &&((results.getnature1_std()!=null&&results.getnature1_std().contains("复发"))||(results.getnature2_std()!=null&&results.getnature2_std().contains("复发")))){
                            recrudescence+="是";
                        }else if(results.getneg_std() == null &&((results.getnature1_std()!=null&&results.getnature1_std().contains("无法判断"))||(results.getnature2_std()!=null&&results.getnature2_std().contains("无法判断")))||(results.getmodifier_std()!=null&&results.getmodifier_std().contains("可能"))){
                            recrudescence+="无法判断";
                        }else{
                            recrudescence+="否";
                        }

                    }

                    if(transferSite!=""&&(results.getlesion1_std()!=null||results.getlesion2_std()!=null)){
                        if (results.getneg_std() == null
                                &&((results.getlesion1_std()!=null&&results.getlesion1_std().contains("淋巴结"))||(results.getlesion2_std()!=null&&results.getlesion2_std().contains("淋巴结")))
                                &&((results.getnature1_std()!=null&&results.getnature1_std().contains("转移"))||(results.getnature2_std()!=null&&results.getnature2_std().contains("转移")))){
                            transferSite+="淋巴结";
                            lesion1=results.getlesion1_std();
                            structure_sub_site1=results.getstructure_sub_site1_std();
                            structure_site1=results.getstructure_site1_std();
                            nature+=results.getnature1_std();
                        }else if(results.getneg_std() == null
                                &&(((results.getnature1_std()!=null&&results.getnature1_std().contains("转移"))||(results.getnature2_std()!=null&&results.getnature2_std().contains("转移"))))){
                            transferSite+=results.getstructure_site1_std()+"  "+results.getstructure_site2_std()+"  "+results.getstructure_site3_std();
                            lesion1=results.getlesion1_std();
                            structure_sub_site1=results.getstructure_sub_site1_std();
                            structure_site1=results.getstructure_site1_std();
                            nature+=results.getnature1_std();
                        }
                    }

                    if(ascites!=""&&(results.getlesion1_std()!=null||results.getlesion2_std()!=null)){
                        if (results.getneg_std() == null
                                &&((results.getlesion1_std()!=null&&results.getlesion1_std().contains("积液"))||(results.getlesion2_std()!=null&&results.getlesion2_std().contains("积液")))
                                &&((results.getstructure_site1_std()!=null&&results.getstructure_site1_std().contains("腹部"))||(results.getstructure_site2_std()!=null&&results.getstructure_site2_std().contains("腹部"))||(results.getstructure_site3_std()!=null&&results.getstructure_site3_std().contains("腹部")))) {
                            ascites+="是";
                        }else{
                            ascites+="否";
                        }
                    }






                }




            }

            if(tumor.contains("是")){
                abdominalUsResult.setTumor("是");
            }else if(tumor.contains("否")){
                abdominalUsResult.setTumor("否");
            }else{
                abdominalUsResult.setTumor("无法判断");
            }

            if(recrudescence.contains("是")){
                //复发
                abdominalUsResult.setRecrudescence("是");
            }else if(recrudescence.contains("否")){
                //复发
                abdominalUsResult.setRecrudescence("否");
            }else{
                //复发
                abdominalUsResult.setRecrudescence("无法判断");
            }


            if(transferSite.contains("淋巴结")){
                //转移部位
                abdominalUsResult.setTransferSite("淋巴结");
            }else{
                //转移部位
                abdominalUsResult.setTransferSite(transferSite);
            }



            if(abdominalUsResult.getTransferSite()!=null&&!"".equals(abdominalUsResult.getTransferSite())){
                //转移
                abdominalUsResult.setTransfer("是");
            }

            if(ascites.contains("是")){
                //腹水
                abdominalUsResult.setAscites("是");
            }else{
                //腹水
                abdominalUsResult.setAscites("否");
            }

            abdominalUsResultService.saveAbdominalUsResult(abdominalUsResult);

            saveAbdominalUsDes(zj_abdom_us_description,nature,abdominalUsResult.getUniqueId(),abdominalUsResult.getExamNo(),abdominalUsResult.getExamName(),lesion1,structure_sub_site1,structure_site1);

        }













    }
    public void saveAbdominalUsDes(List<ABDOM_US_DESCRIPTION> zj_abdom_us_description,String nature ,String uniqueId,String no ,String name,String lesion1,String structure_sub_site1,String structure_site1){
        for(ABDOM_US_DESCRIPTION abdom_us_description: zj_abdom_us_description){
            if(uniqueId.equals(abdom_us_description.getunique_id())){
                AbdominalUsDes abdominalUsDes = new AbdominalUsDes();
                //unique_id
                abdominalUsDes.setUniqueId(abdom_us_description.getunique_id());
                //标识患者身份唯一标识
                abdominalUsDes.setUniqueIdLv1(abdom_us_description.getunique_id_lv1());
                //唯一标识
                abdominalUsDes.setUniqueIdLv2(abdom_us_description.getunique_id_lv2());
                //医疗机构代码
                abdominalUsDes.setP900(abdom_us_description.getp900());
                //患者id
                abdominalUsDes.setPatientId(abdom_us_description.getpatient_id());
                //就诊标识住院号
                abdominalUsDes.setVisitId(abdom_us_description.getvisit_id());
                //检查号
                abdominalUsDes.setExamNo(no);
                //检查项目
                abdominalUsDes.setExamName(name);
                //部位
                abdominalUsDes.setStructure(abdom_us_description.getstructure());
                //定位
               // abdominalUsDes.setLocation(abdom_us_description.getlocation());
                //病灶
                abdominalUsDes.setLesion(abdom_us_description.getlesion());
                //大小
                abdominalUsDes.setSize(abdom_us_description.getsize());
                //数目
                abdominalUsDes.setQuanity(abdom_us_description.getquantity());

                StringBuilder sbstr=new StringBuilder();


                //部位标化
                abdominalUsDes.setStructureStd(abdom_us_description.getstructure1_std()
                        +" "+abdom_us_description.getstructure2_std()
                        +" "+abdom_us_description.getstructure3_std()
                        +" "+abdom_us_description.getstructure4_std());
                abdominalUsDes.setStructureStd(abdominalUsDes.getStructureStd().replace("null","").trim());
                //定位标化
                abdominalUsDes.setStructureSiteStd(abdom_us_description.getstructure_site1_std()
                        +" "+abdom_us_description.getstructure_site2_std()
                        +" "+abdom_us_description.getstructure_site3_std()
                        +" "+abdom_us_description.getstructure_site4_std());
                abdominalUsDes.setStructureSiteStd(abdominalUsDes.getStructureSiteStd().replace("null","").trim());
                //病灶标化
                abdominalUsDes.setLesionStd(abdom_us_description.getlesion_std());
                //病灶类型标化
               // abdominalUsDes.setLesionTypeStd();
                //大小标化
                StringBuilder sb=new StringBuilder("");
                if(abdom_us_description.getsize_max_diam1_std()!=null&&!"".equals(abdom_us_description.getsize_max_diam1_std())){
                    sb.append(abdom_us_description.getsize_max_diam1_std());
                }

                if(abdom_us_description.getsize_median_diam1_std()!=null&&!"".equals(abdom_us_description.getsize_median_diam1_std())){
                    if(sb.length()>0){
                        sb.append("*");
                    }
                    sb.append(abdom_us_description.getsize_median_diam1_std());
                }
                if(abdom_us_description.getsize_min_diam1_std()!=null&&!"".equals(abdom_us_description.getsize_min_diam1_std())){
                    if(sb.length()>0){
                        sb.append("*");
                    }
                    sb.append(abdom_us_description.getsize_min_diam1_std());
                }
              String sizestd=sb.toString();
                sizestd.replace("null","").trim();
                if("null".equals(sizestd)){
                    sizestd="";
                }
                if(abdom_us_description.getsize_unit1_std()!=null){
                    abdom_us_description.setsize_unit1_std(abdom_us_description.getsize_unit1_std().replace("null","").trim());
                }
                abdominalUsDes.setSizeStd(sizestd);
                //数目标化
                if(abdom_us_description.getquantity_std()!=null&&abdom_us_description.getquantity_std().equals("1")){
                    abdominalUsDes.setQuantityStd("单发");
                }else{
                    abdominalUsDes.setQuantityStd(abdom_us_description.getquantity_std());
                }

                if((lesion1.equals(abdom_us_description.getlesion_std())
                        &&(structure_site1.equals(abdom_us_description.getstructure_site1_std())
                        ||structure_site1.equals(abdom_us_description.getstructure_site2_std())
                        ||structure_site1.equals(abdom_us_description.getstructure_site3_std())
                        ||structure_site1.equals(abdom_us_description.getstructure_site4_std()))
                        &&(structure_sub_site1.equals(abdom_us_description.getstructure1_std())
                        ||structure_sub_site1.equals(abdom_us_description.getstructure2_std())
                        ||structure_sub_site1.equals(abdom_us_description.getstructure3_std())
                        ||structure_sub_site1.equals(abdom_us_description.getstructure4_std())))){
                    if(lesion1.contains("肝")&&nature.contains("恶性")){
                        //肝恶性病灶数目
                        abdominalUsDes.setTumorCount(abdominalUsDes.getQuantityStd());
                        //肝恶性病灶大小
                        abdominalUsDes.setTumorSize(abdom_us_description.getsize_max_diam1_std()+"*"+abdom_us_description.getsize_median_diam1_std()+"*"+abdom_us_description.getsize_min_diam1_std()+abdom_us_description.getsize_unit1_std());
                    }

                    if(nature.contains("转移")){
                        //转移灶数目
                        abdominalUsDes.setTransferCount(abdominalUsDes.getQuantityStd());
                        //转移灶大小
                        abdominalUsDes.setTransferSize(abdom_us_description.getsize_max_diam1_std()+"*"+abdom_us_description.getsize_median_diam1_std()+"*"+abdom_us_description.getsize_min_diam1_std()+abdom_us_description.getsize_unit1_std());
                    }
                }

                abdominalUsDesService.saveAbdominalUsDes(abdominalUsDes);
            }

        }

    }





}