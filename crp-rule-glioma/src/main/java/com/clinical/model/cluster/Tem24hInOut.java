package com.clinical.model.cluster;
import java.util.Date;
public class Tem24hInOut{
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
    //住院号
    private String visitId;
    //年龄
    private Integer age;
    //病案号
    private String tpatno;
    //病房号
    private String roomNo;
    //病床号
    private String bedNo;
    //活动记录状态
    private String recordStatus;
    //就诊类型
    private Integer visitType;
    //科室名称
    private String departmentName;
    //病区
    private String inpatientArea;
    //住院次数
    private Integer admissionNumber;
    //病人姓名
    private String tpatname;
    //入院日期
    private Date admissionDateTime;
    //出院日期
    private Date dischargeDateTime;
    //实际住院天数
    private Integer tzyDays;
    //病史陈述者
    private String medicalHistoryNarrator;
    //患者病史陈述者与患者关系
    private String relationshipBetweenPatient;
    //入院情况
    private String admissionStatus;
    //入院诊断
    private String admissionDiagnosis;
    //诊疗经过
    private String tzlProcess;
    //主诉
    private String chiefComplaint;
    //现病史
    private String hyPresent;
    //家族史
    private String hyFamily;
    //既往史
    private String hyPats;
    //个人史
    private String hyIndividual;
    //婚育史
    private String historyOfMarrChild;
    //月经史
    private String menstrualHistorySta;
    //出院情况
    private String dischargeStatus;
    //病情转归情况
    private String diseaseOutcome;
    //出院诊断
    private String dischargeDiagnosis;
    //出院医嘱
    private String dischargeOrder;
    //医师签名
    private String doctorSign;
    //记录时间
    private Date recordTime;
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
    public Integer getAge(){
        return age;
    } 
    public void setAge(Integer age) {
         this.age = age;
    } 
    public String getTpatno(){
        return tpatno;
    } 
    public void setTpatno(String tpatno) {
         this.tpatno = tpatno;
    } 
    public String getRoomNo(){
        return roomNo;
    } 
    public void setRoomNo(String roomNo) {
         this.roomNo = roomNo;
    } 
    public String getBedNo(){
        return bedNo;
    } 
    public void setBedNo(String bedNo) {
         this.bedNo = bedNo;
    } 
    public String getRecordStatus(){
        return recordStatus;
    } 
    public void setRecordStatus(String recordStatus) {
         this.recordStatus = recordStatus;
    } 
    public Integer getVisitType(){
        return visitType;
    } 
    public void setVisitType(Integer visitType) {
         this.visitType = visitType;
    } 
    public String getDepartmentName(){
        return departmentName;
    } 
    public void setDepartmentName(String departmentName) {
         this.departmentName = departmentName;
    } 
    public String getInpatientArea(){
        return inpatientArea;
    } 
    public void setInpatientArea(String inpatientArea) {
         this.inpatientArea = inpatientArea;
    } 
    public Integer getAdmissionNumber(){
        return admissionNumber;
    } 
    public void setAdmissionNumber(Integer admissionNumber) {
         this.admissionNumber = admissionNumber;
    } 
    public String getTpatname(){
        return tpatname;
    } 
    public void setTpatname(String tpatname) {
         this.tpatname = tpatname;
    } 
    public Date getAdmissionDateTime(){
        return admissionDateTime;
    } 
    public void setAdmissionDateTime(Date admissionDateTime) {
         this.admissionDateTime = admissionDateTime;
    } 
    public Date getDischargeDateTime(){
        return dischargeDateTime;
    } 
    public void setDischargeDateTime(Date dischargeDateTime) {
         this.dischargeDateTime = dischargeDateTime;
    } 
    public Integer getTzyDays(){
        return tzyDays;
    } 
    public void setTzyDays(Integer tzyDays) {
         this.tzyDays = tzyDays;
    } 
    public String getMedicalHistoryNarrator(){
        return medicalHistoryNarrator;
    } 
    public void setMedicalHistoryNarrator(String medicalHistoryNarrator) {
         this.medicalHistoryNarrator = medicalHistoryNarrator;
    } 
    public String getRelationshipBetweenPatient(){
        return relationshipBetweenPatient;
    } 
    public void setRelationshipBetweenPatient(String relationshipBetweenPatient) {
         this.relationshipBetweenPatient = relationshipBetweenPatient;
    } 
    public String getAdmissionStatus(){
        return admissionStatus;
    } 
    public void setAdmissionStatus(String admissionStatus) {
         this.admissionStatus = admissionStatus;
    } 
    public String getAdmissionDiagnosis(){
        return admissionDiagnosis;
    } 
    public void setAdmissionDiagnosis(String admissionDiagnosis) {
         this.admissionDiagnosis = admissionDiagnosis;
    } 
    public String getTzlProcess(){
        return tzlProcess;
    } 
    public void setTzlProcess(String tzlProcess) {
         this.tzlProcess = tzlProcess;
    } 
    public String getChiefComplaint(){
        return chiefComplaint;
    } 
    public void setChiefComplaint(String chiefComplaint) {
         this.chiefComplaint = chiefComplaint;
    } 
    public String getHyPresent(){
        return hyPresent;
    } 
    public void setHyPresent(String hyPresent) {
         this.hyPresent = hyPresent;
    } 
    public String getHyFamily(){
        return hyFamily;
    } 
    public void setHyFamily(String hyFamily) {
         this.hyFamily = hyFamily;
    } 
    public String getHyPats(){
        return hyPats;
    } 
    public void setHyPats(String hyPats) {
         this.hyPats = hyPats;
    } 
    public String getHyIndividual(){
        return hyIndividual;
    } 
    public void setHyIndividual(String hyIndividual) {
         this.hyIndividual = hyIndividual;
    } 
    public String getHistoryOfMarrChild(){
        return historyOfMarrChild;
    } 
    public void setHistoryOfMarrChild(String historyOfMarrChild) {
         this.historyOfMarrChild = historyOfMarrChild;
    } 
    public String getMenstrualHistorySta(){
        return menstrualHistorySta;
    } 
    public void setMenstrualHistorySta(String menstrualHistorySta) {
         this.menstrualHistorySta = menstrualHistorySta;
    } 
    public String getDischargeStatus(){
        return dischargeStatus;
    } 
    public void setDischargeStatus(String dischargeStatus) {
         this.dischargeStatus = dischargeStatus;
    } 
    public String getDiseaseOutcome(){
        return diseaseOutcome;
    } 
    public void setDiseaseOutcome(String diseaseOutcome) {
         this.diseaseOutcome = diseaseOutcome;
    } 
    public String getDischargeDiagnosis(){
        return dischargeDiagnosis;
    } 
    public void setDischargeDiagnosis(String dischargeDiagnosis) {
         this.dischargeDiagnosis = dischargeDiagnosis;
    } 
    public String getDischargeOrder(){
        return dischargeOrder;
    } 
    public void setDischargeOrder(String dischargeOrder) {
         this.dischargeOrder = dischargeOrder;
    } 
    public String getDoctorSign(){
        return doctorSign;
    } 
    public void setDoctorSign(String doctorSign) {
         this.doctorSign = doctorSign;
    } 
    public Date getRecordTime(){
        return recordTime;
    } 
    public void setRecordTime(Date recordTime) {
         this.recordTime = recordTime;
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