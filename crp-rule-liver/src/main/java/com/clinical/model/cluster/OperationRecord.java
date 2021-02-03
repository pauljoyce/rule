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
    private String surgicalProcess;
    //手术入路
    private String rote;
    //手术名称
    private String rcptName;
    //是否机器人辅助
    private String robot;
    //术中是否肝门阻断
    private String crossclamp;
    //肝门阻断时间
    private String crossclampTime;
    //手术类型
    private String rcptType;
    //淋巴结清扫
    private String lymphadenectomy;
    //术中出血量
    private String bleedingVolume;
    //手术开始时间
    private Date itemBeginDate;
    //手术结束时间
    private Date itemEndDate;
    //术中输血
    private String bloodTransfusion;
    //术中输血量
    private String bloodTransfusionVolume;
    //术中输血成分
    private String inputComponents;
    //术中补液量
    private String inputComponentsVolume;
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
    public String getSurgicalProcess(){
        return surgicalProcess;
    } 
    public void setSurgicalProcess(String surgicalProcess) {
         this.surgicalProcess = surgicalProcess;
    } 
    public String getRote(){
        return rote;
    } 
    public void setRote(String rote) {
         this.rote = rote;
    } 
    public String getRcptName(){
        return rcptName;
    } 
    public void setRcptName(String rcptName) {
         this.rcptName = rcptName;
    } 
    public String getRobot(){
        return robot;
    } 
    public void setRobot(String robot) {
         this.robot = robot;
    } 
    public String getCrossclamp(){
        return crossclamp;
    } 
    public void setCrossclamp(String crossclamp) {
         this.crossclamp = crossclamp;
    } 
    public String getCrossclampTime(){
        return crossclampTime;
    } 
    public void setCrossclampTime(String crossclampTime) {
         this.crossclampTime = crossclampTime;
    } 
    public String getRcptType(){
        return rcptType;
    } 
    public void setRcptType(String rcptType) {
         this.rcptType = rcptType;
    } 
    public String getLymphadenectomy(){
        return lymphadenectomy;
    } 
    public void setLymphadenectomy(String lymphadenectomy) {
         this.lymphadenectomy = lymphadenectomy;
    } 
    public String getBleedingVolume(){
        return bleedingVolume;
    } 
    public void setBleedingVolume(String bleedingVolume) {
         this.bleedingVolume = bleedingVolume;
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
    public String getInputComponentsVolume(){
        return inputComponentsVolume;
    } 
    public void setInputComponentsVolume(String inputComponentsVolume) {
         this.inputComponentsVolume = inputComponentsVolume;
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