package com.clinical.model.cluster;
import java.util.Date;
public class OutpAdmissionStatus{
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
    //入院日期
    private String admissionDateTime;
    //实际住院天数
    private Date tzyDays;
    //入院情况
    private String copStatus;
    //诊疗经过
    private String tzlProcess;
    //出院情况_出院症状与体征_出院小结
    private String dischargeStatus;
    //出院日期
    private Date dischargeDateTime;
    //入院诊断
    private String admissionDiagnosis;
    //出院诊断
    private String dischargeDiagnosis;
    //治疗效果_转归
    private String treatmentEffect;
    //出院医嘱
    private String dischargeOrder;
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
    public String getAdmissionDateTime(){
        return admissionDateTime;
    } 
    public void setAdmissionDateTime(String admissionDateTime) {
         this.admissionDateTime = admissionDateTime;
    } 
    public Date getTzyDays(){
        return tzyDays;
    } 
    public void setTzyDays(Date tzyDays) {
         this.tzyDays = tzyDays;
    } 
    public String getCopStatus(){
        return copStatus;
    } 
    public void setCopStatus(String copStatus) {
         this.copStatus = copStatus;
    } 
    public String getTzlProcess(){
        return tzlProcess;
    } 
    public void setTzlProcess(String tzlProcess) {
         this.tzlProcess = tzlProcess;
    } 
    public String getDischargeStatus(){
        return dischargeStatus;
    } 
    public void setDischargeStatus(String dischargeStatus) {
         this.dischargeStatus = dischargeStatus;
    } 
    public Date getDischargeDateTime(){
        return dischargeDateTime;
    } 
    public void setDischargeDateTime(Date dischargeDateTime) {
         this.dischargeDateTime = dischargeDateTime;
    } 
    public String getAdmissionDiagnosis(){
        return admissionDiagnosis;
    } 
    public void setAdmissionDiagnosis(String admissionDiagnosis) {
         this.admissionDiagnosis = admissionDiagnosis;
    } 
    public String getDischargeDiagnosis(){
        return dischargeDiagnosis;
    } 
    public void setDischargeDiagnosis(String dischargeDiagnosis) {
         this.dischargeDiagnosis = dischargeDiagnosis;
    } 
    public String getTreatmentEffect(){
        return treatmentEffect;
    } 
    public void setTreatmentEffect(String treatmentEffect) {
         this.treatmentEffect = treatmentEffect;
    } 
    public String getDischargeOrder(){
        return dischargeOrder;
    } 
    public void setDischargeOrder(String dischargeOrder) {
         this.dischargeOrder = dischargeOrder;
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