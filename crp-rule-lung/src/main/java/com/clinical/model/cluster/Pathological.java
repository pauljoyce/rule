package com.clinical.model.cluster;
import java.util.Date;
public class Pathological{
    //主键id
    private Integer id;
    //标识患者身份唯一标识
    private String personId;
    //唯一标识
    private String uniqueId;
    //中间库unique_id
    private String uniqueIdLv3;
    //医疗机构代码
    private String p900;
    //患者id
    private String patientId;
    //住院号
    private String visitId;
    //病理号
    private String pathologyNo;
    //收到日期
    private Date inspectTime;
    //报告日期
    private Date reprotTime;
    //送检标本名称
    private String specimenName;
    //送检物定位
    private String tumorLocation;
    //原位癌
    private String ifOriginalLocation;
    //病理类型
    private String pathologicalType;
    //分化程度
    private String differentiationDegree;
    //累及主支气管
    private String ifInvolveBronchus;
    //侵犯脏层胸膜
    private String ifInvasionPleura;
    //脉管癌栓
    private String ifArtery;
    //侵犯神经
    private String ifInvasionNerve;
    //手术切缘累及情况
    private String operation;
    //淋巴结分区
    private String lymphNodePartition;
    //分期
    private String stage;
    //分期类型
    private String stageType;
    //分级
    private String grade;
    //分级类型
    private String gradeType;
    //送检淋巴结总数
    private Integer lymphNodeTotal;
    //淋巴结转移数量
    private Integer transferNumber;
    //淋巴结转移
    private String ifTransfer;
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
    public String getUniqueIdLv3(){
        return uniqueIdLv3;
    } 
    public void setUniqueIdLv3(String uniqueIdLv3) {
         this.uniqueIdLv3 = uniqueIdLv3;
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
    public String getPathologyNo(){
        return pathologyNo;
    } 
    public void setPathologyNo(String pathologyNo) {
         this.pathologyNo = pathologyNo;
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
    public String getTumorLocation(){
        return tumorLocation;
    } 
    public void setTumorLocation(String tumorLocation) {
         this.tumorLocation = tumorLocation;
    } 
    public String getIfOriginalLocation(){
        return ifOriginalLocation;
    } 
    public void setIfOriginalLocation(String ifOriginalLocation) {
         this.ifOriginalLocation = ifOriginalLocation;
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
    public String getIfInvolveBronchus(){
        return ifInvolveBronchus;
    } 
    public void setIfInvolveBronchus(String ifInvolveBronchus) {
         this.ifInvolveBronchus = ifInvolveBronchus;
    } 
    public String getIfInvasionPleura(){
        return ifInvasionPleura;
    } 
    public void setIfInvasionPleura(String ifInvasionPleura) {
         this.ifInvasionPleura = ifInvasionPleura;
    } 
    public String getIfArtery(){
        return ifArtery;
    } 
    public void setIfArtery(String ifArtery) {
         this.ifArtery = ifArtery;
    } 
    public String getIfInvasionNerve(){
        return ifInvasionNerve;
    } 
    public void setIfInvasionNerve(String ifInvasionNerve) {
         this.ifInvasionNerve = ifInvasionNerve;
    } 
    public String getOperation(){
        return operation;
    } 
    public void setOperation(String operation) {
         this.operation = operation;
    } 
    public String getLymphNodePartition(){
        return lymphNodePartition;
    } 
    public void setLymphNodePartition(String lymphNodePartition) {
         this.lymphNodePartition = lymphNodePartition;
    } 
    public String getStage(){
        return stage;
    } 
    public void setStage(String stage) {
         this.stage = stage;
    } 
    public String getStageType(){
        return stageType;
    } 
    public void setStageType(String stageType) {
         this.stageType = stageType;
    } 
    public String getGrade(){
        return grade;
    } 
    public void setGrade(String grade) {
         this.grade = grade;
    } 
    public String getGradeType(){
        return gradeType;
    } 
    public void setGradeType(String gradeType) {
         this.gradeType = gradeType;
    } 
    public Integer getLymphNodeTotal(){
        return lymphNodeTotal;
    } 
    public void setLymphNodeTotal(Integer lymphNodeTotal) {
         this.lymphNodeTotal = lymphNodeTotal;
    } 
    public Integer getTransferNumber(){
        return transferNumber;
    } 
    public void setTransferNumber(Integer transferNumber) {
         this.transferNumber = transferNumber;
    } 
    public String getIfTransfer(){
        return ifTransfer;
    } 
    public void setIfTransfer(String ifTransfer) {
         this.ifTransfer = ifTransfer;
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