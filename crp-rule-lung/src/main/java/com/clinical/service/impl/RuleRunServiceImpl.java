package com.clinical.service.impl;

import com.alibaba.druid.sql.visitor.functions.Concat;
import com.clinical.constant.Constant;
import com.clinical.model.cluster.*;
import com.clinical.model.constant.DrugConstant;
import com.clinical.service.*;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.clinical.dao.master.*;
import com.clinical.model.master.*;

import java.math.BigDecimal;
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
    HeartFailureService    heartFailureService;


    @Autowired
    HypertensionService    hypertensionService;


    @Autowired
    InspectionService    inspectionService;


    @Autowired
    TuberculosisService    tuberculosisService;


    @Autowired
    ExamMasterService    examMasterService;


    @Autowired
    ExamMasterStdService    examMasterStdService;


    @Autowired
    ExamResultService    examResultService;


    @Autowired
    ExamDescriptionService    examDescriptionService;


    @Autowired
    TumorPunctureService    tumorPunctureService;


    @Autowired
    OperationRecordService    operationRecordService;


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
    ChemotherapyDrugService    chemotherapyDrugService;


    @Autowired
    RadiotherapyService    radiotherapyService;


    @Autowired
    RadiotherapySiteService    radiotherapySiteService;


    @Autowired
    CancerPainMasterService    cancerPainMasterService;


    @Autowired
    CancerPainTreatmentService    cancerPainTreatmentService;


    @Autowired
    FollowUpService    followUpService;


    @Autowired
    ZjBasyNstdMapper    zjBasyNstdMapper;

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
    ZjLabMicroResultMapper    zjLabMicroResultMapper;

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
    ZjVitalRecordMapper    zjVitalRecordMapper;

    @Autowired
    ZjFollowUpMapper    zjFollowUpMapper;

    @Autowired
    ZjDrugOrderMapper    zjDrugOrderMapper;

    @Autowired
    ZjTemChemotherapyMapper    zjTemChemotherapyMapper;

    @Autowired
    ZjTemRadiotherapyMapper    zjTemRadiotherapyMapper;

    @Autowired
    ZjTemInpAdmissionStatusMapper    zjTemInpAdmissionStatusMapper;

    @Autowired
    ZjTemOutpDischargeStatusMapper    zjTemOutpDischargeStatusMapper;

    @Autowired
    ZjTem24hInOutMapper    zjTem24hInOutMapper;

    @Autowired
    ZjOutpRecordMapper    zjOutpRecordMapper;

    @Autowired
    ZjTemOutpDischargeSummerMapper    zjTemOutpDischargeSummerMapper;

    @Autowired
    ZjTemCourseDisMapper    zjTemCourseDisMapper;

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
    ZjPainTreatMasterMapper    zjPainTreatMasterMapper;

    @Autowired
    ZjPainTreatMedMapper    zjPainTreatMedMapper;

    @Autowired
    ZjSympComplaintMapper    zjSympComplaintMapper;

    @Autowired
    ZjFamilyHistoryMapper    zjFamilyHistoryMapper;

    @Autowired
    ZjSmokeAndDrinkMapper    zjSmokeAndDrinkMapper;

    @Autowired
    ZjConcomitantDiseaseMapper    zjConcomitantDiseaseMapper;

    @Autowired
    ZjIhcMarkerMapper    zjIhcMarkerMapper;

    @Autowired
    ZjPathologyMapper    zjPathologyMapper;

    @Autowired
    ZjChestCtDescriptionMapper    zjChestCtDescriptionMapper;

    @Autowired
    ZjChestCtEntryResultsMapper    zjChestCtEntryResultsMapper;

    @Autowired
    ZjChestXrDescriptionMapper    zjChestXrDescriptionMapper;

    @Autowired
    ZjChestXrEntryResultsMapper    zjChestXrEntryResultsMapper;

    @Autowired
    ZjClinicalDiagMapper    zjClinicalDiagMapper;

    @Autowired
    ZjSurgeryNameMapper    zjSurgeryNameMapper;

    @Autowired
    ZjPhysicalExamParaMapper    zjPhysicalExamParaMapper;

    @Override
    public void saveRuleRun(Integer pageNo, Integer pageSize, String flag) {

        Map<String,Integer> map=new HashMap<>();
        map.put("pageNo",pageNo);
        map.put("pageSize",pageSize);
        //查找患者列表
        List<TEM_PAT_MASTER_INDEX> zj_TEM_PAT_MASTER_INDEX = zjTemPatMasterIndexMapper.findZjTemPatMasterIndexByUniqueId(map);


        for(TEM_PAT_MASTER_INDEX index: zj_TEM_PAT_MASTER_INDEX) {
            //保存患者--------------------------------------------------
           savePerson(index);

            //患者就诊列表
            List<PAT_VISIT_MASTER> zj_PAT_VISIT_MASTER = zjPatVisitMasterMapper.findZjPatVisitMasterByUniqueId(index.getUNIQUE_ID());
            //就诊其他数据
            for (PAT_VISIT_MASTER master : zj_PAT_VISIT_MASTER) {

                //保存就诊----------------------------------------------------
                saveVisitRecord(master);

                String uniqueId = master.getUNIQUE_ID();

                Date visitdate=master.getADMISSION_DATE_TIME();
                //病案首页
                BASY_NSTD  zj_BASY_NSTD =  zjBasyNstdMapper.findZjBasyNstdByUniqueId(uniqueId);
                BASY_OP_STD zj_BASY_OP_STD =  zjBasyOpStdMapper.findZjBasyOpStdByUniqueId(uniqueId);
                BASY_DIAG_STD  zj_BASY_DIAG_STD =  zjBasyDiagStdMapper.findZjBasyDiagStdByUniqueId(uniqueId);
                //诊断
                List<INP_DIAGNOSIS>  zj_INP_DIAGNOSIS =  zjInpDiagnosisMapper.findZjInpDiagnosisByUniqueId(uniqueId);

                    //体温单
               // List<VITAL_RECORD>  zj_VITAL_RECORD =  zjVitalRecordMapper.findZjVitalRecordByUniqueId(uniqueId);
                //入院记录
                List<TEM_INP_ADMISSION_STATUS>  zj_TEM_INP_ADMISSION_STATUS =  zjTemInpAdmissionStatusMapper.findZjTemInpAdmissionStatusByUniqueId(uniqueId);
                //List<SMOKE_AND_DRINK>  zj_SMOKE_AND_DRINK =  zjSmokeAndDrinkMapper.findZjSmokeAndDrinkByUniqueId(uniqueId);
                //List<CONCOMITANT_DISEASE>  zj_CONCOMITANT_DISEASE =  zjConcomitantDiseaseMapper.findZjConcomitantDiseaseByUniqueId(uniqueId);
                /*
                List<LIS_RECORD>  zj_LIS_RECORD =  zjLisRecordMapper.findZjLisRecordByUniqueId(uniqueId);
                List<LAB_MICRO_RESULT>  zj_LAB_MICRO_RESULT =  zjLabMicroResultMapper.findZjLabMicroResultByUniqueId(uniqueId);
                List<EXAM_MASTER>  zj_EXAM_MASTER =  zjExamMasterMapper.findZjExamMasterByUniqueId(uniqueId);
                List<HISTOLOGY_REPORT>  zj_HISTOLOGY_REPORT =  zjHistologyReportMapper.findZjHistologyReportByUniqueId(uniqueId);
                List<TEM_OPERATION_RECORD>  zj_TEM_OPERATION_RECORD =  zjTemOperationRecordMapper.findZjTemOperationRecordByUniqueId(uniqueId);
                List<PROCEDURE_RECORD>  zj_PROCEDURE_RECORD =  zjProcedureRecordMapper.findZjProcedureRecordByUniqueId(uniqueId);
                List<TEM_DEATH_RECORD>  zj_TEM_DEATH_RECORD =  zjTemDeathRecordMapper.findZjTemDeathRecordByUniqueId(uniqueId);
                List<NURSING_RECORD>  zj_NURSING_RECORD =  zjNursingRecordMapper.findZjNursingRecordByUniqueId(uniqueId);
                List<FOLLOW_UP>  zj_FOLLOW_UP =  zjFollowUpMapper.findZjFollowUpByUniqueId(uniqueId);
                List<DRUG_ORDER>  zj_DRUG_ORDER =  zjDrugOrderMapper.findZjDrugOrderByUniqueId(uniqueId);
                List<TEM_CHEMOTHERAPY>  zj_TEM_CHEMOTHERAPY =  zjTemChemotherapyMapper.findZjTemChemotherapyByUniqueId(uniqueId);
                List<TEM_RADIOTHERAPY>  zj_TEM_RADIOTHERAPY =  zjTemRadiotherapyMapper.findZjTemRadiotherapyByUniqueId(uniqueId);
                List<TEM_OUTP_DISCHARGE_STATUS>  zj_TEM_OUTP_DISCHARGE_STATUS =  zjTemOutpDischargeStatusMapper.findZjTemOutpDischargeStatusByUniqueId(uniqueId);
                List<TEM_24H_IN_OUT>  zj_TEM_24H_IN_OUT =  zjTem24hInOutMapper.findZjTem24hInOutByUniqueId(uniqueId);
                List<OUTP_RECORD>  zj_OUTP_RECORD =  zjOutpRecordMapper.findZjOutpRecordByUniqueId(uniqueId);
                List<TEM_OUTP_DISCHARGE_SUMMER>  zj_TEM_OUTP_DISCHARGE_SUMMER =  zjTemOutpDischargeSummerMapper.findZjTemOutpDischargeSummerByUniqueId(uniqueId);
                List<TEM_COURSE_DIS>  zj_TEM_COURSE_DIS =  zjTemCourseDisMapper.findZjTemCourseDisByUniqueId(uniqueId);
                List<WARD_ROUND_RECORD>  zj_WARD_ROUND_RECORD =  zjWardRoundRecordMapper.findZjWardRoundRecordByUniqueId(uniqueId);
                List<INP_CONSULTATION_DOCTOR_MASTER>  zj_INP_CONSULTATION_DOCTOR_MASTER =  zjInpConsultationDoctorMasterMapper.findZjInpConsultationDoctorMasterByUniqueId(uniqueId);
                List<INP_CONSULTATION_DOCTOR_DETAIL>  zj_INP_CONSULTATION_DOCTOR_DETAIL =  zjInpConsultationDoctorDetailMapper.findZjInpConsultationDoctorDetailByUniqueId(uniqueId);
                List<TEM_PRE_COURSE_DIS>  zj_TEM_PRE_COURSE_DIS =  zjTemPreCourseDisMapper.findZjTemPreCourseDisByUniqueId(uniqueId);
                List<PRE_OP_DISCUSSION>  zj_PRE_OP_DISCUSSION =  zjPreOpDiscussionMapper.findZjPreOpDiscussionByUniqueId(uniqueId);
                List<POST_OP_COURSE>  zj_POST_OP_COURSE =  zjPostOpCourseMapper.findZjPostOpCourseByUniqueId(uniqueId);
                List<TRANSFER_DEPT>  zj_TRANSFER_DEPT =  zjTransferDeptMapper.findZjTransferDeptByUniqueId(uniqueId);
                List<EMERGENCY_RECORD>  zj_EMERGENCY_RECORD =  zjEmergencyRecordMapper.findZjEmergencyRecordByUniqueId(uniqueId);
                List<STAGE_SUMMARY>  zj_STAGE_SUMMARY =  zjStageSummaryMapper.findZjStageSummaryByUniqueId(uniqueId);
                List<SYMP_COMPLAINT>  zj_SYMP_COMPLAINT =  zjSympComplaintMapper.findZjSympComplaintByUniqueId(uniqueId);
                List<FAMILY_HISTORY>  zj_FAMILY_HISTORY =  zjFamilyHistoryMapper.findZjFamilyHistoryByUniqueId(uniqueId);
                List<SMOKE_AND_DRINK>  zj_SMOKE_AND_DRINK =  zjSmokeAndDrinkMapper.findZjSmokeAndDrinkByUniqueId(uniqueId);
                List<CONCOMITANT_DISEASE>  zj_CONCOMITANT_DISEASE =  zjConcomitantDiseaseMapper.findZjConcomitantDiseaseByUniqueId(uniqueId);
                List<IHC_MARKER>  zj_IHC_MARKER =  zjIhcMarkerMapper.findZjIhcMarkerByUniqueId(uniqueId);
                List<PATHOLOGY>  zj_PATHOLOGY =  zjPathologyMapper.findZjPathologyByUniqueId(uniqueId);
                List<CHEST_CT_DESCRIPTION>  zj_CHEST_CT_DESCRIPTION =  zjChestCtDescriptionMapper.findZjChestCtDescriptionByUniqueId(uniqueId);
                List<CHEST_CT_ENTRY_RESULTS>  zj_CHEST_CT_ENTRY_RESULTS =  zjChestCtEntryResultsMapper.findZjChestCtEntryResultsByUniqueId(uniqueId);
                List<CHEST_XR_DESCRIPTION>  zj_CHEST_XR_DESCRIPTION =  zjChestXrDescriptionMapper.findZjChestXrDescriptionByUniqueId(uniqueId);
                List<CHEST_XR_ENTRY_RESULTS>  zj_CHEST_XR_ENTRY_RESULTS =  zjChestXrEntryResultsMapper.findZjChestXrEntryResultsByUniqueId(uniqueId);
                List<CLINICAL_DIAG>  zj_CLINICAL_DIAG =  zjClinicalDiagMapper.findZjClinicalDiagByUniqueId(uniqueId);
                List<SURGERY_NAME>  zj_SURGERY_NAME =  zjSurgeryNameMapper.findZjSurgeryNameByUniqueId(uniqueId);*/



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
               if(zj_VITAL_RECORD!=null&&zj_INP_DIAGNOSIS.size()>0){
                   savePersonGeneral(zj_VITAL_RECORD);
               }
               if(zj_INP_DIAGNOSIS!=null&&zj_INP_DIAGNOSIS.size()>0){
                   saveDiagnosis(zj_INP_DIAGNOSIS);
               }
               if(zj_TEM_INP_ADMISSION_STATUS!=null&&zj_TEM_INP_ADMISSION_STATUS.size()>0){
                   saveHisMarriage(zj_TEM_INP_ADMISSION_STATUS);
               }*/

                if(zj_TEM_INP_ADMISSION_STATUS!=null&&zj_TEM_INP_ADMISSION_STATUS.size()>0){
                    for(TEM_INP_ADMISSION_STATUS tem_inp_admission_status:zj_TEM_INP_ADMISSION_STATUS){
                        saveInpAdmissionStatus(tem_inp_admission_status);
                    }

                }



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
        log.info("保存患者："+person.getPersonId());
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
            if(zj_BASY_STD.getP301_ICD10_NAME6()!=null&&zj_BASY_STD.getP301_ICD10_ID6()!=null&&!"".equals(zj_BASY_STD.getP301_ICD10_ID6())){
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
                indexDiagnosisAdmitIcd.setDiagnosisIcdcode(zj_BASY_STD.getP301_ICD10_ID6());
                //入院诊断描述名称
                indexDiagnosisAdmitIcd.setDiagnosisIcddesc(zj_BASY_STD.getP301_ICD10_NAME6());
                indexDiagnosisAdmitIcdService.saveIndexDiagnosisAdmitIcd(indexDiagnosisAdmitIcd);
            }
            if(zj_BASY_STD.getP301_ICD10_NAME7()!=null&&zj_BASY_STD.getP301_ICD10_ID7()!=null&&!"".equals(zj_BASY_STD.getP301_ICD10_ID7())){
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
                indexDiagnosisAdmitIcd.setDiagnosisIcdcode(zj_BASY_STD.getP301_ICD10_ID7());
                //入院诊断描述名称
                indexDiagnosisAdmitIcd.setDiagnosisIcddesc(zj_BASY_STD.getP301_ICD10_NAME7());
                indexDiagnosisAdmitIcdService.saveIndexDiagnosisAdmitIcd(indexDiagnosisAdmitIcd);
            }
            if(zj_BASY_STD.getP301_ICD10_NAME8()!=null&&zj_BASY_STD.getP301_ICD10_ID8()!=null&&!"".equals(zj_BASY_STD.getP301_ICD10_ID8())){
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
                indexDiagnosisAdmitIcd.setDiagnosisIcdcode(zj_BASY_STD.getP301_ICD10_ID8());
                //入院诊断描述名称
                indexDiagnosisAdmitIcd.setDiagnosisIcddesc(zj_BASY_STD.getP301_ICD10_NAME8());
                indexDiagnosisAdmitIcdService.saveIndexDiagnosisAdmitIcd(indexDiagnosisAdmitIcd);
            }
            if(zj_BASY_STD.getP301_ICD10_NAME9()!=null&&zj_BASY_STD.getP301_ICD10_ID9()!=null&&!"".equals(zj_BASY_STD.getP301_ICD10_ID9())){
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
                indexDiagnosisAdmitIcd.setDiagnosisIcdcode(zj_BASY_STD.getP301_ICD10_ID9());
                //入院诊断描述名称
                indexDiagnosisAdmitIcd.setDiagnosisIcddesc(zj_BASY_STD.getP301_ICD10_NAME9());
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
            if(zj_BASY_STD.getP281_ICD10_NAME6()!=null&&zj_BASY_STD.getP281_ICD10_ID6()!=null&&!"".equals(zj_BASY_STD.getP281_ICD10_ID6())){
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
                indexDiagnosisClinicIcd.setDiagnosisIcdcode(zj_BASY_STD.getP281_ICD10_ID6());
                //门诊诊断名称
                indexDiagnosisClinicIcd.setDiagnosisIcddesc(zj_BASY_STD.getP281_ICD10_NAME6());
                indexDiagnosisClinicIcdService.saveIndexDiagnosisClinicIcd(indexDiagnosisClinicIcd);
            }
            if(zj_BASY_STD.getP281_ICD10_NAME7()!=null&&zj_BASY_STD.getP281_ICD10_ID7()!=null&&!"".equals(zj_BASY_STD.getP281_ICD10_ID7())){
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
                indexDiagnosisClinicIcd.setDiagnosisIcdcode(zj_BASY_STD.getP281_ICD10_ID7());
                //门诊诊断名称
                indexDiagnosisClinicIcd.setDiagnosisIcddesc(zj_BASY_STD.getP281_ICD10_NAME7());
                indexDiagnosisClinicIcdService.saveIndexDiagnosisClinicIcd(indexDiagnosisClinicIcd);
            }
            if(zj_BASY_STD.getP281_ICD10_NAME8()!=null&&zj_BASY_STD.getP281_ICD10_ID8()!=null&&!"".equals(zj_BASY_STD.getP281_ICD10_ID8())){
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
                indexDiagnosisClinicIcd.setDiagnosisIcdcode(zj_BASY_STD.getP281_ICD10_ID8());
                //门诊诊断名称
                indexDiagnosisClinicIcd.setDiagnosisIcddesc(zj_BASY_STD.getP281_ICD10_NAME8());
                indexDiagnosisClinicIcdService.saveIndexDiagnosisClinicIcd(indexDiagnosisClinicIcd);
            }
            if(zj_BASY_STD.getP281_ICD10_NAME9()!=null&&zj_BASY_STD.getP281_ICD10_ID9()!=null&&!"".equals(zj_BASY_STD.getP281_ICD10_ID9())){
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
                indexDiagnosisClinicIcd.setDiagnosisIcdcode(zj_BASY_STD.getP281_ICD10_ID9());
                //门诊诊断名称
                indexDiagnosisClinicIcd.setDiagnosisIcddesc(zj_BASY_STD.getP281_ICD10_NAME9());
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
            if(zj_BASY_STD.getP322_ICD10_NAME6()!=null&&zj_BASY_STD.getP322_ICD10_ID6()!=null&&!"".equals(zj_BASY_STD.getP322_ICD10_ID6())){
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
                indexDiagnosisMainIcd.setDiagnosisIcdcode(zj_BASY_STD.getP322_ICD10_ID6());
                //主要诊断疾病描述
                indexDiagnosisMainIcd.setDiagnosisIcddesc(zj_BASY_STD.getP322_ICD10_NAME6());
                indexDiagnosisMainIcdService.saveIndexDiagnosisMainIcd(indexDiagnosisMainIcd);
            }
            if(zj_BASY_STD.getP322_ICD10_NAME7()!=null&&zj_BASY_STD.getP322_ICD10_ID7()!=null&&!"".equals(zj_BASY_STD.getP322_ICD10_ID7())){
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
                indexDiagnosisMainIcd.setDiagnosisIcdcode(zj_BASY_STD.getP322_ICD10_ID7());
                //主要诊断疾病描述
                indexDiagnosisMainIcd.setDiagnosisIcddesc(zj_BASY_STD.getP322_ICD10_NAME7());
                indexDiagnosisMainIcdService.saveIndexDiagnosisMainIcd(indexDiagnosisMainIcd);
            }
            if(zj_BASY_STD.getP322_ICD10_NAME8()!=null&&zj_BASY_STD.getP322_ICD10_ID8()!=null&&!"".equals(zj_BASY_STD.getP322_ICD10_ID8())){
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
                indexDiagnosisMainIcd.setDiagnosisIcdcode(zj_BASY_STD.getP322_ICD10_ID8());
                //主要诊断疾病描述
                indexDiagnosisMainIcd.setDiagnosisIcddesc(zj_BASY_STD.getP322_ICD10_NAME8());
                indexDiagnosisMainIcdService.saveIndexDiagnosisMainIcd(indexDiagnosisMainIcd);
            }
            if(zj_BASY_STD.getP322_ICD10_NAME9()!=null&&zj_BASY_STD.getP322_ICD10_ID9()!=null&&!"".equals(zj_BASY_STD.getP322_ICD10_ID9())){
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
                indexDiagnosisMainIcd.setDiagnosisIcdcode(zj_BASY_STD.getP322_ICD10_ID9());
                //主要诊断疾病描述
                indexDiagnosisMainIcd.setDiagnosisIcddesc(zj_BASY_STD.getP322_ICD10_NAME9());
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
            if(zj_BASY_STD.getP325_ICD10_NAME6()!=null&&zj_BASY_STD.getP325_ICD10_ID6()!=null&&!"".equals(zj_BASY_STD.getP325_ICD10_ID6())){
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
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP325_ICD10_ID6());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP325_ICD10_NAME6());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP325_ICD10_NAME7()!=null&&zj_BASY_STD.getP325_ICD10_ID7()!=null&&!"".equals(zj_BASY_STD.getP325_ICD10_ID7())){
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
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP325_ICD10_ID7());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP325_ICD10_NAME7());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP325_ICD10_NAME8()!=null&&zj_BASY_STD.getP325_ICD10_ID8()!=null&&!"".equals(zj_BASY_STD.getP325_ICD10_ID8())){
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
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP325_ICD10_ID8());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP325_ICD10_NAME8());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP325_ICD10_NAME9()!=null&&zj_BASY_STD.getP325_ICD10_ID9()!=null&&!"".equals(zj_BASY_STD.getP325_ICD10_ID9())){
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
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP325_ICD10_ID9());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP325_ICD10_NAME9());
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
            if(zj_BASY_STD.getP328_ICD10_NAME6()!=null&&zj_BASY_STD.getP328_ICD10_ID6()!=null&&!"".equals(zj_BASY_STD.getP328_ICD10_ID6())){
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
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP328_ICD10_ID6());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP328_ICD10_NAME6());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP328_ICD10_NAME7()!=null&&zj_BASY_STD.getP328_ICD10_ID7()!=null&&!"".equals(zj_BASY_STD.getP328_ICD10_ID7())){
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
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP328_ICD10_ID7());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP328_ICD10_NAME7());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP328_ICD10_NAME8()!=null&&zj_BASY_STD.getP328_ICD10_ID8()!=null&&!"".equals(zj_BASY_STD.getP328_ICD10_ID8())){
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
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP328_ICD10_ID8());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP328_ICD10_NAME8());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP328_ICD10_NAME9()!=null&&zj_BASY_STD.getP328_ICD10_ID9()!=null&&!"".equals(zj_BASY_STD.getP328_ICD10_ID9())){
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
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP328_ICD10_ID9());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP328_ICD10_NAME9());
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
            if(zj_BASY_STD.getP3292_ICD10_NAME6()!=null&&zj_BASY_STD.getP3292_ICD10_ID6()!=null&&!"".equals(zj_BASY_STD.getP3292_ICD10_ID6())){
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
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3292_ICD10_ID6());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3292_ICD10_NAME6());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3292_ICD10_NAME7()!=null&&zj_BASY_STD.getP3292_ICD10_ID7()!=null&&!"".equals(zj_BASY_STD.getP3292_ICD10_ID7())){
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
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3292_ICD10_ID7());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3292_ICD10_NAME7());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3292_ICD10_NAME8()!=null&&zj_BASY_STD.getP3292_ICD10_ID8()!=null&&!"".equals(zj_BASY_STD.getP3292_ICD10_ID8())){
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
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3292_ICD10_ID8());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3292_ICD10_NAME8());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3292_ICD10_NAME9()!=null&&zj_BASY_STD.getP3292_ICD10_ID9()!=null&&!"".equals(zj_BASY_STD.getP3292_ICD10_ID9())){
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
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3292_ICD10_ID9());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3292_ICD10_NAME9());
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
            if(zj_BASY_STD.getP3295_ICD10_NAME6()!=null&&zj_BASY_STD.getP3295_ICD10_ID6()!=null&&!"".equals(zj_BASY_STD.getP3295_ICD10_ID6())){
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
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3295_ICD10_ID6());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3295_ICD10_NAME6());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3295_ICD10_NAME7()!=null&&zj_BASY_STD.getP3295_ICD10_ID7()!=null&&!"".equals(zj_BASY_STD.getP3295_ICD10_ID7())){
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
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3295_ICD10_ID7());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3295_ICD10_NAME7());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3295_ICD10_NAME8()!=null&&zj_BASY_STD.getP3295_ICD10_ID8()!=null&&!"".equals(zj_BASY_STD.getP3295_ICD10_ID8())){
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
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3295_ICD10_ID8());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3295_ICD10_NAME8());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3295_ICD10_NAME9()!=null&&zj_BASY_STD.getP3295_ICD10_ID9()!=null&&!"".equals(zj_BASY_STD.getP3295_ICD10_ID9())){
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
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3295_ICD10_ID9());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3295_ICD10_NAME9());
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
            if(zj_BASY_STD.getP3298_ICD10_NAME6()!=null&&zj_BASY_STD.getP3298_ICD10_ID6()!=null&&!"".equals(zj_BASY_STD.getP3298_ICD10_ID6())){
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
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3298_ICD10_ID6());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3298_ICD10_NAME6());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3298_ICD10_NAME7()!=null&&zj_BASY_STD.getP3298_ICD10_ID7()!=null&&!"".equals(zj_BASY_STD.getP3298_ICD10_ID7())){
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
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3298_ICD10_ID7());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3298_ICD10_NAME7());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3298_ICD10_NAME8()!=null&&zj_BASY_STD.getP3298_ICD10_ID8()!=null&&!"".equals(zj_BASY_STD.getP3298_ICD10_ID8())){
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
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3298_ICD10_ID8());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3298_ICD10_NAME8());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3298_ICD10_NAME9()!=null&&zj_BASY_STD.getP3298_ICD10_ID9()!=null&&!"".equals(zj_BASY_STD.getP3298_ICD10_ID9())){
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
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3298_ICD10_ID9());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3298_ICD10_NAME9());
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
            if(zj_BASY_STD.getP3285_ICD10_NAME6()!=null&&zj_BASY_STD.getP3285_ICD10_ID6()!=null&&!"".equals(zj_BASY_STD.getP3285_ICD10_ID6())){
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
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3285_ICD10_ID6());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3285_ICD10_NAME6());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3285_ICD10_NAME7()!=null&&zj_BASY_STD.getP3285_ICD10_ID7()!=null&&!"".equals(zj_BASY_STD.getP3285_ICD10_ID7())){
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
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3285_ICD10_ID7());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3285_ICD10_NAME7());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3285_ICD10_NAME8()!=null&&zj_BASY_STD.getP3285_ICD10_ID8()!=null&&!"".equals(zj_BASY_STD.getP3285_ICD10_ID8())){
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
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3285_ICD10_ID8());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3285_ICD10_NAME8());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3285_ICD10_NAME9()!=null&&zj_BASY_STD.getP3285_ICD10_ID9()!=null&&!"".equals(zj_BASY_STD.getP3285_ICD10_ID9())){
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
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3285_ICD10_ID9());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3285_ICD10_NAME9());
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
            if(zj_BASY_STD.getP3288_ICD10_NAME6()!=null&&zj_BASY_STD.getP3288_ICD10_ID6()!=null&&!"".equals(zj_BASY_STD.getP3288_ICD10_ID6())){
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
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3288_ICD10_ID6());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3288_ICD10_NAME6());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3288_ICD10_NAME7()!=null&&zj_BASY_STD.getP3288_ICD10_ID7()!=null&&!"".equals(zj_BASY_STD.getP3288_ICD10_ID7())){
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
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3288_ICD10_ID7());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3288_ICD10_NAME7());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3288_ICD10_NAME8()!=null&&zj_BASY_STD.getP3288_ICD10_ID8()!=null&&!"".equals(zj_BASY_STD.getP3288_ICD10_ID8())){
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
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3288_ICD10_ID8());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3288_ICD10_NAME8());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3288_ICD10_NAME9()!=null&&zj_BASY_STD.getP3288_ICD10_ID9()!=null&&!"".equals(zj_BASY_STD.getP3288_ICD10_ID9())){
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
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3288_ICD10_ID9());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3288_ICD10_NAME9());
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
            if(zj_BASY_STD.getP3272_ICD10_NAME6()!=null&&zj_BASY_STD.getP3272_ICD10_ID6()!=null&&!"".equals(zj_BASY_STD.getP3272_ICD10_ID6())){
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
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3272_ICD10_ID6());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3272_ICD10_NAME6());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3272_ICD10_NAME7()!=null&&zj_BASY_STD.getP3272_ICD10_ID7()!=null&&!"".equals(zj_BASY_STD.getP3272_ICD10_ID7())){
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
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3272_ICD10_ID7());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3272_ICD10_NAME7());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3272_ICD10_NAME8()!=null&&zj_BASY_STD.getP3272_ICD10_ID8()!=null&&!"".equals(zj_BASY_STD.getP3272_ICD10_ID8())){
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
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3272_ICD10_ID8());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3272_ICD10_NAME8());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3272_ICD10_NAME9()!=null&&zj_BASY_STD.getP3272_ICD10_ID9()!=null&&!"".equals(zj_BASY_STD.getP3272_ICD10_ID9())){
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
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3272_ICD10_ID9());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3272_ICD10_NAME9());
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
            if(zj_BASY_STD.getP3275_ICD10_NAME6()!=null&&zj_BASY_STD.getP3275_ICD10_ID6()!=null&&!"".equals(zj_BASY_STD.getP3275_ICD10_ID6())){
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
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3275_ICD10_ID6());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3275_ICD10_NAME6());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3275_ICD10_NAME7()!=null&&zj_BASY_STD.getP3275_ICD10_ID7()!=null&&!"".equals(zj_BASY_STD.getP3275_ICD10_ID7())){
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
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3275_ICD10_ID7());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3275_ICD10_NAME7());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3275_ICD10_NAME8()!=null&&zj_BASY_STD.getP3275_ICD10_ID8()!=null&&!"".equals(zj_BASY_STD.getP3275_ICD10_ID8())){
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
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3275_ICD10_ID8());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3275_ICD10_NAME8());
                indexDiagnosisOtherIcdService.saveIndexDiagnosisOtherIcd(indexDiagnosisOtherIcd);
            }
            if(zj_BASY_STD.getP3275_ICD10_NAME9()!=null&&zj_BASY_STD.getP3275_ICD10_ID9()!=null&&!"".equals(zj_BASY_STD.getP3275_ICD10_ID9())){
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
                indexDiagnosisOtherIcd.setDiagnosisIcdcode(zj_BASY_STD.getP3275_ICD10_ID9());
                //诊断疾病描述
                indexDiagnosisOtherIcd.setDiagnosisIcddesc(zj_BASY_STD.getP3275_ICD10_NAME9());
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
    public void saveInpAdmissionStatus(TEM_INP_ADMISSION_STATUS zj_TEM_INP_ADMISSION_STATUS){
        TemInpAdmissionStatus temInpAdmissionStatus = new TemInpAdmissionStatus();
        //标识患者身份唯一标识
        temInpAdmissionStatus.setPersonId(zj_TEM_INP_ADMISSION_STATUS.getunique_id_lv1());
        //唯一标识
        temInpAdmissionStatus.setUniqueId(zj_TEM_INP_ADMISSION_STATUS.getunique_id_lv2());
        //中间库unique_id
        temInpAdmissionStatus.setUniqueIdLv3(zj_TEM_INP_ADMISSION_STATUS.getunique_id());
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
     /*   //肥胖
        temInpAdmissionStatus.setFat("");
        //体表面积
        temInpAdmissionStatus.setBySurfaceArea("");
        //ecog_whops评分
        temInpAdmissionStatus.setTEcogWhops("");
        //kps评分
        temInpAdmissionStatus.setTKps("");
        //疼痛评分_nrs法
        temInpAdmissionStatus.setTNrs("");*/
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


   /* public void savePersonGeneral(  List<VITAL_RECORD>  zj_VITAL_RECORD){

        DateFormat format=new SimpleDateFormat("yyyy-MM-dd");
        if(zj_VITAL_RECORD.size()>0){
            Map<String,List<VITAL_RECORD>> recordMap= new HashMap<>();

            for(VITAL_RECORD vitalRecord:zj_VITAL_RECORD ){

                if("呼吸".equals(vitalRecord.getITEM_NAME())||"脉搏".equals(vitalRecord.getITEM_NAME())
                        ||"体温".equals(vitalRecord.getITEM_NAME())||"收缩压".equals(vitalRecord.getITEM_NAME())
                        ||"舒张压".equals(vitalRecord.getITEM_NAME())||"身高".equals(vitalRecord.getITEM_NAME())
                        ||"体重".equals(vitalRecord.getITEM_NAME())){
                    String datekey=format.format(vitalRecord.getEXAM_TIME());
                    List<VITAL_RECORD>   records=recordMap.get(datekey);
                    if(records!=null){
                        records.add(vitalRecord);
                    }else{
                        List<VITAL_RECORD> recordsnewList=new ArrayList<>();
                        recordsnewList.add(vitalRecord);
                        recordMap.put(datekey,recordsnewList);
                    }
                }

            }

           Set<String> keySet=  recordMap.keySet();

           Iterator<String> it= keySet.iterator();
           while (it.hasNext()){
               log.info("保存患者一般信息"+zj_VITAL_RECORD.get(0).getUNIQUE_ID());
               String mapkey=it.next();
               List<VITAL_RECORD> recordList=recordMap.get(mapkey);
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

               for(VITAL_RECORD vital_record : recordList){
                   if(vital_record.getITEM_NAME().contains("呼吸")&&vital_record.getEXAM_RESULT()!=null){
                       //呼吸
                       personGeneral.setBreathingFrequency(Double.valueOf(vital_record.getEXAM_RESULT()));
                   }
                   if(vital_record.getITEM_NAME().contains("脉搏")&&vital_record.getEXAM_RESULT()!=null){
                       //脉搏
                       personGeneral.setHeartRate(Double.valueOf(vital_record.getEXAM_RESULT()));
                   }
                   if(vital_record.getITEM_NAME().contains("体温")&&vital_record.getEXAM_RESULT()!=null){
                       //体温
                       personGeneral.setBodyTemperature(Double.valueOf(vital_record.getEXAM_RESULT()));
                   }
                   if(vital_record.getITEM_NAME().contains("收缩压")&&vital_record.getEXAM_RESULT()!=null){
                       //收缩压
                       personGeneral.setSystolicBloodPressure(Double.valueOf(vital_record.getEXAM_RESULT()));
                   }
                   if(vital_record.getITEM_NAME().contains("舒张压")&&vital_record.getEXAM_RESULT()!=null){
                       //舒张压
                       personGeneral.setDiastolicBloodPressure(Double.valueOf(vital_record.getEXAM_RESULT()));
                   }
                   if(vital_record.getITEM_NAME().contains("身高")&&vital_record.getEXAM_RESULT()!=null){
                       //身高
                       personGeneral.setHeight(Double.valueOf(vital_record.getEXAM_RESULT()));
                   }
                   if(vital_record.getITEM_NAME().contains("体重")&&vital_record.getEXAM_RESULT()!=null){
                       //体重
                       personGeneral.setWeight(Double.valueOf(vital_record.getEXAM_RESULT()));
                   }

               }



               personGeneralService.savePersonGeneral(personGeneral);




           }

        }




    }
    public void saveHisVitalSign(){
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
    public void saveHisPerson(){
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
    public void saveHisFamily(){
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
    public void saveHisPast(){
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
        //慢性阻塞性肺病(COpD)
        hisPast.setCopd();
        //是否有肺气肿
        hisPast.setEmphysema();
        //是否有哮喘
        hisPast.setAsthma();
        //是否有支气管肺炎
        hisPast.setBronchitis();
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
    public void saveHisMarriage(List<TEM_INP_ADMISSION_STATUS> zj_TEM_INP_ADMISSION_STATUS){
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
        hisMarriage.setMarriageChildbirth(zj_TEM_INP_ADMISSION_STATUS.get(0).gethistory_of_marr_child());
        //修改时间
        hisMarriage.setUpdatedAt(new Date());
        hisMarriageService.saveHisMarriage(hisMarriage);
    }
    public void saveDiagnosis(List<INP_DIAGNOSIS>  zj_INP_DIAGNOSIS){

        List<String> ICD10LIST=Constant.getICD10LIST();
        for(INP_DIAGNOSIS inp_diagnosis : zj_INP_DIAGNOSIS){
            log.info("保存患者诊断信息"+inp_diagnosis.getUNIQUE_ID_LV2());

            if(inp_diagnosis.getICD10_ID1()!=null){
                String ICD10_ID1=inp_diagnosis.getICD10_ID1().substring(0,3);
            if(ICD10LIST.contains(ICD10_ID1)&&inp_diagnosis!=null){
                PrimaryDiagnosis diagnosis = new PrimaryDiagnosis();
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
                diagnosis.setDiagnosisName(inp_diagnosis.getICD10_NAME1());
                //诊断类型
                diagnosis.setDiagnosisType(inp_diagnosis.getDIAGNOSIS_TYPE());

                //出现转移
                if(inp_diagnosis.getICD10_NAME1().contains("继发")){
                    if(inp_diagnosis.getICD10_NAME1().contains("可疑")){
                        diagnosis.setIfTransfer("未知");
                    }else{
                        diagnosis.setIfTransfer("是");
                    }
                    String part= inp_diagnosis.getICD10_NAME1().split("继发")[0];

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

                if(inp_diagnosis.getICD10_NAME1().contains("复发")||inp_diagnosis.getICD10_NAME1().contains("继发")){

                    //复发
                    diagnosis.setIfRecrudescence("是");
                    diagnosis.setRecrudescenceType("局部复发");
                    //复发或转移时间
                    diagnosis.setRecrudescenceDate(inp_diagnosis.getDIAGNOSIS_DATE());
                    //复发形式
                    if(inp_diagnosis.getICD10_NAME1().contains("继发")&&!inp_diagnosis.getICD10_NAME1().contains("肺")){
                        diagnosis.setRecrudescenceType("远处转移");
                    }


                }else{
                    diagnosis.setIfRecrudescence("否");
                }

                diagnosisService.saveDiagnosis(diagnosis);
            }
            }
            if(inp_diagnosis.getICD10_ID2()!=null){
                String ICD10_ID2=inp_diagnosis.getICD10_ID2().substring(0,3);
                if(ICD10LIST.contains(ICD10_ID2)&&inp_diagnosis!=null){
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
                    diagnosis.setDiagnosisName(inp_diagnosis.getICD10_NAME2());
                    //诊断类型
                    diagnosis.setDiagnosisType(inp_diagnosis.getDIAGNOSIS_TYPE());

                    //出现转移
                    if(inp_diagnosis.getICD10_NAME2().contains("继发")){
                        if(inp_diagnosis.getICD10_NAME2().contains("可疑")){
                            diagnosis.setIfTransfer("未知");
                        }else{
                            diagnosis.setIfTransfer("是");
                        }
                        String part= inp_diagnosis.getICD10_NAME2().split("继发")[0];

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

                    if(inp_diagnosis.getICD10_NAME2().contains("复发")||inp_diagnosis.getICD10_NAME2().contains("继发")){

                        //复发
                        diagnosis.setIfRecrudescence("是");
                        diagnosis.setRecrudescenceType("局部复发");
                        //复发或转移时间
                        diagnosis.setRecrudescenceDate(inp_diagnosis.getDIAGNOSIS_DATE());
                        //复发形式
                        if(inp_diagnosis.getICD10_NAME2().contains("继发")&&!inp_diagnosis.getICD10_NAME2().contains("肺")){
                            diagnosis.setRecrudescenceType("远处转移");
                        }


                    }else{
                        diagnosis.setIfRecrudescence("否");
                    }

                    diagnosisService.saveDiagnosis(diagnosis);
                }
            }
            if(inp_diagnosis.getICD10_ID3()!=null){
                String ICD10_ID3=inp_diagnosis.getICD10_ID3().substring(0,3);
                if(ICD10LIST.contains(ICD10_ID3)&&inp_diagnosis!=null){
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
                    diagnosis.setDiagnosisName(inp_diagnosis.getICD10_NAME3());
                    //诊断类型
                    diagnosis.setDiagnosisType(inp_diagnosis.getDIAGNOSIS_TYPE());

                    //出现转移
                    if(inp_diagnosis.getICD10_NAME3().contains("继发")){
                        if(inp_diagnosis.getICD10_NAME3().contains("可疑")){
                            diagnosis.setIfTransfer("未知");
                        }else{
                            diagnosis.setIfTransfer("是");
                        }
                        String part= inp_diagnosis.getICD10_NAME3().split("继发")[0];

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

                    if(inp_diagnosis.getICD10_NAME3().contains("复发")||inp_diagnosis.getICD10_NAME3().contains("继发")){

                        //复发
                        diagnosis.setIfRecrudescence("是");
                        diagnosis.setRecrudescenceType("局部复发");
                        //复发或转移时间
                        diagnosis.setRecrudescenceDate(inp_diagnosis.getDIAGNOSIS_DATE());
                        //复发形式
                        if(inp_diagnosis.getICD10_NAME3().contains("继发")&&!inp_diagnosis.getICD10_NAME3().contains("肺")){
                            diagnosis.setRecrudescenceType("远处转移");
                        }


                    }else{
                        diagnosis.setIfRecrudescence("否");
                    }

                    diagnosisService.saveDiagnosis(diagnosis);
                }
            }
            if(inp_diagnosis.getICD10_ID4()!=null){
                String ICD10_ID4=inp_diagnosis.getICD10_ID4().substring(0,3);
                if(ICD10LIST.contains(ICD10_ID4)&&inp_diagnosis!=null){
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
                    diagnosis.setDiagnosisName(inp_diagnosis.getICD10_NAME4());
                    //诊断类型
                    diagnosis.setDiagnosisType(inp_diagnosis.getDIAGNOSIS_TYPE());

                    //出现转移
                    if(inp_diagnosis.getICD10_NAME4().contains("继发")){
                        if(inp_diagnosis.getICD10_NAME4().contains("可疑")){
                            diagnosis.setIfTransfer("未知");
                        }else{
                            diagnosis.setIfTransfer("是");
                        }
                        String part= inp_diagnosis.getICD10_NAME4().split("继发")[0];

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

                    if(inp_diagnosis.getICD10_NAME4().contains("复发")||inp_diagnosis.getICD10_NAME4().contains("继发")){

                        //复发
                        diagnosis.setIfRecrudescence("是");
                        diagnosis.setRecrudescenceType("局部复发");
                        //复发或转移时间
                        diagnosis.setRecrudescenceDate(inp_diagnosis.getDIAGNOSIS_DATE());
                        //复发形式
                        if(inp_diagnosis.getICD10_NAME4().contains("继发")&&!inp_diagnosis.getICD10_NAME4().contains("肺")){
                            diagnosis.setRecrudescenceType("远处转移");
                        }


                    }else{
                        diagnosis.setIfRecrudescence("否");
                    }

                    diagnosisService.saveDiagnosis(diagnosis);
                }
            }
            if(inp_diagnosis.getICD10_ID5()!=null){
                String ICD10_ID5=inp_diagnosis.getICD10_ID5().substring(0,3);
                if(ICD10LIST.contains(ICD10_ID5)&&inp_diagnosis!=null){
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
                    diagnosis.setDiagnosisName(inp_diagnosis.getICD10_NAME5());
                    //诊断类型
                    diagnosis.setDiagnosisType(inp_diagnosis.getDIAGNOSIS_TYPE());

                    //出现转移
                    if(inp_diagnosis.getICD10_NAME5().contains("继发")){
                        if(inp_diagnosis.getICD10_NAME5().contains("可疑")){
                            diagnosis.setIfTransfer("未知");
                        }else{
                            diagnosis.setIfTransfer("是");
                        }
                        String part= inp_diagnosis.getICD10_NAME5().split("继发")[0];

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

                    if(inp_diagnosis.getICD10_NAME5().contains("复发")||inp_diagnosis.getICD10_NAME5().contains("继发")){

                        //复发
                        diagnosis.setIfRecrudescence("是");
                        diagnosis.setRecrudescenceType("局部复发");
                        //复发或转移时间
                        diagnosis.setRecrudescenceDate(inp_diagnosis.getDIAGNOSIS_DATE());
                        //复发形式
                        if(inp_diagnosis.getICD10_NAME5().contains("继发")&&!inp_diagnosis.getICD10_NAME5().contains("肺")){
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
    public void saveSymptom(List<SYMP_COMPLAINT> zj_SYMP_COMPLAINT){ }
    public void saveDiagnosisStage(){
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
    public void saveHeartFailure(){
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
    public void saveHypertension(){
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

            log.info("检验信息导入，UNIQUE_ID_LV1="+lisRecord.getUNIQUE_ID_LV1());
            inspectionService.saveInspection(inspection);
        }

    }
    public void saveTuberculosis(List<LIS_RECORD>  zj_LIS_RECORD){
        Tuberculosis tuberculosis;
        for(LIS_RECORD lisRecord:zj_LIS_RECORD){
            if(lisRecord.getTEST_PACKAGE_NAME() != null && lisRecord.getTEST_PACKAGE_NAME().contains("结核")){
                tuberculosis = new Tuberculosis();
                //标识患者身份唯一标识
                tuberculosis.setPersonId(lisRecord.getUNIQUE_ID_LV1());
                //唯一标识
                tuberculosis.setUniqueId(lisRecord.getUNIQUE_ID_LV2());
                //医疗机构代码
                tuberculosis.setP900(lisRecord.getP900());
                //患者id
                tuberculosis.setPatientId(lisRecord.getPATIENT_ID());
                //就诊标识住院号
                tuberculosis.setVisitId(lisRecord.getVISIT_ID());
                // 标本类型
                tuberculosis.setSpecimenMethod(lisRecord.getSPCM_TYPE_STD());
                //送检日期
                tuberculosis.setInspectionDate(lisRecord.getRESULT_DATE_TIME());
                //报告日期
                tuberculosis.setReportDate(lisRecord.getRESULT_RPT_DATE_TIME());

                if(StringUtils.isNotEmpty(lisRecord.getTEST_ITEM_NAME_STD())){
                    //结核分枝杆菌T细胞
                    tuberculosis.setTCell(lisRecord.getTEST_ITEM_NAME_STD().contains("结核分枝杆菌T细胞")?lisRecord.getRESULT():null);
                    //结核分枝杆菌抗体
                    tuberculosis.setAntibody(lisRecord.getTEST_ITEM_NAME_STD().contains("结核分枝杆菌抗体")?lisRecord.getRESULT():null);
                    //结核分枝杆菌抗体IgG
                    tuberculosis.setLgg(lisRecord.getTEST_ITEM_NAME_STD().contains("结核分枝杆菌抗体IgG")?lisRecord.getRESULT():null);
                    //结核分枝杆菌抗体IgM
                    tuberculosis.setLgm(lisRecord.getTEST_ITEM_NAME_STD().contains("结核分枝杆菌抗体IgM")?lisRecord.getRESULT():null);
                    // 结核杆菌感染判断
                    tuberculosis.setInfectionJudgment(lisRecord.getTEST_ITEM_NAME_STD().contains("结核杆菌感染判断")?lisRecord.getRESULT():null);
                    // 结核杆菌核酸检测
                    tuberculosis.setNuclein(lisRecord.getTEST_ITEM_NAME_STD().contains("结核杆菌核酸检测")?lisRecord.getRESULT():null);
                    // 结核感染T细胞-N
                    tuberculosis.setTCellN(lisRecord.getTEST_ITEM_NAME_STD().contains("结核感染T细胞-N")?lisRecord.getRESULT():null);
                    // 结核感染T细胞-P
                    tuberculosis.setTCellP(lisRecord.getTEST_ITEM_NAME_STD().contains("结核感染T细胞-P")?lisRecord.getRESULT():null);
                    // 结核感染T细胞-T
                    tuberculosis.setTCellT(lisRecord.getTEST_ITEM_NAME_STD().contains("结核感染T细胞-T")?lisRecord.getRESULT():null);
                }

                log.info("结核检测导入，UNIQUE_ID_LV1="+lisRecord.getUNIQUE_ID_LV1());
                tuberculosisService.saveTuberculosis(tuberculosis);
            }
        }

    }
   public void saveExamination(List<EXAM_MASTER>  zj_EXAM_MASTER){
        Examination examination;
        for(EXAM_MASTER examMaster:zj_EXAM_MASTER){
            examination = new Examination();
            //标识患者身份唯一标识
            examination.setPersonId(examMaster.getUNIQUE_ID_LV1());
            //唯一标识
            examination.setUniqueId(examMaster.getUNIQUE_ID_LV2());
            //医疗机构代码
            examination.setP900(examMaster.getP900());
            //患者id
            examination.setPatientId(examMaster.getPATIENT_ID());
            //住院号
            examination.setVisitId(examMaster.getVISIT_ID());
            //检查项目
            examination.setInspectName(examMaster.getEXAM_CLASS_STD());
            //身体部位
            StringBuffer sb = new StringBuffer();
            StringBuffer sb2 = new StringBuffer();
            if(StringUtils.isNotEmpty(examMaster.getSTRUCTURE1_STD())){
                sb.append(examMaster.getSTRUCTURE1_STD() + ",");
            }
            if(StringUtils.isNotEmpty(examMaster.getEXAM_MODE1_STD())){
                sb2.append(examMaster.getEXAM_MODE1_STD() + ",");
            }
            if(StringUtils.isNotEmpty(examMaster.getSTRUCTURE2_STD())){
                sb.append(examMaster.getSTRUCTURE2_STD() + ",");
            }
            if(StringUtils.isNotEmpty(examMaster.getEXAM_MODE2_STD())){
                sb2.append(examMaster.getEXAM_MODE2_STD() + ",");
            }
            if(StringUtils.isNotEmpty(examMaster.getSTRUCTURE3_STD())){
                sb.append(examMaster.getSTRUCTURE3_STD() + ",");
            }
            if(StringUtils.isNotEmpty(examMaster.getEXAM_MODE3_STD())){
                sb2.append(examMaster.getEXAM_MODE3_STD() + ",");
            }
            if(StringUtils.isNotEmpty(examMaster.getSTRUCTURE4_STD())){
                sb.append(examMaster.getSTRUCTURE4_STD() + ",");
            }
            if(StringUtils.isNotEmpty(examMaster.getEXAM_MODE4_STD())){
                sb2.append(examMaster.getEXAM_MODE4_STD() + ",");
            }
            if(StringUtils.isNotEmpty(examMaster.getSTRUCTURE5_STD())){
                sb.append(examMaster.getSTRUCTURE5_STD() + ",");
            }
            if(StringUtils.isNotEmpty(examMaster.getEXAM_MODE5_STD())){
                sb2.append(examMaster.getEXAM_MODE5_STD() + ",");
            }
            if(StringUtils.isNotEmpty(examMaster.getSTRUCTURE6_STD())){
                sb.append(examMaster.getSTRUCTURE6_STD() + ",");
            }
            if(StringUtils.isNotEmpty(examMaster.getEXAM_MODE6_STD())){
                sb2.append(examMaster.getEXAM_MODE6_STD() + ",");
            }
            if(StringUtils.isNotEmpty(examMaster.getSTRUCTURE7_STD())){
                sb.append(examMaster.getSTRUCTURE7_STD() + ",");
            }
            if(StringUtils.isNotEmpty(examMaster.getEXAM_MODE7_STD())){
                sb2.append(examMaster.getEXAM_MODE7_STD() + ",");
            }
            if(StringUtils.isNotEmpty(examMaster.getSTRUCTURE8_STD())){
                sb.append(examMaster.getSTRUCTURE8_STD() + ",");
            }
            if(StringUtils.isNotEmpty(examMaster.getEXAM_MODE8_STD())){
                sb2.append(examMaster.getEXAM_MODE8_STD() + ",");
            }
            if(StringUtils.isNotEmpty(examMaster.getSTRUCTURE9_STD())){
                sb.append(examMaster.getSTRUCTURE9_STD()+ ",");
            }
            if(StringUtils.isNotEmpty(examMaster.getEXAM_MODE2_STD())){
                sb2.append(examMaster.getEXAM_MODE2_STD() + ",");
            }
            examination.setBody(sb.toString());
            //检查方式
            examination.setWay(sb2.toString());
            //检查号
            examination.setInspectNo(examMaster.getEXAM_NO());
            //检查日期
            examination.setInspectDate(examMaster.getEXAM_DATE_TIME());
            //报告日期
            examination.setReprotDate(examMaster.getREPORT_DATE_TIME());
            //影像所见
            examination.setFinding(examMaster.getDESCRIPTION());
            //影像结论
            examination.setResult(examMaster.getENTRY_RESULTS());
            //转移瘤
            if(StringUtils.isNotEmpty(examMaster.getENTRY_RESULTS())){
                examination.setIfTransfer(examMaster.getENTRY_RESULTS().contains("转移")?"是":"否");
            }

//            //左侧肺结节或肿块
//            examination.setIfLeft();
//            //左侧肺结节或肿块数目
//            examination.setLeftNumber();
//            //左侧肺结节或肿块大小
//            examination.setLeftSize();
//            //右侧肺结节或肿块
//            examination.setIfRight();
//            //右侧肺结节或肿块数目
//            examination.setRightNumber();
//            //右侧肺结节或肿块大小
//            examination.setRightSize();

//        //数据版本
//        examination.setDataVersion();
//        //数据库来源
//        examination.setDataDbSource();
//        //数据表来源
//        examination.setDataTableSource();
//        //数据项来源
//        examination.setDataFieldSource();
//        //创建时间
//        examination.setCreatedAt();
//        //创建人
//        examination.setCreator();
//        //修改时间
//        examination.setUpdatedAt();
            examinationService.saveExamination(examination);
        }

    }
    public void saveTumorPuncture(List<PROCEDURE_RECORD>  zj_PROCEDURE_RECORD){
        TumorPuncture tumorPuncture;
        for(PROCEDURE_RECORD procedureRecord:zj_PROCEDURE_RECORD){
            tumorPuncture = new TumorPuncture();
            //标识患者身份唯一标识
            tumorPuncture.setPersonId(procedureRecord.getUNIQUE_ID_LV1());
            //唯一标识
            tumorPuncture.setUniqueId(procedureRecord.getUNIQUE_ID_LV2());
            //医疗机构代码
            tumorPuncture.setP900(procedureRecord.getP900());
            //患者id
            tumorPuncture.setPatientId(procedureRecord.getpatient_id());
            //住院号
            tumorPuncture.setVisitId(procedureRecord.getvisit_id());
            //肺肿瘤穿刺日期
            tumorPuncture.setInspectDate(procedureRecord.getrecord_time());
            //穿刺记录
            tumorPuncture.setInspectRecord(procedureRecord.getoperation_process());
//            //数据版本
//            tumorPuncture.setDataVersion();
//            //数据库来源
//            tumorPuncture.setDataDbSource();
//            //数据表来源
//            tumorPuncture.setDataTableSource();
//            //数据项来源
//            tumorPuncture.setDataFieldSource();
//            //创建时间
//            tumorPuncture.setCreatedAt();
//            //创建人
//            tumorPuncture.setCreator();
//            //修改时间
//            tumorPuncture.setUpdatedAt();
            log.info("肺肿瘤穿刺导入，UNIQUE_ID_LV1="+procedureRecord.getUNIQUE_ID_LV1());
            tumorPunctureService.saveTumorPuncture(tumorPuncture);
        }

    }
    public void saveOperationRecord(List<TEM_OPERATION_RECORD>  zj_TEM_OPERATION_RECORD){
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
            //手术入路
//            operationRecord.setRoute();
            if(StringUtils.isNotEmpty(temOperationRecord.getRCPT_NO())){
                //淋巴结清扫
                operationRecord.setLnd(temOperationRecord.getRCPT_NO().contains("清扫")?"是":"否");
            }
            //手术名称
            operationRecord.setOperationName(temOperationRecord.getRCPT_NO());
            //术中出血量
            operationRecord.setMabl(temOperationRecord.getBLEEDING_VOLUME()==null?null:Double.valueOf(temOperationRecord.getBLEEDING_VOLUME()));
            //手术开始时间
            operationRecord.setStartTime(temOperationRecord.getITEM_BEGIN_DATE());
            //手术结束时间
            operationRecord.setEndTime(temOperationRecord.getITEM_END_DATE());
            //手术记录
            operationRecord.setRecord(temOperationRecord.getSURGICAL_PROCESS());
//            //数据版本
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
            log.info("手术信息导入，UNIQUE_ID_LV1="+temOperationRecord.getUNIQUE_ID_LV1());
            operationRecordService.saveOperationRecord(operationRecord);
        }

    }
    public void savePathological(){
//        Pathological pathological = new Pathological();
//        //主键id
//        pathological.setId();
//        //标识患者身份唯一标识
//        pathological.setPersonId();
//        //唯一标识
//        pathological.setUniqueId();
//        //医疗机构代码
//        pathological.setP900();
//        //患者id
//        pathological.setPatientId();
//        //住院号
//        pathological.setVisitId();
//        //病理号
//        pathological.setCaseNumber();
//        //送检标本名称
//        pathological.setSpecimenName();
//        //送检日期
//        pathological.setCensorshipTime();
//        //收到日期
//        pathological.setInspectTime();
//        //报告日期
//        pathological.setReprotTime();
//        //肿瘤部位
//        pathological.setTumorLocation();
//        //是否原位癌
//        pathological.setIfOriginalLocation();
//        //病理类型
//        pathological.setPathologicalType();
//        //分化程度
//        pathological.setDifferentiationDegree();
//        //累及主支气管
//        pathological.setIfInvolveBronchus();
//        //侵犯脏层胸膜
//        pathological.setIfInvasionPleura();
//        //脉管癌栓
//        pathological.setIfArtery();
//        //侵犯神经
//        pathological.setIfInvasionNerve();
//        //手术切缘累及情况
//        pathological.setOperation();
//        //淋巴结分区
//        pathological.setLymphNodePartition();
//        //送检淋巴结总数
//        pathological.setLymphNodeTotal();
//        //淋巴结转移数量
//        pathological.setTransferNumber();
//        //淋巴结转移
//        pathological.setIfTransfer();
//        //免疫组化标志物名称
//        pathological.setMarkerName();
//        //免疫组化标志物检测定性结果
//        pathological.setMarkerQualitative();
//        //免疫组化标志物检测定量结果
//        pathological.setMarkerQuantify();
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
    }
    public void saveTreatment(List<DRUG_ORDER>  zj_DRUG_ORDER){
        Treatment treatment;
        for(DRUG_ORDER drugOrder:zj_DRUG_ORDER){
            treatment = new Treatment();
            //标识患者身份唯一标识
            treatment.setPersonId(drugOrder.getUNIQUE_ID_LV1());
            //唯一标识
            treatment.setUniqueId(drugOrder.getUNIQUE_ID_LV2());
            //医疗机构代码
            treatment.setP900(drugOrder.getP900());
            //患者id
            treatment.setPatientId(drugOrder.getPATIENT_ID());
            //住院号
            treatment.setVisitId(drugOrder.getVISIT_ID());
            //用药分类
            treatment.setDrugType(DrugConstant.getDrugType(drugOrder.getDRUG_NAME()));
            //具体药物名称
            treatment.setDrugName(drugOrder.getDRUG_NAME());
            //给药途径
            treatment.setChannel(drugOrder.getADMINISTRATION());
            //药物剂量
            treatment.setDose(drugOrder.getDOSAGE());
            //剂量单位
            treatment.setUnit(drugOrder.getDOSAGE_UNITS());
            //用药开始日期
            treatment.setStartDate(drugOrder.getENTER_DATE_TIME());
            //用药结束日期
            treatment.setEndDate(drugOrder.getSTOP_ORDER_DATE_TIME());
//            //数据版本
//            treatment.setDataVersion();
//            //数据库来源
//            treatment.setDataDbSource();
//            //数据表来源
//            treatment.setDataTableSource();
//            //数据项来源
//            treatment.setDataFieldSource();
//            //创建时间
//            treatment.setCreatedAt();
//            //创建人
//            treatment.setCreator();
//            //修改时间
//            treatment.setUpdatedAt();
            log.info("药物治疗导入，UNIQUE_ID_LV1="+drugOrder.getUNIQUE_ID_LV1());
            treatmentService.saveTreatment(treatment);
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
            *//**
             * 放疗部位表
             *//*
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

    }*/


}