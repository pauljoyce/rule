package com.clinical.model.master;
import java.util.Date;
public class PRE_OP_DISCUSSION{
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
    //讨论时间
    private Date discussion_time;
    //讨论地点
    private String discussion_place;
    //参加人员
    private Integer involved_person;
    //讨论经过
    private String discussion_detial;
    //已住院天数
    private Integer inpatient_days;
    //主持人姓名
    private String host_name;
    //参与讨论人员名单
    private String participants_list;
    //入院日期
    private Date admission_date;
    //拟实施手术名称
    private String planned_operation_name;
    //拟实施手术编码
    private String planned_operation_code;
    //拟实施部位
    private String planned_operation_site;
    //拟实施手术日期
    private Date planned_operation_time;
    //手术要点
    private String surgery_major_points;
    //术前准备
    private String preoperation_preparation;
    //手术指征
    private String surgical_indication;
    //手术方案
    private String surgical_plan;
    //拟实施麻醉方法
    private String planned_anesthesia_method;
    //拟实施麻醉方法代码
    private String planned_anesthesia_method_code;
    //术中问题及措施
    private String intraoperation_problem_and_measure;
    //手术并发症及措施
    private String surgical_complication_and_measure;
    //讨论意见
    private String discussion_recommendation;
    //主持人讨论意见
    private String host_recommendation;
    //讨论主题
    private String discussion_topic;
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
    public Date getdiscussion_time(){
        return discussion_time;
    } 
    public void setdiscussion_time(Date discussion_time) {
         this.discussion_time = discussion_time;
    } 
    public String getdiscussion_place(){
        return discussion_place;
    } 
    public void setdiscussion_place(String discussion_place) {
         this.discussion_place = discussion_place;
    } 
    public Integer getinvolved_person(){
        return involved_person;
    } 
    public void setinvolved_person(Integer involved_person) {
         this.involved_person = involved_person;
    } 
    public String getdiscussion_detial(){
        return discussion_detial;
    } 
    public void setdiscussion_detial(String discussion_detial) {
         this.discussion_detial = discussion_detial;
    } 
    public Integer getinpatient_days(){
        return inpatient_days;
    } 
    public void setinpatient_days(Integer inpatient_days) {
         this.inpatient_days = inpatient_days;
    } 
    public String gethost_name(){
        return host_name;
    } 
    public void sethost_name(String host_name) {
         this.host_name = host_name;
    } 
    public String getparticipants_list(){
        return participants_list;
    } 
    public void setparticipants_list(String participants_list) {
         this.participants_list = participants_list;
    } 
    public Date getadmission_date(){
        return admission_date;
    } 
    public void setadmission_date(Date admission_date) {
         this.admission_date = admission_date;
    } 
    public String getplanned_operation_name(){
        return planned_operation_name;
    } 
    public void setplanned_operation_name(String planned_operation_name) {
         this.planned_operation_name = planned_operation_name;
    } 
    public String getplanned_operation_code(){
        return planned_operation_code;
    } 
    public void setplanned_operation_code(String planned_operation_code) {
         this.planned_operation_code = planned_operation_code;
    } 
    public String getplanned_operation_site(){
        return planned_operation_site;
    } 
    public void setplanned_operation_site(String planned_operation_site) {
         this.planned_operation_site = planned_operation_site;
    } 
    public Date getplanned_operation_time(){
        return planned_operation_time;
    } 
    public void setplanned_operation_time(Date planned_operation_time) {
         this.planned_operation_time = planned_operation_time;
    } 
    public String getsurgery_major_points(){
        return surgery_major_points;
    } 
    public void setsurgery_major_points(String surgery_major_points) {
         this.surgery_major_points = surgery_major_points;
    } 
    public String getpreoperation_preparation(){
        return preoperation_preparation;
    } 
    public void setpreoperation_preparation(String preoperation_preparation) {
         this.preoperation_preparation = preoperation_preparation;
    } 
    public String getsurgical_indication(){
        return surgical_indication;
    } 
    public void setsurgical_indication(String surgical_indication) {
         this.surgical_indication = surgical_indication;
    } 
    public String getsurgical_plan(){
        return surgical_plan;
    } 
    public void setsurgical_plan(String surgical_plan) {
         this.surgical_plan = surgical_plan;
    } 
    public String getplanned_anesthesia_method(){
        return planned_anesthesia_method;
    } 
    public void setplanned_anesthesia_method(String planned_anesthesia_method) {
         this.planned_anesthesia_method = planned_anesthesia_method;
    } 
    public String getplanned_anesthesia_method_code(){
        return planned_anesthesia_method_code;
    } 
    public void setplanned_anesthesia_method_code(String planned_anesthesia_method_code) {
         this.planned_anesthesia_method_code = planned_anesthesia_method_code;
    } 
    public String getintraoperation_problem_and_measure(){
        return intraoperation_problem_and_measure;
    } 
    public void setintraoperation_problem_and_measure(String intraoperation_problem_and_measure) {
         this.intraoperation_problem_and_measure = intraoperation_problem_and_measure;
    } 
    public String getsurgical_complication_and_measure(){
        return surgical_complication_and_measure;
    } 
    public void setsurgical_complication_and_measure(String surgical_complication_and_measure) {
         this.surgical_complication_and_measure = surgical_complication_and_measure;
    } 
    public String getdiscussion_recommendation(){
        return discussion_recommendation;
    } 
    public void setdiscussion_recommendation(String discussion_recommendation) {
         this.discussion_recommendation = discussion_recommendation;
    } 
    public String gethost_recommendation(){
        return host_recommendation;
    } 
    public void sethost_recommendation(String host_recommendation) {
         this.host_recommendation = host_recommendation;
    } 
    public String getdiscussion_topic(){
        return discussion_topic;
    } 
    public void setdiscussion_topic(String discussion_topic) {
         this.discussion_topic = discussion_topic;
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