package com.clinical.model.cluster;
import java.util.Date;
public class Symptom{
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
    //门诊/住院号
    private String visitId;
    //心力衰竭症状
    private String heartFailure;
    //前列腺癌症状
    private String prostateSymptoms;
    //前列腺癌转移症状
    private String metastaticSymptoms;
    //前列腺质地
    private String prostateTexture;
    //前列腺边界
    private String prostateBorder;
    //前列腺压痛
    private String prostateTenderness;
    //前列腺活动度
    private String prostateActivity;
    //前列腺大小
    private String prostateSize;
    //前列腺结节
    private String prostateNodule;
    //前列腺结节质地
    private String prostateNoduleTexture;
    //前列腺结节大小
    private String prostateNoduleSize;
    //前列腺结节位置
    private String prostateNoduleLocation;
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
    public String getHeartFailure(){
        return heartFailure;
    } 
    public void setHeartFailure(String heartFailure) {
         this.heartFailure = heartFailure;
    } 
    public String getProstateSymptoms(){
        return prostateSymptoms;
    } 
    public void setProstateSymptoms(String prostateSymptoms) {
         this.prostateSymptoms = prostateSymptoms;
    } 
    public String getMetastaticSymptoms(){
        return metastaticSymptoms;
    } 
    public void setMetastaticSymptoms(String metastaticSymptoms) {
         this.metastaticSymptoms = metastaticSymptoms;
    } 
    public String getProstateTexture(){
        return prostateTexture;
    } 
    public void setProstateTexture(String prostateTexture) {
         this.prostateTexture = prostateTexture;
    } 
    public String getProstateBorder(){
        return prostateBorder;
    } 
    public void setProstateBorder(String prostateBorder) {
         this.prostateBorder = prostateBorder;
    } 
    public String getProstateTenderness(){
        return prostateTenderness;
    } 
    public void setProstateTenderness(String prostateTenderness) {
         this.prostateTenderness = prostateTenderness;
    } 
    public String getProstateActivity(){
        return prostateActivity;
    } 
    public void setProstateActivity(String prostateActivity) {
         this.prostateActivity = prostateActivity;
    } 
    public String getProstateSize(){
        return prostateSize;
    } 
    public void setProstateSize(String prostateSize) {
         this.prostateSize = prostateSize;
    } 
    public String getProstateNodule(){
        return prostateNodule;
    } 
    public void setProstateNodule(String prostateNodule) {
         this.prostateNodule = prostateNodule;
    } 
    public String getProstateNoduleTexture(){
        return prostateNoduleTexture;
    } 
    public void setProstateNoduleTexture(String prostateNoduleTexture) {
         this.prostateNoduleTexture = prostateNoduleTexture;
    } 
    public String getProstateNoduleSize(){
        return prostateNoduleSize;
    } 
    public void setProstateNoduleSize(String prostateNoduleSize) {
         this.prostateNoduleSize = prostateNoduleSize;
    } 
    public String getProstateNoduleLocation(){
        return prostateNoduleLocation;
    } 
    public void setProstateNoduleLocation(String prostateNoduleLocation) {
         this.prostateNoduleLocation = prostateNoduleLocation;
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