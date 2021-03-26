package com.clinical.model.master;
import java.util.Date;
public class TEM_INP_ADMISSION_STATUS{
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
    //住院号
    private String visit_id;
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
    //病人姓名
    private String tpatname;
    //就诊时间
    private Date admission_date_time;
    //住院次数
    private Integer admission_number;
    //病案号
    private String tpatno;
    //临床初步诊断
    private String preliminary_clinical_diagnosis;
    //临床初步诊断日期
    private Date preliminary_diagnosis_date;
    //医生签名_初步诊断
    private String doctor_preliminary_diagnosis;
    //临床确定诊断
    private String clinical_definite_diagnosis;
    //临床确定诊断日期
    private Date definite_diagnosis_date;
    //医生签名_确定诊断
    private String doctor_definite_diagnosis;
    //现病史
    private String hy_present;
    //既往史
    private String hy_pats;
    //个人史
    private String hy_individual;
    //月经史
    private String menstrual_history_sta;
    //身高
    private String by_height;
    //体重
    private String by_weight;
    //体表面积
    private String by_surface_area;
    //ecog_whops评分
    private String t_ecog_whops;
    //kps评分
    private String t_kps;
    //疼痛评分_nrs法
    private String t_nrs;
    //家族史
    private String hy_family;
    //体格检查
    private String physical_exam;
    //主诉
    private String chief_complaint;
    //专科检查
    private String speciality_exam;
    //辅助检查
    private String supplementary_exam;
    //婚姻状况
    private String marriage;
    //性别
    private String sex;
    //年龄
    private Integer age;
    //民族
    private String nation;
    //职业
    private String occupation;
    //记录时间
    private Date record_time;
    //病史陈述者
    private String medical_history_narrator;
    //患者病史陈述者与患者关系
    private String relationship_between_patient;
    //婚育史
    private String history_of_marr_child;
    //哺乳史
    private String reproductive_history;
    //过敏史
    private String allergy_history;
    //暴露史
    private String exposure_history;
    //母孕史
    private String mother_fertile_history;
    //修正诊断
    private String correct_diagnosis;
    //修正诊断时间
    private String correct_diagnosis_time;
    //修正诊断医师签名
    private String correct_diagnosis_doctor;
    //补充诊断
    private String sup_diagnosis;
    //补充诊断时间
    private String sup_diagnosis_time;
    //补充诊断医师签名
    private String sup_diagnosis_doctor;
    //病历小结
    private String record_summary;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
    public String gettpatname(){
        return tpatname;
    } 
    public void settpatname(String tpatname) {
             this.tpatname = tpatname;
    } 
    public Date getadmission_date_time(){
        return admission_date_time;
    } 
    public void setadmission_date_time(Date admission_date_time) {
             this.admission_date_time = admission_date_time;
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
    public String getpreliminary_clinical_diagnosis(){
        return preliminary_clinical_diagnosis;
    } 
    public void setpreliminary_clinical_diagnosis(String preliminary_clinical_diagnosis) {
             this.preliminary_clinical_diagnosis = preliminary_clinical_diagnosis;
    } 
    public Date getpreliminary_diagnosis_date(){
        return preliminary_diagnosis_date;
    } 
    public void setpreliminary_diagnosis_date(Date preliminary_diagnosis_date) {
             this.preliminary_diagnosis_date = preliminary_diagnosis_date;
    } 
    public String getdoctor_preliminary_diagnosis(){
        return doctor_preliminary_diagnosis;
    } 
    public void setdoctor_preliminary_diagnosis(String doctor_preliminary_diagnosis) {
             this.doctor_preliminary_diagnosis = doctor_preliminary_diagnosis;
    } 
    public String getclinical_definite_diagnosis(){
        return clinical_definite_diagnosis;
    } 
    public void setclinical_definite_diagnosis(String clinical_definite_diagnosis) {
             this.clinical_definite_diagnosis = clinical_definite_diagnosis;
    } 
    public Date getdefinite_diagnosis_date(){
        return definite_diagnosis_date;
    } 
    public void setdefinite_diagnosis_date(Date definite_diagnosis_date) {
             this.definite_diagnosis_date = definite_diagnosis_date;
    } 
    public String getdoctor_definite_diagnosis(){
        return doctor_definite_diagnosis;
    } 
    public void setdoctor_definite_diagnosis(String doctor_definite_diagnosis) {
             this.doctor_definite_diagnosis = doctor_definite_diagnosis;
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
    public String gethy_individual(){
        return hy_individual;
    } 
    public void sethy_individual(String hy_individual) {
             this.hy_individual = hy_individual;
    } 
    public String getmenstrual_history_sta(){
        return menstrual_history_sta;
    } 
    public void setmenstrual_history_sta(String menstrual_history_sta) {
             this.menstrual_history_sta = menstrual_history_sta;
    } 
    public String getby_height(){
        return by_height;
    } 
    public void setby_height(String by_height) {
             this.by_height = by_height;
    } 
    public String getby_weight(){
        return by_weight;
    } 
    public void setby_weight(String by_weight) {
             this.by_weight = by_weight;
    } 
    public String getby_surface_area(){
        return by_surface_area;
    } 
    public void setby_surface_area(String by_surface_area) {
             this.by_surface_area = by_surface_area;
    } 
    public String gett_ecog_whops(){
        return t_ecog_whops;
    } 
    public void sett_ecog_whops(String t_ecog_whops) {
             this.t_ecog_whops = t_ecog_whops;
    } 
    public String gett_kps(){
        return t_kps;
    } 
    public void sett_kps(String t_kps) {
             this.t_kps = t_kps;
    } 
    public String gett_nrs(){
        return t_nrs;
    } 
    public void sett_nrs(String t_nrs) {
             this.t_nrs = t_nrs;
    } 
    public String gethy_family(){
        return hy_family;
    } 
    public void sethy_family(String hy_family) {
             this.hy_family = hy_family;
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
    public String getspeciality_exam(){
        return speciality_exam;
    } 
    public void setspeciality_exam(String speciality_exam) {
             this.speciality_exam = speciality_exam;
    } 
    public String getsupplementary_exam(){
        return supplementary_exam;
    } 
    public void setsupplementary_exam(String supplementary_exam) {
             this.supplementary_exam = supplementary_exam;
    } 
    public String getmarriage(){
        return marriage;
    } 
    public void setmarriage(String marriage) {
             this.marriage = marriage;
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
    public String getnation(){
        return nation;
    } 
    public void setnation(String nation) {
             this.nation = nation;
    } 
    public String getoccupation(){
        return occupation;
    } 
    public void setoccupation(String occupation) {
             this.occupation = occupation;
    } 
    public Date getrecord_time(){
        return record_time;
    } 
    public void setrecord_time(Date record_time) {
             this.record_time = record_time;
    } 
    public String getmedical_history_narrator(){
        return medical_history_narrator;
    } 
    public void setmedical_history_narrator(String medical_history_narrator) {
             this.medical_history_narrator = medical_history_narrator;
    } 
    public String getrelationship_between_patient(){
        return relationship_between_patient;
    } 
    public void setrelationship_between_patient(String relationship_between_patient) {
             this.relationship_between_patient = relationship_between_patient;
    } 
    public String gethistory_of_marr_child(){
        return history_of_marr_child;
    } 
    public void sethistory_of_marr_child(String history_of_marr_child) {
             this.history_of_marr_child = history_of_marr_child;
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
    public String getcorrect_diagnosis(){
        return correct_diagnosis;
    } 
    public void setcorrect_diagnosis(String correct_diagnosis) {
             this.correct_diagnosis = correct_diagnosis;
    } 
    public String getcorrect_diagnosis_time(){
        return correct_diagnosis_time;
    } 
    public void setcorrect_diagnosis_time(String correct_diagnosis_time) {
             this.correct_diagnosis_time = correct_diagnosis_time;
    } 
    public String getcorrect_diagnosis_doctor(){
        return correct_diagnosis_doctor;
    } 
    public void setcorrect_diagnosis_doctor(String correct_diagnosis_doctor) {
             this.correct_diagnosis_doctor = correct_diagnosis_doctor;
    } 
    public String getsup_diagnosis(){
        return sup_diagnosis;
    } 
    public void setsup_diagnosis(String sup_diagnosis) {
             this.sup_diagnosis = sup_diagnosis;
    } 
    public String getsup_diagnosis_time(){
        return sup_diagnosis_time;
    } 
    public void setsup_diagnosis_time(String sup_diagnosis_time) {
             this.sup_diagnosis_time = sup_diagnosis_time;
    } 
    public String getsup_diagnosis_doctor(){
        return sup_diagnosis_doctor;
    } 
    public void setsup_diagnosis_doctor(String sup_diagnosis_doctor) {
             this.sup_diagnosis_doctor = sup_diagnosis_doctor;
    } 
    public String getrecord_summary(){
        return record_summary;
    } 
    public void setrecord_summary(String record_summary) {
             this.record_summary = record_summary;
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