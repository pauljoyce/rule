package com.clinical.model.master;
import java.util.Date;
public class POST_OP_COURSE{
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
    //手术时间
    private Date operation_time;
    //术中诊断
    private String in_op_diagnosis;
    //麻醉方式
    private String anesthesia;
    //手术名称
    private String operation_approach;
    //手术经过
    private String operation_process;
    //术后处置
    private String post_operation;
    //术后注意事项
    private String post_op_considerations;
    //术后首次病程详细记录
    private String postoperation_detail_note;
    //记录主题
    private String note_topic;
    //手术名称
    private String surgery_name;
    //手术目标部位
    private String surgery_performed_site;
    //手术ASA分级
    private String surgery_asa_rating;
    //手术开始时间
    private Date surgery_starttime;
    //手术结束时间
    private Date surgery_endtime;
    //诊断依据
    private String diagnosis_basis;
    //术中出血量
    private Integer bleeding_volum;
    //并发症
    private String complication;
    //手术引流
    private String surgical_drainage;
    //医师签名
    private String doctor_sign;
    //记录时间
    private String record_time;
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
    public Date getoperation_time(){
        return operation_time;
    } 
    public void setoperation_time(Date operation_time) {
         this.operation_time = operation_time;
    } 
    public String getin_op_diagnosis(){
        return in_op_diagnosis;
    } 
    public void setin_op_diagnosis(String in_op_diagnosis) {
         this.in_op_diagnosis = in_op_diagnosis;
    } 
    public String getanesthesia(){
        return anesthesia;
    } 
    public void setanesthesia(String anesthesia) {
         this.anesthesia = anesthesia;
    } 
    public String getoperation_approach(){
        return operation_approach;
    } 
    public void setoperation_approach(String operation_approach) {
         this.operation_approach = operation_approach;
    } 
    public String getoperation_process(){
        return operation_process;
    } 
    public void setoperation_process(String operation_process) {
         this.operation_process = operation_process;
    } 
    public String getpost_operation(){
        return post_operation;
    } 
    public void setpost_operation(String post_operation) {
         this.post_operation = post_operation;
    } 
    public String getpost_op_considerations(){
        return post_op_considerations;
    } 
    public void setpost_op_considerations(String post_op_considerations) {
         this.post_op_considerations = post_op_considerations;
    } 
    public String getpostoperation_detail_note(){
        return postoperation_detail_note;
    } 
    public void setpostoperation_detail_note(String postoperation_detail_note) {
         this.postoperation_detail_note = postoperation_detail_note;
    } 
    public String getnote_topic(){
        return note_topic;
    } 
    public void setnote_topic(String note_topic) {
         this.note_topic = note_topic;
    } 
    public String getsurgery_name(){
        return surgery_name;
    } 
    public void setsurgery_name(String surgery_name) {
         this.surgery_name = surgery_name;
    } 
    public String getsurgery_performed_site(){
        return surgery_performed_site;
    } 
    public void setsurgery_performed_site(String surgery_performed_site) {
         this.surgery_performed_site = surgery_performed_site;
    } 
    public String getsurgery_asa_rating(){
        return surgery_asa_rating;
    } 
    public void setsurgery_asa_rating(String surgery_asa_rating) {
         this.surgery_asa_rating = surgery_asa_rating;
    } 
    public Date getsurgery_starttime(){
        return surgery_starttime;
    } 
    public void setsurgery_starttime(Date surgery_starttime) {
         this.surgery_starttime = surgery_starttime;
    } 
    public Date getsurgery_endtime(){
        return surgery_endtime;
    } 
    public void setsurgery_endtime(Date surgery_endtime) {
         this.surgery_endtime = surgery_endtime;
    } 
    public String getdiagnosis_basis(){
        return diagnosis_basis;
    } 
    public void setdiagnosis_basis(String diagnosis_basis) {
         this.diagnosis_basis = diagnosis_basis;
    } 
    public Integer getbleeding_volum(){
        return bleeding_volum;
    } 
    public void setbleeding_volum(Integer bleeding_volum) {
         this.bleeding_volum = bleeding_volum;
    } 
    public String getcomplication(){
        return complication;
    } 
    public void setcomplication(String complication) {
         this.complication = complication;
    } 
    public String getsurgical_drainage(){
        return surgical_drainage;
    } 
    public void setsurgical_drainage(String surgical_drainage) {
         this.surgical_drainage = surgical_drainage;
    } 
    public String getdoctor_sign(){
        return doctor_sign;
    } 
    public void setdoctor_sign(String doctor_sign) {
         this.doctor_sign = doctor_sign;
    } 
    public String getrecord_time(){
        return record_time;
    } 
    public void setrecord_time(String record_time) {
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