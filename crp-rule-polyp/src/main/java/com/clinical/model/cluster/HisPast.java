package com.clinical.model.cluster;
import java.util.Date;
public class HisPast{
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
    //高血压
    private String hypertension;
    //糖尿病
    private String glycuresis;
    //慢性阻塞性肺病
    private String copd;
    //肺气肿
    private String emphysema;
    //哮喘
    private String asthma;
    //支气管肺炎
    private String bronchitis;
    //甲状腺疾病
    private String thyroid;
    //心脏病
    private String heartDisease;
    //慢性贫血
    private String chronicAnemia;
    //风湿
    private String rheumaticFever;
    //血脂异常
    private String bloodFat;
    //慢性肾脏病
    private String chronicKidney;
    //乙肝
    private String hepatitisB;
    //丙肝
    private String hcv;
    //结核
    private String tuberculosis;
    //HIV感染病史
    private String hiv;
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
    public String getHypertension(){
        return hypertension;
    } 
    public void setHypertension(String hypertension) {
         this.hypertension = hypertension;
    } 
    public String getGlycuresis(){
        return glycuresis;
    } 
    public void setGlycuresis(String glycuresis) {
         this.glycuresis = glycuresis;
    } 
    public String getCopd(){
        return copd;
    } 
    public void setCopd(String copd) {
         this.copd = copd;
    } 
    public String getEmphysema(){
        return emphysema;
    } 
    public void setEmphysema(String emphysema) {
         this.emphysema = emphysema;
    } 
    public String getAsthma(){
        return asthma;
    } 
    public void setAsthma(String asthma) {
         this.asthma = asthma;
    } 
    public String getBronchitis(){
        return bronchitis;
    } 
    public void setBronchitis(String bronchitis) {
         this.bronchitis = bronchitis;
    } 
    public String getThyroid(){
        return thyroid;
    } 
    public void setThyroid(String thyroid) {
         this.thyroid = thyroid;
    } 
    public String getHeartDisease(){
        return heartDisease;
    } 
    public void setHeartDisease(String heartDisease) {
         this.heartDisease = heartDisease;
    } 
    public String getChronicAnemia(){
        return chronicAnemia;
    } 
    public void setChronicAnemia(String chronicAnemia) {
         this.chronicAnemia = chronicAnemia;
    } 
    public String getRheumaticFever(){
        return rheumaticFever;
    } 
    public void setRheumaticFever(String rheumaticFever) {
         this.rheumaticFever = rheumaticFever;
    } 
    public String getBloodFat(){
        return bloodFat;
    } 
    public void setBloodFat(String bloodFat) {
         this.bloodFat = bloodFat;
    } 
    public String getChronicKidney(){
        return chronicKidney;
    } 
    public void setChronicKidney(String chronicKidney) {
         this.chronicKidney = chronicKidney;
    } 
    public String getHepatitisB(){
        return hepatitisB;
    } 
    public void setHepatitisB(String hepatitisB) {
         this.hepatitisB = hepatitisB;
    } 
    public String getHcv(){
        return hcv;
    } 
    public void setHcv(String hcv) {
         this.hcv = hcv;
    } 
    public String getTuberculosis(){
        return tuberculosis;
    } 
    public void setTuberculosis(String tuberculosis) {
         this.tuberculosis = tuberculosis;
    } 
    public String getHiv(){
        return hiv;
    } 
    public void setHiv(String hiv) {
         this.hiv = hiv;
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