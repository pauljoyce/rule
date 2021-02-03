package com.clinical.model.cluster;
import java.util.Date;
public class InpAdmissionStatus{
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
    //病人姓名
    private String tpatname;
    //就诊时间
    private Date admissionDateTime;
    //住院次数
    private Integer admissionNumber;
    //病案号
    private String tpatno;
    //临床初步诊断
    private String preliminaryClinicalDiagnosis;
    //临床初步诊断日期
    private Date preliminaryDiagnosisDate;
    //医生签名_初步诊断
    private String doctorPreliminaryDiagnosis;
    //临床确定诊断
    private String clinicalDefiniteDiagnosis;
    //临床确定诊断日期
    private Date definiteDiagnosisDate;
    //医生签名_确定诊断
    private String doctorDefiniteDiagnosis;
    //现病史
    private String hyPresent;
    //既往史
    private String hyPats;
    //个人史
    private String hyIndividual;
    //月经史
    private String menstrualHistorySta;
    //身高
    private String byHeight;
    //体重
    private String byWeight;
    //肥胖
    private String fat;
    //体表面积
    private String bySurfaceArea;
    //ecog_whops评分
    private String tEcogWhops;
    //kps评分
    private String tKps;
    //疼痛评分_nrs法
    private String tNrs;
    //家族史
    private String hyFamily;
    //体格检查
    private String physicalExam;
    //主诉
    private String chiefComplaint;
    //专科检查
    private String specialityExam;
    //辅助检查
    private String supplementaryExam;
    //婚姻状况
    private String marriage;
    //性别
    private String sex;
    //年龄
    private Integer age;
    //民族
    private String nation;
    //职业
    private String occupation;
    //记录时间
    private Date recordTime;
    //病史陈述者
    private String medicalHistoryNarrator;
    //患者病史陈述者与患者关系
    private String relationshipBetweenPatient;
    //婚育史
    private String historyOfMarrChild;
    //哺乳史
    private String reproductiveHistory;
    //过敏史
    private String allergyHistory;
    //暴露史
    private String exposureHistory;
    //母孕史
    private String motherFertileHistory;
    //修正诊断
    private String correctDiagnosis;
    //修正诊断时间
    private String correctDiagnosisTime;
    //修正诊断医师签名
    private String correctDiagnosisDoctor;
    //补充诊断
    private String supDiagnosis;
    //补充诊断时间
    private String supDiagnosisTime;
    //补充诊断医师签名
    private String supDiagnosisDoctor;
    //病历小结
    private String recordSummary;
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
    public String getPreliminaryClinicalDiagnosis(){
        return preliminaryClinicalDiagnosis;
    } 
    public void setPreliminaryClinicalDiagnosis(String preliminaryClinicalDiagnosis) {
         this.preliminaryClinicalDiagnosis = preliminaryClinicalDiagnosis;
    } 
    public Date getPreliminaryDiagnosisDate(){
        return preliminaryDiagnosisDate;
    } 
    public void setPreliminaryDiagnosisDate(Date preliminaryDiagnosisDate) {
         this.preliminaryDiagnosisDate = preliminaryDiagnosisDate;
    } 
    public String getDoctorPreliminaryDiagnosis(){
        return doctorPreliminaryDiagnosis;
    } 
    public void setDoctorPreliminaryDiagnosis(String doctorPreliminaryDiagnosis) {
         this.doctorPreliminaryDiagnosis = doctorPreliminaryDiagnosis;
    } 
    public String getClinicalDefiniteDiagnosis(){
        return clinicalDefiniteDiagnosis;
    } 
    public void setClinicalDefiniteDiagnosis(String clinicalDefiniteDiagnosis) {
         this.clinicalDefiniteDiagnosis = clinicalDefiniteDiagnosis;
    } 
    public Date getDefiniteDiagnosisDate(){
        return definiteDiagnosisDate;
    } 
    public void setDefiniteDiagnosisDate(Date definiteDiagnosisDate) {
         this.definiteDiagnosisDate = definiteDiagnosisDate;
    } 
    public String getDoctorDefiniteDiagnosis(){
        return doctorDefiniteDiagnosis;
    } 
    public void setDoctorDefiniteDiagnosis(String doctorDefiniteDiagnosis) {
         this.doctorDefiniteDiagnosis = doctorDefiniteDiagnosis;
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
    public String getHyIndividual(){
        return hyIndividual;
    } 
    public void setHyIndividual(String hyIndividual) {
         this.hyIndividual = hyIndividual;
    } 
    public String getMenstrualHistorySta(){
        return menstrualHistorySta;
    } 
    public void setMenstrualHistorySta(String menstrualHistorySta) {
         this.menstrualHistorySta = menstrualHistorySta;
    } 
    public String getByHeight(){
        return byHeight;
    } 
    public void setByHeight(String byHeight) {
         this.byHeight = byHeight;
    } 
    public String getByWeight(){
        return byWeight;
    } 
    public void setByWeight(String byWeight) {
         this.byWeight = byWeight;
    } 
    public String getFat(){
        return fat;
    } 
    public void setFat(String fat) {
         this.fat = fat;
    } 
    public String getBySurfaceArea(){
        return bySurfaceArea;
    } 
    public void setBySurfaceArea(String bySurfaceArea) {
         this.bySurfaceArea = bySurfaceArea;
    } 
    public String getTEcogWhops(){
        return tEcogWhops;
    } 
    public void setTEcogWhops(String tEcogWhops) {
         this.tEcogWhops = tEcogWhops;
    } 
    public String getTKps(){
        return tKps;
    } 
    public void setTKps(String tKps) {
         this.tKps = tKps;
    } 
    public String getTNrs(){
        return tNrs;
    } 
    public void setTNrs(String tNrs) {
         this.tNrs = tNrs;
    } 
    public String getHyFamily(){
        return hyFamily;
    } 
    public void setHyFamily(String hyFamily) {
         this.hyFamily = hyFamily;
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
    public String getSpecialityExam(){
        return specialityExam;
    } 
    public void setSpecialityExam(String specialityExam) {
         this.specialityExam = specialityExam;
    } 
    public String getSupplementaryExam(){
        return supplementaryExam;
    } 
    public void setSupplementaryExam(String supplementaryExam) {
         this.supplementaryExam = supplementaryExam;
    } 
    public String getMarriage(){
        return marriage;
    } 
    public void setMarriage(String marriage) {
         this.marriage = marriage;
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
    public String getNation(){
        return nation;
    } 
    public void setNation(String nation) {
         this.nation = nation;
    } 
    public String getOccupation(){
        return occupation;
    } 
    public void setOccupation(String occupation) {
         this.occupation = occupation;
    } 
    public Date getRecordTime(){
        return recordTime;
    } 
    public void setRecordTime(Date recordTime) {
         this.recordTime = recordTime;
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
    public String getHistoryOfMarrChild(){
        return historyOfMarrChild;
    } 
    public void setHistoryOfMarrChild(String historyOfMarrChild) {
         this.historyOfMarrChild = historyOfMarrChild;
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
    public String getCorrectDiagnosis(){
        return correctDiagnosis;
    } 
    public void setCorrectDiagnosis(String correctDiagnosis) {
         this.correctDiagnosis = correctDiagnosis;
    } 
    public String getCorrectDiagnosisTime(){
        return correctDiagnosisTime;
    } 
    public void setCorrectDiagnosisTime(String correctDiagnosisTime) {
         this.correctDiagnosisTime = correctDiagnosisTime;
    } 
    public String getCorrectDiagnosisDoctor(){
        return correctDiagnosisDoctor;
    } 
    public void setCorrectDiagnosisDoctor(String correctDiagnosisDoctor) {
         this.correctDiagnosisDoctor = correctDiagnosisDoctor;
    } 
    public String getSupDiagnosis(){
        return supDiagnosis;
    } 
    public void setSupDiagnosis(String supDiagnosis) {
         this.supDiagnosis = supDiagnosis;
    } 
    public String getSupDiagnosisTime(){
        return supDiagnosisTime;
    } 
    public void setSupDiagnosisTime(String supDiagnosisTime) {
         this.supDiagnosisTime = supDiagnosisTime;
    } 
    public String getSupDiagnosisDoctor(){
        return supDiagnosisDoctor;
    } 
    public void setSupDiagnosisDoctor(String supDiagnosisDoctor) {
         this.supDiagnosisDoctor = supDiagnosisDoctor;
    } 
    public String getRecordSummary(){
        return recordSummary;
    } 
    public void setRecordSummary(String recordSummary) {
         this.recordSummary = recordSummary;
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