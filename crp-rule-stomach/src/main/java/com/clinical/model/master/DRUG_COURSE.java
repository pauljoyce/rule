package com.clinical.model.master;
import java.util.Date;
public class DRUG_COURSE{
    //流水号
    private Integer seq_id;
    //唯一标识
    private String unique_id;
    //关联1级表unique_id
    private String unique_id_lv1;
    //关联2级表unique_id
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
    //药物名称
    private String drug_name;
    //用药剂量
    private String drug_dose;
    //用药频率
    private String admin_freq;
    //给药方式
    private String admin_route;
    //药物治疗信息字段来源
    private String fs_nlp;
    //药物治疗信息字段来源中文备注
    private String fs_nlp_cn;
    //字段来源中的药物治疗流水号
    private Integer fs_serial_number;
    //字段来源中药物治疗信息所在位置
    private Integer fs_location;
    //数据版本
    private String data_version;
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
    //药物名称-标准名称
    private String drug_name_std;
    //用药剂量-标准剂量1
    private Integer drug_dose1_std;
    //用药剂量-单位1
    private String drug_dose_unit1_std;
    //用药剂量-标准剂量2
    private Integer drug_dose2_std;
    //用药剂量-单位2
    private String drug_dose_unit2_std;
    //用药频率-标准频率
    private Integer admin_freq_std;
    //用药频率-单位
    private String admin_freq_unit_std;
    //标准给药方式
    private String admin_route_std;

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
    public String getdrug_name(){
        return drug_name;
    } 
    public void setdrug_name(String drug_name) {
         this.drug_name = drug_name;
    } 
    public String getdrug_dose(){
        return drug_dose;
    } 
    public void setdrug_dose(String drug_dose) {
         this.drug_dose = drug_dose;
    } 
    public String getadmin_freq(){
        return admin_freq;
    } 
    public void setadmin_freq(String admin_freq) {
         this.admin_freq = admin_freq;
    } 
    public String getadmin_route(){
        return admin_route;
    } 
    public void setadmin_route(String admin_route) {
         this.admin_route = admin_route;
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
    public String getdrug_name_std(){
        return drug_name_std;
    } 
    public void setdrug_name_std(String drug_name_std) {
         this.drug_name_std = drug_name_std;
    } 
    public Integer getdrug_dose1_std(){
        return drug_dose1_std;
    } 
    public void setdrug_dose1_std(Integer drug_dose1_std) {
         this.drug_dose1_std = drug_dose1_std;
    } 
    public String getdrug_dose_unit1_std(){
        return drug_dose_unit1_std;
    } 
    public void setdrug_dose_unit1_std(String drug_dose_unit1_std) {
         this.drug_dose_unit1_std = drug_dose_unit1_std;
    } 
    public Integer getdrug_dose2_std(){
        return drug_dose2_std;
    } 
    public void setdrug_dose2_std(Integer drug_dose2_std) {
         this.drug_dose2_std = drug_dose2_std;
    } 
    public String getdrug_dose_unit2_std(){
        return drug_dose_unit2_std;
    } 
    public void setdrug_dose_unit2_std(String drug_dose_unit2_std) {
         this.drug_dose_unit2_std = drug_dose_unit2_std;
    } 
    public Integer getadmin_freq_std(){
        return admin_freq_std;
    } 
    public void setadmin_freq_std(Integer admin_freq_std) {
         this.admin_freq_std = admin_freq_std;
    } 
    public String getadmin_freq_unit_std(){
        return admin_freq_unit_std;
    } 
    public void setadmin_freq_unit_std(String admin_freq_unit_std) {
         this.admin_freq_unit_std = admin_freq_unit_std;
    } 
    public String getadmin_route_std(){
        return admin_route_std;
    } 
    public void setadmin_route_std(String admin_route_std) {
         this.admin_route_std = admin_route_std;
    } 
}