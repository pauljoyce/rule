package com.clinical.model.cluster;
import java.util.Date;
public class IndexDiagnosisMain{
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
    //主要诊断编码
    private String p321;
    //主要诊断疾病描述
    private String p322;
    //主要诊断入院病情
    private String p805;
    //主要诊断出院情况
    private String p323;
    //诊断日期
    private Date diagnosisDate;
    //就诊日期
    private Date visitDate;
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
    public String getP321(){
        return p321;
    } 
    public void setP321(String p321) {
             this.p321 = p321;
    } 
    public String getP322(){
        return p322;
    } 
    public void setP322(String p322) {
             this.p322 = p322;
    } 
    public String getP805(){
        return p805;
    } 
    public void setP805(String p805) {
             this.p805 = p805;
    } 
    public String getP323(){
        return p323;
    } 
    public void setP323(String p323) {
             this.p323 = p323;
    } 
    public Date getDiagnosisDate(){
        return diagnosisDate;
    } 
    public void setDiagnosisDate(Date diagnosisDate) {
             this.diagnosisDate = diagnosisDate;
    } 
    public Date getVisitDate(){
        return visitDate;
    } 
    public void setVisitDate(Date visitDate) {
             this.visitDate = visitDate;
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