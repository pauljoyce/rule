package com.clinical.model.master;
import java.util.Date;
public class TRANSFER_DEPT{
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
    //患者id
    private String patient_id;
    //住院号
    private String visit_id;
    //住院次数
    private Integer admission_number;
    //入院日期
    private Date admission_date_time;
    //病案号
    private String tpatno;
    //就诊类型
    private Integer visit_type;
    //性别
    private String sex;
    //年龄
    private Integer age;
    //科室名称
    private String department_name;
    //病区
    private String inpatient_area;
    //病房号
    private String room_no;
    //病床号
    private String bed_no;
    //活动记录状态
    private String record_status;
    //入院情况
    private String cop_status;
    //入院诊断
    private String admission_diagnosis;
    //目前情况
    private String current_situation;
    //目前诊断
    private String current_diagnosis;
    //转科详细记录
    private String transfer_detail_note;
    //转科目的
    private String transfer_purpose;
    //转出日期时间
    private Date transfer_out_time;
    //转出科室
    private String transfer_from_dept;
    //转出病区
    private String transfer_out_area;
    //转入日期时间
    private Date transfer_in_time;
    //转入科室
    private String transfer_to_dept;
    //转入病区
    private String transfer_in_area;
    //主诉
    private String chief_complaint;
    //诊疗经过
    private String tzl_process;
    //注意事项
    private String matters_need_caution;
    //诊疗计划
    private String treatment_plan;
    //转科记录类型
    private String transfer_type;
    //医师签名
    private String doctor_sign;
    //记录时间
    private Date record_time;
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
    public Date getadmission_date_time(){
        return admission_date_time;
    } 
    public void setadmission_date_time(Date admission_date_time) {
             this.admission_date_time = admission_date_time;
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
    public String getdepartment_name(){
        return department_name;
    } 
    public void setdepartment_name(String department_name) {
             this.department_name = department_name;
    } 
    public String getinpatient_area(){
        return inpatient_area;
    } 
    public void setinpatient_area(String inpatient_area) {
             this.inpatient_area = inpatient_area;
    } 
    public String getroom_no(){
        return room_no;
    } 
    public void setroom_no(String room_no) {
             this.room_no = room_no;
    } 
    public String getbed_no(){
        return bed_no;
    } 
    public void setbed_no(String bed_no) {
             this.bed_no = bed_no;
    } 
    public String getrecord_status(){
        return record_status;
    } 
    public void setrecord_status(String record_status) {
             this.record_status = record_status;
    } 
    public String getcop_status(){
        return cop_status;
    } 
    public void setcop_status(String cop_status) {
             this.cop_status = cop_status;
    } 
    public String getadmission_diagnosis(){
        return admission_diagnosis;
    } 
    public void setadmission_diagnosis(String admission_diagnosis) {
             this.admission_diagnosis = admission_diagnosis;
    } 
    public String getcurrent_situation(){
        return current_situation;
    } 
    public void setcurrent_situation(String current_situation) {
             this.current_situation = current_situation;
    } 
    public String getcurrent_diagnosis(){
        return current_diagnosis;
    } 
    public void setcurrent_diagnosis(String current_diagnosis) {
             this.current_diagnosis = current_diagnosis;
    } 
    public String gettransfer_detail_note(){
        return transfer_detail_note;
    } 
    public void settransfer_detail_note(String transfer_detail_note) {
             this.transfer_detail_note = transfer_detail_note;
    } 
    public String gettransfer_purpose(){
        return transfer_purpose;
    } 
    public void settransfer_purpose(String transfer_purpose) {
             this.transfer_purpose = transfer_purpose;
    } 
    public Date gettransfer_out_time(){
        return transfer_out_time;
    } 
    public void settransfer_out_time(Date transfer_out_time) {
             this.transfer_out_time = transfer_out_time;
    } 
    public String gettransfer_from_dept(){
        return transfer_from_dept;
    } 
    public void settransfer_from_dept(String transfer_from_dept) {
             this.transfer_from_dept = transfer_from_dept;
    } 
    public String gettransfer_out_area(){
        return transfer_out_area;
    } 
    public void settransfer_out_area(String transfer_out_area) {
             this.transfer_out_area = transfer_out_area;
    } 
    public Date gettransfer_in_time(){
        return transfer_in_time;
    } 
    public void settransfer_in_time(Date transfer_in_time) {
             this.transfer_in_time = transfer_in_time;
    } 
    public String gettransfer_to_dept(){
        return transfer_to_dept;
    } 
    public void settransfer_to_dept(String transfer_to_dept) {
             this.transfer_to_dept = transfer_to_dept;
    } 
    public String gettransfer_in_area(){
        return transfer_in_area;
    } 
    public void settransfer_in_area(String transfer_in_area) {
             this.transfer_in_area = transfer_in_area;
    } 
    public String getchief_complaint(){
        return chief_complaint;
    } 
    public void setchief_complaint(String chief_complaint) {
             this.chief_complaint = chief_complaint;
    } 
    public String gettzl_process(){
        return tzl_process;
    } 
    public void settzl_process(String tzl_process) {
             this.tzl_process = tzl_process;
    } 
    public String getmatters_need_caution(){
        return matters_need_caution;
    } 
    public void setmatters_need_caution(String matters_need_caution) {
             this.matters_need_caution = matters_need_caution;
    } 
    public String gettreatment_plan(){
        return treatment_plan;
    } 
    public void settreatment_plan(String treatment_plan) {
             this.treatment_plan = treatment_plan;
    } 
    public String gettransfer_type(){
        return transfer_type;
    } 
    public void settransfer_type(String transfer_type) {
             this.transfer_type = transfer_type;
    } 
    public String getdoctor_sign(){
        return doctor_sign;
    } 
    public void setdoctor_sign(String doctor_sign) {
             this.doctor_sign = doctor_sign;
    } 
    public Date getrecord_time(){
        return record_time;
    } 
    public void setrecord_time(Date record_time) {
             this.record_time = record_time;
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