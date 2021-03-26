package com.clinical.model.master;
import java.util.Date;
public class INP_DIAGNOSIS{
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
    //住院(门诊)号
    private String VISIT_ID;
    //挂号单id
    private String RE_ID;
    //就诊类型
    private Integer VISIT_TYPE;
    //住院(就诊)次数
    private Integer ADMISSION_NUMBER;
    //诊断类别
    private String DIAGNOSIS_TYPE;
    //诊断序号
    private String DIAGNOSIS_NO;
    //诊断描述
    private String DIAGNOSIS_DESC;
    //诊断编码
    private String DIAGNOSIS_CODE;
    //诊断辅助编码
    private String DIAGNOSIS_CODE2;
    //诊断日期
    private Date DIAGNOSIS_DATE;
    //诊断医师
    private String DIAGNOSIS_DOCTOR;
    //记录时间
    private Date RECORD_TIME;
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
    //标准化诊断编码1
    private String ICD10_ID1;
    //标准化诊断名称1
    private String ICD10_NAME1;
    //标准化诊断编码2
    private String ICD10_ID2;
    //标准化诊断名称2
    private String ICD10_NAME2;
    //标准化诊断编码3
    private String ICD10_ID3;
    //标准化诊断名称3
    private String ICD10_NAME3;
    //标准化诊断编码4
    private String ICD10_ID4;
    //标准化诊断名称4
    private String ICD10_NAME4;
    //标准化诊断编码5
    private String ICD10_ID5;
    //标准化诊断名称5
    private String ICD10_NAME5;
    //标准化诊断编码6
    private String ICD10_ID6;
    //标准化诊断名称6
    private String ICD10_NAME6;
    //标准化诊断编码7
    private String ICD10_ID7;
    //标准化诊断名称7
    private String ICD10_NAME7;

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
    public String getVISIT_ID(){
        return VISIT_ID;
    } 
    public void setVISIT_ID(String VISIT_ID) {
             this.VISIT_ID = VISIT_ID;
    } 
    public String getRE_ID(){
        return RE_ID;
    } 
    public void setRE_ID(String RE_ID) {
             this.RE_ID = RE_ID;
    } 
    public Integer getVISIT_TYPE(){
        return VISIT_TYPE;
    } 
    public void setVISIT_TYPE(Integer VISIT_TYPE) {
             this.VISIT_TYPE = VISIT_TYPE;
    } 
    public Integer getADMISSION_NUMBER(){
        return ADMISSION_NUMBER;
    } 
    public void setADMISSION_NUMBER(Integer ADMISSION_NUMBER) {
             this.ADMISSION_NUMBER = ADMISSION_NUMBER;
    } 
    public String getDIAGNOSIS_TYPE(){
        return DIAGNOSIS_TYPE;
    } 
    public void setDIAGNOSIS_TYPE(String DIAGNOSIS_TYPE) {
             this.DIAGNOSIS_TYPE = DIAGNOSIS_TYPE;
    } 
    public String getDIAGNOSIS_NO(){
        return DIAGNOSIS_NO;
    } 
    public void setDIAGNOSIS_NO(String DIAGNOSIS_NO) {
             this.DIAGNOSIS_NO = DIAGNOSIS_NO;
    } 
    public String getDIAGNOSIS_DESC(){
        return DIAGNOSIS_DESC;
    } 
    public void setDIAGNOSIS_DESC(String DIAGNOSIS_DESC) {
             this.DIAGNOSIS_DESC = DIAGNOSIS_DESC;
    } 
    public String getDIAGNOSIS_CODE(){
        return DIAGNOSIS_CODE;
    } 
    public void setDIAGNOSIS_CODE(String DIAGNOSIS_CODE) {
             this.DIAGNOSIS_CODE = DIAGNOSIS_CODE;
    } 
    public String getDIAGNOSIS_CODE2(){
        return DIAGNOSIS_CODE2;
    } 
    public void setDIAGNOSIS_CODE2(String DIAGNOSIS_CODE2) {
             this.DIAGNOSIS_CODE2 = DIAGNOSIS_CODE2;
    } 
    public Date getDIAGNOSIS_DATE(){
        return DIAGNOSIS_DATE;
    } 
    public void setDIAGNOSIS_DATE(Date DIAGNOSIS_DATE) {
             this.DIAGNOSIS_DATE = DIAGNOSIS_DATE;
    } 
    public String getDIAGNOSIS_DOCTOR(){
        return DIAGNOSIS_DOCTOR;
    } 
    public void setDIAGNOSIS_DOCTOR(String DIAGNOSIS_DOCTOR) {
             this.DIAGNOSIS_DOCTOR = DIAGNOSIS_DOCTOR;
    } 
    public Date getRECORD_TIME(){
        return RECORD_TIME;
    } 
    public void setRECORD_TIME(Date RECORD_TIME) {
             this.RECORD_TIME = RECORD_TIME;
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
    public String getICD10_ID1(){
        return ICD10_ID1;
    } 
    public void setICD10_ID1(String ICD10_ID1) {
         if("无效".equals(ICD10_ID1)){
             this.ICD10_ID1 =""; 
         }else{
             this.ICD10_ID1 = ICD10_ID1;
         }
    } 
    public String getICD10_NAME1(){
        return ICD10_NAME1;
    } 
    public void setICD10_NAME1(String ICD10_NAME1) {
         if("无效".equals(ICD10_NAME1)){
             this.ICD10_NAME1 =""; 
         }else{
             this.ICD10_NAME1 = ICD10_NAME1;
         }
    } 
    public String getICD10_ID2(){
        return ICD10_ID2;
    } 
    public void setICD10_ID2(String ICD10_ID2) {
         if("无效".equals(ICD10_ID2)){
             this.ICD10_ID2 =""; 
         }else{
             this.ICD10_ID2 = ICD10_ID2;
         }
    } 
    public String getICD10_NAME2(){
        return ICD10_NAME2;
    } 
    public void setICD10_NAME2(String ICD10_NAME2) {
         if("无效".equals(ICD10_NAME2)){
             this.ICD10_NAME2 =""; 
         }else{
             this.ICD10_NAME2 = ICD10_NAME2;
         }
    } 
    public String getICD10_ID3(){
        return ICD10_ID3;
    } 
    public void setICD10_ID3(String ICD10_ID3) {
         if("无效".equals(ICD10_ID3)){
             this.ICD10_ID3 =""; 
         }else{
             this.ICD10_ID3 = ICD10_ID3;
         }
    } 
    public String getICD10_NAME3(){
        return ICD10_NAME3;
    } 
    public void setICD10_NAME3(String ICD10_NAME3) {
         if("无效".equals(ICD10_NAME3)){
             this.ICD10_NAME3 =""; 
         }else{
             this.ICD10_NAME3 = ICD10_NAME3;
         }
    } 
    public String getICD10_ID4(){
        return ICD10_ID4;
    } 
    public void setICD10_ID4(String ICD10_ID4) {
         if("无效".equals(ICD10_ID4)){
             this.ICD10_ID4 =""; 
         }else{
             this.ICD10_ID4 = ICD10_ID4;
         }
    } 
    public String getICD10_NAME4(){
        return ICD10_NAME4;
    } 
    public void setICD10_NAME4(String ICD10_NAME4) {
         if("无效".equals(ICD10_NAME4)){
             this.ICD10_NAME4 =""; 
         }else{
             this.ICD10_NAME4 = ICD10_NAME4;
         }
    } 
    public String getICD10_ID5(){
        return ICD10_ID5;
    } 
    public void setICD10_ID5(String ICD10_ID5) {
         if("无效".equals(ICD10_ID5)){
             this.ICD10_ID5 =""; 
         }else{
             this.ICD10_ID5 = ICD10_ID5;
         }
    } 
    public String getICD10_NAME5(){
        return ICD10_NAME5;
    } 
    public void setICD10_NAME5(String ICD10_NAME5) {
         if("无效".equals(ICD10_NAME5)){
             this.ICD10_NAME5 =""; 
         }else{
             this.ICD10_NAME5 = ICD10_NAME5;
         }
    } 
    public String getICD10_ID6(){
        return ICD10_ID6;
    } 
    public void setICD10_ID6(String ICD10_ID6) {
         if("无效".equals(ICD10_ID6)){
             this.ICD10_ID6 =""; 
         }else{
             this.ICD10_ID6 = ICD10_ID6;
         }
    } 
    public String getICD10_NAME6(){
        return ICD10_NAME6;
    } 
    public void setICD10_NAME6(String ICD10_NAME6) {
         if("无效".equals(ICD10_NAME6)){
             this.ICD10_NAME6 =""; 
         }else{
             this.ICD10_NAME6 = ICD10_NAME6;
         }
    } 
    public String getICD10_ID7(){
        return ICD10_ID7;
    } 
    public void setICD10_ID7(String ICD10_ID7) {
         if("无效".equals(ICD10_ID7)){
             this.ICD10_ID7 =""; 
         }else{
             this.ICD10_ID7 = ICD10_ID7;
         }
    } 
    public String getICD10_NAME7(){
        return ICD10_NAME7;
    } 
    public void setICD10_NAME7(String ICD10_NAME7) {
         if("无效".equals(ICD10_NAME7)){
             this.ICD10_NAME7 =""; 
         }else{
             this.ICD10_NAME7 = ICD10_NAME7;
         }
    } 
}