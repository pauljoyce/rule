package com.clinical.service.impl;
import com.clinical.dao.cluster.ChectCtResultMapper;
import com.clinical.dao.master.StandardResultMapper;
import com.clinical.dao.master.ZjChestCtEntryResultsMapper;
import com.clinical.dao.master.ZjExamMasterMapper;
import com.clinical.model.cluster.ChectCtResult;
import com.clinical.model.master.CHEST_CT_ENTRY_RESULTS;
import com.clinical.model.master.EXAM_MASTER;
import com.clinical.utils.JSONUtils;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.ChectCtResultService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChectCtResultServiceImpl implements ChectCtResultService {

    @Autowired
    ChectCtResultMapper    chectCtResultMapper;

    @Autowired
    ZjExamMasterMapper zjExamMasterMapper;

    @Autowired
    ZjChestCtEntryResultsMapper zjChestCtEntryResultsMapper;
    @Autowired
    StandardResultMapper standardResultMapper;


    @Override
    public  void saveChectCtResult(ChectCtResult chectCtResult) {
         chectCtResultMapper.saveChectCtResult(chectCtResult);

     }

    @Override
    public void add() {
        List<CHEST_CT_ENTRY_RESULTS> zjChestCtEntryResultsByALL = zjChestCtEntryResultsMapper.findZjChestCtEntryResultsByALL();
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
}