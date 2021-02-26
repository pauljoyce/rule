package com.clinical.model.cluster;
import java.util.Date;
public class DurgOrder{
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
    //就诊类型
    private Integer visitType;
    //医嘱序号
    private String orderNo;
    //医嘱子序号
    private String orderSubNo;
    //医嘱类别
    private String orderClass;
    //医嘱正文
    private String orderText;
    //医嘱类型
    private String orderType;
    //数量
    private String orderQuantity;
    //数量单位
    private String orderUnit;
    //药品单次用量
    private String dosage;
    //剂量单位
    private String dosageUnits;
    //药品名称
    private String drugName;
    //药理主要成分
    private String mainIngredient;
    //商品名
    private String brandName;
    //药物剂型
    private String drugForm;
    //药品规格
    private String drugSpecs;
    //药品规格单位
    private String drugSpecsUnit;
    //药品包装单位
    private String drugPackageUnit;
    //用药途径
    private String administration;
    //持续时间
    private Integer duration;
    //持续时间单位
    private String durationUnits;
    //医嘱频次
    private String frequency;
    //频率间隔
    private String freqInterval;
    //频率间隔单位
    private String freqIntervalUnit;
    //执行详细时间
    private Date freqDetail;
    //护士执行时间
    private Date performSchedule;
    //开医嘱科室
    private String orderingDept;
    //医嘱开立医生
    private String orderingDoctor;
    //医嘱开立时间
    private Date enterDateTime;
    //医嘱停止医生
    private String orderStopDoctor;
    //医嘱停止时间
    private Date stopOrderDateTime;
    //医嘱作废医生
    private String orderCancelDoctor;
    //医嘱作废时间
    private Date orderCancelDateTime;
    //医嘱状态
    private String orderStatus;
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
    public Integer getVisitType(){
        return visitType;
    } 
    public void setVisitType(Integer visitType) {
         this.visitType = visitType;
    } 
    public String getOrderNo(){
        return orderNo;
    } 
    public void setOrderNo(String orderNo) {
         this.orderNo = orderNo;
    } 
    public String getOrderSubNo(){
        return orderSubNo;
    } 
    public void setOrderSubNo(String orderSubNo) {
         this.orderSubNo = orderSubNo;
    } 
    public String getOrderClass(){
        return orderClass;
    } 
    public void setOrderClass(String orderClass) {
         this.orderClass = orderClass;
    } 
    public String getOrderText(){
        return orderText;
    } 
    public void setOrderText(String orderText) {
         this.orderText = orderText;
    } 
    public String getOrderType(){
        return orderType;
    } 
    public void setOrderType(String orderType) {
         this.orderType = orderType;
    } 
    public String getOrderQuantity(){
        return orderQuantity;
    } 
    public void setOrderQuantity(String orderQuantity) {
         this.orderQuantity = orderQuantity;
    } 
    public String getOrderUnit(){
        return orderUnit;
    } 
    public void setOrderUnit(String orderUnit) {
         this.orderUnit = orderUnit;
    } 
    public String getDosage(){
        return dosage;
    } 
    public void setDosage(String dosage) {
         this.dosage = dosage;
    } 
    public String getDosageUnits(){
        return dosageUnits;
    } 
    public void setDosageUnits(String dosageUnits) {
         this.dosageUnits = dosageUnits;
    } 
    public String getDrugName(){
        return drugName;
    } 
    public void setDrugName(String drugName) {
         this.drugName = drugName;
    } 
    public String getMainIngredient(){
        return mainIngredient;
    } 
    public void setMainIngredient(String mainIngredient) {
         this.mainIngredient = mainIngredient;
    } 
    public String getBrandName(){
        return brandName;
    } 
    public void setBrandName(String brandName) {
         this.brandName = brandName;
    } 
    public String getDrugForm(){
        return drugForm;
    } 
    public void setDrugForm(String drugForm) {
         this.drugForm = drugForm;
    } 
    public String getDrugSpecs(){
        return drugSpecs;
    } 
    public void setDrugSpecs(String drugSpecs) {
         this.drugSpecs = drugSpecs;
    } 
    public String getDrugSpecsUnit(){
        return drugSpecsUnit;
    } 
    public void setDrugSpecsUnit(String drugSpecsUnit) {
         this.drugSpecsUnit = drugSpecsUnit;
    } 
    public String getDrugPackageUnit(){
        return drugPackageUnit;
    } 
    public void setDrugPackageUnit(String drugPackageUnit) {
         this.drugPackageUnit = drugPackageUnit;
    } 
    public String getAdministration(){
        return administration;
    } 
    public void setAdministration(String administration) {
         this.administration = administration;
    } 
    public Integer getDuration(){
        return duration;
    } 
    public void setDuration(Integer duration) {
         this.duration = duration;
    } 
    public String getDurationUnits(){
        return durationUnits;
    } 
    public void setDurationUnits(String durationUnits) {
         this.durationUnits = durationUnits;
    } 
    public String getFrequency(){
        return frequency;
    } 
    public void setFrequency(String frequency) {
         this.frequency = frequency;
    } 
    public String getFreqInterval(){
        return freqInterval;
    } 
    public void setFreqInterval(String freqInterval) {
         this.freqInterval = freqInterval;
    } 
    public String getFreqIntervalUnit(){
        return freqIntervalUnit;
    } 
    public void setFreqIntervalUnit(String freqIntervalUnit) {
         this.freqIntervalUnit = freqIntervalUnit;
    } 
    public Date getFreqDetail(){
        return freqDetail;
    } 
    public void setFreqDetail(Date freqDetail) {
         this.freqDetail = freqDetail;
    } 
    public Date getPerformSchedule(){
        return performSchedule;
    } 
    public void setPerformSchedule(Date performSchedule) {
         this.performSchedule = performSchedule;
    } 
    public String getOrderingDept(){
        return orderingDept;
    } 
    public void setOrderingDept(String orderingDept) {
         this.orderingDept = orderingDept;
    } 
    public String getOrderingDoctor(){
        return orderingDoctor;
    } 
    public void setOrderingDoctor(String orderingDoctor) {
         this.orderingDoctor = orderingDoctor;
    } 
    public Date getEnterDateTime(){
        return enterDateTime;
    } 
    public void setEnterDateTime(Date enterDateTime) {
         this.enterDateTime = enterDateTime;
    } 
    public String getOrderStopDoctor(){
        return orderStopDoctor;
    } 
    public void setOrderStopDoctor(String orderStopDoctor) {
         this.orderStopDoctor = orderStopDoctor;
    } 
    public Date getStopOrderDateTime(){
        return stopOrderDateTime;
    } 
    public void setStopOrderDateTime(Date stopOrderDateTime) {
         this.stopOrderDateTime = stopOrderDateTime;
    } 
    public String getOrderCancelDoctor(){
        return orderCancelDoctor;
    } 
    public void setOrderCancelDoctor(String orderCancelDoctor) {
         this.orderCancelDoctor = orderCancelDoctor;
    } 
    public Date getOrderCancelDateTime(){
        return orderCancelDateTime;
    } 
    public void setOrderCancelDateTime(Date orderCancelDateTime) {
         this.orderCancelDateTime = orderCancelDateTime;
    } 
    public String getOrderStatus(){
        return orderStatus;
    } 
    public void setOrderStatus(String orderStatus) {
         this.orderStatus = orderStatus;
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