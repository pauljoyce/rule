package com.clinical.model.master;
import java.util.Date;
public class PAIN_TREAT_MED{
    //主键
    private Integer id;
    //唯一标识
    private String unique_id;
    //关联1级表unique_id
    private String unique_id_lv1;
    //关联2级表unique_id
    private String unique_id_lv2;
    //关联3级表unique_id
    private String unique_id_lv3;
    //医疗机构代码
    private String p900;
    //癌痛治疗主表id
    private String master_id;
    //基础药物日期
    private String main_drug_date;
    //基础药物名称
    private String main_drug_name;
    //基础药物计量（mg）
    private String main_drug_dose;
    //基础药物给药途径
    private String main_drug_route;
    //爆发痛时间
    private String breakthrough_pain_time;
    //爆发痛药物
    private String breakthrough_pain_drug;
    //爆发痛给药途径
    private String breakthrough_pain_route;
    //爆发痛剂量mg
    private String breakthrough_pain_dose;
    //爆发痛疼痛评分
    private Integer breakthrough_pain_score;
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
    public String getunique_id_lv3(){
        return unique_id_lv3;
    } 
    public void setunique_id_lv3(String unique_id_lv3) {
         this.unique_id_lv3 = unique_id_lv3;
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
    public String getmain_drug_date(){
        return main_drug_date;
    } 
    public void setmain_drug_date(String main_drug_date) {
         this.main_drug_date = main_drug_date;
    } 
    public String getmain_drug_name(){
        return main_drug_name;
    } 
    public void setmain_drug_name(String main_drug_name) {
         this.main_drug_name = main_drug_name;
    } 
    public String getmain_drug_dose(){
        return main_drug_dose;
    } 
    public void setmain_drug_dose(String main_drug_dose) {
         this.main_drug_dose = main_drug_dose;
    } 
    public String getmain_drug_route(){
        return main_drug_route;
    } 
    public void setmain_drug_route(String main_drug_route) {
         this.main_drug_route = main_drug_route;
    } 
    public String getbreakthrough_pain_time(){
        return breakthrough_pain_time;
    } 
    public void setbreakthrough_pain_time(String breakthrough_pain_time) {
         this.breakthrough_pain_time = breakthrough_pain_time;
    } 
    public String getbreakthrough_pain_drug(){
        return breakthrough_pain_drug;
    } 
    public void setbreakthrough_pain_drug(String breakthrough_pain_drug) {
         this.breakthrough_pain_drug = breakthrough_pain_drug;
    } 
    public String getbreakthrough_pain_route(){
        return breakthrough_pain_route;
    } 
    public void setbreakthrough_pain_route(String breakthrough_pain_route) {
         this.breakthrough_pain_route = breakthrough_pain_route;
    } 
    public String getbreakthrough_pain_dose(){
        return breakthrough_pain_dose;
    } 
    public void setbreakthrough_pain_dose(String breakthrough_pain_dose) {
         this.breakthrough_pain_dose = breakthrough_pain_dose;
    } 
    public Integer getbreakthrough_pain_score(){
        return breakthrough_pain_score;
    } 
    public void setbreakthrough_pain_score(Integer breakthrough_pain_score) {
         this.breakthrough_pain_score = breakthrough_pain_score;
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