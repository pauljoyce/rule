package com.clinical.model.cluster;
import java.util.Date;
public class HisMarriage{
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
    //婚育史
    private String marriageChildbirth;
    //月经出血量
    private String menseBlood;
    //月经周期
    private String menseCycle;
    //月经规律
    private String menseRegular;
    //停经、绝经
    private String menelipsis;
    //末次月经
    private Date last;
    //停经、绝经年龄
    private Integer lastAge;
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
    public String getMarriageChildbirth(){
        return marriageChildbirth;
    } 
    public void setMarriageChildbirth(String marriageChildbirth) {
         this.marriageChildbirth = marriageChildbirth;
    } 
    public String getMenseBlood(){
        return menseBlood;
    } 
    public void setMenseBlood(String menseBlood) {
         this.menseBlood = menseBlood;
    } 
    public String getMenseCycle(){
        return menseCycle;
    } 
    public void setMenseCycle(String menseCycle) {
         this.menseCycle = menseCycle;
    } 
    public String getMenseRegular(){
        return menseRegular;
    } 
    public void setMenseRegular(String menseRegular) {
         this.menseRegular = menseRegular;
    } 
    public String getMenelipsis(){
        return menelipsis;
    } 
    public void setMenelipsis(String menelipsis) {
         this.menelipsis = menelipsis;
    } 
    public Date getLast(){
        return last;
    } 
    public void setLast(Date last) {
         this.last = last;
    } 
    public Integer getLastAge(){
        return lastAge;
    } 
    public void setLastAge(Integer lastAge) {
         this.lastAge = lastAge;
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