package com.clinical.model.cluster;
import java.util.Date;
public class ChestCtDes{
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
    //部位标化
    private String structureStd;
    //定位标化
    private String structureSiteStd;
    //病灶标化
    private String lesionStd;
    //病灶类型标化
    private String lesionTypeStd;
    //大小标化
    private String sizeStd;
    //数目标化
    private String quantityStd;
    //转移灶数目
    private String desTransferCount;
    //转移灶大小
    private String desTransferSize;
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
    public String getStructureStd(){
        return structureStd;
    } 
    public void setStructureStd(String structureStd) {
             this.structureStd = structureStd;
    } 
    public String getStructureSiteStd(){
        return structureSiteStd;
    } 
    public void setStructureSiteStd(String structureSiteStd) {
             this.structureSiteStd = structureSiteStd;
    } 
    public String getLesionStd(){
        return lesionStd;
    } 
    public void setLesionStd(String lesionStd) {
             this.lesionStd = lesionStd;
    } 
    public String getLesionTypeStd(){
        return lesionTypeStd;
    } 
    public void setLesionTypeStd(String lesionTypeStd) {
             this.lesionTypeStd = lesionTypeStd;
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
    public String getDesTransferCount(){
        return desTransferCount;
    } 
    public void setDesTransferCount(String desTransferCount) {
             this.desTransferCount = desTransferCount;
    } 
    public String getDesTransferSize(){
        return desTransferSize;
    } 
    public void setDesTransferSize(String desTransferSize) {
             this.desTransferSize = desTransferSize;
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