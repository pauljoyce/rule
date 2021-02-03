package com.clinical.model.master;
import java.util.Date;
public class BASY_DIAG_STD{
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
    //就诊标识
    private String VISIT_ID;
    //住院次数
    private Integer ADMISSION_NUMBER;
    //病案号
    private String TPATNO;
    //就诊类型
    private Integer VISIT_TYPE;
    //活动记录状态
    private String RECORD_STATUS;
    //门（急）诊诊断编码
    private String P28;
    //门（急）诊诊断描述
    private String P281;
    //入院时情况
    private String P29;
    //入院诊断编码
    private String P30;
    //入院诊断描述
    private String P301;
    //入院后确诊日期
    private Date P31;
    //主要诊断编码
    private String P321;
    //主要诊断疾病描述
    private String P322;
    //主要诊断入院病情
    private String P805;
    //主要诊断出院情况
    private String P323;
    //其他诊断编码1
    private String P324;
    //其他诊断疾病描述1
    private String P325;
    //其他诊断入院病情1
    private String P806;
    //其他诊断出院情况1
    private String P326;
    //其他诊断编码2
    private String P327;
    //其他诊断疾病描述2
    private String P328;
    //其他诊断入院病情2
    private String P807;
    //其他诊断出院情况2
    private String P329;
    //其他诊断编码3
    private String P3291;
    //其他诊断疾病描述3
    private String P3292;
    //其他诊断入院病情3
    private String P808;
    //其他诊断出院情况3
    private String P3293;
    //其他诊断编码4
    private String P3294;
    //其他诊断疾病描述4
    private String P3295;
    //其他诊断入院病情4
    private String P809;
    //其他诊断出院情况4
    private String P3296;
    //其他诊断编码5
    private String P3297;
    //其他诊断疾病描述5
    private String P3298;
    //其他诊断入院病情5
    private String P810;
    //其他诊断出院情况5
    private String P3299;
    //其他诊断编码6
    private String P3281;
    //其他诊断疾病描述6
    private String P3282;
    //其他诊断入院病情6
    private String P811;
    //其他诊断出院情况6
    private String P3283;
    //其他诊断编码7
    private String P3284;
    //其他诊断疾病描述7
    private String P3285;
    //其他诊断入院病情7
    private String P812;
    //其他诊断出院情况7
    private String P3286;
    //其他诊断编码8
    private String P3287;
    //其他诊断疾病描述8
    private String P3288;
    //其他诊断入院病情8
    private String P813;
    //其他诊断出院情况8
    private String P3289;
    //其他诊断编码9
    private String P3271;
    //其他诊断疾病描述9
    private String P3272;
    //其他诊断入院病情9
    private String P814;
    //其他诊断出院情况9
    private String P3273;
    //其他诊断编码10
    private String P3274;
    //其他诊断疾病描述10
    private String P3275;
    //其他诊断入院病情10
    private String P815;
    //其他诊断出院情况10
    private String P3276;
    //病理诊断编码1
    private String P351;
    //病理诊断名称1
    private String P352;
    //病理号1
    private String P816;
    //病理诊断编码2
    private String P353;
    //病理诊断名称2
    private String P354;
    //病理号2
    private String P817;
    //病理诊断编码3
    private String P355;
    //病理诊断名称3
    private String P356;
    //病理号3
    private String P818;
    //损伤、中毒的外部因素编码1
    private String P361;
    //损伤、中毒的外部因素名称1
    private String P362;
    //损伤、中毒的外部因素编码2
    private String P363;
    //损伤、中毒的外部因素名称2
    private String P364;
    //损伤、中毒的外部因素编码3
    private String P365;
    //损伤、中毒的外部因素名称3
    private String P366;
    //门诊与出院诊断符合情况
    private String P411;
    //入院与出院诊断符合情况
    private String P412;
    //术前与术后诊断符合情况
    private String P413;
    //临床与病理诊断符合情况
    private String P414;
    //放射与病理诊断符合情况
    private String P415;
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
    //主要诊断标准化诊断编码1
    private String P322_ICD10_ID1;
    //主要诊断标准化诊断名称1
    private String P322_ICD10_NAME1;
    //主要诊断标准化诊断编码2
    private String P322_ICD10_ID2;
    //主要诊断标准化诊断名称2
    private String P322_ICD10_NAME2;
    //主要诊断标准化诊断编码3
    private String P322_ICD10_ID3;
    //主要诊断标准化诊断名称3
    private String P322_ICD10_NAME3;
    //主要诊断标准化诊断编码4
    private String P322_ICD10_ID4;
    //主要诊断标准化诊断名称4
    private String P322_ICD10_NAME4;
    //主要诊断标准化诊断编码5
    private String P322_ICD10_ID5;
    //主要诊断标准化诊断名称5
    private String P322_ICD10_NAME5;
    //其他诊断1标准化诊断编码1
    private String P325_ICD10_ID1;
    //其他诊断1标准化诊断名称1
    private String P325_ICD10_NAME1;
    //其他诊断1标准化诊断编码2
    private String P325_ICD10_ID2;
    //其他诊断1标准化诊断名称2
    private String P325_ICD10_NAME2;
    //其他诊断1标准化诊断编码3
    private String P325_ICD10_ID3;
    //其他诊断1标准化诊断名称3
    private String P325_ICD10_NAME3;
    //其他诊断1标准化诊断编码4
    private String P325_ICD10_ID4;
    //其他诊断1标准化诊断名称4
    private String P325_ICD10_NAME4;
    //其他诊断1标准化诊断编码5
    private String P325_ICD10_ID5;
    //其他诊断1标准化诊断名称5
    private String P325_ICD10_NAME5;
    //其他诊断2标准化诊断编码1
    private String P328_ICD10_ID1;
    //其他诊断2标准化诊断名称1
    private String P328_ICD10_NAME1;
    //其他诊断2标准化诊断编码2
    private String P328_ICD10_ID2;
    //其他诊断2标准化诊断名称2
    private String P328_ICD10_NAME2;
    //其他诊断2标准化诊断编码3
    private String P328_ICD10_ID3;
    //其他诊断2标准化诊断名称3
    private String P328_ICD10_NAME3;
    //其他诊断2标准化诊断编码4
    private String P328_ICD10_ID4;
    //其他诊断2标准化诊断名称4
    private String P328_ICD10_NAME4;
    //其他诊断2标准化诊断编码5
    private String P328_ICD10_ID5;
    //其他诊断2标准化诊断名称5
    private String P328_ICD10_NAME5;
    //其他诊断3标准化诊断编码1
    private String P3292_ICD10_ID1;
    //其他诊断3标准化诊断名称1
    private String P3292_ICD10_NAME1;
    //其他诊断3标准化诊断编码2
    private String P3292_ICD10_ID2;
    //其他诊断3标准化诊断名称2
    private String P3292_ICD10_NAME2;
    //其他诊断3标准化诊断编码3
    private String P3292_ICD10_ID3;
    //其他诊断3标准化诊断名称3
    private String P3292_ICD10_NAME3;
    //其他诊断3标准化诊断编码4
    private String P3292_ICD10_ID4;
    //其他诊断3标准化诊断名称4
    private String P3292_ICD10_NAME4;
    //其他诊断3标准化诊断编码5
    private String P3292_ICD10_ID5;
    //其他诊断3标准化诊断名称5
    private String P3292_ICD10_NAME5;
    //其他诊断4标准化诊断编码1
    private String P3295_ICD10_ID1;
    //其他诊断4标准化诊断名称1
    private String P3295_ICD10_NAME1;
    //其他诊断4标准化诊断编码2
    private String P3295_ICD10_ID2;
    //其他诊断4标准化诊断名称2
    private String P3295_ICD10_NAME2;
    //其他诊断4标准化诊断编码3
    private String P3295_ICD10_ID3;
    //其他诊断4标准化诊断名称3
    private String P3295_ICD10_NAME3;
    //其他诊断4标准化诊断编码4
    private String P3295_ICD10_ID4;
    //其他诊断4标准化诊断名称4
    private String P3295_ICD10_NAME4;
    //其他诊断4标准化诊断编码5
    private String P3295_ICD10_ID5;
    //其他诊断4标准化诊断名称5
    private String P3295_ICD10_NAME5;
    //其他诊断5标准化诊断编码1
    private String P3298_ICD10_ID1;
    //其他诊断5标准化诊断名称1
    private String P3298_ICD10_NAME1;
    //其他诊断5标准化诊断编码2
    private String P3298_ICD10_ID2;
    //其他诊断5标准化诊断名称2
    private String P3298_ICD10_NAME2;
    //其他诊断5标准化诊断编码3
    private String P3298_ICD10_ID3;
    //其他诊断5标准化诊断名称3
    private String P3298_ICD10_NAME3;
    //其他诊断5标准化诊断编码4
    private String P3298_ICD10_ID4;
    //其他诊断5标准化诊断名称4
    private String P3298_ICD10_NAME4;
    //其他诊断5标准化诊断编码5
    private String P3298_ICD10_ID5;
    //其他诊断5标准化诊断名称5
    private String P3298_ICD10_NAME5;
    //其他诊断6标准化诊断编码1
    private String P3282_ICD10_ID1;
    //其他诊断6标准化诊断名称1
    private String P3282_ICD10_NAME1;
    //其他诊断6标准化诊断编码2
    private String P3282_ICD10_ID2;
    //其他诊断6标准化诊断名称2
    private String P3282_ICD10_NAME2;
    //其他诊断6标准化诊断编码3
    private String P3282_ICD10_ID3;
    //其他诊断6标准化诊断名称3
    private String P3282_ICD10_NAME3;
    //其他诊断6标准化诊断编码4
    private String P3282_ICD10_ID4;
    //其他诊断6标准化诊断名称4
    private String P3282_ICD10_NAME4;
    //其他诊断6标准化诊断编码5
    private String P3282_ICD10_ID5;
    //其他诊断6标准化诊断名称5
    private String P3282_ICD10_NAME5;
    //其他诊断7标准化诊断编码1
    private String P3285_ICD10_ID1;
    //其他诊断7标准化诊断名称1
    private String P3285_ICD10_NAME1;
    //其他诊断7标准化诊断编码2
    private String P3285_ICD10_ID2;
    //其他诊断7标准化诊断名称2
    private String P3285_ICD10_NAME2;
    //其他诊断7标准化诊断编码3
    private String P3285_ICD10_ID3;
    //其他诊断7标准化诊断名称3
    private String P3285_ICD10_NAME3;
    //其他诊断7标准化诊断编码4
    private String P3285_ICD10_ID4;
    //其他诊断7标准化诊断名称4
    private String P3285_ICD10_NAME4;
    //其他诊断7标准化诊断编码5
    private String P3285_ICD10_ID5;
    //其他诊断7标准化诊断名称5
    private String P3285_ICD10_NAME5;
    //其他诊断8标准化诊断编码1
    private String P3288_ICD10_ID1;
    //其他诊断8标准化诊断名称1
    private String P3288_ICD10_NAME1;
    //其他诊断8标准化诊断编码2
    private String P3288_ICD10_ID2;
    //其他诊断8标准化诊断名称2
    private String P3288_ICD10_NAME2;
    //其他诊断8标准化诊断编码3
    private String P3288_ICD10_ID3;
    //其他诊断8标准化诊断名称3
    private String P3288_ICD10_NAME3;
    //其他诊断8标准化诊断编码4
    private String P3288_ICD10_ID4;
    //其他诊断8标准化诊断名称4
    private String P3288_ICD10_NAME4;
    //其他诊断8标准化诊断编码5
    private String P3288_ICD10_ID5;
    //其他诊断8标准化诊断名称5
    private String P3288_ICD10_NAME5;
    //其他诊断9标准化诊断编码1
    private String P3272_ICD10_ID1;
    //其他诊断9标准化诊断名称1
    private String P3272_ICD10_NAME1;
    //其他诊断9标准化诊断编码2
    private String P3272_ICD10_ID2;
    //其他诊断9标准化诊断名称2
    private String P3272_ICD10_NAME2;
    //其他诊断9标准化诊断编码3
    private String P3272_ICD10_ID3;
    //其他诊断9标准化诊断名称3
    private String P3272_ICD10_NAME3;
    //其他诊断9标准化诊断编码4
    private String P3272_ICD10_ID4;
    //其他诊断9标准化诊断名称4
    private String P3272_ICD10_NAME4;
    //其他诊断9标准化诊断编码5
    private String P3272_ICD10_ID5;
    //其他诊断9标准化诊断名称5
    private String P3272_ICD10_NAME5;
    //其他诊断10标准化诊断编码1
    private String P3275_ICD10_ID1;
    //其他诊断10标准化诊断名称1
    private String P3275_ICD10_NAME1;
    //其他诊断10标准化诊断编码2
    private String P3275_ICD10_ID2;
    //其他诊断10标准化诊断名称2
    private String P3275_ICD10_NAME2;
    //其他诊断10标准化诊断编码3
    private String P3275_ICD10_ID3;
    //其他诊断10标准化诊断名称3
    private String P3275_ICD10_NAME3;
    //其他诊断10标准化诊断编码4
    private String P3275_ICD10_ID4;
    //其他诊断10标准化诊断名称4
    private String P3275_ICD10_NAME4;
    //其他诊断10标准化诊断编码5
    private String P3275_ICD10_ID5;
    //其他诊断10标准化诊断名称5
    private String P3275_ICD10_NAME5;
    //门诊诊断标准化诊断编码1
    private String P281_ICD10_ID1;
    //门诊诊断标准化诊断名称1
    private String P281_ICD10_NAME1;
    //门诊诊断标准化诊断编码2
    private String P281_ICD10_ID2;
    //门诊诊断标准化诊断名称2
    private String P281_ICD10_NAME2;
    //门诊诊断标准化诊断编码3
    private String P281_ICD10_ID3;
    //门诊诊断标准化诊断名称3
    private String P281_ICD10_NAME3;
    //门诊诊断标准化诊断编码4
    private String P281_ICD10_ID4;
    //门诊诊断标准化诊断名称4
    private String P281_ICD10_NAME4;
    //门诊诊断标准化诊断编码5
    private String P281_ICD10_ID5;
    //门诊诊断标准化诊断名称5
    private String P281_ICD10_NAME5;
    //入院诊断标准化诊断编码1
    private String P301_ICD10_ID1;
    //入院诊断标准化诊断名称1
    private String P301_ICD10_NAME1;
    //入院诊断标准化诊断编码2
    private String P301_ICD10_ID2;
    //入院诊断标准化诊断名称2
    private String P301_ICD10_NAME2;
    //入院诊断标准化诊断编码3
    private String P301_ICD10_ID3;
    //入院诊断标准化诊断名称3
    private String P301_ICD10_NAME3;
    //入院诊断标准化诊断编码4
    private String P301_ICD10_ID4;
    //入院诊断标准化诊断名称4
    private String P301_ICD10_NAME4;
    //入院诊断标准化诊断编码5
    private String P301_ICD10_ID5;
    //入院诊断标准化诊断名称5
    private String P301_ICD10_NAME5;
    //病理诊断名称1标准化诊断编码1
    private String P352_ICD10_ID1;
    //病理诊断名称1标准化诊断名称1
    private String P352_ICD10_NAME1;
    //病理诊断名称1标准化诊断编码2
    private String P352_ICD10_ID2;
    //病理诊断名称1标准化诊断名称2
    private String P352_ICD10_NAME2;
    //病理诊断名称1标准化诊断编码3
    private String P352_ICD10_ID3;
    //病理诊断名称1标准化诊断名称3
    private String P352_ICD10_NAME3;
    //病理诊断名称1标准化诊断编码4
    private String P352_ICD10_ID4;
    //病理诊断名称1标准化诊断名称4
    private String P352_ICD10_NAME4;
    //病理诊断名称1标准化诊断编码5
    private String P352_ICD10_ID5;
    //病理诊断名称1标准化诊断名称5
    private String P352_ICD10_NAME5;
    //病理诊断名称2标准化诊断编码1
    private String P354_ICD10_ID1;
    //病理诊断名称2标准化诊断名称1
    private String P354_ICD10_NAME1;
    //病理诊断名称2标准化诊断编码2
    private String P354_ICD10_ID2;
    //病理诊断名称2标准化诊断名称2
    private String P354_ICD10_NAME2;
    //病理诊断名称2标准化诊断编码3
    private String P354_ICD10_ID3;
    //病理诊断名称2标准化诊断名称3
    private String P354_ICD10_NAME3;
    //病理诊断名称2标准化诊断编码4
    private String P354_ICD10_ID4;
    //病理诊断名称2标准化诊断名称4
    private String P354_ICD10_NAME4;
    //病理诊断名称2标准化诊断编码5
    private String P354_ICD10_ID5;
    //病理诊断名称2标准化诊断名称5
    private String P354_ICD10_NAME5;
    //病理诊断名称3标准化诊断编码1
    private String P356_ICD10_ID1;
    //病理诊断名称3标准化诊断名称1
    private String P356_ICD10_NAME1;
    //病理诊断名称3标准化诊断编码2
    private String P356_ICD10_ID2;
    //病理诊断名称3标准化诊断名称2
    private String P356_ICD10_NAME2;
    //病理诊断名称3标准化诊断编码3
    private String P356_ICD10_ID3;
    //病理诊断名称3标准化诊断名称3
    private String P356_ICD10_NAME3;
    //病理诊断名称3标准化诊断编码4
    private String P356_ICD10_ID4;
    //病理诊断名称3标准化诊断名称4
    private String P356_ICD10_NAME4;
    //病理诊断名称3标准化诊断编码5
    private String P356_ICD10_ID5;
    //病理诊断名称3标准化诊断名称5
    private String P356_ICD10_NAME5;

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
    public String getP28(){
        return P28;
    } 
    public void setP28(String P28) {
         this.P28 = P28;
    } 
    public String getP281(){
        return P281;
    } 
    public void setP281(String P281) {
         this.P281 = P281;
    } 
    public String getP29(){
        return P29;
    } 
    public void setP29(String P29) {
         this.P29 = P29;
    } 
    public String getP30(){
        return P30;
    } 
    public void setP30(String P30) {
         this.P30 = P30;
    } 
    public String getP301(){
        return P301;
    } 
    public void setP301(String P301) {
         this.P301 = P301;
    } 
    public Date getP31(){
        return P31;
    } 
    public void setP31(Date P31) {
         this.P31 = P31;
    } 
    public String getP321(){
        return P321;
    } 
    public void setP321(String P321) {
         this.P321 = P321;
    } 
    public String getP322(){
        return P322;
    } 
    public void setP322(String P322) {
         this.P322 = P322;
    } 
    public String getP805(){
        return P805;
    } 
    public void setP805(String P805) {
         this.P805 = P805;
    } 
    public String getP323(){
        return P323;
    } 
    public void setP323(String P323) {
         this.P323 = P323;
    } 
    public String getP324(){
        return P324;
    } 
    public void setP324(String P324) {
         this.P324 = P324;
    } 
    public String getP325(){
        return P325;
    } 
    public void setP325(String P325) {
         this.P325 = P325;
    } 
    public String getP806(){
        return P806;
    } 
    public void setP806(String P806) {
         this.P806 = P806;
    } 
    public String getP326(){
        return P326;
    } 
    public void setP326(String P326) {
         this.P326 = P326;
    } 
    public String getP327(){
        return P327;
    } 
    public void setP327(String P327) {
         this.P327 = P327;
    } 
    public String getP328(){
        return P328;
    } 
    public void setP328(String P328) {
         this.P328 = P328;
    } 
    public String getP807(){
        return P807;
    } 
    public void setP807(String P807) {
         this.P807 = P807;
    } 
    public String getP329(){
        return P329;
    } 
    public void setP329(String P329) {
         this.P329 = P329;
    } 
    public String getP3291(){
        return P3291;
    } 
    public void setP3291(String P3291) {
         this.P3291 = P3291;
    } 
    public String getP3292(){
        return P3292;
    } 
    public void setP3292(String P3292) {
         this.P3292 = P3292;
    } 
    public String getP808(){
        return P808;
    } 
    public void setP808(String P808) {
         this.P808 = P808;
    } 
    public String getP3293(){
        return P3293;
    } 
    public void setP3293(String P3293) {
         this.P3293 = P3293;
    } 
    public String getP3294(){
        return P3294;
    } 
    public void setP3294(String P3294) {
         this.P3294 = P3294;
    } 
    public String getP3295(){
        return P3295;
    } 
    public void setP3295(String P3295) {
         this.P3295 = P3295;
    } 
    public String getP809(){
        return P809;
    } 
    public void setP809(String P809) {
         this.P809 = P809;
    } 
    public String getP3296(){
        return P3296;
    } 
    public void setP3296(String P3296) {
         this.P3296 = P3296;
    } 
    public String getP3297(){
        return P3297;
    } 
    public void setP3297(String P3297) {
         this.P3297 = P3297;
    } 
    public String getP3298(){
        return P3298;
    } 
    public void setP3298(String P3298) {
         this.P3298 = P3298;
    } 
    public String getP810(){
        return P810;
    } 
    public void setP810(String P810) {
         this.P810 = P810;
    } 
    public String getP3299(){
        return P3299;
    } 
    public void setP3299(String P3299) {
         this.P3299 = P3299;
    } 
    public String getP3281(){
        return P3281;
    } 
    public void setP3281(String P3281) {
         this.P3281 = P3281;
    } 
    public String getP3282(){
        return P3282;
    } 
    public void setP3282(String P3282) {
         this.P3282 = P3282;
    } 
    public String getP811(){
        return P811;
    } 
    public void setP811(String P811) {
         this.P811 = P811;
    } 
    public String getP3283(){
        return P3283;
    } 
    public void setP3283(String P3283) {
         this.P3283 = P3283;
    } 
    public String getP3284(){
        return P3284;
    } 
    public void setP3284(String P3284) {
         this.P3284 = P3284;
    } 
    public String getP3285(){
        return P3285;
    } 
    public void setP3285(String P3285) {
         this.P3285 = P3285;
    } 
    public String getP812(){
        return P812;
    } 
    public void setP812(String P812) {
         this.P812 = P812;
    } 
    public String getP3286(){
        return P3286;
    } 
    public void setP3286(String P3286) {
         this.P3286 = P3286;
    } 
    public String getP3287(){
        return P3287;
    } 
    public void setP3287(String P3287) {
         this.P3287 = P3287;
    } 
    public String getP3288(){
        return P3288;
    } 
    public void setP3288(String P3288) {
         this.P3288 = P3288;
    } 
    public String getP813(){
        return P813;
    } 
    public void setP813(String P813) {
         this.P813 = P813;
    } 
    public String getP3289(){
        return P3289;
    } 
    public void setP3289(String P3289) {
         this.P3289 = P3289;
    } 
    public String getP3271(){
        return P3271;
    } 
    public void setP3271(String P3271) {
         this.P3271 = P3271;
    } 
    public String getP3272(){
        return P3272;
    } 
    public void setP3272(String P3272) {
         this.P3272 = P3272;
    } 
    public String getP814(){
        return P814;
    } 
    public void setP814(String P814) {
         this.P814 = P814;
    } 
    public String getP3273(){
        return P3273;
    } 
    public void setP3273(String P3273) {
         this.P3273 = P3273;
    } 
    public String getP3274(){
        return P3274;
    } 
    public void setP3274(String P3274) {
         this.P3274 = P3274;
    } 
    public String getP3275(){
        return P3275;
    } 
    public void setP3275(String P3275) {
         this.P3275 = P3275;
    } 
    public String getP815(){
        return P815;
    } 
    public void setP815(String P815) {
         this.P815 = P815;
    } 
    public String getP3276(){
        return P3276;
    } 
    public void setP3276(String P3276) {
         this.P3276 = P3276;
    } 
    public String getP351(){
        return P351;
    } 
    public void setP351(String P351) {
         this.P351 = P351;
    } 
    public String getP352(){
        return P352;
    } 
    public void setP352(String P352) {
         this.P352 = P352;
    } 
    public String getP816(){
        return P816;
    } 
    public void setP816(String P816) {
         this.P816 = P816;
    } 
    public String getP353(){
        return P353;
    } 
    public void setP353(String P353) {
         this.P353 = P353;
    } 
    public String getP354(){
        return P354;
    } 
    public void setP354(String P354) {
         this.P354 = P354;
    } 
    public String getP817(){
        return P817;
    } 
    public void setP817(String P817) {
         this.P817 = P817;
    } 
    public String getP355(){
        return P355;
    } 
    public void setP355(String P355) {
         this.P355 = P355;
    } 
    public String getP356(){
        return P356;
    } 
    public void setP356(String P356) {
         this.P356 = P356;
    } 
    public String getP818(){
        return P818;
    } 
    public void setP818(String P818) {
         this.P818 = P818;
    } 
    public String getP361(){
        return P361;
    } 
    public void setP361(String P361) {
         this.P361 = P361;
    } 
    public String getP362(){
        return P362;
    } 
    public void setP362(String P362) {
         this.P362 = P362;
    } 
    public String getP363(){
        return P363;
    } 
    public void setP363(String P363) {
         this.P363 = P363;
    } 
    public String getP364(){
        return P364;
    } 
    public void setP364(String P364) {
         this.P364 = P364;
    } 
    public String getP365(){
        return P365;
    } 
    public void setP365(String P365) {
         this.P365 = P365;
    } 
    public String getP366(){
        return P366;
    } 
    public void setP366(String P366) {
         this.P366 = P366;
    } 
    public String getP411(){
        return P411;
    } 
    public void setP411(String P411) {
         this.P411 = P411;
    } 
    public String getP412(){
        return P412;
    } 
    public void setP412(String P412) {
         this.P412 = P412;
    } 
    public String getP413(){
        return P413;
    } 
    public void setP413(String P413) {
         this.P413 = P413;
    } 
    public String getP414(){
        return P414;
    } 
    public void setP414(String P414) {
         this.P414 = P414;
    } 
    public String getP415(){
        return P415;
    } 
    public void setP415(String P415) {
         this.P415 = P415;
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
    public String getP322_ICD10_ID1(){
        return P322_ICD10_ID1;
    } 
    public void setP322_ICD10_ID1(String P322_ICD10_ID1) {
         this.P322_ICD10_ID1 = P322_ICD10_ID1;
    } 
    public String getP322_ICD10_NAME1(){
        return P322_ICD10_NAME1;
    } 
    public void setP322_ICD10_NAME1(String P322_ICD10_NAME1) {
         this.P322_ICD10_NAME1 = P322_ICD10_NAME1;
    } 
    public String getP322_ICD10_ID2(){
        return P322_ICD10_ID2;
    } 
    public void setP322_ICD10_ID2(String P322_ICD10_ID2) {
         this.P322_ICD10_ID2 = P322_ICD10_ID2;
    } 
    public String getP322_ICD10_NAME2(){
        return P322_ICD10_NAME2;
    } 
    public void setP322_ICD10_NAME2(String P322_ICD10_NAME2) {
         this.P322_ICD10_NAME2 = P322_ICD10_NAME2;
    } 
    public String getP322_ICD10_ID3(){
        return P322_ICD10_ID3;
    } 
    public void setP322_ICD10_ID3(String P322_ICD10_ID3) {
         this.P322_ICD10_ID3 = P322_ICD10_ID3;
    } 
    public String getP322_ICD10_NAME3(){
        return P322_ICD10_NAME3;
    } 
    public void setP322_ICD10_NAME3(String P322_ICD10_NAME3) {
         this.P322_ICD10_NAME3 = P322_ICD10_NAME3;
    } 
    public String getP322_ICD10_ID4(){
        return P322_ICD10_ID4;
    } 
    public void setP322_ICD10_ID4(String P322_ICD10_ID4) {
         this.P322_ICD10_ID4 = P322_ICD10_ID4;
    } 
    public String getP322_ICD10_NAME4(){
        return P322_ICD10_NAME4;
    } 
    public void setP322_ICD10_NAME4(String P322_ICD10_NAME4) {
         this.P322_ICD10_NAME4 = P322_ICD10_NAME4;
    } 
    public String getP322_ICD10_ID5(){
        return P322_ICD10_ID5;
    } 
    public void setP322_ICD10_ID5(String P322_ICD10_ID5) {
         this.P322_ICD10_ID5 = P322_ICD10_ID5;
    } 
    public String getP322_ICD10_NAME5(){
        return P322_ICD10_NAME5;
    } 
    public void setP322_ICD10_NAME5(String P322_ICD10_NAME5) {
         this.P322_ICD10_NAME5 = P322_ICD10_NAME5;
    } 
    public String getP325_ICD10_ID1(){
        return P325_ICD10_ID1;
    } 
    public void setP325_ICD10_ID1(String P325_ICD10_ID1) {
         this.P325_ICD10_ID1 = P325_ICD10_ID1;
    } 
    public String getP325_ICD10_NAME1(){
        return P325_ICD10_NAME1;
    } 
    public void setP325_ICD10_NAME1(String P325_ICD10_NAME1) {
         this.P325_ICD10_NAME1 = P325_ICD10_NAME1;
    } 
    public String getP325_ICD10_ID2(){
        return P325_ICD10_ID2;
    } 
    public void setP325_ICD10_ID2(String P325_ICD10_ID2) {
         this.P325_ICD10_ID2 = P325_ICD10_ID2;
    } 
    public String getP325_ICD10_NAME2(){
        return P325_ICD10_NAME2;
    } 
    public void setP325_ICD10_NAME2(String P325_ICD10_NAME2) {
         this.P325_ICD10_NAME2 = P325_ICD10_NAME2;
    } 
    public String getP325_ICD10_ID3(){
        return P325_ICD10_ID3;
    } 
    public void setP325_ICD10_ID3(String P325_ICD10_ID3) {
         this.P325_ICD10_ID3 = P325_ICD10_ID3;
    } 
    public String getP325_ICD10_NAME3(){
        return P325_ICD10_NAME3;
    } 
    public void setP325_ICD10_NAME3(String P325_ICD10_NAME3) {
         this.P325_ICD10_NAME3 = P325_ICD10_NAME3;
    } 
    public String getP325_ICD10_ID4(){
        return P325_ICD10_ID4;
    } 
    public void setP325_ICD10_ID4(String P325_ICD10_ID4) {
         this.P325_ICD10_ID4 = P325_ICD10_ID4;
    } 
    public String getP325_ICD10_NAME4(){
        return P325_ICD10_NAME4;
    } 
    public void setP325_ICD10_NAME4(String P325_ICD10_NAME4) {
         this.P325_ICD10_NAME4 = P325_ICD10_NAME4;
    } 
    public String getP325_ICD10_ID5(){
        return P325_ICD10_ID5;
    } 
    public void setP325_ICD10_ID5(String P325_ICD10_ID5) {
         this.P325_ICD10_ID5 = P325_ICD10_ID5;
    } 
    public String getP325_ICD10_NAME5(){
        return P325_ICD10_NAME5;
    } 
    public void setP325_ICD10_NAME5(String P325_ICD10_NAME5) {
         this.P325_ICD10_NAME5 = P325_ICD10_NAME5;
    } 
    public String getP328_ICD10_ID1(){
        return P328_ICD10_ID1;
    } 
    public void setP328_ICD10_ID1(String P328_ICD10_ID1) {
         this.P328_ICD10_ID1 = P328_ICD10_ID1;
    } 
    public String getP328_ICD10_NAME1(){
        return P328_ICD10_NAME1;
    } 
    public void setP328_ICD10_NAME1(String P328_ICD10_NAME1) {
         this.P328_ICD10_NAME1 = P328_ICD10_NAME1;
    } 
    public String getP328_ICD10_ID2(){
        return P328_ICD10_ID2;
    } 
    public void setP328_ICD10_ID2(String P328_ICD10_ID2) {
         this.P328_ICD10_ID2 = P328_ICD10_ID2;
    } 
    public String getP328_ICD10_NAME2(){
        return P328_ICD10_NAME2;
    } 
    public void setP328_ICD10_NAME2(String P328_ICD10_NAME2) {
         this.P328_ICD10_NAME2 = P328_ICD10_NAME2;
    } 
    public String getP328_ICD10_ID3(){
        return P328_ICD10_ID3;
    } 
    public void setP328_ICD10_ID3(String P328_ICD10_ID3) {
         this.P328_ICD10_ID3 = P328_ICD10_ID3;
    } 
    public String getP328_ICD10_NAME3(){
        return P328_ICD10_NAME3;
    } 
    public void setP328_ICD10_NAME3(String P328_ICD10_NAME3) {
         this.P328_ICD10_NAME3 = P328_ICD10_NAME3;
    } 
    public String getP328_ICD10_ID4(){
        return P328_ICD10_ID4;
    } 
    public void setP328_ICD10_ID4(String P328_ICD10_ID4) {
         this.P328_ICD10_ID4 = P328_ICD10_ID4;
    } 
    public String getP328_ICD10_NAME4(){
        return P328_ICD10_NAME4;
    } 
    public void setP328_ICD10_NAME4(String P328_ICD10_NAME4) {
         this.P328_ICD10_NAME4 = P328_ICD10_NAME4;
    } 
    public String getP328_ICD10_ID5(){
        return P328_ICD10_ID5;
    } 
    public void setP328_ICD10_ID5(String P328_ICD10_ID5) {
         this.P328_ICD10_ID5 = P328_ICD10_ID5;
    } 
    public String getP328_ICD10_NAME5(){
        return P328_ICD10_NAME5;
    } 
    public void setP328_ICD10_NAME5(String P328_ICD10_NAME5) {
         this.P328_ICD10_NAME5 = P328_ICD10_NAME5;
    } 
    public String getP3292_ICD10_ID1(){
        return P3292_ICD10_ID1;
    } 
    public void setP3292_ICD10_ID1(String P3292_ICD10_ID1) {
         this.P3292_ICD10_ID1 = P3292_ICD10_ID1;
    } 
    public String getP3292_ICD10_NAME1(){
        return P3292_ICD10_NAME1;
    } 
    public void setP3292_ICD10_NAME1(String P3292_ICD10_NAME1) {
         this.P3292_ICD10_NAME1 = P3292_ICD10_NAME1;
    } 
    public String getP3292_ICD10_ID2(){
        return P3292_ICD10_ID2;
    } 
    public void setP3292_ICD10_ID2(String P3292_ICD10_ID2) {
         this.P3292_ICD10_ID2 = P3292_ICD10_ID2;
    } 
    public String getP3292_ICD10_NAME2(){
        return P3292_ICD10_NAME2;
    } 
    public void setP3292_ICD10_NAME2(String P3292_ICD10_NAME2) {
         this.P3292_ICD10_NAME2 = P3292_ICD10_NAME2;
    } 
    public String getP3292_ICD10_ID3(){
        return P3292_ICD10_ID3;
    } 
    public void setP3292_ICD10_ID3(String P3292_ICD10_ID3) {
         this.P3292_ICD10_ID3 = P3292_ICD10_ID3;
    } 
    public String getP3292_ICD10_NAME3(){
        return P3292_ICD10_NAME3;
    } 
    public void setP3292_ICD10_NAME3(String P3292_ICD10_NAME3) {
         this.P3292_ICD10_NAME3 = P3292_ICD10_NAME3;
    } 
    public String getP3292_ICD10_ID4(){
        return P3292_ICD10_ID4;
    } 
    public void setP3292_ICD10_ID4(String P3292_ICD10_ID4) {
         this.P3292_ICD10_ID4 = P3292_ICD10_ID4;
    } 
    public String getP3292_ICD10_NAME4(){
        return P3292_ICD10_NAME4;
    } 
    public void setP3292_ICD10_NAME4(String P3292_ICD10_NAME4) {
         this.P3292_ICD10_NAME4 = P3292_ICD10_NAME4;
    } 
    public String getP3292_ICD10_ID5(){
        return P3292_ICD10_ID5;
    } 
    public void setP3292_ICD10_ID5(String P3292_ICD10_ID5) {
         this.P3292_ICD10_ID5 = P3292_ICD10_ID5;
    } 
    public String getP3292_ICD10_NAME5(){
        return P3292_ICD10_NAME5;
    } 
    public void setP3292_ICD10_NAME5(String P3292_ICD10_NAME5) {
         this.P3292_ICD10_NAME5 = P3292_ICD10_NAME5;
    } 
    public String getP3295_ICD10_ID1(){
        return P3295_ICD10_ID1;
    } 
    public void setP3295_ICD10_ID1(String P3295_ICD10_ID1) {
         this.P3295_ICD10_ID1 = P3295_ICD10_ID1;
    } 
    public String getP3295_ICD10_NAME1(){
        return P3295_ICD10_NAME1;
    } 
    public void setP3295_ICD10_NAME1(String P3295_ICD10_NAME1) {
         this.P3295_ICD10_NAME1 = P3295_ICD10_NAME1;
    } 
    public String getP3295_ICD10_ID2(){
        return P3295_ICD10_ID2;
    } 
    public void setP3295_ICD10_ID2(String P3295_ICD10_ID2) {
         this.P3295_ICD10_ID2 = P3295_ICD10_ID2;
    } 
    public String getP3295_ICD10_NAME2(){
        return P3295_ICD10_NAME2;
    } 
    public void setP3295_ICD10_NAME2(String P3295_ICD10_NAME2) {
         this.P3295_ICD10_NAME2 = P3295_ICD10_NAME2;
    } 
    public String getP3295_ICD10_ID3(){
        return P3295_ICD10_ID3;
    } 
    public void setP3295_ICD10_ID3(String P3295_ICD10_ID3) {
         this.P3295_ICD10_ID3 = P3295_ICD10_ID3;
    } 
    public String getP3295_ICD10_NAME3(){
        return P3295_ICD10_NAME3;
    } 
    public void setP3295_ICD10_NAME3(String P3295_ICD10_NAME3) {
         this.P3295_ICD10_NAME3 = P3295_ICD10_NAME3;
    } 
    public String getP3295_ICD10_ID4(){
        return P3295_ICD10_ID4;
    } 
    public void setP3295_ICD10_ID4(String P3295_ICD10_ID4) {
         this.P3295_ICD10_ID4 = P3295_ICD10_ID4;
    } 
    public String getP3295_ICD10_NAME4(){
        return P3295_ICD10_NAME4;
    } 
    public void setP3295_ICD10_NAME4(String P3295_ICD10_NAME4) {
         this.P3295_ICD10_NAME4 = P3295_ICD10_NAME4;
    } 
    public String getP3295_ICD10_ID5(){
        return P3295_ICD10_ID5;
    } 
    public void setP3295_ICD10_ID5(String P3295_ICD10_ID5) {
         this.P3295_ICD10_ID5 = P3295_ICD10_ID5;
    } 
    public String getP3295_ICD10_NAME5(){
        return P3295_ICD10_NAME5;
    } 
    public void setP3295_ICD10_NAME5(String P3295_ICD10_NAME5) {
         this.P3295_ICD10_NAME5 = P3295_ICD10_NAME5;
    } 
    public String getP3298_ICD10_ID1(){
        return P3298_ICD10_ID1;
    } 
    public void setP3298_ICD10_ID1(String P3298_ICD10_ID1) {
         this.P3298_ICD10_ID1 = P3298_ICD10_ID1;
    } 
    public String getP3298_ICD10_NAME1(){
        return P3298_ICD10_NAME1;
    } 
    public void setP3298_ICD10_NAME1(String P3298_ICD10_NAME1) {
         this.P3298_ICD10_NAME1 = P3298_ICD10_NAME1;
    } 
    public String getP3298_ICD10_ID2(){
        return P3298_ICD10_ID2;
    } 
    public void setP3298_ICD10_ID2(String P3298_ICD10_ID2) {
         this.P3298_ICD10_ID2 = P3298_ICD10_ID2;
    } 
    public String getP3298_ICD10_NAME2(){
        return P3298_ICD10_NAME2;
    } 
    public void setP3298_ICD10_NAME2(String P3298_ICD10_NAME2) {
         this.P3298_ICD10_NAME2 = P3298_ICD10_NAME2;
    } 
    public String getP3298_ICD10_ID3(){
        return P3298_ICD10_ID3;
    } 
    public void setP3298_ICD10_ID3(String P3298_ICD10_ID3) {
         this.P3298_ICD10_ID3 = P3298_ICD10_ID3;
    } 
    public String getP3298_ICD10_NAME3(){
        return P3298_ICD10_NAME3;
    } 
    public void setP3298_ICD10_NAME3(String P3298_ICD10_NAME3) {
         this.P3298_ICD10_NAME3 = P3298_ICD10_NAME3;
    } 
    public String getP3298_ICD10_ID4(){
        return P3298_ICD10_ID4;
    } 
    public void setP3298_ICD10_ID4(String P3298_ICD10_ID4) {
         this.P3298_ICD10_ID4 = P3298_ICD10_ID4;
    } 
    public String getP3298_ICD10_NAME4(){
        return P3298_ICD10_NAME4;
    } 
    public void setP3298_ICD10_NAME4(String P3298_ICD10_NAME4) {
         this.P3298_ICD10_NAME4 = P3298_ICD10_NAME4;
    } 
    public String getP3298_ICD10_ID5(){
        return P3298_ICD10_ID5;
    } 
    public void setP3298_ICD10_ID5(String P3298_ICD10_ID5) {
         this.P3298_ICD10_ID5 = P3298_ICD10_ID5;
    } 
    public String getP3298_ICD10_NAME5(){
        return P3298_ICD10_NAME5;
    } 
    public void setP3298_ICD10_NAME5(String P3298_ICD10_NAME5) {
         this.P3298_ICD10_NAME5 = P3298_ICD10_NAME5;
    } 
    public String getP3282_ICD10_ID1(){
        return P3282_ICD10_ID1;
    } 
    public void setP3282_ICD10_ID1(String P3282_ICD10_ID1) {
         this.P3282_ICD10_ID1 = P3282_ICD10_ID1;
    } 
    public String getP3282_ICD10_NAME1(){
        return P3282_ICD10_NAME1;
    } 
    public void setP3282_ICD10_NAME1(String P3282_ICD10_NAME1) {
         this.P3282_ICD10_NAME1 = P3282_ICD10_NAME1;
    } 
    public String getP3282_ICD10_ID2(){
        return P3282_ICD10_ID2;
    } 
    public void setP3282_ICD10_ID2(String P3282_ICD10_ID2) {
         this.P3282_ICD10_ID2 = P3282_ICD10_ID2;
    } 
    public String getP3282_ICD10_NAME2(){
        return P3282_ICD10_NAME2;
    } 
    public void setP3282_ICD10_NAME2(String P3282_ICD10_NAME2) {
         this.P3282_ICD10_NAME2 = P3282_ICD10_NAME2;
    } 
    public String getP3282_ICD10_ID3(){
        return P3282_ICD10_ID3;
    } 
    public void setP3282_ICD10_ID3(String P3282_ICD10_ID3) {
         this.P3282_ICD10_ID3 = P3282_ICD10_ID3;
    } 
    public String getP3282_ICD10_NAME3(){
        return P3282_ICD10_NAME3;
    } 
    public void setP3282_ICD10_NAME3(String P3282_ICD10_NAME3) {
         this.P3282_ICD10_NAME3 = P3282_ICD10_NAME3;
    } 
    public String getP3282_ICD10_ID4(){
        return P3282_ICD10_ID4;
    } 
    public void setP3282_ICD10_ID4(String P3282_ICD10_ID4) {
         this.P3282_ICD10_ID4 = P3282_ICD10_ID4;
    } 
    public String getP3282_ICD10_NAME4(){
        return P3282_ICD10_NAME4;
    } 
    public void setP3282_ICD10_NAME4(String P3282_ICD10_NAME4) {
         this.P3282_ICD10_NAME4 = P3282_ICD10_NAME4;
    } 
    public String getP3282_ICD10_ID5(){
        return P3282_ICD10_ID5;
    } 
    public void setP3282_ICD10_ID5(String P3282_ICD10_ID5) {
         this.P3282_ICD10_ID5 = P3282_ICD10_ID5;
    } 
    public String getP3282_ICD10_NAME5(){
        return P3282_ICD10_NAME5;
    } 
    public void setP3282_ICD10_NAME5(String P3282_ICD10_NAME5) {
         this.P3282_ICD10_NAME5 = P3282_ICD10_NAME5;
    } 
    public String getP3285_ICD10_ID1(){
        return P3285_ICD10_ID1;
    } 
    public void setP3285_ICD10_ID1(String P3285_ICD10_ID1) {
         this.P3285_ICD10_ID1 = P3285_ICD10_ID1;
    } 
    public String getP3285_ICD10_NAME1(){
        return P3285_ICD10_NAME1;
    } 
    public void setP3285_ICD10_NAME1(String P3285_ICD10_NAME1) {
         this.P3285_ICD10_NAME1 = P3285_ICD10_NAME1;
    } 
    public String getP3285_ICD10_ID2(){
        return P3285_ICD10_ID2;
    } 
    public void setP3285_ICD10_ID2(String P3285_ICD10_ID2) {
         this.P3285_ICD10_ID2 = P3285_ICD10_ID2;
    } 
    public String getP3285_ICD10_NAME2(){
        return P3285_ICD10_NAME2;
    } 
    public void setP3285_ICD10_NAME2(String P3285_ICD10_NAME2) {
         this.P3285_ICD10_NAME2 = P3285_ICD10_NAME2;
    } 
    public String getP3285_ICD10_ID3(){
        return P3285_ICD10_ID3;
    } 
    public void setP3285_ICD10_ID3(String P3285_ICD10_ID3) {
         this.P3285_ICD10_ID3 = P3285_ICD10_ID3;
    } 
    public String getP3285_ICD10_NAME3(){
        return P3285_ICD10_NAME3;
    } 
    public void setP3285_ICD10_NAME3(String P3285_ICD10_NAME3) {
         this.P3285_ICD10_NAME3 = P3285_ICD10_NAME3;
    } 
    public String getP3285_ICD10_ID4(){
        return P3285_ICD10_ID4;
    } 
    public void setP3285_ICD10_ID4(String P3285_ICD10_ID4) {
         this.P3285_ICD10_ID4 = P3285_ICD10_ID4;
    } 
    public String getP3285_ICD10_NAME4(){
        return P3285_ICD10_NAME4;
    } 
    public void setP3285_ICD10_NAME4(String P3285_ICD10_NAME4) {
         this.P3285_ICD10_NAME4 = P3285_ICD10_NAME4;
    } 
    public String getP3285_ICD10_ID5(){
        return P3285_ICD10_ID5;
    } 
    public void setP3285_ICD10_ID5(String P3285_ICD10_ID5) {
         this.P3285_ICD10_ID5 = P3285_ICD10_ID5;
    } 
    public String getP3285_ICD10_NAME5(){
        return P3285_ICD10_NAME5;
    } 
    public void setP3285_ICD10_NAME5(String P3285_ICD10_NAME5) {
         this.P3285_ICD10_NAME5 = P3285_ICD10_NAME5;
    } 
    public String getP3288_ICD10_ID1(){
        return P3288_ICD10_ID1;
    } 
    public void setP3288_ICD10_ID1(String P3288_ICD10_ID1) {
         this.P3288_ICD10_ID1 = P3288_ICD10_ID1;
    } 
    public String getP3288_ICD10_NAME1(){
        return P3288_ICD10_NAME1;
    } 
    public void setP3288_ICD10_NAME1(String P3288_ICD10_NAME1) {
         this.P3288_ICD10_NAME1 = P3288_ICD10_NAME1;
    } 
    public String getP3288_ICD10_ID2(){
        return P3288_ICD10_ID2;
    } 
    public void setP3288_ICD10_ID2(String P3288_ICD10_ID2) {
         this.P3288_ICD10_ID2 = P3288_ICD10_ID2;
    } 
    public String getP3288_ICD10_NAME2(){
        return P3288_ICD10_NAME2;
    } 
    public void setP3288_ICD10_NAME2(String P3288_ICD10_NAME2) {
         this.P3288_ICD10_NAME2 = P3288_ICD10_NAME2;
    } 
    public String getP3288_ICD10_ID3(){
        return P3288_ICD10_ID3;
    } 
    public void setP3288_ICD10_ID3(String P3288_ICD10_ID3) {
         this.P3288_ICD10_ID3 = P3288_ICD10_ID3;
    } 
    public String getP3288_ICD10_NAME3(){
        return P3288_ICD10_NAME3;
    } 
    public void setP3288_ICD10_NAME3(String P3288_ICD10_NAME3) {
         this.P3288_ICD10_NAME3 = P3288_ICD10_NAME3;
    } 
    public String getP3288_ICD10_ID4(){
        return P3288_ICD10_ID4;
    } 
    public void setP3288_ICD10_ID4(String P3288_ICD10_ID4) {
         this.P3288_ICD10_ID4 = P3288_ICD10_ID4;
    } 
    public String getP3288_ICD10_NAME4(){
        return P3288_ICD10_NAME4;
    } 
    public void setP3288_ICD10_NAME4(String P3288_ICD10_NAME4) {
         this.P3288_ICD10_NAME4 = P3288_ICD10_NAME4;
    } 
    public String getP3288_ICD10_ID5(){
        return P3288_ICD10_ID5;
    } 
    public void setP3288_ICD10_ID5(String P3288_ICD10_ID5) {
         this.P3288_ICD10_ID5 = P3288_ICD10_ID5;
    } 
    public String getP3288_ICD10_NAME5(){
        return P3288_ICD10_NAME5;
    } 
    public void setP3288_ICD10_NAME5(String P3288_ICD10_NAME5) {
         this.P3288_ICD10_NAME5 = P3288_ICD10_NAME5;
    } 
    public String getP3272_ICD10_ID1(){
        return P3272_ICD10_ID1;
    } 
    public void setP3272_ICD10_ID1(String P3272_ICD10_ID1) {
         this.P3272_ICD10_ID1 = P3272_ICD10_ID1;
    } 
    public String getP3272_ICD10_NAME1(){
        return P3272_ICD10_NAME1;
    } 
    public void setP3272_ICD10_NAME1(String P3272_ICD10_NAME1) {
         this.P3272_ICD10_NAME1 = P3272_ICD10_NAME1;
    } 
    public String getP3272_ICD10_ID2(){
        return P3272_ICD10_ID2;
    } 
    public void setP3272_ICD10_ID2(String P3272_ICD10_ID2) {
         this.P3272_ICD10_ID2 = P3272_ICD10_ID2;
    } 
    public String getP3272_ICD10_NAME2(){
        return P3272_ICD10_NAME2;
    } 
    public void setP3272_ICD10_NAME2(String P3272_ICD10_NAME2) {
         this.P3272_ICD10_NAME2 = P3272_ICD10_NAME2;
    } 
    public String getP3272_ICD10_ID3(){
        return P3272_ICD10_ID3;
    } 
    public void setP3272_ICD10_ID3(String P3272_ICD10_ID3) {
         this.P3272_ICD10_ID3 = P3272_ICD10_ID3;
    } 
    public String getP3272_ICD10_NAME3(){
        return P3272_ICD10_NAME3;
    } 
    public void setP3272_ICD10_NAME3(String P3272_ICD10_NAME3) {
         this.P3272_ICD10_NAME3 = P3272_ICD10_NAME3;
    } 
    public String getP3272_ICD10_ID4(){
        return P3272_ICD10_ID4;
    } 
    public void setP3272_ICD10_ID4(String P3272_ICD10_ID4) {
         this.P3272_ICD10_ID4 = P3272_ICD10_ID4;
    } 
    public String getP3272_ICD10_NAME4(){
        return P3272_ICD10_NAME4;
    } 
    public void setP3272_ICD10_NAME4(String P3272_ICD10_NAME4) {
         this.P3272_ICD10_NAME4 = P3272_ICD10_NAME4;
    } 
    public String getP3272_ICD10_ID5(){
        return P3272_ICD10_ID5;
    } 
    public void setP3272_ICD10_ID5(String P3272_ICD10_ID5) {
         this.P3272_ICD10_ID5 = P3272_ICD10_ID5;
    } 
    public String getP3272_ICD10_NAME5(){
        return P3272_ICD10_NAME5;
    } 
    public void setP3272_ICD10_NAME5(String P3272_ICD10_NAME5) {
         this.P3272_ICD10_NAME5 = P3272_ICD10_NAME5;
    } 
    public String getP3275_ICD10_ID1(){
        return P3275_ICD10_ID1;
    } 
    public void setP3275_ICD10_ID1(String P3275_ICD10_ID1) {
         this.P3275_ICD10_ID1 = P3275_ICD10_ID1;
    } 
    public String getP3275_ICD10_NAME1(){
        return P3275_ICD10_NAME1;
    } 
    public void setP3275_ICD10_NAME1(String P3275_ICD10_NAME1) {
         this.P3275_ICD10_NAME1 = P3275_ICD10_NAME1;
    } 
    public String getP3275_ICD10_ID2(){
        return P3275_ICD10_ID2;
    } 
    public void setP3275_ICD10_ID2(String P3275_ICD10_ID2) {
         this.P3275_ICD10_ID2 = P3275_ICD10_ID2;
    } 
    public String getP3275_ICD10_NAME2(){
        return P3275_ICD10_NAME2;
    } 
    public void setP3275_ICD10_NAME2(String P3275_ICD10_NAME2) {
         this.P3275_ICD10_NAME2 = P3275_ICD10_NAME2;
    } 
    public String getP3275_ICD10_ID3(){
        return P3275_ICD10_ID3;
    } 
    public void setP3275_ICD10_ID3(String P3275_ICD10_ID3) {
         this.P3275_ICD10_ID3 = P3275_ICD10_ID3;
    } 
    public String getP3275_ICD10_NAME3(){
        return P3275_ICD10_NAME3;
    } 
    public void setP3275_ICD10_NAME3(String P3275_ICD10_NAME3) {
         this.P3275_ICD10_NAME3 = P3275_ICD10_NAME3;
    } 
    public String getP3275_ICD10_ID4(){
        return P3275_ICD10_ID4;
    } 
    public void setP3275_ICD10_ID4(String P3275_ICD10_ID4) {
         this.P3275_ICD10_ID4 = P3275_ICD10_ID4;
    } 
    public String getP3275_ICD10_NAME4(){
        return P3275_ICD10_NAME4;
    } 
    public void setP3275_ICD10_NAME4(String P3275_ICD10_NAME4) {
         this.P3275_ICD10_NAME4 = P3275_ICD10_NAME4;
    } 
    public String getP3275_ICD10_ID5(){
        return P3275_ICD10_ID5;
    } 
    public void setP3275_ICD10_ID5(String P3275_ICD10_ID5) {
         this.P3275_ICD10_ID5 = P3275_ICD10_ID5;
    } 
    public String getP3275_ICD10_NAME5(){
        return P3275_ICD10_NAME5;
    } 
    public void setP3275_ICD10_NAME5(String P3275_ICD10_NAME5) {
         this.P3275_ICD10_NAME5 = P3275_ICD10_NAME5;
    } 
    public String getP281_ICD10_ID1(){
        return P281_ICD10_ID1;
    } 
    public void setP281_ICD10_ID1(String P281_ICD10_ID1) {
         this.P281_ICD10_ID1 = P281_ICD10_ID1;
    } 
    public String getP281_ICD10_NAME1(){
        return P281_ICD10_NAME1;
    } 
    public void setP281_ICD10_NAME1(String P281_ICD10_NAME1) {
         this.P281_ICD10_NAME1 = P281_ICD10_NAME1;
    } 
    public String getP281_ICD10_ID2(){
        return P281_ICD10_ID2;
    } 
    public void setP281_ICD10_ID2(String P281_ICD10_ID2) {
         this.P281_ICD10_ID2 = P281_ICD10_ID2;
    } 
    public String getP281_ICD10_NAME2(){
        return P281_ICD10_NAME2;
    } 
    public void setP281_ICD10_NAME2(String P281_ICD10_NAME2) {
         this.P281_ICD10_NAME2 = P281_ICD10_NAME2;
    } 
    public String getP281_ICD10_ID3(){
        return P281_ICD10_ID3;
    } 
    public void setP281_ICD10_ID3(String P281_ICD10_ID3) {
         this.P281_ICD10_ID3 = P281_ICD10_ID3;
    } 
    public String getP281_ICD10_NAME3(){
        return P281_ICD10_NAME3;
    } 
    public void setP281_ICD10_NAME3(String P281_ICD10_NAME3) {
         this.P281_ICD10_NAME3 = P281_ICD10_NAME3;
    } 
    public String getP281_ICD10_ID4(){
        return P281_ICD10_ID4;
    } 
    public void setP281_ICD10_ID4(String P281_ICD10_ID4) {
         this.P281_ICD10_ID4 = P281_ICD10_ID4;
    } 
    public String getP281_ICD10_NAME4(){
        return P281_ICD10_NAME4;
    } 
    public void setP281_ICD10_NAME4(String P281_ICD10_NAME4) {
         this.P281_ICD10_NAME4 = P281_ICD10_NAME4;
    } 
    public String getP281_ICD10_ID5(){
        return P281_ICD10_ID5;
    } 
    public void setP281_ICD10_ID5(String P281_ICD10_ID5) {
         this.P281_ICD10_ID5 = P281_ICD10_ID5;
    } 
    public String getP281_ICD10_NAME5(){
        return P281_ICD10_NAME5;
    } 
    public void setP281_ICD10_NAME5(String P281_ICD10_NAME5) {
         this.P281_ICD10_NAME5 = P281_ICD10_NAME5;
    } 
    public String getP301_ICD10_ID1(){
        return P301_ICD10_ID1;
    } 
    public void setP301_ICD10_ID1(String P301_ICD10_ID1) {
         this.P301_ICD10_ID1 = P301_ICD10_ID1;
    } 
    public String getP301_ICD10_NAME1(){
        return P301_ICD10_NAME1;
    } 
    public void setP301_ICD10_NAME1(String P301_ICD10_NAME1) {
         this.P301_ICD10_NAME1 = P301_ICD10_NAME1;
    } 
    public String getP301_ICD10_ID2(){
        return P301_ICD10_ID2;
    } 
    public void setP301_ICD10_ID2(String P301_ICD10_ID2) {
         this.P301_ICD10_ID2 = P301_ICD10_ID2;
    } 
    public String getP301_ICD10_NAME2(){
        return P301_ICD10_NAME2;
    } 
    public void setP301_ICD10_NAME2(String P301_ICD10_NAME2) {
         this.P301_ICD10_NAME2 = P301_ICD10_NAME2;
    } 
    public String getP301_ICD10_ID3(){
        return P301_ICD10_ID3;
    } 
    public void setP301_ICD10_ID3(String P301_ICD10_ID3) {
         this.P301_ICD10_ID3 = P301_ICD10_ID3;
    } 
    public String getP301_ICD10_NAME3(){
        return P301_ICD10_NAME3;
    } 
    public void setP301_ICD10_NAME3(String P301_ICD10_NAME3) {
         this.P301_ICD10_NAME3 = P301_ICD10_NAME3;
    } 
    public String getP301_ICD10_ID4(){
        return P301_ICD10_ID4;
    } 
    public void setP301_ICD10_ID4(String P301_ICD10_ID4) {
         this.P301_ICD10_ID4 = P301_ICD10_ID4;
    } 
    public String getP301_ICD10_NAME4(){
        return P301_ICD10_NAME4;
    } 
    public void setP301_ICD10_NAME4(String P301_ICD10_NAME4) {
         this.P301_ICD10_NAME4 = P301_ICD10_NAME4;
    } 
    public String getP301_ICD10_ID5(){
        return P301_ICD10_ID5;
    } 
    public void setP301_ICD10_ID5(String P301_ICD10_ID5) {
         this.P301_ICD10_ID5 = P301_ICD10_ID5;
    } 
    public String getP301_ICD10_NAME5(){
        return P301_ICD10_NAME5;
    } 
    public void setP301_ICD10_NAME5(String P301_ICD10_NAME5) {
         this.P301_ICD10_NAME5 = P301_ICD10_NAME5;
    } 
    public String getP352_ICD10_ID1(){
        return P352_ICD10_ID1;
    } 
    public void setP352_ICD10_ID1(String P352_ICD10_ID1) {
         this.P352_ICD10_ID1 = P352_ICD10_ID1;
    } 
    public String getP352_ICD10_NAME1(){
        return P352_ICD10_NAME1;
    } 
    public void setP352_ICD10_NAME1(String P352_ICD10_NAME1) {
         this.P352_ICD10_NAME1 = P352_ICD10_NAME1;
    } 
    public String getP352_ICD10_ID2(){
        return P352_ICD10_ID2;
    } 
    public void setP352_ICD10_ID2(String P352_ICD10_ID2) {
         this.P352_ICD10_ID2 = P352_ICD10_ID2;
    } 
    public String getP352_ICD10_NAME2(){
        return P352_ICD10_NAME2;
    } 
    public void setP352_ICD10_NAME2(String P352_ICD10_NAME2) {
         this.P352_ICD10_NAME2 = P352_ICD10_NAME2;
    } 
    public String getP352_ICD10_ID3(){
        return P352_ICD10_ID3;
    } 
    public void setP352_ICD10_ID3(String P352_ICD10_ID3) {
         this.P352_ICD10_ID3 = P352_ICD10_ID3;
    } 
    public String getP352_ICD10_NAME3(){
        return P352_ICD10_NAME3;
    } 
    public void setP352_ICD10_NAME3(String P352_ICD10_NAME3) {
         this.P352_ICD10_NAME3 = P352_ICD10_NAME3;
    } 
    public String getP352_ICD10_ID4(){
        return P352_ICD10_ID4;
    } 
    public void setP352_ICD10_ID4(String P352_ICD10_ID4) {
         this.P352_ICD10_ID4 = P352_ICD10_ID4;
    } 
    public String getP352_ICD10_NAME4(){
        return P352_ICD10_NAME4;
    } 
    public void setP352_ICD10_NAME4(String P352_ICD10_NAME4) {
         this.P352_ICD10_NAME4 = P352_ICD10_NAME4;
    } 
    public String getP352_ICD10_ID5(){
        return P352_ICD10_ID5;
    } 
    public void setP352_ICD10_ID5(String P352_ICD10_ID5) {
         this.P352_ICD10_ID5 = P352_ICD10_ID5;
    } 
    public String getP352_ICD10_NAME5(){
        return P352_ICD10_NAME5;
    } 
    public void setP352_ICD10_NAME5(String P352_ICD10_NAME5) {
         this.P352_ICD10_NAME5 = P352_ICD10_NAME5;
    } 
    public String getP354_ICD10_ID1(){
        return P354_ICD10_ID1;
    } 
    public void setP354_ICD10_ID1(String P354_ICD10_ID1) {
         this.P354_ICD10_ID1 = P354_ICD10_ID1;
    } 
    public String getP354_ICD10_NAME1(){
        return P354_ICD10_NAME1;
    } 
    public void setP354_ICD10_NAME1(String P354_ICD10_NAME1) {
         this.P354_ICD10_NAME1 = P354_ICD10_NAME1;
    } 
    public String getP354_ICD10_ID2(){
        return P354_ICD10_ID2;
    } 
    public void setP354_ICD10_ID2(String P354_ICD10_ID2) {
         this.P354_ICD10_ID2 = P354_ICD10_ID2;
    } 
    public String getP354_ICD10_NAME2(){
        return P354_ICD10_NAME2;
    } 
    public void setP354_ICD10_NAME2(String P354_ICD10_NAME2) {
         this.P354_ICD10_NAME2 = P354_ICD10_NAME2;
    } 
    public String getP354_ICD10_ID3(){
        return P354_ICD10_ID3;
    } 
    public void setP354_ICD10_ID3(String P354_ICD10_ID3) {
         this.P354_ICD10_ID3 = P354_ICD10_ID3;
    } 
    public String getP354_ICD10_NAME3(){
        return P354_ICD10_NAME3;
    } 
    public void setP354_ICD10_NAME3(String P354_ICD10_NAME3) {
         this.P354_ICD10_NAME3 = P354_ICD10_NAME3;
    } 
    public String getP354_ICD10_ID4(){
        return P354_ICD10_ID4;
    } 
    public void setP354_ICD10_ID4(String P354_ICD10_ID4) {
         this.P354_ICD10_ID4 = P354_ICD10_ID4;
    } 
    public String getP354_ICD10_NAME4(){
        return P354_ICD10_NAME4;
    } 
    public void setP354_ICD10_NAME4(String P354_ICD10_NAME4) {
         this.P354_ICD10_NAME4 = P354_ICD10_NAME4;
    } 
    public String getP354_ICD10_ID5(){
        return P354_ICD10_ID5;
    } 
    public void setP354_ICD10_ID5(String P354_ICD10_ID5) {
         this.P354_ICD10_ID5 = P354_ICD10_ID5;
    } 
    public String getP354_ICD10_NAME5(){
        return P354_ICD10_NAME5;
    } 
    public void setP354_ICD10_NAME5(String P354_ICD10_NAME5) {
         this.P354_ICD10_NAME5 = P354_ICD10_NAME5;
    } 
    public String getP356_ICD10_ID1(){
        return P356_ICD10_ID1;
    } 
    public void setP356_ICD10_ID1(String P356_ICD10_ID1) {
         this.P356_ICD10_ID1 = P356_ICD10_ID1;
    } 
    public String getP356_ICD10_NAME1(){
        return P356_ICD10_NAME1;
    } 
    public void setP356_ICD10_NAME1(String P356_ICD10_NAME1) {
         this.P356_ICD10_NAME1 = P356_ICD10_NAME1;
    } 
    public String getP356_ICD10_ID2(){
        return P356_ICD10_ID2;
    } 
    public void setP356_ICD10_ID2(String P356_ICD10_ID2) {
         this.P356_ICD10_ID2 = P356_ICD10_ID2;
    } 
    public String getP356_ICD10_NAME2(){
        return P356_ICD10_NAME2;
    } 
    public void setP356_ICD10_NAME2(String P356_ICD10_NAME2) {
         this.P356_ICD10_NAME2 = P356_ICD10_NAME2;
    } 
    public String getP356_ICD10_ID3(){
        return P356_ICD10_ID3;
    } 
    public void setP356_ICD10_ID3(String P356_ICD10_ID3) {
         this.P356_ICD10_ID3 = P356_ICD10_ID3;
    } 
    public String getP356_ICD10_NAME3(){
        return P356_ICD10_NAME3;
    } 
    public void setP356_ICD10_NAME3(String P356_ICD10_NAME3) {
         this.P356_ICD10_NAME3 = P356_ICD10_NAME3;
    } 
    public String getP356_ICD10_ID4(){
        return P356_ICD10_ID4;
    } 
    public void setP356_ICD10_ID4(String P356_ICD10_ID4) {
         this.P356_ICD10_ID4 = P356_ICD10_ID4;
    } 
    public String getP356_ICD10_NAME4(){
        return P356_ICD10_NAME4;
    } 
    public void setP356_ICD10_NAME4(String P356_ICD10_NAME4) {
         this.P356_ICD10_NAME4 = P356_ICD10_NAME4;
    } 
    public String getP356_ICD10_ID5(){
        return P356_ICD10_ID5;
    } 
    public void setP356_ICD10_ID5(String P356_ICD10_ID5) {
         this.P356_ICD10_ID5 = P356_ICD10_ID5;
    } 
    public String getP356_ICD10_NAME5(){
        return P356_ICD10_NAME5;
    } 
    public void setP356_ICD10_NAME5(String P356_ICD10_NAME5) {
         this.P356_ICD10_NAME5 = P356_ICD10_NAME5;
    } 
}