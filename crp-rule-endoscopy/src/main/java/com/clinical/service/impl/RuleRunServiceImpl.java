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

import java.util.*;


@Service
public class RuleRunServiceImpl implements RuleRunService {

    private final Logger log= LoggerFactory.getLogger(RuleRunServiceImpl.class);

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
     * 医嘱用药
     */
    @Autowired
    ZjDrugOrderMapper zjDrugOrderMapper;
    /**
     * 医嘱用药
     */
    @Autowired
    DurgOrderService durgOrderService;

    /**
     * 手术信息
     */
    @Autowired
    ZjTemOperationRecordMapper    zjTemOperationRecordMapper;
    /**
     * 手术信息
     */
    @Autowired
    TemOperationRecordService temOperationRecordService;

    /**
     * PetCt描述
     */
    @Autowired
    ZjPetCtDescriptionMapper zjPetCtDescriptionMapper;
    /**
     * PetCt描述
     */
    @Autowired
    PetCtDesService petCtDesService;

    /**
     * PetCt结论
     */
    @Autowired
    ZjPetCtEntryResultsMapper zjPetCtEntryResultsMapper;
    /**
     * PetCt结论
     */
    @Autowired
    PetCtResultService petCtResultService;

    /**
     * 小肠镜
     */
    @Autowired
    ZjEnteroEsDescriptionMapper zjEnteroEsDescriptionMapper;
    /**
     * 小肠镜
     */
    @Autowired
    EnteroscopyService enteroscopyService;

    /**
     * 内镜逆行胰胆管造影ERCP
     */
    @Autowired
    ZjErcpDescriptionMapper zjErcpDescriptionMapper;
    /**
     * 内镜逆行胰胆管造影ERCP
     */
    @Autowired
    ErcpService ercpService;

    /**
     * 超声胃镜
     */
    @Autowired
    ZjGastricEusDescriptionMapper zjGastricEusDescriptionMapper;
    /**
     * 超声胃镜
     */
    @Autowired
    EusService eusService;

    /**
     * 胃镜
     */
    @Autowired
    ZjGastricEsDescriptionMapper zjGastricEsDescriptionMapper;
    /**
     * 胃镜
     */
    @Autowired
    GastroscopeService gastroscopeService;

    @Autowired
    ZjExamMasterMapper zjExamMasterMapper;

    @Autowired
    StandardResultMapper standardResultMapper;

    @Autowired
    ZjTemPatMasterIndexMapper zjTemPatMasterIndexMapper;

    @Autowired
    ZjPatVisitMasterMapper zjPatVisitMasterMapper;


    @Override
    public void saveRuleRun(Integer pageNo, Integer pageSize, String flag) {

        Map<String,Integer> map=new HashMap<>();
        map.put("pageNo",pageNo);
        map.put("pageSize",pageSize);
        //查找患者列表
        List<TEM_PAT_MASTER_INDEX> zj_TEM_PAT_MASTER_INDEX = zjTemPatMasterIndexMapper.findZjTemPatMasterIndexByUniqueId(map);

        for(TEM_PAT_MASTER_INDEX index: zj_TEM_PAT_MASTER_INDEX) {
            //保存患者--------------------------------------------------
            //savePerson(index);
            //患者就诊列表
            List<PAT_VISIT_MASTER> zj_PAT_VISIT_MASTER = zjPatVisitMasterMapper.findZjPatVisitMasterByUniqueId(index.getUNIQUE_ID());
            //就诊其他数据
            for (PAT_VISIT_MASTER master : zj_PAT_VISIT_MASTER) {

                //保存就诊----------------------------------------------------
                //saveVisitRecord(master);

                String uniqueId = master.getUNIQUE_ID();
                Date visitdate=master.getADMISSION_DATE_TIME();

                // 病理报告原文
                List<HISTOLOGY_REPORT> zj_HISTOLOGY_REPORT = zjHistologyReportMapper.findZjHistologyReportByUniqueId(uniqueId);
                if (zj_HISTOLOGY_REPORT != null && zj_HISTOLOGY_REPORT.size() > 0) {
                    saveHistologyReport(zj_HISTOLOGY_REPORT);
                }

                // 医嘱用药
                List<DRUG_ORDER> zj_DRUG_ORDER = zjDrugOrderMapper.findZjDrugOrderByUniqueId(uniqueId);
                if (zj_DRUG_ORDER != null && zj_DRUG_ORDER.size() > 0) {
                    saveDrugOrder(zj_DRUG_ORDER);
                }

                // 手术信息
                List<TEM_OPERATION_RECORD> zj_TEM_OPERATION_RECORD = zjTemOperationRecordMapper.findZjTemOperationRecordByUniqueId(uniqueId);
                if (zj_TEM_OPERATION_RECORD != null && zj_TEM_OPERATION_RECORD.size() > 0) {
                    saveTemOperationRecord(zj_TEM_OPERATION_RECORD);
                }

                // PetCt结论 and PetCt描述
                List<PET_CT_ENTRY_RESULTS> zj_PET_CT_ENTRY_RESULTS = zjPetCtEntryResultsMapper.findZjPetCtEntryResultsByUniqueId(uniqueId);
                if (zj_PET_CT_ENTRY_RESULTS != null && zj_PET_CT_ENTRY_RESULTS.size() > 0) {
                    savePetCtResultsAndPetCtDes(zj_PET_CT_ENTRY_RESULTS);
                }

                // 小肠镜
                List<ENTERO_ES_DESCRIPTION> zj_ENTERO_ES_DESCRIPTION = zjEnteroEsDescriptionMapper.findZjEnteroEsDescriptionByUniqueId(uniqueId);
                if (zj_ENTERO_ES_DESCRIPTION != null && zj_ENTERO_ES_DESCRIPTION.size() > 0) {
                    saveEnteroscopy(zj_ENTERO_ES_DESCRIPTION);
                }

                // 内镜逆行胰胆管造影ERCP
                List<ERCP_DESCRIPTION> zj_ERCP_DESCRIPTION = zjErcpDescriptionMapper.findZjErcpDescriptionByUniqueId(uniqueId);
                if (zj_ERCP_DESCRIPTION != null && zj_ERCP_DESCRIPTION.size() > 0) {
                    saveErcp(zj_ERCP_DESCRIPTION);
                }

                // 超声胃镜
                List<GASTRIC_EUS_DESCRIPTION> zj_GASTRIC_EUS_DESCRIPTION = zjGastricEusDescriptionMapper.findZjGastricEusDescriptionByUniqueId(uniqueId);
                if (zj_GASTRIC_EUS_DESCRIPTION != null && zj_GASTRIC_EUS_DESCRIPTION.size() > 0) {
                    saveEus(zj_GASTRIC_EUS_DESCRIPTION);
                }

                // 胃镜
                List<GASTRIC_ES_DESCRIPTION> zj_GASTRIC_ES_DESCRIPTION = zjGastricEsDescriptionMapper.findZjGastricEsDescriptionByUniqueId(uniqueId);
                if (zj_GASTRIC_ES_DESCRIPTION != null && zj_GASTRIC_ES_DESCRIPTION.size() > 0) {
                    saveGastroscope(zj_GASTRIC_ES_DESCRIPTION);
                }
            }
        }
    }

