package com.clinical.model.master;
import java.util.Date;
public class TEM_OPERATION_RECORD{
    //主键id
    private Integer ID;
    //唯一标识
    private String UNIQUE_ID;
    //关联1级表unique_id
    private String UNIQUE_ID_LV1;
    //关联2级表unique_id
    private String UNIQUE_ID_LV2;
    //医疗机构代码
    private String P900;
    //患者id
    private String PATIENT_ID;
    //住院号
    private String VISIT_ID;
    //病房号
    private String ROOM_NO;
    //病床号
    private String BED_NO;
    //活动记录状态
    private String RECORD_STATUS;
    //就诊类型
    private Integer VISIT_TYPE;
    //科室名称
    private String DEPARTMENT_NAME;
    //病区
    private String INPATIENT_AREA;
    //年龄
    private Integer AGE;
    //住院次数
    private Integer ADMISSION_NUMBER;
    //病人姓名
    private String TPATNAME;
    //病案号
    private String TPATNO;
    //手术编号
    private String SURGERY_SN;
    //手术名称
    private String RCPT_NO;
    //手术操作主题
    private String OPERATION_TOPIC;
    //手术操作详细信息
    private String OPERATION_DETAIL_NOTE;
    //手术过程描述
    private String SURGICAL_DESCRIPTION;
    //术中所见
    private String SURGICAL_FINDINGS;
    //术中意外
    private String SURGICAL_ACCIDENT;
    //皮肤消毒描述
    private String SKIN_STERILIZATION_DESCRIPTION;
    //影像号
    private String IMAGE_NO;
    //手术及操作编码
    private String ITEM_NO;
    //手术开始日期时间
    private Date ITEM_BEGIN_DATE;
    //手术结束日期时间
    private Date ITEM_END_DATE;
    //手术级别代码
    private String ITEM_CODE;
    //手术目标部位名称
    private String ITEM_NAME;
    //手术史标志
    private String ITEMSPEC;
    //手术切口描述
    private String ITEM_INCISION_DESCRIPTION;
    //引流标志
    private String PERFORMED_BY;
    //出血量
    private String BLEEDING_VOLUME;
    //输液量
    private String TRANSFUSION_VOLUME;
    //术中输血量
    private String BLOOD_TRANSFUSION_VOLUME;
    //自体输血量
    private String AUTOLOGOUS_VOLUME_BLOOD;
    //术中出入量情况
    private String INTRAOPERATIVE_VOLUME;
    //术前简历
    private String PRE_OPERATIVE_BRIEF_DESCRIPTION;
    //术前用药
    private String SUB_ORDER_NO;
    //术中用药
    private String PRINTED_RCPT_NO;
    //输血反应标志
    private String ADMINISTRATION;
    //手术医师姓名
    private String NAME_OF_SURGEON;
    //i助姓名
    private String NAME_1;
    //ii助姓名
    private String NAME_2;
    //手术护士
    private String NAME_NUR;
    //麻醉方式代码
    private String ANESTHESIA_CODE;
    //麻醉方式
    private String ANESTHESIA_METHOD;
    //asa分级
    private String ASA_RATING;
    //手术间编号
    private String OPERATING_ROOM_NO;
    //手术间名称
    private String OPERATING_ROOM;
    //拟施手术
    private String PLANNED_SURGERY;
    //拟施麻醉
    private String PLANNED_ANESTHESIA;
    //手术体位
    private String SURGICAL_POSITION;
    //麻醉前用药
    private String MEDICATION_BEFORE_ANES;
    //麻醉中用药
    private String MEDICATION_AT_ANES;
    //麻醉并发症
    private String ANESTHESIA_COMPLICATIONS;
    //麻醉医师
    private String ANESTHESIOLOGIST;
    //术前诊断
    private String DIAG_PREOPERATION;
    //术后诊断
    private String DIAG_POSTOPERATION;
    //手术简要经过
    private String SURGICAL_PROCESS;
    //术后并发症
    private String POSTOPERATION_COMPLITE;
    //术后镇痛
    private String POSTOPERATIVE_ANALGESIA;
    //术后患者去向
    private String POSTOPERATIVE_DESTINATION;
    //术后回访
    private String POSTOPERATIVE_VISIT;
    //数据版本
    private String DATA_VERSION;
    //数据库来源
    private String DATA_DB_SOURCE;
    //数据表来源
    private String DATA_TABLE_SOURCE;
    //数据项来源
    private String DATA_FIELD_SOURCE;
    //创建时间
    private Date CREATED_AT;
    //创建人
    private String CREATOR;
    //修改时间
    private Date UPDATED_AT;
    //修改人
    private String UPDATOR;
    //修改备注
    private String UPDATED_NOTE;
    //数据状态
    private String DATA_STATE;
    //停用时间
    private Date DISABLE_TIME;
    //停用人
    private String DISABLE_OPERATOR;
    //停用说明
    private String DISABLE_NOTE;
    //数据校验
    private String DATA_CHECK;
    //是否删除
    private Integer DEL_FLAG;
    //批号
    private String BATCH_NUMBER;
    //MD5标识
    private String MD5;
    //建立操作平台
    private String BUILD_PLATFORM;
    //探查
    private String SURGICAL_EXPLORATION;
    //手术总结
    private String SURGERY_SUMMARY;
    //标本解剖
    private String SPECIMEN_ANATOMY;
    //术式评价
    private String SURGICAL_EVALUATION;
    //术中诊断
    private String IN_OP_DIAGNOSIS;

