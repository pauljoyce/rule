package com.clinical.service.impl;
import com.clinical.dao.cluster.LisRecordMapper;
import com.clinical.dao.master.ZjLisRecordMapper;
import com.clinical.model.cluster.LisRecord;
import com.clinical.model.master.LIS_RECORD;
import org.springframework.beans.factory.annotation.Autowired;import com.clinical.service.LisRecordService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LisRecordServiceImpl implements LisRecordService {

    @Autowired
    LisRecordMapper    lisRecordMapper;
    @Autowired
    ZjLisRecordMapper  zjLisRecordMapper;

    @Override
    public  void saveLisRecord(LisRecord lisRecord) {
         lisRecordMapper.saveLisRecord(lisRecord);

     }

    @Override
    public void inLisRecord() {
       // List<com.clinical.model.cluster.LisRecord> list=new ArrayList<com.clinical.model.cluster.LisRecord>();
        List<LIS_RECORD> zjLisRecordByALL = zjLisRecordMapper.findZjLisRecordByALL();

        for (LIS_RECORD lis_record:zjLisRecordByALL ) {
            LisRecord lisRecord = new LisRecord();
            lisRecord.setUniqueId(lis_record.getUNIQUE_ID());
            lisRecord.setUniqueIdLv1(lis_record.getUNIQUE_ID_LV1());
            lisRecord.setUniqueIdLv2(lis_record.getUNIQUE_ID_LV2());
            lisRecord.setP900(lis_record.getP900());
            lisRecord.setPatientId(lis_record.getPATIENT_ID());
            lisRecord.setVisitType(lis_record.getVISIT_TYPE());
            lisRecord.setVisitId(lis_record.getVISIT_ID());
            lisRecord.setAdmissionNumber(lis_record.getADMISSION_NUMBER());

            lisRecord.setTestNo(lis_record.getTEST_NO());
            lisRecord.setSpcmType(lis_record.getSPCM_TYPE());
            lisRecord.setSpcmReceivedDateTime(lis_record.getSPCM_RECEIVED_DATE_TIME());
            lisRecord.setSpcmSampleDateTime(lis_record.getSPCM_SAMPLE_DATE_TIME());
            lisRecord.setRequestedDateTime(lis_record.getREQUESTED_DATE_TIME());
            lisRecord.setResultRptDateTime(lis_record.getRESULT_RPT_DATE_TIME());
            lisRecord.setResultDateTime(lis_record.getRESULT_DATE_TIME());
            lisRecord.setPrintOrder(lis_record.getPRINT_ORDER());
            lisRecord.setTestPackageName(lis_record.getTEST_PACKAGE_NAME());
            lisRecord.setTestItemName(lis_record.getTEST_ITEM_NAME());
            lisRecord.setResult(lis_record.getRESULT());
            lisRecord.setUnits(lis_record.getUNITS());
            lisRecord.setAbnormalIndicator(lis_record.getABNORMAL_INDICATOR());
            lisRecord.setReferenceInterval(lis_record.getREFERENCE_INTERVAL());
            lisRecord.setSpcmTypeStd(lis_record.getSPCM_TYPE_STD());
            lisRecord.setTestItemNameStd(lis_record.getTEST_ITEM_NAME_STD());

            lisRecord.setDataVersion(lis_record.getDATA_VERSION());
            lisRecord.setDataDbSource(lis_record.getDATA_DB_SOURCE());
            lisRecord.setDataTableSource(lis_record.getDATA_TABLE_SOURCE());
            lisRecord.setDataFieldSource(lis_record.getDATA_FIELD_SOURCE());
            lisRecord.setCreatedAt(lis_record.getCREATED_AT());
            lisRecord.setCreator(lis_record.getCREATOR());
            lisRecord.setUpdatedAt(lis_record.getUPDATED_AT());
            lisRecordMapper.saveLisRecord(lisRecord);
        }


    }
}