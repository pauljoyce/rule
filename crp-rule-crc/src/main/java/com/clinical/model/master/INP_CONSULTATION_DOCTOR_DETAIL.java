package com.clinical.model.master;
import java.util.Date;
public class INP_CONSULTATION_DOCTOR_DETAIL{
    //主键
    private String id;
    //唯一标识
    private String unique_id;
    //关联1级表unique_id
    private String unique_id_lv1;
    //关联2级表unique_id
    private String unique_id_lv2;
    //关联3级表unique_id
    private String unique_id_lv3;
    //医疗机构代码
    private String p900;
    //序号
    private String consultation_no;
    //会诊id
    private String sub_id;
    //会诊科室
    private String consultation_dept;
    //会诊医生
    private String consultation_doctor;
    //会诊诊断时间
    private Date affirm_date_time;
    //申请时间
    private Date apply_date_time;
    //病史简介
    private String medical_history;
    //诊疗经过
    private String tzl_process;
    //会诊目的
    private String consult_purpose;
    //会诊意见
    private String consult_idea;
    //数据版本
    private String data_version;
    //数据库来源
    private String data_db_source;
    //数据表来源
    private String data_table_source;
    //数据项来源
    private String data_field_source;
    //创建时间
    private Date created_at;
    //创建人
    private String creator;
    //修改时间
    private Date updated_at;
    //修改人
    private String updator;
    //修改备注
    private String updated_note;
    //数据状态
    private String data_state;
    //停用时间
    private Date disable_time;
    //停用人
    private String disable_operator;
    //停用说明
    private String disable_note;
    //数据校验
    private String data_check;
    //是否删除
    private Integer del_flag;
    //批号
    private String batch_number;
    //MD5标识
    private String md5;

    public String getid(){
        return id;
    } 
    public void setid(String id) {
         this.id = id;
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
    public String getunique_id_lv3(){
        return unique_id_lv3;
    } 
    public void setunique_id_lv3(String unique_id_lv3) {
         this.unique_id_lv3 = unique_id_lv3;
    } 
    public String getp900(){
        return p900;
    } 
    public void setp900(String p900) {
         this.p900 = p900;
    } 
    public String getconsultation_no(){
        return consultation_no;
    } 
    public void setconsultation_no(String consultation_no) {
         this.consultation_no = consultation_no;
    } 
    public String getsub_id(){
        return sub_id;
    } 
    public void setsub_id(String sub_id) {
         this.sub_id = sub_id;
    } 
    public String getconsultation_dept(){
        return consultation_dept;
    } 
    public void setconsultation_dept(String consultation_dept) {
         this.consultation_dept = consultation_dept;
    } 
    public String getconsultation_doctor(){
        return consultation_doctor;
    } 
    public void setconsultation_doctor(String consultation_doctor) {
         this.consultation_doctor = consultation_doctor;
    } 
    public Date getaffirm_date_time(){
        return affirm_date_time;
    } 
    public void setaffirm_date_time(Date affirm_date_time) {
         this.affirm_date_time = affirm_date_time;
    } 
    public Date getapply_date_time(){
        return apply_date_time;
    } 
    public void setapply_date_time(Date apply_date_time) {
         this.apply_date_time = apply_date_time;
    } 
    public String getmedical_history(){
        return medical_history;
    } 
    public void setmedical_history(String medical_history) {
         this.medical_history = medical_history;
    } 
    public String gettzl_process(){
        return tzl_process;
    } 
    public void settzl_process(String tzl_process) {
         this.tzl_process = tzl_process;
    } 
    public String getconsult_purpose(){
        return consult_purpose;
    } 
    public void setconsult_purpose(String consult_purpose) {
         this.consult_purpose = consult_purpose;
    } 
    public String getconsult_idea(){
        return consult_idea;
    } 
    public void setconsult_idea(String consult_idea) {
         this.consult_idea = consult_idea;
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
    public String getdata_field_source(){
        return data_field_source;
    } 
    public void setdata_field_source(String data_field_source) {
         this.data_field_source = data_field_source;
    } 
    public Date getcreated_at(){
        return created_at;
    } 
    public void setcreated_at(Date created_at) {
         this.created_at = created_at;
    } 
    public String getcreator(){
        return creator;
    } 
    public void setcreator(String creator) {
         this.creator = creator;
    } 
    public Date getupdated_at(){
        return updated_at;
    } 
    public void setupdated_at(Date updated_at) {
         this.updated_at = updated_at;
    } 
    public String getupdator(){
        return updator;
    } 
    public void setupdator(String updator) {
         this.updator = updator;
    } 
    public String getupdated_note(){
        return updated_note;
    } 
    public void setupdated_note(String updated_note) {
         this.updated_note = updated_note;
    } 
    public String getdata_state(){
        return data_state;
    } 
    public void setdata_state(String data_state) {
         this.data_state = data_state;
    } 
    public Date getdisable_time(){
        return disable_time;
    } 
    public void setdisable_time(Date disable_time) {
         this.disable_time = disable_time;
    } 
    public String getdisable_operator(){
        return disable_operator;
    } 
    public void setdisable_operator(String disable_operator) {
         this.disable_operator = disable_operator;
    } 
    public String getdisable_note(){
        return disable_note;
    } 
    public void setdisable_note(String disable_note) {
         this.disable_note = disable_note;
    } 
    public String getdata_check(){
        return data_check;
    } 
    public void setdata_check(String data_check) {
         this.data_check = data_check;
    } 
    public Integer getdel_flag(){
        return del_flag;
    } 
    public void setdel_flag(Integer del_flag) {
         this.del_flag = del_flag;
    } 
    public String getbatch_number(){
        return batch_number;
    } 
    public void setbatch_number(String batch_number) {
         this.batch_number = batch_number;
    } 
    public String getmd5(){
        return md5;
    } 
    public void setmd5(String md5) {
         this.md5 = md5;
    } 
}