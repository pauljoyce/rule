package com.clinical.model.master;
import java.util.Date;

public class BASY_NSTD {
    //主键id
    private Integer ID;
    //唯一标识
    private String UNIQUE_ID;
    //关联1级表unique_id
    private String UNIQUE_ID_LV1;
    //关联2级表unique_id
    private String UNIQUE_ID_LV2;
    //医疗机构代码
    private String P900;
    //患者id
    private String PATIENT_ID;
    //就诊标识
    private String VISIT_ID;
    //住院次数
    private Integer ADMISSION_NUMBER;
    //病案号
    private String TPATNO;
    //就诊类型
    private Integer VISIT_TYPE;
    //活动记录状态
    private String RECORD_STATUS;
    //机构名称
    private String P6891;
    //医疗保险手册（卡）号
    private String P686;
    //健康卡号
    private String P800;
    //医疗付款方式
    private String P1;
    //住院次数
    private Integer P2;
    //病案号
    private String P3;
    //患者ID
    private String DOP3;
    //姓名
    private String P4;
    //性别
    private String P5;
    //出生日期
    private Date P6;
    //年龄
    private Integer P7;
    //婚姻状况
    private String P8;
    //职业
    private String P9;
    //出生省份
    private String P101;
    //出生地市
    private String P102;
    //出生地县
    private String P103;
    //民族
    private String P11;
    //国籍
    private String P12;
    //身份证号
    private String P13;
    //现住址
    private String P801;
    //住宅电话
    private String P802;
    //现住址邮政编码
    private String P803;
    //工作单位及地址
    private String P14;
    //电话
    private String P15;
    //工作单位邮政编码
    private String P16;
    //户口地址
    private String P17;
    //户口所在地邮政编码
    private String P171;
    //联系人姓名
    private String P18;
    //关系
    private String P19;
    //联系人地址
    private String P20;
    //入院途径
    private String P804;
    //联系人电话
    private String P21;
    //入院日期
    private Date P22;
    //入院科室
    private String P23;
    //入院病室
    private String P231;
    //转科科室
    private String P24;
    //出院日期
    private Date P25;
    //出院科室
    private String P26;
    //出院病室
    private String P261;
    //实际住院天数
    private Integer P27;
    //医院感染总次数
    private Integer P689;
    //过敏源
    private String P371;
    //过敏药物名称
    private String P372;
    //HBsAg
    private String P38;
    //HCV-Ab
    private String P39;
    //HIV-Ab
    private String P40;
    //抢救次数
    private Integer P421;
    //抢救成功次数
    private Integer P422;
    //最高诊断依据
    private String P687;
    //分化程度
    private String P688;
    //科主任
    private String P431;
    //主(副主)任医师
    private String P432;
    //主治医师
    private String P433;
    //住院医师
    private String P434;
    //责任护士
    private String P819;
    //进修医师
    private String P435;
    //研究生实习医师
    private String P436;
    //实习医师
    private String P437;
    //编码员
    private String P438;
    //病案质量
    private String P44;
    //质控医师
    private String P45;
    //质控护师
    private String P46;
    //质控日期
    private Date P47;
    //特级护理天数
    private Integer P561;
    //一级护理天数
    private Integer P562;
    //二级护理天数
    private Integer P563;
    //三级护理天数
    private Integer P564;
    //重症监护室名称1
    private String P6911;
    //进入时间1
    private Date P6912;
    //退出时间1
    private Date P6913;
    //重症监护室名称2
    private String P6914;
    //进入时间2
    private Date P6915;
    //退出时间2
    private Date P6916;
    //重症监护室名称3
    private String P6917;
    //进入时间3
    private Date P6918;
    //退出时间3
    private Date P6919;
    //重症监护室名称4
    private String P6920;
    //进入时间4
    private Date P6921;
    //退出时间4
    private Date P6922;
    //重症监护室名称5
    private String P6923;
    //进入时间5
    private Date P6924;
    //退出时间5
    private Date P6925;
    //死亡患者尸检
    private String P57;
    //手术、治疗、检查、诊断为本院第一例
    private String P58;
    //手术患者类型
    private String P581;
    //随诊
    private String P60;
    //随诊周数
    private Double P611;
    //随诊月数
    private Double P612;
    //随诊年数
    private Double P613;
    //示教病例
    private String P59;
    //ABO血型
    private String P62;
    //Rh血型
    private String P63;
    //输血反应
    private String P64;
    //红细胞
    private Double P651;
    //血小板
    private Double P652;
    //血浆
    private Integer P653;
    //全血
    private Integer P654;
    //自体回收
    private Integer P655;
    //其它
    private Integer P656;
    //（年龄不足1周岁的）年龄
    private Double P66;
    //新生儿出生体重1
    private Integer P681;
    //新生儿出生体重2
    private Integer P682;
    //新生儿出生体重3
    private Integer P683;
    //新生儿出生体重4
    private Integer P684;
    //新生儿出生体重5
    private Integer P685;
    //新生儿入院体重
    private Integer P67;
    //入院前多少小时(颅脑损伤患者昏迷时间)
    private Integer P731;
    //入院前多少分钟(颅脑损伤患者昏迷时间)
    private Integer P732;
    //入院后多少小时(颅脑损伤患者昏迷时间)
    private Integer P733;
    //入院后多少分钟(颅脑损伤患者昏迷时间)
    private Integer P734;
    //呼吸机使用时间
    private Integer P72;
    //是否有出院31天内再住院计划
    private String P830;
    //出院31天再住院计划目的
    private String P831;
    //离院方式
    private String P741;
    //转入医院名称
    private String P742;
    //转入社区服务机构/乡镇卫生院名称
    private String P743;
    //住院总费用
    private Double P782;
    //住院总费用其中自付金额
    private Double P751;
    //一般医疗服务费
    private Double P752;
    //一般治疗操作费
    private Double P754;
    //护理费
    private Double P755;
    //综合医疗服务类其他费用
    private Double P756;
    //病理诊断费
    private Double P757;
    //实验室诊断费
    private Double P758;
    //影像学诊断费
    private Double P759;
    //临床诊断项目费
    private Double P760;
    //非手术治疗项目费
    private Double P761;
    //临床物理治疗费
    private Double P762;
    //手术治疗费
    private Double P763;
    //麻醉费
    private Double P764;
    //手术费
    private Double P765;
    //康复费
    private Double P767;
    //中医治疗费
    private Double P768;
    //西药费
    private Double P769;
    //抗菌药物费用
    private Double P770;
    //中成药费
    private Double P771;
    //中草药费
    private Double P772;
    //血费
    private Double P773;
    //白蛋白类制品费
    private Double P774;
    //球蛋白类制品费
    private Double P775;
    //凝血因子类制品费
    private Double P776;
    //细胞因子类制品费
    private Double P777;
    //检查用一次性医用材料费
    private Double P778;
    //治疗用一次性医用材料费
    private Double P779;
    //手术用一次性医用材料费
    private Double P780;
    //其他费
    private Double P781;
    //数据版本
    private String DATA_VERSION;
    //数据库来源
    private String DATA_DB_SOURCE;
    //数据表来源
    private String DATA_TABLE_SOURCE;
    //数据项来源
    private String DATA_FIELD_SOURCE;
    //创建时间
    private Date CREATED_AT;
    //创建人
    private String CREATOR;
    //修改时间
    private Date UPDATED_AT;
    //修改人
    private String UPDATOR;
    //修改备注
    private String UPDATED_NOTE;
    //数据状态
    private String DATA_STATE;
    //停用时间
    private Date DISABLE_TIME;
    //停用人
    private String DISABLE_OPERATOR;
    //停用说明
    private String DISABLE_NOTE;
    //数据校验
    private String DATA_CHECK;
    //是否删除
    private Integer DEL_FLAG;
    //批号
    private String BATCH_NUMBER;
    //MD5标识
    private String MD5;
    //入院科室标准名称
    private String P23_STD;
    //转科科室标准名称
    private String P24_STD;
    //出院科室标准名称
    private String P26_STD;

