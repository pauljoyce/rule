package com.clinical.model.cluster;
import java.util.Date;
public class Treatment{
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
    //用药分类
    private String drugType;
    //具体药物名称
    private String drugName;
    //给药途径
    private String channel;
    //药物剂量
    private String dose;
    //剂量单位
    private String unit;
    //用药开始日期
    private Date startDate;
    //用药结束日期
    private Date endDate;
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
    public String getDrugType(){
        return drugType;
    } 
    public void setDrugType(String drugType) {
         this.drugType = drugType;
    } 
    public String getDrugName(){
        return drugName;
    } 
    public void setDrugName(String drugName) {
         this.drugName = drugName;
    } 
    public String getChannel(){
        return channel;
    } 
    public void setChannel(String channel) {
         this.channel = channel;
    } 
    public String getDose(){
        return dose;
    } 
    public void setDose(String dose) {
         this.dose = dose;
    } 
    public String getUnit(){
        return unit;
    } 
    public void setUnit(String unit) {
         this.unit = unit;
    } 
    public Date getStartDate(){
        return startDate;
    } 
    public void setStartDate(Date startDate) {
         this.startDate = startDate;
    } 
    public Date getEndDate(){
        return endDate;
    } 
    public void setEndDate(Date endDate) {
         this.endDate = endDate;
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