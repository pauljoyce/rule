package com.clinical.model.cluster;
import java.util.Date;
public class Pathological{
    //主键id
    private Integer id;
    //标识患者身份唯一标识
    private String personId;
    //唯一标识
    private String uniqueId;
    //医疗机构代码
    private String p900;
    //患者id
    private String patientId;
    //住院号
    private String visitId;
    //病理号
    private String caseNumber;
    //收到日期
    private Date inspectTime;
    //报告日期
    private Date reprotTime;
    //送检标本名称
    private String specimenName;
    //肿瘤部位
    private String tumorLocation;
    //肿瘤大小
    private String tumorSize;
    //原位癌
    private String carcinomaSitu;
    //病理类型
    private String pathologicalType;
    //病理分级（分化程度）
    private String grade;
    //新辅助治疗后MP分级
    private String mp;
    //侵及皮肤
    private String invasionSkin;
    //侵及胸壁
    private String invasionChest;
    //侵及乳头
    private String invasionNipple;
    //脉管癌栓
    private String vascularTumorThrombus;
    //侵犯神经
    private String ifInvasionNerve;
    //手术切缘累及情况
    private String operation;
    //切缘距离
    private String edgeDistance;
    //具体送检淋巴结部位
    private String lymphSite;
    //送检淋巴结总数
    private Integer lymphNodeTotal;
    //淋巴结转移数量
    private Integer transferNumber;
    //淋巴结转移
    private String ifTransfer;
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
    public String getCaseNumber(){
        return caseNumber;
    } 
    public void setCaseNumber(String caseNumber) {
         this.caseNumber = caseNumber;
    } 
    public Date getInspectTime(){
        return inspectTime;
    } 
    public void setInspectTime(Date inspectTime) {
         this.inspectTime = inspectTime;
    } 
    public Date getReprotTime(){
        return reprotTime;
    } 
    public void setReprotTime(Date reprotTime) {
         this.reprotTime = reprotTime;
    } 
    public String getSpecimenName(){
        return specimenName;
    } 
    public void setSpecimenName(String specimenName) {
         this.specimenName = specimenName;
    } 
    public String getTumorLocation(){
        return tumorLocation;
    } 
    public void setTumorLocation(String tumorLocation) {
         this.tumorLocation = tumorLocation;
    } 
    public String getTumorSize(){
        return tumorSize;
    } 
    public void setTumorSize(String tumorSize) {
         this.tumorSize = tumorSize;
    } 
    public String getCarcinomaSitu(){
        return carcinomaSitu;
    } 
    public void setCarcinomaSitu(String carcinomaSitu) {
         this.carcinomaSitu = carcinomaSitu;
    } 
    public String getPathologicalType(){
        return pathologicalType;
    } 
    public void setPathologicalType(String pathologicalType) {
         this.pathologicalType = pathologicalType;
    } 
    public String getGrade(){
        return grade;
    } 
    public void setGrade(String grade) {
         this.grade = grade;
    } 
    public String getMp(){
        return mp;
    } 
    public void setMp(String mp) {
         this.mp = mp;
    } 
    public String getInvasionSkin(){
        return invasionSkin;
    } 
    public void setInvasionSkin(String invasionSkin) {
         this.invasionSkin = invasionSkin;
    } 
    public String getInvasionChest(){
        return invasionChest;
    } 
    public void setInvasionChest(String invasionChest) {
         this.invasionChest = invasionChest;
    } 
    public String getInvasionNipple(){
        return invasionNipple;
    } 
    public void setInvasionNipple(String invasionNipple) {
         this.invasionNipple = invasionNipple;
    } 
    public String getVascularTumorThrombus(){
        return vascularTumorThrombus;
    } 
    public void setVascularTumorThrombus(String vascularTumorThrombus) {
         this.vascularTumorThrombus = vascularTumorThrombus;
    } 
    public String getIfInvasionNerve(){
        return ifInvasionNerve;
    } 
    public void setIfInvasionNerve(String ifInvasionNerve) {
         this.ifInvasionNerve = ifInvasionNerve;
    } 
    public String getOperation(){
        return operation;
    } 
    public void setOperation(String operation) {
         this.operation = operation;
    } 
    public String getEdgeDistance(){
        return edgeDistance;
    } 
    public void setEdgeDistance(String edgeDistance) {
         this.edgeDistance = edgeDistance;
    } 
    public String getLymphSite(){
        return lymphSite;
    } 
    public void setLymphSite(String lymphSite) {
         this.lymphSite = lymphSite;
    } 
    public Integer getLymphNodeTotal(){
        return lymphNodeTotal;
    } 
    public void setLymphNodeTotal(Integer lymphNodeTotal) {
         this.lymphNodeTotal = lymphNodeTotal;
    } 
    public Integer getTransferNumber(){
        return transferNumber;
    } 
    public void setTransferNumber(Integer transferNumber) {
         this.transferNumber = transferNumber;
    } 
    public String getIfTransfer(){
        return ifTransfer;
    } 
    public void setIfTransfer(String ifTransfer) {
         this.ifTransfer = ifTransfer;
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