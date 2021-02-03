package com.clinical.model.master;
import java.util.Date;
public class LAB_MICRO_RESULT{
    //主键id
    private Integer ID;
    //唯一标识
    private String UNIQUE_ID;
    //关联1级表unique_id
    private String UNIQUE_ID_LV1;
    //关联2级表unique_id
    private String UNIQUE_ID_LV2;
    //关联3级表unique_id
    private String UNIQUE_ID_LV3;
    //医疗机构代码
    private String P900;
    //检验系统编号
    private String TEST_NO;
    //标本类型
    private String SPCM_TYPE;
    //项目序号
    private String ITEM_NO;
    //打印序号
    private String PRINT_ORDER;
    //检验套餐名称
    private String TEST_PACKAGE_NAME;
    //检验项目名称
    private String TEST_ITEM_NAME;
    //细菌培养结果
    private String MICRO_RESULT_NAME;
    //微生物培养结果值
    private String MICRO_RESULT;
    //药敏试验用药
    private String MICRO_MED;
    //药敏试验结果值（定量）
    private String RESULT1;
    //药敏试验结果值（定性）
    private String RESULT2;
    //备注
    private String REMARK;
    //仪器编号
    private String INSTRUMENT_ID;
    //检查时间
    private Date RESULT_DATE_TIME;
    //参考区间
    private String REFERENCE_INTERVAL;
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
    //标准化标本类型
    private String SPCM_TYPE_STD;
    //标准化检验套餐名称
    private String TEST_PACKAGE_NAME_STD;
    //标准化细菌培养结果1
    private String MICRO_RESULT_NAME1_STD;
    //标准化细菌培养结果2
    private String MICRO_RESULT_NAME2_STD;
    //标准化药敏试验用药
    private String MICRO_MED_STD;
    //标准化药敏试验结果值（定性）
    private String RESULT2_STD;

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
    public String getUNIQUE_ID_LV3(){
        return UNIQUE_ID_LV3;
    } 
    public void setUNIQUE_ID_LV3(String UNIQUE_ID_LV3) {
         this.UNIQUE_ID_LV3 = UNIQUE_ID_LV3;
    } 
    public String getP900(){
        return P900;
    } 
    public void setP900(String P900) {
         this.P900 = P900;
    } 
    public String getTEST_NO(){
        return TEST_NO;
    } 
    public void setTEST_NO(String TEST_NO) {
         this.TEST_NO = TEST_NO;
    } 
    public String getSPCM_TYPE(){
        return SPCM_TYPE;
    } 
    public void setSPCM_TYPE(String SPCM_TYPE) {
         this.SPCM_TYPE = SPCM_TYPE;
    } 
    public String getITEM_NO(){
        return ITEM_NO;
    } 
    public void setITEM_NO(String ITEM_NO) {
         this.ITEM_NO = ITEM_NO;
    } 
    public String getPRINT_ORDER(){
        return PRINT_ORDER;
    } 
    public void setPRINT_ORDER(String PRINT_ORDER) {
         this.PRINT_ORDER = PRINT_ORDER;
    } 
    public String getTEST_PACKAGE_NAME(){
        return TEST_PACKAGE_NAME;
    } 
    public void setTEST_PACKAGE_NAME(String TEST_PACKAGE_NAME) {
         this.TEST_PACKAGE_NAME = TEST_PACKAGE_NAME;
    } 
    public String getTEST_ITEM_NAME(){
        return TEST_ITEM_NAME;
    } 
    public void setTEST_ITEM_NAME(String TEST_ITEM_NAME) {
         this.TEST_ITEM_NAME = TEST_ITEM_NAME;
    } 
    public String getMICRO_RESULT_NAME(){
        return MICRO_RESULT_NAME;
    } 
    public void setMICRO_RESULT_NAME(String MICRO_RESULT_NAME) {
         this.MICRO_RESULT_NAME = MICRO_RESULT_NAME;
    } 
    public String getMICRO_RESULT(){
        return MICRO_RESULT;
    } 
    public void setMICRO_RESULT(String MICRO_RESULT) {
         this.MICRO_RESULT = MICRO_RESULT;
    } 
    public String getMICRO_MED(){
        return MICRO_MED;
    } 
    public void setMICRO_MED(String MICRO_MED) {
         this.MICRO_MED = MICRO_MED;
    } 
    public String getRESULT1(){
        return RESULT1;
    } 
    public void setRESULT1(String RESULT1) {
         this.RESULT1 = RESULT1;
    } 
    public String getRESULT2(){
        return RESULT2;
    } 
    public void setRESULT2(String RESULT2) {
         this.RESULT2 = RESULT2;
    } 
    public String getREMARK(){
        return REMARK;
    } 
    public void setREMARK(String REMARK) {
         this.REMARK = REMARK;
    } 
    public String getINSTRUMENT_ID(){
        return INSTRUMENT_ID;
    } 
    public void setINSTRUMENT_ID(String INSTRUMENT_ID) {
         this.INSTRUMENT_ID = INSTRUMENT_ID;
    } 
    public Date getRESULT_DATE_TIME(){
        return RESULT_DATE_TIME;
    } 
    public void setRESULT_DATE_TIME(Date RESULT_DATE_TIME) {
         this.RESULT_DATE_TIME = RESULT_DATE_TIME;
    } 
    public String getREFERENCE_INTERVAL(){
        return REFERENCE_INTERVAL;
    } 
    public void setREFERENCE_INTERVAL(String REFERENCE_INTERVAL) {
         this.REFERENCE_INTERVAL = REFERENCE_INTERVAL;
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
    public String getSPCM_TYPE_STD(){
        return SPCM_TYPE_STD;
    } 
    public void setSPCM_TYPE_STD(String SPCM_TYPE_STD) {
         this.SPCM_TYPE_STD = SPCM_TYPE_STD;
    } 
    public String getTEST_PACKAGE_NAME_STD(){
        return TEST_PACKAGE_NAME_STD;
    } 
    public void setTEST_PACKAGE_NAME_STD(String TEST_PACKAGE_NAME_STD) {
         this.TEST_PACKAGE_NAME_STD = TEST_PACKAGE_NAME_STD;
    } 
    public String getMICRO_RESULT_NAME1_STD(){
        return MICRO_RESULT_NAME1_STD;
    } 
    public void setMICRO_RESULT_NAME1_STD(String MICRO_RESULT_NAME1_STD) {
         this.MICRO_RESULT_NAME1_STD = MICRO_RESULT_NAME1_STD;
    } 
    public String getMICRO_RESULT_NAME2_STD(){
        return MICRO_RESULT_NAME2_STD;
    } 
    public void setMICRO_RESULT_NAME2_STD(String MICRO_RESULT_NAME2_STD) {
         this.MICRO_RESULT_NAME2_STD = MICRO_RESULT_NAME2_STD;
    } 
    public String getMICRO_MED_STD(){
        return MICRO_MED_STD;
    } 
    public void setMICRO_MED_STD(String MICRO_MED_STD) {
         this.MICRO_MED_STD = MICRO_MED_STD;
    } 
    public String getRESULT2_STD(){
        return RESULT2_STD;
    } 
    public void setRESULT2_STD(String RESULT2_STD) {
         this.RESULT2_STD = RESULT2_STD;
    } 
}