package com.clinical.model.master;
import java.util.Date;
public class OUTP_DIAGNOSIS_SPLIT{
    //流水号
    private String SEQ_ID;
    //唯一标识
    private String UNIQUE_ID;
    //关联1级表unique_id
    private String UNIQUE_ID_LV1;
    //关联2级表unique_id
    private String UNIQUE_ID_LV2;
    //医疗机构代码
    private String P900;
    //患者ID
    private String PATIENT_ID;
    //病案号
    private String TPATNO;
    //就诊类型
    private Integer VISIT_TYPE;
    //记录状态
    private String RECORD_STATUS;
    //住院号
    private String VISIT_ID;
    //住院次数
    private Integer ADMISSION_NUMBER;
    //入院时间
    private Date ADMISSION_DATE_TIME;
    //来源诊断描述
    private String SOURCE_DIAG_DESC;
    //拆分后诊断描述
    private String SOURCE_DIAG_SPLIT;
    //来源诊断描述字段来源
    private String FS_ETL;
    //来源诊断描述字段来源中文备注
    private String FS_ETL_CN;
    //字段来源中的出现序号
    private Integer FS_SERIAL_NUMBER;
    //数据版本
    private String DATA_VERSION;
    //数据库来源
    private String DATA_DB_SOURCE;
    //数据表来源
    private String DATA_TABLE_SOURCE;
    //数据表来源中文备注
    private String DATA_TABLE_SOURCE_CN;
    //数据项来源
    private String DATA_FIELD_SOURCE;
    //创建时间
    private Date CREATE_TIME;
    //创建人
    private String CREATOR;
    //批号
    private String BATCH_NUMBER;
    //SCT名称
    private String SCT_NAME;
    //SCT编码
    private Integer SCT_ID;
    //SCT概念
    private String SCT_CONCEPT;

    public String getSEQ_ID(){
        return SEQ_ID;
    } 
    public void setSEQ_ID(String SEQ_ID) {
         this.SEQ_ID = SEQ_ID;
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
    public String getRECORD_STATUS(){
        return RECORD_STATUS;
    } 
    public void setRECORD_STATUS(String RECORD_STATUS) {
         this.RECORD_STATUS = RECORD_STATUS;
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
    public Date getADMISSION_DATE_TIME(){
        return ADMISSION_DATE_TIME;
    } 
    public void setADMISSION_DATE_TIME(Date ADMISSION_DATE_TIME) {
         this.ADMISSION_DATE_TIME = ADMISSION_DATE_TIME;
    } 
    public String getSOURCE_DIAG_DESC(){
        return SOURCE_DIAG_DESC;
    } 
    public void setSOURCE_DIAG_DESC(String SOURCE_DIAG_DESC) {
         this.SOURCE_DIAG_DESC = SOURCE_DIAG_DESC;
    } 
    public String getSOURCE_DIAG_SPLIT(){
        return SOURCE_DIAG_SPLIT;
    } 
    public void setSOURCE_DIAG_SPLIT(String SOURCE_DIAG_SPLIT) {
         this.SOURCE_DIAG_SPLIT = SOURCE_DIAG_SPLIT;
    } 
    public String getFS_ETL(){
        return FS_ETL;
    } 
    public void setFS_ETL(String FS_ETL) {
         this.FS_ETL = FS_ETL;
    } 
    public String getFS_ETL_CN(){
        return FS_ETL_CN;
    } 
    public void setFS_ETL_CN(String FS_ETL_CN) {
         this.FS_ETL_CN = FS_ETL_CN;
    } 
    public Integer getFS_SERIAL_NUMBER(){
        return FS_SERIAL_NUMBER;
    } 
    public void setFS_SERIAL_NUMBER(Integer FS_SERIAL_NUMBER) {
         this.FS_SERIAL_NUMBER = FS_SERIAL_NUMBER;
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
    public String getDATA_TABLE_SOURCE_CN(){
        return DATA_TABLE_SOURCE_CN;
    } 
    public void setDATA_TABLE_SOURCE_CN(String DATA_TABLE_SOURCE_CN) {
         this.DATA_TABLE_SOURCE_CN = DATA_TABLE_SOURCE_CN;
    } 
    public String getDATA_FIELD_SOURCE(){
        return DATA_FIELD_SOURCE;
    } 
    public void setDATA_FIELD_SOURCE(String DATA_FIELD_SOURCE) {
         this.DATA_FIELD_SOURCE = DATA_FIELD_SOURCE;
    } 
    public Date getCREATE_TIME(){
        return CREATE_TIME;
    } 
    public void setCREATE_TIME(Date CREATE_TIME) {
         this.CREATE_TIME = CREATE_TIME;
    } 
    public String getCREATOR(){
        return CREATOR;
    } 
    public void setCREATOR(String CREATOR) {
         this.CREATOR = CREATOR;
    } 
    public String getBATCH_NUMBER(){
        return BATCH_NUMBER;
    } 
    public void setBATCH_NUMBER(String BATCH_NUMBER) {
         this.BATCH_NUMBER = BATCH_NUMBER;
    } 
    public String getSCT_NAME(){
        return SCT_NAME;
    } 
    public void setSCT_NAME(String SCT_NAME) {
         this.SCT_NAME = SCT_NAME;
    } 
    public Integer getSCT_ID(){
        return SCT_ID;
    } 
    public void setSCT_ID(Integer SCT_ID) {
         this.SCT_ID = SCT_ID;
    } 
    public String getSCT_CONCEPT(){
        return SCT_CONCEPT;
    } 
    public void setSCT_CONCEPT(String SCT_CONCEPT) {
         this.SCT_CONCEPT = SCT_CONCEPT;
    } 
}