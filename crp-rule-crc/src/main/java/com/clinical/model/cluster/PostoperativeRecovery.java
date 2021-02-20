package com.clinical.model.cluster;
import java.util.Date;
public class PostoperativeRecovery{
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
    //术后首次离床时间
    private Date timeOutOfBed;
    //术后恢复至首次离床时长
    private String firstTimeOutOfBed;
    //术后首次排气时间
    private Date exhaustTime;
    //术后恢复至首次排气时长
    private String firstExhaustTime;
    //术后首次排便时间
    private Date defecationTime;
    //术后恢复至首次排便时长
    private String firstDefecation;
    //术后恢复半流食时间
    private Date halfLiquidTime;
    //术后恢复至半流食时长
    private String semiLiquidFood;
    //术后恢复全流食时间
    private Date liquidTime;
    //术后恢复至全流食时长
    private String liquidFoodDuration;
    //拔除最后一根引流管时间
    private Date timeOfDrainageTubeRemoval;
    //术后留置引流管时长
    private String durationOfDrainageTube;
    //术后是否输血
    private String bloodAfterOperation;
    //术后输血量
    private String transfusion;
    //术后输血成分
    private String transfusionComponents;
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
    public Date getTimeOutOfBed(){
        return timeOutOfBed;
    } 
    public void setTimeOutOfBed(Date timeOutOfBed) {
         this.timeOutOfBed = timeOutOfBed;
    } 
    public String getFirstTimeOutOfBed(){
        return firstTimeOutOfBed;
    } 
    public void setFirstTimeOutOfBed(String firstTimeOutOfBed) {
         this.firstTimeOutOfBed = firstTimeOutOfBed;
    } 
    public Date getExhaustTime(){
        return exhaustTime;
    } 
    public void setExhaustTime(Date exhaustTime) {
         this.exhaustTime = exhaustTime;
    } 
    public String getFirstExhaustTime(){
        return firstExhaustTime;
    } 
    public void setFirstExhaustTime(String firstExhaustTime) {
         this.firstExhaustTime = firstExhaustTime;
    } 
    public Date getDefecationTime(){
        return defecationTime;
    } 
    public void setDefecationTime(Date defecationTime) {
         this.defecationTime = defecationTime;
    } 
    public String getFirstDefecation(){
        return firstDefecation;
    } 
    public void setFirstDefecation(String firstDefecation) {
         this.firstDefecation = firstDefecation;
    } 
    public Date getHalfLiquidTime(){
        return halfLiquidTime;
    } 
    public void setHalfLiquidTime(Date halfLiquidTime) {
         this.halfLiquidTime = halfLiquidTime;
    } 
    public String getSemiLiquidFood(){
        return semiLiquidFood;
    } 
    public void setSemiLiquidFood(String semiLiquidFood) {
         this.semiLiquidFood = semiLiquidFood;
    } 
    public Date getLiquidTime(){
        return liquidTime;
    } 
    public void setLiquidTime(Date liquidTime) {
         this.liquidTime = liquidTime;
    } 
    public String getLiquidFoodDuration(){
        return liquidFoodDuration;
    } 
    public void setLiquidFoodDuration(String liquidFoodDuration) {
         this.liquidFoodDuration = liquidFoodDuration;
    } 
    public Date getTimeOfDrainageTubeRemoval(){
        return timeOfDrainageTubeRemoval;
    } 
    public void setTimeOfDrainageTubeRemoval(Date timeOfDrainageTubeRemoval) {
         this.timeOfDrainageTubeRemoval = timeOfDrainageTubeRemoval;
    } 
    public String getDurationOfDrainageTube(){
        return durationOfDrainageTube;
    } 
    public void setDurationOfDrainageTube(String durationOfDrainageTube) {
         this.durationOfDrainageTube = durationOfDrainageTube;
    } 
    public String getBloodAfterOperation(){
        return bloodAfterOperation;
    } 
    public void setBloodAfterOperation(String bloodAfterOperation) {
         this.bloodAfterOperation = bloodAfterOperation;
    } 
    public String getTransfusion(){
        return transfusion;
    } 
    public void setTransfusion(String transfusion) {
         this.transfusion = transfusion;
    } 
    public String getTransfusionComponents(){
        return transfusionComponents;
    } 
    public void setTransfusionComponents(String transfusionComponents) {
         this.transfusionComponents = transfusionComponents;
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