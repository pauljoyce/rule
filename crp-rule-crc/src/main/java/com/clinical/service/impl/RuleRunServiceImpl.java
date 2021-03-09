package com.clinical.service.impl;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUnit;
import cn.hutool.core.date.DateUtil;
import com.clinical.dao.cluster.*;
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

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

@Service
public class RuleRunServiceImpl implements RuleRunService {

    private final Logger log= LoggerFactory.getLogger(RuleRunServiceImpl.class);

    /**
     * 放疗
     */
    @Autowired
    ZjRadiotherapyMapper    zjRadiotherapyMapper;
    /**
     * 放疗
     */
    @Autowired
    RadiotherapyService    radiotherapyService;

    /**
     * 化疗
     */
    @Autowired
    ZjDrugOrderMapper    zjDrugOrderMapper;
    /**
     * 化疗
     */
    @Autowired
    ChemotherapyService    chemotherapyService;

    /**
     * 药物治疗
     */
    @Autowired
    TreatmentService    treatmentService;

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

    /**
     * 病理检查-淋巴结
     */
    @Autowired
    ZjPathologyLnMapper zjPathologyLnMapper;
    /**
     * 病理检查-淋巴结
     */
    @Autowired
    PathologicalLnService pathologicalLnService;

    /**
     * 病理检查肉眼
     */
    @Autowired
    ZjPathologyEyeMapper zjPathologyEyeMapper;
    /**
     * 病理检查肉眼
     */
    @Autowired
    PathologicalEyeService pathologicalEyeService;

    /**
     * 病理检查结论
     */
    @Autowired
    ZjPathologyMapper zjPathologyMapper;
    /**
     * 病理检查结论
     */
    @Autowired
    PathologicalService pathologicalService;

    /**
     * 病理报告原文
     */
    @Autowired
    ZjHistologyReportMapper    zjHistologyReportMapper;
    /**
     * 病理报告原文
     */
    @Autowired
    HistologyReportService histologyReportService;

    /**
     * 手术并发症
     */
    @Autowired
    ZjPostopCompMapper zjPostopCompMapper;
    /**
     * 手术并发症
     */
    @Autowired
    OperativeComplicationsService operativeComplicationsService;

    /**
     * 术后恢复
     */
    @Autowired
    ZjPostopFunctionMapper zjPostopFunctionMapper;
    /**
     * 术后恢复
     */
    @Autowired
    PostoperativeRecoveryService postoperativeRecoveryService;

    @Autowired
    StandardResultMapper standardResultMapper;

    @Autowired
    ZjTemPatMasterIndexMapper zjTemPatMasterIndexMapper;

    @Autowired
    ZjPatVisitMasterMapper zjPatVisitMasterMapper;

    @Autowired
    ZjTemOperationRecordMapper zjTemOperationRecordMapper;

    @Autowired
    ZjInpOrdersMapper zjInpOrdersMapper;

    // ----------------------------------------------lv

    @Autowired
    ExamMasterMapper examMasterMapper;
    @Autowired
    ZjExamMasterMapper zjExamMasterMapper;
    @Autowired
    LisRecordMapper lisRecordMapper;
    @Autowired
    ZjLisRecordMapper  zjLisRecordMapper;
    @Autowired
    RabatMapper    rabatMapper;
    @Autowired
    ZjChestXrEntryResultsMapper zjChestXrEntryResultsMapper;
    @Autowired
    ZjChestCtDescriptionMapper zjChestCtDescriptionMapper;
    @Autowired
    ZjChestCtEntryResultsMapper zjChestCtEntryResultsMapper;
    @Autowired
    ChectCtDesMapper    chectCtDesMapper;
    @Autowired
    ChectCtResultMapper   chectCtResultMapper;
    @Autowired
    AbdomenCtResultMapper    abdomenCtResultMapper;
    @Autowired
    ZjAbdomCtEntryResultsMapper zjAbdomCtEntryResultsMapper;
    @Autowired
    ZjAbdomCtDescriptionMapper zjAbdomCtDescriptionMapper;
    @Autowired
    AbdomenCtDesMapper abdomenCtDesMapper;
    @Autowired
    ZjAbdomMrEntryResultsMapper zjAbdomMrEntryResultsMapper;
    @Autowired
    ZjAbdomMrDescriptionMapper zjAbdomMrDescriptionMapper;
    @Autowired
    AbdomenMriDesMapper  abdomenMriDesMapper;
    @Autowired
    AbdomenMriResultMapper  abdomenMriResultMapper;
    @Autowired
    ZjPreopTreatmentMapper zjPreopTreatmentMapper;
    @Autowired
    PreoperativePreparationMapper  preoperativePreparationMapper;
    @Autowired
    ZjSurgeryLnBloodMapper zjSurgeryLnBloodMapper;
    @Autowired
    OperationRecordMapper operationRecordMapper;
    @Autowired
    ZjSurgicalRecordMapper zjSurgicalRecordMapper;
    @Autowired
    SurgicalRecordMapper surgicalRecordMapper;
    @Autowired
    ZjColonEsDescriptionMapper zjColonEsDescriptionMapper;
    @Autowired
    ColonoscopyMapper colonoscopyMapper;

    // -----------------------------------ma

    @Autowired
    ZjInpDiagnosisMapper zjInpDiagnosisMapper;
    @Autowired
    ZjSmokeAndDrinkMapper zjSmokeAndDrinkMapper;
    @Autowired
    ZjFamilyHistoryMapper zjFamilyHistoryMapper;
    @Autowired
    ZjPriorDiseaseAndSurgeryMapper zjPriorDiseaseAndSurgeryMapper;
    @Autowired
    ZjClinicalDiagMapper zjClinicalDiagMapper;
    @Autowired
    ZjSympPresentMapper zjSympPresentMapper;
    @Autowired
    SymptomService symptomService;
    @Autowired
    HisPersonService hisPersonService;
    @Autowired
    PrimaryDiagnosisService primaryDiagnosisService;
    @Autowired
    DiagnosisStageService diagnosisStageService;
    @Autowired
    HisPastService hisPastService;
    @Autowired
    HisFamilyService hisFamilyService;

    // ----------------------------------------------------------wang

    @Autowired
    ZjBasyNstdMapper zjBasyNstdMapper;
    @Autowired
    ZjBasyOpStdMapper zjBasyOpStdMapper;
    @Autowired
    ZjBasyDiagStdMapper zjBasyDiagStdMapper;
    @Autowired
    ZjNursingRecordMapper zjNursingRecordMapper;
    @Autowired
    ZjVitalRecordMapper zjVitalRecordMapper;
    @Autowired
    IndexOperationService indexOperationService;
    @Autowired
    IndexDiagnosisClinicIcdService indexDiagnosisClinicIcdService;
    @Autowired
    IndexDiagnosisMainIcdService indexDiagnosisMainIcdService;
    @Autowired
    IndexDiagnosisOtherIcdService indexDiagnosisOtherIcdService;
    @Autowired
    IndexPathologyIcdService indexPathologyIcdService;
    @Autowired
    IndexDiagnosisOtherService indexDiagnosisOtherService;
    @Autowired
    IndexDiagnosisAdmitService indexDiagnosisAdmitService;
    @Autowired
    IndexOperationIcdService indexOperationIcdService;
    @Autowired
    IndexPathologyService indexPathologyService;
    @Autowired
    IndexIcuService indexIcuService;
    @Autowired
    IndexDiagnosisAdmitIcdService indexDiagnosisAdmitIcdService;
    @Autowired
    IndexInjuryService indexInjuryService;
    @Autowired
    TemInpAdmissionStatusService temInpAdmissionStatusService;
    @Autowired
    IndexPersonService indexPersonService;
    @Autowired
    PersonGeneralService personGeneralService;
    @Autowired
    IndexDiagnosisMainService indexDiagnosisMainService;
    @Autowired
    PersonService personService;
    @Autowired
    IndexDiagnosisClinicService indexDiagnosisClinicService;
    @Autowired
    VisitRecordService visitRecordService;
    @Autowired
    ZjTemInpAdmissionStatusMapper zjTemInpAdmissionStatusMapper;

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

                List<INP_DIAGNOSIS>  zj_INP_DIAGNOSIS =  zjInpDiagnosisMapper.findZjInpDiagnosisByUniqueId(uniqueId);
                List<NURSING_RECORD>  zj_NURSING_RECORD =  zjNursingRecordMapper.findZjNursingRecordByUniqueId(uniqueId);
                List<VITAL_RECORD>  zj_VITAL_RECORD =  zjVitalRecordMapper.findZjVitalRecordByUniqueId(uniqueId);
                List<TEM_INP_ADMISSION_STATUS>  zj_TEM_INP_ADMISSION_STATUS =  zjTemInpAdmissionStatusMapper.findZjTemInpAdmissionStatusByUniqueId(uniqueId);


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

                    if (zj_BASY_NSTD==null){
                        zj_BASY_NSTD = new BASY_NSTD();
                        zj_BASY_NSTD.setDOP3("");
                    }
                    saveIndexDiagnosisAdmit(zj_BASY_DIAG_STD,visitdate,admitdate,zj_BASY_NSTD);
                    saveIndexDiagnosisClinic(zj_BASY_DIAG_STD,visitdate,clinicdate,zj_BASY_NSTD);
                    saveIndexDiagnosisMain(zj_BASY_DIAG_STD,visitdate,maindate,zj_BASY_NSTD);
                    saveIndexDiagnosisOther(zj_BASY_DIAG_STD,visitdate,maindate,zj_BASY_NSTD);
                    saveIndexInjury(zj_BASY_DIAG_STD,zj_BASY_NSTD);
                    saveIndexPathology(zj_BASY_DIAG_STD,visitdate,pathdate,zj_BASY_NSTD);
                }

                if(zj_BASY_OP_STD!=null){
                    saveIndexOperation(zj_BASY_OP_STD,zj_BASY_NSTD);
                }


                if(zj_NURSING_RECORD!=null&&zj_NURSING_RECORD.size()>0){
                    savePersonGeneral(zj_NURSING_RECORD, zj_VITAL_RECORD);
                }

                if(zj_TEM_INP_ADMISSION_STATUS!=null&&zj_TEM_INP_ADMISSION_STATUS.size()>0){
                    for(TEM_INP_ADMISSION_STATUS tem_inp_admission_status:zj_TEM_INP_ADMISSION_STATUS){
                        saveInpAdmissionStatus(tem_inp_admission_status);
                    }

                }

                // ------------------------------------------wang

