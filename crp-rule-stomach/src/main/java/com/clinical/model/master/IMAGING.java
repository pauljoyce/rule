package com.clinical.model.master;
import java.util.Date;
public class IMAGING{
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
    //结构名称
    private String STRUCTURE;
    //异常发现
    private String FINDING;
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
    //诊断名称
    private String DIAG;
    //测量参数名称
    private String PARAMETER;
    //测量参数值
    private String VALUE;
    //影像检查信息字段来源
    private String FS_NLP;
    //影像检查信息字段来源中文备注
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
    //标准化趋势
    private String CHANGE_STD;
    //标准化数量
    private String COUNT_STD;
    //诊断名称标准词1
    private String DIAG1_STD;
    //诊断名称标准词2
    private String DIAG2_STD;
    //标准化异常发现1
    private String FINDING1_STD;
    //标准化异常发现2
    private String FINDING2_STD;
    //标准化异常发现3
    private String FINDING3_STD;
    //标准化异常发现4
    private String FINDING4_STD;
    //标准化测量参数名称
    private String PARAMETER_STD;
    //最大径1
    private Integer MAX_DIAM1_STD;
    //中间径1
    private Integer MEDIAN_DIAM1_STD;
    //最小径1
    private Integer MIN_DIAM1_STD;
    //单位1
    private String UNIT1_STD;
    //最大径2
    private Integer MAX_DIAM2_STD;
    //中间径2
    private Integer MEDIAN_DIAM2_STD;
    //最小径2
    private Integer MIN_DIAM2_STD;
    //单位2
    private String UNIT2_STD;
    //最大径3
    private Integer MAX_DIAM3_STD;
    //中间径3
    private Integer MEDIAN_DIAM3_STD;
    //最小径3
    private Integer MIN_DIAM3_STD;
    //单位3
    private String UNIT3_STD;
    //结构标准名称1
    private String STRUCTURE1_STD;
    //结构标准部位1
    private String SITE1_STD;
    //结构标准名称2
    private String STRUCTURE2_STD;
    //结构标准部位2
    private String SITE2_STD;
    //结构标准名称3
    private String STRUCTURE3_STD;
    //结构标准部位3
    private String SITE3_STD;
    //结构标准名称4
    private String STRUCTURE4_STD;
    //结构标准部位4
    private String SITE4_STD;
    //结构标准名称5
    private String STRUCTURE5_STD;
    //结构标准部位5
    private String SITE5_STD;
    //结构标准名称6
    private String STRUCTURE6_STD;
    //结构标准部位6
    private String SITE6_STD;
    //结构标准名称7
    private String STRUCTURE7_STD;
    //结构标准部位7
    private String SITE7_STD;
    //结构标准名称8
    private String STRUCTURE8_STD;
    //结构标准部位8
    private String SITE8_STD;
    //测量参数值-数值
    private Integer VALUE_STD;
    //测量参数值-单位
    private String VALUE_UNIT_STD;

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
    public String getSTRUCTURE(){
        return STRUCTURE;
    } 
    public void setSTRUCTURE(String STRUCTURE) {
         this.STRUCTURE = STRUCTURE;
    } 
    public String getFINDING(){
        return FINDING;
    } 
    public void setFINDING(String FINDING) {
         this.FINDING = FINDING;
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
    public String getDIAG(){
        return DIAG;
    } 
    public void setDIAG(String DIAG) {
         this.DIAG = DIAG;
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
    public String getCHANGE_STD(){
        return CHANGE_STD;
    } 
    public void setCHANGE_STD(String CHANGE_STD) {
         this.CHANGE_STD = CHANGE_STD;
    } 
    public String getCOUNT_STD(){
        return COUNT_STD;
    } 
    public void setCOUNT_STD(String COUNT_STD) {
         this.COUNT_STD = COUNT_STD;
    } 
    public String getDIAG1_STD(){
        return DIAG1_STD;
    } 
    public void setDIAG1_STD(String DIAG1_STD) {
         this.DIAG1_STD = DIAG1_STD;
    } 
    public String getDIAG2_STD(){
        return DIAG2_STD;
    } 
    public void setDIAG2_STD(String DIAG2_STD) {
         this.DIAG2_STD = DIAG2_STD;
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
    public String getFINDING3_STD(){
        return FINDING3_STD;
    } 
    public void setFINDING3_STD(String FINDING3_STD) {
         this.FINDING3_STD = FINDING3_STD;
    } 
    public String getFINDING4_STD(){
        return FINDING4_STD;
    } 
    public void setFINDING4_STD(String FINDING4_STD) {
         this.FINDING4_STD = FINDING4_STD;
    } 
    public String getPARAMETER_STD(){
        return PARAMETER_STD;
    } 
    public void setPARAMETER_STD(String PARAMETER_STD) {
         this.PARAMETER_STD = PARAMETER_STD;
    } 
    public Integer getMAX_DIAM1_STD(){
        return MAX_DIAM1_STD;
    } 
    public void setMAX_DIAM1_STD(Integer MAX_DIAM1_STD) {
         this.MAX_DIAM1_STD = MAX_DIAM1_STD;
    } 
    public Integer getMEDIAN_DIAM1_STD(){
        return MEDIAN_DIAM1_STD;
    } 
    public void setMEDIAN_DIAM1_STD(Integer MEDIAN_DIAM1_STD) {
         this.MEDIAN_DIAM1_STD = MEDIAN_DIAM1_STD;
    } 
    public Integer getMIN_DIAM1_STD(){
        return MIN_DIAM1_STD;
    } 
    public void setMIN_DIAM1_STD(Integer MIN_DIAM1_STD) {
         this.MIN_DIAM1_STD = MIN_DIAM1_STD;
    } 
    public String getUNIT1_STD(){
        return UNIT1_STD;
    } 
    public void setUNIT1_STD(String UNIT1_STD) {
         this.UNIT1_STD = UNIT1_STD;
    } 
    public Integer getMAX_DIAM2_STD(){
        return MAX_DIAM2_STD;
    } 
    public void setMAX_DIAM2_STD(Integer MAX_DIAM2_STD) {
         this.MAX_DIAM2_STD = MAX_DIAM2_STD;
    } 
    public Integer getMEDIAN_DIAM2_STD(){
        return MEDIAN_DIAM2_STD;
    } 
    public void setMEDIAN_DIAM2_STD(Integer MEDIAN_DIAM2_STD) {
         this.MEDIAN_DIAM2_STD = MEDIAN_DIAM2_STD;
    } 
    public Integer getMIN_DIAM2_STD(){
        return MIN_DIAM2_STD;
    } 
    public void setMIN_DIAM2_STD(Integer MIN_DIAM2_STD) {
         this.MIN_DIAM2_STD = MIN_DIAM2_STD;
    } 
    public String getUNIT2_STD(){
        return UNIT2_STD;
    } 
    public void setUNIT2_STD(String UNIT2_STD) {
         this.UNIT2_STD = UNIT2_STD;
    } 
    public Integer getMAX_DIAM3_STD(){
        return MAX_DIAM3_STD;
    } 
    public void setMAX_DIAM3_STD(Integer MAX_DIAM3_STD) {
         this.MAX_DIAM3_STD = MAX_DIAM3_STD;
    } 
    public Integer getMEDIAN_DIAM3_STD(){
        return MEDIAN_DIAM3_STD;
    } 
    public void setMEDIAN_DIAM3_STD(Integer MEDIAN_DIAM3_STD) {
         this.MEDIAN_DIAM3_STD = MEDIAN_DIAM3_STD;
    } 
    public Integer getMIN_DIAM3_STD(){
        return MIN_DIAM3_STD;
    } 
    public void setMIN_DIAM3_STD(Integer MIN_DIAM3_STD) {
         this.MIN_DIAM3_STD = MIN_DIAM3_STD;
    } 
    public String getUNIT3_STD(){
        return UNIT3_STD;
    } 
    public void setUNIT3_STD(String UNIT3_STD) {
         this.UNIT3_STD = UNIT3_STD;
    } 
    public String getSTRUCTURE1_STD(){
        return STRUCTURE1_STD;
    } 
    public void setSTRUCTURE1_STD(String STRUCTURE1_STD) {
         this.STRUCTURE1_STD = STRUCTURE1_STD;
    } 
    public String getSITE1_STD(){
        return SITE1_STD;
    } 
    public void setSITE1_STD(String SITE1_STD) {
         this.SITE1_STD = SITE1_STD;
    } 
    public String getSTRUCTURE2_STD(){
        return STRUCTURE2_STD;
    } 
    public void setSTRUCTURE2_STD(String STRUCTURE2_STD) {
         this.STRUCTURE2_STD = STRUCTURE2_STD;
    } 
    public String getSITE2_STD(){
        return SITE2_STD;
    } 
    public void setSITE2_STD(String SITE2_STD) {
         this.SITE2_STD = SITE2_STD;
    } 
    public String getSTRUCTURE3_STD(){
        return STRUCTURE3_STD;
    } 
    public void setSTRUCTURE3_STD(String STRUCTURE3_STD) {
         this.STRUCTURE3_STD = STRUCTURE3_STD;
    } 
    public String getSITE3_STD(){
        return SITE3_STD;
    } 
    public void setSITE3_STD(String SITE3_STD) {
         this.SITE3_STD = SITE3_STD;
    } 
    public String getSTRUCTURE4_STD(){
        return STRUCTURE4_STD;
    } 
    public void setSTRUCTURE4_STD(String STRUCTURE4_STD) {
         this.STRUCTURE4_STD = STRUCTURE4_STD;
    } 
    public String getSITE4_STD(){
        return SITE4_STD;
    } 
    public void setSITE4_STD(String SITE4_STD) {
         this.SITE4_STD = SITE4_STD;
    } 
    public String getSTRUCTURE5_STD(){
        return STRUCTURE5_STD;
    } 
    public void setSTRUCTURE5_STD(String STRUCTURE5_STD) {
         this.STRUCTURE5_STD = STRUCTURE5_STD;
    } 
    public String getSITE5_STD(){
        return SITE5_STD;
    } 
    public void setSITE5_STD(String SITE5_STD) {
         this.SITE5_STD = SITE5_STD;
    } 
    public String getSTRUCTURE6_STD(){
        return STRUCTURE6_STD;
    } 
    public void setSTRUCTURE6_STD(String STRUCTURE6_STD) {
         this.STRUCTURE6_STD = STRUCTURE6_STD;
    } 
    public String getSITE6_STD(){
        return SITE6_STD;
    } 
    public void setSITE6_STD(String SITE6_STD) {
         this.SITE6_STD = SITE6_STD;
    } 
    public String getSTRUCTURE7_STD(){
        return STRUCTURE7_STD;
    } 
    public void setSTRUCTURE7_STD(String STRUCTURE7_STD) {
         this.STRUCTURE7_STD = STRUCTURE7_STD;
    } 
    public String getSITE7_STD(){
        return SITE7_STD;
    } 
    public void setSITE7_STD(String SITE7_STD) {
         this.SITE7_STD = SITE7_STD;
    } 
    public String getSTRUCTURE8_STD(){
        return STRUCTURE8_STD;
    } 
    public void setSTRUCTURE8_STD(String STRUCTURE8_STD) {
         this.STRUCTURE8_STD = STRUCTURE8_STD;
    } 
    public String getSITE8_STD(){
        return SITE8_STD;
    } 
    public void setSITE8_STD(String SITE8_STD) {
         this.SITE8_STD = SITE8_STD;
    } 
    public Integer getVALUE_STD(){
        return VALUE_STD;
    } 
    public void setVALUE_STD(Integer VALUE_STD) {
         this.VALUE_STD = VALUE_STD;
    } 
    public String getVALUE_UNIT_STD(){
        return VALUE_UNIT_STD;
    } 
    public void setVALUE_UNIT_STD(String VALUE_UNIT_STD) {
         this.VALUE_UNIT_STD = VALUE_UNIT_STD;
    } 
}