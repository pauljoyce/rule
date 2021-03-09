package com.clinical.service.impl;
import com.clinical.dao.cluster.RabatMapper;
import com.clinical.dao.master.StandardResultMapper;
import com.clinical.dao.master.ZjChestXrEntryResultsMapper;
import com.clinical.dao.master.ZjExamMasterMapper;
import com.clinical.model.cluster.Rabat;
import com.clinical.model.master.CHEST_XR_ENTRY_RESULTS;
import com.clinical.model.master.EXAM_MASTER;
import com.clinical.utils.JSONUtils;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.RabatService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RabatServiceImpl implements RabatService {

    @Autowired
    RabatMapper    rabatMapper;
    @Autowired
    ZjChestXrEntryResultsMapper zjChestXrEntryResultsMapper;
   @Autowired
    ZjExamMasterMapper  zjExamMasterMapper;


    @Autowired
    StandardResultMapper standardResultMapper;
    @Override
    public  void saveRabat(Rabat rabat) {
         rabatMapper.saveRabat(rabat);

     }

    @Override
    public void add() {

        List<CHEST_XR_ENTRY_RESULTS> zjChestXrEntryResultsByALL = zjChestXrEntryResultsMapper.findZjChestXrEntryResultsByALL();
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


}