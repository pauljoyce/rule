package com.clinical.model.cluster;
import java.util.Date;
public class ExamMaster{
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
    //检查类型
    private String examClass;
    //检查部位
    private String examPosition;
    //检查项目
    private String examName;
    //活检病理
    private String examPara;
    //送检日期
    private Date examDateTime;
    //报告日期
    private Date reportDateTime;
    //检查所见
    private String description;
    //检查结论
    private String entryResults;
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
    public String getExamClass(){
        return examClass;
    } 
    public void setExamClass(String examClass) {
         this.examClass = examClass;
    } 
    public String getExamPosition(){
        return examPosition;
    } 
    public void setExamPosition(String examPosition) {
         this.examPosition = examPosition;
    } 
    public String getExamName(){
        return examName;
    } 
    public void setExamName(String examName) {
         this.examName = examName;
    } 
    public String getExamPara(){
        return examPara;
    } 
    public void setExamPara(String examPara) {
         this.examPara = examPara;
    } 
    public Date getExamDateTime(){
        return examDateTime;
    } 
    public void setExamDateTime(Date examDateTime) {
         this.examDateTime = examDateTime;
    } 
    public Date getReportDateTime(){
        return reportDateTime;
    } 
    public void setReportDateTime(Date reportDateTime) {
         this.reportDateTime = reportDateTime;
    } 
    public String getDescription(){
        return description;
    } 
    public void setDescription(String description) {
         this.description = description;
    } 
    public String getEntryResults(){
        return entryResults;
    } 
    public void setEntryResults(String entryResults) {
         this.entryResults = entryResults;
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