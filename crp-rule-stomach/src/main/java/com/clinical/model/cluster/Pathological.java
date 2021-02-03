package com.clinical.model.cluster;
import java.util.Date;
public class Pathological{
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
    //病理号
    private String caseNumber;
    //送检标本名称
    private String specimenName;
    //送检日期
    private Date inspectTime;
    //收到日期
    private Date receiveTime;
    //报告日期
    private Date reprotTime;
    //肉眼所见
    private String visible;
    //镜下所见
    private String mirror;
    //病理诊断
    private String pathDiag;
    //病理诊断编码
    private String pathDiagCode;
    //大体分型-早期胃癌 
    private String earlyType;
    //大体分型-进展期胃癌
    private String advType;
    //原位癌
    private String carcinomaSitu;
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
    public String getCaseNumber(){
        return caseNumber;
    } 
    public void setCaseNumber(String caseNumber) {
         this.caseNumber = caseNumber;
    } 
    public String getSpecimenName(){
        return specimenName;
    } 
    public void setSpecimenName(String specimenName) {
         this.specimenName = specimenName;
    } 
    public Date getInspectTime(){
        return inspectTime;
    } 
    public void setInspectTime(Date inspectTime) {
         this.inspectTime = inspectTime;
    } 
    public Date getReceiveTime(){
        return receiveTime;
    } 
    public void setReceiveTime(Date receiveTime) {
         this.receiveTime = receiveTime;
    } 
    public Date getReprotTime(){
        return reprotTime;
    } 
    public void setReprotTime(Date reprotTime) {
         this.reprotTime = reprotTime;
    } 
    public String getVisible(){
        return visible;
    } 
    public void setVisible(String visible) {
         this.visible = visible;
    } 
    public String getMirror(){
        return mirror;
    } 
    public void setMirror(String mirror) {
         this.mirror = mirror;
    } 
    public String getPathDiag(){
        return pathDiag;
    } 
    public void setPathDiag(String pathDiag) {
         this.pathDiag = pathDiag;
    } 
    public String getPathDiagCode(){
        return pathDiagCode;
    } 
    public void setPathDiagCode(String pathDiagCode) {
         this.pathDiagCode = pathDiagCode;
    } 
    public String getEarlyType(){
        return earlyType;
    } 
    public void setEarlyType(String earlyType) {
         this.earlyType = earlyType;
    } 
    public String getAdvType(){
        return advType;
    } 
    public void setAdvType(String advType) {
         this.advType = advType;
    } 
    public String getCarcinomaSitu(){
        return carcinomaSitu;
    } 
    public void setCarcinomaSitu(String carcinomaSitu) {
         this.carcinomaSitu = carcinomaSitu;
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