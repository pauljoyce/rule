package com.clinical.model.master;
import java.util.Date;
public class SYMP_COMPLAINT{
    //顺序流水号
    private Integer seq_id;
    //记录唯一标识
    private String unique_id;
    //清洗后患者唯一标识
    private String unique_id_lv1;
    //清洗后人次标识
    private String unique_id_lv2;
    //医疗机构代码
    private String p900;
    //患者ID
    private String patient_id;
    //病案号
    private String tpatno;
    //就诊类型
    private Integer visit_type;
    //记录状态
    private String record_status;
    //住院号
    private String visit_id;
    //住院次数
    private Integer admission_number;
    //入院时间
    private Date admission_date_time;
    //异常情况
    private String finding;
    //异常情况时间点
    private String finding_date_time;
    //异常时长
    private String finding_length;
    //变化趋势
    private String trend;
    //变化时间点
    private String trend_date_time;
    //变化趋势时长
    private String trend_length;
    //程度
    private String extent;
    //症状表现信息字段来源
    private String fs_nlp;
    //症状表现信息字段来源中文备注
    private String fs_nlp_cn;
    //字段来源中的出现序号
    private Integer fs_serial_number;
    //中心实体所在起始位置
    private Integer fs_location;
    //数据版本
    private String data_version;
    //数据库来源
    private String data_db_source;
    //数据表来源
    private String data_table_source;
    //数据表来源中文备注
    private String data_table_source_cn;
    //数据项来源
    private String data_field_source;
    //创建时间
    private Date create_time;
    //创建人
    private String creator;
    //记录时间
    private Date record_time;
    //批号
    private String batch_number;
    //异常情况时间点精确时间
    private Date finding_date_time_p;
    //异常情况时间点推测时间
    private Date finding_date_time_estimate;
    //变化时间点精确时间
    private Date trend_date_time_p;
    //变化时间点推测时间
    private Date trend_date_time_estimate;

