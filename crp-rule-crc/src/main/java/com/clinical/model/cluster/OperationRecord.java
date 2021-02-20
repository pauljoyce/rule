package com.clinical.model.cluster;
import java.util.Date;
public class OperationRecord{
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
    //手术记录
    private String record;
    //手术入路
    private String route;
    //是否机器人辅助
    private String robot;
    //手术切除部位是否包括直肠
    private String resectionRectum;
    //手术切除部位是否包括结肠
    private String resectionColon;
    //手术名称
    private String operationName;
    //淋巴结清扫
    private String lymphDissection;
    //术中出血量
    private Double mabl;
    //手术开始时间
    private Date startTime;
    //手术结束时间
    private Date endTime;
    //术中输血
    private String bloodTransfusion;
    //术中输血量
    private String bloodTransfusionVolume;
    //术中输入成分
    private String composition;
    //是否造瘘
    private String colostomy;
    //造瘘方式
    private String colostomyMethods;
    //是否联合切除器官
    private String removeOrgans;
    //联合切除器官名称
    private String removeOrgansName;
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
    public String getRecord(){
        return record;
    } 
    public void setRecord(String record) {
         this.record = record;
    } 
    public String getRoute(){
        return route;
    } 
    public void setRoute(String route) {
         this.route = route;
    } 
    public String getRobot(){
        return robot;
    } 
    public void setRobot(String robot) {
         this.robot = robot;
    } 
    public String getResectionRectum(){
        return resectionRectum;
    } 
    public void setResectionRectum(String resectionRectum) {
         this.resectionRectum = resectionRectum;
    } 
    public String getResectionColon(){
        return resectionColon;
    } 
    public void setResectionColon(String resectionColon) {
         this.resectionColon = resectionColon;
    } 
    public String getOperationName(){
        return operationName;
    } 
    public void setOperationName(String operationName) {
         this.operationName = operationName;
    } 
    public String getLymphDissection(){
        return lymphDissection;
    } 
    public void setLymphDissection(String lymphDissection) {
         this.lymphDissection = lymphDissection;
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
    public String getBloodTransfusion(){
        return bloodTransfusion;
    } 
    public void setBloodTransfusion(String bloodTransfusion) {
         this.bloodTransfusion = bloodTransfusion;
    } 
    public String getBloodTransfusionVolume(){
        return bloodTransfusionVolume;
    } 
    public void setBloodTransfusionVolume(String bloodTransfusionVolume) {
         this.bloodTransfusionVolume = bloodTransfusionVolume;
    } 
    public String getComposition(){
        return composition;
    } 
    public void setComposition(String composition) {
         this.composition = composition;
    } 
    public String getColostomy(){
        return colostomy;
    } 
    public void setColostomy(String colostomy) {
         this.colostomy = colostomy;
    } 
    public String getColostomyMethods(){
        return colostomyMethods;
    } 
    public void setColostomyMethods(String colostomyMethods) {
         this.colostomyMethods = colostomyMethods;
    } 
    public String getRemoveOrgans(){
        return removeOrgans;
    } 
    public void setRemoveOrgans(String removeOrgans) {
         this.removeOrgans = removeOrgans;
    } 
    public String getRemoveOrgansName(){
        return removeOrgansName;
    } 
    public void setRemoveOrgansName(String removeOrgansName) {
         this.removeOrgansName = removeOrgansName;
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