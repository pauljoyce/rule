package com.clinical.model.master;
import java.util.Date;
public class TEM_DEATH_RECORD{
    //主键
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
    //住院次数
    private Integer ADMISSION_NUMBER;
    //病案号
    private String TPATNO;
    //就诊类型
    private Integer VISIT_TYPE;
    //病人姓名
    private String TPATNAME;
    //性别
    private String SEX;
    //年龄
    private Integer AGE;
    //科室名称
    private String DEPARTMENT_NAME;
    //病区
    private String INPATIENT_AREA;
    //病房号
    private String ROOM_NO;
    //病床号
    private String BED_NO;
    //活动记录状态
    private String RECORD_STATUS;
    //入院日期
    private Date ADMISSION_DATE_TIME;
    //死亡日期
    private Date DEATH_DATE_TIME;
    //主诉
    private String CHIEF_COMPLAIN;
    //现病史
    private String PRESENT_ILLNESS_HISTORY;
    //实际住院天数
    private Integer TZY_DAYS;
    //入院情况
    private String ADMISSION_STATUS;
    //入院诊断
    private String ADMISSION_DIAGNOSIS;
    //诊疗经过
    private String TZL_PROCESS;
    //死亡原因
    private String DEATH_CAUSE;
    //家属是否同意尸解标志
    private String AGREE_AUTOPSY;
    //死亡诊断
    private String DEATH_DIAGNOSIS;
    //医师签名
    private String DOCTOR_SIGN;
    //记录时间
    private Date RECORD_TIME;
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
    public Integer getADMISSION_NUMBER(){
        return ADMISSION_NUMBER;
    } 
    public void setADMISSION_NUMBER(Integer ADMISSION_NUMBER) {
         this.ADMISSION_NUMBER = ADMISSION_NUMBER;
    } 
    public String getTPATNO(){
        return TPATNO;
    } 
    public void setTPATNO(String TPATNO) {
         this.TPATNO = TPATNO;
    } 
    public Integer getVISIT_TYPE(){
        return VISIT_TYPE;
    } 
    public void setVISIT_TYPE(Integer VISIT_TYPE) {
         this.VISIT_TYPE = VISIT_TYPE;
    } 
    public String getTPATNAME(){
        return TPATNAME;
    } 
    public void setTPATNAME(String TPATNAME) {
         this.TPATNAME = TPATNAME;
    } 
    public String getSEX(){
        return SEX;
    } 
    public void setSEX(String SEX) {
         this.SEX = SEX;
    } 
    public Integer getAGE(){
        return AGE;
    } 
    public void setAGE(Integer AGE) {
         this.AGE = AGE;
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
    public Date getADMISSION_DATE_TIME(){
        return ADMISSION_DATE_TIME;
    } 
    public void setADMISSION_DATE_TIME(Date ADMISSION_DATE_TIME) {
         this.ADMISSION_DATE_TIME = ADMISSION_DATE_TIME;
    } 
    public Date getDEATH_DATE_TIME(){
        return DEATH_DATE_TIME;
    } 
    public void setDEATH_DATE_TIME(Date DEATH_DATE_TIME) {
         this.DEATH_DATE_TIME = DEATH_DATE_TIME;
    } 
    public String getCHIEF_COMPLAIN(){
        return CHIEF_COMPLAIN;
    } 
    public void setCHIEF_COMPLAIN(String CHIEF_COMPLAIN) {
         this.CHIEF_COMPLAIN = CHIEF_COMPLAIN;
    } 
    public String getPRESENT_ILLNESS_HISTORY(){
        return PRESENT_ILLNESS_HISTORY;
    } 
    public void setPRESENT_ILLNESS_HISTORY(String PRESENT_ILLNESS_HISTORY) {
         this.PRESENT_ILLNESS_HISTORY = PRESENT_ILLNESS_HISTORY;
    } 
    public Integer getTZY_DAYS(){
        return TZY_DAYS;
    } 
    public void setTZY_DAYS(Integer TZY_DAYS) {
         this.TZY_DAYS = TZY_DAYS;
    } 
    public String getADMISSION_STATUS(){
        return ADMISSION_STATUS;
    } 
    public void setADMISSION_STATUS(String ADMISSION_STATUS) {
         this.ADMISSION_STATUS = ADMISSION_STATUS;
    } 
    public String getADMISSION_DIAGNOSIS(){
        return ADMISSION_DIAGNOSIS;
    } 
    public void setADMISSION_DIAGNOSIS(String ADMISSION_DIAGNOSIS) {
         this.ADMISSION_DIAGNOSIS = ADMISSION_DIAGNOSIS;
    } 
    public String getTZL_PROCESS(){
        return TZL_PROCESS;
    } 
    public void setTZL_PROCESS(String TZL_PROCESS) {
         this.TZL_PROCESS = TZL_PROCESS;
    } 
    public String getDEATH_CAUSE(){
        return DEATH_CAUSE;
    } 
    public void setDEATH_CAUSE(String DEATH_CAUSE) {
         this.DEATH_CAUSE = DEATH_CAUSE;
    } 
    public String getAGREE_AUTOPSY(){
        return AGREE_AUTOPSY;
    } 
    public void setAGREE_AUTOPSY(String AGREE_AUTOPSY) {
         this.AGREE_AUTOPSY = AGREE_AUTOPSY;
    } 
    public String getDEATH_DIAGNOSIS(){
        return DEATH_DIAGNOSIS;
    } 
    public void setDEATH_DIAGNOSIS(String DEATH_DIAGNOSIS) {
         this.DEATH_DIAGNOSIS = DEATH_DIAGNOSIS;
    } 
    public String getDOCTOR_SIGN(){
        return DOCTOR_SIGN;
    } 
    public void setDOCTOR_SIGN(String DOCTOR_SIGN) {
         this.DOCTOR_SIGN = DOCTOR_SIGN;
    } 
    public Date getRECORD_TIME(){
        return RECORD_TIME;
    } 
    public void setRECORD_TIME(Date RECORD_TIME) {
         this.RECORD_TIME = RECORD_TIME;
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
}