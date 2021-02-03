package com.clinical.model.master;
import java.util.Date;
public class PAIN_TREAT_MASTER{
    //主键
    private Integer id;
    //唯一标识
    private String unique_id;
    //关联1级表unique_id
    private String unique_id_lv1;
    //关联2级表unique_id
    private String unique_id_lv2;
    //医疗机构代码
    private String p900;
    //癌痛治疗主表id
    private String master_id;
    //患者id
    private String patient_id;
    //住院号
    private String visit_id;
    //住院次数
    private Integer admission_number;
    //就诊类型
    private Integer visit_type;
    //姓名
    private String name;
    //性别
    private String sex;
    //年龄
    private Integer age;
    //科室
    private String dept_name;
    //床号
    private String bed_no;
    //目前诊断
    private String diag;
    //导致疼痛原因
    private String cause_pain;
    //入院时疼痛情况
    private String adm_pain_status;
    //经管医生
    private String doctor;
    //疼痛性质
    private String pain_type;
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

    public Integer getid(){
        return id;
    } 
    public void setid(Integer id) {
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
    public String getp900(){
        return p900;
    } 
    public void setp900(String p900) {
         this.p900 = p900;
    } 
    public String getmaster_id(){
        return master_id;
    } 
    public void setmaster_id(String master_id) {
         this.master_id = master_id;
    } 
    public String getpatient_id(){
        return patient_id;
    } 
    public void setpatient_id(String patient_id) {
         this.patient_id = patient_id;
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
    public Integer getvisit_type(){
        return visit_type;
    } 
    public void setvisit_type(Integer visit_type) {
         this.visit_type = visit_type;
    } 
    public String getname(){
        return name;
    } 
    public void setname(String name) {
         this.name = name;
    } 
    public String getsex(){
        return sex;
    } 
    public void setsex(String sex) {
         this.sex = sex;
    } 
    public Integer getage(){
        return age;
    } 
    public void setage(Integer age) {
         this.age = age;
    } 
    public String getdept_name(){
        return dept_name;
    } 
    public void setdept_name(String dept_name) {
         this.dept_name = dept_name;
    } 
    public String getbed_no(){
        return bed_no;
    } 
    public void setbed_no(String bed_no) {
         this.bed_no = bed_no;
    } 
    public String getdiag(){
        return diag;
    } 
    public void setdiag(String diag) {
         this.diag = diag;
    } 
    public String getcause_pain(){
        return cause_pain;
    } 
    public void setcause_pain(String cause_pain) {
         this.cause_pain = cause_pain;
    } 
    public String getadm_pain_status(){
        return adm_pain_status;
    } 
    public void setadm_pain_status(String adm_pain_status) {
         this.adm_pain_status = adm_pain_status;
    } 
    public String getdoctor(){
        return doctor;
    } 
    public void setdoctor(String doctor) {
         this.doctor = doctor;
    } 
    public String getpain_type(){
        return pain_type;
    } 
    public void setpain_type(String pain_type) {
         this.pain_type = pain_type;
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