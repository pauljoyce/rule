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
    private String inspectTime;
    //报告日期
    private Date reprotTime;
    //送检标本名称
    private Date specimenName;
    //肿瘤部位
    private String tumorLocation;
    //肿瘤大小
    private String tumorSize;
    //病理类型
    private String pathologicalType;
    //肿瘤侵及被膜
    private String invadingCapsule;
    //脉管内癌栓
    private String ifArtery;
    //神经侵犯
    private String ifInvasionNerve;
    //断端肿瘤累及
    private String tumorInvolved;
    //恶性程度
    private String malignantDegree;
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
    public String getInspectTime(){
        return inspectTime;
    } 
    public void setInspectTime(String inspectTime) {
         this.inspectTime = inspectTime;
    } 
    public Date getReprotTime(){
        return reprotTime;
    } 
    public void setReprotTime(Date reprotTime) {
         this.reprotTime = reprotTime;
    } 
    public Date getSpecimenName(){
        return specimenName;
    } 
    public void setSpecimenName(Date specimenName) {
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
    public String getPathologicalType(){
        return pathologicalType;
    } 
    public void setPathologicalType(String pathologicalType) {
         this.pathologicalType = pathologicalType;
    } 
    public String getInvadingCapsule(){
        return invadingCapsule;
    } 
    public void setInvadingCapsule(String invadingCapsule) {
         this.invadingCapsule = invadingCapsule;
    } 
    public String getIfArtery(){
        return ifArtery;
    } 
    public void setIfArtery(String ifArtery) {
         this.ifArtery = ifArtery;
    } 
    public String getIfInvasionNerve(){
        return ifInvasionNerve;
    } 
    public void setIfInvasionNerve(String ifInvasionNerve) {
         this.ifInvasionNerve = ifInvasionNerve;
    } 
    public String getTumorInvolved(){
        return tumorInvolved;
    } 
    public void setTumorInvolved(String tumorInvolved) {
         this.tumorInvolved = tumorInvolved;
    } 
    public String getMalignantDegree(){
        return malignantDegree;
    } 
    public void setMalignantDegree(String malignantDegree) {
         this.malignantDegree = malignantDegree;
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