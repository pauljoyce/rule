package com.clinical.model.master;
import java.util.Date;
public class RADIOTHERAPY{
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
    //时间点
    private String DATE_TIME;
    //放疗方式
    private String TREATMENT;
    //目的
    private String PURPOSE;
    //否定词
    private String NEG;
    //部位
    private String STRUCTURE;
    //剂量方式
    private String DOSE_TYPE;
    //值
    private String PARA_VALUE;
    //特别动作
    private String MODIFY;
    //疗效
    private String EFFICACY;
    //疗效评价时间
    private String EFFICACY_DATE_TIME;
    //放疗信息字段来源
    private String FS_NLP;
    //放疗信息字段来源中文备注
    private String FS_NLP_CN;
    //字段来源中的出现序号
    private Double FS_SERIAL_NUMBER;
    //字段来源中放疗信息所在位置
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
    //时间点精确时间
    private Date DATE_TIME_P;
    //时间点推测时间
    private Date DATE_TIME_ESTIMATE;
    //疗效评价时间精确时间
    private Date EFFICACY_DATE_TIME_P;
    //疗效评价时间推测时间
    private Date EFFICACY_DATE_TIME_ESTIMATE;
    //放疗方式标准名称1
    private String TREATMENT1_STD;
    //放疗方式标准名称2
    private String TREATMENT2_STD;
    //目的标准名称
    private String PURPOSE_STD;
    //否定词标准名称
    private String NEG_STD;
    //靶区标签1
    private String TARGET1_STD;
    //靶区标签2
    private String TARGET2_STD;
    //部位标准名称1
    private String STRUCTURE1_STD;
    //部位标准名称2
    private String STRUCTURE2_STD;
    //部位标准名称3
    private String STRUCTURE3_STD;
    //部位标准名称4
    private String STRUCTURE4_STD;
    //剂量方式标准名称
    private String DOSE_TYPE_STD;
    //最小剂量
    private Double MIN_DOSE_STD;
    //最大剂量
    private Integer MAX_DOSE_STD;
    //剂量单位
    private String DOSE_UNIT_STD;
    //最少次数
    private Integer MIN_FREQ_STD;
    //最多次数
    private Integer MAX_FREQ_STD;
    //次数单位
    private String FREQ_UNIT_STD;
    //特别动作标准名称
    private String MODIFY_STD;
    //疗效标准名称
    private String EFFICACY_STD;

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
    public String getDATE_TIME(){
        return DATE_TIME;
    } 
    public void setDATE_TIME(String DATE_TIME) {
         this.DATE_TIME = DATE_TIME;
    } 
    public String getTREATMENT(){
        return TREATMENT;
    } 
    public void setTREATMENT(String TREATMENT) {
         this.TREATMENT = TREATMENT;
    } 
    public String getPURPOSE(){
        return PURPOSE;
    } 
    public void setPURPOSE(String PURPOSE) {
         this.PURPOSE = PURPOSE;
    } 
    public String getNEG(){
        return NEG;
    } 
    public void setNEG(String NEG) {
         this.NEG = NEG;
    } 
    public String getSTRUCTURE(){
        return STRUCTURE;
    } 
    public void setSTRUCTURE(String STRUCTURE) {
         this.STRUCTURE = STRUCTURE;
    } 
    public String getDOSE_TYPE(){
        return DOSE_TYPE;
    } 
    public void setDOSE_TYPE(String DOSE_TYPE) {
         this.DOSE_TYPE = DOSE_TYPE;
    } 
    public String getPARA_VALUE(){
        return PARA_VALUE;
    } 
    public void setPARA_VALUE(String PARA_VALUE) {
         this.PARA_VALUE = PARA_VALUE;
    } 
    public String getMODIFY(){
        return MODIFY;
    } 
    public void setMODIFY(String MODIFY) {
         this.MODIFY = MODIFY;
    } 
    public String getEFFICACY(){
        return EFFICACY;
    } 
    public void setEFFICACY(String EFFICACY) {
         this.EFFICACY = EFFICACY;
    } 
    public String getEFFICACY_DATE_TIME(){
        return EFFICACY_DATE_TIME;
    } 
    public void setEFFICACY_DATE_TIME(String EFFICACY_DATE_TIME) {
         this.EFFICACY_DATE_TIME = EFFICACY_DATE_TIME;
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
    public Date getEFFICACY_DATE_TIME_P(){
        return EFFICACY_DATE_TIME_P;
    } 
    public void setEFFICACY_DATE_TIME_P(Date EFFICACY_DATE_TIME_P) {
         this.EFFICACY_DATE_TIME_P = EFFICACY_DATE_TIME_P;
    } 
    public Date getEFFICACY_DATE_TIME_ESTIMATE(){
        return EFFICACY_DATE_TIME_ESTIMATE;
    } 
    public void setEFFICACY_DATE_TIME_ESTIMATE(Date EFFICACY_DATE_TIME_ESTIMATE) {
         this.EFFICACY_DATE_TIME_ESTIMATE = EFFICACY_DATE_TIME_ESTIMATE;
    } 
    public String getTREATMENT1_STD(){
        return TREATMENT1_STD;
    } 
    public void setTREATMENT1_STD(String TREATMENT1_STD) {
         this.TREATMENT1_STD = TREATMENT1_STD;
    } 
    public String getTREATMENT2_STD(){
        return TREATMENT2_STD;
    } 
    public void setTREATMENT2_STD(String TREATMENT2_STD) {
         this.TREATMENT2_STD = TREATMENT2_STD;
    } 
    public String getPURPOSE_STD(){
        return PURPOSE_STD;
    } 
    public void setPURPOSE_STD(String PURPOSE_STD) {
         this.PURPOSE_STD = PURPOSE_STD;
    } 
    public String getNEG_STD(){
        return NEG_STD;
    } 
    public void setNEG_STD(String NEG_STD) {
         this.NEG_STD = NEG_STD;
    } 
    public String getTARGET1_STD(){
        return TARGET1_STD;
    } 
    public void setTARGET1_STD(String TARGET1_STD) {
         this.TARGET1_STD = TARGET1_STD;
    } 
    public String getTARGET2_STD(){
        return TARGET2_STD;
    } 
    public void setTARGET2_STD(String TARGET2_STD) {
         this.TARGET2_STD = TARGET2_STD;
    } 
    public String getSTRUCTURE1_STD(){
        return STRUCTURE1_STD;
    } 
    public void setSTRUCTURE1_STD(String STRUCTURE1_STD) {
         this.STRUCTURE1_STD = STRUCTURE1_STD;
    } 
    public String getSTRUCTURE2_STD(){
        return STRUCTURE2_STD;
    } 
    public void setSTRUCTURE2_STD(String STRUCTURE2_STD) {
         this.STRUCTURE2_STD = STRUCTURE2_STD;
    } 
    public String getSTRUCTURE3_STD(){
        return STRUCTURE3_STD;
    } 
    public void setSTRUCTURE3_STD(String STRUCTURE3_STD) {
         this.STRUCTURE3_STD = STRUCTURE3_STD;
    } 
    public String getSTRUCTURE4_STD(){
        return STRUCTURE4_STD;
    } 
    public void setSTRUCTURE4_STD(String STRUCTURE4_STD) {
         this.STRUCTURE4_STD = STRUCTURE4_STD;
    } 
    public String getDOSE_TYPE_STD(){
        return DOSE_TYPE_STD;
    } 
    public void setDOSE_TYPE_STD(String DOSE_TYPE_STD) {
         this.DOSE_TYPE_STD = DOSE_TYPE_STD;
    } 
    public Double getMIN_DOSE_STD(){
        return MIN_DOSE_STD;
    } 
    public void setMIN_DOSE_STD(Double MIN_DOSE_STD) {
         this.MIN_DOSE_STD = MIN_DOSE_STD;
    } 
    public Integer getMAX_DOSE_STD(){
        return MAX_DOSE_STD;
    } 
    public void setMAX_DOSE_STD(Integer MAX_DOSE_STD) {
         this.MAX_DOSE_STD = MAX_DOSE_STD;
    } 
    public String getDOSE_UNIT_STD(){
        return DOSE_UNIT_STD;
    } 
    public void setDOSE_UNIT_STD(String DOSE_UNIT_STD) {
         this.DOSE_UNIT_STD = DOSE_UNIT_STD;
    } 
    public Integer getMIN_FREQ_STD(){
        return MIN_FREQ_STD;
    } 
    public void setMIN_FREQ_STD(Integer MIN_FREQ_STD) {
         this.MIN_FREQ_STD = MIN_FREQ_STD;
    } 
    public Integer getMAX_FREQ_STD(){
        return MAX_FREQ_STD;
    } 
    public void setMAX_FREQ_STD(Integer MAX_FREQ_STD) {
         this.MAX_FREQ_STD = MAX_FREQ_STD;
    } 
    public String getFREQ_UNIT_STD(){
        return FREQ_UNIT_STD;
    } 
    public void setFREQ_UNIT_STD(String FREQ_UNIT_STD) {
         this.FREQ_UNIT_STD = FREQ_UNIT_STD;
    } 
    public String getMODIFY_STD(){
        return MODIFY_STD;
    } 
    public void setMODIFY_STD(String MODIFY_STD) {
         this.MODIFY_STD = MODIFY_STD;
    } 
    public String getEFFICACY_STD(){
        return EFFICACY_STD;
    } 
    public void setEFFICACY_STD(String EFFICACY_STD) {
         this.EFFICACY_STD = EFFICACY_STD;
    } 
}