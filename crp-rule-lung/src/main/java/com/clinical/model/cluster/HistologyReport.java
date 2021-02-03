package com.clinical.model.cluster;
import java.util.Date;
public class HistologyReport{
    //主键id
    private Integer id;
    //标识患者身份唯一标识
    private String personId;
    //唯一标识
    private String uniqueId;
    //中间库unique_id
    private String uniqueIdLv3;
    //医疗机构代码
    private String p900;
    //患者id
    private String patientId;
    //住院号
    private String visitId;
    //病理系统编号
    private String pathologyNo;
    //送检医院
    private Date inspectionHospital;
    //送检科室
    private Date inspectionDepartment;
    //送检医师
    private String inspectionPhysician;
    //送检时间
    private String inspectionTime;
    //送检部位
    private String inspectionSite;
    //临床诊断
    private String clinicalDiagnosis;
    //姓名
    private String name;
    //标本接收时间
    private String specimenReceivingTime;
    //报告时间
    private String reportTime;
    //审核时间
    private String reviewTime;
    //病理所见-肉眼所见
    private String pathEye;
    //病理所见-镜下所见
    private String pathMicroscope;
    //病理诊断
    private String pathDiag;
    //病理诊断编码
    private String pathDiagCode;
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
    public String getUniqueIdLv3(){
        return uniqueIdLv3;
    } 
    public void setUniqueIdLv3(String uniqueIdLv3) {
         this.uniqueIdLv3 = uniqueIdLv3;
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
    public String getPathologyNo(){
        return pathologyNo;
    } 
    public void setPathologyNo(String pathologyNo) {
         this.pathologyNo = pathologyNo;
    } 
    public Date getInspectionHospital(){
        return inspectionHospital;
    } 
    public void setInspectionHospital(Date inspectionHospital) {
         this.inspectionHospital = inspectionHospital;
    } 
    public Date getInspectionDepartment(){
        return inspectionDepartment;
    } 
    public void setInspectionDepartment(Date inspectionDepartment) {
         this.inspectionDepartment = inspectionDepartment;
    } 
    public String getInspectionPhysician(){
        return inspectionPhysician;
    } 
    public void setInspectionPhysician(String inspectionPhysician) {
         this.inspectionPhysician = inspectionPhysician;
    } 
    public String getInspectionTime(){
        return inspectionTime;
    } 
    public void setInspectionTime(String inspectionTime) {
         this.inspectionTime = inspectionTime;
    } 
    public String getInspectionSite(){
        return inspectionSite;
    } 
    public void setInspectionSite(String inspectionSite) {
         this.inspectionSite = inspectionSite;
    } 
    public String getClinicalDiagnosis(){
        return clinicalDiagnosis;
    } 
    public void setClinicalDiagnosis(String clinicalDiagnosis) {
         this.clinicalDiagnosis = clinicalDiagnosis;
    } 
    public String getName(){
        return name;
    } 
    public void setName(String name) {
         this.name = name;
    } 
    public String getSpecimenReceivingTime(){
        return specimenReceivingTime;
    } 
    public void setSpecimenReceivingTime(String specimenReceivingTime) {
         this.specimenReceivingTime = specimenReceivingTime;
    } 
    public String getReportTime(){
        return reportTime;
    } 
    public void setReportTime(String reportTime) {
         this.reportTime = reportTime;
    } 
    public String getReviewTime(){
        return reviewTime;
    } 
    public void setReviewTime(String reviewTime) {
         this.reviewTime = reviewTime;
    } 
    public String getPathEye(){
        return pathEye;
    } 
    public void setPathEye(String pathEye) {
         this.pathEye = pathEye;
    } 
    public String getPathMicroscope(){
        return pathMicroscope;
    } 
    public void setPathMicroscope(String pathMicroscope) {
         this.pathMicroscope = pathMicroscope;
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