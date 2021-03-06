package com.clinical.model.master;
import java.util.Date;
public class CONCOMITANT_DISEASE{
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
    //否定词
    private String neg;
    //合并疾病名称
    private String diag_name;
    //合并疾病时长
    private String diag_length;
    //合并疾病时间点
    private String diag_date_time;
    //干预药物
    private String drug;
    //既往疾病信息字段来源
    private String fs_nlp;
    //既往疾病信息字段来源中文备注
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
    //合并疾病时间点精确时间
    private Date diag_date_time_p;
    //合并疾病时间点推测时间
    private Date diag_date_time_estimate;
    //标准化否定词
    private String neg_std;
    //标准化疾病名称1
    private String icd10_name1;
    //标准化疾病名称2
    private String icd10_name2;
    //标准化疾病名称3
    private String icd10_name3;
    //标准化疾病名称4
    private String icd10_name4;
    //标准化疾病名称5
    private String icd10_name5;
    //标准化疾病名称6
    private String icd10_name6;
    //标准化疾病名称7
    private String icd10_name7;
    //标准化疾病名称8
    private String icd10_name8;
    //时长标准名称
    private String diag_length_std;
    //时长标准单位
    private String diag_length_unit_std;
    //标准化药品名称1
    private String drug1_std;
    //标准化药品名称2
    private String drug2_std;

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
    public String getneg(){
        return neg;
    } 
    public void setneg(String neg) {
         this.neg = neg;
    } 
    public String getdiag_name(){
        return diag_name;
    } 
    public void setdiag_name(String diag_name) {
         this.diag_name = diag_name;
    } 
    public String getdiag_length(){
        return diag_length;
    } 
    public void setdiag_length(String diag_length) {
         this.diag_length = diag_length;
    } 
    public String getdiag_date_time(){
        return diag_date_time;
    } 
    public void setdiag_date_time(String diag_date_time) {
         this.diag_date_time = diag_date_time;
    } 
    public String getdrug(){
        return drug;
    } 
    public void setdrug(String drug) {
         this.drug = drug;
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
    public Date getdiag_date_time_p(){
        return diag_date_time_p;
    } 
    public void setdiag_date_time_p(Date diag_date_time_p) {
         this.diag_date_time_p = diag_date_time_p;
    } 
    public Date getdiag_date_time_estimate(){
        return diag_date_time_estimate;
    } 
    public void setdiag_date_time_estimate(Date diag_date_time_estimate) {
         this.diag_date_time_estimate = diag_date_time_estimate;
    } 
    public String getneg_std(){
        return neg_std;
    } 
    public void setneg_std(String neg_std) {
         this.neg_std = neg_std;
    } 
    public String geticd10_name1(){
        return icd10_name1;
    } 
    public void seticd10_name1(String icd10_name1) {
         this.icd10_name1 = icd10_name1;
    } 
    public String geticd10_name2(){
        return icd10_name2;
    } 
    public void seticd10_name2(String icd10_name2) {
         this.icd10_name2 = icd10_name2;
    } 
    public String geticd10_name3(){
        return icd10_name3;
    } 
    public void seticd10_name3(String icd10_name3) {
         this.icd10_name3 = icd10_name3;
    } 
    public String geticd10_name4(){
        return icd10_name4;
    } 
    public void seticd10_name4(String icd10_name4) {
         this.icd10_name4 = icd10_name4;
    } 
    public String geticd10_name5(){
        return icd10_name5;
    } 
    public void seticd10_name5(String icd10_name5) {
         this.icd10_name5 = icd10_name5;
    } 
    public String geticd10_name6(){
        return icd10_name6;
    } 
    public void seticd10_name6(String icd10_name6) {
         this.icd10_name6 = icd10_name6;
    } 
    public String geticd10_name7(){
        return icd10_name7;
    } 
    public void seticd10_name7(String icd10_name7) {
         this.icd10_name7 = icd10_name7;
    } 
    public String geticd10_name8(){
        return icd10_name8;
    } 
    public void seticd10_name8(String icd10_name8) {
         this.icd10_name8 = icd10_name8;
    } 
    public String getdiag_length_std(){
        return diag_length_std;
    } 
    public void setdiag_length_std(String diag_length_std) {
         this.diag_length_std = diag_length_std;
    } 
    public String getdiag_length_unit_std(){
        return diag_length_unit_std;
    } 
    public void setdiag_length_unit_std(String diag_length_unit_std) {
         this.diag_length_unit_std = diag_length_unit_std;
    } 
    public String getdrug1_std(){
        return drug1_std;
    } 
    public void setdrug1_std(String drug1_std) {
         this.drug1_std = drug1_std;
    } 
    public String getdrug2_std(){
        return drug2_std;
    } 
    public void setdrug2_std(String drug2_std) {
         this.drug2_std = drug2_std;
    } 
}