    /**
     * 胃镜
     * @param zj_GASTRIC_ES_DESCRIPTION
     */
    public void saveGastroscope(List<GASTRIC_ES_DESCRIPTION> zj_GASTRIC_ES_DESCRIPTION) {
        for (GASTRIC_ES_DESCRIPTION gastric_es_description : zj_GASTRIC_ES_DESCRIPTION
             ) {
            EXAM_MASTER exam_master = null;
            List<EXAM_MASTER> exam_masterList = zjExamMasterMapper.findZjExamMasterByUniqueId2(gastric_es_description.getunique_id());
            if (exam_masterList != null && exam_masterList.size() > 0) {
                exam_master = exam_masterList.get(0);
            } else {
                exam_master = new EXAM_MASTER();
            }
            Gastroscope gastroscope = new Gastroscope();
            // unique_id	unique_id
            gastroscope.setUniqueId(gastric_es_description.getunique_id());
            // unique_id_lv1	标识患者身份唯一标识
            gastroscope.setUniqueIdLv1(gastric_es_description.getunique_id_lv1());
            // unique_id_lv2	唯一标识
            gastroscope.setUniqueIdLv2(gastric_es_description.getunique_id_lv2());
            // p900	医疗机构代码
            gastroscope.setP900(gastric_es_description.getp900());
            // patient_id	患者id
            gastroscope.setPatientId(gastric_es_description.getpatient_id());
            // visit_id	门诊/住院号
            gastroscope.setVisitId(gastric_es_description.getvisit_id());
            // lesion_location	病灶位置
            String neg_std = getStandardResultTextById(gastric_es_description.getneg_std(),
                    "afterType1", "neg_std");
            String lesionLocation = null;
            if (StringUtils.isEmpty(neg_std)) {
                lesionLocation = getStandardResultTextById(gastric_es_description.getstructure_std(),
                        "afterType1", "structure_std");
            }
            gastroscope.setLesionLocation(lesionLocation);
            // lesion_size	病灶大小
            gastroscope.setLesionSize(getStandardResultTextById(gastric_es_description.getsize_std(),
                    "afterType1", "size_std"));
            // lesion_number	病灶数量
            gastroscope.setLesionNumber(getStandardResultTextById(gastric_es_description.getquantity_std(),
                    "afterType1", "quantity_std"));
            // distance_to_incisor	病灶上缘距门齿距离
            String distance_std = getStandardResultTextById(gastric_es_description.getdistance_std(),
                    "afterType1", "distance_std");
            gastroscope.setDistanceToIncisor(StringUtils.isNotEmpty(distance_std) ? distance_std.replace(",", "") : null);
            // lymph_around_stomach	胃周肿大淋巴结
            String lesion_std = getStandardResultTextById(gastric_es_description.getlesion_std(),
                    "afterType1", "lesion_std");
            String lymphAroundStomach = null;
            if (StringUtils.isEmpty(neg_std) && StringUtils.isNotEmpty(lesion_std) && lesion_std.indexOf("淋巴结") != -1) {
                lymphAroundStomach = "有";
            } else {
                lymphAroundStomach = "无";
            }
            gastroscope.setLymphAroundStomach(lymphAroundStomach);
            // hp	HP 试验
            String exam_para = exam_master.getEXAM_PARA();
            String hp = null;
            if (StringUtils.isNotEmpty(exam_para) && exam_para.indexOf("HP（hp）试验") != -1) {
                hp = exam_para;
            }
            gastroscope.setHp(hp);
            // data_version	数据版本
            gastroscope.setDataVersion(gastric_es_description.getdata_version());
            // data_db_source	数据库来源
            gastroscope.setDataDbSource(gastric_es_description.getdata_db_source());
            // data_table_source	数据表来源
            gastroscope.setDataTableSource(gastric_es_description.getdata_table_source());
            // data_field_source	数据项来源
            gastroscope.setDataFieldSource(gastric_es_description.getdata_field_source());
            // created_at	创建时间
            gastroscope.setCreatedAt(gastric_es_description.getcreate_time());
            // creator	创建人
            gastroscope.setCreator(gastric_es_description.getcreator());
            // updated_at	修改时间
            gastroscope.setUpdatedAt(null);
            gastroscopeService.saveGastroscope(gastroscope);
            log.info("保存胃镜：" + gastroscope.getUniqueId());
        }
    }

