package com.clinical.model.master;
import java.util.Date;
public class INP_ORDERS{
    //主键id
    private String ID;
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
    //就诊类型
    private Integer VISIT_TYPE;
    //医嘱序号
    private String ORDER_NO;
    //医嘱子序号
    private String ORDER_SUB_NO;
    //医嘱类别
    private String ORDER_CLASS;
    //医嘱正文
    private String ORDER_TEXT;
    //医嘱类型
    private String ORDER_TYPE;
    //数量
    private String ORDER_QUANTITY;
    //数量单位
    private String ORDER_UNIT;
    //药品单次用量
    private String DOSAGE;
    //剂量单位
    private String DOSAGE_UNITS;
    //药品名称
    private String DRUG_NAME;
    //药理主要成分
    private String MAIN_INGREDIENT;
    //商品名
    private String BRAND_NAME;
    //药物剂型
    private String DRUG_FORM;
    //药品规格
    private String DRUG_SPECS;
    //药品规格单位
    private String DRUG_SPECS_UNIT;
    //药品包装单位
    private String DRUG_PACKAGE_UNIT;
    //用药途径
    private String ADMINISTRATION;
    //持续时间
    private Integer DURATION;
    //持续时间单位
    private String DURATION_UNITS;
    //医嘱频次
    private String FREQUENCY;
    //频率间隔
    private String FREQ_INTERVAL;
    //频率间隔单位
    private String FREQ_INTERVAL_UNIT;
    //执行详细时间
    private Date FREQ_DETAIL;
    //护士执行时间
    private Date PERFORM_SCHEDULE;
    //开医嘱科室
    private String ORDERING_DEPT;
    //医嘱开立医生
    private String ORDERING_DOCTOR;
    //医嘱开立时间
    private Date ENTER_DATE_TIME;
    //医嘱停止医生
    private String ORDER_STOP_DOCTOR;
    //医嘱停止时间
    private Date STOP_ORDER_DATE_TIME;
    //医嘱作废医生
    private String ORDER_CANCEL_DOCTOR;
    //医嘱作废时间
    private Date ORDER_CANCEL_DATE_TIME;
    //医嘱状态
    private String ORDER_STATUS;
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

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
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
    public Integer getVISIT_TYPE(){
        return VISIT_TYPE;
    } 
    public void setVISIT_TYPE(Integer VISIT_TYPE) {
         this.VISIT_TYPE = VISIT_TYPE;
    } 
    public String getORDER_NO(){
        return ORDER_NO;
    } 
    public void setORDER_NO(String ORDER_NO) {
         this.ORDER_NO = ORDER_NO;
    } 
    public String getORDER_SUB_NO(){
        return ORDER_SUB_NO;
    } 
    public void setORDER_SUB_NO(String ORDER_SUB_NO) {
         this.ORDER_SUB_NO = ORDER_SUB_NO;
    } 
    public String getORDER_CLASS(){
        return ORDER_CLASS;
    } 
    public void setORDER_CLASS(String ORDER_CLASS) {
         this.ORDER_CLASS = ORDER_CLASS;
    } 
    public String getORDER_TEXT(){
        return ORDER_TEXT;
    } 
    public void setORDER_TEXT(String ORDER_TEXT) {
         this.ORDER_TEXT = ORDER_TEXT;
    } 
    public String getORDER_TYPE(){
        return ORDER_TYPE;
    } 
    public void setORDER_TYPE(String ORDER_TYPE) {
         this.ORDER_TYPE = ORDER_TYPE;
    } 
    public String getORDER_QUANTITY(){
        return ORDER_QUANTITY;
    } 
    public void setORDER_QUANTITY(String ORDER_QUANTITY) {
         this.ORDER_QUANTITY = ORDER_QUANTITY;
    } 
    public String getORDER_UNIT(){
        return ORDER_UNIT;
    } 
    public void setORDER_UNIT(String ORDER_UNIT) {
         this.ORDER_UNIT = ORDER_UNIT;
    } 
    public String getDOSAGE(){
        return DOSAGE;
    } 
    public void setDOSAGE(String DOSAGE) {
         this.DOSAGE = DOSAGE;
    } 
    public String getDOSAGE_UNITS(){
        return DOSAGE_UNITS;
    } 
    public void setDOSAGE_UNITS(String DOSAGE_UNITS) {
         this.DOSAGE_UNITS = DOSAGE_UNITS;
    } 
    public String getDRUG_NAME(){
        return DRUG_NAME;
    } 
    public void setDRUG_NAME(String DRUG_NAME) {
         this.DRUG_NAME = DRUG_NAME;
    } 
    public String getMAIN_INGREDIENT(){
        return MAIN_INGREDIENT;
    } 
    public void setMAIN_INGREDIENT(String MAIN_INGREDIENT) {
         this.MAIN_INGREDIENT = MAIN_INGREDIENT;
    } 
    public String getBRAND_NAME(){
        return BRAND_NAME;
    } 
    public void setBRAND_NAME(String BRAND_NAME) {
         this.BRAND_NAME = BRAND_NAME;
    } 
    public String getDRUG_FORM(){
        return DRUG_FORM;
    } 
    public void setDRUG_FORM(String DRUG_FORM) {
         this.DRUG_FORM = DRUG_FORM;
    } 
    public String getDRUG_SPECS(){
        return DRUG_SPECS;
    } 
    public void setDRUG_SPECS(String DRUG_SPECS) {
         this.DRUG_SPECS = DRUG_SPECS;
    } 
    public String getDRUG_SPECS_UNIT(){
        return DRUG_SPECS_UNIT;
    } 
    public void setDRUG_SPECS_UNIT(String DRUG_SPECS_UNIT) {
         this.DRUG_SPECS_UNIT = DRUG_SPECS_UNIT;
    } 
    public String getDRUG_PACKAGE_UNIT(){
        return DRUG_PACKAGE_UNIT;
    } 
    public void setDRUG_PACKAGE_UNIT(String DRUG_PACKAGE_UNIT) {
         this.DRUG_PACKAGE_UNIT = DRUG_PACKAGE_UNIT;
    } 
    public String getADMINISTRATION(){
        return ADMINISTRATION;
    } 
    public void setADMINISTRATION(String ADMINISTRATION) {
         this.ADMINISTRATION = ADMINISTRATION;
    } 
    public Integer getDURATION(){
        return DURATION;
    } 
    public void setDURATION(Integer DURATION) {
         this.DURATION = DURATION;
    } 
    public String getDURATION_UNITS(){
        return DURATION_UNITS;
    } 
    public void setDURATION_UNITS(String DURATION_UNITS) {
         this.DURATION_UNITS = DURATION_UNITS;
    } 
    public String getFREQUENCY(){
        return FREQUENCY;
    } 
    public void setFREQUENCY(String FREQUENCY) {
         this.FREQUENCY = FREQUENCY;
    } 
    public String getFREQ_INTERVAL(){
        return FREQ_INTERVAL;
    } 
    public void setFREQ_INTERVAL(String FREQ_INTERVAL) {
         this.FREQ_INTERVAL = FREQ_INTERVAL;
    } 
    public String getFREQ_INTERVAL_UNIT(){
        return FREQ_INTERVAL_UNIT;
    } 
    public void setFREQ_INTERVAL_UNIT(String FREQ_INTERVAL_UNIT) {
         this.FREQ_INTERVAL_UNIT = FREQ_INTERVAL_UNIT;
    } 
    public Date getFREQ_DETAIL(){
        return FREQ_DETAIL;
    } 
    public void setFREQ_DETAIL(Date FREQ_DETAIL) {
         this.FREQ_DETAIL = FREQ_DETAIL;
    } 
    public Date getPERFORM_SCHEDULE(){
        return PERFORM_SCHEDULE;
    } 
    public void setPERFORM_SCHEDULE(Date PERFORM_SCHEDULE) {
         this.PERFORM_SCHEDULE = PERFORM_SCHEDULE;
    } 
    public String getORDERING_DEPT(){
        return ORDERING_DEPT;
    } 
    public void setORDERING_DEPT(String ORDERING_DEPT) {
         this.ORDERING_DEPT = ORDERING_DEPT;
    } 
    public String getORDERING_DOCTOR(){
        return ORDERING_DOCTOR;
    } 
    public void setORDERING_DOCTOR(String ORDERING_DOCTOR) {
         this.ORDERING_DOCTOR = ORDERING_DOCTOR;
    } 
    public Date getENTER_DATE_TIME(){
        return ENTER_DATE_TIME;
    } 
    public void setENTER_DATE_TIME(Date ENTER_DATE_TIME) {
         this.ENTER_DATE_TIME = ENTER_DATE_TIME;
    } 
    public String getORDER_STOP_DOCTOR(){
        return ORDER_STOP_DOCTOR;
    } 
    public void setORDER_STOP_DOCTOR(String ORDER_STOP_DOCTOR) {
         this.ORDER_STOP_DOCTOR = ORDER_STOP_DOCTOR;
    } 
    public Date getSTOP_ORDER_DATE_TIME(){
        return STOP_ORDER_DATE_TIME;
    } 
    public void setSTOP_ORDER_DATE_TIME(Date STOP_ORDER_DATE_TIME) {
         this.STOP_ORDER_DATE_TIME = STOP_ORDER_DATE_TIME;
    } 
    public String getORDER_CANCEL_DOCTOR(){
        return ORDER_CANCEL_DOCTOR;
    } 
    public void setORDER_CANCEL_DOCTOR(String ORDER_CANCEL_DOCTOR) {
         this.ORDER_CANCEL_DOCTOR = ORDER_CANCEL_DOCTOR;
    } 
    public Date getORDER_CANCEL_DATE_TIME(){
        return ORDER_CANCEL_DATE_TIME;
    } 
    public void setORDER_CANCEL_DATE_TIME(Date ORDER_CANCEL_DATE_TIME) {
         this.ORDER_CANCEL_DATE_TIME = ORDER_CANCEL_DATE_TIME;
    } 
    public String getORDER_STATUS(){
        return ORDER_STATUS;
    } 
    public void setORDER_STATUS(String ORDER_STATUS) {
         this.ORDER_STATUS = ORDER_STATUS;
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