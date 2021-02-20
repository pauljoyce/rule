package com.clinical.model.cluster;
import java.util.Date;
public class Pathological{
    //主键id
    private Integer id;
    //unique_id
    private String uniqueId;
    //标识患者身份唯一标识
    private String uniqueIdLv1;
    //唯一标识
    private String uniqueIdLv2;
    //医疗机构代码
    private String p900;
    //患者id
    private String patientId;
    //住院号
    private String visitId;
    //病理号
    private String caseNumber;
    //收到日期
    private Date inspectTime;
    //报告日期
    private Date reprotTime;
    //送检标本名称
    private String specimenName;
    //病理类型
    private String pathologicalType;
    //组织分级（G）
    private String organizationClassification;
    //切缘
    private String incisalMargin;
    //肠壁浸润层次
    private String infiltrationLayer;
    //侵犯邻近器官/结构
    private String invasionOfOrgans;
    //是否有脉管侵犯
    private String vascularInvasion;
    //是否侵犯神经
    private String nerveInvasion;
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
    public String getUniqueId(){
        return uniqueId;
    } 
    public void setUniqueId(String uniqueId) {
         this.uniqueId = uniqueId;
    } 
    public String getUniqueIdLv1(){
        return uniqueIdLv1;
    } 
    public void setUniqueIdLv1(String uniqueIdLv1) {
         this.uniqueIdLv1 = uniqueIdLv1;
    } 
    public String getUniqueIdLv2(){
        return uniqueIdLv2;
    } 
    public void setUniqueIdLv2(String uniqueIdLv2) {
         this.uniqueIdLv2 = uniqueIdLv2;
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
    public String getCaseNumber(){
        return caseNumber;
    } 
    public void setCaseNumber(String caseNumber) {
         this.caseNumber = caseNumber;
    } 
    public Date getInspectTime(){
        return inspectTime;
    } 
    public void setInspectTime(Date inspectTime) {
         this.inspectTime = inspectTime;
    } 
    public Date getReprotTime(){
        return reprotTime;
    } 
    public void setReprotTime(Date reprotTime) {
         this.reprotTime = reprotTime;
    } 
    public String getSpecimenName(){
        return specimenName;
    } 
    public void setSpecimenName(String specimenName) {
         this.specimenName = specimenName;
    } 
    public String getPathologicalType(){
        return pathologicalType;
    } 
    public void setPathologicalType(String pathologicalType) {
         this.pathologicalType = pathologicalType;
    } 
    public String getOrganizationClassification(){
        return organizationClassification;
    } 
    public void setOrganizationClassification(String organizationClassification) {
         this.organizationClassification = organizationClassification;
    } 
    public String getIncisalMargin(){
        return incisalMargin;
    } 
    public void setIncisalMargin(String incisalMargin) {
         this.incisalMargin = incisalMargin;
    } 
    public String getInfiltrationLayer(){
        return infiltrationLayer;
    } 
    public void setInfiltrationLayer(String infiltrationLayer) {
         this.infiltrationLayer = infiltrationLayer;
    } 
    public String getInvasionOfOrgans(){
        return invasionOfOrgans;
    } 
    public void setInvasionOfOrgans(String invasionOfOrgans) {
         this.invasionOfOrgans = invasionOfOrgans;
    } 
    public String getVascularInvasion(){
        return vascularInvasion;
    } 
    public void setVascularInvasion(String vascularInvasion) {
         this.vascularInvasion = vascularInvasion;
    } 
    public String getNerveInvasion(){
        return nerveInvasion;
    } 
    public void setNerveInvasion(String nerveInvasion) {
         this.nerveInvasion = nerveInvasion;
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