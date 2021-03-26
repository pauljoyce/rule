package com.clinical.model.cluster;
import java.util.Date;
public class Radiotherapy{
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
    //放疗开始日期
    private Date radioBeginTime;
    //放疗结束日期
    private Date radioEndTime;
    //放疗目的
    private String purpose;
    //放疗模式
    private String mode;
    //放疗部位
    private String site;
    //放疗部位类型
    private String siteType;
    //靶区部位
    private String targetSite;
    //放疗方式
    private String way;
    //射线类型
    private String rayType;
    //放疗总量
    private Double totalDose;
    //放疗单次剂量
    private Double singleDose;
    //放疗次数
    private String radioNumber;
    //处方放疗总量
    private String prescriptRadioTotal;
    //处方放疗单次剂量
    private String prescriptRadioSingle;
    //处方放疗次数
    private String prescriptRadioNumber;
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
    public Date getRadioBeginTime(){
        return radioBeginTime;
    } 
    public void setRadioBeginTime(Date radioBeginTime) {
             this.radioBeginTime = radioBeginTime;
    } 
    public Date getRadioEndTime(){
        return radioEndTime;
    } 
    public void setRadioEndTime(Date radioEndTime) {
             this.radioEndTime = radioEndTime;
    } 
    public String getPurpose(){
        return purpose;
    } 
    public void setPurpose(String purpose) {
             this.purpose = purpose;
    } 
    public String getMode(){
        return mode;
    } 
    public void setMode(String mode) {
             this.mode = mode;
    } 
    public String getSite(){
        return site;
    } 
    public void setSite(String site) {
             this.site = site;
    } 
    public String getSiteType(){
        return siteType;
    } 
    public void setSiteType(String siteType) {
             this.siteType = siteType;
    } 
    public String getTargetSite(){
        return targetSite;
    } 
    public void setTargetSite(String targetSite) {
             this.targetSite = targetSite;
    } 
    public String getWay(){
        return way;
    } 
    public void setWay(String way) {
             this.way = way;
    } 
    public String getRayType(){
        return rayType;
    } 
    public void setRayType(String rayType) {
             this.rayType = rayType;
    } 
    public Double getTotalDose(){
        return totalDose;
    } 
    public void setTotalDose(Double totalDose) {
             this.totalDose = totalDose;
    } 
    public Double getSingleDose(){
        return singleDose;
    } 
    public void setSingleDose(Double singleDose) {
             this.singleDose = singleDose;
    } 
    public String getRadioNumber(){
        return radioNumber;
    } 
    public void setRadioNumber(String radioNumber) {
             this.radioNumber = radioNumber;
    } 
    public String getPrescriptRadioTotal(){
        return prescriptRadioTotal;
    } 
    public void setPrescriptRadioTotal(String prescriptRadioTotal) {
             this.prescriptRadioTotal = prescriptRadioTotal;
    } 
    public String getPrescriptRadioSingle(){
        return prescriptRadioSingle;
    } 
    public void setPrescriptRadioSingle(String prescriptRadioSingle) {
             this.prescriptRadioSingle = prescriptRadioSingle;
    } 
    public String getPrescriptRadioNumber(){
        return prescriptRadioNumber;
    } 
    public void setPrescriptRadioNumber(String prescriptRadioNumber) {
             this.prescriptRadioNumber = prescriptRadioNumber;
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