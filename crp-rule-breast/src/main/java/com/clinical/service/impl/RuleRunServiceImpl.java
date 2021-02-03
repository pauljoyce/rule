package com.clinical.service.impl;

import com.clinical.model.cluster.*;
import com.clinical.model.master.*;
import com.clinical.dao.master.*;
import com.clinical.dao.cluster.*;
import com.clinical.service.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RuleRunServiceImpl implements RuleRunService {
           @Autowired
           PersonService    personService;


           @Autowired
           VisitRecordService    visitRecordService;


           @Autowired
           IndexPersonService    indexPersonService;


           @Autowired
           IndexDiagnosisAdmitService    indexDiagnosisAdmitService;


           @Autowired
           IndexDiagnosisClinicService    indexDiagnosisClinicService;


           @Autowired
           IndexOperationService    indexOperationService;


           @Autowired
           IndexDiagnosisMainService    indexDiagnosisMainService;


           @Autowired
           IndexDiagnosisOtherService    indexDiagnosisOtherService;


           @Autowired
           IndexIcuService    indexIcuService;


           @Autowired
           IndexPathologyService    indexPathologyService;


           @Autowired
           IndexInjuryService    indexInjuryService;


           @Autowired
           PersonGeneralService    personGeneralService;


           @Autowired
           HisVitalSignService    hisVitalSignService;


           @Autowired
           HisPersonService    hisPersonService;


           @Autowired
           HisFamilyService    hisFamilyService;


           @Autowired
           HisPastService    hisPastService;


           @Autowired
           HisMarriageService    hisMarriageService;


           @Autowired
           SymptomService    symptomService;


           @Autowired
           DiagnosisService    diagnosisService;


           @Autowired
           DiagnosisStageService    diagnosisStageService;


           @Autowired
           HeartFailureService    heartFailureService;


           @Autowired
           HypertensionService    hypertensionService;


           @Autowired
           InspectionService    inspectionService;


           @Autowired
           ExaminationService    examinationService;


           @Autowired
           ExamDescriptionService    examDescriptionService;


           @Autowired
           PunctureService    punctureService;


           @Autowired
           OperationRecordService    operationRecordService;


           @Autowired
           PathologicalService    pathologicalService;


           @Autowired
           ImmuneService    immuneService;


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
           CancerPainTreatmentService    cancerPainTreatmentService;


           @Autowired
           CartService    cartService;


           @Autowired
           StemCellsService    stemCellsService;


           @Autowired
           BloodTransfusionService    bloodTransfusionService;


           @Autowired
           FollowUpService    followUpService;


           @Autowired
           ZjBasyStdMapper    zjBasyStdMapper;

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
           ZjBreastMgDescriptionMapper    zjBreastMgDescriptionMapper;

           @Autowired
           ZjBreastMgEntryResultsMapper    zjBreastMgEntryResultsMapper;

           @Autowired
           ZjBreastUsDescriptionMapper    zjBreastUsDescriptionMapper;

           @Autowired
           ZjBreastUsEntryResultsMapper    zjBreastUsEntryResultsMapper;

           @Autowired
           ZjClinicalDiagMapper    zjClinicalDiagMapper;

           @Autowired
           ZjConcomitantDiseaseMapper    zjConcomitantDiseaseMapper;

           @Autowired
           ZjFamilyHistoryMapper    zjFamilyHistoryMapper;

           @Autowired
           ZjIhcMarkerMapper    zjIhcMarkerMapper;

           @Autowired
           ZjPathologyMapper    zjPathologyMapper;

           @Autowired
           ZjSmokeAndDrinkMapper    zjSmokeAndDrinkMapper;

           @Autowired
           ZjSurgeryNameMapper    zjSurgeryNameMapper;

           @Autowired
           ZjSympComplaintMapper    zjSympComplaintMapper;

           @Autowired
           ZjMarrChildHistoryMapper    zjMarrChildHistoryMapper;

           @Autowired
           ZjMenstrualHistoryMapper    zjMenstrualHistoryMapper;

           @Autowired
           ZjSpecialityExamMapper    zjSpecialityExamMapper;

         @Override
          public void saveRuleRun(Integer pageNo, Integer pageSize, String flag) {
                 List<BASY_STD>  zj_BASY_STD =  zjBasyStdMapper.findZjBasyStdByUniqueId(uniqueId);
                 List<TEM_PAT_MASTER_INDEX>  zj_TEM_PAT_MASTER_INDEX =  zjTemPatMasterIndexMapper.findZjTemPatMasterIndexByUniqueId(uniqueId);
                 List<PAT_VISIT_MASTER>  zj_PAT_VISIT_MASTER =  zjPatVisitMasterMapper.findZjPatVisitMasterByUniqueId(uniqueId);
                 List<INP_DIAGNOSIS>  zj_INP_DIAGNOSIS =  zjInpDiagnosisMapper.findZjInpDiagnosisByUniqueId(uniqueId);
                 List<LIS_RECORD>  zj_LIS_RECORD =  zjLisRecordMapper.findZjLisRecordByUniqueId(uniqueId);
                 List<LAB_MICRO_RESULT>  zj_LAB_MICRO_RESULT =  zjLabMicroResultMapper.findZjLabMicroResultByUniqueId(uniqueId);
                 List<EXAM_MASTER>  zj_EXAM_MASTER =  zjExamMasterMapper.findZjExamMasterByUniqueId(uniqueId);
                 List<HISTOLOGY_REPORT>  zj_HISTOLOGY_REPORT =  zjHistologyReportMapper.findZjHistologyReportByUniqueId(uniqueId);
                 List<TEM_OPERATION_RECORD>  zj_TEM_OPERATION_RECORD =  zjTemOperationRecordMapper.findZjTemOperationRecordByUniqueId(uniqueId);
                 List<PROCEDURE_RECORD>  zj_PROCEDURE_RECORD =  zjProcedureRecordMapper.findZjProcedureRecordByUniqueId(uniqueId);
                 List<TEM_DEATH_RECORD>  zj_TEM_DEATH_RECORD =  zjTemDeathRecordMapper.findZjTemDeathRecordByUniqueId(uniqueId);
                 List<NURSING_RECORD>  zj_NURSING_RECORD =  zjNursingRecordMapper.findZjNursingRecordByUniqueId(uniqueId);
                 List<VITAL_RECORD>  zj_VITAL_RECORD =  zjVitalRecordMapper.findZjVitalRecordByUniqueId(uniqueId);
                 List<FOLLOW_UP>  zj_FOLLOW_UP =  zjFollowUpMapper.findZjFollowUpByUniqueId(uniqueId);
                 List<DRUG_ORDER>  zj_DRUG_ORDER =  zjDrugOrderMapper.findZjDrugOrderByUniqueId(uniqueId);
                 List<TEM_CHEMOTHERAPY>  zj_TEM_CHEMOTHERAPY =  zjTemChemotherapyMapper.findZjTemChemotherapyByUniqueId(uniqueId);
                 List<TEM_RADIOTHERAPY>  zj_TEM_RADIOTHERAPY =  zjTemRadiotherapyMapper.findZjTemRadiotherapyByUniqueId(uniqueId);
                 List<TEM_INP_ADMISSION_STATUS>  zj_TEM_INP_ADMISSION_STATUS =  zjTemInpAdmissionStatusMapper.findZjTemInpAdmissionStatusByUniqueId(uniqueId);
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
                 List<BREAST_MG_DESCRIPTION>  zj_breast_mg_description =  zjBreastMgDescriptionMapper.findZjBreastMgDescriptionByUniqueId(uniqueId);
                 List<BREAST_MG_ENTRY_RESULTS>  zj_breast_mg_entry_results =  zjBreastMgEntryResultsMapper.findZjBreastMgEntryResultsByUniqueId(uniqueId);
                 List<BREAST_US_DESCRIPTION>  zj_breast_us_description =  zjBreastUsDescriptionMapper.findZjBreastUsDescriptionByUniqueId(uniqueId);
                 List<BREAST_US_ENTRY_RESULTS>  zj_breast_us_entry_results =  zjBreastUsEntryResultsMapper.findZjBreastUsEntryResultsByUniqueId(uniqueId);
                 List<CLINICAL_DIAG>  zj_clinical_diag =  zjClinicalDiagMapper.findZjClinicalDiagByUniqueId(uniqueId);
                 List<CONCOMITANT_DISEASE>  zj_concomitant_disease =  zjConcomitantDiseaseMapper.findZjConcomitantDiseaseByUniqueId(uniqueId);
                 List<FAMILY_HISTORY>  zj_family_history =  zjFamilyHistoryMapper.findZjFamilyHistoryByUniqueId(uniqueId);
                 List<IHC_MARKER>  zj_ihc_marker =  zjIhcMarkerMapper.findZjIhcMarkerByUniqueId(uniqueId);
                 List<PATHOLOGY>  zj_pathology =  zjPathologyMapper.findZjPathologyByUniqueId(uniqueId);
                 List<SMOKE_AND_DRINK>  zj_smoke_and_drink =  zjSmokeAndDrinkMapper.findZjSmokeAndDrinkByUniqueId(uniqueId);
                 List<SURGERY_NAME>  zj_surgery_name =  zjSurgeryNameMapper.findZjSurgeryNameByUniqueId(uniqueId);
                 List<SYMP_COMPLAINT>  zj_symp_complaint =  zjSympComplaintMapper.findZjSympComplaintByUniqueId(uniqueId);
                 List<MARR_CHILD_HISTORY>  zj_marr_child_history =  zjMarrChildHistoryMapper.findZjMarrChildHistoryByUniqueId(uniqueId);
                 List<MENSTRUAL_HISTORY>  zj_menstrual_history =  zjMenstrualHistoryMapper.findZjMenstrualHistoryByUniqueId(uniqueId);
                 List<SPECIALITY_EXAM>  zj_speciality_exam =  zjSpecialityExamMapper.findZjSpecialityExamByUniqueId(uniqueId);
           }
         public void savePerson(){
                 Person person = new Person();
                    //唯一标识
                   person.setPersonId();
                    //医疗机构代码
                   person.setP900();
                    //患者id
                   person.setPatientId();
                    //住院号
                   person.setVisitId();
                    //姓名
                   person.setName();
                    //性别
                   person.setSex();
                    //出生日期
                   person.setDateOfBirth();
                    //出生地
                   person.setBirthPlace();
                    //国籍
                   person.setCitizenship();
                    //民族
                   person.setNation();
                    //身份证号
                   person.setIdNo();
                    //合同单位
                   person.setUnitInContract();
                    //住址
                   person.setMailingAddress();
                    //联系人
                   person.setNextOfKin();
                    //联系电话
                   person.setTelephone();
                    //与联系人关系
                   person.setRelationship();
                    //入院来源
                   person.setPatientClass();
                    //数据版本
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
                    person.setUpdatedAt();
            personService.savePerson(person);
            }
         public void saveVisitRecord(){
                 VisitRecord visitRecord = new VisitRecord();
                    //标识患者身份唯一标识
                   visitRecord.setPersonId();
                    //唯一标识
                   visitRecord.setUniqueId();
                    //医疗机构代码
                   visitRecord.setP900();
                    //患者id
                   visitRecord.setPatientId();
                    //就诊类型
                   visitRecord.setVisitType();
                    //住院号
                   visitRecord.setVisitId();
                    //入院日期
                   visitRecord.setAdmissionDateTime();
                    //出院日期
                   visitRecord.setDischargeDateTime();
                    //入院科室
                   visitRecord.setDeptAdmissionTo();
                    //出院科室
                   visitRecord.setDeptDischargeFrom();
                    //住院次数
                   visitRecord.setAdmissionNumber();
                    //就诊医院
                   visitRecord.setP900Name();
                    //就诊类型汉字
                   visitRecord.setVisitSourceValue();
                    //数据版本
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
                    visitRecord.setUpdatedAt();
            visitRecordService.saveVisitRecord(visitRecord);
            }
         public void saveIndexPerson(){
                 IndexPerson indexPerson = new IndexPerson();
                    //标识患者身份唯一标识
                   indexPerson.setPersonId();
                    //唯一标识
                   indexPerson.setUniqueId();
                    //患者id
                   indexPerson.setPatientId();
                    //住院号
                   indexPerson.setVisitId();
                    //医疗机构代码
                   indexPerson.setP900();
                    //机构名称
                   indexPerson.setP6891();
                    //医疗保险手册（卡）号
                   indexPerson.setP686();
                    //健康卡号
                   indexPerson.setP800();
                    //医疗付款方式
                   indexPerson.setP1();
                    //住院次数
                   indexPerson.setP2();
                    //病案号
                   indexPerson.setP3();
                    //姓名
                   indexPerson.setP4();
                    //性别
                   indexPerson.setP5();
                    //出生日期
                   indexPerson.setP6();
                    //年龄
                   indexPerson.setP7();
                    //婚姻状况
                   indexPerson.setP8();
                    //职业
                   indexPerson.setP9();
                    //出生省份
                   indexPerson.setP101();
                    //出生地市
                   indexPerson.setP102();
                    //出生地县
                   indexPerson.setP103();
                    //民族
                   indexPerson.setP11();
                    //国籍
                   indexPerson.setP12();
                    //身份证号
                   indexPerson.setP13();
                    //现住址
                   indexPerson.setP801();
                    //住宅电话
                   indexPerson.setP802();
                    //现住址邮政编码
                   indexPerson.setP803();
                    //工作单位及地址
                   indexPerson.setP14();
                    //电话
                   indexPerson.setP15();
                    //工作单位邮政编码
                   indexPerson.setP16();
                    //户口地址
                   indexPerson.setP17();
                    //户口所在地邮政编码
                   indexPerson.setP171();
                    //联系人姓名
                   indexPerson.setP18();
                    //关系
                   indexPerson.setP19();
                    //联系人地址
                   indexPerson.setP20();
                    //入院途径
                   indexPerson.setP804();
                    //联系人电话
                   indexPerson.setP21();
                    //入院日期
                   indexPerson.setP22();
                    //入院科室
                   indexPerson.setP23();
                    //入院病室
                   indexPerson.setP231();
                    //转科科室
                   indexPerson.setP24();
                    //出院日期
                   indexPerson.setP25();
                    //出院科室
                   indexPerson.setP26();
                    //出院病室
                   indexPerson.setP261();
                    //实际住院天数
                   indexPerson.setP27();
                    //入院时情况
                   indexPerson.setP29();
                    //入院后确诊日期
                   indexPerson.setP31();
                    //医院感染总次数
                   indexPerson.setP689();
                    //过敏源
                   indexPerson.setP371();
                    //过敏药物名称
                   indexPerson.setP372();
                    //HBsAg
                   indexPerson.setP38();
                    //HCV-Ab
                   indexPerson.setP39();
                    //HIV-Ab
                   indexPerson.setP40();
                    //门诊与出院诊断符合情况
                   indexPerson.setP411();
                    //入院与出院诊断符合情况
                   indexPerson.setP412();
                    //术前与术后诊断符合情况
                   indexPerson.setP413();
                    //临床与病理诊断符合情况
                   indexPerson.setP414();
                    //放射与病理诊断符合情况
                   indexPerson.setP415();
                    //抢救次数
                   indexPerson.setP421();
                    //抢救成功次数
                   indexPerson.setP422();
                    //最高诊断依据
                   indexPerson.setP687();
                    //分化程度
                   indexPerson.setP688();
                    //科主任
                   indexPerson.setP431();
                    //主(副主)任医师
                   indexPerson.setP432();
                    //主治医师
                   indexPerson.setP433();
                    //住院医师
                   indexPerson.setP434();
                    //责任护士
                   indexPerson.setP819();
                    //进修医师
                   indexPerson.setP435();
                    //研究生实习医师
                   indexPerson.setP436();
                    //实习医师
                   indexPerson.setP437();
                    //编码员
                   indexPerson.setP438();
                    //病案质量
                   indexPerson.setP44();
                    //质控医师
                   indexPerson.setP45();
                    //质控护师
                   indexPerson.setP46();
                    //质控日期
                   indexPerson.setP47();
                    //特级护理天数
                   indexPerson.setP561();
                    //一级护理天数
                   indexPerson.setP562();
                    //二级护理天数
                   indexPerson.setP563();
                    //三级护理天数
                   indexPerson.setP564();
                    //死亡患者尸检
                   indexPerson.setP57();
                    //手术、治疗、检查、诊断为本院第一例
                   indexPerson.setP58();
                    //手术患者类型
                   indexPerson.setP581();
                    //随诊
                   indexPerson.setP60();
                    //随诊周数
                   indexPerson.setP611();
                    //随诊月数
                   indexPerson.setP612();
                    //随诊年数
                   indexPerson.setP613();
                    //示教病例
                   indexPerson.setP59();
                    //ABO血型
                   indexPerson.setP62();
                    //Rh血型
                   indexPerson.setP63();
                    //输血反应
                   indexPerson.setP64();
                    //红细胞
                   indexPerson.setP651();
                    //血小板
                   indexPerson.setP652();
                    //血浆
                   indexPerson.setP653();
                    //全血
                   indexPerson.setP654();
                    //自体回收
                   indexPerson.setP655();
                    //其它
                   indexPerson.setP656();
                    //（年龄不足1周岁的）年龄
                   indexPerson.setP66();
                    //新生儿出生体重
                   indexPerson.setP681();
                    //新生儿入院体重
                   indexPerson.setP67();
                    //入院前多少小时(颅脑损伤患者昏迷时间)
                   indexPerson.setP731();
                    //入院前多少分钟(颅脑损伤患者昏迷时间)
                   indexPerson.setP732();
                    //入院后多少小时(颅脑损伤患者昏迷时间)
                   indexPerson.setP733();
                    //入院后多少分钟(颅脑损伤患者昏迷时间)
                   indexPerson.setP734();
                    //呼吸机使用时间
                   indexPerson.setP72();
                    //是否有出院31天内再住院计划
                   indexPerson.setP830();
                    //出院31天再住院计划目的
                   indexPerson.setP831();
                    //离院方式
                   indexPerson.setP741();
                    //转入医院名称
                   indexPerson.setP742();
                    //转入社区服务机构/乡镇卫生院名称
                   indexPerson.setP743();
                    //住院总费用
                   indexPerson.setP782();
                    //住院总费用其中自付金额
                   indexPerson.setP751();
                    //一般医疗服务费
                   indexPerson.setP752();
                    //一般治疗操作费
                   indexPerson.setP754();
                    //护理费
                   indexPerson.setP755();
                    //综合医疗服务类其他费用
                   indexPerson.setP756();
                    //病理诊断费
                   indexPerson.setP757();
                    //实验室诊断费
                   indexPerson.setP758();
                    //影像学诊断费
                   indexPerson.setP759();
                    //临床诊断项目费
                   indexPerson.setP760();
                    //非手术治疗项目费
                   indexPerson.setP761();
                    //临床物理治疗费
                   indexPerson.setP762();
                    //手术治疗费
                   indexPerson.setP763();
                    //麻醉费
                   indexPerson.setP764();
                    //手术费
                   indexPerson.setP765();
                    //康复费
                   indexPerson.setP767();
                    //中医治疗费
                   indexPerson.setP768();
                    //西药费
                   indexPerson.setP769();
                    //抗菌药物费用
                   indexPerson.setP770();
                    //中成药费
                   indexPerson.setP771();
                    //中草药费
                   indexPerson.setP772();
                    //血费
                   indexPerson.setP773();
                    //白蛋白类制品费
                   indexPerson.setP774();
                    //球蛋白类制品费
                   indexPerson.setP775();
                    //凝血因子类制品费
                   indexPerson.setP776();
                    //细胞因子类制品费
                   indexPerson.setP777();
                    //检查用一次性医用材料费
                   indexPerson.setP778();
                    //治疗用一次性医用材料费
                   indexPerson.setP779();
                    //手术用一次性医用材料费
                   indexPerson.setP780();
                    //其他费
                   indexPerson.setP781();
                    //数据版本
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
                    indexPerson.setUpdatedAt();
            indexPersonService.saveIndexPerson(indexPerson);
            }
         public void saveIndexDiagnosisAdmit(){
                 IndexDiagnosisAdmit indexDiagnosisAdmit = new IndexDiagnosisAdmit();
                    //标识患者身份唯一标识
                   indexDiagnosisAdmit.setPersonId();
                    //唯一标识
                   indexDiagnosisAdmit.setUniqueId();
                    //医疗机构代码
                   indexDiagnosisAdmit.setP900();
                    //患者id
                   indexDiagnosisAdmit.setPatientId();
                    //住院号
                   indexDiagnosisAdmit.setVisitId();
                    //入院诊断编码
                   indexDiagnosisAdmit.setP30();
                    //入院诊断描述名称
                   indexDiagnosisAdmit.setP301();
                    //数据版本
                   indexDiagnosisAdmit.setDataVersion();
                    //数据库来源
                   indexDiagnosisAdmit.setDataDbSource();
                    //数据表来源
                   indexDiagnosisAdmit.setDataTableSource();
                    //数据项来源
                   indexDiagnosisAdmit.setDataFieldSource();
                    //创建时间
                   indexDiagnosisAdmit.setCreatedAt();
                    //创建人
                   indexDiagnosisAdmit.setCreator();
                    //修改时间
                    indexDiagnosisAdmit.setUpdatedAt();
            indexDiagnosisAdmitService.saveIndexDiagnosisAdmit(indexDiagnosisAdmit);
            }
         public void saveIndexDiagnosisClinic(){
                 IndexDiagnosisClinic indexDiagnosisClinic = new IndexDiagnosisClinic();
                    //标识患者身份唯一标识
                   indexDiagnosisClinic.setPersonId();
                    //唯一标识
                   indexDiagnosisClinic.setUniqueId();
                    //医疗机构代码
                   indexDiagnosisClinic.setP900();
                    //患者id
                   indexDiagnosisClinic.setPatientId();
                    //住院号
                   indexDiagnosisClinic.setVisitId();
                    //门诊诊断编码
                   indexDiagnosisClinic.setP28();
                    //门诊诊断名称
                   indexDiagnosisClinic.setP281();
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
                    indexDiagnosisClinic.setUpdatedAt();
            indexDiagnosisClinicService.saveIndexDiagnosisClinic(indexDiagnosisClinic);
            }
         public void saveIndexOperation(){
                 IndexOperation indexOperation = new IndexOperation();
                    //标识患者身份唯一标识
                   indexOperation.setPersonId();
                    //唯一标识
                   indexOperation.setUniqueId();
                    //医疗机构代码
                   indexOperation.setP900();
                    //患者id
                   indexOperation.setPatientId();
                    //住院号
                   indexOperation.setVisitId();
                    //手术/操作编码
                   indexOperation.setP490();
                    //手术/操作日期
                   indexOperation.setP491();
                    //手术级别
                   indexOperation.setP820();
                    //手术/操作名称
                   indexOperation.setP492();
                    //手术/操作部位
                   indexOperation.setP493();
                    //手术持续时间
                   indexOperation.setP494();
                    //术者
                   indexOperation.setP495();
                    //Ⅰ助
                   indexOperation.setP496();
                    //Ⅱ助
                   indexOperation.setP497();
                    //麻醉方式
                   indexOperation.setP498();
                    //麻醉分级
                   indexOperation.setP4981();
                    //切口愈合等级
                   indexOperation.setP499();
                    //麻醉医师
                   indexOperation.setP4910();
                    //数据版本
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
                    indexOperation.setUpdatedAt();
            indexOperationService.saveIndexOperation(indexOperation);
            }
         public void saveIndexDiagnosisMain(){
                 IndexDiagnosisMain indexDiagnosisMain = new IndexDiagnosisMain();
                    //标识患者身份唯一标识
                   indexDiagnosisMain.setPersonId();
                    //唯一标识
                   indexDiagnosisMain.setUniqueId();
                    //医疗机构代码
                   indexDiagnosisMain.setP900();
                    //患者id
                   indexDiagnosisMain.setPatientId();
                    //住院号
                   indexDiagnosisMain.setVisitId();
                    //主要诊断编码
                   indexDiagnosisMain.setP321();
                    //主要诊断疾病描述
                   indexDiagnosisMain.setP322();
                    //主要诊断入院病情
                   indexDiagnosisMain.setP805();
                    //主要诊断出院情况
                   indexDiagnosisMain.setP323();
                    //数据版本
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
                    indexDiagnosisMain.setUpdatedAt();
            indexDiagnosisMainService.saveIndexDiagnosisMain(indexDiagnosisMain);
            }
         public void saveIndexDiagnosisOther(){
                 IndexDiagnosisOther indexDiagnosisOther = new IndexDiagnosisOther();
                    //标识患者身份唯一标识
                   indexDiagnosisOther.setPersonId();
                    //唯一标识
                   indexDiagnosisOther.setUniqueId();
                    //医疗机构代码
                   indexDiagnosisOther.setP900();
                    //患者id
                   indexDiagnosisOther.setPatientId();
                    //住院号
                   indexDiagnosisOther.setVisitId();
                    //诊断编码
                   indexDiagnosisOther.setP324();
                    //诊断疾病描述
                   indexDiagnosisOther.setP325();
                    //诊断入院病情
                   indexDiagnosisOther.setP806();
                    //诊断出院情况
                   indexDiagnosisOther.setP326();
                    //数据版本
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
                    indexDiagnosisOther.setUpdatedAt();
            indexDiagnosisOtherService.saveIndexDiagnosisOther(indexDiagnosisOther);
            }
         public void saveIndexIcu(){
                 IndexIcu indexIcu = new IndexIcu();
                    //标识患者身份唯一标识
                   indexIcu.setPersonId();
                    //唯一标识
                   indexIcu.setUniqueId();
                    //医疗机构代码
                   indexIcu.setP900();
                    //患者id
                   indexIcu.setPatientId();
                    //住院号
                   indexIcu.setVisitId();
                    //重症监护室名称
                   indexIcu.setP6911();
                    //进入时间
                   indexIcu.setP6912();
                    //退出时间
                   indexIcu.setP6913();
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
                    indexIcu.setUpdatedAt();
            indexIcuService.saveIndexIcu(indexIcu);
            }
         public void saveIndexPathology(){
                 IndexPathology indexPathology = new IndexPathology();
                    //标识患者身份唯一标识
                   indexPathology.setPersonId();
                    //唯一标识
                   indexPathology.setUniqueId();
                    //医疗机构代码
                   indexPathology.setP900();
                    //患者id
                   indexPathology.setPatientId();
                    //住院号
                   indexPathology.setVisitId();
                    //病理诊断编码
                   indexPathology.setP351();
                    //病理诊断名称
                   indexPathology.setP352();
                    //病理号
                   indexPathology.setP816();
                    //数据版本
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
                    indexPathology.setUpdatedAt();
            indexPathologyService.saveIndexPathology(indexPathology);
            }
         public void saveIndexInjury(){
                 IndexInjury indexInjury = new IndexInjury();
                    //标识患者身份唯一标识
                   indexInjury.setPersonId();
                    //唯一标识
                   indexInjury.setUniqueId();
                    //医疗机构代码
                   indexInjury.setP900();
                    //患者id
                   indexInjury.setPatientId();
                    //住院号
                   indexInjury.setVisitId();
                    //损伤、中毒的外部因素编码
                   indexInjury.setP361();
                    //损伤、中毒的外部因素名称
                   indexInjury.setP362();
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
                    indexInjury.setUpdatedAt();
            indexInjuryService.saveIndexInjury(indexInjury);
            }
         public void savePersonGeneral(){
                 PersonGeneral personGeneral = new PersonGeneral();
                    //标识患者身份唯一标识
                   personGeneral.setPersonId();
                    //唯一标识
                   personGeneral.setUniqueId();
                    //医疗机构代码
                   personGeneral.setP900();
                    //患者id
                   personGeneral.setPatientId();
                    //住院号
                   personGeneral.setVisitId();
                    //日期
                   personGeneral.setRecordTime();
                    //呼吸
                   personGeneral.setBreathingFrequency();
                    //脉搏
                   personGeneral.setHeartRate();
                    //体温
                   personGeneral.setBodyTemperature();
                    //收缩压
                   personGeneral.setSystolicBloodPressure();
                    //舒张压
                   personGeneral.setDiastolicBloodPressure();
                    //身高
                   personGeneral.setHeight();
                    //体重
                   personGeneral.setWeight();
                    //数据版本
                   personGeneral.setDataVersion();
                    //数据库来源
                   personGeneral.setDataDbSource();
                    //数据表来源
                   personGeneral.setDataTableSource();
                    //数据项来源
                   personGeneral.setDataFieldSource();
                    //创建时间
                   personGeneral.setCreatedAt();
                    //创建人
                   personGeneral.setCreator();
                    //修改时间
                    personGeneral.setUpdatedAt();
            personGeneralService.savePersonGeneral(personGeneral);
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
                   hisPast.setOtherBreastDiseases();
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
         public void saveHisMarriage(){
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
                   hisMarriage.setMenarcheAge();
                    //月经出血量
                   hisMarriage.setMenseBlood();
                    //月经周期
                   hisMarriage.setMenseCycle();
                    //月经规律
                   hisMarriage.setMenseRegular();
                    //口服避孕药
                   hisMarriage.setOralContraceptives();
                    //怀孕次数
                   hisMarriage.setPregnanciesNumber();
                    //生产次数
                   hisMarriage.setProductionNumber();
                    //试管婴儿史
                   hisMarriage.setIvf();
                    //停经、绝经
                   hisMarriage.setMenelipsis();
                    //末次月经
                   hisMarriage.setLast();
                    //停经、绝经年龄
                   hisMarriage.setLastAge();
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
         public void saveSymptom(){
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
                    //乳头外观
                   symptom.setAppearance();
                    //乳头溢液情况
                   symptom.setNippleOverflow();
                    //乳头溢液部位
                   symptom.setNippleOverflowSite();
                    //乳头溢液孔
                   symptom.setNippleOverflowHole();
                    //乳头溢液的颜色
                   symptom.setNippleOverflowColor();
                    //乳房包块数目
                   symptom.setMassesNumber();
                    //乳房包块距乳头距离
                   symptom.setMassNippleDistance();
                    //乳房包块与乳房的相对位置
                   symptom.setRelativePosition();
                    //乳房包块位置（象限）
                   symptom.setLocationQuadrant();
                    //乳房包块位置（以钟点方式定位）
                   symptom.setLocationInClock();
                    //乳房包块活动度
                   symptom.setMassActivity();
                    //乳房包块与胸壁情况
                   symptom.setMassChest();
                    //乳房包块表面皮肤外观
                   symptom.setSkinAppearance();
                    //乳房包块表面皮肤光滑程度
                   symptom.setSkinSmoothness();
                    //乳房包块痛感
                   symptom.setLumpPain();
                    //乳房包块质地
                   symptom.setMassTexture();
                    //乳房包块边缘情况
                   symptom.setMassEdge();
                    //乳晕水肿
                   symptom.setAreolaEdema();
                    //疼痛情况
                   symptom.setPain();
                    //腋窝肿块
                   symptom.setAxillaryMass();
                    //乳晕水肿
                   symptom.setAreolaEdema();
                    //炎性乳腺癌
                   symptom.setInflammatoryCancer();
                    //心力衰竭症状
                   symptom.setHeartFailure();
                    //其它症状和体征
                   symptom.setOtherSymptoms();
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
         public void saveDiagnosis(){
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
         public void saveInspection(){
                 Inspection inspection = new Inspection();
                    //标识患者身份唯一标识
                   inspection.setPersonId();
                    //唯一标识
                   inspection.setUniqueId();
                    //医疗机构代码
                   inspection.setP900();
                    //患者id
                   inspection.setPatientId();
                    //就诊类型
                   inspection.setVisitType();
                    //门诊/住院号
                   inspection.setVisitId();
                    //住院次数
                   inspection.setAdmissionNumber();
                    //检验系统编号
                   inspection.setTestNo();
                    //标本类型
                   inspection.setSpcmType();
                    //标本采样时间
                   inspection.setSpcmSampleDateTime();
                    //标本接收时间
                   inspection.setSpcmReceivedDateTime();
                    //申请时间
                   inspection.setRequestedDateTime();
                    //报告时间
                   inspection.setResultRptDateTime();
                    //检查时间
                   inspection.setResultDateTime();
                    //打印序号
                   inspection.setPrintOrder();
                    //检验套餐名称
                   inspection.setTestPackageName();
                    //检验项目名称
                   inspection.setTestItemName();
                    //检验结果值
                   inspection.setResult();
                    //检验结果单位
                   inspection.setUnits();
                    //异常标识
                   inspection.setAbnormalIndicator();
                    //参考区间
                   inspection.setReferenceInterval();
                    //数据版本
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
                    inspection.setUpdatedAt();
            inspectionService.saveInspection(inspection);
            }
         public void saveExamination(){
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
                    //检查结论-肿块部位
                   examination.setResultSite();
                    //检查结论-肿块数目
                   examination.setResultNumber();
                    //BI-RADS分级
                   examination.setResultBirads();
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
         public void saveExamDescription(){
                 ExamDescription examDescription = new ExamDescription();
                    //标识患者身份唯一标识
                   examDescription.setPersonId();
                    //唯一标识
                   examDescription.setUniqueId();
                    //关联检查表
                   examDescription.setUniqueIdLv3();
                    //医疗机构代码
                   examDescription.setP900();
                    //患者id
                   examDescription.setPatientId();
                    //住院号
                   examDescription.setVisitId();
                    //检查描述-肿块部位
                   examDescription.setFindSite();
                    //检查描述-肿块数目
                   examDescription.setFindNumber();
                    //检查描述-肿块大小
                   examDescription.setFindSize();
                    //BI-RADS分级
                   examDescription.setFindBirads();
                    //数据版本
                   examDescription.setDataVersion();
                    //数据库来源
                   examDescription.setDataDbSource();
                    //数据表来源
                   examDescription.setDataTableSource();
                    //数据项来源
                   examDescription.setDataFieldSource();
                    //创建时间
                   examDescription.setCreatedAt();
                    //创建人
                   examDescription.setCreator();
                    //修改时间
                    examDescription.setUpdatedAt();
            examDescriptionService.saveExamDescription(examDescription);
            }
         public void savePuncture(){
                 Puncture puncture = new Puncture();
                    //标识患者身份唯一标识
                   puncture.setPersonId();
                    //唯一标识
                   puncture.setUniqueId();
                    //医疗机构代码
                   puncture.setP900();
                    //患者id
                   puncture.setPatientId();
                    //住院号
                   puncture.setVisitId();
                    //穿刺日期
                   puncture.setInspectDate();
                    //穿刺记录
                   puncture.setInspectRecord();
                    //数据版本
                   puncture.setDataVersion();
                    //数据库来源
                   puncture.setDataDbSource();
                    //数据表来源
                   puncture.setDataTableSource();
                    //数据项来源
                   puncture.setDataFieldSource();
                    //创建时间
                   puncture.setCreatedAt();
                    //创建人
                   puncture.setCreator();
                    //修改时间
                    puncture.setUpdatedAt();
            punctureService.savePuncture(puncture);
            }
         public void saveOperationRecord(){
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
                    //保乳手术
                   operationRecord.setBreastConservingSurgery();
                    //手术名称
                   operationRecord.setOperationName();
                    //乳房重建
                   operationRecord.setBreastReconstruction();
                    //乳房重建方式
                   operationRecord.setBreastReconstructionMothed();
                    //去势手术（双侧卵巢切除）
                   operationRecord.setOvariectomy ();
                    //淋巴结清扫
                   operationRecord.setLymphadenectomy();
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
         public void savePathological(){
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
                    //收到日期
                   pathological.setInspectTime();
                    //报告日期
                   pathological.setReprotTime();
                    //送检标本名称
                   pathological.setSpecimenName();
                    //肿瘤部位
                   pathological.setTumorLocation();
                    //肿瘤大小
                   pathological.setTumorSize();
                    //原位癌
                   pathological.setCarcinomaSitu();
                    //病理类型
                   pathological.setPathologicalType();
                    //病理分级（分化程度）
                   pathological.setGrade();
                    //新辅助治疗后MP分级
                   pathological.setMp();
                    //侵及皮肤
                   pathological.setInvasionSkin();
                    //侵及胸壁
                   pathological.setInvasionChest();
                    //侵及乳头
                   pathological.setInvasionNipple();
                    //脉管癌栓
                   pathological.setVascularTumorThrombus();
                    //侵犯神经
                   pathological.setIfInvasionNerve();
                    //手术切缘累及情况
                   pathological.setOperation();
                    //切缘距离
                   pathological.setEdgeDistance();
                    //具体送检淋巴结部位
                   pathological.setLymphSite();
                    //送检淋巴结总数
                   pathological.setLymphNodeTotal();
                    //淋巴结转移数量
                   pathological.setTransferNumber();
                    //淋巴结转移
                   pathological.setIfTransfer();
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
         public void saveImmune(){
                 Immune immune = new Immune();
                    //标识患者身份唯一标识
                   immune.setPersonId();
                    //唯一标识
                   immune.setUniqueId();
                    //医疗机构代码
                   immune.setP900();
                    //患者id
                   immune.setPatientId();
                    //住院号
                   immune.setVisitId();
                    //免疫组化标志物名称
                   immune.setMarkerName();
                    //免疫组化标志物检测定性结果
                   immune.setMarkerQualitative();
                    //免疫组化标志物检测定量结果
                   immune.setMarkerQuantify();
                    //数据版本
                   immune.setDataVersion();
                    //数据库来源
                   immune.setDataDbSource();
                    //数据表来源
                   immune.setDataTableSource();
                    //数据项来源
                   immune.setDataFieldSource();
                    //创建时间
                   immune.setCreatedAt();
                    //创建人
                   immune.setCreator();
                    //修改时间
                    immune.setUpdatedAt();
            immuneService.saveImmune(immune);
            }
         public void saveTreatment(){
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
         public void saveChemotherapy(){
                 Chemotherapy chemotherapy = new Chemotherapy();
                    //标识患者身份唯一标识
                   chemotherapy.setPersonId();
                    //唯一标识
                   chemotherapy.setUniqueId();
                    //医疗机构代码
                   chemotherapy.setP900();
                    //患者id
                   chemotherapy.setPatientId();
                    //住院号
                   chemotherapy.setVisitId();
                    //化疗的unque_id
                   chemotherapy.setUniqueIdLv3();
                    //活动记录状态
                   chemotherapy.setRecordStatus();
                    //化疗开始时间
                   chemotherapy.setChemBeginTime();
                    //化疗结束时间
                   chemotherapy.setChemEndTime();
                    //化疗周期计数
                   chemotherapy.setChemPeriod();
                    //化疗方案
                   chemotherapy.setChemPeriodTotal();
                    //化疗药物及剂量
                   chemotherapy.setChemDrugAndDose();
                    //化疗目的
                   chemotherapy.setPurpose();
                    //疗效评估
                   chemotherapy.setEfficacyEvaluation();
                    //副反应
                   chemotherapy.setSideEffect();
                    //责任医生
                   chemotherapy.setChemoDoctor();
                    //数据版本
                   chemotherapy.setDataVersion();
                    //数据库来源
                   chemotherapy.setDataDbSource();
                    //数据表来源
                   chemotherapy.setDataTableSource();
                    //数据项来源
                   chemotherapy.setDataFieldSource();
                    //创建时间
                   chemotherapy.setCreatedAt();
                    //创建人
                   chemotherapy.setCreator();
                    //修改时间
                    chemotherapy.setUpdatedAt();
            chemotherapyService.saveChemotherapy(chemotherapy);
            }
         public void saveChemotherapyDrug(){
                 ChemotherapyDrug chemotherapyDrug = new ChemotherapyDrug();
                    //标识患者身份唯一标识
                   chemotherapyDrug.setPersonId();
                    //唯一标识
                   chemotherapyDrug.setUniqueId();
                    //医疗机构代码
                   chemotherapyDrug.setP900();
                    //患者id
                   chemotherapyDrug.setPatientId();
                    //住院号
                   chemotherapyDrug.setVisitId();
                    //化疗的unque_id
                   chemotherapyDrug.setUniqueIdLv3();
                    //化疗药物
                   chemotherapyDrug.setChemDrug();
                    //化疗药品单次用药剂量
                   chemotherapyDrug.setChemSingleDose();
                    //化疗药品单次用药剂量单位
                   chemotherapyDrug.setChemSingleDoseUnit();
                    //化疗药品用药频次
                   chemotherapyDrug.setChemFrequency();
                    //数据版本
                   chemotherapyDrug.setDataVersion();
                    //数据库来源
                   chemotherapyDrug.setDataDbSource();
                    //数据表来源
                   chemotherapyDrug.setDataTableSource();
                    //数据项来源
                   chemotherapyDrug.setDataFieldSource();
                    //创建时间
                   chemotherapyDrug.setCreatedAt();
                    //创建人
                   chemotherapyDrug.setCreator();
                    //修改时间
                    chemotherapyDrug.setUpdatedAt();
            chemotherapyDrugService.saveChemotherapyDrug(chemotherapyDrug);
            }
         public void saveRadiotherapy(){
                 Radiotherapy radiotherapy = new Radiotherapy();
                    //标识患者身份唯一标识
                   radiotherapy.setPersonId();
                    //唯一标识
                   radiotherapy.setUniqueId();
                    //放疗的子表关联
                   radiotherapy.setUniqueIdLv3();
                    //医疗机构代码
                   radiotherapy.setP900();
                    //患者id
                   radiotherapy.setPatientId();
                    //住院号
                   radiotherapy.setVisitId();
                    //放疗开始日期
                   radiotherapy.setRadioBeginTime();
                    //放疗结束日期
                   radiotherapy.setRadioEndTime();
                    //放射源
                   radiotherapy.setRadioSource();
                    //放疗模式
                   radiotherapy.setRadioStyle();
                    //放疗射线能量
                   radiotherapy.setRadioRayEnergy();
                    //放疗部位及剂量
                   radiotherapy.setRadioSiteAndDose();
                    //放疗副反应与分级
                   radiotherapy.setRadioLevel();
                    //责任医生
                   radiotherapy.setRadioDoctor();
                    //疗效评估
                   radiotherapy.setEfficacyEvaluation();
                    //数据版本
                   radiotherapy.setDataVersion();
                    //数据库来源
                   radiotherapy.setDataDbSource();
                    //数据表来源
                   radiotherapy.setDataTableSource();
                    //数据项来源
                   radiotherapy.setDataFieldSource();
                    //创建时间
                   radiotherapy.setCreatedAt();
                    //创建人
                   radiotherapy.setCreator();
                    //修改时间
                    radiotherapy.setUpdatedAt();
            radiotherapyService.saveRadiotherapy(radiotherapy);
            }
         public void saveRadiotherapySite(){
                 RadiotherapySite radiotherapySite = new RadiotherapySite();
                    //标识患者身份唯一标识
                   radiotherapySite.setPersonId();
                    //唯一标识
                   radiotherapySite.setUniqueId();
                    //医疗机构代码
                   radiotherapySite.setP900();
                    //患者id
                   radiotherapySite.setPatientId();
                    //住院号
                   radiotherapySite.setVisitId();
                    //放疗表对应unique_id的外键
                   radiotherapySite.setUniqueIdLv3();
                    //照射部位
                   radiotherapySite.setRadioSite();
                    //放疗总剂量
                   radiotherapySite.setRadioTotal();
                    //数据版本
                   radiotherapySite.setDataVersion();
                    //数据库来源
                   radiotherapySite.setDataDbSource();
                    //数据表来源
                   radiotherapySite.setDataTableSource();
                    //数据项来源
                   radiotherapySite.setDataFieldSource();
                    //创建时间
                   radiotherapySite.setCreatedAt();
                    //创建人
                   radiotherapySite.setCreator();
                    //修改时间
                    radiotherapySite.setUpdatedAt();
            radiotherapySiteService.saveRadiotherapySite(radiotherapySite);
            }
         public void saveCancerPainTreatment(){
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
         public void saveCart(){
                 Cart cart = new Cart();
                    //标识患者身份唯一标识
                   cart.setPersonId();
                    //唯一标识
                   cart.setUniqueId();
                    //医疗机构代码
                   cart.setP900();
                    //患者id
                   cart.setPatientId();
                    //住院号
                   cart.setVisitId();
                    //放疗表对应unique_id的外键
                   cart.setUniqueIdLv3();
                    //CAR-T细胞回输入人体时间
                   cart.setCartTime();
                    //CAR-T细胞治疗
                   cart.setCartTreatment();
                    //输入Car-T细胞数量
                   cart.setCartNumber();
                    //数据版本
                   cart.setDataVersion();
                    //数据库来源
                   cart.setDataDbSource();
                    //数据表来源
                   cart.setDataTableSource();
                    //数据项来源
                   cart.setDataFieldSource();
                    //创建时间
                   cart.setCreatedAt();
                    //创建人
                   cart.setCreator();
                    //修改时间
                    cart.setUpdatedAt();
            cartService.saveCart(cart);
            }
         public void saveStemCells(){
                 StemCells stemCells = new StemCells();
                    //标识患者身份唯一标识
                   stemCells.setPersonId();
                    //唯一标识
                   stemCells.setUniqueId();
                    //医疗机构代码
                   stemCells.setP900();
                    //患者id
                   stemCells.setPatientId();
                    //住院号
                   stemCells.setVisitId();
                    //放疗表对应unique_id的外键
                   stemCells.setUniqueIdLv3();
                    //干细胞回输时间
                   stemCells.setStemTime();
                    //干细胞移植
                   stemCells.setStemTreatment();
                    //干细胞回输数量
                   stemCells.setStemNumber();
                    //数据版本
                   stemCells.setDataVersion();
                    //数据库来源
                   stemCells.setDataDbSource();
                    //数据表来源
                   stemCells.setDataTableSource();
                    //数据项来源
                   stemCells.setDataFieldSource();
                    //创建时间
                   stemCells.setCreatedAt();
                    //创建人
                   stemCells.setCreator();
                    //修改时间
                    stemCells.setUpdatedAt();
            stemCellsService.saveStemCells(stemCells);
            }
         public void saveBloodTransfusion(){
                 BloodTransfusion bloodTransfusion = new BloodTransfusion();
                    //标识患者身份唯一标识
                   bloodTransfusion.setPersonId();
                    //唯一标识
                   bloodTransfusion.setUniqueId();
                    //医疗机构代码
                   bloodTransfusion.setP900();
                    //患者id
                   bloodTransfusion.setPatientId();
                    //住院号
                   bloodTransfusion.setVisitId();
                    //放疗表对应unique_id的外键
                   bloodTransfusion.setUniqueIdLv3();
                    //输血时间
                   bloodTransfusion.setBloodTime();
                    //输血详情
                   bloodTransfusion.setBloodDetail();
                    //数据版本
                   bloodTransfusion.setDataVersion();
                    //数据库来源
                   bloodTransfusion.setDataDbSource();
                    //数据表来源
                   bloodTransfusion.setDataTableSource();
                    //数据项来源
                   bloodTransfusion.setDataFieldSource();
                    //创建时间
                   bloodTransfusion.setCreatedAt();
                    //创建人
                   bloodTransfusion.setCreator();
                    //修改时间
                    bloodTransfusion.setUpdatedAt();
            bloodTransfusionService.saveBloodTransfusion(bloodTransfusion);
            }
         public void saveFollowUp(){
                 FollowUp followUp = new FollowUp();
                    //标识患者身份唯一标识
                   followUp.setPersonId();
                    //唯一标识
                   followUp.setUniqueId();
                    //医疗机构代码
                   followUp.setP900();
                    //患者id
                   followUp.setPatientId();
                    //住院号
                   followUp.setVisitId();
                    //随访方式
                   followUp.setFollowUpType();
                    //随访日期
                   followUp.setFollowUpDate();
                    //疾病状态
                   followUp.setFollowUpState();
                    //生存情况
                   followUp.setSituation();
                    //药物治疗
                   followUp.setIfMedicine();
                    //药物名称
                   followUp.setMedicineName();
                    //用药剂量
                   followUp.setMedicineDose();
                    //用药持续时间
                   followUp.setMedicineDuration();
                    //死亡原因
                   followUp.setDeathCause ();
                    //死亡日期
                   followUp.setDeathDate();
                    //末次随访日期
                   followUp.setLastDate();
                    //随访检查项目
                   followUp.setFollowItem();
                    //疗效评估
                   followUp.setEfficacyEvaluation();
                    //数据版本
                   followUp.setDataVersion();
                    //数据库来源
                   followUp.setDataDbSource();
                    //数据表来源
                   followUp.setDataTableSource();
                    //数据项来源
                   followUp.setDataFieldSource();
                    //创建时间
                   followUp.setCreatedAt();
                    //创建人
                   followUp.setCreator();
                    //修改时间
                    followUp.setUpdatedAt();
            followUpService.saveFollowUp(followUp);
            }
