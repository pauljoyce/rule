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
    //皮下积液
    private String subcutaneousEffusion;
    //切口血肿
    private String incisionHematoma;
    //切口愈合不良
    private String poorHealingIncision;
    //切口感染
    private String incisionInfection;
    //切口裂开
    private String incisionDehiscence;
    //癫痫   
    private String epilepsy;
    //神经功能障碍
    private String neurologicalDysfunction;
    //意识障碍
    private String disturbanceConsciousness;
    //嗜睡
    private String drowsiness;
    //昏睡
    private String lethargy;
    //昏迷
    private String coma;
    //意识内容障碍
    private String barriersConsciousness;
    //意识模糊
    private String fuzzyConsciousness;
    //谵妄状态
    private String deliriumState;
    //醒状昏迷
    private String awakingComa;
    //睁眼昏迷
    private String comaWithEyesOpen;
    //去皮层综合征
    private String decorticationSyndrome;
    //无动性缄默症
    private String silentMutism;
    //脑死亡
    private String brainDeath;
    //瞳孔散大  
    private String mydriasis;
    //对光反射消失  
    private String lightDisappears;
    //高热   
    private String highFever;
    //尿崩症   
    private String diabetesInsipidus;
    //电解质紊乱
    private String electrolyteDisorder;
    //低钠血症
    private String hyponatremia;
    //高钠血症  
    private String hypernatremia;
    //脑出血
    private String cerebralHemorrhage;
    //消化道出血  
    private String gastrointestinalBleeding;
    //心脑血管意外
    private String cerebrovascularAccident;
    //深静脉血栓
    private String deepVenousThrombosis;
    //肺栓塞
    private String pulmonaryEmbolism;
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
    public String getSubcutaneousEffusion(){
        return subcutaneousEffusion;
    } 
    public void setSubcutaneousEffusion(String subcutaneousEffusion) {
         this.subcutaneousEffusion = subcutaneousEffusion;
    } 
    public String getIncisionHematoma(){
        return incisionHematoma;
    } 
    public void setIncisionHematoma(String incisionHematoma) {
         this.incisionHematoma = incisionHematoma;
    } 
    public String getPoorHealingIncision(){
        return poorHealingIncision;
    } 
    public void setPoorHealingIncision(String poorHealingIncision) {
         this.poorHealingIncision = poorHealingIncision;
    } 
    public String getIncisionInfection(){
        return incisionInfection;
    } 
    public void setIncisionInfection(String incisionInfection) {
         this.incisionInfection = incisionInfection;
    } 
    public String getIncisionDehiscence(){
        return incisionDehiscence;
    } 
    public void setIncisionDehiscence(String incisionDehiscence) {
         this.incisionDehiscence = incisionDehiscence;
    } 
    public String getEpilepsy(){
        return epilepsy;
    } 
    public void setEpilepsy(String epilepsy) {
         this.epilepsy = epilepsy;
    } 
    public String getNeurologicalDysfunction(){
        return neurologicalDysfunction;
    } 
    public void setNeurologicalDysfunction(String neurologicalDysfunction) {
         this.neurologicalDysfunction = neurologicalDysfunction;
    } 
    public String getDisturbanceConsciousness(){
        return disturbanceConsciousness;
    } 
    public void setDisturbanceConsciousness(String disturbanceConsciousness) {
         this.disturbanceConsciousness = disturbanceConsciousness;
    } 
    public String getDrowsiness(){
        return drowsiness;
    } 
    public void setDrowsiness(String drowsiness) {
         this.drowsiness = drowsiness;
    } 
    public String getLethargy(){
        return lethargy;
    } 
    public void setLethargy(String lethargy) {
         this.lethargy = lethargy;
    } 
    public String getComa(){
        return coma;
    } 
    public void setComa(String coma) {
         this.coma = coma;
    } 
    public String getBarriersConsciousness(){
        return barriersConsciousness;
    } 
    public void setBarriersConsciousness(String barriersConsciousness) {
         this.barriersConsciousness = barriersConsciousness;
    } 
    public String getFuzzyConsciousness(){
        return fuzzyConsciousness;
    } 
    public void setFuzzyConsciousness(String fuzzyConsciousness) {
         this.fuzzyConsciousness = fuzzyConsciousness;
    } 
    public String getDeliriumState(){
        return deliriumState;
    } 
    public void setDeliriumState(String deliriumState) {
         this.deliriumState = deliriumState;
    } 
    public String getAwakingComa(){
        return awakingComa;
    } 
    public void setAwakingComa(String awakingComa) {
         this.awakingComa = awakingComa;
    } 
    public String getComaWithEyesOpen(){
        return comaWithEyesOpen;
    } 
    public void setComaWithEyesOpen(String comaWithEyesOpen) {
         this.comaWithEyesOpen = comaWithEyesOpen;
    } 
    public String getDecorticationSyndrome(){
        return decorticationSyndrome;
    } 
    public void setDecorticationSyndrome(String decorticationSyndrome) {
         this.decorticationSyndrome = decorticationSyndrome;
    } 
    public String getSilentMutism(){
        return silentMutism;
    } 
    public void setSilentMutism(String silentMutism) {
         this.silentMutism = silentMutism;
    } 
    public String getBrainDeath(){
        return brainDeath;
    } 
    public void setBrainDeath(String brainDeath) {
         this.brainDeath = brainDeath;
    } 
    public String getMydriasis(){
        return mydriasis;
    } 
    public void setMydriasis(String mydriasis) {
         this.mydriasis = mydriasis;
    } 
    public String getLightDisappears(){
        return lightDisappears;
    } 
    public void setLightDisappears(String lightDisappears) {
         this.lightDisappears = lightDisappears;
    } 
    public String getHighFever(){
        return highFever;
    } 
    public void setHighFever(String highFever) {
         this.highFever = highFever;
    } 
    public String getDiabetesInsipidus(){
        return diabetesInsipidus;
    } 
    public void setDiabetesInsipidus(String diabetesInsipidus) {
         this.diabetesInsipidus = diabetesInsipidus;
    } 
    public String getElectrolyteDisorder(){
        return electrolyteDisorder;
    } 
    public void setElectrolyteDisorder(String electrolyteDisorder) {
         this.electrolyteDisorder = electrolyteDisorder;
    } 
    public String getHyponatremia(){
        return hyponatremia;
    } 
    public void setHyponatremia(String hyponatremia) {
         this.hyponatremia = hyponatremia;
    } 
    public String getHypernatremia(){
        return hypernatremia;
    } 
    public void setHypernatremia(String hypernatremia) {
         this.hypernatremia = hypernatremia;
    } 
    public String getCerebralHemorrhage(){
        return cerebralHemorrhage;
    } 
    public void setCerebralHemorrhage(String cerebralHemorrhage) {
         this.cerebralHemorrhage = cerebralHemorrhage;
    } 
    public String getGastrointestinalBleeding(){
        return gastrointestinalBleeding;
    } 
    public void setGastrointestinalBleeding(String gastrointestinalBleeding) {
         this.gastrointestinalBleeding = gastrointestinalBleeding;
    } 
    public String getCerebrovascularAccident(){
        return cerebrovascularAccident;
    } 
    public void setCerebrovascularAccident(String cerebrovascularAccident) {
         this.cerebrovascularAccident = cerebrovascularAccident;
    } 
    public String getDeepVenousThrombosis(){
        return deepVenousThrombosis;
    } 
    public void setDeepVenousThrombosis(String deepVenousThrombosis) {
         this.deepVenousThrombosis = deepVenousThrombosis;
    } 
    public String getPulmonaryEmbolism(){
        return pulmonaryEmbolism;
    } 
    public void setPulmonaryEmbolism(String pulmonaryEmbolism) {
         this.pulmonaryEmbolism = pulmonaryEmbolism;
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