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
    //手术名称
    private String rcptName;
    //手术记录
    private String surgicalProcess;
    //术者姓名
    private String nameOfSurgeon;
    //Ⅰ助姓名
    private String name1;
    //Ⅱ助姓名
    private String name2;
    //麻醉方式
    private String anesthesiaMethod;
    //麻醉医师姓名
    private String anesthesiologist;
    //手术开始时间
    private Date itemBeginDate;
    //手术结束时间
    private Date itemEndDate;
    //输血
    private String bloodTransfusion;
    //输血量
    private String bloodTransfusionVolume;
    //输入成分
    private String inputComponents;
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
    public String getRcptName(){
        return rcptName;
    } 
    public void setRcptName(String rcptName) {
         this.rcptName = rcptName;
    } 
    public String getSurgicalProcess(){
        return surgicalProcess;
    } 
    public void setSurgicalProcess(String surgicalProcess) {
         this.surgicalProcess = surgicalProcess;
    } 
    public String getNameOfSurgeon(){
        return nameOfSurgeon;
    } 
    public void setNameOfSurgeon(String nameOfSurgeon) {
         this.nameOfSurgeon = nameOfSurgeon;
    } 
    public String getName1(){
        return name1;
    } 
    public void setName1(String name1) {
         this.name1 = name1;
    } 
    public String getName2(){
        return name2;
    } 
    public void setName2(String name2) {
         this.name2 = name2;
    } 
    public String getAnesthesiaMethod(){
        return anesthesiaMethod;
    } 
    public void setAnesthesiaMethod(String anesthesiaMethod) {
         this.anesthesiaMethod = anesthesiaMethod;
    } 
    public String getAnesthesiologist(){
        return anesthesiologist;
    } 
    public void setAnesthesiologist(String anesthesiologist) {
         this.anesthesiologist = anesthesiologist;
    } 
    public Date getItemBeginDate(){
        return itemBeginDate;
    } 
    public void setItemBeginDate(Date itemBeginDate) {
         this.itemBeginDate = itemBeginDate;
    } 
    public Date getItemEndDate(){
        return itemEndDate;
    } 
    public void setItemEndDate(Date itemEndDate) {
         this.itemEndDate = itemEndDate;
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
    public String getInputComponents(){
        return inputComponents;
    } 
    public void setInputComponents(String inputComponents) {
         this.inputComponents = inputComponents;
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