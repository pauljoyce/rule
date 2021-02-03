package com.clinical.model.cluster;
import java.util.Date;
public class VisitRecord{
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
    //就诊类型
    private Integer visitType;
    //住院号
    private String visitId;
    //入院日期
    private Date admissionDateTime;
    //出院日期
    private Date dischargeDateTime;
    //入院科室
    private String deptAdmissionTo;
    //出院科室
    private String deptDischargeFrom;
    //住院次数
    private Integer admissionNumber;
    //就诊医院
    private String p900Name;
    //就诊类型汉字
    private String visitSourceValue;
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
    public Integer getVisitType(){
        return visitType;
    } 
    public void setVisitType(Integer visitType) {
         this.visitType = visitType;
    } 
    public String getVisitId(){
        return visitId;
    } 
    public void setVisitId(String visitId) {
         this.visitId = visitId;
    } 
    public Date getAdmissionDateTime(){
        return admissionDateTime;
    } 
    public void setAdmissionDateTime(Date admissionDateTime) {
         this.admissionDateTime = admissionDateTime;
    } 
    public Date getDischargeDateTime(){
        return dischargeDateTime;
    } 
    public void setDischargeDateTime(Date dischargeDateTime) {
         this.dischargeDateTime = dischargeDateTime;
    } 
    public String getDeptAdmissionTo(){
        return deptAdmissionTo;
    } 
    public void setDeptAdmissionTo(String deptAdmissionTo) {
         this.deptAdmissionTo = deptAdmissionTo;
    } 
    public String getDeptDischargeFrom(){
        return deptDischargeFrom;
    } 
    public void setDeptDischargeFrom(String deptDischargeFrom) {
         this.deptDischargeFrom = deptDischargeFrom;
    } 
    public Integer getAdmissionNumber(){
        return admissionNumber;
    } 
    public void setAdmissionNumber(Integer admissionNumber) {
         this.admissionNumber = admissionNumber;
    } 
    public String getP900Name(){
        return p900Name;
    } 
    public void setP900Name(String p900Name) {
         this.p900Name = p900Name;
    } 
    public String getVisitSourceValue(){
        return visitSourceValue;
    } 
    public void setVisitSourceValue(String visitSourceValue) {
         this.visitSourceValue = visitSourceValue;
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