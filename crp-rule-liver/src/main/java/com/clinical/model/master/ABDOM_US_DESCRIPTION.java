package com.clinical.model.master;
import java.util.Date;
public class ABDOM_US_DESCRIPTION{
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
    //部位
    private String structure;
    //病灶
    private String lesion;
    //大小
    private String size;
    //数量
    private String quantity;
    //否定词
    private String neg;
    //检查所见信息字段来源
    private String fs_nlp;
    //检查所见信息字段来源中文备注
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
    //筛选条件
    private String screen_criteria;
    //部位-标准名称1
    private String structure1_std;
    //部位-标准部位1
    private String structure_site1_std;
    //部位-标准名称2
    private String structure2_std;
    //部位-标准部位2
    private String structure_site2_std;
    //部位-标准名称3
    private String structure3_std;
    //部位-标准部位3
    private String structure_site3_std;
    //部位-标准名称4
    private String structure4_std;
    //部位-标准部位4
    private String structure_site4_std;
    //病灶-标准名称
    private String lesion_std;
    //否定词-标准名称
    private String neg_std;
    //数量-标准名称
    private String quantity_std;
    //数量-标准单位
    private String quantity_unit_std;
    //大小-最大径1
    private Double size_max_diam1_std;
    //大小-中间径1
    private Double size_median_diam1_std;
    //大小-最小径1
    private Double size_min_diam1_std;
    //大小-单位1
    private String size_unit1_std;
    //大小-最大径2
    private Double size_max_diam2_std;
    //大小-中间径2
    private Double size_median_diam2_std;
    //大小-最小径2
    private Double size_min_diam2_std;
    //大小-单位2
    private String size_unit2_std;
    //大小-最大径3
    private Double size_max_diam3_std;
    //大小-中间径3
    private Double size_median_diam3_std;
    //大小-最小径3
    private Double size_min_diam3_std;
    //大小-单位3
    private String size_unit3_std;
    //大小-最大径4
    private Double size_max_diam4_std;
    //大小-最小径4
    private Double size_min_diam4_std;
    //大小-单位4
    private String size_unit4_std;
    //大小-最大径5
    private Double size_max_diam5_std;
    //大小-最小径5
    private Double size_min_diam5_std;
    //大小-单位5
    private String size_unit5_std;
    //大小-最大径6
    private Double size_max_diam6_std;
    //大小-最小径6
    private Double size_min_diam6_std;
    //大小-单位6
    private String size_unit6_std;
    //大小-最大径7
    private Double size_max_diam7_std;
    //大小-最小径7
    private Double size_min_diam7_std;
    //大小-单位7
    private String size_unit7_std;

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
    public String getstructure(){
        return structure;
    } 
    public void setstructure(String structure) {
             this.structure = structure;
    } 
    public String getlesion(){
        return lesion;
    } 
    public void setlesion(String lesion) {
             this.lesion = lesion;
    } 
    public String getsize(){
        return size;
    } 
    public void setsize(String size) {
             this.size = size;
    } 
    public String getquantity(){
        return quantity;
    } 
    public void setquantity(String quantity) {
             this.quantity = quantity;
    } 
    public String getneg(){
        return neg;
    } 
    public void setneg(String neg) {
             this.neg = neg;
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
    public String getscreen_criteria(){
        return screen_criteria;
    } 
    public void setscreen_criteria(String screen_criteria) {
             this.screen_criteria = screen_criteria;
    } 
    public String getstructure1_std(){
        return structure1_std;
    } 
    public void setstructure1_std(String structure1_std) {
         if("无效".equals(structure1_std)){
             this.structure1_std =""; 
         }else{
             this.structure1_std = structure1_std;
         }
    } 
    public String getstructure_site1_std(){
        return structure_site1_std;
    } 
    public void setstructure_site1_std(String structure_site1_std) {
         if("无效".equals(structure_site1_std)){
             this.structure_site1_std =""; 
         }else{
             this.structure_site1_std = structure_site1_std;
         }
    } 
    public String getstructure2_std(){
        return structure2_std;
    } 
    public void setstructure2_std(String structure2_std) {
         if("无效".equals(structure2_std)){
             this.structure2_std =""; 
         }else{
             this.structure2_std = structure2_std;
         }
    } 
    public String getstructure_site2_std(){
        return structure_site2_std;
    } 
    public void setstructure_site2_std(String structure_site2_std) {
         if("无效".equals(structure_site2_std)){
             this.structure_site2_std =""; 
         }else{
             this.structure_site2_std = structure_site2_std;
         }
    } 
    public String getstructure3_std(){
        return structure3_std;
    } 
    public void setstructure3_std(String structure3_std) {
         if("无效".equals(structure3_std)){
             this.structure3_std =""; 
         }else{
             this.structure3_std = structure3_std;
         }
    } 
    public String getstructure_site3_std(){
        return structure_site3_std;
    } 
    public void setstructure_site3_std(String structure_site3_std) {
         if("无效".equals(structure_site3_std)){
             this.structure_site3_std =""; 
         }else{
             this.structure_site3_std = structure_site3_std;
         }
    } 
    public String getstructure4_std(){
        return structure4_std;
    } 
    public void setstructure4_std(String structure4_std) {
         if("无效".equals(structure4_std)){
             this.structure4_std =""; 
         }else{
             this.structure4_std = structure4_std;
         }
    } 
    public String getstructure_site4_std(){
        return structure_site4_std;
    } 
    public void setstructure_site4_std(String structure_site4_std) {
         if("无效".equals(structure_site4_std)){
             this.structure_site4_std =""; 
         }else{
             this.structure_site4_std = structure_site4_std;
         }
    } 
    public String getlesion_std(){
        return lesion_std;
    } 
    public void setlesion_std(String lesion_std) {
         if("无效".equals(lesion_std)){
             this.lesion_std =""; 
         }else{
             this.lesion_std = lesion_std;
         }
    } 
    public String getneg_std(){
        return neg_std;
    } 
    public void setneg_std(String neg_std) {
         if("无效".equals(neg_std)){
             this.neg_std =""; 
         }else{
             this.neg_std = neg_std;
         }
    } 
    public String getquantity_std(){
        return quantity_std;
    } 
    public void setquantity_std(String quantity_std) {
         if("无效".equals(quantity_std)){
             this.quantity_std =""; 
         }else{
             this.quantity_std = quantity_std;
         }
    } 
    public String getquantity_unit_std(){
        return quantity_unit_std;
    } 
    public void setquantity_unit_std(String quantity_unit_std) {
         if("无效".equals(quantity_unit_std)){
             this.quantity_unit_std =""; 
         }else{
             this.quantity_unit_std = quantity_unit_std;
         }
    } 
    public Double getsize_max_diam1_std(){
        return size_max_diam1_std;
    } 
    public void setsize_max_diam1_std(Double size_max_diam1_std) {
             this.size_max_diam1_std = size_max_diam1_std;
    } 
    public Double getsize_median_diam1_std(){
        return size_median_diam1_std;
    } 
    public void setsize_median_diam1_std(Double size_median_diam1_std) {
             this.size_median_diam1_std = size_median_diam1_std;
    } 
    public Double getsize_min_diam1_std(){
        return size_min_diam1_std;
    } 
    public void setsize_min_diam1_std(Double size_min_diam1_std) {
             this.size_min_diam1_std = size_min_diam1_std;
    } 
    public String getsize_unit1_std(){
        return size_unit1_std;
    } 
    public void setsize_unit1_std(String size_unit1_std) {
         if("无效".equals(size_unit1_std)){
             this.size_unit1_std =""; 
         }else{
             this.size_unit1_std = size_unit1_std;
         }
    } 
    public Double getsize_max_diam2_std(){
        return size_max_diam2_std;
    } 
    public void setsize_max_diam2_std(Double size_max_diam2_std) {
             this.size_max_diam2_std = size_max_diam2_std;
    } 
    public Double getsize_median_diam2_std(){
        return size_median_diam2_std;
    } 
    public void setsize_median_diam2_std(Double size_median_diam2_std) {
             this.size_median_diam2_std = size_median_diam2_std;
    } 
    public Double getsize_min_diam2_std(){
        return size_min_diam2_std;
    } 
    public void setsize_min_diam2_std(Double size_min_diam2_std) {
             this.size_min_diam2_std = size_min_diam2_std;
    } 
    public String getsize_unit2_std(){
        return size_unit2_std;
    } 
    public void setsize_unit2_std(String size_unit2_std) {
         if("无效".equals(size_unit2_std)){
             this.size_unit2_std =""; 
         }else{
             this.size_unit2_std = size_unit2_std;
         }
    } 
    public Double getsize_max_diam3_std(){
        return size_max_diam3_std;
    } 
    public void setsize_max_diam3_std(Double size_max_diam3_std) {
             this.size_max_diam3_std = size_max_diam3_std;
    } 
    public Double getsize_median_diam3_std(){
        return size_median_diam3_std;
    } 
    public void setsize_median_diam3_std(Double size_median_diam3_std) {
             this.size_median_diam3_std = size_median_diam3_std;
    } 
    public Double getsize_min_diam3_std(){
        return size_min_diam3_std;
    } 
    public void setsize_min_diam3_std(Double size_min_diam3_std) {
             this.size_min_diam3_std = size_min_diam3_std;
    } 
    public String getsize_unit3_std(){
        return size_unit3_std;
    } 
    public void setsize_unit3_std(String size_unit3_std) {
         if("无效".equals(size_unit3_std)){
             this.size_unit3_std =""; 
         }else{
             this.size_unit3_std = size_unit3_std;
         }
    } 
    public Double getsize_max_diam4_std(){
        return size_max_diam4_std;
    } 
    public void setsize_max_diam4_std(Double size_max_diam4_std) {
             this.size_max_diam4_std = size_max_diam4_std;
    } 
    public Double getsize_min_diam4_std(){
        return size_min_diam4_std;
    } 
    public void setsize_min_diam4_std(Double size_min_diam4_std) {
             this.size_min_diam4_std = size_min_diam4_std;
    } 
    public String getsize_unit4_std(){
        return size_unit4_std;
    } 
    public void setsize_unit4_std(String size_unit4_std) {
         if("无效".equals(size_unit4_std)){
             this.size_unit4_std =""; 
         }else{
             this.size_unit4_std = size_unit4_std;
         }
    } 
    public Double getsize_max_diam5_std(){
        return size_max_diam5_std;
    } 
    public void setsize_max_diam5_std(Double size_max_diam5_std) {
             this.size_max_diam5_std = size_max_diam5_std;
    } 
    public Double getsize_min_diam5_std(){
        return size_min_diam5_std;
    } 
    public void setsize_min_diam5_std(Double size_min_diam5_std) {
             this.size_min_diam5_std = size_min_diam5_std;
    } 
    public String getsize_unit5_std(){
        return size_unit5_std;
    } 
    public void setsize_unit5_std(String size_unit5_std) {
         if("无效".equals(size_unit5_std)){
             this.size_unit5_std =""; 
         }else{
             this.size_unit5_std = size_unit5_std;
         }
    } 
    public Double getsize_max_diam6_std(){
        return size_max_diam6_std;
    } 
    public void setsize_max_diam6_std(Double size_max_diam6_std) {
             this.size_max_diam6_std = size_max_diam6_std;
    } 
    public Double getsize_min_diam6_std(){
        return size_min_diam6_std;
    } 
    public void setsize_min_diam6_std(Double size_min_diam6_std) {
             this.size_min_diam6_std = size_min_diam6_std;
    } 
    public String getsize_unit6_std(){
        return size_unit6_std;
    } 
    public void setsize_unit6_std(String size_unit6_std) {
         if("无效".equals(size_unit6_std)){
             this.size_unit6_std =""; 
         }else{
             this.size_unit6_std = size_unit6_std;
         }
    } 
    public Double getsize_max_diam7_std(){
        return size_max_diam7_std;
    } 
    public void setsize_max_diam7_std(Double size_max_diam7_std) {
             this.size_max_diam7_std = size_max_diam7_std;
    } 
    public Double getsize_min_diam7_std(){
        return size_min_diam7_std;
    } 
    public void setsize_min_diam7_std(Double size_min_diam7_std) {
             this.size_min_diam7_std = size_min_diam7_std;
    } 
    public String getsize_unit7_std(){
        return size_unit7_std;
    } 
    public void setsize_unit7_std(String size_unit7_std) {
         if("无效".equals(size_unit7_std)){
             this.size_unit7_std =""; 
         }else{
             this.size_unit7_std = size_unit7_std;
         }
    } 
}