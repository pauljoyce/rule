package com.clinical.model.cluster;
import java.util.Date;
public class OperationRecord{
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
    //手术入路
    private String route;
    //手术名称
    private String operationName;
    //手术持续时间
    private Integer dur;
    //术中出血量
    private Double mabl;
    //手术开始时间
    private Date startTime;
    //手术结束时间
    private Date endTime;
    //手术记录
    private String record;
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
    public String getRoute(){
        return route;
    } 
    public void setRoute(String route) {
         this.route = route;
    } 
    public String getOperationName(){
        return operationName;
    } 
    public void setOperationName(String operationName) {
         this.operationName = operationName;
    } 
    public Integer getDur(){
        return dur;
    } 
    public void setDur(Integer dur) {
         this.dur = dur;
    } 
    public Double getMabl(){
        return mabl;
    } 
    public void setMabl(Double mabl) {
         this.mabl = mabl;
    } 
    public Date getStartTime(){
        return startTime;
    } 
    public void setStartTime(Date startTime) {
         this.startTime = startTime;
    } 
    public Date getEndTime(){
        return endTime;
    } 
    public void setEndTime(Date endTime) {
         this.endTime = endTime;
    } 
    public String getRecord(){
        return record;
    } 
    public void setRecord(String record) {
         this.record = record;
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