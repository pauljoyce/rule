package com.clinical.model.cluster;
import java.util.Date;
public class CervicalSmearCytology{
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
    //就诊标识住院号
    private String visitId;
    //送检日期
    private Date inspectionDate;
    //报告日期
    private Date reportDate;
    //TBS诊断
    private String tbsDiagnosis;
    //对涂片的满意程度
    private String smear;
    //形态学似人乳头状瘤病毒感染
    private String papillomavirus;
    //形态学似单纯疱疹病毒感染
    private String simplexVirus;
    //形态学似嗜血杆菌感染
    private String haemophilus;
    //形态学似放射菌感染
    private String actinobacteria;
    //滴虫感染
    private String trichomonas;
    //霉菌性感染
    private String mycotic;
    //衣原体 
    private String chlamydia;
    //霉菌 
    private String mould;
    //滴虫
    private String trichomonad;
    //雌激素水平的评估
    private String estrogen;
    //巴氏分级 
    private String pasteurization;
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
    public String getTbsDiagnosis(){
        return tbsDiagnosis;
    } 
    public void setTbsDiagnosis(String tbsDiagnosis) {
         this.tbsDiagnosis = tbsDiagnosis;
    } 
    public String getSmear(){
        return smear;
    } 
    public void setSmear(String smear) {
         this.smear = smear;
    } 
    public String getPapillomavirus(){
        return papillomavirus;
    } 
    public void setPapillomavirus(String papillomavirus) {
         this.papillomavirus = papillomavirus;
    } 
    public String getSimplexVirus(){
        return simplexVirus;
    } 
    public void setSimplexVirus(String simplexVirus) {
         this.simplexVirus = simplexVirus;
    } 
    public String getHaemophilus(){
        return haemophilus;
    } 
    public void setHaemophilus(String haemophilus) {
         this.haemophilus = haemophilus;
    } 
    public String getActinobacteria(){
        return actinobacteria;
    } 
    public void setActinobacteria(String actinobacteria) {
         this.actinobacteria = actinobacteria;
    } 
    public String getTrichomonas(){
        return trichomonas;
    } 
    public void setTrichomonas(String trichomonas) {
         this.trichomonas = trichomonas;
    } 
    public String getMycotic(){
        return mycotic;
    } 
    public void setMycotic(String mycotic) {
         this.mycotic = mycotic;
    } 
    public String getChlamydia(){
        return chlamydia;
    } 
    public void setChlamydia(String chlamydia) {
         this.chlamydia = chlamydia;
    } 
    public String getMould(){
        return mould;
    } 
    public void setMould(String mould) {
         this.mould = mould;
    } 
    public String getTrichomonad(){
        return trichomonad;
    } 
    public void setTrichomonad(String trichomonad) {
         this.trichomonad = trichomonad;
    } 
    public String getEstrogen(){
        return estrogen;
    } 
    public void setEstrogen(String estrogen) {
         this.estrogen = estrogen;
    } 
    public String getPasteurization(){
        return pasteurization;
    } 
    public void setPasteurization(String pasteurization) {
         this.pasteurization = pasteurization;
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