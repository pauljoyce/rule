package com.clinical.model.master;
import java.util.Date;
public class OUTP_RECORD{
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
    //患者姓名
    private String name;
    //患者id
    private String patient_id;
    //门（急）诊号
    private String visit_id;
    //就诊次数
    private Integer admission_number;
    //门（急）诊诊断
    private String outpatient_diagnosis;
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
    //现病史
    private String hy_present;
    //既往史
    private String hy_pats;
    //家族史
    private String family_history;
    //个人史
    private String personal_history;
    //月经史
    private String menstrual_history;
    //生育史
    private String fertile_history;
    //哺乳史
    private String reproductive_history;
    //过敏史
    private String allergy_history;
    //暴露史
    private String exposure_history;
    //母孕史
    private String mother_fertile_history;
    //喂养史
    private String feed_history;
    //发育史
    private String growth_history;
    //体格检查
    private String physical_exam;
    //主诉
    private String chief_complaint;
    //辅助检查
    private String supplementary_exam;
    //婚育史
    private String hy_marry_child;
    //处置
    private String treatment;
    //医嘱内容
    private String order_content;
    //记录时间
    private Date record_time;
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
    public String getname(){
        return name;
    } 
    public void setname(String name) {
             this.name = name;
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
    public String getoutpatient_diagnosis(){
        return outpatient_diagnosis;
    } 
    public void setoutpatient_diagnosis(String outpatient_diagnosis) {
             this.outpatient_diagnosis = outpatient_diagnosis;
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
    public String gethy_present(){
        return hy_present;
    } 
    public void sethy_present(String hy_present) {
             this.hy_present = hy_present;
    } 
    public String gethy_pats(){
        return hy_pats;
    } 
    public void sethy_pats(String hy_pats) {
             this.hy_pats = hy_pats;
    } 
    public String getfamily_history(){
        return family_history;
    } 
    public void setfamily_history(String family_history) {
             this.family_history = family_history;
    } 
    public String getpersonal_history(){
        return personal_history;
    } 
    public void setpersonal_history(String personal_history) {
             this.personal_history = personal_history;
    } 
    public String getmenstrual_history(){
        return menstrual_history;
    } 
    public void setmenstrual_history(String menstrual_history) {
             this.menstrual_history = menstrual_history;
    } 
    public String getfertile_history(){
        return fertile_history;
    } 
    public void setfertile_history(String fertile_history) {
             this.fertile_history = fertile_history;
    } 
    public String getreproductive_history(){
        return reproductive_history;
    } 
    public void setreproductive_history(String reproductive_history) {
             this.reproductive_history = reproductive_history;
    } 
    public String getallergy_history(){
        return allergy_history;
    } 
    public void setallergy_history(String allergy_history) {
             this.allergy_history = allergy_history;
    } 
    public String getexposure_history(){
        return exposure_history;
    } 
    public void setexposure_history(String exposure_history) {
             this.exposure_history = exposure_history;
    } 
    public String getmother_fertile_history(){
        return mother_fertile_history;
    } 
    public void setmother_fertile_history(String mother_fertile_history) {
             this.mother_fertile_history = mother_fertile_history;
    } 
    public String getfeed_history(){
        return feed_history;
    } 
    public void setfeed_history(String feed_history) {
             this.feed_history = feed_history;
    } 
    public String getgrowth_history(){
        return growth_history;
    } 
    public void setgrowth_history(String growth_history) {
             this.growth_history = growth_history;
    } 
    public String getphysical_exam(){
        return physical_exam;
    } 
    public void setphysical_exam(String physical_exam) {
             this.physical_exam = physical_exam;
    } 
    public String getchief_complaint(){
        return chief_complaint;
    } 
    public void setchief_complaint(String chief_complaint) {
             this.chief_complaint = chief_complaint;
    } 
    public String getsupplementary_exam(){
        return supplementary_exam;
    } 
    public void setsupplementary_exam(String supplementary_exam) {
             this.supplementary_exam = supplementary_exam;
    } 
    public String gethy_marry_child(){
        return hy_marry_child;
    } 
    public void sethy_marry_child(String hy_marry_child) {
             this.hy_marry_child = hy_marry_child;
    } 
    public String gettreatment(){
        return treatment;
    } 
    public void settreatment(String treatment) {
             this.treatment = treatment;
    } 
    public String getorder_content(){
        return order_content;
    } 
    public void setorder_content(String order_content) {
             this.order_content = order_content;
    } 
    public Date getrecord_time(){
        return record_time;
    } 
    public void setrecord_time(Date record_time) {
             this.record_time = record_time;
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