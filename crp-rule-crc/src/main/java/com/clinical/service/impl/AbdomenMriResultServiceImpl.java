package com.clinical.service.impl;
import com.alibaba.druid.sql.ast.statement.SQLIfStatement;
import com.clinical.dao.cluster.AbdomenMriDesMapper;
import com.clinical.dao.cluster.AbdomenMriResultMapper;
import com.clinical.dao.master.StandardResultMapper;
import com.clinical.dao.master.ZjAbdomMrDescriptionMapper;
import com.clinical.dao.master.ZjAbdomMrEntryResultsMapper;
import com.clinical.dao.master.ZjExamMasterMapper;
import com.clinical.model.cluster.AbdomenMriDes;
import com.clinical.model.cluster.AbdomenMriResult;
import com.clinical.model.master.ABDOM_MR_DESCRIPTION;
import com.clinical.model.master.ABDOM_MR_ENTRY_RESULTS;
import com.clinical.model.master.EXAM_MASTER;
import com.clinical.utils.JSONUtils;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.AbdomenMriResultService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@Service
public class AbdomenMriResultServiceImpl implements AbdomenMriResultService {

    @Autowired
    AbdomenMriResultMapper    abdomenMriResultMapper;
    @Autowired
    AbdomenMriDesMapper abdomenMriDesMapper;
    @Autowired
    ZjExamMasterMapper zjExamMasterMapper;
    @Autowired
    ZjAbdomMrEntryResultsMapper zjAbdomMrEntryResultsMapper;
    @Autowired
    ZjAbdomMrDescriptionMapper zjAbdomMrDescriptionMapper;
    @Autowired
    StandardResultMapper standardResultMapper;

    @Override
    public  void saveAbdomenMriResult(AbdomenMriResult abdomenMriResult) {
         abdomenMriResultMapper.saveAbdomenMriResult(abdomenMriResult);

     }

    @Override
    public void add() {
        List<ABDOM_MR_ENTRY_RESULTS> zjAbdomMrEntryResultsByALL = zjAbdomMrEntryResultsMapper.findZjAbdomMrEntryResultsByALL();
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
