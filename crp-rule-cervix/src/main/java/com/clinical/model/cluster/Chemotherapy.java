package com.clinical.model.cluster;
import java.util.Date;
public class Chemotherapy{
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
    //化疗的unque_id
    private String uniqueIdLv3;
    //活动记录状态
    private String recordStatus;
    //化疗开始时间
    private Date chemBeginTime;
    //化疗结束时间
    private Date chemEndTime;
    //化疗周期计数
    private String chemPeriod;
    //化疗方案
    private String chemPeriodTotal;
    //化疗药物及剂量
    private String chemDrugAndDose;
    //化疗目的
    private String purpose;
    //疗效评估
    private String efficacyEvaluation;
    //副反应
    private String sideEffect;
    //责任医生
    private String chemoDoctor;
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
    public String getRecordStatus(){
        return recordStatus;
    } 
    public void setRecordStatus(String recordStatus) {
         this.recordStatus = recordStatus;
    } 
    public Date getChemBeginTime(){
        return chemBeginTime;
    } 
    public void setChemBeginTime(Date chemBeginTime) {
         this.chemBeginTime = chemBeginTime;
    } 
    public Date getChemEndTime(){
        return chemEndTime;
    } 
    public void setChemEndTime(Date chemEndTime) {
         this.chemEndTime = chemEndTime;
    } 
    public String getChemPeriod(){
        return chemPeriod;
    } 
    public void setChemPeriod(String chemPeriod) {
         this.chemPeriod = chemPeriod;
    } 
    public String getChemPeriodTotal(){
        return chemPeriodTotal;
    } 
    public void setChemPeriodTotal(String chemPeriodTotal) {
         this.chemPeriodTotal = chemPeriodTotal;
    } 
    public String getChemDrugAndDose(){
        return chemDrugAndDose;
    } 
    public void setChemDrugAndDose(String chemDrugAndDose) {
         this.chemDrugAndDose = chemDrugAndDose;
    } 
    public String getPurpose(){
        return purpose;
    } 
    public void setPurpose(String purpose) {
         this.purpose = purpose;
    } 
    public String getEfficacyEvaluation(){
        return efficacyEvaluation;
    } 
    public void setEfficacyEvaluation(String efficacyEvaluation) {
         this.efficacyEvaluation = efficacyEvaluation;
    } 
    public String getSideEffect(){
        return sideEffect;
    } 
    public void setSideEffect(String sideEffect) {
         this.sideEffect = sideEffect;
    } 
    public String getChemoDoctor(){
        return chemoDoctor;
    } 
    public void setChemoDoctor(String chemoDoctor) {
         this.chemoDoctor = chemoDoctor;
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