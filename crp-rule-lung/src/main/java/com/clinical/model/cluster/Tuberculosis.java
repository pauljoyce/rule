package com.clinical.model.cluster;
import java.util.Date;
public class Tuberculosis{
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
    //就诊标识住院号
    private String visitId;
    //检验系统编号
    private String testNo;
    //标本类型
    private String specimenMethod;
    //送检日期
    private Date inspectionDate;
    //报告日期
    private Date reportDate;
    //结核分枝杆菌T细胞
    private String tCell;
    //结核分枝杆菌抗体
    private String antibody;
    //结核分枝杆菌抗体IgG
    private String lgg;
    //结核分枝杆菌抗体IgM
    private String lgm;
    //结核杆菌感染判断
    private String infectionJudgment;
    //结核杆菌核酸检测
    private String nuclein;
    //结核感染T细胞-N
    private String tCellN;
    //结核感染T细胞-P
    private String tCellP;
    //结核感染T细胞-T
    private String tCellT;
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
    public String getTestNo(){
        return testNo;
    } 
    public void setTestNo(String testNo) {
         this.testNo = testNo;
    } 
    public String getSpecimenMethod(){
        return specimenMethod;
    } 
    public void setSpecimenMethod(String specimenMethod) {
         this.specimenMethod = specimenMethod;
    } 
    public Date getInspectionDate(){
        return inspectionDate;
    } 
    public void setInspectionDate(Date inspectionDate) {
         this.inspectionDate = inspectionDate;
    } 
    public Date getReportDate(){
        return reportDate;
    } 
    public void setReportDate(Date reportDate) {
         this.reportDate = reportDate;
    } 
    public String getTCell(){
        return tCell;
    } 
    public void setTCell(String tCell) {
         this.tCell = tCell;
    } 
    public String getAntibody(){
        return antibody;
    } 
    public void setAntibody(String antibody) {
         this.antibody = antibody;
    } 
    public String getLgg(){
        return lgg;
    } 
    public void setLgg(String lgg) {
         this.lgg = lgg;
    } 
    public String getLgm(){
        return lgm;
    } 
    public void setLgm(String lgm) {
         this.lgm = lgm;
    } 
    public String getInfectionJudgment(){
        return infectionJudgment;
    } 
    public void setInfectionJudgment(String infectionJudgment) {
         this.infectionJudgment = infectionJudgment;
    } 
    public String getNuclein(){
        return nuclein;
    } 
    public void setNuclein(String nuclein) {
         this.nuclein = nuclein;
    } 
    public String getTCellN(){
        return tCellN;
    } 
    public void setTCellN(String tCellN) {
         this.tCellN = tCellN;
    } 
    public String getTCellP(){
        return tCellP;
    } 
    public void setTCellP(String tCellP) {
         this.tCellP = tCellP;
    } 
    public String getTCellT(){
        return tCellT;
    } 
    public void setTCellT(String tCellT) {
         this.tCellT = tCellT;
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