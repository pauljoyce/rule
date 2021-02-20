package com.clinical.model.cluster;
import java.util.Date;
public class SurgicalRecord{
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
    //手术术式是否为根治术
    private String radicalOperation;
    //手术重建方法
    private String reconstructionMethods;
    //切口部位是否包括上腹
    private String incisionEpigastric;
    //切口部位是否绕脐
    private String incisionAroundNavel;
    //切口部位是否包括下腹
    private String incisionalLowerAbdomen;
    //手术切口长度
    private String incisionLength;
    //是否术中肠镜
    private String intraoperativeEnteroscopy;
    //术中灌洗
    private String intraoperativeLavage;
    //术中化疗
    private String intraoperativeChemotherapy;
    //术中化疗药物
    private String chemotherapeuticDrugs;
    //术中是否留置引流管
    private String indwellingDrainageTube;
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
    public String getRadicalOperation(){
        return radicalOperation;
    } 
    public void setRadicalOperation(String radicalOperation) {
         this.radicalOperation = radicalOperation;
    } 
    public String getReconstructionMethods(){
        return reconstructionMethods;
    } 
    public void setReconstructionMethods(String reconstructionMethods) {
         this.reconstructionMethods = reconstructionMethods;
    } 
    public String getIncisionEpigastric(){
        return incisionEpigastric;
    } 
    public void setIncisionEpigastric(String incisionEpigastric) {
         this.incisionEpigastric = incisionEpigastric;
    } 
    public String getIncisionAroundNavel(){
        return incisionAroundNavel;
    } 
    public void setIncisionAroundNavel(String incisionAroundNavel) {
         this.incisionAroundNavel = incisionAroundNavel;
    } 
    public String getIncisionalLowerAbdomen(){
        return incisionalLowerAbdomen;
    } 
    public void setIncisionalLowerAbdomen(String incisionalLowerAbdomen) {
         this.incisionalLowerAbdomen = incisionalLowerAbdomen;
    } 
    public String getIncisionLength(){
        return incisionLength;
    } 
    public void setIncisionLength(String incisionLength) {
         this.incisionLength = incisionLength;
    } 
    public String getIntraoperativeEnteroscopy(){
        return intraoperativeEnteroscopy;
    } 
    public void setIntraoperativeEnteroscopy(String intraoperativeEnteroscopy) {
         this.intraoperativeEnteroscopy = intraoperativeEnteroscopy;
    } 
    public String getIntraoperativeLavage(){
        return intraoperativeLavage;
    } 
    public void setIntraoperativeLavage(String intraoperativeLavage) {
         this.intraoperativeLavage = intraoperativeLavage;
    } 
    public String getIntraoperativeChemotherapy(){
        return intraoperativeChemotherapy;
    } 
    public void setIntraoperativeChemotherapy(String intraoperativeChemotherapy) {
         this.intraoperativeChemotherapy = intraoperativeChemotherapy;
    } 
    public String getChemotherapeuticDrugs(){
        return chemotherapeuticDrugs;
    } 
    public void setChemotherapeuticDrugs(String chemotherapeuticDrugs) {
         this.chemotherapeuticDrugs = chemotherapeuticDrugs;
    } 
    public String getIndwellingDrainageTube(){
        return indwellingDrainageTube;
    } 
    public void setIndwellingDrainageTube(String indwellingDrainageTube) {
         this.indwellingDrainageTube = indwellingDrainageTube;
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