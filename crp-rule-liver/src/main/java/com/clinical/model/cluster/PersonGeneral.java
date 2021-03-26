package com.clinical.model.cluster;
import java.util.Date;
public class PersonGeneral{
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
    //日期
    private Date recordTime;
    //呼吸
    private Integer breathingFrequency;
    //脉搏
    private Integer heartRate;
    //体温
    private Double bodyTemperature;
    //收缩压
    private Integer systolicBloodPressure;
    //舒张压
    private Integer diastolicBloodPressure;
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
    public Date getRecordTime(){
        return recordTime;
    } 
    public void setRecordTime(Date recordTime) {
             this.recordTime = recordTime;
    } 
    public Integer getBreathingFrequency(){
        return breathingFrequency;
    } 
    public void setBreathingFrequency(Integer breathingFrequency) {
             this.breathingFrequency = breathingFrequency;
    } 
    public Integer getHeartRate(){
        return heartRate;
    } 
    public void setHeartRate(Integer heartRate) {
             this.heartRate = heartRate;
    } 
    public Double getBodyTemperature(){
        return bodyTemperature;
    } 
    public void setBodyTemperature(Double bodyTemperature) {
             this.bodyTemperature = bodyTemperature;
    } 
    public Integer getSystolicBloodPressure(){
        return systolicBloodPressure;
    } 
    public void setSystolicBloodPressure(Integer systolicBloodPressure) {
             this.systolicBloodPressure = systolicBloodPressure;
    } 
    public Integer getDiastolicBloodPressure(){
        return diastolicBloodPressure;
    } 
    public void setDiastolicBloodPressure(Integer diastolicBloodPressure) {
             this.diastolicBloodPressure = diastolicBloodPressure;
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