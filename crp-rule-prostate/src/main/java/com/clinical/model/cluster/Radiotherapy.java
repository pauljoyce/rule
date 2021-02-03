package com.clinical.model.cluster;
import java.util.Date;
public class Radiotherapy{
    //主键id
    private Integer id;
    //标识患者身份唯一标识
    private String personId;
    //唯一标识
    private String uniqueId;
    //子表关联键
    private String uniqueIdLv3;
    //医疗机构代码
    private String p900;
    //患者id
    private String patientId;
    //住院号
    private String visitId;
    //放疗开始日期
    private Date radioBeginTime;
    //放疗结束日期
    private Date radioEndTime;
    //放射源
    private String radioSource;
    //放疗模式
    private String radioStyle;
    //放疗射线能量
    private String radioRayEnergy;
    //放疗部位及剂量
    private String radioSiteAndDose;
    //放疗副反应与分级
    private String radioLevel;
    //责任医生
    private String radioDoctor;
    //疗效评估
    private String efficacyEvaluation;
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
    public Date getRadioBeginTime(){
        return radioBeginTime;
    } 
    public void setRadioBeginTime(Date radioBeginTime) {
         this.radioBeginTime = radioBeginTime;
    } 
    public Date getRadioEndTime(){
        return radioEndTime;
    } 
    public void setRadioEndTime(Date radioEndTime) {
         this.radioEndTime = radioEndTime;
    } 
    public String getRadioSource(){
        return radioSource;
    } 
    public void setRadioSource(String radioSource) {
         this.radioSource = radioSource;
    } 
    public String getRadioStyle(){
        return radioStyle;
    } 
    public void setRadioStyle(String radioStyle) {
         this.radioStyle = radioStyle;
    } 
    public String getRadioRayEnergy(){
        return radioRayEnergy;
    } 
    public void setRadioRayEnergy(String radioRayEnergy) {
         this.radioRayEnergy = radioRayEnergy;
    } 
    public String getRadioSiteAndDose(){
        return radioSiteAndDose;
    } 
    public void setRadioSiteAndDose(String radioSiteAndDose) {
         this.radioSiteAndDose = radioSiteAndDose;
    } 
    public String getRadioLevel(){
        return radioLevel;
    } 
    public void setRadioLevel(String radioLevel) {
         this.radioLevel = radioLevel;
    } 
    public String getRadioDoctor(){
        return radioDoctor;
    } 
    public void setRadioDoctor(String radioDoctor) {
         this.radioDoctor = radioDoctor;
    } 
    public String getEfficacyEvaluation(){
        return efficacyEvaluation;
    } 
    public void setEfficacyEvaluation(String efficacyEvaluation) {
         this.efficacyEvaluation = efficacyEvaluation;
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