    /**
     * 超声胃镜
     * @param zj_GASTRIC_EUS_DESCRIPTION
     */
    public void saveEus(List<GASTRIC_EUS_DESCRIPTION> zj_GASTRIC_EUS_DESCRIPTION ) {
        for (GASTRIC_EUS_DESCRIPTION gastric_eus_description : zj_GASTRIC_EUS_DESCRIPTION
             ) {
            EXAM_MASTER exam_master = null;
            List<EXAM_MASTER> exam_masterList = zjExamMasterMapper.findZjExamMasterByUniqueId2(gastric_eus_description.getunique_id());
            if (exam_masterList != null && exam_masterList.size() > 0) {
                exam_master = exam_masterList.get(0);
            } else {
                exam_master = new EXAM_MASTER();
            }
            Eus eus = new Eus();
            // unique_id	unique_id
            eus.setUniqueId(gastric_eus_description.getunique_id());
            // unique_id_lv1	标识患者身份唯一标识
            eus.setUniqueIdLv1(gastric_eus_description.getunique_id_lv1());
            // unique_id_lv2	唯一标识
            eus.setUniqueIdLv2(gastric_eus_description.getunique_id_lv2());
            // p900	医疗机构代码
            eus.setP900(gastric_eus_description.getp900());
            // patient_id	患者id
            eus.setPatientId(gastric_eus_description.getpatient_id());
            // visit_id	门诊/住院号
            eus.setVisitId(gastric_eus_description.getvisit_id());
            // lesion_location	病灶位置
            String neg_std = getStandardResultTextById(gastric_eus_description.getneg_std(),
                    "afterType1", "neg_std");
            String lesionLocation = null;
            if (StringUtils.isEmpty(neg_std)) {
                lesionLocation = getStandardResultTextById(gastric_eus_description.getstructure_std(),
                        "afterType1", "structure_std");
            }
            eus.setLesionLocation(lesionLocation);
            // lesion_size	病灶大小
            eus.setLesionSize(getStandardResultTextById(gastric_eus_description.getsize_std(),
                    "afterType1", "size_std"));
            // lesion_number	病灶数量
            eus.setLesionNumber(getStandardResultTextById(gastric_eus_description.getquantity_std(),
                    "afterType1", "quantity_std"));
            // distance_to_incisor	病灶上缘距门齿距离
            String distance_std = getStandardResultTextById(gastric_eus_description.getdistance_std(),
                    "afterType1", "distance_std");
            eus.setDistanceToIncisor(StringUtils.isNotEmpty(distance_std) ? distance_std.replace(",", "") : null);
            // lymph_around_stomach	胃周肿大淋巴结
            String lesion_std = getStandardResultTextById(gastric_eus_description.getlesion_std(),
                    "afterType1", "lesion_std");
            String lymphAroundStomach = null;
            if (StringUtils.isEmpty(neg_std) && StringUtils.isNotEmpty(lesion_std) && lesion_std.indexOf("淋巴结") != -1) {
                lymphAroundStomach = "有";
            } else {
                lymphAroundStomach = "无";
            }
            eus.setLymphAroundStomach(lymphAroundStomach);
            // hp	HP 试验
            String exam_para = exam_master.getEXAM_PARA();
            String hp = null;
            if (StringUtils.isNotEmpty(exam_para) && exam_para.indexOf("HP（hp）试验") != -1) {
                hp = exam_para;
            }
            eus.setHp(hp);
            // data_version	数据版本
            eus.setDataVersion(gastric_eus_description.getdata_version());
            // data_db_source	数据库来源
            eus.setDataDbSource(gastric_eus_description.getdata_db_source());
            // data_table_source	数据表来源
            eus.setDataTableSource(gastric_eus_description.getdata_table_source());
            // data_field_source	数据项来源
            eus.setDataFieldSource(gastric_eus_description.getdata_field_source());
            // created_at	创建时间
            eus.setCreatedAt(gastric_eus_description.getcreate_time());
            // creator	创建人
            eus.setCreator(gastric_eus_description.getcreator());
            // updated_at	修改时间
            eus.setUpdatedAt(null);
            eusService.saveEus(eus);
            log.info("保存超声胃镜：" + eus.getUniqueId());
        }
    }

    /**
     * 内镜逆行胰胆管造影ERCP
     * @param zj_ERCP_DESCRIPTION
     */
    public void saveErcp(List<ERCP_DESCRIPTION> zj_ERCP_DESCRIPTION) {
        for (ERCP_DESCRIPTION ercp_description : zj_ERCP_DESCRIPTION
             ) {
            Ercp ercp = new Ercp();
            // unique_id	unique_id
            ercp.setUniqueId(ercp_description.getunique_id());
            // unique_id_lv1	标识患者身份唯一标识
            ercp.setUniqueIdLv1(ercp_description.getunique_id_lv1());
            // unique_id_lv2	唯一标识
            ercp.setUniqueIdLv2(ercp_description.getunique_id_lv2());
            // p900	医疗机构代码
            ercp.setP900(ercp_description.getp900());
            // patient_id	患者id
            ercp.setPatientId(ercp_description.getpatient_id());
            // visit_id	门诊/住院号
            ercp.setVisitId(ercp_description.getvisit_id());
            // stone_location	结石位置
            String neg_std = getStandardResultTextById(ercp_description.getneg_std(),
                    "afterType1", "neg_std");
            String lesion_std = getStandardResultTextById(ercp_description.getlesion_std(),
                    "afterType1", "lesion_std");
            String stoneLocation = null;
            String stoneSize = null;
            String stoneNumber = null;
            if (StringUtils.isEmpty(neg_std) && StringUtils.isNotEmpty(lesion_std) && lesion_std.indexOf("结石") != -1) {
                stoneLocation = getStandardResultTextById(ercp_description.getstructure_std(),
                        "afterType1", "structure_std");
                stoneSize = getStandardResultTextById(ercp_description.getsize_std(),
                        "afterType1", "size_std");
                stoneNumber = getStandardResultTextById(ercp_description.getquantity_std(),
                        "afterType1", "quantity_std");
            }
            ercp.setStoneLocation(stoneLocation);
            // stone_size	结石大小
            ercp.setStoneSize(stoneSize);
            // stone_number	结石数量
            ercp.setStoneNumber(stoneNumber);
            // data_version	数据版本
            ercp.setDataVersion(ercp_description.getdata_version());
            // data_db_source	数据库来源
            ercp.setDataDbSource(ercp_description.getdata_db_source());
            // data_table_source	数据表来源
            ercp.setDataTableSource(ercp_description.getdata_table_source());
            // data_field_source	数据项来源
            ercp.setDataFieldSource(ercp_description.getdata_field_source());
            // created_at	创建时间
            ercp.setCreatedAt(ercp_description.getcreate_time());
            // creator	创建人
            ercp.setCreator(ercp_description.getcreator());
            // updated_at	修改时间
            ercp.setUpdatedAt(null);
            ercpService.saveErcp(ercp);
            log.info("保存内镜逆行胰胆管造影ERCP：" + ercp.getUniqueId());
        }
    }

