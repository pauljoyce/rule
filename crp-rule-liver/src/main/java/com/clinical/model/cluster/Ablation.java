package com.clinical.model.cluster;
import java.util.Date;
public class Ablation{
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
    //局部消融
    private String ablation;
    //局部消融治疗开始日期
    private Date ablationStartDate;
    //局部消融治疗结束日期
    private Date ablationEndDate;
    //局部消融治疗通道
    private String ablationPathway;
    //局部消融治疗方式（可多种局部消融方式）
    private String ablationMethods;
    //肝动脉介入治疗
    private String therapy;
    //肝动脉介入治疗开始日期
    private Date therapyStartDate;
    //肝动脉介入治疗结束日期
    private Date therapyEndDate;
    //肝动脉介入治疗方式
    private String therapyMethodsStd;
    //肝动脉介入治疗栓塞剂（可多种栓塞剂）
    private String embolicStd;
    //肝动脉介入治疗化疗药物（可多种化疗药物）
    private String drugStd;
    //介入治疗肝肿瘤部位
    private String siteStd;
    //介入治疗肝肿瘤数目
    private Date numberStd;
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
    public String getAblation(){
        return ablation;
    } 
    public void setAblation(String ablation) {
             this.ablation = ablation;
    } 
    public Date getAblationStartDate(){
        return ablationStartDate;
    } 
    public void setAblationStartDate(Date ablationStartDate) {
             this.ablationStartDate = ablationStartDate;
    } 
    public Date getAblationEndDate(){
        return ablationEndDate;
    } 
    public void setAblationEndDate(Date ablationEndDate) {
             this.ablationEndDate = ablationEndDate;
    } 
    public String getAblationPathway(){
        return ablationPathway;
    } 
    public void setAblationPathway(String ablationPathway) {
             this.ablationPathway = ablationPathway;
    } 
    public String getAblationMethods(){
        return ablationMethods;
    } 
    public void setAblationMethods(String ablationMethods) {
             this.ablationMethods = ablationMethods;
    } 
    public String getTherapy(){
        return therapy;
    } 
    public void setTherapy(String therapy) {
             this.therapy = therapy;
    } 
    public Date getTherapyStartDate(){
        return therapyStartDate;
    } 
    public void setTherapyStartDate(Date therapyStartDate) {
             this.therapyStartDate = therapyStartDate;
    } 
    public Date getTherapyEndDate(){
        return therapyEndDate;
    } 
    public void setTherapyEndDate(Date therapyEndDate) {
             this.therapyEndDate = therapyEndDate;
    } 
    public String getTherapyMethodsStd(){
        return therapyMethodsStd;
    } 
    public void setTherapyMethodsStd(String therapyMethodsStd) {
             this.therapyMethodsStd = therapyMethodsStd;
    } 
    public String getEmbolicStd(){
        return embolicStd;
    } 
    public void setEmbolicStd(String embolicStd) {
             this.embolicStd = embolicStd;
    } 
    public String getDrugStd(){
        return drugStd;
    } 
    public void setDrugStd(String drugStd) {
             this.drugStd = drugStd;
    } 
    public String getSiteStd(){
        return siteStd;
    } 
    public void setSiteStd(String siteStd) {
             this.siteStd = siteStd;
    } 
    public Date getNumberStd(){
        return numberStd;
    } 
    public void setNumberStd(Date numberStd) {
             this.numberStd = numberStd;
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