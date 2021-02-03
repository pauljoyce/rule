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
    //症状
    private String symptoms;
    //腹部压痛
    private String abdominalTenderness;
    //腹部压痛部位
    private String abdominalTendernessSite;
    //肌抵抗
    private String muscularResistance;
    //腹部肿物
    private String abdominalTumour;
    //腹部肿物位置
    private String abdominalTumourSite;
    //腹部肿物大小
    private String abdominalTumourSize;
    //胃型
    private String gastricType;
    //振水音
    private String vibrationWater;
    //移动性浊音
    private String mobileVoiced;
    //直肠指检
    private String digitalRectalExam;
    //盆底结节
    private String tuberclePelvic;
    //指套染血
    private String bloodFingering;
    //左锁骨上淋巴结肿大
    private String lymphadenopathy;
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
    public String getSymptoms(){
        return symptoms;
    } 
    public void setSymptoms(String symptoms) {
         this.symptoms = symptoms;
    } 
    public String getAbdominalTenderness(){
        return abdominalTenderness;
    } 
    public void setAbdominalTenderness(String abdominalTenderness) {
         this.abdominalTenderness = abdominalTenderness;
    } 
    public String getAbdominalTendernessSite(){
        return abdominalTendernessSite;
    } 
    public void setAbdominalTendernessSite(String abdominalTendernessSite) {
         this.abdominalTendernessSite = abdominalTendernessSite;
    } 
    public String getMuscularResistance(){
        return muscularResistance;
    } 
    public void setMuscularResistance(String muscularResistance) {
         this.muscularResistance = muscularResistance;
    } 
    public String getAbdominalTumour(){
        return abdominalTumour;
    } 
    public void setAbdominalTumour(String abdominalTumour) {
         this.abdominalTumour = abdominalTumour;
    } 
    public String getAbdominalTumourSite(){
        return abdominalTumourSite;
    } 
    public void setAbdominalTumourSite(String abdominalTumourSite) {
         this.abdominalTumourSite = abdominalTumourSite;
    } 
    public String getAbdominalTumourSize(){
        return abdominalTumourSize;
    } 
    public void setAbdominalTumourSize(String abdominalTumourSize) {
         this.abdominalTumourSize = abdominalTumourSize;
    } 
    public String getGastricType(){
        return gastricType;
    } 
    public void setGastricType(String gastricType) {
         this.gastricType = gastricType;
    } 
    public String getVibrationWater(){
        return vibrationWater;
    } 
    public void setVibrationWater(String vibrationWater) {
         this.vibrationWater = vibrationWater;
    } 
    public String getMobileVoiced(){
        return mobileVoiced;
    } 
    public void setMobileVoiced(String mobileVoiced) {
         this.mobileVoiced = mobileVoiced;
    } 
    public String getDigitalRectalExam(){
        return digitalRectalExam;
    } 
    public void setDigitalRectalExam(String digitalRectalExam) {
         this.digitalRectalExam = digitalRectalExam;
    } 
    public String getTuberclePelvic(){
        return tuberclePelvic;
    } 
    public void setTuberclePelvic(String tuberclePelvic) {
         this.tuberclePelvic = tuberclePelvic;
    } 
    public String getBloodFingering(){
        return bloodFingering;
    } 
    public void setBloodFingering(String bloodFingering) {
         this.bloodFingering = bloodFingering;
    } 
    public String getLymphadenopathy(){
        return lymphadenopathy;
    } 
    public void setLymphadenopathy(String lymphadenopathy) {
         this.lymphadenopathy = lymphadenopathy;
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