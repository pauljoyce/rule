package com.clinical.model.cluster;
import java.util.Date;
public class HisPerson{
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
    //吸烟
    private String smoke;
    //吸烟年限
    private Double smokeYear;
    //吸烟量
    private String dailySmoke;
    //戒烟
    private String stopSmoke;
    //戒烟年限
    private Double stopSmokeYear;
    //饮酒
    private String drink;
    //饮酒年限
    private Double drinkYear;
    //饮酒量
    private String dailyDrink;
    //戒酒
    private String stopDrink;
    //戒酒年限
    private Double stopDrinkYear;
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
    public String getSmoke(){
        return smoke;
    } 
    public void setSmoke(String smoke) {
             this.smoke = smoke;
    } 
    public Double getSmokeYear(){
        return smokeYear;
    } 
    public void setSmokeYear(Double smokeYear) {
             this.smokeYear = smokeYear;
    } 
    public String getDailySmoke(){
        return dailySmoke;
    } 
    public void setDailySmoke(String dailySmoke) {
             this.dailySmoke = dailySmoke;
    } 
    public String getStopSmoke(){
        return stopSmoke;
    } 
    public void setStopSmoke(String stopSmoke) {
             this.stopSmoke = stopSmoke;
    } 
    public Double getStopSmokeYear(){
        return stopSmokeYear;
    } 
    public void setStopSmokeYear(Double stopSmokeYear) {
             this.stopSmokeYear = stopSmokeYear;
    } 
    public String getDrink(){
        return drink;
    } 
    public void setDrink(String drink) {
             this.drink = drink;
    } 
    public Double getDrinkYear(){
        return drinkYear;
    } 
    public void setDrinkYear(Double drinkYear) {
             this.drinkYear = drinkYear;
    } 
    public String getDailyDrink(){
        return dailyDrink;
    } 
    public void setDailyDrink(String dailyDrink) {
             this.dailyDrink = dailyDrink;
    } 
    public String getStopDrink(){
        return stopDrink;
    } 
    public void setStopDrink(String stopDrink) {
             this.stopDrink = stopDrink;
    } 
    public Double getStopDrinkYear(){
        return stopDrinkYear;
    } 
    public void setStopDrinkYear(Double stopDrinkYear) {
             this.stopDrinkYear = stopDrinkYear;
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