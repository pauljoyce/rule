package com.clinical.model.cluster;
import java.util.Date;
public class AbdominalCt{
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
    //就诊标识住院号
    private String visitId;
    //检查号
    private String examNo;
    //检查项目
    private String examName;
    //胃部肿物
    private String tumor;
    //胃部肿物数目
    private String tumorCount;
    //胃部肿物大小
    private String tumorSize;
    //复发
    private String recrudescence;
    //转移
    private String transfer;
    //转移部位
    private String transferSite;
    //转移灶数目
    private String transferCount;
    //转移灶大小
    private String transferSize;
    //腹水
    private String ascites;
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
    public String getExamNo(){
        return examNo;
    } 
    public void setExamNo(String examNo) {
         this.examNo = examNo;
    } 
    public String getExamName(){
        return examName;
    } 
    public void setExamName(String examName) {
         this.examName = examName;
    } 
    public String getTumor(){
        return tumor;
    } 
    public void setTumor(String tumor) {
         this.tumor = tumor;
    } 
    public String getTumorCount(){
        return tumorCount;
    } 
    public void setTumorCount(String tumorCount) {
         this.tumorCount = tumorCount;
    } 
    public String getTumorSize(){
        return tumorSize;
    } 
    public void setTumorSize(String tumorSize) {
         this.tumorSize = tumorSize;
    } 
    public String getRecrudescence(){
        return recrudescence;
    } 
    public void setRecrudescence(String recrudescence) {
         this.recrudescence = recrudescence;
    } 
    public String getTransfer(){
        return transfer;
    } 
    public void setTransfer(String transfer) {
         this.transfer = transfer;
    } 
    public String getTransferSite(){
        return transferSite;
    } 
    public void setTransferSite(String transferSite) {
         this.transferSite = transferSite;
    } 
    public String getTransferCount(){
        return transferCount;
    } 
    public void setTransferCount(String transferCount) {
         this.transferCount = transferCount;
    } 
    public String getTransferSize(){
        return transferSize;
    } 
    public void setTransferSize(String transferSize) {
         this.transferSize = transferSize;
    } 
    public String getAscites(){
        return ascites;
    } 
    public void setAscites(String ascites) {
         this.ascites = ascites;
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