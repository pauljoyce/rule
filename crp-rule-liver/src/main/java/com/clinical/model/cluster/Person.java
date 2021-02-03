package com.clinical.model.cluster;
import java.util.Date;
public class Person{
    //主键id
    private Integer id;
    //唯一标识
    private String uniqueId;
    //医疗机构代码
    private String p900;
    //患者id
    private String patientId;
    //住院号
    private String visitId;
    //姓名
    private String name;
    //性别
    private String sex;
    //出生日期
    private Date dateOfBirth;
    //出生地
    private String birthPlace;
    //国籍
    private String citizenship;
    //民族
    private String nation;
    //身份证号
    private String idNo;
    //合同单位
    private String unitInContract;
    //住址
    private String mailingAddress;
    //联系人
    private String nextOfKin;
    //联系电话
    private String telephone;
    //与联系人关系
    private String relationship;
    //入院来源
    private String patientClass;
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
    public String getName(){
        return name;
    } 
    public void setName(String name) {
         this.name = name;
    } 
    public String getSex(){
        return sex;
    } 
    public void setSex(String sex) {
         this.sex = sex;
    } 
    public Date getDateOfBirth(){
        return dateOfBirth;
    } 
    public void setDateOfBirth(Date dateOfBirth) {
         this.dateOfBirth = dateOfBirth;
    } 
    public String getBirthPlace(){
        return birthPlace;
    } 
    public void setBirthPlace(String birthPlace) {
         this.birthPlace = birthPlace;
    } 
    public String getCitizenship(){
        return citizenship;
    } 
    public void setCitizenship(String citizenship) {
         this.citizenship = citizenship;
    } 
    public String getNation(){
        return nation;
    } 
    public void setNation(String nation) {
         this.nation = nation;
    } 
    public String getIdNo(){
        return idNo;
    } 
    public void setIdNo(String idNo) {
         this.idNo = idNo;
    } 
    public String getUnitInContract(){
        return unitInContract;
    } 
    public void setUnitInContract(String unitInContract) {
         this.unitInContract = unitInContract;
    } 
    public String getMailingAddress(){
        return mailingAddress;
    } 
    public void setMailingAddress(String mailingAddress) {
         this.mailingAddress = mailingAddress;
    } 
    public String getNextOfKin(){
        return nextOfKin;
    } 
    public void setNextOfKin(String nextOfKin) {
         this.nextOfKin = nextOfKin;
    } 
    public String getTelephone(){
        return telephone;
    } 
    public void setTelephone(String telephone) {
         this.telephone = telephone;
    } 
    public String getRelationship(){
        return relationship;
    } 
    public void setRelationship(String relationship) {
         this.relationship = relationship;
    } 
    public String getPatientClass(){
        return patientClass;
    } 
    public void setPatientClass(String patientClass) {
         this.patientClass = patientClass;
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