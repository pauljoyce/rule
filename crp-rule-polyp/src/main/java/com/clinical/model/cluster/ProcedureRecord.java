package com.clinical.model.cluster;
import java.util.Date;
public class ProcedureRecord{
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
    //治疗主题
    private String treatmentMajorPoints;
    //治疗记录
    private String treatmentNote;
    //患者一般状况
    private String generalCondition;
    //处理及指导意见
    private String managementAndInstructions;
    //过程是否顺利
    private String isSuccessful;
    //是否有不良反应
    private String isAdverseReaction;
    //医嘱使用备注
    private String commentForOrder;
    //后续注意事项
    private String mattersNeedingAttention;
    //今后治疗方案
    private String treatmentPlanHereafter;
    //住院次数
    private Integer admissionNumber;
    //操作名称
    private String operationName;
    //操作过程
    private String operationProcess;
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
    public String getTreatmentMajorPoints(){
        return treatmentMajorPoints;
    } 
    public void setTreatmentMajorPoints(String treatmentMajorPoints) {
         this.treatmentMajorPoints = treatmentMajorPoints;
    } 
    public String getTreatmentNote(){
        return treatmentNote;
    } 
    public void setTreatmentNote(String treatmentNote) {
         this.treatmentNote = treatmentNote;
    } 
    public String getGeneralCondition(){
        return generalCondition;
    } 
    public void setGeneralCondition(String generalCondition) {
         this.generalCondition = generalCondition;
    } 
    public String getManagementAndInstructions(){
        return managementAndInstructions;
    } 
    public void setManagementAndInstructions(String managementAndInstructions) {
         this.managementAndInstructions = managementAndInstructions;
    } 
    public String getIsSuccessful(){
        return isSuccessful;
    } 
    public void setIsSuccessful(String isSuccessful) {
         this.isSuccessful = isSuccessful;
    } 
    public String getIsAdverseReaction(){
        return isAdverseReaction;
    } 
    public void setIsAdverseReaction(String isAdverseReaction) {
         this.isAdverseReaction = isAdverseReaction;
    } 
    public String getCommentForOrder(){
        return commentForOrder;
    } 
    public void setCommentForOrder(String commentForOrder) {
         this.commentForOrder = commentForOrder;
    } 
    public String getMattersNeedingAttention(){
        return mattersNeedingAttention;
    } 
    public void setMattersNeedingAttention(String mattersNeedingAttention) {
         this.mattersNeedingAttention = mattersNeedingAttention;
    } 
    public String getTreatmentPlanHereafter(){
        return treatmentPlanHereafter;
    } 
    public void setTreatmentPlanHereafter(String treatmentPlanHereafter) {
         this.treatmentPlanHereafter = treatmentPlanHereafter;
    } 
    public Integer getAdmissionNumber(){
        return admissionNumber;
    } 
    public void setAdmissionNumber(Integer admissionNumber) {
         this.admissionNumber = admissionNumber;
    } 
    public String getOperationName(){
        return operationName;
    } 
    public void setOperationName(String operationName) {
         this.operationName = operationName;
    } 
    public String getOperationProcess(){
        return operationProcess;
    } 
    public void setOperationProcess(String operationProcess) {
         this.operationProcess = operationProcess;
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