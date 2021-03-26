package com.clinical.model.cluster;
import java.util.Date;
public class PrimaryDiagnosis{
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
    //住院门诊号
    private String visitId;
    //诊断日期
    private Date diagnosisDate;
    //诊断名称
    private String diagnosisName;
    //诊断类型
    private String diagnosisType;
    //出现转移
    private String ifTransfer;
    //转移部位
    private String transferPosition;
    //复发
    private String ifRecrudescence;
    //复发形式
    private String recrudescenceType;
    //复发或转移时间
    private Date recrudescenceDate;
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
    public Date getDiagnosisDate(){
        return diagnosisDate;
    } 
    public void setDiagnosisDate(Date diagnosisDate) {
             this.diagnosisDate = diagnosisDate;
    } 
    public String getDiagnosisName(){
        return diagnosisName;
    } 
    public void setDiagnosisName(String diagnosisName) {
             this.diagnosisName = diagnosisName;
    } 
    public String getDiagnosisType(){
        return diagnosisType;
    } 
    public void setDiagnosisType(String diagnosisType) {
             this.diagnosisType = diagnosisType;
    } 
    public String getIfTransfer(){
        return ifTransfer;
    } 
    public void setIfTransfer(String ifTransfer) {
             this.ifTransfer = ifTransfer;
    } 
    public String getTransferPosition(){
        return transferPosition;
    } 
    public void setTransferPosition(String transferPosition) {
             this.transferPosition = transferPosition;
    } 
    public String getIfRecrudescence(){
        return ifRecrudescence;
    } 
    public void setIfRecrudescence(String ifRecrudescence) {
             this.ifRecrudescence = ifRecrudescence;
    } 
    public String getRecrudescenceType(){
        return recrudescenceType;
    } 
    public void setRecrudescenceType(String recrudescenceType) {
             this.recrudescenceType = recrudescenceType;
    } 
    public Date getRecrudescenceDate(){
        return recrudescenceDate;
    } 
    public void setRecrudescenceDate(Date recrudescenceDate) {
             this.recrudescenceDate = recrudescenceDate;
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