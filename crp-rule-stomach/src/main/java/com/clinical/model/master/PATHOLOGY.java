package com.clinical.model.master;
import java.util.Date;
public class PATHOLOGY{
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
    //送检物
    private String structure;
    //分型分化
    private String feature;
    //Lauren分型
    private String lauren_type;
    //浸润
    private String invasion;
    //否定词
    private String neg;
    //特别动作
    private String modifier;
    //结果
    private String finding;
    //病理检查信息字段来源
    private String fs_nlp;
    //病理检查信息字段来源中文备注
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
    //标准部位1
    private String structure_sub_site1_std;
    //标准结构1
    private String structure_site1_std;
    //送检物1
    private String structure_type1_std;
    //标准部位2
    private String structure_sub_site2_std;
    //标准结构2
    private String structure_site2_std;
    //送检物2
    private String structure_type2_std;
    //标准部位3
    private String structure_sub_site3_std;
    //标准结构3
    private String structure_site3_std;
    //送检物3
    private String structure_type3_std;
    //病理分型1
    private String feature_type1_std;
    //大体分型1
    private String feature_gross_type1_std;
    //分化程度1
    private String feature_differ1_std;
    //病理分型2
    private String feature_type2_std;
    //大体分型2
    private String feature_gross_type2_std;
    //分化程度2
    private String feature_differ2_std;
    //结果-标准部位1
    private String finding_site1_std;
    //结果-标准结果1
    private String finding_result1_std;
    //结果-标准性质1
    private String finding_nature1_std;
    //结果-标准部位2
    private String finding_site2_std;
    //结果-标准结果2
    private String finding_result2_std;
    //结果-标准性质2
    private String finding_nature2_std;
    //浸润-扩散方式1
    private String invasion1_std;
    //浸润-层级1
    private String invasion_layer1_std;
    //浸润-结构1
    private String invasion_structure1_std;
    //浸润-部位1
    private String invasion_site1_std;
    //浸润-扩散方式2
    private String invasion2_std;
    //浸润-层级2
    private String invasion_layer2_std;
    //浸润-结构2
    private String invasion_structure2_std;
    //浸润-部位2
    private String invasion_site2_std;
    //浸润-扩散方式3
    private String invasion3_std;
    //浸润-层级3
    private String invasion_layer3_std;
    //浸润-结构3
    private String invasion_structure3_std;
    //浸润-部位3
    private String invasion_site3_std;
    //浸润-扩散方式4
    private String invasion4_std;
    //浸润-层级4
    private String invasion_layer4_std;
    //浸润-结构4
    private String invasion_structure4_std;
    //浸润-部位4
    private String invasion_site4_std;
    //否定词-标准名称
    private String neg_std;
    //特别动作-标准名称
    private String modifier_std;
    //Lauren分型-标准名称
    private String lauren_type_std;

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
    public String getfeature(){
        return feature;
    } 
    public void setfeature(String feature) {
         this.feature = feature;
    } 
    public String getlauren_type(){
        return lauren_type;
    } 
    public void setlauren_type(String lauren_type) {
         this.lauren_type = lauren_type;
    } 
    public String getinvasion(){
        return invasion;
    } 
    public void setinvasion(String invasion) {
         this.invasion = invasion;
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
    public String getfinding(){
        return finding;
    } 
    public void setfinding(String finding) {
         this.finding = finding;
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
    public String getstructure_sub_site1_std(){
        return structure_sub_site1_std;
    } 
    public void setstructure_sub_site1_std(String structure_sub_site1_std) {
         this.structure_sub_site1_std = structure_sub_site1_std;
    } 
    public String getstructure_site1_std(){
        return structure_site1_std;
    } 
    public void setstructure_site1_std(String structure_site1_std) {
         this.structure_site1_std = structure_site1_std;
    } 
    public String getstructure_type1_std(){
        return structure_type1_std;
    } 
    public void setstructure_type1_std(String structure_type1_std) {
         this.structure_type1_std = structure_type1_std;
    } 
    public String getstructure_sub_site2_std(){
        return structure_sub_site2_std;
    } 
    public void setstructure_sub_site2_std(String structure_sub_site2_std) {
         this.structure_sub_site2_std = structure_sub_site2_std;
    } 
    public String getstructure_site2_std(){
        return structure_site2_std;
    } 
    public void setstructure_site2_std(String structure_site2_std) {
         this.structure_site2_std = structure_site2_std;
    } 
    public String getstructure_type2_std(){
        return structure_type2_std;
    } 
    public void setstructure_type2_std(String structure_type2_std) {
         this.structure_type2_std = structure_type2_std;
    } 
    public String getstructure_sub_site3_std(){
        return structure_sub_site3_std;
    } 
    public void setstructure_sub_site3_std(String structure_sub_site3_std) {
         this.structure_sub_site3_std = structure_sub_site3_std;
    } 
    public String getstructure_site3_std(){
        return structure_site3_std;
    } 
    public void setstructure_site3_std(String structure_site3_std) {
         this.structure_site3_std = structure_site3_std;
    } 
    public String getstructure_type3_std(){
        return structure_type3_std;
    } 
    public void setstructure_type3_std(String structure_type3_std) {
         this.structure_type3_std = structure_type3_std;
    } 
    public String getfeature_type1_std(){
        return feature_type1_std;
    } 
    public void setfeature_type1_std(String feature_type1_std) {
         this.feature_type1_std = feature_type1_std;
    } 
    public String getfeature_gross_type1_std(){
        return feature_gross_type1_std;
    } 
    public void setfeature_gross_type1_std(String feature_gross_type1_std) {
         this.feature_gross_type1_std = feature_gross_type1_std;
    } 
    public String getfeature_differ1_std(){
        return feature_differ1_std;
    } 
    public void setfeature_differ1_std(String feature_differ1_std) {
         this.feature_differ1_std = feature_differ1_std;
    } 
    public String getfeature_type2_std(){
        return feature_type2_std;
    } 
    public void setfeature_type2_std(String feature_type2_std) {
         this.feature_type2_std = feature_type2_std;
    } 
    public String getfeature_gross_type2_std(){
        return feature_gross_type2_std;
    } 
    public void setfeature_gross_type2_std(String feature_gross_type2_std) {
         this.feature_gross_type2_std = feature_gross_type2_std;
    } 
    public String getfeature_differ2_std(){
        return feature_differ2_std;
    } 
    public void setfeature_differ2_std(String feature_differ2_std) {
         this.feature_differ2_std = feature_differ2_std;
    } 
    public String getfinding_site1_std(){
        return finding_site1_std;
    } 
    public void setfinding_site1_std(String finding_site1_std) {
         this.finding_site1_std = finding_site1_std;
    } 
    public String getfinding_result1_std(){
        return finding_result1_std;
    } 
    public void setfinding_result1_std(String finding_result1_std) {
         this.finding_result1_std = finding_result1_std;
    } 
    public String getfinding_nature1_std(){
        return finding_nature1_std;
    } 
    public void setfinding_nature1_std(String finding_nature1_std) {
         this.finding_nature1_std = finding_nature1_std;
    } 
    public String getfinding_site2_std(){
        return finding_site2_std;
    } 
    public void setfinding_site2_std(String finding_site2_std) {
         this.finding_site2_std = finding_site2_std;
    } 
    public String getfinding_result2_std(){
        return finding_result2_std;
    } 
    public void setfinding_result2_std(String finding_result2_std) {
         this.finding_result2_std = finding_result2_std;
    } 
    public String getfinding_nature2_std(){
        return finding_nature2_std;
    } 
    public void setfinding_nature2_std(String finding_nature2_std) {
         this.finding_nature2_std = finding_nature2_std;
    } 
    public String getinvasion1_std(){
        return invasion1_std;
    } 
    public void setinvasion1_std(String invasion1_std) {
         this.invasion1_std = invasion1_std;
    } 
    public String getinvasion_layer1_std(){
        return invasion_layer1_std;
    } 
    public void setinvasion_layer1_std(String invasion_layer1_std) {
         this.invasion_layer1_std = invasion_layer1_std;
    } 
    public String getinvasion_structure1_std(){
        return invasion_structure1_std;
    } 
    public void setinvasion_structure1_std(String invasion_structure1_std) {
         this.invasion_structure1_std = invasion_structure1_std;
    } 
    public String getinvasion_site1_std(){
        return invasion_site1_std;
    } 
    public void setinvasion_site1_std(String invasion_site1_std) {
         this.invasion_site1_std = invasion_site1_std;
    } 
    public String getinvasion2_std(){
        return invasion2_std;
    } 
    public void setinvasion2_std(String invasion2_std) {
         this.invasion2_std = invasion2_std;
    } 
    public String getinvasion_layer2_std(){
        return invasion_layer2_std;
    } 
    public void setinvasion_layer2_std(String invasion_layer2_std) {
         this.invasion_layer2_std = invasion_layer2_std;
    } 
    public String getinvasion_structure2_std(){
        return invasion_structure2_std;
    } 
    public void setinvasion_structure2_std(String invasion_structure2_std) {
         this.invasion_structure2_std = invasion_structure2_std;
    } 
    public String getinvasion_site2_std(){
        return invasion_site2_std;
    } 
    public void setinvasion_site2_std(String invasion_site2_std) {
         this.invasion_site2_std = invasion_site2_std;
    } 
    public String getinvasion3_std(){
        return invasion3_std;
    } 
    public void setinvasion3_std(String invasion3_std) {
         this.invasion3_std = invasion3_std;
    } 
    public String getinvasion_layer3_std(){
        return invasion_layer3_std;
    } 
    public void setinvasion_layer3_std(String invasion_layer3_std) {
         this.invasion_layer3_std = invasion_layer3_std;
    } 
    public String getinvasion_structure3_std(){
        return invasion_structure3_std;
    } 
    public void setinvasion_structure3_std(String invasion_structure3_std) {
         this.invasion_structure3_std = invasion_structure3_std;
    } 
    public String getinvasion_site3_std(){
        return invasion_site3_std;
    } 
    public void setinvasion_site3_std(String invasion_site3_std) {
         this.invasion_site3_std = invasion_site3_std;
    } 
    public String getinvasion4_std(){
        return invasion4_std;
    } 
    public void setinvasion4_std(String invasion4_std) {
         this.invasion4_std = invasion4_std;
    } 
    public String getinvasion_layer4_std(){
        return invasion_layer4_std;
    } 
    public void setinvasion_layer4_std(String invasion_layer4_std) {
         this.invasion_layer4_std = invasion_layer4_std;
    } 
    public String getinvasion_structure4_std(){
        return invasion_structure4_std;
    } 
    public void setinvasion_structure4_std(String invasion_structure4_std) {
         this.invasion_structure4_std = invasion_structure4_std;
    } 
    public String getinvasion_site4_std(){
        return invasion_site4_std;
    } 
    public void setinvasion_site4_std(String invasion_site4_std) {
         this.invasion_site4_std = invasion_site4_std;
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
    public String getlauren_type_std(){
        return lauren_type_std;
    } 
    public void setlauren_type_std(String lauren_type_std) {
         this.lauren_type_std = lauren_type_std;
    } 
}