package com.clinical.model.master;
import java.util.Date;
public class SYMPTOMS{
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
    private Double ADMISSION_NUMBER;
    //入院时间
    private Date ADMISSION_DATE_TIME;
    //诱因
    private String CAUSE;
    //名称
    private String DESC;
    //否定词
    private String NEG;
    //可能性
    private String MODIFY;
    //严重程度
    private String EXTENT;
    //持续时长
    private String LENGTH;
    //尺寸
    private String SIZE;
    //个数
    private String COUNT;
    //变化趋势
    private String CHANGE;
    //变化趋势时长
    private String CHANGE_LENGTH;
    //开始时间
    private String BEGIN_DATE_TIME;
    //变化时间
    private String CHANGE_DATE_TIME;
    //症状表现信息字段来源
    private String FS_NLP;
    //症状表现信息字段来源中文备注
    private String FS_NLP_CN;
    //字段来源中的出现序号
    private Double FS_SERIAL_NUMBER;
    //字段来源中症状表现名称所在位置
    private String FS_LOCATION;
    //数据版本
    private String DATA_VERSION;
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
    //记录时间
    private Date RECORD_TIME;
    //批号
    private String BATCH_NUMBER;
    //精确开始时间
    private Date BEGIN_DATE_TIME_P;
    //推测开始时间
    private Date BEGIN_DATE_TIME_ESTIMATE;
    //精确变化时间
    private Date CHANGE_DATE_TIME_P;
    //推测变化时间
    private Date CHANGE_DATE_TIME_ESTIMATE;
    //标准化名称1
    private String DESC1_STD;
    //标准化名称2
    private String DESC2_STD;
    //标准化名称3
    private String DESC3_STD;
    //标准化名称4
    private String DESC4_STD;
    //标准化名称5
    private String DESC5_STD;
    //标准化名称6
    private String DESC6_STD;

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
    public Double getADMISSION_NUMBER(){
        return ADMISSION_NUMBER;
    } 
    public void setADMISSION_NUMBER(Double ADMISSION_NUMBER) {
         this.ADMISSION_NUMBER = ADMISSION_NUMBER;
    } 
    public Date getADMISSION_DATE_TIME(){
        return ADMISSION_DATE_TIME;
    } 
    public void setADMISSION_DATE_TIME(Date ADMISSION_DATE_TIME) {
         this.ADMISSION_DATE_TIME = ADMISSION_DATE_TIME;
    } 
    public String getCAUSE(){
        return CAUSE;
    } 
    public void setCAUSE(String CAUSE) {
         this.CAUSE = CAUSE;
    } 
    public String getDESC(){
        return DESC;
    } 
    public void setDESC(String DESC) {
         this.DESC = DESC;
    } 
    public String getNEG(){
        return NEG;
    } 
    public void setNEG(String NEG) {
         this.NEG = NEG;
    } 
    public String getMODIFY(){
        return MODIFY;
    } 
    public void setMODIFY(String MODIFY) {
         this.MODIFY = MODIFY;
    } 
    public String getEXTENT(){
        return EXTENT;
    } 
    public void setEXTENT(String EXTENT) {
         this.EXTENT = EXTENT;
    } 
    public String getLENGTH(){
        return LENGTH;
    } 
    public void setLENGTH(String LENGTH) {
         this.LENGTH = LENGTH;
    } 
    public String getSIZE(){
        return SIZE;
    } 
    public void setSIZE(String SIZE) {
         this.SIZE = SIZE;
    } 
    public String getCOUNT(){
        return COUNT;
    } 
    public void setCOUNT(String COUNT) {
         this.COUNT = COUNT;
    } 
    public String getCHANGE(){
        return CHANGE;
    } 
    public void setCHANGE(String CHANGE) {
         this.CHANGE = CHANGE;
    } 
    public String getCHANGE_LENGTH(){
        return CHANGE_LENGTH;
    } 
    public void setCHANGE_LENGTH(String CHANGE_LENGTH) {
         this.CHANGE_LENGTH = CHANGE_LENGTH;
    } 
    public String getBEGIN_DATE_TIME(){
        return BEGIN_DATE_TIME;
    } 
    public void setBEGIN_DATE_TIME(String BEGIN_DATE_TIME) {
         this.BEGIN_DATE_TIME = BEGIN_DATE_TIME;
    } 
    public String getCHANGE_DATE_TIME(){
        return CHANGE_DATE_TIME;
    } 
    public void setCHANGE_DATE_TIME(String CHANGE_DATE_TIME) {
         this.CHANGE_DATE_TIME = CHANGE_DATE_TIME;
    } 
    public String getFS_NLP(){
        return FS_NLP;
    } 
    public void setFS_NLP(String FS_NLP) {
         this.FS_NLP = FS_NLP;
    } 
    public String getFS_NLP_CN(){
        return FS_NLP_CN;
    } 
    public void setFS_NLP_CN(String FS_NLP_CN) {
         this.FS_NLP_CN = FS_NLP_CN;
    } 
    public Double getFS_SERIAL_NUMBER(){
        return FS_SERIAL_NUMBER;
    } 
    public void setFS_SERIAL_NUMBER(Double FS_SERIAL_NUMBER) {
         this.FS_SERIAL_NUMBER = FS_SERIAL_NUMBER;
    }