    /**
     * 小肠镜
     * @param zj_ENTERO_ES_DESCRIPTION
     */
    public void saveEnteroscopy(List<ENTERO_ES_DESCRIPTION> zj_ENTERO_ES_DESCRIPTION) {
        for (ENTERO_ES_DESCRIPTION entero_es_description : zj_ENTERO_ES_DESCRIPTION
             ) {
            Enteroscopy enteroscopy = new Enteroscopy();
            // unique_id	unique_id
            enteroscopy.setUniqueId(entero_es_description.getunique_id());
            // unique_id_lv1	标识患者身份唯一标识
            enteroscopy.setUniqueIdLv1(entero_es_description.getunique_id_lv1());
            // unique_id_lv2	唯一标识
            enteroscopy.setUniqueIdLv2(entero_es_description.getunique_id_lv2());
            // p900	医疗机构代码
            enteroscopy.setP900(entero_es_description.getp900());
            // patient_id	患者id
            enteroscopy.setPatientId(entero_es_description.getpatient_id());
            // visit_id	门诊/住院号
            enteroscopy.setVisitId(entero_es_description.getvisit_id());
            // lesion_location	病灶位置
            String neg_std = getStandardResultTextById(entero_es_description.getneg_std(),
                    "afterType1", "neg_std");
            String lesionLocation = null;
            if (StringUtils.isEmpty(entero_es_description.getneg_std()) || StringUtils.isEmpty(neg_std)) {
                lesionLocation = getStandardResultTextById(entero_es_description.getstructure_std(),
                        "afterType1", "structure_std");
            }
            enteroscopy.setLesionLocation(lesionLocation);
            // lesion_size	病灶大小
            enteroscopy.setLesionSize(getStandardResultTextById(entero_es_description.getsize_std(),
                    "afterType1", "size_std"));
            // lesion_number	病灶数量
            enteroscopy.setLesionNumber(getStandardResultTextById(entero_es_description.getquantity_std(),
                    "afterType1", "quantity_std"));
            // data_version	数据版本
            enteroscopy.setDataVersion(entero_es_description.getdata_version());
            // data_db_source	数据库来源
            enteroscopy.setDataDbSource(entero_es_description.getdata_db_source());
            // data_table_source	数据表来源
            enteroscopy.setDataTableSource(entero_es_description.getdata_table_source());
            // data_field_source	数据项来源
            enteroscopy.setDataFieldSource(entero_es_description.getdata_field_source());
            // created_at	创建时间
            enteroscopy.setCreatedAt(entero_es_description.getcreate_time());
            // creator	创建人
            enteroscopy.setCreator(entero_es_description.getcreator());
            // updated_at	修改时间
            enteroscopy.setUpdatedAt(null);
            enteroscopyService.saveEnteroscopy(enteroscopy);
            log.info("保存小肠镜：" + enteroscopy.getUniqueId());
        }
    }

