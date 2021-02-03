package com.clinical.model.master;
import java.util.Date;
public class PROCEDURE_RECORD{
    //主键id
    private Integer ID;
    //唯一标识
    private String UNIQUE_ID;
    //关联1级表unique_id
    private String UNIQUE_ID_LV1;
    //关联2级表unique_id
    private String UNIQUE_ID_LV2;
    //医疗机构代码
    private String P900;
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
    //治疗主题
    private String treatment_major_points;
    //治疗记录
    private String treatment_note;
    //患者一般状况
    private String general_condition;
    //处理及指导意见
    private String management_and_instructions;
    //过程是否顺利
    private String is_successful;
    //是否有不良反应
    private String is_adverse_reaction;
    //医嘱使用备注
    private String comment_for_order;
    //后续注意事项
    private String matters_needing_attention;
    //今后治疗方案
    private String treatment_plan_hereafter;
    //住院次数
    private Integer admission_number;
    //操作名称
    private String operation_name;
    //操作过程
    private String operation_process;
    //记录时间
    private Date record_time;
    //医师签名
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

    public Integer getID(){
        return ID;
    } 
    public void setID(Integer ID) {
         this.ID = ID;
    } 
    public String getUNIQUE_ID(){
        return UNIQUE_ID;
    } 
    public void setUNIQUE_ID(String UNIQUE_ID) {
         this.UNIQUE_ID = UNIQUE_ID;
    } 
    public String getUNIQUE_ID_LV1(){
        return UNIQUE_ID_LV1;
    } 
    public void setUNIQUE_ID_LV1(String UNIQUE_ID_LV1) {
         this.UNIQUE_ID_LV1 = UNIQUE_ID_LV1;
    } 
    public String getUNIQUE_ID_LV2(){
        return UNIQUE_ID_LV2;
    } 
    public void setUNIQUE_ID_LV2(String UNIQUE_ID_LV2) {
         this.UNIQUE_ID_LV2 = UNIQUE_ID_LV2;
    } 
    public String getP900(){
        return P900;
    } 
    public void setP900(String P900) {
         this.P900 = P900;
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
    public String gettreatment_major_points(){
        return treatment_major_points;
    } 
    public void settreatment_major_points(String treatment_major_points) {
         this.treatment_major_points = treatment_major_points;
    } 
    public String gettreatment_note(){
        return treatment_note;
    } 
    public void settreatment_note(String treatment_note) {
         this.treatment_note = treatment_note;
    } 
    public String getgeneral_condition(){
        return general_condition;
    } 
    public void setgeneral_condition(String general_condition) {
         this.general_condition = general_condition;
    } 
    public String getmanagement_and_instructions(){
        return management_and_instructions;
    } 
    public void setmanagement_and_instructions(String management_and_instructions) {
         this.management_and_instructions = management_and_instructions;
    } 
    public String getis_successful(){
        return is_successful;
    } 
    public void setis_successful(String is_successful) {
         this.is_successful = is_successful;
    } 
    public String getis_adverse_reaction(){
        return is_adverse_reaction;
    } 
    public void setis_adverse_reaction(String is_adverse_reaction) {
         this.is_adverse_reaction = is_adverse_reaction;
    } 
    public String getcomment_for_order(){
        return comment_for_order;
    } 
    public void setcomment_for_order(String comment_for_order) {
         this.comment_for_order = comment_for_order;
    } 
    public String getmatters_needing_attention(){
        return matters_needing_attention;
    } 
    public void setmatters_needing_attention(String matters_needing_attention) {
         this.matters_needing_attention = matters_needing_attention;
    } 
    public String gettreatment_plan_hereafter(){
        return treatment_plan_hereafter;
    } 
    public void settreatment_plan_hereafter(String treatment_plan_hereafter) {
         this.treatment_plan_hereafter = treatment_plan_hereafter;
    } 
    public Integer getadmission_number(){
        return admission_number;
    } 
    public void setadmission_number(Integer admission_number) {
         this.admission_number = admission_number;
    } 
    public String getoperation_name(){
        return operation_name;
    } 
    public void setoperation_name(String operation_name) {
         this.operation_name = operation_name;
    } 
    public String getoperation_process(){
        return operation_process;
    } 
    public void setoperation_process(String operation_process) {
         this.operation_process = operation_process;
    } 
    public Date getrecord_time(){
        return record_time;
    } 
    public void setrecord_time(Date record_time) {
         this.record_time = record_time;
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