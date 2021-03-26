package com.clinical.model.master;
import java.util.Date;
public class SMOKE_AND_DRINK{
    //顺序流水号
    private Integer seq_id;
    //记录唯一标识
    private String unique_id;
    //清洗后患者唯一标识
    private String unique_id_lv1;
    //清洗后人次标识
    private String unique_id_lv2;
    //医疗机构代码
    private String p900;
    //患者ID
    private String patient_id;
    //病案号
    private String tpatno;
    //就诊类型
    private Integer visit_type;
    //记录状态
    private String record_status;
    //住院号
    private String visit_id;
    //住院次数
    private Integer admission_number;
    //入院时间
    private Date admission_date_time;
    //是否饮酒
    private String drinker;
    //饮酒年限
    private String year_of_drink;
    //饮酒时间点
    private String drink_date_time;
    //饮酒量
    private String consumption_drink;
    //是否戒酒
    private String drink_quitter;
    //戒酒年限
    private String year_of_drink_quitting;
    //戒酒时间点
    private String drink_q_date_time;
    //是否吸烟
    private String smoker;
    //吸烟年限
    private String year_of_smoke;
    //吸烟时间点
    private String smoke_date_time;
    //吸烟量
    private String consumption_smoke;
    //是否戒烟
    private String smoke_quitter;
    //戒烟年限
    private String year_of_smoke_quitting;
    //戒烟时间点
    private String smoke_q_date_time;
    //烟酒信息字段来源
    private String fs_nlp;
    //烟酒信息字段来源中文备注
    private String fs_nlp_cn;
    //字段来源中的出现序号
    private Integer fs_serial_number;
    //字段来源中吸烟实体所在位置
    private Integer fs_location_smoke;
    //字段来源中戒烟实体所在位置
    private Integer fs_location_smoke_q;
    //字段来源中饮酒实体所在位置
    private Integer fs_location_drink;
    //字段来源中戒酒实体所在位置
    private Integer fs_location_drink_q;
    //数据版本
    private String data_version;
    //数据库来源
    private String data_db_source;
    //数据表来源
    private String data_table_source;
    //数据表来源中文备注
    private String data_table_source_cn;
    //数据项来源
    private String data_field_source;
    //创建时间
    private Date create_time;
    //创建人
    private String creator;
    //记录时间
    private Date record_time;
    //批号
    private String batch_number;
    //饮酒时间点精确时间
    private Date drink_date_time_p;
    //饮酒时间点推测时间
    private Date drink_date_time_estimate;
    //戒酒时间点精确时间
    private Date drink_q_date_time_p;
    //戒酒时间点推测时间
    private Date drink_q_date_time_estimate;
    //吸烟时间点精确时间
    private Date smoke_date_time_p;
    //吸烟时间点推测时间
    private Date smoke_date_time_estimate;
    //戒烟时间点精确时间
    private Date smoke_q_date_time_p;
    //戒烟时间点推测时间
    private Date smoke_q_date_time_estimate;
    //是否饮酒标准名称
    private String drinker_std;
    //饮酒年限标准名称
    private String year_of_drink_std;
    //饮酒年限标准单位
    private String year_of_drink_unit_std;
    //饮酒类型1
    private String drink_type1_std;
    //饮酒量1
    private String consumption_drink1_std;
    //饮酒量单位1
    private String consumption_drink_unit1_std;
    //饮酒频次1
    private String drink_freq1_std;
    //饮酒频次单位1
    private String drink_freq_unit1_std;
    //饮酒类型2
    private String drink_type2_std;
    //饮酒量2
    private String consumption_drink2_std;
    //饮酒量单位2
    private String consumption_drink_unit2_std;
    //饮酒频次2
    private String drink_freq2_std;
    //饮酒频次单位2
    private String drink_freq_unit2_std;
    //是否戒酒标准名称
    private String drink_quitter_std;
    //戒酒年限标准名称
    private String year_of_drink_q_std;
    //戒酒年限标准单位
    private String year_of_drink_q_unit_std;
    //是否吸烟标准名称
    private String smoker_std;
    //吸烟年限标准名称
    private String year_of_smoke_std;
    //吸烟年限标准单位
    private String year_of_smoke_unit_std;
    //吸烟类型
    private String smoke_type_std;
    //吸烟量
    private String consumption_smoke_std;
    //吸烟量单位
    private String consumption_smoke_unit_std;
    //吸烟频次
    private String smoke_freq_std;
    //吸烟频次单位
    private String smoke_freq_unit_std;
    //是否戒烟标准名称
    private String smoke_quitter_std;
    //戒烟年限标准名称
    private String year_of_smoke_q_std;
    //戒烟年限标准单位
    private String year_of_smoke_q_unit_std;

