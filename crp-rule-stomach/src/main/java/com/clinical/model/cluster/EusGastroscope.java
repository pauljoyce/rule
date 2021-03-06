package com.clinical.model.cluster;
import java.util.Date;
public class EusGastroscope{
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
    //就诊标识住院号
    private String visitId;
    //检查号
    private String examNo;
    //检查项目
    private String examName;
    //病灶位置
    private String structure;
    //病灶大小
    private String focusSize;
    //病灶数量
    private String focusCount;
    //病灶上缘距齿状线距离
    private String subStructure;
    //山田分型
    private String stType;
    //pit 分型
    private String pitType;
    //JNET分型
    private String jnetType;
    //HP 试验
    private String examParaHp;
    //胃周肿大淋巴结 
    private String perigastricEnlargedLymph;
    //腹水
    private String ascites;
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
    public String getFocusSize(){
        return focusSize;
    } 
    public void setFocusSize(String focusSize) {
         this.focusSize = focusSize;
    } 
    public String getFocusCount(){
        return focusCount;
    } 
    public void setFocusCount(String focusCount) {
         this.focusCount = focusCount;
    } 
    public String getSubStructure(){
        return subStructure;
    } 
    public void setSubStructure(String subStructure) {
         this.subStructure = subStructure;
    } 
    public String getStType(){
        return stType;
    } 
    public void setStType(String stType) {
         this.stType = stType;
    } 
    public String getPitType(){
        return pitType;
    } 
    public void setPitType(String pitType) {
         this.pitType = pitType;
    } 
    public String getJnetType(){
        return jnetType;
    } 
    public void setJnetType(String jnetType) {
         this.jnetType = jnetType;
    } 
    public String getExamParaHp(){
        return examParaHp;
    } 
    public void setExamParaHp(String examParaHp) {
         this.examParaHp = examParaHp;
    } 
    public String getPerigastricEnlargedLymph(){
        return perigastricEnlargedLymph;
    } 
    public void setPerigastricEnlargedLymph(String perigastricEnlargedLymph) {
         this.perigastricEnlargedLymph = perigastricEnlargedLymph;
    } 
    public String getAscites(){
        return ascites;
    } 
    public void setAscites(String ascites) {
         this.ascites = ascites;
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