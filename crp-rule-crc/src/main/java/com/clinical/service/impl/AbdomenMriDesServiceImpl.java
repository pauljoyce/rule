package com.clinical.service.impl;
import com.clinical.dao.cluster.AbdomenMriDesMapper;
import com.clinical.dao.master.StandardResultMapper;
import com.clinical.dao.master.ZjAbdomMrDescriptionMapper;
import com.clinical.dao.master.ZjAbdomMrEntryResultsMapper;
import com.clinical.dao.master.ZjExamMasterMapper;
import com.clinical.model.cluster.AbdomenMriDes;
import com.clinical.model.cluster.AbdomenMriResult;
import com.clinical.model.master.ABDOM_MR_DESCRIPTION;
import com.clinical.model.master.EXAM_MASTER;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.AbdomenMriDesService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AbdomenMriDesServiceImpl implements AbdomenMriDesService {

    @Autowired
    AbdomenMriDesMapper    abdomenMriDesMapper;

    @Autowired
    ZjExamMasterMapper zjExamMasterMapper;
    @Autowired
    ZjAbdomMrEntryResultsMapper zjAbdomMrEntryResultsMapper;
    @Autowired
    StandardResultMapper standardResultMapper;
    @Autowired
    ZjAbdomMrDescriptionMapper zjAbdomMrDescriptionMapper;

    @Override
    public  void saveAbdomenMriDes(AbdomenMriDes abdomenMriDes) {
         abdomenMriDesMapper.saveAbdomenMriDes(abdomenMriDes);

     }

    @Override
    public void add() {
        List<ABDOM_MR_DESCRIPTION> zjAbdomMrDescriptionByALL = zjAbdomMrDescriptionMapper.findZjAbdomMrDescriptionByALL();

       /* for (ABDOM_MR_DESCRIPTION abdom_mr_description: zjAbdomMrDescriptionByALL) {

            List<EXAM_MASTER> zjExamMasterByUniqueId = zjExamMasterMapper.findZjExamMasterById(abdom_mr_description.getunique_id());
            AbdomenMriDes abdomenMriDes = new AbdomenMriDes;
            for (EXAM_MASTER exam_master: zjExamMasterByUniqueId) {
                abdomenMriDes.setUniqueId(exam_master.getUNIQUE_ID());
                abdomenMriDes.setUniqueIdLv1(exam_master.getUNIQUE_ID_LV1());
                abdomenMriDes.setUniqueIdLv2(exam_master.getUNIQUE_ID_LV2());
                abdomenMriDes.setP900(exam_master.getP900());
                abdomenMriDes.setPatientId(exam_master.getPATIENT_ID());
                abdomenMriDes.setVisitId(exam_master.getVISIT_ID());
                abdomenMriDes.setExamNo(exam_master.getEXAM_NO());
                abdomenMriDes.setExamName(exam_master.getENTRY_NAME());
                abdomenMriDes.setDataVersion(exam_master.getDATA_VERSION());
                abdomenMriDes.setDataDbSource(exam_master.getDATA_DB_SOURCE());
                abdomenMriDes.setDataTableSource(exam_master.getDATA_TABLE_SOURCE());
                abdomenMriDes.setDataFieldSource(exam_master.getDATA_FIELD_SOURCE());
                abdomenMriDes.setCreatedAt(exam_master.getCREATED_AT());
                abdomenMriDes.setUpdatedAt(exam_master.getUPDATED_AT());

        }
            abdomenMriDes.setStructure(abdom_mr_description.getstructure());
            abdomenMriDes.setLocation(abdom_mr_description.getlocation());
            abdomenMriDes.setLesion(abdom_mr_description.getlesion());
            abdomenMriDes.setSize(abdom_mr_description.getsize());
            abdomenMriDes.setQuanity(abdom_mr_description.getquantity());
            if (abdom_mr_description.getquantity_std()!=null){
            }
        }

          */
        }
}