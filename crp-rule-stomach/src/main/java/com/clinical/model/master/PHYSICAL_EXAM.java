package com.clinical.model.master;
import java.util.Date;
public class PHYSICAL_EXAM{
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
    //体格检查日期
    private String DATE_TIME;
    //时长
    private String LENGTH;
    //检查指标名称
    private String SIGN_NAME;
    //检查指标趋势
    private String CHANGE;
    //检查指标值
    private String SIGN_VALUE;
    //体格检查信息字段来源
    private String FS_NLP;
    //体格检查信息字段来源中文备注
    private String FS_NLP_CN;
    //字段来源中的出现序号
    private Double FS_SERIAL_NUMBER;
    //字段来源中检查指标名称所在位置
    private Double FS_LOCATION;
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
    //精确检查日期
    private Date DATE_TIME_P;
    //推测检查日期
    private Date DATE_TIME_ESTIMATE;
    //标准化时长
    private String LENGTH_STD;
    //标准化检查指标名称1
    private String SIGN_NAME1_STD;
    //标准化检查指标名称2
    private String SIGN_NAME2_STD;
    //标准化检查指标名称3
    private String SIGN_NAME3_STD;
    //标准化检查指标名称4
    private String SIGN_NAME4_STD;
    //标准化检查指标趋势
    private String CHANGE_STD;
    //标准化检查指标值
    private String SIGN_VALUE_STD;

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
    public String getDATE_TIME(){
        return DATE_TIME;
    } 
    public void setDATE_TIME(String DATE_TIME) {
         this.DATE_TIME = DATE_TIME;
    } 
    public String getLENGTH(){
        return LENGTH;
    } 
    public void setLENGTH(String LENGTH) {
         this.LENGTH = LENGTH;
    } 
    public String getSIGN_NAME(){
        return SIGN_NAME;
    } 
    public void setSIGN_NAME(String SIGN_NAME) {
         this.SIGN_NAME = SIGN_NAME;
    } 
    public String getCHANGE(){
        return CHANGE;
    } 
    public void setCHANGE(String CHANGE) {
         this.CHANGE = CHANGE;
    } 
    public String getSIGN_VALUE(){
        return SIGN_VALUE;
    } 
    public void setSIGN_VALUE(String SIGN_VALUE) {
         this.SIGN_VALUE = SIGN_VALUE;
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
    public Double getFS_LOCATION(){
        return FS_LOCATION;
    } 
    public void setFS_LOCATION(Double FS_LOCATION) {
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
    public Date getDATE_TIME_P(){
        return DATE_TIME_P;
    } 
    public void setDATE_TIME_P(Date DATE_TIME_P) {
         this.DATE_TIME_P = DATE_TIME_P;
    } 
    public Date getDATE_TIME_ESTIMATE(){
        return DATE_TIME_ESTIMATE;
    } 
    public void setDATE_TIME_ESTIMATE(Date DATE_TIME_ESTIMATE) {
         this.DATE_TIME_ESTIMATE = DATE_TIME_ESTIMATE;
    } 
    public String getLENGTH_STD(){
        return LENGTH_STD;
    } 
    public void setLENGTH_STD(String LENGTH_STD) {
         this.LENGTH_STD = LENGTH_STD;
    } 
    public String getSIGN_NAME1_STD(){
        return SIGN_NAME1_STD;
    } 
    public void setSIGN_NAME1_STD(String SIGN_NAME1_STD) {
         this.SIGN_NAME1_STD = SIGN_NAME1_STD;
    } 
    public String getSIGN_NAME2_STD(){
        return SIGN_NAME2_STD;
    } 
    public void setSIGN_NAME2_STD(String SIGN_NAME2_STD) {
         this.SIGN_NAME2_STD = SIGN_NAME2_STD;
    } 
    public String getSIGN_NAME3_STD(){
        return SIGN_NAME3_STD;
    } 
    public void setSIGN_NAME3_STD(String SIGN_NAME3_STD) {
         this.SIGN_NAME3_STD = SIGN_NAME3_STD;
    } 
    public String getSIGN_NAME4_STD(){
        return SIGN_NAME4_STD;
    } 
    public void setSIGN_NAME4_STD(String SIGN_NAME4_STD) {
         this.SIGN_NAME4_STD = SIGN_NAME4_STD;
    } 
    public String getCHANGE_STD(){
        return CHANGE_STD;
    } 
    public void setCHANGE_STD(String CHANGE_STD) {
         this.CHANGE_STD = CHANGE_STD;
    } 
    public String getSIGN_VALUE_STD(){
        return SIGN_VALUE_STD;
    } 
    public void setSIGN_VALUE_STD(String SIGN_VALUE_STD) {
         this.SIGN_VALUE_STD = SIGN_VALUE_STD;
    } 
}