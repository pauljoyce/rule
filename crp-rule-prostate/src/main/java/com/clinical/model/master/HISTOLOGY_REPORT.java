package com.clinical.model.master;
import java.util.Date;
public class HISTOLOGY_REPORT{
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
    //住院号
    private String VISIT_ID;
    //住院次数
    private Integer ADMISSION_NUMBER;
    //就诊类型
    private String VISIT_TYPE;
    //病理系统编号
    private String PATHOLOGY_NO;
    //送检医院
    private String INSPECTION_HOSPITAL;
    //送检科室
    private String INSPECTION_DEPARTMENT;
    //送检医师
    private String INSPECTION_PHYSICIAN;
    //送检时间
    private Date INSPECTION_TIME;
    //送检部位
    private String INSPECTION_SITE;
    //临床诊断
    private String CLINICAL_DIAGNOSIS;
    //姓名
    private String NAME;
    //标本接收时间
    private Date SPECIMEN_RECEIVING_TIME;
    //报告时间
    private Date REPORT_TIME;
    //审核时间
    private Date REVIEW_TIME;
    //病理所见-肉眼所见
    private String PATH_EYE;
    //病理所见-镜下所见
    private String PATH_MICROSCOPE;
    //病理诊断
    private String PATH_DIAG;
    //病理诊断编码
    private String PATH_DIAG_CODE;
    //报告医师
    private String REPORT_DOCTOR;
    //审核医师
    private String REVIEW_DOCTOR;
    //报告状态
    private String REPORT_STATUS;
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
    public String getVISIT_TYPE(){
        return VISIT_TYPE;
    } 
    public void setVISIT_TYPE(String VISIT_TYPE) {
         this.VISIT_TYPE = VISIT_TYPE;
    } 
    public String getPATHOLOGY_NO(){
        return PATHOLOGY_NO;
    } 
    public void setPATHOLOGY_NO(String PATHOLOGY_NO) {
         this.PATHOLOGY_NO = PATHOLOGY_NO;
    } 
    public String getINSPECTION_HOSPITAL(){
        return INSPECTION_HOSPITAL;
    } 
    public void setINSPECTION_HOSPITAL(String INSPECTION_HOSPITAL) {
         this.INSPECTION_HOSPITAL = INSPECTION_HOSPITAL;
    } 
    public String getINSPECTION_DEPARTMENT(){
        return INSPECTION_DEPARTMENT;
    } 
    public void setINSPECTION_DEPARTMENT(String INSPECTION_DEPARTMENT) {
         this.INSPECTION_DEPARTMENT = INSPECTION_DEPARTMENT;
    } 
    public String getINSPECTION_PHYSICIAN(){
        return INSPECTION_PHYSICIAN;
    } 
    public void setINSPECTION_PHYSICIAN(String INSPECTION_PHYSICIAN) {
         this.INSPECTION_PHYSICIAN = INSPECTION_PHYSICIAN;
    } 
    public Date getINSPECTION_TIME(){
        return INSPECTION_TIME;
    } 
    public void setINSPECTION_TIME(Date INSPECTION_TIME) {
         this.INSPECTION_TIME = INSPECTION_TIME;
    } 
    public String getINSPECTION_SITE(){
        return INSPECTION_SITE;
    } 
    public void setINSPECTION_SITE(String INSPECTION_SITE) {
         this.INSPECTION_SITE = INSPECTION_SITE;
    } 
    public String getCLINICAL_DIAGNOSIS(){
        return CLINICAL_DIAGNOSIS;
    } 
    public void setCLINICAL_DIAGNOSIS(String CLINICAL_DIAGNOSIS) {
         this.CLINICAL_DIAGNOSIS = CLINICAL_DIAGNOSIS;
    } 
    public String getNAME(){
        return NAME;
    } 
    public void setNAME(String NAME) {
         this.NAME = NAME;
    } 
    public Date getSPECIMEN_RECEIVING_TIME(){
        return SPECIMEN_RECEIVING_TIME;
    } 
    public void setSPECIMEN_RECEIVING_TIME(Date SPECIMEN_RECEIVING_TIME) {
         this.SPECIMEN_RECEIVING_TIME = SPECIMEN_RECEIVING_TIME;
    } 
    public Date getREPORT_TIME(){
        return REPORT_TIME;
    } 
    public void setREPORT_TIME(Date REPORT_TIME) {
         this.REPORT_TIME = REPORT_TIME;
    } 
    public Date getREVIEW_TIME(){
        return REVIEW_TIME;
    } 
    public void setREVIEW_TIME(Date REVIEW_TIME) {
         this.REVIEW_TIME = REVIEW_TIME;
    } 
    public String getPATH_EYE(){
        return PATH_EYE;
    } 
    public void setPATH_EYE(String PATH_EYE) {
         this.PATH_EYE = PATH_EYE;
    } 
    public String getPATH_MICROSCOPE(){
        return PATH_MICROSCOPE;
    } 
    public void setPATH_MICROSCOPE(String PATH_MICROSCOPE) {
         this.PATH_MICROSCOPE = PATH_MICROSCOPE;
    } 
    public String getPATH_DIAG(){
        return PATH_DIAG;
    } 
    public void setPATH_DIAG(String PATH_DIAG) {
         this.PATH_DIAG = PATH_DIAG;
    } 
    public String getPATH_DIAG_CODE(){
        return PATH_DIAG_CODE;
    } 
    public void setPATH_DIAG_CODE(String PATH_DIAG_CODE) {
         this.PATH_DIAG_CODE = PATH_DIAG_CODE;
    } 
    public String getREPORT_DOCTOR(){
        return REPORT_DOCTOR;
    } 
    public void setREPORT_DOCTOR(String REPORT_DOCTOR) {
         this.REPORT_DOCTOR = REPORT_DOCTOR;
    } 
    public String getREVIEW_DOCTOR(){
        return REVIEW_DOCTOR;
    } 
    public void setREVIEW_DOCTOR(String REVIEW_DOCTOR) {
         this.REVIEW_DOCTOR = REVIEW_DOCTOR;
    } 
    public String getREPORT_STATUS(){
        return REPORT_STATUS;
    } 
    public void setREPORT_STATUS(String REPORT_STATUS) {
         this.REPORT_STATUS = REPORT_STATUS;
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