package com.clinical.model.cluster;
import java.util.Date;
public class Examination{
    //主键id
    private Integer id;
    //标识患者身份唯一标识
    private String personId;
    //唯一标识
    private String uniqueId;
    //检查子表关联键
    private String uniqueIdLv3;
    //医疗机构代码
    private String p900;
    //患者id
    private String patientId;
    //住院号
    private String visitId;
    //检查项目
    private String inspectName;
    //身体部位
    private String body;
    //检查方式
    private String way;
    //检查号
    private String inspectNo;
    //检查日期
    private Date inspectDate;
    //报告日期
    private Date reprotDate;
    //检查描述原文
    private String finding;
    //检查结论原文
    private String result;
    //转移
    private String ifTransfer;
    //检查结论-肿块部位
    private String resultSite;
    //检查结论-肿块数目
    private String resultNumber;
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
    public String getInspectName(){
        return inspectName;
    } 
    public void setInspectName(String inspectName) {
         this.inspectName = inspectName;
    } 
    public String getBody(){
        return body;
    } 
    public void setBody(String body) {
         this.body = body;
    } 
    public String getWay(){
        return way;
    } 
    public void setWay(String way) {
         this.way = way;
    } 
    public String getInspectNo(){
        return inspectNo;
    } 
    public void setInspectNo(String inspectNo) {
         this.inspectNo = inspectNo;
    } 
    public Date getInspectDate(){
        return inspectDate;
    } 
    public void setInspectDate(Date inspectDate) {
         this.inspectDate = inspectDate;
    } 
    public Date getReprotDate(){
        return reprotDate;
    } 
    public void setReprotDate(Date reprotDate) {
         this.reprotDate = reprotDate;
    } 
    public String getFinding(){
        return finding;
    } 
    public void setFinding(String finding) {
         this.finding = finding;
    } 
    public String getResult(){
        return result;
    } 
    public void setResult(String result) {
         this.result = result;
    } 
    public String getIfTransfer(){
        return ifTransfer;
    } 
    public void setIfTransfer(String ifTransfer) {
         this.ifTransfer = ifTransfer;
    } 
    public String getResultSite(){
        return resultSite;
    } 
    public void setResultSite(String resultSite) {
         this.resultSite = resultSite;
    } 
    public String getResultNumber(){
        return resultNumber;
    } 
    public void setResultNumber(String resultNumber) {
         this.resultNumber = resultNumber;
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