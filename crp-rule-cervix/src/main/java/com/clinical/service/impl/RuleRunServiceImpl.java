package com.clinical.service.impl;

import com.clinical.model.cluster.*;
import com.clinical.model.master.*;
import com.clinical.dao.master.*;
import com.clinical.dao.cluster.*;
import com.clinical.service.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RuleRunServiceImpl implements RuleRunService {

    private final Logger log = LoggerFactory.getLogger(RuleRunServiceImpl.class);
    @Autowired
    PersonService personService;


    @Autowired
    VisitRecordService visitRecordService;


    @Autowired
    IndexPersonService indexPersonService;


    @Autowired
    IndexDiagnosisAdmitService indexDiagnosisAdmitService;


    @Autowired
    IndexDiagnosisClinicService indexDiagnosisClinicService;


    @Autowired
    IndexOperationService indexOperationService;


    @Autowired
    IndexDiagnosisMainService indexDiagnosisMainService;


    @Autowired
    IndexDiagnosisOtherService indexDiagnosisOtherService;


    @Autowired
    IndexIcuService indexIcuService;


    @Autowired
    IndexPathologyService indexPathologyService;


    @Autowired
    IndexInjuryService indexInjuryService;


    @Autowired
    PersonGeneralService personGeneralService;


    @Autowired
    HisVitalSignService hisVitalSignService;


    @Autowired
    HisPersonService hisPersonService;


    @Autowired
    HisFamilyService hisFamilyService;


    @Autowired
    HisPastService hisPastService;


    @Autowired
    HisMarriageService hisMarriageService;


    @Autowired
    SymptomService symptomService;


    @Autowired
    DiagnosisService diagnosisService;


    @Autowired
    DiagnosisStageService diagnosisStageService;


    @Autowired
    HeartFailureService heartFailureService;


    @Autowired
    HypertensionService hypertensionService;


    @Autowired
    InspectionService inspectionService;


    @Autowired
    CervicalSmearCytologyService cervicalSmearCytologyService;


    @Autowired
    LayerCellDetectionService layerCellDetectionService;


    @Autowired
    ExaminationService examinationService;


    @Autowired
    OperationRecordService operationRecordService;


    @Autowired
    PathologicalService pathologicalService;


    @Autowired
    TreatmentService treatmentService;


    @Autowired
    ChemotherapyService chemotherapyService;


    @Autowired
    ChemotherapyDrugService chemotherapyDrugService;


    @Autowired
    RadiotherapyService radiotherapyService;


    @Autowired
    RadiotherapySiteService radiotherapySiteService;


    @Autowired
    CancerPainTreatmentService cancerPainTreatmentService;


    @Autowired
    FollowUpService followUpService;


    @Autowired
    ZjBasyNstdMapper zjBasyNstdMapper;

    @Autowired
    ZjBasyStdMapper zjBasyStdMapper;

    @Autowired
    ZjTemPatMasterIndexMapper zjTemPatMasterIndexMapper;

    @Autowired
    ZjPatVisitMasterMapper zjPatVisitMasterMapper;

    @Autowired
    ZjInpDiagnosisMapper zjInpDiagnosisMapper;

    @Autowired
    ZjLisRecordMapper zjLisRecordMapper;

    @Autowired
    ZjLabMicroResultMapper zjLabMicroResultMapper;

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
    ZjNursingRecordMapper zjNursingRecordMapper;

    @Autowired
    ZjVitalRecordMapper zjVitalRecordMapper;

    @Autowired
    ZjFollowUpMapper zjFollowUpMapper;

    @Autowired
    ZjDrugOrderMapper zjDrugOrderMapper;

    @Autowired
    ZjTemChemotherapyMapper zjTemChemotherapyMapper;

    @Autowired
    ZjTemRadiotherapyMapper zjTemRadiotherapyMapper;

    @Autowired
    ZjTemInpAdmissionStatusMapper zjTemInpAdmissionStatusMapper;

    @Autowired
    ZjTemOutpDischargeStatusMapper zjTemOutpDischargeStatusMapper;

    @Autowired
    ZjTem24hInOutMapper zjTem24hInOutMapper;

    @Autowired
    ZjOutpRecordMapper zjOutpRecordMapper;

    @Autowired
    ZjTemOutpDischargeSummerMapper zjTemOutpDischargeSummerMapper;

    @Autowired
    ZjTemCourseDisMapper zjTemCourseDisMapper;

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
    ZjAbdomCtDescriptionMapper zjAbdomCtDescriptionMapper;

    @Autowired
    ZjAbdomCtEntryResultsMapper zjAbdomCtEntryResultsMapper;

    @Autowired
    ZjAbdomUsDescriptionMapper zjAbdomUsDescriptionMapper;

    @Autowired
    ZjAbdomUsEntryResultsMapper zjAbdomUsEntryResultsMapper;

    @Autowired
    ZjClinicalDiagMapper zjClinicalDiagMapper;

    @Autowired
    ZjConcomitantDiseaseMapper zjConcomitantDiseaseMapper;

    @Autowired
    ZjFamilyHistoryMapper zjFamilyHistoryMapper;

    @Autowired
    ZjIhcMarkerMapper zjIhcMarkerMapper;

    @Autowired
    ZjPathologyMapper zjPathologyMapper;

    @Autowired
    ZjSmokeAndDrinkMapper zjSmokeAndDrinkMapper;

    @Autowired
    ZjSurgeryNameMapper zjSurgeryNameMapper;

    @Autowired
    ZjSympComplaintMapper zjSympComplaintMapper;

    @Autowired
    ZjMarrChildHistoryMapper zjMarrChildHistoryMapper;

    @Autowired
    ZjMenstrualHistoryMapper zjMenstrualHistoryMapper;

    @Autowired
    ZjGynUsDescriptionMapper zjGynUsDescriptionMapper;

    @Autowired
    ZjGynUsEntryResultsMapper zjGynUsEntryResultsMapper;

    @Autowired
    ZjPelvisMrDescriptionMapper zjPelvisMrDescriptionMapper;

    @Autowired
    ZjPelvisMrEntryResultsMapper zjPelvisMrEntryResultsMapper;

    @Autowired
    ZjAbdomMrDescriptionMapper zjAbdomMrDescriptionMapper;

    @Autowired
    ZjAbdomMrEntryResultsMapper zjAbdomMrEntryResultsMapper;



    @Override
    public void saveRuleRun(Integer pageNo, Integer pageSize, String flag) {

        Map<String, Integer> map = new HashMap<>();
        map.put("pageNo", pageNo);
        map.put("pageSize", pageSize);
        //查找患者列表
        List<TEM_PAT_MASTER_INDEX> zj_TEM_PAT_MASTER_INDEX = zjTemPatMasterIndexMapper.findZjTemPatMasterIndexByUniqueId(map);


        for (TEM_PAT_MASTER_INDEX index : zj_TEM_PAT_MASTER_INDEX) {
            //保存患者--------------------------------------------------
            savePerson(index);

            //患者就诊列表
            List<PAT_VISIT_MASTER> zj_PAT_VISIT_MASTER = zjPatVisitMasterMapper.findZjPatVisitMasterByUniqueId(index.getUNIQUE_ID());
            //就诊其他数据
            for (PAT_VISIT_MASTER master : zj_PAT_VISIT_MASTER) {

                //保存就诊----------------------------------------------------
                saveVisitRecord(master);

                String uniqueId = master.getUNIQUE_ID();
                //病案首页
                BASY_NSTD zj_BASY_NSTD = zjBasyNstdMapper.findZjBasyNstdByUniqueId(uniqueId);
                BASY_STD zj_BASY_STD = zjBasyStdMapper.findZjBasyStdByUniqueId(uniqueId);
                //体温单
                List<VITAL_RECORD> zj_VITAL_RECORD = zjVitalRecordMapper.findZjVitalRecordByUniqueId(uniqueId);
                //诊断
                List<INP_DIAGNOSIS> zj_INP_DIAGNOSIS = zjInpDiagnosisMapper.findZjInpDiagnosisByUniqueId(uniqueId);
                //入院记录
                List<TEM_INP_ADMISSION_STATUS> zj_TEM_INP_ADMISSION_STATUS = zjTemInpAdmissionStatusMapper.findZjTemInpAdmissionStatusByUniqueId(uniqueId);

                List<LIS_RECORD> zj_LIS_RECORD = zjLisRecordMapper.findZjLisRecordByUniqueId(uniqueId);
                List<TEM_CHEMOTHERAPY> zj_TEM_CHEMOTHERAPY = zjTemChemotherapyMapper.findZjTemChemotherapyByUniqueId(uniqueId);
                List<TEM_RADIOTHERAPY> zj_TEM_RADIOTHERAPY = zjTemRadiotherapyMapper.findZjTemRadiotherapyByUniqueId(uniqueId);


        /*
                List<LAB_MICRO_RESULT> zj_LAB_MICRO_RESULT = zjLabMicroResultMapper.findZjLabMicroResultByUniqueId(uniqueId);
                List<EXAM_MASTER> zj_EXAM_MASTER = zjExamMasterMapper.findZjExamMasterByUniqueId(uniqueId);
                List<HISTOLOGY_REPORT> zj_HISTOLOGY_REPORT = zjHistologyReportMapper.findZjHistologyReportByUniqueId(uniqueId);
                List<TEM_OPERATION_RECORD> zj_TEM_OPERATION_RECORD = zjTemOperationRecordMapper.findZjTemOperationRecordByUniqueId(uniqueId);
                List<PROCEDURE_RECORD> zj_PROCEDURE_RECORD = zjProcedureRecordMapper.findZjProcedureRecordByUniqueId(uniqueId);
                List<TEM_DEATH_RECORD> zj_TEM_DEATH_RECORD = zjTemDeathRecordMapper.findZjTemDeathRecordByUniqueId(uniqueId);
                List<NURSING_RECORD> zj_NURSING_RECORD = zjNursingRecordMapper.findZjNursingRecordByUniqueId(uniqueId);

                List<FOLLOW_UP> zj_FOLLOW_UP = zjFollowUpMapper.findZjFollowUpByUniqueId(uniqueId);
                List<DRUG_ORDER> zj_DRUG_ORDER = zjDrugOrderMapper.findZjDrugOrderByUniqueId(uniqueId);

                List<TEM_OUTP_DISCHARGE_STATUS> zj_TEM_OUTP_DISCHARGE_STATUS = zjTemOutpDischargeStatusMapper.findZjTemOutpDischargeStatusByUniqueId(uniqueId);
                List<TEM_24H_IN_OUT> zj_TEM_24H_IN_OUT = zjTem24hInOutMapper.findZjTem24hInOutByUniqueId(uniqueId);
                List<OUTP_RECORD> zj_OUTP_RECORD = zjOutpRecordMapper.findZjOutpRecordByUniqueId(uniqueId);
                List<TEM_OUTP_DISCHARGE_SUMMER> zj_TEM_OUTP_DISCHARGE_SUMMER = zjTemOutpDischargeSummerMapper.findZjTemOutpDischargeSummerByUniqueId(uniqueId);
                List<TEM_COURSE_DIS> zj_TEM_COURSE_DIS = zjTemCourseDisMapper.findZjTemCourseDisByUniqueId(uniqueId);
                List<WARD_ROUND_RECORD> zj_WARD_ROUND_RECORD = zjWardRoundRecordMapper.findZjWardRoundRecordByUniqueId(uniqueId);
                List<INP_CONSULTATION_DOCTOR_MASTER> zj_INP_CONSULTATION_DOCTOR_MASTER = zjInpConsultationDoctorMasterMapper.findZjInpConsultationDoctorMasterByUniqueId(uniqueId);
                List<INP_CONSULTATION_DOCTOR_DETAIL> zj_INP_CONSULTATION_DOCTOR_DETAIL = zjInpConsultationDoctorDetailMapper.findZjInpConsultationDoctorDetailByUniqueId(uniqueId);
                List<TEM_PRE_COURSE_DIS> zj_TEM_PRE_COURSE_DIS = zjTemPreCourseDisMapper.findZjTemPreCourseDisByUniqueId(uniqueId);
                List<PRE_OP_DISCUSSION> zj_PRE_OP_DISCUSSION = zjPreOpDiscussionMapper.findZjPreOpDiscussionByUniqueId(uniqueId);
                List<POST_OP_COURSE> zj_POST_OP_COURSE = zjPostOpCourseMapper.findZjPostOpCourseByUniqueId(uniqueId);
                List<TRANSFER_DEPT> zj_TRANSFER_DEPT = zjTransferDeptMapper.findZjTransferDeptByUniqueId(uniqueId);
                List<EMERGENCY_RECORD> zj_EMERGENCY_RECORD = zjEmergencyRecordMapper.findZjEmergencyRecordByUniqueId(uniqueId);
                List<STAGE_SUMMARY> zj_STAGE_SUMMARY = zjStageSummaryMapper.findZjStageSummaryByUniqueId(uniqueId);
                List<ABDOM_CT_DESCRIPTION> zj_abdom_ct_description = zjAbdomCtDescriptionMapper.findZjAbdomCtDescriptionByUniqueId(uniqueId);
                List<ABDOM_CT_ENTRY_RESULTS> zj_abdom_ct_entry_results = zjAbdomCtEntryResultsMapper.findZjAbdomCtEntryResultsByUniqueId(uniqueId);
                List<ABDOM_US_DESCRIPTION> zj_abdom_us_description = zjAbdomUsDescriptionMapper.findZjAbdomUsDescriptionByUniqueId(uniqueId);
                List<ABDOM_US_ENTRY_RESULTS> zj_abdom_us_entry_results = zjAbdomUsEntryResultsMapper.findZjAbdomUsEntryResultsByUniqueId(uniqueId);
                List<CLINICAL_DIAG> zj_clinical_diag = zjClinicalDiagMapper.findZjClinicalDiagByUniqueId(uniqueId);
                List<CONCOMITANT_DISEASE> zj_concomitant_disease = zjConcomitantDiseaseMapper.findZjConcomitantDiseaseByUniqueId(uniqueId);
                List<FAMILY_HISTORY> zj_family_history = zjFamilyHistoryMapper.findZjFamilyHistoryByUniqueId(uniqueId);
                List<IHC_MARKER> zj_ihc_marker = zjIhcMarkerMapper.findZjIhcMarkerByUniqueId(uniqueId);
                List<PATHOLOGY> zj_pathology = zjPathologyMapper.findZjPathologyByUniqueId(uniqueId);
                List<SMOKE_AND_DRINK> zj_smoke_and_drink = zjSmokeAndDrinkMapper.findZjSmokeAndDrinkByUniqueId(uniqueId);
                List<SURGERY_NAME> zj_surgery_name = zjSurgeryNameMapper.findZjSurgeryNameByUniqueId(uniqueId);
                List<SYMP_COMPLAINT> zj_symp_complaint = zjSympComplaintMapper.findZjSympComplaintByUniqueId(uniqueId);
                List<MARR_CHILD_HISTORY> zj_marr_child_history = zjMarrChildHistoryMapper.findZjMarrChildHistoryByUniqueId(uniqueId);
                List<MENSTRUAL_HISTORY> zj_menstrual_history = zjMenstrualHistoryMapper.findZjMenstrualHistoryByUniqueId(uniqueId);
                List<GYN_US_DESCRIPTION> zj_gyn_us_description = zjGynUsDescriptionMapper.findZjGynUsDescriptionByUniqueId(uniqueId);
                List<GYN_US_ENTRY_RESULTS> zj_gyn_us_entry_results = zjGynUsEntryResultsMapper.findZjGynUsEntryResultsByUniqueId(uniqueId);
                List<PELVIS_MR_DESCRIPTION> zj_pelvis_mr_description = zjPelvisMrDescriptionMapper.findZjPelvisMrDescriptionByUniqueId(uniqueId);
                List<PELVIS_MR_ENTRY_RESULTS> zj_pelvis_mr_entry_results = zjPelvisMrEntryResultsMapper.findZjPelvisMrEntryResultsByUniqueId(uniqueId);
                List<ABDOM_MR_DESCRIPTION> zj_abdom_mr_description = zjAbdomMrDescriptionMapper.findZjAbdomMrDescriptionByUniqueId(uniqueId);
                List<ABDOM_MR_ENTRY_RESULTS> zj_abdom_mr_entry_results = zjAbdomMrEntryResultsMapper.findZjAbdomMrEntryResultsByUniqueId(uniqueId);

*/
                if (zj_BASY_NSTD != null) {
                    saveIndexPerson(zj_BASY_NSTD, zj_BASY_STD);
                    saveIndexIcu(zj_BASY_NSTD);
                }
                if (zj_BASY_STD != null) {
                    saveIndexOperation(zj_BASY_STD);
                    saveIndexDiagnosisAdmit(zj_BASY_STD);
                    saveIndexDiagnosisClinic(zj_BASY_STD);
                    saveIndexDiagnosisMain(zj_BASY_STD);
                    saveIndexDiagnosisOther(zj_BASY_STD);
                    saveIndexInjury(zj_BASY_STD);
                    saveIndexPathology(zj_BASY_STD);
                }
                if (zj_VITAL_RECORD != null && zj_INP_DIAGNOSIS.size() > 0) {
                    savePersonGeneral(zj_VITAL_RECORD);
                }


                if (zj_LIS_RECORD != null && zj_LIS_RECORD.size() > 0) {
                    saveInspection( zj_LIS_RECORD);
                }

                if (zj_TEM_CHEMOTHERAPY != null && zj_TEM_CHEMOTHERAPY.size() > 0) {
                    saveChemotherapy( zj_TEM_CHEMOTHERAPY);
                }

                if (zj_TEM_RADIOTHERAPY != null && zj_TEM_RADIOTHERAPY.size() > 0) {
                    saveRadiotherapy( zj_TEM_RADIOTHERAPY);
                }


            }
        }

    }



    public void savePerson(TEM_PAT_MASTER_INDEX index) {
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
        log.info("保存患者：" + person.getPersonId());
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
        log.info("保存就诊：" + visitRecord.getUniqueId());
    }

    public void saveIndexOperation(BASY_STD zj_BASY_STD) {
        log.info("保存病案首页手术：" + zj_BASY_STD.getUNIQUE_ID());
        if (zj_BASY_STD.getP492_ICD9_NAME1() != null) {
            for (int i = 0; i < 4; i++) {
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
                indexOperation.setP494(zj_BASY_STD.getP494());
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
                if (i == 0 && zj_BASY_STD.getP492_ICD9_NAME1() != null) {
                    //手术/操作编码
                    indexOperation.setP490(zj_BASY_STD.getP492_ICD9_ID1());
                    //手术/操作名称
                    indexOperation.setP492(zj_BASY_STD.getP492_ICD9_NAME1());
                    indexOperationService.saveIndexOperation(indexOperation);
                } else if (i == 1 && zj_BASY_STD.getP492_ICD9_NAME2() != null) {
                    //手术/操作编码
                    indexOperation.setP490(zj_BASY_STD.getP492_ICD9_ID2());
                    //手术/操作名称
                    indexOperation.setP492(zj_BASY_STD.getP492_ICD9_NAME2());
                    indexOperationService.saveIndexOperation(indexOperation);
                } else if (i == 2 && zj_BASY_STD.getP492_ICD9_NAME3() != null) {
                    //手术/操作编码
                    indexOperation.setP490(zj_BASY_STD.getP492_ICD9_ID3());
                    //手术/操作名称
                    indexOperation.setP492(zj_BASY_STD.getP492_ICD9_NAME3());
                    indexOperationService.saveIndexOperation(indexOperation);
                } else if (i == 3 && zj_BASY_STD.getP492_ICD9_NAME4() != null) {
                    //手术/操作编码
                    indexOperation.setP490(zj_BASY_STD.getP492_ICD9_ID4());
                    //手术/操作名称
                    indexOperation.setP492(zj_BASY_STD.getP492_ICD9_NAME4());
                    indexOperationService.saveIndexOperation(indexOperation);
                }

            }

        }
        if (zj_BASY_STD.getP4913_ICD9_NAME1() != null) {
            for (int i = 0; i < 4; i++) {
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
                indexOperation.setP494(zj_BASY_STD.getP4915());
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
                if (i == 0 && zj_BASY_STD.getP4913_ICD9_NAME1() != null) {
                    //手术/操作编码
                    indexOperation.setP490(zj_BASY_STD.getP4913_ICD9_ID1());
                    //手术/操作名称
                    indexOperation.setP492(zj_BASY_STD.getP4913_ICD9_NAME1());
                    indexOperationService.saveIndexOperation(indexOperation);
                } else if (i == 1 && zj_BASY_STD.getP4913_ICD9_NAME2() != null) {
                    //手术/操作编码
                    indexOperation.setP490(zj_BASY_STD.getP4913_ICD9_ID2());
                    //手术/操作名称
                    indexOperation.setP492(zj_BASY_STD.getP4913_ICD9_NAME2());
                    indexOperationService.saveIndexOperation(indexOperation);
                } else if (i == 2 && zj_BASY_STD.getP4913_ICD9_NAME3() != null) {
                    //手术/操作编码
                    indexOperation.setP490(zj_BASY_STD.getP4913_ICD9_ID3());
                    //手术/操作名称
                    indexOperation.setP492(zj_BASY_STD.getP4913_ICD9_NAME3());
                    indexOperationService.saveIndexOperation(indexOperation);
                } else if (i == 3 && zj_BASY_STD.getP4913_ICD9_NAME4() != null) {
                    //手术/操作编码
                    indexOperation.setP490(zj_BASY_STD.getP4913_ICD9_ID4());
                    //手术/操作名称
                    indexOperation.setP492(zj_BASY_STD.getP4913_ICD9_NAME4());
                    indexOperationService.saveIndexOperation(indexOperation);
                }

            }

        }
        if (zj_BASY_STD.getP4924_ICD9_NAME1() != null) {
            for (int i = 0; i < 4; i++) {
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
                indexOperation.setP494(zj_BASY_STD.getP4526());
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

                if (i == 0 && zj_BASY_STD.getP4924_ICD9_NAME1() != null) {
                    //手术/操作编码
                    indexOperation.setP490(zj_BASY_STD.getP4924_ICD9_ID1());
                    //手术/操作名称
                    indexOperation.setP492(zj_BASY_STD.getP4924_ICD9_NAME1());
                    indexOperationService.saveIndexOperation(indexOperation);
                } else if (i == 1 && zj_BASY_STD.getP4924_ICD9_NAME2() != null) {
                    //手术/操作编码
                    indexOperation.setP490(zj_BASY_STD.getP4924_ICD9_ID2());
                    //手术/操作名称
                    indexOperation.setP492(zj_BASY_STD.getP4924_ICD9_NAME2());
                    indexOperationService.saveIndexOperation(indexOperation);
                } else if (i == 2 && zj_BASY_STD.getP4924_ICD9_NAME3() != null) {
                    //手术/操作编码
                    indexOperation.setP490(zj_BASY_STD.getP4924_ICD9_ID3());
                    //手术/操作名称
                    indexOperation.setP492(zj_BASY_STD.getP4924_ICD9_NAME3());
                    indexOperationService.saveIndexOperation(indexOperation);
                } else if (i == 3 && zj_BASY_STD.getP4924_ICD9_NAME4() != null) {
                    //手术/操作编码
                    indexOperation.setP490(zj_BASY_STD.getP4924_ICD9_ID4());
                    //手术/操作名称
                    indexOperation.setP492(zj_BASY_STD.getP4924_ICD9_NAME4());
                    indexOperationService.saveIndexOperation(indexOperation);
                }

            }
        }
        if (zj_BASY_STD.getP4535_ICD9_NAME1() != null) {
            for (int i = 0; i < 4; i++) {
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
                indexOperation.setP494(zj_BASY_STD.getP4537());
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


                if (i == 0 && zj_BASY_STD.getP4535_ICD9_NAME1() != null) {
                    //手术/操作编码
                    indexOperation.setP490(zj_BASY_STD.getP4535_ICD9_ID1());
                    //手术/操作名称
                    indexOperation.setP492(zj_BASY_STD.getP4535_ICD9_NAME1());
                    indexOperationService.saveIndexOperation(indexOperation);
                } else if (i == 1 && zj_BASY_STD.getP4535_ICD9_NAME2() != null) {
                    //手术/操作编码
                    indexOperation.setP490(zj_BASY_STD.getP4535_ICD9_ID2());
                    //手术/操作名称
                    indexOperation.setP492(zj_BASY_STD.getP4535_ICD9_NAME2());
                    indexOperationService.saveIndexOperation(indexOperation);
                } else if (i == 2 && zj_BASY_STD.getP4535_ICD9_NAME3() != null) {
                    //手术/操作编码
                    indexOperation.setP490(zj_BASY_STD.getP4535_ICD9_ID3());
                    //手术/操作名称
                    indexOperation.setP492(zj_BASY_STD.getP4535_ICD9_NAME3());
                    indexOperationService.saveIndexOperation(indexOperation);
                } else if (i == 3 && zj_BASY_STD.getP4535_ICD9_NAME4() != null) {
                    //手术/操作编码
                    indexOperation.setP490(zj_BASY_STD.getP4535_ICD9_ID4());
                    //手术/操作名称
                    indexOperation.setP492(zj_BASY_STD.getP4535_ICD9_NAME4());
                    indexOperationService.saveIndexOperation(indexOperation);
                }
            }
        }
        if (zj_BASY_STD.getP4546_ICD9_NAME1() != null) {
            for (int i = 0; i < 4; i++) {
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
                indexOperation.setP494(zj_BASY_STD.getP4548());
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
                if (i == 0 && zj_BASY_STD.getP4546_ICD9_NAME1() != null) {
                    //手术/操作编码
                    indexOperation.setP490(zj_BASY_STD.getP4546_ICD9_ID1());
                    //手术/操作名称
                    indexOperation.setP492(zj_BASY_STD.getP4546_ICD9_NAME1());
                    indexOperationService.saveIndexOperation(indexOperation);
                } else if (i == 1 && zj_BASY_STD.getP4546_ICD9_NAME2() != null) {
                    //手术/操作编码
                    indexOperation.setP490(zj_BASY_STD.getP4546_ICD9_ID2());
                    //手术/操作名称
                    indexOperation.setP492(zj_BASY_STD.getP4546_ICD9_NAME2());
                    indexOperationService.saveIndexOperation(indexOperation);
                } else if (i == 2 && zj_BASY_STD.getP4546_ICD9_NAME3() != null) {
                    //手术/操作编码
                    indexOperation.setP490(zj_BASY_STD.getP4546_ICD9_ID3());
                    //手术/操作名称
                    indexOperation.setP492(zj_BASY_STD.getP4546_ICD9_NAME3());
                    indexOperationService.saveIndexOperation(indexOperation);
                } else if (i == 3 && zj_BASY_STD.getP4546_ICD9_NAME4() != null) {
                    //手术/操作编码
                    indexOperation.setP490(zj_BASY_STD.getP4546_ICD9_ID4());
                    //手术/操作名称
                    indexOperation.setP492(zj_BASY_STD.getP4546_ICD9_NAME4());
                    indexOperationService.saveIndexOperation(indexOperation);
                }
            }
        }
        if (zj_BASY_STD.getP45004_ICD9_NAME1() != null) {
            for (int i = 0; i < 4; i++) {
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
                indexOperation.setP494(zj_BASY_STD.getP45006());
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
                if (i == 0 && zj_BASY_STD.getP45004_ICD9_NAME1() != null) {
                    //手术/操作编码
                    indexOperation.setP490(zj_BASY_STD.getP45004_ICD9_ID1());
                    //手术/操作名称
                    indexOperation.setP492(zj_BASY_STD.getP45004_ICD9_NAME1());
                    indexOperationService.saveIndexOperation(indexOperation);
                } else if (i == 1 && zj_BASY_STD.getP45004_ICD9_NAME2() != null) {
                    //手术/操作编码
                    indexOperation.setP490(zj_BASY_STD.getP45004_ICD9_ID2());
                    //手术/操作名称
                    indexOperation.setP492(zj_BASY_STD.getP45004_ICD9_NAME2());
                    indexOperationService.saveIndexOperation(indexOperation);
                } else if (i == 2 && zj_BASY_STD.getP45004_ICD9_NAME3() != null) {
                    //手术/操作编码
                    indexOperation.setP490(zj_BASY_STD.getP45004_ICD9_ID3());
                    //手术/操作名称
                    indexOperation.setP492(zj_BASY_STD.getP45004_ICD9_NAME3());
                    indexOperationService.saveIndexOperation(indexOperation);
                } else if (i == 3 && zj_BASY_STD.getP45004_ICD9_NAME4() != null) {
                    //手术/操作编码
                    indexOperation.setP490(zj_BASY_STD.getP45004_ICD9_ID4());
                    //手术/操作名称
                    indexOperation.setP492(zj_BASY_STD.getP45004_ICD9_NAME4());
                    indexOperationService.saveIndexOperation(indexOperation);
                }
            }

        }
        if (zj_BASY_STD.getP45016_ICD9_NAME1() != null) {
            for (int i = 0; i < 4; i++) {
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
                indexOperation.setP494(zj_BASY_STD.getP45018());
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
                if (i == 0 && zj_BASY_STD.getP45016_ICD9_NAME1() != null) {
                    //手术/操作编码
                    indexOperation.setP490(zj_BASY_STD.getP45016_ICD9_ID1());
                    //手术/操作名称
                    indexOperation.setP492(zj_BASY_STD.getP45016_ICD9_NAME1());
                    indexOperationService.saveIndexOperation(indexOperation);
                } else if (i == 1 && zj_BASY_STD.getP45016_ICD9_NAME2() != null) {
                    //手术/操作编码
                    indexOperation.setP490(zj_BASY_STD.getP45016_ICD9_ID2());
                    //手术/操作名称
                    indexOperation.setP492(zj_BASY_STD.getP45016_ICD9_NAME2());
                    indexOperationService.saveIndexOperation(indexOperation);
                } else if (i == 2 && zj_BASY_STD.getP45016_ICD9_NAME3() != null) {
                    //手术/操作编码
                    indexOperation.setP490(zj_BASY_STD.getP45016_ICD9_ID3());
                    //手术/操作名称
                    indexOperation.setP492(zj_BASY_STD.getP45016_ICD9_NAME3());
                    indexOperationService.saveIndexOperation(indexOperation);
                } else if (i == 3 && zj_BASY_STD.getP45016_ICD9_NAME4() != null) {
                    //手术/操作编码
                    indexOperation.setP490(zj_BASY_STD.getP45016_ICD9_ID4());
                    //手术/操作名称
                    indexOperation.setP492(zj_BASY_STD.getP45016_ICD9_NAME4());
                    indexOperationService.saveIndexOperation(indexOperation);
                }
            }

        }
        if (zj_BASY_STD.getP45028_ICD9_NAME1() != null) {
            for (int i = 0; i < 4; i++) {
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
                indexOperation.setP494(zj_BASY_STD.getP45030());
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
                if (i == 0 && zj_BASY_STD.getP45028_ICD9_NAME1() != null) {
                    //手术/操作编码
                    indexOperation.setP490(zj_BASY_STD.getP45028_ICD9_ID1());
                    //手术/操作名称
                    indexOperation.setP492(zj_BASY_STD.getP45028_ICD9_NAME1());
                    indexOperationService.saveIndexOperation(indexOperation);
                } else if (i == 1 && zj_BASY_STD.getP45028_ICD9_NAME2() != null) {
                    //手术/操作编码
                    indexOperation.setP490(zj_BASY_STD.getP45028_ICD9_ID2());
                    //手术/操作名称
                    indexOperation.setP492(zj_BASY_STD.getP45028_ICD9_NAME2());
                    indexOperationService.saveIndexOperation(indexOperation);
                } else if (i == 2 && zj_BASY_STD.getP45028_ICD9_NAME3() != null) {
                    //手术/操作编码
                    indexOperation.setP490(zj_BASY_STD.getP45028_ICD9_ID3());
                    //手术/操作名称
                    indexOperation.setP492(zj_BASY_STD.getP45028_ICD9_NAME3());
                    indexOperationService.saveIndexOperation(indexOperation);
                } else if (i == 3 && zj_BASY_STD.getP45028_ICD9_NAME4() != null) {
                    //手术/操作编码
                    indexOperation.setP490(zj_BASY_STD.getP45028_ICD9_ID4());
                    //手术/操作名称
                    indexOperation.setP492(zj_BASY_STD.getP45028_ICD9_NAME4());
                    indexOperationService.saveIndexOperation(indexOperation);
                }
            }
        }
        if (zj_BASY_STD.getP45040_ICD9_NAME1() != null) {
            for (int i = 0; i < 4; i++) {

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
                indexOperation.setP494(zj_BASY_STD.getP45042());
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
                if (i == 0 && zj_BASY_STD.getP45040_ICD9_NAME1() != null) {
                    //手术/操作编码
                    indexOperation.setP490(zj_BASY_STD.getP45040_ICD9_ID1());
                    //手术/操作名称
                    indexOperation.setP492(zj_BASY_STD.getP45040_ICD9_NAME1());
                    indexOperationService.saveIndexOperation(indexOperation);
                } else if (i == 1 && zj_BASY_STD.getP45040_ICD9_NAME2() != null) {
                    //手术/操作编码
                    indexOperation.setP490(zj_BASY_STD.getP45040_ICD9_ID2());
                    //手术/操作名称
                    indexOperation.setP492(zj_BASY_STD.getP45040_ICD9_NAME2());
                    indexOperationService.saveIndexOperation(indexOperation);
                } else if (i == 2 && zj_BASY_STD.getP45040_ICD9_NAME3() != null) {
                    //手术/操作编码
                    indexOperation.setP490(zj_BASY_STD.getP45040_ICD9_ID3());
                    //手术/操作名称
                    indexOperation.setP492(zj_BASY_STD.getP45040_ICD9_NAME3());
                    indexOperationService.saveIndexOperation(indexOperation);
                } else if (i == 3 && zj_BASY_STD.getP45040_ICD9_NAME4() != null) {
                    //手术/操作编码
                    indexOperation.setP490(zj_BASY_STD.getP45040_ICD9_ID4());
                    //手术/操作名称
                    indexOperation.setP492(zj_BASY_STD.getP45040_ICD9_NAME4());
                    indexOperationService.saveIndexOperation(indexOperation);
                }
            }
        }
        if (zj_BASY_STD.getP45052_ICD9_NAME1() != null) {
            for (int i = 0; i < 4; i++) {
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
                indexOperation.setP494(zj_BASY_STD.getP45054());
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
                if (i == 0 && zj_BASY_STD.getP45052_ICD9_NAME1() != null) {
                    //手术/操作编码
                    indexOperation.setP490(zj_BASY_STD.getP45052_ICD9_ID1());
                    //手术/操作名称
                    indexOperation.setP492(zj_BASY_STD.getP45052_ICD9_NAME1());
                    indexOperationService.saveIndexOperation(indexOperation);
                } else if (i == 1 && zj_BASY_STD.getP45052_ICD9_NAME2() != null) {
                    //手术/操作编码
                    indexOperation.setP490(zj_BASY_STD.getP45052_ICD9_ID2());
                    //手术/操作名称
                    indexOperation.setP492(zj_BASY_STD.getP45052_ICD9_NAME2());
                    indexOperationService.saveIndexOperation(indexOperation);
                } else if (i == 2 && zj_BASY_STD.getP45052_ICD9_NAME3() != null) {
                    //手术/操作编码
                    indexOperation.setP490(zj_BASY_STD.getP45052_ICD9_ID3());
                    //手术/操作名称
                    indexOperation.setP492(zj_BASY_STD.getP45052_ICD9_NAME3());
                    indexOperationService.saveIndexOperation(indexOperation);
                } else if (i == 3 && zj_BASY_STD.getP45052_ICD9_NAME4() != null) {
                    //手术/操作编码
                    indexOperation.setP490(zj_BASY_STD.getP45052_ICD9_ID4());
                    //手术/操作名称
                    indexOperation.setP492(zj_BASY_STD.getP45052_ICD9_NAME4());
                    indexOperationService.saveIndexOperation(indexOperation);
                }
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

    public void saveIndexDiagnosisAdmit(BASY_STD zj_BASY_STD) {
        log.info("保存病案入院诊断：" + zj_BASY_STD.getUNIQUE_ID());
        if (zj_BASY_STD.getP301_ICD10_NAME1() != null) {
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
            indexDiagnosisAdmit.setP30(zj_BASY_STD.getP301_ICD10_ID1());
            //入院诊断描述名称
            indexDiagnosisAdmit.setP301(zj_BASY_STD.getP301_ICD10_NAME1());
            indexDiagnosisAdmitService.saveIndexDiagnosisAdmit(indexDiagnosisAdmit);
        }
        if (zj_BASY_STD.getP301_ICD10_NAME2() != null) {
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
            indexDiagnosisAdmit.setP30(zj_BASY_STD.getP301_ICD10_ID2());
            //入院诊断描述名称
            indexDiagnosisAdmit.setP301(zj_BASY_STD.getP301_ICD10_NAME2());
            indexDiagnosisAdmitService.saveIndexDiagnosisAdmit(indexDiagnosisAdmit);
        }
        if (zj_BASY_STD.getP301_ICD10_NAME3() != null) {
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
            indexDiagnosisAdmit.setP30(zj_BASY_STD.getP301_ICD10_ID3());
            //入院诊断描述名称
            indexDiagnosisAdmit.setP301(zj_BASY_STD.getP301_ICD10_NAME3());
            indexDiagnosisAdmitService.saveIndexDiagnosisAdmit(indexDiagnosisAdmit);
        }
        if (zj_BASY_STD.getP301_ICD10_NAME4() != null) {
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
            indexDiagnosisAdmit.setP30(zj_BASY_STD.getP301_ICD10_ID4());
            //入院诊断描述名称
            indexDiagnosisAdmit.setP301(zj_BASY_STD.getP301_ICD10_NAME4());
            indexDiagnosisAdmitService.saveIndexDiagnosisAdmit(indexDiagnosisAdmit);
        }
        if (zj_BASY_STD.getP301_ICD10_NAME5() != null) {
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
            indexDiagnosisAdmit.setP30(zj_BASY_STD.getP301_ICD10_ID5());
            //入院诊断描述名称
            indexDiagnosisAdmit.setP301(zj_BASY_STD.getP301_ICD10_NAME5());
            indexDiagnosisAdmitService.saveIndexDiagnosisAdmit(indexDiagnosisAdmit);
        }
        if (zj_BASY_STD.getP301_ICD10_NAME6() != null) {
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
            indexDiagnosisAdmit.setP30(zj_BASY_STD.getP301_ICD10_ID6());
            //入院诊断描述名称
            indexDiagnosisAdmit.setP301(zj_BASY_STD.getP301_ICD10_NAME6());
            indexDiagnosisAdmitService.saveIndexDiagnosisAdmit(indexDiagnosisAdmit);
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

    public void saveIndexDiagnosisClinic(BASY_STD zj_BASY_STD) {
        log.info("保存病案首页门诊诊断：" + zj_BASY_STD.getUNIQUE_ID());
        if (zj_BASY_STD.getP281_ICD10_NAME1() != null) {
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
            indexDiagnosisClinic.setP28(zj_BASY_STD.getP281_ICD10_ID1());
            //门诊诊断名称
            indexDiagnosisClinic.setP281(zj_BASY_STD.getP281_ICD10_NAME1());
            indexDiagnosisClinicService.saveIndexDiagnosisClinic(indexDiagnosisClinic);
        }
        if (zj_BASY_STD.getP281_ICD10_NAME2() != null) {
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
            indexDiagnosisClinic.setP28(zj_BASY_STD.getP281_ICD10_ID2());
            //门诊诊断名称
            indexDiagnosisClinic.setP281(zj_BASY_STD.getP281_ICD10_NAME2());
            indexDiagnosisClinicService.saveIndexDiagnosisClinic(indexDiagnosisClinic);
        }
        if (zj_BASY_STD.getP281_ICD10_NAME3() != null) {
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
            indexDiagnosisClinic.setP28(zj_BASY_STD.getP281_ICD10_ID3());
            //门诊诊断名称
            indexDiagnosisClinic.setP281(zj_BASY_STD.getP281_ICD10_NAME3());
            indexDiagnosisClinicService.saveIndexDiagnosisClinic(indexDiagnosisClinic);
        }
        if (zj_BASY_STD.getP281_ICD10_NAME4() != null) {
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
            indexDiagnosisClinic.setP28(zj_BASY_STD.getP281_ICD10_ID4());
            //门诊诊断名称
            indexDiagnosisClinic.setP281(zj_BASY_STD.getP281_ICD10_NAME4());
            indexDiagnosisClinicService.saveIndexDiagnosisClinic(indexDiagnosisClinic);
        }
        if (zj_BASY_STD.getP281_ICD10_NAME5() != null) {
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
            indexDiagnosisClinic.setP28(zj_BASY_STD.getP281_ICD10_ID5());
            //门诊诊断名称
            indexDiagnosisClinic.setP281(zj_BASY_STD.getP281_ICD10_NAME5());
            indexDiagnosisClinicService.saveIndexDiagnosisClinic(indexDiagnosisClinic);
        }
        if (zj_BASY_STD.getP281_ICD10_NAME6() != null) {
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
            indexDiagnosisClinic.setP28(zj_BASY_STD.getP281_ICD10_ID6());
            //门诊诊断名称
            indexDiagnosisClinic.setP281(zj_BASY_STD.getP281_ICD10_NAME6());
            indexDiagnosisClinicService.saveIndexDiagnosisClinic(indexDiagnosisClinic);
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

    public void saveIndexDiagnosisMain(BASY_STD zj_BASY_STD) {
        log.info("保存病案首页主要诊断：" + zj_BASY_STD.getUNIQUE_ID());

        if (zj_BASY_STD.getP322_ICD10_NAME1() != null) {
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
            indexDiagnosisMain.setP321(zj_BASY_STD.getP322_ICD10_ID1());
            //主要诊断疾病描述
            indexDiagnosisMain.setP322(zj_BASY_STD.getP322_ICD10_NAME1());
            indexDiagnosisMainService.saveIndexDiagnosisMain(indexDiagnosisMain);
        }
        if (zj_BASY_STD.getP322_ICD10_NAME2() != null) {
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
            indexDiagnosisMain.setP321(zj_BASY_STD.getP322_ICD10_ID2());
            //主要诊断疾病描述
            indexDiagnosisMain.setP322(zj_BASY_STD.getP322_ICD10_NAME2());
            indexDiagnosisMainService.saveIndexDiagnosisMain(indexDiagnosisMain);
        }
        if (zj_BASY_STD.getP322_ICD10_NAME3() != null) {
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
            indexDiagnosisMain.setP321(zj_BASY_STD.getP322_ICD10_ID3());
            //主要诊断疾病描述
            indexDiagnosisMain.setP322(zj_BASY_STD.getP322_ICD10_NAME3());
            indexDiagnosisMainService.saveIndexDiagnosisMain(indexDiagnosisMain);
        }
        if (zj_BASY_STD.getP322_ICD10_NAME4() != null) {
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
            indexDiagnosisMain.setP321(zj_BASY_STD.getP322_ICD10_ID4());
            //主要诊断疾病描述
            indexDiagnosisMain.setP322(zj_BASY_STD.getP322_ICD10_NAME4());
            indexDiagnosisMainService.saveIndexDiagnosisMain(indexDiagnosisMain);
        }
        if (zj_BASY_STD.getP322_ICD10_NAME5() != null) {
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
            indexDiagnosisMain.setP321(zj_BASY_STD.getP322_ICD10_ID5());
            //主要诊断疾病描述
            indexDiagnosisMain.setP322(zj_BASY_STD.getP322_ICD10_NAME5());
            indexDiagnosisMainService.saveIndexDiagnosisMain(indexDiagnosisMain);
        }
        if (zj_BASY_STD.getP322_ICD10_NAME6() != null) {
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
            indexDiagnosisMain.setP321(zj_BASY_STD.getP322_ICD10_ID6());
            //主要诊断疾病描述
            indexDiagnosisMain.setP322(zj_BASY_STD.getP322_ICD10_NAME6());
            indexDiagnosisMainService.saveIndexDiagnosisMain(indexDiagnosisMain);
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

    public void saveIndexDiagnosisOther(BASY_STD zj_BASY_STD) {
        log.info("保存病案首页其他诊断：" + zj_BASY_STD.getUNIQUE_ID());
        if (zj_BASY_STD.getP325_ICD10_NAME1() != null) {
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
            indexDiagnosisOther.setP324(zj_BASY_STD.getP325_ICD10_ID1());
            //诊断疾病描述
            indexDiagnosisOther.setP325(zj_BASY_STD.getP325_ICD10_NAME1());
            //诊断入院病情
            indexDiagnosisOther.setP806(zj_BASY_STD.getP806());
            //诊断出院情况
            indexDiagnosisOther.setP326(zj_BASY_STD.getP326());
            indexDiagnosisOtherService.saveIndexDiagnosisOther(indexDiagnosisOther);
        }
        if (zj_BASY_STD.getP325_ICD10_NAME2() != null) {
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
            indexDiagnosisOther.setP324(zj_BASY_STD.getP325_ICD10_ID2());
            //诊断疾病描述
            indexDiagnosisOther.setP325(zj_BASY_STD.getP325_ICD10_NAME2());
            //诊断入院病情
            indexDiagnosisOther.setP806(zj_BASY_STD.getP806());
            //诊断出院情况
            indexDiagnosisOther.setP326(zj_BASY_STD.getP326());
            indexDiagnosisOtherService.saveIndexDiagnosisOther(indexDiagnosisOther);
        }
        if (zj_BASY_STD.getP325_ICD10_NAME3() != null) {
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
            indexDiagnosisOther.setP324(zj_BASY_STD.getP325_ICD10_ID3());
            //诊断疾病描述
            indexDiagnosisOther.setP325(zj_BASY_STD.getP325_ICD10_NAME3());
            //诊断入院病情
            indexDiagnosisOther.setP806(zj_BASY_STD.getP806());
            //诊断出院情况
            indexDiagnosisOther.setP326(zj_BASY_STD.getP326());
            indexDiagnosisOtherService.saveIndexDiagnosisOther(indexDiagnosisOther);
        }
        if (zj_BASY_STD.getP325_ICD10_NAME4() != null) {
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
            indexDiagnosisOther.setP324(zj_BASY_STD.getP325_ICD10_ID4());
            //诊断疾病描述
            indexDiagnosisOther.setP325(zj_BASY_STD.getP325_ICD10_NAME4());
            //诊断入院病情
            indexDiagnosisOther.setP806(zj_BASY_STD.getP806());
            //诊断出院情况
            indexDiagnosisOther.setP326(zj_BASY_STD.getP326());
            indexDiagnosisOtherService.saveIndexDiagnosisOther(indexDiagnosisOther);
        }
        if (zj_BASY_STD.getP325_ICD10_NAME5() != null) {
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
            indexDiagnosisOther.setP324(zj_BASY_STD.getP325_ICD10_ID5());
            //诊断疾病描述
            indexDiagnosisOther.setP325(zj_BASY_STD.getP325_ICD10_NAME5());
            //诊断入院病情
            indexDiagnosisOther.setP806(zj_BASY_STD.getP806());
            //诊断出院情况
            indexDiagnosisOther.setP326(zj_BASY_STD.getP326());
            indexDiagnosisOtherService.saveIndexDiagnosisOther(indexDiagnosisOther);
        }
        if (zj_BASY_STD.getP325_ICD10_NAME6() != null) {
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
            indexDiagnosisOther.setP324(zj_BASY_STD.getP325_ICD10_ID6());
            //诊断疾病描述
            indexDiagnosisOther.setP325(zj_BASY_STD.getP325_ICD10_NAME6());
            //诊断入院病情
            indexDiagnosisOther.setP806(zj_BASY_STD.getP806());
            //诊断出院情况
            indexDiagnosisOther.setP326(zj_BASY_STD.getP326());
            indexDiagnosisOtherService.saveIndexDiagnosisOther(indexDiagnosisOther);
        }

        if (zj_BASY_STD.getP328_ICD10_NAME1() != null) {
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
            indexDiagnosisOther.setP324(zj_BASY_STD.getP328_ICD10_ID1());
            //诊断疾病描述
            indexDiagnosisOther.setP325(zj_BASY_STD.getP328_ICD10_NAME1());
            //诊断入院病情
            indexDiagnosisOther.setP806(zj_BASY_STD.getP806());
            //诊断出院情况
            indexDiagnosisOther.setP326(zj_BASY_STD.getP326());
            indexDiagnosisOtherService.saveIndexDiagnosisOther(indexDiagnosisOther);
        }
        if (zj_BASY_STD.getP328_ICD10_NAME2() != null) {
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
            indexDiagnosisOther.setP324(zj_BASY_STD.getP328_ICD10_ID2());
            //诊断疾病描述
            indexDiagnosisOther.setP325(zj_BASY_STD.getP328_ICD10_NAME2());
            //诊断入院病情
            indexDiagnosisOther.setP806(zj_BASY_STD.getP806());
            //诊断出院情况
            indexDiagnosisOther.setP326(zj_BASY_STD.getP326());
            indexDiagnosisOtherService.saveIndexDiagnosisOther(indexDiagnosisOther);
        }
        if (zj_BASY_STD.getP328_ICD10_NAME3() != null) {
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
            indexDiagnosisOther.setP324(zj_BASY_STD.getP328_ICD10_ID3());
            //诊断疾病描述
            indexDiagnosisOther.setP325(zj_BASY_STD.getP328_ICD10_NAME3());
            //诊断入院病情
            indexDiagnosisOther.setP806(zj_BASY_STD.getP806());
            //诊断出院情况
            indexDiagnosisOther.setP326(zj_BASY_STD.getP326());
            indexDiagnosisOtherService.saveIndexDiagnosisOther(indexDiagnosisOther);
        }
        if (zj_BASY_STD.getP328_ICD10_NAME4() != null) {
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
            indexDiagnosisOther.setP324(zj_BASY_STD.getP328_ICD10_ID4());
            //诊断疾病描述
            indexDiagnosisOther.setP325(zj_BASY_STD.getP328_ICD10_NAME4());
            //诊断入院病情
            indexDiagnosisOther.setP806(zj_BASY_STD.getP806());
            //诊断出院情况
            indexDiagnosisOther.setP326(zj_BASY_STD.getP326());
            indexDiagnosisOtherService.saveIndexDiagnosisOther(indexDiagnosisOther);
        }
        if (zj_BASY_STD.getP328_ICD10_NAME5() != null) {
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
            indexDiagnosisOther.setP324(zj_BASY_STD.getP328_ICD10_ID5());
            //诊断疾病描述
            indexDiagnosisOther.setP325(zj_BASY_STD.getP328_ICD10_NAME5());
            //诊断入院病情
            indexDiagnosisOther.setP806(zj_BASY_STD.getP806());
            //诊断出院情况
            indexDiagnosisOther.setP326(zj_BASY_STD.getP326());
            indexDiagnosisOtherService.saveIndexDiagnosisOther(indexDiagnosisOther);
        }
        if (zj_BASY_STD.getP328_ICD10_NAME6() != null) {
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
            indexDiagnosisOther.setP324(zj_BASY_STD.getP328_ICD10_ID6());
            //诊断疾病描述
            indexDiagnosisOther.setP325(zj_BASY_STD.getP328_ICD10_NAME6());
            //诊断入院病情
            indexDiagnosisOther.setP806(zj_BASY_STD.getP806());
            //诊断出院情况
            indexDiagnosisOther.setP326(zj_BASY_STD.getP326());
            indexDiagnosisOtherService.saveIndexDiagnosisOther(indexDiagnosisOther);
        }

        if (zj_BASY_STD.getP3292_ICD10_NAME1() != null) {
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
            indexDiagnosisOther.setP324(zj_BASY_STD.getP3292_ICD10_ID1());
            //诊断疾病描述
            indexDiagnosisOther.setP325(zj_BASY_STD.getP3292_ICD10_NAME1());
            //诊断入院病情
            indexDiagnosisOther.setP806(zj_BASY_STD.getP806());
            //诊断出院情况
            indexDiagnosisOther.setP326(zj_BASY_STD.getP326());
            indexDiagnosisOtherService.saveIndexDiagnosisOther(indexDiagnosisOther);
        }
        if (zj_BASY_STD.getP3292_ICD10_NAME2() != null) {
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
            indexDiagnosisOther.setP324(zj_BASY_STD.getP3292_ICD10_ID2());
            //诊断疾病描述
            indexDiagnosisOther.setP325(zj_BASY_STD.getP3292_ICD10_NAME2());
            //诊断入院病情
            indexDiagnosisOther.setP806(zj_BASY_STD.getP806());
            //诊断出院情况
            indexDiagnosisOther.setP326(zj_BASY_STD.getP326());
            indexDiagnosisOtherService.saveIndexDiagnosisOther(indexDiagnosisOther);
        }
        if (zj_BASY_STD.getP3292_ICD10_NAME3() != null) {
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
            indexDiagnosisOther.setP324(zj_BASY_STD.getP3292_ICD10_ID3());
            //诊断疾病描述
            indexDiagnosisOther.setP325(zj_BASY_STD.getP3292_ICD10_NAME3());
            //诊断入院病情
            indexDiagnosisOther.setP806(zj_BASY_STD.getP806());
            //诊断出院情况
            indexDiagnosisOther.setP326(zj_BASY_STD.getP326());
            indexDiagnosisOtherService.saveIndexDiagnosisOther(indexDiagnosisOther);
        }
        if (zj_BASY_STD.getP3292_ICD10_NAME4() != null) {
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
            indexDiagnosisOther.setP324(zj_BASY_STD.getP3292_ICD10_ID4());
            //诊断疾病描述
            indexDiagnosisOther.setP325(zj_BASY_STD.getP3292_ICD10_NAME4());
            //诊断入院病情
            indexDiagnosisOther.setP806(zj_BASY_STD.getP806());
            //诊断出院情况
            indexDiagnosisOther.setP326(zj_BASY_STD.getP326());
            indexDiagnosisOtherService.saveIndexDiagnosisOther(indexDiagnosisOther);
        }
        if (zj_BASY_STD.getP3292_ICD10_NAME5() != null) {
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
            indexDiagnosisOther.setP324(zj_BASY_STD.getP3292_ICD10_ID5());
            //诊断疾病描述
            indexDiagnosisOther.setP325(zj_BASY_STD.getP3292_ICD10_NAME5());
            //诊断入院病情
            indexDiagnosisOther.setP806(zj_BASY_STD.getP806());
            //诊断出院情况
            indexDiagnosisOther.setP326(zj_BASY_STD.getP326());
            indexDiagnosisOtherService.saveIndexDiagnosisOther(indexDiagnosisOther);
        }
        if (zj_BASY_STD.getP3292_ICD10_NAME6() != null) {
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
            indexDiagnosisOther.setP324(zj_BASY_STD.getP3292_ICD10_ID6());
            //诊断疾病描述
            indexDiagnosisOther.setP325(zj_BASY_STD.getP3292_ICD10_NAME6());
            //诊断入院病情
            indexDiagnosisOther.setP806(zj_BASY_STD.getP806());
            //诊断出院情况
            indexDiagnosisOther.setP326(zj_BASY_STD.getP326());
            indexDiagnosisOtherService.saveIndexDiagnosisOther(indexDiagnosisOther);
        }

        if (zj_BASY_STD.getP3295_ICD10_NAME1() != null) {
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
            indexDiagnosisOther.setP324(zj_BASY_STD.getP3295_ICD10_ID1());
            //诊断疾病描述
            indexDiagnosisOther.setP325(zj_BASY_STD.getP3295_ICD10_NAME1());
            //诊断入院病情
            indexDiagnosisOther.setP806(zj_BASY_STD.getP806());
            //诊断出院情况
            indexDiagnosisOther.setP326(zj_BASY_STD.getP326());
            indexDiagnosisOtherService.saveIndexDiagnosisOther(indexDiagnosisOther);
        }
        if (zj_BASY_STD.getP3295_ICD10_NAME2() != null) {
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
            indexDiagnosisOther.setP324(zj_BASY_STD.getP3295_ICD10_ID2());
            //诊断疾病描述
            indexDiagnosisOther.setP325(zj_BASY_STD.getP3295_ICD10_NAME2());
            //诊断入院病情
            indexDiagnosisOther.setP806(zj_BASY_STD.getP806());
            //诊断出院情况
            indexDiagnosisOther.setP326(zj_BASY_STD.getP326());
            indexDiagnosisOtherService.saveIndexDiagnosisOther(indexDiagnosisOther);
        }
        if (zj_BASY_STD.getP3295_ICD10_NAME3() != null) {
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
            indexDiagnosisOther.setP324(zj_BASY_STD.getP3295_ICD10_ID3());
            //诊断疾病描述
            indexDiagnosisOther.setP325(zj_BASY_STD.getP3295_ICD10_NAME3());
            //诊断入院病情
            indexDiagnosisOther.setP806(zj_BASY_STD.getP806());
            //诊断出院情况
            indexDiagnosisOther.setP326(zj_BASY_STD.getP326());
            indexDiagnosisOtherService.saveIndexDiagnosisOther(indexDiagnosisOther);
        }
        if (zj_BASY_STD.getP3295_ICD10_NAME4() != null) {
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
            indexDiagnosisOther.setP324(zj_BASY_STD.getP3295_ICD10_ID4());
            //诊断疾病描述
            indexDiagnosisOther.setP325(zj_BASY_STD.getP3295_ICD10_NAME4());
            //诊断入院病情
            indexDiagnosisOther.setP806(zj_BASY_STD.getP806());
            //诊断出院情况
            indexDiagnosisOther.setP326(zj_BASY_STD.getP326());
            indexDiagnosisOtherService.saveIndexDiagnosisOther(indexDiagnosisOther);
        }
        if (zj_BASY_STD.getP3295_ICD10_NAME5() != null) {
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
            indexDiagnosisOther.setP324(zj_BASY_STD.getP3295_ICD10_ID5());
            //诊断疾病描述
            indexDiagnosisOther.setP325(zj_BASY_STD.getP3295_ICD10_NAME5());
            //诊断入院病情
            indexDiagnosisOther.setP806(zj_BASY_STD.getP806());
            //诊断出院情况
            indexDiagnosisOther.setP326(zj_BASY_STD.getP326());
            indexDiagnosisOtherService.saveIndexDiagnosisOther(indexDiagnosisOther);
        }
        if (zj_BASY_STD.getP3295_ICD10_NAME6() != null) {
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
            indexDiagnosisOther.setP324(zj_BASY_STD.getP3295_ICD10_ID6());
            //诊断疾病描述
            indexDiagnosisOther.setP325(zj_BASY_STD.getP3295_ICD10_NAME6());
            //诊断入院病情
            indexDiagnosisOther.setP806(zj_BASY_STD.getP806());
            //诊断出院情况
            indexDiagnosisOther.setP326(zj_BASY_STD.getP326());
            indexDiagnosisOtherService.saveIndexDiagnosisOther(indexDiagnosisOther);
        }

        if (zj_BASY_STD.getP3298_ICD10_NAME1() != null) {
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
            indexDiagnosisOther.setP324(zj_BASY_STD.getP3298_ICD10_ID1());
            //诊断疾病描述
            indexDiagnosisOther.setP325(zj_BASY_STD.getP3298_ICD10_NAME1());
            //诊断入院病情
            indexDiagnosisOther.setP806(zj_BASY_STD.getP806());
            //诊断出院情况
            indexDiagnosisOther.setP326(zj_BASY_STD.getP326());
            indexDiagnosisOtherService.saveIndexDiagnosisOther(indexDiagnosisOther);
        }
        if (zj_BASY_STD.getP3298_ICD10_NAME2() != null) {
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
            indexDiagnosisOther.setP324(zj_BASY_STD.getP3298_ICD10_ID2());
            //诊断疾病描述
            indexDiagnosisOther.setP325(zj_BASY_STD.getP3298_ICD10_NAME2());
            //诊断入院病情
            indexDiagnosisOther.setP806(zj_BASY_STD.getP806());
            //诊断出院情况
            indexDiagnosisOther.setP326(zj_BASY_STD.getP326());
            indexDiagnosisOtherService.saveIndexDiagnosisOther(indexDiagnosisOther);
        }
        if (zj_BASY_STD.getP3298_ICD10_NAME3() != null) {
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
            indexDiagnosisOther.setP324(zj_BASY_STD.getP3298_ICD10_ID3());
            //诊断疾病描述
            indexDiagnosisOther.setP325(zj_BASY_STD.getP3298_ICD10_NAME3());
            //诊断入院病情
            indexDiagnosisOther.setP806(zj_BASY_STD.getP806());
            //诊断出院情况
            indexDiagnosisOther.setP326(zj_BASY_STD.getP326());
            indexDiagnosisOtherService.saveIndexDiagnosisOther(indexDiagnosisOther);
        }
        if (zj_BASY_STD.getP3298_ICD10_NAME4() != null) {
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
            indexDiagnosisOther.setP324(zj_BASY_STD.getP3298_ICD10_ID4());
            //诊断疾病描述
            indexDiagnosisOther.setP325(zj_BASY_STD.getP3298_ICD10_NAME4());
            //诊断入院病情
            indexDiagnosisOther.setP806(zj_BASY_STD.getP806());
            //诊断出院情况
            indexDiagnosisOther.setP326(zj_BASY_STD.getP326());
            indexDiagnosisOtherService.saveIndexDiagnosisOther(indexDiagnosisOther);
        }
        if (zj_BASY_STD.getP3298_ICD10_NAME5() != null) {
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
            indexDiagnosisOther.setP324(zj_BASY_STD.getP3298_ICD10_ID5());
            //诊断疾病描述
            indexDiagnosisOther.setP325(zj_BASY_STD.getP3298_ICD10_NAME5());
            //诊断入院病情
            indexDiagnosisOther.setP806(zj_BASY_STD.getP806());
            //诊断出院情况
            indexDiagnosisOther.setP326(zj_BASY_STD.getP326());
            indexDiagnosisOtherService.saveIndexDiagnosisOther(indexDiagnosisOther);
        }
        if (zj_BASY_STD.getP3298_ICD10_NAME6() != null) {
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
            indexDiagnosisOther.setP324(zj_BASY_STD.getP3298_ICD10_ID6());
            //诊断疾病描述
            indexDiagnosisOther.setP325(zj_BASY_STD.getP3298_ICD10_NAME6());
            //诊断入院病情
            indexDiagnosisOther.setP806(zj_BASY_STD.getP806());
            //诊断出院情况
            indexDiagnosisOther.setP326(zj_BASY_STD.getP326());
            indexDiagnosisOtherService.saveIndexDiagnosisOther(indexDiagnosisOther);
        }

        if (zj_BASY_STD.getP3282_ICD10_NAME1() != null) {
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
            indexDiagnosisOther.setP324(zj_BASY_STD.getP3282_ICD10_ID1());
            //诊断疾病描述
            indexDiagnosisOther.setP325(zj_BASY_STD.getP3282_ICD10_NAME1());
            //诊断入院病情
            indexDiagnosisOther.setP806(zj_BASY_STD.getP806());
            //诊断出院情况
            indexDiagnosisOther.setP326(zj_BASY_STD.getP326());
            indexDiagnosisOtherService.saveIndexDiagnosisOther(indexDiagnosisOther);
        }
        if (zj_BASY_STD.getP3282_ICD10_NAME2() != null) {
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
            indexDiagnosisOther.setP324(zj_BASY_STD.getP3282_ICD10_ID2());
            //诊断疾病描述
            indexDiagnosisOther.setP325(zj_BASY_STD.getP3282_ICD10_NAME2());
            //诊断入院病情
            indexDiagnosisOther.setP806(zj_BASY_STD.getP806());
            //诊断出院情况
            indexDiagnosisOther.setP326(zj_BASY_STD.getP326());
            indexDiagnosisOtherService.saveIndexDiagnosisOther(indexDiagnosisOther);
        }
        if (zj_BASY_STD.getP3282_ICD10_NAME3() != null) {
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
            indexDiagnosisOther.setP324(zj_BASY_STD.getP3282_ICD10_ID3());
            //诊断疾病描述
            indexDiagnosisOther.setP325(zj_BASY_STD.getP3282_ICD10_NAME3());
            //诊断入院病情
            indexDiagnosisOther.setP806(zj_BASY_STD.getP806());
            //诊断出院情况
            indexDiagnosisOther.setP326(zj_BASY_STD.getP326());
            indexDiagnosisOtherService.saveIndexDiagnosisOther(indexDiagnosisOther);
        }
        if (zj_BASY_STD.getP3282_ICD10_NAME4() != null) {
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
            indexDiagnosisOther.setP324(zj_BASY_STD.getP3282_ICD10_ID4());
            //诊断疾病描述
            indexDiagnosisOther.setP325(zj_BASY_STD.getP3282_ICD10_NAME4());
            //诊断入院病情
            indexDiagnosisOther.setP806(zj_BASY_STD.getP806());
            //诊断出院情况
            indexDiagnosisOther.setP326(zj_BASY_STD.getP326());
            indexDiagnosisOtherService.saveIndexDiagnosisOther(indexDiagnosisOther);
        }
        if (zj_BASY_STD.getP3282_ICD10_NAME5() != null) {
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
            indexDiagnosisOther.setP324(zj_BASY_STD.getP3282_ICD10_ID5());
            //诊断疾病描述
            indexDiagnosisOther.setP325(zj_BASY_STD.getP3282_ICD10_NAME5());
            //诊断入院病情
            indexDiagnosisOther.setP806(zj_BASY_STD.getP806());
            //诊断出院情况
            indexDiagnosisOther.setP326(zj_BASY_STD.getP326());
            indexDiagnosisOtherService.saveIndexDiagnosisOther(indexDiagnosisOther);
        }
        if (zj_BASY_STD.getP3282_ICD10_NAME6() != null) {
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
            indexDiagnosisOther.setP324(zj_BASY_STD.getP3282_ICD10_ID6());
            //诊断疾病描述
            indexDiagnosisOther.setP325(zj_BASY_STD.getP3282_ICD10_NAME6());
            //诊断入院病情
            indexDiagnosisOther.setP806(zj_BASY_STD.getP806());
            //诊断出院情况
            indexDiagnosisOther.setP326(zj_BASY_STD.getP326());
            indexDiagnosisOtherService.saveIndexDiagnosisOther(indexDiagnosisOther);
        }

        if (zj_BASY_STD.getP3285_ICD10_NAME1() != null) {
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
            indexDiagnosisOther.setP324(zj_BASY_STD.getP3285_ICD10_ID1());
            //诊断疾病描述
            indexDiagnosisOther.setP325(zj_BASY_STD.getP3285_ICD10_NAME1());
            //诊断入院病情
            indexDiagnosisOther.setP806(zj_BASY_STD.getP806());
            //诊断出院情况
            indexDiagnosisOther.setP326(zj_BASY_STD.getP326());
            indexDiagnosisOtherService.saveIndexDiagnosisOther(indexDiagnosisOther);
        }
        if (zj_BASY_STD.getP3285_ICD10_NAME2() != null) {
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
            indexDiagnosisOther.setP324(zj_BASY_STD.getP3285_ICD10_ID2());
            //诊断疾病描述
            indexDiagnosisOther.setP325(zj_BASY_STD.getP3285_ICD10_NAME2());
            //诊断入院病情
            indexDiagnosisOther.setP806(zj_BASY_STD.getP806());
            //诊断出院情况
            indexDiagnosisOther.setP326(zj_BASY_STD.getP326());
            indexDiagnosisOtherService.saveIndexDiagnosisOther(indexDiagnosisOther);
        }
        if (zj_BASY_STD.getP3285_ICD10_NAME3() != null) {
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
            indexDiagnosisOther.setP324(zj_BASY_STD.getP3285_ICD10_ID3());
            //诊断疾病描述
            indexDiagnosisOther.setP325(zj_BASY_STD.getP3285_ICD10_NAME3());
            //诊断入院病情
            indexDiagnosisOther.setP806(zj_BASY_STD.getP806());
            //诊断出院情况
            indexDiagnosisOther.setP326(zj_BASY_STD.getP326());
            indexDiagnosisOtherService.saveIndexDiagnosisOther(indexDiagnosisOther);
        }
        if (zj_BASY_STD.getP3285_ICD10_NAME4() != null) {
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
            indexDiagnosisOther.setP324(zj_BASY_STD.getP3285_ICD10_ID4());
            //诊断疾病描述
            indexDiagnosisOther.setP325(zj_BASY_STD.getP3285_ICD10_NAME4());
            //诊断入院病情
            indexDiagnosisOther.setP806(zj_BASY_STD.getP806());
            //诊断出院情况
            indexDiagnosisOther.setP326(zj_BASY_STD.getP326());
            indexDiagnosisOtherService.saveIndexDiagnosisOther(indexDiagnosisOther);
        }
        if (zj_BASY_STD.getP3285_ICD10_NAME5() != null) {
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
            indexDiagnosisOther.setP324(zj_BASY_STD.getP3285_ICD10_ID5());
            //诊断疾病描述
            indexDiagnosisOther.setP325(zj_BASY_STD.getP3285_ICD10_NAME5());
            //诊断入院病情
            indexDiagnosisOther.setP806(zj_BASY_STD.getP806());
            //诊断出院情况
            indexDiagnosisOther.setP326(zj_BASY_STD.getP326());
            indexDiagnosisOtherService.saveIndexDiagnosisOther(indexDiagnosisOther);
        }
        if (zj_BASY_STD.getP3285_ICD10_NAME6() != null) {
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
            indexDiagnosisOther.setP324(zj_BASY_STD.getP3285_ICD10_ID6());
            //诊断疾病描述
            indexDiagnosisOther.setP325(zj_BASY_STD.getP3285_ICD10_NAME6());
            //诊断入院病情
            indexDiagnosisOther.setP806(zj_BASY_STD.getP806());
            //诊断出院情况
            indexDiagnosisOther.setP326(zj_BASY_STD.getP326());
            indexDiagnosisOtherService.saveIndexDiagnosisOther(indexDiagnosisOther);
        }

        if (zj_BASY_STD.getP3288_ICD10_NAME1() != null) {
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
            indexDiagnosisOther.setP324(zj_BASY_STD.getP3288_ICD10_ID1());
            //诊断疾病描述
            indexDiagnosisOther.setP325(zj_BASY_STD.getP3288_ICD10_NAME1());
            //诊断入院病情
            indexDiagnosisOther.setP806(zj_BASY_STD.getP806());
            //诊断出院情况
            indexDiagnosisOther.setP326(zj_BASY_STD.getP326());
            indexDiagnosisOtherService.saveIndexDiagnosisOther(indexDiagnosisOther);
        }
        if (zj_BASY_STD.getP3288_ICD10_NAME2() != null) {
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
            indexDiagnosisOther.setP324(zj_BASY_STD.getP3288_ICD10_ID2());
            //诊断疾病描述
            indexDiagnosisOther.setP325(zj_BASY_STD.getP3288_ICD10_NAME2());
            //诊断入院病情
            indexDiagnosisOther.setP806(zj_BASY_STD.getP806());
            //诊断出院情况
            indexDiagnosisOther.setP326(zj_BASY_STD.getP326());
            indexDiagnosisOtherService.saveIndexDiagnosisOther(indexDiagnosisOther);
        }
        if (zj_BASY_STD.getP3288_ICD10_NAME3() != null) {
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
            indexDiagnosisOther.setP324(zj_BASY_STD.getP3288_ICD10_ID3());
            //诊断疾病描述
            indexDiagnosisOther.setP325(zj_BASY_STD.getP3288_ICD10_NAME3());
            //诊断入院病情
            indexDiagnosisOther.setP806(zj_BASY_STD.getP806());
            //诊断出院情况
            indexDiagnosisOther.setP326(zj_BASY_STD.getP326());
            indexDiagnosisOtherService.saveIndexDiagnosisOther(indexDiagnosisOther);
        }
        if (zj_BASY_STD.getP3288_ICD10_NAME4() != null) {
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
            indexDiagnosisOther.setP324(zj_BASY_STD.getP3288_ICD10_ID4());
            //诊断疾病描述
            indexDiagnosisOther.setP325(zj_BASY_STD.getP3288_ICD10_NAME4());
            //诊断入院病情
            indexDiagnosisOther.setP806(zj_BASY_STD.getP806());
            //诊断出院情况
            indexDiagnosisOther.setP326(zj_BASY_STD.getP326());
            indexDiagnosisOtherService.saveIndexDiagnosisOther(indexDiagnosisOther);
        }
        if (zj_BASY_STD.getP3288_ICD10_NAME5() != null) {
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
            indexDiagnosisOther.setP324(zj_BASY_STD.getP3288_ICD10_ID5());
            //诊断疾病描述
            indexDiagnosisOther.setP325(zj_BASY_STD.getP3288_ICD10_NAME5());
            //诊断入院病情
            indexDiagnosisOther.setP806(zj_BASY_STD.getP806());
            //诊断出院情况
            indexDiagnosisOther.setP326(zj_BASY_STD.getP326());
            indexDiagnosisOtherService.saveIndexDiagnosisOther(indexDiagnosisOther);
        }
        if (zj_BASY_STD.getP3288_ICD10_NAME6() != null) {
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
            indexDiagnosisOther.setP324(zj_BASY_STD.getP3288_ICD10_ID6());
            //诊断疾病描述
            indexDiagnosisOther.setP325(zj_BASY_STD.getP3288_ICD10_NAME6());
            //诊断入院病情
            indexDiagnosisOther.setP806(zj_BASY_STD.getP806());
            //诊断出院情况
            indexDiagnosisOther.setP326(zj_BASY_STD.getP326());
            indexDiagnosisOtherService.saveIndexDiagnosisOther(indexDiagnosisOther);
        }

        if (zj_BASY_STD.getP3272_ICD10_NAME1() != null) {
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
            indexDiagnosisOther.setP324(zj_BASY_STD.getP3272_ICD10_ID1());
            //诊断疾病描述
            indexDiagnosisOther.setP325(zj_BASY_STD.getP3272_ICD10_NAME1());
            //诊断入院病情
            indexDiagnosisOther.setP806(zj_BASY_STD.getP806());
            //诊断出院情况
            indexDiagnosisOther.setP326(zj_BASY_STD.getP326());
            indexDiagnosisOtherService.saveIndexDiagnosisOther(indexDiagnosisOther);
        }
        if (zj_BASY_STD.getP3272_ICD10_NAME2() != null) {
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
            indexDiagnosisOther.setP324(zj_BASY_STD.getP3272_ICD10_ID2());
            //诊断疾病描述
            indexDiagnosisOther.setP325(zj_BASY_STD.getP3272_ICD10_NAME2());
            //诊断入院病情
            indexDiagnosisOther.setP806(zj_BASY_STD.getP806());
            //诊断出院情况
            indexDiagnosisOther.setP326(zj_BASY_STD.getP326());
            indexDiagnosisOtherService.saveIndexDiagnosisOther(indexDiagnosisOther);
        }
        if (zj_BASY_STD.getP3272_ICD10_NAME3() != null) {
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
            indexDiagnosisOther.setP324(zj_BASY_STD.getP3272_ICD10_ID3());
            //诊断疾病描述
            indexDiagnosisOther.setP325(zj_BASY_STD.getP3272_ICD10_NAME3());
            //诊断入院病情
            indexDiagnosisOther.setP806(zj_BASY_STD.getP806());
            //诊断出院情况
            indexDiagnosisOther.setP326(zj_BASY_STD.getP326());
            indexDiagnosisOtherService.saveIndexDiagnosisOther(indexDiagnosisOther);
        }
        if (zj_BASY_STD.getP3272_ICD10_NAME4() != null) {
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
            indexDiagnosisOther.setP324(zj_BASY_STD.getP3272_ICD10_ID4());
            //诊断疾病描述
            indexDiagnosisOther.setP325(zj_BASY_STD.getP3272_ICD10_NAME4());
            //诊断入院病情
            indexDiagnosisOther.setP806(zj_BASY_STD.getP806());
            //诊断出院情况
            indexDiagnosisOther.setP326(zj_BASY_STD.getP326());
            indexDiagnosisOtherService.saveIndexDiagnosisOther(indexDiagnosisOther);
        }
        if (zj_BASY_STD.getP3272_ICD10_NAME5() != null) {
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
            indexDiagnosisOther.setP324(zj_BASY_STD.getP3272_ICD10_ID5());
            //诊断疾病描述
            indexDiagnosisOther.setP325(zj_BASY_STD.getP3272_ICD10_NAME5());
            //诊断入院病情
            indexDiagnosisOther.setP806(zj_BASY_STD.getP806());
            //诊断出院情况
            indexDiagnosisOther.setP326(zj_BASY_STD.getP326());
            indexDiagnosisOtherService.saveIndexDiagnosisOther(indexDiagnosisOther);
        }
        if (zj_BASY_STD.getP3272_ICD10_NAME6() != null) {
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
            indexDiagnosisOther.setP324(zj_BASY_STD.getP3272_ICD10_ID6());
            //诊断疾病描述
            indexDiagnosisOther.setP325(zj_BASY_STD.getP3272_ICD10_NAME6());
            //诊断入院病情
            indexDiagnosisOther.setP806(zj_BASY_STD.getP806());
            //诊断出院情况
            indexDiagnosisOther.setP326(zj_BASY_STD.getP326());
            indexDiagnosisOtherService.saveIndexDiagnosisOther(indexDiagnosisOther);
        }

        if (zj_BASY_STD.getP3275_ICD10_NAME1() != null) {
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
            indexDiagnosisOther.setP324(zj_BASY_STD.getP3275_ICD10_ID1());
            //诊断疾病描述
            indexDiagnosisOther.setP325(zj_BASY_STD.getP3275_ICD10_NAME1());
            //诊断入院病情
            indexDiagnosisOther.setP806(zj_BASY_STD.getP806());
            //诊断出院情况
            indexDiagnosisOther.setP326(zj_BASY_STD.getP326());
            indexDiagnosisOtherService.saveIndexDiagnosisOther(indexDiagnosisOther);
        }
        if (zj_BASY_STD.getP3275_ICD10_NAME2() != null) {
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
            indexDiagnosisOther.setP324(zj_BASY_STD.getP3275_ICD10_ID2());
            //诊断疾病描述
            indexDiagnosisOther.setP325(zj_BASY_STD.getP3275_ICD10_NAME2());
            //诊断入院病情
            indexDiagnosisOther.setP806(zj_BASY_STD.getP806());
            //诊断出院情况
            indexDiagnosisOther.setP326(zj_BASY_STD.getP326());
            indexDiagnosisOtherService.saveIndexDiagnosisOther(indexDiagnosisOther);
        }
        if (zj_BASY_STD.getP3275_ICD10_NAME3() != null) {
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
            indexDiagnosisOther.setP324(zj_BASY_STD.getP3275_ICD10_ID3());
            //诊断疾病描述
            indexDiagnosisOther.setP325(zj_BASY_STD.getP3275_ICD10_NAME3());
            //诊断入院病情
            indexDiagnosisOther.setP806(zj_BASY_STD.getP806());
            //诊断出院情况
            indexDiagnosisOther.setP326(zj_BASY_STD.getP326());
            indexDiagnosisOtherService.saveIndexDiagnosisOther(indexDiagnosisOther);
        }
        if (zj_BASY_STD.getP3275_ICD10_NAME4() != null) {
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
            indexDiagnosisOther.setP324(zj_BASY_STD.getP3275_ICD10_ID4());
            //诊断疾病描述
            indexDiagnosisOther.setP325(zj_BASY_STD.getP3275_ICD10_NAME4());
            //诊断入院病情
            indexDiagnosisOther.setP806(zj_BASY_STD.getP806());
            //诊断出院情况
            indexDiagnosisOther.setP326(zj_BASY_STD.getP326());
            indexDiagnosisOtherService.saveIndexDiagnosisOther(indexDiagnosisOther);
        }
        if (zj_BASY_STD.getP3275_ICD10_NAME5() != null) {
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
            indexDiagnosisOther.setP324(zj_BASY_STD.getP3275_ICD10_ID5());
            //诊断疾病描述
            indexDiagnosisOther.setP325(zj_BASY_STD.getP3275_ICD10_NAME5());
            //诊断入院病情
            indexDiagnosisOther.setP806(zj_BASY_STD.getP806());
            //诊断出院情况
            indexDiagnosisOther.setP326(zj_BASY_STD.getP326());
            indexDiagnosisOtherService.saveIndexDiagnosisOther(indexDiagnosisOther);
        }
        if (zj_BASY_STD.getP3275_ICD10_NAME6() != null) {
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
            indexDiagnosisOther.setP324(zj_BASY_STD.getP3275_ICD10_ID6());
            //诊断疾病描述
            indexDiagnosisOther.setP325(zj_BASY_STD.getP3275_ICD10_NAME6());
            //诊断入院病情
            indexDiagnosisOther.setP806(zj_BASY_STD.getP806());
            //诊断出院情况
            indexDiagnosisOther.setP326(zj_BASY_STD.getP326());
            indexDiagnosisOtherService.saveIndexDiagnosisOther(indexDiagnosisOther);
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

    public void saveIndexIcu(BASY_NSTD zj_BASY_NSTD) {
        log.info("保存病案首页重症监护：" + zj_BASY_NSTD.getUNIQUE_ID());
        if (zj_BASY_NSTD.getP6911() != null) {
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
        if (zj_BASY_NSTD.getP6914() != null) {
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
        if (zj_BASY_NSTD.getP6917() != null) {
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
        if (zj_BASY_NSTD.getP6920() != null) {
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
        if (zj_BASY_NSTD.getP6923() != null) {
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

    public void saveIndexPathology(BASY_STD zj_BASY_STD) {
        log.info("保存病案首页病理诊断：" + zj_BASY_STD.getUNIQUE_ID());
        if (zj_BASY_STD.getP352_ICD10_NAME1() != null) {
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
            indexPathology.setP351(zj_BASY_STD.getP352_ICD10_ID1());
            //病理诊断名称
            indexPathology.setP352(zj_BASY_STD.getP352_ICD10_NAME1());
            indexPathologyService.saveIndexPathology(indexPathology);
        }
        if (zj_BASY_STD.getP352_ICD10_NAME2() != null) {
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
            indexPathology.setP351(zj_BASY_STD.getP352_ICD10_ID2());
            //病理诊断名称
            indexPathology.setP352(zj_BASY_STD.getP352_ICD10_NAME2());
            indexPathologyService.saveIndexPathology(indexPathology);
        }
        if (zj_BASY_STD.getP352_ICD10_NAME2() != null) {
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
            indexPathology.setP351(zj_BASY_STD.getP352_ICD10_ID2());
            //病理诊断名称
            indexPathology.setP352(zj_BASY_STD.getP352_ICD10_NAME3());
            indexPathologyService.saveIndexPathology(indexPathology);
        }
        if (zj_BASY_STD.getP354_ICD10_NAME1() != null) {
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
            indexPathology.setP351(zj_BASY_STD.getP354_ICD10_ID1());
            //病理诊断名称
            indexPathology.setP352(zj_BASY_STD.getP354_ICD10_NAME1());
            indexPathologyService.saveIndexPathology(indexPathology);
        }
        if (zj_BASY_STD.getP354_ICD10_NAME2() != null) {
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
            indexPathology.setP351(zj_BASY_STD.getP354_ICD10_ID2());
            //病理诊断名称
            indexPathology.setP352(zj_BASY_STD.getP354_ICD10_NAME2());
            indexPathologyService.saveIndexPathology(indexPathology);
        }
        if (zj_BASY_STD.getP354_ICD10_NAME2() != null) {
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
            indexPathology.setP351(zj_BASY_STD.getP354_ICD10_ID2());
            //病理诊断名称
            indexPathology.setP352(zj_BASY_STD.getP354_ICD10_NAME3());
            indexPathologyService.saveIndexPathology(indexPathology);
        }
        if (zj_BASY_STD.getP356_ICD10_NAME1() != null) {
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
            indexPathology.setP351(zj_BASY_STD.getP356_ICD10_ID1());
            //病理诊断名称
            indexPathology.setP352(zj_BASY_STD.getP356_ICD10_NAME1());
            indexPathologyService.saveIndexPathology(indexPathology);
        }
        if (zj_BASY_STD.getP356_ICD10_NAME2() != null) {
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
            indexPathology.setP351(zj_BASY_STD.getP356_ICD10_ID2());
            //病理诊断名称
            indexPathology.setP352(zj_BASY_STD.getP356_ICD10_NAME2());
            indexPathologyService.saveIndexPathology(indexPathology);
        }
        if (zj_BASY_STD.getP356_ICD10_NAME2() != null) {
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
            indexPathology.setP351(zj_BASY_STD.getP356_ICD10_ID2());
            //病理诊断名称
            indexPathology.setP352(zj_BASY_STD.getP356_ICD10_NAME3());
            indexPathologyService.saveIndexPathology(indexPathology);
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

    public void saveIndexInjury(BASY_STD zj_BASY_STD) {
        log.info("保存病案首页中毒损伤：" + zj_BASY_STD.getUNIQUE_ID());
        if (zj_BASY_STD.getP362() != null) {
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
        if (zj_BASY_STD.getP364() != null) {
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
        if (zj_BASY_STD.getP366() != null) {
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

    public void saveIndexPerson(BASY_NSTD zj_BASY_NSTD, BASY_STD zj_BASY_STD) {
        log.info("保存病案首页基本信息" + zj_BASY_NSTD.getUNIQUE_ID());
        IndexPerson indexPerson = new IndexPerson();
        //标识患者身份唯一标识
        indexPerson.setPersonId(zj_BASY_NSTD.getUNIQUE_ID());
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

    public void savePersonGeneral(List<VITAL_RECORD> zj_VITAL_RECORD) {

        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        if (zj_VITAL_RECORD.size() > 0) {
            Map<String, List<VITAL_RECORD>> recordMap = new HashMap<>();

            for (VITAL_RECORD vitalRecord : zj_VITAL_RECORD) {

                if ("呼吸".equals(vitalRecord.getITEM_NAME()) || "脉搏".equals(vitalRecord.getITEM_NAME())
                        || "体温".equals(vitalRecord.getITEM_NAME()) || "收缩压".equals(vitalRecord.getITEM_NAME())
                        || "舒张压".equals(vitalRecord.getITEM_NAME()) || "身高".equals(vitalRecord.getITEM_NAME())
                        || "体重".equals(vitalRecord.getITEM_NAME())) {
                    String datekey = format.format(vitalRecord.getEXAM_TIME());
                    List<VITAL_RECORD> records = recordMap.get(datekey);
                    if (records != null) {
                        records.add(vitalRecord);
                    } else {
                        List<VITAL_RECORD> recordsnewList = new ArrayList<>();
                        recordsnewList.add(vitalRecord);
                        recordMap.put(datekey, recordsnewList);
                    }
                }

            }

            Set<String> keySet = recordMap.keySet();

            Iterator<String> it = keySet.iterator();
            while (it.hasNext()) {
                log.info("保存患者一般信息" + zj_VITAL_RECORD.get(0).getUNIQUE_ID());
                String mapkey = it.next();
                List<VITAL_RECORD> recordList = recordMap.get(mapkey);
                PersonGeneral personGeneral = new PersonGeneral();
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

                for (VITAL_RECORD vital_record : recordList) {
                    if (vital_record.getITEM_NAME().contains("呼吸") && vital_record.getEXAM_RESULT() != null) {
                        //呼吸
                        personGeneral.setBreathingFrequency(Double.valueOf(vital_record.getEXAM_RESULT()));
                    }
                    if (vital_record.getITEM_NAME().contains("脉搏") && vital_record.getEXAM_RESULT() != null) {
                        //脉搏
                        personGeneral.setHeartRate(Double.valueOf(vital_record.getEXAM_RESULT()));
                    }
                    if (vital_record.getITEM_NAME().contains("体温") && vital_record.getEXAM_RESULT() != null) {
                        //体温
                        personGeneral.setBodyTemperature(Double.valueOf(vital_record.getEXAM_RESULT()));
                    }
                    if (vital_record.getITEM_NAME().contains("收缩压") && vital_record.getEXAM_RESULT() != null) {
                        //收缩压
                        personGeneral.setSystolicBloodPressure(Double.valueOf(vital_record.getEXAM_RESULT()));
                    }
                    if (vital_record.getITEM_NAME().contains("舒张压") && vital_record.getEXAM_RESULT() != null) {
                        //舒张压
                        personGeneral.setDiastolicBloodPressure(Double.valueOf(vital_record.getEXAM_RESULT()));
                    }
                    if (vital_record.getITEM_NAME().contains("身高") && vital_record.getEXAM_RESULT() != null) {
                        //身高
                        personGeneral.setHeight(Double.valueOf(vital_record.getEXAM_RESULT()));
                    }
                    if (vital_record.getITEM_NAME().contains("体重") && vital_record.getEXAM_RESULT() != null) {
                        //体重
                        personGeneral.setWeight(Double.valueOf(vital_record.getEXAM_RESULT()));
                    }

                }


                personGeneralService.savePersonGeneral(personGeneral);


            }

        }


    }

    public void saveInspection(List<LIS_RECORD>  zj_LIS_RECORD){
        Inspection inspection;
        for(LIS_RECORD lisRecord:zj_LIS_RECORD){
            inspection = new Inspection();
            //标识患者身份唯一标识
            inspection.setPersonId(lisRecord.getUNIQUE_ID_LV1());
            //唯一标识
            inspection.setUniqueId(lisRecord.getUNIQUE_ID_LV2());
            //医疗机构代码
            inspection.setP900(lisRecord.getP900());
            //患者id
            inspection.setPatientId(lisRecord.getPATIENT_ID());
            //就诊类型
            inspection.setVisitType(lisRecord.getVISIT_TYPE());
            //门诊/住院号
            inspection.setVisitId(lisRecord.getVISIT_ID());
            //住院次数
            inspection.setAdmissionNumber(lisRecord.getADMISSION_NUMBER());
            //检验系统编号
            inspection.setTestNo(lisRecord.getTEST_NO());
            //标本类型
            inspection.setSpcmType(lisRecord.getSPCM_TYPE());
            //标本采样时间
            inspection.setSpcmSampleDateTime(lisRecord.getSPCM_SAMPLE_DATE_TIME());
            //标本接收时间
            inspection.setSpcmReceivedDateTime(lisRecord.getSPCM_RECEIVED_DATE_TIME());
            //申请时间
            inspection.setRequestedDateTime(lisRecord.getREQUESTED_DATE_TIME());
            //报告时间
            inspection.setResultRptDateTime(lisRecord.getRESULT_RPT_DATE_TIME());
            //检查时间
            inspection.setResultDateTime(lisRecord.getRESULT_DATE_TIME());
            //打印序号
            inspection.setPrintOrder(lisRecord.getPRINT_ORDER());
            //检验套餐名称
            inspection.setTestPackageName(lisRecord.getTEST_PACKAGE_NAME());
            //检验项目名称
            inspection.setTestItemName(lisRecord.getTEST_ITEM_NAME());
            //检验结果值
            inspection.setResult(lisRecord.getRESULT());
            //检验结果单位
            inspection.setUnits(lisRecord.getUNITS());
            //异常标识
            inspection.setAbnormalIndicator(lisRecord.getABNORMAL_INDICATOR());
            //参考区间
            inspection.setReferenceInterval(lisRecord.getREFERENCE_INTERVAL());
            /*//数据版本
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
            log.info("检验信息导入，UNIQUE_ID_LV1="+lisRecord.getUNIQUE_ID_LV1());
            inspectionService.saveInspection(inspection);
        }

    }

    public void saveChemotherapy(List<TEM_CHEMOTHERAPY> zj_TEM_CHEMOTHERAPY){
        Chemotherapy chemotherapy;
        for(TEM_CHEMOTHERAPY temChemotherapy:zj_TEM_CHEMOTHERAPY){
            chemotherapy = new Chemotherapy();
            //标识患者身份唯一标识
            chemotherapy.setPersonId(temChemotherapy.getunique_id_lv1());
            //唯一标识
            chemotherapy.setUniqueId(temChemotherapy.getunique_id_lv2());
            //医疗机构代码
            chemotherapy.setP900(temChemotherapy.getp900());
            //患者id
            chemotherapy.setPatientId(temChemotherapy.getpatient_id());
            //住院号
            chemotherapy.setVisitId(temChemotherapy.getvisit_id());
            //化疗的unque_id
            chemotherapy.setUniqueIdLv3(temChemotherapy.getunique_id());
            //活动记录状态
            chemotherapy.setRecordStatus(temChemotherapy.getrecord_status());
            //化疗开始时间
            chemotherapy.setChemBeginTime(temChemotherapy.getchem_begin_time());
            //化疗结束时间
            chemotherapy.setChemEndTime(temChemotherapy.getchem_end_time());
            //化疗周期计数
            chemotherapy.setChemPeriod(temChemotherapy.getchem_period());
            //化疗周期总数
            chemotherapy.setChemPeriodTotal(temChemotherapy.getchem_period_total());
            //化疗药物及剂量
            chemotherapy.setChemDrugAndDose(temChemotherapy.getchem_drug_and_dose());
            //化疗目的
            chemotherapy.setPurpose(temChemotherapy.getpurpose());
            //疗效评估
            chemotherapy.setEfficacyEvaluation(temChemotherapy.getefficacy_evaluation());
            //副反应
            chemotherapy.setSideEffect(temChemotherapy.getside_effect());
            //责任医生
            chemotherapy.setChemoDoctor(temChemotherapy.getchemo_doctor());
            // 化疗药物表
            ChemotherapyDrug chemotherapyDrug = new ChemotherapyDrug();
            //标识患者身份唯一标识
            chemotherapyDrug.setPersonId(temChemotherapy.getunique_id_lv1());
            //唯一标识
            chemotherapyDrug.setUniqueId(temChemotherapy.getunique_id_lv2());
            //医疗机构代码
            chemotherapyDrug.setP900(temChemotherapy.getp900());
            //患者id
            chemotherapyDrug.setPatientId(temChemotherapy.getpatient_id());
            //住院号
            chemotherapyDrug.setVisitId(temChemotherapy.getvisit_id());
            //化疗的unque_id
            chemotherapyDrug.setUniqueIdLv3(temChemotherapy.getunique_id());
//            //数据版本
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
            if(StringUtils.isNotEmpty(temChemotherapy.getchem_drug_1())){
                //化疗药物
                chemotherapyDrug.setChemDrug(temChemotherapy.getchem_drug_1());
                //化疗药品单次用药剂量
                chemotherapyDrug.setChemSingleDose(temChemotherapy.getchem_single_dose_1());
                //化疗药品单次用药剂量单位
                chemotherapyDrug.setChemSingleDoseUnit(temChemotherapy.getchem_single_dose_unit_1());
                //化疗药品用药频次
                chemotherapyDrug.setChemFrequency(temChemotherapy.getchem_frequency_1());
                log.info("化疗药物导入1，UNIQUE_ID_LV1="+temChemotherapy.getunique_id_lv1());
                chemotherapyDrugService.saveChemotherapyDrug(chemotherapyDrug);
            }
            if(StringUtils.isNotEmpty(temChemotherapy.getchem_drug_2())){
                //化疗药物
                chemotherapyDrug.setChemDrug(temChemotherapy.getchem_drug_2());
                //化疗药品单次用药剂量
                chemotherapyDrug.setChemSingleDose(temChemotherapy.getchem_single_dose_2());
                //化疗药品单次用药剂量单位
                chemotherapyDrug.setChemSingleDoseUnit(temChemotherapy.getchem_single_dose_unit_2());
                //化疗药品用药频次
                chemotherapyDrug.setChemFrequency(temChemotherapy.getchem_frequency_2());
                log.info("化疗药物导入2，UNIQUE_ID_LV1="+temChemotherapy.getunique_id_lv1());
                chemotherapyDrugService.saveChemotherapyDrug(chemotherapyDrug);
            }
            if(StringUtils.isNotEmpty(temChemotherapy.getchem_drug_3())){
                //化疗药物
                chemotherapyDrug.setChemDrug(temChemotherapy.getchem_drug_3());
                //化疗药品单次用药剂量
                chemotherapyDrug.setChemSingleDose(temChemotherapy.getchem_single_dose_3());
                //化疗药品单次用药剂量单位
                chemotherapyDrug.setChemSingleDoseUnit(temChemotherapy.getchem_single_dose_unit_3());
                //化疗药品用药频次
                chemotherapyDrug.setChemFrequency(temChemotherapy.getchem_frequency_3());
                log.info("化疗药物导入3，UNIQUE_ID_LV1="+temChemotherapy.getunique_id_lv1());
                chemotherapyDrugService.saveChemotherapyDrug(chemotherapyDrug);
            }
            if(StringUtils.isNotEmpty(temChemotherapy.getchem_drug_4())){
                //化疗药物
                chemotherapyDrug.setChemDrug(temChemotherapy.getchem_drug_4());
                //化疗药品单次用药剂量
                chemotherapyDrug.setChemSingleDose(temChemotherapy.getchem_single_dose_4());
                //化疗药品单次用药剂量单位
                chemotherapyDrug.setChemSingleDoseUnit(temChemotherapy.getchem_single_dose_unit_4());
                //化疗药品用药频次
                chemotherapyDrug.setChemFrequency(temChemotherapy.getchem_frequency_4());
                log.info("化疗药物导入4，UNIQUE_ID_LV1="+temChemotherapy.getunique_id_lv1());
                chemotherapyDrugService.saveChemotherapyDrug(chemotherapyDrug);
            }
            if(StringUtils.isNotEmpty(temChemotherapy.getchem_drug_5())){
                //化疗药物
                chemotherapyDrug.setChemDrug(temChemotherapy.getchem_drug_5());
                //化疗药品单次用药剂量
                chemotherapyDrug.setChemSingleDose(temChemotherapy.getchem_single_dose_5());
                //化疗药品单次用药剂量单位
                chemotherapyDrug.setChemSingleDoseUnit(temChemotherapy.getchem_single_dose_unit_5());
                //化疗药品用药频次
                chemotherapyDrug.setChemFrequency(temChemotherapy.getchem_frequency_5());
                log.info("化疗药物导入5，UNIQUE_ID_LV1="+temChemotherapy.getunique_id_lv1());
                chemotherapyDrugService.saveChemotherapyDrug(chemotherapyDrug);
            }


//            //数据版本
//            chemotherapy.setDataVersion();
//            //数据库来源
//            chemotherapy.setDataDbSource();
//            //数据表来源
//            chemotherapy.setDataTableSource();
//            //数据项来源
//            chemotherapy.setDataFieldSource();
//            //创建时间
//            chemotherapy.setCreatedAt();
//            //创建人
//            chemotherapy.setCreator();
//            //修改时间
//            chemotherapy.setUpdatedAt();
            log.info("化疗导入，UNIQUE_ID_LV1="+temChemotherapy.getunique_id_lv1());
            chemotherapyService.saveChemotherapy(chemotherapy);
        }

    }

    public void saveRadiotherapy(List<TEM_RADIOTHERAPY>  zj_TEM_RADIOTHERAPY){
        Radiotherapy radiotherapy;
        for(TEM_RADIOTHERAPY temRadiotherapy : zj_TEM_RADIOTHERAPY){
            radiotherapy = new Radiotherapy();
            //标识患者身份唯一标识
            radiotherapy.setPersonId(temRadiotherapy.getunique_id_lv1());
            //唯一标识
            radiotherapy.setUniqueId(temRadiotherapy.getunique_id_lv2());
            //医疗机构代码
            radiotherapy.setP900(temRadiotherapy.getp900());
            //患者id
            radiotherapy.setPatientId(temRadiotherapy.getpatient_id());
            //住院号
            radiotherapy.setVisitId(temRadiotherapy.getvisit_id());
            //放疗开始日期
            radiotherapy.setRadioBeginTime(temRadiotherapy.getradio_begin_time());
            //放疗结束日期
            radiotherapy.setRadioEndTime(temRadiotherapy.getradio_end_time());
            //放射源
            radiotherapy.setRadioSource(temRadiotherapy.getradio_source());
            //放疗模式
            radiotherapy.setRadioStyle(temRadiotherapy.getradio_style());
            //放疗射线能量
            radiotherapy.setRadioRayEnergy(temRadiotherapy.getradio_ray_energy());
            //放疗部位及剂量
            radiotherapy.setRadioSiteAndDose(temRadiotherapy.getradio_site_and_dose());
            //放疗副反应与分级
            radiotherapy.setRadioLevel(temRadiotherapy.getradio_level());
            //责任医生
            radiotherapy.setRadioDoctor(temRadiotherapy.getradio_doctor());
            //疗效评估
            radiotherapy.setEfficacyEvaluation(temRadiotherapy.getefficacy_evaluation());
            /**
             * 放疗部位表
             */
            RadiotherapySite radiotherapySite = new RadiotherapySite();
            //标识患者身份唯一标识
            radiotherapySite.setPersonId(temRadiotherapy.getunique_id_lv1());
            //唯一标识
            radiotherapySite.setUniqueId(temRadiotherapy.getunique_id_lv2());
            //医疗机构代码
            radiotherapySite.setP900(temRadiotherapy.getp900());
            //患者id
            radiotherapySite.setPatientId(temRadiotherapy.getpatient_id());
            //住院号
            radiotherapySite.setVisitId(temRadiotherapy.getvisit_id());
            //放疗表对应unique_id的外键
            radiotherapySite.setUniqueIdLv3(temRadiotherapy.getunique_id());
            //数据版本
//            radiotherapySite.setDataVersion();
//            //数据库来源
//            radiotherapySite.setDataDbSource();
//            //数据表来源
//            radiotherapySite.setDataTableSource();
//            //数据项来源
//            radiotherapySite.setDataFieldSource();
//            //创建时间
//            radiotherapySite.setCreatedAt();
//            //创建人
//            radiotherapySite.setCreator();
//            //修改时间
//            radiotherapySite.setUpdatedAt();
            if(StringUtils.isNotEmpty(temRadiotherapy.getradio_site_1())){
                //照射部位
                radiotherapySite.setRadioSite(temRadiotherapy.getradio_site_1());
                //放疗总剂量
                radiotherapySite.setRadioTotal(temRadiotherapy.getradio_total_1());
                log.info("放疗部位导入1，UNIQUE_ID_LV1="+temRadiotherapy.getunique_id_lv1());
                radiotherapySiteService.saveRadiotherapySite(radiotherapySite);
            }
            if(StringUtils.isNotEmpty(temRadiotherapy.getradio_site_2())){
                //照射部位
                radiotherapySite.setRadioSite(temRadiotherapy.getradio_site_2());
                //放疗总剂量
                radiotherapySite.setRadioTotal(temRadiotherapy.getradio_total_2());
                log.info("放疗部位导入2，UNIQUE_ID_LV1="+temRadiotherapy.getunique_id_lv1());
                radiotherapySiteService.saveRadiotherapySite(radiotherapySite);
            }
            if(StringUtils.isNotEmpty(temRadiotherapy.getradio_site_3())){
                //照射部位
                radiotherapySite.setRadioSite(temRadiotherapy.getradio_site_3());
                //放疗总剂量
                radiotherapySite.setRadioTotal(temRadiotherapy.getradio_total_3());
                log.info("放疗部位导入3，UNIQUE_ID_LV1="+temRadiotherapy.getunique_id_lv1());
                radiotherapySiteService.saveRadiotherapySite(radiotherapySite);
            }
//            //数据版本
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
            log.info("放疗导入，UNIQUE_ID_LV1="+temRadiotherapy.getunique_id_lv1());
            radiotherapyService.saveRadiotherapy(radiotherapy);
        }

    }

    public void saveFollowUp(List<FOLLOW_UP> zj_FOLLOW_UP) {
        FollowUp followUp;
        for (FOLLOW_UP follow : zj_FOLLOW_UP) {
            followUp = new FollowUp();
            //主键id
            followUp.setPersonId(follow.getUNIQUE_ID_LV1());
            //唯一标识
            followUp.setUniqueId(follow.getUNIQUE_ID_LV2());
            //医疗机构代码
            followUp.setP900(follow.getP900());
            //患者id
            followUp.setPatientId(follow.getPATIENT_ID());
            //随访方式
            followUp.setFollowUpType(follow.getFOLLOW_METHOD());
            //随访日期
            followUp.setFollowUpDate(follow.getFOLLOWUP_TIME());
            //疾病状态
            followUp.setFollowUpState(follow.getTUMOUR_STA());
            //生存情况
            followUp.setSituation(follow.getFOLLOWUP_STATUS());
            //本次随访是否予以药物治疗
//            followUp.setIfMedicine();
//            //药物名称
//            followUp.setMedicineName();
//            //用药剂量
//            followUp.setMedicineDose();
//            //用药持续时间
//            followUp.setMedicineDuration();
            //死亡原因
            followUp.setDeathCause(follow.getCAUSE_OF_DEATH());
            //死亡日期
            followUp.setDeathDate(follow.getDATE_OF_DEATH());
            //末次随访日期
            followUp.setLastDate(follow.getLAST_CONTACT_DATE());
            //随访检查项目
//            followUp.setFollowItem();
//            //疗效评估（与前面的影像比较）
//            followUp.setEfficacyEvaluation();
//            //数据版本
//            followUp.setDataVersion();
//            //数据库来源
//            followUp.setDataDbSource();
//            //数据表来源
//            followUp.setDataTableSource();
//            //数据项来源
//            followUp.setDataFieldSource();
//            //创建时间
//            followUp.setCreatedAt();
//            //创建人
//            followUp.setCreator();
//            //修改时间
//            followUp.setUpdatedAt();
            log.info("随访导入，UNIQUE_ID_LV1="+follow.getUNIQUE_ID_LV1());
            followUpService.saveFollowUp(followUp);
        }

    }

    public void saveHisVitalSign() {
        HisVitalSign hisVitalSign = new HisVitalSign();
        //标识患者身份唯一标识
        hisVitalSign.setPersonId();
        //唯一标识
        hisVitalSign.setUniqueId();
        //医疗机构代码
        hisVitalSign.setP900();
        //患者id
        hisVitalSign.setPatientId();
        //住院号
        hisVitalSign.setVisitId();
        //肥胖
        hisVitalSign.setFat();
        //体表面积
        hisVitalSign.setBodyarea();
        //KPS评分
        hisVitalSign.setTKps();
        //ECOG评分
        hisVitalSign.setTEcogWhops();
        //数据版本
        hisVitalSign.setDataVersion();
        //数据库来源
        hisVitalSign.setDataDbSource();
        //数据表来源
        hisVitalSign.setDataTableSource();
        //数据项来源
        hisVitalSign.setDataFieldSource();
        //创建时间
        hisVitalSign.setCreatedAt();
        //创建人
        hisVitalSign.setCreator();
        //修改时间
        hisVitalSign.setUpdatedAt();
        hisVitalSignService.saveHisVitalSign(hisVitalSign);
    }

    public void saveHisPerson() {
        HisPerson hisPerson = new HisPerson();
        //标识患者身份唯一标识
        hisPerson.setPersonId();
        //唯一标识
        hisPerson.setUniqueId();
        //医疗机构代码
        hisPerson.setP900();
        //患者id
        hisPerson.setPatientId();
        //住院号
        hisPerson.setVisitId();
        //吸烟
        hisPerson.setSmoke();
        //吸烟年限
        hisPerson.setSmokeYear();
        //吸烟量
        hisPerson.setDailySmoke();
        //戒烟
        hisPerson.setStopSmoke();
        //戒烟年限
        hisPerson.setStopSmokeYear();
        //饮酒
        hisPerson.setDrink();
        //饮酒年限
        hisPerson.setDrinkYear();
        //饮酒量
        hisPerson.setDailyDrink();
        //戒酒
        hisPerson.setStopDrink();
        //戒酒年限
        hisPerson.setStopDrinkYear();
        //数据版本
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
        hisPerson.setCreator();
        //修改时间
        hisPerson.setUpdatedAt();
        hisPersonService.saveHisPerson(hisPerson);
    }

    public void saveHisFamily() {
        HisFamily hisFamily = new HisFamily();
        //标识患者身份唯一标识
        hisFamily.setPersonId();
        //唯一标识
        hisFamily.setUniqueId();
        //医疗机构代码
        hisFamily.setP900();
        //患者id
        hisFamily.setPatientId();
        //住院号
        hisFamily.setVisitId();
        //肿瘤家族史
        hisFamily.setFamilyTumour();
        //肿瘤血缘亲属与患者的关系
        hisFamily.setTumourRelative();
        //肿瘤血缘亲属肿瘤疾病名称
        hisFamily.setRelativeTumourName();
        //心脑血管疾病家族史
        hisFamily.setFamilyCcvd();
        //血缘亲属与患者的关系
        hisFamily.setCcvdRelative();
        //血缘亲属患心脑血管疾病名称
        hisFamily.setRelativeCcvdName();
        //数据版本
        hisFamily.setDataVersion();
        //数据库来源
        hisFamily.setDataDbSource();
        //数据表来源
        hisFamily.setDataTableSource();
        //数据项来源
        hisFamily.setDataFieldSource();
        //创建时间
        hisFamily.setCreatedAt();
        //创建人
        hisFamily.setCreator();
        //修改时间
        hisFamily.setUpdatedAt();
        hisFamilyService.saveHisFamily(hisFamily);
    }

    public void saveHisPast() {
        HisPast hisPast = new HisPast();
        //标识患者身份唯一标识
        hisPast.setPersonId();
        //唯一标识
        hisPast.setUniqueId();
        //医疗机构代码
        hisPast.setP900();
        //患者id
        hisPast.setPatientId();
        //住院号
        hisPast.setVisitId();
        //高血压
        hisPast.setHypertension();
        //高血压用药史
        hisPast.setHypertensionDrug();
        //糖尿病
        hisPast.setGlycuresis();
        //糖尿病用药史
        hisPast.setGlycuresisDrug();
        //慢性阻塞性肺病
        hisPast.setCopd();
        //甲状腺疾病
        hisPast.setThyroid();
        //心脏病
        hisPast.setHeartDisease();
        //心脏病用药史
        hisPast.setHeartDiseaseDrug();
        //慢性贫血
        hisPast.setChronicAnemia();
        //风湿热病史
        hisPast.setRheumaticFever();
        //血脂异常
        hisPast.setBloodFat();
        //血脂异常用药史
        hisPast.setBloodFatDrug();
        //慢性肾脏病
        hisPast.setChronicKidney();
        //乙肝
        hisPast.setHepatitisB();
        //乙肝是用药史
        hisPast.setHepatitisBDrug();
        //丙肝
        hisPast.setHcv();
        //丙肝用药史
        hisPast.setHcvDrug();
        //结核
        hisPast.setTuberculosis();
        //结核用药史
        hisPast.setTuberculosisDrug();
        //HIV感染病史
        hisPast.setHiv();
        //抗HIV治疗史
        hisPast.setHivTreatment();
        //其它乳腺良性疾病
        hisPast.setBreastDiseases();
        //风湿免疫系统疾病
        hisPast.setRheumaticDiseases();
        //曾有精神创伤史
        hisPast.setTrauma();
        //数据版本
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
        hisPast.setCreator();
        //修改时间
        hisPast.setUpdatedAt();
        hisPastService.saveHisPast(hisPast);
    }

    public void saveHisMarriage() {
        HisMarriage hisMarriage = new HisMarriage();
        //标识患者身份唯一标识
        hisMarriage.setPersonId();
        //唯一标识
        hisMarriage.setUniqueId();
        //医疗机构代码
        hisMarriage.setP900();
        //患者id
        hisMarriage.setPatientId();
        //住院号
        hisMarriage.setVisitId();
        //月经来潮年龄
        hisMarriage.setMenstrualAge();
        //月经出血量
        hisMarriage.setMenstrualBleeding();
        //月经周期
        hisMarriage.setMenstrualCycle();
        //月经规律
        hisMarriage.setMenstrualRegularity();
        //口服避孕药
        hisMarriage.setOralContraceptives();
        //怀孕次数
        hisMarriage.setPregnanciesNumber();
        //早产次数
        hisMarriage.setPrematureBirthNumber();
        //流产次数
        hisMarriage.setAbortionsNumber();
        //正常生育次数
        hisMarriage.setNormalBirthNumber();
        //生产次数
        hisMarriage.setProductionTimes();
        //试管婴儿史
        hisMarriage.setIvf();
        //具体生育史
        hisMarriage.setBirthHistory();
        //停经、绝经
        hisMarriage.setMenopause();
        //末次月经
        hisMarriage.setLastMenstruation();
        //停经、绝经年龄
        hisMarriage.setMenopauseAge();
        //结婚年龄
        hisMarriage.setMarriageAge();
        //性生活开始年龄
        hisMarriage.setSexBegin();
        //性伴侣个数
        hisMarriage.setSexualPartners();
        //宫颈癌疫苗
        hisMarriage.setCervicalCancerVaccine();
        //宫颈癌疫苗名称
        hisMarriage.setVaccineName();
        //宫颈癌疫苗接种时间
        hisMarriage.setVaccineTime();
        //数据版本
        hisMarriage.setDataVersion();
        //数据库来源
        hisMarriage.setDataDbSource();
        //数据表来源
        hisMarriage.setDataTableSource();
        //数据项来源
        hisMarriage.setDataFieldSource();
        //创建时间
        hisMarriage.setCreatedAt();
        //创建人
        hisMarriage.setCreator();
        //修改时间
        hisMarriage.setUpdatedAt();
        hisMarriageService.saveHisMarriage(hisMarriage);
    }

    public void saveSymptom() {
        Symptom symptom = new Symptom();
        //标识患者身份唯一标识
        symptom.setPersonId();
        //唯一标识
        symptom.setUniqueId();
        //医疗机构代码
        symptom.setP900();
        //患者id
        symptom.setPatientId();
        //门诊/住院号
        symptom.setVisitId();
        //心力衰竭症状
        symptom.setHeartFailure();
        //宫颈癌临床表现
        symptom.setClinicalManifestation();
        //宫颈癌体征
        symptom.setSymptoms();
        //数据版本
        symptom.setDataVersion();
        //数据库来源
        symptom.setDataDbSource();
        //数据表来源
        symptom.setDataTableSource();
        //数据项来源
        symptom.setDataFieldSource();
        //创建时间
        symptom.setCreatedAt();
        //创建人
        symptom.setCreator();
        //修改时间
        symptom.setUpdatedAt();
        symptomService.saveSymptom(symptom);
    }

    public void saveDiagnosis() {
        Diagnosis diagnosis = new Diagnosis();
        //标识患者身份唯一标识
        diagnosis.setPersonId();
        //唯一标识
        diagnosis.setUniqueId();
        //医疗机构代码
        diagnosis.setP900();
        //患者id
        diagnosis.setPatientId();
        //住院门诊号
        diagnosis.setVisitId();
        //诊断日期
        diagnosis.setDiagnosisDate();
        //诊断名称
        diagnosis.setDiagnosisName();
        //诊断类型
        diagnosis.setDiagnosisType();
        //出现转移
        diagnosis.setIfTransfer();
        //转移部位
        diagnosis.setTransferPosition();
        //复发
        diagnosis.setIfRecrudescence();
        //复发形式
        diagnosis.setRecrudescenceType();
        //复发或转移时间
        diagnosis.setRecrudescenceDate();
        //数据版本
        diagnosis.setDataVersion();
        //数据库来源
        diagnosis.setDataDbSource();
        //数据表来源
        diagnosis.setDataTableSource();
        //数据项来源
        diagnosis.setDataFieldSource();
        //创建时间
        diagnosis.setCreatedAt();
        //创建人
        diagnosis.setCreator();
        //修改时间
        diagnosis.setUpdatedAt();
        diagnosisService.saveDiagnosis(diagnosis);
    }

    public void saveDiagnosisStage() {
        DiagnosisStage diagnosisStage = new DiagnosisStage();
        //标识患者身份唯一标识
        diagnosisStage.setPersonId();
        //唯一标识
        diagnosisStage.setUniqueId();
        //医疗机构代码
        diagnosisStage.setP900();
        //患者id
        diagnosisStage.setPatientId();
        //住院门诊号
        diagnosisStage.setVisitId();
        //TNM分期所属诊断名称
        diagnosisStage.setDiagnosisStageName();
        //T分期
        diagnosisStage.setTStage();
        //N分期
        diagnosisStage.setNStage();
        //M分期
        diagnosisStage.setMStage();
        //TNM综合分期
        diagnosisStage.setTnmStage();
        //数据版本
        diagnosisStage.setDataVersion();
        //数据库来源
        diagnosisStage.setDataDbSource();
        //数据表来源
        diagnosisStage.setDataTableSource();
        //数据项来源
        diagnosisStage.setDataFieldSource();
        //创建时间
        diagnosisStage.setCreatedAt();
        //创建人
        diagnosisStage.setCreator();
        //修改时间
        diagnosisStage.setUpdatedAt();
        diagnosisStageService.saveDiagnosisStage(diagnosisStage);
    }

    public void saveHeartFailure() {
        HeartFailure heartFailure = new HeartFailure();
        //标识患者身份唯一标识
        heartFailure.setPersonId();
        //唯一标识
        heartFailure.setUniqueId();
        //医疗机构代码
        heartFailure.setP900();
        //患者id
        heartFailure.setPatientId();
        //住院门诊号
        heartFailure.setVisitId();
        //分级时间
        heartFailure.setGradeDate();
        //心衰
        heartFailure.setIfHeartFailure();
        //分级
        heartFailure.setGrade();
        //数据版本
        heartFailure.setDataVersion();
        //数据库来源
        heartFailure.setDataDbSource();
        //数据表来源
        heartFailure.setDataTableSource();
        //数据项来源
        heartFailure.setDataFieldSource();
        //创建时间
        heartFailure.setCreatedAt();
        //创建人
        heartFailure.setCreator();
        //修改时间
        heartFailure.setUpdatedAt();
        heartFailureService.saveHeartFailure(heartFailure);
    }

    public void saveHypertension() {
        Hypertension hypertension = new Hypertension();
        //标识患者身份唯一标识
        hypertension.setPersonId();
        //唯一标识
        hypertension.setUniqueId();
        //医疗机构代码
        hypertension.setP900();
        //患者id
        hypertension.setPatientId();
        //住院门诊号
        hypertension.setVisitId();
        //分级时间
        hypertension.setGradeDate();
        //高血压
        hypertension.setIfHypertension();
        //分级
        hypertension.setGrade();
        //分层
        hypertension.setLayer();
        //数据版本
        hypertension.setDataVersion();
        //数据库来源
        hypertension.setDataDbSource();
        //数据表来源
        hypertension.setDataTableSource();
        //数据项来源
        hypertension.setDataFieldSource();
        //创建时间
        hypertension.setCreatedAt();
        //创建人
        hypertension.setCreator();
        //修改时间
        hypertension.setUpdatedAt();
        hypertensionService.saveHypertension(hypertension);
    }

    public void saveCervicalSmearCytology() {
        CervicalSmearCytology cervicalSmearCytology = new CervicalSmearCytology();
        //标识患者身份唯一标识
        cervicalSmearCytology.setPersonId();
        //唯一标识
        cervicalSmearCytology.setUniqueId();
        //医疗机构代码
        cervicalSmearCytology.setP900();
        //患者id
        cervicalSmearCytology.setPatientId();
        //就诊标识住院号
        cervicalSmearCytology.setVisitId();
        //送检日期
        cervicalSmearCytology.setInspectionDate();
        //报告日期
        cervicalSmearCytology.setReportDate();
        //TBS诊断
        cervicalSmearCytology.setTbsDiagnosis();
        //对涂片的满意程度
        cervicalSmearCytology.setSmear();
        //形态学似人乳头状瘤病毒感染
        cervicalSmearCytology.setPapillomavirus();
        //形态学似单纯疱疹病毒感染
        cervicalSmearCytology.setSimplexVirus();
        //形态学似嗜血杆菌感染
        cervicalSmearCytology.setHaemophilus();
        //形态学似放射菌感染
        cervicalSmearCytology.setActinobacteria();
        //滴虫感染
        cervicalSmearCytology.setTrichomonas();
        //霉菌性感染
        cervicalSmearCytology.setMycotic();
        //衣原体
        cervicalSmearCytology.setChlamydia();
        //霉菌
        cervicalSmearCytology.setMould();
        //滴虫
        cervicalSmearCytology.setTrichomonad();
        //雌激素水平的评估
        cervicalSmearCytology.setEstrogen();
        //巴氏分级
        cervicalSmearCytology.setPasteurization();
        //数据版本
        cervicalSmearCytology.setDataVersion();
        //数据库来源
        cervicalSmearCytology.setDataDbSource();
        //数据表来源
        cervicalSmearCytology.setDataTableSource();
        //数据项来源
        cervicalSmearCytology.setDataFieldSource();
        //创建时间
        cervicalSmearCytology.setCreatedAt();
        //创建人
        cervicalSmearCytology.setCreator();
        //修改时间
        cervicalSmearCytology.setUpdatedAt();
        cervicalSmearCytologyService.saveCervicalSmearCytology(cervicalSmearCytology);
    }

    public void saveLayerCellDetection() {
        LayerCellDetection layerCellDetection = new LayerCellDetection();
        //标识患者身份唯一标识
        layerCellDetection.setPersonId();
        //唯一标识
        layerCellDetection.setUniqueId();
        //医疗机构代码
        layerCellDetection.setP900();
        //患者id
        layerCellDetection.setPatientId();
        //就诊标识住院号
        layerCellDetection.setVisitId();
        //送检日期
        layerCellDetection.setInspectionDate();
        //报告日期
        layerCellDetection.setReportDate();
        //TBS诊断
        layerCellDetection.setTbsDiagnosis();
        //对涂片的满意程度
        layerCellDetection.setSmear();
        //形态学似人乳头状瘤病毒感染
        layerCellDetection.setPapillomavirus();
        //形态学似单纯疱疹病毒感染
        layerCellDetection.setSimplexVirus();
        //形态学似嗜血杆菌感染
        layerCellDetection.setHaemophilus();
        //形态学似放射菌感染
        layerCellDetection.setActinobacteria();
        //滴虫感染
        layerCellDetection.setTrichomonas();
        //霉菌性感染
        layerCellDetection.setMycotic();
        //衣原体
        layerCellDetection.setChlamydia();
        //霉菌
        layerCellDetection.setMould();
        //滴虫
        layerCellDetection.setTrichomonad();
        //雌激素水平的评估
        layerCellDetection.setEstrogen();
        //巴氏分级
        layerCellDetection.setPasteurization();
        //数据版本
        layerCellDetection.setDataVersion();
        //数据库来源
        layerCellDetection.setDataDbSource();
        //数据表来源
        layerCellDetection.setDataTableSource();
        //数据项来源
        layerCellDetection.setDataFieldSource();
        //创建时间
        layerCellDetection.setCreatedAt();
        //创建人
        layerCellDetection.setCreator();
        //修改时间
        layerCellDetection.setUpdatedAt();
        layerCellDetectionService.saveLayerCellDetection(layerCellDetection);
    }

    public void saveExamination() {
        Examination examination = new Examination();
        //标识患者身份唯一标识
        examination.setPersonId();
        //唯一标识
        examination.setUniqueId();
        //医疗机构代码
        examination.setP900();
        //患者id
        examination.setPatientId();
        //住院号
        examination.setVisitId();
        //检查项目
        examination.setInspectName();
        //身体部位
        examination.setBody();
        //检查方式
        examination.setWay();
        //检查号
        examination.setInspectNo();
        //检查日期
        examination.setInspectDate();
        //报告日期
        examination.setReprotDate();
        //检查描述原文
        examination.setFinding();
        //检查结论原文
        examination.setResult();
        //转移
        examination.setIfTransfer();
        //检查描述-肿块部位
        examination.setFindSite();
        //检查描述-肿块数目
        examination.setFindNumber();
        //检查描述-肿块大小
        examination.setFindSize();
        //检查结论-肿块部位
        examination.setResultSite();
        //检查结论-肿块数目
        examination.setResultNumber();
        //检查结论-肿块大小
        examination.setResultSize();
        //数据版本
        examination.setDataVersion();
        //数据库来源
        examination.setDataDbSource();
        //数据表来源
        examination.setDataTableSource();
        //数据项来源
        examination.setDataFieldSource();
        //创建时间
        examination.setCreatedAt();
        //创建人
        examination.setCreator();
        //修改时间
        examination.setUpdatedAt();
        examinationService.saveExamination(examination);
    }

    public void saveOperationRecord() {
        OperationRecord operationRecord = new OperationRecord();
        //标识患者身份唯一标识
        operationRecord.setPersonId();
        //唯一标识
        operationRecord.setUniqueId();
        //医疗机构代码
        operationRecord.setP900();
        //患者id
        operationRecord.setPatientId();
        //住院号
        operationRecord.setVisitId();
        //手术入路
        operationRecord.setRoute();
        //手术名称
        operationRecord.setOperationName();
        //淋巴结清扫
        operationRecord.setLnd();
        //术中出血量
        operationRecord.setMabl();
        //手术开始时间
        operationRecord.setStartTime();
        //手术结束时间
        operationRecord.setEndTime();
        //手术记录
        operationRecord.setRecord();
        //数据版本
        operationRecord.setDataVersion();
        //数据库来源
        operationRecord.setDataDbSource();
        //数据表来源
        operationRecord.setDataTableSource();
        //数据项来源
        operationRecord.setDataFieldSource();
        //创建时间
        operationRecord.setCreatedAt();
        //创建人
        operationRecord.setCreator();
        //修改时间
        operationRecord.setUpdatedAt();
        operationRecordService.saveOperationRecord(operationRecord);
    }

    public void savePathological() {
        Pathological pathological = new Pathological();
        //标识患者身份唯一标识
        pathological.setPersonId();
        //唯一标识
        pathological.setUniqueId();
        //医疗机构代码
        pathological.setP900();
        //患者id
        pathological.setPatientId();
        //住院号
        pathological.setVisitId();
        //病理号
        pathological.setCaseNumber();
        //送检标本名称
        pathological.setSpecimenName();
        //收到日期
        pathological.setInspectTime();
        //报告日期
        pathological.setReprotTime();
        //肿瘤部位
        pathological.setTumorLocation();
        //肿瘤大小
        pathological.setTumorSize();
        //原位癌
        pathological.setIfOriginalLocation();
        //病理类型
        pathological.setPathologicalType();
        //组织学分级
        pathological.setHistologicalGrade();
        //侵及阴道
        pathological.setInvasionVagina();
        //侵及宫旁组织
        pathological.setParauterineTissue();
        //脉管癌栓
        pathological.setIfArtery();
        //侵犯神经
        pathological.setIfInvasionNerve();
        //手术切缘累及情况
        pathological.setOperation();
        //切缘距离
        pathological.setEdgeDistance();
        //具体送检淋巴结部位
        pathological.setLymphNodePartition();
        //送检淋巴结总数
        pathological.setLymphNodeTotal();
        //淋巴结转移数量
        pathological.setTransferNumber();
        //淋巴结转移
        pathological.setIfTransfer();
        //免疫组化标志物名称
        pathological.setMarkerName();
        //免疫组化标志物检测定性结果
        pathological.setMarkerQualitative();
        //免疫组化标志物检测定量结果
        pathological.setMarkerQuantify();
        //数据版本
        pathological.setDataVersion();
        //数据库来源
        pathological.setDataDbSource();
        //数据表来源
        pathological.setDataTableSource();
        //数据项来源
        pathological.setDataFieldSource();
        //创建时间
        pathological.setCreatedAt();
        //创建人
        pathological.setCreator();
        //修改时间
        pathological.setUpdatedAt();
        pathologicalService.savePathological(pathological);
    }

    public void saveTreatment() {
        Treatment treatment = new Treatment();
        //标识患者身份唯一标识
        treatment.setPersonId();
        //唯一标识
        treatment.setUniqueId();
        //医疗机构代码
        treatment.setP900();
        //患者id
        treatment.setPatientId();
        //住院号
        treatment.setVisitId();
        //用药分类
        treatment.setDrugType();
        //具体药物名称
        treatment.setDrugName();
        //给药途径
        treatment.setChannel();
        //药物剂量
        treatment.setDose();
        //剂量单位
        treatment.setUnit();
        //用药开始日期
        treatment.setStartDate();
        //用药结束日期
        treatment.setEndDate();
        //数据版本
        treatment.setDataVersion();
        //数据库来源
        treatment.setDataDbSource();
        //数据表来源
        treatment.setDataTableSource();
        //数据项来源
        treatment.setDataFieldSource();
        //创建时间
        treatment.setCreatedAt();
        //创建人
        treatment.setCreator();
        //修改时间
        treatment.setUpdatedAt();
        treatmentService.saveTreatment(treatment);
    }

    public void saveCancerPainTreatment() {
        CancerPainTreatment cancerPainTreatment = new CancerPainTreatment();
        //标识患者身份唯一标识
        cancerPainTreatment.setPersonId();
        //唯一标识
        cancerPainTreatment.setUniqueId();
        //医疗机构代码
        cancerPainTreatment.setP900();
        //患者id
        cancerPainTreatment.setPatientId();
        //住院号
        cancerPainTreatment.setVisitId();
        //导致疼痛原因
        cancerPainTreatment.setCausePain();
        //入院时疼痛情况
        cancerPainTreatment.setAdmPainStatus();
        //疼痛性质
        cancerPainTreatment.setPainType();
        //基础药物日期
        cancerPainTreatment.setMainDrugDate();
        //基础药物名称
        cancerPainTreatment.setMainDrugName();
        //基础药物计量
        cancerPainTreatment.setMainDrugDose();
        //基础药物给药途径
        cancerPainTreatment.setMainDrugRoute();
        //爆发痛时间
        cancerPainTreatment.setBreakthroughPainTime();
        //爆发痛药物
        cancerPainTreatment.setBreakthroughPainDrug();
        //爆发痛给药途径
        cancerPainTreatment.setBreakthroughPainRoute();
        //爆发痛剂量
        cancerPainTreatment.setBreakthroughPainDose();
        //爆发痛疼痛评分
        cancerPainTreatment.setBreakthroughPainScore();
        //数据版本
        cancerPainTreatment.setDataVersion();
        //数据库来源
        cancerPainTreatment.setDataDbSource();
        //数据表来源
        cancerPainTreatment.setDataTableSource();
        //数据项来源
        cancerPainTreatment.setDataFieldSource();
        //创建时间
        cancerPainTreatment.setCreatedAt();
        //创建人
        cancerPainTreatment.setCreator();
        //修改时间
        cancerPainTreatment.setUpdatedAt();
        cancerPainTreatmentService.saveCancerPainTreatment(cancerPainTreatment);
    }


}