    /**
     * PetCt结论 and PetCt描述
     * @param zj_PET_CT_ENTRY_RESULTS
     */
    public void savePetCtResultsAndPetCtDes(List<PET_CT_ENTRY_RESULTS> zj_PET_CT_ENTRY_RESULTS) {
        List<String> lesionStdList = new ArrayList<>(16);
        lesionStdList.add("恶性肿瘤");
        lesionStdList.add("占位");
        lesionStdList.add("肿物");
        lesionStdList.add("结节");
        lesionStdList.add("低密度影");
        lesionStdList.add("高密度影");
        lesionStdList.add("软组织影");
        lesionStdList.add("混杂密度影");
        lesionStdList.add("脂肪密度影");

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
            // PetCt结论
            List<PET_CT_ENTRY_RESULTS> pet_ct_entry_resultsList = zjPetCtEntryResultsMapper.findZjPetCtEntryResultsByUniqueId2(uniqueId);
            // PetCt描述
            List<PET_CT_DESCRIPTION> pet_ct_descriptionList = zjPetCtDescriptionMapper.findZjPetCtDescriptionByUniqueId2(uniqueId);

            // tumor	肿物
            String tumor = null;
            // primary_tumor_location	原发肿物部位
            String primaryTumorLocation = null;
            // primary_tumors_number	原发肿物数目
            String primaryTumorNumber = null;
            // primary_tumor_size	原发肿物大小
            String primaryTumorSize = null;
            // recrudescence	复发
            String recrudescence = null;
            // move	转移
            String move = null;
            // move_site	转移部位
            String moveSite = null;
            // move_number	转移灶数目
            String moveNumber = null;
            // move_size	转移灶大小
            String moveSize = null;
            // lymphadenopathy	淋巴结肿大
            String lymphadenopathy = null;
            // enlarged_lymph_location	肿大淋巴结部位
            String enlargedLymphLocation = null;
            for (PET_CT_ENTRY_RESULTS pet_ct_entry_results : pet_ct_entry_resultsList
                 ) {
                String neg_std = getStandardResultTextById(pet_ct_entry_results.getneg_std(),
                        "afterType1", "neg_std");
                String lesion_std = getStandardResultTextById(pet_ct_entry_results.getlesion_std(),
                        "afterType1", "lesion_std");
                if (StringUtils.isEmpty(neg_std) && StringUtils.isNotEmpty(lesion_std) && lesionStdList.contains(lesion_std)) {
                    tumor = "是";
                }

                String nature_std = getStandardResultTextById(pet_ct_entry_results.getnature_std(),
                        "afterType1", "nature_std");
                String structure_std = getStandardResultTextById(pet_ct_entry_results.getstructure_std(),
                        "afterType1", "structure_std");
                if (StringUtils.isNotEmpty(tumor) && StringUtils.isNotEmpty(nature_std) && nature_std.indexOf("转移") == -1) {
                    primaryTumorLocation = structure_std;
                }

                String quantity_std = getStandardResultTextById(pet_ct_entry_results.getquantity_std(),
                        "afterType1", "quantity_std");
                String nature_quantity_std = getStandardResultTextById(pet_ct_entry_results.getnature_quantity_std(),
                        "afterType1", "nature_quantity_std");
                if (StringUtils.isNotEmpty(primaryTumorLocation)) {
                    if (StringUtils.isNotEmpty(quantity_std)) {
                        primaryTumorNumber = quantity_std;
                    } else if (StringUtils.isNotEmpty(nature_quantity_std)) {
                        primaryTumorNumber = nature_quantity_std;
                    }
                }
                if (StringUtils.isEmpty(primaryTumorNumber)) {
                    for (PET_CT_DESCRIPTION pet_ct_description : pet_ct_descriptionList
                         ) {
                        String structure_std2 = getStandardResultTextById(pet_ct_description.getstructure_std(),
                                "afterType1", "structure_std");
                        if (StringUtils.isNotEmpty(structure_std2) && StringUtils.isNotEmpty(structure_std)
                                && structure_std2.indexOf(structure_std) != -1) {
                            String quantity_std2 = getStandardResultTextById(pet_ct_description.getquantity_std(),
                                    "afterType1", "quantity_std");
                            primaryTumorNumber = quantity_std2;

                            String size_std2 = getStandardResultTextById(pet_ct_description.getsize_std(),
                                    "afterType1", "size_std");
                            primaryTumorSize = size_std2;
                        }
                    }
                }

                if (StringUtils.isEmpty(neg_std)) {
                    if (StringUtils.isEmpty(nature_std)) {
                        recrudescence = "否";
                    } else if (nature_std.indexOf("复发") != -1) {
                        recrudescence = "是";
                    } else if (nature_std.indexOf("无法判断") != -1) {
                        recrudescence = "无法判断";
                    }
                }

                if (StringUtils.isEmpty(neg_std)) {
                    if (StringUtils.isEmpty(nature_std)) {
                        move = "否";
                    } else if (nature_std.indexOf("转移或淋巴结转移") != -1) {
                        move = "是";
                    } else if (nature_std.indexOf("无法判断") != -1) {
                        move = "无法判断";
                    }
                }

                if (StringUtils.isNotEmpty(move) && move.indexOf("是") != -1) {
                    moveSite = structure_std;
                }

                if (StringUtils.isNotEmpty(move) && move.indexOf("是") != -1) {
                    if (StringUtils.isNotEmpty(quantity_std)) {
                        moveNumber = quantity_std;
                    } else if (StringUtils.isNotEmpty(nature_quantity_std)) {
                        moveNumber = nature_quantity_std;
                    }
                }
                if (StringUtils.isEmpty(moveNumber)) {
                    for (PET_CT_DESCRIPTION pet_ct_description : pet_ct_descriptionList
                            ) {
                        String structure_std2 = getStandardResultTextById(pet_ct_description.getstructure_std(),
                                "afterType1", "structure_std");
                        if (StringUtils.isNotEmpty(structure_std2) && StringUtils.isNotEmpty(structure_std)
                                && structure_std2.indexOf(structure_std) != -1) {
                            String quantity_std2 = getStandardResultTextById(pet_ct_description.getquantity_std(),
                                    "afterType1", "quantity_std");
                            moveNumber = quantity_std2;

                            String size_std2 = getStandardResultTextById(pet_ct_description.getsize_std(),
                                    "afterType1", "size_std");
                            moveSize = size_std2;
                        }
                    }
                }

                if (StringUtils.isEmpty(neg_std) && StringUtils.isNotEmpty(lesion_std)
                        && lesion_std.indexOf("淋巴结") != -1) {
                    lymphadenopathy = "是";

                    enlargedLymphLocation = structure_std;
                }
            }

            // 保存PetCt结论
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
            String examName = exam_master.getEXAM_NAME1_STD() + "," + exam_master.getEXAM_NAME2_STD() + ","
                    + exam_master.getEXAM_NAME3_STD() + "," + exam_master.getEXAM_NAME4_STD() + ","
                    + exam_master.getEXAM_NAME5_STD() + "," + exam_master.getEXAM_NAME6_STD();
            petCtResult.setExamName(examName.replace("null", ""));
            // tumor	肿物
            petCtResult.setTumor(tumor);
            // primary_tumor_location	原发肿物部位
            petCtResult.setPrimaryTumorLocation(primaryTumorLocation);
            // primary_tumors_number	原发肿物数目
            petCtResult.setPrimaryTumorsNumber(primaryTumorNumber);
            // primary_tumor_size	原发肿物大小
            petCtResult.setPrimaryTumorSize(StringUtils.isNotEmpty(primaryTumorSize)
                    ? primaryTumorSize.replace(",", "") : null);
            // recrudescence	复发
            petCtResult.setRecrudescence(recrudescence);
            // move	转移
            petCtResult.setMove(move);
            // move_site	转移部位
            petCtResult.setMoveSite(moveSite);
            // move_number	转移灶数目
            petCtResult.setMoveNumber(moveNumber);
            // move_size	转移灶大小
            petCtResult.setMoveSize(moveSize);
            // lymphadenopathy	淋巴结肿大
            petCtResult.setLymphadenopathy(lymphadenopathy);
            // enlarged_lymph_location	肿大淋巴结部位
            petCtResult.setEnlargedLymphLocation(enlargedLymphLocation);
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
            log.info("保存PetCt结论：" + petCtResult.getUniqueId());
            // 保存PetCt描述
            for (PET_CT_DESCRIPTION pet_ct_description : pet_ct_descriptionList
                    ) {
                PetCtDes petCtDes = new PetCtDes();
                // unique_id	unique_id
                petCtDes.setUniqueId(exam_master.getUNIQUE_ID());
                // unique_id_lv1	标识患者身份唯一标识
                petCtDes.setUniqueIdLv1(exam_master.getUNIQUE_ID_LV1());
                // unique_id_lv2	唯一标识
                petCtDes.setUniqueIdLv2(exam_master.getUNIQUE_ID_LV2());
                // p900	医疗机构代码
                petCtDes.setP900(exam_master.getP900());
                // patient_id	患者id
                petCtDes.setPatientId(exam_master.getPATIENT_ID());
                // visit_id	就诊标识住院号
                petCtDes.setVisitId(exam_master.getVISIT_ID());
                // exam_no	检查号
                petCtDes.setExamNo(exam_master.getEXAM_NO());
                // exam_name	检查项目
                petCtDes.setExamName(examName.replace("null", ""));
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
                // primary_quantity_std	原发肿物数目
                petCtDes.setPrimaryQuantityStd(primaryTumorNumber);
                // primary_size_std	原发肿物大小
                petCtDes.setPrimarySizeStd(StringUtils.isNotEmpty(primaryTumorSize)
                        ? primaryTumorSize.replace(",", "") : null);
                // move_quantity_std	转移灶数目
                petCtDes.setMoveQuantityStd(moveNumber);
                // move_size_std	转移灶大小
                petCtDes.setMoveSizeStd(moveSize);
                // data_version	数据版本
                petCtDes.setDataVersion(exam_master.getDATA_VERSION());
                // data_db_source	数据库来源
                petCtDes.setDataDbSource(exam_master.getDATA_DB_SOURCE());
                // data_table_source	数据表来源
                petCtDes.setDataTableSource(exam_master.getDATA_TABLE_SOURCE());
                // data_field_source	数据项来源
                petCtDes.setDataFieldSource(exam_master.getDATA_FIELD_SOURCE());
                // created_at	创建时间
                petCtDes.setCreatedAt(exam_master.getCREATED_AT());
                // creator	创建人
                petCtDes.setCreator(exam_master.getCREATOR());
                // updated_at	修改时间
                petCtDes.setUpdatedAt(exam_master.getUPDATED_AT());
                petCtDesService.savePetCtDes(petCtDes);
                log.info("保存PetCt描述：" + petCtDes.getUniqueId());
            }
        }
    }

    /**
     * PetCt描述
     * @param zj_PET_CT_DESCRIPTION
     */
    public void savePetCtDes(List<PET_CT_DESCRIPTION> zj_PET_CT_DESCRIPTION) {

    }

    /**
     * 手术信息
     * @param zj_TEM_OPERATION_RECORD
     */
    public void saveTemOperationRecord(List<TEM_OPERATION_RECORD> zj_TEM_OPERATION_RECORD) {
        for (TEM_OPERATION_RECORD tem_operation_record : zj_TEM_OPERATION_RECORD
             ) {
            TemOperationRecord temOperationRecord = new TemOperationRecord();
            // unique_id	unique_id
            temOperationRecord.setUniqueId(tem_operation_record.getUNIQUE_ID());
            // unique_id_lv1	标识患者身份唯一标识
            temOperationRecord.setUniqueIdLv1(tem_operation_record.getUNIQUE_ID_LV1());
            // unique_id_lv2	唯一标识
            temOperationRecord.setUniqueIdLv2(tem_operation_record.getUNIQUE_ID_LV2());
            // p900	医疗机构代码
            temOperationRecord.setP900(tem_operation_record.getP900());
            // patient_id	患者id
            temOperationRecord.setPatientId(tem_operation_record.getPATIENT_ID());
            // visit_id	住院号
            temOperationRecord.setVisitId(tem_operation_record.getVISIT_ID());
            // VISIT_TYPE	就诊类型
            temOperationRecord.setVisitType(tem_operation_record.getVISIT_TYPE());
            // DEPARTMENT_NAME	科室名称
            temOperationRecord.setDepartmentName(tem_operation_record.getDEPARTMENT_NAME());
            // INPATIENT_AREA	病区
            temOperationRecord.setInpatientArea(tem_operation_record.getINPATIENT_AREA());
            // AGE	年龄
            temOperationRecord.setAge(tem_operation_record.getAGE());
            // ADMISSION_NUMBER	住院次数
            temOperationRecord.setAdmissionNumber(tem_operation_record.getADMISSION_NUMBER());
            // TPATNAME	病人姓名
            temOperationRecord.setTpatname(tem_operation_record.getTPATNAME());
            // TPATNO	病案号
            temOperationRecord.setTpatno(tem_operation_record.getTPATNO());
            // SURGERY_SN	手术编号
            temOperationRecord.setSurgerySn(tem_operation_record.getSURGERY_SN());
            // RCPT_NO	手术名称
            temOperationRecord.setRcptNo(tem_operation_record.getRCPT_NO());
            // OPERATION_TOPIC	手术操作主题
            temOperationRecord.setOperationTopic(tem_operation_record.getOPERATION_TOPIC());
            // OPERATION_DETAIL_NOTE	手术操作详细信息
            temOperationRecord.setOperationDetailNote(tem_operation_record.getOPERATION_DETAIL_NOTE());
            // SURGICAL_DESCRIPTION	手术过程描述
            temOperationRecord.setSurgicalDescription(tem_operation_record.getSURGICAL_DESCRIPTION());
            // SURGICAL_FINDINGS	术中所见
            temOperationRecord.setSurgicalFindings(tem_operation_record.getSURGICAL_FINDINGS());
            // SURGICAL_ACCIDENT	术中意外
            temOperationRecord.setSurgicalAccident(tem_operation_record.getSURGICAL_ACCIDENT());
            // SKIN_STERILIZATION_DESCRIPTION	皮肤消毒描述
            temOperationRecord.setSkinSterilizationDescription(tem_operation_record.getSKIN_STERILIZATION_DESCRIPTION());
            // IMAGE_NO	影像号
            temOperationRecord.setImageNo(tem_operation_record.getIMAGE_NO());
            // ITEM_NO	手术及操作编码
            temOperationRecord.setItemNo(tem_operation_record.getITEM_NO());
            // ITEM_BEGIN_DATE	手术开始日期时间
            temOperationRecord.setItemBeginDate(tem_operation_record.getITEM_BEGIN_DATE());
            // ITEM_END_DATE	手术结束日期时间
            temOperationRecord.setItemEndDate(tem_operation_record.getITEM_END_DATE());
            // ITEM_CODE	手术级别代码
            temOperationRecord.setItemCode(tem_operation_record.getITEM_CODE());
            // ITEM_NAME	手术目标部位名称
            temOperationRecord.setItemName(tem_operation_record.getITEM_NAME());
            // ITEMSPEC	手术史标志
            temOperationRecord.setItemspec(tem_operation_record.getITEMSPEC());
            // ITEM_INCISION_DESCRIPTION	手术切口描述
            temOperationRecord.setItemIncisionDescription(tem_operation_record.getITEM_INCISION_DESCRIPTION());
            // PERFORMED_BY	引流标志
            temOperationRecord.setPerformedBy(tem_operation_record.getPERFORMED_BY());
            // BLEEDING_VOLUME	出血量
            temOperationRecord.setBleedingVolume(tem_operation_record.getBLEEDING_VOLUME());
            // TRANSFUSION_VOLUME	输液量
            temOperationRecord.setTransfusionVolume(tem_operation_record.getTRANSFUSION_VOLUME());
            // BLOOD_TRANSFUSION_VOLUME	术中输血量
            temOperationRecord.setBloodTransfusionVolume(tem_operation_record.getBLOOD_TRANSFUSION_VOLUME());
            // AUTOLOGOUS_VOLUME_BLOOD	自体输血量
            temOperationRecord.setAutologousVolumeBlood(tem_operation_record.getAUTOLOGOUS_VOLUME_BLOOD());
            // INTRAOPERATIVE_VOLUME	术中出入量情况
            temOperationRecord.setIntraoperativeVolume(tem_operation_record.getINTRAOPERATIVE_VOLUME());
            // PRE_OPERATIVE_BRIEF_DESCRIPTION	术前简历
            temOperationRecord.setPreOperativeBriefDescription(tem_operation_record.getPRE_OPERATIVE_BRIEF_DESCRIPTION());
            // SUB_ORDER_NO	术前用药
            temOperationRecord.setSubOrderNo(tem_operation_record.getSUB_ORDER_NO());
            // PRINTED_RCPT_NO	术中用药
            temOperationRecord.setPrintedRcptNo(tem_operation_record.getPRINTED_RCPT_NO());
            // ADMINISTRATION	输血反应标志
            temOperationRecord.setAdministration(tem_operation_record.getADMINISTRATION());
            // NAME_OF_SURGEON	手术医师姓名
            temOperationRecord.setNameOfSurgeon(tem_operation_record.getNAME_OF_SURGEON());
            // NAME_1	i助姓名
            temOperationRecord.setName1(tem_operation_record.getNAME_1());
            // NAME_2	ii助姓名
            temOperationRecord.setName2(tem_operation_record.getNAME_2());
            // NAME_NUR	手术护士
            temOperationRecord.setNameNur(tem_operation_record.getNAME_NUR());
            // ANESTHESIA_CODE	麻醉方式代码
            temOperationRecord.setAnesthesiaCode(tem_operation_record.getANESTHESIA_CODE());
            // ANESTHESIA_METHOD	麻醉方式
            temOperationRecord.setAnesthesiaMethod(tem_operation_record.getANESTHESIA_METHOD());
            // ASA_RATING	asa分级
            temOperationRecord.setAsaRating(tem_operation_record.getASA_RATING());
            // OPERATING_ROOM_NO	手术间编号
            temOperationRecord.setOperatingRoomNo(tem_operation_record.getOPERATING_ROOM_NO());
            // OPERATING_ROOM	手术间名称
            temOperationRecord.setOperatingRoom(tem_operation_record.getOPERATING_ROOM());
            // PLANNED_SURGERY	拟施手术
            temOperationRecord.setPlannedSurgery(tem_operation_record.getPLANNED_SURGERY());
            // PLANNED_ANESTHESIA	拟施麻醉
            temOperationRecord.setPlannedAnesthesia(tem_operation_record.getPLANNED_ANESTHESIA());
            // SURGICAL_POSITION	手术体位
            temOperationRecord.setSurgicalPosition(tem_operation_record.getSURGICAL_POSITION());
            // MEDICATION_BEFORE_ANES	麻醉前用药
            temOperationRecord.setMedicationBeforeAnes(tem_operation_record.getMEDICATION_BEFORE_ANES());
            // MEDICATION_AT_ANES	麻醉中用药
            temOperationRecord.setMedicationAtAnes(tem_operation_record.getMEDICATION_AT_ANES());
            // ANESTHESIA_COMPLICATIONS	麻醉并发症
            temOperationRecord.setAnesthesiaComplications(tem_operation_record.getANESTHESIA_COMPLICATIONS());
            // ANESTHESIOLOGIST	麻醉医师
            temOperationRecord.setAnesthesiologist(tem_operation_record.getANESTHESIOLOGIST());
            // DIAG_PREOPERATION	术前诊断
            temOperationRecord.setDiagPreoperation(tem_operation_record.getDIAG_PREOPERATION());
            // DIAG_POSTOPERATION	术后诊断
            temOperationRecord.setDiagPostoperation(tem_operation_record.getDIAG_POSTOPERATION());
            // SURGICAL_PROCESS	手术简要经过
            temOperationRecord.setSurgicalProcess(tem_operation_record.getSURGICAL_PROCESS());
            // POSTOPERATION_COMPLITE	术后并发症
            temOperationRecord.setPostoperationComplite(tem_operation_record.getPOSTOPERATION_COMPLITE());
            // POSTOPERATIVE_ANALGESIA	术后镇痛
            temOperationRecord.setPostoperativeAnalgesia(tem_operation_record.getPOSTOPERATIVE_ANALGESIA());
            // POSTOPERATIVE_DESTINATION	术后患者去向
            temOperationRecord.setPostoperativeDestination(tem_operation_record.getPOSTOPERATIVE_DESTINATION());
            // POSTOPERATIVE_VISIT	术后回访
            temOperationRecord.setPostoperativeVisit(tem_operation_record.getPOSTOPERATIVE_VISIT());
            // data_version	数据版本
            temOperationRecord.setDataVersion(tem_operation_record.getDATA_VERSION());
            // data_db_source	数据库来源
            temOperationRecord.setDataDbSource(tem_operation_record.getDATA_DB_SOURCE());
            // data_table_source	数据表来源
            temOperationRecord.setDataTableSource(tem_operation_record.getDATA_TABLE_SOURCE());
            // data_field_source	数据项来源
            temOperationRecord.setDataFieldSource(tem_operation_record.getDATA_FIELD_SOURCE());
            // created_at	创建时间
            temOperationRecord.setCreatedAt(tem_operation_record.getCREATED_AT());
            // creator	创建人
            temOperationRecord.setCreator(tem_operation_record.getCREATOR());
            // updated_at	修改时间
            temOperationRecord.setUpdatedAt(tem_operation_record.getUPDATED_AT());
            temOperationRecordService.saveTemOperationRecord(temOperationRecord);
            log.info("保存手术信息：" + temOperationRecord.getUniqueId());
        }
    }

    /**
     * 医嘱用药
     * @param zj_DRUG_ORDER
     */
    public void saveDrugOrder(List<DRUG_ORDER> zj_DRUG_ORDER) {
        for (DRUG_ORDER drug_order : zj_DRUG_ORDER
             ) {
            DurgOrder drugOrder = new DurgOrder();
            // unique_id	unique_id
            drugOrder.setUniqueId(drug_order.getUNIQUE_ID());
            // unique_id_lv1	标识患者身份唯一标识
            drugOrder.setUniqueIdLv1(drug_order.getUNIQUE_ID_LV1());
            // unique_id_lv2	唯一标识
            drugOrder.setUniqueIdLv2(drug_order.getUNIQUE_ID_LV2());
            // p900	医疗机构代码
            drugOrder.setP900(drug_order.getP900());
            // patient_id	患者id
            drugOrder.setPatientId(drug_order.getPATIENT_ID());
            // visit_id	住院号
            drugOrder.setVisitId(drug_order.getVISIT_ID());
            // visit_type	就诊类型
            drugOrder.setVisitType(drug_order.getVISIT_TYPE());
            // order_no	医嘱序号
            drugOrder.setOrderNo(drug_order.getORDER_NO());
            // order_sub_no	医嘱子序号
            drugOrder.setOrderSubNo(drug_order.getORDER_SUB_NO());
            // order_class	医嘱类别
            drugOrder.setOrderClass(drug_order.getORDER_CLASS());
            // order_text	医嘱正文
            drugOrder.setOrderText(drug_order.getORDER_TEXT());
            // order_type	医嘱类型
            drugOrder.setOrderType(drug_order.getORDER_TYPE());
            // order_quantity	数量
            drugOrder.setOrderQuantity(drug_order.getORDER_QUANTITY());
            // order_unit	数量单位
            drugOrder.setOrderUnit(drug_order.getORDER_UNIT());
            // dosage	药品单次用量
            drugOrder.setDosage(drug_order.getDOSAGE());
            // dosage_units	剂量单位
            drugOrder.setDosageUnits(drug_order.getDOSAGE_UNITS());
            // drug_name	药品名称
            drugOrder.setDrugName(drug_order.getDRUG_NAME());
            // main_ingredient	药理主要成分
            drugOrder.setMainIngredient(drug_order.getMAIN_INGREDIENT());
            // brand_name	商品名
            drugOrder.setBrandName(drug_order.getBRAND_NAME());
            // drug_form	药物剂型
            drugOrder.setDrugForm(drug_order.getDRUG_FORM());
            // drug_specs	药品规格
            drugOrder.setDrugSpecs(drug_order.getDRUG_SPECS());
            // drug_specs_unit	药品规格单位
            drugOrder.setDrugSpecsUnit(drug_order.getDRUG_SPECS_UNIT());
            // drug_package_unit	药品包装单位
            drugOrder.setDrugPackageUnit(drug_order.getDRUG_PACKAGE_UNIT());
            // administration	用药途径
            drugOrder.setAdministration(drug_order.getADMINISTRATION());
            // duration	持续时间
            drugOrder.setDuration(drug_order.getDURATION());
            // duration_units	持续时间单位
            drugOrder.setDurationUnits(drug_order.getDURATION_UNITS());
            // frequency	医嘱频次
            drugOrder.setFrequency(drug_order.getFREQUENCY());
            // freq_interval	频率间隔
            drugOrder.setFreqInterval(drug_order.getFREQ_INTERVAL());
            // freq_interval_unit	频率间隔单位
            drugOrder.setFreqIntervalUnit(drug_order.getFREQ_INTERVAL_UNIT());
            // freq_detail	执行详细时间
            drugOrder.setFreqDetail(drug_order.getFREQ_DETAIL());
            // perform_schedule	护士执行时间
            drugOrder.setPerformSchedule(drug_order.getPERFORM_SCHEDULE());
            // ordering_dept	开医嘱科室
            drugOrder.setOrderingDept(drug_order.getORDERING_DEPT());
            // ordering_doctor	医嘱开立医生
            drugOrder.setOrderingDoctor(drug_order.getORDERING_DOCTOR());
            // enter_date_time	医嘱开立时间
            drugOrder.setEnterDateTime(drug_order.getENTER_DATE_TIME());
            // order_stop_doctor	医嘱停止医生
            drugOrder.setOrderStopDoctor(drug_order.getORDER_STOP_DOCTOR());
            // stop_order_date_time	医嘱停止时间
            drugOrder.setStopOrderDateTime(drug_order.getSTOP_ORDER_DATE_TIME());
            // order_cancel_doctor	医嘱作废医生
            drugOrder.setOrderCancelDoctor(drug_order.getORDER_CANCEL_DOCTOR());
            // order_cancel_date_time	医嘱作废时间
            drugOrder.setOrderCancelDateTime(drug_order.getORDER_CANCEL_DATE_TIME());
            // order_status	医嘱状态
            drugOrder.setOrderStatus(drug_order.getORDER_STATUS());
            // data_version	数据版本
            drugOrder.setDataVersion(drug_order.getDATA_VERSION());
            // data_db_source	数据库来源
            drugOrder.setDataDbSource(drug_order.getDATA_DB_SOURCE());
            // data_table_source	数据表来源
            drugOrder.setDataTableSource(drug_order.getDATA_TABLE_SOURCE());
            // data_field_source	数据项来源
            drugOrder.setDataFieldSource(drug_order.getDATA_FIELD_SOURCE());
            // created_at	创建时间
            drugOrder.setCreatedAt(drug_order.getCREATED_AT());
            // creator	创建人
            drugOrder.setCreator(drug_order.getCREATOR());
            // updated_at	修改时间
            drugOrder.setUpdatedAt(drug_order.getUPDATED_AT());
            durgOrderService.saveDurgOrder(drugOrder);
            log.info("保存医嘱用药：" + drugOrder.getUniqueId());
        }
    }

    /**
     * 病理报告原文
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
            histologyReportService.saveHistologyReport(histologyReport);
            log.info("保存病理报告原文：" + histologyReport.getUniqueId());
        }
    }

    public String getStandardResultTextById(String standardTableId, String arrayField, String stdField) {
        String resultJson = standardResultMapper.selectStandardResultById(standardTableId);
        return JSONUtils.getDuplicatedConcatOne(resultJson, arrayField, stdField);
    }

}