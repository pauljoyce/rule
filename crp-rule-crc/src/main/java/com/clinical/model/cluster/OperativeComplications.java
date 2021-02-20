package com.clinical.model.cluster;
import java.util.Date;
public class OperativeComplications{
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
    //脂肪液化
    private String fatLiquefaction;
    //感染性休克
    private String septicShock;
    //出血
    private String hemorrhage;
    //吻合口出血
    private String anastomoticBleeding;
    //腹腔出血
    private String abdominalHemorrhage;
    //胆漏
    private String bileLeakage;
    //肠漏
    private String enterorrhea;
    //肺部感染
    private String pulmonaryInfection;
    //呼吸衰竭
    private String respiratoryFailure;
    //心力衰竭
    private String heartFailure;
    //深静脉血栓
    private String deepVenousThrombosis;
    //肺不张
    private String atelectasis;
    //吻合口瘘
    private String anastomoticLeakage;
    //腹膜炎
    private String peritonitis;
    //泌尿系感染
    private String urinaryTractInfection;
    //肠梗阻
    private String intestinalObstruction;
    //尿潴留
    private String urinaryRetention;
    //消化道出血
    private String gastrointestinalBleeding;
    //腹腔感染
    private String abdominalInfection;
    //心脑血管意外
    private String cardiovascularAndCerebrovascularAccident;
    //肺栓塞
    private String pulmonaryEmbolism;
    //切口感染
    private String incisionInfection;
    //消化道穿孔
    private String gastrointestinalPerforation;
    //腹腔积液
    private String ascites;
    //淋巴瘘
    private String lymphaticFistula;
    //酮症酸中毒
    private String ketoacidosis;
    //吻合口狭窄
    private String anastomoticStenosis;
    //肾功能衰竭
    private String renalFailure;
    //全身多器官功能衰竭
    private String systemicMultipleOrganFailure;
    //肝功能不全
    private String liverDysfunction;
    //肝功能衰竭
    private String liverFailure;
    //腹腔内出血
    private String intraperitonealHemorrhage;
    //胰腺炎
    private String pancreatitis;
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
    public String getFatLiquefaction(){
        return fatLiquefaction;
    } 
    public void setFatLiquefaction(String fatLiquefaction) {
         this.fatLiquefaction = fatLiquefaction;
    } 
    public String getSepticShock(){
        return septicShock;
    } 
    public void setSepticShock(String septicShock) {
         this.septicShock = septicShock;
    } 
    public String getHemorrhage(){
        return hemorrhage;
    } 
    public void setHemorrhage(String hemorrhage) {
         this.hemorrhage = hemorrhage;
    } 
    public String getAnastomoticBleeding(){
        return anastomoticBleeding;
    } 
    public void setAnastomoticBleeding(String anastomoticBleeding) {
         this.anastomoticBleeding = anastomoticBleeding;
    } 
    public String getAbdominalHemorrhage(){
        return abdominalHemorrhage;
    } 
    public void setAbdominalHemorrhage(String abdominalHemorrhage) {
         this.abdominalHemorrhage = abdominalHemorrhage;
    } 
    public String getBileLeakage(){
        return bileLeakage;
    } 
    public void setBileLeakage(String bileLeakage) {
         this.bileLeakage = bileLeakage;
    } 
    public String getEnterorrhea(){
        return enterorrhea;
    } 
    public void setEnterorrhea(String enterorrhea) {
         this.enterorrhea = enterorrhea;
    } 
    public String getPulmonaryInfection(){
        return pulmonaryInfection;
    } 
    public void setPulmonaryInfection(String pulmonaryInfection) {
         this.pulmonaryInfection = pulmonaryInfection;
    } 
    public String getRespiratoryFailure(){
        return respiratoryFailure;
    } 
    public void setRespiratoryFailure(String respiratoryFailure) {
         this.respiratoryFailure = respiratoryFailure;
    } 
    public String getHeartFailure(){
        return heartFailure;
    } 
    public void setHeartFailure(String heartFailure) {
         this.heartFailure = heartFailure;
    } 
    public String getDeepVenousThrombosis(){
        return deepVenousThrombosis;
    } 
    public void setDeepVenousThrombosis(String deepVenousThrombosis) {
         this.deepVenousThrombosis = deepVenousThrombosis;
    } 
    public String getAtelectasis(){
        return atelectasis;
    } 
    public void setAtelectasis(String atelectasis) {
         this.atelectasis = atelectasis;
    } 
    public String getAnastomoticLeakage(){
        return anastomoticLeakage;
    } 
    public void setAnastomoticLeakage(String anastomoticLeakage) {
         this.anastomoticLeakage = anastomoticLeakage;
    } 
    public String getPeritonitis(){
        return peritonitis;
    } 
    public void setPeritonitis(String peritonitis) {
         this.peritonitis = peritonitis;
    } 
    public String getUrinaryTractInfection(){
        return urinaryTractInfection;
    } 
    public void setUrinaryTractInfection(String urinaryTractInfection) {
         this.urinaryTractInfection = urinaryTractInfection;
    } 
    public String getIntestinalObstruction(){
        return intestinalObstruction;
    } 
    public void setIntestinalObstruction(String intestinalObstruction) {
         this.intestinalObstruction = intestinalObstruction;
    } 
    public String getUrinaryRetention(){
        return urinaryRetention;
    } 
    public void setUrinaryRetention(String urinaryRetention) {
         this.urinaryRetention = urinaryRetention;
    } 
    public String getGastrointestinalBleeding(){
        return gastrointestinalBleeding;
    } 
    public void setGastrointestinalBleeding(String gastrointestinalBleeding) {
         this.gastrointestinalBleeding = gastrointestinalBleeding;
    } 
    public String getAbdominalInfection(){
        return abdominalInfection;
    } 
    public void setAbdominalInfection(String abdominalInfection) {
         this.abdominalInfection = abdominalInfection;
    } 
    public String getCardiovascularAndCerebrovascularAccident(){
        return cardiovascularAndCerebrovascularAccident;
    } 
    public void setCardiovascularAndCerebrovascularAccident(String cardiovascularAndCerebrovascularAccident) {
         this.cardiovascularAndCerebrovascularAccident = cardiovascularAndCerebrovascularAccident;
    } 
    public String getPulmonaryEmbolism(){
        return pulmonaryEmbolism;
    } 
    public void setPulmonaryEmbolism(String pulmonaryEmbolism) {
         this.pulmonaryEmbolism = pulmonaryEmbolism;
    } 
    public String getIncisionInfection(){
        return incisionInfection;
    } 
    public void setIncisionInfection(String incisionInfection) {
         this.incisionInfection = incisionInfection;
    } 
    public String getGastrointestinalPerforation(){
        return gastrointestinalPerforation;
    } 
    public void setGastrointestinalPerforation(String gastrointestinalPerforation) {
         this.gastrointestinalPerforation = gastrointestinalPerforation;
    } 
    public String getAscites(){
        return ascites;
    } 
    public void setAscites(String ascites) {
         this.ascites = ascites;
    } 
    public String getLymphaticFistula(){
        return lymphaticFistula;
    } 
    public void setLymphaticFistula(String lymphaticFistula) {
         this.lymphaticFistula = lymphaticFistula;
    } 
    public String getKetoacidosis(){
        return ketoacidosis;
    } 
    public void setKetoacidosis(String ketoacidosis) {
         this.ketoacidosis = ketoacidosis;
    } 
    public String getAnastomoticStenosis(){
        return anastomoticStenosis;
    } 
    public void setAnastomoticStenosis(String anastomoticStenosis) {
         this.anastomoticStenosis = anastomoticStenosis;
    } 
    public String getRenalFailure(){
        return renalFailure;
    } 
    public void setRenalFailure(String renalFailure) {
         this.renalFailure = renalFailure;
    } 
    public String getSystemicMultipleOrganFailure(){
        return systemicMultipleOrganFailure;
    } 
    public void setSystemicMultipleOrganFailure(String systemicMultipleOrganFailure) {
         this.systemicMultipleOrganFailure = systemicMultipleOrganFailure;
    } 
    public String getLiverDysfunction(){
        return liverDysfunction;
    } 
    public void setLiverDysfunction(String liverDysfunction) {
         this.liverDysfunction = liverDysfunction;
    } 
    public String getLiverFailure(){
        return liverFailure;
    } 
    public void setLiverFailure(String liverFailure) {
         this.liverFailure = liverFailure;
    } 
    public String getIntraperitonealHemorrhage(){
        return intraperitonealHemorrhage;
    } 
    public void setIntraperitonealHemorrhage(String intraperitonealHemorrhage) {
         this.intraperitonealHemorrhage = intraperitonealHemorrhage;
    } 
    public String getPancreatitis(){
        return pancreatitis;
    } 
    public void setPancreatitis(String pancreatitis) {
         this.pancreatitis = pancreatitis;
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