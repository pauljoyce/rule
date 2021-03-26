package com.clinical.model.cluster;
import java.util.Date;
public class IndexOperation{
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
    //手术/操作编码
    private String p490;
    //手术/操作日期
    private Date p491;
    //手术级别
    private String p820;
    //手术/操作名称
    private String p492;
    //手术/操作部位
    private String p493;
    //手术持续时间
    private String p494;
    //术者
    private String p495;
    //Ⅰ助
    private String p496;
    //Ⅱ助
    private String p497;
    //麻醉方式
    private String p498;
    //麻醉分级
    private String p4981;
    //切口愈合等级
    private String p499;
    //麻醉医师
    private String p4910;
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
    public String getP490(){
        return p490;
    } 
    public void setP490(String p490) {
             this.p490 = p490;
    } 
    public Date getP491(){
        return p491;
    } 
    public void setP491(Date p491) {
             this.p491 = p491;
    } 
    public String getP820(){
        return p820;
    } 
    public void setP820(String p820) {
             this.p820 = p820;
    } 
    public String getP492(){
        return p492;
    } 
    public void setP492(String p492) {
             this.p492 = p492;
    } 
    public String getP493(){
        return p493;
    } 
    public void setP493(String p493) {
             this.p493 = p493;
    } 
    public String getP494(){
        return p494;
    } 
    public void setP494(String p494) {
             this.p494 = p494;
    } 
    public String getP495(){
        return p495;
    } 
    public void setP495(String p495) {
             this.p495 = p495;
    } 
    public String getP496(){
        return p496;
    } 
    public void setP496(String p496) {
             this.p496 = p496;
    } 
    public String getP497(){
        return p497;
    } 
    public void setP497(String p497) {
             this.p497 = p497;
    } 
    public String getP498(){
        return p498;
    } 
    public void setP498(String p498) {
             this.p498 = p498;
    } 
    public String getP4981(){
        return p4981;
    } 
    public void setP4981(String p4981) {
             this.p4981 = p4981;
    } 
    public String getP499(){
        return p499;
    } 
    public void setP499(String p499) {
             this.p499 = p499;
    } 
    public String getP4910(){
        return p4910;
    } 
    public void setP4910(String p4910) {
             this.p4910 = p4910;
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