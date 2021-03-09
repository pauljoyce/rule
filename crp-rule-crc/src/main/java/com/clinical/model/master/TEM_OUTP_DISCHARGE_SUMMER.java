package com.clinical.model.master;
import java.util.Date;
public class TEM_OUTP_DISCHARGE_SUMMER{
    //主键
    private String id;
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
    //年龄
    private Integer age;
    //住院号
    private String visit_id;
    //病案号
    private String tpatno;
    //病房号
    private String room_no;
    //病床号
    private String bed_no;
    //活动记录状态
    private String record_status;
    //就诊类型
    private Integer visit_type;
    //科室名称
    private String department_name;
    //病区
    private String inpatient_area;
    //住院次数
    private Integer admission_number;
    //首次就诊日期
    private Date initial_doc_date;
    //入院日期
    private Date admission_date_time;
    //出院日期
    private Date discharge_date_time;
    //实际住院天数
    private Integer actual_day;
    //入院情况
    private String admission_status;
    //阳性辅助检查结果
    private String supplementary_exam;
    //诊疗经过
    private String tzl_process;
    //出院情况
    private String discharge_status;
    //出院情况-出院时症状与体征
    private String discharge_symptom_and_sign;
    //出院情况-出院小结
    private String discharge_summary_contents;
    //出院医嘱
    private String discharge_order;
    //病情转归情况
    private String disease_outcome;
    //入院途径
    private String inp_route;
    //入院科室
    private String inp_department;
    //出院科室
    private String outp_department;
    //入院诊断
    private String inp_diag;
    //出院主要诊断
    private String outp_main_diag;
    //出院其它诊断
    private String outp_other_diag;
    //离院方式
    private String leaving_mode;
    //肿瘤诊断代码
    private String tumor_diag_code;
    //肿瘤学分类代码
    private String tumor_class_code;
    //病理号
    private String his_num;
    //肿瘤诊断依据代码
    private String tumor_diag_basis_code;
    //门（急）诊诊断
    private String door_diag;
    //是否有非计划二次手术
    private String is_two_operation;
    //非计划二次手术原因
    private String why_not_two;
    //医生签名
    private String doctor_sign;
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
    public Integer getage(){
        return age;
    } 
    public void setage(Integer age) {
         this.age = age;
    } 
    public String getvisit_id(){
        return visit_id;
    } 
    public void setvisit_id(String visit_id) {
         this.visit_id = visit_id;
    } 
    public String gettpatno(){
        return tpatno;
    } 
    public void settpatno(String tpatno) {
         this.tpatno = tpatno;
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
    public Integer getvisit_type(){
        return visit_type;
    } 
    public void setvisit_type(Integer visit_type) {
         this.visit_type = visit_type;
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
    public Integer getadmission_number(){
        return admission_number;
    } 
    public void setadmission_number(Integer admission_number) {
         this.admission_number = admission_number;
    } 
    public Date getinitial_doc_date(){
        return initial_doc_date;
    } 
    public void setinitial_doc_date(Date initial_doc_date) {
         this.initial_doc_date = initial_doc_date;
    } 
    public Date getadmission_date_time(){
        return admission_date_time;
    } 
    public void setadmission_date_time(Date admission_date_time) {
         this.admission_date_time = admission_date_time;
    } 
    public Date getdischarge_date_time(){
        return discharge_date_time;
    } 
    public void setdischarge_date_time(Date discharge_date_time) {
         this.discharge_date_time = discharge_date_time;
    } 
    public Integer getactual_day(){
        return actual_day;
    } 
    public void setactual_day(Integer actual_day) {
         this.actual_day = actual_day;
    } 
    public String getadmission_status(){
        return admission_status;
    } 
    public void setadmission_status(String admission_status) {
         this.admission_status = admission_status;
    } 
    public String getsupplementary_exam(){
        return supplementary_exam;
    } 
    public void setsupplementary_exam(String supplementary_exam) {
         this.supplementary_exam = supplementary_exam;
    } 
    public String gettzl_process(){
        return tzl_process;
    } 
    public void settzl_process(String tzl_process) {
         this.tzl_process = tzl_process;
    } 
    public String getdischarge_status(){
        return discharge_status;
    } 
    public void setdischarge_status(String discharge_status) {
         this.discharge_status = discharge_status;
    } 
    public String getdischarge_symptom_and_sign(){
        return discharge_symptom_and_sign;
    } 
    public void setdischarge_symptom_and_sign(String discharge_symptom_and_sign) {
         this.discharge_symptom_and_sign = discharge_symptom_and_sign;
    } 
    public String getdischarge_summary_contents(){
        return discharge_summary_contents;
    } 
    public void setdischarge_summary_contents(String discharge_summary_contents) {
         this.discharge_summary_contents = discharge_summary_contents;
    } 
    public String getdischarge_order(){
        return discharge_order;
    } 
    public void setdischarge_order(String discharge_order) {
         this.discharge_order = discharge_order;
    } 
    public String getdisease_outcome(){
        return disease_outcome;
    } 
    public void setdisease_outcome(String disease_outcome) {
         this.disease_outcome = disease_outcome;
    } 
    public String getinp_route(){
        return inp_route;
    } 
    public void setinp_route(String inp_route) {
         this.inp_route = inp_route;
    } 
    public String getinp_department(){
        return inp_department;
    } 
    public void setinp_department(String inp_department) {
         this.inp_department = inp_department;
    } 
    public String getoutp_department(){
        return outp_department;
    } 
    public void setoutp_department(String outp_department) {
         this.outp_department = outp_department;
    } 
    public String getinp_diag(){
        return inp_diag;
    } 
    public void setinp_diag(String inp_diag) {
         this.inp_diag = inp_diag;
    } 
    public String getoutp_main_diag(){
        return outp_main_diag;
    } 
    public void setoutp_main_diag(String outp_main_diag) {
         this.outp_main_diag = outp_main_diag;
    } 
    public String getoutp_other_diag(){
        return outp_other_diag;
    } 
    public void setoutp_other_diag(String outp_other_diag) {
         this.outp_other_diag = outp_other_diag;
    } 
    public String getleaving_mode(){
        return leaving_mode;
    } 
    public void setleaving_mode(String leaving_mode) {
         this.leaving_mode = leaving_mode;
    } 
    public String gettumor_diag_code(){
        return tumor_diag_code;
    } 
    public void settumor_diag_code(String tumor_diag_code) {
         this.tumor_diag_code = tumor_diag_code;
    } 
    public String gettumor_class_code(){
        return tumor_class_code;
    } 
    public void settumor_class_code(String tumor_class_code) {
         this.tumor_class_code = tumor_class_code;
    } 
    public String gethis_num(){
        return his_num;
    } 
    public void sethis_num(String his_num) {
         this.his_num = his_num;
    } 
    public String gettumor_diag_basis_code(){
        return tumor_diag_basis_code;
    } 
    public void settumor_diag_basis_code(String tumor_diag_basis_code) {
         this.tumor_diag_basis_code = tumor_diag_basis_code;
    } 
    public String getdoor_diag(){
        return door_diag;
    } 
    public void setdoor_diag(String door_diag) {
         this.door_diag = door_diag;
    } 
    public String getis_two_operation(){
        return is_two_operation;
    } 
    public void setis_two_operation(String is_two_operation) {
         this.is_two_operation = is_two_operation;
    } 
    public String getwhy_not_two(){
        return why_not_two;
    } 
    public void setwhy_not_two(String why_not_two) {
         this.why_not_two = why_not_two;
    } 
    public String getdoctor_sign(){
        return doctor_sign;
    } 
    public void setdoctor_sign(String doctor_sign) {
         this.doctor_sign = doctor_sign;
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