package com.clinical.model.cluster;
import java.util.Date;
public class HisPast{
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
    //高血压
    private String hypertension;
    //高血压用药史
    private String hypertensionDrug;
    //糖尿病
    private String glycuresis;
    //糖尿病用药史
    private String glycuresisDrug;
    //慢性阻塞性肺病
    private String copd;
    //甲状腺疾病
    private String thyroid;
    //心脏病
    private String heartDisease;
    //心脏病用药史
    private String heartDiseaseDrug;
    //慢性贫血
    private String chronicAnemia;
    //风湿热病史
    private String rheumaticFever;
    //血脂异常
    private String bloodFat;
    //血脂异常用药史
    private String bloodFatDrug;
    //慢性肾脏病
    private String chronicKidney;
    //乙肝
    private String hepatitisB;
    //乙肝是用药史
    private String hepatitisBDrug;
    //丙肝
    private String hcv;
    //丙肝用药史
    private String hcvDrug;
    //结核
    private String tuberculosis;
    //结核用药史
    private String tuberculosisDrug;
    //HIV感染病史
    private String hiv;
    //抗HIV治疗史
    private String hivTreatment;
    //鼻炎
    private String nasitis;
    //鼻炎用药史
    private String nasitisDrug;
    //EB病毒感染病史
    private String eb;
    //抗EBV治疗史
    private String ebvTreatment;
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
    public String getHypertension(){
        return hypertension;
    } 
    public void setHypertension(String hypertension) {
         this.hypertension = hypertension;
    } 
    public String getHypertensionDrug(){
        return hypertensionDrug;
    } 
    public void setHypertensionDrug(String hypertensionDrug) {
         this.hypertensionDrug = hypertensionDrug;
    } 
    public String getGlycuresis(){
        return glycuresis;
    } 
    public void setGlycuresis(String glycuresis) {
         this.glycuresis = glycuresis;
    } 
    public String getGlycuresisDrug(){
        return glycuresisDrug;
    } 
    public void setGlycuresisDrug(String glycuresisDrug) {
         this.glycuresisDrug = glycuresisDrug;
    } 
    public String getCopd(){
        return copd;
    } 
    public void setCopd(String copd) {
         this.copd = copd;
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
    public String getHeartDiseaseDrug(){
        return heartDiseaseDrug;
    } 
    public void setHeartDiseaseDrug(String heartDiseaseDrug) {
         this.heartDiseaseDrug = heartDiseaseDrug;
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
    public String getBloodFatDrug(){
        return bloodFatDrug;
    } 
    public void setBloodFatDrug(String bloodFatDrug) {
         this.bloodFatDrug = bloodFatDrug;
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
    public String getHepatitisBDrug(){
        return hepatitisBDrug;
    } 
    public void setHepatitisBDrug(String hepatitisBDrug) {
         this.hepatitisBDrug = hepatitisBDrug;
    } 
    public String getHcv(){
        return hcv;
    } 
    public void setHcv(String hcv) {
         this.hcv = hcv;
    } 
    public String getHcvDrug(){
        return hcvDrug;
    } 
    public void setHcvDrug(String hcvDrug) {
         this.hcvDrug = hcvDrug;
    } 
    public String getTuberculosis(){
        return tuberculosis;
    } 
    public void setTuberculosis(String tuberculosis) {
         this.tuberculosis = tuberculosis;
    } 
    public String getTuberculosisDrug(){
        return tuberculosisDrug;
    } 
    public void setTuberculosisDrug(String tuberculosisDrug) {
         this.tuberculosisDrug = tuberculosisDrug;
    } 
    public String getHiv(){
        return hiv;
    } 
    public void setHiv(String hiv) {
         this.hiv = hiv;
    } 
    public String getHivTreatment(){
        return hivTreatment;
    } 
    public void setHivTreatment(String hivTreatment) {
         this.hivTreatment = hivTreatment;
    } 
    public String getNasitis(){
        return nasitis;
    } 
    public void setNasitis(String nasitis) {
         this.nasitis = nasitis;
    } 
    public String getNasitisDrug(){
        return nasitisDrug;
    } 
    public void setNasitisDrug(String nasitisDrug) {
         this.nasitisDrug = nasitisDrug;
    } 
    public String getEb(){
        return eb;
    } 
    public void setEb(String eb) {
         this.eb = eb;
    } 
    public String getEbvTreatment(){
        return ebvTreatment;
    } 
    public void setEbvTreatment(String ebvTreatment) {
         this.ebvTreatment = ebvTreatment;
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