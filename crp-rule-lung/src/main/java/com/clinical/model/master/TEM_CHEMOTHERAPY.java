package com.clinical.model.master;
import java.util.Date;
public class TEM_CHEMOTHERAPY{
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
    //化疗开始时间
    private Date chem_begin_time;
    //化疗结束时间
    private Date chem_end_time;
    //化疗周期方案代码
    private String chemotherapy_regimen_code;
    //化疗周期方案
    private String chemotherapy_regimen_name;
    //化疗周期计数
    private String chem_period;
    //化疗周期总数
    private String chem_period_total;
    //化疗类型
    private String chem_type;
    //化疗方案名称代码
    private String chem_regimen_code;
    //化疗方案
    private String chem_regimen;
    //化疗药物及剂量
    private String chem_drug_and_dose;
    //化疗药物1
    private String chem_drug_1;
    //化疗药品1药理主要成分
    private String chem_drug_main_comp_1;
    //化疗药品1商品名
    private String chem_drug_brand_name_1;
    //化疗药品1药物剂型
    private String chem_drug_dosage_form_1;
    //化疗药品1单次用药剂量
    private String chem_single_dose_1;
    //化疗药品1单次用药剂量单位
    private String chem_single_dose_unit_1;
    //化疗药品1用药频次
    private String chem_frequency_1;
    //化疗药品1用药方式
    private String chem_method_1;
    //化疗药物2
    private String chem_drug_2;
    //化疗药品2药理主要成分
    private String chem_drug_main_comp_2;
    //化疗药品2商品名
    private String chem_drug_brand_name_2;
    //化疗药品2药物剂型
    private String chem_drug_dosage_form_2;
    //化疗药品2单次用药剂量
    private String chem_single_dose_2;
    //化疗药品2单次用药剂量单位
    private String chem_single_dose_unit_2;
    //化疗药品2用药频次
    private String chem_frequency_2;
    //化疗药品2用药方式
    private String chem_method_2;
    //化疗药物3
    private String chem_drug_3;
    //化疗药品3药理主要成分
    private String chem_drug_main_comp_3;
    //化疗药品3商品名
    private String chem_drug_brand_name_3;
    //化疗药品3药物剂型
    private String chem_drug_dosage_form_3;
    //化疗药品3单次用药剂量
    private String chem_single_dose_3;
    //化疗药品3单次用药剂量单位
    private String chem_single_dose_unit_3;
    //化疗药品3用药频次
    private String chem_frequency_3;
    //化疗药品3用药方式
    private String chem_method_3;
    //化疗药物4
    private String chem_drug_4;
    //化疗药品4药理主要成分
    private String chem_drug_main_comp_4;
    //化疗药品4商品名
    private String chem_drug_brand_name_4;
    //化疗药品4药物剂型
    private String chem_drug_dosage_form_4;
    //化疗药品4单次用药剂量
    private String chem_single_dose_4;
    //化疗药品4单次用药剂量单位
    private String chem_single_dose_unit_4;
    //化疗药品4用药频次
    private String chem_frequency_4;
    //化疗药品4用药方式
    private String chem_method_4;
    //化疗药物5
    private String chem_drug_5;
    //化疗药品5药理主要成分
    private String chem_drug_main_comp_5;
    //化疗药品5商品名
    private String chem_drug_brand_name_5;
    //化疗药品5药物剂型
    private String chem_drug_dosage_form_5;
    //化疗药品5单次用药剂量
    private String chem_single_dose_5;
    //化疗药品5单次用药剂量单位
    private String chem_single_dose_unit_5;
    //化疗药品5用药频次
    private String chem_frequency_5;
    //化疗药品5用药方式
    private String chem_method_5;
    //药物类别名称
    private String drug_class_name;
    //医嘱开立者姓名
    private String prescriber_name;
    //医嘱开立日期时间
    private Date prescribed_time;
    //医嘱计划结束时间
    private Date planned_end_time;
    //医嘱用量
    private String quantity;
    //停止医嘱者标示号
    private String stopp_person_id;
    //合并治疗
    private String combined_treatment;
    //治疗目的代码
    private String purpose_code;
    //化疗目的
    private String purpose;
    //化疗连续性说明
    private String chemotherapy_continuity_instruction;
    //中断原因
    private String suspension_reason;
    //疗效评估代码
    private String efficacy_evaluation_code;
    //疗效评估
    private String efficacy_evaluation;
    //病情转归代码
    private String outcome_code;
    //病情转归
    private String outcome;
    //化疗疗效
    private String chem_effect;
    //化疗副反应与分级
    private String chem_adverse_reaction;
    //副反应分级代码
    private String side_effect_degree_code;
    //副反应代码
    private String side_effect_code;
    //副反应
    private String side_effect;
    //化疗特殊说明
    private String chem_note;
    //责任医生
    private String chemo_doctor;
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
    public Date getchem_begin_time(){
        return chem_begin_time;
    } 
    public void setchem_begin_time(Date chem_begin_time) {
         this.chem_begin_time = chem_begin_time;
    } 
    public Date getchem_end_time(){
        return chem_end_time;
    } 
    public void setchem_end_time(Date chem_end_time) {
         this.chem_end_time = chem_end_time;
    } 
    public String getchemotherapy_regimen_code(){
        return chemotherapy_regimen_code;
    } 
    public void setchemotherapy_regimen_code(String chemotherapy_regimen_code) {
         this.chemotherapy_regimen_code = chemotherapy_regimen_code;
    } 
    public String getchemotherapy_regimen_name(){
        return chemotherapy_regimen_name;
    } 
    public void setchemotherapy_regimen_name(String chemotherapy_regimen_name) {
         this.chemotherapy_regimen_name = chemotherapy_regimen_name;
    } 
    public String getchem_period(){
        return chem_period;
    } 
    public void setchem_period(String chem_period) {
         this.chem_period = chem_period;
    } 
    public String getchem_period_total(){
        return chem_period_total;
    } 
    public void setchem_period_total(String chem_period_total) {
         this.chem_period_total = chem_period_total;
    } 
    public String getchem_type(){
        return chem_type;
    } 
    public void setchem_type(String chem_type) {
         this.chem_type = chem_type;
    } 
    public String getchem_regimen_code(){
        return chem_regimen_code;
    } 
    public void setchem_regimen_code(String chem_regimen_code) {
         this.chem_regimen_code = chem_regimen_code;
    } 
    public String getchem_regimen(){
        return chem_regimen;
    } 
    public void setchem_regimen(String chem_regimen) {
         this.chem_regimen = chem_regimen;
    } 
    public String getchem_drug_and_dose(){
        return chem_drug_and_dose;
    } 
    public void setchem_drug_and_dose(String chem_drug_and_dose) {
         this.chem_drug_and_dose = chem_drug_and_dose;
    } 
    public String getchem_drug_1(){
        return chem_drug_1;
    } 
    public void setchem_drug_1(String chem_drug_1) {
         this.chem_drug_1 = chem_drug_1;
    } 
    public String getchem_drug_main_comp_1(){
        return chem_drug_main_comp_1;
    } 
    public void setchem_drug_main_comp_1(String chem_drug_main_comp_1) {
         this.chem_drug_main_comp_1 = chem_drug_main_comp_1;
    } 
    public String getchem_drug_brand_name_1(){
        return chem_drug_brand_name_1;
    } 
    public void setchem_drug_brand_name_1(String chem_drug_brand_name_1) {
         this.chem_drug_brand_name_1 = chem_drug_brand_name_1;
    } 
    public String getchem_drug_dosage_form_1(){
        return chem_drug_dosage_form_1;
    } 
    public void setchem_drug_dosage_form_1(String chem_drug_dosage_form_1) {
         this.chem_drug_dosage_form_1 = chem_drug_dosage_form_1;
    } 
    public String getchem_single_dose_1(){
        return chem_single_dose_1;
    } 
    public void setchem_single_dose_1(String chem_single_dose_1) {
         this.chem_single_dose_1 = chem_single_dose_1;
    } 
    public String getchem_single_dose_unit_1(){
        return chem_single_dose_unit_1;
    } 
    public void setchem_single_dose_unit_1(String chem_single_dose_unit_1) {
         this.chem_single_dose_unit_1 = chem_single_dose_unit_1;
    } 
    public String getchem_frequency_1(){
        return chem_frequency_1;
    } 
    public void setchem_frequency_1(String chem_frequency_1) {
         this.chem_frequency_1 = chem_frequency_1;
    } 
    public String getchem_method_1(){
        return chem_method_1;
    } 
    public void setchem_method_1(String chem_method_1) {
         this.chem_method_1 = chem_method_1;
    } 
    public String getchem_drug_2(){
        return chem_drug_2;
    } 
    public void setchem_drug_2(String chem_drug_2) {
         this.chem_drug_2 = chem_drug_2;
    } 
    public String getchem_drug_main_comp_2(){
        return chem_drug_main_comp_2;
    } 
    public void setchem_drug_main_comp_2(String chem_drug_main_comp_2) {
         this.chem_drug_main_comp_2 = chem_drug_main_comp_2;
    } 
    public String getchem_drug_brand_name_2(){
        return chem_drug_brand_name_2;
    } 
    public void setchem_drug_brand_name_2(String chem_drug_brand_name_2) {
         this.chem_drug_brand_name_2 = chem_drug_brand_name_2;
    } 
    public String getchem_drug_dosage_form_2(){
        return chem_drug_dosage_form_2;
    } 
    public void setchem_drug_dosage_form_2(String chem_drug_dosage_form_2) {
         this.chem_drug_dosage_form_2 = chem_drug_dosage_form_2;
    } 
    public String getchem_single_dose_2(){
        return chem_single_dose_2;
    } 
    public void setchem_single_dose_2(String chem_single_dose_2) {
         this.chem_single_dose_2 = chem_single_dose_2;
    } 
    public String getchem_single_dose_unit_2(){
        return chem_single_dose_unit_2;
    } 
    public void setchem_single_dose_unit_2(String chem_single_dose_unit_2) {
         this.chem_single_dose_unit_2 = chem_single_dose_unit_2;
    } 
    public String getchem_frequency_2(){
        return chem_frequency_2;
    } 
    public void setchem_frequency_2(String chem_frequency_2) {
         this.chem_frequency_2 = chem_frequency_2;
    } 
    public String getchem_method_2(){
        return chem_method_2;
    } 
    public void setchem_method_2(String chem_method_2) {
         this.chem_method_2 = chem_method_2;
    } 
    public String getchem_drug_3(){
        return chem_drug_3;
    } 
    public void setchem_drug_3(String chem_drug_3) {
         this.chem_drug_3 = chem_drug_3;
    } 
    public String getchem_drug_main_comp_3(){
        return chem_drug_main_comp_3;
    } 
    public void setchem_drug_main_comp_3(String chem_drug_main_comp_3) {
         this.chem_drug_main_comp_3 = chem_drug_main_comp_3;
    } 
    public String getchem_drug_brand_name_3(){
        return chem_drug_brand_name_3;
    } 
    public void setchem_drug_brand_name_3(String chem_drug_brand_name_3) {
         this.chem_drug_brand_name_3 = chem_drug_brand_name_3;
    } 
    public String getchem_drug_dosage_form_3(){
        return chem_drug_dosage_form_3;
    } 
    public void setchem_drug_dosage_form_3(String chem_drug_dosage_form_3) {
         this.chem_drug_dosage_form_3 = chem_drug_dosage_form_3;
    } 
    public String getchem_single_dose_3(){
        return chem_single_dose_3;
    } 
    public void setchem_single_dose_3(String chem_single_dose_3) {
         this.chem_single_dose_3 = chem_single_dose_3;
    } 
    public String getchem_single_dose_unit_3(){
        return chem_single_dose_unit_3;
    } 
    public void setchem_single_dose_unit_3(String chem_single_dose_unit_3) {
         this.chem_single_dose_unit_3 = chem_single_dose_unit_3;
    } 
    public String getchem_frequency_3(){
        return chem_frequency_3;
    } 
    public void setchem_frequency_3(String chem_frequency_3) {
         this.chem_frequency_3 = chem_frequency_3;
    } 
    public String getchem_method_3(){
        return chem_method_3;
    } 
    public void setchem_method_3(String chem_method_3) {
         this.chem_method_3 = chem_method_3;
    } 
    public String getchem_drug_4(){
        return chem_drug_4;
    } 
    public void setchem_drug_4(String chem_drug_4) {
         this.chem_drug_4 = chem_drug_4;
    } 
    public String getchem_drug_main_comp_4(){
        return chem_drug_main_comp_4;
    } 
    public void setchem_drug_main_comp_4(String chem_drug_main_comp_4) {
         this.chem_drug_main_comp_4 = chem_drug_main_comp_4;
    } 
    public String getchem_drug_brand_name_4(){
        return chem_drug_brand_name_4;
    } 
    public void setchem_drug_brand_name_4(String chem_drug_brand_name_4) {
         this.chem_drug_brand_name_4 = chem_drug_brand_name_4;
    } 
    public String getchem_drug_dosage_form_4(){
        return chem_drug_dosage_form_4;
    } 
    public void setchem_drug_dosage_form_4(String chem_drug_dosage_form_4) {
         this.chem_drug_dosage_form_4 = chem_drug_dosage_form_4;
    } 
    public String getchem_single_dose_4(){
        return chem_single_dose_4;
    } 
    public void setchem_single_dose_4(String chem_single_dose_4) {
         this.chem_single_dose_4 = chem_single_dose_4;
    } 
    public String getchem_single_dose_unit_4(){
        return chem_single_dose_unit_4;
    } 
    public void setchem_single_dose_unit_4(String chem_single_dose_unit_4) {
         this.chem_single_dose_unit_4 = chem_single_dose_unit_4;
    } 
    public String getchem_frequency_4(){
        return chem_frequency_4;
    } 
    public void setchem_frequency_4(String chem_frequency_4) {
         this.chem_frequency_4 = chem_frequency_4;
    } 
    public String getchem_method_4(){
        return chem_method_4;
    } 
    public void setchem_method_4(String chem_method_4) {
         this.chem_method_4 = chem_method_4;
    } 
    public String getchem_drug_5(){
        return chem_drug_5;
    } 
    public void setchem_drug_5(String chem_drug_5) {
         this.chem_drug_5 = chem_drug_5;
    } 
    public String getchem_drug_main_comp_5(){
        return chem_drug_main_comp_5;
    } 
    public void setchem_drug_main_comp_5(String chem_drug_main_comp_5) {
         this.chem_drug_main_comp_5 = chem_drug_main_comp_5;
    } 
    public String getchem_drug_brand_name_5(){
        return chem_drug_brand_name_5;
    } 
    public void setchem_drug_brand_name_5(String chem_drug_brand_name_5) {
         this.chem_drug_brand_name_5 = chem_drug_brand_name_5;
    } 
    public String getchem_drug_dosage_form_5(){
        return chem_drug_dosage_form_5;
    } 
    public void setchem_drug_dosage_form_5(String chem_drug_dosage_form_5) {
         this.chem_drug_dosage_form_5 = chem_drug_dosage_form_5;
    } 
    public String getchem_single_dose_5(){
        return chem_single_dose_5;
    } 
    public void setchem_single_dose_5(String chem_single_dose_5) {
         this.chem_single_dose_5 = chem_single_dose_5;
    } 
    public String getchem_single_dose_unit_5(){
        return chem_single_dose_unit_5;
    } 
    public void setchem_single_dose_unit_5(String chem_single_dose_unit_5) {
         this.chem_single_dose_unit_5 = chem_single_dose_unit_5;
    } 
    public String getchem_frequency_5(){
        return chem_frequency_5;
    } 
    public void setchem_frequency_5(String chem_frequency_5) {
         this.chem_frequency_5 = chem_frequency_5;
    } 
    public String getchem_method_5(){
        return chem_method_5;
    } 
    public void setchem_method_5(String chem_method_5) {
         this.chem_method_5 = chem_method_5;
    } 
    public String getdrug_class_name(){
        return drug_class_name;
    } 
    public void setdrug_class_name(String drug_class_name) {
         this.drug_class_name = drug_class_name;
    } 
    public String getprescriber_name(){
        return prescriber_name;
    } 
    public void setprescriber_name(String prescriber_name) {
         this.prescriber_name = prescriber_name;
    } 
    public Date getprescribed_time(){
        return prescribed_time;
    } 
    public void setprescribed_time(Date prescribed_time) {
         this.prescribed_time = prescribed_time;
    } 
    public Date getplanned_end_time(){
        return planned_end_time;
    } 
    public void setplanned_end_time(Date planned_end_time) {
         this.planned_end_time = planned_end_time;
    } 
    public String getquantity(){
        return quantity;
    } 
    public void setquantity(String quantity) {
         this.quantity = quantity;
    } 
    public String getstopp_person_id(){
        return stopp_person_id;
    } 
    public void setstopp_person_id(String stopp_person_id) {
         this.stopp_person_id = stopp_person_id;
    } 
    public String getcombined_treatment(){
        return combined_treatment;
    } 
    public void setcombined_treatment(String combined_treatment) {
         this.combined_treatment = combined_treatment;
    } 
    public String getpurpose_code(){
        return purpose_code;
    } 
    public void setpurpose_code(String purpose_code) {
         this.purpose_code = purpose_code;
    } 
    public String getpurpose(){
        return purpose;
    } 
    public void setpurpose(String purpose) {
         this.purpose = purpose;
    } 
    public String getchemotherapy_continuity_instruction(){
        return chemotherapy_continuity_instruction;
    } 
    public void setchemotherapy_continuity_instruction(String chemotherapy_continuity_instruction) {
         this.chemotherapy_continuity_instruction = chemotherapy_continuity_instruction;
    } 
    public String getsuspension_reason(){
        return suspension_reason;
    } 
    public void setsuspension_reason(String suspension_reason) {
         this.suspension_reason = suspension_reason;
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
    public String getchem_effect(){
        return chem_effect;
    } 
    public void setchem_effect(String chem_effect) {
         this.chem_effect = chem_effect;
    } 
    public String getchem_adverse_reaction(){
        return chem_adverse_reaction;
    } 
    public void setchem_adverse_reaction(String chem_adverse_reaction) {
         this.chem_adverse_reaction = chem_adverse_reaction;
    } 
    public String getside_effect_degree_code(){
        return side_effect_degree_code;
    } 
    public void setside_effect_degree_code(String side_effect_degree_code) {
         this.side_effect_degree_code = side_effect_degree_code;
    } 
    public String getside_effect_code(){
        return side_effect_code;
    } 
    public void setside_effect_code(String side_effect_code) {
         this.side_effect_code = side_effect_code;
    } 
    public String getside_effect(){
        return side_effect;
    } 
    public void setside_effect(String side_effect) {
         this.side_effect = side_effect;
    } 
    public String getchem_note(){
        return chem_note;
    } 
    public void setchem_note(String chem_note) {
         this.chem_note = chem_note;
    } 
    public String getchemo_doctor(){
        return chemo_doctor;
    } 
    public void setchemo_doctor(String chemo_doctor) {
         this.chemo_doctor = chemo_doctor;
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