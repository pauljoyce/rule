package com.clinical.model.cluster;
import java.util.Date;
public class ImmuneStd{
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
    //住院号
    private String visitId;
    //免疫组化检测项目
    private String markerName;
    //免疫组化检测位点
    private String mutationSite;
    //免疫组化标志物检测定性结果
    private String markerQualitative;
    //免疫组化标志物检测定量结果
    private String markerQuantify;
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
    public String getMarkerName(){
        return markerName;
    } 
    public void setMarkerName(String markerName) {
         this.markerName = markerName;
    } 
    public String getMutationSite(){
        return mutationSite;
    } 
    public void setMutationSite(String mutationSite) {
         this.mutationSite = mutationSite;
    } 
    public String getMarkerQualitative(){
        return markerQualitative;
    } 
    public void setMarkerQualitative(String markerQualitative) {
         this.markerQualitative = markerQualitative;
    } 
    public String getMarkerQuantify(){
        return markerQuantify;
    } 
    public void setMarkerQuantify(String markerQuantify) {
         this.markerQuantify = markerQuantify;
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