    public Integer getseq_id(){
        return seq_id;
    } 
    public void setseq_id(Integer seq_id) {
         this.seq_id = seq_id;
    } 
    public String getunique_id(){
        return unique_id;
    } 
    public void setunique_id(String unique_id) {
         this.unique_id = unique_id;
    } 
    public String getunique_id_lv1(){
        return unique_id_lv1;
    } 
    public void setunique_id_lv1(String unique_id_lv1) {
         this.unique_id_lv1 = unique_id_lv1;
    } 
    public String getunique_id_lv2(){
        return unique_id_lv2;
    } 
    public void setunique_id_lv2(String unique_id_lv2) {
         this.unique_id_lv2 = unique_id_lv2;
    } 
    public String getp900(){
        return p900;
    } 
    public void setp900(String p900) {
         this.p900 = p900;
    } 
    public String getpatient_id(){
        return patient_id;
    } 
    public void setpatient_id(String patient_id) {
         this.patient_id = patient_id;
    } 
    public String gettpatno(){
        return tpatno;
    } 
    public void settpatno(String tpatno) {
         this.tpatno = tpatno;
    } 
    public Integer getvisit_type(){
        return visit_type;
    } 
    public void setvisit_type(Integer visit_type) {
         this.visit_type = visit_type;
    } 
    public String getrecord_status(){
        return record_status;
    } 
    public void setrecord_status(String record_status) {
         this.record_status = record_status;
    } 
    public String getvisit_id(){
        return visit_id;
    } 
    public void setvisit_id(String visit_id) {
         this.visit_id = visit_id;
    } 
    public Integer getadmission_number(){
        return admission_number;
    } 
    public void setadmission_number(Integer admission_number) {
         this.admission_number = admission_number;
    } 
    public Date getadmission_date_time(){
        return admission_date_time;
    } 
    public void setadmission_date_time(Date admission_date_time) {
         this.admission_date_time = admission_date_time;
    } 
    public String getfinding(){
        return finding;
    } 
    public void setfinding(String finding) {
         this.finding = finding;
    } 
    public String getfinding_date_time(){
        return finding_date_time;
    } 
    public void setfinding_date_time(String finding_date_time) {
         this.finding_date_time = finding_date_time;
    } 
    public String getfinding_length(){
        return finding_length;
    } 
    public void setfinding_length(String finding_length) {
         this.finding_length = finding_length;
    } 
    public String gettrend(){
        return trend;
    } 
    public void settrend(String trend) {
         this.trend = trend;
    } 
    public String gettrend_date_time(){
        return trend_date_time;
    } 
    public void settrend_date_time(String trend_date_time) {
         this.trend_date_time = trend_date_time;
    } 
    public String gettrend_length(){
        return trend_length;
    } 
    public void settrend_length(String trend_length) {
         this.trend_length = trend_length;
    } 
    public String getextent(){
        return extent;
    } 
    public void setextent(String extent) {
         this.extent = extent;
    } 
    public String getfs_nlp(){
        return fs_nlp;
    } 
    public void setfs_nlp(String fs_nlp) {
         this.fs_nlp = fs_nlp;
    } 
    public String getfs_nlp_cn(){
        return fs_nlp_cn;
    } 
    public void setfs_nlp_cn(String fs_nlp_cn) {
         this.fs_nlp_cn = fs_nlp_cn;
    } 
    public Integer getfs_serial_number(){
        return fs_serial_number;
    } 
    public void setfs_serial_number(Integer fs_serial_number) {
         this.fs_serial_number = fs_serial_number;
    } 
    public Integer getfs_location(){
        return fs_location;
    } 
    public void setfs_location(Integer fs_location) {
         this.fs_location = fs_location;
    } 
    public String getdata_version(){
        return data_version;
    } 
    public void setdata_version(String data_version) {
         this.data_version = data_version;
    } 
    public String getdata_db_source(){
        return data_db_source;
    } 
    public void setdata_db_source(String data_db_source) {
         this.data_db_source = data_db_source;
    } 
    public String getdata_table_source(){
        return data_table_source;
    } 
    public void setdata_table_source(String data_table_source) {
         this.data_table_source = data_table_source;
    } 
    public String getdata_table_source_cn(){
        return data_table_source_cn;
    } 
    public void setdata_table_source_cn(String data_table_source_cn) {
         this.data_table_source_cn = data_table_source_cn;
    } 
    public String getdata_field_source(){
        return data_field_source;
    } 
    public void setdata_field_source(String data_field_source) {
         this.data_field_source = data_field_source;
    } 
    public Date getcreate_time(){
        return create_time;
    } 
    public void setcreate_time(Date create_time) {
         this.create_time = create_time;
    } 
    public String getcreator(){
        return creator;
    } 
    public void setcreator(String creator) {
         this.creator = creator;
    } 
    public Date getrecord_time(){
        return record_time;
    } 
    public void setrecord_time(Date record_time) {
         this.record_time = record_time;
    } 
    public String getbatch_number(){
        return batch_number;
    } 
    public void setbatch_number(String batch_number) {
         this.batch_number = batch_number;
    } 
    public Date getfinding_date_time_p(){
        return finding_date_time_p;
    } 
    public void setfinding_date_time_p(Date finding_date_time_p) {
         this.finding_date_time_p = finding_date_time_p;
    } 
    public Date getfinding_date_time_estimate(){
        return finding_date_time_estimate;
    } 
    public void setfinding_date_time_estimate(Date finding_date_time_estimate) {
         this.finding_date_time_estimate = finding_date_time_estimate;
    } 
    public Date gettrend_date_time_p(){
        return trend_date_time_p;
    } 
    public void settrend_date_time_p(Date trend_date_time_p) {
         this.trend_date_time_p = trend_date_time_p;
    } 
    public Date gettrend_date_time_estimate(){
        return trend_date_time_estimate;
    } 
    public void settrend_date_time_estimate(Date trend_date_time_estimate) {
         this.trend_date_time_estimate = trend_date_time_estimate;
    } 
}