    public Integer getID(){
        return ID;
    } 
    public void setID(Integer ID) {
         this.ID = ID;
    } 
    public String getUNIQUE_ID(){
        return UNIQUE_ID;
    } 
    public void setUNIQUE_ID(String UNIQUE_ID) {
         this.UNIQUE_ID = UNIQUE_ID;
    } 
    public String getUNIQUE_ID_LV1(){
        return UNIQUE_ID_LV1;
    } 
    public void setUNIQUE_ID_LV1(String UNIQUE_ID_LV1) {
         this.UNIQUE_ID_LV1 = UNIQUE_ID_LV1;
    } 
    public String getUNIQUE_ID_LV2(){
        return UNIQUE_ID_LV2;
    } 
    public void setUNIQUE_ID_LV2(String UNIQUE_ID_LV2) {
         this.UNIQUE_ID_LV2 = UNIQUE_ID_LV2;
    } 
    public String getP900(){
        return P900;
    } 
    public void setP900(String P900) {
         this.P900 = P900;
    } 
    public String getPATIENT_ID(){
        return PATIENT_ID;
    } 
    public void setPATIENT_ID(String PATIENT_ID) {
         this.PATIENT_ID = PATIENT_ID;
    } 
    public String getVISIT_ID(){
        return VISIT_ID;
    } 
    public void setVISIT_ID(String VISIT_ID) {
         this.VISIT_ID = VISIT_ID;
    } 
    public Integer getADMISSION_NUMBER(){
        return ADMISSION_NUMBER;
    } 
    public void setADMISSION_NUMBER(Integer ADMISSION_NUMBER) {
         this.ADMISSION_NUMBER = ADMISSION_NUMBER;
    } 
    public String getTPATNO(){
        return TPATNO;
    } 
    public void setTPATNO(String TPATNO) {
         this.TPATNO = TPATNO;
    } 
    public Integer getVISIT_TYPE(){
        return VISIT_TYPE;
    } 
    public void setVISIT_TYPE(Integer VISIT_TYPE) {
         this.VISIT_TYPE = VISIT_TYPE;
    } 
    public String getRECORD_STATUS(){
        return RECORD_STATUS;
    } 
    public void setRECORD_STATUS(String RECORD_STATUS) {
         this.RECORD_STATUS = RECORD_STATUS;
    } 
    public String getP6891(){
        return P6891;
    } 
    public void setP6891(String P6891) {
         this.P6891 = P6891;
    } 
    public String getP686(){
        return P686;
    } 
    public void setP686(String P686) {
         this.P686 = P686;
    } 
    public String getP800(){
        return P800;
    } 
    public void setP800(String P800) {
         this.P800 = P800;
    } 
    public String getP1(){
        return P1;
    } 
    public void setP1(String P1) {
         this.P1 = P1;
    } 
    public Integer getP2(){
        return P2;
    } 
    public void setP2(Integer P2) {
         this.P2 = P2;
    } 
    public String getP3(){
        return P3;
    } 
    public void setP3(String P3) {
         this.P3 = P3;
    } 
    public String getDOP3(){
        return DOP3;
    } 
    public void setDOP3(String DOP3) {
         this.DOP3 = DOP3;
    } 
    public String getP4(){
        return P4;
    } 
    public void setP4(String P4) {
         this.P4 = P4;
    } 
    public String getP5(){
        return P5;
    } 
    public void setP5(String P5) {
         this.P5 = P5;
    } 
    public Date getP6(){
        return P6;
    } 
    public void setP6(Date P6) {
         this.P6 = P6;
    } 
    public Integer getP7(){
        return P7;
    } 
    public void setP7(Integer P7) {
         this.P7 = P7;
    } 
    public String getP8(){
        return P8;
    } 
    public void setP8(String P8) {
         this.P8 = P8;
    } 
    public String getP9(){
        return P9;
    } 
    public void setP9(String P9) {
         this.P9 = P9;
    } 
    public String getP101(){
        return P101;
    } 
    public void setP101(String P101) {
         this.P101 = P101;
    } 
    public String getP102(){
        return P102;
    } 
    public void setP102(String P102) {
         this.P102 = P102;
    } 
    public String getP103(){
        return P103;
    } 
    public void setP103(String P103) {
         this.P103 = P103;
    } 
    public String getP11(){
        return P11;
    } 
    public void setP11(String P11) {
         this.P11 = P11;
    } 
    public String getP12(){
        return P12;
    } 
    public void setP12(String P12) {
         this.P12 = P12;
    } 
    public String getP13(){
        return P13;
    } 
    public void setP13(String P13) {
         this.P13 = P13;
    } 
    public String getP801(){
        return P801;
    } 
    public void setP801(String P801) {
         this.P801 = P801;
    } 
    public String getP802(){
        return P802;
    } 
    public void setP802(String P802) {
         this.P802 = P802;
    } 
    public String getP803(){
        return P803;
    } 
    public void setP803(String P803) {
         this.P803 = P803;
    } 
    public String getP14(){
        return P14;
    } 
    public void setP14(String P14) {
         this.P14 = P14;
    } 
    public String getP15(){
        return P15;
    } 
    public void setP15(String P15) {
         this.P15 = P15;
    } 
    public String getP16(){
        return P16;
    } 
    public void setP16(String P16) {
         this.P16 = P16;
    } 
    public String getP17(){
        return P17;
    } 
    public void setP17(String P17) {
         this.P17 = P17;
    } 
    public String getP171(){
        return P171;
    } 
    public void setP171(String P171) {
         this.P171 = P171;
    } 
    public String getP18(){
        return P18;
    } 
    public void setP18(String P18) {
         this.P18 = P18;
    } 
    public String getP19(){
        return P19;
    } 
    public void setP19(String P19) {
         this.P19 = P19;
    } 
    public String getP20(){
        return P20;
    } 
    public void setP20(String P20) {
         this.P20 = P20;
    } 
    public String getP804(){
        return P804;
    } 
    public void setP804(String P804) {
         this.P804 = P804;
    } 
    public String getP21(){
        return P21;
    } 
    public void setP21(String P21) {
         this.P21 = P21;
    } 
    public Date getP22(){
        return P22;
    } 
    public void setP22(Date P22) {
         this.P22 = P22;
    } 
    public String getP23(){
        return P23;
    } 
    public void setP23(String P23) {
         this.P23 = P23;
    } 
    public String getP231(){
        return P231;
    } 
    public void setP231(String P231) {
         this.P231 = P231;
    } 
    public String getP24(){
        return P24;
    } 
    public void setP24(String P24) {
         this.P24 = P24;
    } 
    public Date getP25(){
        return P25;
    } 
    public void setP25(Date P25) {
         this.P25 = P25;
    } 
    public String getP26(){
        return P26;
    } 
    public void setP26(String P26) {
         this.P26 = P26;
    } 
    public String getP261(){
        return P261;
    } 
    public void setP261(String P261) {
         this.P261 = P261;
    } 
    public Integer getP27(){
        return P27;
    } 
    public void setP27(Integer P27) {
         this.P27 = P27;
    } 
    public Integer getP689(){
        return P689;
    } 
    public void setP689(Integer P689) {
         this.P689 = P689;
    } 
    public String getP371(){
        return P371;
    } 
    public void setP371(String P371) {
         this.P371 = P371;
    } 
    public String getP372(){
        return P372;
    } 
    public void setP372(String P372) {
         this.P372 = P372;
    } 
    public String getP38(){
        return P38;
    } 
    public void setP38(String P38) {
         this.P38 = P38;
    } 
    public String getP39(){
        return P39;
    } 
    public void setP39(String P39) {
         this.P39 = P39;
    } 
    public String getP40(){
        return P40;
    } 
    public void setP40(String P40) {
         this.P40 = P40;
    } 
    public Integer getP421(){
        return P421;
    } 
    public void setP421(Integer P421) {
         this.P421 = P421;
    } 
    public Integer getP422(){
        return P422;
    } 
    public void setP422(Integer P422) {
         this.P422 = P422;
    } 
    public String getP687(){
        return P687;
    } 
    public void setP687(String P687) {
         this.P687 = P687;
    } 
    public String getP688(){
        return P688;
    } 
    public void setP688(String P688) {
         this.P688 = P688;
    } 
    public String getP431(){
        return P431;
    } 
    public void setP431(String P431) {
         this.P431 = P431;
    } 
    public String getP432(){
        return P432;
    } 
    public void setP432(String P432) {
         this.P432 = P432;
    } 
    public String getP433(){
        return P433;
    } 
    public void setP433(String P433) {
         this.P433 = P433;
    } 
    public String getP434(){
        return P434;
    } 
    public void setP434(String P434) {
         this.P434 = P434;
    } 
    public String getP819(){
        return P819;
    } 
    public void setP819(String P819) {
         this.P819 = P819;
    } 
    public String getP435(){
        return P435;
    } 
    public void setP435(String P435) {
         this.P435 = P435;
    } 
    public String getP436(){
        return P436;
    } 
    public void setP436(String P436) {
         this.P436 = P436;
    } 
    public String getP437(){
        return P437;
    } 
    public void setP437(String P437) {
         this.P437 = P437;
    } 
    public String getP438(){
        return P438;
    } 
    public void setP438(String P438) {
         this.P438 = P438;
    } 
    public String getP44(){
        return P44;
    } 
    public void setP44(String P44) {
         this.P44 = P44;
    } 
    public String getP45(){
        return P45;
    } 
    public void setP45(String P45) {
         this.P45 = P45;
    } 
    public String getP46(){
        return P46;
    } 
    public void setP46(String P46) {
         this.P46 = P46;
    } 
    public Date getP47(){
        return P47;
    } 
    public void setP47(Date P47) {
         this.P47 = P47;
    } 
    public Integer getP561(){
        return P561;
    } 
    public void setP561(Integer P561) {
         this.P561 = P561;
    } 
    public Integer getP562(){
        return P562;
    } 
    public void setP562(Integer P562) {
         this.P562 = P562;
    } 
    public Integer getP563(){
        return P563;
    } 
    public void setP563(Integer P563) {
         this.P563 = P563;
    } 
    public Integer getP564(){
        return P564;
    } 
    public void setP564(Integer P564) {
         this.P564 = P564;
    } 
    public String getP6911(){
        return P6911;
    } 
    public void setP6911(String P6911) {
         this.P6911 = P6911;
    } 
    public Date getP6912(){
        return P6912;
    } 
    public void setP6912(Date P6912) {
         this.P6912 = P6912;
    } 
    public Date getP6913(){
        return P6913;
    } 
    public void setP6913(Date P6913) {
         this.P6913 = P6913;
    } 
    public String getP6914(){
        return P6914;
    } 
    public void setP6914(String P6914) {
         this.P6914 = P6914;
    } 
    public Date getP6915(){
        return P6915;
    } 
    public void setP6915(Date P6915) {
         this.P6915 = P6915;
    } 
    public Date getP6916(){
        return P6916;
    } 
    public void setP6916(Date P6916) {
         this.P6916 = P6916;
    } 
    public String getP6917(){
        return P6917;
    } 
    public void setP6917(String P6917) {
         this.P6917 = P6917;
    } 
    public Date getP6918(){
        return P6918;
    } 
    public void setP6918(Date P6918) {
         this.P6918 = P6918;
    } 
    public Date getP6919(){
        return P6919;
    } 
    public void setP6919(Date P6919) {
         this.P6919 = P6919;
    } 
    public String getP6920(){
        return P6920;
    } 
    public void setP6920(String P6920) {
         this.P6920 = P6920;
    } 
    public Date getP6921(){
        return P6921;
    } 
    public void setP6921(Date P6921) {
         this.P6921 = P6921;
    } 
    public Date getP6922(){
        return P6922;
    } 
    public void setP6922(Date P6922) {
         this.P6922 = P6922;
    } 
    public String getP6923(){
        return P6923;
    } 
    public void setP6923(String P6923) {
         this.P6923 = P6923;
    } 
    public Date getP6924(){
        return P6924;
    } 
    public void setP6924(Date P6924) {
         this.P6924 = P6924;
    } 
    public Date getP6925(){
        return P6925;
    } 
    public void setP6925(Date P6925) {
         this.P6925 = P6925;
    } 
    public String getP57(){
        return P57;
    } 
    public void setP57(String P57) {
         this.P57 = P57;
    } 
    public String getP58(){
        return P58;
    } 
    public void setP58(String P58) {
         this.P58 = P58;
    } 
    public String getP581(){
        return P581;
    } 
    public void setP581(String P581) {
         this.P581 = P581;
    } 
    public String getP60(){
        return P60;
    } 
    public void setP60(String P60) {
         this.P60 = P60;
    } 
    public Double getP611(){
        return P611;
    } 
    public void setP611(Double P611) {
         this.P611 = P611;
    } 
    public Double getP612(){
        return P612;
    } 
    public void setP612(Double P612) {
         this.P612 = P612;
    } 
    public Double getP613(){
        return P613;
    } 
    public void setP613(Double P613) {
         this.P613 = P613;
    } 
    public String getP59(){
        return P59;
    } 
    public void setP59(String P59) {
         this.P59 = P59;
    } 
    public String getP62(){
        return P62;
    } 
    public void setP62(String P62) {
         this.P62 = P62;
    } 
    public String getP63(){
        return P63;
    } 
    public void setP63(String P63) {
         this.P63 = P63;
    } 
    public String getP64(){
        return P64;
    } 
    public void setP64(String P64) {
         this.P64 = P64;
    } 
    public Double getP651(){
        return P651;
    } 
    public void setP651(Double P651) {
         this.P651 = P651;
    } 
    public Double getP652(){
        return P652;
    } 
    public void setP652(Double P652) {
         this.P652 = P652;
    } 
    public Integer getP653(){
        return P653;
    } 
    public void setP653(Integer P653) {
         this.P653 = P653;
    } 
    public Integer getP654(){
        return P654;
    } 
    public void setP654(Integer P654) {
         this.P654 = P654;
    } 
    public Integer getP655(){
        return P655;
    } 
    public void setP655(Integer P655) {
         this.P655 = P655;
    } 
    public Integer getP656(){
        return P656;
    } 
    public void setP656(Integer P656) {
         this.P656 = P656;
    } 
    public Double getP66(){
        return P66;
    } 
    public void setP66(Double P66) {
         this.P66 = P66;
    } 
    public Integer getP681(){
        return P681;
    } 
    public void setP681(Integer P681) {
         this.P681 = P681;
    } 
    public Integer getP682(){
        return P682;
    } 
    public void setP682(Integer P682) {
         this.P682 = P682;
    } 
    public Integer getP683(){
        return P683;
    } 
    public void setP683(Integer P683) {
         this.P683 = P683;
    } 
    public Integer getP684(){
        return P684;
    } 
    public void setP684(Integer P684) {
         this.P684 = P684;
    } 
    public Integer getP685(){
        return P685;
    } 
    public void setP685(Integer P685) {
         this.P685 = P685;
    } 
    public Integer getP67(){
        return P67;
    } 
    public void setP67(Integer P67) {
         this.P67 = P67;
    } 
    public Integer getP731(){
        return P731;
    } 
    public void setP731(Integer P731) {
         this.P731 = P731;
    } 
    public Integer getP732(){
        return P732;
    } 
    public void setP732(Integer P732) {
         this.P732 = P732;
    } 
    public Integer getP733(){
        return P733;
    } 
    public void setP733(Integer P733) {
         this.P733 = P733;
    } 
    public Integer getP734(){
        return P734;
    } 
    public void setP734(Integer P734) {
         this.P734 = P734;
    } 
    public Integer getP72(){
        return P72;
    } 
    public void setP72(Integer P72) {
         this.P72 = P72;
    } 
    public String getP830(){
        return P830;
    } 
    public void setP830(String P830) {
         this.P830 = P830;
    } 
    public String getP831(){
        return P831;
    } 
    public void setP831(String P831) {
         this.P831 = P831;
    } 
    public String getP741(){
        return P741;
    } 
    public void setP741(String P741) {
         this.P741 = P741;
    } 
    public String getP742(){
        return P742;
    } 
    public void setP742(String P742) {
         this.P742 = P742;
    } 
    public String getP743(){
        return P743;
    } 
    public void setP743(String P743) {
         this.P743 = P743;
    } 
    public Double getP782(){
        return P782;
    } 
    public void setP782(Double P782) {
         this.P782 = P782;
    } 
    public Double getP751(){
        return P751;
    } 
    public void setP751(Double P751) {
         this.P751 = P751;
    } 
    public Double getP752(){
        return P752;
    } 
    public void setP752(Double P752) {
         this.P752 = P752;
    } 
    public Double getP754(){
        return P754;
    } 
    public void setP754(Double P754) {
         this.P754 = P754;
    } 
    public Double getP755(){
        return P755;
    } 
    public void setP755(Double P755) {
         this.P755 = P755;
    } 
    public Double getP756(){
        return P756;
    } 
    public void setP756(Double P756) {
         this.P756 = P756;
    } 
    public Double getP757(){
        return P757;
    } 
    public void setP757(Double P757) {
         this.P757 = P757;
    } 
    public Double getP758(){
        return P758;
    } 
    public void setP758(Double P758) {
         this.P758 = P758;
    } 
    public Double getP759(){
        return P759;
    } 
    public void setP759(Double P759) {
         this.P759 = P759;
    } 
    public Double getP760(){
        return P760;
    } 
    public void setP760(Double P760) {
         this.P760 = P760;
    } 
    public Double getP761(){
        return P761;
    } 
    public void setP761(Double P761) {
         this.P761 = P761;
    } 
    public Double getP762(){
        return P762;
    } 
    public void setP762(Double P762) {
         this.P762 = P762;
    } 
    public Double getP763(){
        return P763;
    } 
    public void setP763(Double P763) {
         this.P763 = P763;
    } 
    public Double getP764(){
        return P764;
    } 
    public void setP764(Double P764) {
         this.P764 = P764;
    } 
    public Double getP765(){
        return P765;
    } 
    public void setP765(Double P765) {
         this.P765 = P765;
    } 
    public Double getP767(){
        return P767;
    } 
    public void setP767(Double P767) {
         this.P767 = P767;
    } 
    public Double getP768(){
        return P768;
    } 
    public void setP768(Double P768) {
         this.P768 = P768;
    } 
    public Double getP769(){
        return P769;
    } 
    public void setP769(Double P769) {
         this.P769 = P769;
    } 
    public Double getP770(){
        return P770;
    } 
    public void setP770(Double P770) {
         this.P770 = P770;
    } 
    public Double getP771(){
        return P771;
    } 
    public void setP771(Double P771) {
         this.P771 = P771;
    } 
    public Double getP772(){
        return P772;
    } 
    public void setP772(Double P772) {
         this.P772 = P772;
    } 
    public Double getP773(){
        return P773;
    } 
    public void setP773(Double P773) {
         this.P773 = P773;
    } 
    public Double getP774(){
        return P774;
    } 
    public void setP774(Double P774) {
         this.P774 = P774;
    } 
    public Double getP775(){
        return P775;
    } 
    public void setP775(Double P775) {
         this.P775 = P775;
    } 
    public Double getP776(){
        return P776;
    } 
    public void setP776(Double P776) {
         this.P776 = P776;
    } 
    public Double getP777(){
        return P777;
    } 
    public void setP777(Double P777) {
         this.P777 = P777;
    } 
    public Double getP778(){
        return P778;
    } 
    public void setP778(Double P778) {
         this.P778 = P778;
    } 
    public Double getP779(){
        return P779;
    } 
    public void setP779(Double P779) {
         this.P779 = P779;
    } 
    public Double getP780(){
        return P780;
    } 
    public void setP780(Double P780) {
         this.P780 = P780;
    } 
    public Double getP781(){
        return P781;
    } 
    public void setP781(Double P781) {
         this.P781 = P781;
    } 
    public String getDATA_VERSION(){
        return DATA_VERSION;
    } 
    public void setDATA_VERSION(String DATA_VERSION) {
         this.DATA_VERSION = DATA_VERSION;
    } 
    public String getDATA_DB_SOURCE(){
        return DATA_DB_SOURCE;
    } 
    public void setDATA_DB_SOURCE(String DATA_DB_SOURCE) {
         this.DATA_DB_SOURCE = DATA_DB_SOURCE;
    } 
    public String getDATA_TABLE_SOURCE(){
        return DATA_TABLE_SOURCE;
    } 
    public void setDATA_TABLE_SOURCE(String DATA_TABLE_SOURCE) {
         this.DATA_TABLE_SOURCE = DATA_TABLE_SOURCE;
    } 
    public String getDATA_FIELD_SOURCE(){
        return DATA_FIELD_SOURCE;
    } 
    public void setDATA_FIELD_SOURCE(String DATA_FIELD_SOURCE) {
         this.DATA_FIELD_SOURCE = DATA_FIELD_SOURCE;
    } 
    public Date getCREATED_AT(){
        return CREATED_AT;
    } 
    public void setCREATED_AT(Date CREATED_AT) {
         this.CREATED_AT = CREATED_AT;
    } 
    public String getCREATOR(){
        return CREATOR;
    } 
    public void setCREATOR(String CREATOR) {
         this.CREATOR = CREATOR;
    } 
    public Date getUPDATED_AT(){
        return UPDATED_AT;
    } 
    public void setUPDATED_AT(Date UPDATED_AT) {
         this.UPDATED_AT = UPDATED_AT;
    } 
    public String getUPDATOR(){
        return UPDATOR;
    } 
    public void setUPDATOR(String UPDATOR) {
         this.UPDATOR = UPDATOR;
    } 
    public String getUPDATED_NOTE(){
        return UPDATED_NOTE;
    } 
    public void setUPDATED_NOTE(String UPDATED_NOTE) {
         this.UPDATED_NOTE = UPDATED_NOTE;
    } 
    public String getDATA_STATE(){
        return DATA_STATE;
    } 
    public void setDATA_STATE(String DATA_STATE) {
         this.DATA_STATE = DATA_STATE;
    } 
    public Date getDISABLE_TIME(){
        return DISABLE_TIME;
    } 
    public void setDISABLE_TIME(Date DISABLE_TIME) {
         this.DISABLE_TIME = DISABLE_TIME;
    } 
    public String getDISABLE_OPERATOR(){
        return DISABLE_OPERATOR;
    } 
    public void setDISABLE_OPERATOR(String DISABLE_OPERATOR) {
         this.DISABLE_OPERATOR = DISABLE_OPERATOR;
    } 
    public String getDISABLE_NOTE(){
        return DISABLE_NOTE;
    } 
    public void setDISABLE_NOTE(String DISABLE_NOTE) {
         this.DISABLE_NOTE = DISABLE_NOTE;
    } 
    public String getDATA_CHECK(){
        return DATA_CHECK;
    } 
    public void setDATA_CHECK(String DATA_CHECK) {
         this.DATA_CHECK = DATA_CHECK;
    } 
    public Integer getDEL_FLAG(){
        return DEL_FLAG;
    } 
    public void setDEL_FLAG(Integer DEL_FLAG) {
         this.DEL_FLAG = DEL_FLAG;
    } 
    public String getBATCH_NUMBER(){
        return BATCH_NUMBER;
    } 
    public void setBATCH_NUMBER(String BATCH_NUMBER) {
         this.BATCH_NUMBER = BATCH_NUMBER;
    } 
    public String getMD5(){
        return MD5;
    } 
    public void setMD5(String MD5) {
         this.MD5 = MD5;
    } 
    public String getP23_STD(){
        return P23_STD;
    } 
    public void setP23_STD(String P23_STD) {
         this.P23_STD = P23_STD;
    } 
    public String getP24_STD(){
        return P24_STD;
    } 
    public void setP24_STD(String P24_STD) {
         this.P24_STD = P24_STD;
    } 
    public String getP26_STD(){
        return P26_STD;
    } 
    public void setP26_STD(String P26_STD) {
         this.P26_STD = P26_STD;
    } 
}