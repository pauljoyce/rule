package com.clinical.model.cluster;
import java.util.Date;
public class FollowUp{
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
    //随访方式
    private String followUpType;
    //随访日期
    private Date followUpDate;
    //疾病状态
    private String followUpState;
    //生存情况
    private String situation;
    //药物治疗
    private String ifMedicine;
    //药物名称
    private String medicineName;
    //用药剂量
    private String medicineDose;
    //用药持续时间
    private String medicineDuration;
    //死亡原因
    private String deathCause ;
    //死亡日期
    private Date deathDate;
    //末次随访日期
    private Date lastDate;
    //随访检查项目
    private String followItem;
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
    public String getFollowUpType(){
        return followUpType;
    } 
    public void setFollowUpType(String followUpType) {
         this.followUpType = followUpType;
    } 
    public Date getFollowUpDate(){
        return followUpDate;
    } 
    public void setFollowUpDate(Date followUpDate) {
         this.followUpDate = followUpDate;
    } 
    public String getFollowUpState(){
        return followUpState;
    } 
    public void setFollowUpState(String followUpState) {
         this.followUpState = followUpState;
    } 
    public String getSituation(){
        return situation;
    } 
    public void setSituation(String situation) {
         this.situation = situation;
    } 
    public String getIfMedicine(){
        return ifMedicine;
    } 
    public void setIfMedicine(String ifMedicine) {
         this.ifMedicine = ifMedicine;
    } 
    public String getMedicineName(){
        return medicineName;
    } 
    public void setMedicineName(String medicineName) {
         this.medicineName = medicineName;
    } 
    public String getMedicineDose(){
        return medicineDose;
    } 
    public void setMedicineDose(String medicineDose) {
         this.medicineDose = medicineDose;
    } 
    public String getMedicineDuration(){
        return medicineDuration;
    } 
    public void setMedicineDuration(String medicineDuration) {
         this.medicineDuration = medicineDuration;
    } 
    public String getDeathCause (){
        return deathCause ;
    } 
    public void setDeathCause (String deathCause ) {
         this.deathCause  = deathCause ;
    } 
    public Date getDeathDate(){
        return deathDate;
    } 
    public void setDeathDate(Date deathDate) {
         this.deathDate = deathDate;
    } 
    public Date getLastDate(){
        return lastDate;
    } 
    public void setLastDate(Date lastDate) {
         this.lastDate = lastDate;
    } 
    public String getFollowItem(){
        return followItem;
    } 
    public void setFollowItem(String followItem) {
         this.followItem = followItem;
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