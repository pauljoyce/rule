package com.clinical.model.cluster;
import java.util.Date;
public class HisFamily{
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
    //肿瘤家族史
    private String familyTumour;
    //肿瘤血缘亲属与患者的关系
    private String tumourRelative;
    //肿瘤血缘亲属肿瘤疾病名称
    private String relativeTumourName;
    //肠息肉家族史
    private String familyIntestinalPolyps;
    //肠息肉血缘亲属与患者的关系
    private String intestinalPolypsRelative;
    //肠炎家族史
    private String familyEnteritis;
    //肠炎血缘亲属与患者的关系
    private String enteritisRelative;
    //消化道疾病家族史
    private String familyDigestiveTract;
    //消化道疾病血缘亲属与患者的关系
    private String digestiveTractRelative;
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
    public String getFamilyTumour(){
        return familyTumour;
    } 
    public void setFamilyTumour(String familyTumour) {
         this.familyTumour = familyTumour;
    } 
    public String getTumourRelative(){
        return tumourRelative;
    } 
    public void setTumourRelative(String tumourRelative) {
         this.tumourRelative = tumourRelative;
    } 
    public String getRelativeTumourName(){
        return relativeTumourName;
    } 
    public void setRelativeTumourName(String relativeTumourName) {
         this.relativeTumourName = relativeTumourName;
    } 
    public String getFamilyIntestinalPolyps(){
        return familyIntestinalPolyps;
    } 
    public void setFamilyIntestinalPolyps(String familyIntestinalPolyps) {
         this.familyIntestinalPolyps = familyIntestinalPolyps;
    } 
    public String getIntestinalPolypsRelative(){
        return intestinalPolypsRelative;
    } 
    public void setIntestinalPolypsRelative(String intestinalPolypsRelative) {
         this.intestinalPolypsRelative = intestinalPolypsRelative;
    } 
    public String getFamilyEnteritis(){
        return familyEnteritis;
    } 
    public void setFamilyEnteritis(String familyEnteritis) {
         this.familyEnteritis = familyEnteritis;
    } 
    public String getEnteritisRelative(){
        return enteritisRelative;
    } 
    public void setEnteritisRelative(String enteritisRelative) {
         this.enteritisRelative = enteritisRelative;
    } 
    public String getFamilyDigestiveTract(){
        return familyDigestiveTract;
    } 
    public void setFamilyDigestiveTract(String familyDigestiveTract) {
         this.familyDigestiveTract = familyDigestiveTract;
    } 
    public String getDigestiveTractRelative(){
        return digestiveTractRelative;
    } 
    public void setDigestiveTractRelative(String digestiveTractRelative) {
         this.digestiveTractRelative = digestiveTractRelative;
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