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
//            savePerson(index);

            //患者就诊列表
            List<PAT_VISIT_MASTER> zj_PAT_VISIT_MASTER = zjPatVisitMasterMapper.findZjPatVisitMasterByUniqueId(index.getUNIQUE_ID());
            //就诊其他数据
            for (PAT_VISIT_MASTER master : zj_PAT_VISIT_MASTER) {

                //保存就诊----------------------------------------------------
//                saveVisitRecord(master);

                String uniqueId = master.getUNIQUE_ID();

                Date visitdate=master.getADMISSION_DATE_TIME();

                // 肠镜
                List<COLON_ES_DESCRIPTION> zj_COLON_ES_DESCRIPTION = zjColonEsDescriptionMapper.findZjColonEsDescriptionByUniqueId(uniqueId);
                if (zj_COLON_ES_DESCRIPTION != null && zj_COLON_ES_DESCRIPTION.size() > 0) {
                    saveColonEsDes(zj_COLON_ES_DESCRIPTION);
                }
                // 病理报告原文
                List<HISTOLOGY_REPORT> zj_HISTOLOGY_REPORT = zjHistologyReportMapper.findZjHistologyReportByUniqueId(uniqueId);
                if (zj_HISTOLOGY_REPORT != null && zj_HISTOLOGY_REPORT.size() > 0) {
                    saveHistologyReport(zj_HISTOLOGY_REPORT);
                }
                // 病理检查
                List<PATHOLOGY>  zj_PATHOLOGY = zjPathologyMapper.findZjPathologyByUniqueId(uniqueId);
                if (zj_PATHOLOGY != null && zj_PATHOLOGY.size() > 0) {
                    savePathological(zj_PATHOLOGY);
                }
                // 免疫组化标志物
                List<IHC_MARKER> zj_IHC_MARKER = zjIhcMarkerMapper.findZjIhcMarkerByUniqueId(uniqueId);
                if (zj_IHC_MARKER != null && zj_IHC_MARKER.size() > 0) {
                    saveImmune(zj_IHC_MARKER);
                }

            }
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
            if (histology_reportList != null && histology_reportList.size() > 0) {
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
     * 病理检查
     */
    public void savePathological(List<PATHOLOGY>  zj_PATHOLOGY) {
        for (PATHOLOGY pathology : zj_PATHOLOGY
             ) {
            HISTOLOGY_REPORT histology_report = null;
            List<HISTOLOGY_REPORT> histology_reportList = zjHistologyReportMapper.findZjHistologyReportByUniqueId2(pathology.getunique_id());
            if (histology_reportList != null && histology_reportList.size() > 0) {
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
            EXAM_MASTER exam_master = null;
            List<EXAM_MASTER> exam_masterList = zjExamMasterMapper.findZjExamMasterByUniqueId2(colon_es_description.getunique_id());
            if (exam_masterList != null && exam_masterList.size() > 0) {
                exam_master = exam_masterList.get(0);
            } else {
                exam_master = new EXAM_MASTER();
            }

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

}