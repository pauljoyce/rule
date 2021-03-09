package com.clinical.service.impl;
import com.clinical.dao.cluster.SurgicalRecordMapper;
import com.clinical.dao.master.StandardResultMapper;
import com.clinical.dao.master.ZjSurgicalRecordMapper;
import com.clinical.dao.master.ZjTemOperationRecordMapper;
import com.clinical.model.cluster.OperationRecord;
import com.clinical.model.cluster.SurgicalRecord;
import com.clinical.model.master.SURGICAL_RECORD;
import com.clinical.model.master.TEM_OPERATION_RECORD;
import com.clinical.utils.JSONUtils;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.SurgicalRecordService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SurgicalRecordServiceImpl implements SurgicalRecordService {

    @Autowired
    SurgicalRecordMapper    surgicalRecordMapper;
    @Autowired
    StandardResultMapper standardResultMapper;
    @Autowired
    ZjTemOperationRecordMapper zjTemOperationRecordMapper;
    @Autowired
    ZjSurgicalRecordMapper zjSurgicalRecordMapper;
    @Override
    public  void saveSurgicalRecord(SurgicalRecord surgicalRecord) {
         surgicalRecordMapper.saveSurgicalRecord(surgicalRecord);

     }

    @Override
    public void add() {
      List<SURGICAL_RECORD> zjSurgicalRecordByUniqueId = zjSurgicalRecordMapper.findZjSurgicalRecordByALL();
            for (SURGICAL_RECORD surgical_record:zjSurgicalRecordByUniqueId) {
                SurgicalRecord surgicalRecord = new SurgicalRecord();
                surgicalRecord.setUniqueId(surgical_record.getunique_id());
                surgicalRecord.setUniqueIdLv1(surgical_record.getunique_id_lv1());
                surgicalRecord.setUniqueIdLv2(surgical_record.getunique_id_lv2());
                surgicalRecord.setP900(surgical_record.getp900());
                surgicalRecord.setPatientId(surgical_record.getpatient_id());
                surgicalRecord.setVisitId(surgical_record.getvisit_id());
                //检索到“根治术”则为是；其他为否 op_method_std
                if (surgical_record.getop_method_std()!=null){
                    String op_method_std = Json(surgical_record.getop_method_std(), "op_method_std");
                    if (op_method_std.contains("根治术")){
                        surgicalRecord.setRadicalOperation("是");
                    }

                }
                if (surgical_record.getreconstruction_method_std()!=null){
                    //reconstruction_method_std
                    String reconstruction_method_std = Json(surgical_record.getreconstruction_method_std(), "reconstruction_method_std");
                    surgicalRecord.setReconstructionMethods(reconstruction_method_std);

                }
               // cut_std
                if (surgical_record.getcut_std()!=null){
                    String cut_std = Json(surgical_record.getcut_std(), "cut_std");
                    System.out.println(cut_std);
                    if (cut_std.contains("上腹")){
                        surgicalRecord.setIncisionEpigastric("是");
                    }
                }
                if (surgical_record.getcut_std()!=null){
                    String cut_std = Json(surgical_record.getcut_std(), "cut_std");
                    if (cut_std.contains("绕脐")){
                        surgicalRecord.setIncisionAroundNavel("是");
                    }
                }
                if (surgical_record.getcut_std()!=null){
                    String cut_std = Json(surgical_record.getcut_std(), "cut_std");
                    if (cut_std.contains("下腹")){
                        surgicalRecord.setIncisionalLowerAbdomen("是");
                    }
                }
                if (surgical_record.getpara_value_std()!=null){
                    String para_value_std = Json(surgical_record.getpara_value_std(), "para_value_std");
                    surgicalRecord.setIncisionLength(para_value_std);

                }
                if (surgical_record.getintraop_scope_std()!=null){
                    surgicalRecord.setIntraoperativeEnteroscopy("是");

                }
                if (surgical_record.getintraop_lavage_std()!=null){
                    surgicalRecord.setIntraoperativeLavage("是");

                }
                if (surgical_record.getintraop_chemo_std()!=null){
                    surgicalRecord.setIntraoperativeChemotherapy("是");

                }
                if (surgical_record.getdrain_std()!=null){
                    surgicalRecord.setIndwellingDrainageTube("是");

                }
                // chemotherapeutic_drugs	术中化疗药物
                if (surgical_record.getintraop_chemo_std()!=null){
                    String intraop_chemo_std = Json(surgical_record.getintraop_chemo_std(), "intraop_chemo_std");
                        surgicalRecord.setChemotherapeuticDrugs(intraop_chemo_std);

                }

                if (surgicalRecord.getRadicalOperation()==null){
                    surgicalRecord.setRadicalOperation("否");
                }
                if (surgicalRecord.getIncisionEpigastric()==null){
                    surgicalRecord.setIncisionEpigastric("否");
                }
                if (surgicalRecord.getIncisionAroundNavel()==null){
                    surgicalRecord.setIncisionAroundNavel("否");
                }
                if (surgicalRecord.getIncisionalLowerAbdomen()==null){
                    surgicalRecord.setIncisionalLowerAbdomen("否");
                }
                // intraoperative_enteroscopy	是否术中肠镜
                if (surgicalRecord.getIntraoperativeEnteroscopy()==null){
                    surgicalRecord.setIntraoperativeEnteroscopy("否");
                }
                // intraoperative_lavage	术中灌洗

                if (surgicalRecord.getIntraoperativeLavage()==null){
                    surgicalRecord.setIntraoperativeLavage("否");
                }
                // intraoperative_chemotherapy	术中化疗
                if (surgicalRecord.getIntraoperativeChemotherapy()==null){
                    surgicalRecord.setIntraoperativeChemotherapy("否");
                }

                //indwelling_drainage_tube	术中是否留置引流管
                if (surgicalRecord.getIndwellingDrainageTube()==null){
                    surgicalRecord.setIndwellingDrainageTube("否");
                }
                surgicalRecord.setDataVersion(surgical_record.getdata_version());
                surgicalRecord.setDataDbSource(surgical_record.getdata_db_source());
                surgicalRecord.setDataTableSource(surgical_record.getdata_table_source());
                surgicalRecord.setDataFieldSource(surgical_record.getdata_field_source());
                surgicalRecord.setCreator(surgical_record.getcreator());
                surgicalRecord.setCreatedAt(null);
                surgicalRecord.setUpdatedAt(null);
                surgicalRecordMapper.saveSurgicalRecord(surgicalRecord);
            }
            // radical_operation	手术术式是否为根治术

        }
   // }



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