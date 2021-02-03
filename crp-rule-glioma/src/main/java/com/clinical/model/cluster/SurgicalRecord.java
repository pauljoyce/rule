package com.clinical.model.cluster;
import java.util.Date;
public class SurgicalRecord{
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
    //神经影像导航
    private String neuroimag;
    //功能神经影像导航
    private String functionalNeuroimag;
    //术中神经电生理检测技术
    private String neurophysiological;
    //皮质功能定位
    private String corticalFunction;
    //皮下神经传导束定位
    private String subcutaneousNerve;
    //术中MRI实时影像神经导航
    private String intraoperativeMri;
    //荧光引导的显微手术
    private String fluorescenceGuided;
    //术中B超影像实时定位
    private String intraoperativeBUltrasound;
    //术中运动区监测
    private String intraoperativeMotor;
    //术中感觉区监测
    private String intraoperativeSensory;
    //术中语言区监测
    private String intraoperativeLanguage;
    //术后脑部留置引流管
    private String indwellingDrainageTube;
    //脑引流管放置部位
    private String brainDrainageTube;
    //手术引流情况
    private String surgicalDrainage;
    //送返病房时神志/意识
    private String mindConsciousness;
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
    public String getNeuroimag(){
        return neuroimag;
    } 
    public void setNeuroimag(String neuroimag) {
         this.neuroimag = neuroimag;
    } 
    public String getFunctionalNeuroimag(){
        return functionalNeuroimag;
    } 
    public void setFunctionalNeuroimag(String functionalNeuroimag) {
         this.functionalNeuroimag = functionalNeuroimag;
    } 
    public String getNeurophysiological(){
        return neurophysiological;
    } 
    public void setNeurophysiological(String neurophysiological) {
         this.neurophysiological = neurophysiological;
    } 
    public String getCorticalFunction(){
        return corticalFunction;
    } 
    public void setCorticalFunction(String corticalFunction) {
         this.corticalFunction = corticalFunction;
    } 
    public String getSubcutaneousNerve(){
        return subcutaneousNerve;
    } 
    public void setSubcutaneousNerve(String subcutaneousNerve) {
         this.subcutaneousNerve = subcutaneousNerve;
    } 
    public String getIntraoperativeMri(){
        return intraoperativeMri;
    } 
    public void setIntraoperativeMri(String intraoperativeMri) {
         this.intraoperativeMri = intraoperativeMri;
    } 
    public String getFluorescenceGuided(){
        return fluorescenceGuided;
    } 
    public void setFluorescenceGuided(String fluorescenceGuided) {
         this.fluorescenceGuided = fluorescenceGuided;
    } 
    public String getIntraoperativeBUltrasound(){
        return intraoperativeBUltrasound;
    } 
    public void setIntraoperativeBUltrasound(String intraoperativeBUltrasound) {
         this.intraoperativeBUltrasound = intraoperativeBUltrasound;
    } 
    public String getIntraoperativeMotor(){
        return intraoperativeMotor;
    } 
    public void setIntraoperativeMotor(String intraoperativeMotor) {
         this.intraoperativeMotor = intraoperativeMotor;
    } 
    public String getIntraoperativeSensory(){
        return intraoperativeSensory;
    } 
    public void setIntraoperativeSensory(String intraoperativeSensory) {
         this.intraoperativeSensory = intraoperativeSensory;
    } 
    public String getIntraoperativeLanguage(){
        return intraoperativeLanguage;
    } 
    public void setIntraoperativeLanguage(String intraoperativeLanguage) {
         this.intraoperativeLanguage = intraoperativeLanguage;
    } 
    public String getIndwellingDrainageTube(){
        return indwellingDrainageTube;
    } 
    public void setIndwellingDrainageTube(String indwellingDrainageTube) {
         this.indwellingDrainageTube = indwellingDrainageTube;
    } 
    public String getBrainDrainageTube(){
        return brainDrainageTube;
    } 
    public void setBrainDrainageTube(String brainDrainageTube) {
         this.brainDrainageTube = brainDrainageTube;
    } 
    public String getSurgicalDrainage(){
        return surgicalDrainage;
    } 
    public void setSurgicalDrainage(String surgicalDrainage) {
         this.surgicalDrainage = surgicalDrainage;
    } 
    public String getMindConsciousness(){
        return mindConsciousness;
    } 
    public void setMindConsciousness(String mindConsciousness) {
         this.mindConsciousness = mindConsciousness;
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