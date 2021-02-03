package com.clinical.model.cluster;
import java.util.Date;
public class Dna{
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
    //住院门诊号
    private String visitId;
    //行DNA甲基化检测
    private String dnaMethylation;
    //检测样本名称
    private String testName;
    //送检日期
    private Date inspectionDate;
    //报告日期
    private Date reportDate;
    //检测机构名称
    private String orgName;
    //检测方法
    private String testMethod;
    //检测基因名称
    private String geneName;
    //甲基化百分比
    private Double percent;
    //存在异常甲基化
    private String abnormal;
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
    public String getVisitId(){
        return visitId;
    } 
    public void setVisitId(String visitId) {
         this.visitId = visitId;
    } 
    public String getDnaMethylation(){
        return dnaMethylation;
    } 
    public void setDnaMethylation(String dnaMethylation) {
         this.dnaMethylation = dnaMethylation;
    } 
    public String getTestName(){
        return testName;
    } 
    public void setTestName(String testName) {
         this.testName = testName;
    } 
    public Date getInspectionDate(){
        return inspectionDate;
    } 
    public void setInspectionDate(Date inspectionDate) {
         this.inspectionDate = inspectionDate;
    } 
    public Date getReportDate(){
        return reportDate;
    } 
    public void setReportDate(Date reportDate) {
         this.reportDate = reportDate;
    } 
    public String getOrgName(){
        return orgName;
    } 
    public void setOrgName(String orgName) {
         this.orgName = orgName;
    } 
    public String getTestMethod(){
        return testMethod;
    } 
    public void setTestMethod(String testMethod) {
         this.testMethod = testMethod;
    } 
    public String getGeneName(){
        return geneName;
    } 
    public void setGeneName(String geneName) {
         this.geneName = geneName;
    } 
    public Double getPercent(){
        return percent;
    } 
    public void setPercent(Double percent) {
         this.percent = percent;
    } 
    public String getAbnormal(){
        return abnormal;
    } 
    public void setAbnormal(String abnormal) {
         this.abnormal = abnormal;
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