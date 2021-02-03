package com.clinical.model.master;
import java.util.Date;
public class ENDOSCOPY{
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
    //检查日期
    private String DATE_TIME;
    //检查名称
    private String IMAGING_NAME;
    //麻醉方式
    private String ANESTHESIA;
    //检查操作
    private String PROCEDURE;
    //参数名称
    private String PARAMETER;
    //参数值
    private String VALUE;
    //结构名称
    private String STRUCTURE;
    //分区
    private String SUB_STRUCTURE;
    //异常发现
    private String FINDING;
    //颜色
    private String COLOR;
    //形态
    private String SHAPE;
    //否定词
    private String NEG;
    //可能性
    private String MODIFY;
    //大小
    private String SIZE;
    //数量
    private String COUNT;
    //趋势
    private String CHANGE;
    //状态
    private String STATUS;
    //观察方式
    private String OBSERVE;
    //染色方式
    private String DYING;
    //检查中处理
    private String TREATMENT;
    //器械
    private String DEVICE;
    //药物
    private String DRUG;
    //剂量
    private String DRUG_DOSE;
    //处理效果
    private String EFFECT;
    //分型
    private String TYPE;
    //分期
    private String STAGE;
    //HP感染检测结果
    private String HP_TEST;
    //诊断名称
    private String DIAG;
    //内镜检查信息字段来源
    private String FS_NLP;
    //内镜检查信息字段来源中文备注
    private String FS_NLP_CN;
    //字段来源中的出现序号
    private Double FS_SERIAL_NUMBER;
    //字段来源中检查信息所在位置
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
    //标准化结构名称
    private String STRUCTURE_STD;
    //标准化分区
    private String SUB_STRUCTURE_STD;
    //标准化异常发现1
    private String FINDING1_STD;
    //标准化异常发现2
    private String FINDING2_STD;
    //标准化否定词
    private String NEG_STD;
    //标准化大小1
    private String SIZE1_STD;
    //标准化大小2
    private String SIZE2_STD;
    //标准化大小3
    private String SIZE3_STD;
    //标准化大小4
    private String SIZE4_STD;
    //标准化大小5
    private String SIZE5_STD;
    //标准化大小6
    private String SIZE6_STD;
    //标准化大小7
    private String SIZE7_STD;
    //标准化数量
    private String COUNT_STD;
    //标准化检查中处理1
    private String TREATMENT1_STD;
    //标准化检查中处理2
    private String TREATMENT2_STD;
    //标准化分型1
    private String TYPE1_STD;
    //标准化分型2
    private String TYPE2_STD;
    //标准化分型3
    private String TYPE3_STD;
    //标准化分期
    private String STAGE_STD;
    //标准化HP感染检测结果
    private String HP_TEST_STD;
    //标准化诊断名称
    private String DIAG_STD;

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
    public String getIMAGING_NAME(){
        return IMAGING_NAME;
    } 
    public void setIMAGING_NAME(String IMAGING_NAME) {
         this.IMAGING_NAME = IMAGING_NAME;
    } 
    public String getANESTHESIA(){
        return ANESTHESIA;
    } 
    public void setANESTHESIA(String ANESTHESIA) {
         this.ANESTHESIA = ANESTHESIA;
    } 
    public String getPROCEDURE(){
        return PROCEDURE;
    } 
    public void setPROCEDURE(String PROCEDURE) {
         this.PROCEDURE = PROCEDURE;
    } 
    public String getPARAMETER(){
        return PARAMETER;
    } 
    public void setPARAMETER(String PARAMETER) {
         this.PARAMETER = PARAMETER;
    } 
    public String getVALUE(){
        return VALUE;
    } 
    public void setVALUE(String VALUE) {
         this.VALUE = VALUE;
    } 
    public String getSTRUCTURE(){
        return STRUCTURE;
    } 
    public void setSTRUCTURE(String STRUCTURE) {
         this.STRUCTURE = STRUCTURE;
    } 
    public String getSUB_STRUCTURE(){
        return SUB_STRUCTURE;
    } 
    public void setSUB_STRUCTURE(String SUB_STRUCTURE) {
         this.SUB_STRUCTURE = SUB_STRUCTURE;
    } 
    public String getFINDING(){
        return FINDING;
    } 
    public void setFINDING(String FINDING) {
         this.FINDING = FINDING;
    } 
    public String getCOLOR(){
        return COLOR;
    } 
    public void setCOLOR(String COLOR) {
         this.COLOR = COLOR;
    } 
    public String getSHAPE(){
        return SHAPE;
    } 
    public void setSHAPE(String SHAPE) {
         this.SHAPE = SHAPE;
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
    public String getSTATUS(){
        return STATUS;
    } 
    public void setSTATUS(String STATUS) {
         this.STATUS = STATUS;
    } 
    public String getOBSERVE(){
        return OBSERVE;
    } 
    public void setOBSERVE(String OBSERVE) {
         this.OBSERVE = OBSERVE;
    } 
    public String getDYING(){
        return DYING;
    } 
    public void setDYING(String DYING) {
         this.DYING = DYING;
    } 
    public String getTREATMENT(){
        return TREATMENT;
    } 
    public void setTREATMENT(String TREATMENT) {
         this.TREATMENT = TREATMENT;
    } 
    public String getDEVICE(){
        return DEVICE;
    } 
    public void setDEVICE(String DEVICE) {
         this.DEVICE = DEVICE;
    } 
    public String getDRUG(){
        return DRUG;
    } 
    public void setDRUG(String DRUG) {
         this.DRUG = DRUG;
    } 
    public String getDRUG_DOSE(){
        return DRUG_DOSE;
    } 
    public void setDRUG_DOSE(String DRUG_DOSE) {
         this.DRUG_DOSE = DRUG_DOSE;
    } 
    public String getEFFECT(){
        return EFFECT;
    } 
    public void setEFFECT(String EFFECT) {
         this.EFFECT = EFFECT;
    } 
    public String getTYPE(){
        return TYPE;
    } 
    public void setTYPE(String TYPE) {
         this.TYPE = TYPE;
    } 
    public String getSTAGE(){
        return STAGE;
    } 
    public void setSTAGE(String STAGE) {
         this.STAGE = STAGE;
    } 
    public String getHP_TEST(){
        return HP_TEST;
    } 
    public void setHP_TEST(String HP_TEST) {
         this.HP_TEST = HP_TEST;
    } 
    public String getDIAG(){
        return DIAG;
    } 
    public void setDIAG(String DIAG) {
         this.DIAG = DIAG;
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
    public String getSTRUCTURE_STD(){
        return STRUCTURE_STD;
    } 
    public void setSTRUCTURE_STD(String STRUCTURE_STD) {
         this.STRUCTURE_STD = STRUCTURE_STD;
    } 
    public String getSUB_STRUCTURE_STD(){
        return SUB_STRUCTURE_STD;
    } 
    public void setSUB_STRUCTURE_STD(String SUB_STRUCTURE_STD) {
         this.SUB_STRUCTURE_STD = SUB_STRUCTURE_STD;
    } 
    public String getFINDING1_STD(){
        return FINDING1_STD;
    } 
    public void setFINDING1_STD(String FINDING1_STD) {
         this.FINDING1_STD = FINDING1_STD;
    } 
    public String getFINDING2_STD(){
        return FINDING2_STD;
    } 
    public void setFINDING2_STD(String FINDING2_STD) {
         this.FINDING2_STD = FINDING2_STD;
    } 
    public String getNEG_STD(){
        return NEG_STD;
    } 
    public void setNEG_STD(String NEG_STD) {
         this.NEG_STD = NEG_STD;
    } 
    public String getSIZE1_STD(){
        return SIZE1_STD;
    } 
    public void setSIZE1_STD(String SIZE1_STD) {
         this.SIZE1_STD = SIZE1_STD;
    } 
    public String getSIZE2_STD(){
        return SIZE2_STD;
    } 
    public void setSIZE2_STD(String SIZE2_STD) {
         this.SIZE2_STD = SIZE2_STD;
    } 
    public String getSIZE3_STD(){
        return SIZE3_STD;
    } 
    public void setSIZE3_STD(String SIZE3_STD) {
         this.SIZE3_STD = SIZE3_STD;
    } 
    public String getSIZE4_STD(){
        return SIZE4_STD;
    } 
    public void setSIZE4_STD(String SIZE4_STD) {
         this.SIZE4_STD = SIZE4_STD;
    } 
    public String getSIZE5_STD(){
        return SIZE5_STD;
    } 
    public void setSIZE5_STD(String SIZE5_STD) {
         this.SIZE5_STD = SIZE5_STD;
    } 
    public String getSIZE6_STD(){
        return SIZE6_STD;
    } 
    public void setSIZE6_STD(String SIZE6_STD) {
         this.SIZE6_STD = SIZE6_STD;
    } 
    public String getSIZE7_STD(){
        return SIZE7_STD;
    } 
    public void setSIZE7_STD(String SIZE7_STD) {
         this.SIZE7_STD = SIZE7_STD;
    } 
    public String getCOUNT_STD(){
        return COUNT_STD;
    } 
    public void setCOUNT_STD(String COUNT_STD) {
         this.COUNT_STD = COUNT_STD;
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
    public String getTYPE1_STD(){
        return TYPE1_STD;
    } 
    public void setTYPE1_STD(String TYPE1_STD) {
         this.TYPE1_STD = TYPE1_STD;
    } 
    public String getTYPE2_STD(){
        return TYPE2_STD;
    } 
    public void setTYPE2_STD(String TYPE2_STD) {
         this.TYPE2_STD = TYPE2_STD;
    } 
    public String getTYPE3_STD(){
        return TYPE3_STD;
    } 
    public void setTYPE3_STD(String TYPE3_STD) {
         this.TYPE3_STD = TYPE3_STD;
    } 
    public String getSTAGE_STD(){
        return STAGE_STD;
    } 
    public void setSTAGE_STD(String STAGE_STD) {
         this.STAGE_STD = STAGE_STD;
    } 
    public String getHP_TEST_STD(){
        return HP_TEST_STD;
    } 
    public void setHP_TEST_STD(String HP_TEST_STD) {
         this.HP_TEST_STD = HP_TEST_STD;
    } 
    public String getDIAG_STD(){
        return DIAG_STD;
    } 
    public void setDIAG_STD(String DIAG_STD) {
         this.DIAG_STD = DIAG_STD;
    } 
}