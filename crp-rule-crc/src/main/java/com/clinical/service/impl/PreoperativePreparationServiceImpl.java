package com.clinical.service.impl;
import com.clinical.dao.cluster.PreoperativePreparationMapper;
import com.clinical.dao.master.*;
import com.clinical.model.cluster.PreoperativePreparation;
import com.clinical.model.master.DRUG_ORDER;
import com.clinical.model.master.INP_ORDERS;
import com.clinical.model.master.PREOP_TREATMENT;
import com.clinical.model.master.TEM_OPERATION_RECORD;
import com.clinical.utils.JSONUtils;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.PreoperativePreparationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PreoperativePreparationServiceImpl implements PreoperativePreparationService {

    @Autowired
    PreoperativePreparationMapper    preoperativePreparationMapper;
    @Autowired
    ZjTemOperationRecordMapper zjTemOperationRecordMapper;
    @Autowired
    StandardResultMapper standardResultMapper;
    @Autowired
    ZjDrugOrderMapper zjdrugOrderMapper;
    @Autowired
    ZjPreopTreatmentMapper zjPreopTreatmentMapper;
    @Autowired
    ZjInpOrdersMapper zjInpOrdersMapper;

    @Override
    public  void savePreoperativePreparation(PreoperativePreparation preoperativePreparation) {
         preoperativePreparationMapper.savePreoperativePreparation(preoperativePreparation);

     }


    public void add2() {
        List<PREOP_TREATMENT> zjPreopTreatmentByALL = zjPreopTreatmentMapper.findZjPreopTreatmentByALL();
        for (PREOP_TREATMENT preop_treatment: zjPreopTreatmentByALL) {
            PreoperativePreparation preoperativePreparation = new PreoperativePreparation();
            preoperativePreparation.setUniqueId(preop_treatment.getunique_id());
            preoperativePreparation.setUniqueIdLv1(preop_treatment.getunique_id_lv1());
            preoperativePreparation.setUniqueIdLv2(preop_treatment.getunique_id_lv2());
            preoperativePreparation.setP900(preop_treatment.getp900());
            preoperativePreparation.setPatientId(preop_treatment.getpatient_id());
            preoperativePreparation.setVisitId(preop_treatment.getvisit_id());
            List<TEM_OPERATION_RECORD> zjTemOperationRecordByUniqueId = zjTemOperationRecordMapper.findZjTemOperationRecordByUniqueId(preop_treatment.getunique_id_lv2());
            for (TEM_OPERATION_RECORD tem_operation_record:zjTemOperationRecordByUniqueId) {
                List<DRUG_ORDER> zjDrugOrderByUniqueId1 = zjdrugOrderMapper.findZjDrugOrderByUniqueId(tem_operation_record.getUNIQUE_ID_LV2());
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
                        if (inp_orders.getORDER_CLASS().contains("临时医嘱") &&
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
                                    if (preoperativePreparation.getChemotherapy()!=null) {
                                        preoperativePreparation.setChemotherapy("否");
                                    }
                                }
                            }
                         /*   else{
                                if (preoperativePreparation.getChemotherapy()!=null) {
                                    preoperativePreparation.setChemotherapy("否");
                                }
                            }*/
                        }
                        else{
                            if (preoperativePreparation.getChemotherapy()!=null) {
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
                                    if (preoperativePreparation.getRadiotherapy()!=null) {
                                        preoperativePreparation.setRadiotherapy("否");
                                    }
                                }
                            }
                            else{
                                if (preoperativePreparation.getRadiotherapy()!=null) {
                                    preoperativePreparation.setRadiotherapy("否");
                                }
                            }
                        }
                        else{
                            if (preoperativePreparation.getRadiotherapy()!=null) {
                                preoperativePreparation.setRadiotherapy("否");
                            }
                        }
                    }
                }
            }

            preoperativePreparation.setDataVersion(preop_treatment.getdata_version());
            preoperativePreparation.setDataDbSource(preop_treatment.getdata_db_source());
            preoperativePreparation.setDataTableSource(preop_treatment.getdata_table_source());
            preoperativePreparation.setDataFieldSource(preop_treatment.getdata_field_source());
            //preoperativePreparation.setCreatedAt(preop_treatment.getcreator());
            preoperativePreparation.setCreator(preop_treatment.getcreator());
            //preoperativePreparation.setUpdatedAt(preop_treatment.getUPDATED_AT());
            preoperativePreparationMapper.savePreoperativePreparation(preoperativePreparation);
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

    @Override
    public void add(){
        List<TEM_OPERATION_RECORD> zjTemOperationRecordByALL = zjTemOperationRecordMapper.findZjTemOperationRecordByALL();
        for (TEM_OPERATION_RECORD tem_operation_record:zjTemOperationRecordByALL) {
            PreoperativePreparation preoperativePreparation = new PreoperativePreparation();
            preoperativePreparation.setUniqueId(tem_operation_record.getUNIQUE_ID());
            preoperativePreparation.setUniqueIdLv1(tem_operation_record.getUNIQUE_ID_LV1());
            preoperativePreparation.setUniqueIdLv2(tem_operation_record.getUNIQUE_ID_LV2());
            preoperativePreparation.setP900(tem_operation_record.getP900());
            preoperativePreparation.setPatientId(tem_operation_record.getPATIENT_ID());
            preoperativePreparation.setVisitId(tem_operation_record.getVISIT_ID());
            List<DRUG_ORDER> zjDrugOrderByUniqueId1 = zjdrugOrderMapper.findZjDrugOrderByUniqueId(tem_operation_record.getUNIQUE_ID_LV2());
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
                    if (inp_orders.getORDER_CLASS().contains("临时医嘱") &&
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

}