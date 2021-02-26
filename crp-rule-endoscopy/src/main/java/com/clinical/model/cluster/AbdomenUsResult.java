package com.clinical.model.cluster;
import java.util.Date;
public class AbdomenUsResult{
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
    //就诊标识住院号
    private String visitId;
    //检查号
    private String examNo;
    //检查项目
    private String examName;
    //胃部肿物
    private String gastricMass;
    //胃部肿物数目
    private String gastricMassNumber;
    //胃部肿物大小
    private String gastricMassSize;
    //肝部肿物
    private String liverMass;
    //肝部肿物数目
    private String liverMassNumber;
    //肝部肿物大小
    private String liverMassSize;
    //胰腺肿物
    private String pancreaticMass;
    //胰腺肿物数目
    private String pancreaticMassNumber;
    //胰腺肿物大小
    private String pancreaticMassSize;
    //肾脏肿物
    private String renalMass;
    //肾脏肿物数目
    private String renalMassNumber;
    //肾脏肿物大小
    private String renalMassSize;
    //结直肠肿物
    private String colorectalMass;
    //结直肠肿物数目
    private String colorectalMassNumber;
    //结直肠肿物大小
    private String colorectalMassSize;
    //淋巴结肿大
    private String lymphadenopathy;
    //淋巴结肿大部位
    private String lymphEnlargementSite;
    //腹水
    private String ascites;
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
    public String getExamNo(){
        return examNo;
    } 
    public void setExamNo(String examNo) {
         this.examNo = examNo;
    } 
    public String getExamName(){
        return examName;
    } 
    public void setExamName(String examName) {
         this.examName = examName;
    } 
    public String getGastricMass(){
        return gastricMass;
    } 
    public void setGastricMass(String gastricMass) {
         this.gastricMass = gastricMass;
    } 
    public String getGastricMassNumber(){
        return gastricMassNumber;
    } 
    public void setGastricMassNumber(String gastricMassNumber) {
         this.gastricMassNumber = gastricMassNumber;
    } 
    public String getGastricMassSize(){
        return gastricMassSize;
    } 
    public void setGastricMassSize(String gastricMassSize) {
         this.gastricMassSize = gastricMassSize;
    } 
    public String getLiverMass(){
        return liverMass;
    } 
    public void setLiverMass(String liverMass) {
         this.liverMass = liverMass;
    } 
    public String getLiverMassNumber(){
        return liverMassNumber;
    } 
    public void setLiverMassNumber(String liverMassNumber) {
         this.liverMassNumber = liverMassNumber;
    } 
    public String getLiverMassSize(){
        return liverMassSize;
    } 
    public void setLiverMassSize(String liverMassSize) {
         this.liverMassSize = liverMassSize;
    } 
    public String getPancreaticMass(){
        return pancreaticMass;
    } 
    public void setPancreaticMass(String pancreaticMass) {
         this.pancreaticMass = pancreaticMass;
    } 
    public String getPancreaticMassNumber(){
        return pancreaticMassNumber;
    } 
    public void setPancreaticMassNumber(String pancreaticMassNumber) {
         this.pancreaticMassNumber = pancreaticMassNumber;
    } 
    public String getPancreaticMassSize(){
        return pancreaticMassSize;
    } 
    public void setPancreaticMassSize(String pancreaticMassSize) {
         this.pancreaticMassSize = pancreaticMassSize;
    } 
    public String getRenalMass(){
        return renalMass;
    } 
    public void setRenalMass(String renalMass) {
         this.renalMass = renalMass;
    } 
    public String getRenalMassNumber(){
        return renalMassNumber;
    } 
    public void setRenalMassNumber(String renalMassNumber) {
         this.renalMassNumber = renalMassNumber;
    } 
    public String getRenalMassSize(){
        return renalMassSize;
    } 
    public void setRenalMassSize(String renalMassSize) {
         this.renalMassSize = renalMassSize;
    } 
    public String getColorectalMass(){
        return colorectalMass;
    } 
    public void setColorectalMass(String colorectalMass) {
         this.colorectalMass = colorectalMass;
    } 
    public String getColorectalMassNumber(){
        return colorectalMassNumber;
    } 
    public void setColorectalMassNumber(String colorectalMassNumber) {
         this.colorectalMassNumber = colorectalMassNumber;
    } 
    public String getColorectalMassSize(){
        return colorectalMassSize;
    } 
    public void setColorectalMassSize(String colorectalMassSize) {
         this.colorectalMassSize = colorectalMassSize;
    } 
    public String getLymphadenopathy(){
        return lymphadenopathy;
    } 
    public void setLymphadenopathy(String lymphadenopathy) {
         this.lymphadenopathy = lymphadenopathy;
    } 
    public String getLymphEnlargementSite(){
        return lymphEnlargementSite;
    } 
    public void setLymphEnlargementSite(String lymphEnlargementSite) {
         this.lymphEnlargementSite = lymphEnlargementSite;
    } 
    public String getAscites(){
        return ascites;
    } 
    public void setAscites(String ascites) {
         this.ascites = ascites;
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