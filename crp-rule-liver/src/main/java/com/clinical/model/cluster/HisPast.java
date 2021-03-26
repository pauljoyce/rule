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
    //慢性阻塞性肺病(COPD)
    private String copd;
    //心脏病
    private String heartDisease;
    //肝炎
    private String hepatitis;
    //甲肝/甲型病毒性肝炎
    private String hepatitisA;
    //乙肝/乙型病毒性肝炎
    private String hepatitisB;
    //丙肝/丙型病毒性肝炎
    private String hepatitisC;
    //丁肝/丁型病毒性肝炎
    private String hepatitisD;
    //戊肝/戊型病毒性肝炎
    private String hepatitisE;
    //新型病毒性肝炎
    private String newHepatitis;
    //药物性肝炎
    private String durgHepatitis;
    //酒精性肝炎
    private String alcoholicHepatitis;
    //脂肪性肝炎
    private String steatohepatitis;
    //自身免疫肝炎
    private String autoimmuneHepatitis;
    //肝硬化
    private String cirrhosis;
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
    public String getHeartDisease(){
        return heartDisease;
    } 
    public void setHeartDisease(String heartDisease) {
             this.heartDisease = heartDisease;
    } 
    public String getHepatitis(){
        return hepatitis;
    } 
    public void setHepatitis(String hepatitis) {
             this.hepatitis = hepatitis;
    } 
    public String getHepatitisA(){
        return hepatitisA;
    } 
    public void setHepatitisA(String hepatitisA) {
             this.hepatitisA = hepatitisA;
    } 
    public String getHepatitisB(){
        return hepatitisB;
    } 
    public void setHepatitisB(String hepatitisB) {
             this.hepatitisB = hepatitisB;
    } 
    public String getHepatitisC(){
        return hepatitisC;
    } 
    public void setHepatitisC(String hepatitisC) {
             this.hepatitisC = hepatitisC;
    } 
    public String getHepatitisD(){
        return hepatitisD;
    } 
    public void setHepatitisD(String hepatitisD) {
             this.hepatitisD = hepatitisD;
    } 
    public String getHepatitisE(){
        return hepatitisE;
    } 
    public void setHepatitisE(String hepatitisE) {
             this.hepatitisE = hepatitisE;
    } 
    public String getNewHepatitis(){
        return newHepatitis;
    } 
    public void setNewHepatitis(String newHepatitis) {
             this.newHepatitis = newHepatitis;
    } 
    public String getDurgHepatitis(){
        return durgHepatitis;
    } 
    public void setDurgHepatitis(String durgHepatitis) {
             this.durgHepatitis = durgHepatitis;
    } 
    public String getAlcoholicHepatitis(){
        return alcoholicHepatitis;
    } 
    public void setAlcoholicHepatitis(String alcoholicHepatitis) {
             this.alcoholicHepatitis = alcoholicHepatitis;
    } 
    public String getSteatohepatitis(){
        return steatohepatitis;
    } 
    public void setSteatohepatitis(String steatohepatitis) {
             this.steatohepatitis = steatohepatitis;
    } 
    public String getAutoimmuneHepatitis(){
        return autoimmuneHepatitis;
    } 
    public void setAutoimmuneHepatitis(String autoimmuneHepatitis) {
             this.autoimmuneHepatitis = autoimmuneHepatitis;
    } 
    public String getCirrhosis(){
        return cirrhosis;
    } 
    public void setCirrhosis(String cirrhosis) {
             this.cirrhosis = cirrhosis;
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