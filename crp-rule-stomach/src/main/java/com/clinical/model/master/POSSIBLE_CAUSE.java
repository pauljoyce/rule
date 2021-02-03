package com.clinical.model.master;
import java.util.Date;
public class POSSIBLE_CAUSE{
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
    //是否饮酒
    private String DRINKER;
    //饮酒年限
    private String YEAR_OF_DRINK;
    //饮酒时间点
    private String DRINK_DATE_TIME;
    //每日饮酒量
    private String CONSUMPTION_PER_DAY_DRINK;
    //是否戒酒
    private String DRINK_QUITTER;
    //戒酒年限
    private String YEAR_OF_DRINK_QUITTING;
    //戒酒时间点
    private String DRINK_Q_DATE_TIME;
    //是否吸烟
    private String SMOKER;
    //吸烟年限
    private String YEAR_OF_SMOKE;
    //吸烟时间点
    private String SMOKE_DATE_TIME;
    //每日吸烟量
    private String CONSUMPTION_PER_DAY_SMOKE;
    //吸烟指数
    private String SMOKE_INDEX;
    //是否戒烟
    private String SMOKE_QUITTER;
    //戒烟年限
    private String YEAR_OF_SMOKE_QUITTING;
    //戒烟时间点
    private String SMOKE_Q_DATE_TIME;
    //烟酒信息字段来源
    private String FS_NLP;
    //烟酒信息字段来源中文备注
    private String FS_NLP_CN;
    //字段来源中的出现序号
    private Double FS_SERIAL_NUMBER;
    //字段来源中吸烟实体所在位置
    private Double FS_LOCATION_SMOKE;
    //字段来源中戒烟实体所在位置
    private Double FS_LOCATION_SMOKE_Q;
    //字段来源中饮酒实体所在位置
    private Double FS_LOCATION_DRINK;
    //字段来源中戒酒实体所在位置
    private Double FS_LOCATION_DRINK_Q;
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
    //标准化是否饮酒
    private String DRINKER_STD;
    //标准化饮酒年限
    private String YEAR_OF_DRINK_STD;
    //标准化每日饮酒量-饮酒量1
    private String DRINK_COUNT1_STD;
    //标准化每日饮酒量-饮酒量2
    private String DRINK_COUNT2_STD;
    //标准化每日饮酒量-每xx时间1
    private String DRINK_PER_TIME1_STD;
    //标准化每日饮酒量-每xx时间2
    private String DRINK_PER_TIME2_STD;
    //标准化每日饮酒量-种类1
    private String DRINK_TYPE1_STD;
    //标准化每日饮酒量-种类2
    private String DRINK_TYPE2_STD;
    //标准化是否戒酒
    private String DRINK_QUITTER_STD;
    //标准化戒酒年限
    private String YEAR_OF_DRINK_QUITTING_STD;
    //标准化是否吸烟
    private String SMOKER_STD;
    //标准化吸烟年限
    private String YEAR_OF_SMOKE_STD;
    //标准化每日吸烟量-吸烟数
    private String SMOKE_COUNT_STD;
    //标准化每日吸烟量-每xx时间
    private String SMOKE_PER_TIME_STD;
    //标准化吸烟指数
    private Double SMOKE_INDEX_STD;
    //标准化是否戒烟
    private String SMOKE_QUITTER_STD;
    //标准化戒烟年限
    private String YEAR_OF_SMOKE_QUITTING_STD;

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
    public String getDRINKER(){
        return DRINKER;
    } 
    public void setDRINKER(String DRINKER) {
         this.DRINKER = DRINKER;
    } 
    public String getYEAR_OF_DRINK(){
        return YEAR_OF_DRINK;
    } 
    public void setYEAR_OF_DRINK(String YEAR_OF_DRINK) {
         this.YEAR_OF_DRINK = YEAR_OF_DRINK;
    } 
    public String getDRINK_DATE_TIME(){
        return DRINK_DATE_TIME;
    } 
    public void setDRINK_DATE_TIME(String DRINK_DATE_TIME) {
         this.DRINK_DATE_TIME = DRINK_DATE_TIME;
    } 
    public String getCONSUMPTION_PER_DAY_DRINK(){
        return CONSUMPTION_PER_DAY_DRINK;
    } 
    public void setCONSUMPTION_PER_DAY_DRINK(String CONSUMPTION_PER_DAY_DRINK) {
         this.CONSUMPTION_PER_DAY_DRINK = CONSUMPTION_PER_DAY_DRINK;
    } 
    public String getDRINK_QUITTER(){
        return DRINK_QUITTER;
    } 
    public void setDRINK_QUITTER(String DRINK_QUITTER) {
         this.DRINK_QUITTER = DRINK_QUITTER;
    } 
    public String getYEAR_OF_DRINK_QUITTING(){
        return YEAR_OF_DRINK_QUITTING;
    } 
    public void setYEAR_OF_DRINK_QUITTING(String YEAR_OF_DRINK_QUITTING) {
         this.YEAR_OF_DRINK_QUITTING = YEAR_OF_DRINK_QUITTING;
    } 
    public String getDRINK_Q_DATE_TIME(){
        return DRINK_Q_DATE_TIME;
    } 
    public void setDRINK_Q_DATE_TIME(String DRINK_Q_DATE_TIME) {
         this.DRINK_Q_DATE_TIME = DRINK_Q_DATE_TIME;
    } 
    public String getSMOKER(){
        return SMOKER;
    } 
    public void setSMOKER(String SMOKER) {
         this.SMOKER = SMOKER;
    } 
    public String getYEAR_OF_SMOKE(){
        return YEAR_OF_SMOKE;
    } 
    public void setYEAR_OF_SMOKE(String YEAR_OF_SMOKE) {
         this.YEAR_OF_SMOKE = YEAR_OF_SMOKE;
    } 
    public String getSMOKE_DATE_TIME(){
        return SMOKE_DATE_TIME;
    } 
    public void setSMOKE_DATE_TIME(String SMOKE_DATE_TIME) {
         this.SMOKE_DATE_TIME = SMOKE_DATE_TIME;
    } 
    public String getCONSUMPTION_PER_DAY_SMOKE(){
        return CONSUMPTION_PER_DAY_SMOKE;
    } 
    public void setCONSUMPTION_PER_DAY_SMOKE(String CONSUMPTION_PER_DAY_SMOKE) {
         this.CONSUMPTION_PER_DAY_SMOKE = CONSUMPTION_PER_DAY_SMOKE;
    } 
    public String getSMOKE_INDEX(){
        return SMOKE_INDEX;
    } 
    public void setSMOKE_INDEX(String SMOKE_INDEX) {
         this.SMOKE_INDEX = SMOKE_INDEX;
    } 
    public String getSMOKE_QUITTER(){
        return SMOKE_QUITTER;
    } 
    public void setSMOKE_QUITTER(String SMOKE_QUITTER) {
         this.SMOKE_QUITTER = SMOKE_QUITTER;
    } 
    public String getYEAR_OF_SMOKE_QUITTING(){
        return YEAR_OF_SMOKE_QUITTING;
    } 
    public void setYEAR_OF_SMOKE_QUITTING(String YEAR_OF_SMOKE_QUITTING) {
         this.YEAR_OF_SMOKE_QUITTING = YEAR_OF_SMOKE_QUITTING;
    } 
    public String getSMOKE_Q_DATE_TIME(){
        return SMOKE_Q_DATE_TIME;
    } 
    public void setSMOKE_Q_DATE_TIME(String SMOKE_Q_DATE_TIME) {
         this.SMOKE_Q_DATE_TIME = SMOKE_Q_DATE_TIME;
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
    public Double getFS_LOCATION_SMOKE(){
        return FS_LOCATION_SMOKE;
    } 
    public void setFS_LOCATION_SMOKE(Double FS_LOCATION_SMOKE) {
         this.FS_LOCATION_SMOKE = FS_LOCATION_SMOKE;
    } 
    public Double getFS_LOCATION_SMOKE_Q(){
        return FS_LOCATION_SMOKE_Q;
    } 
    public void setFS_LOCATION_SMOKE_Q(Double FS_LOCATION_SMOKE_Q) {
         this.FS_LOCATION_SMOKE_Q = FS_LOCATION_SMOKE_Q;
    } 
    public Double getFS_LOCATION_DRINK(){
        return FS_LOCATION_DRINK;
    } 
    public void setFS_LOCATION_DRINK(Double FS_LOCATION_DRINK) {
         this.FS_LOCATION_DRINK = FS_LOCATION_DRINK;
    } 
    public Double getFS_LOCATION_DRINK_Q(){
        return FS_LOCATION_DRINK_Q;
    } 
    public void setFS_LOCATION_DRINK_Q(Double FS_LOCATION_DRINK_Q) {
         this.FS_LOCATION_DRINK_Q = FS_LOCATION_DRINK_Q;
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
    public String getDRINKER_STD(){
        return DRINKER_STD;
    } 
    public void setDRINKER_STD(String DRINKER_STD) {
         this.DRINKER_STD = DRINKER_STD;
    } 
    public String getYEAR_OF_DRINK_STD(){
        return YEAR_OF_DRINK_STD;
    } 
    public void setYEAR_OF_DRINK_STD(String YEAR_OF_DRINK_STD) {
         this.YEAR_OF_DRINK_STD = YEAR_OF_DRINK_STD;
    } 
    public String getDRINK_COUNT1_STD(){
        return DRINK_COUNT1_STD;
    } 
    public void setDRINK_COUNT1_STD(String DRINK_COUNT1_STD) {
         this.DRINK_COUNT1_STD = DRINK_COUNT1_STD;
    } 
    public String getDRINK_COUNT2_STD(){
        return DRINK_COUNT2_STD;
    } 
    public void setDRINK_COUNT2_STD(String DRINK_COUNT2_STD) {
         this.DRINK_COUNT2_STD = DRINK_COUNT2_STD;
    } 
    public String getDRINK_PER_TIME1_STD(){
        return DRINK_PER_TIME1_STD;
    } 
    public void setDRINK_PER_TIME1_STD(String DRINK_PER_TIME1_STD) {
         this.DRINK_PER_TIME1_STD = DRINK_PER_TIME1_STD;
    } 
    public String getDRINK_PER_TIME2_STD(){
        return DRINK_PER_TIME2_STD;
    } 
    public void setDRINK_PER_TIME2_STD(String DRINK_PER_TIME2_STD) {
         this.DRINK_PER_TIME2_STD = DRINK_PER_TIME2_STD;
    } 
    public String getDRINK_TYPE1_STD(){
        return DRINK_TYPE1_STD;
    } 
    public void setDRINK_TYPE1_STD(String DRINK_TYPE1_STD) {
         this.DRINK_TYPE1_STD = DRINK_TYPE1_STD;
    } 
    public String getDRINK_TYPE2_STD(){
        return DRINK_TYPE2_STD;
    } 
    public void setDRINK_TYPE2_STD(String DRINK_TYPE2_STD) {
         this.DRINK_TYPE2_STD = DRINK_TYPE2_STD;
    } 
    public String getDRINK_QUITTER_STD(){
        return DRINK_QUITTER_STD;
    } 
    public void setDRINK_QUITTER_STD(String DRINK_QUITTER_STD) {
         this.DRINK_QUITTER_STD = DRINK_QUITTER_STD;
    } 
    public String getYEAR_OF_DRINK_QUITTING_STD(){
        return YEAR_OF_DRINK_QUITTING_STD;
    } 
    public void setYEAR_OF_DRINK_QUITTING_STD(String YEAR_OF_DRINK_QUITTING_STD) {
         this.YEAR_OF_DRINK_QUITTING_STD = YEAR_OF_DRINK_QUITTING_STD;
    } 
    public String getSMOKER_STD(){
        return SMOKER_STD;
    } 
    public void setSMOKER_STD(String SMOKER_STD) {
         this.SMOKER_STD = SMOKER_STD;
    } 
    public String getYEAR_OF_SMOKE_STD(){
        return YEAR_OF_SMOKE_STD;
    } 
    public void setYEAR_OF_SMOKE_STD(String YEAR_OF_SMOKE_STD) {
         this.YEAR_OF_SMOKE_STD = YEAR_OF_SMOKE_STD;
    } 
    public String getSMOKE_COUNT_STD(){
        return SMOKE_COUNT_STD;
    } 
    public void setSMOKE_COUNT_STD(String SMOKE_COUNT_STD) {
         this.SMOKE_COUNT_STD = SMOKE_COUNT_STD;
    } 
    public String getSMOKE_PER_TIME_STD(){
        return SMOKE_PER_TIME_STD;
    } 
    public void setSMOKE_PER_TIME_STD(String SMOKE_PER_TIME_STD) {
         this.SMOKE_PER_TIME_STD = SMOKE_PER_TIME_STD;
    } 
    public Double getSMOKE_INDEX_STD(){
        return SMOKE_INDEX_STD;
    } 
    public void setSMOKE_INDEX_STD(Double SMOKE_INDEX_STD) {
         this.SMOKE_INDEX_STD = SMOKE_INDEX_STD;
    } 
    public String getSMOKE_QUITTER_STD(){
        return SMOKE_QUITTER_STD;
    } 
    public void setSMOKE_QUITTER_STD(String SMOKE_QUITTER_STD) {
         this.SMOKE_QUITTER_STD = SMOKE_QUITTER_STD;
    } 
    public String getYEAR_OF_SMOKE_QUITTING_STD(){
        return YEAR_OF_SMOKE_QUITTING_STD;
    } 
    public void setYEAR_OF_SMOKE_QUITTING_STD(String YEAR_OF_SMOKE_QUITTING_STD) {
         this.YEAR_OF_SMOKE_QUITTING_STD = YEAR_OF_SMOKE_QUITTING_STD;
    } 
}