    public String getFS_LOCATION() {
        return FS_LOCATION;
    }

    public void setFS_LOCATION(String FS_LOCATION) {
        this.FS_LOCATION = FS_LOCATION;
    }

    public String getDATA_VERSION(){
        return DATA_VERSION;
    } 
    public void setDATA_VERSION(String DATA_VERSION) {
         this.DATA_VERSION = DATA_VERSION;
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
    public Date getRECORD_TIME(){
        return RECORD_TIME;
    } 
    public void setRECORD_TIME(Date RECORD_TIME) {
         this.RECORD_TIME = RECORD_TIME;
    } 
    public String getBATCH_NUMBER(){
        return BATCH_NUMBER;
    } 
    public void setBATCH_NUMBER(String BATCH_NUMBER) {
         this.BATCH_NUMBER = BATCH_NUMBER;
    } 
    public Date getBEGIN_DATE_TIME_P(){
        return BEGIN_DATE_TIME_P;
    } 
    public void setBEGIN_DATE_TIME_P(Date BEGIN_DATE_TIME_P) {
         this.BEGIN_DATE_TIME_P = BEGIN_DATE_TIME_P;
    } 
    public Date getBEGIN_DATE_TIME_ESTIMATE(){
        return BEGIN_DATE_TIME_ESTIMATE;
    } 
    public void setBEGIN_DATE_TIME_ESTIMATE(Date BEGIN_DATE_TIME_ESTIMATE) {
         this.BEGIN_DATE_TIME_ESTIMATE = BEGIN_DATE_TIME_ESTIMATE;
    } 
    public Date getCHANGE_DATE_TIME_P(){
        return CHANGE_DATE_TIME_P;
    } 
    public void setCHANGE_DATE_TIME_P(Date CHANGE_DATE_TIME_P) {
         this.CHANGE_DATE_TIME_P = CHANGE_DATE_TIME_P;
    } 
    public Date getCHANGE_DATE_TIME_ESTIMATE(){
        return CHANGE_DATE_TIME_ESTIMATE;
    } 
    public void setCHANGE_DATE_TIME_ESTIMATE(Date CHANGE_DATE_TIME_ESTIMATE) {
         this.CHANGE_DATE_TIME_ESTIMATE = CHANGE_DATE_TIME_ESTIMATE;
    } 
    public String getDESC1_STD(){
        return DESC1_STD;
    } 
    public void setDESC1_STD(String DESC1_STD) {
         this.DESC1_STD = DESC1_STD;
    } 
    public String getDESC2_STD(){
        return DESC2_STD;
    } 
    public void setDESC2_STD(String DESC2_STD) {
         this.DESC2_STD = DESC2_STD;
    } 
    public String getDESC3_STD(){
        return DESC3_STD;
    } 
    public void setDESC3_STD(String DESC3_STD) {
         this.DESC3_STD = DESC3_STD;
    } 
    public String getDESC4_STD(){
        return DESC4_STD;
    } 
    public void setDESC4_STD(String DESC4_STD) {
         this.DESC4_STD = DESC4_STD;
    } 
    public String getDESC5_STD(){
        return DESC5_STD;
    } 
    public void setDESC5_STD(String DESC5_STD) {
         this.DESC5_STD = DESC5_STD;
    } 
    public String getDESC6_STD(){
        return DESC6_STD;
    } 
    public void setDESC6_STD(String DESC6_STD) {
         this.DESC6_STD = DESC6_STD;
    } 
}