    public Integer getseq_id(){
        return seq_id;
    } 
    public void setseq_id(Integer seq_id) {
             this.seq_id = seq_id;
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
    public String getrecord_status(){
        return record_status;
    } 
    public void setrecord_status(String record_status) {
             this.record_status = record_status;
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
    public String getdrinker(){
        return drinker;
    } 
    public void setdrinker(String drinker) {
             this.drinker = drinker;
    } 
    public String getyear_of_drink(){
        return year_of_drink;
    } 
    public void setyear_of_drink(String year_of_drink) {
             this.year_of_drink = year_of_drink;
    } 
    public String getdrink_date_time(){
        return drink_date_time;
    } 
    public void setdrink_date_time(String drink_date_time) {
             this.drink_date_time = drink_date_time;
    } 
    public String getconsumption_drink(){
        return consumption_drink;
    } 
    public void setconsumption_drink(String consumption_drink) {
             this.consumption_drink = consumption_drink;
    } 
    public String getdrink_quitter(){
        return drink_quitter;
    } 
    public void setdrink_quitter(String drink_quitter) {
             this.drink_quitter = drink_quitter;
    } 
    public String getyear_of_drink_quitting(){
        return year_of_drink_quitting;
    } 
    public void setyear_of_drink_quitting(String year_of_drink_quitting) {
             this.year_of_drink_quitting = year_of_drink_quitting;
    } 
    public String getdrink_q_date_time(){
        return drink_q_date_time;
    } 
    public void setdrink_q_date_time(String drink_q_date_time) {
             this.drink_q_date_time = drink_q_date_time;
    } 
    public String getsmoker(){
        return smoker;
    } 
    public void setsmoker(String smoker) {
             this.smoker = smoker;
    } 
    public String getyear_of_smoke(){
        return year_of_smoke;
    } 
    public void setyear_of_smoke(String year_of_smoke) {
             this.year_of_smoke = year_of_smoke;
    } 
    public String getsmoke_date_time(){
        return smoke_date_time;
    } 
    public void setsmoke_date_time(String smoke_date_time) {
             this.smoke_date_time = smoke_date_time;
    } 
    public String getconsumption_smoke(){
        return consumption_smoke;
    } 
    public void setconsumption_smoke(String consumption_smoke) {
             this.consumption_smoke = consumption_smoke;
    } 
    public String getsmoke_quitter(){
        return smoke_quitter;
    } 
    public void setsmoke_quitter(String smoke_quitter) {
             this.smoke_quitter = smoke_quitter;
    } 
    public String getyear_of_smoke_quitting(){
        return year_of_smoke_quitting;
    } 
    public void setyear_of_smoke_quitting(String year_of_smoke_quitting) {
             this.year_of_smoke_quitting = year_of_smoke_quitting;
    } 
    public String getsmoke_q_date_time(){
        return smoke_q_date_time;
    } 
    public void setsmoke_q_date_time(String smoke_q_date_time) {
             this.smoke_q_date_time = smoke_q_date_time;
    } 
    public String getfs_nlp(){
        return fs_nlp;
    } 
    public void setfs_nlp(String fs_nlp) {
             this.fs_nlp = fs_nlp;
    } 
    public String getfs_nlp_cn(){
        return fs_nlp_cn;
    } 
    public void setfs_nlp_cn(String fs_nlp_cn) {
             this.fs_nlp_cn = fs_nlp_cn;
    } 
    public Integer getfs_serial_number(){
        return fs_serial_number;
    } 
    public void setfs_serial_number(Integer fs_serial_number) {
             this.fs_serial_number = fs_serial_number;
    } 
    public Integer getfs_location_smoke(){
        return fs_location_smoke;
    } 
    public void setfs_location_smoke(Integer fs_location_smoke) {
             this.fs_location_smoke = fs_location_smoke;
    } 
    public Integer getfs_location_smoke_q(){
        return fs_location_smoke_q;
    } 
    public void setfs_location_smoke_q(Integer fs_location_smoke_q) {
             this.fs_location_smoke_q = fs_location_smoke_q;
    } 
    public Integer getfs_location_drink(){
        return fs_location_drink;
    } 
    public void setfs_location_drink(Integer fs_location_drink) {
             this.fs_location_drink = fs_location_drink;
    } 
    public Integer getfs_location_drink_q(){
        return fs_location_drink_q;
    } 
    public void setfs_location_drink_q(Integer fs_location_drink_q) {
             this.fs_location_drink_q = fs_location_drink_q;
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
    public String getdata_table_source_cn(){
        return data_table_source_cn;
    } 
    public void setdata_table_source_cn(String data_table_source_cn) {
             this.data_table_source_cn = data_table_source_cn;
    } 
    public String getdata_field_source(){
        return data_field_source;
    } 
    public void setdata_field_source(String data_field_source) {
             this.data_field_source = data_field_source;
    } 
    public Date getcreate_time(){
        return create_time;
    } 
    public void setcreate_time(Date create_time) {
             this.create_time = create_time;
    } 
    public String getcreator(){
        return creator;
    } 
    public void setcreator(String creator) {
             this.creator = creator;
    } 
    public Date getrecord_time(){
        return record_time;
    } 
    public void setrecord_time(Date record_time) {
             this.record_time = record_time;
    } 
    public String getbatch_number(){
        return batch_number;
    } 
    public void setbatch_number(String batch_number) {
             this.batch_number = batch_number;
    } 
    public Date getdrink_date_time_p(){
        return drink_date_time_p;
    } 
    public void setdrink_date_time_p(Date drink_date_time_p) {
             this.drink_date_time_p = drink_date_time_p;
    } 
    public Date getdrink_date_time_estimate(){
        return drink_date_time_estimate;
    } 
    public void setdrink_date_time_estimate(Date drink_date_time_estimate) {
             this.drink_date_time_estimate = drink_date_time_estimate;
    } 
    public Date getdrink_q_date_time_p(){
        return drink_q_date_time_p;
    } 
    public void setdrink_q_date_time_p(Date drink_q_date_time_p) {
             this.drink_q_date_time_p = drink_q_date_time_p;
    } 
    public Date getdrink_q_date_time_estimate(){
        return drink_q_date_time_estimate;
    } 
    public void setdrink_q_date_time_estimate(Date drink_q_date_time_estimate) {
             this.drink_q_date_time_estimate = drink_q_date_time_estimate;
    } 
    public Date getsmoke_date_time_p(){
        return smoke_date_time_p;
    } 
    public void setsmoke_date_time_p(Date smoke_date_time_p) {
             this.smoke_date_time_p = smoke_date_time_p;
    } 
    public Date getsmoke_date_time_estimate(){
        return smoke_date_time_estimate;
    } 
    public void setsmoke_date_time_estimate(Date smoke_date_time_estimate) {
             this.smoke_date_time_estimate = smoke_date_time_estimate;
    } 
    public Date getsmoke_q_date_time_p(){
        return smoke_q_date_time_p;
    } 
    public void setsmoke_q_date_time_p(Date smoke_q_date_time_p) {
             this.smoke_q_date_time_p = smoke_q_date_time_p;
    } 
    public Date getsmoke_q_date_time_estimate(){
        return smoke_q_date_time_estimate;
    } 
    public void setsmoke_q_date_time_estimate(Date smoke_q_date_time_estimate) {
             this.smoke_q_date_time_estimate = smoke_q_date_time_estimate;
    } 
    public String getdrinker_std(){
        return drinker_std;
    } 
    public void setdrinker_std(String drinker_std) {
         if("无效".equals(drinker_std)){
             this.drinker_std =""; 
         }else{
             this.drinker_std = drinker_std;
         }
    } 
    public String getyear_of_drink_std(){
        return year_of_drink_std;
    } 
    public void setyear_of_drink_std(String year_of_drink_std) {
         if("无效".equals(year_of_drink_std)){
             this.year_of_drink_std =""; 
         }else{
             this.year_of_drink_std = year_of_drink_std;
         }
    } 
    public String getyear_of_drink_unit_std(){
        return year_of_drink_unit_std;
    } 
    public void setyear_of_drink_unit_std(String year_of_drink_unit_std) {
         if("无效".equals(year_of_drink_unit_std)){
             this.year_of_drink_unit_std =""; 
         }else{
             this.year_of_drink_unit_std = year_of_drink_unit_std;
         }
    } 
    public String getdrink_type1_std(){
        return drink_type1_std;
    } 
    public void setdrink_type1_std(String drink_type1_std) {
         if("无效".equals(drink_type1_std)){
             this.drink_type1_std =""; 
         }else{
             this.drink_type1_std = drink_type1_std;
         }
    } 
    public String getconsumption_drink1_std(){
        return consumption_drink1_std;
    } 
    public void setconsumption_drink1_std(String consumption_drink1_std) {
         if("无效".equals(consumption_drink1_std)){
             this.consumption_drink1_std =""; 
         }else{
             this.consumption_drink1_std = consumption_drink1_std;
         }
    } 
    public String getconsumption_drink_unit1_std(){
        return consumption_drink_unit1_std;
    } 
    public void setconsumption_drink_unit1_std(String consumption_drink_unit1_std) {
         if("无效".equals(consumption_drink_unit1_std)){
             this.consumption_drink_unit1_std =""; 
         }else{
             this.consumption_drink_unit1_std = consumption_drink_unit1_std;
         }
    } 
    public String getdrink_freq1_std(){
        return drink_freq1_std;
    } 
    public void setdrink_freq1_std(String drink_freq1_std) {
         if("无效".equals(drink_freq1_std)){
             this.drink_freq1_std =""; 
         }else{
             this.drink_freq1_std = drink_freq1_std;
         }
    } 
    public String getdrink_freq_unit1_std(){
        return drink_freq_unit1_std;
    } 
    public void setdrink_freq_unit1_std(String drink_freq_unit1_std) {
         if("无效".equals(drink_freq_unit1_std)){
             this.drink_freq_unit1_std =""; 
         }else{
             this.drink_freq_unit1_std = drink_freq_unit1_std;
         }
    } 
    public String getdrink_type2_std(){
        return drink_type2_std;
    } 
    public void setdrink_type2_std(String drink_type2_std) {
         if("无效".equals(drink_type2_std)){
             this.drink_type2_std =""; 
         }else{
             this.drink_type2_std = drink_type2_std;
         }
    } 
    public String getconsumption_drink2_std(){
        return consumption_drink2_std;
    } 
    public void setconsumption_drink2_std(String consumption_drink2_std) {
         if("无效".equals(consumption_drink2_std)){
             this.consumption_drink2_std =""; 
         }else{
             this.consumption_drink2_std = consumption_drink2_std;
         }
    } 
    public String getconsumption_drink_unit2_std(){
        return consumption_drink_unit2_std;
    } 
    public void setconsumption_drink_unit2_std(String consumption_drink_unit2_std) {
         if("无效".equals(consumption_drink_unit2_std)){
             this.consumption_drink_unit2_std =""; 
         }else{
             this.consumption_drink_unit2_std = consumption_drink_unit2_std;
         }
    } 
    public String getdrink_freq2_std(){
        return drink_freq2_std;
    } 
    public void setdrink_freq2_std(String drink_freq2_std) {
         if("无效".equals(drink_freq2_std)){
             this.drink_freq2_std =""; 
         }else{
             this.drink_freq2_std = drink_freq2_std;
         }
    } 
    public String getdrink_freq_unit2_std(){
        return drink_freq_unit2_std;
    } 
    public void setdrink_freq_unit2_std(String drink_freq_unit2_std) {
         if("无效".equals(drink_freq_unit2_std)){
             this.drink_freq_unit2_std =""; 
         }else{
             this.drink_freq_unit2_std = drink_freq_unit2_std;
         }
    } 
    public String getdrink_quitter_std(){
        return drink_quitter_std;
    } 
    public void setdrink_quitter_std(String drink_quitter_std) {
         if("无效".equals(drink_quitter_std)){
             this.drink_quitter_std =""; 
         }else{
             this.drink_quitter_std = drink_quitter_std;
         }
    } 
    public String getyear_of_drink_q_std(){
        return year_of_drink_q_std;
    } 
    public void setyear_of_drink_q_std(String year_of_drink_q_std) {
         if("无效".equals(year_of_drink_q_std)){
             this.year_of_drink_q_std =""; 
         }else{
             this.year_of_drink_q_std = year_of_drink_q_std;
         }
    } 
    public String getyear_of_drink_q_unit_std(){
        return year_of_drink_q_unit_std;
    } 
    public void setyear_of_drink_q_unit_std(String year_of_drink_q_unit_std) {
         if("无效".equals(year_of_drink_q_unit_std)){
             this.year_of_drink_q_unit_std =""; 
         }else{
             this.year_of_drink_q_unit_std = year_of_drink_q_unit_std;
         }
    } 
    public String getsmoker_std(){
        return smoker_std;
    } 
    public void setsmoker_std(String smoker_std) {
         if("无效".equals(smoker_std)){
             this.smoker_std =""; 
         }else{
             this.smoker_std = smoker_std;
         }
    } 
    public String getyear_of_smoke_std(){
        return year_of_smoke_std;
    } 
    public void setyear_of_smoke_std(String year_of_smoke_std) {
         if("无效".equals(year_of_smoke_std)){
             this.year_of_smoke_std =""; 
         }else{
             this.year_of_smoke_std = year_of_smoke_std;
         }
    } 
    public String getyear_of_smoke_unit_std(){
        return year_of_smoke_unit_std;
    } 
    public void setyear_of_smoke_unit_std(String year_of_smoke_unit_std) {
         if("无效".equals(year_of_smoke_unit_std)){
             this.year_of_smoke_unit_std =""; 
         }else{
             this.year_of_smoke_unit_std = year_of_smoke_unit_std;
         }
    } 
    public String getsmoke_type_std(){
        return smoke_type_std;
    } 
    public void setsmoke_type_std(String smoke_type_std) {
         if("无效".equals(smoke_type_std)){
             this.smoke_type_std =""; 
         }else{
             this.smoke_type_std = smoke_type_std;
         }
    } 
    public String getconsumption_smoke_std(){
        return consumption_smoke_std;
    } 
    public void setconsumption_smoke_std(String consumption_smoke_std) {
         if("无效".equals(consumption_smoke_std)){
             this.consumption_smoke_std =""; 
         }else{
             this.consumption_smoke_std = consumption_smoke_std;
         }
    } 
    public String getconsumption_smoke_unit_std(){
        return consumption_smoke_unit_std;
    } 
    public void setconsumption_smoke_unit_std(String consumption_smoke_unit_std) {
         if("无效".equals(consumption_smoke_unit_std)){
             this.consumption_smoke_unit_std =""; 
         }else{
             this.consumption_smoke_unit_std = consumption_smoke_unit_std;
         }
    } 
    public String getsmoke_freq_std(){
        return smoke_freq_std;
    } 
    public void setsmoke_freq_std(String smoke_freq_std) {
         if("无效".equals(smoke_freq_std)){
             this.smoke_freq_std =""; 
         }else{
             this.smoke_freq_std = smoke_freq_std;
         }
    } 
    public String getsmoke_freq_unit_std(){
        return smoke_freq_unit_std;
    } 
    public void setsmoke_freq_unit_std(String smoke_freq_unit_std) {
         if("无效".equals(smoke_freq_unit_std)){
             this.smoke_freq_unit_std =""; 
         }else{
             this.smoke_freq_unit_std = smoke_freq_unit_std;
         }
    } 
    public String getsmoke_quitter_std(){
        return smoke_quitter_std;
    } 
    public void setsmoke_quitter_std(String smoke_quitter_std) {
         if("无效".equals(smoke_quitter_std)){
             this.smoke_quitter_std =""; 
         }else{
             this.smoke_quitter_std = smoke_quitter_std;
         }
    } 
    public String getyear_of_smoke_q_std(){
        return year_of_smoke_q_std;
    } 
    public void setyear_of_smoke_q_std(String year_of_smoke_q_std) {
         if("无效".equals(year_of_smoke_q_std)){
             this.year_of_smoke_q_std =""; 
         }else{
             this.year_of_smoke_q_std = year_of_smoke_q_std;
         }
    } 
    public String getyear_of_smoke_q_unit_std(){
        return year_of_smoke_q_unit_std;
    } 
    public void setyear_of_smoke_q_unit_std(String year_of_smoke_q_unit_std) {
         if("无效".equals(year_of_smoke_q_unit_std)){
             this.year_of_smoke_q_unit_std =""; 
         }else{
             this.year_of_smoke_q_unit_std = year_of_smoke_q_unit_std;
         }
    } 
}