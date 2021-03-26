package com.clinical.model.master;
import java.util.Date;
public class EXAM_MASTER{
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
    //检查系统编号
    private String EXAM_NO;
    //就诊类型
    private String VISIT_TYPE;
    //门诊/住院号
    private String VISIT_ID;
    //住院次数
    private Integer ADMISSION_NUMBER;
    //姓名
    private String FULL_NAME;
    //性别
    private String SEX;
    //年龄
    private Integer AGE;
    //检查类别
    private String EXAM_CLASS;
    //临床症状
    private String CLIN_SYMP;
    //体征
    private String PHYS_SIGN;
    //相关化验结果
    private String RELEVANT_LAB_TEST;
    //其他诊断
    private String RELEVANT_DIAG;
    //临床诊断
    private String CLIN_DIAG;
    //检查方式
    private String EXAM_MODE;
    //使用仪器
    private String DEVICE;
    //执行科室
    private String PERFORMED_BY;
    //病人来源
    private String PATIENT_SOURCE;
    //申请日期时间
    private Date REQ_DATE_TIME;
    //申请科室
    private String REQ_DEPT;
    //申请医生
    private String REQ_PHYSICIAN;
    //注意事项
    private String NOTICE;
    //检查日期时间
    private Date EXAM_DATE_TIME;
    //报告日期时间
    private Date REPORT_DATE_TIME;
    //检查部位
    private String EXAM_POSITION;
    //报告医师
    private String DIAG_DOCTOR;
    //审核医生
    private String REVIEW_DOCTOR;
    //检查项目
    private String ENTRY_NAME;
    //检查结论
    private String ENTRY_RESULTS;
    //检查参数
    private String EXAM_PARA;
    //检查所见
    private String DESCRIPTION;
    //是否阳性
    private String IS_ABNORMAL;
    //报告中图像编号
    private String USE_IMAGE;
    //备注
    private String MEMO;
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
    //标准化检查项目名称
    private String EXAM_CLASS_STD;
    //检查方式1
    private String EXAM_MODE1_STD;
    //身体部位1
    private String STRUCTURE1_STD;
    //标准名称1
    private String EXAM_NAME1_STD;
    //检查方式2
    private String EXAM_MODE2_STD;
    //身体部位2
    private String STRUCTURE2_STD;
    //标准名称2
    private String EXAM_NAME2_STD;
    //检查方式3
    private String EXAM_MODE3_STD;
    //身体部位3
    private String STRUCTURE3_STD;
    //标准名称3
    private String EXAM_NAME3_STD;
    //检查方式4
    private String EXAM_MODE4_STD;
    //身体部位4
    private String STRUCTURE4_STD;
    //标准名称4
    private String EXAM_NAME4_STD;
    //检查方式5
    private String EXAM_MODE5_STD;
    //身体部位5
    private String STRUCTURE5_STD;
    //标准名称5
    private String EXAM_NAME5_STD;
    //检查方式6
    private String EXAM_MODE6_STD;
    //身体部位6
    private String STRUCTURE6_STD;
    //标准名称6
    private String EXAM_NAME6_STD;

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
    public String getEXAM_NO(){
        return EXAM_NO;
    } 
    public void setEXAM_NO(String EXAM_NO) {
             this.EXAM_NO = EXAM_NO;
    } 
    public String getVISIT_TYPE(){
        return VISIT_TYPE;
    } 
    public void setVISIT_TYPE(String VISIT_TYPE) {
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
    public String getFULL_NAME(){
        return FULL_NAME;
    } 
    public void setFULL_NAME(String FULL_NAME) {
             this.FULL_NAME = FULL_NAME;
    } 
    public String getSEX(){
        return SEX;
    } 
    public void setSEX(String SEX) {
             this.SEX = SEX;
    } 
    public Integer getAGE(){
        return AGE;
    } 
    public void setAGE(Integer AGE) {
             this.AGE = AGE;
    } 
    public String getEXAM_CLASS(){
        return EXAM_CLASS;
    } 
    public void setEXAM_CLASS(String EXAM_CLASS) {
             this.EXAM_CLASS = EXAM_CLASS;
    } 
    public String getCLIN_SYMP(){
        return CLIN_SYMP;
    } 
    public void setCLIN_SYMP(String CLIN_SYMP) {
             this.CLIN_SYMP = CLIN_SYMP;
    } 
    public String getPHYS_SIGN(){
        return PHYS_SIGN;
    } 
    public void setPHYS_SIGN(String PHYS_SIGN) {
             this.PHYS_SIGN = PHYS_SIGN;
    } 
    public String getRELEVANT_LAB_TEST(){
        return RELEVANT_LAB_TEST;
    } 
    public void setRELEVANT_LAB_TEST(String RELEVANT_LAB_TEST) {
             this.RELEVANT_LAB_TEST = RELEVANT_LAB_TEST;
    } 
    public String getRELEVANT_DIAG(){
        return RELEVANT_DIAG;
    } 
    public void setRELEVANT_DIAG(String RELEVANT_DIAG) {
             this.RELEVANT_DIAG = RELEVANT_DIAG;
    } 
    public String getCLIN_DIAG(){
        return CLIN_DIAG;
    } 
    public void setCLIN_DIAG(String CLIN_DIAG) {
             this.CLIN_DIAG = CLIN_DIAG;
    } 
    public String getEXAM_MODE(){
        return EXAM_MODE;
    } 
    public void setEXAM_MODE(String EXAM_MODE) {
             this.EXAM_MODE = EXAM_MODE;
    } 
    public String getDEVICE(){
        return DEVICE;
    } 
    public void setDEVICE(String DEVICE) {
             this.DEVICE = DEVICE;
    } 
    public String getPERFORMED_BY(){
        return PERFORMED_BY;
    } 
    public void setPERFORMED_BY(String PERFORMED_BY) {
             this.PERFORMED_BY = PERFORMED_BY;
    } 
    public String getPATIENT_SOURCE(){
        return PATIENT_SOURCE;
    } 
    public void setPATIENT_SOURCE(String PATIENT_SOURCE) {
             this.PATIENT_SOURCE = PATIENT_SOURCE;
    } 
    public Date getREQ_DATE_TIME(){
        return REQ_DATE_TIME;
    } 
    public void setREQ_DATE_TIME(Date REQ_DATE_TIME) {
             this.REQ_DATE_TIME = REQ_DATE_TIME;
    } 
    public String getREQ_DEPT(){
        return REQ_DEPT;
    } 
    public void setREQ_DEPT(String REQ_DEPT) {
             this.REQ_DEPT = REQ_DEPT;
    } 
    public String getREQ_PHYSICIAN(){
        return REQ_PHYSICIAN;
    } 
    public void setREQ_PHYSICIAN(String REQ_PHYSICIAN) {
             this.REQ_PHYSICIAN = REQ_PHYSICIAN;
    } 
    public String getNOTICE(){
        return NOTICE;
    } 
    public void setNOTICE(String NOTICE) {
             this.NOTICE = NOTICE;
    } 
    public Date getEXAM_DATE_TIME(){
        return EXAM_DATE_TIME;
    } 
    public void setEXAM_DATE_TIME(Date EXAM_DATE_TIME) {
             this.EXAM_DATE_TIME = EXAM_DATE_TIME;
    } 
    public Date getREPORT_DATE_TIME(){
        return REPORT_DATE_TIME;
    } 
    public void setREPORT_DATE_TIME(Date REPORT_DATE_TIME) {
             this.REPORT_DATE_TIME = REPORT_DATE_TIME;
    } 
    public String getEXAM_POSITION(){
        return EXAM_POSITION;
    } 
    public void setEXAM_POSITION(String EXAM_POSITION) {
             this.EXAM_POSITION = EXAM_POSITION;
    } 
    public String getDIAG_DOCTOR(){
        return DIAG_DOCTOR;
    } 
    public void setDIAG_DOCTOR(String DIAG_DOCTOR) {
             this.DIAG_DOCTOR = DIAG_DOCTOR;
    } 
    public String getREVIEW_DOCTOR(){
        return REVIEW_DOCTOR;
    } 
    public void setREVIEW_DOCTOR(String REVIEW_DOCTOR) {
             this.REVIEW_DOCTOR = REVIEW_DOCTOR;
    } 
    public String getENTRY_NAME(){
        return ENTRY_NAME;
    } 
    public void setENTRY_NAME(String ENTRY_NAME) {
             this.ENTRY_NAME = ENTRY_NAME;
    } 
    public String getENTRY_RESULTS(){
        return ENTRY_RESULTS;
    } 
    public void setENTRY_RESULTS(String ENTRY_RESULTS) {
             this.ENTRY_RESULTS = ENTRY_RESULTS;
    } 
    public String getEXAM_PARA(){
        return EXAM_PARA;
    } 
    public void setEXAM_PARA(String EXAM_PARA) {
             this.EXAM_PARA = EXAM_PARA;
    } 
    public String getDESCRIPTION(){
        return DESCRIPTION;
    } 
    public void setDESCRIPTION(String DESCRIPTION) {
             this.DESCRIPTION = DESCRIPTION;
    } 
    public String getIS_ABNORMAL(){
        return IS_ABNORMAL;
    } 
    public void setIS_ABNORMAL(String IS_ABNORMAL) {
             this.IS_ABNORMAL = IS_ABNORMAL;
    } 
    public String getUSE_IMAGE(){
        return USE_IMAGE;
    } 
    public void setUSE_IMAGE(String USE_IMAGE) {
             this.USE_IMAGE = USE_IMAGE;
    } 
    public String getMEMO(){
        return MEMO;
    } 
    public void setMEMO(String MEMO) {
             this.MEMO = MEMO;
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
    public String getEXAM_CLASS_STD(){
        return EXAM_CLASS_STD;
    } 
    public void setEXAM_CLASS_STD(String EXAM_CLASS_STD) {
             this.EXAM_CLASS_STD = EXAM_CLASS_STD;
    } 
    public String getEXAM_MODE1_STD(){
        return EXAM_MODE1_STD;
    } 
    public void setEXAM_MODE1_STD(String EXAM_MODE1_STD) {
             this.EXAM_MODE1_STD = EXAM_MODE1_STD;
    } 
    public String getSTRUCTURE1_STD(){
        return STRUCTURE1_STD;
    } 
    public void setSTRUCTURE1_STD(String STRUCTURE1_STD) {
             this.STRUCTURE1_STD = STRUCTURE1_STD;
    } 
    public String getEXAM_NAME1_STD(){
        return EXAM_NAME1_STD;
    } 
    public void setEXAM_NAME1_STD(String EXAM_NAME1_STD) {
             this.EXAM_NAME1_STD = EXAM_NAME1_STD;
    } 
    public String getEXAM_MODE2_STD(){
        return EXAM_MODE2_STD;
    } 
    public void setEXAM_MODE2_STD(String EXAM_MODE2_STD) {
             this.EXAM_MODE2_STD = EXAM_MODE2_STD;
    } 
    public String getSTRUCTURE2_STD(){
        return STRUCTURE2_STD;
    } 
    public void setSTRUCTURE2_STD(String STRUCTURE2_STD) {
             this.STRUCTURE2_STD = STRUCTURE2_STD;
    } 
    public String getEXAM_NAME2_STD(){
        return EXAM_NAME2_STD;
    } 
    public void setEXAM_NAME2_STD(String EXAM_NAME2_STD) {
             this.EXAM_NAME2_STD = EXAM_NAME2_STD;
    } 
    public String getEXAM_MODE3_STD(){
        return EXAM_MODE3_STD;
    } 
    public void setEXAM_MODE3_STD(String EXAM_MODE3_STD) {
             this.EXAM_MODE3_STD = EXAM_MODE3_STD;
    } 
    public String getSTRUCTURE3_STD(){
        return STRUCTURE3_STD;
    } 
    public void setSTRUCTURE3_STD(String STRUCTURE3_STD) {
             this.STRUCTURE3_STD = STRUCTURE3_STD;
    } 
    public String getEXAM_NAME3_STD(){
        return EXAM_NAME3_STD;
    } 
    public void setEXAM_NAME3_STD(String EXAM_NAME3_STD) {
             this.EXAM_NAME3_STD = EXAM_NAME3_STD;
    } 
    public String getEXAM_MODE4_STD(){
        return EXAM_MODE4_STD;
    } 
    public void setEXAM_MODE4_STD(String EXAM_MODE4_STD) {
             this.EXAM_MODE4_STD = EXAM_MODE4_STD;
    } 
    public String getSTRUCTURE4_STD(){
        return STRUCTURE4_STD;
    } 
    public void setSTRUCTURE4_STD(String STRUCTURE4_STD) {
             this.STRUCTURE4_STD = STRUCTURE4_STD;
    } 
    public String getEXAM_NAME4_STD(){
        return EXAM_NAME4_STD;
    } 
    public void setEXAM_NAME4_STD(String EXAM_NAME4_STD) {
             this.EXAM_NAME4_STD = EXAM_NAME4_STD;
    } 
    public String getEXAM_MODE5_STD(){
        return EXAM_MODE5_STD;
    } 
    public void setEXAM_MODE5_STD(String EXAM_MODE5_STD) {
             this.EXAM_MODE5_STD = EXAM_MODE5_STD;
    } 
    public String getSTRUCTURE5_STD(){
        return STRUCTURE5_STD;
    } 
    public void setSTRUCTURE5_STD(String STRUCTURE5_STD) {
             this.STRUCTURE5_STD = STRUCTURE5_STD;
    } 
    public String getEXAM_NAME5_STD(){
        return EXAM_NAME5_STD;
    } 
    public void setEXAM_NAME5_STD(String EXAM_NAME5_STD) {
             this.EXAM_NAME5_STD = EXAM_NAME5_STD;
    } 
    public String getEXAM_MODE6_STD(){
        return EXAM_MODE6_STD;
    } 
    public void setEXAM_MODE6_STD(String EXAM_MODE6_STD) {
             this.EXAM_MODE6_STD = EXAM_MODE6_STD;
    } 
    public String getSTRUCTURE6_STD(){
        return STRUCTURE6_STD;
    } 
    public void setSTRUCTURE6_STD(String STRUCTURE6_STD) {
             this.STRUCTURE6_STD = STRUCTURE6_STD;
    } 
    public String getEXAM_NAME6_STD(){
        return EXAM_NAME6_STD;
    } 
    public void setEXAM_NAME6_STD(String EXAM_NAME6_STD) {
             this.EXAM_NAME6_STD = EXAM_NAME6_STD;
    } 
}