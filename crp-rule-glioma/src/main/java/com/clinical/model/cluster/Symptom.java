package com.clinical.model.cluster;
import java.util.Date;
public class Symptom{
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
    //门诊/住院号
    private String visitId;
    //症状
    private String symptoms;
    //左上肢肌力
    private String leftUpMuscle;
    //左下肢肌力
    private String leftDownMuscle;
    //右上肢肌力
    private String rightUpMuscle;
    //右下肢肌力
    private String rightDownMuscle;
    //左上肢肌张力
    private String leftUpMuscleTone;
    //左下肢肌张力
    private String leftDownMuscleTone;
    //右上肢肌张力
    private String rightUpMuscleTone;
    //右下肢肌张力
    private String rightDownMuscleTone;
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
    public String getSymptoms(){
        return symptoms;
    } 
    public void setSymptoms(String symptoms) {
         this.symptoms = symptoms;
    } 
    public String getLeftUpMuscle(){
        return leftUpMuscle;
    } 
    public void setLeftUpMuscle(String leftUpMuscle) {
         this.leftUpMuscle = leftUpMuscle;
    } 
    public String getLeftDownMuscle(){
        return leftDownMuscle;
    } 
    public void setLeftDownMuscle(String leftDownMuscle) {
         this.leftDownMuscle = leftDownMuscle;
    } 
    public String getRightUpMuscle(){
        return rightUpMuscle;
    } 
    public void setRightUpMuscle(String rightUpMuscle) {
         this.rightUpMuscle = rightUpMuscle;
    } 
    public String getRightDownMuscle(){
        return rightDownMuscle;
    } 
    public void setRightDownMuscle(String rightDownMuscle) {
         this.rightDownMuscle = rightDownMuscle;
    } 
    public String getLeftUpMuscleTone(){
        return leftUpMuscleTone;
    } 
    public void setLeftUpMuscleTone(String leftUpMuscleTone) {
         this.leftUpMuscleTone = leftUpMuscleTone;
    } 
    public String getLeftDownMuscleTone(){
        return leftDownMuscleTone;
    } 
    public void setLeftDownMuscleTone(String leftDownMuscleTone) {
         this.leftDownMuscleTone = leftDownMuscleTone;
    } 
    public String getRightUpMuscleTone(){
        return rightUpMuscleTone;
    } 
    public void setRightUpMuscleTone(String rightUpMuscleTone) {
         this.rightUpMuscleTone = rightUpMuscleTone;
    } 
    public String getRightDownMuscleTone(){
        return rightDownMuscleTone;
    } 
    public void setRightDownMuscleTone(String rightDownMuscleTone) {
         this.rightDownMuscleTone = rightDownMuscleTone;
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