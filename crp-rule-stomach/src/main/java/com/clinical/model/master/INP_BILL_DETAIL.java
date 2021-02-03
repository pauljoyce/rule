package com.clinical.model.master;
import java.util.Date;
public class INP_BILL_DETAIL{
    //主键id
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
    //住院_门诊号
    private String visit_id;
    //住院次数
    private Integer admission_number;
    //就诊类型
    private Integer visit_type;
    //费用项目序号
    private String item_no;
    //项目类别
    private String item_class;
    //项目名称
    private String item_name;
    //项目代码
    private String item_code;
    //项目规格
    private String item_spec;
    //单价
    private Double unit_price;
    //数量
    private Double quantity;
    //单位
    private String fee_units;
    //开单科室
    private String ordered_by;
    //执行科室
    private String performed_by;
    //实收费用
    private Double costs;
    //应收费用
    private Double charges;
    //医保_个人支付
    private Double person_pay;
    //医保_医保支付
    private Double medicare_pay;
    //计价日期时间
    private Date billing_date_time;
    //对应结算序号
    private String rcpt_no;
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
    public Integer getvisit_type(){
        return visit_type;
    } 
    public void setvisit_type(Integer visit_type) {
         this.visit_type = visit_type;
    } 
    public String getitem_no(){
        return item_no;
    } 
    public void setitem_no(String item_no) {
         this.item_no = item_no;
    } 
    public String getitem_class(){
        return item_class;
    } 
    public void setitem_class(String item_class) {
         this.item_class = item_class;
    } 
    public String getitem_name(){
        return item_name;
    } 
    public void setitem_name(String item_name) {
         this.item_name = item_name;
    } 
    public String getitem_code(){
        return item_code;
    } 
    public void setitem_code(String item_code) {
         this.item_code = item_code;
    } 
    public String getitem_spec(){
        return item_spec;
    } 
    public void setitem_spec(String item_spec) {
         this.item_spec = item_spec;
    } 
    public Double getunit_price(){
        return unit_price;
    } 
    public void setunit_price(Double unit_price) {
         this.unit_price = unit_price;
    } 
    public Double getquantity(){
        return quantity;
    } 
    public void setquantity(Double quantity) {
         this.quantity = quantity;
    } 
    public String getfee_units(){
        return fee_units;
    } 
    public void setfee_units(String fee_units) {
         this.fee_units = fee_units;
    } 
    public String getordered_by(){
        return ordered_by;
    } 
    public void setordered_by(String ordered_by) {
         this.ordered_by = ordered_by;
    } 
    public String getperformed_by(){
        return performed_by;
    } 
    public void setperformed_by(String performed_by) {
         this.performed_by = performed_by;
    } 
    public Double getcosts(){
        return costs;
    } 
    public void setcosts(Double costs) {
         this.costs = costs;
    } 
    public Double getcharges(){
        return charges;
    } 
    public void setcharges(Double charges) {
         this.charges = charges;
    } 
    public Double getperson_pay(){
        return person_pay;
    } 
    public void setperson_pay(Double person_pay) {
         this.person_pay = person_pay;
    } 
    public Double getmedicare_pay(){
        return medicare_pay;
    } 
    public void setmedicare_pay(Double medicare_pay) {
         this.medicare_pay = medicare_pay;
    } 
    public Date getbilling_date_time(){
        return billing_date_time;
    } 
    public void setbilling_date_time(Date billing_date_time) {
         this.billing_date_time = billing_date_time;
    } 
    public String getrcpt_no(){
        return rcpt_no;
    } 
    public void setrcpt_no(String rcpt_no) {
         this.rcpt_no = rcpt_no;
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