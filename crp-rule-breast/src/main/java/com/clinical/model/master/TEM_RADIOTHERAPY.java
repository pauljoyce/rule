package com.clinical.model.master;
import java.util.Date;
public class TEM_RADIOTHERAPY{
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
    //放疗开始时间
    private Date radio_begin_time;
    //放疗结束时间
    private Date radio_end_time;
    //放疗持续时间
    private Integer radio_duration;
    //治疗目的代码
    private String radio_purpose_code;
    //放疗目的
    private String radio_purpose;
    //放射源
    private String radio_source;
    //放疗模式
    private String radio_style;
    //放疗技术代码
    private String radio_technology_code;
    //放疗技术
    private String radio_technology;
    //放疗射线能量
    private String radio_ray_energy;
    //放疗部位及剂量
    private String radio_site_and_dose;
    //照射部位1
    private String radio_site_1;
    //放疗次数1
    private Integer radio_times_1;
    //放疗单次剂量1
    private String radio_pre_dose_1;
    //放疗总剂量1
    private String radio_total_1;
    //照射部位2
    private String radio_site_2;
    //放疗次数2
    private Integer radio_times_2;
    //放疗单次剂量2
    private String radio_pre_dose_2;
    //放疗总剂量2
    private String radio_total_2;
    //照射部位3
    private String radio_site_3;
    //放疗次数3
    private Integer radio_times_3;
    //放疗单次剂量3
    private String radio_pre_dose_3;
    //放疗总剂量3
    private String radio_total_3;
    //近期疗效
    private String effects_short;
    //放疗中断天数
    private Integer radio_pause_day;
    //中断原因
    private String reason_pause;
    //放疗特殊说明
    private String radio_instrucation;
    //副反应分级代码
    private String radio_level_code;
    //放疗副反应与分级
    private String radio_level;
    //责任医生
    private String radio_doctor;
    //增敏剂
    private String sensitizer;
    //疗效评估代码
    private String efficacy_evaluation_code;
    //疗效评估
    private String efficacy_evaluation;
    //病情转归代码
    private String outcome_code;
    //病情转归
    private String outcome;
    //备注
    private String comment;
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
    public Date getradio_begin_time(){
        return radio_begin_time;
    } 
    public void setradio_begin_time(Date radio_begin_time) {
         this.radio_begin_time = radio_begin_time;
    } 
    public Date getradio_end_time(){
        return radio_end_time;
    } 
    public void setradio_end_time(Date radio_end_time) {
         this.radio_end_time = radio_end_time;
    } 
    public Integer getradio_duration(){
        return radio_duration;
    } 
    public void setradio_duration(Integer radio_duration) {
         this.radio_duration = radio_duration;
    } 
    public String getradio_purpose_code(){
        return radio_purpose_code;
    } 
    public void setradio_purpose_code(String radio_purpose_code) {
         this.radio_purpose_code = radio_purpose_code;
    } 
    public String getradio_purpose(){
        return radio_purpose;
    } 
    public void setradio_purpose(String radio_purpose) {
         this.radio_purpose = radio_purpose;
    } 
    public String getradio_source(){
        return radio_source;
    } 
    public void setradio_source(String radio_source) {
         this.radio_source = radio_source;
    } 
    public String getradio_style(){
        return radio_style;
    } 
    public void setradio_style(String radio_style) {
         this.radio_style = radio_style;
    } 
    public String getradio_technology_code(){
        return radio_technology_code;
    } 
    public void setradio_technology_code(String radio_technology_code) {
         this.radio_technology_code = radio_technology_code;
    } 
    public String getradio_technology(){
        return radio_technology;
    } 
    public void setradio_technology(String radio_technology) {
         this.radio_technology = radio_technology;
    } 
    public String getradio_ray_energy(){
        return radio_ray_energy;
    } 
    public void setradio_ray_energy(String radio_ray_energy) {
         this.radio_ray_energy = radio_ray_energy;
    } 
    public String getradio_site_and_dose(){
        return radio_site_and_dose;
    } 
    public void setradio_site_and_dose(String radio_site_and_dose) {
         this.radio_site_and_dose = radio_site_and_dose;
    } 
    public String getradio_site_1(){
        return radio_site_1;
    } 
    public void setradio_site_1(String radio_site_1) {
         this.radio_site_1 = radio_site_1;
    } 
    public Integer getradio_times_1(){
        return radio_times_1;
    } 
    public void setradio_times_1(Integer radio_times_1) {
         this.radio_times_1 = radio_times_1;
    } 
    public String getradio_pre_dose_1(){
        return radio_pre_dose_1;
    } 
    public void setradio_pre_dose_1(String radio_pre_dose_1) {
         this.radio_pre_dose_1 = radio_pre_dose_1;
    } 
    public String getradio_total_1(){
        return radio_total_1;
    } 
    public void setradio_total_1(String radio_total_1) {
         this.radio_total_1 = radio_total_1;
    } 
    public String getradio_site_2(){
        return radio_site_2;
    } 
    public void setradio_site_2(String radio_site_2) {
         this.radio_site_2 = radio_site_2;
    } 
    public Integer getradio_times_2(){
        return radio_times_2;
    } 
    public void setradio_times_2(Integer radio_times_2) {
         this.radio_times_2 = radio_times_2;
    } 
    public String getradio_pre_dose_2(){
        return radio_pre_dose_2;
    } 
    public void setradio_pre_dose_2(String radio_pre_dose_2) {
         this.radio_pre_dose_2 = radio_pre_dose_2;
    } 
    public String getradio_total_2(){
        return radio_total_2;
    } 
    public void setradio_total_2(String radio_total_2) {
         this.radio_total_2 = radio_total_2;
    } 
    public String getradio_site_3(){
        return radio_site_3;
    } 
    public void setradio_site_3(String radio_site_3) {
         this.radio_site_3 = radio_site_3;
    } 
    public Integer getradio_times_3(){
        return radio_times_3;
    } 
    public void setradio_times_3(Integer radio_times_3) {
         this.radio_times_3 = radio_times_3;
    } 
    public String getradio_pre_dose_3(){
        return radio_pre_dose_3;
    } 
    public void setradio_pre_dose_3(String radio_pre_dose_3) {
         this.radio_pre_dose_3 = radio_pre_dose_3;
    } 
    public String getradio_total_3(){
        return radio_total_3;
    } 
    public void setradio_total_3(String radio_total_3) {
         this.radio_total_3 = radio_total_3;
    } 
    public String geteffects_short(){
        return effects_short;
    } 
    public void seteffects_short(String effects_short) {
         this.effects_short = effects_short;
    } 
    public Integer getradio_pause_day(){
        return radio_pause_day;
    } 
    public void setradio_pause_day(Integer radio_pause_day) {
         this.radio_pause_day = radio_pause_day;
    } 
    public String getreason_pause(){
        return reason_pause;
    } 
    public void setreason_pause(String reason_pause) {
         this.reason_pause = reason_pause;
    } 
    public String getradio_instrucation(){
        return radio_instrucation;
    } 
    public void setradio_instrucation(String radio_instrucation) {
         this.radio_instrucation = radio_instrucation;
    } 
    public String getradio_level_code(){
        return radio_level_code;
    } 
    public void setradio_level_code(String radio_level_code) {
         this.radio_level_code = radio_level_code;
    } 
    public String getradio_level(){
        return radio_level;
    } 
    public void setradio_level(String radio_level) {
         this.radio_level = radio_level;
    } 
    public String getradio_doctor(){
        return radio_doctor;
    } 
    public void setradio_doctor(String radio_doctor) {
         this.radio_doctor = radio_doctor;
    } 
    public String getsensitizer(){
        return sensitizer;
    } 
    public void setsensitizer(String sensitizer) {
         this.sensitizer = sensitizer;
    } 
    public String getefficacy_evaluation_code(){
        return efficacy_evaluation_code;
    } 
    public void setefficacy_evaluation_code(String efficacy_evaluation_code) {
         this.efficacy_evaluation_code = efficacy_evaluation_code;
    } 
    public String getefficacy_evaluation(){
        return efficacy_evaluation;
    } 
    public void setefficacy_evaluation(String efficacy_evaluation) {
         this.efficacy_evaluation = efficacy_evaluation;
    } 
    public String getoutcome_code(){
        return outcome_code;
    } 
    public void setoutcome_code(String outcome_code) {
         this.outcome_code = outcome_code;
    } 
    public String getoutcome(){
        return outcome;
    } 
    public void setoutcome(String outcome) {
         this.outcome = outcome;
    } 
    public String getcomment(){
        return comment;
    } 
    public void setcomment(String comment) {
         this.comment = comment;
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