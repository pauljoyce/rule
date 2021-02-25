package com.clinical.model.cluster;
import java.util.Date;
public class OperationComplications{
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
    //发热
    private String fever;
    //感染
    private String infected;
    //肝功能衰竭
    private String liverFailure;
    //消化道内出血
    private String gastrointestinalBleeding;
    //急腹症
    private String acuteAbdomen;
    //肌无力
    private String myasthenia;
    //无尿
    private String anuria;
    //腹腔感染
    private String abdominalInfection;
    //腹腔内出血
    private String intraperitonealHemorrhage;
    //胆道感染
    private String biliaryTractInfection;
    //休克
    private String shock;
    //便秘
    private String constipation;
    //肝功能不全
    private String liverDysfunction;
    //腹泻
    private String diarrhea;
    //胸腔出血
    private String pleuralHemorrhage;
    //全身多器官功能衰竭
    private String multipleOrganFailure;
    //心脑血管意外
    private String cerebrovascularAccident;
    //下腔静脉狭窄
    private String stenosisInferiorVenaCava;
    //胆囊炎
    private String cholecystitis;
    //胸腔积液
    private String pleuralEffusion;
    //肾功能衰竭
    private String renalFailure;
    //肠梗阻
    private String intestinalObstruction;
    //腹腔积液
    private String ascites;
    //肺部感染
    private String pulmonaryInfection;
    //低蛋白血症
    private String hypoproteinemia;
    //胰腺炎
    private String pancreatitis;
    //肺栓塞
    private String pulmonaryEmbolism;
    //气胸
    private String pneumothorax;
    //癫痫大发作
    private String grandMal;
    //肝性脑病
    private String hepaticEncephalopathy;
    //胆漏
    private String bileLeakage;
    //吻合口瘘
    private String anastomoticLeakage;
    //昏迷
    private String coma;
    //谵妄
    private String delirium;
    //眩晕
    private String vertigo;
    //恶心
    private String nausea;
    //晕厥
    private String syncope;
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
    public String getFever(){
        return fever;
    } 
    public void setFever(String fever) {
         this.fever = fever;
    } 
    public String getInfected(){
        return infected;
    } 
    public void setInfected(String infected) {
         this.infected = infected;
    } 
    public String getLiverFailure(){
        return liverFailure;
    } 
    public void setLiverFailure(String liverFailure) {
         this.liverFailure = liverFailure;
    } 
    public String getGastrointestinalBleeding(){
        return gastrointestinalBleeding;
    } 
    public void setGastrointestinalBleeding(String gastrointestinalBleeding) {
         this.gastrointestinalBleeding = gastrointestinalBleeding;
    } 
    public String getAcuteAbdomen(){
        return acuteAbdomen;
    } 
    public void setAcuteAbdomen(String acuteAbdomen) {
         this.acuteAbdomen = acuteAbdomen;
    } 
    public String getMyasthenia(){
        return myasthenia;
    } 
    public void setMyasthenia(String myasthenia) {
         this.myasthenia = myasthenia;
    } 
    public String getAnuria(){
        return anuria;
    } 
    public void setAnuria(String anuria) {
         this.anuria = anuria;
    } 
    public String getAbdominalInfection(){
        return abdominalInfection;
    } 
    public void setAbdominalInfection(String abdominalInfection) {
         this.abdominalInfection = abdominalInfection;
    } 
    public String getIntraperitonealHemorrhage(){
        return intraperitonealHemorrhage;
    } 
    public void setIntraperitonealHemorrhage(String intraperitonealHemorrhage) {
         this.intraperitonealHemorrhage = intraperitonealHemorrhage;
    } 
    public String getBiliaryTractInfection(){
        return biliaryTractInfection;
    } 
    public void setBiliaryTractInfection(String biliaryTractInfection) {
         this.biliaryTractInfection = biliaryTractInfection;
    } 
    public String getShock(){
        return shock;
    } 
    public void setShock(String shock) {
         this.shock = shock;
    } 
    public String getConstipation(){
        return constipation;
    } 
    public void setConstipation(String constipation) {
         this.constipation = constipation;
    } 
    public String getLiverDysfunction(){
        return liverDysfunction;
    } 
    public void setLiverDysfunction(String liverDysfunction) {
         this.liverDysfunction = liverDysfunction;
    } 
    public String getDiarrhea(){
        return diarrhea;
    } 
    public void setDiarrhea(String diarrhea) {
         this.diarrhea = diarrhea;
    } 
    public String getPleuralHemorrhage(){
        return pleuralHemorrhage;
    } 
    public void setPleuralHemorrhage(String pleuralHemorrhage) {
         this.pleuralHemorrhage = pleuralHemorrhage;
    } 
    public String getMultipleOrganFailure(){
        return multipleOrganFailure;
    } 
    public void setMultipleOrganFailure(String multipleOrganFailure) {
         this.multipleOrganFailure = multipleOrganFailure;
    } 
    public String getCerebrovascularAccident(){
        return cerebrovascularAccident;
    } 
    public void setCerebrovascularAccident(String cerebrovascularAccident) {
         this.cerebrovascularAccident = cerebrovascularAccident;
    } 
    public String getStenosisInferiorVenaCava(){
        return stenosisInferiorVenaCava;
    } 
    public void setStenosisInferiorVenaCava(String stenosisInferiorVenaCava) {
         this.stenosisInferiorVenaCava = stenosisInferiorVenaCava;
    } 
    public String getCholecystitis(){
        return cholecystitis;
    } 
    public void setCholecystitis(String cholecystitis) {
         this.cholecystitis = cholecystitis;
    } 
    public String getPleuralEffusion(){
        return pleuralEffusion;
    } 
    public void setPleuralEffusion(String pleuralEffusion) {
         this.pleuralEffusion = pleuralEffusion;
    } 
    public String getRenalFailure(){
        return renalFailure;
    } 
    public void setRenalFailure(String renalFailure) {
         this.renalFailure = renalFailure;
    } 
    public String getIntestinalObstruction(){
        return intestinalObstruction;
    } 
    public void setIntestinalObstruction(String intestinalObstruction) {
         this.intestinalObstruction = intestinalObstruction;
    } 
    public String getAscites(){
        return ascites;
    } 
    public void setAscites(String ascites) {
         this.ascites = ascites;
    } 
    public String getPulmonaryInfection(){
        return pulmonaryInfection;
    } 
    public void setPulmonaryInfection(String pulmonaryInfection) {
         this.pulmonaryInfection = pulmonaryInfection;
    } 
    public String getHypoproteinemia(){
        return hypoproteinemia;
    } 
    public void setHypoproteinemia(String hypoproteinemia) {
         this.hypoproteinemia = hypoproteinemia;
    } 
    public String getPancreatitis(){
        return pancreatitis;
    } 
    public void setPancreatitis(String pancreatitis) {
         this.pancreatitis = pancreatitis;
    } 
    public String getPulmonaryEmbolism(){
        return pulmonaryEmbolism;
    } 
    public void setPulmonaryEmbolism(String pulmonaryEmbolism) {
         this.pulmonaryEmbolism = pulmonaryEmbolism;
    } 
    public String getPneumothorax(){
        return pneumothorax;
    } 
    public void setPneumothorax(String pneumothorax) {
         this.pneumothorax = pneumothorax;
    } 
    public String getGrandMal(){
        return grandMal;
    } 
    public void setGrandMal(String grandMal) {
         this.grandMal = grandMal;
    } 
    public String getHepaticEncephalopathy(){
        return hepaticEncephalopathy;
    } 
    public void setHepaticEncephalopathy(String hepaticEncephalopathy) {
         this.hepaticEncephalopathy = hepaticEncephalopathy;
    } 
    public String getBileLeakage(){
        return bileLeakage;
    } 
    public void setBileLeakage(String bileLeakage) {
         this.bileLeakage = bileLeakage;
    } 
    public String getAnastomoticLeakage(){
        return anastomoticLeakage;
    } 
    public void setAnastomoticLeakage(String anastomoticLeakage) {
         this.anastomoticLeakage = anastomoticLeakage;
    } 
    public String getComa(){
        return coma;
    } 
    public void setComa(String coma) {
         this.coma = coma;
    } 
    public String getDelirium(){
        return delirium;
    } 
    public void setDelirium(String delirium) {
         this.delirium = delirium;
    } 
    public String getVertigo(){
        return vertigo;
    } 
    public void setVertigo(String vertigo) {
         this.vertigo = vertigo;
    } 
    public String getNausea(){
        return nausea;
    } 
    public void setNausea(String nausea) {
         this.nausea = nausea;
    } 
    public String getSyncope(){
        return syncope;
    } 
    public void setSyncope(String syncope) {
         this.syncope = syncope;
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