    public Integer getID(){
        return ID;
    } 
    public void setID(Integer ID) {
         this.ID = ID;
    } 
    public String getUNIQUE_ID(){
        return UNIQUE_ID;
    } 
    public void setUNIQUE_ID(String UNIQUE_ID) {
         this.UNIQUE_ID = UNIQUE_ID;
    } 
    public String getUNIQUE_ID_LV1(){
        return UNIQUE_ID_LV1;
    } 
    public void setUNIQUE_ID_LV1(String UNIQUE_ID_LV1) {
         this.UNIQUE_ID_LV1 = UNIQUE_ID_LV1;
    } 
    public String getUNIQUE_ID_LV2(){
        return UNIQUE_ID_LV2;
    } 
    public void setUNIQUE_ID_LV2(String UNIQUE_ID_LV2) {
         this.UNIQUE_ID_LV2 = UNIQUE_ID_LV2;
    } 
    public String getP900(){
        return P900;
    } 
    public void setP900(String P900) {
         this.P900 = P900;
    } 
    public String getPATIENT_ID(){
        return PATIENT_ID;
    } 
    public void setPATIENT_ID(String PATIENT_ID) {
         this.PATIENT_ID = PATIENT_ID;
    } 
    public String getVISIT_ID(){
        return VISIT_ID;
    } 
    public void setVISIT_ID(String VISIT_ID) {
         this.VISIT_ID = VISIT_ID;
    } 
    public String getROOM_NO(){
        return ROOM_NO;
    } 
    public void setROOM_NO(String ROOM_NO) {
         this.ROOM_NO = ROOM_NO;
    } 
    public String getBED_NO(){
        return BED_NO;
    } 
    public void setBED_NO(String BED_NO) {
         this.BED_NO = BED_NO;
    } 
    public String getRECORD_STATUS(){
        return RECORD_STATUS;
    } 
    public void setRECORD_STATUS(String RECORD_STATUS) {
         this.RECORD_STATUS = RECORD_STATUS;
    } 
    public Integer getVISIT_TYPE(){
        return VISIT_TYPE;
    } 
    public void setVISIT_TYPE(Integer VISIT_TYPE) {
         this.VISIT_TYPE = VISIT_TYPE;
    } 
    public String getDEPARTMENT_NAME(){
        return DEPARTMENT_NAME;
    } 
    public void setDEPARTMENT_NAME(String DEPARTMENT_NAME) {
         this.DEPARTMENT_NAME = DEPARTMENT_NAME;
    } 
    public String getINPATIENT_AREA(){
        return INPATIENT_AREA;
    } 
    public void setINPATIENT_AREA(String INPATIENT_AREA) {
         this.INPATIENT_AREA = INPATIENT_AREA;
    } 
    public Integer getAGE(){
        return AGE;
    } 
    public void setAGE(Integer AGE) {
         this.AGE = AGE;
    } 
    public Integer getADMISSION_NUMBER(){
        return ADMISSION_NUMBER;
    } 
    public void setADMISSION_NUMBER(Integer ADMISSION_NUMBER) {
         this.ADMISSION_NUMBER = ADMISSION_NUMBER;
    } 
    public String getTPATNAME(){
        return TPATNAME;
    } 
    public void setTPATNAME(String TPATNAME) {
         this.TPATNAME = TPATNAME;
    } 
    public String getTPATNO(){
        return TPATNO;
    } 
    public void setTPATNO(String TPATNO) {
         this.TPATNO = TPATNO;
    } 
    public String getSURGERY_SN(){
        return SURGERY_SN;
    } 
    public void setSURGERY_SN(String SURGERY_SN) {
         this.SURGERY_SN = SURGERY_SN;
    } 
    public String getRCPT_NO(){
        return RCPT_NO;
    } 
    public void setRCPT_NO(String RCPT_NO) {
         this.RCPT_NO = RCPT_NO;
    } 
    public String getOPERATION_TOPIC(){
        return OPERATION_TOPIC;
    } 
    public void setOPERATION_TOPIC(String OPERATION_TOPIC) {
         this.OPERATION_TOPIC = OPERATION_TOPIC;
    } 
    public String getOPERATION_DETAIL_NOTE(){
        return OPERATION_DETAIL_NOTE;
    } 
    public void setOPERATION_DETAIL_NOTE(String OPERATION_DETAIL_NOTE) {
         this.OPERATION_DETAIL_NOTE = OPERATION_DETAIL_NOTE;
    } 
    public String getSURGICAL_DESCRIPTION(){
        return SURGICAL_DESCRIPTION;
    } 
    public void setSURGICAL_DESCRIPTION(String SURGICAL_DESCRIPTION) {
         this.SURGICAL_DESCRIPTION = SURGICAL_DESCRIPTION;
    } 
    public String getSURGICAL_FINDINGS(){
        return SURGICAL_FINDINGS;
    } 
    public void setSURGICAL_FINDINGS(String SURGICAL_FINDINGS) {
         this.SURGICAL_FINDINGS = SURGICAL_FINDINGS;
    } 
    public String getSURGICAL_ACCIDENT(){
        return SURGICAL_ACCIDENT;
    } 
    public void setSURGICAL_ACCIDENT(String SURGICAL_ACCIDENT) {
         this.SURGICAL_ACCIDENT = SURGICAL_ACCIDENT;
    } 
    public String getSKIN_STERILIZATION_DESCRIPTION(){
        return SKIN_STERILIZATION_DESCRIPTION;
    } 
    public void setSKIN_STERILIZATION_DESCRIPTION(String SKIN_STERILIZATION_DESCRIPTION) {
         this.SKIN_STERILIZATION_DESCRIPTION = SKIN_STERILIZATION_DESCRIPTION;
    } 
    public String getIMAGE_NO(){
        return IMAGE_NO;
    } 
    public void setIMAGE_NO(String IMAGE_NO) {
         this.IMAGE_NO = IMAGE_NO;
    } 
    public String getITEM_NO(){
        return ITEM_NO;
    } 
    public void setITEM_NO(String ITEM_NO) {
         this.ITEM_NO = ITEM_NO;
    } 
    public Date getITEM_BEGIN_DATE(){
        return ITEM_BEGIN_DATE;
    } 
    public void setITEM_BEGIN_DATE(Date ITEM_BEGIN_DATE) {
         this.ITEM_BEGIN_DATE = ITEM_BEGIN_DATE;
    } 
    public Date getITEM_END_DATE(){
        return ITEM_END_DATE;
    } 
    public void setITEM_END_DATE(Date ITEM_END_DATE) {
         this.ITEM_END_DATE = ITEM_END_DATE;
    } 
    public String getITEM_CODE(){
        return ITEM_CODE;
    } 
    public void setITEM_CODE(String ITEM_CODE) {
         this.ITEM_CODE = ITEM_CODE;
    } 
    public String getITEM_NAME(){
        return ITEM_NAME;
    } 
    public void setITEM_NAME(String ITEM_NAME) {
         this.ITEM_NAME = ITEM_NAME;
    } 
    public String getITEMSPEC(){
        return ITEMSPEC;
    } 
    public void setITEMSPEC(String ITEMSPEC) {
         this.ITEMSPEC = ITEMSPEC;
    } 
    public String getITEM_INCISION_DESCRIPTION(){
        return ITEM_INCISION_DESCRIPTION;
    } 
    public void setITEM_INCISION_DESCRIPTION(String ITEM_INCISION_DESCRIPTION) {
         this.ITEM_INCISION_DESCRIPTION = ITEM_INCISION_DESCRIPTION;
    } 
    public String getPERFORMED_BY(){
        return PERFORMED_BY;
    } 
    public void setPERFORMED_BY(String PERFORMED_BY) {
         this.PERFORMED_BY = PERFORMED_BY;
    } 
    public String getBLEEDING_VOLUME(){
        return BLEEDING_VOLUME;
    } 
    public void setBLEEDING_VOLUME(String BLEEDING_VOLUME) {
         this.BLEEDING_VOLUME = BLEEDING_VOLUME;
    } 
    public String getTRANSFUSION_VOLUME(){
        return TRANSFUSION_VOLUME;
    } 
    public void setTRANSFUSION_VOLUME(String TRANSFUSION_VOLUME) {
         this.TRANSFUSION_VOLUME = TRANSFUSION_VOLUME;
    } 
    public String getBLOOD_TRANSFUSION_VOLUME(){
        return BLOOD_TRANSFUSION_VOLUME;
    } 
    public void setBLOOD_TRANSFUSION_VOLUME(String BLOOD_TRANSFUSION_VOLUME) {
         this.BLOOD_TRANSFUSION_VOLUME = BLOOD_TRANSFUSION_VOLUME;
    } 
    public String getAUTOLOGOUS_VOLUME_BLOOD(){
        return AUTOLOGOUS_VOLUME_BLOOD;
    } 
    public void setAUTOLOGOUS_VOLUME_BLOOD(String AUTOLOGOUS_VOLUME_BLOOD) {
         this.AUTOLOGOUS_VOLUME_BLOOD = AUTOLOGOUS_VOLUME_BLOOD;
    } 
    public String getINTRAOPERATIVE_VOLUME(){
        return INTRAOPERATIVE_VOLUME;
    } 
    public void setINTRAOPERATIVE_VOLUME(String INTRAOPERATIVE_VOLUME) {
         this.INTRAOPERATIVE_VOLUME = INTRAOPERATIVE_VOLUME;
    } 
    public String getPRE_OPERATIVE_BRIEF_DESCRIPTION(){
        return PRE_OPERATIVE_BRIEF_DESCRIPTION;
    } 
    public void setPRE_OPERATIVE_BRIEF_DESCRIPTION(String PRE_OPERATIVE_BRIEF_DESCRIPTION) {
         this.PRE_OPERATIVE_BRIEF_DESCRIPTION = PRE_OPERATIVE_BRIEF_DESCRIPTION;
    } 
    public String getSUB_ORDER_NO(){
        return SUB_ORDER_NO;
    } 
    public void setSUB_ORDER_NO(String SUB_ORDER_NO) {
         this.SUB_ORDER_NO = SUB_ORDER_NO;
    } 
    public String getPRINTED_RCPT_NO(){
        return PRINTED_RCPT_NO;
    } 
    public void setPRINTED_RCPT_NO(String PRINTED_RCPT_NO) {
         this.PRINTED_RCPT_NO = PRINTED_RCPT_NO;
    } 
    public String getADMINISTRATION(){
        return ADMINISTRATION;
    } 
    public void setADMINISTRATION(String ADMINISTRATION) {
         this.ADMINISTRATION = ADMINISTRATION;
    } 
    public String getNAME_OF_SURGEON(){
        return NAME_OF_SURGEON;
    } 
    public void setNAME_OF_SURGEON(String NAME_OF_SURGEON) {
         this.NAME_OF_SURGEON = NAME_OF_SURGEON;
    } 
    public String getNAME_1(){
        return NAME_1;
    } 
    public void setNAME_1(String NAME_1) {
         this.NAME_1 = NAME_1;
    } 
    public String getNAME_2(){
        return NAME_2;
    } 
    public void setNAME_2(String NAME_2) {
         this.NAME_2 = NAME_2;
    } 
    public String getNAME_NUR(){
        return NAME_NUR;
    } 
    public void setNAME_NUR(String NAME_NUR) {
         this.NAME_NUR = NAME_NUR;
    } 
    public String getANESTHESIA_CODE(){
        return ANESTHESIA_CODE;
    } 
    public void setANESTHESIA_CODE(String ANESTHESIA_CODE) {
         this.ANESTHESIA_CODE = ANESTHESIA_CODE;
    } 
    public String getANESTHESIA_METHOD(){
        return ANESTHESIA_METHOD;
    } 
    public void setANESTHESIA_METHOD(String ANESTHESIA_METHOD) {
         this.ANESTHESIA_METHOD = ANESTHESIA_METHOD;
    } 
    public String getASA_RATING(){
        return ASA_RATING;
    } 
    public void setASA_RATING(String ASA_RATING) {
         this.ASA_RATING = ASA_RATING;
    } 
    public String getOPERATING_ROOM_NO(){
        return OPERATING_ROOM_NO;
    } 
    public void setOPERATING_ROOM_NO(String OPERATING_ROOM_NO) {
         this.OPERATING_ROOM_NO = OPERATING_ROOM_NO;
    } 
    public String getOPERATING_ROOM(){
        return OPERATING_ROOM;
    } 
    public void setOPERATING_ROOM(String OPERATING_ROOM) {
         this.OPERATING_ROOM = OPERATING_ROOM;
    } 
    public String getPLANNED_SURGERY(){
        return PLANNED_SURGERY;
    } 
    public void setPLANNED_SURGERY(String PLANNED_SURGERY) {
         this.PLANNED_SURGERY = PLANNED_SURGERY;
    } 
    public String getPLANNED_ANESTHESIA(){
        return PLANNED_ANESTHESIA;
    } 
    public void setPLANNED_ANESTHESIA(String PLANNED_ANESTHESIA) {
         this.PLANNED_ANESTHESIA = PLANNED_ANESTHESIA;
    } 
    public String getSURGICAL_POSITION(){
        return SURGICAL_POSITION;
    } 
    public void setSURGICAL_POSITION(String SURGICAL_POSITION) {
         this.SURGICAL_POSITION = SURGICAL_POSITION;
    } 
    public String getMEDICATION_BEFORE_ANES(){
        return MEDICATION_BEFORE_ANES;
    } 
    public void setMEDICATION_BEFORE_ANES(String MEDICATION_BEFORE_ANES) {
         this.MEDICATION_BEFORE_ANES = MEDICATION_BEFORE_ANES;
    } 
    public String getMEDICATION_AT_ANES(){
        return MEDICATION_AT_ANES;
    } 
    public void setMEDICATION_AT_ANES(String MEDICATION_AT_ANES) {
         this.MEDICATION_AT_ANES = MEDICATION_AT_ANES;
    } 
    public String getANESTHESIA_COMPLICATIONS(){
        return ANESTHESIA_COMPLICATIONS;
    } 
    public void setANESTHESIA_COMPLICATIONS(String ANESTHESIA_COMPLICATIONS) {
         this.ANESTHESIA_COMPLICATIONS = ANESTHESIA_COMPLICATIONS;
    } 
    public String getANESTHESIOLOGIST(){
        return ANESTHESIOLOGIST;
    } 
    public void setANESTHESIOLOGIST(String ANESTHESIOLOGIST) {
         this.ANESTHESIOLOGIST = ANESTHESIOLOGIST;
    } 
    public String getDIAG_PREOPERATION(){
        return DIAG_PREOPERATION;
    } 
    public void setDIAG_PREOPERATION(String DIAG_PREOPERATION) {
         this.DIAG_PREOPERATION = DIAG_PREOPERATION;
    } 
    public String getDIAG_POSTOPERATION(){
        return DIAG_POSTOPERATION;
    } 
    public void setDIAG_POSTOPERATION(String DIAG_POSTOPERATION) {
         this.DIAG_POSTOPERATION = DIAG_POSTOPERATION;
    } 
    public String getSURGICAL_PROCESS(){
        return SURGICAL_PROCESS;
    } 
    public void setSURGICAL_PROCESS(String SURGICAL_PROCESS) {
         this.SURGICAL_PROCESS = SURGICAL_PROCESS;
    } 
    public String getPOSTOPERATION_COMPLITE(){
        return POSTOPERATION_COMPLITE;
    } 
    public void setPOSTOPERATION_COMPLITE(String POSTOPERATION_COMPLITE) {
         this.POSTOPERATION_COMPLITE = POSTOPERATION_COMPLITE;
    } 
    public String getPOSTOPERATIVE_ANALGESIA(){
        return POSTOPERATIVE_ANALGESIA;
    } 
    public void setPOSTOPERATIVE_ANALGESIA(String POSTOPERATIVE_ANALGESIA) {
         this.POSTOPERATIVE_ANALGESIA = POSTOPERATIVE_ANALGESIA;
    } 
    public String getPOSTOPERATIVE_DESTINATION(){
        return POSTOPERATIVE_DESTINATION;
    } 
    public void setPOSTOPERATIVE_DESTINATION(String POSTOPERATIVE_DESTINATION) {
         this.POSTOPERATIVE_DESTINATION = POSTOPERATIVE_DESTINATION;
    } 
    public String getPOSTOPERATIVE_VISIT(){
        return POSTOPERATIVE_VISIT;
    } 
    public void setPOSTOPERATIVE_VISIT(String POSTOPERATIVE_VISIT) {
         this.POSTOPERATIVE_VISIT = POSTOPERATIVE_VISIT;
    } 
    public String getDATA_VERSION(){
        return DATA_VERSION;
    } 
    public void setDATA_VERSION(String DATA_VERSION) {
         this.DATA_VERSION = DATA_VERSION;
    } 
    public String getDATA_DB_SOURCE(){
        return DATA_DB_SOURCE;
    } 
    public void setDATA_DB_SOURCE(String DATA_DB_SOURCE) {
         this.DATA_DB_SOURCE = DATA_DB_SOURCE;
    } 
    public String getDATA_TABLE_SOURCE(){
        return DATA_TABLE_SOURCE;
    } 
    public void setDATA_TABLE_SOURCE(String DATA_TABLE_SOURCE) {
         this.DATA_TABLE_SOURCE = DATA_TABLE_SOURCE;
    } 
    public String getDATA_FIELD_SOURCE(){
        return DATA_FIELD_SOURCE;
    } 
    public void setDATA_FIELD_SOURCE(String DATA_FIELD_SOURCE) {
         this.DATA_FIELD_SOURCE = DATA_FIELD_SOURCE;
    } 
    public Date getCREATED_AT(){
        return CREATED_AT;
    } 
    public void setCREATED_AT(Date CREATED_AT) {
         this.CREATED_AT = CREATED_AT;
    } 
    public String getCREATOR(){
        return CREATOR;
    } 
    public void setCREATOR(String CREATOR) {
         this.CREATOR = CREATOR;
    } 
    public Date getUPDATED_AT(){
        return UPDATED_AT;
    } 
    public void setUPDATED_AT(Date UPDATED_AT) {
         this.UPDATED_AT = UPDATED_AT;
    } 
    public String getUPDATOR(){
        return UPDATOR;
    } 
    public void setUPDATOR(String UPDATOR) {
         this.UPDATOR = UPDATOR;
    } 
    public String getUPDATED_NOTE(){
        return UPDATED_NOTE;
    } 
    public void setUPDATED_NOTE(String UPDATED_NOTE) {
         this.UPDATED_NOTE = UPDATED_NOTE;
    } 
    public String getDATA_STATE(){
        return DATA_STATE;
    } 
    public void setDATA_STATE(String DATA_STATE) {
         this.DATA_STATE = DATA_STATE;
    } 
    public Date getDISABLE_TIME(){
        return DISABLE_TIME;
    } 
    public void setDISABLE_TIME(Date DISABLE_TIME) {
         this.DISABLE_TIME = DISABLE_TIME;
    } 
    public String getDISABLE_OPERATOR(){
        return DISABLE_OPERATOR;
    } 
    public void setDISABLE_OPERATOR(String DISABLE_OPERATOR) {
         this.DISABLE_OPERATOR = DISABLE_OPERATOR;
    } 
    public String getDISABLE_NOTE(){
        return DISABLE_NOTE;
    } 
    public void setDISABLE_NOTE(String DISABLE_NOTE) {
         this.DISABLE_NOTE = DISABLE_NOTE;
    } 
    public String getDATA_CHECK(){
        return DATA_CHECK;
    } 
    public void setDATA_CHECK(String DATA_CHECK) {
         this.DATA_CHECK = DATA_CHECK;
    } 
    public Integer getDEL_FLAG(){
        return DEL_FLAG;
    } 
    public void setDEL_FLAG(Integer DEL_FLAG) {
         this.DEL_FLAG = DEL_FLAG;
    } 
    public String getBATCH_NUMBER(){
        return BATCH_NUMBER;
    } 
    public void setBATCH_NUMBER(String BATCH_NUMBER) {
         this.BATCH_NUMBER = BATCH_NUMBER;
    } 
    public String getMD5(){
        return MD5;
    } 
    public void setMD5(String MD5) {
         this.MD5 = MD5;
    } 
    public String getBUILD_PLATFORM(){
        return BUILD_PLATFORM;
    } 
    public void setBUILD_PLATFORM(String BUILD_PLATFORM) {
         this.BUILD_PLATFORM = BUILD_PLATFORM;
    } 
    public String getSURGICAL_EXPLORATION(){
        return SURGICAL_EXPLORATION;
    } 
    public void setSURGICAL_EXPLORATION(String SURGICAL_EXPLORATION) {
         this.SURGICAL_EXPLORATION = SURGICAL_EXPLORATION;
    } 
    public String getSURGERY_SUMMARY(){
        return SURGERY_SUMMARY;
    } 
    public void setSURGERY_SUMMARY(String SURGERY_SUMMARY) {
         this.SURGERY_SUMMARY = SURGERY_SUMMARY;
    } 
    public String getSPECIMEN_ANATOMY(){
        return SPECIMEN_ANATOMY;
    } 
    public void setSPECIMEN_ANATOMY(String SPECIMEN_ANATOMY) {
         this.SPECIMEN_ANATOMY = SPECIMEN_ANATOMY;
    } 
    public String getSURGICAL_EVALUATION(){
        return SURGICAL_EVALUATION;
    } 
    public void setSURGICAL_EVALUATION(String SURGICAL_EVALUATION) {
         this.SURGICAL_EVALUATION = SURGICAL_EVALUATION;
    } 
    public String getIN_OP_DIAGNOSIS(){
        return IN_OP_DIAGNOSIS;
    } 
    public void setIN_OP_DIAGNOSIS(String IN_OP_DIAGNOSIS) {
         this.IN_OP_DIAGNOSIS = IN_OP_DIAGNOSIS;
    } 
}