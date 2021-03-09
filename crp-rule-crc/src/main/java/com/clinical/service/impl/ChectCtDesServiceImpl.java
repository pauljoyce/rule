package com.clinical.service.impl;
import com.clinical.dao.cluster.ChectCtDesMapper;
import com.clinical.dao.cluster.ChectCtResultMapper;
import com.clinical.dao.master.StandardResultMapper;
import com.clinical.dao.master.ZjChestCtDescriptionMapper;
import com.clinical.dao.master.ZjChestCtEntryResultsMapper;
import com.clinical.dao.master.ZjExamMasterMapper;
import com.clinical.model.cluster.ChectCtDes;
import com.clinical.model.cluster.ChectCtResult;
import com.clinical.model.master.CHEST_CT_DESCRIPTION;
import com.clinical.model.master.CHEST_CT_ENTRY_RESULTS;
import com.clinical.model.master.EXAM_MASTER;
import com.clinical.utils.JSONUtils;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.ChectCtDesService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ChectCtDesServiceImpl implements ChectCtDesService {

    @Autowired
    ChectCtDesMapper    chectCtDesMapper;
   @Autowired
    ChectCtResultMapper chectCtResultMapper;
    @Autowired
    ZjExamMasterMapper zjExamMasterMapper;
   @Autowired
    ZjChestCtDescriptionMapper zjChestCtDescriptionMapper;
   @Autowired
    StandardResultMapper  standardResultMapper;
   @Autowired
    ZjChestCtEntryResultsMapper chestCtEntryResultsMapper;
   @Autowired
   ZjChestCtEntryResultsMapper zjChestCtEntryResultsMapper;
    @Override
    public  void saveChectCtDes(ChectCtDes chectCtDes) {
         chectCtDesMapper.saveChectCtDes(chectCtDes);

     }
    @Override
    public  void add( ) {
        List<CHEST_CT_DESCRIPTION> zjChestCtDescriptionByALL = zjChestCtDescriptionMapper.findZjChestCtDescriptionByALL();
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
}