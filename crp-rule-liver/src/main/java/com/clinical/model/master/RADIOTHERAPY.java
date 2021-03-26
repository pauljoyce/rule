package com.clinical.model.master;
import java.util.Date;
public class RADIOTHERAPY{
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
    //时间点
    private String date_time;
    //放疗方式
    private String treatment;
    //目的
    private String purpose;
    //否定词
    private String neg;
    //部位
    private String structure;
    //剂量方式
    private String dose_type;
    //值
    private String para_value;
    //特别动作
    private String modifier;
    //疗效
    private String efficacy;
    //疗效评价时间
    private String efficacy_date_time;
    //放疗信息字段来源
    private String fs_nlp;
    //放疗信息字段来源中文备注
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
    //时间点精确时间
    private Date date_time_p;
    //时间点推测时间
    private Date date_time_estimate;
    //疗效评价时间精确时间
    private Date efficacy_date_time_p;
    //疗效评价时间推测时间
    private Date efficacy_date_time_estimate;

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
    public String getdate_time(){
        return date_time;
    } 
    public void setdate_time(String date_time) {
             this.date_time = date_time;
    } 
    public String gettreatment(){
        return treatment;
    } 
    public void settreatment(String treatment) {
             this.treatment = treatment;
    } 
    public String getpurpose(){
        return purpose;
    } 
    public void setpurpose(String purpose) {
             this.purpose = purpose;
    } 
    public String getneg(){
        return neg;
    } 
    public void setneg(String neg) {
             this.neg = neg;
    } 
    public String getstructure(){
        return structure;
    } 
    public void setstructure(String structure) {
             this.structure = structure;
    } 
    public String getdose_type(){
        return dose_type;
    } 
    public void setdose_type(String dose_type) {
             this.dose_type = dose_type;
    } 
    public String getpara_value(){
        return para_value;
    } 
    public void setpara_value(String para_value) {
             this.para_value = para_value;
    } 
    public String getmodifier(){
        return modifier;
    } 
    public void setmodifier(String modifier) {
             this.modifier = modifier;
    } 
    public String getefficacy(){
        return efficacy;
    } 
    public void setefficacy(String efficacy) {
             this.efficacy = efficacy;
    } 
    public String getefficacy_date_time(){
        return efficacy_date_time;
    } 
    public void setefficacy_date_time(String efficacy_date_time) {
             this.efficacy_date_time = efficacy_date_time;
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
    public Date getdate_time_p(){
        return date_time_p;
    } 
    public void setdate_time_p(Date date_time_p) {
             this.date_time_p = date_time_p;
    } 
    public Date getdate_time_estimate(){
        return date_time_estimate;
    } 
    public void setdate_time_estimate(Date date_time_estimate) {
             this.date_time_estimate = date_time_estimate;
    } 
    public Date getefficacy_date_time_p(){
        return efficacy_date_time_p;
    } 
    public void setefficacy_date_time_p(Date efficacy_date_time_p) {
             this.efficacy_date_time_p = efficacy_date_time_p;
    } 
    public Date getefficacy_date_time_estimate(){
        return efficacy_date_time_estimate;
    } 
    public void setefficacy_date_time_estimate(Date efficacy_date_time_estimate) {
             this.efficacy_date_time_estimate = efficacy_date_time_estimate;
    } 
}