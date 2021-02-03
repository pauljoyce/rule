package com.clinical.model.cluster;
import java.util.Date;
public class EmergencyRecord{
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
    //抢救开始时间
    private Date startTime;
    //抢救结束时间
    private Date endTime;
    //抢救地点
    private String location;
    //主要生命体征描述
    private String vitalsignsDescription;
    //呼吸心跳停止时间
    private Date cardioRespiratoryArrestTime;
    //抢救措施
    private String rescueDescription;
    //家属要求放弃抢救
    private String familyMemberDoNotResuscitate;
    //抢救主题
    private String rescueTopic;
    //抢救记录内容
    private String emergencyNote;
    //参加抢救人员
    private String emergencyPersonnel;
    //记录时间
    private Date recordTime;
    //医师签名
    private String doctorSign;
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
    public Date getStartTime(){
        return startTime;
    } 
    public void setStartTime(Date startTime) {
         this.startTime = startTime;
    } 
    public Date getEndTime(){
        return endTime;
    } 
    public void setEndTime(Date endTime) {
         this.endTime = endTime;
    } 
    public String getLocation(){
        return location;
    } 
    public void setLocation(String location) {
         this.location = location;
    } 
    public String getVitalsignsDescription(){
        return vitalsignsDescription;
    } 
    public void setVitalsignsDescription(String vitalsignsDescription) {
         this.vitalsignsDescription = vitalsignsDescription;
    } 
    public Date getCardioRespiratoryArrestTime(){
        return cardioRespiratoryArrestTime;
    } 
    public void setCardioRespiratoryArrestTime(Date cardioRespiratoryArrestTime) {
         this.cardioRespiratoryArrestTime = cardioRespiratoryArrestTime;
    } 
    public String getRescueDescription(){
        return rescueDescription;
    } 
    public void setRescueDescription(String rescueDescription) {
         this.rescueDescription = rescueDescription;
    } 
    public String getFamilyMemberDoNotResuscitate(){
        return familyMemberDoNotResuscitate;
    } 
    public void setFamilyMemberDoNotResuscitate(String familyMemberDoNotResuscitate) {
         this.familyMemberDoNotResuscitate = familyMemberDoNotResuscitate;
    } 
    public String getRescueTopic(){
        return rescueTopic;
    } 
    public void setRescueTopic(String rescueTopic) {
         this.rescueTopic = rescueTopic;
    } 
    public String getEmergencyNote(){
        return emergencyNote;
    } 
    public void setEmergencyNote(String emergencyNote) {
         this.emergencyNote = emergencyNote;
    } 
    public String getEmergencyPersonnel(){
        return emergencyPersonnel;
    } 
    public void setEmergencyPersonnel(String emergencyPersonnel) {
         this.emergencyPersonnel = emergencyPersonnel;
    } 
    public Date getRecordTime(){
        return recordTime;
    } 
    public void setRecordTime(Date recordTime) {
         this.recordTime = recordTime;
    } 
    public String getDoctorSign(){
        return doctorSign;
    } 
    public void setDoctorSign(String doctorSign) {
         this.doctorSign = doctorSign;
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