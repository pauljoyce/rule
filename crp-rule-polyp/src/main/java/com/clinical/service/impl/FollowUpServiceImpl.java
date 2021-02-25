package com.clinical.service.impl;

import com.clinical.dao.cluster.FollowUpMapper;
import com.clinical.dao.master.ZjFollowUpMapper;
import com.clinical.model.cluster.FollowUp;
import com.clinical.model.master.FOLLOW_UP;
import org.springframework.beans.factory.annotation.Autowired;
import com.clinical.service.FollowUpService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FollowUpServiceImpl implements FollowUpService {

    @Autowired
    FollowUpMapper followUpMapper;
    @Autowired
    ZjFollowUpMapper zjfollowUpMapper;


    @Override
    public void saveFollowUp(FollowUp followUp) {
        followUpMapper.saveFollowUp(followUp);

    }

    @Override
    public void inFollowUp() {
        List<FOLLOW_UP> zjFollowUpByALL = zjfollowUpMapper.findZjFollowUpByALL();
        for (FOLLOW_UP followUp : zjFollowUpByALL) {
          /*  FollowUp follow = new FollowUp();
            follow.setUniqueId(followUp.getUNIQUE_ID());
            follow.setUniqueIdLv1(followUp.getUNIQUE_ID_LV1());
            follow.setUniqueIdLv2(followUp.getUNIQUE_ID_LV2());
            follow.setP900(followUp.getP900());
            follow.setPatientId(followUp.getPATIENT_ID());
            follow.setVisitId(followUp.getVISIT_ID());
            follow.setFollowUpType();
            follow.setFollowUpDate();
            follow.setFollowUpState();
            follow.setSituation();
            follow.setIfMedicine();
            follow.setMedicineName();
            follow.setMedicineDose();
            follow.setMedicineDuration();
            follow.setDeathCause();
            follow.setDeathDate();
            follow.setLastDate();
            follow.setFollowItem();
            follow.setEfficacyEvaluation();
            follow.setDataVersion(followUp.getDATA_VERSION());
            follow.setDataDbSource(followUp.getDATA_DB_SOURCE());
            follow.setDataTableSource(followUp.getDATA_TABLE_SOURCE());
            follow.setDataFieldSource(followUp.getDATA_FIELD_SOURCE());
            follow.setCreatedAt(followUp.getCREATED_AT());
            follow.setCreator(followUp.getCREATOR());
            follow.setUpdatedAt(followUp.getUPDATED_AT());

*/



        }

    }
}