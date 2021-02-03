package com.clinical.model.cluster;
import java.util.Date;
public class CancerPainTreatment{
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
    //导致疼痛原因
    private String causePain;
    //入院时疼痛情况
    private String admPainStatus;
    //疼痛性质
    private String painType;
    //基础药物日期
    private Date mainDrugDate;
    //基础药物名称
    private String mainDrugName;
    //基础药物计量
    private String mainDrugDose;
    //基础药物给药途径
    private String mainDrugRoute;
    //爆发痛时间
    private Date breakthroughPainTime;
    //爆发痛药物
    private String breakthroughPainDrug;
    //爆发痛给药途径
    private String breakthroughPainRoute;
    //爆发痛剂量
    private String breakthroughPainDose;
    //爆发痛疼痛评分
    private String breakthroughPainScore;
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
    public String getCausePain(){
        return causePain;
    } 
    public void setCausePain(String causePain) {
         this.causePain = causePain;
    } 
    public String getAdmPainStatus(){
        return admPainStatus;
    } 
    public void setAdmPainStatus(String admPainStatus) {
         this.admPainStatus = admPainStatus;
    } 
    public String getPainType(){
        return painType;
    } 
    public void setPainType(String painType) {
         this.painType = painType;
    } 
    public Date getMainDrugDate(){
        return mainDrugDate;
    } 
    public void setMainDrugDate(Date mainDrugDate) {
         this.mainDrugDate = mainDrugDate;
    } 
    public String getMainDrugName(){
        return mainDrugName;
    } 
    public void setMainDrugName(String mainDrugName) {
         this.mainDrugName = mainDrugName;
    } 
    public String getMainDrugDose(){
        return mainDrugDose;
    } 
    public void setMainDrugDose(String mainDrugDose) {
         this.mainDrugDose = mainDrugDose;
    } 
    public String getMainDrugRoute(){
        return mainDrugRoute;
    } 
    public void setMainDrugRoute(String mainDrugRoute) {
         this.mainDrugRoute = mainDrugRoute;
    } 
    public Date getBreakthroughPainTime(){
        return breakthroughPainTime;
    } 
    public void setBreakthroughPainTime(Date breakthroughPainTime) {
         this.breakthroughPainTime = breakthroughPainTime;
    } 
    public String getBreakthroughPainDrug(){
        return breakthroughPainDrug;
    } 
    public void setBreakthroughPainDrug(String breakthroughPainDrug) {
         this.breakthroughPainDrug = breakthroughPainDrug;
    } 
    public String getBreakthroughPainRoute(){
        return breakthroughPainRoute;
    } 
    public void setBreakthroughPainRoute(String breakthroughPainRoute) {
         this.breakthroughPainRoute = breakthroughPainRoute;
    } 
    public String getBreakthroughPainDose(){
        return breakthroughPainDose;
    } 
    public void setBreakthroughPainDose(String breakthroughPainDose) {
         this.breakthroughPainDose = breakthroughPainDose;
    } 
    public String getBreakthroughPainScore(){
        return breakthroughPainScore;
    } 
    public void setBreakthroughPainScore(String breakthroughPainScore) {
         this.breakthroughPainScore = breakthroughPainScore;
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