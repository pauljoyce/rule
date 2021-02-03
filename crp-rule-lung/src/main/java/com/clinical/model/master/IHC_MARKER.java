package com.clinical.model.master;
import java.util.Date;
public class IHC_MARKER{
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
    //检测报告日期时间
    private String date_time;
    //检测方法
    private String test_method;
    //检测项目具体名称
    private String test_item_name;
    //具体检测结果
    private String test_item_value;
    //检测位点
    private String mutation_site;
    //否定词
    private String neg;
    //特别动作
    private String modifier;
    //检测信息字段来源
    private String fs_nlp;
    //检测信息字段来源中文备注
    private String fs_nlp_cn;
    //字段来源中的出现序号
    private Integer fs_serial_number;
    //中心实体所在起始位置
    private Integer fs_location;
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
    //检测报告日期精确时间
    private Date date_time_p;
    //检测报告日期推测时间
    private Date date_time_estimate;
    //否定词标准名称
    private String neg_std;
    //特别动作标准名称
    private String modifier_std;
    //检测方法标准名称
    private String test_method_std;
    //检测项目标准名称1
    private String test_item_name1_std;
    //检测项目标准名称2
    private String test_item_name2_std;
    //检测项目标准名称3
    private String test_item_name3_std;
    //具体检测结果定性
    private String test_item_value_rough_std;
    //具体检测结果定量
    private String test_item_value_precise_std;
    //具体检测结果性质
    private String test_item_value_nature_std;
    //检测位点标准名称1
    private String mutation_site1_std;
    //检测位点标准名称2
    private String mutation_site2_std;
    //检测位点标准名称3
    private String mutation_site3_std;

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
    public String getdate_time(){
        return date_time;
    } 
    public void setdate_time(String date_time) {
         this.date_time = date_time;
    } 
    public String gettest_method(){
        return test_method;
    } 
    public void settest_method(String test_method) {
         this.test_method = test_method;
    } 
    public String gettest_item_name(){
        return test_item_name;
    } 
    public void settest_item_name(String test_item_name) {
         this.test_item_name = test_item_name;
    } 
    public String gettest_item_value(){
        return test_item_value;
    } 
    public void settest_item_value(String test_item_value) {
         this.test_item_value = test_item_value;
    } 
    public String getmutation_site(){
        return mutation_site;
    } 
    public void setmutation_site(String mutation_site) {
         this.mutation_site = mutation_site;
    } 
    public String getneg(){
        return neg;
    } 
    public void setneg(String neg) {
         this.neg = neg;
    } 
    public String getmodifier(){
        return modifier;
    } 
    public void setmodifier(String modifier) {
         this.modifier = modifier;
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
    public Integer getfs_location(){
        return fs_location;
    } 
    public void setfs_location(Integer fs_location) {
         this.fs_location = fs_location;
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
    public Date getdate_time_p(){
        return date_time_p;
    } 
    public void setdate_time_p(Date date_time_p) {
         this.date_time_p = date_time_p;
    } 
    public Date getdate_time_estimate(){
        return date_time_estimate;
    } 
    public void setdate_time_estimate(Date date_time_estimate) {
         this.date_time_estimate = date_time_estimate;
    } 
    public String getneg_std(){
        return neg_std;
    } 
    public void setneg_std(String neg_std) {
         this.neg_std = neg_std;
    } 
    public String getmodifier_std(){
        return modifier_std;
    } 
    public void setmodifier_std(String modifier_std) {
         this.modifier_std = modifier_std;
    } 
    public String gettest_method_std(){
        return test_method_std;
    } 
    public void settest_method_std(String test_method_std) {
         this.test_method_std = test_method_std;
    } 
    public String gettest_item_name1_std(){
        return test_item_name1_std;
    } 
    public void settest_item_name1_std(String test_item_name1_std) {
         this.test_item_name1_std = test_item_name1_std;
    } 
    public String gettest_item_name2_std(){
        return test_item_name2_std;
    } 
    public void settest_item_name2_std(String test_item_name2_std) {
         this.test_item_name2_std = test_item_name2_std;
    } 
    public String gettest_item_name3_std(){
        return test_item_name3_std;
    } 
    public void settest_item_name3_std(String test_item_name3_std) {
         this.test_item_name3_std = test_item_name3_std;
    } 
    public String gettest_item_value_rough_std(){
        return test_item_value_rough_std;
    } 
    public void settest_item_value_rough_std(String test_item_value_rough_std) {
         this.test_item_value_rough_std = test_item_value_rough_std;
    } 
    public String gettest_item_value_precise_std(){
        return test_item_value_precise_std;
    } 
    public void settest_item_value_precise_std(String test_item_value_precise_std) {
         this.test_item_value_precise_std = test_item_value_precise_std;
    } 
    public String gettest_item_value_nature_std(){
        return test_item_value_nature_std;
    } 
    public void settest_item_value_nature_std(String test_item_value_nature_std) {
         this.test_item_value_nature_std = test_item_value_nature_std;
    } 
    public String getmutation_site1_std(){
        return mutation_site1_std;
    } 
    public void setmutation_site1_std(String mutation_site1_std) {
         this.mutation_site1_std = mutation_site1_std;
    } 
    public String getmutation_site2_std(){
        return mutation_site2_std;
    } 
    public void setmutation_site2_std(String mutation_site2_std) {
         this.mutation_site2_std = mutation_site2_std;
    } 
    public String getmutation_site3_std(){
        return mutation_site3_std;
    } 
    public void setmutation_site3_std(String mutation_site3_std) {
         this.mutation_site3_std = mutation_site3_std;
    } 
}