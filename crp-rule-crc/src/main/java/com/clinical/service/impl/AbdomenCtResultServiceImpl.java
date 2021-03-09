package com.clinical.service.impl;
import com.clinical.dao.cluster.AbdomenCtDesMapper;
import com.clinical.dao.cluster.AbdomenCtResultMapper;
import com.clinical.dao.master.*;
import com.clinical.model.cluster.AbdomenCtDes;
import com.clinical.model.cluster.AbdomenCtResult;
import com.clinical.model.cluster.AbdomenMriDes;
import com.clinical.model.cluster.AbdomenMriResult;
import com.clinical.model.master.*;
import com.clinical.utils.JSONUtils;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.AbdomenCtResultService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@Service
public class AbdomenCtResultServiceImpl implements AbdomenCtResultService {

    @Autowired
    AbdomenCtResultMapper    abdomenCtResultMapper;
 @Autowired
 AbdomenCtDesMapper abdomenCtDesMapper;
    @Autowired
    ZjExamMasterMapper zjExamMasterMapper;
    @Autowired
    ZjAbdomCtEntryResultsMapper zjAbdomCtEntryResultsMapper;
    @Autowired
    StandardResultMapper standardResultMapper;
    @Autowired
     ZjAbdomCtDescriptionMapper zjAbdomCtDescriptionMapper;
    @Override
    public  void saveAbdomenCtResult(AbdomenCtResult abdomenCtResult) {
         abdomenCtResultMapper.saveAbdomenCtResult(abdomenCtResult);

     }

    @Override
    public void add() {
        List<ABDOM_CT_ENTRY_RESULTS> zjAbdomCtEntryResultsByALL = zjAbdomCtEntryResultsMapper.findZjAbdomCtEntryResultsByALL();
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
}