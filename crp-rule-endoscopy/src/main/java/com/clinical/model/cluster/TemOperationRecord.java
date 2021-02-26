package com.clinical.model.cluster;
import java.util.Date;
public class TemOperationRecord{
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
    //就诊类型
    private Integer visitType;
    //科室名称
    private String departmentName;
    //病区
    private String inpatientArea;
    //年龄
    private Integer age;
    //住院次数
    private Integer admissionNumber;
    //病人姓名
    private String tpatname;
    //病案号
    private String tpatno;
    //手术编号
    private String surgerySn;
    //手术名称
    private String rcptNo;
    //手术操作主题
    private String operationTopic;
    //手术操作详细信息
    private String operationDetailNote;
    //手术过程描述
    private String surgicalDescription;
    //术中所见
    private String surgicalFindings;
    //术中意外
    private String surgicalAccident;
    //皮肤消毒描述
    private String skinSterilizationDescription;
    //影像号
    private String imageNo;
    //手术及操作编码
    private String itemNo;
    //手术开始日期时间
    private Date itemBeginDate;
    //手术结束日期时间
    private Date itemEndDate;
    //手术级别代码
    private String itemCode;
    //手术目标部位名称
    private String itemName;
    //手术史标志
    private String itemspec;
    //手术切口描述
    private String itemIncisionDescription;
    //引流标志
    private String performedBy;
    //出血量
    private String bleedingVolume;
    //输液量
    private String transfusionVolume;
    //术中输血量
    private String bloodTransfusionVolume;
    //自体输血量
    private String autologousVolumeBlood;
    //术中出入量情况
    private String intraoperativeVolume;
    //术前简历
    private String preOperativeBriefDescription;
    //术前用药
    private String subOrderNo;
    //术中用药
    private String printedRcptNo;
    //输血反应标志
    private String administration;
    //手术医师姓名
    private String nameOfSurgeon;
    //i助姓名
    private String name1;
    //ii助姓名
    private String name2;
    //手术护士
    private String nameNur;
    //麻醉方式代码
    private String anesthesiaCode;
    //麻醉方式
    private String anesthesiaMethod;
    //asa分级
    private String asaRating;
    //手术间编号
    private String operatingRoomNo;
    //手术间名称
    private String operatingRoom;
    //拟施手术
    private String plannedSurgery;
    //拟施麻醉
    private String plannedAnesthesia;
    //手术体位
    private String surgicalPosition;
    //麻醉前用药
    private String medicationBeforeAnes;
    //麻醉中用药
    private String medicationAtAnes;
    //麻醉并发症
    private String anesthesiaComplications;
    //麻醉医师
    private String anesthesiologist;
    //术前诊断
    private String diagPreoperation;
    //术后诊断
    private String diagPostoperation;
    //手术简要经过
    private String surgicalProcess;
    //术后并发症
    private String postoperationComplite;
    //术后镇痛
    private String postoperativeAnalgesia;
    //术后患者去向
    private String postoperativeDestination;
    //术后回访
    private String postoperativeVisit;
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
    public Integer getAge(){
        return age;
    } 
    public void setAge(Integer age) {
         this.age = age;
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
    public String getSurgerySn(){
        return surgerySn;
    } 
    public void setSurgerySn(String surgerySn) {
         this.surgerySn = surgerySn;
    } 
    public String getRcptNo(){
        return rcptNo;
    } 
    public void setRcptNo(String rcptNo) {
         this.rcptNo = rcptNo;
    } 
    public String getOperationTopic(){
        return operationTopic;
    } 
    public void setOperationTopic(String operationTopic) {
         this.operationTopic = operationTopic;
    } 
    public String getOperationDetailNote(){
        return operationDetailNote;
    } 
    public void setOperationDetailNote(String operationDetailNote) {
         this.operationDetailNote = operationDetailNote;
    } 
    public String getSurgicalDescription(){
        return surgicalDescription;
    } 
    public void setSurgicalDescription(String surgicalDescription) {
         this.surgicalDescription = surgicalDescription;
    } 
    public String getSurgicalFindings(){
        return surgicalFindings;
    } 
    public void setSurgicalFindings(String surgicalFindings) {
         this.surgicalFindings = surgicalFindings;
    } 
    public String getSurgicalAccident(){
        return surgicalAccident;
    } 
    public void setSurgicalAccident(String surgicalAccident) {
         this.surgicalAccident = surgicalAccident;
    } 
    public String getSkinSterilizationDescription(){
        return skinSterilizationDescription;
    } 
    public void setSkinSterilizationDescription(String skinSterilizationDescription) {
         this.skinSterilizationDescription = skinSterilizationDescription;
    } 
    public String getImageNo(){
        return imageNo;
    } 
    public void setImageNo(String imageNo) {
         this.imageNo = imageNo;
    } 
    public String getItemNo(){
        return itemNo;
    } 
    public void setItemNo(String itemNo) {
         this.itemNo = itemNo;
    } 
    public Date getItemBeginDate(){
        return itemBeginDate;
    } 
    public void setItemBeginDate(Date itemBeginDate) {
         this.itemBeginDate = itemBeginDate;
    } 
    public Date getItemEndDate(){
        return itemEndDate;
    } 
    public void setItemEndDate(Date itemEndDate) {
         this.itemEndDate = itemEndDate;
    } 
    public String getItemCode(){
        return itemCode;
    } 
    public void setItemCode(String itemCode) {
         this.itemCode = itemCode;
    } 
    public String getItemName(){
        return itemName;
    } 
    public void setItemName(String itemName) {
         this.itemName = itemName;
    } 
    public String getItemspec(){
        return itemspec;
    } 
    public void setItemspec(String itemspec) {
         this.itemspec = itemspec;
    } 
    public String getItemIncisionDescription(){
        return itemIncisionDescription;
    } 
    public void setItemIncisionDescription(String itemIncisionDescription) {
         this.itemIncisionDescription = itemIncisionDescription;
    } 
    public String getPerformedBy(){
        return performedBy;
    } 
    public void setPerformedBy(String performedBy) {
         this.performedBy = performedBy;
    } 
    public String getBleedingVolume(){
        return bleedingVolume;
    } 
    public void setBleedingVolume(String bleedingVolume) {
         this.bleedingVolume = bleedingVolume;
    } 
    public String getTransfusionVolume(){
        return transfusionVolume;
    } 
    public void setTransfusionVolume(String transfusionVolume) {
         this.transfusionVolume = transfusionVolume;
    } 
    public String getBloodTransfusionVolume(){
        return bloodTransfusionVolume;
    } 
    public void setBloodTransfusionVolume(String bloodTransfusionVolume) {
         this.bloodTransfusionVolume = bloodTransfusionVolume;
    } 
    public String getAutologousVolumeBlood(){
        return autologousVolumeBlood;
    } 
    public void setAutologousVolumeBlood(String autologousVolumeBlood) {
         this.autologousVolumeBlood = autologousVolumeBlood;
    } 
    public String getIntraoperativeVolume(){
        return intraoperativeVolume;
    } 
    public void setIntraoperativeVolume(String intraoperativeVolume) {
         this.intraoperativeVolume = intraoperativeVolume;
    } 
    public String getPreOperativeBriefDescription(){
        return preOperativeBriefDescription;
    } 
    public void setPreOperativeBriefDescription(String preOperativeBriefDescription) {
         this.preOperativeBriefDescription = preOperativeBriefDescription;
    } 
    public String getSubOrderNo(){
        return subOrderNo;
    } 
    public void setSubOrderNo(String subOrderNo) {
         this.subOrderNo = subOrderNo;
    } 
    public String getPrintedRcptNo(){
        return printedRcptNo;
    } 
    public void setPrintedRcptNo(String printedRcptNo) {
         this.printedRcptNo = printedRcptNo;
    } 
    public String getAdministration(){
        return administration;
    } 
    public void setAdministration(String administration) {
         this.administration = administration;
    } 
    public String getNameOfSurgeon(){
        return nameOfSurgeon;
    } 
    public void setNameOfSurgeon(String nameOfSurgeon) {
         this.nameOfSurgeon = nameOfSurgeon;
    } 
    public String getName1(){
        return name1;
    } 
    public void setName1(String name1) {
         this.name1 = name1;
    } 
    public String getName2(){
        return name2;
    } 
    public void setName2(String name2) {
         this.name2 = name2;
    } 
    public String getNameNur(){
        return nameNur;
    } 
    public void setNameNur(String nameNur) {
         this.nameNur = nameNur;
    } 
    public String getAnesthesiaCode(){
        return anesthesiaCode;
    } 
    public void setAnesthesiaCode(String anesthesiaCode) {
         this.anesthesiaCode = anesthesiaCode;
    } 
    public String getAnesthesiaMethod(){
        return anesthesiaMethod;
    } 
    public void setAnesthesiaMethod(String anesthesiaMethod) {
         this.anesthesiaMethod = anesthesiaMethod;
    } 
    public String getAsaRating(){
        return asaRating;
    } 
    public void setAsaRating(String asaRating) {
         this.asaRating = asaRating;
    } 
    public String getOperatingRoomNo(){
        return operatingRoomNo;
    } 
    public void setOperatingRoomNo(String operatingRoomNo) {
         this.operatingRoomNo = operatingRoomNo;
    } 
    public String getOperatingRoom(){
        return operatingRoom;
    } 
    public void setOperatingRoom(String operatingRoom) {
         this.operatingRoom = operatingRoom;
    } 
    public String getPlannedSurgery(){
        return plannedSurgery;
    } 
    public void setPlannedSurgery(String plannedSurgery) {
         this.plannedSurgery = plannedSurgery;
    } 
    public String getPlannedAnesthesia(){
        return plannedAnesthesia;
    } 
    public void setPlannedAnesthesia(String plannedAnesthesia) {
         this.plannedAnesthesia = plannedAnesthesia;
    } 
    public String getSurgicalPosition(){
        return surgicalPosition;
    } 
    public void setSurgicalPosition(String surgicalPosition) {
         this.surgicalPosition = surgicalPosition;
    } 
    public String getMedicationBeforeAnes(){
        return medicationBeforeAnes;
    } 
    public void setMedicationBeforeAnes(String medicationBeforeAnes) {
         this.medicationBeforeAnes = medicationBeforeAnes;
    } 
    public String getMedicationAtAnes(){
        return medicationAtAnes;
    } 
    public void setMedicationAtAnes(String medicationAtAnes) {
         this.medicationAtAnes = medicationAtAnes;
    } 
    public String getAnesthesiaComplications(){
        return anesthesiaComplications;
    } 
    public void setAnesthesiaComplications(String anesthesiaComplications) {
         this.anesthesiaComplications = anesthesiaComplications;
    } 
    public String getAnesthesiologist(){
        return anesthesiologist;
    } 
    public void setAnesthesiologist(String anesthesiologist) {
         this.anesthesiologist = anesthesiologist;
    } 
    public String getDiagPreoperation(){
        return diagPreoperation;
    } 
    public void setDiagPreoperation(String diagPreoperation) {
         this.diagPreoperation = diagPreoperation;
    } 
    public String getDiagPostoperation(){
        return diagPostoperation;
    } 
    public void setDiagPostoperation(String diagPostoperation) {
         this.diagPostoperation = diagPostoperation;
    } 
    public String getSurgicalProcess(){
        return surgicalProcess;
    } 
    public void setSurgicalProcess(String surgicalProcess) {
         this.surgicalProcess = surgicalProcess;
    } 
    public String getPostoperationComplite(){
        return postoperationComplite;
    } 
    public void setPostoperationComplite(String postoperationComplite) {
         this.postoperationComplite = postoperationComplite;
    } 
    public String getPostoperativeAnalgesia(){
        return postoperativeAnalgesia;
    } 
    public void setPostoperativeAnalgesia(String postoperativeAnalgesia) {
         this.postoperativeAnalgesia = postoperativeAnalgesia;
    } 
    public String getPostoperativeDestination(){
        return postoperativeDestination;
    } 
    public void setPostoperativeDestination(String postoperativeDestination) {
         this.postoperativeDestination = postoperativeDestination;
    } 
    public String getPostoperativeVisit(){
        return postoperativeVisit;
    } 
    public void setPostoperativeVisit(String postoperativeVisit) {
         this.postoperativeVisit = postoperativeVisit;
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