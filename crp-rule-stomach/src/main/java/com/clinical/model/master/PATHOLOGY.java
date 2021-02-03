package com.clinical.model.master;
import java.util.Date;
public class PATHOLOGY{
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
    //检查报告日期时间
    private String DATE_TIME;
    //检查名称
    private String PATHOLOGY_NAME;
    //病灶
    private String LESION;
    //结构名称
    private String STRUCTURE;
    //分区
    private String SUB_STRUCTURE;
    //颜色
    private String COLOR;
    //异常发现
    private String FINDING;
    //大小
    private String SIZE;
    //数量
    private String COUNT;
    //值
    private String VALUE;
    //否定词
    private String NEG;
    //可能性
    private String MODIFY;
    //分型
    private String TYPE;
    //分化程度
    private String GRADE;
    //分期
    private String STAGE;
    //状态
    private String STATUS;
    //病理检查信息字段来源
    private String FS_NLP;
    //病理检查信息字段来源中文备注
    private String FS_NLP_CN;
    //字段来源中的出现序号
    private Double FS_SERIAL_NUMBER;
    //字段来源中病理检查信息所在位置
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
    //精确检查报告日期
    private Date DATE_TIME_P;
    //推测检查报告日期
    private Date DATE_TIME_ESTIMATE;
    //数量标准名称1
    private String COUNT1_STD;
    //数量标准名称2
    private String COUNT2_STD;
    //数量标准名称3
    private String COUNT3_STD;
    //数量标准名称4
    private String COUNT4_STD;
    //数量标准名称5
    private String COUNT5_STD;
    //数量标准名称6
    private String COUNT6_STD;
    //数量标准名称7
    private String COUNT7_STD;
    //数量标准名称8
    private String COUNT8_STD;
    //数量标准名称9
    private String COUNT9_STD;
    //数量标准名称10
    private String COUNT10_STD;
    //数量标准名称11
    private String COUNT11_STD;
    //数量标准名称12
    private String COUNT12_STD;
    //数量标准名称13
    private String COUNT13_STD;
    //病变-部位
    private String LESION_SITE_STD;
    //病变-结构
    private String LESION_STRUCTURE_STD;
    //病变-肿物1
    private String LESION_LUMP1_STD;
    //病变-肿物2
    private String LESION_LUMP2_STD;
    //病变-分化程度
    private String LESION_GRADE_STD;
    //病变-病理类型
    private String LESION_TYPE_STD;
    //否定词标准名称
    private String NEG_STD;
    //状态-扩散方式1
    private String STATUS_INVASION1_STD;
    //状态-层级1
    private String STATUS_LAYER1_STD;
    //状态-结构1
    private String STATUS_STRUCTURE1_STD;
    //状态-部位1
    private String STATUS_SITE1_STD;
    //状态-层级2
    private String STATUS_LAYER2_STD;
    //状态-结构2
    private String STATUS_STRUCTURE2_STD;
    //状态-部位2
    private String STATUS_SITE2_STD;
    //状态-层级3
    private String STATUS_LAYER3_STD;
    //状态-结构3
    private String STATUS_STRUCTURE3_STD;
    //状态-部位3
    private String STATUS_SITE3_STD;
    //状态-扩散方式2
    private String STATUS_INVASION2_STD;
    //状态-层级4
    private String STATUS_LAYER4_STD;
    //状态-结构4
    private String STATUS_STRUCTURE4_STD;
    //状态-部位4
    private String STATUS_SITE4_STD;
    //状态-层级5
    private String STATUS_LAYER5_STD;
    //状态-结构5
    private String STATUS_STRUCTURE5_STD;
    //状态-部位5
    private String STATUS_SITE5_STD;
    //大小-最大径1
    private Double MAX_DIAM1_STD;
    //大小-中间径1
    private Double MEDIAN_DIAM1_STD;
    //大小-最小径1
    private Double MIN_DIAM1_STD;
    //大小-标准单位1
    private String UNIT1_STD;
    //大小-最大径2
    private Double MAX_DIAM2_STD;
    //大小-标准单位2
    private String UNIT2_STD;
    //淋巴结部位1
    private String LN_SITE1_STD;
    //定位1
    private String LN_LOCATION1_STD;
    //组织1
    private String LN_TISSUE1_STD;
    //淋巴结部位2
    private String LN_SITE2_STD;
    //定位2
    private String LN_LOCATION2_STD;
    //组织2
    private String LN_TISSUE2_STD;
    //淋巴结部位3
    private String LN_SITE3_STD;
    //定位3
    private String LN_LOCATION3_STD;
    //组织3
    private String LN_TISSUE3_STD;
    //淋巴结部位4
    private String LN_SITE4_STD;
    //定位4
    private String LN_LOCATION4_STD;
    //组织4
    private String LN_TISSUE4_STD;
    //淋巴结部位5
    private String LN_SITE5_STD;
    //定位5
    private String LN_LOCATION5_STD;
    //组织5
    private String LN_TISSUE5_STD;
    //淋巴结部位6
    private String LN_SITE6_STD;
    //定位6
    private String LN_LOCATION6_STD;
    //组织6
    private String LN_TISSUE6_STD;
    //淋巴结部位7
    private String LN_SITE7_STD;
    //定位7
    private String LN_LOCATION7_STD;
    //组织7
    private String LN_TISSUE7_STD;
    //淋巴结部位8
    private String LN_SITE8_STD;
    //定位8
    private String LN_LOCATION8_STD;
    //组织8
    private String LN_TISSUE8_STD;
    //淋巴结部位9
    private String LN_SITE9_STD;
    //定位9
    private String LN_LOCATION9_STD;
    //组织9
    private String LN_TISSUE9_STD;
    //淋巴结部位10
    private String LN_SITE10_STD;
    //定位10
    private String LN_LOCATION10_STD;
    //组织10
    private String LN_TISSUE10_STD;
    //淋巴结部位11
    private String LN_SITE11_STD;
    //定位11
    private String LN_LOCATION11_STD;
    //组织11
    private String LN_TISSUE11_STD;
    //淋巴结部位12
    private String LN_SITE12_STD;
    //定位12
    private String LN_LOCATION12_STD;
    //组织12
    private String LN_TISSUE12_STD;
    //淋巴结部位13
    private String LN_SITE13_STD;
    //定位13
    private String LN_LOCATION13_STD;
    //组织13
    private String LN_TISSUE13_STD;
    //切缘部位1
    private String EDGE_SITE1_STD;
    //结构1
    private String EDGE_STRUCTURE1_STD;
    //切缘1
    private String EDGE_TYPE1_STD;
    //距离1
    private Double EDGE_DISTANCE1_STD;
    //单位1
    private String EDGE_UNIT1_STD;
    //切缘部位2
    private String EDGE_SITE2_STD;
    //结构2
    private String EDGE_STRUCTURE2_STD;
    //切缘2
    private String EDGE_TYPE2_STD;
    //距离2
    private Double EDGE_DISTANCE2_STD;
    //单位2
    private String EDGE_UNIT2_STD;
    //切缘部位3
    private String EDGE_SITE3_STD;
    //结构3
    private String EDGE_STRUCTURE3_STD;
    //切缘3
    private String EDGE_TYPE3_STD;
    //距离3
    private Double EDGE_DISTANCE3_STD;
    //单位3
    private String EDGE_UNIT3_STD;
    //切缘部位4
    private String EDGE_SITE4_STD;
    //结构4
    private String EDGE_STRUCTURE4_STD;
    //切缘4
    private String EDGE_TYPE4_STD;
    //距离4
    private Double EDGE_DISTANCE4_STD;
    //单位4
    private String EDGE_UNIT4_STD;
    //肿瘤部位1
    private String TUMOR_SITE1_STD;
    //结构1
    private String TUMOR_STRUCTURE1_STD;
    //距离1
    private Double TUMOR_DISTANCE1_STD;
    //单位1
    private String TUMOR_UNIT1_STD;
    //肿瘤部位2
    private String TUMOR_SITE2_STD;
    //结构2
    private String TUMOR_STRUCTURE2_STD;
    //距离2
    private Double TUMOR_DISTANCE2_STD;
    //单位2
    private String TUMOR_UNIT2_STD;
    //肿瘤部位3
    private String TUMOR_SITE3_STD;
    //结构3
    private String TUMOR_STRUCTURE3_STD;
    //距离3
    private Double TUMOR_DISTANCE3_STD;
    //单位3
    private String TUMOR_UNIT3_STD;
    //肿瘤部位4
    private String TUMOR_SITE4_STD;
    //结构4
    private String TUMOR_STRUCTURE4_STD;
    //距离4
    private Double TUMOR_DISTANCE4_STD;
    //单位4
    private String TUMOR_UNIT4_STD;

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
    public String getPATHOLOGY_NAME(){
        return PATHOLOGY_NAME;
    } 
    public void setPATHOLOGY_NAME(String PATHOLOGY_NAME) {
         this.PATHOLOGY_NAME = PATHOLOGY_NAME;
    } 
    public String getLESION(){
        return LESION;
    } 
    public void setLESION(String LESION) {
         this.LESION = LESION;
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
    public String getCOLOR(){
        return COLOR;
    } 
    public void setCOLOR(String COLOR) {
         this.COLOR = COLOR;
    } 
    public String getFINDING(){
        return FINDING;
    } 
    public void setFINDING(String FINDING) {
         this.FINDING = FINDING;
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
    public String getVALUE(){
        return VALUE;
    } 
    public void setVALUE(String VALUE) {
         this.VALUE = VALUE;
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
    public String getTYPE(){
        return TYPE;
    } 
    public void setTYPE(String TYPE) {
         this.TYPE = TYPE;
    } 
    public String getGRADE(){
        return GRADE;
    } 
    public void setGRADE(String GRADE) {
         this.GRADE = GRADE;
    } 
    public String getSTAGE(){
        return STAGE;
    } 
    public void setSTAGE(String STAGE) {
         this.STAGE = STAGE;
    } 
    public String getSTATUS(){
        return STATUS;
    } 
    public void setSTATUS(String STATUS) {
         this.STATUS = STATUS;
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
    public String getCOUNT1_STD(){
        return COUNT1_STD;
    } 
    public void setCOUNT1_STD(String COUNT1_STD) {
         this.COUNT1_STD = COUNT1_STD;
    } 
    public String getCOUNT2_STD(){
        return COUNT2_STD;
    } 
    public void setCOUNT2_STD(String COUNT2_STD) {
         this.COUNT2_STD = COUNT2_STD;
    } 
    public String getCOUNT3_STD(){
        return COUNT3_STD;
    } 
    public void setCOUNT3_STD(String COUNT3_STD) {
         this.COUNT3_STD = COUNT3_STD;
    } 
    public String getCOUNT4_STD(){
        return COUNT4_STD;
    } 
    public void setCOUNT4_STD(String COUNT4_STD) {
         this.COUNT4_STD = COUNT4_STD;
    } 
    public String getCOUNT5_STD(){
        return COUNT5_STD;
    } 
    public void setCOUNT5_STD(String COUNT5_STD) {
         this.COUNT5_STD = COUNT5_STD;
    } 
    public String getCOUNT6_STD(){
        return COUNT6_STD;
    } 
    public void setCOUNT6_STD(String COUNT6_STD) {
         this.COUNT6_STD = COUNT6_STD;
    } 
    public String getCOUNT7_STD(){
        return COUNT7_STD;
    } 
    public void setCOUNT7_STD(String COUNT7_STD) {
         this.COUNT7_STD = COUNT7_STD;
    } 
    public String getCOUNT8_STD(){
        return COUNT8_STD;
    } 
    public void setCOUNT8_STD(String COUNT8_STD) {
         this.COUNT8_STD = COUNT8_STD;
    } 
    public String getCOUNT9_STD(){
        return COUNT9_STD;
    } 
    public void setCOUNT9_STD(String COUNT9_STD) {
         this.COUNT9_STD = COUNT9_STD;
    } 
    public String getCOUNT10_STD(){
        return COUNT10_STD;
    } 
    public void setCOUNT10_STD(String COUNT10_STD) {
         this.COUNT10_STD = COUNT10_STD;
    } 
    public String getCOUNT11_STD(){
        return COUNT11_STD;
    } 
    public void setCOUNT11_STD(String COUNT11_STD) {
         this.COUNT11_STD = COUNT11_STD;
    } 
    public String getCOUNT12_STD(){
        return COUNT12_STD;
    } 
    public void setCOUNT12_STD(String COUNT12_STD) {
         this.COUNT12_STD = COUNT12_STD;
    } 
    public String getCOUNT13_STD(){
        return COUNT13_STD;
    } 
    public void setCOUNT13_STD(String COUNT13_STD) {
         this.COUNT13_STD = COUNT13_STD;
    } 
    public String getLESION_SITE_STD(){
        return LESION_SITE_STD;
    } 
    public void setLESION_SITE_STD(String LESION_SITE_STD) {
         this.LESION_SITE_STD = LESION_SITE_STD;
    } 
    public String getLESION_STRUCTURE_STD(){
        return LESION_STRUCTURE_STD;
    } 
    public void setLESION_STRUCTURE_STD(String LESION_STRUCTURE_STD) {
         this.LESION_STRUCTURE_STD = LESION_STRUCTURE_STD;
    } 
    public String getLESION_LUMP1_STD(){
        return LESION_LUMP1_STD;
    } 
    public void setLESION_LUMP1_STD(String LESION_LUMP1_STD) {
         this.LESION_LUMP1_STD = LESION_LUMP1_STD;
    } 
    public String getLESION_LUMP2_STD(){
        return LESION_LUMP2_STD;
    } 
    public void setLESION_LUMP2_STD(String LESION_LUMP2_STD) {
         this.LESION_LUMP2_STD = LESION_LUMP2_STD;
    } 
    public String getLESION_GRADE_STD(){
        return LESION_GRADE_STD;
    } 
    public void setLESION_GRADE_STD(String LESION_GRADE_STD) {
         this.LESION_GRADE_STD = LESION_GRADE_STD;
    } 
    public String getLESION_TYPE_STD(){
        return LESION_TYPE_STD;
    } 
    public void setLESION_TYPE_STD(String LESION_TYPE_STD) {
         this.LESION_TYPE_STD = LESION_TYPE_STD;
    } 
    public String getNEG_STD(){
        return NEG_STD;
    } 
    public void setNEG_STD(String NEG_STD) {
         this.NEG_STD = NEG_STD;
    } 
    public String getSTATUS_INVASION1_STD(){
        return STATUS_INVASION1_STD;
    } 
    public void setSTATUS_INVASION1_STD(String STATUS_INVASION1_STD) {
         this.STATUS_INVASION1_STD = STATUS_INVASION1_STD;
    } 
    public String getSTATUS_LAYER1_STD(){
        return STATUS_LAYER1_STD;
    } 
    public void setSTATUS_LAYER1_STD(String STATUS_LAYER1_STD) {
         this.STATUS_LAYER1_STD = STATUS_LAYER1_STD;
    } 
    public String getSTATUS_STRUCTURE1_STD(){
        return STATUS_STRUCTURE1_STD;
    } 
    public void setSTATUS_STRUCTURE1_STD(String STATUS_STRUCTURE1_STD) {
         this.STATUS_STRUCTURE1_STD = STATUS_STRUCTURE1_STD;
    } 
    public String getSTATUS_SITE1_STD(){
        return STATUS_SITE1_STD;
    } 
    public void setSTATUS_SITE1_STD(String STATUS_SITE1_STD) {
         this.STATUS_SITE1_STD = STATUS_SITE1_STD;
    } 
    public String getSTATUS_LAYER2_STD(){
        return STATUS_LAYER2_STD;
    } 
    public void setSTATUS_LAYER2_STD(String STATUS_LAYER2_STD) {
         this.STATUS_LAYER2_STD = STATUS_LAYER2_STD;
    } 
    public String getSTATUS_STRUCTURE2_STD(){
        return STATUS_STRUCTURE2_STD;
    } 
    public void setSTATUS_STRUCTURE2_STD(String STATUS_STRUCTURE2_STD) {
         this.STATUS_STRUCTURE2_STD = STATUS_STRUCTURE2_STD;
    } 
    public String getSTATUS_SITE2_STD(){
        return STATUS_SITE2_STD;
    } 
    public void setSTATUS_SITE2_STD(String STATUS_SITE2_STD) {
         this.STATUS_SITE2_STD = STATUS_SITE2_STD;
    } 
    public String getSTATUS_LAYER3_STD(){
        return STATUS_LAYER3_STD;
    } 
    public void setSTATUS_LAYER3_STD(String STATUS_LAYER3_STD) {
         this.STATUS_LAYER3_STD = STATUS_LAYER3_STD;
    } 
    public String getSTATUS_STRUCTURE3_STD(){
        return STATUS_STRUCTURE3_STD;
    } 
    public void setSTATUS_STRUCTURE3_STD(String STATUS_STRUCTURE3_STD) {
         this.STATUS_STRUCTURE3_STD = STATUS_STRUCTURE3_STD;
    } 
    public String getSTATUS_SITE3_STD(){
        return STATUS_SITE3_STD;
    } 
    public void setSTATUS_SITE3_STD(String STATUS_SITE3_STD) {
         this.STATUS_SITE3_STD = STATUS_SITE3_STD;
    } 
    public String getSTATUS_INVASION2_STD(){
        return STATUS_INVASION2_STD;
    } 
    public void setSTATUS_INVASION2_STD(String STATUS_INVASION2_STD) {
         this.STATUS_INVASION2_STD = STATUS_INVASION2_STD;
    } 
    public String getSTATUS_LAYER4_STD(){
        return STATUS_LAYER4_STD;
    } 
    public void setSTATUS_LAYER4_STD(String STATUS_LAYER4_STD) {
         this.STATUS_LAYER4_STD = STATUS_LAYER4_STD;
    } 
    public String getSTATUS_STRUCTURE4_STD(){
        return STATUS_STRUCTURE4_STD;
    } 
    public void setSTATUS_STRUCTURE4_STD(String STATUS_STRUCTURE4_STD) {
         this.STATUS_STRUCTURE4_STD = STATUS_STRUCTURE4_STD;
    } 
    public String getSTATUS_SITE4_STD(){
        return STATUS_SITE4_STD;
    } 
    public void setSTATUS_SITE4_STD(String STATUS_SITE4_STD) {
         this.STATUS_SITE4_STD = STATUS_SITE4_STD;
    } 
    public String getSTATUS_LAYER5_STD(){
        return STATUS_LAYER5_STD;
    } 
    public void setSTATUS_LAYER5_STD(String STATUS_LAYER5_STD) {
         this.STATUS_LAYER5_STD = STATUS_LAYER5_STD;
    } 
    public String getSTATUS_STRUCTURE5_STD(){
        return STATUS_STRUCTURE5_STD;
    } 
    public void setSTATUS_STRUCTURE5_STD(String STATUS_STRUCTURE5_STD) {
         this.STATUS_STRUCTURE5_STD = STATUS_STRUCTURE5_STD;
    } 
    public String getSTATUS_SITE5_STD(){
        return STATUS_SITE5_STD;
    } 
    public void setSTATUS_SITE5_STD(String STATUS_SITE5_STD) {
         this.STATUS_SITE5_STD = STATUS_SITE5_STD;
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
    public Double getMIN_DIAM1_STD(){
        return MIN_DIAM1_STD;
    } 
    public void setMIN_DIAM1_STD(Double MIN_DIAM1_STD) {
         this.MIN_DIAM1_STD = MIN_DIAM1_STD;
    } 
    public String getUNIT1_STD(){
        return UNIT1_STD;
    } 
    public void setUNIT1_STD(String UNIT1_STD) {
         this.UNIT1_STD = UNIT1_STD;
    } 
    public Double getMAX_DIAM2_STD(){
        return MAX_DIAM2_STD;
    } 
    public void setMAX_DIAM2_STD(Double MAX_DIAM2_STD) {
         this.MAX_DIAM2_STD = MAX_DIAM2_STD;
    } 
    public String getUNIT2_STD(){
        return UNIT2_STD;
    } 
    public void setUNIT2_STD(String UNIT2_STD) {
         this.UNIT2_STD = UNIT2_STD;
    } 
    public String getLN_SITE1_STD(){
        return LN_SITE1_STD;
    } 
    public void setLN_SITE1_STD(String LN_SITE1_STD) {
         this.LN_SITE1_STD = LN_SITE1_STD;
    } 
    public String getLN_LOCATION1_STD(){
        return LN_LOCATION1_STD;
    } 
    public void setLN_LOCATION1_STD(String LN_LOCATION1_STD) {
         this.LN_LOCATION1_STD = LN_LOCATION1_STD;
    } 
    public String getLN_TISSUE1_STD(){
        return LN_TISSUE1_STD;
    } 
    public void setLN_TISSUE1_STD(String LN_TISSUE1_STD) {
         this.LN_TISSUE1_STD = LN_TISSUE1_STD;
    } 
    public String getLN_SITE2_STD(){
        return LN_SITE2_STD;
    } 
    public void setLN_SITE2_STD(String LN_SITE2_STD) {
         this.LN_SITE2_STD = LN_SITE2_STD;
    } 
    public String getLN_LOCATION2_STD(){
        return LN_LOCATION2_STD;
    } 
    public void setLN_LOCATION2_STD(String LN_LOCATION2_STD) {
         this.LN_LOCATION2_STD = LN_LOCATION2_STD;
    } 
    public String getLN_TISSUE2_STD(){
        return LN_TISSUE2_STD;
    } 
    public void setLN_TISSUE2_STD(String LN_TISSUE2_STD) {
         this.LN_TISSUE2_STD = LN_TISSUE2_STD;
    } 
    public String getLN_SITE3_STD(){
        return LN_SITE3_STD;
    } 
    public void setLN_SITE3_STD(String LN_SITE3_STD) {
         this.LN_SITE3_STD = LN_SITE3_STD;
    } 
    public String getLN_LOCATION3_STD(){
        return LN_LOCATION3_STD;
    } 
    public void setLN_LOCATION3_STD(String LN_LOCATION3_STD) {
         this.LN_LOCATION3_STD = LN_LOCATION3_STD;
    } 
    public String getLN_TISSUE3_STD(){
        return LN_TISSUE3_STD;
    } 
    public void setLN_TISSUE3_STD(String LN_TISSUE3_STD) {
         this.LN_TISSUE3_STD = LN_TISSUE3_STD;
    } 
    public String getLN_SITE4_STD(){
        return LN_SITE4_STD;
    } 
    public void setLN_SITE4_STD(String LN_SITE4_STD) {
         this.LN_SITE4_STD = LN_SITE4_STD;
    } 
    public String getLN_LOCATION4_STD(){
        return LN_LOCATION4_STD;
    } 
    public void setLN_LOCATION4_STD(String LN_LOCATION4_STD) {
         this.LN_LOCATION4_STD = LN_LOCATION4_STD;
    } 
    public String getLN_TISSUE4_STD(){
        return LN_TISSUE4_STD;
    } 
    public void setLN_TISSUE4_STD(String LN_TISSUE4_STD) {
         this.LN_TISSUE4_STD = LN_TISSUE4_STD;
    } 
    public String getLN_SITE5_STD(){
        return LN_SITE5_STD;
    } 
    public void setLN_SITE5_STD(String LN_SITE5_STD) {
         this.LN_SITE5_STD = LN_SITE5_STD;
    } 
    public String getLN_LOCATION5_STD(){
        return LN_LOCATION5_STD;
    } 
    public void setLN_LOCATION5_STD(String LN_LOCATION5_STD) {
         this.LN_LOCATION5_STD = LN_LOCATION5_STD;
    } 
    public String getLN_TISSUE5_STD(){
        return LN_TISSUE5_STD;
    } 
    public void setLN_TISSUE5_STD(String LN_TISSUE5_STD) {
         this.LN_TISSUE5_STD = LN_TISSUE5_STD;
    } 
    public String getLN_SITE6_STD(){
        return LN_SITE6_STD;
    } 
    public void setLN_SITE6_STD(String LN_SITE6_STD) {
         this.LN_SITE6_STD = LN_SITE6_STD;
    } 
    public String getLN_LOCATION6_STD(){
        return LN_LOCATION6_STD;
    } 
    public void setLN_LOCATION6_STD(String LN_LOCATION6_STD) {
         this.LN_LOCATION6_STD = LN_LOCATION6_STD;
    } 
    public String getLN_TISSUE6_STD(){
        return LN_TISSUE6_STD;
    } 
    public void setLN_TISSUE6_STD(String LN_TISSUE6_STD) {
         this.LN_TISSUE6_STD = LN_TISSUE6_STD;
    } 
    public String getLN_SITE7_STD(){
        return LN_SITE7_STD;
    } 
    public void setLN_SITE7_STD(String LN_SITE7_STD) {
         this.LN_SITE7_STD = LN_SITE7_STD;
    } 
    public String getLN_LOCATION7_STD(){
        return LN_LOCATION7_STD;
    } 
    public void setLN_LOCATION7_STD(String LN_LOCATION7_STD) {
         this.LN_LOCATION7_STD = LN_LOCATION7_STD;
    } 
    public String getLN_TISSUE7_STD(){
        return LN_TISSUE7_STD;
    } 
    public void setLN_TISSUE7_STD(String LN_TISSUE7_STD) {
         this.LN_TISSUE7_STD = LN_TISSUE7_STD;
    } 
    public String getLN_SITE8_STD(){
        return LN_SITE8_STD;
    } 
    public void setLN_SITE8_STD(String LN_SITE8_STD) {
         this.LN_SITE8_STD = LN_SITE8_STD;
    } 
    public String getLN_LOCATION8_STD(){
        return LN_LOCATION8_STD;
    } 
    public void setLN_LOCATION8_STD(String LN_LOCATION8_STD) {
         this.LN_LOCATION8_STD = LN_LOCATION8_STD;
    } 
    public String getLN_TISSUE8_STD(){
        return LN_TISSUE8_STD;
    } 
    public void setLN_TISSUE8_STD(String LN_TISSUE8_STD) {
         this.LN_TISSUE8_STD = LN_TISSUE8_STD;
    } 
    public String getLN_SITE9_STD(){
        return LN_SITE9_STD;
    } 
    public void setLN_SITE9_STD(String LN_SITE9_STD) {
         this.LN_SITE9_STD = LN_SITE9_STD;
    } 
    public String getLN_LOCATION9_STD(){
        return LN_LOCATION9_STD;
    } 
    public void setLN_LOCATION9_STD(String LN_LOCATION9_STD) {
         this.LN_LOCATION9_STD = LN_LOCATION9_STD;
    } 
    public String getLN_TISSUE9_STD(){
        return LN_TISSUE9_STD;
    } 
    public void setLN_TISSUE9_STD(String LN_TISSUE9_STD) {
         this.LN_TISSUE9_STD = LN_TISSUE9_STD;
    } 
    public String getLN_SITE10_STD(){
        return LN_SITE10_STD;
    } 
    public void setLN_SITE10_STD(String LN_SITE10_STD) {
         this.LN_SITE10_STD = LN_SITE10_STD;
    } 
    public String getLN_LOCATION10_STD(){
        return LN_LOCATION10_STD;
    } 
    public void setLN_LOCATION10_STD(String LN_LOCATION10_STD) {
         this.LN_LOCATION10_STD = LN_LOCATION10_STD;
    } 
    public String getLN_TISSUE10_STD(){
        return LN_TISSUE10_STD;
    } 
    public void setLN_TISSUE10_STD(String LN_TISSUE10_STD) {
         this.LN_TISSUE10_STD = LN_TISSUE10_STD;
    } 
    public String getLN_SITE11_STD(){
        return LN_SITE11_STD;
    } 
    public void setLN_SITE11_STD(String LN_SITE11_STD) {
         this.LN_SITE11_STD = LN_SITE11_STD;
    } 
    public String getLN_LOCATION11_STD(){
        return LN_LOCATION11_STD;
    } 
    public void setLN_LOCATION11_STD(String LN_LOCATION11_STD) {
         this.LN_LOCATION11_STD = LN_LOCATION11_STD;
    } 
    public String getLN_TISSUE11_STD(){
        return LN_TISSUE11_STD;
    } 
    public void setLN_TISSUE11_STD(String LN_TISSUE11_STD) {
         this.LN_TISSUE11_STD = LN_TISSUE11_STD;
    } 
    public String getLN_SITE12_STD(){
        return LN_SITE12_STD;
    } 
    public void setLN_SITE12_STD(String LN_SITE12_STD) {
         this.LN_SITE12_STD = LN_SITE12_STD;
    } 
    public String getLN_LOCATION12_STD(){
        return LN_LOCATION12_STD;
    } 
    public void setLN_LOCATION12_STD(String LN_LOCATION12_STD) {
         this.LN_LOCATION12_STD = LN_LOCATION12_STD;
    } 
    public String getLN_TISSUE12_STD(){
        return LN_TISSUE12_STD;
    } 
    public void setLN_TISSUE12_STD(String LN_TISSUE12_STD) {
         this.LN_TISSUE12_STD = LN_TISSUE12_STD;
    } 
    public String getLN_SITE13_STD(){
        return LN_SITE13_STD;
    } 
    public void setLN_SITE13_STD(String LN_SITE13_STD) {
         this.LN_SITE13_STD = LN_SITE13_STD;
    } 
    public String getLN_LOCATION13_STD(){
        return LN_LOCATION13_STD;
    } 
    public void setLN_LOCATION13_STD(String LN_LOCATION13_STD) {
         this.LN_LOCATION13_STD = LN_LOCATION13_STD;
    } 
    public String getLN_TISSUE13_STD(){
        return LN_TISSUE13_STD;
    } 
    public void setLN_TISSUE13_STD(String LN_TISSUE13_STD) {
         this.LN_TISSUE13_STD = LN_TISSUE13_STD;
    } 
    public String getEDGE_SITE1_STD(){
        return EDGE_SITE1_STD;
    } 
    public void setEDGE_SITE1_STD(String EDGE_SITE1_STD) {
         this.EDGE_SITE1_STD = EDGE_SITE1_STD;
    } 
    public String getEDGE_STRUCTURE1_STD(){
        return EDGE_STRUCTURE1_STD;
    } 
    public void setEDGE_STRUCTURE1_STD(String EDGE_STRUCTURE1_STD) {
         this.EDGE_STRUCTURE1_STD = EDGE_STRUCTURE1_STD;
    } 
    public String getEDGE_TYPE1_STD(){
        return EDGE_TYPE1_STD;
    } 
    public void setEDGE_TYPE1_STD(String EDGE_TYPE1_STD) {
         this.EDGE_TYPE1_STD = EDGE_TYPE1_STD;
    } 
    public Double getEDGE_DISTANCE1_STD(){
        return EDGE_DISTANCE1_STD;
    } 
    public void setEDGE_DISTANCE1_STD(Double EDGE_DISTANCE1_STD) {
         this.EDGE_DISTANCE1_STD = EDGE_DISTANCE1_STD;
    } 
    public String getEDGE_UNIT1_STD(){
        return EDGE_UNIT1_STD;
    } 
    public void setEDGE_UNIT1_STD(String EDGE_UNIT1_STD) {
         this.EDGE_UNIT1_STD = EDGE_UNIT1_STD;
    } 
    public String getEDGE_SITE2_STD(){
        return EDGE_SITE2_STD;
    } 
    public void setEDGE_SITE2_STD(String EDGE_SITE2_STD) {
         this.EDGE_SITE2_STD = EDGE_SITE2_STD;
    } 
    public String getEDGE_STRUCTURE2_STD(){
        return EDGE_STRUCTURE2_STD;
    } 
    public void setEDGE_STRUCTURE2_STD(String EDGE_STRUCTURE2_STD) {
         this.EDGE_STRUCTURE2_STD = EDGE_STRUCTURE2_STD;
    } 
    public String getEDGE_TYPE2_STD(){
        return EDGE_TYPE2_STD;
    } 
    public void setEDGE_TYPE2_STD(String EDGE_TYPE2_STD) {
         this.EDGE_TYPE2_STD = EDGE_TYPE2_STD;
    } 
    public Double getEDGE_DISTANCE2_STD(){
        return EDGE_DISTANCE2_STD;
    } 
    public void setEDGE_DISTANCE2_STD(Double EDGE_DISTANCE2_STD) {
         this.EDGE_DISTANCE2_STD = EDGE_DISTANCE2_STD;
    } 
    public String getEDGE_UNIT2_STD(){
        return EDGE_UNIT2_STD;
    } 
    public void setEDGE_UNIT2_STD(String EDGE_UNIT2_STD) {
         this.EDGE_UNIT2_STD = EDGE_UNIT2_STD;
    } 
    public String getEDGE_SITE3_STD(){
        return EDGE_SITE3_STD;
    } 
    public void setEDGE_SITE3_STD(String EDGE_SITE3_STD) {
         this.EDGE_SITE3_STD = EDGE_SITE3_STD;
    } 
    public String getEDGE_STRUCTURE3_STD(){
        return EDGE_STRUCTURE3_STD;
    } 
    public void setEDGE_STRUCTURE3_STD(String EDGE_STRUCTURE3_STD) {
         this.EDGE_STRUCTURE3_STD = EDGE_STRUCTURE3_STD;
    } 
    public String getEDGE_TYPE3_STD(){
        return EDGE_TYPE3_STD;
    } 
    public void setEDGE_TYPE3_STD(String EDGE_TYPE3_STD) {
         this.EDGE_TYPE3_STD = EDGE_TYPE3_STD;
    } 
    public Double getEDGE_DISTANCE3_STD(){
        return EDGE_DISTANCE3_STD;
    } 
    public void setEDGE_DISTANCE3_STD(Double EDGE_DISTANCE3_STD) {
         this.EDGE_DISTANCE3_STD = EDGE_DISTANCE3_STD;
    } 
    public String getEDGE_UNIT3_STD(){
        return EDGE_UNIT3_STD;
    } 
    public void setEDGE_UNIT3_STD(String EDGE_UNIT3_STD) {
         this.EDGE_UNIT3_STD = EDGE_UNIT3_STD;
    } 
    public String getEDGE_SITE4_STD(){
        return EDGE_SITE4_STD;
    } 
    public void setEDGE_SITE4_STD(String EDGE_SITE4_STD) {
         this.EDGE_SITE4_STD = EDGE_SITE4_STD;
    } 
    public String getEDGE_STRUCTURE4_STD(){
        return EDGE_STRUCTURE4_STD;
    } 
    public void setEDGE_STRUCTURE4_STD(String EDGE_STRUCTURE4_STD) {
         this.EDGE_STRUCTURE4_STD = EDGE_STRUCTURE4_STD;
    } 
    public String getEDGE_TYPE4_STD(){
        return EDGE_TYPE4_STD;
    } 
    public void setEDGE_TYPE4_STD(String EDGE_TYPE4_STD) {
         this.EDGE_TYPE4_STD = EDGE_TYPE4_STD;
    } 
    public Double getEDGE_DISTANCE4_STD(){
        return EDGE_DISTANCE4_STD;
    } 
    public void setEDGE_DISTANCE4_STD(Double EDGE_DISTANCE4_STD) {
         this.EDGE_DISTANCE4_STD = EDGE_DISTANCE4_STD;
    } 
    public String getEDGE_UNIT4_STD(){
        return EDGE_UNIT4_STD;
    } 
    public void setEDGE_UNIT4_STD(String EDGE_UNIT4_STD) {
         this.EDGE_UNIT4_STD = EDGE_UNIT4_STD;
    } 
    public String getTUMOR_SITE1_STD(){
        return TUMOR_SITE1_STD;
    } 
    public void setTUMOR_SITE1_STD(String TUMOR_SITE1_STD) {
         this.TUMOR_SITE1_STD = TUMOR_SITE1_STD;
    } 
    public String getTUMOR_STRUCTURE1_STD(){
        return TUMOR_STRUCTURE1_STD;
    } 
    public void setTUMOR_STRUCTURE1_STD(String TUMOR_STRUCTURE1_STD) {
         this.TUMOR_STRUCTURE1_STD = TUMOR_STRUCTURE1_STD;
    } 
    public Double getTUMOR_DISTANCE1_STD(){
        return TUMOR_DISTANCE1_STD;
    } 
    public void setTUMOR_DISTANCE1_STD(Double TUMOR_DISTANCE1_STD) {
         this.TUMOR_DISTANCE1_STD = TUMOR_DISTANCE1_STD;
    } 
    public String getTUMOR_UNIT1_STD(){
        return TUMOR_UNIT1_STD;
    } 
    public void setTUMOR_UNIT1_STD(String TUMOR_UNIT1_STD) {
         this.TUMOR_UNIT1_STD = TUMOR_UNIT1_STD;
    } 
    public String getTUMOR_SITE2_STD(){
        return TUMOR_SITE2_STD;
    } 
    public void setTUMOR_SITE2_STD(String TUMOR_SITE2_STD) {
         this.TUMOR_SITE2_STD = TUMOR_SITE2_STD;
    } 
    public String getTUMOR_STRUCTURE2_STD(){
        return TUMOR_STRUCTURE2_STD;
    } 
    public void setTUMOR_STRUCTURE2_STD(String TUMOR_STRUCTURE2_STD) {
         this.TUMOR_STRUCTURE2_STD = TUMOR_STRUCTURE2_STD;
    } 
    public Double getTUMOR_DISTANCE2_STD(){
        return TUMOR_DISTANCE2_STD;
    } 
    public void setTUMOR_DISTANCE2_STD(Double TUMOR_DISTANCE2_STD) {
         this.TUMOR_DISTANCE2_STD = TUMOR_DISTANCE2_STD;
    } 
    public String getTUMOR_UNIT2_STD(){
        return TUMOR_UNIT2_STD;
    } 
    public void setTUMOR_UNIT2_STD(String TUMOR_UNIT2_STD) {
         this.TUMOR_UNIT2_STD = TUMOR_UNIT2_STD;
    } 
    public String getTUMOR_SITE3_STD(){
        return TUMOR_SITE3_STD;
    } 
    public void setTUMOR_SITE3_STD(String TUMOR_SITE3_STD) {
         this.TUMOR_SITE3_STD = TUMOR_SITE3_STD;
    } 
    public String getTUMOR_STRUCTURE3_STD(){
        return TUMOR_STRUCTURE3_STD;
    } 
    public void setTUMOR_STRUCTURE3_STD(String TUMOR_STRUCTURE3_STD) {
         this.TUMOR_STRUCTURE3_STD = TUMOR_STRUCTURE3_STD;
    } 
    public Double getTUMOR_DISTANCE3_STD(){
        return TUMOR_DISTANCE3_STD;
    } 
    public void setTUMOR_DISTANCE3_STD(Double TUMOR_DISTANCE3_STD) {
         this.TUMOR_DISTANCE3_STD = TUMOR_DISTANCE3_STD;
    } 
    public String getTUMOR_UNIT3_STD(){
        return TUMOR_UNIT3_STD;
    } 
    public void setTUMOR_UNIT3_STD(String TUMOR_UNIT3_STD) {
         this.TUMOR_UNIT3_STD = TUMOR_UNIT3_STD;
    } 
    public String getTUMOR_SITE4_STD(){
        return TUMOR_SITE4_STD;
    } 
    public void setTUMOR_SITE4_STD(String TUMOR_SITE4_STD) {
         this.TUMOR_SITE4_STD = TUMOR_SITE4_STD;
    } 
    public String getTUMOR_STRUCTURE4_STD(){
        return TUMOR_STRUCTURE4_STD;
    } 
    public void setTUMOR_STRUCTURE4_STD(String TUMOR_STRUCTURE4_STD) {
         this.TUMOR_STRUCTURE4_STD = TUMOR_STRUCTURE4_STD;
    } 
    public Double getTUMOR_DISTANCE4_STD(){
        return TUMOR_DISTANCE4_STD;
    } 
    public void setTUMOR_DISTANCE4_STD(Double TUMOR_DISTANCE4_STD) {
         this.TUMOR_DISTANCE4_STD = TUMOR_DISTANCE4_STD;
    } 
    public String getTUMOR_UNIT4_STD(){
        return TUMOR_UNIT4_STD;
    } 
    public void setTUMOR_UNIT4_STD(String TUMOR_UNIT4_STD) {
         this.TUMOR_UNIT4_STD = TUMOR_UNIT4_STD;
    } 
}