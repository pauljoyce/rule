package com.clinical.model.cluster;
import java.util.Date;
public class TemOutpDischargeStatus{
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
    //住院次数
    private Integer admissionNumber;
    //病人姓名
    private String tpatname;
    //病案号
    private String tpatno;
    //就诊类型
    private Integer visitType;
    //年龄
    private Integer age;
    //科室名称
    private String departmentName;
    //病区
    private String inpatientArea;
    //病房号
    private String roomNo;
    //病床号
    private String bedNo;
    //活动记录状态
    private String recordStatus;
    //入院日期
    private Date admissionDateTime;
    //实际住院天数
    private Integer tzyDays;
    //入院情况
    private String copStatus;
    //诊疗经过
    private String tzlProcess;
    //出院情况_出院症状与体征_出院小结
    private String dischargeStatus;
    //出院日期
    private Date dischargeDateTime;
    //入院诊断
    private String admissionDiagnosis;
    //出院诊断
    private String dischargeDiagnosis;
    //治疗效果_转归
    private String treatmentEffect;
    //出院医嘱
    private String dischargeOrder;
    //医生签名
    private String doctorSign;
    //记录时间
    private Date recordDateTime;
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
    public String getTpatno(){
        return tpatno;
    } 
    public void setTpatno(String tpatno) {
         this.tpatno = tpatno;
    } 
    public Integer getVisitType(){
        return visitType;
    } 
    public void setVisitType(Integer visitType) {
         this.visitType = visitType;
    } 
    public Integer getAge(){
        return age;
    } 
    public void setAge(Integer age) {
         this.age = age;
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
    public Date getAdmissionDateTime(){
        return admissionDateTime;
    } 
    public void setAdmissionDateTime(Date admissionDateTime) {
         this.admissionDateTime = admissionDateTime;
    } 
    public Integer getTzyDays(){
        return tzyDays;
    } 
    public void setTzyDays(Integer tzyDays) {
         this.tzyDays = tzyDays;
    } 
    public String getCopStatus(){
        return copStatus;
    } 
    public void setCopStatus(String copStatus) {
         this.copStatus = copStatus;
    } 
    public String getTzlProcess(){
        return tzlProcess;
    } 
    public void setTzlProcess(String tzlProcess) {
         this.tzlProcess = tzlProcess;
    } 
    public String getDischargeStatus(){
        return dischargeStatus;
    } 
    public void setDischargeStatus(String dischargeStatus) {
         this.dischargeStatus = dischargeStatus;
    } 
    public Date getDischargeDateTime(){
        return dischargeDateTime;
    } 
    public void setDischargeDateTime(Date dischargeDateTime) {
         this.dischargeDateTime = dischargeDateTime;
    } 
    public String getAdmissionDiagnosis(){
        return admissionDiagnosis;
    } 
    public void setAdmissionDiagnosis(String admissionDiagnosis) {
         this.admissionDiagnosis = admissionDiagnosis;
    } 
    public String getDischargeDiagnosis(){
        return dischargeDiagnosis;
    } 
    public void setDischargeDiagnosis(String dischargeDiagnosis) {
         this.dischargeDiagnosis = dischargeDiagnosis;
    } 
    public String getTreatmentEffect(){
        return treatmentEffect;
    } 
    public void setTreatmentEffect(String treatmentEffect) {
         this.treatmentEffect = treatmentEffect;
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
    public Date getRecordDateTime(){
        return recordDateTime;
    } 
    public void setRecordDateTime(Date recordDateTime) {
         this.recordDateTime = recordDateTime;
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