package com.clinical.model.cluster;
import java.util.Date;
public class ChemotherapyDrug{
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
    //化疗的unque_id
    private String uniqueIdLv3;
    //化疗药物
    private String chemDrug;
    //化疗药品单次用药剂量
    private String chemSingleDose;
    //化疗药品单次用药剂量单位
    private String chemSingleDoseUnit;
    //化疗药品用药频次
    private String chemFrequency;
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
    public String getUniqueIdLv3(){
        return uniqueIdLv3;
    } 
    public void setUniqueIdLv3(String uniqueIdLv3) {
         this.uniqueIdLv3 = uniqueIdLv3;
    } 
    public String getChemDrug(){
        return chemDrug;
    } 
    public void setChemDrug(String chemDrug) {
         this.chemDrug = chemDrug;
    } 
    public String getChemSingleDose(){
        return chemSingleDose;
    } 
    public void setChemSingleDose(String chemSingleDose) {
         this.chemSingleDose = chemSingleDose;
    } 
    public String getChemSingleDoseUnit(){
        return chemSingleDoseUnit;
    } 
    public void setChemSingleDoseUnit(String chemSingleDoseUnit) {
         this.chemSingleDoseUnit = chemSingleDoseUnit;
    } 
    public String getChemFrequency(){
        return chemFrequency;
    } 
    public void setChemFrequency(String chemFrequency) {
         this.chemFrequency = chemFrequency;
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