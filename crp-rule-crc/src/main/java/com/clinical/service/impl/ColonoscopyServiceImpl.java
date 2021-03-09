package com.clinical.service.impl;
import com.clinical.dao.cluster.ColonoscopyMapper;
import com.clinical.dao.master.StandardResultMapper;
import com.clinical.dao.master.ZjColonEsDescriptionMapper;
import com.clinical.dao.master.ZjExamMasterMapper;
import com.clinical.model.cluster.AbdomenCtResult;
import com.clinical.model.cluster.Colonoscopy;
import com.clinical.model.master.ABDOM_CT_ENTRY_RESULTS;
import com.clinical.model.master.COLON_ES_DESCRIPTION;
import com.clinical.model.master.EXAM_MASTER;
import com.clinical.utils.JSONUtils;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.ColonoscopyService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ColonoscopyServiceImpl implements ColonoscopyService {

    @Autowired
    ColonoscopyMapper    colonoscopyMapper;

   @Autowired
   ZjExamMasterMapper zjExamMasterMapper;
   @Autowired
    ZjColonEsDescriptionMapper zjColonEsDescriptionMapper;
    @Autowired
    StandardResultMapper standardResultMapper;
    @Override
    public  void saveColonoscopy(Colonoscopy colonoscopy) {
         colonoscopyMapper.saveColonoscopy(colonoscopy);

     }

    @Override
    public void add() {
        List<COLON_ES_DESCRIPTION> zjColonEsDescriptionByALL = zjColonEsDescriptionMapper.findZjColonEsDescriptionByALL();
        for (COLON_ES_DESCRIPTION colon_es_description:zjColonEsDescriptionByALL) {
            Colonoscopy colonoscopy = new Colonoscopy();
            colonoscopy.setUniqueId(colon_es_description.getunique_id());
            colonoscopy.setUniqueIdLv1(colon_es_description.getunique_id_lv1());
            colonoscopy.setUniqueIdLv2(colon_es_description.getunique_id_lv2());
            colonoscopy.setP900(colon_es_description.getp900());
            colonoscopy.setPatientId(colon_es_description.getpatient_id());
            colonoscopy.setVisitId(colon_es_description.getvisit_id());
            colonoscopy.setDataVersion(colon_es_description.getdata_version());
            colonoscopy.setDataDbSource(colon_es_description.getdata_db_source());
            colonoscopy.setDataTableSource(colon_es_description.getdata_table_source());
            colonoscopy.setDataFieldSource(colon_es_description.getdata_field_source());
            colonoscopy.setCreatedAt(null);
            colonoscopy.setUpdatedAt(null);
            //neg_std为空时，保留structure_std、structure_site_std
            if (colon_es_description.getneg_std()==null){
                if (colon_es_description.getstructure_std()!=null){
                    String structure_std = Json2(colon_es_description.getstructure_std(), "structure_std");
                    String structure_site_std = Json(colon_es_description.getstructure_std(), "structure_site_std");
                    colonoscopy.setLesionLocation(structure_std+""+structure_site_std);
                }
            }

            if (colon_es_description.getdistance_std()!=null){
                String distance_unit_std = Json(colon_es_description.getdistance_std(), "distance_unit_std");
                String distance_to_anus_std = Json(colon_es_description.getdistance_std(), "distance_to_anus_std");

                colonoscopy.setDistanceToAnus(distance_to_anus_std+distance_unit_std);

            }
            if (colon_es_description.getsize_std()!=null){
                String size_std = Json(colon_es_description.getsize_std(), "size_std");
                colonoscopy.setLesionSize(size_std);
            }
            if (colon_es_description.getquantity_std()!=null){
                String quantity_std = Json(colon_es_description.getquantity_std(), "quantity_std");
                colonoscopy.setLesionNumber(quantity_std);
            }
            colonoscopyMapper.saveColonoscopy(colonoscopy);

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
    public String Json2(String s,String ss){
        String structure_stds = standardResultMapper.selectStandardResultById(s);
        List<String> structure_stdslist = JSONUtils.getList(structure_stds, "afterType2", ss);
        StringBuffer structure_std = new StringBuffer();
        for (String structure_std1: structure_stdslist) {
            structure_std.append(structure_std1);
        }
        return structure_std.toString();
    }
}