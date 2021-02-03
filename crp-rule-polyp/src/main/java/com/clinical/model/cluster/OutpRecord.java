package com.clinical.model.cluster;
import java.util.Date;
public class OutpRecord{
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
    //就诊次数
    private Integer admissionNumber;
    //门（急）诊诊断
    private String outpatientDiagnosis;
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
    //现病史
    private String hyPresent;
    //既往史
    private String hyPats;
    //家族史
    private String familyHistory;
    //个人史
    private String personalHistory;
    //月经史
    private String menstrualHistory;
    //生育史
    private String fertileHistory;
    //哺乳史
    private String reproductiveHistory;
    //过敏史
    private String allergyHistory;
    //暴露史
    private String exposureHistory;
    //母孕史
    private String motherFertileHistory;
    //喂养史
    private String feedHistory;
    //发育史
    private String growthHistory;
    //体格检查
    private String physicalExam;
    //主诉
    private String chiefComplaint;
    //辅助检查
    private String supplementaryExam;
    //婚育史
    private String hyMarryChild;
    //处置
    private String treatment;
    //医嘱内容
    private String orderContent;
    //记录时间
    private Date recordTime;
    //备注
    private String comment;
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
    public String getOutpatientDiagnosis(){
        return outpatientDiagnosis;
    } 
    public void setOutpatientDiagnosis(String outpatientDiagnosis) {
         this.outpatientDiagnosis = outpatientDiagnosis;
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
    public String getHyPresent(){
        return hyPresent;
    } 
    public void setHyPresent(String hyPresent) {
         this.hyPresent = hyPresent;
    } 
    public String getHyPats(){
        return hyPats;
    } 
    public void setHyPats(String hyPats) {
         this.hyPats = hyPats;
    } 
    public String getFamilyHistory(){
        return familyHistory;
    } 
    public void setFamilyHistory(String familyHistory) {
         this.familyHistory = familyHistory;
    } 
    public String getPersonalHistory(){
        return personalHistory;
    } 
    public void setPersonalHistory(String personalHistory) {
         this.personalHistory = personalHistory;
    } 
    public String getMenstrualHistory(){
        return menstrualHistory;
    } 
    public void setMenstrualHistory(String menstrualHistory) {
         this.menstrualHistory = menstrualHistory;
    } 
    public String getFertileHistory(){
        return fertileHistory;
    } 
    public void setFertileHistory(String fertileHistory) {
         this.fertileHistory = fertileHistory;
    } 
    public String getReproductiveHistory(){
        return reproductiveHistory;
    } 
    public void setReproductiveHistory(String reproductiveHistory) {
         this.reproductiveHistory = reproductiveHistory;
    } 
    public String getAllergyHistory(){
        return allergyHistory;
    } 
    public void setAllergyHistory(String allergyHistory) {
         this.allergyHistory = allergyHistory;
    } 
    public String getExposureHistory(){
        return exposureHistory;
    } 
    public void setExposureHistory(String exposureHistory) {
         this.exposureHistory = exposureHistory;
    } 
    public String getMotherFertileHistory(){
        return motherFertileHistory;
    } 
    public void setMotherFertileHistory(String motherFertileHistory) {
         this.motherFertileHistory = motherFertileHistory;
    } 
    public String getFeedHistory(){
        return feedHistory;
    } 
    public void setFeedHistory(String feedHistory) {
         this.feedHistory = feedHistory;
    } 
    public String getGrowthHistory(){
        return growthHistory;
    } 
    public void setGrowthHistory(String growthHistory) {
         this.growthHistory = growthHistory;
    } 
    public String getPhysicalExam(){
        return physicalExam;
    } 
    public void setPhysicalExam(String physicalExam) {
         this.physicalExam = physicalExam;
    } 
    public String getChiefComplaint(){
        return chiefComplaint;
    } 
    public void setChiefComplaint(String chiefComplaint) {
         this.chiefComplaint = chiefComplaint;
    } 
    public String getSupplementaryExam(){
        return supplementaryExam;
    } 
    public void setSupplementaryExam(String supplementaryExam) {
         this.supplementaryExam = supplementaryExam;
    } 
    public String getHyMarryChild(){
        return hyMarryChild;
    } 
    public void setHyMarryChild(String hyMarryChild) {
         this.hyMarryChild = hyMarryChild;
    } 
    public String getTreatment(){
        return treatment;
    } 
    public void setTreatment(String treatment) {
         this.treatment = treatment;
    } 
    public String getOrderContent(){
        return orderContent;
    } 
    public void setOrderContent(String orderContent) {
         this.orderContent = orderContent;
    } 
    public Date getRecordTime(){
        return recordTime;
    } 
    public void setRecordTime(Date recordTime) {
         this.recordTime = recordTime;
    } 
    public String getComment(){
        return comment;
    } 
    public void setComment(String comment) {
         this.comment = comment;
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