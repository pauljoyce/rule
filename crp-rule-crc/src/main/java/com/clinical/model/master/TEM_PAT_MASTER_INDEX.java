package com.clinical.model.master;
import java.util.Date;
public class TEM_PAT_MASTER_INDEX{
    //主键id
    private String ID;
    //唯一标识
    private String UNIQUE_ID;
    //医疗机构代码
    private String P900;
    //患者id
    private String PATIENT_ID;
    //住院号
    private String VISIT_ID;
    //姓名
    private String NAME;
    //性别
    private String SEX;
    //出生日期
    private Date DATE_OF_BIRTH;
    //出生地
    private String BIRTH_PLACE;
    //国籍
    private String CITIZENSHIP;
    //民族
    private String NATION;
    //身份证号
    private String ID_NO;
    //合同单位
    private String UNIT_IN_CONTRACT;
    //住址
    private String MAILING_ADDRESS;
    //联系人
    private String NEXT_OF_KIN;
    //联系电话
    private String TELEPHONE;
    //与联系人关系
    private String RELATIONSHIP;
    //入院来源
    private String PATIENT_CLASS;
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
    public String getNAME(){
        return NAME;
    } 
    public void setNAME(String NAME) {
         this.NAME = NAME;
    } 
    public String getSEX(){
        return SEX;
    } 
    public void setSEX(String SEX) {
         this.SEX = SEX;
    } 
    public Date getDATE_OF_BIRTH(){
        return DATE_OF_BIRTH;
    } 
    public void setDATE_OF_BIRTH(Date DATE_OF_BIRTH) {
         this.DATE_OF_BIRTH = DATE_OF_BIRTH;
    } 
    public String getBIRTH_PLACE(){
        return BIRTH_PLACE;
    } 
    public void setBIRTH_PLACE(String BIRTH_PLACE) {
         this.BIRTH_PLACE = BIRTH_PLACE;
    } 
    public String getCITIZENSHIP(){
        return CITIZENSHIP;
    } 
    public void setCITIZENSHIP(String CITIZENSHIP) {
         this.CITIZENSHIP = CITIZENSHIP;
    } 
    public String getNATION(){
        return NATION;
    } 
    public void setNATION(String NATION) {
         this.NATION = NATION;
    } 
    public String getID_NO(){
        return ID_NO;
    } 
    public void setID_NO(String ID_NO) {
         this.ID_NO = ID_NO;
    } 
    public String getUNIT_IN_CONTRACT(){
        return UNIT_IN_CONTRACT;
    } 
    public void setUNIT_IN_CONTRACT(String UNIT_IN_CONTRACT) {
         this.UNIT_IN_CONTRACT = UNIT_IN_CONTRACT;
    } 
    public String getMAILING_ADDRESS(){
        return MAILING_ADDRESS;
    } 
    public void setMAILING_ADDRESS(String MAILING_ADDRESS) {
         this.MAILING_ADDRESS = MAILING_ADDRESS;
    } 
    public String getNEXT_OF_KIN(){
        return NEXT_OF_KIN;
    } 
    public void setNEXT_OF_KIN(String NEXT_OF_KIN) {
         this.NEXT_OF_KIN = NEXT_OF_KIN;
    } 
    public String getTELEPHONE(){
        return TELEPHONE;
    } 
    public void setTELEPHONE(String TELEPHONE) {
         this.TELEPHONE = TELEPHONE;
    } 
    public String getRELATIONSHIP(){
        return RELATIONSHIP;
    } 
    public void setRELATIONSHIP(String RELATIONSHIP) {
         this.RELATIONSHIP = RELATIONSHIP;
    } 
    public String getPATIENT_CLASS(){
        return PATIENT_CLASS;
    } 
    public void setPATIENT_CLASS(String PATIENT_CLASS) {
         this.PATIENT_CLASS = PATIENT_CLASS;
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