//                List<INP_DIAGNOSIS>  zj_INP_DIAGNOSIS =  zjInpDiagnosisMapper.findZjInpDiagnosisByUniqueId(uniqueId);
                List<SMOKE_AND_DRINK>  zj_smoke_and_drink =  zjSmokeAndDrinkMapper.findZjSmokeAndDrinkByUniqueId(uniqueId);
                List<PRIOR_DISEASE_AND_SURGERY>  zj_prior_disease_and_surgery =  zjPriorDiseaseAndSurgeryMapper.findZjPriorDiseaseAndSurgeryByUniqueId(uniqueId);
                List<FAMILY_HISTORY>  zj_family_history =  zjFamilyHistoryMapper.findZjFamilyHistoryByUniqueId(uniqueId);
                List<CLINICAL_DIAG>  zj_clinical_diag =  zjClinicalDiagMapper.findZjClinicalDiagByUniqueId(uniqueId);
                List<SYMP_PRESENT> zj_SYMPTOMS= zjSympPresentMapper.findZjSympPresentByUniqueId(uniqueId);


                if(zj_INP_DIAGNOSIS!=null&&zj_INP_DIAGNOSIS.size()>0){
                    savePrimaryDiagnosis(zj_INP_DIAGNOSIS);
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
                if (zj_clinical_diag!=null&&zj_clinical_diag.size()!=0){
                    saveDiagnosisStage(zj_clinical_diag);
                }
                if (zj_prior_disease_and_surgery!=null&&zj_prior_disease_and_surgery.size()!=0){
                    saveHisPast(zj_prior_disease_and_surgery);
                }

                // ---------------------------------------------------ma

                List<CHEST_XR_ENTRY_RESULTS> zjChestXrEntryResultsByALL = zjChestXrEntryResultsMapper.findZjChestXrEntryResultsByUniqueId(uniqueId);
                System.out.println("1");
                List<CHEST_CT_DESCRIPTION> zjChestCtDescriptionByALL = zjChestCtDescriptionMapper.findZjChestCtDescriptionByUniqueId(uniqueId);
                System.out.println("2");
                List<CHEST_CT_ENTRY_RESULTS> zjChestCtEntryResultsByALL = zjChestCtEntryResultsMapper.findZjChestCtEntryResultsByUniqueId(uniqueId);
                System.out.println("3");
                List<ABDOM_CT_ENTRY_RESULTS> zjAbdomCtEntryResultsByALL = zjAbdomCtEntryResultsMapper.findZjAbdomCtEntryResultsByUniqueId(uniqueId);
                System.out.println("4");
                List<ABDOM_MR_ENTRY_RESULTS> zjAbdomMrEntryResultsByALL = zjAbdomMrEntryResultsMapper.findZjAbdomMrEntryResultsByUniqueId(uniqueId);
                System.out.println("5");
                List<TEM_OPERATION_RECORD> zjTemOperationRecordByALL = zjTemOperationRecordMapper.findZjTemOperationRecordByUniqueId(uniqueId);
                System.out.println("6");
                List<SURGICAL_RECORD> zjSurgicalRecordByUniqueId = zjSurgicalRecordMapper.findZjSurgicalRecordByUniqueId(uniqueId);
                System.out.println("7");
                List<COLON_ES_DESCRIPTION> zjColonEsDescriptionByALL = zjColonEsDescriptionMapper.findZjColonEsDescriptionByUniqueId(uniqueId);
                System.out.println("8");
                List<LIS_RECORD> zjLisRecordByALL = zjLisRecordMapper.findZjLisRecordByUniqueId(uniqueId);
                System.out.println("9");
                List<EXAM_MASTER> zjExamMasterByAll = zjExamMasterMapper.findZjExamMasterByUniqueId(uniqueId);
                if (zjChestXrEntryResultsByALL!=null){
                    addrabat(zjChestXrEntryResultsByALL);
                    System.out.println("111");

                }
                if (zjChestCtDescriptionByALL!=null){
                    addchectCtDesadd(zjChestCtDescriptionByALL);
                }
                if (zjChestCtEntryResultsByALL!=null){
                    addchectCtResult(zjChestCtEntryResultsByALL);
                }
                if (zjAbdomCtEntryResultsByALL!=null){
                    addctDes(zjAbdomCtEntryResultsByALL);
                }
                if (zjAbdomMrEntryResultsByALL!=null){
                    addMriResult(zjAbdomMrEntryResultsByALL);
                }
                if (zjTemOperationRecordByALL!=null){
                    addPreparation(zjTemOperationRecordByALL);
                }
                if (zjTemOperationRecordByALL!=null){
                    addoperationRun(zjTemOperationRecordByALL);
                }
                if (zjSurgicalRecordByUniqueId!=null){
                    addsurgical(zjSurgicalRecordByUniqueId);
                }

                if (zjColonEsDescriptionByALL!=null){
                    addcolo(zjColonEsDescriptionByALL);
                }
                if (zjExamMasterByAll!=null){
                    inExamMaster(zjExamMasterByAll);
                }
                if (zjLisRecordByALL!=null){
                    inLisRecord(zjLisRecordByALL);
                }
                // ------------------------------------lv

                // 放疗
                List<RADIOTHERAPY>  zj_radiotherapy =  zjRadiotherapyMapper.findZjRadiotherapyByUniqueId(uniqueId);
                if (zj_radiotherapy != null && zj_radiotherapy.size() > 0) {
                    saveRadiotherapy(zj_radiotherapy);
                }

                // 化疗和药物治疗
                List<DRUG_ORDER>  zj_DRUG_ORDER =  zjDrugOrderMapper.findZjDrugOrderByUniqueId(uniqueId);
                if (zj_DRUG_ORDER != null && zj_DRUG_ORDER.size() > 0) {
                    saveChemotherapyAndTreatment(zj_DRUG_ORDER);
                }

                // 免疫组化标志物
                List<IHC_MARKER> zj_IHC_MARKER = zjIhcMarkerMapper.findZjIhcMarkerByUniqueId(uniqueId);
                if (zj_IHC_MARKER != null && zj_IHC_MARKER.size() > 0) {
                    saveImmune(zj_IHC_MARKER);
                }

                // 病理检查-淋巴结
                List<PATHOLOGY_LN> zj_PATHOLOGY_LN = zjPathologyLnMapper.findZjPathologyLnByUniqueId(uniqueId);
                if (zj_PATHOLOGY_LN != null && zj_PATHOLOGY_LN.size() > 0) {
                    savePathologicalIn(zj_PATHOLOGY_LN);
                }

                // 病理检查肉眼
                List<PATHOLOGY_EYE> zj_PATHOLOGY_EYE = zjPathologyEyeMapper.findZjPathologyEyeByUniqueId(uniqueId);
                if (zj_PATHOLOGY_EYE != null && zj_PATHOLOGY_EYE.size() > 0) {
                    savePathologicalEye(zj_PATHOLOGY_EYE);
                }

                // 病理检查结论
                List<PATHOLOGY> zj_PATHOLOGY = zjPathologyMapper.findZjPathologyByUniqueId(uniqueId);
                if (zj_PATHOLOGY != null && zj_PATHOLOGY.size() > 0) {
                    savePathological(zj_PATHOLOGY);
                }

                // 病理报告原文
                List<HISTOLOGY_REPORT> zj_HISTOLOGY_REPORT = zjHistologyReportMapper.findZjHistologyReportByUniqueId(uniqueId);
                if (zj_HISTOLOGY_REPORT != null && zj_HISTOLOGY_REPORT.size() > 0) {
                    saveHistologyReport(zj_HISTOLOGY_REPORT);
                }

                // 手术并发症
                List<POSTOP_COMP> zj_POSTOP_COMP = zjPostopCompMapper.findZjPostopCompByUniqueId(uniqueId);
                if (zj_POSTOP_COMP != null && zj_POSTOP_COMP.size() > 0) {
                    saveOperativeComplications(zj_POSTOP_COMP);
                }

                // 术后恢复2 质检后修改的逻辑
                List<TEM_OPERATION_RECORD> zj_TEM_OPERATION_RECORD = zjTemOperationRecordMapper.findZjTemOperationRecordByUniqueId(uniqueId);
                if (zj_TEM_OPERATION_RECORD != null && zj_TEM_OPERATION_RECORD.size() > 0) {
                    savePostoperativeRecovery2(zj_TEM_OPERATION_RECORD);
                }
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

        List<String> neededDiagList = Arrays.asList(
                "盲肠恶性肿瘤",
                "回盲部恶性肿瘤",
                "阑尾恶性肿瘤",
                "升结肠恶性肿瘤",
                "结肠肝曲恶性肿瘤",
                "横结肠恶性肿瘤",
                "结肠脾曲恶性肿瘤",
                "降结肠恶性肿瘤",
                "乙状结肠恶性肿瘤",
                "结肠交搭跨越恶性肿瘤的损害",
                "盲肠及升结肠恶性肿瘤",
                "降结肠乙状结肠恶性肿瘤",
                "升结肠横结肠恶性肿瘤",
                "横结肠降结肠恶性肿瘤",
                "结肠恶性肿瘤",
                "结肠多处恶性肿瘤",
                "结肠腺瘤恶变",
                "直肠乙状结肠连接处恶性肿瘤",
                "直肠乙状结肠连接部恶性肿瘤",
                "结肠和直肠恶性肿瘤",
                "直肠恶性肿瘤",
                "直肠多处恶性肿瘤",
                "直肠壶腹部恶性肿瘤",
                "直肠、肛门和肛管交搭跨越恶性肿瘤的损害",
                "肛门直肠连接部恶性肿瘤",
                "直肠肛管恶性肿瘤",
                "直肠肛门恶性肿瘤",
                "肠道部位的恶性肿瘤",
                "肠道恶性肿瘤",
                "消化系统交搭跨越恶性肿瘤的损害",
                "小肠及结肠恶性肿瘤",
                "胃体及横结肠恶性肿瘤",
                "消化系统部位不明确的恶性肿瘤",
                "消化道恶性肿瘤",
                "胃肠道恶性肿瘤",
                "大肠和直肠继发性恶性肿瘤",
                "乙状结肠继发恶性肿瘤",
                "直肠乙状结肠连接部继发恶性肿瘤",
                "直肠继发恶性肿瘤",
                "盲肠继发恶性肿瘤",
                "结肠继发恶性肿瘤",
                "肠系膜继发恶性肿瘤",
                "胃肠道继发恶性肿瘤",
                "盲肠恶性肿瘤个人史",
                "结肠恶性肿瘤个人史",
                "直肠恶性肿瘤个人史",
                "胃肠道恶性肿瘤家族史",
                "大肠恶性肿瘤家族史"
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
            log.info("无法计算首次诊断日期，保存患者："+person.getUniqueId());
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
            log.info("保存患者："+person.getUniqueId());
        }

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


    public void savePersonGeneral(List<NURSING_RECORD> zj_NURSING_RECORD,List<VITAL_RECORD> zj_VITAL_RECORD){

        DateFormat format=new SimpleDateFormat("yyyy-MM-dd");
        Map<String,String> map=new HashMap<>();
        if(zj_VITAL_RECORD!=null&&zj_VITAL_RECORD.size()>0){
            for(VITAL_RECORD vital_record:zj_VITAL_RECORD){
                if(vital_record.getEXAM_TIME()!=null&&vital_record.getEXAM_RESULT()!=null){
                    if ("体温(℃)".equals(vital_record.getITEM_NAME())) {
                        String date= format.format( vital_record.getEXAM_TIME());
                        map.put(date,vital_record.getEXAM_RESULT());
                    }
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

    // ---------------------------------wang

    public void saveSymptom(List<SYMP_PRESENT> zj_SYMPTOMS){
        for(SYMP_PRESENT symp_present : zj_SYMPTOMS) {
            log.info("保存症状体征：" + symp_present.getunique_id());

            Symptom symptom = new Symptom();
            //标识患者身份唯一标识
            symptom.setUniqueId(symp_present.getunique_id());
            //唯一标识
            symptom.setUniqueIdLv1(symp_present.getunique_id_lv1());
            symptom.setUniqueIdLv2(symp_present.getunique_id_lv2());
            //医疗机构代码
            symptom.setP900(symp_present.getp900());
            //患者id
            symptom.setPatientId(symp_present.getpatient_id());
            //门诊/住院号
            symptom.setVisitId(symp_present.getvisit_id());
            //    String nlpTableJson = this.selectStandardResultById(symp_present.getneg_std());
            System.out.println("错误的key...."+symp_present.getfinding_std());
            String nlpTableJson2 = this.selectStandardResultById(symp_present.getfinding_std());
            String findingjson = JSONUtils.getAllFieldGroupByObj(nlpTableJson2, "afterType1", ",", "");
            if (symp_present.getneg_std() == null || "".equals(symp_present.getneg_std())) {
                symptom.setSymptoms(findingjson);
            }

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
            symptomService.saveSymptom(symptom);
        }
    }



    public void saveHisPerson(List<SMOKE_AND_DRINK> zj_SMOKE_AND_DRINK){
        for (SMOKE_AND_DRINK smoke_and_drink:zj_SMOKE_AND_DRINK
                ) {
            log.info("保存个人史：" + smoke_and_drink.getunique_id());
            //获取字典表个人史标化json

            HisPerson hisPerson = new HisPerson();
            //唯一标识
            hisPerson.setUniqueId(smoke_and_drink.getunique_id());
            hisPerson.setUniqueIdLv1(smoke_and_drink.getunique_id_lv1());
            hisPerson.setUniqueIdLv2(smoke_and_drink.getunique_id_lv2());
            //医疗机构代码
            hisPerson.setP900(smoke_and_drink.getp900());
            //患者id
            hisPerson.setPatientId(smoke_and_drink.getpatient_id());
            //住院号
            hisPerson.setVisitId(smoke_and_drink.getvisit_id());

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
            //   for (SMOKE_AND_DRINK smoke_and_drink : zj_SMOKE_AND_DRINK) {
            //吸烟
            if (smoke_and_drink.getsmoker_std() != null && !smoke_and_drink.getsmoker_std().equals("")) {
                String nlpTableJson = this.selectStandardResultById(smoke_and_drink.getsmoker_std());
                String jso = JSONUtils.getOne2(nlpTableJson, "afterType1", "smoker_std");
                hisPerson.setSmoke(jso);
            }
            if (smoke_and_drink.getyear_of_smoke_std() != null && !smoke_and_drink.getyear_of_smoke_std().equals("")) {
                String nlpTableJson = this.selectStandardResultById(smoke_and_drink.getyear_of_smoke_std());
                String jso = JSONUtils.getOne2(nlpTableJson, "afterType1", "year_of_smoke_std");
                String jsountil = JSONUtils.getOne2(nlpTableJson, "afterType1", "year_of_smoke_unit_std");
                if(!jso.contains("无效")){
                    hisPerson.setSmokeYear(jso + jsountil);
                }
                //      hisPerson.setSmokeYear(smoke_and_drink.getyear_of_smoke_std());
            }
            if (smoke_and_drink.getconsumption_smoke_std() != null && !smoke_and_drink.getconsumption_smoke_std().equals("")
                    && !smoke_and_drink.getconsumption_smoke_std().equals("无效")) {
                String nlpTableJson = this.selectStandardResultById(smoke_and_drink.getconsumption_smoke_std());
                Optional<String> jsotype = JSONUtils.getOne(nlpTableJson, "afterType1", "smoke_type_std");
                String jso = JSONUtils.getOne2(nlpTableJson, "afterType1", "consumption_smoke_std");
                String jsountil = JSONUtils.getOne2(nlpTableJson, "afterType1", "consumption_smoke_unit_std");
                String jsountil2 = JSONUtils.getOne2(nlpTableJson, "afterType1", "smoke_freq_std");
                String jsountil3 = JSONUtils.getOne2(nlpTableJson, "afterType1", "smoke_freq_unit_std");
                hisPerson.setDailySmoke(jso + jsountil + jsountil2 + jsountil3);
                //   hisPerson.setDailySmoke(smoke_and_drink.getconsumption_smoke_std());
            }
            if (smoke_and_drink.getsmoke_quitter_std() != null && !smoke_and_drink.getsmoke_quitter_std().equals("")) {
                String nlpTableJson = this.selectStandardResultById(smoke_and_drink.getsmoke_quitter_std());
                String jso = JSONUtils.getOne2(nlpTableJson, "afterType1", "smoke_quitter_std");
                hisPerson.setStopSmoke(jso);
                //hisPerson.setStopSmoke(smoke_and_drink.getsmoke_quitter_std());
            }
            if (smoke_and_drink.getyear_of_smoke_std() != null && !smoke_and_drink.getyear_of_smoke_std().equals("")
                    && !smoke_and_drink.getyear_of_smoke_std().equals("无效")) {
                String nlpTableJson = this.selectStandardResultById(smoke_and_drink.getyear_of_smoke_std());
                String jso = JSONUtils.getOne2(nlpTableJson, "afterType1", "year_of_smoke_std");
                String jsounit = JSONUtils.getOne2(nlpTableJson, "afterType1", "year_of_smoke_unit_std");
                hisPerson.setStopSmokeYear(jso + jsounit);
                //  hisPerson.setStopSmokeYear(smoke_and_drink.getyear_of_smoke_std());
            }

            if((hisPerson.getSmokeYear()!=null &&!"".equals(hisPerson.getSmokeYear())) || (hisPerson.getDailySmoke()!=null &&!"".equals(hisPerson.getDailySmoke()))){
                hisPerson.setSmoke("是");
            }

            //饮酒
            if (smoke_and_drink.getdrinker_std() != null && !smoke_and_drink.getdrinker_std().equals("")) {
                String nlpTableJson = this.selectStandardResultById(smoke_and_drink.getdrinker_std());
                String jso = JSONUtils.getOne2(nlpTableJson, "afterType1", "drinker_std");
                hisPerson.setDrink(jso);
                //     hisPerson.setDrink(smoke_and_drink.getdrinker_std());
            }
            if (smoke_and_drink.getyear_of_drink_std() != null && !smoke_and_drink.getyear_of_drink_std().equals("")
                    && !smoke_and_drink.getyear_of_drink_std().equals("无效")) {
                String nlpTableJson = this.selectStandardResultById(smoke_and_drink.getyear_of_drink_std());
                String drinktype = JSONUtils.getOne2(nlpTableJson, "afterType1", "drink_type1_std");
                String jso = JSONUtils.getOne2(nlpTableJson, "afterType1", "year_of_drink_std");
                String jsounit = JSONUtils.getOne2(nlpTableJson, "afterType1", "year_of_drink_unit_std");
                hisPerson.setDrinkYear(jso + jsounit);
                //   hisPerson.setDrinkYear(smoke_and_drink.getyear_of_drink_std());
            }
//            StringBuilder stringBuilder = new StringBuilder();
//            if (smoke_and_drink.getconsumption_drink_std() != null && !smoke_and_drink.getconsumption_drink_std().equals("")) {
//                stringBuilder
//                        .append(smoke_and_drink.getdrink_type_std() == null ? "" : smoke_and_drink.getdrink_type_std())
//                        .append(smoke_and_drink.getconsumption_drink_std() == null ? "" : smoke_and_drink.getconsumption_drink_std())
//                        .append(smoke_and_drink.getconsumption_drink_unit_std() == null ? "" : smoke_and_drink.getconsumption_drink_unit_std())
//                        .append(smoke_and_drink.getdrink_freq_std() == null ? "" : smoke_and_drink.getdrink_freq_std())
//                        .append(smoke_and_drink.getdrink_freq_unit_std() == null ? "" : smoke_and_drink.getdrink_freq_unit_std());
//            }

//            if (smoke_and_drink.getconsumption_drink1_std() != null && !smoke_and_drink.getconsumption_drink1_std().equals("")) {
//                stringBuilder
//                        .append(smoke_and_drink.getdrink_type1_std()==null?"":smoke_and_drink.getdrink_type1_std())
//                        .append(smoke_and_drink.getconsumption_drink1_std()==null?"":smoke_and_drink.getconsumption_drink1_std())
//                        .append(smoke_and_drink.getconsumption_drink_unit1_std()==null?"":smoke_and_drink.getconsumption_drink_unit1_std())
//                        .append(smoke_and_drink.getdrink_freq1_std()==null?"":smoke_and_drink.getdrink_freq1_std())
//                        .append(smoke_and_drink.getdrink_freq_unit1_std()==null?"":smoke_and_drink.getdrink_freq_unit1_std());
//                if (smoke_and_drink.getconsumption_drink2_std() != null && !smoke_and_drink.getconsumption_drink2_std().equals("")){
//                    stringBuilder
//                            .append(",")
//                            .append(smoke_and_drink.getdrink_type2_std()==null?"":smoke_and_drink.getdrink_type2_std())
//                            .append(smoke_and_drink.getconsumption_drink2_std()==null?"":smoke_and_drink.getconsumption_drink2_std())
//                            .append(smoke_and_drink.getconsumption_drink_unit2_std()==null?"":smoke_and_drink.getconsumption_drink_unit2_std())
//                            .append(smoke_and_drink.getdrink_freq2_std()==null?"":smoke_and_drink.getdrink_freq2_std())
//                            .append(smoke_and_drink.getdrink_freq_unit2_std()==null?"":smoke_and_drink.getdrink_freq_unit2_std());
//                }
//            }
//            if (stringBuilder.length()!=0){
//                hisPerson.setDailyDrink(stringBuilder.toString());
//            }
            if (smoke_and_drink.getconsumption_drink_std() != null && !smoke_and_drink.getconsumption_drink_std().equals("")
                    && !smoke_and_drink.getconsumption_drink_std().equals("无效")) {
                String nlpTableJson2 = this.selectStandardResultById(smoke_and_drink.getconsumption_drink_std());
                System.out.println("json....." + nlpTableJson2);
                String relationjson2 = JSONUtils.getAllFieldGroupByObj2(nlpTableJson2, "afterType1", "", ";");
                System.out.println("json解析后....." + relationjson2);
                if (!relationjson2.contains("无效")) {
                    hisPerson.setDailyDrink(relationjson2);
                }

            }
            if (smoke_and_drink.getdrink_quitter_std() != null && !smoke_and_drink.getdrink_quitter_std().equals("")) {
                String nlpTableJson = this.selectStandardResultById(smoke_and_drink.getdrink_quitter_std());
                String relationjson = JSONUtils.getAllFieldGroupByObj(nlpTableJson, "afterType1", "", "");
                System.out.println(relationjson);
                hisPerson.setStopDrink(relationjson);
            }
            if (smoke_and_drink.getyear_of_drink_quitting_std() != null && !smoke_and_drink.getyear_of_drink_quitting_std().equals("")
                    && !smoke_and_drink.getyear_of_drink_quitting_std().equals("无效")) {
                String nlpTableJson = this.selectStandardResultById(smoke_and_drink.getyear_of_drink_quitting_std());
                String jso = JSONUtils.getOne2(nlpTableJson, "afterType1", "year_of_drink_q_std");
                String jsounit = JSONUtils.getOne2(nlpTableJson, "afterType1", "year_of_drink_q_unit__std");
                String relationjson = JSONUtils.getAllFieldGroupByObj(nlpTableJson, "afterType1", "", "");
                hisPerson.setStopDrinkYear(relationjson);
            }

            if((hisPerson.getDrinkYear()!=null &&!"".equals(hisPerson.getDrinkYear())) || (hisPerson.getDailyDrink()!=null &&!"".equals(hisPerson.getDailyDrink()))){
                hisPerson.setDrink("是");
            }

            //   }
            //修改时间
            hisPerson.setUpdatedAt(new Date());
            hisPersonService.saveHisPerson(hisPerson);
        }
    }

    public void saveHisFamily( List<FAMILY_HISTORY> zj_FAMILY_HISTORY ){

        for (FAMILY_HISTORY family_history:zj_FAMILY_HISTORY
                ) {
            log.info("保存家族史："+ family_history.getunique_id());
            HisFamily hisFamily = new HisFamily();
            hisFamily.setUniqueId(family_history.getunique_id());
            //唯一标识
            hisFamily.setUniqueIdLv1(family_history.getunique_id_lv1());
            hisFamily.setUniqueIdLv2(family_history.getunique_id_lv2());
            //医疗机构代码
            hisFamily.setP900(family_history.getp900());
            //患者id
            hisFamily.setPatientId(family_history.getpatient_id());
            //住院号
            hisFamily.setVisitId(family_history.getvisit_id());

            //肿瘤家族史
            String  nlpTableJson =  this.selectStandardResultById(family_history.getneg_std());
            String  nlpTableJson2 =  this.selectStandardResultById(family_history.getdiag_std());
            String  nlpTableJson3 =  this.selectStandardResultById(family_history.getrelation_std());
            String  nlpTableJson4 =  this.selectStandardResultById(family_history.getdiag_std());
            String  diagjson=JSONUtils.getAllFieldGroupByObj(nlpTableJson2,"afterType1","","");
            String  relajson=JSONUtils.getAllFieldGroupByObj(nlpTableJson3,"afterType1","","");
            String  tumojson=JSONUtils.getAllFieldGroupByObj(nlpTableJson4,"afterType1","","");
            hisFamily.setFamilyTumour("否");
            if((family_history.getneg_std()==null || "".equals(family_history.getneg_std()))&& diagjson!=null && !"".equals(diagjson)){
                if((diagjson.contains("白血病") ||diagjson.contains("肿瘤"))){
                    hisFamily.setFamilyTumour("是");
                    hisFamily.setTumourRelative(relajson);
                    hisFamily.setRelativeTumourName(tumojson);
                }else{
                    hisFamily.setFamilyTumour("否");
                }
            }else{
                hisFamily.setFamilyTumour("否");
            }
            String  nlpTableJson5 =  this.selectStandardResultById(family_history.getrelation_std());
            String  relationjson=JSONUtils.getAllFieldGroupByObj(nlpTableJson5,"afterType1","","");
            if((family_history.getneg_std()==null || "".equals(family_history.getneg_std()))&& diagjson!=null && !"".equals(diagjson)){
                if(diagjson.contains("循环") ||diagjson.contains("脑卒中")||diagjson.contains("冠心病")||diagjson.contains("高血压")||diagjson.contains("中风")){
                    hisFamily.setFamilyCcvd("是");
                    hisFamily.setCcvdRelative(relationjson);
                    hisFamily.setRelativeCcvdName(diagjson);
                }else{
                    hisFamily.setFamilyCcvd("否");
                }
            }else{
                hisFamily.setFamilyCcvd("否");
            }


            hisFamilyService.saveHisFamily(hisFamily);
        }



    }



    //既往史
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
        //记录neg_std不为空的seq_id
        int index = 0;
        hisPast.setHypertension("否");
        hisPast.setGlycuresis("否");
        hisPast.setCopd("否");
        hisPast.setEmphysema("否");
        hisPast.setAsthma("否");
        hisPast.setBronchitis("否");
        hisPast.setThyroid("否");
        hisPast.setHeartDisease("否");
        hisPast.setChronicAnemia("否");
        hisPast.setRheumaticFever("否");
        hisPast.setBloodFat("否");
        hisPast.setChronicKidney("否");
        hisPast.setCerebralInfarction("否");
        hisPast.setCerebralHemorrhage("否");
        hisPast.setLupusErythematosus("否");
        hisPast.setArthritis("否");
        hisPast.setRheumatoidArthritis("否");
        hisPast.setHepatitisB("否");
        hisPast.setHcv("否");
        hisPast.setTuberculosis("否");
        hisPast.setHiv("否");
        hisPast.setIntestinalObstruction("否");
        hisPast.setGastrointestinalBleeding("否");
        hisPast.setGastrointestinalPerforation("否");
        hisPast.setHypoproteinemia("否");
        hisPast.setAbdominalSurgery("否");

        for (PRIOR_DISEASE_AND_SURGERY prior:zj_PRIOR_DISEASE_AND_SURGERY
                ) {
            String diagJson = this.standardResultMapper.selectStandardResultById(prior.getdiag_name_std());
            String surgeryJson = this.standardResultMapper.selectStandardResultById(prior.getsurgery_name_std());
            String diagName = JSONUtils.getAllFieldGroupByObj(diagJson,"afterType1","","");
            String surgeryName = "";
            if(!"".equals(surgeryJson)&&surgeryJson!=null){
                if(surgeryJson.contains("icd9_name2") || surgeryJson.contains("icd9_name3") || surgeryJson.contains("icd9_name4") || surgeryJson.contains("icd9_name5") || surgeryJson.contains("icd9_name6")){
                    surgeryName = JSONUtils.getAllFieldGroupByObj(surgeryJson,"afterType1","",",");
                }else if(surgeryJson.contains("surgery_name_std\":\"0")){
                    surgeryJson = surgeryJson.replace(",{\"surgery_name_std\":\"0\"}","");
                    surgeryName = JSONUtils.getAllFieldGroupByObj(surgeryJson,"afterType1","",",");
                    if(surgeryName.substring(surgeryName.length()-1,surgeryName.length()).contains(",")){
                        surgeryName = surgeryName.substring(0,surgeryName.length()-1);
                    }
                }else{
                    surgeryName = JSONUtils.getAllFieldGroupByObj(surgeryJson,"afterType1","0","");
                }
            }
            if(!"".equals(prior.getneg_std()) && prior.getneg_std()!=null && prior.getneg_std().length()!=0){
                index = prior.getseq_id();//153340
            }
            //System.out.println(index);
            if(!"".equals(diagName)&&diagName!=null){
                int diagSeq = prior.getseq_id();
                //System.out.println(diagSeq);
                if(diagSeq != index){
                    //高血压
                    if(diagName.contains("高血压")){
                        hisPast.setHypertension("是");
                    }
                    //hisPast.setHypertension(parsePast1(Constant.gxyKeyword,diagName));
                    //糖尿病
                    if(diagName.contains("糖尿病")){
                        hisPast.setGlycuresis("是");
                    }
                    //hisPast.setGlycuresis(parsePast1(Constant.tnbKeyword,diagName));
                    //慢性阻塞性肺病(COPD)
                    if(diagName.contains("慢性阻塞性肺病")){
                        hisPast.setCopd("是");
                    }
                    //hisPast.setCopd(parsePast1(Arrays.asList("慢性阻塞性肺病"),diagName));
                    //肺气肿
                    if(diagName.contains("肺气肿")){
                        hisPast.setEmphysema("是");
                    }
                    //hisPast.setEmphysema(parsePast1(Arrays.asList("肺气肿"),diagName));
                    //哮喘
                    if(diagName.contains("哮喘")){
                        hisPast.setAsthma("是");
                    }
                    //hisPast.setAsthma(parsePast1(Constant.xcKeyword,diagName));
                    //支气管肺炎
                    if(diagName.contains("支气管肺炎")){
                        hisPast.setBronchitis("是");
                    }
                    //hisPast.setBronchitis(parsePast1(Constant.fyKeyword,diagName));
                    //甲状腺疾病
                    if(diagName.contains("甲状腺")){
                        hisPast.setThyroid("是");
                    }
                    //hisPast.setThyroid(parsePast1(Constant.jzxKeyword,diagName));
                    //心脏病
                    if(diagName.contains("心")){
                        hisPast.setHeartDisease("是");
                    }
                    //hisPast.setHeartDisease(parsePast1(Constant.xzbKeyword,diagName));
                    //慢性贫血
                    if(diagName.contains("贫血")){
                        hisPast.setChronicAnemia("是");
                    }
                    //hisPast.setChronicAnemia(parsePast1(Constant.mxpxKeyword,diagName));
                    //风湿热病史
                    if(diagName.contains("风湿热")){
                        hisPast.setRheumaticFever("是");
                    }
                    //hisPast.setRheumaticFever(parsePast1(Arrays.asList("风湿病"),diagName));
                    //血脂异常
                    if(diagName.contains("脂血") || diagName.contains("血脂")){
                        hisPast.setBloodFat("是");
                    }
                    //hisPast.setBloodFat(parsePast1(Arrays.asList("高脂血症"),diagName));
                    //慢性肾脏病
                    if(diagName.contains("膜性肾病") || diagName.contains("慢性肾炎") || diagName.contains("肾炎") || diagName.contains("肾病") || diagName.contains("囊性肾病") || diagName.contains("肾病综合征")
                            || diagName.contains("糖尿病伴有肾的并发症") || diagName.contains("肾功能不全") || diagName.contains("慢性肾功能不全") || diagName.contains("慢性肾病") || diagName.contains("慢性肾小球肾炎")
                            || diagName.contains("慢性肾炎综合征") || diagName.contains("肾病综合征伴有局灶性和节段性肾小球损害") || diagName.contains("慢性肾衰竭") || diagName.contains("梗阻性肾病") || diagName.contains("狼疮性肾炎")
                            || diagName.contains("高血压性肾病") || diagName.contains("肾炎综合征") || diagName.contains("慢性肾脏病5期") || diagName.contains("慢性肾衰竭尿毒症期") || diagName.contains("肾功能不全氮质血症期")
                            || diagName.contains("慢性肾盂肾炎") || diagName.contains("肾萎缩(终末期)") || diagName.contains("慢性肾功能不全尿毒症期") || diagName.contains("慢性肾脏病4期") || diagName.contains("肾盂肾炎")
                            || diagName.contains("糖尿病性肾病") || diagName.contains("尿酸性肾病") || diagName.contains("肾小球肾炎") || diagName.contains("糖尿病肾病IV期") || diagName.contains("肾衰竭")){
                        hisPast.setChronicKidney("是");
                    }
                    //hisPast.setChronicKidney(parsePast1(Constant.mxszbKeyword,diagName));
                    //脑梗塞
                    if((diagName.contains("脑") && diagName.contains("塞")) || diagName.contains("脑") && diagName.contains("梗")){
                        hisPast.setCerebralInfarction("是");
                    }
                    //脑出血
                    if(diagName.contains("脑") && diagName.contains("出血")){
                        hisPast.setCerebralHemorrhage("是");
                    }
                    //系统性红斑狼疮
                    if(diagName.contains("系统性红斑狼疮")){
                        hisPast.setLupusErythematosus("是");
                    }
                    //风湿性关节炎
                    if(diagName.equals("风湿性关节炎")){
                        hisPast.setArthritis("是");
                    }
                    //类风湿关节炎
                    if(diagName.equals("类风湿关节炎")){
                        hisPast.setRheumatoidArthritis("是");
                    }
                    //乙肝
                    if(diagName.contains("乙型")){
                        hisPast.setHepatitisB("是");
                    }
                    //hisPast.setHepatitisB(parsePast1(Constant.ygKeyword,diagName));
                    //丙肝
                    if(diagName.contains("丙型")){
                        hisPast.setHcv("是");
                    }
                    //hisPast.setHcv(parsePast1(Arrays.asList("慢性丙型病毒性肝炎"),diagName));
                    //结核
                    if(diagName.contains("结核")){
                        hisPast.setTuberculosis("是");
                    }
                    //hisPast.setTuberculosis(parsePast1(Constant.jhKeyword,diagName));
                    //HIV感染病史
                    if(diagName.contains("艾滋病")){
                        hisPast.setHiv("是");
                    }
                    //hisPast.setHiv(parsePast1(Arrays.asList("艾滋病"),diagName));
                    //肠梗阻
                    if(diagName.contains("肠梗阻")){
                        hisPast.setIntestinalObstruction("是");
                    }
                    //消化道出血
                    if(diagName.contains("胃出血")
                            || diagName.contains("胃溃疡伴出血") || diagName.contains("消化道出血") || diagName.contains("慢性胃溃疡不伴有出血或穿孔") || diagName.contains("上消化道出血")
                            || diagName.contains("十二指肠球部溃疡伴出血") || diagName.contains("下消化道出血") || diagName.contains("十二指肠溃疡伴出血") || diagName.contains("十二指肠出血")
                            || diagName.contains("急性上消化道出血") || diagName.contains("尺骨桡骨闭合性骨折") || diagName.contains("出血性胃炎") || diagName.contains("食管静脉曲张破裂出血")
                            || diagName.contains("胃底静脉曲张破裂出血")){
                        hisPast.setGastrointestinalBleeding("是");
                    }
                    //消化道穿孔
                    if(diagName.contains("乙状结肠穿孔") || diagName.contains("胃穿孔") || diagName.contains("慢性胃溃疡不伴有出血或穿孔") || diagName.contains("消化道穿孔")
                            || diagName.contains("肠穿孔") || diagName.contains("急性化脓性阑尾炎伴穿孔") || diagName.contains("阑尾穿孔") || diagName.contains("十二指肠球部溃疡伴穿孔")
                            || diagName.contains("上消化道穿孔")){
                        hisPast.setGastrointestinalPerforation("是");
                    }
                    //低蛋白血症
                    if(diagName.equals("低蛋白血症")){
                        hisPast.setHypoproteinemia("是");
                    }
                }
            }
            if(!"".equals(surgeryName) && surgeryName!=null) {
                int surgerySeq = prior.getseq_id();
                if(surgerySeq != index){
                    //既往腹腔内手术史
                    if(surgeryName.contains("胃") || surgeryName.contains("肝") || surgeryName.contains("肠") || surgeryName.contains("阑尾") || surgeryName.contains("脾")
                            || surgeryName.contains("胰") || surgeryName.contains("胆囊") || surgeryName.contains("肾") || surgeryName.contains("肾上腺")
                            || surgeryName.contains("子宫") || surgeryName.contains("卵巢") || surgeryName.contains("输卵管切除") || surgeryName.contains("腹部手术")){
                        hisPast.setAbdominalSurgery("是");
                        //既往手术名称
                        hisPast.setOperationName(surgeryName);
                    }
                }
            }

        }
        hisPast.setUpdatedAt(new Date());
        hisPastService.saveHisPast(hisPast);

    }



    public void savePrimaryDiagnosis(List<INP_DIAGNOSIS>  zj_INP_DIAGNOSIS){


        for(INP_DIAGNOSIS inp_diagnosis : zj_INP_DIAGNOSIS){
            log.info("保存诊断："+inp_diagnosis.getUNIQUE_ID());
            PrimaryDiagnosis primaryDiagnosis = new PrimaryDiagnosis();
            //标识患者身份唯一标识
            primaryDiagnosis.setUniqueId(inp_diagnosis.getUNIQUE_ID());
            //唯一标识
            primaryDiagnosis.setUniqueIdLv1(inp_diagnosis.getUNIQUE_ID_LV1());
            primaryDiagnosis.setUniqueIdLv2(inp_diagnosis.getUNIQUE_ID_LV2());
            //医疗机构代码
            primaryDiagnosis.setP900(inp_diagnosis.getP900());
            //患者id
            primaryDiagnosis.setPatientId(inp_diagnosis.getPATIENT_ID());
            //门诊/住院号
            primaryDiagnosis.setVisitId(inp_diagnosis.getVISIT_ID());
            //诊断名称原文
            primaryDiagnosis.setDiagnosisName(inp_diagnosis.getDIAGNOSIS_DESC());
            //诊断编码
            primaryDiagnosis.setDiagnosisCode(inp_diagnosis.getDIAGNOSIS_CODE());
            //诊断日期
            primaryDiagnosis.setDiagnosisDate(inp_diagnosis.getDIAGNOSIS_DATE());
            int icdindex=0;
            //诊断名称
            if((StringUtils.isNotEmpty(inp_diagnosis.getICD10_ID1()))){
                if(inp_diagnosis.getICD10_ID1().substring(0,1).contains("c")||inp_diagnosis.getICD10_ID1().substring(0,1).contains("C")
                        ){
                    if(Integer.parseInt(inp_diagnosis.getICD10_ID1().substring(1,3))<100){
                        if(Integer.parseInt(inp_diagnosis.getICD10_ID1().substring(1,3))<76 || Integer.parseInt(inp_diagnosis.getICD10_ID1().substring(1,3))>80){
                            primaryDiagnosis.setDiagnosisNameIcd(inp_diagnosis.getICD10_NAME1());
                            icdindex=1;
                        }
                    }
                }else if(inp_diagnosis.getICD10_ID1().substring(0,1).contains("d")||inp_diagnosis.getICD10_ID1().substring(0,1).contains("D")){
                    if(Integer.parseInt(inp_diagnosis.getICD10_ID1().substring(1,3))>9 && Integer.parseInt(inp_diagnosis.getICD10_ID1().substring(1,3))<37){
                        primaryDiagnosis.setDiagnosisNameIcd(inp_diagnosis.getICD10_NAME1());
                        icdindex=1;
                    }
                }
            }
            if((StringUtils.isNotEmpty(inp_diagnosis.getICD10_ID2()))) {
                if (inp_diagnosis.getICD10_ID2().substring(0, 1).contains("c") || inp_diagnosis.getICD10_ID2().substring(0, 1).contains("C")
                        ) {
                    if (Integer.parseInt(inp_diagnosis.getICD10_ID2().substring(1, 3)) < 100) {
                        if (Integer.parseInt(inp_diagnosis.getICD10_ID2().substring(1, 3)) < 76 || Integer.parseInt(inp_diagnosis.getICD10_ID2().substring(1, 3)) > 80) {
                            primaryDiagnosis.setDiagnosisNameIcd(inp_diagnosis.getICD10_NAME2());
                            icdindex = 1;
                        }
                    }
                } else if (inp_diagnosis.getICD10_ID2().substring(0, 1).contains("d") || inp_diagnosis.getICD10_ID2().substring(0, 1).contains("D")) {
                    if (Integer.parseInt(inp_diagnosis.getICD10_ID2().substring(1, 3)) > 9 && Integer.parseInt(inp_diagnosis.getICD10_ID2().substring(1, 3)) < 37) {
                        primaryDiagnosis.setDiagnosisNameIcd(inp_diagnosis.getICD10_NAME2());
                        icdindex = 1;
                    }
                }
            }
            if((StringUtils.isNotEmpty(inp_diagnosis.getICD10_ID3()))) {
                if (inp_diagnosis.getICD10_ID3().substring(0, 1).contains("c") || inp_diagnosis.getICD10_ID3().substring(0, 1).contains("C")
                        ) {
                    if (Integer.parseInt(inp_diagnosis.getICD10_ID3().substring(1, 3)) < 100) {
                        if (Integer.parseInt(inp_diagnosis.getICD10_ID3().substring(1, 3)) < 76 || Integer.parseInt(inp_diagnosis.getICD10_ID3().substring(1, 3)) > 80) {
                            primaryDiagnosis.setDiagnosisNameIcd(inp_diagnosis.getICD10_NAME3());
                            icdindex = 1;
                        }
                    }
                } else if (inp_diagnosis.getICD10_ID3().substring(0, 1).contains("d") || inp_diagnosis.getICD10_ID3().substring(0, 1).contains("D")) {
                    if (Integer.parseInt(inp_diagnosis.getICD10_ID3().substring(1, 3)) > 9 && Integer.parseInt(inp_diagnosis.getICD10_ID3().substring(1, 3)) < 37) {
                        primaryDiagnosis.setDiagnosisNameIcd(inp_diagnosis.getICD10_NAME3());
                        icdindex = 1;
                    }
                }
            }
            if((StringUtils.isNotEmpty(inp_diagnosis.getICD10_ID4()))) {
                if (inp_diagnosis.getICD10_ID4().substring(0, 1).contains("c") || inp_diagnosis.getICD10_ID4().substring(0, 1).contains("C")
                        ) {
                    if (Integer.parseInt(inp_diagnosis.getICD10_ID4().substring(1, 3)) < 100) {
                        if (Integer.parseInt(inp_diagnosis.getICD10_ID4().substring(1, 3)) < 76 || Integer.parseInt(inp_diagnosis.getICD10_ID4().substring(1, 3)) > 80) {
                            primaryDiagnosis.setDiagnosisNameIcd(inp_diagnosis.getICD10_NAME4());
                            icdindex = 1;
                        }
                    }
                } else if (inp_diagnosis.getICD10_ID4().substring(0, 1).contains("d") || inp_diagnosis.getICD10_ID4().substring(0, 1).contains("D")) {
                    if (Integer.parseInt(inp_diagnosis.getICD10_ID4().substring(1, 3)) > 9 && Integer.parseInt(inp_diagnosis.getICD10_ID4().substring(1, 3)) < 37) {
                        primaryDiagnosis.setDiagnosisNameIcd(inp_diagnosis.getICD10_NAME4());
                        icdindex = 1;
                    }
                }
            }
            if((StringUtils.isNotEmpty(inp_diagnosis.getICD10_ID5()))) {
                if (inp_diagnosis.getICD10_ID5().substring(0, 1).contains("c") || inp_diagnosis.getICD10_ID5().substring(0, 1).contains("C")
                        ) {
                    if (Integer.parseInt(inp_diagnosis.getICD10_ID5().substring(1, 3)) < 100) {
                        if (Integer.parseInt(inp_diagnosis.getICD10_ID5().substring(1, 3)) < 76 || Integer.parseInt(inp_diagnosis.getICD10_ID5().substring(1, 3)) > 80) {
                            primaryDiagnosis.setDiagnosisNameIcd(inp_diagnosis.getICD10_NAME5());
                            icdindex = 1;
                        }
                    }
                } else if (inp_diagnosis.getICD10_ID5().substring(0, 1).contains("d") || inp_diagnosis.getICD10_ID5().substring(0, 1).contains("D")) {
                    if (Integer.parseInt(inp_diagnosis.getICD10_ID5().substring(1, 3)) > 9 && Integer.parseInt(inp_diagnosis.getICD10_ID5().substring(1, 3)) < 37) {
                        primaryDiagnosis.setDiagnosisNameIcd(inp_diagnosis.getICD10_NAME5());
                        icdindex = 1;
                    }
                }
            }
            if((StringUtils.isNotEmpty(inp_diagnosis.getICD10_ID6()))) {
                if (inp_diagnosis.getICD10_ID6().substring(0, 1).contains("c") || inp_diagnosis.getICD10_ID6().substring(0, 1).contains("C")
                        ) {
                    if (Integer.parseInt(inp_diagnosis.getICD10_ID6().substring(1, 3)) < 100) {
                        if (Integer.parseInt(inp_diagnosis.getICD10_ID6().substring(1, 3)) < 76 || Integer.parseInt(inp_diagnosis.getICD10_ID6().substring(1, 3)) > 80) {
                            primaryDiagnosis.setDiagnosisNameIcd(inp_diagnosis.getICD10_NAME6());
                            icdindex = 1;
                        }
                    }
                } else if (inp_diagnosis.getICD10_ID6().substring(0, 1).contains("d") || inp_diagnosis.getICD10_ID6().substring(0, 1).contains("D")) {
                    if (Integer.parseInt(inp_diagnosis.getICD10_ID6().substring(1, 3)) > 9 && Integer.parseInt(inp_diagnosis.getICD10_ID6().substring(1, 3)) < 37) {
                        primaryDiagnosis.setDiagnosisNameIcd(inp_diagnosis.getICD10_NAME6());
                        icdindex = 1;
                    }
                }
            }
            if((StringUtils.isNotEmpty(inp_diagnosis.getICD10_ID7()))) {
                if (inp_diagnosis.getICD10_ID7().substring(0, 1).contains("c") || inp_diagnosis.getICD10_ID7().substring(0, 1).contains("C")
                        ) {
                    if (Integer.parseInt(inp_diagnosis.getICD10_ID7().substring(1, 3)) < 100) {
                        if (Integer.parseInt(inp_diagnosis.getICD10_ID7().substring(1, 3)) < 76 || Integer.parseInt(inp_diagnosis.getICD10_ID7().substring(1, 3)) > 80) {
                            primaryDiagnosis.setDiagnosisNameIcd(inp_diagnosis.getICD10_NAME7());
                            icdindex = 1;
                        }
                    }
                } else if (inp_diagnosis.getICD10_ID7().substring(0, 1).contains("d") || inp_diagnosis.getICD10_ID7().substring(0, 1).contains("D")) {
                    if (Integer.parseInt(inp_diagnosis.getICD10_ID7().substring(1, 3)) > 9 && Integer.parseInt(inp_diagnosis.getICD10_ID7().substring(1, 3)) < 37) {
                        primaryDiagnosis.setDiagnosisNameIcd(inp_diagnosis.getICD10_NAME7());
                        icdindex = 1;
                    }
                }
            }
            //诊断类型
            primaryDiagnosis.setDiagnosisType(inp_diagnosis.getDIAGNOSIS_TYPE());
            //出现转移
            if(inp_diagnosis.getICD10_NAME1()==null){
                inp_diagnosis.setICD10_NAME1("");
            }
            if(inp_diagnosis.getICD10_NAME2()==null){
                inp_diagnosis.setICD10_NAME2("");
            }
            if(inp_diagnosis.getICD10_NAME3()==null){
                inp_diagnosis.setICD10_NAME3("");
            }
            if(inp_diagnosis.getICD10_NAME4()==null){
                inp_diagnosis.setICD10_NAME4("");
            }
            if(inp_diagnosis.getICD10_NAME5()==null){
                inp_diagnosis.setICD10_NAME5("");
            }
            if(inp_diagnosis.getICD10_NAME6()==null){
                inp_diagnosis.setICD10_NAME6("");
            }
            if(inp_diagnosis.getICD10_NAME7()==null){
                inp_diagnosis.setICD10_NAME7("");
            }
            if(inp_diagnosis.getICD10_NAME1().contains("继发")|| inp_diagnosis.getICD10_NAME2().contains("继发")
                    ||inp_diagnosis.getICD10_NAME3().contains("继发") ||inp_diagnosis.getICD10_NAME4().contains("继发")
                    ||inp_diagnosis.getICD10_NAME5().contains("继发") || inp_diagnosis.getICD10_NAME6().contains("继发")
                    || inp_diagnosis.getICD10_NAME7().contains("继发")){
                if(inp_diagnosis.getICD10_NAME1().contains("可疑") || inp_diagnosis.getICD10_NAME2().contains("可疑")
                        || inp_diagnosis.getICD10_NAME3().contains("可疑")|| inp_diagnosis.getICD10_NAME4().contains("可疑")
                        || inp_diagnosis.getICD10_NAME5().contains("可疑")|| inp_diagnosis.getICD10_NAME6().contains("可疑")
                        || inp_diagnosis.getICD10_NAME7().contains("可疑")){
                    primaryDiagnosis.setIfTransfer("未知");
                }else{
                    primaryDiagnosis.setIfTransfer("是");
                    //转移部位
                    if(inp_diagnosis.getICD10_NAME1().contains("继发")&&(inp_diagnosis.getICD10_NAME1().contains("脑") ||
                            inp_diagnosis.getICD10_NAME1().contains("肺")||inp_diagnosis.getICD10_NAME1().contains("肝")||
                            inp_diagnosis.getICD10_NAME1().contains("骨")||inp_diagnosis.getICD10_NAME1().contains("淋巴结")||
                            inp_diagnosis.getICD10_NAME1().contains("肾"))){
                        primaryDiagnosis.setTransferPosition(inp_diagnosis.getICD10_NAME1()
                                .substring(0,inp_diagnosis.getICD10_NAME1().indexOf("继")));
                    }
                    if(inp_diagnosis.getICD10_NAME2().contains("继发")&&(inp_diagnosis.getICD10_NAME2().contains("脑") ||
                            inp_diagnosis.getICD10_NAME2().contains("肺")||inp_diagnosis.getICD10_NAME2().contains("肝")||
                            inp_diagnosis.getICD10_NAME2().contains("骨")||inp_diagnosis.getICD10_NAME2().contains("淋巴结")||
                            inp_diagnosis.getICD10_NAME2().contains("肾"))){
                        primaryDiagnosis.setTransferPosition(inp_diagnosis.getICD10_NAME2()
                                .substring(0,inp_diagnosis.getICD10_NAME2().indexOf("继")));
                    }
                    if(inp_diagnosis.getICD10_NAME3().contains("继发")&&(inp_diagnosis.getICD10_NAME3().contains("脑") ||
                            inp_diagnosis.getICD10_NAME3().contains("肺")||inp_diagnosis.getICD10_NAME3().contains("肝")||
                            inp_diagnosis.getICD10_NAME3().contains("骨")||inp_diagnosis.getICD10_NAME3().contains("淋巴结")||
                            inp_diagnosis.getICD10_NAME3().contains("肾"))){
                        primaryDiagnosis.setTransferPosition(inp_diagnosis.getICD10_NAME3()
                                .substring(0,inp_diagnosis.getICD10_NAME3().indexOf("继")));
                    }
                    if(inp_diagnosis.getICD10_NAME4().contains("继发")&&(inp_diagnosis.getICD10_NAME4().contains("脑") ||
                            inp_diagnosis.getICD10_NAME4().contains("肺")||inp_diagnosis.getICD10_NAME4().contains("肝")||
                            inp_diagnosis.getICD10_NAME4().contains("骨")||inp_diagnosis.getICD10_NAME4().contains("淋巴结")||
                            inp_diagnosis.getICD10_NAME4().contains("肾"))){
                        primaryDiagnosis.setTransferPosition(inp_diagnosis.getICD10_NAME4()
                                .substring(0,inp_diagnosis.getICD10_NAME4().indexOf("继")));
                    }
                    if(inp_diagnosis.getICD10_NAME5().contains("继发")&&(inp_diagnosis.getICD10_NAME5().contains("脑") ||
                            inp_diagnosis.getICD10_NAME5().contains("肺")||inp_diagnosis.getICD10_NAME5().contains("肝")||
                            inp_diagnosis.getICD10_NAME5().contains("骨")||inp_diagnosis.getICD10_NAME5().contains("淋巴结")||
                            inp_diagnosis.getICD10_NAME5().contains("肾"))){
                        primaryDiagnosis.setTransferPosition(inp_diagnosis.getICD10_NAME5()
                                .substring(0,inp_diagnosis.getICD10_NAME5().indexOf("继")));
                    }
                    if(inp_diagnosis.getICD10_NAME6().contains("继发")&&(inp_diagnosis.getICD10_NAME6().contains("脑") ||
                            inp_diagnosis.getICD10_NAME6().contains("肺")||inp_diagnosis.getICD10_NAME6().contains("肝")||
                            inp_diagnosis.getICD10_NAME6().contains("骨")||inp_diagnosis.getICD10_NAME6().contains("淋巴结")||
                            inp_diagnosis.getICD10_NAME6().contains("肾"))){
                        primaryDiagnosis.setTransferPosition(inp_diagnosis.getICD10_NAME6()
                                .substring(0,inp_diagnosis.getICD10_NAME6().indexOf("继")));
                    }
                    if(inp_diagnosis.getICD10_NAME7().contains("继发")&&(inp_diagnosis.getICD10_NAME7().contains("脑") ||
                            inp_diagnosis.getICD10_NAME7().contains("肺")||inp_diagnosis.getICD10_NAME7().contains("肝")||
                            inp_diagnosis.getICD10_NAME7().contains("骨")||inp_diagnosis.getICD10_NAME7().contains("淋巴结")||
                            inp_diagnosis.getICD10_NAME7().contains("肾"))){
                        primaryDiagnosis.setTransferPosition(inp_diagnosis.getICD10_NAME7()
                                .substring(0,inp_diagnosis.getICD10_NAME7().indexOf("继")));
                    }
                }
            }else{
                primaryDiagnosis.setIfTransfer("否");
            }
            //复发
            if(inp_diagnosis.getICD10_NAME1().contains("复发") || inp_diagnosis.getICD10_NAME1().contains("复发")
                    || inp_diagnosis.getICD10_NAME1().contains("复发")|| inp_diagnosis.getICD10_NAME1().contains("复发")
                    || inp_diagnosis.getICD10_NAME1().contains("复发")|| inp_diagnosis.getICD10_NAME1().contains("复发")
                    || inp_diagnosis.getICD10_NAME1().contains("复发")){

                primaryDiagnosis.setIfRecrudescence("是");
                //复发形式
                if((inp_diagnosis.getICD10_NAME1().contains("继发") || inp_diagnosis.getICD10_NAME1().contains("继发")
                        || inp_diagnosis.getICD10_NAME1().contains("继发")|| inp_diagnosis.getICD10_NAME1().contains("继发")
                        || inp_diagnosis.getICD10_NAME1().contains("继发")|| inp_diagnosis.getICD10_NAME1().contains("继发")
                        || inp_diagnosis.getICD10_NAME1().contains("继发")) &&
                        (!inp_diagnosis.getICD10_NAME1().contains("肺") || !inp_diagnosis.getICD10_NAME1().contains("肺")
                                || !inp_diagnosis.getICD10_NAME1().contains("肺")|| !inp_diagnosis.getICD10_NAME1().contains("肺")
                                || !inp_diagnosis.getICD10_NAME1().contains("肺")|| !inp_diagnosis.getICD10_NAME1().contains("肺")
                                || !inp_diagnosis.getICD10_NAME1().contains("肺"))){
                    primaryDiagnosis.setRecrudescenceType("远处转移");
                }else{
                    primaryDiagnosis.setRecrudescenceType("局部复发");
                }
            }else{
                primaryDiagnosis.setIfRecrudescence("否");
            }
            //复发或转移时间
            if(inp_diagnosis.getICD10_NAME1().contains("继发")||inp_diagnosis.getICD10_NAME1().contains("复发")||
                    inp_diagnosis.getICD10_NAME2().contains("继发")||inp_diagnosis.getICD10_NAME2().contains("复发")||
                    inp_diagnosis.getICD10_NAME3().contains("继发")||inp_diagnosis.getICD10_NAME3().contains("复发")||
                    inp_diagnosis.getICD10_NAME4().contains("继发")||inp_diagnosis.getICD10_NAME4().contains("复发")||
                    inp_diagnosis.getICD10_NAME5().contains("继发")||inp_diagnosis.getICD10_NAME5().contains("复发")||
                    inp_diagnosis.getICD10_NAME6().contains("继发")||inp_diagnosis.getICD10_NAME6().contains("复发")||
                    inp_diagnosis.getICD10_NAME7().contains("继发")||inp_diagnosis.getICD10_NAME7().contains("复发")){
                primaryDiagnosis.setRecrudescenceDate(inp_diagnosis.getDIAGNOSIS_DATE());
            }
            if(icdindex==1){
                primaryDiagnosisService.savePrimaryDiagnosis(primaryDiagnosis);

            }
        }

    }


    public void saveDiagnosisStage(List<CLINICAL_DIAG> zj_clinical_diag) {
        for(CLINICAL_DIAG clinical_diag:zj_clinical_diag){
            log.info("保存诊断分期："+clinical_diag.getunique_id());
            DiagnosisStage diagnosisStage = new DiagnosisStage();
            //标识患者身份唯一标识
            //   diagnosisStage.setPersonId(clinical_diag.get);
            //唯一标识
            diagnosisStage.setUniqueId(clinical_diag.getunique_id());
            //中间库unique_id
            diagnosisStage.setUniqueIdLv1(clinical_diag.getunique_id_lv1());
            diagnosisStage.setUniqueIdLv2(clinical_diag.getunique_id_lv2());
            //医疗机构代码
            diagnosisStage.setP900(clinical_diag.getp900());
            //患者id
            diagnosisStage.setPatientId(clinical_diag.getpatient_id());
            //住院门诊号
            diagnosisStage.setVisitId(clinical_diag.getvisit_id());
            //诊断名称
            diagnosisStage.setDiagName(clinical_diag.getdiag());
            //诊断名称标化结果合并
            String nlpTableJson = this.selectStandardResultById(clinical_diag.getdiag_std());
            String nlpTableJson2 = JSONUtils.getAllFieldGroupByObj(nlpTableJson, "afterType1", ",",";");
            diagnosisStage.setDiagNameStd(nlpTableJson2);
            //T分期
            if(clinical_diag.getstage_std()!=null){
                String tstageJson = this.selectStandardResultById(clinical_diag.getstage_std());
                String tstageJson2 = JSONUtils.getDuplicatedConcatOne(tstageJson, "afterType1", "stage_t_std");
                diagnosisStage.setTStage(tstageJson2);
                //N分期
                String nstageJson = this.selectStandardResultById(clinical_diag.getstage_std());
                String nstageJson2 = JSONUtils.getDuplicatedConcatOne(nstageJson, "afterType1", "stage_n_std");
                diagnosisStage.setNStage(nstageJson2);
                //M分期
                String mstageJson = this.selectStandardResultById(clinical_diag.getstage_std());
                String mstageJson2 = JSONUtils.getDuplicatedConcatOne(mstageJson, "afterType1", "stage_m_std");
                diagnosisStage.setMStage(mstageJson2);
                //TNM综合分期
                String tnmstageJson = this.selectStandardResultById(clinical_diag.getstage_std());
                String tnmstageJson2 = JSONUtils.getDuplicatedConcatOne(tnmstageJson, "afterType1", "stage_tnm_std");
                diagnosisStage.setTnmStage(tnmstageJson2);
            }



            diagnosisStageService.saveDiagnosisStage(diagnosisStage);
        }

    }


    public String  selectStandardResultById(String tableId){
        String  nlpTable =  standardResultMapper.selectStandardResultById(tableId);
        return nlpTable;
    }

    // ----------------------------------------ma

    public void addrabat(List<CHEST_XR_ENTRY_RESULTS> zjChestXrEntryResultsByALL) {

        for (CHEST_XR_ENTRY_RESULTS chest_xr_entry_results: zjChestXrEntryResultsByALL) {
            Rabat rabat = new Rabat();
            List<EXAM_MASTER> zjExamMasterByUniqueId = zjExamMasterMapper.findZjExamMasterById(chest_xr_entry_results.getunique_id());
            for (EXAM_MASTER exam_master: zjExamMasterByUniqueId) {
                rabat.setUniqueId(exam_master.getUNIQUE_ID());
                rabat.setUniqueIdLv1(exam_master.getUNIQUE_ID_LV1());
                rabat.setUniqueIdLv2(exam_master.getUNIQUE_ID_LV2());
                rabat.setP900(exam_master.getP900());
                rabat.setPatientId(exam_master.getPATIENT_ID());
                rabat.setVisitId(exam_master.getVISIT_ID());
                rabat.setExamNo(exam_master.getEXAM_NO());
                StringBuffer EXAM_NAME_STD = new StringBuffer();

                if (exam_master.getEXAM_NAME1_STD()!= null ){
                    EXAM_NAME_STD.append(exam_master.getEXAM_NAME1_STD());
                }
                if (exam_master.getEXAM_NAME2_STD()!= null ){
                    EXAM_NAME_STD.append(exam_master.getEXAM_NAME2_STD());
                }
                if (exam_master.getEXAM_NAME3_STD()!= null ){
                    EXAM_NAME_STD.append(exam_master.getEXAM_NAME3_STD());
                }
                if (exam_master.getEXAM_NAME4_STD()!= null ){
                    EXAM_NAME_STD.append(exam_master.getEXAM_NAME4_STD());
                }
                if (exam_master.getEXAM_NAME5_STD()!= null ){
                    EXAM_NAME_STD.append(exam_master.getEXAM_NAME5_STD());
                }
                if (exam_master.getEXAM_NAME6_STD()!= null ){
                    EXAM_NAME_STD.append(exam_master.getEXAM_NAME6_STD());
                }
                rabat.setExamName(EXAM_NAME_STD.toString());
                rabat.setDataVersion(exam_master.getDATA_VERSION());
                rabat.setDataDbSource(exam_master.getDATA_DB_SOURCE());
                rabat.setDataTableSource(exam_master.getDATA_TABLE_SOURCE());
                rabat.setDataFieldSource(exam_master.getDATA_FIELD_SOURCE());
                rabat.setCreatedAt(exam_master.getCREATED_AT());
                rabat.setUpdatedAt(exam_master.getUPDATED_AT());
            }
            if(chest_xr_entry_results.getneg_std()==null || chest_xr_entry_results.getneg_std().equals("")){
                String s = standardResultMapper.selectStandardResultById(chest_xr_entry_results.getnature_std());
                if (!(s== null || s.equals(""))){
                    List<String> list = JSONUtils.getList(s, "afterType1", "nature_std");
                    StringBuffer nature_std = new StringBuffer();
                    boolean flag=false;
                    boolean natureflag=false;
                    for (String nature_std1: list) {
                        if (nature_std1.contains("转移")||nature_std1.contains("淋巴结转移")){
                            flag=true;
                        }
                        if (nature_std1.contains("无法判断")||nature_std1.contains("淋巴结无法判断")){
                            natureflag=true;
                        }
                        nature_std.append(nature_std1);
                    }
                    if (flag){
                        rabat.setMove("是");
                    }else if (natureflag) {
                        rabat.setMove("无法判断");
                    }
                    else{rabat.setMove("否");}

                }
                else{
                    rabat.setMove("否");
                }
            }
            else{rabat.setMove("否");}
            rabatMapper.saveRabat(rabat);
        }

    }
    public  void addchectCtDesadd(List<CHEST_CT_DESCRIPTION> zjChestCtDescriptionByALL ) {
        for (CHEST_CT_DESCRIPTION chest_ct_description: zjChestCtDescriptionByALL) {
            ChectCtDes chectCtDes = new ChectCtDes();
            List<EXAM_MASTER> zjExamMasterByUniqueId = zjExamMasterMapper.findZjExamMasterById(chest_ct_description.getunique_id());
            for (EXAM_MASTER exam_master: zjExamMasterByUniqueId) {
                chectCtDes.setUniqueId(exam_master.getUNIQUE_ID());
                chectCtDes.setUniqueIdLv1(exam_master.getUNIQUE_ID_LV1());
                chectCtDes.setUniqueIdLv2(exam_master.getUNIQUE_ID_LV2());
                chectCtDes.setP900(exam_master.getP900());
                chectCtDes.setPatientId(exam_master.getPATIENT_ID());
                chectCtDes.setVisitId(exam_master.getVISIT_ID());
                chectCtDes.setExamNo(exam_master.getEXAM_NO());
                StringBuffer EXAM_NAME_STD = new StringBuffer();

                if (exam_master.getEXAM_NAME1_STD()!= null ){
                    EXAM_NAME_STD.append(exam_master.getEXAM_NAME1_STD());
                }
                if (exam_master.getEXAM_NAME2_STD()!= null ){
                    EXAM_NAME_STD.append(exam_master.getEXAM_NAME2_STD());
                }
                if (exam_master.getEXAM_NAME3_STD()!= null ){
                    EXAM_NAME_STD.append(exam_master.getEXAM_NAME3_STD());
                }
                if (exam_master.getEXAM_NAME4_STD()!= null ){
                    EXAM_NAME_STD.append(exam_master.getEXAM_NAME4_STD());
                }
                if (exam_master.getEXAM_NAME5_STD()!= null ){
                    EXAM_NAME_STD.append(exam_master.getEXAM_NAME5_STD());
                }
                if (exam_master.getEXAM_NAME6_STD()!= null ){
                    EXAM_NAME_STD.append(exam_master.getEXAM_NAME6_STD());
                }
                chectCtDes.setExamName(EXAM_NAME_STD.toString());
                chectCtDes.setDataVersion(exam_master.getDATA_VERSION());
                chectCtDes.setDataDbSource(exam_master.getDATA_DB_SOURCE());
                chectCtDes.setDataTableSource(exam_master.getDATA_TABLE_SOURCE());
                chectCtDes.setDataFieldSource(exam_master.getDATA_FIELD_SOURCE());
                chectCtDes.setCreatedAt(exam_master.getCREATED_AT());
                chectCtDes.setUpdatedAt(exam_master.getUPDATED_AT());
            }
            chectCtDes.setStructure(chest_ct_description.getstructure());
            chectCtDes.setLocation(chest_ct_description.getlocation());
            chectCtDes.setLesion(chest_ct_description.getlesion());
            chectCtDes.setSize(chest_ct_description.getsize());
            chectCtDes.setQuanity(chest_ct_description.getquantity());
            List<CHEST_CT_ENTRY_RESULTS> zjChestCtEntryResultsByUniqueId = zjChestCtEntryResultsMapper.findZjChestCtEntryResultsByUniqueId(chest_ct_description.getunique_id_lv2());
            for (CHEST_CT_ENTRY_RESULTS chest_ct_entry_results: zjChestCtEntryResultsByUniqueId) {
                if(chest_ct_entry_results.getneg_std()==null || chest_ct_entry_results.getneg_std().equals("")) {
                    String s = standardResultMapper.selectStandardResultById(chest_ct_entry_results.getnature_std());
                    if (!(s== null || s.equals(""))){
                        boolean natureflag=false;
                        List<String> list = JSONUtils.getList(s, "afterType1", "nature_std");
                        // System.out.println(list);
                        StringBuffer nature_std = new StringBuffer();
                        for (String nature_std1: list) {
                            if (nature_std1.equals("转移") || nature_std1.equals("淋巴结转移")){
                                natureflag=true;
                            }
                            nature_std.append(nature_std1);
                        }
                        if (natureflag){
                            /*  1、“转移”字段确定为是后，对应的quantity_std或nature_quantity_std ，两个字段取并集，优先赋值quantity_std*/
                            //if (chest_ct_entry_results.getstructure_std() ==null || chest_ct_entry_results.getstructure_std().equals("")){
                            if(chest_ct_entry_results.getstructure().equals(chest_ct_description.getstructure())){
                                StringBuffer quantity_std = new StringBuffer();
                                StringBuffer nature_quantity_std = new StringBuffer();
                                if (!(chest_ct_entry_results.getquantity_std()==null ||chest_ct_entry_results.getquantity_std().equals(""))){
                                    String s1 = standardResultMapper.selectStandardResultById(chest_ct_entry_results.getquantity_std());
                                    // System.out.println(s1);
                                    List<String> list1 = JSONUtils.getList(s1, "afterType1", "quantity_std");
                                    //System.out.println(list1);

                                    for (String quantity_std1: list1) {
                                        quantity_std.append(quantity_std1);
                                    }
                                }
                                if (!(chest_ct_entry_results.getnature_quantity_std()==null ||chest_ct_entry_results.getnature_quantity_std().equals(""))) {
                                    String s2 = standardResultMapper.selectStandardResultById(chest_ct_entry_results.getnature_quantity_std());
                                    List<String> list2= JSONUtils.getList(s2, "afterType1", "nature_quantity_std");
                                    //System.out.println(list2);
                                    for (String nature_quantity_std1: list2) {
                                        nature_quantity_std.append(nature_quantity_std1);
                                    }
                                }

                           /*2、第一种情况没有值时：“转移”字段确定为是后，转移对应的structure_std，在chest_ct_description表单相同
                            ID找到相同的值域，其关联的quantity_std，数值为1则为单发，其他保留标准化后值域*/
                                if ((quantity_std==null || quantity_std.equals(""))&&(nature_quantity_std==null || nature_quantity_std.equals(""))){
                                    String s3 = standardResultMapper.selectStandardResultById(chest_ct_entry_results.getquantity_std());
                                    List<String> list3= JSONUtils.getList(s3, "afterType1", "quantity_std");
                                    StringBuffer cquantity_std = new StringBuffer();
                                    System.out.println(list3);
                                    for (String cquantity_std1: list3) {
                                        cquantity_std.append(cquantity_std1);
                                    }
                                    if (cquantity_std.toString().contains("1")||cquantity_std.toString().contains("一")||Integer.parseInt(cquantity_std.toString())==1){
                                        chectCtDes.setQuantityStd("单发");
                                    }
                                    else{
                                        chectCtDes.setQuantityStd(cquantity_std.toString());
                                    }

                                }

                                else{
                                    chectCtDes.setQuantityStd(quantity_std+" "+nature_quantity_std);
                                    //“转移”字段确定为是后，转移对应的structure_std，在chest_ct_description表单相同ID找到相同的值域后，其关联的size_std
                                    if (!(chest_ct_description.getsize_std()==null)) {
                                        String s4 = standardResultMapper.selectStandardResultById(chest_ct_description.getsize_std());
                                        List<String> list4 = JSONUtils.getList(s4, "afterType1", "size_std");
                                        StringBuffer size_std = new StringBuffer();
                                        for (String size_std1 : list4) {
                                            size_std.append(size_std1);
                                        }
                                        System.out.println(size_std);
                                        chectCtDes.setSizeStd(size_std.toString());
                                    }

                                }
                                //}


                            }
                        }
                    }


                }


            }
            chectCtDesMapper.saveChectCtDes(chectCtDes);
        }
    }

    public void addchectCtResult( List<CHEST_CT_ENTRY_RESULTS> zjChestCtEntryResultsByALL) {
        for (CHEST_CT_ENTRY_RESULTS chest_ct_entry_results: zjChestCtEntryResultsByALL) {
            ChectCtResult chectCtResult = new ChectCtResult();
            List<EXAM_MASTER> zjExamMasterByUniqueId = zjExamMasterMapper.findZjExamMasterById(chest_ct_entry_results.getunique_id());
            for (EXAM_MASTER exam_master: zjExamMasterByUniqueId) {
                chectCtResult.setUniqueId(exam_master.getUNIQUE_ID());
                chectCtResult.setUniqueIdLv1(exam_master.getUNIQUE_ID_LV1());
                chectCtResult.setUniqueIdLv2(exam_master.getUNIQUE_ID_LV2());
                chectCtResult.setP900(exam_master.getP900());
                chectCtResult.setPatientId(exam_master.getPATIENT_ID());
                chectCtResult.setVisitId(exam_master.getVISIT_ID());
                chectCtResult.setExamNo(exam_master.getEXAM_NO());
                StringBuffer EXAM_NAME_STD = new StringBuffer();

                if (exam_master.getEXAM_NAME1_STD()!= null ){
                    EXAM_NAME_STD.append(exam_master.getEXAM_NAME1_STD());
                }
                if (exam_master.getEXAM_NAME2_STD()!= null ){
                    EXAM_NAME_STD.append(exam_master.getEXAM_NAME2_STD());
                }
                if (exam_master.getEXAM_NAME3_STD()!= null ){
                    EXAM_NAME_STD.append(exam_master.getEXAM_NAME3_STD());
                }
                if (exam_master.getEXAM_NAME4_STD()!= null ){
                    EXAM_NAME_STD.append(exam_master.getEXAM_NAME4_STD());
                }
                if (exam_master.getEXAM_NAME5_STD()!= null ){
                    EXAM_NAME_STD.append(exam_master.getEXAM_NAME5_STD());
                }
                if (exam_master.getEXAM_NAME6_STD()!= null ){
                    EXAM_NAME_STD.append(exam_master.getEXAM_NAME6_STD());
                }
                chectCtResult.setExamName(EXAM_NAME_STD.toString());
                chectCtResult.setDataVersion(exam_master.getDATA_VERSION());
                chectCtResult.setDataDbSource(exam_master.getDATA_DB_SOURCE());
                chectCtResult.setDataTableSource(exam_master.getDATA_TABLE_SOURCE());
                chectCtResult.setDataFieldSource(exam_master.getDATA_FIELD_SOURCE());
                chectCtResult.setCreatedAt(exam_master.getCREATED_AT());
                chectCtResult.setUpdatedAt(exam_master.getUPDATED_AT());
            }
            if(chest_ct_entry_results.getneg_std()==null || chest_ct_entry_results.getneg_std().equals("")) {
                String s = standardResultMapper.selectStandardResultById(chest_ct_entry_results.getnature_std());
                if (!(s== null || s.equals(""))){
                    List<String> list = JSONUtils.getList(s, "afterType1", "nature_std");
                    StringBuffer nature_std = new StringBuffer();
                    boolean natureflag=false;
                    for (String nature_std1: list) {
                        if (nature_std1.equals("转移") || nature_std1.equals("淋巴结转移")){
                            natureflag=true;
                        }
                        nature_std.append(nature_std1);
                    }
                    if (natureflag){
                        chectCtResult.setMove("是");
                        // 1、“转移”字段确定为是后，对应的structure_std；
                        // 2、lesion_std检索"到淋巴结"+nature_std检索"转移"+neg_std为空，则转移部位为淋巴结
                        String s1 = standardResultMapper.selectStandardResultById(chest_ct_entry_results.getstructure_std());
                        List<String> list1 = JSONUtils.getList(s1, "afterType1", "structure_site_std");
                        System.out.println(list1);
                        StringBuffer structure_std = new StringBuffer();
                        for (String structure_std1: list1) {
                            structure_std.append(structure_std1);
                        }
                        System.out.println(structure_std);
                        if (structure_std.toString()== null || structure_std.toString().equals("")){
                            String s2 = standardResultMapper.selectStandardResultById(chest_ct_entry_results.getlesion_std());
                            List<String> list2 = JSONUtils.getList(s2, "afterType1", "lesion_std");
                            StringBuffer lesion_std = new StringBuffer();
                            for (String lesion_std1: list2) {
                                lesion_std.append(lesion_std1);
                            }
                            if (structure_std.toString().contains("淋巴结")){
                                chectCtResult.setStatureSite("淋巴结");
                            }
                        }
                        else{
                            chectCtResult.setStatureSite(structure_std.toString());
                        }
                    }
                    else  if (nature_std.toString().contains("无法判断") || nature_std.toString().contains("淋巴结无法判断")) {
                        chectCtResult.setMove("无法判断");
                    }
                    else{chectCtResult.setMove("否");}

                }
                else{chectCtResult.setMove("否");}
            }
            else{chectCtResult.setMove("否");}
            chectCtResultMapper.saveChectCtResult(chectCtResult);
        }
    }
    public void addctDes(List<ABDOM_CT_ENTRY_RESULTS> zjAbdomCtEntryResultsByALL) {
        HashSet<String> unique_idSet = new HashSet<>();
        for (ABDOM_CT_ENTRY_RESULTS abdom_ct_entry_results: zjAbdomCtEntryResultsByALL) {
            unique_idSet.add(abdom_ct_entry_results.getunique_id());
        }
        for (String unique_id : unique_idSet) {
            List<ABDOM_CT_ENTRY_RESULTS> zjAbdomCtEntryResultsById = zjAbdomCtEntryResultsMapper.findZjAbdomCtEntryResultsById(unique_id);
            List<ABDOM_CT_DESCRIPTION> zjAbdomCtDescriptionById = zjAbdomCtDescriptionMapper.findZjAbdomCtDescriptionById(unique_id);
            ArrayList<AbdomenCtResult> abdomenCtResults = new ArrayList<>();
            // ArrayList<ABDOM_MR_DESCRIPTION> abdom_mr_descriptions = new ArrayList<>();
            for (ABDOM_CT_ENTRY_RESULTS abdom_ct_entry_results:zjAbdomCtEntryResultsById) {
                List<EXAM_MASTER> zjExamMasterByUniqueId = zjExamMasterMapper.findZjExamMasterById(abdom_ct_entry_results.getunique_id());
                AbdomenCtResult abdomenCtResult = new AbdomenCtResult();
                for (EXAM_MASTER exam_master: zjExamMasterByUniqueId) {
                    abdomenCtResult.setUniqueId(exam_master.getUNIQUE_ID());
                    abdomenCtResult.setUniqueIdLv1(exam_master.getUNIQUE_ID_LV1());
                    abdomenCtResult.setUniqueIdLv2(exam_master.getUNIQUE_ID_LV2());
                    abdomenCtResult.setP900(exam_master.getP900());
                    abdomenCtResult.setPatientId(exam_master.getPATIENT_ID());
                    abdomenCtResult.setVisitId(exam_master.getVISIT_ID());
                    StringBuffer EXAM_NAME_STD = new StringBuffer();

                    if (exam_master.getEXAM_NAME1_STD()!= null ){
                        EXAM_NAME_STD.append(exam_master.getEXAM_NAME1_STD());
                    }
                    if (exam_master.getEXAM_NAME2_STD()!= null ){
                        EXAM_NAME_STD.append(exam_master.getEXAM_NAME2_STD());
                    }
                    if (exam_master.getEXAM_NAME3_STD()!= null ){
                        EXAM_NAME_STD.append(exam_master.getEXAM_NAME3_STD());
                    }
                    if (exam_master.getEXAM_NAME4_STD()!= null ){
                        EXAM_NAME_STD.append(exam_master.getEXAM_NAME4_STD());
                    }
                    if (exam_master.getEXAM_NAME5_STD()!= null ){
                        EXAM_NAME_STD.append(exam_master.getEXAM_NAME5_STD());
                    }
                    if (exam_master.getEXAM_NAME6_STD()!= null ){
                        EXAM_NAME_STD.append(exam_master.getEXAM_NAME6_STD());
                    }
                    abdomenCtResult.setExamName(EXAM_NAME_STD.toString());
                    //abdomenCtResult.setExamName(exam_master.getENTRY_NAME());
                    abdomenCtResult.setDataVersion(exam_master.getDATA_VERSION());
                    abdomenCtResult.setDataDbSource(exam_master.getDATA_DB_SOURCE());
                    abdomenCtResult.setDataTableSource(exam_master.getDATA_TABLE_SOURCE());
                    abdomenCtResult.setDataFieldSource(exam_master.getDATA_FIELD_SOURCE());
                    abdomenCtResult.setCreatedAt(exam_master.getCREATED_AT());
                    abdomenCtResult.setUpdatedAt(exam_master.getUPDATED_AT());
                }
                if (abdom_ct_entry_results.getneg_std()==null||abdom_ct_entry_results.getneg_std().equals("")){
                    //neg_std为空 + lesion_std为备注值域 + structure_site_std为“肠或大肠”，同时满足则为是
                    if (abdom_ct_entry_results.getlesion_std()!=null){
                        String lesion_std = Json(abdom_ct_entry_results.getlesion_std(), "lesion_std");
                        if(lesion_std.contains("高密度影") ||lesion_std.contains("低密度影") ||lesion_std.contains("软组织影")
                                ||lesion_std.contains("结节") ||lesion_std.contains("肿物") ||lesion_std.contains("占位")
                                ||lesion_std.contains("息肉") ||lesion_std.contains("异常密度影") ||lesion_std.contains("脂肪密度影") ||
                                lesion_std.contains("等密度影") ||lesion_std.contains("混合密度影") ){
                            if (abdom_ct_entry_results.getstructure_std()!=null){
                                String structure_site_std = Json(abdom_ct_entry_results.getstructure_std(), "structure_site_std");
                                if (structure_site_std.contains("大肠")||structure_site_std.contains("肠")){
                                    abdomenCtResult.setColorectalMass("是");
                                    //1、”结直肠肿块“确定为是后，对应的quantity_std或nature_quantity_std，优先赋值quantity_std，
                                    // 数值为1则为单发，其他保留标准化后值域
                                    // 2、第一种情况没有值时：”结直肠肿块“确定为是时，对应的structure_std在abdom_mr_description表单相同ID找到相同的值域，
                                    // 其关联的quantity_std，数值为1则为单发，其他保留标准化后值域
                                    if (abdom_ct_entry_results.getquantity_std()!=null){
                                        String quantity_std = Json(abdom_ct_entry_results.getquantity_std(), "quantity_std");
                                        String nature_quantity_std=null;
                                        if(abdom_ct_entry_results.getnature_quantity_std()!=null){
                                            nature_quantity_std = Json(abdom_ct_entry_results.getquantity_std(), "nature_quantity_std");
                                        }
                                        if (quantity_std==null){
                                            //colorectal_mass_number
                                            if (nature_quantity_std!=null){
                                                if (nature_quantity_std.contains("1")){
                                                    abdomenCtResult.setColorectalMassNumber("单发");
                                                }
                                                else{
                                                    abdomenCtResult.setColorectalMassNumber(nature_quantity_std);
                                                }
                                            }

                                        }
                                        else if (quantity_std.contains("1")){
                                            abdomenCtResult.setColorectalMassNumber("单发");
                                        }
                                        else{
                                            abdomenCtResult.setColorectalMassNumber(quantity_std);
                                        }


                                    }

                                }
                                else{
                                    abdomenCtResult.setColorectalMass("否");
                                }
                            }
                            else{ abdomenCtResult.setColorectalMass("否");}
                        }
                        else{ abdomenCtResult.setColorectalMass("否");}
                    }
                    else{
                        abdomenCtResult.setColorectalMass("否");
                    }
                    // neg_std为空时： nature_std为“复发”则为是，nature_std“无法判断或淋巴结性质无法判断”则为无法判断，其他为否
                    //neg_std为空时： nature_std为“转移或淋巴结转移”则为是，nature_std“无法判断或淋巴结转移无法判断或转移无法判断”则为无法判断，其他为否
                    if (abdom_ct_entry_results.getnature_std()!=null){
                        String nature_std = Json(abdom_ct_entry_results.getnature_std(), "nature_std");
                        if (nature_std.contains("转移")||nature_std.contains("淋巴结转移")){
                            abdomenCtResult.setTransfer("是");
                            //”转移“确定为是后，对应的structure_std 转移部位
                            if(abdom_ct_entry_results.getstructure_std()!=null){
                                String structure_std = Json(abdom_ct_entry_results.getstructure_std(), "structure_std");
                                if (structure_std!=null){
                                    abdomenCtResult.setMoveSite(structure_std);
                                }
                                else{
                                    String structure_site_std = Json(abdom_ct_entry_results.getstructure_std(), "structure_site_std");
                                    abdomenCtResult.setMoveSite(structure_site_std);
                                }

                            }
                            //1、“转移”确定为是后，对应的quantity_std或nature_quantity_std，优先赋值quantity_std，数值为1则为单发，其他保留标准化后值域
                            // 2、第一种情况没有数值时：“转移”确定为是时，对应的structure_std在abdom_mr_description表单相同ID找到相同的值域
                            // ，其关联的quantity_std，数值为1则为单发，其他保留标准化后值域
                            //转移灶数目
                            if (abdom_ct_entry_results.getquantity_std()!=null) {
                                String quantity_std = Json(abdom_ct_entry_results.getquantity_std(), "quantity_std");
                                String nature_quantity_std=null;
                                if( abdom_ct_entry_results.getnature_quantity_std()!=null){
                                    nature_quantity_std = Json(abdom_ct_entry_results.getquantity_std(), "nature_quantity_std");
                                }
                                if (quantity_std==null){
                                    if (nature_quantity_std!=null){
                                        if (nature_quantity_std.contains("1")){
                                            abdomenCtResult.setMoveNumber("单发");
                                        }
                                        else{
                                            abdomenCtResult.setMoveNumber(nature_quantity_std);
                                        }
                                    }

                                }
                                else if (quantity_std.contains("1")){
                                    abdomenCtResult.setMoveNumber("单发");
                                }
                                else{
                                    abdomenCtResult.setMoveNumber(quantity_std);
                                }


                            }
                        }
                        else if(nature_std.contains("无法判断")){
                            abdomenCtResult.setTransfer("无法判断");
                        }
                        else{
                            abdomenCtResult.setTransfer("否");
                        }
                        if (nature_std.contains("复发")){
                            abdomenCtResult.setRecrudescence("是");

                        }
                        else if(nature_std.contains("无法判断")){
                            abdomenCtResult.setRecrudescence("无法判断");

                        }
                        else{
                            abdomenCtResult.setRecrudescence("否");

                        }
                    }
                    else{
                        abdomenCtResult.setRecrudescence("否");
                        abdomenCtResult.setTransfer("否");
                    }
                    if (abdom_ct_entry_results.getlesion_std()!=null){
                        //neg_std为空时：1、lesion_std检索到“腹水”；  2、nature_std检索“积液”+ 对应的structure_site_std为“腹部”，同时满足则为是
                        String lesion_std = Json(abdom_ct_entry_results.getlesion_std(), "lesion_std");
                        if (lesion_std.contains("腹水")){
                            //abdomenCtResult.setAscites("是");
                            if (abdom_ct_entry_results.getnature_std()!=null){
                                String nature_std = Json(abdom_ct_entry_results.getnature_std(), "nature_std");
                                System.out.println(nature_std);
                                if (nature_std.contains("积液")){
                                    if (abdom_ct_entry_results.getstructure_std()!=null){
                                        String structure_site_std = Json(abdom_ct_entry_results.getstructure_std(), "structure_site_std");
                                        if (structure_site_std.contains("腹部")){
                                            System.out.println(structure_site_std);
                                            abdomenCtResult.setAscites("是");
                                        }
                                        else{   abdomenCtResult.setAscites("否");}
                                    }
                                    else{   abdomenCtResult.setAscites("否");}
                                }
                                else{   abdomenCtResult.setAscites("否");}
                            }
                            else{   abdomenCtResult.setAscites("否");}
                        }
                        else{   abdomenCtResult.setAscites("否");}
                    }
                    else{   abdomenCtResult.setAscites("否");}


                }
                else{
                    abdomenCtResult.setColorectalMass("否");
                    abdomenCtResult.setRecrudescence("否");
                    abdomenCtResult.setTransfer("否");
                    abdomenCtResult.setAscites("否");
                }
                abdomenCtResults.add(abdomenCtResult);
            }
            AbdomenCtResult abdomenCtResult = new AbdomenCtResult();
            String  MoveSite="";
            for (AbdomenCtResult abdomenCtResult1: abdomenCtResults) {
                abdomenCtResult.setUniqueId(abdomenCtResult1.getUniqueId());
                abdomenCtResult.setUniqueIdLv1(abdomenCtResult1.getUniqueIdLv1());
                abdomenCtResult.setUniqueIdLv2(abdomenCtResult1.getUniqueIdLv2());
                abdomenCtResult.setP900(abdomenCtResult1.getP900());
                abdomenCtResult.setPatientId(abdomenCtResult1.getPatientId());
                abdomenCtResult.setVisitId(abdomenCtResult1.getVisitId());
                abdomenCtResult.setExamNo(abdomenCtResult1.getExamNo());
                abdomenCtResult.setExamName(abdomenCtResult1.getExamName());
                abdomenCtResult.setDataVersion(abdomenCtResult1.getDataVersion());
                abdomenCtResult.setDataDbSource(abdomenCtResult1.getDataDbSource());
                abdomenCtResult.setDataTableSource(abdomenCtResult1.getDataTableSource());
                abdomenCtResult.setDataFieldSource(abdomenCtResult1.getDataFieldSource());
                abdomenCtResult.setCreatedAt(abdomenCtResult1.getCreatedAt());
                abdomenCtResult.setUpdatedAt(abdomenCtResult1.getUpdatedAt());
                // colorectal_mass	结直肠肿块
                if (abdomenCtResult1.getColorectalMass()!=null){
                    if (abdomenCtResult1.getColorectalMass().equals("是")){
                        abdomenCtResult.setColorectalMass(abdomenCtResult1.getColorectalMass());
                    }
                }
                // colorectal_mass_number	结直肠肿块数目
                if (abdomenCtResult1.getColorectalMassNumber()!=null){
                    if(abdomenCtResult.getColorectalMassNumber()!=null) {
                        if (!abdomenCtResult1.getColorectalMassNumber().equals("多发")) {
                            if (!abdomenCtResult1.getColorectalMassNumber().equals("单发")) {
                                abdomenCtResult.setColorectalMassNumber(abdomenCtResult1.getColorectalMassNumber());
                            }
                        }
                        else if (abdomenCtResult.getColorectalMassNumber().equals("单发") && abdomenCtResult1.getColorectalMassNumber().equals("多发")) {
                            abdomenCtResult.setColorectalMassNumber(abdomenCtResult1.getColorectalMassNumber());
                        }

                        abdomenCtResult.setColorectalMassNumber(abdomenCtResult1.getColorectalMassNumber());
                    }
                    else{
                        abdomenCtResult.setColorectalMassNumber(abdomenCtResult1.getColorectalMassNumber());
                    }
                }
                // recrudescence	复发
                if (abdomenCtResult1.getRecrudescence()!=null){
                    if (abdomenCtResult.getRecrudescence()==null){
                        abdomenCtResult.setRecrudescence(abdomenCtResult1.getRecrudescence());
                    }
                    else  if (!abdomenCtResult.getRecrudescence().equals("是")){
                        abdomenCtResult.setRecrudescence(abdomenCtResult1.getRecrudescence());
                    }
                }
                //  transfer	转移
                if (abdomenCtResult1.getTransfer()!=null){
                    if (abdomenCtResult.getTransfer()==null){
                        abdomenCtResult.setTransfer(abdomenCtResult1.getTransfer());
                    }
                    else if (!abdomenCtResult.getTransfer().equals("是")){
                        abdomenCtResult.setTransfer(abdomenCtResult1.getTransfer());
                    }
                }
                //move_site	转移部位
                if (abdomenCtResult1.getMoveSite()!=null){
                    MoveSite+=abdomenCtResult1.getMoveSite();
                    abdomenCtResult.setMoveSite(MoveSite);
                }
                //  move_number	转移灶数目
                if (abdomenCtResult1.getMoveNumber()!=null){
                    if(abdomenCtResult.getMoveNumber()!=null){
                        if(!abdomenCtResult1.getMoveNumber().equals("多发")){
                            if(!abdomenCtResult1.getMoveNumber().equals("单发")){
                                abdomenCtResult.setMoveNumber(abdomenCtResult1.getMoveNumber());
                            }
                        }

                        else if(abdomenCtResult.getMoveNumber().equals("单发")&&abdomenCtResult1.getMoveNumber().equals("多发")){
                            abdomenCtResult.setMoveNumber(abdomenCtResult1.getMoveNumber());
                        }

                    }else{
                        abdomenCtResult.setMoveNumber(abdomenCtResult1.getMoveNumber());
                    }

                }
                //ascites	腹水
                if (abdomenCtResult1.getAscites()!=null){
                    if (abdomenCtResult1.getAscites().equals("是")){
                        abdomenCtResult.setAscites(abdomenCtResult1.getAscites());
                    }
                }
            }
            Double  i = 0.0;
            AbdomenCtDes abdomenCtDes = new AbdomenCtDes();
            for (ABDOM_CT_DESCRIPTION abdom_ct_description:zjAbdomCtDescriptionById) {
                //”转移“确定为是时，对应的structure_std，
                // 在abdom_mr_description表单相同ID找到相同的值域后，
                // 其关联的size_std，若多个病灶 , 则保留最大病灶值
                if (abdom_ct_description.getsize_std()!=null){
                    String structure_stds = standardResultMapper.selectStandardResultById(abdom_ct_description.getsize_std());
                    List<String> structure_stdslist = JSONUtils.getList(structure_stds,"afterType1","size_std");
                    StringBuffer structure_std = new StringBuffer();
                    structure_std.append(structure_stdslist.get(0));
                    //System.out.println(structure_std.toString());
                    if(!structure_std.toString().equals("无效")){
                        if(i<Double.parseDouble(structure_std.toString())){
                            i = Double.parseDouble(structure_std.toString());
                            String  size_std = Json(abdom_ct_description.getsize_std(), "size_std");
                            abdomenCtDes.setSize(size_std);
                        }
                    }
                }
                if (abdom_ct_description.getquantity_std()!=null){
                    String quantity_std = Json(abdom_ct_description.getquantity_std(), "quantity_std");
                    if (quantity_std.contains("1")||quantity_std.contains("一")){
                        abdomenCtDes.setQuanity("单发");
                    }else{
                        abdomenCtDes.setQuanity(quantity_std);}
                }

            }
            if (abdomenCtResult.getColorectalMass()!=null){
                if(abdomenCtResult.getColorectalMass().equals("是")) {
                    if (abdomenCtResult.getColorectalMassNumber() == null) {
                        abdomenCtResult.setColorectalMassNumber(abdomenCtDes.getQuanity());
                    }
                    abdomenCtResult.setColorectalMassSize(abdomenCtDes.getSize());
                }
            }
            else{
                abdomenCtResult.setColorectalMass("否");
            }
            if (abdomenCtResult.getTransfer()!=null){
                if(abdomenCtResult.getTransfer().equals("是")) {
                    if (abdomenCtResult.getMoveNumber() == null) {
                        abdomenCtResult.setMoveNumber(abdomenCtDes.getQuanity());
                    }
                    abdomenCtResult.setMoveSize(abdomenCtDes.getSize());
                }
            }
            else{
                abdomenCtResult.setTransfer("否");
            }

            List<ABDOM_CT_DESCRIPTION> zjAbdomCtDescriptionById1 = zjAbdomCtDescriptionMapper.findZjAbdomCtDescriptionById(unique_id);
            // List<ABDOM_MR_DESCRIPTION> zjAbdomMrDescriptionByALL = zjAbdomMrDescriptionMapper.findZjAbdomMrDescriptionById(unique_id);

            for (ABDOM_CT_DESCRIPTION abdom_ct_description: zjAbdomCtDescriptionById1) {
                List<EXAM_MASTER> zjExamMasterByUniqueId = zjExamMasterMapper.findZjExamMasterById(abdom_ct_description.getunique_id());

                AbdomenCtDes abdomenCtDes1 = new AbdomenCtDes();
                for (EXAM_MASTER exam_master: zjExamMasterByUniqueId) {
                    abdomenCtDes1.setUniqueId(exam_master.getUNIQUE_ID());
                    abdomenCtDes1.setUniqueIdLv1(exam_master.getUNIQUE_ID_LV1());
                    abdomenCtDes1.setUniqueIdLv2(exam_master.getUNIQUE_ID_LV2());
                    abdomenCtDes1.setP900(exam_master.getP900());
                    abdomenCtDes1.setPatientId(exam_master.getPATIENT_ID());
                    abdomenCtDes1.setVisitId(exam_master.getVISIT_ID());
                    abdomenCtDes1.setExamNo(exam_master.getEXAM_NO());
                    StringBuffer EXAM_NAME_STD = new StringBuffer();

                    if (exam_master.getEXAM_NAME1_STD()!= null ){
                        EXAM_NAME_STD.append(exam_master.getEXAM_NAME1_STD());
                    }
                    if (exam_master.getEXAM_NAME2_STD()!= null ){
                        EXAM_NAME_STD.append(exam_master.getEXAM_NAME2_STD());
                    }
                    if (exam_master.getEXAM_NAME3_STD()!= null ){
                        EXAM_NAME_STD.append(exam_master.getEXAM_NAME3_STD());
                    }
                    if (exam_master.getEXAM_NAME4_STD()!= null ){
                        EXAM_NAME_STD.append(exam_master.getEXAM_NAME4_STD());
                    }
                    if (exam_master.getEXAM_NAME5_STD()!= null ){
                        EXAM_NAME_STD.append(exam_master.getEXAM_NAME5_STD());
                    }
                    if (exam_master.getEXAM_NAME6_STD()!= null ){
                        EXAM_NAME_STD.append(exam_master.getEXAM_NAME6_STD());
                    }
                    abdomenCtDes1.setExamName(EXAM_NAME_STD.toString());
                    abdomenCtDes1.setDataVersion(exam_master.getDATA_VERSION());
                    abdomenCtDes1.setDataDbSource(exam_master.getDATA_DB_SOURCE());
                    abdomenCtDes1.setDataTableSource(exam_master.getDATA_TABLE_SOURCE());
                    abdomenCtDes1.setDataFieldSource(exam_master.getDATA_FIELD_SOURCE());
                    abdomenCtDes1.setCreatedAt(exam_master.getCREATED_AT());
                    abdomenCtDes1.setUpdatedAt(exam_master.getUPDATED_AT());

                }
                abdomenCtDes1.setStructure(abdom_ct_description.getstructure());
                abdomenCtDes1.setLocation(abdom_ct_description.getlocation());
                abdomenCtDes1.setLesion(abdom_ct_description.getlesion());
                abdomenCtDes1.setSize(abdom_ct_description.getsize());
                abdomenCtDes1.setQuanity(abdom_ct_description.getquantity());
                if(abdomenCtResult.getTransfer()!=null&&abdomenCtResult.getTransfer().equals("是")){
                    if (abdom_ct_description.getquantity_std()!=null){
                        String quantity_std = Json(abdom_ct_description.getquantity_std(), "quantity_std");
                        if (quantity_std.contains("1")||quantity_std.contains("一")){
                            abdomenCtDes1.setMoveQuantityStd("单发");
                        }else {
                            abdomenCtDes1.setMoveQuantityStd(quantity_std);
                        }
                    }
                    if (abdom_ct_description.getsize_std()!=null){
                        String size_std = SizeJson(abdom_ct_description.getsize_std(), "size_std");
                        abdomenCtDes1.setMoveSizeStd(size_std);
                    }
                }
                if(abdomenCtResult.getColorectalMass()!=null&&abdomenCtResult.getColorectalMass().equals("是")){
                    if (abdom_ct_description.getquantity_std()!=null){
                        String quantity_std = Json(abdom_ct_description.getquantity_std(), "quantity_std");
                        if (quantity_std.contains("1")||quantity_std.contains("一")){
                            abdomenCtDes1.setColorectalQuantityStd("单发");
                        }else {
                            abdomenCtDes1.setColorectalQuantityStd(quantity_std);
                        }
                    }
                    if (abdom_ct_description.getsize_std()!=null){
                        String size_std = SizeJson(abdom_ct_description.getsize_std(), "size_std");
                        abdomenCtDes1.setColorectalSizeStd(size_std);
                    }
                }
                abdomenCtDesMapper.saveAbdomenCtDes(abdomenCtDes1);

            }

            abdomenCtResultMapper.saveAbdomenCtResult(abdomenCtResult);

        }



    }
    public void addMriResult(List<ABDOM_MR_ENTRY_RESULTS> zjAbdomMrEntryResultsByALL) {
        HashSet<String> unique_idSet = new HashSet<>();
        //去重unique_id
        for (ABDOM_MR_ENTRY_RESULTS abdom_mr_entry_results: zjAbdomMrEntryResultsByALL) {
            unique_idSet.add(abdom_mr_entry_results.getunique_id());
        }
        //通过unique_id获取结论对象
        for (String unique_id : unique_idSet) {
            List<ABDOM_MR_ENTRY_RESULTS> zjAbdomMrEntryResultsById = zjAbdomMrEntryResultsMapper.findZjAbdomMrEntryResultsById(unique_id);
            List<ABDOM_MR_DESCRIPTION> zjAbdomMrDescriptionById = zjAbdomMrDescriptionMapper.findZjAbdomMrDescriptionById(unique_id);
            //创建对象数组
            ArrayList<AbdomenMriResult> abdomenMriResults = new ArrayList<>();
            //遍历结论对象
            for (ABDOM_MR_ENTRY_RESULTS abdom_mr_entry_results:zjAbdomMrEntryResultsById) {
                List<EXAM_MASTER> zjExamMasterByUniqueId = zjExamMasterMapper.findZjExamMasterById(abdom_mr_entry_results.getunique_id());
                AbdomenMriResult abdomenMriResult = new AbdomenMriResult();
                //插入共用字段
                for (EXAM_MASTER exam_master: zjExamMasterByUniqueId) {
                    abdomenMriResult.setUniqueId(exam_master.getUNIQUE_ID());
                    abdomenMriResult.setUniqueIdLv1(exam_master.getUNIQUE_ID_LV1());
                    abdomenMriResult.setUniqueIdLv2(exam_master.getUNIQUE_ID_LV2());
                    abdomenMriResult.setP900(exam_master.getP900());
                    abdomenMriResult.setPatientId(exam_master.getPATIENT_ID());
                    abdomenMriResult.setVisitId(exam_master.getVISIT_ID());
                    abdomenMriResult.setExamNo(exam_master.getEXAM_NO());
                    StringBuffer EXAM_NAME_STD = new StringBuffer();

                    if (exam_master.getEXAM_NAME1_STD()!= null ){
                        EXAM_NAME_STD.append(exam_master.getEXAM_NAME1_STD());
                    }
                    if (exam_master.getEXAM_NAME2_STD()!= null ){
                        EXAM_NAME_STD.append(exam_master.getEXAM_NAME2_STD());
                    }
                    if (exam_master.getEXAM_NAME3_STD()!= null ){
                        EXAM_NAME_STD.append(exam_master.getEXAM_NAME3_STD());
                    }
                    if (exam_master.getEXAM_NAME4_STD()!= null ){
                        EXAM_NAME_STD.append(exam_master.getEXAM_NAME4_STD());
                    }
                    if (exam_master.getEXAM_NAME5_STD()!= null ){
                        EXAM_NAME_STD.append(exam_master.getEXAM_NAME5_STD());
                    }
                    if (exam_master.getEXAM_NAME6_STD()!= null ){
                        EXAM_NAME_STD.append(exam_master.getEXAM_NAME6_STD());
                    }
                    abdomenMriResult.setExamName(EXAM_NAME_STD.toString());
                    //abdomenMriResult.setExamName(exam_master.getENTRY_NAME());
                    abdomenMriResult.setDataVersion(exam_master.getDATA_VERSION());
                    abdomenMriResult.setDataDbSource(exam_master.getDATA_DB_SOURCE());
                    abdomenMriResult.setDataTableSource(exam_master.getDATA_TABLE_SOURCE());
                    abdomenMriResult.setDataFieldSource(exam_master.getDATA_FIELD_SOURCE());
                    abdomenMriResult.setCreatedAt(exam_master.getCREATED_AT());
                    abdomenMriResult.setUpdatedAt(exam_master.getUPDATED_AT());
                }
                //插入逻辑字段
                //结直肠肿块逻辑
                if (abdom_mr_entry_results.getneg_std()==null||abdom_mr_entry_results.getneg_std().equals("")){
                    //neg_std为空 + lesion_std为备注值域 + structure_site_std为“肠或大肠”，同时满足则为是
                    if (abdom_mr_entry_results.getlesion_std()!=null){
                        String lesion_std = Json(abdom_mr_entry_results.getlesion_std(), "lesion_std");
                        if(lesion_std.contains("低密度影") ||lesion_std.contains("软组织影")
                                ||lesion_std.contains("结节") ||lesion_std.contains("肿物") ||lesion_std.contains("占位")
                                ||lesion_std.contains("病变") ){
                            if (abdom_mr_entry_results.getstructure_std()!=null){
                                String structure_site_std = Json(abdom_mr_entry_results.getstructure_std(), "structure_site_std");
                                if (structure_site_std.contains("大肠")||structure_site_std.contains("肠")){
                                    //结直肠肿
                                    abdomenMriResult.setColorectalMass("是");
                                    if (abdom_mr_entry_results.getquantity_std()!=null){
                                        System.out.println(abdom_mr_entry_results.getquantity_std());
                                        String quantity_std = Json(abdom_mr_entry_results.getquantity_std(), "quantity_std");
                                        String nature_quantity_std=null;
                                        if (abdom_mr_entry_results.getnature_quantity_std()!=null) {
                                            nature_quantity_std = Json(abdom_mr_entry_results.getquantity_std(), "nature_quantity_std");
                                        }
                                        if (quantity_std==null){
                                            //colorectal_mass_number
                                            if (nature_quantity_std!=null){
                                                if (nature_quantity_std.contains("1")){
                                                    //结直肠肿数量
                                                    abdomenMriResult.setColorectalMassNumber("单发");
                                                }
                                                else{
                                                    //结直肠肿数量
                                                    abdomenMriResult.setColorectalMassNumber(nature_quantity_std);
                                                }
                                            }

                                        }
                                        else if (quantity_std.contains("1")){
                                            //结直肠肿数量
                                            abdomenMriResult.setColorectalMassNumber("单发");
                                        }
                                        else{
                                            //结直肠肿数量
                                            abdomenMriResult.setColorectalMassNumber(quantity_std);
                                        }


                                    }

                                }
                                else{
                                    abdomenMriResult.setColorectalMass("否");
                                }
                            }
                            else{ abdomenMriResult.setColorectalMass("否");}
                        }
                        else{ abdomenMriResult.setColorectalMass("否");}
                    }
                    else{
                        abdomenMriResult.setColorectalMass("否");
                    }
                    // neg_std为空时： nature_std为“复发”则为是，nature_std“无法判断或淋巴结性质无法判断”则为无法判断，其他为否
                    //neg_std为空时： nature_std为“转移或淋巴结转移”则为是，nature_std“无法判断或淋巴结转移无法判断或转移无法判断”则为无法判断，其他为否
                    if (abdom_mr_entry_results.getnature_std()!=null){
                        String nature_std = Json(abdom_mr_entry_results.getnature_std(), "nature_std");
                        if (nature_std.contains("转移")||nature_std.contains("淋巴结转移")){
                            abdomenMriResult.setTransfer("是");
                            //”转移“确定为是后，对应的structure_std 转移部位
                            if(abdom_mr_entry_results.getstructure_std()!=null){
                                String structure_std = Json(abdom_mr_entry_results.getstructure_std(), "structure_std");
                                if (structure_std!=null){
                                    abdomenMriResult.setMoveSite(structure_std);
                                }
                                else{
                                    String structure_site_std = Json(abdom_mr_entry_results.getstructure_std(), "structure_site_std");
                                    abdomenMriResult.setMoveSite(structure_site_std);
                                }

                            }
                            //1、“转移”确定为是后，对应的quantity_std或nature_quantity_std，优先赋值quantity_std，数值为1则为单发，其他保留标准化后值域
                            // 2、第一种情况没有数值时：“转移”确定为是时，对应的structure_std在abdom_mr_description表单相同ID找到相同的值域
                            // ，其关联的quantity_std，数值为1则为单发，其他保留标准化后值域
                            //转移灶数目
                            if (abdom_mr_entry_results.getquantity_std()!=null) {
                                String quantity_std = Json(abdom_mr_entry_results.getquantity_std(), "quantity_std");
                                String nature_quantity_std=null;
                                if( abdom_mr_entry_results.getnature_quantity_std()!=null){
                                    nature_quantity_std = Json(abdom_mr_entry_results.getquantity_std(), "nature_quantity_std");
                                }
                                if (quantity_std==null){
                                    if (nature_quantity_std!=null){
                                        if (nature_quantity_std.contains("1")){
                                            abdomenMriResult.setMoveNumber("单发");
                                        }
                                        else{
                                            abdomenMriResult.setMoveNumber(nature_quantity_std);
                                        }
                                    }

                                }
                                else if (quantity_std.contains("1")){
                                    abdomenMriResult.setMoveNumber("单发");
                                }
                                else{
                                    abdomenMriResult.setMoveNumber(quantity_std);
                                }


                            }
                        }
                        else if(nature_std.contains("无法判断")){
                            abdomenMriResult.setTransfer("无法判断");
                        }
                        else{
                            abdomenMriResult.setTransfer("否");
                        }
                        if (nature_std.contains("复发")){
                            abdomenMriResult.setRecrudescence("是");

                        }
                        else if(nature_std.contains("无法判断")){
                            abdomenMriResult.setRecrudescence("无法判断");

                        }
                        else{
                            abdomenMriResult.setRecrudescence("否");

                        }
                    }
                    else{
                        abdomenMriResult.setRecrudescence("否");
                        abdomenMriResult.setTransfer("否");
                    }

                    //腹水逻辑
                    if (abdom_mr_entry_results.getlesion_std()!=null){
                        //neg_std为空时：1、lesion_std检索到“腹水”；  2、nature_std检索“积液”+ 对应的structure_site_std为“腹部”，同时满足则为是
                        String lesion_std = Json(abdom_mr_entry_results.getlesion_std(), "lesion_std");
                        if (lesion_std.contains("腹水") ||lesion_std.contains("液体信号") ){
                            abdomenMriResult.setAscites("是");
                  /*   if (abdom_mr_entry_results.getnature_std()!=null){
                         String nature_std = Json(abdom_mr_entry_results.getnature_std(), "nature_std");
                         if (nature_std.contains("积液")){
                             if (abdom_mr_entry_results.getstructure_std()!=null){
                                 String structure_site_std = Json(abdom_mr_entry_results.getstructure_std(), "structure_site_std");
                                 if (structure_site_std.contains("腹部")){
                                     abdomenMriResult.setAscites("是");
                                 }
                                 else{   abdomenMriResult.setAscites("否");}
                             }
                             else{   abdomenMriResult.setAscites("否");}
                         }
                         else{   abdomenMriResult.setAscites("否");}
                     }
                     else{   abdomenMriResult.setAscites("否");}*/
                        }
                        else{   abdomenMriResult.setAscites("否");}
                    }
                    else{   abdomenMriResult.setAscites("否");}

            /* String s1 = standardResultMapper.selectStandardResultById(abdom_mr_entry_results.getlesion_std());
             List<String> list1 = JSONUtils.getList(s1, "afterType1", "lesion_std");
             System.out.println(list1);
             StringBuffer lesion_std = new StringBuffer();
             for (String lesion_std1: list1) {
                 lesion_std.append(lesion_std1);
             }
             String lesion1_std = lesion_std.toString();
             if(lesion1_std.contains("高密度影") ||lesion1_std.contains("低密度影") ||lesion1_std.contains("软组织影")
                     ||lesion1_std.contains("结节") ||lesion1_std.contains("肿物") ||lesion1_std.contains("占位")
                     ||lesion1_std.contains("息肉") ||lesion1_std.contains("异常密度影") ||lesion1_std.contains("脂肪密度影") ||
                     lesion1_std.contains("等密度影") ||lesion1_std.contains("混合密度影") ){
                 String s2 = standardResultMapper.selectStandardResultById(abdom_mr_entry_results.getstructure_std());
                 List<String> list2 = JSONUtils.getList(s2, "afterType1", "structure_site_std");
                 System.out.println(list2);
                 StringBuffer structure_site_std = new StringBuffer();
                 boolean structureflag=false;
                 for (String structure_site_std1: list1) {
                     if (structure_site_std1.equals("大肠")||structure_site_std1.equals("肠")){
                         structureflag=true;
                     }
                     structure_site_std.append(structure_site_std1);
                 }
                if (structureflag){
                    abdomenMriResult.setColorectalMass("是");
                }
                 else{
                     abdomenMriResult.setColorectalMass("否");
                 }
             }
             else{
                 abdomenMriResult.setColorectalMass("否");
             }
            // neg_std为空时： nature_std为“复发”则为是，nature_std“无法判断或淋巴结性质无法判断”则为无法判断，其他为否
            //neg_std为空时： nature_std为“转移或淋巴结转移”则为是，nature_std“无法判断或淋巴结转移无法判断或转移无法判断”则为无法判断，其他为否
             String nature_stds = standardResultMapper.selectStandardResultById(abdom_mr_entry_results.getnature_std());
             List<String> nature_stdslist = JSONUtils.getList(nature_stds, "afterType1", "nature_std");
             System.out.println(nature_stdslist);
             StringBuffer nature_std = new StringBuffer();
             boolean nature_stdflag=false;
             for (String nature_std1: nature_stdslist) {
                 nature_std.append(nature_std1);
             }
             if (nature_std.toString().contains("转移")||nature_std.toString().contains("淋巴结转移")){
                 abdomenMriResult.setTransfer("是");
                 //”转移“确定为是后，对应的structure_std
                 String structure_stds = standardResultMapper.selectStandardResultById(abdom_mr_entry_results.getstructure_std());
                 List<String> structure_stdslist = JSONUtils.getList(structure_stds, "afterType1", "structure_std");
                 StringBuffer structure_std = new StringBuffer();
                 for (String structure_std1: structure_stdslist) {
                     structure_std.append(structure_std1);
                 }
                 abdomenMriResult.setMoveSite(structure_std.toString());
             }
             if (nature_std.toString().contains("复发")){
                 abdomenMriResult.setRecrudescence("复发");
             }
             else if(nature_std.toString().contains("无法判断")||nature_std.toString().contains("淋巴结性质无法判断")){
                 abdomenMriResult.setRecrudescence("无法判断");
                 abdomenMriResult.setTransfer("无法判断");

             }
             else{
                 abdomenMriResult.setRecrudescence("否");
                 abdomenMriResult.setTransfer("否");
             }
             //neg_std为空时：1、lesion_std检索到“腹水”；  2、nature_std检索“积液”+ 对应的structure_site_std为“腹部”，同时满足则为是
           if (lesion1_std.contains("腹水")){
               if (nature_std.toString().contains("积液")){
                   String s2 = standardResultMapper.selectStandardResultById(abdom_mr_entry_results.getstructure_std());
                   List<String> list2 = JSONUtils.getList(s2, "afterType1", "structure_site_std为");
                   System.out.println(list2);
                   StringBuffer structure_site_std = new StringBuffer();
                   if (structure_site_std.toString().contains("腹部")){
                       abdomenMriResult.setAscites("是");
                   }
                   else{
                       abdomenMriResult.setAscites("否");
                   }
               }
               else{
                   abdomenMriResult.setAscites("否");
               }
           }
           else{
               abdomenMriResult.setAscites("否");
           }*/
                }
                else{
                    abdomenMriResult.setColorectalMass("否");
                    abdomenMriResult.setRecrudescence("否");
                    abdomenMriResult.setTransfer("否");
                    abdomenMriResult.setAscites("否");
                }
                abdomenMriResults.add(abdomenMriResult);
            }
            //创建结论对象
            AbdomenMriResult abdomenMriResult = new AbdomenMriResult();
            //定义大小
            String  MoveSite="";
            //遍历结论对象数组并赋值给结论对象
            for (AbdomenMriResult abdomenMriResult1: abdomenMriResults) {
                abdomenMriResult.setUniqueId(abdomenMriResult1.getUniqueId());
                abdomenMriResult.setUniqueIdLv1(abdomenMriResult1.getUniqueIdLv1());
                abdomenMriResult.setUniqueIdLv2(abdomenMriResult1.getUniqueIdLv2());
                abdomenMriResult.setP900(abdomenMriResult1.getP900());
                abdomenMriResult.setPatientId(abdomenMriResult1.getPatientId());
                abdomenMriResult.setVisitId(abdomenMriResult1.getVisitId());
                abdomenMriResult.setExamNo(abdomenMriResult1.getExamNo());
                abdomenMriResult.setExamName(abdomenMriResult1.getExamName());
                abdomenMriResult.setDataVersion(abdomenMriResult1.getDataVersion());
                abdomenMriResult.setDataDbSource(abdomenMriResult1.getDataDbSource());
                abdomenMriResult.setDataTableSource(abdomenMriResult1.getDataTableSource());
                abdomenMriResult.setDataFieldSource(abdomenMriResult1.getDataFieldSource());
                abdomenMriResult.setCreatedAt(abdomenMriResult1.getCreatedAt());
                abdomenMriResult.setUpdatedAt(abdomenMriResult1.getUpdatedAt());
                // colorectal_mass	结直肠肿块
                if (abdomenMriResult1.getColorectalMass()!=null){
                    if (abdomenMriResult1.getColorectalMass().equals("是")){
                        abdomenMriResult.setColorectalMass(abdomenMriResult1.getColorectalMass());
                    }
                }
                // colorectal_mass_number	结直肠肿块数目
                if (abdomenMriResult1.getColorectalMassNumber()!=null){
                    if(abdomenMriResult.getColorectalMassNumber()!=null) {
                        if (!abdomenMriResult1.getColorectalMassNumber().equals("多发")) {
                            if (!abdomenMriResult1.getColorectalMassNumber().equals("单发")) {
                                abdomenMriResult.setColorectalMassNumber(abdomenMriResult1.getColorectalMassNumber());
                            }
                        }
                        else if (abdomenMriResult.getColorectalMassNumber().equals("单发") && abdomenMriResult1.getColorectalMassNumber().equals("多发")) {
                            abdomenMriResult.setColorectalMassNumber(abdomenMriResult1.getColorectalMassNumber());
                        }

                        abdomenMriResult.setColorectalMassNumber(abdomenMriResult1.getColorectalMassNumber());
                    }
                    else{
                        abdomenMriResult.setColorectalMassNumber(abdomenMriResult1.getColorectalMassNumber());
                    }
                }
                // recrudescence	复发
                if (abdomenMriResult1.getRecrudescence()!=null){
                    if (abdomenMriResult.getRecrudescence()==null){
                        abdomenMriResult.setRecrudescence(abdomenMriResult1.getRecrudescence());
                    }
                    else  if (!abdomenMriResult.getRecrudescence().equals("是")){
                        abdomenMriResult.setRecrudescence(abdomenMriResult1.getRecrudescence());
                    }
                }
                //  transfer	转移
                if (abdomenMriResult1.getTransfer()!=null){
                    if (abdomenMriResult.getTransfer()==null){
                        abdomenMriResult.setTransfer(abdomenMriResult1.getTransfer());
                    }
                    else if (!abdomenMriResult.getTransfer().equals("是")){
                        abdomenMriResult.setTransfer(abdomenMriResult1.getTransfer());
                    }
                }
                //move_site	转移部位
                if (abdomenMriResult1.getMoveSite()!=null){
                    MoveSite+=abdomenMriResult1.getMoveSite();
                    abdomenMriResult.setMoveSite(MoveSite);
                }
                //  move_number	转移灶数目
                if (abdomenMriResult1.getMoveNumber()!=null){
                    if(abdomenMriResult.getMoveNumber()!=null){
                        if(!abdomenMriResult1.getMoveNumber().equals("多发")){
                            if(!abdomenMriResult1.getMoveNumber().equals("单发")){
                                abdomenMriResult.setMoveNumber(abdomenMriResult1.getMoveNumber());
                            }
                        }

                        else if(abdomenMriResult.getMoveNumber().equals("单发")&&abdomenMriResult1.getMoveNumber().equals("多发")){
                            abdomenMriResult.setMoveNumber(abdomenMriResult1.getMoveNumber());
                        }

                    }else{
                        abdomenMriResult.setMoveNumber(abdomenMriResult1.getMoveNumber());
                    }

                }
                //ascites	腹水
                if (abdomenMriResult1.getAscites()!=null){
                    if (abdomenMriResult1.getAscites().equals("是")){
                        abdomenMriResult.setAscites(abdomenMriResult1.getAscites());
                    }
                }
            }
            //判断大小值
            Double  i = 0.0;
            //创建描述对象
            AbdomenMriDes abdomenMriDes = new AbdomenMriDes();
            //遍历结论关联的描述并赋值字段
            for (ABDOM_MR_DESCRIPTION abdom_mr_description:zjAbdomMrDescriptionById) {
                //”转移“确定为是时，对应的structure_std，
                // 在abdom_mr_description表单相同ID找到相同的值域后，
                // 其关联的size_std，若多个病灶 , 则保留最大病灶值
                if (abdom_mr_description.getsize_std()!=null){
                    String structure_stds = standardResultMapper.selectStandardResultById(abdom_mr_description.getsize_std());
                    List<String> structure_stdslist = JSONUtils.getList(structure_stds,"afterType1","size_std");
                    StringBuffer structure_std = new StringBuffer();
                    structure_std.append(structure_stdslist.get(0));
                    System.out.println(structure_std.toString());
                    if(!structure_std.toString().equals("无效")){
                        if(i<Double.parseDouble(structure_std.toString())){
                            i = Double.parseDouble(structure_std.toString());
                            String  size_std = Json(abdom_mr_description.getsize_std(), "size_std");
                            abdomenMriDes.setSize(size_std);
                        }
                    }
                }

                if (abdom_mr_description.getquantity_std()!=null){
                    String quantity_std = Json(abdom_mr_description.getquantity_std(), "quantity_std");
                    if (quantity_std.contains("1")||quantity_std.contains("一")){
                        abdomenMriDes.setQuanity("单发");
                    }else{
                        abdomenMriDes.setQuanity(quantity_std);}
                }

            }
            //补漏字段
            if (abdomenMriResult.getColorectalMass()!=null&&abdomenMriResult.getColorectalMass().equals("是")){
                if (abdomenMriResult.getColorectalMassNumber()==null){
                    abdomenMriResult.setColorectalMassNumber(abdomenMriDes.getQuanity());
                }
                abdomenMriResult.setColorectalMassSize(abdomenMriDes.getSize());
            }
            else{
                abdomenMriResult.setColorectalMass("否");
            }
            if (abdomenMriResult.getTransfer()!=null&&abdomenMriResult.getTransfer().equals("是")){

                if (abdomenMriResult.getMoveNumber() == null) {
                    abdomenMriResult.setMoveNumber(abdomenMriDes.getQuanity());
                }
                abdomenMriResult.setMoveSize(abdomenMriDes.getSize());

            }
            else{
                abdomenMriResult.setTransfer("否");
            }
            List<ABDOM_MR_DESCRIPTION> zjAbdomMrDescriptionByALL = zjAbdomMrDescriptionMapper.findZjAbdomMrDescriptionById(unique_id);
            //描述对象赋值并入库
            for (ABDOM_MR_DESCRIPTION abdom_mr_description: zjAbdomMrDescriptionByALL) {
                List<EXAM_MASTER> zjExamMasterByUniqueId = zjExamMasterMapper.findZjExamMasterById(abdom_mr_description.getunique_id());
                AbdomenMriDes abdomenMriDes1 = new AbdomenMriDes();
                for (EXAM_MASTER exam_master: zjExamMasterByUniqueId) {
                    abdomenMriDes1.setUniqueId(exam_master.getUNIQUE_ID());
                    abdomenMriDes1.setUniqueIdLv1(exam_master.getUNIQUE_ID_LV1());
                    abdomenMriDes1.setUniqueIdLv2(exam_master.getUNIQUE_ID_LV2());
                    abdomenMriDes1.setP900(exam_master.getP900());
                    abdomenMriDes1.setPatientId(exam_master.getPATIENT_ID());
                    abdomenMriDes1.setVisitId(exam_master.getVISIT_ID());
                    abdomenMriDes1.setExamNo(exam_master.getEXAM_NO());
                    StringBuffer EXAM_NAME_STD = new StringBuffer();

                    if (exam_master.getEXAM_NAME1_STD()!= null ){
                        EXAM_NAME_STD.append(exam_master.getEXAM_NAME1_STD());
                    }
                    if (exam_master.getEXAM_NAME2_STD()!= null ){
                        EXAM_NAME_STD.append(exam_master.getEXAM_NAME2_STD());
                    }
                    if (exam_master.getEXAM_NAME3_STD()!= null ){
                        EXAM_NAME_STD.append(exam_master.getEXAM_NAME3_STD());
                    }
                    if (exam_master.getEXAM_NAME4_STD()!= null ){
                        EXAM_NAME_STD.append(exam_master.getEXAM_NAME4_STD());
                    }
                    if (exam_master.getEXAM_NAME5_STD()!= null ){
                        EXAM_NAME_STD.append(exam_master.getEXAM_NAME5_STD());
                    }
                    if (exam_master.getEXAM_NAME6_STD()!= null ){
                        EXAM_NAME_STD.append(exam_master.getEXAM_NAME6_STD());
                    }
                    abdomenMriDes1.setExamName(EXAM_NAME_STD.toString());
                    abdomenMriDes1.setDataVersion(exam_master.getDATA_VERSION());
                    abdomenMriDes1.setDataDbSource(exam_master.getDATA_DB_SOURCE());
                    abdomenMriDes1.setDataTableSource(exam_master.getDATA_TABLE_SOURCE());
                    abdomenMriDes1.setDataFieldSource(exam_master.getDATA_FIELD_SOURCE());
                    abdomenMriDes1.setCreatedAt(exam_master.getCREATED_AT());
                    abdomenMriDes1.setUpdatedAt(exam_master.getUPDATED_AT());

                }
                abdomenMriDes1.setStructure(abdom_mr_description.getstructure());
                abdomenMriDes1.setLocation(abdom_mr_description.getlocation());
                abdomenMriDes1.setLesion(abdom_mr_description.getlesion());
                abdomenMriDes1.setSize(abdom_mr_description.getsize());
                abdomenMriDes1.setQuanity(abdom_mr_description.getquantity());
                if(abdomenMriResult.getTransfer()!=null&&abdomenMriResult.getTransfer().equals("是")){
                    if (abdom_mr_description.getquantity_std()!=null){
                        String quantity_std = Json(abdom_mr_description.getquantity_std(), "quantity_std");
                        if (quantity_std.contains("1")||quantity_std.contains("一")){
                            abdomenMriDes1.setMoveQuantityStd("单发");
                        }else {
                            abdomenMriDes1.setMoveQuantityStd(quantity_std);
                        }
                    }
                    if (abdom_mr_description.getsize_std()!=null){
                        String size_std = Json(abdom_mr_description.getsize_std(), "size_std");
                        abdomenMriDes1.setMoveSizeStd(size_std);
                    }
                }
                if(abdomenMriResult.getColorectalMass()!=null&&abdomenMriResult.getColorectalMass().equals("是")){
                    if (abdom_mr_description.getquantity_std()!=null){
                        String quantity_std = Json(abdom_mr_description.getquantity_std(), "quantity_std");
                        if (quantity_std.contains("1")||quantity_std.contains("一")){
                            abdomenMriDes1.setColorectalQuantityStd("单发");
                        }else {
                            abdomenMriDes1.setColorectalQuantityStd(quantity_std);
                        }
                    }
                    if (abdom_mr_description.getsize_std()!=null){
                        String size_std = Json(abdom_mr_description.getsize_std(), "size_std");
                        abdomenMriDes1.setColorectalSizeStd(size_std);
                    }
                }
                abdomenMriDesMapper.saveAbdomenMriDes(abdomenMriDes1);
            }

            abdomenMriResultMapper.saveAbdomenMriResult(abdomenMriResult);
        }



    }
    public void addPreparation(List<TEM_OPERATION_RECORD> zjTemOperationRecordByALL){
        for (TEM_OPERATION_RECORD tem_operation_record:zjTemOperationRecordByALL) {
            PreoperativePreparation preoperativePreparation = new PreoperativePreparation();
            preoperativePreparation.setUniqueId(tem_operation_record.getUNIQUE_ID());
            preoperativePreparation.setUniqueIdLv1(tem_operation_record.getUNIQUE_ID_LV1());
            preoperativePreparation.setUniqueIdLv2(tem_operation_record.getUNIQUE_ID_LV2());
            preoperativePreparation.setP900(tem_operation_record.getP900());
            preoperativePreparation.setPatientId(tem_operation_record.getPATIENT_ID());
            preoperativePreparation.setVisitId(tem_operation_record.getVISIT_ID());
            List<DRUG_ORDER> zjDrugOrderByUniqueId1 = zjDrugOrderMapper.findZjDrugOrderByUniqueId(tem_operation_record.getUNIQUE_ID_LV2());
            System.out.println("遍历zjdrugOrderMapper");
            for (DRUG_ORDER drug_order:zjDrugOrderByUniqueId1) {
                boolean falg=true;
                boolean falg2=true;
                if (drug_order.getGENERIC_STD()==null||drug_order.getGENERIC_STD().equals("")){
                    falg=false;
                }
                if (drug_order.getINGREDIENT_STD()==null||drug_order.getGENERIC_STD().equals("")){
                    falg2=false;
                }
                if (tem_operation_record.getITEM_BEGIN_DATE()==null||tem_operation_record.getITEM_BEGIN_DATE().equals("")){
                    falg=false;
                    falg2=false;
                }
                if (drug_order.getENTER_DATE_TIME()==null||drug_order.getENTER_DATE_TIME().equals("")){
                    falg=false;
                    falg2=false;

                }
                if(falg) {

                    if (drug_order.getGENERIC_STD().contains("乳果糖")) {
                        if (tem_operation_record.getITEM_BEGIN_DATE().compareTo(drug_order.getENTER_DATE_TIME()) == 1) {
                            preoperativePreparation.setLactulose("是");
                        }
                    }
                    if (drug_order.getGENERIC_STD().contains("聚乙二醇（PEG）") ||
                            drug_order.getGENERIC_STD().contains("聚乙二醇电解质散剂") ||
                            drug_order.getGENERIC_STD().contains("复方聚乙二醇电解质散") ||
                            drug_order.getGENERIC_STD().contains("和爽") ||
                            drug_order.getGENERIC_STD().contains("福静清") ) {
                        if (tem_operation_record.getITEM_BEGIN_DATE().compareTo(drug_order.getENTER_DATE_TIME()) == 1) {
                            preoperativePreparation.setPeg("是");
                        }
                    }

                    if (drug_order.getGENERIC_STD().contains("硫酸镁") ) {
                        if (tem_operation_record.getITEM_BEGIN_DATE().compareTo(drug_order.getENTER_DATE_TIME()) == 1) {
                            preoperativePreparation.setMagnesiumSulphate("是");
                        }
                    }
                    if (drug_order.getGENERIC_STD().contains("磷酸钠盐") ) {
                        if (tem_operation_record.getITEM_BEGIN_DATE().compareTo(drug_order.getENTER_DATE_TIME()) == 1) {
                            preoperativePreparation.setSodiumPhosphate("是");
                        }
                    }
                    if (drug_order.getGENERIC_STD().contains("番泻叶") ) {
                        if (tem_operation_record.getITEM_BEGIN_DATE().compareTo(drug_order.getENTER_DATE_TIME()) == 1) {
                            preoperativePreparation.setSennaLeaf("是");
                        }
                    }
                    if (drug_order.getGENERIC_STD().contains("蓖麻油") ) {
                        if (tem_operation_record.getITEM_BEGIN_DATE().compareTo(drug_order.getENTER_DATE_TIME()) == 1) {
                            preoperativePreparation.setCastorOil("是");
                        }
                    }

                    if (drug_order.getGENERIC_STD().contains("复方匹可硫酸钠") ) {
                        if (tem_operation_record.getITEM_BEGIN_DATE().compareTo(drug_order.getENTER_DATE_TIME()) == 1) {
                            preoperativePreparation.setCompoundSodiumPicosulfate("是");
                        }
                    }
                    if (drug_order.getGENERIC_STD().contains("甘露醇") ) {
                        if (tem_operation_record.getITEM_BEGIN_DATE().compareTo(drug_order.getENTER_DATE_TIME()) == 1) {
                            preoperativePreparation.setMannitol("是");
                        }
                    }



                }
                if(falg2) {

                    if ( drug_order.getINGREDIENT_STD().contains("乳果糖")) {
                        if (tem_operation_record.getITEM_BEGIN_DATE().compareTo(drug_order.getENTER_DATE_TIME()) == 1) {
                            preoperativePreparation.setLactulose("是");
                        }
                    }
                    if (drug_order.getINGREDIENT_STD().contains("聚乙二醇（PEG）")
                            || drug_order.getINGREDIENT_STD().contains("聚乙二醇电解质散剂")
                            || drug_order.getINGREDIENT_STD().contains("复方聚乙二醇电解质散")
                            || drug_order.getINGREDIENT_STD().contains("和爽")
                            || drug_order.getINGREDIENT_STD().contains("福静清")) {
                        if (tem_operation_record.getITEM_BEGIN_DATE().compareTo(drug_order.getENTER_DATE_TIME()) == 1) {
                            preoperativePreparation.setPeg("是");
                        }
                    }

                    if ( drug_order.getINGREDIENT_STD().contains("硫酸镁")) {
                        if (tem_operation_record.getITEM_BEGIN_DATE().compareTo(drug_order.getENTER_DATE_TIME()) == 1) {
                            preoperativePreparation.setMagnesiumSulphate("是");
                        }
                    }
                    if ( drug_order.getINGREDIENT_STD().contains("番泻叶")) {
                        if (tem_operation_record.getITEM_BEGIN_DATE().compareTo(drug_order.getENTER_DATE_TIME()) == 1) {
                            preoperativePreparation.setSennaLeaf("是");
                        }
                    }
                    if (drug_order.getINGREDIENT_STD().contains("蓖麻油")) {
                        if (tem_operation_record.getITEM_BEGIN_DATE().compareTo(drug_order.getENTER_DATE_TIME()) == 1) {
                            preoperativePreparation.setCastorOil("是");
                        }
                    }
                    if ( drug_order.getINGREDIENT_STD().contains("甘露醇")) {
                        if (tem_operation_record.getITEM_BEGIN_DATE().compareTo(drug_order.getENTER_DATE_TIME()) == 1) {
                            preoperativePreparation.setMannitol("是");
                        }
                    }
                    if ( drug_order.getINGREDIENT_STD().contains("复方匹可硫酸钠")) {
                        if (tem_operation_record.getITEM_BEGIN_DATE().compareTo(drug_order.getENTER_DATE_TIME()) == 1) {
                            preoperativePreparation.setCompoundSodiumPicosulfate("是");
                        }
                    }
                    if ( drug_order.getINGREDIENT_STD().contains("磷酸钠盐")) {
                        if (tem_operation_record.getITEM_BEGIN_DATE().compareTo(drug_order.getENTER_DATE_TIME()) == 1) {
                            preoperativePreparation.setSodiumPhosphate("是");
                        }
                    }



                }
            }
            List<INP_ORDERS> zjInpOrdersByUniqueId = zjInpOrdersMapper.findZjInpOrdersByUniqueId(tem_operation_record.getUNIQUE_ID_LV2());
            for (INP_ORDERS inp_orders: zjInpOrdersByUniqueId) {
                if (tem_operation_record.getITEM_BEGIN_DATE()!=null&&inp_orders.getENTER_DATE_TIME()!=null) {
                    if (StringUtils.isNotEmpty(inp_orders.getORDER_CLASS()) && inp_orders.getORDER_CLASS().contains("临时医嘱") &&
                            (inp_orders.getORDER_TEXT().contains("肠道准备") || inp_orders.getORDER_TEXT().contains("机械灌肠") ||
                                    inp_orders.getORDER_TEXT().contains("机械清肠"))) {
                        if (tem_operation_record.getITEM_BEGIN_DATE().compareTo(inp_orders.getENTER_DATE_TIME()) == 1) {
                            preoperativePreparation.setMechanicalEnema("是");
                        }
                        else{preoperativePreparation.setMechanicalEnema("否");}
                    }
                    else{preoperativePreparation.setMechanicalEnema("否");}
                }
                else{preoperativePreparation.setMechanicalEnema("否");}
            }
            List<PREOP_TREATMENT> zjPreopTreatmentByUniqueId = zjPreopTreatmentMapper.findZjPreopTreatmentByUniqueId(tem_operation_record.getUNIQUE_ID_LV2());
            for (PREOP_TREATMENT preop_treatment: zjPreopTreatmentByUniqueId) {
                boolean falg=true;
                if (tem_operation_record.getITEM_BEGIN_DATE()==null||tem_operation_record.getITEM_BEGIN_DATE().equals("")){
                    falg=false;

                }
                if (preop_treatment.getneg_std()==null){
                    if (preop_treatment.gettreatment_std()!=null){
                        String treatment_std = Json(preop_treatment.gettreatment_std(), "treatment_chemo_std");
                        String treatment_Radistd = Json(preop_treatment.gettreatment_std(), "treatment_radio_std");

                        if (treatment_std.contains("术前化疗")||treatment_std.contains("术前贝伐珠单抗靶向治疗")){
                            //chemotherapy
                            preoperativePreparation.setChemotherapy("是");
                            if (preop_treatment.getregimen_std()!=null){
                                String regimen_std = Json(preop_treatment.getregimen_std(), "regimen_std");
                                //chemotherapy_regimen
                                preoperativePreparation.setChemotherapyRegimen(regimen_std);
                            }
                            if (preop_treatment.getdate_time_p()!=null){
                                preoperativePreparation.setChemotherapyTime(preop_treatment.getdate_time_p().toString());
                            }
                        }
                        else if (treatment_std.contains("化疗")||treatment_std.contains("贝伐珠单抗靶向治疗")){
                            if (falg){
                                if(preop_treatment.getdate_time_p()!=null&&tem_operation_record.getITEM_BEGIN_DATE().compareTo(preop_treatment.getdate_time_p()) <0){
                                    preoperativePreparation.setChemotherapy("是");
                                    if (preop_treatment.getregimen_std()!=null){
                                        String regimen_std = Json(preop_treatment.getregimen_std(), "regimen_std");
                                        //chemotherapy_regimen
                                        preoperativePreparation.setChemotherapyRegimen(regimen_std);
                                    }
                                    preoperativePreparation.setChemotherapyTime(preop_treatment.getdate_time_p().toString());
                                }
                                else  if (preop_treatment.getdate_time_estimate()!=null&&tem_operation_record.getITEM_BEGIN_DATE().compareTo(preop_treatment.getdate_time_estimate()) <0) {
                                    preoperativePreparation.setChemotherapy("是");
                                    //“术前化疗”确定为是，对应的regimen_std
                                    if (preop_treatment.getregimen_std()!=null){
                                        String regimen_std = Json(preop_treatment.getregimen_std(), "regimen_std");
                                        //chemotherapy_regimen
                                        preoperativePreparation.setChemotherapyRegimen(regimen_std);
                                    }
                                    //chemotherapy_time
                                    preoperativePreparation.setChemotherapyTime(preop_treatment.getdate_time_estimate().toString());
                                }
                                else{
                                    if (preoperativePreparation.getChemotherapy()==null) {
                                        preoperativePreparation.setChemotherapy("否");
                                    }
                                }
                            }
                            else{
                                if (preoperativePreparation.getChemotherapy()==null) {
                                    preoperativePreparation.setChemotherapy("否");
                                }
                            }
                        }
                        else{
                            if (preoperativePreparation.getChemotherapy()==null) {
                                preoperativePreparation.setChemotherapy("否");
                            }
                        }

                        if (treatment_Radistd.contains("术前放疗")){
                            preoperativePreparation.setRadiotherapy("是");
                            if(preop_treatment.getdate_time_p()!=null){
                                preoperativePreparation.setRadiotherapy("是");
                                if (preop_treatment.getstructure_std()!=null){
                                    String structure_std = Json(preop_treatment.getstructure_std(), "structure_std");
                                    //chemotherapy_regimen
                                    preoperativePreparation.setRadiotherapySite(structure_std);
                                }
                                preoperativePreparation.setRadiotherapyTime(preop_treatment.getdate_time_p().toString());
                            }
                            else    if (preop_treatment.getdate_time_estimate()!=null) {
                                preoperativePreparation.setRadiotherapy("是");
                                //“术前化疗”确定为是，对应的regimen_std
                                if (preop_treatment.getstructure_std()!=null){
                                    String getstructure_std = Json(preop_treatment.getstructure_std(), "structure_std");
                                    //chemotherapy_regimen
                                    preoperativePreparation.setRadiotherapySite(getstructure_std);
                                }
                                preoperativePreparation.setRadiotherapyTime(preop_treatment.getdate_time_p().toString());
                            }

                        }
                        else if (treatment_Radistd.contains("放疗")){
                            if (falg){
                                if(preop_treatment.getdate_time_p()!=null&&tem_operation_record.getITEM_BEGIN_DATE().compareTo(preop_treatment.getdate_time_p()) <0){
                                    preoperativePreparation.setRadiotherapy("是");
                                    if (preop_treatment.getstructure_std()!=null){
                                        String structure_std = Json(preop_treatment.getstructure_std(), "structure_std");
                                        //chemotherapy_regimen
                                        preoperativePreparation.setRadiotherapySite(structure_std);
                                    }
                                    preoperativePreparation.setRadiotherapyTime(preop_treatment.getdate_time_p().toString());
                                }
                                else    if (preop_treatment.getdate_time_estimate()!=null&&tem_operation_record.getITEM_BEGIN_DATE().compareTo(preop_treatment.getdate_time_estimate()) <0) {
                                    preoperativePreparation.setRadiotherapy("是");
                                    //“术前化疗”确定为是，对应的regimen_std
                                    if (preop_treatment.getstructure_std()!=null){
                                        String structure_std = Json(preop_treatment.getstructure_std(), "structure_std");
                                        //chemotherapy_regimen
                                        preoperativePreparation.setRadiotherapySite(structure_std);
                                    }
                                    preoperativePreparation.setRadiotherapyTime(preop_treatment.getdate_time_p().toString());
                                }
                                else{
                                    if (preoperativePreparation.getRadiotherapy()==null) {
                                        preoperativePreparation.setRadiotherapy("否");
                                    }
                                }
                            }
                            else{
                                if (preoperativePreparation.getRadiotherapy()==null) {
                                    preoperativePreparation.setRadiotherapy("否");
                                }
                            }
                        }
                        else{
                            if (preoperativePreparation.getRadiotherapy()==null) {
                                preoperativePreparation.setRadiotherapy("否");
                            }
                        }
                    }
                }
            }

            if (preoperativePreparation.getLactulose()==null){
                preoperativePreparation.setLactulose("否");
            }
            if (preoperativePreparation.getPeg()==null){
                preoperativePreparation.setPeg("否");
            }
            if (preoperativePreparation.getMagnesiumSulphate()==null){
                preoperativePreparation.setMagnesiumSulphate("否");
            }
            if (preoperativePreparation.getSennaLeaf()==null){
                preoperativePreparation.setSennaLeaf("否");
            }
            if (preoperativePreparation.getCastorOil()==null){
                preoperativePreparation.setCastorOil("否");
            }
            if (preoperativePreparation.getMannitol()==null){
                preoperativePreparation.setMannitol("否");
            }
            if (preoperativePreparation.getCompoundSodiumPicosulfate()==null){
                preoperativePreparation.setCompoundSodiumPicosulfate("否");
            }
            if (preoperativePreparation.getSodiumPhosphate()==null){
                preoperativePreparation.setSodiumPhosphate("否");
            }

            preoperativePreparation.setDataVersion(tem_operation_record.getDATA_VERSION());
            preoperativePreparation.setDataDbSource(tem_operation_record.getDATA_DB_SOURCE());
            preoperativePreparation.setDataTableSource(tem_operation_record.getDATA_TABLE_SOURCE());
            preoperativePreparation.setDataFieldSource(tem_operation_record.getDATA_FIELD_SOURCE());
            preoperativePreparation.setCreatedAt(tem_operation_record.getCREATED_AT());
            preoperativePreparation.setCreator(tem_operation_record.getCREATOR());
            preoperativePreparation.setUpdatedAt(tem_operation_record.getUPDATED_AT());
            preoperativePreparationMapper.savePreoperativePreparation(preoperativePreparation);
        }
    }
    public void addoperationRun(List<TEM_OPERATION_RECORD> zjTemOperationRecordByALL) {
        for (TEM_OPERATION_RECORD tem_operation_record:zjTemOperationRecordByALL) {
            OperationRecord operationRecord = new OperationRecord();
            operationRecord.setUniqueId(tem_operation_record.getUNIQUE_ID());
            operationRecord.setUniqueIdLv1(tem_operation_record.getUNIQUE_ID_LV1());
            operationRecord.setUniqueIdLv2(tem_operation_record.getUNIQUE_ID_LV2());
            operationRecord.setP900(tem_operation_record.getP900());
            operationRecord.setPatientId(tem_operation_record.getPATIENT_ID());
            operationRecord.setVisitId(tem_operation_record.getVISIT_ID());
            operationRecord.setRecord(tem_operation_record.getSURGICAL_PROCESS());
            //检索关键词“机器人；腹腔镜、腔镜；开腹；机器人转开腹；腔镜转开腹”对应分类
            //机器人、腹腔镜辅助，机器人中转开腹、腹腔镜中转开腹，开腹，
            if (tem_operation_record.getRCPT_NO()!=null){
                if (tem_operation_record.getRCPT_NO().contains("机器人")){
                    operationRecord.setRoute("机器人");
                }
                if (tem_operation_record.getRCPT_NO().contains("腹腔镜、腔镜")){
                    operationRecord.setRoute("腹腔镜辅助");
                }
                if (tem_operation_record.getRCPT_NO().contains("开腹")){
                    operationRecord.setRoute("开腹");
                }
                if (tem_operation_record.getRCPT_NO().contains("机器人转开腹")){
                    operationRecord.setRoute("机器人中转开腹");
                } if (tem_operation_record.getRCPT_NO().contains("腔镜转开腹")){
                    operationRecord.setRoute("腹腔镜中转开腹");
                }


            }
            if (tem_operation_record.getRCPT_NO()!=null){
                if (tem_operation_record.getRCPT_NO().contains("机器人")){
                    operationRecord.setRobot("是");
                }
            }
            if (tem_operation_record.getRCPT_NO()!=null){
                if (tem_operation_record.getRCPT_NO().contains("直肠")){
                    operationRecord.setResectionRectum("是");
                }
            }
            if (tem_operation_record.getRCPT_NO()!=null){
                if (tem_operation_record.getRCPT_NO().contains("结肠")){
                    operationRecord.setResectionColon("是");
                }
            }
            //operation_name
            operationRecord.setOperationName(tem_operation_record.getRCPT_NO());
            //   List<SURGICAL_RECORD> zjSurgicalRecordByUniqueId = zjSurgicalRecordMapper.findZjSurgicalRecordByUniqueId(tem_operation_record.getUNIQUE_ID_LV2());
            if (tem_operation_record.getBLOOD_TRANSFUSION_VOLUME()!=null){
                operationRecord.setBloodTransfusion("是");
            }
            List<SURGERY_LN_BLOOD> zjSurgeryLnBloodByUniqueId = zjSurgeryLnBloodMapper.findZjSurgeryLnBloodByUniqueId(tem_operation_record.getUNIQUE_ID_LV2());
            for (SURGERY_LN_BLOOD surgery_ln_blood: zjSurgeryLnBloodByUniqueId) {
                if (surgery_ln_blood.getln_dissection_std()!=null){
                    operationRecord.setLymphDissection("是");
                }
                //直接映射 /  neg_std为空时，bleeding_entity_std检索到“出血”时对应的para_value_std
                // BLOOD_TRANSFUSION_VOLUME字段非空则为是 ；neg_std为空时+transfusion_entity_std非空则为是
                if (surgery_ln_blood.getneg_std()==null){
                    if(surgery_ln_blood.getbleeding_entity_std()!=null) {
                        String bleeding_entity_std = Json(surgery_ln_blood.getbleeding_entity_std(), "bleeding_entity_std");
                        //术中出血量
                        if (bleeding_entity_std.contains("出血")){
                            if(surgery_ln_blood.getpara_value_std()!=null){
                                String para_value_std = Json(surgery_ln_blood.getpara_value_std(), "para_value_std");
                                operationRecord.setMabl(para_value_std);
                            }
                        }

                    }
                    if(surgery_ln_blood.gettransfusion_entity_std()!=null){
                        operationRecord.setBloodTransfusion("是");
                    }
                    // 直接映射 / neg_std为空时，transfusion_entity_std检索到“输血”时，对应的para_value_std
                    if (surgery_ln_blood.gettransfusion_entity_std()!=null){
                        String transfusion_entity_std = Json(surgery_ln_blood.gettransfusion_entity_std(), "transfusion_entity_std");
                        if (transfusion_entity_std.contains("输血")){
                            if(surgery_ln_blood.getpara_value_std()!=null){
                                String para_value_std = Json(surgery_ln_blood.getpara_value_std(), "para_value_std");
                                operationRecord.setBloodTransfusionVolume(para_value_std);
                            }
                        }
                    }
                }
                List<INP_ORDERS> zjInpOrdersByUniqueId = zjInpOrdersMapper.findZjInpOrdersByUniqueId(surgery_ln_blood.getunique_id_lv2());
                for (INP_ORDERS inp_orders: zjInpOrdersByUniqueId) {
                    if (tem_operation_record.getITEM_BEGIN_DATE()!=null&&inp_orders.getENTER_DATE_TIME()!=null) {
                        if (StringUtils.isNotEmpty(inp_orders.getORDER_CLASS()) && inp_orders.getORDER_CLASS().contains("临时医嘱") &&
                                (inp_orders.getORDER_TEXT().contains("输血"))) {
                            if (tem_operation_record.getITEM_END_DATE().compareTo(inp_orders.getENTER_DATE_TIME()) == 1) {
                                if(surgery_ln_blood.gettransfusion_entity_std()!=null) {
                                    String transfusion_type_std = Json(surgery_ln_blood.gettransfusion_entity_std(), "transfusion_type_std");
                                    operationRecord.setComposition(transfusion_type_std);
                                }
                            }

                        }

                    }

                }
            }

            if (tem_operation_record.getRCPT_NO()!=null){
                if (tem_operation_record.getRCPT_NO().contains("造瘘")||tem_operation_record.getRCPT_NO().contains("造口")){
                    operationRecord.setColostomy("是");
                }
            }
            if (tem_operation_record.getRCPT_NO()!=null){
                if (tem_operation_record.getRCPT_NO().contains("回肠造瘘")||tem_operation_record.getRCPT_NO().contains("回肠造口")){
                    operationRecord.setColostomyMethods("回肠造瘘");
                }
                if (tem_operation_record.getRCPT_NO().contains("结肠造瘘")||tem_operation_record.getRCPT_NO().contains("结肠造口")){
                    operationRecord.setColostomyMethods("结肠造瘘");
                }
                if (tem_operation_record.getRCPT_NO().contains("乙状结肠造瘘")||tem_operation_record.getRCPT_NO().contains("乙状结肠造口")){
                    operationRecord.setColostomyMethods("乙状结肠造瘘");
                }
                if (tem_operation_record.getRCPT_NO().contains("直肠造瘘")||tem_operation_record.getRCPT_NO().contains("直肠造口")){
                    operationRecord.setColostomyMethods("直肠造瘘");
                }

            }
            if (tem_operation_record.getRCPT_NO()!=null){

                //检索到“切除 + 胃、脾、胰腺、胆囊、肝、肾、肾上腺、子宫、卵巢、输卵管、附件、肠系膜、大网膜”时，则为是
                if (tem_operation_record.getRCPT_NO().contains("切除")&&tem_operation_record.getRCPT_NO().contains("胃")){
                    operationRecord.setRemoveOrgans("是");
                    operationRecord.setRemoveOrgansName(tem_operation_record.getRCPT_NO());
                }
                if (tem_operation_record.getRCPT_NO().contains("切除")&&tem_operation_record.getRCPT_NO().contains("脾")){
                    operationRecord.setRemoveOrgans("是");
                    operationRecord.setRemoveOrgansName(tem_operation_record.getRCPT_NO());

                }
                if (tem_operation_record.getRCPT_NO().contains("切除")&&tem_operation_record.getRCPT_NO().contains("胰腺")){
                    operationRecord.setRemoveOrgans("是");
                    operationRecord.setRemoveOrgansName(tem_operation_record.getRCPT_NO());

                }
                if (tem_operation_record.getRCPT_NO().contains("切除")&&tem_operation_record.getRCPT_NO().contains("胆囊")){
                    operationRecord.setRemoveOrgans("是");
                    operationRecord.setRemoveOrgansName(tem_operation_record.getRCPT_NO());

                }
                if (tem_operation_record.getRCPT_NO().contains("切除")&&tem_operation_record.getRCPT_NO().contains("肝")){
                    operationRecord.setRemoveOrgans("是");
                    operationRecord.setRemoveOrgansName(tem_operation_record.getRCPT_NO());

                }
                if (tem_operation_record.getRCPT_NO().contains("切除")&&tem_operation_record.getRCPT_NO().contains("肾")){
                    operationRecord.setRemoveOrgans("是");
                    operationRecord.setRemoveOrgansName(tem_operation_record.getRCPT_NO());

                }
                if (tem_operation_record.getRCPT_NO().contains("切除")&&tem_operation_record.getRCPT_NO().contains("肾上腺")){
                    operationRecord.setRemoveOrgans("是");
                    operationRecord.setRemoveOrgansName(tem_operation_record.getRCPT_NO());

                }
                if (tem_operation_record.getRCPT_NO().contains("切除")&&tem_operation_record.getRCPT_NO().contains("子宫")){
                    operationRecord.setRemoveOrgans("是");
                    operationRecord.setRemoveOrgansName(tem_operation_record.getRCPT_NO());

                }
                if (tem_operation_record.getRCPT_NO().contains("切除")&&tem_operation_record.getRCPT_NO().contains("卵巢")){
                    operationRecord.setRemoveOrgans("是");
                    operationRecord.setRemoveOrgansName(tem_operation_record.getRCPT_NO());

                }
                if (tem_operation_record.getRCPT_NO().contains("切除")&&tem_operation_record.getRCPT_NO().contains("输卵管")){
                    operationRecord.setRemoveOrgans("是");
                    operationRecord.setRemoveOrgansName(tem_operation_record.getRCPT_NO());

                }
                if (tem_operation_record.getRCPT_NO().contains("切除")&&tem_operation_record.getRCPT_NO().contains("附件")){
                    operationRecord.setRemoveOrgans("是");
                    operationRecord.setRemoveOrgansName(tem_operation_record.getRCPT_NO());

                }
                if (tem_operation_record.getRCPT_NO().contains("切除")&&tem_operation_record.getRCPT_NO().contains("肠系膜")){
                    operationRecord.setRemoveOrgans("是");
                    operationRecord.setRemoveOrgansName(tem_operation_record.getRCPT_NO());
                }
                if (tem_operation_record.getRCPT_NO().contains("切除")&&tem_operation_record.getRCPT_NO().contains("大网膜")){
                    operationRecord.setRemoveOrgans("是");
                    operationRecord.setRemoveOrgansName(tem_operation_record.getRCPT_NO());
                }
            }

            //淋巴结清扫
            if (operationRecord.getLymphDissection()==null){
                operationRecord.setLymphDissection("否");
            }
            if (operationRecord.getBloodTransfusion()==null){
                operationRecord.setBloodTransfusion("否");
            }
            if (operationRecord.getBloodTransfusionVolume()==null){
                operationRecord.setBloodTransfusionVolume("否");
            }
            if (operationRecord.getColostomy()==null){
                operationRecord.setColostomy("否");
            }
            if (operationRecord.getRemoveOrgans()==null){
                operationRecord.setRemoveOrgans("否");
            }
            operationRecord.setStartTime(tem_operation_record.getITEM_BEGIN_DATE());
            operationRecord.setEndTime(tem_operation_record.getITEM_END_DATE());;

            //术中输入成分
            // operationRecord.setComposition();

            //                    联合切除器官名称
            //operationRecord.setRemoveOrgansName();



            operationRecord.setDataVersion(tem_operation_record.getDATA_VERSION());
            operationRecord.setDataDbSource(tem_operation_record.getDATA_DB_SOURCE());
            operationRecord.setDataTableSource(tem_operation_record.getDATA_TABLE_SOURCE());
            operationRecord.setDataFieldSource(tem_operation_record.getDATA_FIELD_SOURCE());
            operationRecord.setCreatedAt(tem_operation_record.getCREATED_AT());
            operationRecord.setCreator(tem_operation_record.getCREATOR());
            operationRecord.setUpdatedAt(tem_operation_record.getUPDATED_AT());
            operationRecordMapper.saveOperationRecord(operationRecord);
        }


    }
    public void addsurgical(List<SURGICAL_RECORD> zjSurgicalRecordByUniqueId ) {
        for (SURGICAL_RECORD surgical_record:zjSurgicalRecordByUniqueId) {
            SurgicalRecord surgicalRecord = new SurgicalRecord();
            surgicalRecord.setUniqueId(surgical_record.getunique_id());
            surgicalRecord.setUniqueIdLv1(surgical_record.getunique_id_lv1());
            surgicalRecord.setUniqueIdLv2(surgical_record.getunique_id_lv2());
            surgicalRecord.setP900(surgical_record.getp900());
            surgicalRecord.setPatientId(surgical_record.getpatient_id());
            surgicalRecord.setVisitId(surgical_record.getvisit_id());
            //检索到“根治术”则为是；其他为否 op_method_std
            if (surgical_record.getop_method_std()!=null){
                String op_method_std = Json(surgical_record.getop_method_std(), "op_method_std");
                if (op_method_std.contains("根治术")){
                    surgicalRecord.setRadicalOperation("是");
                }

            }
            if (surgical_record.getreconstruction_method_std()!=null){
                //reconstruction_method_std
                String reconstruction_method_std = Json(surgical_record.getreconstruction_method_std(), "reconstruction_method_std");
                surgicalRecord.setReconstructionMethods(reconstruction_method_std);

            }
            // cut_std
            if (surgical_record.getcut_std()!=null){
                String cut_std = Json(surgical_record.getcut_std(), "cut_std");
                System.out.println(cut_std);
                if (cut_std.contains("上腹")){
                    surgicalRecord.setIncisionEpigastric("是");
                }
            }
            if (surgical_record.getcut_std()!=null){
                String cut_std = Json(surgical_record.getcut_std(), "cut_std");
                if (cut_std.contains("绕脐")){
                    surgicalRecord.setIncisionAroundNavel("是");
                }
            }
            if (surgical_record.getcut_std()!=null){
                String cut_std = Json(surgical_record.getcut_std(), "cut_std");
                if (cut_std.contains("下腹")){
                    surgicalRecord.setIncisionalLowerAbdomen("是");
                }
            }
            if (surgical_record.getpara_value_std()!=null){
                String para_value_std = Json(surgical_record.getpara_value_std(), "para_value_std");
                surgicalRecord.setIncisionLength(para_value_std);

            }
            if (surgical_record.getintraop_scope_std()!=null){
                surgicalRecord.setIntraoperativeEnteroscopy("是");

            }
            if (surgical_record.getintraop_lavage_std()!=null){
                surgicalRecord.setIntraoperativeLavage("是");

            }
            if (surgical_record.getintraop_chemo_std()!=null){
                surgicalRecord.setIntraoperativeChemotherapy("是");

            }
            if (surgical_record.getdrain_std()!=null){
                surgicalRecord.setIndwellingDrainageTube("是");

            }
            // chemotherapeutic_drugs	术中化疗药物
            if (surgical_record.getintraop_chemo_std()!=null){
                String intraop_chemo_std = Json(surgical_record.getintraop_chemo_std(), "intraop_chemo_std");
                surgicalRecord.setChemotherapeuticDrugs(intraop_chemo_std);

            }

            if (surgicalRecord.getRadicalOperation()==null){
                surgicalRecord.setRadicalOperation("否");
            }
            if (surgicalRecord.getIncisionEpigastric()==null){
                surgicalRecord.setIncisionEpigastric("否");
            }
            if (surgicalRecord.getIncisionAroundNavel()==null){
                surgicalRecord.setIncisionAroundNavel("否");
            }
            if (surgicalRecord.getIncisionalLowerAbdomen()==null){
                surgicalRecord.setIncisionalLowerAbdomen("否");
            }
            // intraoperative_enteroscopy	是否术中肠镜
            if (surgicalRecord.getIntraoperativeEnteroscopy()==null){
                surgicalRecord.setIntraoperativeEnteroscopy("否");
            }
            // intraoperative_lavage	术中灌洗

            if (surgicalRecord.getIntraoperativeLavage()==null){
                surgicalRecord.setIntraoperativeLavage("否");
            }
            // intraoperative_chemotherapy	术中化疗
            if (surgicalRecord.getIntraoperativeChemotherapy()==null){
                surgicalRecord.setIntraoperativeChemotherapy("否");
            }

            //indwelling_drainage_tube	术中是否留置引流管
            if (surgicalRecord.getIndwellingDrainageTube()==null){
                surgicalRecord.setIndwellingDrainageTube("否");
            }
            surgicalRecord.setDataVersion(surgical_record.getdata_version());
            surgicalRecord.setDataDbSource(surgical_record.getdata_db_source());
            surgicalRecord.setDataTableSource(surgical_record.getdata_table_source());
            surgicalRecord.setDataFieldSource(surgical_record.getdata_field_source());
            surgicalRecord.setCreator(surgical_record.getcreator());
            surgicalRecord.setCreatedAt(null);
            surgicalRecord.setUpdatedAt(null);
            surgicalRecordMapper.saveSurgicalRecord(surgicalRecord);
        }
        // radical_operation	手术术式是否为根治术

    }
    public void addcolo(List<COLON_ES_DESCRIPTION> zjColonEsDescriptionByALL ){
        for (COLON_ES_DESCRIPTION colon_es_description:zjColonEsDescriptionByALL) {
            Colonoscopy colonoscopy = new Colonoscopy();
            colonoscopy.setUniqueId(colon_es_description.getunique_id());
            colonoscopy.setUniqueIdLv1(colon_es_description.getunique_id_lv1());
            colonoscopy.setUniqueIdLv2(colon_es_description.getunique_id_lv2());
            colonoscopy.setP900(colon_es_description.getp900());
            colonoscopy.setPatientId(colon_es_description.getpatient_id());
            colonoscopy.setVisitId(colon_es_description.getvisit_id());
            colonoscopy.setDataVersion(colon_es_description.getdata_version());
            colonoscopy.setDataDbSource(colon_es_description.getdata_db_source());
            colonoscopy.setDataTableSource(colon_es_description.getdata_table_source());
            colonoscopy.setDataFieldSource(colon_es_description.getdata_field_source());
            colonoscopy.setCreatedAt(null);
            colonoscopy.setUpdatedAt(null);
            //neg_std为空时，保留structure_std、structure_site_std
            if (colon_es_description.getneg_std()==null){
                if (colon_es_description.getstructure_std()!=null){
                    System.out.println(colon_es_description.getstructure_std());
                    String structure_std = Json2(colon_es_description.getstructure_std(), "structure_std");
                    String structure_site_std = Json(colon_es_description.getstructure_std(), "structure_site_std");
                    colonoscopy.setLesionLocation(structure_std+""+structure_site_std);
                }
            }

            if (colon_es_description.getdistance_std()!=null){
                String distance_unit_std = Json(colon_es_description.getdistance_std(), "distance_unit_std");
                String distance_to_anus_std = Json(colon_es_description.getdistance_std(), "distance_to_anus_std");

                colonoscopy.setDistanceToAnus(distance_to_anus_std+distance_unit_std);

            }
            if (colon_es_description.getsize_std()!=null){
                String size_std = Json(colon_es_description.getsize_std(), "size_std");
                colonoscopy.setLesionSize(size_std);
            }
            if (colon_es_description.getquantity_std()!=null){
                String quantity_std = Json(colon_es_description.getquantity_std(), "quantity_std");
                colonoscopy.setLesionNumber(quantity_std);
            }
            colonoscopyMapper.saveColonoscopy(colonoscopy);

        }

    }
    public void inExamMaster(List<EXAM_MASTER> zjExamMasterByAll) {
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

    public void inLisRecord(List<LIS_RECORD> zjLisRecordByALL) {
        // List<com.clinical.model.cluster.LisRecord> list=new ArrayList<com.clinical.model.cluster.LisRecord>();
        for (LIS_RECORD lis_record:zjLisRecordByALL ) {
            LisRecord lisRecord = new LisRecord();
            lisRecord.setUniqueId(lis_record.getUNIQUE_ID());
            lisRecord.setUniqueIdLv1(lis_record.getUNIQUE_ID_LV1());
            lisRecord.setUniqueIdLv2(lis_record.getUNIQUE_ID_LV2());
            lisRecord.setP900(lis_record.getP900());
            lisRecord.setPatientId(lis_record.getPATIENT_ID());
            lisRecord.setVisitType(lis_record.getVISIT_TYPE());
            lisRecord.setVisitId(lis_record.getVISIT_ID());
            lisRecord.setAdmissionNumber(lis_record.getADMISSION_NUMBER());
            lisRecord.setTestNo(lis_record.getTEST_NO());
            lisRecord.setSpcmType(lis_record.getSPCM_TYPE());
            lisRecord.setSpcmReceivedDateTime(lis_record.getSPCM_RECEIVED_DATE_TIME());
            lisRecord.setSpcmSampleDateTime(lis_record.getSPCM_SAMPLE_DATE_TIME());
            lisRecord.setRequestedDateTime(lis_record.getREQUESTED_DATE_TIME());
            lisRecord.setResultRptDateTime(lis_record.getRESULT_RPT_DATE_TIME());
            lisRecord.setResultDateTime(lis_record.getRESULT_DATE_TIME());
            lisRecord.setPrintOrder(lis_record.getPRINT_ORDER());
            lisRecord.setTestPackageName(lis_record.getTEST_PACKAGE_NAME());
            lisRecord.setTestItemName(lis_record.getTEST_ITEM_NAME());
            lisRecord.setResult(lis_record.getRESULT());
            lisRecord.setUnits(lis_record.getUNITS());
            lisRecord.setAbnormalIndicator(lis_record.getABNORMAL_INDICATOR());
            lisRecord.setReferenceInterval(lis_record.getREFERENCE_INTERVAL());
            lisRecord.setSpcmTypeStd(lis_record.getSPCM_TYPE_STD());
            lisRecord.setTestItemNameStd(lis_record.getTEST_ITEM_NAME_STD());
            lisRecord.setDataVersion(lis_record.getDATA_VERSION());
            lisRecord.setDataDbSource(lis_record.getDATA_DB_SOURCE());
            lisRecord.setDataTableSource(lis_record.getDATA_TABLE_SOURCE());
            lisRecord.setDataFieldSource(lis_record.getDATA_FIELD_SOURCE());
            lisRecord.setCreatedAt(lis_record.getCREATED_AT());
            lisRecord.setCreator(lis_record.getCREATOR());
            lisRecord.setUpdatedAt(lis_record.getUPDATED_AT());
            lisRecordMapper.saveLisRecord(lisRecord);
        }


    }
    public String Json(String s,String ss){
        String structure_stds = standardResultMapper.selectStandardResultById(s);
        List<String> structure_stdslist = JSONUtils.getList(structure_stds, "afterType1", ss);
        StringBuffer structure_std = new StringBuffer();
        for (String structure_std1: structure_stdslist) {
            structure_std.append(structure_std1);
        }
        return structure_std.toString();
    }
    public String SizeJson(String s,String ss){
        String structure_stds = standardResultMapper.selectStandardResultById(s);
        List<String> structure_stdslist = JSONUtils.getList(structure_stds, "afterType1", ss);
        StringBuffer structure_std = new StringBuffer();
        for (int i=0;i<structure_stdslist.size()-1;i++) {
            if (i<structure_stdslist.size()-2) {
                structure_std.append(structure_stdslist.get(i) + "*");
            }else{
                structure_std.append(structure_stdslist.get(i));
            }
        }
        return structure_std.toString();
    }
    public String Json2(String s,String ss){
        String structure_stds = standardResultMapper.selectStandardResultById(s);
        List<String> structure_stdslist = JSONUtils.getList(structure_stds, "afterType1", ss);
        StringBuffer structure_std = new StringBuffer();
        for (String structure_std1: structure_stdslist) {
            structure_std.append(structure_std1);
        }
        return structure_std.toString();
    }
    // ----------------------------------------------------lv

    /**
     * 化疗和药物治疗
     * @param zj_DRUG_ORDER
     */
    public void saveChemotherapyAndTreatment(List<DRUG_ORDER> zj_DRUG_ORDER) {
        List<String> chemotherapyList = new ArrayList<>();
        chemotherapyList.add("生物靶向抗肿瘤药");
        chemotherapyList.add("抗肿瘤辅助用药");
        chemotherapyList.add("其他抗肿瘤药");
        chemotherapyList.add("植物来源的抗肿瘤药及其衍生物");
        chemotherapyList.add("激素类抗肿瘤药");
        chemotherapyList.add("抗肿瘤抗生素");
        List<String> treatmentList = new ArrayList<>();
        treatmentList.add("预防用生物制品");
        treatmentList.add("胰岛素及其类似物");
        treatmentList.add("免疫增强剂");
        treatmentList.add("治疗消化性溃疡药与胃食管反流病药");
        treatmentList.add("肠内营养药");
        treatmentList.add("肠外营养药");
        treatmentList.add("核苷类逆转录酶抑制剂");
        treatmentList.add("抗人类免疫缺陷病毒药");
        treatmentList.add("治疗用生物制品");
        treatmentList.add("眼科用药");
        treatmentList.add("驱肠虫药");
        treatmentList.add("感冒用药");
        treatmentList.add("皮肤科用药");
        treatmentList.add("抗组胺药");
        treatmentList.add("钙代谢调节药物及抗骨质疏松药");
        treatmentList.add("抗抑郁抗躁狂药");
        treatmentList.add("气血双补");
        treatmentList.add("抗凝血药");
        treatmentList.add("补肝肾,强筋骨");
        treatmentList.add("其他补益剂");
        treatmentList.add("其他理血剂");
        treatmentList.add("其他安神药（含解表,清热祛风除痰镇惊；清热安神）");
        treatmentList.add("镇咳药");
        treatmentList.add("口服降糖药");
        treatmentList.add("蒙药");
        treatmentList.add("抗精神病药");
        treatmentList.add("利尿药");
        treatmentList.add("抗高血压药");
        treatmentList.add("氨基糖苷类");
        treatmentList.add("青霉素类");
        treatmentList.add("β-内酰胺酶抑制剂及其与β-内酰胺类抗生素配伍的复方制剂");
        treatmentList.add("芳香化酶抑制剂");
        treatmentList.add("其他妇产科用药");
        treatmentList.add("抗血小板聚集药");
        treatmentList.add("其他麻醉药");
        treatmentList.add("大环内酯类");
        treatmentList.add("促胃肠动力药与止吐、催吐药");
        treatmentList.add("治疗肝性脑病药与肝病辅助药");
        treatmentList.add("抗代谢药");
        treatmentList.add("局部麻醉药");
        treatmentList.add("调节血脂药及抗动脉粥样硬化药");
        treatmentList.add("胃肠解痉药");
        treatmentList.add("防治心绞痛药");
        treatmentList.add("其他泌尿系统用药");
        treatmentList.add("广谱抗病毒药");
        treatmentList.add("清热解毒");
        treatmentList.add("抗脑血管病药");
        treatmentList.add("免疫抑制剂");
        treatmentList.add("抗贫血药");
        treatmentList.add("其他降糖药");
        treatmentList.add("其他祛痰剂");
        treatmentList.add("前列腺疾病用药物及勃起功能障碍治疗药物");
        treatmentList.add("辛凉解表");
        treatmentList.add("其他疏风剂");
        treatmentList.add("凉开");
        treatmentList.add("止血");
        treatmentList.add("其他循环系统用药");
        treatmentList.add("活血");
        treatmentList.add("平熄内风");
        treatmentList.add("补气");
        treatmentList.add("其他理气剂");
        treatmentList.add("其他外用药");
        treatmentList.add("祛痰药");
        treatmentList.add("抗麻风药");
        treatmentList.add("平喘药");
        treatmentList.add("促凝血药");
        treatmentList.add("口腔科用药");
        treatmentList.add("中枢神经兴奋药");
        treatmentList.add("促白细胞增生药");
        treatmentList.add("补阳");
        treatmentList.add("抗癫痫及抗惊厥药");
        treatmentList.add("食欲抑制剂及其他减肥药");
        treatmentList.add("治疗炎性肠病药");
        treatmentList.add("硝基咪唑类");
        treatmentList.add("其他神经系统用药");
        treatmentList.add("清脏腑热");
        treatmentList.add("其他清热剂");
        treatmentList.add("复合维生素制剂");
        treatmentList.add("补阴");
        treatmentList.add("阴阳双补");
        treatmentList.add("其他祛湿药");
        treatmentList.add("喹诺酮类");
        treatmentList.add("麻醉辅助药");
        treatmentList.add("祛痰止咳");
        treatmentList.add("祛暑剂");
        treatmentList.add("清热化痰");
        treatmentList.add("眼病");
        treatmentList.add("温中祛寒");
        treatmentList.add("固肾止遗");
        treatmentList.add("其他呼吸系统用药");
        treatmentList.add("清热泻火");
        treatmentList.add("烷化剂");
        treatmentList.add("活血养血");
        treatmentList.add("清热祛湿");
        treatmentList.add("补益止咳平喘");
        treatmentList.add("咽喉病");
        treatmentList.add("补养安神");
        treatmentList.add("雌激素类及抗雌激素药");
        treatmentList.add("温化寒(燥湿化)痰");
        treatmentList.add("耳鼻喉科用药");
        treatmentList.add("解表消食");
        treatmentList.add("维生素A、D属");
        treatmentList.add("肾上腺皮质激素类药");
        treatmentList.add("镇静、催眠药");
        treatmentList.add("利胆药与胆石溶解药");
        treatmentList.add("抗偏头痛药");
        treatmentList.add("抗痛风药");
        treatmentList.add("消毒防腐药");
        treatmentList.add("外科用药");
        treatmentList.add("鼻病");
        treatmentList.add("泻药、止泻药");
        treatmentList.add("抗帕金森病药");
        treatmentList.add("抗血吸虫病药");
        treatmentList.add("抗结核药");
        treatmentList.add("温化水湿");
        treatmentList.add("润下");
        treatmentList.add("祛风除湿");
        treatmentList.add("其他泻下剂");
        treatmentList.add("扶正解表");
        treatmentList.add("全身麻醉药");
        treatmentList.add("甲状腺激素及抗甲状腺类药");
        treatmentList.add("雄激素、抗雄激素及同化激素类药");
        treatmentList.add("酶及辅酶类药");
        treatmentList.add("其他抗真菌药");
        treatmentList.add("清热凉血");
        treatmentList.add("其他固涩剂");
        treatmentList.add("回阳救逆");
        treatmentList.add("祛湿化浊");
        treatmentList.add("其他开窍剂");
        treatmentList.add("其他解表剂");
        treatmentList.add("肛肠科用药");
        treatmentList.add("口腔、牙病");
        treatmentList.add("其他温里药");
        treatmentList.add("疏散外风");
        treatmentList.add("其他抗感染类药");
        treatmentList.add("垂体激素及下丘脑释放激素药");
        treatmentList.add("重镇安神");
        treatmentList.add("其他抗病毒药");
        treatmentList.add("其他生化药");
        treatmentList.add("妇产科用药");
        treatmentList.add("其他消化系统用药");
        treatmentList.add("微量元素与矿物质");
        treatmentList.add("其他激素及调节内分泌功能药");
        treatmentList.add("孕激素类与抗孕激素类药");
        treatmentList.add("电解质平衡调节药");
        treatmentList.add("酪氨酸激酶抑制剂");
        treatmentList.add("和解少阳");
        treatmentList.add("三硫代烯丙醚类");
        treatmentList.add("液体制剂辅料");
        treatmentList.add("抗焦虑药");
        treatmentList.add("金属中毒解毒药");
        treatmentList.add("其他制剂辅料");
        treatmentList.add("其他化学合成的抗菌药");
        treatmentList.add("放射性药品");
        treatmentList.add("造影剂");
        treatmentList.add("其他诊断用药");
        treatmentList.add("血浆及血容量扩充剂");
        treatmentList.add("透析用药");
        treatmentList.add("耳病");
        treatmentList.add("强心药");
        treatmentList.add("其他血液系统用药");
        treatmentList.add("微生态制剂");
        treatmentList.add("磺胺类及其增效剂");
        treatmentList.add("有机磷酸酯类中毒解毒药");
        treatmentList.add("助消化药");
        treatmentList.add("碳青霉烯类");
        treatmentList.add("维生素B属");
        treatmentList.add("其他抗变态反应药");
        treatmentList.add("辛温解表");
        treatmentList.add("其他抗生素类抗感染药");
        treatmentList.add("硝基呋喃类");
        treatmentList.add("吡咯类");
        treatmentList.add("其他解毒药");
        treatmentList.add("脱水药");
        treatmentList.add("补血");
        treatmentList.add("理气舒肝");
        treatmentList.add("抗疟药");
        treatmentList.add("酰胺醇类");
        treatmentList.add("其他维生素类、矿物质类及营养类药");
        treatmentList.add("酸碱平衡调节药");
        treatmentList.add("其他专科用药");
        treatmentList.add("利水渗湿化浊");
        treatmentList.add("咪唑类");
        treatmentList.add("头孢菌素类");
        treatmentList.add("维生素C及其他");
        treatmentList.add("化湿和胃");
        treatmentList.add("补益止泻（痢）");
        treatmentList.add("周围血管扩张药");
        treatmentList.add("葡萄糖及其他");
        treatmentList.add("蛋白酶抑制剂");
        treatmentList.add("嘧啶类");
        treatmentList.add("抗重症肌无力药");
        treatmentList.add("补益调经(止带)");
        treatmentList.add("体内诊断用生物制品");
        treatmentList.add("理气宽胸");
        treatmentList.add("林可酰胺类");
        treatmentList.add("噁唑酮");
        treatmentList.add("多烯类");
        treatmentList.add("氰化物中毒解毒药");
        treatmentList.add("多肽类");
        treatmentList.add("其他糖、盐及酸碱平衡调节药");
        treatmentList.add("器官功能检查剂");
        treatmentList.add("抗利什曼原虫药");
        treatmentList.add("凉血止血治疡");
        treatmentList.add("过敏反应介质阻释剂");
        treatmentList.add("抗痴呆药和脑代谢调节药");
        treatmentList.add("其他抗寄生虫药");
        treatmentList.add("四环素类");
        treatmentList.add("抗心律失常药");
        treatmentList.add("亚硝酸盐中毒解毒药");
        treatmentList.add("抗流感及呼吸道病毒药");
        treatmentList.add("抗休克药");
        treatmentList.add("阿片类中毒解毒药");
        treatmentList.add("烯丙胺类");
        treatmentList.add("抗丝虫药");
        treatmentList.add("促血小板增生药");
        treatmentList.add("医疗用毒性药品");
        treatmentList.add("棘白菌素类");
        treatmentList.add("其他调节免疫功能药");
        treatmentList.add("核酸类药");
        treatmentList.add("糖肽类");
        treatmentList.add("解热镇痛抗炎药");

        for (DRUG_ORDER drug_order : zj_DRUG_ORDER
             ) {
            String drugType = drug_order.getPharmacologytype1();
            if(StringUtils.isNotEmpty(drugType)) {
                // 化疗
                if (chemotherapyList.contains(drugType)) {
                    Chemotherapy chemotherapy = new Chemotherapy();
                    // unique_id	unique_id
                    chemotherapy.setUniqueId(drug_order.getUNIQUE_ID());
                    // unique_id_lv1	标识患者身份唯一标识
                    chemotherapy.setUniqueIdLv1(drug_order.getUNIQUE_ID_LV1());
                    // unique_id_lv2	唯一标识
                    chemotherapy.setUniqueIdLv2(drug_order.getUNIQUE_ID_LV2());
                    // p900	医疗机构代码
                    chemotherapy.setP900(drug_order.getP900());
                    // patient_id	患者id
                    chemotherapy.setPatientId(drug_order.getPATIENT_ID());
                    // visit_id	住院号
                    chemotherapy.setVisitId(drug_order.getVISIT_ID());
                    // drug_type	用药分类 商定  pharmacologySystem1  对应  drug_class_std;  pharmacologyType1  对应  drug_subclass_std
                    chemotherapy.setDrugType(drugType);
                    // drug_name	具体药物名称
                    chemotherapy.setDrugName(drug_order.getINGREDIENT_STD());
                    // channel	给药途径
                    chemotherapy.setChannel(drug_order.getADMINISTRATION());
                    // dose	药物剂量
                    chemotherapy.setDose(drug_order.getDOSAGE());
                    // unit	剂量单位
                    chemotherapy.setUnit(drug_order.getDOSAGE_UNITS());
                    // rate	用药频率
                    chemotherapy.setRate(drug_order.getFREQUENCY());
                    // start_date	用药开始日期
                    chemotherapy.setStartDate(drug_order.getENTER_DATE_TIME());
                    // end_date	用药结束日期
                    chemotherapy.setEndDate(drug_order.getSTOP_ORDER_DATE_TIME());
                    // data_version	数据版本
                    chemotherapy.setDataVersion(drug_order.getDATA_VERSION());
                    // data_db_source	数据库来源
                    chemotherapy.setDataDbSource(drug_order.getDATA_DB_SOURCE());
                    // data_table_source	数据表来源
                    chemotherapy.setDataTableSource(drug_order.getDATA_TABLE_SOURCE());
                    // data_field_source	数据项来源
                    chemotherapy.setDataFieldSource(drug_order.getDATA_FIELD_SOURCE());
                    // created_at	创建时间
                    chemotherapy.setCreatedAt(drug_order.getCREATED_AT());
                    // creator	创建人
                    chemotherapy.setCreator(drug_order.getCREATOR());
                    // updated_at	修改时间
                    chemotherapy.setUpdatedAt(drug_order.getUPDATED_AT());
                    chemotherapyService.saveChemotherapy(chemotherapy);
                    log.info("保存化疗：" + chemotherapy.getUniqueId());
                // 药物治疗
                } else if(treatmentList.contains(drugType)) {
                    Treatment treatment = new Treatment();
                    // unique_id	unique_id
                    treatment.setUniqueId(drug_order.getUNIQUE_ID());
                    // unique_id_lv1	标识患者身份唯一标识
                    treatment.setUniqueIdLv1(drug_order.getUNIQUE_ID_LV1());
                    // unique_id_lv2	唯一标识
                    treatment.setUniqueIdLv2(drug_order.getUNIQUE_ID_LV2());
                    // p900	医疗机构代码
                    treatment.setP900(drug_order.getP900());
                    // patient_id	患者id
                    treatment.setPatientId(drug_order.getPATIENT_ID());
                    // visit_id	住院号
                    treatment.setVisitId(drug_order.getVISIT_ID());
                    // drug_type	用药分类    商定   pharmacologySystem1  对应  drug_class_std;  pharmacologyType1  对应  drug_subclass_std
                    treatment.setDrugType(drugType);
                    // drug_name	具体药物名称
                    treatment.setDrugName(drug_order.getINGREDIENT_STD());
                    // channel	给药途径
                    treatment.setChannel(drug_order.getADMINISTRATION());
                    // dose	药物剂量
                    treatment.setDose(drug_order.getDOSAGE());
                    // unit	剂量单位
                    treatment.setUnit(drug_order.getDOSAGE_UNITS());
                    // start_date	用药开始日期
                    treatment.setStartDate(drug_order.getENTER_DATE_TIME());
                    // end_date	用药结束日期
                    treatment.setEndDate(drug_order.getSTOP_ORDER_DATE_TIME());
                    // data_version	数据版本
                    treatment.setDataVersion(drug_order.getDATA_VERSION());
                    // data_db_source	数据库来源
                    treatment.setDataDbSource(drug_order.getDATA_DB_SOURCE());
                    // data_table_source	数据表来源
                    treatment.setDataTableSource(drug_order.getDATA_TABLE_SOURCE());
                    // data_field_source	数据项来源
                    treatment.setDataFieldSource(drug_order.getDATA_FIELD_SOURCE());
                    // created_at	创建时间
                    treatment.setCreatedAt(drug_order.getCREATED_AT());
                    // creator	创建人
                    treatment.setCreator(drug_order.getCREATOR());
                    // updated_at	修改时间
                    treatment.setUpdatedAt(drug_order.getUPDATED_AT());
                    treatmentService.saveTreatment(treatment);
                    log.info("保存药物治疗：" + treatment.getUniqueId());
                }
            }

        }

    }

    /**
     * 药物治疗
     * @param zj_DRUG_ORDER
     */
    public void saveTreatment(List<DRUG_ORDER> zj_DRUG_ORDER) {
        for (DRUG_ORDER drug_order : zj_DRUG_ORDER
                ) {
            Treatment treatment = new Treatment();
            // unique_id	unique_id
            treatment.setUniqueId(drug_order.getUNIQUE_ID());
            // unique_id_lv1	标识患者身份唯一标识
            treatment.setUniqueIdLv1(drug_order.getUNIQUE_ID_LV1());
            // unique_id_lv2	唯一标识
            treatment.setUniqueIdLv2(drug_order.getUNIQUE_ID_LV2());
            // p900	医疗机构代码
            treatment.setP900(drug_order.getP900());
            // patient_id	患者id
            treatment.setPatientId(drug_order.getPATIENT_ID());
            // visit_id	住院号
            treatment.setVisitId(drug_order.getVISIT_ID());
            // drug_type	用药分类    FIXME 待商定   pharmacologySystem1  对应  drug_class_std;  pharmacologyType1  对应  drug_subclass_std
            treatment.setDrugType(drug_order.getORDER_TYPE());
            // drug_name	具体药物名称
            treatment.setDrugName(drug_order.getINGREDIENT_STD());
            // channel	给药途径
            treatment.setChannel(drug_order.getADMINISTRATION());
            // dose	药物剂量
            treatment.setDose(drug_order.getDOSAGE());
            // unit	剂量单位
            treatment.setUnit(drug_order.getDOSAGE_UNITS());
            // start_date	用药开始日期
            treatment.setStartDate(drug_order.getENTER_DATE_TIME());
            // end_date	用药结束日期
            treatment.setEndDate(drug_order.getSTOP_ORDER_DATE_TIME());
            // data_version	数据版本
            treatment.setDataVersion(drug_order.getDATA_VERSION());
            // data_db_source	数据库来源
            treatment.setDataDbSource(drug_order.getDATA_DB_SOURCE());
            // data_table_source	数据表来源
            treatment.setDataTableSource(drug_order.getDATA_TABLE_SOURCE());
            // data_field_source	数据项来源
            treatment.setDataFieldSource(drug_order.getDATA_FIELD_SOURCE());
            // created_at	创建时间
            treatment.setCreatedAt(drug_order.getCREATED_AT());
            // creator	创建人
            treatment.setCreator(drug_order.getCREATOR());
            // updated_at	修改时间
            treatment.setUpdatedAt(drug_order.getUPDATED_AT());
            treatmentService.saveTreatment(treatment);
            log.info("保存药物治疗：" + treatment.getUniqueId());
        }
    }

    /**
     * 化疗
     * @param zj_DRUG_ORDER
     */
    public void saveChemotherapy(List<DRUG_ORDER> zj_DRUG_ORDER) {
        for (DRUG_ORDER drug_order : zj_DRUG_ORDER
                ) {
            Chemotherapy chemotherapy = new Chemotherapy();
            // unique_id	unique_id
            chemotherapy.setUniqueId(drug_order.getUNIQUE_ID());
            // unique_id_lv1	标识患者身份唯一标识
            chemotherapy.setUniqueIdLv1(drug_order.getUNIQUE_ID_LV1());
            // unique_id_lv2	唯一标识
            chemotherapy.setUniqueIdLv2(drug_order.getUNIQUE_ID_LV2());
            // p900	医疗机构代码
            chemotherapy.setP900(drug_order.getP900());
            // patient_id	患者id
            chemotherapy.setPatientId(drug_order.getPATIENT_ID());
            // visit_id	住院号
            chemotherapy.setVisitId(drug_order.getVISIT_ID());
            // drug_type	用药分类 FIXME 待商定  pharmacologySystem1  对应  drug_class_std;  pharmacologyType1  对应  drug_subclass_std
            chemotherapy.setDrugType(drug_order.getORDER_TYPE());
            // drug_name	具体药物名称
            chemotherapy.setDrugName(drug_order.getINGREDIENT_STD());
            // channel	给药途径
            chemotherapy.setChannel(drug_order.getADMINISTRATION());
            // dose	药物剂量
            chemotherapy.setDose(drug_order.getDOSAGE());
            // unit	剂量单位
            chemotherapy.setUnit(drug_order.getDOSAGE_UNITS());
            // rate	用药频率
            chemotherapy.setRate(drug_order.getFREQUENCY());
            // start_date	用药开始日期
            chemotherapy.setStartDate(drug_order.getENTER_DATE_TIME());
            // end_date	用药结束日期
            chemotherapy.setEndDate(drug_order.getSTOP_ORDER_DATE_TIME());
            // data_version	数据版本
            chemotherapy.setDataVersion(drug_order.getDATA_VERSION());
            // data_db_source	数据库来源
            chemotherapy.setDataDbSource(drug_order.getDATA_DB_SOURCE());
            // data_table_source	数据表来源
            chemotherapy.setDataTableSource(drug_order.getDATA_TABLE_SOURCE());
            // data_field_source	数据项来源
            chemotherapy.setDataFieldSource(drug_order.getDATA_FIELD_SOURCE());
            // created_at	创建时间
            chemotherapy.setCreatedAt(drug_order.getCREATED_AT());
            // creator	创建人
            chemotherapy.setCreator(drug_order.getCREATOR());
            // updated_at	修改时间
            chemotherapy.setUpdatedAt(drug_order.getUPDATED_AT());
            chemotherapyService.saveChemotherapy(chemotherapy);
            log.info("保存化疗：" + chemotherapy.getUniqueId());
        }
    }

    /**
     * 术后恢复2 质检后修改的逻辑
     * @param zj_TEM_OPERATION_RECORD
     */
    public void savePostoperativeRecovery2(List<TEM_OPERATION_RECORD> zj_TEM_OPERATION_RECORD) {
        for (TEM_OPERATION_RECORD tem_operation_record : zj_TEM_OPERATION_RECORD
             ) {
            List<POSTOP_FUNCTION> postop_functionList = zjPostopFunctionMapper
                    .findZjPostopFunctionByUniqueId(tem_operation_record.getUNIQUE_ID_LV2());
            List<INP_ORDERS> inp_ordersList = zjInpOrdersMapper.findZjInpOrdersByUniqueId(tem_operation_record.getUNIQUE_ID_LV2());

            // time_out_of_bed	术后首次离床时间
            Date timeOutOfBed = null;
            for (POSTOP_FUNCTION postop_function : postop_functionList
                 ) {
                String neg_std = getStandardResultTextById(postop_function.getneg_std(), "afterType1",
                        "neg_std");
                String function_para_std = getStandardResultTextById(postop_function.getfunction_para_std(), "afterType1",
                        "function_para_std");
                if (StringUtils.isEmpty(neg_std)) {
                    if (function_para_std.indexOf("下床活动") != -1) {
                        if (postop_function.getdate_time_p() != null) {
                            timeOutOfBed = postop_function.getdate_time_p();
                            break;
                        } else {
                            timeOutOfBed = postop_function.getdate_time_estimate();
                            break;
                        }
                    }
                }
            }

            // exhaust_time	术后首次排气时间
            Date exhaustTime = null;
            for (POSTOP_FUNCTION postop_function : postop_functionList
                    ) {
                String neg_std = getStandardResultTextById(postop_function.getneg_std(), "afterType1",
                        "neg_std");
                String function_para_std = getStandardResultTextById(postop_function.getfunction_para_std(), "afterType1",
                        "function_para_std");
                if (StringUtils.isEmpty(neg_std)) {
                    if (function_para_std.indexOf("肛门排气") != -1 || function_para_std.indexOf("造口排气") != -1
                            || function_para_std.indexOf("回肠造瘘口排气") != -1) {
                        if (postop_function.getdate_time_p() != null) {
                            exhaustTime = postop_function.getdate_time_p();
                            break;
                        } else {
                            exhaustTime = postop_function.getdate_time_estimate();
                            break;
                        }
                    }
                }
            }

            // defecation_time	术后首次排便时间
            Date defecationTime = null;
            for (POSTOP_FUNCTION postop_function : postop_functionList
                    ) {
                String neg_std = getStandardResultTextById(postop_function.getneg_std(), "afterType1",
                        "neg_std");
                String function_para_std = getStandardResultTextById(postop_function.getfunction_para_std(), "afterType1",
                        "function_para_std");
                if (StringUtils.isEmpty(neg_std)) {
                    if (function_para_std.indexOf("肛门排便") != -1 || function_para_std.indexOf("造口排便") != -1) {
                        if (postop_function.getdate_time_p() != null) {
                            defecationTime = postop_function.getdate_time_p();
                            break;
                        } else {
                            defecationTime = postop_function.getdate_time_estimate();
                            break;
                        }
                    }
                }
            }

            // half_liquid_time	术后恢复半流食时间
            Date halfLiquidTime = null;
            for (POSTOP_FUNCTION postop_function : postop_functionList
                    ) {
                String neg_std = getStandardResultTextById(postop_function.getneg_std(), "afterType1",
                        "neg_std");
                String function_para_std = getStandardResultTextById(postop_function.getfunction_para_std(), "afterType1",
                        "function_para_std");
                if (StringUtils.isEmpty(neg_std)) {
                    if (function_para_std.indexOf("半流质饮食") != -1) {
                        if (postop_function.getdate_time_p() != null) {
                            halfLiquidTime = postop_function.getdate_time_p();
                            break;
                        } else {
                            halfLiquidTime = postop_function.getdate_time_estimate();
                            break;
                        }
                    }
                }
            }

            // liquid_time	术后恢复全流食时间
            Date liquidTime = null;
            for (POSTOP_FUNCTION postop_function : postop_functionList
                    ) {
                String neg_std = getStandardResultTextById(postop_function.getneg_std(), "afterType1",
                        "neg_std");
                String function_para_std = getStandardResultTextById(postop_function.getfunction_para_std(), "afterType1",
                        "function_para_std");
                if (StringUtils.isEmpty(neg_std)) {
                    if (function_para_std.indexOf("全流质饮食") != -1 || function_para_std.indexOf("进食") != -1) {
                        if (postop_function.getdate_time_p() != null) {
                            liquidTime = postop_function.getdate_time_p();
                            break;
                        } else {
                            liquidTime = postop_function.getdate_time_estimate();
                            break;
                        }
                    }
                }
            }

            // time_of_drainage_tube_removal	拔除最后一根引流管时间
            Date timeOfDrainageTubeRemoval = null;
            for (POSTOP_FUNCTION postop_function : postop_functionList
                    ) {
                String neg_std = getStandardResultTextById(postop_function.getneg_std(), "afterType1",
                        "neg_std");
                String function_para_std = getStandardResultTextById(postop_function.getfunction_para_std(), "afterType1",
                        "function_para_std");
                String modifier_std = getStandardResultTextById(postop_function.getmodifier_std(), "afterType1",
                        "modifier_std");
                if (StringUtils.isEmpty(neg_std)) {
                    if (function_para_std.indexOf("引流管") != -1 && modifier_std.indexOf("拔除") != -1) {
                        if (postop_function.getdate_time_p() != null) {
                            timeOfDrainageTubeRemoval = postop_function.getdate_time_p();
                            break;
                        } else {
                            timeOfDrainageTubeRemoval = postop_function.getdate_time_estimate();
                            break;
                        }
                    }
                }
            }

            // blood_after_operation	术后是否输血
            String bloodAfterOperation = null;
            String ORDER_TEXT_TEMP = null;
            String transfusionComponents = null;
            for (INP_ORDERS inp_orders : inp_ordersList
                 ) {
                String ORDER_CLASS = inp_orders.getORDER_CLASS();
                String ORDER_TEXT = inp_orders.getORDER_TEXT();
                if (StringUtils.isNotEmpty(ORDER_CLASS) && StringUtils.isNotEmpty(ORDER_TEXT)
                        && (ORDER_CLASS.indexOf("临时医嘱") != -1 || ORDER_CLASS.indexOf("临时") != -1)) {
                    Date ITEM_END_DATE = tem_operation_record.getITEM_END_DATE();
                    Date ENTER_DATE_TIME = inp_orders.getENTER_DATE_TIME();
                    if (ITEM_END_DATE != null && ENTER_DATE_TIME != null && ENTER_DATE_TIME.after(ITEM_END_DATE)) {
                        boolean flag = false;
                        if (ORDER_TEXT.indexOf("输血浆") != -1) {
                            flag = true;
                            transfusionComponents = "输血浆";
                        } else if (ORDER_TEXT.indexOf("输红细胞") != -1) {
                            flag = true;
                            transfusionComponents = "输红细胞";
                        } else if (ORDER_TEXT.indexOf("输血小板") != -1) {
                            flag = true;
                            transfusionComponents = "输血小板";
                        } else if (ORDER_TEXT.indexOf("输血") != -1) {
                            flag = true;
                            transfusionComponents = "输血";
                        } else if (ORDER_TEXT.indexOf("输冷沉淀") != -1) {
                            flag = true;
                            transfusionComponents = "输冷沉淀";
                        }
                        if (flag) {
                            ORDER_TEXT_TEMP = ORDER_TEXT;
                            bloodAfterOperation = "是";
                        }
                    }
                }
            }

            PostoperativeRecovery postoperativeRecovery = new PostoperativeRecovery();
            // unique_id	unique_id
            postoperativeRecovery.setUniqueId(tem_operation_record.getUNIQUE_ID());
            // unique_id_lv1	标识患者身份唯一标识
            postoperativeRecovery.setUniqueIdLv1(tem_operation_record.getUNIQUE_ID_LV1());
            // unique_id_lv2	唯一标识
            postoperativeRecovery.setUniqueIdLv2(tem_operation_record.getUNIQUE_ID_LV2());
            // p900	医疗机构代码
            postoperativeRecovery.setP900(tem_operation_record.getP900());
            // patient_id	患者id
            postoperativeRecovery.setPatientId(tem_operation_record.getPATIENT_ID());
            // visit_id	住院号
            postoperativeRecovery.setVisitId(tem_operation_record.getVISIT_ID());
            // time_out_of_bed	术后首次离床时间
            postoperativeRecovery.setTimeOutOfBed(timeOutOfBed);
            // first_time_out_of_bed	术后恢复至首次离床时长
            String firstTimeOutOfBed = null;
            if (postoperativeRecovery.getTimeOutOfBed() != null && tem_operation_record.getITEM_END_DATE() != null) {
                firstTimeOutOfBed = DateUtil.between(postoperativeRecovery.getTimeOutOfBed(),
                        tem_operation_record.getITEM_END_DATE(), DateUnit.HOUR) + "";
            }
            postoperativeRecovery.setFirstTimeOutOfBed(firstTimeOutOfBed);
            // exhaust_time	术后首次排气时间
            postoperativeRecovery.setExhaustTime(exhaustTime);
            // first_exhaust_time	术后恢复至首次排气时长
            String firstExhaustTime = null;
            if (postoperativeRecovery.getExhaustTime() != null && tem_operation_record.getITEM_END_DATE() != null) {
                firstExhaustTime = DateUtil.between(postoperativeRecovery.getExhaustTime(),
                        tem_operation_record.getITEM_END_DATE(), DateUnit.HOUR) + "";
            }
            postoperativeRecovery.setFirstExhaustTime(firstExhaustTime);
            // defecation_time	术后首次排便时间
            postoperativeRecovery.setDefecationTime(defecationTime);
            // first_defecation	术后恢复至首次排便时长
            String firstDefecation = null;
            if (postoperativeRecovery.getDefecationTime() != null && tem_operation_record.getITEM_END_DATE() != null) {
                firstDefecation = DateUtil.between(postoperativeRecovery.getDefecationTime(),
                        tem_operation_record.getITEM_END_DATE(), DateUnit.HOUR) + "";
            }
            postoperativeRecovery.setFirstDefecation(firstDefecation);
            // half_liquid_time	术后恢复半流食时间
            postoperativeRecovery.setHalfLiquidTime(halfLiquidTime);
            // semi_liquid_food	术后恢复至半流食时长
            String semiLiquidFood = null;
            if (postoperativeRecovery.getHalfLiquidTime() != null && tem_operation_record.getITEM_END_DATE() != null) {
                semiLiquidFood = DateUtil.between(postoperativeRecovery.getHalfLiquidTime(),
                        tem_operation_record.getITEM_END_DATE(), DateUnit.HOUR) + "";
            }
            postoperativeRecovery.setSemiLiquidFood(semiLiquidFood);
            // liquid_time	术后恢复全流食时间
            postoperativeRecovery.setLiquidTime(liquidTime);
            // liquid_food_duration	术后恢复至全流食时长
            String liquidFoodDuration = null;
            if (postoperativeRecovery.getLiquidTime() != null && tem_operation_record.getITEM_END_DATE() != null) {
                liquidFoodDuration = DateUtil.between(postoperativeRecovery.getLiquidTime(),
                        tem_operation_record.getITEM_END_DATE(), DateUnit.HOUR) + "";
            }
            postoperativeRecovery.setLiquidFoodDuration(liquidFoodDuration);
            // time_of_drainage_tube_removal	拔除最后一根引流管时间
            postoperativeRecovery.setTimeOfDrainageTubeRemoval(timeOfDrainageTubeRemoval);
            // duration_of_drainage_tube	术后留置引流管时长
            String durationOfDrainageTube = null;
            if (postoperativeRecovery.getTimeOfDrainageTubeRemoval() != null && tem_operation_record.getITEM_END_DATE() != null) {
                durationOfDrainageTube = DateUtil.between(postoperativeRecovery.getTimeOfDrainageTubeRemoval(),
                        tem_operation_record.getITEM_END_DATE(), DateUnit.HOUR) + "";
            }
            postoperativeRecovery.setDurationOfDrainageTube(durationOfDrainageTube);
            // blood_after_operation	术后是否输血
            postoperativeRecovery.setBloodAfterOperation(bloodAfterOperation);
            // transfusion	术后输血量
            String transfusionTemp = null;
            String transfusion = null;
            if (StringUtils.isNotEmpty(ORDER_TEXT_TEMP)) {
                Matcher matcher = Pattern.compile("(?<=\\()(\\S+)(?=\\))").matcher(ORDER_TEXT_TEMP);//此处是中文输入的（）
                while(matcher.find()){
                    transfusionTemp = matcher.group();
                }
                Matcher matcher2 = Pattern.compile("(?<=\\()(\\S+)(?=\\))").matcher(ORDER_TEXT_TEMP);//此处是英文输入的()
                while(matcher2.find()){
                    transfusionTemp = matcher2.group();
                }
                if (StringUtils.isNotEmpty(transfusionTemp) && (transfusionTemp.indexOf("单位") != -1
                        || transfusionTemp.indexOf("毫升") != -1 || transfusionTemp.indexOf("ml") != -1)) {
                    transfusion = transfusionTemp;
                }
            }
            postoperativeRecovery.setTransfusion(transfusion);
            // transfusion_components	术后输血成分
            postoperativeRecovery.setTransfusionComponents(transfusionComponents);
            // data_version	数据版本
            postoperativeRecovery.setDataVersion(tem_operation_record.getDATA_VERSION());
            // data_db_source	数据库来源
            postoperativeRecovery.setDataDbSource(tem_operation_record.getDATA_DB_SOURCE());
            // data_table_source	数据表来源
            postoperativeRecovery.setDataTableSource(tem_operation_record.getDATA_TABLE_SOURCE());
            // data_field_source	数据项来源
            postoperativeRecovery.setDataFieldSource(tem_operation_record.getDATA_FIELD_SOURCE());
            // created_at	创建时间
            postoperativeRecovery.setCreatedAt(tem_operation_record.getCREATED_AT());
            // creator	创建人
            postoperativeRecovery.setCreator(tem_operation_record.getCREATOR());
            // updated_at	修改时间
            postoperativeRecovery.setUpdatedAt(tem_operation_record.getUPDATED_AT());
            postoperativeRecoveryService.savePostoperativeRecovery(postoperativeRecovery);
            log.info("保存术后恢复：" + postoperativeRecovery.getUniqueId());
        }
    }

    /**
     * 术后恢复
     * @param zj_POSTOP_FUNCTION
     */
    public void savePostoperativeRecovery(List<POSTOP_FUNCTION> zj_POSTOP_FUNCTION) {
        for (POSTOP_FUNCTION postop_function : zj_POSTOP_FUNCTION
             ) {
            List<TEM_OPERATION_RECORD> tem_operation_recordList = zjTemOperationRecordMapper.
                    findZjTemOperationRecordByUniqueIdOrderByItemEndDate(postop_function.getunique_id_lv2());
            TEM_OPERATION_RECORD tem_operation_record = new TEM_OPERATION_RECORD();
            if (tem_operation_recordList != null && tem_operation_recordList.size() > 0) {
                tem_operation_record = tem_operation_recordList.get(0);
            }
            List<INP_ORDERS> inp_ordersList = zjInpOrdersMapper.findZjInpOrdersByUniqueIdOrderByEnterDateTime(postop_function.getunique_id_lv2());
            INP_ORDERS inp_orders = new INP_ORDERS();
            if (inp_ordersList != null && inp_ordersList.size() > 0) {
                inp_orders = inp_ordersList.get(0);
            }
            PostoperativeRecovery postoperativeRecovery = new PostoperativeRecovery();
            // unique_id	unique_id
            postoperativeRecovery.setUniqueId(postop_function.getunique_id());
            // unique_id_lv1	标识患者身份唯一标识
            postoperativeRecovery.setUniqueIdLv1(postop_function.getunique_id_lv1());
            // unique_id_lv2	唯一标识
            postoperativeRecovery.setUniqueIdLv2(postop_function.getunique_id_lv2());
            // p900	医疗机构代码
            postoperativeRecovery.setP900(postop_function.getp900());
            // patient_id	患者id
            postoperativeRecovery.setPatientId(postop_function.getpatient_id());
            // visit_id	住院号
            postoperativeRecovery.setVisitId(postop_function.getvisit_id());
            // time_out_of_bed	术后首次离床时间
            String neg_std = getStandardResultTextById(postop_function.getneg_std(), "afterType1",
                    "neg_std");
            String function_para_std = getStandardResultTextById(postop_function.getfunction_para_std(), "afterType1",
                    "function_para_std");
            Date timeOutOfBed = null;
            if (StringUtils.isEmpty(postop_function.getneg_std()) || StringUtils.isEmpty(neg_std)) {
                if (function_para_std.indexOf("下床活动") != -1) {
                    if (postop_function.getdate_time_p() != null) {
                        timeOutOfBed = postop_function.getdate_time_p();
                    } else {
                        timeOutOfBed = postop_function.getdate_time_estimate();
                    }
                }
            }
            postoperativeRecovery.setTimeOutOfBed(timeOutOfBed);
            // first_time_out_of_bed	术后恢复至首次离床时长
            String firstTimeOutOfBed = null;
            if (postoperativeRecovery.getTimeOutOfBed() != null && tem_operation_record.getITEM_END_DATE() != null) {
                firstTimeOutOfBed = DateUtil.between(postoperativeRecovery.getTimeOutOfBed(),
                        tem_operation_record.getITEM_END_DATE(), DateUnit.HOUR) + "";
            }
            postoperativeRecovery.setFirstTimeOutOfBed(firstTimeOutOfBed);
            // exhaust_time	术后首次排气时间
            Date exhaustTime = null;
            if (StringUtils.isEmpty(postop_function.getneg_std()) || StringUtils.isEmpty(neg_std)) {
                if (function_para_std.indexOf("肛门排气") != -1 || function_para_std.indexOf("造口排气") != -1
                        || function_para_std.indexOf("回肠造瘘口排气") != -1) {
                    if (postop_function.getdate_time_p() != null) {
                        exhaustTime = postop_function.getdate_time_p();
                    } else {
                        exhaustTime = postop_function.getdate_time_estimate();
                    }
                }
            }
            postoperativeRecovery.setExhaustTime(exhaustTime);
            // first_exhaust_time	术后恢复至首次排气时长
            String firstExhaustTime = null;
            if (postoperativeRecovery.getExhaustTime() != null && tem_operation_record.getITEM_END_DATE() != null) {
                firstExhaustTime = DateUtil.between(postoperativeRecovery.getExhaustTime(),
                        tem_operation_record.getITEM_END_DATE(), DateUnit.HOUR) + "";
            }
            postoperativeRecovery.setFirstExhaustTime(firstExhaustTime);
            // defecation_time	术后首次排便时间
            Date defecationTime = null;
            if (StringUtils.isEmpty(postop_function.getneg_std()) || StringUtils.isEmpty(neg_std)) {
                if (function_para_std.indexOf("肛门排便") != -1 || function_para_std.indexOf("造口排便") != -1) {
                    if (postop_function.getdate_time_p() != null) {
                        defecationTime = postop_function.getdate_time_p();
                    } else {
                        defecationTime = postop_function.getdate_time_estimate();
                    }
                }
            }
            postoperativeRecovery.setDefecationTime(defecationTime);
            // first_defecation	术后恢复至首次排便时长
            String firstDefecation = null;
            if (postoperativeRecovery.getDefecationTime() != null && tem_operation_record.getITEM_END_DATE() != null) {
                firstDefecation = DateUtil.between(postoperativeRecovery.getDefecationTime(),
                        tem_operation_record.getITEM_END_DATE(), DateUnit.HOUR) + "";
            }
            postoperativeRecovery.setFirstDefecation(firstDefecation);
            // half_liquid_time	术后恢复半流食时间
            Date halfLiquidTime = null;
            if (StringUtils.isEmpty(postop_function.getneg_std()) || StringUtils.isEmpty(neg_std)) {
                if (function_para_std.indexOf("半流质饮食") != -1) {
                    if (postop_function.getdate_time_p() != null) {
                        halfLiquidTime = postop_function.getdate_time_p();
                    } else {
                        halfLiquidTime = postop_function.getdate_time_estimate();
                    }
                }
            }
            postoperativeRecovery.setHalfLiquidTime(halfLiquidTime);
            // semi_liquid_food	术后恢复至半流食时长
            String semiLiquidFood = null;
            if (postoperativeRecovery.getHalfLiquidTime() != null && tem_operation_record.getITEM_END_DATE() != null) {
                semiLiquidFood = DateUtil.between(postoperativeRecovery.getHalfLiquidTime(),
                        tem_operation_record.getITEM_END_DATE(), DateUnit.HOUR) + "";
            }
            postoperativeRecovery.setSemiLiquidFood(semiLiquidFood);
            // liquid_time	术后恢复全流食时间
            Date liquidTime = null;
            if (StringUtils.isEmpty(postop_function.getneg_std()) || StringUtils.isEmpty(neg_std)) {
                if (function_para_std.indexOf("全流质饮食") != -1 || function_para_std.indexOf("进食") != -1) {
                    if (postop_function.getdate_time_p() != null) {
                        liquidTime = postop_function.getdate_time_p();
                    } else {
                        liquidTime = postop_function.getdate_time_estimate();
                    }
                }
            }
            postoperativeRecovery.setLiquidTime(liquidTime);
            // liquid_food_duration	术后恢复至全流食时长
            String liquidFoodDuration = null;
            if (postoperativeRecovery.getLiquidTime() != null && tem_operation_record.getITEM_END_DATE() != null) {
                liquidFoodDuration = DateUtil.between(postoperativeRecovery.getLiquidTime(),
                        tem_operation_record.getITEM_END_DATE(), DateUnit.HOUR) + "";
            }
            postoperativeRecovery.setLiquidFoodDuration(liquidFoodDuration);
            // time_of_drainage_tube_removal	拔除最后一根引流管时间
            String modifier_std = getStandardResultTextById(postop_function.getmodifier_std(), "afterType1",
                    "modifier_std");
            Date timeOfDrainageTubeRemoval = null;
            if (StringUtils.isEmpty(postop_function.getneg_std()) || StringUtils.isEmpty(neg_std)) {
                if (function_para_std.indexOf("引流管") != -1 && modifier_std.indexOf("拔除") != -1) {
                    if (postop_function.getdate_time_p() != null) {
                        timeOfDrainageTubeRemoval = postop_function.getdate_time_p();
                    } else {
                        timeOfDrainageTubeRemoval = postop_function.getdate_time_estimate();
                    }
                }
            }
            postoperativeRecovery.setTimeOfDrainageTubeRemoval(timeOfDrainageTubeRemoval);
            // duration_of_drainage_tube	术后留置引流管时长
            String durationOfDrainageTube = null;
            if (postoperativeRecovery.getTimeOfDrainageTubeRemoval() != null && tem_operation_record.getITEM_END_DATE() != null) {
                durationOfDrainageTube = DateUtil.between(postoperativeRecovery.getTimeOfDrainageTubeRemoval(),
                        tem_operation_record.getITEM_END_DATE(), DateUnit.HOUR) + "";
            }
            postoperativeRecovery.setDurationOfDrainageTube(durationOfDrainageTube);
            // blood_after_operation	术后是否输血
            String ORDER_CLASS = inp_orders.getORDER_CLASS();
            String ORDER_TEXT = inp_orders.getORDER_TEXT();
            String bloodAfterOperation = null;
            String ORDER_TEXT_TEMP = null;
            String transfusionComponents = null;
            if (StringUtils.isNotEmpty(ORDER_CLASS) && StringUtils.isNotEmpty(ORDER_TEXT)
                    && (ORDER_CLASS.indexOf("临时医嘱") != -1 || ORDER_CLASS.indexOf("临时") != -1)) {
                Date ITEM_END_DATE = tem_operation_record.getITEM_END_DATE();
                Date ENTER_DATE_TIME = inp_orders.getENTER_DATE_TIME();
                if (ITEM_END_DATE != null && ENTER_DATE_TIME != null && ENTER_DATE_TIME.after(ITEM_END_DATE)) {
                    boolean flag = false;
                    if (ORDER_TEXT.indexOf("输血浆") != -1) {
                        flag = true;
                        transfusionComponents = "输血浆";
                    } else if (ORDER_TEXT.indexOf("输红细胞") != -1) {
                        flag = true;
                        transfusionComponents = "输红细胞";
                    } else if (ORDER_TEXT.indexOf("输血小板") != -1) {
                        flag = true;
                        transfusionComponents = "输血小板";
                    } else if (ORDER_TEXT.indexOf("输血") != -1) {
                        flag = true;
                        transfusionComponents = "输血";
                    } else if (ORDER_TEXT.indexOf("输冷沉淀") != -1) {
                        flag = true;
                        transfusionComponents = "输冷沉淀";
                    }
                    if (flag) {
                        ORDER_TEXT_TEMP = ORDER_TEXT;
                        bloodAfterOperation = "是";
                    }
                }
            }
            postoperativeRecovery.setBloodAfterOperation(bloodAfterOperation);
            // transfusion	术后输血量
            String transfusionTemp = null;
            String transfusion = null;
            if (StringUtils.isNotEmpty(ORDER_TEXT_TEMP)) {
                Matcher matcher = Pattern.compile("(?<=\\()(\\S+)(?=\\))").matcher(ORDER_TEXT_TEMP);//此处是中文输入的（）
                while(matcher.find()){
                    transfusionTemp = matcher.group();
                }
                Matcher matcher2 = Pattern.compile("(?<=\\()(\\S+)(?=\\))").matcher(ORDER_TEXT_TEMP);//此处是英文输入的()
                while(matcher2.find()){
                    transfusionTemp = matcher2.group();
                }
                if (StringUtils.isNotEmpty(transfusionTemp) && (transfusionTemp.indexOf("单位") != -1
                        || transfusionTemp.indexOf("毫升") != -1 || transfusionTemp.indexOf("ml") != -1)) {
                    transfusion = transfusionTemp;
                }
            }
            postoperativeRecovery.setTransfusion(transfusion);
            // transfusion_components	术后输血成分
            postoperativeRecovery.setTransfusionComponents(transfusionComponents);
            // data_version	数据版本
            postoperativeRecovery.setDataVersion(postop_function.getdata_version());
            // data_db_source	数据库来源
            postoperativeRecovery.setDataDbSource(postop_function.getdata_db_source());
            // data_table_source	数据表来源
            postoperativeRecovery.setDataTableSource(postop_function.getdata_table_source());
            // data_field_source	数据项来源
            postoperativeRecovery.setDataFieldSource(postop_function.getdata_field_source());
            // created_at	创建时间
            postoperativeRecovery.setCreatedAt(postop_function.getcreate_time());
            // creator	创建人
            postoperativeRecovery.setCreator(postop_function.getcreator());
            // updated_at	修改时间
            postoperativeRecovery.setUpdatedAt(null);
            postoperativeRecoveryService.savePostoperativeRecovery(postoperativeRecovery);
            log.info("保存术后恢复：" + postoperativeRecovery.getUniqueId());
        }
    }

    /**
     * 手术并发症
     * @param zj_POSTOP_COMP
     */
    public void saveOperativeComplications(List<POSTOP_COMP> zj_POSTOP_COMP) {
        for (POSTOP_COMP postop_comp : zj_POSTOP_COMP
             ) {
            OperativeComplications operativeComplications = new OperativeComplications();
            // unique_id	unique_id
            operativeComplications.setUniqueId(postop_comp.getunique_id());
            // unique_id_lv1	标识患者身份唯一标识
            operativeComplications.setUniqueIdLv1(postop_comp.getunique_id_lv1());
            // unique_id_lv2	唯一标识
            operativeComplications.setUniqueIdLv2(postop_comp.getunique_id_lv2());
            // p900	医疗机构代码
            operativeComplications.setP900(postop_comp.getp900());
            // patient_id	患者id
            operativeComplications.setPatientId(postop_comp.getpatient_id());
            // visit_id	住院号
            operativeComplications.setVisitId(postop_comp.getvisit_id());
            // fat_liquefaction	脂肪液化
            String neg_std = getStandardResultTextById(postop_comp.getneg_std(), "afterType1",
                    "neg_std");
            String comp_std = getStandardResultTextById(postop_comp.getcomp_std(), "afterType1",
                    "comp_std");
            String fatLiquefaction = null;
            if (StringUtils.isEmpty(postop_comp.getneg_std()) || StringUtils.isEmpty(neg_std)) {
                if (comp_std.indexOf("脂肪液化") != -1) {
                    fatLiquefaction = "是";
                }
            }
            operativeComplications.setFatLiquefaction(fatLiquefaction);
            // septic_shock	感染性休克
            String septicShock = null;
            if (StringUtils.isEmpty(postop_comp.getneg_std()) || StringUtils.isEmpty(neg_std)) {
                if (comp_std.indexOf("感染性休克") != -1) {
                    septicShock = "是";
                }
            }
            operativeComplications.setSepticShock(septicShock);
            // hemorrhage	出血
            String hemorrhage = null;
            if (StringUtils.isEmpty(postop_comp.getneg_std()) || StringUtils.isEmpty(neg_std)) {
                if (comp_std.indexOf("出血") != -1) {
                    hemorrhage = "是";
                }
            }
            operativeComplications.setHemorrhage(hemorrhage);
            // anastomotic_bleeding	吻合口出血
            String anastomoticBleeding = null;
            if (StringUtils.isEmpty(postop_comp.getneg_std()) || StringUtils.isEmpty(neg_std)) {
                if (comp_std.indexOf("吻合口出血") != -1) {
                    anastomoticBleeding = "是";
                }
            }
            operativeComplications.setAnastomoticBleeding(anastomoticBleeding);
            // abdominal_hemorrhage	腹腔出血
            String abdominalHemorrhage = null;
            if (StringUtils.isEmpty(postop_comp.getneg_std()) || StringUtils.isEmpty(neg_std)) {
                if (comp_std.indexOf("腹腔出血") != -1) {
                    abdominalHemorrhage = "是";
                }
            }
            operativeComplications.setAbdominalHemorrhage(abdominalHemorrhage);
            // bile_leakage	胆漏
            String bileLeakage = null;
            if (StringUtils.isEmpty(postop_comp.getneg_std()) || StringUtils.isEmpty(neg_std)) {
                if (comp_std.indexOf("胆漏") != -1) {
                    bileLeakage = "是";
                }
            }
            operativeComplications.setBileLeakage(bileLeakage);
            // enterorrhea	肠漏
            String enterorrhea = null;
            if (StringUtils.isEmpty(postop_comp.getneg_std()) || StringUtils.isEmpty(neg_std)) {
                if (comp_std.indexOf("肠漏") != -1) {
                    enterorrhea = "是";
                }
            }
            operativeComplications.setEnterorrhea(enterorrhea);
            // pulmonary_infection	肺部感染
            String pulmonaryInfection = null;
            if (StringUtils.isEmpty(postop_comp.getneg_std()) || StringUtils.isEmpty(neg_std)) {
                if (comp_std.indexOf("肺部感染") != -1) {
                    pulmonaryInfection = "是";
                }
            }
            operativeComplications.setPulmonaryInfection(pulmonaryInfection);
            // respiratory_failure	呼吸衰竭
            String respiratoryFailure = null;
            if (StringUtils.isEmpty(postop_comp.getneg_std()) || StringUtils.isEmpty(neg_std)) {
                if (comp_std.indexOf("呼吸衰竭") != -1) {
                    respiratoryFailure = "是";
                }
            }
            operativeComplications.setRespiratoryFailure(respiratoryFailure);
            // heart_failure	心力衰竭
            String heartFailure = null;
            if (StringUtils.isEmpty(postop_comp.getneg_std()) || StringUtils.isEmpty(neg_std)) {
                if (comp_std.indexOf("心力衰竭") != -1) {
                    heartFailure = "是";
                }
            }
            operativeComplications.setHeartFailure(heartFailure);
            // deep_venous_thrombosis	深静脉血栓
            String deepVenousThrombosis = null;
            if (StringUtils.isEmpty(postop_comp.getneg_std()) || StringUtils.isEmpty(neg_std)) {
                if (comp_std.indexOf("深静脉血栓") != -1) {
                    deepVenousThrombosis = "是";
                }
            }
            operativeComplications.setDeepVenousThrombosis(deepVenousThrombosis);
            // atelectasis	肺不张
            String atelectasis = null;
            if (StringUtils.isEmpty(postop_comp.getneg_std()) || StringUtils.isEmpty(neg_std)) {
                if (comp_std.indexOf("肺不张") != -1) {
                    atelectasis = "是";
                }
            }
            operativeComplications.setAtelectasis(atelectasis);
            // anastomotic_leakage	吻合口瘘
            String anastomoticLeakage = null;
            if (StringUtils.isEmpty(postop_comp.getneg_std()) || StringUtils.isEmpty(neg_std)) {
                if (comp_std.indexOf("吻合口瘘") != -1) {
                    anastomoticLeakage = "是";
                }
            }
            operativeComplications.setAnastomoticLeakage(anastomoticLeakage);
            // peritonitis	腹膜炎
            String peritonitis = null;
            if (StringUtils.isEmpty(postop_comp.getneg_std()) || StringUtils.isEmpty(neg_std)) {
                if (comp_std.indexOf("腹膜炎") != -1) {
                    peritonitis = "是";
                }
            }
            operativeComplications.setPeritonitis(peritonitis);
            // urinary_tract_infection	泌尿系感染
            String urinaryTractInfection = null;
            if (StringUtils.isEmpty(postop_comp.getneg_std()) || StringUtils.isEmpty(neg_std)) {
                if (comp_std.indexOf("泌尿系感染") != -1) {
                    urinaryTractInfection = "是";
                }
            }
            operativeComplications.setUrinaryTractInfection(urinaryTractInfection);
            // intestinal_obstruction	肠梗阻
            String intestinalObstruction = null;
            if (StringUtils.isEmpty(postop_comp.getneg_std()) || StringUtils.isEmpty(neg_std)) {
                if (comp_std.indexOf("肠梗阻") != -1) {
                    intestinalObstruction = "是";
                }
            }
            operativeComplications.setIntestinalObstruction(intestinalObstruction);
            // urinary_retention	尿潴留
            String urinaryRetention = null;
            if (StringUtils.isEmpty(postop_comp.getneg_std()) || StringUtils.isEmpty(neg_std)) {
                if (comp_std.indexOf("尿潴留") != -1) {
                    urinaryRetention = "是";
                }
            }
            operativeComplications.setUrinaryRetention(urinaryRetention);
            // gastrointestinal_bleeding	消化道出血
            String gastrointestinalBleeding = null;
            if (StringUtils.isEmpty(postop_comp.getneg_std()) || StringUtils.isEmpty(neg_std)) {
                if (comp_std.indexOf("消化道出血") != -1) {
                    gastrointestinalBleeding = "是";
                }
            }
            operativeComplications.setGastrointestinalBleeding(gastrointestinalBleeding);
            // abdominal_infection	腹腔感染
            String abdominalInfection = null;
            if (StringUtils.isEmpty(postop_comp.getneg_std()) || StringUtils.isEmpty(neg_std)) {
                if (comp_std.indexOf("腹腔感染") != -1) {
                    abdominalInfection = "是";
                }
            }
            operativeComplications.setAbdominalInfection(abdominalInfection);
            // cardiovascular_and_cerebrovascular_accident	心脑血管意外
            String cardiovascularAndCerebrovascularAccident = null;
            if (StringUtils.isEmpty(postop_comp.getneg_std()) || StringUtils.isEmpty(neg_std)) {
                if (comp_std.indexOf("心脑血管意外") != -1) {
                    cardiovascularAndCerebrovascularAccident = "是";
                }
            }
            operativeComplications.setCardiovascularAndCerebrovascularAccident(cardiovascularAndCerebrovascularAccident);
            // pulmonary_embolism	肺栓塞
            String pulmonaryEmbolism = null;
            if (StringUtils.isEmpty(postop_comp.getneg_std()) || StringUtils.isEmpty(neg_std)) {
                if (comp_std.indexOf("肺栓塞") != -1) {
                    pulmonaryEmbolism = "是";
                }
            }
            operativeComplications.setPulmonaryEmbolism(pulmonaryEmbolism);
            // incision_infection	切口感染
            String incisionInfection = null;
            if (StringUtils.isEmpty(postop_comp.getneg_std()) || StringUtils.isEmpty(neg_std)) {
                if (comp_std.indexOf("切口感染") != -1) {
                    incisionInfection = "是";
                }
            }
            operativeComplications.setIncisionInfection(incisionInfection);
            // gastrointestinal_perforation	消化道穿孔
            String gastrointestinalPerforation = null;
            if (StringUtils.isEmpty(postop_comp.getneg_std()) || StringUtils.isEmpty(neg_std)) {
                if (comp_std.indexOf("消化道穿孔") != -1) {
                    gastrointestinalPerforation = "是";
                }
            }
            operativeComplications.setGastrointestinalPerforation(gastrointestinalPerforation);
            // ascites	腹腔积液
            String ascites = null;
            if (StringUtils.isEmpty(postop_comp.getneg_std()) || StringUtils.isEmpty(neg_std)) {
                if (comp_std.indexOf("腹腔积液") != -1) {
                    ascites = "是";
                }
            }
            operativeComplications.setAscites(ascites);
            // lymphatic_fistula	淋巴瘘
            String lymphaticFistula = null;
            if (StringUtils.isEmpty(postop_comp.getneg_std()) || StringUtils.isEmpty(neg_std)) {
                if (comp_std.indexOf("淋巴瘘") != -1) {
                    lymphaticFistula = "是";
                }
            }
            operativeComplications.setLymphaticFistula(lymphaticFistula);
            // ketoacidosis	酮症酸中毒
            String ketoacidosis = null;
            if (StringUtils.isEmpty(postop_comp.getneg_std()) || StringUtils.isEmpty(neg_std)) {
                if (comp_std.indexOf("酮症酸中毒") != -1) {
                    ketoacidosis = "是";
                }
            }
            operativeComplications.setKetoacidosis(ketoacidosis);
            // anastomotic_stenosis	吻合口狭窄
            String anastomoticStenosis = null;
            if (StringUtils.isEmpty(postop_comp.getneg_std()) || StringUtils.isEmpty(neg_std)) {
                if (comp_std.indexOf("吻合口狭窄") != -1) {
                    anastomoticStenosis = "是";
                }
            }
            operativeComplications.setAnastomoticStenosis(anastomoticStenosis);
            // renal_failure	肾功能衰竭
            String renalFailure = null;
            if (StringUtils.isEmpty(postop_comp.getneg_std()) || StringUtils.isEmpty(neg_std)) {
                if (comp_std.indexOf("肾功能衰竭") != -1) {
                    renalFailure = "是";
                }
            }
            operativeComplications.setRenalFailure(renalFailure);
            // systemic_multiple_organ_failure	全身多器官功能衰竭
            String systemicMultipleOrganFailure = null;
            if (StringUtils.isEmpty(postop_comp.getneg_std()) || StringUtils.isEmpty(neg_std)) {
                if (comp_std.indexOf("全身多器官功能衰竭") != -1) {
                    systemicMultipleOrganFailure = "是";
                }
            }
            operativeComplications.setSystemicMultipleOrganFailure(systemicMultipleOrganFailure);
            // liver_dysfunction	肝功能不全
            String liverDysfunction = null;
            if (StringUtils.isEmpty(postop_comp.getneg_std()) || StringUtils.isEmpty(neg_std)) {
                if (comp_std.indexOf("肝功能不全") != -1) {
                    liverDysfunction = "是";
                }
            }
            operativeComplications.setLiverDysfunction(liverDysfunction);
            // liver_failure	肝功能衰竭
            String liverFailure = null;
            if (StringUtils.isEmpty(postop_comp.getneg_std()) || StringUtils.isEmpty(neg_std)) {
                if (comp_std.indexOf("肝功能衰竭") != -1) {
                    liverFailure = "是";
                }
            }
            operativeComplications.setLiverFailure(liverFailure);
            // intraperitoneal_hemorrhage	腹腔内出血
            String intraperitonealHemorrhage = null;
            if (StringUtils.isEmpty(postop_comp.getneg_std()) || StringUtils.isEmpty(neg_std)) {
                if (comp_std.indexOf("腹腔内出血") != -1) {
                    intraperitonealHemorrhage = "是";
                }
            }
            operativeComplications.setIntraperitonealHemorrhage(intraperitonealHemorrhage);
            // pancreatitis	胰腺炎
            String pancreatitis = null;
            if (StringUtils.isEmpty(postop_comp.getneg_std()) || StringUtils.isEmpty(neg_std)) {
                if (comp_std.indexOf("胰腺炎") != -1) {
                    pancreatitis = "是";
                }
            }
            operativeComplications.setPancreatitis(pancreatitis);
            // data_version	数据版本
            operativeComplications.setDataVersion(postop_comp.getdata_version());
            // data_db_source	数据库来源
            operativeComplications.setDataDbSource(postop_comp.getdata_db_source());
            // data_table_source	数据表来源
            operativeComplications.setDataTableSource(postop_comp.getdata_table_source());
            // data_field_source	数据项来源
            operativeComplications.setDataFieldSource(postop_comp.getdata_field_source());
            // created_at	创建时间
            operativeComplications.setCreatedAt(postop_comp.getcreate_time());
            // creator	创建人
            operativeComplications.setCreator(postop_comp.getcreator());
            // updated_at	修改时间
            operativeComplications.setUpdatedAt(null);
            operativeComplicationsService.saveOperativeComplications(operativeComplications);
            log.info("保存手术并发症：" + operativeComplications.getUniqueId());
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
            // 处理数据中带有“/”的数据值，值为null
            String clinicalDiagnosis = histology_report.getCLINICAL_DIAGNOSIS();
            if ("/".equals(clinicalDiagnosis)) {
                clinicalDiagnosis = null;
            }
            histologyReport.setClinicalDiagnosis(clinicalDiagnosis);
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
            histologyReportService.saveHistologyReport(histologyReport);
            log.info("保存病理报告原文：" + histologyReport.getUniqueId());
        }
    }

    /**
     * 病理检查结论
     * @param zj_PATHOLOGY
     */
    public void savePathological(List<PATHOLOGY> zj_PATHOLOGY) {
        for (PATHOLOGY pathology : zj_PATHOLOGY
             ) {
            HISTOLOGY_REPORT histology_report = null;
            List<HISTOLOGY_REPORT> histology_reportList = zjHistologyReportMapper.findZjHistologyReportByUniqueId2(pathology.getunique_id());
            if(histology_reportList != null && histology_reportList.size() > 0) {
                histology_report = histology_reportList.get(0);
            } else {
                histology_report = new HISTOLOGY_REPORT();
            }
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
            pathological.setSpecimenName(getStandardResultTextById(pathology.getstructure_std(), "afterType1",
                    "/", ";"));
            // pathological_type	病理类型
            pathological.setPathologicalType(getStandardResultTextById(pathology.getfeature_std(), "afterType1",
                    "feature_type_std"));
            // organization_classification	组织分级（G）
            pathological.setOrganizationClassification(getStandardResultTextById(pathology.getfeature_std(), "afterType1",
                    "feature_differ_std"));
            // incisal_margin	切缘
            String structure_type_std = getStandardResultTextById(pathology.getstructure_std(), "afterType1",
                    "structure_type_std");
            String finding_result_std = getStandardResultTextById(pathology.getfinding_std(), "afterType1",
                    "finding_result_std");
            String neg_std = getStandardResultTextById(pathology.getneg_std(), "afterType1",
                    "neg_std");
            String incisalMargin = null;
            if (structure_type_std.indexOf("切缘") != -1 && finding_result_std.indexOf("癌") != -1) {
                if (StringUtils.isNotEmpty(neg_std)) {
                    incisalMargin = "阴性";
                } else {
                    incisalMargin = "阳性";
                }
            }
            pathological.setIncisalMargin(incisalMargin);
            // infiltration_layer	肠壁浸润层次
            pathological.setInfiltrationLayer(getStandardResultTextById(pathology.getinvasion_std(), "afterType1",
                    "/", ";"));
            // invasion_of_organs	侵犯邻近器官/结构
            String invasion_structure_std = getStandardResultTextById(pathology.getinvasion_std(), "afterType1",
                    "invasion_structure_std");
            String invasion_site_std = getStandardResultTextById(pathology.getinvasion_std(), "afterType1",
                    "invasion_site_std");
            String invasionOfOrgans = null;
            if (invasion_site_std.indexOf("肠") == -1 && invasion_site_std.indexOf("神经") == -1
                    && invasion_site_std.indexOf("脉管") == -1 && invasion_site_std.indexOf("血管") == -1) {
                if (StringUtils.isNotEmpty(invasion_structure_std)) {
                    invasionOfOrgans = invasion_structure_std + "/" + invasion_site_std;
                } else {
                    invasionOfOrgans = invasion_site_std;
                }
            }
            pathological.setInvasionOfOrgans(invasionOfOrgans);
            // vascular_invasion	是否有脉管侵犯
            String vascularInvasion = null;
            if (invasion_site_std.indexOf("脉管") != -1 || invasion_site_std.indexOf("血管") != -1
                    || invasion_site_std.indexOf("淋巴管") != -1) {
                vascularInvasion = "阳性";
            }
            pathological.setVascularInvasion(vascularInvasion);
            // nerve_invasion	是否侵犯神经
            String nerveInvasion = null;
            if (invasion_site_std.indexOf("神经") != -1) {
                nerveInvasion = "是";
            }
            pathological.setNerveInvasion(nerveInvasion);
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
            pathologicalService.savePathological(pathological);
            log.info("保存病理检查结论：" + pathological.getUniqueId());
        }
    }

    /**
     * 病理检查肉眼
     * @param zj_PATHOLOGY_EYE
     */
    public void savePathologicalEye(List<PATHOLOGY_EYE> zj_PATHOLOGY_EYE) {
        for (PATHOLOGY_EYE pathology_eye : zj_PATHOLOGY_EYE
             ) {
            HISTOLOGY_REPORT histology_report = null;
            List<HISTOLOGY_REPORT> histology_reportList = zjHistologyReportMapper.findZjHistologyReportByUniqueId2(pathology_eye.getunique_id());
            if(histology_reportList != null && histology_reportList.size() > 0) {
                histology_report = histology_reportList.get(0);
            } else {
                histology_report = new HISTOLOGY_REPORT();
            }
            PathologicalEye pathologicalEye = new PathologicalEye();
            // unique_id	unique_id
            pathologicalEye.setUniqueId(pathology_eye.getunique_id());
            // unique_id_lv1	标识患者身份唯一标识
            pathologicalEye.setUniqueIdLv1(pathology_eye.getunique_id_lv1());
            // unique_id_lv2	唯一标识
            pathologicalEye.setUniqueIdLv2(pathology_eye.getunique_id_lv2());
            // p900	医疗机构代码
            pathologicalEye.setP900(pathology_eye.getp900());
            // patient_id	患者id
            pathologicalEye.setPatientId(pathology_eye.getpatient_id());
            // visit_id	住院号
            pathologicalEye.setVisitId(pathology_eye.getvisit_id());
            // case_number	病理号
            pathologicalEye.setCaseNumber(histology_report.getPATHOLOGY_NO());
            // inspect_time	收到日期
            pathologicalEye.setInspectTime(histology_report.getSPECIMEN_RECEIVING_TIME());
            // reprot_time	报告日期
            pathologicalEye.setReprotTime(histology_report.getREPORT_TIME());
            // tumor_location	肿瘤部位
            pathologicalEye.setTumorLocation(getStandardResultTextById(pathology_eye.getstructure_std(), "afterType1",
                    "/", ";"));
            // tumor_size	肿瘤大小
            pathologicalEye.setTumorSize(getStandardResultTextById(pathology_eye.getsize_std(), "afterType1",
                    "/", ";"));
            // number_of_lesions	病灶数量
            pathologicalEye.setNumberOfLesions(getStandardResultTextById(pathology_eye.getquantity_std(), "afterType1",
                    "quantity_std"));
            // lesion_morphology	病灶形态
            pathologicalEye.setLesionMorphology(getStandardResultTextById(pathology_eye.getlesion_std(), "afterType1",
                    "/", ";"));
            // cutting_edge_distance	切缘距离
            pathologicalEye.setCuttingEdgeDistance(getStandardResultTextById(pathology_eye.getedge_distance_std(), "afterType1",
                    "edge_distance_std"));
            // data_version	数据版本
            pathologicalEye.setDataVersion(pathology_eye.getdata_version());
            // data_db_source	数据库来源
            pathologicalEye.setDataDbSource(pathology_eye.getdata_db_source());
            // data_table_source	数据表来源
            pathologicalEye.setDataTableSource(pathology_eye.getdata_table_source());
            // data_field_source	数据项来源
            pathologicalEye.setDataFieldSource(pathology_eye.getdata_field_source());
            // created_at	创建时间
            pathologicalEye.setCreatedAt(pathology_eye.getcreate_time());
            // creator	创建人
            pathologicalEye.setCreator(pathology_eye.getcreator());
            // updated_at	修改时间
            pathologicalEye.setUpdatedAt(histology_report.getUPDATED_AT());
            pathologicalEyeService.savePathologicalEye(pathologicalEye);
            log.info("保存病理检查肉眼：" + pathologicalEye.getUniqueId());
        }
    }

    /**
     * 病理检查-淋巴结
     * @param zj_PATHOLOGY_LN
     */
    public void savePathologicalIn(List<PATHOLOGY_LN> zj_PATHOLOGY_LN) {
        for ( PATHOLOGY_LN pathology_ln : zj_PATHOLOGY_LN
             ) {
            HISTOLOGY_REPORT histology_report = null;
            List<HISTOLOGY_REPORT> histology_reportList = zjHistologyReportMapper.findZjHistologyReportByUniqueId2(pathology_ln.getunique_id());
            if(histology_reportList != null && histology_reportList.size() > 0) {
                histology_report = histology_reportList.get(0);
            } else {
                histology_report = new HISTOLOGY_REPORT();
            }
            PathologicalLn pathologicalLn = new PathologicalLn();
            // unique_id	unique_id
            pathologicalLn.setUniqueId(pathology_ln.getunique_id());
            // unique_id_lv1	标识患者身份唯一标识
            pathologicalLn.setUniqueIdLv1(pathology_ln.getunique_id_lv1());
            // unique_id_lv2	唯一标识
            pathologicalLn.setUniqueIdLv2(pathology_ln.getunique_id_lv2());
            // p900	医疗机构代码
            pathologicalLn.setP900(pathology_ln.getp900());
            // patient_id	患者id
            pathologicalLn.setPatientId(pathology_ln.getpatient_id());
            // visit_id	住院号
            pathologicalLn.setVisitId(pathology_ln.getvisit_id());
            // case_number	病理号
            pathologicalLn.setCaseNumber(histology_report.getPATHOLOGY_NO());
            // inspect_time	收到日期
            pathologicalLn.setInspectTime(histology_report.getSPECIMEN_RECEIVING_TIME());
            // reprot_time	报告日期
            pathologicalLn.setReprotTime(histology_report.getREPORT_TIME());
            // lymph_total	送检淋巴结总数
            String quantity_total_std = getStandardResultTextById(pathology_ln.getquantity_std(), "afterType1",
                    "quantity_total_std");
            String[] quantity_total_std_split = quantity_total_std.split(",");
            Integer lymphTotal = 0;
            for (String total : quantity_total_std_split
                 ) {
                try {
                    lymphTotal += Integer.valueOf(total);
                } catch (NumberFormatException e) {
                    e.getStackTrace();
                }
            }
            pathologicalLn.setLymphTotal(String.valueOf(lymphTotal));
            // lymph_number	淋巴结转移数量
            String quantity_positive_std = getStandardResultTextById(pathology_ln.getquantity_std(), "afterType1",
                    "quantity_positive_std");
            String[] quantity_positive_std_split = quantity_positive_std.split(",");
            Integer lymphNumber = 0;
            for (String positive : quantity_positive_std_split
                 ) {
                try {
                    lymphNumber += Integer.valueOf(positive);
                } catch (NumberFormatException e) {
                    e.getStackTrace();
                }
            }
            pathologicalLn.setLymphNumber(String.valueOf(lymphNumber));
            // data_version	数据版本
            pathologicalLn.setDataVersion(pathology_ln.getdata_version());
            // data_db_source	数据库来源
            pathologicalLn.setDataDbSource(pathology_ln.getdata_db_source());
            // data_table_source	数据表来源
            pathologicalLn.setDataTableSource(pathology_ln.getdata_table_source());
            // data_field_source	数据项来源
            pathologicalLn.setDataFieldSource(pathology_ln.getdata_field_source());
            // created_at	创建时间
            pathologicalLn.setCreatedAt(pathology_ln.getcreate_time());
            // creator	创建人
            pathologicalLn.setCreator(pathology_ln.getcreator());
            // updated_at	修改时间
            pathologicalLn.setUpdatedAt(histology_report.getUPDATED_AT());
            pathologicalLnService.savePathologicalLn(pathologicalLn);
            log.info("保存病理检查-淋巴结：" + pathologicalLn.getUniqueId());
        }
    }

    /**
     * 免疫组化标志物
     */
    public void saveImmune(List<IHC_MARKER> zj_IHC_MARKER) {
        for (IHC_MARKER ihc_marker : zj_IHC_MARKER
                ) {
            HISTOLOGY_REPORT histology_report = null;
            List<HISTOLOGY_REPORT> histology_reportList = zjHistologyReportMapper.findZjHistologyReportByUniqueId2(ihc_marker.getunique_id());
            if(histology_reportList != null && histology_reportList.size() > 0) {
                histology_report = histology_reportList.get(0);
            } else {
                histology_report = new HISTOLOGY_REPORT();
            }
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
     * 放疗
     * @param zj_radiotherapy
     */
    public void saveRadiotherapy(List<RADIOTHERAPY>  zj_radiotherapy){
        for (RADIOTHERAPY rADIOTHERAPY : zj_radiotherapy
             ) {
            Radiotherapy radiotherapy = new Radiotherapy();
            // unique_id	unique_id
            radiotherapy.setUniqueId(rADIOTHERAPY.getunique_id());
            // unique_id_lv1	标识患者身份唯一标识
            radiotherapy.setUniqueIdLv1(rADIOTHERAPY.getunique_id_lv1());
            // unique_id_lv2	唯一标识
            radiotherapy.setUniqueIdLv2(rADIOTHERAPY.getunique_id_lv2());
            // p900	医疗机构代码
            radiotherapy.setP900(rADIOTHERAPY.getp900());
            // patient_id	患者id
            radiotherapy.setPatientId(rADIOTHERAPY.getpatient_id());
            // visit_id	住院号
            radiotherapy.setVisitId(rADIOTHERAPY.getvisit_id());
            // radio_begin_time	放疗开始日期
            String modifier_std = getStandardResultTextById(rADIOTHERAPY.getmodifier_std(), "afterType1",
                    "modifier_std");
            Date radioBeginTime = null;
            Date radioEndTime = null;
            if (modifier_std.indexOf("开始") != -1) {
                if (rADIOTHERAPY.getdate_time_p() != null) {
                    radioBeginTime = rADIOTHERAPY.getdate_time_p();
                } else {
                    radioBeginTime = rADIOTHERAPY.getdate_time_estimate();
                }
            }
            if (modifier_std.indexOf("已行") != -1) {
                if (rADIOTHERAPY.getdate_time_p() != null) {
                    radioEndTime = rADIOTHERAPY.getdate_time_p();
                } else {
                    radioEndTime = rADIOTHERAPY.getdate_time_estimate();
                }
            }
            radiotherapy.setRadioBeginTime(radioBeginTime);
            // radio_end_time	放疗结束日期
            radiotherapy.setRadioEndTime(radioEndTime);
            // purpose	放疗目的
            radiotherapy.setPurpose(getStandardResultTextById(rADIOTHERAPY.getpurpose_std(), "afterType1",
                    "purpose_std"));
            // site	放疗部位
            String site = getStructureStd(rADIOTHERAPY.getstructure_std());
            if (StringUtils.isNotEmpty(site) && "无效".equals(site)) {
                site = null;
            }
            radiotherapy.setSite(site);
            // site_type	放疗部位类型
            radiotherapy.setSiteType(getStandardResultTextById(rADIOTHERAPY.getstructure_std(), "afterType1",
                    "structure_lesion_std"));
            // target_site	靶区部位
            radiotherapy.setTargetSite(getStandardResultTextById(rADIOTHERAPY.getstructure_std(), "afterType1",
                    "structure_tv_std"));
            // way	放疗方式
            radiotherapy.setWay(getStandardResultTextById(rADIOTHERAPY.gettreatment_std(), "afterType1",
                    "treatment_std"));
            // ray_type	射线类型    ** 无此字段
            radiotherapy.setRayType(null);
            // total_dose	放疗总量
            String dose_type_std = getStandardResultTextById(rADIOTHERAPY.getdose_type_std(), "afterType1",
                    "dose_type_std");
            String para_value_std = getStandardResultTextById(rADIOTHERAPY.getpara_value_std(), "afterType1",
                    "para_value_std");
            String para_value_freq_std = getStandardResultTextById(rADIOTHERAPY.getpara_value_std(), "afterType1",
                    "para_value_freq_std");
            String para_value_freq_unit_std = getStandardResultTextById(rADIOTHERAPY.getpara_value_std(), "afterType1",
                    "para_value_freq_unit_std");
            Double totalDose = null;
            Double singleDose = null;
            String radioNumber = null;
            if (dose_type_std.indexOf("照射剂量") != -1 || dose_type_std.indexOf("总剂量") != -1
                    || dose_type_std.indexOf("治疗剂量") != -1 || dose_type_std.indexOf("放疗剂量") != -1) {
                try {
                    totalDose = Double.valueOf(para_value_std);
                } catch (NumberFormatException e) {
                    totalDose = null;
                }
                try {
                    singleDose = Double.valueOf(String.format("%.1f", Double.valueOf(para_value_std) / Double.valueOf(para_value_freq_std)));
                } catch (NumberFormatException e) {
                    singleDose = null;
                }
                radioNumber = para_value_freq_std + para_value_freq_unit_std;
            }
            radiotherapy.setTotalDose(totalDose);
            // single_dose	放疗单次剂量
            radiotherapy.setSingleDose(singleDose);
            // radio_number	放疗次数
            radiotherapy.setRadioNumber(radioNumber);
            // prescript_radio_total	处方放疗总量
            String prescriptRadioTotal = null;
            String prescriptRadioSingle = null;
            String prescriptRadioNumber = null;
            if (dose_type_std.indexOf("计划剂量") != -1 || dose_type_std.indexOf("处方剂量") != -1) {
                prescriptRadioTotal = para_value_std;
                try {
                    prescriptRadioSingle = String.format("%.1f", Double.valueOf(para_value_std) / Double.valueOf(para_value_freq_std));
                } catch (NumberFormatException e) {
                    prescriptRadioSingle = null;
                }
                prescriptRadioNumber = para_value_freq_std + para_value_freq_unit_std;
            }
            radiotherapy.setPrescriptRadioTotal(prescriptRadioTotal);
            // prescript_radio_single	处方放疗单次剂量
            radiotherapy.setPrescriptRadioSingle(prescriptRadioSingle);
            // prescript_radio_number	处方放疗次数
            radiotherapy.setPrescriptRadioNumber(prescriptRadioNumber);
            // data_version	数据版本
            radiotherapy.setDataVersion(rADIOTHERAPY.getdata_version());
            // data_db_source	数据库来源
            radiotherapy.setDataDbSource(rADIOTHERAPY.getdata_db_source());
            // data_table_source	数据表来源
            radiotherapy.setDataTableSource(rADIOTHERAPY.getdata_table_source());
            // data_field_source	数据项来源
            radiotherapy.setDataFieldSource(rADIOTHERAPY.getdata_field_source());
            // created_at	创建时间
            radiotherapy.setCreatedAt(rADIOTHERAPY.getcreate_time());
            // creator	创建人
            radiotherapy.setCreator(rADIOTHERAPY.getcreator());
            //updated_at	修改时间
            radiotherapy.setUpdatedAt(null);
            radiotherapyService.saveRadiotherapy(radiotherapy);
            log.info("保存放疗：" + radiotherapy.getUniqueId());
        }
    }

    /**
     * 放疗部位
     * @param standardTableId
     * @return
     */
    public String getStructureStd(String standardTableId) {
        String resultJson = standardResultMapper.selectStandardResultById(standardTableId);
        return JSONUtils.structureStd(resultJson);
    }

    public String getIhcMarkerMarkerQualita(String standardTableId) {
        String resultJson = standardResultMapper.selectStandardResultById(standardTableId);
        return JSONUtils.ihcMarkerMarkerQualita(resultJson);
    }

    public String getStandardResultTextById(String standardTableId, String arrayField, String stdField) {
        String resultJson = standardResultMapper.selectStandardResultById(standardTableId);
        return JSONUtils.getDuplicatedConcatOne(resultJson, arrayField, stdField);
    }

    public String getStandardResultTextById(String standardTableId, String arrayField, String fieldSeparate, String objSeparate) {
        String resultJson = standardResultMapper.selectStandardResultById(standardTableId);
        return JSONUtils.getAllFieldGroupByObj(resultJson, arrayField, fieldSeparate, objSeparate);
    }

}