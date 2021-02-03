package com.clinical.model.cluster;
import java.util.Date;
public class HisMarriage{
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
    //月经来潮年龄
    private Integer menstrualAge;
    //月经出血量
    private String menstrualBleeding;
    //月经周期
    private String menstrualCycle;
    //月经规律
    private String menstrualRegularity;
    //口服避孕药
    private String oralContraceptives;
    //怀孕次数
    private Integer pregnanciesNumber;
    //早产次数
    private Integer prematureBirthNumber;
    //流产次数
    private Integer abortionsNumber;
    //正常生育次数
    private Integer normalBirthNumber;
    //生产次数
    private Integer productionTimes;
    //试管婴儿史
    private String ivf;
    //具体生育史
    private String birthHistory;
    //停经、绝经
    private String menopause;
    //末次月经
    private Date lastMenstruation;
    //停经、绝经年龄
    private Integer menopauseAge;
    //结婚年龄
    private Integer marriageAge;
    //性生活开始年龄
    private Integer sexBegin;
    //性伴侣个数
    private Integer sexualPartners;
    //宫颈癌疫苗
    private String cervicalCancerVaccine;
    //宫颈癌疫苗名称
    private String vaccineName;
    //宫颈癌疫苗接种时间
    private Date vaccineTime;
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
    public Integer getMenstrualAge(){
        return menstrualAge;
    } 
    public void setMenstrualAge(Integer menstrualAge) {
         this.menstrualAge = menstrualAge;
    } 
    public String getMenstrualBleeding(){
        return menstrualBleeding;
    } 
    public void setMenstrualBleeding(String menstrualBleeding) {
         this.menstrualBleeding = menstrualBleeding;
    } 
    public String getMenstrualCycle(){
        return menstrualCycle;
    } 
    public void setMenstrualCycle(String menstrualCycle) {
         this.menstrualCycle = menstrualCycle;
    } 
    public String getMenstrualRegularity(){
        return menstrualRegularity;
    } 
    public void setMenstrualRegularity(String menstrualRegularity) {
         this.menstrualRegularity = menstrualRegularity;
    } 
    public String getOralContraceptives(){
        return oralContraceptives;
    } 
    public void setOralContraceptives(String oralContraceptives) {
         this.oralContraceptives = oralContraceptives;
    } 
    public Integer getPregnanciesNumber(){
        return pregnanciesNumber;
    } 
    public void setPregnanciesNumber(Integer pregnanciesNumber) {
         this.pregnanciesNumber = pregnanciesNumber;
    } 
    public Integer getPrematureBirthNumber(){
        return prematureBirthNumber;
    } 
    public void setPrematureBirthNumber(Integer prematureBirthNumber) {
         this.prematureBirthNumber = prematureBirthNumber;
    } 
    public Integer getAbortionsNumber(){
        return abortionsNumber;
    } 
    public void setAbortionsNumber(Integer abortionsNumber) {
         this.abortionsNumber = abortionsNumber;
    } 
    public Integer getNormalBirthNumber(){
        return normalBirthNumber;
    } 
    public void setNormalBirthNumber(Integer normalBirthNumber) {
         this.normalBirthNumber = normalBirthNumber;
    } 
    public Integer getProductionTimes(){
        return productionTimes;
    } 
    public void setProductionTimes(Integer productionTimes) {
         this.productionTimes = productionTimes;
    } 
    public String getIvf(){
        return ivf;
    } 
    public void setIvf(String ivf) {
         this.ivf = ivf;
    } 
    public String getBirthHistory(){
        return birthHistory;
    } 
    public void setBirthHistory(String birthHistory) {
         this.birthHistory = birthHistory;
    } 
    public String getMenopause(){
        return menopause;
    } 
    public void setMenopause(String menopause) {
         this.menopause = menopause;
    } 
    public Date getLastMenstruation(){
        return lastMenstruation;
    } 
    public void setLastMenstruation(Date lastMenstruation) {
         this.lastMenstruation = lastMenstruation;
    } 
    public Integer getMenopauseAge(){
        return menopauseAge;
    } 
    public void setMenopauseAge(Integer menopauseAge) {
         this.menopauseAge = menopauseAge;
    } 
    public Integer getMarriageAge(){
        return marriageAge;
    } 
    public void setMarriageAge(Integer marriageAge) {
         this.marriageAge = marriageAge;
    } 
    public Integer getSexBegin(){
        return sexBegin;
    } 
    public void setSexBegin(Integer sexBegin) {
         this.sexBegin = sexBegin;
    } 
    public Integer getSexualPartners(){
        return sexualPartners;
    } 
    public void setSexualPartners(Integer sexualPartners) {
         this.sexualPartners = sexualPartners;
    } 
    public String getCervicalCancerVaccine(){
        return cervicalCancerVaccine;
    } 
    public void setCervicalCancerVaccine(String cervicalCancerVaccine) {
         this.cervicalCancerVaccine = cervicalCancerVaccine;
    } 
    public String getVaccineName(){
        return vaccineName;
    } 
    public void setVaccineName(String vaccineName) {
         this.vaccineName = vaccineName;
    } 
    public Date getVaccineTime(){
        return vaccineTime;
    } 
    public void setVaccineTime(Date vaccineTime) {
         this.vaccineTime = vaccineTime;
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