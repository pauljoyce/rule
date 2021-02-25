package com.clinical.model.master;
import java.util.Date;
public class SURGERY_LN_BLOOD{
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
    //淋巴结
    private String ln;
    //清扫
    private String ln_dissection;
    //否定词
    private String neg;
    //输血
    private String transfusion_entity;
    //输液
    private String fluid_entity;
    //出血
    private String bleeding_entity;
    //值
    private String para_value;
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
    //出血-标准名称
    private String bleeding_entity_std;
    //输液-标准名称
    private String fluid_entity_std;
    //清扫-标准名称
    private String ln_dissection_std;
    //否定词-标准名称
    private String neg_std;
    //值-标准名称
    private String para_value_std;
    //值-标准单位
    private String para_value_unit_std;
    //输血-标准名称
    private String transfusion_entity_std;
    //输血-输血成分1
    private String transfusion_type1_std;
    //输血-输血成分2
    private String transfusion_type2_std;
    //淋巴结-淋巴结1
    private String ln1_std;
    //淋巴结-部位1
    private String ln_site1_std;
    //淋巴结-分组1
    private String ln_group1_std;
    //淋巴结-分站1
    private String ln_station1_std;
    //淋巴结-淋巴结2
    private String ln2_std;
    //淋巴结-部位2
    private String ln_site2_std;
    //淋巴结-分组2
    private String ln_group2_std;
    //淋巴结-分站2
    private String ln_station2_std;
    //淋巴结-淋巴结3
    private String ln3_std;
    //淋巴结-部位3
    private String ln_site3_std;
    //淋巴结-分组3
    private String ln_group3_std;
    //淋巴结-分站3
    private String ln_station3_std;
    //淋巴结-淋巴结4
    private String ln4_std;
    //淋巴结-部位4
    private String ln_site4_std;
    //淋巴结-分组4
    private String ln_group4_std;
    //淋巴结-分站4
    private String ln_station4_std;
    //淋巴结-淋巴结5
    private String ln5_std;
    //淋巴结-部位5
    private String ln_site5_std;
    //淋巴结-分组5
    private String ln_group5_std;
    //淋巴结-分站5
    private String ln_station5_std;
    //淋巴结-淋巴结6
    private String ln6_std;
    //淋巴结-部位6
    private String ln_site6_std;
    //淋巴结-分组6
    private String ln_group6_std;
    //淋巴结-分站6
    private String ln_station6_std;
    //淋巴结-淋巴结7
    private String ln7_std;
    //淋巴结-部位7
    private String ln_site7_std;
    //淋巴结-分组7
    private String ln_group7_std;
    //淋巴结-分站7
    private String ln_station7_std;
    //淋巴结-淋巴结8
    private String ln8_std;
    //淋巴结-部位8
    private String ln_site8_std;
    //淋巴结-分组8
    private String ln_group8_std;
    //淋巴结-分站8
    private String ln_station8_std;
    //淋巴结-淋巴结9
    private String ln9_std;
    //淋巴结-部位9
    private String ln_site9_std;
    //淋巴结-分组9
    private String ln_group9_std;
    //淋巴结-分站9
    private String ln_station9_std;
    //淋巴结-淋巴结10
    private String ln10_std;
    //淋巴结-部位10
    private String ln_site10_std;
    //淋巴结-分组10
    private String ln_group10_std;
    //淋巴结-分站10
    private String ln_station10_std;
    //淋巴结-淋巴结11
    private String ln11_std;
    //淋巴结-部位11
    private String ln_site11_std;
    //淋巴结-分组11
    private String ln_group11_std;
    //淋巴结-分站11
    private String ln_station11_std;
    //淋巴结-淋巴结12
    private String ln12_std;
    //淋巴结-部位12
    private String ln_site12_std;
    //淋巴结-分组12
    private String ln_group12_std;
    //淋巴结-分站12
    private String ln_station12_std;
    //淋巴结-淋巴结13
    private String ln13_std;
    //淋巴结-部位13
    private String ln_site13_std;
    //淋巴结-分组13
    private String ln_group13_std;
    //淋巴结-分站13
    private String ln_station13_std;
    //淋巴结-淋巴结14
    private String ln14_std;
    //淋巴结-部位14
    private String ln_site14_std;
    //淋巴结-分组14
    private String ln_group14_std;
    //淋巴结-分站14
    private String ln_station14_std;
    //淋巴结-淋巴结15
    private String ln15_std;
    //淋巴结-部位15
    private String ln_site15_std;
    //淋巴结-分组15
    private String ln_group15_std;
    //淋巴结-分站15
    private String ln_station15_std;
    //淋巴结-淋巴结16
    private String ln16_std;
    //淋巴结-部位16
    private String ln_site16_std;
    //淋巴结-分组16
    private String ln_group16_std;
    //淋巴结-分站16
    private String ln_station16_std;
    //淋巴结-淋巴结17
    private String ln17_std;
    //淋巴结-部位17
    private String ln_site17_std;
    //淋巴结-分组17
    private String ln_group17_std;

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
    public String getln(){
        return ln;
    } 
    public void setln(String ln) {
         this.ln = ln;
    } 
    public String getln_dissection(){
        return ln_dissection;
    } 
    public void setln_dissection(String ln_dissection) {
         this.ln_dissection = ln_dissection;
    } 
    public String getneg(){
        return neg;
    } 
    public void setneg(String neg) {
         this.neg = neg;
    } 
    public String gettransfusion_entity(){
        return transfusion_entity;
    } 
    public void settransfusion_entity(String transfusion_entity) {
         this.transfusion_entity = transfusion_entity;
    } 
    public String getfluid_entity(){
        return fluid_entity;
    } 
    public void setfluid_entity(String fluid_entity) {
         this.fluid_entity = fluid_entity;
    } 
    public String getbleeding_entity(){
        return bleeding_entity;
    } 
    public void setbleeding_entity(String bleeding_entity) {
         this.bleeding_entity = bleeding_entity;
    } 
    public String getpara_value(){
        return para_value;
    } 
    public void setpara_value(String para_value) {
         this.para_value = para_value;
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
    public String getbleeding_entity_std(){
        return bleeding_entity_std;
    } 
    public void setbleeding_entity_std(String bleeding_entity_std) {
         this.bleeding_entity_std = bleeding_entity_std;
    } 
    public String getfluid_entity_std(){
        return fluid_entity_std;
    } 
    public void setfluid_entity_std(String fluid_entity_std) {
         this.fluid_entity_std = fluid_entity_std;
    } 
    public String getln_dissection_std(){
        return ln_dissection_std;
    } 
    public void setln_dissection_std(String ln_dissection_std) {
         this.ln_dissection_std = ln_dissection_std;
    } 
    public String getneg_std(){
        return neg_std;
    } 
    public void setneg_std(String neg_std) {
         this.neg_std = neg_std;
    } 
    public String getpara_value_std(){
        return para_value_std;
    } 
    public void setpara_value_std(String para_value_std) {
         this.para_value_std = para_value_std;
    } 
    public String getpara_value_unit_std(){
        return para_value_unit_std;
    } 
    public void setpara_value_unit_std(String para_value_unit_std) {
         this.para_value_unit_std = para_value_unit_std;
    } 
    public String gettransfusion_entity_std(){
        return transfusion_entity_std;
    } 
    public void settransfusion_entity_std(String transfusion_entity_std) {
         this.transfusion_entity_std = transfusion_entity_std;
    } 
    public String gettransfusion_type1_std(){
        return transfusion_type1_std;
    } 
    public void settransfusion_type1_std(String transfusion_type1_std) {
         this.transfusion_type1_std = transfusion_type1_std;
    } 
    public String gettransfusion_type2_std(){
        return transfusion_type2_std;
    } 
    public void settransfusion_type2_std(String transfusion_type2_std) {
         this.transfusion_type2_std = transfusion_type2_std;
    } 
    public String getln1_std(){
        return ln1_std;
    } 
    public void setln1_std(String ln1_std) {
         this.ln1_std = ln1_std;
    } 
    public String getln_site1_std(){
        return ln_site1_std;
    } 
    public void setln_site1_std(String ln_site1_std) {
         this.ln_site1_std = ln_site1_std;
    } 
    public String getln_group1_std(){
        return ln_group1_std;
    } 
    public void setln_group1_std(String ln_group1_std) {
         this.ln_group1_std = ln_group1_std;
    } 
    public String getln_station1_std(){
        return ln_station1_std;
    } 
    public void setln_station1_std(String ln_station1_std) {
         this.ln_station1_std = ln_station1_std;
    } 
    public String getln2_std(){
        return ln2_std;
    } 
    public void setln2_std(String ln2_std) {
         this.ln2_std = ln2_std;
    } 
    public String getln_site2_std(){
        return ln_site2_std;
    } 
    public void setln_site2_std(String ln_site2_std) {
         this.ln_site2_std = ln_site2_std;
    } 
    public String getln_group2_std(){
        return ln_group2_std;
    } 
    public void setln_group2_std(String ln_group2_std) {
         this.ln_group2_std = ln_group2_std;
    } 
    public String getln_station2_std(){
        return ln_station2_std;
    } 
    public void setln_station2_std(String ln_station2_std) {
         this.ln_station2_std = ln_station2_std;
    } 
    public String getln3_std(){
        return ln3_std;
    } 
    public void setln3_std(String ln3_std) {
         this.ln3_std = ln3_std;
    } 
    public String getln_site3_std(){
        return ln_site3_std;
    } 
    public void setln_site3_std(String ln_site3_std) {
         this.ln_site3_std = ln_site3_std;
    } 
    public String getln_group3_std(){
        return ln_group3_std;
    } 
    public void setln_group3_std(String ln_group3_std) {
         this.ln_group3_std = ln_group3_std;
    } 
    public String getln_station3_std(){
        return ln_station3_std;
    } 
    public void setln_station3_std(String ln_station3_std) {
         this.ln_station3_std = ln_station3_std;
    } 
    public String getln4_std(){
        return ln4_std;
    } 
    public void setln4_std(String ln4_std) {
         this.ln4_std = ln4_std;
    } 
    public String getln_site4_std(){
        return ln_site4_std;
    } 
    public void setln_site4_std(String ln_site4_std) {
         this.ln_site4_std = ln_site4_std;
    } 
    public String getln_group4_std(){
        return ln_group4_std;
    } 
    public void setln_group4_std(String ln_group4_std) {
         this.ln_group4_std = ln_group4_std;
    } 
    public String getln_station4_std(){
        return ln_station4_std;
    } 
    public void setln_station4_std(String ln_station4_std) {
         this.ln_station4_std = ln_station4_std;
    } 
    public String getln5_std(){
        return ln5_std;
    } 
    public void setln5_std(String ln5_std) {
         this.ln5_std = ln5_std;
    } 
    public String getln_site5_std(){
        return ln_site5_std;
    } 
    public void setln_site5_std(String ln_site5_std) {
         this.ln_site5_std = ln_site5_std;
    } 
    public String getln_group5_std(){
        return ln_group5_std;
    } 
    public void setln_group5_std(String ln_group5_std) {
         this.ln_group5_std = ln_group5_std;
    } 
    public String getln_station5_std(){
        return ln_station5_std;
    } 
    public void setln_station5_std(String ln_station5_std) {
         this.ln_station5_std = ln_station5_std;
    } 
    public String getln6_std(){
        return ln6_std;
    } 
    public void setln6_std(String ln6_std) {
         this.ln6_std = ln6_std;
    } 
    public String getln_site6_std(){
        return ln_site6_std;
    } 
    public void setln_site6_std(String ln_site6_std) {
         this.ln_site6_std = ln_site6_std;
    } 
    public String getln_group6_std(){
        return ln_group6_std;
    } 
    public void setln_group6_std(String ln_group6_std) {
         this.ln_group6_std = ln_group6_std;
    } 
    public String getln_station6_std(){
        return ln_station6_std;
    } 
    public void setln_station6_std(String ln_station6_std) {
         this.ln_station6_std = ln_station6_std;
    } 
    public String getln7_std(){
        return ln7_std;
    } 
    public void setln7_std(String ln7_std) {
         this.ln7_std = ln7_std;
    } 
    public String getln_site7_std(){
        return ln_site7_std;
    } 
    public void setln_site7_std(String ln_site7_std) {
         this.ln_site7_std = ln_site7_std;
    } 
    public String getln_group7_std(){
        return ln_group7_std;
    } 
    public void setln_group7_std(String ln_group7_std) {
         this.ln_group7_std = ln_group7_std;
    } 
    public String getln_station7_std(){
        return ln_station7_std;
    } 
    public void setln_station7_std(String ln_station7_std) {
         this.ln_station7_std = ln_station7_std;
    } 
    public String getln8_std(){
        return ln8_std;
    } 
    public void setln8_std(String ln8_std) {
         this.ln8_std = ln8_std;
    } 
    public String getln_site8_std(){
        return ln_site8_std;
    } 
    public void setln_site8_std(String ln_site8_std) {
         this.ln_site8_std = ln_site8_std;
    } 
    public String getln_group8_std(){
        return ln_group8_std;
    } 
    public void setln_group8_std(String ln_group8_std) {
         this.ln_group8_std = ln_group8_std;
    } 
    public String getln_station8_std(){
        return ln_station8_std;
    } 
    public void setln_station8_std(String ln_station8_std) {
         this.ln_station8_std = ln_station8_std;
    } 
    public String getln9_std(){
        return ln9_std;
    } 
    public void setln9_std(String ln9_std) {
         this.ln9_std = ln9_std;
    } 
    public String getln_site9_std(){
        return ln_site9_std;
    } 
    public void setln_site9_std(String ln_site9_std) {
         this.ln_site9_std = ln_site9_std;
    } 
    public String getln_group9_std(){
        return ln_group9_std;
    } 
    public void setln_group9_std(String ln_group9_std) {
         this.ln_group9_std = ln_group9_std;
    } 
    public String getln_station9_std(){
        return ln_station9_std;
    } 
    public void setln_station9_std(String ln_station9_std) {
         this.ln_station9_std = ln_station9_std;
    } 
    public String getln10_std(){
        return ln10_std;
    } 
    public void setln10_std(String ln10_std) {
         this.ln10_std = ln10_std;
    } 
    public String getln_site10_std(){
        return ln_site10_std;
    } 
    public void setln_site10_std(String ln_site10_std) {
         this.ln_site10_std = ln_site10_std;
    } 
    public String getln_group10_std(){
        return ln_group10_std;
    } 
    public void setln_group10_std(String ln_group10_std) {
         this.ln_group10_std = ln_group10_std;
    } 
    public String getln_station10_std(){
        return ln_station10_std;
    } 
    public void setln_station10_std(String ln_station10_std) {
         this.ln_station10_std = ln_station10_std;
    } 
    public String getln11_std(){
        return ln11_std;
    } 
    public void setln11_std(String ln11_std) {
         this.ln11_std = ln11_std;
    } 
    public String getln_site11_std(){
        return ln_site11_std;
    } 
    public void setln_site11_std(String ln_site11_std) {
         this.ln_site11_std = ln_site11_std;
    } 
    public String getln_group11_std(){
        return ln_group11_std;
    } 
    public void setln_group11_std(String ln_group11_std) {
         this.ln_group11_std = ln_group11_std;
    } 
    public String getln_station11_std(){
        return ln_station11_std;
    } 
    public void setln_station11_std(String ln_station11_std) {
         this.ln_station11_std = ln_station11_std;
    } 
    public String getln12_std(){
        return ln12_std;
    } 
    public void setln12_std(String ln12_std) {
         this.ln12_std = ln12_std;
    } 
    public String getln_site12_std(){
        return ln_site12_std;
    } 
    public void setln_site12_std(String ln_site12_std) {
         this.ln_site12_std = ln_site12_std;
    } 
    public String getln_group12_std(){
        return ln_group12_std;
    } 
    public void setln_group12_std(String ln_group12_std) {
         this.ln_group12_std = ln_group12_std;
    } 
    public String getln_station12_std(){
        return ln_station12_std;
    } 
    public void setln_station12_std(String ln_station12_std) {
         this.ln_station12_std = ln_station12_std;
    } 
    public String getln13_std(){
        return ln13_std;
    } 
    public void setln13_std(String ln13_std) {
         this.ln13_std = ln13_std;
    } 
    public String getln_site13_std(){
        return ln_site13_std;
    } 
    public void setln_site13_std(String ln_site13_std) {
         this.ln_site13_std = ln_site13_std;
    } 
    public String getln_group13_std(){
        return ln_group13_std;
    } 
    public void setln_group13_std(String ln_group13_std) {
         this.ln_group13_std = ln_group13_std;
    } 
    public String getln_station13_std(){
        return ln_station13_std;
    } 
    public void setln_station13_std(String ln_station13_std) {
         this.ln_station13_std = ln_station13_std;
    } 
    public String getln14_std(){
        return ln14_std;
    } 
    public void setln14_std(String ln14_std) {
         this.ln14_std = ln14_std;
    } 
    public String getln_site14_std(){
        return ln_site14_std;
    } 
    public void setln_site14_std(String ln_site14_std) {
         this.ln_site14_std = ln_site14_std;
    } 
    public String getln_group14_std(){
        return ln_group14_std;
    } 
    public void setln_group14_std(String ln_group14_std) {
         this.ln_group14_std = ln_group14_std;
    } 
    public String getln_station14_std(){
        return ln_station14_std;
    } 
    public void setln_station14_std(String ln_station14_std) {
         this.ln_station14_std = ln_station14_std;
    } 
    public String getln15_std(){
        return ln15_std;
    } 
    public void setln15_std(String ln15_std) {
         this.ln15_std = ln15_std;
    } 
    public String getln_site15_std(){
        return ln_site15_std;
    } 
    public void setln_site15_std(String ln_site15_std) {
         this.ln_site15_std = ln_site15_std;
    } 
    public String getln_group15_std(){
        return ln_group15_std;
    } 
    public void setln_group15_std(String ln_group15_std) {
         this.ln_group15_std = ln_group15_std;
    } 
    public String getln_station15_std(){
        return ln_station15_std;
    } 
    public void setln_station15_std(String ln_station15_std) {
         this.ln_station15_std = ln_station15_std;
    } 
    public String getln16_std(){
        return ln16_std;
    } 
    public void setln16_std(String ln16_std) {
         this.ln16_std = ln16_std;
    } 
    public String getln_site16_std(){
        return ln_site16_std;
    } 
    public void setln_site16_std(String ln_site16_std) {
         this.ln_site16_std = ln_site16_std;
    } 
    public String getln_group16_std(){
        return ln_group16_std;
    } 
    public void setln_group16_std(String ln_group16_std) {
         this.ln_group16_std = ln_group16_std;
    } 
    public String getln_station16_std(){
        return ln_station16_std;
    } 
    public void setln_station16_std(String ln_station16_std) {
         this.ln_station16_std = ln_station16_std;
    } 
    public String getln17_std(){
        return ln17_std;
    } 
    public void setln17_std(String ln17_std) {
         this.ln17_std = ln17_std;
    } 
    public String getln_site17_std(){
        return ln_site17_std;
    } 
    public void setln_site17_std(String ln_site17_std) {
         this.ln_site17_std = ln_site17_std;
    } 
    public String getln_group17_std(){
        return ln_group17_std;
    } 
    public void setln_group17_std(String ln_group17_std) {
         this.ln_group17_std = ln_group17_std;
    } 
}