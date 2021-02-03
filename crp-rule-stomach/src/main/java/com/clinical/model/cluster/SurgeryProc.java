package com.clinical.model.cluster;
import java.util.Date;
public class SurgeryProc{
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
    //手术入路
    private String surgicalApproach;
    //淋巴结清扫
    private String lymphadenectomy;
    //术中出血量
    private String bleedingVolume;
    //粘连
    private String adhesion;
    //粘连部位
    private String adhesionSite;
    //切除方式
    private String resectionMode;
    //主要重建方式
    private String reconstructionMain;
    //重建具体方式
    private String reconstructionDetail;
    //淋巴结清扫范围 
    private String subStructure;
    //淋巴结清扫范围-D2+范围
    private String d2Plus;
    //切口长度（指手术切口）
    private String cutSize;
    //切口位置
    private String cutLocation;
    //联合切除 
    private String combinedCut;
    //联合切除器官
    private String combined_cutOrgan;
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
    public String getSurgicalApproach(){
        return surgicalApproach;
    } 
    public void setSurgicalApproach(String surgicalApproach) {
         this.surgicalApproach = surgicalApproach;
    } 
    public String getLymphadenectomy(){
        return lymphadenectomy;
    } 
    public void setLymphadenectomy(String lymphadenectomy) {
         this.lymphadenectomy = lymphadenectomy;
    } 
    public String getBleedingVolume(){
        return bleedingVolume;
    } 
    public void setBleedingVolume(String bleedingVolume) {
         this.bleedingVolume = bleedingVolume;
    } 
    public String getAdhesion(){
        return adhesion;
    } 
    public void setAdhesion(String adhesion) {
         this.adhesion = adhesion;
    } 
    public String getAdhesionSite(){
        return adhesionSite;
    } 
    public void setAdhesionSite(String adhesionSite) {
         this.adhesionSite = adhesionSite;
    } 
    public String getResectionMode(){
        return resectionMode;
    } 
    public void setResectionMode(String resectionMode) {
         this.resectionMode = resectionMode;
    } 
    public String getReconstructionMain(){
        return reconstructionMain;
    } 
    public void setReconstructionMain(String reconstructionMain) {
         this.reconstructionMain = reconstructionMain;
    } 
    public String getReconstructionDetail(){
        return reconstructionDetail;
    } 
    public void setReconstructionDetail(String reconstructionDetail) {
         this.reconstructionDetail = reconstructionDetail;
    } 
    public String getSubStructure(){
        return subStructure;
    } 
    public void setSubStructure(String subStructure) {
         this.subStructure = subStructure;
    } 
    public String getD2Plus(){
        return d2Plus;
    } 
    public void setD2Plus(String d2Plus) {
         this.d2Plus = d2Plus;
    } 
    public String getCutSize(){
        return cutSize;
    } 
    public void setCutSize(String cutSize) {
         this.cutSize = cutSize;
    } 
    public String getCutLocation(){
        return cutLocation;
    } 
    public void setCutLocation(String cutLocation) {
         this.cutLocation = cutLocation;
    } 
    public String getCombinedCut(){
        return combinedCut;
    } 
    public void setCombinedCut(String combinedCut) {
         this.combinedCut = combinedCut;
    } 
    public String getCombined_cutOrgan(){
        return combined_cutOrgan;
    } 
    public void setCombined_cutOrgan(String combined_cutOrgan) {
         this.combined_cutOrgan = combined_cutOrgan;
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