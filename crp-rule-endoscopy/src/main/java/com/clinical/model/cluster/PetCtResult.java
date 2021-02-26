package com.clinical.model.cluster;
import java.util.Date;
public class PetCtResult{
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
    //肿物
    private String tumor;
    //原发肿物部位
    private String primaryTumorLocation;
    //原发肿物数目
    private String primaryTumorsNumber;
    //原发肿物大小
    private String primaryTumorSize;
    //复发
    private String recrudescence;
    //转移
    private String move;
    //转移部位
    private String moveSite;
    //转移灶数目
    private String moveNumber;
    //转移灶大小
    private String moveSize;
    //淋巴结肿大
    private String lymphadenopathy;
    //肿大淋巴结部位
    private String enlargedLymphLocation;
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
    public String getTumor(){
        return tumor;
    } 
    public void setTumor(String tumor) {
         this.tumor = tumor;
    } 
    public String getPrimaryTumorLocation(){
        return primaryTumorLocation;
    } 
    public void setPrimaryTumorLocation(String primaryTumorLocation) {
         this.primaryTumorLocation = primaryTumorLocation;
    } 
    public String getPrimaryTumorsNumber(){
        return primaryTumorsNumber;
    } 
    public void setPrimaryTumorsNumber(String primaryTumorsNumber) {
         this.primaryTumorsNumber = primaryTumorsNumber;
    } 
    public String getPrimaryTumorSize(){
        return primaryTumorSize;
    } 
    public void setPrimaryTumorSize(String primaryTumorSize) {
         this.primaryTumorSize = primaryTumorSize;
    } 
    public String getRecrudescence(){
        return recrudescence;
    } 
    public void setRecrudescence(String recrudescence) {
         this.recrudescence = recrudescence;
    } 
    public String getMove(){
        return move;
    } 
    public void setMove(String move) {
         this.move = move;
    } 
    public String getMoveSite(){
        return moveSite;
    } 
    public void setMoveSite(String moveSite) {
         this.moveSite = moveSite;
    } 
    public String getMoveNumber(){
        return moveNumber;
    } 
    public void setMoveNumber(String moveNumber) {
         this.moveNumber = moveNumber;
    } 
    public String getMoveSize(){
        return moveSize;
    } 
    public void setMoveSize(String moveSize) {
         this.moveSize = moveSize;
    } 
    public String getLymphadenopathy(){
        return lymphadenopathy;
    } 
    public void setLymphadenopathy(String lymphadenopathy) {
         this.lymphadenopathy = lymphadenopathy;
    } 
    public String getEnlargedLymphLocation(){
        return enlargedLymphLocation;
    } 
    public void setEnlargedLymphLocation(String enlargedLymphLocation) {
         this.enlargedLymphLocation = enlargedLymphLocation;
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