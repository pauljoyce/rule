package com.clinical.service.impl;
import com.alibaba.fastjson.JSONObject;
import com.clinical.dao.cluster.AbdominalXResultMapper;
import com.clinical.dao.master.StandardResultMapper;
import com.clinical.dao.master.ZjAbdomXrEntryResultsMapper;
import com.clinical.dao.master.ZjExamMasterMapper;
import com.clinical.model.cluster.AbdominalXResult;
import com.clinical.model.cluster.ExamMaster;
import com.clinical.model.master.ABDOM_XR_ENTRY_RESULTS;
import com.clinical.model.master.EXAM_MASTER;
import com.clinical.utils.JSONUtils;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.AbdominalXResultService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AbdominalXResultServiceImpl implements AbdominalXResultService {

    @Autowired
    AbdominalXResultMapper    abdominalXResultMapper;
    @Autowired
    ZjExamMasterMapper    examMasterMapper;
    @Autowired
    ZjAbdomXrEntryResultsMapper zjAbdomXrEntryResultsMapper;
    @Autowired
    StandardResultMapper   standardResultMapper;
    @Override
    public  void saveAbdominalXResult(AbdominalXResult abdominalXResult) {
         abdominalXResultMapper.saveAbdominalXResult(abdominalXResult);

     }

    @Override
    public void inAbdominalXResult() {
        List<ABDOM_XR_ENTRY_RESULTS> zjAbdomXrEntryResultsByALL = zjAbdomXrEntryResultsMapper.findZjAbdomXrEntryResultsByALL();
        for (ABDOM_XR_ENTRY_RESULTS abdom_xr_entry_results:zjAbdomXrEntryResultsByALL) {

            //System.out.println("获取abdom_xr_entry_results");
            List<EXAM_MASTER> zjExamMasterByUniqueId = examMasterMapper.findZjExamMasterByUniqueId1(abdom_xr_entry_results.getunique_id());
            //System.out.println("遍历zjExamMasterByUniqueId");
            for (EXAM_MASTER master:zjExamMasterByUniqueId){
            //System.out.println("创建对象");
            AbdominalXResult abdominalXResult = new AbdominalXResult();
            abdominalXResult.setUniqueId(abdom_xr_entry_results.getunique_id());
            abdominalXResult.setUniqueIdLv1(abdom_xr_entry_results.getunique_id_lv1());
            abdominalXResult.setUniqueIdLv2(abdom_xr_entry_results.getunique_id_lv2());
            abdominalXResult.setP900(abdom_xr_entry_results.getp900());
            abdominalXResult.setPatientId(abdom_xr_entry_results.getpatient_id());
            abdominalXResult.setVisitId(abdom_xr_entry_results.getvisit_id());
            abdominalXResult.setExamNo(master.getEXAM_NO());
                StringBuffer EXAM_NAME_STD = new StringBuffer();

                if (!(master.getEXAM_NAME1_STD()== null || master.getEXAM_NAME1_STD().equals(""))){
                    EXAM_NAME_STD.append(master.getEXAM_NAME1_STD());
                }
                if (!(master.getEXAM_NAME2_STD()== null || master.getEXAM_NAME2_STD().equals(""))){
                    EXAM_NAME_STD.append(master.getEXAM_NAME2_STD());
                }
                if (!(master.getEXAM_NAME3_STD()== null || master.getEXAM_NAME3_STD().equals(""))){
                    EXAM_NAME_STD.append(master.getEXAM_NAME3_STD());
                }
                if (!(master.getEXAM_NAME4_STD()== null || master.getEXAM_NAME4_STD().equals(""))){
                    EXAM_NAME_STD.append(master.getEXAM_NAME4_STD());
                }
                if (!(master.getEXAM_NAME5_STD()== null || master.getEXAM_NAME5_STD().equals(""))){
                    EXAM_NAME_STD.append(master.getEXAM_NAME5_STD());
                }
                if (!(master.getEXAM_NAME6_STD()== null || master.getEXAM_NAME6_STD().equals(""))){
                    EXAM_NAME_STD.append(master.getEXAM_NAME6_STD());
                }
            abdominalXResult.setExamName(EXAM_NAME_STD.toString());
                    //master.getEXAM_NAME1_STD()+' '+master.getEXAM_NAME2_STD()+' '+master.getEXAM_NAME3_STD()+' '+master.getEXAM_NAME4_STD()+' '+master.getEXAM_NAME5_STD()+' '+master.getEXAM_NAME6_STD());
           if(abdom_xr_entry_results.getneg_std()== null || abdom_xr_entry_results.getneg_std().equals("")) {
                String s = standardResultMapper.selectStandardResultById(abdom_xr_entry_results.getlesion_std());
               if (!(s== null || s.equals(""))){
                   //System.out.println("判断梗阻");
                   StringBuffer lesion_std = new StringBuffer();
                List<String> list = JSONUtils.getList(s, "afterType1", "lesion_std");
                for (String lesion_std1: list) {
                    lesion_std.append(lesion_std1);
                }
                if(lesion_std.toString().contains("梗阻")){
                  //  System.out.println("梗阻");
                    String ss = standardResultMapper.selectStandardResultById(abdom_xr_entry_results.getstructure_std());
                    System.out.println(ss);
                    if (!(ss== null || ss.equals(""))){
                    List<String> list2 = JSONUtils.getList(ss, "afterType1", "structure_site_std");
                        System.out.println(list2);
                        StringBuffer structure_std = new StringBuffer();
                    for (String structure_std1: list2) {
                        structure_std.append(structure_std1);
                    }
                      String   structure1_std=  structure_std.toString();
                        System.out.println(structure1_std);
                    if (structure1_std.contains("肠")||structure1_std.contains("小肠")||structure1_std.contains("大肠")){
                   abdominalXResult.setIntestinalObstruction("是");
               }
                    else{
                        abdominalXResult.setIntestinalObstruction("否");
                    }
                    }
                    else{
                        abdominalXResult.setIntestinalObstruction("否");
                    }
              }
                else{
                    abdominalXResult.setIntestinalObstruction("否");
                }
               }
               else{
                   abdominalXResult.setIntestinalObstruction("否");
               }
            }
           else{
               abdominalXResult.setIntestinalObstruction("否");
           }
            abdominalXResult.setDataVersion(abdom_xr_entry_results.getdata_version());
            abdominalXResult.setDataDbSource(abdom_xr_entry_results.getdata_db_source());
            abdominalXResult.setDataTableSource(abdom_xr_entry_results.getdata_table_source());
            abdominalXResult.setDataFieldSource(abdom_xr_entry_results.getdata_field_source());
            abdominalXResult.setCreatedAt(master.getCREATED_AT());
            abdominalXResult.setCreator(abdom_xr_entry_results.getcreator());
            abdominalXResult.setUpdatedAt(master.getUPDATED_AT());
            abdominalXResultMapper.saveAbdominalXResult(abdominalXResult);
        }

        }
    }
}


