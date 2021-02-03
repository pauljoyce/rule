package com.clinical.model.cluster;
import java.util.Date;
public class PetCtDes{
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
    //就诊标识住院号
    private String visitId;
    //检查号
    private String examNo;
    //检查项目
    private String examName;
    //部位
    private String structure;
    //定位
    private String location;
    //病灶
    private String lesion;
    //大小
    private String size;
    //数目
    private String quanity;
    //颅脑肿物
    private String lesionStd;
    //颅脑肿物大小
    private String sizeStd;
    //颅脑肿物数目
    private String quantityStd;
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
    public String getExamNo(){
        return examNo;
    } 
    public void setExamNo(String examNo) {
         this.examNo = examNo;
    } 
    public String getExamName(){
        return examName;
    } 
    public void setExamName(String examName) {
         this.examName = examName;
    } 
    public String getStructure(){
        return structure;
    } 
    public void setStructure(String structure) {
         this.structure = structure;
    } 
    public String getLocation(){
        return location;
    } 
    public void setLocation(String location) {
         this.location = location;
    } 
    public String getLesion(){
        return lesion;
    } 
    public void setLesion(String lesion) {
         this.lesion = lesion;
    } 
    public String getSize(){
        return size;
    } 
    public void setSize(String size) {
         this.size = size;
    } 
    public String getQuanity(){
        return quanity;
    } 
    public void setQuanity(String quanity) {
         this.quanity = quanity;
    } 
    public String getLesionStd(){
        return lesionStd;
    } 
    public void setLesionStd(String lesionStd) {
         this.lesionStd = lesionStd;
    } 
    public String getSizeStd(){
        return sizeStd;
    } 
    public void setSizeStd(String sizeStd) {
         this.sizeStd = sizeStd;
    } 
    public String getQuantityStd(){
        return quantityStd;
    } 
    public void setQuantityStd(String quantityStd) {
         this.quantityStd = quantityStd;
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