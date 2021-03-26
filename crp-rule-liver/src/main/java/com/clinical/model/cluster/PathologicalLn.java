package com.clinical.model.cluster;
import java.util.Date;
public class PathologicalLn{
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
    //病理号
    private String pathologyNo;
    //收到日期
    private Date inspectTime;
    //报告日期
    private Date reprotTime;
    //送检淋巴结总数
    private Integer lymphNodeTotal;
    //淋巴结转移
    private String ifTransfer;
    //淋巴结转移数量
    private Integer transferNumber;
    //阳性淋巴结的部位
    private String transferSite;
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
    public String getPathologyNo(){
        return pathologyNo;
    } 
    public void setPathologyNo(String pathologyNo) {
             this.pathologyNo = pathologyNo;
    } 
    public Date getInspectTime(){
        return inspectTime;
    } 
    public void setInspectTime(Date inspectTime) {
             this.inspectTime = inspectTime;
    } 
    public Date getReprotTime(){
        return reprotTime;
    } 
    public void setReprotTime(Date reprotTime) {
             this.reprotTime = reprotTime;
    } 
    public Integer getLymphNodeTotal(){
        return lymphNodeTotal;
    } 
    public void setLymphNodeTotal(Integer lymphNodeTotal) {
             this.lymphNodeTotal = lymphNodeTotal;
    } 
    public String getIfTransfer(){
        return ifTransfer;
    } 
    public void setIfTransfer(String ifTransfer) {
             this.ifTransfer = ifTransfer;
    } 
    public Integer getTransferNumber(){
        return transferNumber;
    } 
    public void setTransferNumber(Integer transferNumber) {
             this.transferNumber = transferNumber;
    } 
    public String getTransferSite(){
        return transferSite;
    } 
    public void setTransferSite(String transferSite) {
             this.transferSite = transferSite;
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