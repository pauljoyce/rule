package com.clinical.model.cluster;
import java.util.Date;
public class DiagnosisStage{
    //主键id
    private Integer id;
    //标识患者身份唯一标识
    private String personId;
    //唯一标识
    private String uniqueId;
    //中间库unique_id
    private String uniqueIdLv3;
    //医疗机构代码
    private String p900;
    //患者id
    private String patientId;
    //住院门诊号
    private String visitId;
    //诊断名称
    private String diagName;
    //诊断名称标化结果合并
    private String diagNameStd;
    //T分期
    private String tStage;
    //N分期
    private String nStage;
    //M分期
    private String mStage;
    //TNM综合分期
    private String tnmStage;
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
    public String getDiagName(){
        return diagName;
    } 
    public void setDiagName(String diagName) {
         this.diagName = diagName;
    } 
    public String getDiagNameStd(){
        return diagNameStd;
    } 
    public void setDiagNameStd(String diagNameStd) {
         this.diagNameStd = diagNameStd;
    } 
    public String getTStage(){
        return tStage;
    } 
    public void setTStage(String tStage) {
         this.tStage = tStage;
    } 
    public String getNStage(){
        return nStage;
    } 
    public void setNStage(String nStage) {
         this.nStage = nStage;
    } 
    public String getMStage(){
        return mStage;
    } 
    public void setMStage(String mStage) {
         this.mStage = mStage;
    } 
    public String getTnmStage(){
        return tnmStage;
    } 
    public void setTnmStage(String tnmStage) {
         this.tnmStage = tnmStage;
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