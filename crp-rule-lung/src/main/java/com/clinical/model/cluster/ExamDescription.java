package com.clinical.model.cluster;
import java.util.Date;
public class ExamDescription{
    //主键id
    private Integer id;
    //标识患者身份唯一标识
    private String personId;
    //唯一标识
    private String uniqueId;
    //关联检查表
    private String uniqueIdLv3;
    //医疗机构代码
    private String p900;
    //患者id
    private String patientId;
    //住院号
    private String visitId;
    //检查号
    private String examNo;
    //病灶部位
    private String structureSite;
    //病灶定位
    private String structureSubSite;
    //检查所见
    private String lesion;
    //检查所见类型
    private String lesionType;
    //病灶数目
    private String quantityStd;
    //病灶大小
    private String lesionSize;
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
    public String getUniqueIdLv3(){
        return uniqueIdLv3;
    } 
    public void setUniqueIdLv3(String uniqueIdLv3) {
         this.uniqueIdLv3 = uniqueIdLv3;
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
    public String getExamNo(){
        return examNo;
    } 
    public void setExamNo(String examNo) {
         this.examNo = examNo;
    } 
    public String getStructureSite(){
        return structureSite;
    } 
    public void setStructureSite(String structureSite) {
         this.structureSite = structureSite;
    } 
    public String getStructureSubSite(){
        return structureSubSite;
    } 
    public void setStructureSubSite(String structureSubSite) {
         this.structureSubSite = structureSubSite;
    } 
    public String getLesion(){
        return lesion;
    } 
    public void setLesion(String lesion) {
         this.lesion = lesion;
    } 
    public String getLesionType(){
        return lesionType;
    } 
    public void setLesionType(String lesionType) {
         this.lesionType = lesionType;
    } 
    public String getQuantityStd(){
        return quantityStd;
    } 
    public void setQuantityStd(String quantityStd) {
         this.quantityStd = quantityStd;
    } 
    public String getLesionSize(){
        return lesionSize;
    } 
    public void setLesionSize(String lesionSize) {
         this.lesionSize = lesionSize;
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