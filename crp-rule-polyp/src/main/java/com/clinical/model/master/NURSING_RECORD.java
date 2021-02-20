package com.clinical.model.master;
import java.util.Date;
public class NURSING_RECORD{
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
    //就诊类型
    private Integer VISIT_TYPE;
    //住院号
    private String VISIT_ID;
    //住院次数
    private Integer ADMISSION_NUMBER;
    //体温（℃）
    private String BODY_TEMPERATURE;
    //脉搏（次_分）
    private String PULSE;
    //呼吸频率（次_分）
    private String BREATHING_FREQUENCY;
    //收缩压（mmhg）
    private String SYSTOLIC_BLOOD_PRESSURE;
    //舒张压（mmhg）
    private String DIASTOLIC_BLOOD_PRESSURE;
    //血氧饱和度（%）
    private String BLOOD_OXYGEN_SATURATION;
    //入量名称
    private String INPUT_NAME;
    //入量
    private String INPUT_VOLUME;
    //入量单位
    private String INPUT_UNIT;
    //总入量
    private String TOTAL_INPUT;
    //总入量单位
    private String TOTAL_INPUT_UNIT;
    //出量名称
    private String OUTPUT_NAME;
    //出量
    private String OUTPUT_VOLUME;
    //出量单位
    private String OUTPUT_UNIT;
    //出量液体颜色
    private String OUTPUT_LIQUID_COLOR;
    //出量液体性质
    private String LIQUID_PROPERTIES;
    //总出量
    private String TOTAL_OUTPUT;
    //总出量单位
    private String TOTAL_OUTPUT_UNIT;
    //病情记录
    private String CONDITION_RECORD;
    //护士签名
    private String NURSE_SIGNATURE;
    //护士签名时间
    private Date NURSE_SIGNATURE_TIME;
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
    public Integer getVISIT_TYPE(){
        return VISIT_TYPE;
    } 
    public void setVISIT_TYPE(Integer VISIT_TYPE) {
         this.VISIT_TYPE = VISIT_TYPE;
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
    public String getBODY_TEMPERATURE(){
        return BODY_TEMPERATURE;
    } 
    public void setBODY_TEMPERATURE(String BODY_TEMPERATURE) {
         this.BODY_TEMPERATURE = BODY_TEMPERATURE;
    } 
    public String getPULSE(){
        return PULSE;
    } 
    public void setPULSE(String PULSE) {
         this.PULSE = PULSE;
    } 
    public String getBREATHING_FREQUENCY(){
        return BREATHING_FREQUENCY;
    } 
    public void setBREATHING_FREQUENCY(String BREATHING_FREQUENCY) {
         this.BREATHING_FREQUENCY = BREATHING_FREQUENCY;
    } 
    public String getSYSTOLIC_BLOOD_PRESSURE(){
        return SYSTOLIC_BLOOD_PRESSURE;
    } 
    public void setSYSTOLIC_BLOOD_PRESSURE(String SYSTOLIC_BLOOD_PRESSURE) {
         this.SYSTOLIC_BLOOD_PRESSURE = SYSTOLIC_BLOOD_PRESSURE;
    } 
    public String getDIASTOLIC_BLOOD_PRESSURE(){
        return DIASTOLIC_BLOOD_PRESSURE;
    } 
    public void setDIASTOLIC_BLOOD_PRESSURE(String DIASTOLIC_BLOOD_PRESSURE) {
         this.DIASTOLIC_BLOOD_PRESSURE = DIASTOLIC_BLOOD_PRESSURE;
    } 
    public String getBLOOD_OXYGEN_SATURATION(){
        return BLOOD_OXYGEN_SATURATION;
    } 
    public void setBLOOD_OXYGEN_SATURATION(String BLOOD_OXYGEN_SATURATION) {
         this.BLOOD_OXYGEN_SATURATION = BLOOD_OXYGEN_SATURATION;
    } 
    public String getINPUT_NAME(){
        return INPUT_NAME;
    } 
    public void setINPUT_NAME(String INPUT_NAME) {
         this.INPUT_NAME = INPUT_NAME;
    } 
    public String getINPUT_VOLUME(){
        return INPUT_VOLUME;
    } 
    public void setINPUT_VOLUME(String INPUT_VOLUME) {
         this.INPUT_VOLUME = INPUT_VOLUME;
    } 
    public String getINPUT_UNIT(){
        return INPUT_UNIT;
    } 
    public void setINPUT_UNIT(String INPUT_UNIT) {
         this.INPUT_UNIT = INPUT_UNIT;
    } 
    public String getTOTAL_INPUT(){
        return TOTAL_INPUT;
    } 
    public void setTOTAL_INPUT(String TOTAL_INPUT) {
         this.TOTAL_INPUT = TOTAL_INPUT;
    } 
    public String getTOTAL_INPUT_UNIT(){
        return TOTAL_INPUT_UNIT;
    } 
    public void setTOTAL_INPUT_UNIT(String TOTAL_INPUT_UNIT) {
         this.TOTAL_INPUT_UNIT = TOTAL_INPUT_UNIT;
    } 
    public String getOUTPUT_NAME(){
        return OUTPUT_NAME;
    } 
    public void setOUTPUT_NAME(String OUTPUT_NAME) {
         this.OUTPUT_NAME = OUTPUT_NAME;
    } 
    public String getOUTPUT_VOLUME(){
        return OUTPUT_VOLUME;
    } 
    public void setOUTPUT_VOLUME(String OUTPUT_VOLUME) {
         this.OUTPUT_VOLUME = OUTPUT_VOLUME;
    } 
    public String getOUTPUT_UNIT(){
        return OUTPUT_UNIT;
    } 
    public void setOUTPUT_UNIT(String OUTPUT_UNIT) {
         this.OUTPUT_UNIT = OUTPUT_UNIT;
    } 
    public String getOUTPUT_LIQUID_COLOR(){
        return OUTPUT_LIQUID_COLOR;
    } 
    public void setOUTPUT_LIQUID_COLOR(String OUTPUT_LIQUID_COLOR) {
         this.OUTPUT_LIQUID_COLOR = OUTPUT_LIQUID_COLOR;
    } 
    public String getLIQUID_PROPERTIES(){
        return LIQUID_PROPERTIES;
    } 
    public void setLIQUID_PROPERTIES(String LIQUID_PROPERTIES) {
         this.LIQUID_PROPERTIES = LIQUID_PROPERTIES;
    } 
    public String getTOTAL_OUTPUT(){
        return TOTAL_OUTPUT;
    } 
    public void setTOTAL_OUTPUT(String TOTAL_OUTPUT) {
         this.TOTAL_OUTPUT = TOTAL_OUTPUT;
    } 
    public String getTOTAL_OUTPUT_UNIT(){
        return TOTAL_OUTPUT_UNIT;
    } 
    public void setTOTAL_OUTPUT_UNIT(String TOTAL_OUTPUT_UNIT) {
         this.TOTAL_OUTPUT_UNIT = TOTAL_OUTPUT_UNIT;
    } 
    public String getCONDITION_RECORD(){
        return CONDITION_RECORD;
    } 
    public void setCONDITION_RECORD(String CONDITION_RECORD) {
         this.CONDITION_RECORD = CONDITION_RECORD;
    } 
    public String getNURSE_SIGNATURE(){
        return NURSE_SIGNATURE;
    } 
    public void setNURSE_SIGNATURE(String NURSE_SIGNATURE) {
         this.NURSE_SIGNATURE = NURSE_SIGNATURE;
    } 
    public Date getNURSE_SIGNATURE_TIME(){
        return NURSE_SIGNATURE_TIME;
    } 
    public void setNURSE_SIGNATURE_TIME(Date NURSE_SIGNATURE_TIME) {
         this.NURSE_SIGNATURE_TIME = NURSE_SIGNATURE_TIME;
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