package com.clinical.model.cluster;
import java.util.Date;
public class AbdomenMriDes{
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
    //结直肠肿块数目
    private String colorectalQuantityStd;
    //结直肠肿块大小
    private String colorectalSizeStd;
    //转移灶数目
    private String moveQuantityStd;
    //转移灶大小
    private String moveSizeStd;
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
    public String getColorectalQuantityStd(){
        return colorectalQuantityStd;
    } 
    public void setColorectalQuantityStd(String colorectalQuantityStd) {
         this.colorectalQuantityStd = colorectalQuantityStd;
    } 
    public String getColorectalSizeStd(){
        return colorectalSizeStd;
    } 
    public void setColorectalSizeStd(String colorectalSizeStd) {
         this.colorectalSizeStd = colorectalSizeStd;
    } 
    public String getMoveQuantityStd(){
        return moveQuantityStd;
    } 
    public void setMoveQuantityStd(String moveQuantityStd) {
         this.moveQuantityStd = moveQuantityStd;
    } 
    public String getMoveSizeStd(){
        return moveSizeStd;
    } 
    public void setMoveSizeStd(String moveSizeStd) {
         this.moveSizeStd = moveSizeStd;
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