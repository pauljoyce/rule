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
    private String followMethod;
    //随访日期
    private Date followupTime;
    //疾病状态
    private String tumourSta;
    //生存情况
    private String followupStatus;
    //死亡原因
    private String causeOfDeath;
    //死亡日期
    private Date dateOfDeath;
    //末次随访日期
    private Date lastContactDate;
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
    public String getFollowMethod(){
        return followMethod;
    } 
    public void setFollowMethod(String followMethod) {
         this.followMethod = followMethod;
    } 
    public Date getFollowupTime(){
        return followupTime;
    } 
    public void setFollowupTime(Date followupTime) {
         this.followupTime = followupTime;
    } 
    public String getTumourSta(){
        return tumourSta;
    } 
    public void setTumourSta(String tumourSta) {
         this.tumourSta = tumourSta;
    } 
    public String getFollowupStatus(){
        return followupStatus;
    } 
    public void setFollowupStatus(String followupStatus) {
         this.followupStatus = followupStatus;
    } 
    public String getCauseOfDeath(){
        return causeOfDeath;
    } 
    public void setCauseOfDeath(String causeOfDeath) {
         this.causeOfDeath = causeOfDeath;
    } 
    public Date getDateOfDeath(){
        return dateOfDeath;
    } 
    public void setDateOfDeath(Date dateOfDeath) {
         this.dateOfDeath = dateOfDeath;
    } 
    public Date getLastContactDate(){
        return lastContactDate;
    } 
    public void setLastContactDate(Date lastContactDate) {
         this.lastContactDate = lastContactDate;
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