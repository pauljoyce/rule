package com.clinical.model.cluster;
import java.util.Date;
public class Inspection{
    //主键id
    private Integer id;
    //标识患者身份唯一标识
    private String personId;
    //唯一标识
    private String uniqueId;
    //医疗机构代码
    private String p900;
    //患者id
    private String patientId;
    //就诊类型
    private String visitType;
    //门诊/住院号
    private String visitId;
    //住院次数
    private Integer admissionNumber;
    //检验系统编号
    private String testNo;
    //标本类型
    private String spcmType;
    //标本采样时间
    private Date spcmSampleDateTime;
    //标本接收时间
    private Date spcmReceivedDateTime;
    //申请时间
    private Date requestedDateTime;
    //报告时间
    private Date resultRptDateTime;
    //检查时间
    private Date resultDateTime;
    //打印序号
    private String printOrder;
    //检验套餐名称
    private String testPackageName;
    //检验项目名称
    private String testItemName;
    //检验结果值
    private String result;
    //检验结果单位
    private String units;
    //异常标识
    private String abnormalIndicator;
    //参考区间
    private String referenceInterval;
    //数据版本
    private String dataVersion;
    //数据库来源
    private String dataDbSource;
    //数据表来源
    private String dataTableSource;
    //数据项来源
    private String dataFieldSource;
    //创建时间
    private Date createdAt;
    //创建人
    private String creator;
    //修改时间
    private Date updatedAt;

    public Integer getId(){
        return id;
    } 
    public void setId(Integer id) {
         this.id = id;
    } 
    public String getPersonId(){
        return personId;
    } 
    public void setPersonId(String personId) {
         this.personId = personId;
    } 
    public String getUniqueId(){
        return uniqueId;
    } 
    public void setUniqueId(String uniqueId) {
         this.uniqueId = uniqueId;
    } 
    public String getP900(){
        return p900;
    } 
    public void setP900(String p900) {
         this.p900 = p900;
    } 
    public String getPatientId(){
        return patientId;
    } 
    public void setPatientId(String patientId) {
         this.patientId = patientId;
    } 
    public String getVisitType(){
        return visitType;
    } 
    public void setVisitType(String visitType) {
         this.visitType = visitType;
    } 
    public String getVisitId(){
        return visitId;
    } 
    public void setVisitId(String visitId) {
         this.visitId = visitId;
    } 
    public Integer getAdmissionNumber(){
        return admissionNumber;
    } 
    public void setAdmissionNumber(Integer admissionNumber) {
         this.admissionNumber = admissionNumber;
    } 
    public String getTestNo(){
        return testNo;
    } 
    public void setTestNo(String testNo) {
         this.testNo = testNo;
    } 
    public String getSpcmType(){
        return spcmType;
    } 
    public void setSpcmType(String spcmType) {
         this.spcmType = spcmType;
    } 
    public Date getSpcmSampleDateTime(){
        return spcmSampleDateTime;
    } 
    public void setSpcmSampleDateTime(Date spcmSampleDateTime) {
         this.spcmSampleDateTime = spcmSampleDateTime;
    } 
    public Date getSpcmReceivedDateTime(){
        return spcmReceivedDateTime;
    } 
    public void setSpcmReceivedDateTime(Date spcmReceivedDateTime) {
         this.spcmReceivedDateTime = spcmReceivedDateTime;
    } 
    public Date getRequestedDateTime(){
        return requestedDateTime;
    } 
    public void setRequestedDateTime(Date requestedDateTime) {
         this.requestedDateTime = requestedDateTime;
    } 
    public Date getResultRptDateTime(){
        return resultRptDateTime;
    } 
    public void setResultRptDateTime(Date resultRptDateTime) {
         this.resultRptDateTime = resultRptDateTime;
    } 
    public Date getResultDateTime(){
        return resultDateTime;
    } 
    public void setResultDateTime(Date resultDateTime) {
         this.resultDateTime = resultDateTime;
    } 
    public String getPrintOrder(){
        return printOrder;
    } 
    public void setPrintOrder(String printOrder) {
         this.printOrder = printOrder;
    } 
    public String getTestPackageName(){
        return testPackageName;
    } 
    public void setTestPackageName(String testPackageName) {
         this.testPackageName = testPackageName;
    } 
    public String getTestItemName(){
        return testItemName;
    } 
    public void setTestItemName(String testItemName) {
         this.testItemName = testItemName;
    } 
    public String getResult(){
        return result;
    } 
    public void setResult(String result) {
         this.result = result;
    } 
    public String getUnits(){
        return units;
    } 
    public void setUnits(String units) {
         this.units = units;
    } 
    public String getAbnormalIndicator(){
        return abnormalIndicator;
    } 
    public void setAbnormalIndicator(String abnormalIndicator) {
         this.abnormalIndicator = abnormalIndicator;
    } 
    public String getReferenceInterval(){
        return referenceInterval;
    } 
    public void setReferenceInterval(String referenceInterval) {
         this.referenceInterval = referenceInterval;
    } 
    public String getDataVersion(){
        return dataVersion;
    } 
    public void setDataVersion(String dataVersion) {
         this.dataVersion = dataVersion;
    } 
    public String getDataDbSource(){
        return dataDbSource;
    } 
    public void setDataDbSource(String dataDbSource) {
         this.dataDbSource = dataDbSource;
    } 
    public String getDataTableSource(){
        return dataTableSource;
    } 
    public void setDataTableSource(String dataTableSource) {
         this.dataTableSource = dataTableSource;
    } 
    public String getDataFieldSource(){
        return dataFieldSource;
    } 
    public void setDataFieldSource(String dataFieldSource) {
         this.dataFieldSource = dataFieldSource;
    } 
    public Date getCreatedAt(){
        return createdAt;
    } 
    public void setCreatedAt(Date createdAt) {
         this.createdAt = createdAt;
    } 
    public String getCreator(){
        return creator;
    } 
    public void setCreator(String creator) {
         this.creator = creator;
    } 
    public Date getUpdatedAt(){
        return updatedAt;
    } 
    public void setUpdatedAt(Date updatedAt) {
         this.updatedAt = updatedAt;
    } 
}