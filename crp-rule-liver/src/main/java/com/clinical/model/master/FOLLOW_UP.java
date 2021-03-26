package com.clinical.model.master;
import java.util.Date;
public class FOLLOW_UP{
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
    //随访时间
    private Date FOLLOWUP_TIME;
    //年龄
    private Integer AGE;
    //确诊日期
    private Date DIAGNOSIS_DATE;
    //初治日期
    private Date FIRST_TREATMENT_DATE;
    //初治年龄
    private Integer FIRST_TREATMENT_AGE;
    //随诊周期
    private Integer FOLLOWUP_CYCLE;
    //随访状态
    private String FOLLOWUP_STATUS;
    //治疗情况
    private String TREATMENT;
    //治疗项目
    private String TREAT_ITEMS;
    //治疗医院
    private String TREAT_HOSPITAL;
    //治疗医院住院号
    private String TREAT_ADM_NO;
    //最后接触日期
    private Date LAST_CONTACT_DATE;
    //最后接触状态
    private String LAST_CONTACT_STATUS;
    //死亡日期
    private Date DATE_OF_DEATH;
    //生存时间
    private Date SURVIVAL_TIME;
    //死亡原因
    private String CAUSE_OF_DEATH;
    //死亡地点
    private String PLACE_OF_DEATH;
    //撤销随访日期
    private Date WITHDRAWAL__DATE;
    //撤销随访原因
    private String WITHDRAWING_REASONS;
    //肿瘤状态
    private String TUMOUR_STA;
    //随访更新开关状态
    private String FOLLOW_SWITCH_STA;
    //随访方法
    private String FOLLOW_METHOD;
    //随访机构名称
    private String FOLLOW_ORG_NAME;
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
    public Date getFOLLOWUP_TIME(){
        return FOLLOWUP_TIME;
    } 
    public void setFOLLOWUP_TIME(Date FOLLOWUP_TIME) {
             this.FOLLOWUP_TIME = FOLLOWUP_TIME;
    } 
    public Integer getAGE(){
        return AGE;
    } 
    public void setAGE(Integer AGE) {
             this.AGE = AGE;
    } 
    public Date getDIAGNOSIS_DATE(){
        return DIAGNOSIS_DATE;
    } 
    public void setDIAGNOSIS_DATE(Date DIAGNOSIS_DATE) {
             this.DIAGNOSIS_DATE = DIAGNOSIS_DATE;
    } 
    public Date getFIRST_TREATMENT_DATE(){
        return FIRST_TREATMENT_DATE;
    } 
    public void setFIRST_TREATMENT_DATE(Date FIRST_TREATMENT_DATE) {
             this.FIRST_TREATMENT_DATE = FIRST_TREATMENT_DATE;
    } 
    public Integer getFIRST_TREATMENT_AGE(){
        return FIRST_TREATMENT_AGE;
    } 
    public void setFIRST_TREATMENT_AGE(Integer FIRST_TREATMENT_AGE) {
             this.FIRST_TREATMENT_AGE = FIRST_TREATMENT_AGE;
    } 
    public Integer getFOLLOWUP_CYCLE(){
        return FOLLOWUP_CYCLE;
    } 
    public void setFOLLOWUP_CYCLE(Integer FOLLOWUP_CYCLE) {
             this.FOLLOWUP_CYCLE = FOLLOWUP_CYCLE;
    } 
    public String getFOLLOWUP_STATUS(){
        return FOLLOWUP_STATUS;
    } 
    public void setFOLLOWUP_STATUS(String FOLLOWUP_STATUS) {
             this.FOLLOWUP_STATUS = FOLLOWUP_STATUS;
    } 
    public String getTREATMENT(){
        return TREATMENT;
    } 
    public void setTREATMENT(String TREATMENT) {
             this.TREATMENT = TREATMENT;
    } 
    public String getTREAT_ITEMS(){
        return TREAT_ITEMS;
    } 
    public void setTREAT_ITEMS(String TREAT_ITEMS) {
             this.TREAT_ITEMS = TREAT_ITEMS;
    } 
    public String getTREAT_HOSPITAL(){
        return TREAT_HOSPITAL;
    } 
    public void setTREAT_HOSPITAL(String TREAT_HOSPITAL) {
             this.TREAT_HOSPITAL = TREAT_HOSPITAL;
    } 
    public String getTREAT_ADM_NO(){
        return TREAT_ADM_NO;
    } 
    public void setTREAT_ADM_NO(String TREAT_ADM_NO) {
             this.TREAT_ADM_NO = TREAT_ADM_NO;
    } 
    public Date getLAST_CONTACT_DATE(){
        return LAST_CONTACT_DATE;
    } 
    public void setLAST_CONTACT_DATE(Date LAST_CONTACT_DATE) {
             this.LAST_CONTACT_DATE = LAST_CONTACT_DATE;
    } 
    public String getLAST_CONTACT_STATUS(){
        return LAST_CONTACT_STATUS;
    } 
    public void setLAST_CONTACT_STATUS(String LAST_CONTACT_STATUS) {
             this.LAST_CONTACT_STATUS = LAST_CONTACT_STATUS;
    } 
    public Date getDATE_OF_DEATH(){
        return DATE_OF_DEATH;
    } 
    public void setDATE_OF_DEATH(Date DATE_OF_DEATH) {
             this.DATE_OF_DEATH = DATE_OF_DEATH;
    } 
    public Date getSURVIVAL_TIME(){
        return SURVIVAL_TIME;
    } 
    public void setSURVIVAL_TIME(Date SURVIVAL_TIME) {
             this.SURVIVAL_TIME = SURVIVAL_TIME;
    } 
    public String getCAUSE_OF_DEATH(){
        return CAUSE_OF_DEATH;
    } 
    public void setCAUSE_OF_DEATH(String CAUSE_OF_DEATH) {
             this.CAUSE_OF_DEATH = CAUSE_OF_DEATH;
    } 
    public String getPLACE_OF_DEATH(){
        return PLACE_OF_DEATH;
    } 
    public void setPLACE_OF_DEATH(String PLACE_OF_DEATH) {
             this.PLACE_OF_DEATH = PLACE_OF_DEATH;
    } 
    public Date getWITHDRAWAL__DATE(){
        return WITHDRAWAL__DATE;
    } 
    public void setWITHDRAWAL__DATE(Date WITHDRAWAL__DATE) {
             this.WITHDRAWAL__DATE = WITHDRAWAL__DATE;
    } 
    public String getWITHDRAWING_REASONS(){
        return WITHDRAWING_REASONS;
    } 
    public void setWITHDRAWING_REASONS(String WITHDRAWING_REASONS) {
             this.WITHDRAWING_REASONS = WITHDRAWING_REASONS;
    } 
    public String getTUMOUR_STA(){
        return TUMOUR_STA;
    } 
    public void setTUMOUR_STA(String TUMOUR_STA) {
             this.TUMOUR_STA = TUMOUR_STA;
    } 
    public String getFOLLOW_SWITCH_STA(){
        return FOLLOW_SWITCH_STA;
    } 
    public void setFOLLOW_SWITCH_STA(String FOLLOW_SWITCH_STA) {
             this.FOLLOW_SWITCH_STA = FOLLOW_SWITCH_STA;
    } 
    public String getFOLLOW_METHOD(){
        return FOLLOW_METHOD;
    } 
    public void setFOLLOW_METHOD(String FOLLOW_METHOD) {
             this.FOLLOW_METHOD = FOLLOW_METHOD;
    } 
    public String getFOLLOW_ORG_NAME(){
        return FOLLOW_ORG_NAME;
    } 
    public void setFOLLOW_ORG_NAME(String FOLLOW_ORG_NAME) {
             this.FOLLOW_ORG_NAME = FOLLOW_ORG_NAME;
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