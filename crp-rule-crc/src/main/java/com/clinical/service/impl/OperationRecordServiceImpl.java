package com.clinical.service.impl;
import com.clinical.dao.cluster.OperationRecordMapper;
import com.clinical.dao.master.*;
import com.clinical.model.cluster.OperationRecord;
import com.clinical.model.cluster.PreoperativePreparation;
import com.clinical.model.master.INP_ORDERS;
import com.clinical.model.master.SURGERY_LN_BLOOD;
import com.clinical.model.master.SURGICAL_RECORD;
import com.clinical.model.master.TEM_OPERATION_RECORD;
import com.clinical.utils.JSONUtils;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.OperationRecordService;
import org.springframework.stereotype.Service;
import springfox.documentation.spring.web.json.Json;

import java.util.List;

@Service
public class OperationRecordServiceImpl implements OperationRecordService {

    @Autowired
    OperationRecordMapper    operationRecordMapper;
    @Autowired
    ZjTemOperationRecordMapper zjTemOperationRecordMapper;
   @Autowired
    ZjSurgicalRecordMapper zjSurgicalRecordMapper;
    @Autowired
    ZjSurgeryLnBloodMapper zjSurgeryLnBloodMapper;
    @Autowired
    StandardResultMapper standardResultMapper;
    @Autowired
    ZjInpOrdersMapper  zjInpOrdersMapper;
    @Override
    public  void saveOperationRecord(OperationRecord operationRecord) {
         operationRecordMapper.saveOperationRecord(operationRecord);

     }

    @Override
    public void add() {
        List<TEM_OPERATION_RECORD> zjTemOperationRecordByALL = zjTemOperationRecordMapper.findZjTemOperationRecordByALL();
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
                        if (inp_orders.getORDER_CLASS().contains("临时医嘱") &&
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
    public String Json(String s,String ss){
        String structure_stds = standardResultMapper.selectStandardResultById(s);
        List<String> structure_stdslist = JSONUtils.getList(structure_stds, "afterType1", ss);
        StringBuffer structure_std = new StringBuffer();
        for (String structure_std1: structure_stdslist) {
            structure_std.append(structure_std1);
        }
        return structure_std.toString();
    }
}
//record
//route
//robot
//resection_rectum
//resection_colon
//operation_name
//lymph_dissection
//mabl
//start_time
//end_time
//blood_transfusion
//blood_transfusion_volume
//composition
//colostomy
//colostomy_methods
//remove_organs
//remove_organs_name