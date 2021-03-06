package com.clinical.model.cluster;
import java.util.Date;
public class PathologicalStd{
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
    //肿瘤部位
    private String tumorSite;
    //肿瘤大小
    private String tumorSize;
    //病理类型
    private String pathologicaltype;
    //浸润深度
    private String depthInfiltration;
    //Lauren 分型
    private String laurenClassification;
    //分化程度
    private String differentiationDegree;
    //血管侵犯
    private String vascularInvasion;
    //淋巴管侵犯
    private String lymphaticInvasion;
    //神经侵犯
    private String nerveInvasion;
    //侵犯邻近脏器或组织名称
    private String invasionOrgans;
    //近切缘
    private String proximalMargin;
    //近切缘距离
    private String distanceCut;
    //远切缘
    private String distalMargin;
    //远切缘距离
    private String distanceFarCut;
    //送检淋巴结总数
    private Integer totalNodes;
    //淋巴结转移
    private String lymphNodeMetastasis;
    //淋巴结转移数量
    private Integer lymphNodeNumber;
    //阳性淋巴结的部位
    private String locationLymphNode;
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
    public String getTumorSite(){
        return tumorSite;
    } 
    public void setTumorSite(String tumorSite) {
         this.tumorSite = tumorSite;
    } 
    public String getTumorSize(){
        return tumorSize;
    } 
    public void setTumorSize(String tumorSize) {
         this.tumorSize = tumorSize;
    } 
    public String getPathologicaltype(){
        return pathologicaltype;
    } 
    public void setPathologicaltype(String pathologicaltype) {
         this.pathologicaltype = pathologicaltype;
    } 
    public String getDepthInfiltration(){
        return depthInfiltration;
    } 
    public void setDepthInfiltration(String depthInfiltration) {
         this.depthInfiltration = depthInfiltration;
    } 
    public String getLaurenClassification(){
        return laurenClassification;
    } 
    public void setLaurenClassification(String laurenClassification) {
         this.laurenClassification = laurenClassification;
    } 
    public String getDifferentiationDegree(){
        return differentiationDegree;
    } 
    public void setDifferentiationDegree(String differentiationDegree) {
         this.differentiationDegree = differentiationDegree;
    } 
    public String getVascularInvasion(){
        return vascularInvasion;
    } 
    public void setVascularInvasion(String vascularInvasion) {
         this.vascularInvasion = vascularInvasion;
    } 
    public String getLymphaticInvasion(){
        return lymphaticInvasion;
    } 
    public void setLymphaticInvasion(String lymphaticInvasion) {
         this.lymphaticInvasion = lymphaticInvasion;
    } 
    public String getNerveInvasion(){
        return nerveInvasion;
    } 
    public void setNerveInvasion(String nerveInvasion) {
         this.nerveInvasion = nerveInvasion;
    } 
    public String getInvasionOrgans(){
        return invasionOrgans;
    } 
    public void setInvasionOrgans(String invasionOrgans) {
         this.invasionOrgans = invasionOrgans;
    } 
    public String getProximalMargin(){
        return proximalMargin;
    } 
    public void setProximalMargin(String proximalMargin) {
         this.proximalMargin = proximalMargin;
    } 
    public String getDistanceCut(){
        return distanceCut;
    } 
    public void setDistanceCut(String distanceCut) {
         this.distanceCut = distanceCut;
    } 
    public String getDistalMargin(){
        return distalMargin;
    } 
    public void setDistalMargin(String distalMargin) {
         this.distalMargin = distalMargin;
    } 
    public String getDistanceFarCut(){
        return distanceFarCut;
    } 
    public void setDistanceFarCut(String distanceFarCut) {
         this.distanceFarCut = distanceFarCut;
    } 
    public Integer getTotalNodes(){
        return totalNodes;
    } 
    public void setTotalNodes(Integer totalNodes) {
         this.totalNodes = totalNodes;
    } 
    public String getLymphNodeMetastasis(){
        return lymphNodeMetastasis;
    } 
    public void setLymphNodeMetastasis(String lymphNodeMetastasis) {
         this.lymphNodeMetastasis = lymphNodeMetastasis;
    } 
    public Integer getLymphNodeNumber(){
        return lymphNodeNumber;
    } 
    public void setLymphNodeNumber(Integer lymphNodeNumber) {
         this.lymphNodeNumber = lymphNodeNumber;
    } 
    public String getLocationLymphNode(){
        return locationLymphNode;
    } 
    public void setLocationLymphNode(String locationLymphNode) {
         this.locationLymphNode = locationLymphNode;
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