package com.clinical.model.cluster;
import java.util.Date;
public class Pathological{
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
    //住院号
    private String visitId;
    //病理unique_id
    private String uniqueIdLv3;
    //病理号
    private String caseNumber;
    //收到日期
    private Date inspectTime;
    //报告日期
    private Date reprotTime;
    //送检标本名称
    private String specimenName;
    //Lauren 分型
    private String lauren;
    //病理类型
    private String pathologicalType;
    //分化程度
    private String differentiationDegree;
    //浸润深度
    private String infiltrationDepth;
    //血管侵犯
    private String vascularInvasion;
    //淋巴管侵犯
    private String lymphaticInvasion;
    //神经侵犯
    private String nerveInvasion;
    //侵犯邻近脏器或组织名称
    private String invasionOfOrgans;
    //切缘
    private String incisalMargin;
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
    public String getUniqueIdLv3(){
        return uniqueIdLv3;
    } 
    public void setUniqueIdLv3(String uniqueIdLv3) {
         this.uniqueIdLv3 = uniqueIdLv3;
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
    public String getLauren(){
        return lauren;
    } 
    public void setLauren(String lauren) {
         this.lauren = lauren;
    } 
    public String getPathologicalType(){
        return pathologicalType;
    } 
    public void setPathologicalType(String pathologicalType) {
         this.pathologicalType = pathologicalType;
    } 
    public String getDifferentiationDegree(){
        return differentiationDegree;
    } 
    public void setDifferentiationDegree(String differentiationDegree) {
         this.differentiationDegree = differentiationDegree;
    } 
    public String getInfiltrationDepth(){
        return infiltrationDepth;
    } 
    public void setInfiltrationDepth(String infiltrationDepth) {
         this.infiltrationDepth = infiltrationDepth;
    } 
    public String getVascularInvasion(){
        return vascularInvasion;
    } 
    public void setVascularInvasion(String vascularInvasion) {
         this.vascularInvasion = vascularInvasion;
    } 
    public String getLymphaticInvasion(){
        return lymphaticInvasion;
    } 
    public void setLymphaticInvasion(String lymphaticInvasion) {
         this.lymphaticInvasion = lymphaticInvasion;
    } 
    public String getNerveInvasion(){
        return nerveInvasion;
    } 
    public void setNerveInvasion(String nerveInvasion) {
         this.nerveInvasion = nerveInvasion;
    } 
    public String getInvasionOfOrgans(){
        return invasionOfOrgans;
    } 
    public void setInvasionOfOrgans(String invasionOfOrgans) {
         this.invasionOfOrgans = invasionOfOrgans;
    } 
    public String getIncisalMargin(){
        return incisalMargin;
    } 
    public void setIncisalMargin(String incisalMargin) {
         this.incisalMargin = incisalMargin;
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