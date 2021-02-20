package com.clinical.model.master;
import java.util.Date;
public class SURGICAL_RECORD{
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
    //重建
    private String reconstruction;
    //重建方式
    private String reconstruction_method;
    //切口
    private String cut;
    //值
    private String para_value;
    //部位
    private String structure;
    //引流
    private String drain;
    //术中肠镜
    private String intraop_scope;
    //术中灌洗
    private String intraop_lavage;
    //术中化疗
    private String intraop_chemo;
    //术式
    private String op_method;
    //手术信息字段来源
    private String fs_nlp;
    //手术信息字段来源中文备注
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
    //数据表来源主键id
    private Integer source_id;
    //数据表来源md5标识
    private String md5;
    //重建标准名称id
    private String reconstruction_std;
    //重建方式标准名称id
    private String reconstruction_method_std;
    //切口标准名称id
    private String cut_std;
    //值标准名称id
    private String para_value_std;
    //部位标准名称id
    private String structure_std;
    //引流标准名称id
    private String drain_std;
    //术中肠镜标准名称id
    private String intraop_scope_std;
    //术中灌洗标准名称id
    private String intraop_lavage_std;
    //术中化疗标准名称id
    private String intraop_chemo_std;
    //术式标准名称id
    private String op_method_std;

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
    public String getreconstruction(){
        return reconstruction;
    } 
    public void setreconstruction(String reconstruction) {
         this.reconstruction = reconstruction;
    } 
    public String getreconstruction_method(){
        return reconstruction_method;
    } 
    public void setreconstruction_method(String reconstruction_method) {
         this.reconstruction_method = reconstruction_method;
    } 
    public String getcut(){
        return cut;
    } 
    public void setcut(String cut) {
         this.cut = cut;
    } 
    public String getpara_value(){
        return para_value;
    } 
    public void setpara_value(String para_value) {
         this.para_value = para_value;
    } 
    public String getstructure(){
        return structure;
    } 
    public void setstructure(String structure) {
         this.structure = structure;
    } 
    public String getdrain(){
        return drain;
    } 
    public void setdrain(String drain) {
         this.drain = drain;
    } 
    public String getintraop_scope(){
        return intraop_scope;
    } 
    public void setintraop_scope(String intraop_scope) {
         this.intraop_scope = intraop_scope;
    } 
    public String getintraop_lavage(){
        return intraop_lavage;
    } 
    public void setintraop_lavage(String intraop_lavage) {
         this.intraop_lavage = intraop_lavage;
    } 
    public String getintraop_chemo(){
        return intraop_chemo;
    } 
    public void setintraop_chemo(String intraop_chemo) {
         this.intraop_chemo = intraop_chemo;
    } 
    public String getop_method(){
        return op_method;
    } 
    public void setop_method(String op_method) {
         this.op_method = op_method;
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
    public Integer getsource_id(){
        return source_id;
    } 
    public void setsource_id(Integer source_id) {
         this.source_id = source_id;
    } 
    public String getmd5(){
        return md5;
    } 
    public void setmd5(String md5) {
         this.md5 = md5;
    } 
    public String getreconstruction_std(){
        return reconstruction_std;
    } 
    public void setreconstruction_std(String reconstruction_std) {
         this.reconstruction_std = reconstruction_std;
    } 
    public String getreconstruction_method_std(){
        return reconstruction_method_std;
    } 
    public void setreconstruction_method_std(String reconstruction_method_std) {
         this.reconstruction_method_std = reconstruction_method_std;
    } 
    public String getcut_std(){
        return cut_std;
    } 
    public void setcut_std(String cut_std) {
         this.cut_std = cut_std;
    } 
    public String getpara_value_std(){
        return para_value_std;
    } 
    public void setpara_value_std(String para_value_std) {
         this.para_value_std = para_value_std;
    } 
    public String getstructure_std(){
        return structure_std;
    } 
    public void setstructure_std(String structure_std) {
         this.structure_std = structure_std;
    } 
    public String getdrain_std(){
        return drain_std;
    } 
    public void setdrain_std(String drain_std) {
         this.drain_std = drain_std;
    } 
    public String getintraop_scope_std(){
        return intraop_scope_std;
    } 
    public void setintraop_scope_std(String intraop_scope_std) {
         this.intraop_scope_std = intraop_scope_std;
    } 
    public String getintraop_lavage_std(){
        return intraop_lavage_std;
    } 
    public void setintraop_lavage_std(String intraop_lavage_std) {
         this.intraop_lavage_std = intraop_lavage_std;
    } 
    public String getintraop_chemo_std(){
        return intraop_chemo_std;
    } 
    public void setintraop_chemo_std(String intraop_chemo_std) {
         this.intraop_chemo_std = intraop_chemo_std;
    } 
    public String getop_method_std(){
        return op_method_std;
    } 
    public void setop_method_std(String op_method_std) {
         this.op_method_std = op_method_std;
    } 
}