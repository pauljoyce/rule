package com.clinical.model.cluster;
import java.util.Date;
public class TemOutpDischargeSummer{
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
    //首次就诊日期
    private Date initialDocDate;
    //入院日期
    private Date admissionDateTime;
    //出院日期
    private Date dischargeDateTime;
    //实际住院天数
    private Integer actualDay;
    //入院情况
    private String admissionStatus;
    //阳性辅助检查结果
    private String supplementaryExam;
    //诊疗经过
    private String tzlProcess;
    //出院情况
    private String dischargeStatus;
    //出院情况-出院时症状与体征
    private String dischargeSymptomAndSign;
    //出院情况-出院小结
    private String dischargeSummaryContents;
    //出院医嘱
    private String dischargeOrder;
    //病情转归情况
    private String diseaseOutcome;
    //入院途径
    private String inpRoute;
    //入院科室
    private String inpDepartment;
    //出院科室
    private String outpDepartment;
    //入院诊断
    private String inpDiag;
    //出院主要诊断
    private String outpMainDiag;
    //出院其它诊断
    private String outpOtherDiag;
    //离院方式
    private String leavingMode;
    //肿瘤诊断代码
    private String tumorDiagCode;
    //肿瘤学分类代码
    private String tumorClassCode;
    //病理号
    private String hisNum;
    //肿瘤诊断依据代码
    private String tumorDiagBasisCode;
    //门（急）诊诊断
    private String doorDiag;
    //是否有非计划二次手术
    private String isTwoOperation;
    //非计划二次手术原因
    private String whyNotTwo;
    //医生签名
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
    public Date getInitialDocDate(){
        return initialDocDate;
    } 
    public void setInitialDocDate(Date initialDocDate) {
         this.initialDocDate = initialDocDate;
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
    public Integer getActualDay(){
        return actualDay;
    } 
    public void setActualDay(Integer actualDay) {
         this.actualDay = actualDay;
    } 
    public String getAdmissionStatus(){
        return admissionStatus;
    } 
    public void setAdmissionStatus(String admissionStatus) {
         this.admissionStatus = admissionStatus;
    } 
    public String getSupplementaryExam(){
        return supplementaryExam;
    } 
    public void setSupplementaryExam(String supplementaryExam) {
         this.supplementaryExam = supplementaryExam;
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
    public String getDischargeSymptomAndSign(){
        return dischargeSymptomAndSign;
    } 
    public void setDischargeSymptomAndSign(String dischargeSymptomAndSign) {
         this.dischargeSymptomAndSign = dischargeSymptomAndSign;
    } 
    public String getDischargeSummaryContents(){
        return dischargeSummaryContents;
    } 
    public void setDischargeSummaryContents(String dischargeSummaryContents) {
         this.dischargeSummaryContents = dischargeSummaryContents;
    } 
    public String getDischargeOrder(){
        return dischargeOrder;
    } 
    public void setDischargeOrder(String dischargeOrder) {
         this.dischargeOrder = dischargeOrder;
    } 
    public String getDiseaseOutcome(){
        return diseaseOutcome;
    } 
    public void setDiseaseOutcome(String diseaseOutcome) {
         this.diseaseOutcome = diseaseOutcome;
    } 
    public String getInpRoute(){
        return inpRoute;
    } 
    public void setInpRoute(String inpRoute) {
         this.inpRoute = inpRoute;
    } 
    public String getInpDepartment(){
        return inpDepartment;
    } 
    public void setInpDepartment(String inpDepartment) {
         this.inpDepartment = inpDepartment;
    } 
    public String getOutpDepartment(){
        return outpDepartment;
    } 
    public void setOutpDepartment(String outpDepartment) {
         this.outpDepartment = outpDepartment;
    } 
    public String getInpDiag(){
        return inpDiag;
    } 
    public void setInpDiag(String inpDiag) {
         this.inpDiag = inpDiag;
    } 
    public String getOutpMainDiag(){
        return outpMainDiag;
    } 
    public void setOutpMainDiag(String outpMainDiag) {
         this.outpMainDiag = outpMainDiag;
    } 
    public String getOutpOtherDiag(){
        return outpOtherDiag;
    } 
    public void setOutpOtherDiag(String outpOtherDiag) {
         this.outpOtherDiag = outpOtherDiag;
    } 
    public String getLeavingMode(){
        return leavingMode;
    } 
    public void setLeavingMode(String leavingMode) {
         this.leavingMode = leavingMode;
    } 
    public String getTumorDiagCode(){
        return tumorDiagCode;
    } 
    public void setTumorDiagCode(String tumorDiagCode) {
         this.tumorDiagCode = tumorDiagCode;
    } 
    public String getTumorClassCode(){
        return tumorClassCode;
    } 
    public void setTumorClassCode(String tumorClassCode) {
         this.tumorClassCode = tumorClassCode;
    } 
    public String getHisNum(){
        return hisNum;
    } 
    public void setHisNum(String hisNum) {
         this.hisNum = hisNum;
    } 
    public String getTumorDiagBasisCode(){
        return tumorDiagBasisCode;
    } 
    public void setTumorDiagBasisCode(String tumorDiagBasisCode) {
         this.tumorDiagBasisCode = tumorDiagBasisCode;
    } 
    public String getDoorDiag(){
        return doorDiag;
    } 
    public void setDoorDiag(String doorDiag) {
         this.doorDiag = doorDiag;
    } 
    public String getIsTwoOperation(){
        return isTwoOperation;
    } 
    public void setIsTwoOperation(String isTwoOperation) {
         this.isTwoOperation = isTwoOperation;
    } 
    public String getWhyNotTwo(){
        return whyNotTwo;
    } 
    public void setWhyNotTwo(String whyNotTwo) {
         this.whyNotTwo = whyNotTwo;
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