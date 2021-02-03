package com.clinical.model.cluster;
import java.util.Date;
public class ExamMaster{
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
    //就诊类型
    private String visitType;
    //门诊/住院号
    private String visitId;
    //住院次数
    private Integer admissionNumber;
    //检查系统编号
    private String examNo;
    //姓名
    private String fullName;
    //性别
    private String sex;
    //年龄
    private Integer age;
    //检查类别
    private String examClass;
    //临床症状
    private String clinSymp;
    //体征
    private String physSign;
    //相关化验结果
    private String relevantLabTest;
    //其他诊断
    private String relevantDiag;
    //临床诊断
    private String clinDiag;
    //检查方式
    private String examMode;
    //使用仪器
    private String device;
    //执行科室
    private String performedBy;
    //病人来源
    private String patientSource;
    //申请日期时间
    private Date reqDateTime;
    //申请科室
    private String reqDept;
    //申请医生
    private String reqPhysician;
    //注意事项
    private String notice;
    //检查日期时间
    private Date examDateTime;
    //报告日期时间
    private Date reportDateTime;
    //检查部位
    private String examPosition;
    //报告医师
    private String diagDoctor;
    //审核医生
    private String reviewDoctor;
    //检查项目
    private String entryName;
    //检查结论
    private String entryResults;
    //检查参数
    private String examPara;
    //检查所见
    private String description;
    //是否阳性
    private String isAbnormal;
    //报告中图像编号
    private String useImage;
    //备注
    private String memo;
    //检查项目标化
    private String examClassStd;
    //检查方式
    private String examModeStd;
    //身体部位
    private String structureStd;
    //检查名称标化
    private String examNameStd;
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
    public String getVisitType(){
        return visitType;
    } 
    public void setVisitType(String visitType) {
         this.visitType = visitType;
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
    public String getExamNo(){
        return examNo;
    } 
    public void setExamNo(String examNo) {
         this.examNo = examNo;
    } 
    public String getFullName(){
        return fullName;
    } 
    public void setFullName(String fullName) {
         this.fullName = fullName;
    } 
    public String getSex(){
        return sex;
    } 
    public void setSex(String sex) {
         this.sex = sex;
    } 
    public Integer getAge(){
        return age;
    } 
    public void setAge(Integer age) {
         this.age = age;
    } 
    public String getExamClass(){
        return examClass;
    } 
    public void setExamClass(String examClass) {
         this.examClass = examClass;
    } 
    public String getClinSymp(){
        return clinSymp;
    } 
    public void setClinSymp(String clinSymp) {
         this.clinSymp = clinSymp;
    } 
    public String getPhysSign(){
        return physSign;
    } 
    public void setPhysSign(String physSign) {
         this.physSign = physSign;
    } 
    public String getRelevantLabTest(){
        return relevantLabTest;
    } 
    public void setRelevantLabTest(String relevantLabTest) {
         this.relevantLabTest = relevantLabTest;
    } 
    public String getRelevantDiag(){
        return relevantDiag;
    } 
    public void setRelevantDiag(String relevantDiag) {
         this.relevantDiag = relevantDiag;
    } 
    public String getClinDiag(){
        return clinDiag;
    } 
    public void setClinDiag(String clinDiag) {
         this.clinDiag = clinDiag;
    } 
    public String getExamMode(){
        return examMode;
    } 
    public void setExamMode(String examMode) {
         this.examMode = examMode;
    } 
    public String getDevice(){
        return device;
    } 
    public void setDevice(String device) {
         this.device = device;
    } 
    public String getPerformedBy(){
        return performedBy;
    } 
    public void setPerformedBy(String performedBy) {
         this.performedBy = performedBy;
    } 
    public String getPatientSource(){
        return patientSource;
    } 
    public void setPatientSource(String patientSource) {
         this.patientSource = patientSource;
    } 
    public Date getReqDateTime(){
        return reqDateTime;
    } 
    public void setReqDateTime(Date reqDateTime) {
         this.reqDateTime = reqDateTime;
    } 
    public String getReqDept(){
        return reqDept;
    } 
    public void setReqDept(String reqDept) {
         this.reqDept = reqDept;
    } 
    public String getReqPhysician(){
        return reqPhysician;
    } 
    public void setReqPhysician(String reqPhysician) {
         this.reqPhysician = reqPhysician;
    } 
    public String getNotice(){
        return notice;
    } 
    public void setNotice(String notice) {
         this.notice = notice;
    } 
    public Date getExamDateTime(){
        return examDateTime;
    } 
    public void setExamDateTime(Date examDateTime) {
         this.examDateTime = examDateTime;
    } 
    public Date getReportDateTime(){
        return reportDateTime;
    } 
    public void setReportDateTime(Date reportDateTime) {
         this.reportDateTime = reportDateTime;
    } 
    public String getExamPosition(){
        return examPosition;
    } 
    public void setExamPosition(String examPosition) {
         this.examPosition = examPosition;
    } 
    public String getDiagDoctor(){
        return diagDoctor;
    } 
    public void setDiagDoctor(String diagDoctor) {
         this.diagDoctor = diagDoctor;
    } 
    public String getReviewDoctor(){
        return reviewDoctor;
    } 
    public void setReviewDoctor(String reviewDoctor) {
         this.reviewDoctor = reviewDoctor;
    } 
    public String getEntryName(){
        return entryName;
    } 
    public void setEntryName(String entryName) {
         this.entryName = entryName;
    } 
    public String getEntryResults(){
        return entryResults;
    } 
    public void setEntryResults(String entryResults) {
         this.entryResults = entryResults;
    } 
    public String getExamPara(){
        return examPara;
    } 
    public void setExamPara(String examPara) {
         this.examPara = examPara;
    } 
    public String getDescription(){
        return description;
    } 
    public void setDescription(String description) {
         this.description = description;
    } 
    public String getIsAbnormal(){
        return isAbnormal;
    } 
    public void setIsAbnormal(String isAbnormal) {
         this.isAbnormal = isAbnormal;
    } 
    public String getUseImage(){
        return useImage;
    } 
    public void setUseImage(String useImage) {
         this.useImage = useImage;
    } 
    public String getMemo(){
        return memo;
    } 
    public void setMemo(String memo) {
         this.memo = memo;
    } 
    public String getExamClassStd(){
        return examClassStd;
    } 
    public void setExamClassStd(String examClassStd) {
         this.examClassStd = examClassStd;
    } 
    public String getExamModeStd(){
        return examModeStd;
    } 
    public void setExamModeStd(String examModeStd) {
         this.examModeStd = examModeStd;
    } 
    public String getStructureStd(){
        return structureStd;
    } 
    public void setStructureStd(String structureStd) {
         this.structureStd = structureStd;
    } 
    public String getExamNameStd(){
        return examNameStd;
    } 
    public void setExamNameStd(String examNameStd) {
         this.examNameStd = examNameStd;
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