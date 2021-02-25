package com.clinical.model.cluster;
import java.util.Date;
public class BeforeTreatment{
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
    //术前是否使用止血药物“维生素K”
    private String vitaminK;
    //术前是否服用“乳果糖”
    private String lactulose;
    //术前是否服用“聚乙二醇（PEG）/聚乙二醇电解质散剂/复方聚乙二醇电解质散/和爽/福静清”
    private String polyethyleneGlycol;
    //术前是否服用“硫酸镁”
    private String magnesiumSulphate;
    //术前是否服用“磷酸钠”
    private String sodiumPhosphate;
    //术前是否服用“番泻叶”
    private String sennaLeaf;
    //术前是否服用“蓖麻油”
    private String castorOil;
    //术前是否服用“复方匹可硫酸钠”
    private String compoundSodiumPicosulfate;
    //术前是否服用“甘露醇”
    private String mannitol;
    //术前是否使用“磷酸钠盐”
    private String sodiumPhosphateSalt;
    //术前是否“清洁灌肠/机械灌肠”
    private String cleaningEnema;
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
    public String getVitaminK(){
        return vitaminK;
    } 
    public void setVitaminK(String vitaminK) {
         this.vitaminK = vitaminK;
    } 
    public String getLactulose(){
        return lactulose;
    } 
    public void setLactulose(String lactulose) {
         this.lactulose = lactulose;
    } 
    public String getPolyethyleneGlycol(){
        return polyethyleneGlycol;
    } 
    public void setPolyethyleneGlycol(String polyethyleneGlycol) {
         this.polyethyleneGlycol = polyethyleneGlycol;
    } 
    public String getMagnesiumSulphate(){
        return magnesiumSulphate;
    } 
    public void setMagnesiumSulphate(String magnesiumSulphate) {
         this.magnesiumSulphate = magnesiumSulphate;
    } 
    public String getSodiumPhosphate(){
        return sodiumPhosphate;
    }
    public void setSodiumPhosphate(String sodiumPhosphate) {
         this.sodiumPhosphate = sodiumPhosphate;
    }
    public String getSennaLeaf(){
        return sennaLeaf;
    } 
    public void setSennaLeaf(String sennaLeaf) {
         this.sennaLeaf = sennaLeaf;
    } 
    public String getCastorOil(){
        return castorOil;
    } 
    public void setCastorOil(String castorOil) {
         this.castorOil = castorOil;
    } 
    public String getCompoundSodiumPicosulfate(){
        return compoundSodiumPicosulfate;
    } 
    public void setCompoundSodiumPicosulfate(String compoundSodiumPicosulfate) {
         this.compoundSodiumPicosulfate = compoundSodiumPicosulfate;
    } 
    public String getMannitol(){
        return mannitol;
    } 
    public void setMannitol(String mannitol) {
         this.mannitol = mannitol;
    } 
    public String getSodiumPhosphateSalt(){
        return sodiumPhosphateSalt;
    } 
    public void setSodiumPhosphateSalt(String sodiumPhosphateSalt) {
         this.sodiumPhosphateSalt = sodiumPhosphateSalt;
    } 
    public String getCleaningEnema(){
        return cleaningEnema;
    } 
    public void setCleaningEnema(String cleaningEnema) {
         this.cleaningEnema = cleaningEnema;
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