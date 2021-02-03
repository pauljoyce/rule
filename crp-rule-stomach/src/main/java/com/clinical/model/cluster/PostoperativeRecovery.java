package com.clinical.model.cluster;
import java.util.Date;
public class PostoperativeRecovery{
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
    //术后转入ICU
    private String toIcu;
    //术后转入ICU原因
    private String toIcuReason;
    //转入ICU日期
    private Date toIcuDate;
    //转出ICU日期
    private Date offIcuDate;
    //入院日期
    private Date admissionDateTime;
    //出院日期
    private Date dischargeDateTime;
    //总住院天数
    private Integer inDaysTotal;
    //术后住院天数
    private Integer vlineDays;
    //出院前体重
    private String preDischargeWeight;
    //首次离床日期
    private Date firstBedAwayDate;
    //肠功能恢复(肠鸣音/排气)日期
    private Date intestinalRecoveryDate;
    //恢复全流食日期
    private Date liquidDietsRecoveryDate;
    //恢复半流食日期
    private Date halfDietsRecoveryDate;
    //留置胃管
    private String isGastricIntubation;
    //拔除胃管日期
    private Date gastricOutDate;
    //留置腹腔引流管
    private String isShuntIntubation;
    //留置腹腔引流管数目
    private Integer shuntCount;
    //拔除最后一根引流管日期
    private Date lastShuntOutDate;
    //输血
    private String transfusion;
    //输血量
    private Double bloodTransfusionVolume;
    //输血成分
    private String bloodComponent;
    //术后转归
    private String outcomes;
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
    public String getToIcu(){
        return toIcu;
    } 
    public void setToIcu(String toIcu) {
         this.toIcu = toIcu;
    } 
    public String getToIcuReason(){
        return toIcuReason;
    } 
    public void setToIcuReason(String toIcuReason) {
         this.toIcuReason = toIcuReason;
    } 
    public Date getToIcuDate(){
        return toIcuDate;
    } 
    public void setToIcuDate(Date toIcuDate) {
         this.toIcuDate = toIcuDate;
    } 
    public Date getOffIcuDate(){
        return offIcuDate;
    } 
    public void setOffIcuDate(Date offIcuDate) {
         this.offIcuDate = offIcuDate;
    } 
    public Date getAdmissionDateTime(){
        return admissionDateTime;
    } 
    public void setAdmissionDateTime(Date admissionDateTime) {
         this.admissionDateTime = admissionDateTime;
    } 
    public Date getDischargeDateTime(){
        return dischargeDateTime;
    } 
    public void setDischargeDateTime(Date dischargeDateTime) {
         this.dischargeDateTime = dischargeDateTime;
    } 
    public Integer getInDaysTotal(){
        return inDaysTotal;
    } 
    public void setInDaysTotal(Integer inDaysTotal) {
         this.inDaysTotal = inDaysTotal;
    } 
    public Integer getVlineDays(){
        return vlineDays;
    } 
    public void setVlineDays(Integer vlineDays) {
         this.vlineDays = vlineDays;
    } 
    public String getPreDischargeWeight(){
        return preDischargeWeight;
    } 
    public void setPreDischargeWeight(String preDischargeWeight) {
         this.preDischargeWeight = preDischargeWeight;
    } 
    public Date getFirstBedAwayDate(){
        return firstBedAwayDate;
    } 
    public void setFirstBedAwayDate(Date firstBedAwayDate) {
         this.firstBedAwayDate = firstBedAwayDate;
    } 
    public Date getIntestinalRecoveryDate(){
        return intestinalRecoveryDate;
    } 
    public void setIntestinalRecoveryDate(Date intestinalRecoveryDate) {
         this.intestinalRecoveryDate = intestinalRecoveryDate;
    } 
    public Date getLiquidDietsRecoveryDate(){
        return liquidDietsRecoveryDate;
    } 
    public void setLiquidDietsRecoveryDate(Date liquidDietsRecoveryDate) {
         this.liquidDietsRecoveryDate = liquidDietsRecoveryDate;
    } 
    public Date getHalfDietsRecoveryDate(){
        return halfDietsRecoveryDate;
    } 
    public void setHalfDietsRecoveryDate(Date halfDietsRecoveryDate) {
         this.halfDietsRecoveryDate = halfDietsRecoveryDate;
    } 
    public String getIsGastricIntubation(){
        return isGastricIntubation;
    } 
    public void setIsGastricIntubation(String isGastricIntubation) {
         this.isGastricIntubation = isGastricIntubation;
    } 
    public Date getGastricOutDate(){
        return gastricOutDate;
    } 
    public void setGastricOutDate(Date gastricOutDate) {
         this.gastricOutDate = gastricOutDate;
    } 
    public String getIsShuntIntubation(){
        return isShuntIntubation;
    } 
    public void setIsShuntIntubation(String isShuntIntubation) {
         this.isShuntIntubation = isShuntIntubation;
    } 
    public Integer getShuntCount(){
        return shuntCount;
    } 
    public void setShuntCount(Integer shuntCount) {
         this.shuntCount = shuntCount;
    } 
    public Date getLastShuntOutDate(){
        return lastShuntOutDate;
    } 
    public void setLastShuntOutDate(Date lastShuntOutDate) {
         this.lastShuntOutDate = lastShuntOutDate;
    } 
    public String getTransfusion(){
        return transfusion;
    } 
    public void setTransfusion(String transfusion) {
         this.transfusion = transfusion;
    } 
    public Double getBloodTransfusionVolume(){
        return bloodTransfusionVolume;
    } 
    public void setBloodTransfusionVolume(Double bloodTransfusionVolume) {
         this.bloodTransfusionVolume = bloodTransfusionVolume;
    } 
    public String getBloodComponent(){
        return bloodComponent;
    } 
    public void setBloodComponent(String bloodComponent) {
         this.bloodComponent = bloodComponent;
    } 
    public String getOutcomes(){
        return outcomes;
    } 
    public void setOutcomes(String outcomes) {
         this.outcomes = outcomes;
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