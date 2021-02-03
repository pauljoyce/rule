package com.clinical.model.cluster;
import java.util.Date;
public class Symptom{
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
    //门诊/住院号
    private String visitId;
    //乳头外观
    private String appearance;
    //乳头溢液情况
    private String nippleOverflow;
    //乳头溢液部位
    private String nippleOverflowSite;
    //乳头溢液孔
    private String nippleOverflowHole;
    //乳头溢液的颜色
    private String nippleOverflowColor;
    //乳房包块数目
    private String massesNumber;
    //乳房包块距乳头距离
    private String massNippleDistance;
    //乳房包块与乳房的相对位置
    private String relativePosition;
    //乳房包块位置（象限）
    private String locationQuadrant;
    //乳房包块位置（以钟点方式定位）
    private String locationInClock;
    //乳房包块活动度
    private String massActivity;
    //乳房包块与胸壁情况
    private String massChest;
    //乳房包块表面皮肤外观
    private String skinAppearance;
    //乳房包块表面皮肤光滑程度
    private String skinSmoothness;
    //乳房包块痛感
    private String lumpPain;
    //乳房包块质地
    private String massTexture;
    //乳房包块边缘情况
    private String massEdge;
    //乳晕水肿
    private String areolaEdema;
    //疼痛情况
    private String pain;
    //腋窝肿块
    private String axillaryMass;
    //炎性乳腺癌
    private String inflammatoryCancer;
    //心力衰竭症状
    private String heartFailure;
    //其它症状和体征
    private String otherSymptoms;
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
    public String getAppearance(){
        return appearance;
    } 
    public void setAppearance(String appearance) {
         this.appearance = appearance;
    } 
    public String getNippleOverflow(){
        return nippleOverflow;
    } 
    public void setNippleOverflow(String nippleOverflow) {
         this.nippleOverflow = nippleOverflow;
    } 
    public String getNippleOverflowSite(){
        return nippleOverflowSite;
    } 
    public void setNippleOverflowSite(String nippleOverflowSite) {
         this.nippleOverflowSite = nippleOverflowSite;
    } 
    public String getNippleOverflowHole(){
        return nippleOverflowHole;
    } 
    public void setNippleOverflowHole(String nippleOverflowHole) {
         this.nippleOverflowHole = nippleOverflowHole;
    } 
    public String getNippleOverflowColor(){
        return nippleOverflowColor;
    } 
    public void setNippleOverflowColor(String nippleOverflowColor) {
         this.nippleOverflowColor = nippleOverflowColor;
    } 
    public String getMassesNumber(){
        return massesNumber;
    } 
    public void setMassesNumber(String massesNumber) {
         this.massesNumber = massesNumber;
    } 
    public String getMassNippleDistance(){
        return massNippleDistance;
    } 
    public void setMassNippleDistance(String massNippleDistance) {
         this.massNippleDistance = massNippleDistance;
    } 
    public String getRelativePosition(){
        return relativePosition;
    } 
    public void setRelativePosition(String relativePosition) {
         this.relativePosition = relativePosition;
    } 
    public String getLocationQuadrant(){
        return locationQuadrant;
    } 
    public void setLocationQuadrant(String locationQuadrant) {
         this.locationQuadrant = locationQuadrant;
    } 
    public String getLocationInClock(){
        return locationInClock;
    } 
    public void setLocationInClock(String locationInClock) {
         this.locationInClock = locationInClock;
    } 
    public String getMassActivity(){
        return massActivity;
    } 
    public void setMassActivity(String massActivity) {
         this.massActivity = massActivity;
    } 
    public String getMassChest(){
        return massChest;
    } 
    public void setMassChest(String massChest) {
         this.massChest = massChest;
    } 
    public String getSkinAppearance(){
        return skinAppearance;
    } 
    public void setSkinAppearance(String skinAppearance) {
         this.skinAppearance = skinAppearance;
    } 
    public String getSkinSmoothness(){
        return skinSmoothness;
    } 
    public void setSkinSmoothness(String skinSmoothness) {
         this.skinSmoothness = skinSmoothness;
    } 
    public String getLumpPain(){
        return lumpPain;
    } 
    public void setLumpPain(String lumpPain) {
         this.lumpPain = lumpPain;
    } 
    public String getMassTexture(){
        return massTexture;
    } 
    public void setMassTexture(String massTexture) {
         this.massTexture = massTexture;
    } 
    public String getMassEdge(){
        return massEdge;
    } 
    public void setMassEdge(String massEdge) {
         this.massEdge = massEdge;
    } 
    public String getAreolaEdema(){
        return areolaEdema;
    } 
    public void setAreolaEdema(String areolaEdema) {
         this.areolaEdema = areolaEdema;
    } 
    public String getPain(){
        return pain;
    } 
    public void setPain(String pain) {
         this.pain = pain;
    } 
    public String getAxillaryMass(){
        return axillaryMass;
    } 
    public void setAxillaryMass(String axillaryMass) {
         this.axillaryMass = axillaryMass;
    } 
    public String getInflammatoryCancer(){
        return inflammatoryCancer;
    } 
    public void setInflammatoryCancer(String inflammatoryCancer) {
         this.inflammatoryCancer = inflammatoryCancer;
    } 
    public String getHeartFailure(){
        return heartFailure;
    } 
    public void setHeartFailure(String heartFailure) {
         this.heartFailure = heartFailure;
    } 
    public String getOtherSymptoms(){
        return otherSymptoms;
    } 
    public void setOtherSymptoms(String otherSymptoms) {
         this.otherSymptoms = otherSymptoms;
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