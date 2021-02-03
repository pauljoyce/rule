package com.clinical.model.master;
import java.util.Date;
public class SURGERY_PROC{
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
    //手术开始日期时间
    private Date BEGIN_DATE_TIME;
    //手术结束日期时间
    private Date END_DATE_TIME;
    //手术名称
    private String SURGERY_NAME;
    //手术时机
    private String TIMING;
    //切口类型
    private String CUT;
    //结构名称
    private String STRUCTURE;
    //分区
    private String SUB_STRUCTURE;
    //异常发现
    private String FINDING;
    //颜色
    private String COLOR;
    //大小
    private String SIZE;
    //数量
    private String COUNT;
    //否定词
    private String NEG;
    //可能性
    private String MODIFY;
    //状态
    private String STATUS;
    //程度
    private String EXTENT;
    //分期
    private String STAGE;
    //操作位置
    private String LOCATION;
    //操作名称
    private String PROCEDURE;
    //操作方式
    private String METHOD;
    //参数名称
    private String PARAMETER;
    //参数值
    private String VALUE;
    //器械
    private String DEVICE;
    //治疗
    private String TREATMENT;
    //药物
    private String DRUG;
    //药物剂量
    private String DRUG_DOSE;
    //持续时长
    private String DRUG_DURATION;
    //手术性质
    private String NATURE;
    //手术操作信息字段来源
    private String FS_NLP;
    //手术操作信息字段来源中文备注
    private String FS_NLP_CN;
    //字段来源中的出现序号
    private Double FS_SERIAL_NUMBER;
    //字段来源中手术操作信息所在位置
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
    //标准化结构名称
    private String STRUCTURE_STD;
    //标准化分区
    private String SUB_STRUCTURE_STD;
    //标准化分区-D2清扫范围
    private String D2_PLUS_STD;
    //标准化异常发现
    private String FINDING_STD;
    //标准化数量
    private String COUNT_STD;
    //标准化否定词
    private String NEG_STD;
    //标准化操作位置
    private String LOCATION_STD;
    //标准化操作名称
    private String PROCEDURE_STD;
    //标准化操作方式-手术名称
    private String METHOD_STD;
    //标准化操作方式-切除方式
    private String RESECTION_STD;
    //标准化操作方式-重建具体方式1
    private String RECONSTRUCTION1_STD;
    //标准化操作方式-重建具体方式2
    private String RECONSTRUCTION2_STD;
    //标准化操作方式-联合切除器官
    private String COMBINED_ORGAN_STD;
    //标准化参数名称
    private String PARAMETER_STD;
    //标准化参数值
    private String VALUE_STD;
    //标准化器械
    private String DEVICE_STD;
    //最大径1
    private Double MAX_DIAM1_STD;
    //中间径1
    private Double MEDIAN_DIAM1_STD;
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
    //单位3
    private String UNIT3_STD;
    //最大径4
    private Integer MAX_DIAM4_STD;
    //中间径4
    private Integer MEDIAN_DIAM4_STD;
    //单位4
    private String UNIT4_STD;
    //最大径5
    private Integer MAX_DIAM5_STD;
    //中间径5
    private Integer MEDIAN_DIAM5_STD;
    //单位5
    private String UNIT5_STD;

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
    public Date getBEGIN_DATE_TIME(){
        return BEGIN_DATE_TIME;
    } 
    public void setBEGIN_DATE_TIME(Date BEGIN_DATE_TIME) {
         this.BEGIN_DATE_TIME = BEGIN_DATE_TIME;
    } 
    public Date getEND_DATE_TIME(){
        return END_DATE_TIME;
    } 
    public void setEND_DATE_TIME(Date END_DATE_TIME) {
         this.END_DATE_TIME = END_DATE_TIME;
    } 
    public String getSURGERY_NAME(){
        return SURGERY_NAME;
    } 
    public void setSURGERY_NAME(String SURGERY_NAME) {
         this.SURGERY_NAME = SURGERY_NAME;
    } 
    public String getTIMING(){
        return TIMING;
    } 
    public void setTIMING(String TIMING) {
         this.TIMING = TIMING;
    } 
    public String getCUT(){
        return CUT;
    } 
    public void setCUT(String CUT) {
         this.CUT = CUT;
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
    public String getSTATUS(){
        return STATUS;
    } 
    public void setSTATUS(String STATUS) {
         this.STATUS = STATUS;
    } 
    public String getEXTENT(){
        return EXTENT;
    } 
    public void setEXTENT(String EXTENT) {
         this.EXTENT = EXTENT;
    } 
    public String getSTAGE(){
        return STAGE;
    } 
    public void setSTAGE(String STAGE) {
         this.STAGE = STAGE;
    } 
    public String getLOCATION(){
        return LOCATION;
    } 
    public void setLOCATION(String LOCATION) {
         this.LOCATION = LOCATION;
    } 
    public String getPROCEDURE(){
        return PROCEDURE;
    } 
    public void setPROCEDURE(String PROCEDURE) {
         this.PROCEDURE = PROCEDURE;
    } 
    public String getMETHOD(){
        return METHOD;
    } 
    public void setMETHOD(String METHOD) {
         this.METHOD = METHOD;
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
    public String getDEVICE(){
        return DEVICE;
    } 
    public void setDEVICE(String DEVICE) {
         this.DEVICE = DEVICE;
    } 
    public String getTREATMENT(){
        return TREATMENT;
    } 
    public void setTREATMENT(String TREATMENT) {
         this.TREATMENT = TREATMENT;
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
    public String getDRUG_DURATION(){
        return DRUG_DURATION;
    } 
    public void setDRUG_DURATION(String DRUG_DURATION) {
         this.DRUG_DURATION = DRUG_DURATION;
    } 
    public String getNATURE(){
        return NATURE;
    } 
    public void setNATURE(String NATURE) {
         this.NATURE = NATURE;
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
    public String getD2_PLUS_STD(){
        return D2_PLUS_STD;
    } 
    public void setD2_PLUS_STD(String D2_PLUS_STD) {
         this.D2_PLUS_STD = D2_PLUS_STD;
    } 
    public String getFINDING_STD(){
        return FINDING_STD;
    } 
    public void setFINDING_STD(String FINDING_STD) {
         this.FINDING_STD = FINDING_STD;
    } 
    public String getCOUNT_STD(){
        return COUNT_STD;
    } 
    public void setCOUNT_STD(String COUNT_STD) {
         this.COUNT_STD = COUNT_STD;
    } 
    public String getNEG_STD(){
        return NEG_STD;
    } 
    public void setNEG_STD(String NEG_STD) {
         this.NEG_STD = NEG_STD;
    } 
    public String getLOCATION_STD(){
        return LOCATION_STD;
    } 
    public void setLOCATION_STD(String LOCATION_STD) {
         this.LOCATION_STD = LOCATION_STD;
    } 
    public String getPROCEDURE_STD(){
        return PROCEDURE_STD;
    } 
    public void setPROCEDURE_STD(String PROCEDURE_STD) {
         this.PROCEDURE_STD = PROCEDURE_STD;
    } 
    public String getMETHOD_STD(){
        return METHOD_STD;
    } 
    public void setMETHOD_STD(String METHOD_STD) {
         this.METHOD_STD = METHOD_STD;
    } 
    public String getRESECTION_STD(){
        return RESECTION_STD;
    } 
    public void setRESECTION_STD(String RESECTION_STD) {
         this.RESECTION_STD = RESECTION_STD;
    } 
    public String getRECONSTRUCTION1_STD(){
        return RECONSTRUCTION1_STD;
    } 
    public void setRECONSTRUCTION1_STD(String RECONSTRUCTION1_STD) {
         this.RECONSTRUCTION1_STD = RECONSTRUCTION1_STD;
    } 
    public String getRECONSTRUCTION2_STD(){
        return RECONSTRUCTION2_STD;
    } 
    public void setRECONSTRUCTION2_STD(String RECONSTRUCTION2_STD) {
         this.RECONSTRUCTION2_STD = RECONSTRUCTION2_STD;
    } 
    public String getCOMBINED_ORGAN_STD(){
        return COMBINED_ORGAN_STD;
    } 
    public void setCOMBINED_ORGAN_STD(String COMBINED_ORGAN_STD) {
         this.COMBINED_ORGAN_STD = COMBINED_ORGAN_STD;
    } 
    public String getPARAMETER_STD(){
        return PARAMETER_STD;
    } 
    public void setPARAMETER_STD(String PARAMETER_STD) {
         this.PARAMETER_STD = PARAMETER_STD;
    } 
    public String getVALUE_STD(){
        return VALUE_STD;
    } 
    public void setVALUE_STD(String VALUE_STD) {
         this.VALUE_STD = VALUE_STD;
    } 
    public String getDEVICE_STD(){
        return DEVICE_STD;
    } 
    public void setDEVICE_STD(String DEVICE_STD) {
         this.DEVICE_STD = DEVICE_STD;
    } 
    public Double getMAX_DIAM1_STD(){
        return MAX_DIAM1_STD;
    } 
    public void setMAX_DIAM1_STD(Double MAX_DIAM1_STD) {
         this.MAX_DIAM1_STD = MAX_DIAM1_STD;
    } 
    public Double getMEDIAN_DIAM1_STD(){
        return MEDIAN_DIAM1_STD;
    } 
    public void setMEDIAN_DIAM1_STD(Double MEDIAN_DIAM1_STD) {
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
    public String getUNIT3_STD(){
        return UNIT3_STD;
    } 
    public void setUNIT3_STD(String UNIT3_STD) {
         this.UNIT3_STD = UNIT3_STD;
    } 
    public Integer getMAX_DIAM4_STD(){
        return MAX_DIAM4_STD;
    } 
    public void setMAX_DIAM4_STD(Integer MAX_DIAM4_STD) {
         this.MAX_DIAM4_STD = MAX_DIAM4_STD;
    } 
    public Integer getMEDIAN_DIAM4_STD(){
        return MEDIAN_DIAM4_STD;
    } 
    public void setMEDIAN_DIAM4_STD(Integer MEDIAN_DIAM4_STD) {
         this.MEDIAN_DIAM4_STD = MEDIAN_DIAM4_STD;
    } 
    public String getUNIT4_STD(){
        return UNIT4_STD;
    } 
    public void setUNIT4_STD(String UNIT4_STD) {
         this.UNIT4_STD = UNIT4_STD;
    } 
    public Integer getMAX_DIAM5_STD(){
        return MAX_DIAM5_STD;
    } 
    public void setMAX_DIAM5_STD(Integer MAX_DIAM5_STD) {
         this.MAX_DIAM5_STD = MAX_DIAM5_STD;
    } 
    public Integer getMEDIAN_DIAM5_STD(){
        return MEDIAN_DIAM5_STD;
    } 
    public void setMEDIAN_DIAM5_STD(Integer MEDIAN_DIAM5_STD) {
         this.MEDIAN_DIAM5_STD = MEDIAN_DIAM5_STD;
    } 
    public String getUNIT5_STD(){
        return UNIT5_STD;
    } 
    public void setUNIT5_STD(String UNIT5_STD) {
         this.UNIT5_STD = UNIT5_STD;
    } 
}