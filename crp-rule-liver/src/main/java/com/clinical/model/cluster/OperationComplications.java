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
    //皮下积液
    private String scalpHydrops;
    //切口血肿
    private String incisionHematoma;
    //切口愈合不良
    private String poorWoundHealing;
    //切口感染
    private String incisionInfection;
    //切口裂开
    private String woundDisruption;
    //吻合口瘘
    private String stomaFistula;
    //肛瘘
    private String analFistula;
    //肠瘘                                                                                            
    private String intestinalFistula;
    //十二指肠残端瘘
    private String duodenalStumpFistula;
    //淋巴漏
    private String lymphLeakage;
    //胰瘘
    private String pancreaticFistula;
    //腹腔内出血
    private String abdominalBleeding;
    //消化道内出血（消化道溃疡并出血）
    private String inAlimentaryBleeding;
    //手术周围器官损伤出血
    private String opsDamageBleeding;
    //脾出血
    private String splenorrhagia;
    //胰腺出血
    private String pancreasBleeding;
    //肝出血
    private String liverBleeding;
    //肠出血
    private String enterorrhagid;
    //肾出血
    private String nephrorrhagia;
    //吻合口瘘
    private String anastomoticLeakage;
    //吻合口出血
    private String anastomoticBleeding;
    //吻合口狭窄
    private String anastomoticStenosis;
    //腹腔积液
    private String ascites;
    //腹腔脓肿
    private String abdominalAbscess;
    //腹腔感染
    private String abdominalInfection;
    //肠梗阻
    private String intestinalObstruction;
    //残胃炎（残胃溃疡）
    private String remnantGastritis;
    //胃瘫
    private String gastroparesis;
    //十二指肠球炎（十二指肠溃疡）
    private String bulbarDuodenitis;
    //胰腺炎
    private String pancreatitis;
    //肝炎
    private String hepatitis;
    //胆囊炎
    private String cholecystitis;
    //肺炎
    private String pneumonia;
    //胸腔积液
    private String pleuralEffusion;
    //肝衰竭
    private String hepaticFailure;
    //肾衰竭
    private String renalFailure;
    //心脑血管意外
    private String cardiovascularAccident;
    //深静脉血栓
    private String deepVenousThrombosis;
    //肺栓塞
    private String pulmonaryEmbolism;
    //并发症发生日期
    private Date complicationDate;
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
    public String getScalpHydrops(){
        return scalpHydrops;
    } 
    public void setScalpHydrops(String scalpHydrops) {
         this.scalpHydrops = scalpHydrops;
    } 
    public String getIncisionHematoma(){
        return incisionHematoma;
    } 
    public void setIncisionHematoma(String incisionHematoma) {
         this.incisionHematoma = incisionHematoma;
    } 
    public String getPoorWoundHealing(){
        return poorWoundHealing;
    } 
    public void setPoorWoundHealing(String poorWoundHealing) {
         this.poorWoundHealing = poorWoundHealing;
    } 
    public String getIncisionInfection(){
        return incisionInfection;
    } 
    public void setIncisionInfection(String incisionInfection) {
         this.incisionInfection = incisionInfection;
    } 
    public String getWoundDisruption(){
        return woundDisruption;
    } 
    public void setWoundDisruption(String woundDisruption) {
         this.woundDisruption = woundDisruption;
    } 
    public String getStomaFistula(){
        return stomaFistula;
    } 
    public void setStomaFistula(String stomaFistula) {
         this.stomaFistula = stomaFistula;
    } 
    public String getAnalFistula(){
        return analFistula;
    } 
    public void setAnalFistula(String analFistula) {
         this.analFistula = analFistula;
    } 
    public String getIntestinalFistula(){
        return intestinalFistula;
    } 
    public void setIntestinalFistula(String intestinalFistula) {
         this.intestinalFistula = intestinalFistula;
    } 
    public String getDuodenalStumpFistula(){
        return duodenalStumpFistula;
    } 
    public void setDuodenalStumpFistula(String duodenalStumpFistula) {
         this.duodenalStumpFistula = duodenalStumpFistula;
    } 
    public String getLymphLeakage(){
        return lymphLeakage;
    } 
    public void setLymphLeakage(String lymphLeakage) {
         this.lymphLeakage = lymphLeakage;
    } 
    public String getPancreaticFistula(){
        return pancreaticFistula;
    } 
    public void setPancreaticFistula(String pancreaticFistula) {
         this.pancreaticFistula = pancreaticFistula;
    } 
    public String getAbdominalBleeding(){
        return abdominalBleeding;
    } 
    public void setAbdominalBleeding(String abdominalBleeding) {
         this.abdominalBleeding = abdominalBleeding;
    } 
    public String getInAlimentaryBleeding(){
        return inAlimentaryBleeding;
    } 
    public void setInAlimentaryBleeding(String inAlimentaryBleeding) {
         this.inAlimentaryBleeding = inAlimentaryBleeding;
    } 
    public String getOpsDamageBleeding(){
        return opsDamageBleeding;
    } 
    public void setOpsDamageBleeding(String opsDamageBleeding) {
         this.opsDamageBleeding = opsDamageBleeding;
    } 
    public String getSplenorrhagia(){
        return splenorrhagia;
    } 
    public void setSplenorrhagia(String splenorrhagia) {
         this.splenorrhagia = splenorrhagia;
    } 
    public String getPancreasBleeding(){
        return pancreasBleeding;
    } 
    public void setPancreasBleeding(String pancreasBleeding) {
         this.pancreasBleeding = pancreasBleeding;
    } 
    public String getLiverBleeding(){
        return liverBleeding;
    } 
    public void setLiverBleeding(String liverBleeding) {
         this.liverBleeding = liverBleeding;
    } 
    public String getEnterorrhagid(){
        return enterorrhagid;
    } 
    public void setEnterorrhagid(String enterorrhagid) {
         this.enterorrhagid = enterorrhagid;
    } 
    public String getNephrorrhagia(){
        return nephrorrhagia;
    } 
    public void setNephrorrhagia(String nephrorrhagia) {
         this.nephrorrhagia = nephrorrhagia;
    } 
    public String getAnastomoticLeakage(){
        return anastomoticLeakage;
    } 
    public void setAnastomoticLeakage(String anastomoticLeakage) {
         this.anastomoticLeakage = anastomoticLeakage;
    } 
    public String getAnastomoticBleeding(){
        return anastomoticBleeding;
    } 
    public void setAnastomoticBleeding(String anastomoticBleeding) {
         this.anastomoticBleeding = anastomoticBleeding;
    } 
    public String getAnastomoticStenosis(){
        return anastomoticStenosis;
    } 
    public void setAnastomoticStenosis(String anastomoticStenosis) {
         this.anastomoticStenosis = anastomoticStenosis;
    } 
    public String getAscites(){
        return ascites;
    } 
    public void setAscites(String ascites) {
         this.ascites = ascites;
    } 
    public String getAbdominalAbscess(){
        return abdominalAbscess;
    } 
    public void setAbdominalAbscess(String abdominalAbscess) {
         this.abdominalAbscess = abdominalAbscess;
    } 
    public String getAbdominalInfection(){
        return abdominalInfection;
    } 
    public void setAbdominalInfection(String abdominalInfection) {
         this.abdominalInfection = abdominalInfection;
    } 
    public String getIntestinalObstruction(){
        return intestinalObstruction;
    } 
    public void setIntestinalObstruction(String intestinalObstruction) {
         this.intestinalObstruction = intestinalObstruction;
    } 
    public String getRemnantGastritis(){
        return remnantGastritis;
    } 
    public void setRemnantGastritis(String remnantGastritis) {
         this.remnantGastritis = remnantGastritis;
    } 
    public String getGastroparesis(){
        return gastroparesis;
    } 
    public void setGastroparesis(String gastroparesis) {
         this.gastroparesis = gastroparesis;
    } 
    public String getBulbarDuodenitis(){
        return bulbarDuodenitis;
    } 
    public void setBulbarDuodenitis(String bulbarDuodenitis) {
         this.bulbarDuodenitis = bulbarDuodenitis;
    } 
    public String getPancreatitis(){
        return pancreatitis;
    } 
    public void setPancreatitis(String pancreatitis) {
         this.pancreatitis = pancreatitis;
    } 
    public String getHepatitis(){
        return hepatitis;
    } 
    public void setHepatitis(String hepatitis) {
         this.hepatitis = hepatitis;
    } 
    public String getCholecystitis(){
        return cholecystitis;
    } 
    public void setCholecystitis(String cholecystitis) {
         this.cholecystitis = cholecystitis;
    } 
    public String getPneumonia(){
        return pneumonia;
    } 
    public void setPneumonia(String pneumonia) {
         this.pneumonia = pneumonia;
    } 
    public String getPleuralEffusion(){
        return pleuralEffusion;
    } 
    public void setPleuralEffusion(String pleuralEffusion) {
         this.pleuralEffusion = pleuralEffusion;
    } 
    public String getHepaticFailure(){
        return hepaticFailure;
    } 
    public void setHepaticFailure(String hepaticFailure) {
         this.hepaticFailure = hepaticFailure;
    } 
    public String getRenalFailure(){
        return renalFailure;
    } 
    public void setRenalFailure(String renalFailure) {
         this.renalFailure = renalFailure;
    } 
    public String getCardiovascularAccident(){
        return cardiovascularAccident;
    } 
    public void setCardiovascularAccident(String cardiovascularAccident) {
         this.cardiovascularAccident = cardiovascularAccident;
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
    public Date getComplicationDate(){
        return complicationDate;
    } 
    public void setComplicationDate(Date complicationDate) {
         this.complicationDate = complicationDate;
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