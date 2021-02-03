package com.clinical.model.cluster;
import java.util.Date;
public class IndexPerson{
    //主键id
    private Integer id;
    //unique_id
    private String uniqueId;
    //标识患者身份唯一标识
    private String uniqueIdLv1;
    //唯一标识
    private String uniqueIdLv2;
    //患者id
    private String patientId;
    //住院号
    private String visitId;
    //医疗机构代码
    private String p900;
    //机构名称
    private String p6891;
    //医疗保险手册（卡）号
    private String p686;
    //健康卡号
    private String p800;
    //医疗付款方式
    private String p1;
    //住院次数
    private Integer p2;
    //病案号
    private String p3;
    //姓名
    private String p4;
    //性别
    private String p5;
    //出生日期
    private Date p6;
    //年龄
    private Integer p7;
    //婚姻状况
    private String p8;
    //职业
    private String p9;
    //出生省份
    private String p101;
    //出生地市
    private String p102;
    //出生地县
    private String p103;
    //民族
    private String p11;
    //国籍
    private String p12;
    //身份证号
    private String p13;
    //现住址
    private String p801;
    //住宅电话
    private String p802;
    //现住址邮政编码
    private String p803;
    //工作单位及地址
    private String p14;
    //电话
    private String p15;
    //工作单位邮政编码
    private String p16;
    //户口地址
    private String p17;
    //户口所在地邮政编码
    private String p171;
    //联系人姓名
    private String p18;
    //关系
    private String p19;
    //联系人地址
    private String p20;
    //入院途径
    private String p804;
    //联系人电话
    private String p21;
    //入院日期
    private Date p22;
    //入院科室
    private String p23;
    //入院病室
    private String p231;
    //转科科室
    private String p24;
    //出院日期
    private Date p25;
    //出院科室
    private String p26;
    //出院病室
    private String p261;
    //实际住院天数
    private Integer p27;
    //入院时情况
    private String p29;
    //入院后确诊日期
    private Date p31;
    //医院感染总次数
    private Integer p689;
    //过敏源
    private String p371;
    //过敏药物名称
    private String p372;
    //HBsAg
    private String p38;
    //HCV-Ab
    private String p39;
    //HIV-Ab
    private String p40;
    //门诊与出院诊断符合情况
    private String p411;
    //入院与出院诊断符合情况
    private String p412;
    //术前与术后诊断符合情况
    private String p413;
    //临床与病理诊断符合情况
    private String p414;
    //放射与病理诊断符合情况
    private String p415;
    //抢救次数
    private Integer p421;
    //抢救成功次数
    private Integer p422;
    //最高诊断依据
    private String p687;
    //分化程度
    private String p688;
    //科主任
    private String p431;
    //主(副主)任医师
    private String p432;
    //主治医师
    private String p433;
    //住院医师
    private String p434;
    //责任护士
    private String p819;
    //进修医师
    private String p435;
    //研究生实习医师
    private String p436;
    //实习医师
    private String p437;
    //编码员
    private String p438;
    //病案质量
    private String p44;
    //质控医师
    private String p45;
    //质控护师
    private String p46;
    //质控日期
    private Date p47;
    //特级护理天数
    private Integer p561;
    //一级护理天数
    private Integer p562;
    //二级护理天数
    private Integer p563;
    //三级护理天数
    private Integer p564;
    //死亡患者尸检
    private String p57;
    //手术、治疗、检查、诊断为本院第一例
    private String p58;
    //手术患者类型
    private String p581;
    //随诊
    private String p60;
    //随诊周数
    private Double p611;
    //随诊月数
    private Double p612;
    //随诊年数
    private Double p613;
    //示教病例
    private String p59;
    //ABO血型
    private String p62;
    //Rh血型
    private String p63;
    //输血反应
    private String p64;
    //红细胞
    private Double p651;
    //血小板
    private Double p652;
    //血浆
    private Integer p653;
    //全血
    private Integer p654;
    //自体回收
    private Integer p655;
    //其它
    private Integer p656;
    //（年龄不足1周岁的）年龄
    private Double p66;
    //新生儿出生体重
    private Integer p681;
    //新生儿入院体重
    private Integer p67;
    //入院前多少小时(颅脑损伤患者昏迷时间)
    private Integer p731;
    //入院前多少分钟(颅脑损伤患者昏迷时间)
    private Integer p732;
    //入院后多少小时(颅脑损伤患者昏迷时间)
    private Integer p733;
    //入院后多少分钟(颅脑损伤患者昏迷时间)
    private Integer p734;
    //呼吸机使用时间
    private Integer p72;
    //是否有出院31天内再住院计划
    private String p830;
    //出院31天再住院计划目的
    private String p831;
    //离院方式
    private String p741;
    //转入医院名称
    private String p742;
    //转入社区服务机构/乡镇卫生院名称
    private String p743;
    //住院总费用
    private Double p782;
    //住院总费用其中自付金额
    private Double p751;
    //一般医疗服务费
    private Double p752;
    //一般治疗操作费
    private Double p754;
    //护理费
    private Double p755;
    //综合医疗服务类其他费用
    private Double p756;
    //病理诊断费
    private Double p757;
    //实验室诊断费
    private Double p758;
    //影像学诊断费
    private Double p759;
    //临床诊断项目费
    private Double p760;
    //非手术治疗项目费
    private Double p761;
    //临床物理治疗费
    private Double p762;
    //手术治疗费
    private Double p763;
    //麻醉费
    private Double p764;
    //手术费
    private Double p765;
    //康复费
    private Double p767;
    //中医治疗费
    private Double p768;
    //西药费
    private Double p769;
    //抗菌药物费用
    private Double p770;
    //中成药费
    private Double p771;
    //中草药费
    private Double p772;
    //血费
    private Double p773;
    //白蛋白类制品费
    private Double p774;
    //球蛋白类制品费
    private Double p775;
    //凝血因子类制品费
    private Double p776;
    //细胞因子类制品费
    private Double p777;
    //检查用一次性医用材料费
    private Double p778;
    //治疗用一次性医用材料费
    private Double p779;
    //手术用一次性医用材料费
    private Double p780;
    //其他费
    private Double p781;
    //数据版本
    private String dataVersion;
    //数据库来源
    private String dataDbSource;
    //数据表来源
    private String dataTableSource;
    //数据项来源
    private String dataFieldSource;
    //创建时间
    private Date createdAt;
    //创建人
    private String creator;
    //修改时间
    private Date updatedAt;

    public Integer getId(){
        return id;
    } 
    public void setId(Integer id) {
         this.id = id;
    } 
    public String getUniqueId(){
        return uniqueId;
    } 
    public void setUniqueId(String uniqueId) {
         this.uniqueId = uniqueId;
    } 
    public String getUniqueIdLv1(){
        return uniqueIdLv1;
    } 
    public void setUniqueIdLv1(String uniqueIdLv1) {
         this.uniqueIdLv1 = uniqueIdLv1;
    } 
    public String getUniqueIdLv2(){
        return uniqueIdLv2;
    } 
    public void setUniqueIdLv2(String uniqueIdLv2) {
         this.uniqueIdLv2 = uniqueIdLv2;
    } 
    public String getPatientId(){
        return patientId;
    } 
    public void setPatientId(String patientId) {
         this.patientId = patientId;
    } 
    public String getVisitId(){
        return visitId;
    } 
    public void setVisitId(String visitId) {
         this.visitId = visitId;
    } 
    public String getP900(){
        return p900;
    } 
    public void setP900(String p900) {
         this.p900 = p900;
    } 
    public String getP6891(){
        return p6891;
    } 
    public void setP6891(String p6891) {
         this.p6891 = p6891;
    } 
    public String getP686(){
        return p686;
    } 
    public void setP686(String p686) {
         this.p686 = p686;
    } 
    public String getP800(){
        return p800;
    } 
    public void setP800(String p800) {
         this.p800 = p800;
    } 
    public String getP1(){
        return p1;
    } 
    public void setP1(String p1) {
         this.p1 = p1;
    } 
    public Integer getP2(){
        return p2;
    } 
    public void setP2(Integer p2) {
         this.p2 = p2;
    } 
    public String getP3(){
        return p3;
    } 
    public void setP3(String p3) {
         this.p3 = p3;
    }
    public String getP4(){
        return p4;
    } 
    public void setP4(String p4) {
         this.p4 = p4;
    } 
    public String getP5(){
        return p5;
    } 
    public void setP5(String p5) {
         this.p5 = p5;
    } 
    public Date getP6(){
        return p6;
    } 
    public void setP6(Date p6) {
         this.p6 = p6;
    } 
    public Integer getP7(){
        return p7;
    } 
    public void setP7(Integer p7) {
         this.p7 = p7;
    } 
    public String getP8(){
        return p8;
    } 
    public void setP8(String p8) {
         this.p8 = p8;
    } 
    public String getP9(){
        return p9;
    } 
    public void setP9(String p9) {
         this.p9 = p9;
    } 
    public String getP101(){
        return p101;
    } 
    public void setP101(String p101) {
         this.p101 = p101;
    } 
    public String getP102(){
        return p102;
    } 
    public void setP102(String p102) {
         this.p102 = p102;
    } 
    public String getP103(){
        return p103;
    } 
    public void setP103(String p103) {
         this.p103 = p103;
    } 
    public String getP11(){
        return p11;
    } 
    public void setP11(String p11) {
         this.p11 = p11;
    } 
    public String getP12(){
        return p12;
    } 
    public void setP12(String p12) {
         this.p12 = p12;
    } 
    public String getP13(){
        return p13;
    } 
    public void setP13(String p13) {
         this.p13 = p13;
    } 
    public String getP801(){
        return p801;
    } 
    public void setP801(String p801) {
         this.p801 = p801;
    } 
    public String getP802(){
        return p802;
    } 
    public void setP802(String p802) {
         this.p802 = p802;
    } 
    public String getP803(){
        return p803;
    } 
    public void setP803(String p803) {
         this.p803 = p803;
    } 
    public String getP14(){
        return p14;
    } 
    public void setP14(String p14) {
         this.p14 = p14;
    } 
    public String getP15(){
        return p15;
    } 
    public void setP15(String p15) {
         this.p15 = p15;
    } 
    public String getP16(){
        return p16;
    } 
    public void setP16(String p16) {
         this.p16 = p16;
    } 
    public String getP17(){
        return p17;
    } 
    public void setP17(String p17) {
         this.p17 = p17;
    } 
    public String getP171(){
        return p171;
    } 
    public void setP171(String p171) {
         this.p171 = p171;
    } 
    public String getP18(){
        return p18;
    } 
    public void setP18(String p18) {
         this.p18 = p18;
    } 
    public String getP19(){
        return p19;
    } 
    public void setP19(String p19) {
         this.p19 = p19;
    } 
    public String getP20(){
        return p20;
    } 
    public void setP20(String p20) {
         this.p20 = p20;
    } 
    public String getP804(){
        return p804;
    } 
    public void setP804(String p804) {
         this.p804 = p804;
    } 
    public String getP21(){
        return p21;
    } 
    public void setP21(String p21) {
         this.p21 = p21;
    } 
    public Date getP22(){
        return p22;
    } 
    public void setP22(Date p22) {
         this.p22 = p22;
    } 
    public String getP23(){
        return p23;
    } 
    public void setP23(String p23) {
         this.p23 = p23;
    } 
    public String getP231(){
        return p231;
    } 
    public void setP231(String p231) {
         this.p231 = p231;
    } 
    public String getP24(){
        return p24;
    } 
    public void setP24(String p24) {
         this.p24 = p24;
    } 
    public Date getP25(){
        return p25;
    } 
    public void setP25(Date p25) {
         this.p25 = p25;
    } 
    public String getP26(){
        return p26;
    } 
    public void setP26(String p26) {
         this.p26 = p26;
    } 
    public String getP261(){
        return p261;
    } 
    public void setP261(String p261) {
         this.p261 = p261;
    } 
    public Integer getP27(){
        return p27;
    } 
    public void setP27(Integer p27) {
         this.p27 = p27;
    } 
    public String getP29(){
        return p29;
    } 
    public void setP29(String p29) {
         this.p29 = p29;
    } 
    public Date getP31(){
        return p31;
    } 
    public void setP31(Date p31) {
         this.p31 = p31;
    } 
    public Integer getP689(){
        return p689;
    } 
    public void setP689(Integer p689) {
         this.p689 = p689;
    } 
    public String getP371(){
        return p371;
    } 
    public void setP371(String p371) {
         this.p371 = p371;
    } 
    public String getP372(){
        return p372;
    } 
    public void setP372(String p372) {
         this.p372 = p372;
    } 
    public String getP38(){
        return p38;
    } 
    public void setP38(String p38) {
         this.p38 = p38;
    } 
    public String getP39(){
        return p39;
    } 
    public void setP39(String p39) {
         this.p39 = p39;
    } 
    public String getP40(){
        return p40;
    } 
    public void setP40(String p40) {
         this.p40 = p40;
    } 
    public String getP411(){
        return p411;
    } 
    public void setP411(String p411) {
         this.p411 = p411;
    } 
    public String getP412(){
        return p412;
    } 
    public void setP412(String p412) {
         this.p412 = p412;
    } 
    public String getP413(){
        return p413;
    } 
    public void setP413(String p413) {
         this.p413 = p413;
    } 
    public String getP414(){
        return p414;
    } 
    public void setP414(String p414) {
         this.p414 = p414;
    } 
    public String getP415(){
        return p415;
    } 
    public void setP415(String p415) {
         this.p415 = p415;
    } 
    public Integer getP421(){
        return p421;
    } 
    public void setP421(Integer p421) {
         this.p421 = p421;
    } 
    public Integer getP422(){
        return p422;
    } 
    public void setP422(Integer p422) {
         this.p422 = p422;
    } 
    public String getP687(){
        return p687;
    } 
    public void setP687(String p687) {
         this.p687 = p687;
    } 
    public String getP688(){
        return p688;
    } 
    public void setP688(String p688) {
         this.p688 = p688;
    } 
    public String getP431(){
        return p431;
    } 
    public void setP431(String p431) {
         this.p431 = p431;
    } 
    public String getP432(){
        return p432;
    } 
    public void setP432(String p432) {
         this.p432 = p432;
    } 
    public String getP433(){
        return p433;
    } 
    public void setP433(String p433) {
         this.p433 = p433;
    } 
    public String getP434(){
        return p434;
    } 
    public void setP434(String p434) {
         this.p434 = p434;
    } 
    public String getP819(){
        return p819;
    } 
    public void setP819(String p819) {
         this.p819 = p819;
    } 
    public String getP435(){
        return p435;
    } 
    public void setP435(String p435) {
         this.p435 = p435;
    } 
    public String getP436(){
        return p436;
    } 
    public void setP436(String p436) {
         this.p436 = p436;
    } 
    public String getP437(){
        return p437;
    } 
    public void setP437(String p437) {
         this.p437 = p437;
    } 
    public String getP438(){
        return p438;
    } 
    public void setP438(String p438) {
         this.p438 = p438;
    } 
    public String getP44(){
        return p44;
    } 
    public void setP44(String p44) {
         this.p44 = p44;
    } 
    public String getP45(){
        return p45;
    } 
    public void setP45(String p45) {
         this.p45 = p45;
    } 
    public String getP46(){
        return p46;
    } 
    public void setP46(String p46) {
         this.p46 = p46;
    } 
    public Date getP47(){
        return p47;
    } 
    public void setP47(Date p47) {
         this.p47 = p47;
    } 
    public Integer getP561(){
        return p561;
    } 
    public void setP561(Integer p561) {
         this.p561 = p561;
    } 
    public Integer getP562(){
        return p562;
    } 
    public void setP562(Integer p562) {
         this.p562 = p562;
    } 
    public Integer getP563(){
        return p563;
    } 
    public void setP563(Integer p563) {
         this.p563 = p563;
    } 
    public Integer getP564(){
        return p564;
    } 
    public void setP564(Integer p564) {
         this.p564 = p564;
    } 
    public String getP57(){
        return p57;
    } 
    public void setP57(String p57) {
         this.p57 = p57;
    } 
    public String getP58(){
        return p58;
    } 
    public void setP58(String p58) {
         this.p58 = p58;
    } 
    public String getP581(){
        return p581;
    } 
    public void setP581(String p581) {
         this.p581 = p581;
    } 
    public String getP60(){
        return p60;
    } 
    public void setP60(String p60) {
         this.p60 = p60;
    } 
    public Double getP611(){
        return p611;
    } 
    public void setP611(Double p611) {
         this.p611 = p611;
    } 
    public Double getP612(){
        return p612;
    } 
    public void setP612(Double p612) {
         this.p612 = p612;
    } 
    public Double getP613(){
        return p613;
    } 
    public void setP613(Double p613) {
         this.p613 = p613;
    } 
    public String getP59(){
        return p59;
    } 
    public void setP59(String p59) {
         this.p59 = p59;
    } 
    public String getP62(){
        return p62;
    } 
    public void setP62(String p62) {
         this.p62 = p62;
    } 
    public String getP63(){
        return p63;
    } 
    public void setP63(String p63) {
         this.p63 = p63;
    } 
    public String getP64(){
        return p64;
    } 
    public void setP64(String p64) {
         this.p64 = p64;
    } 
    public Double getP651(){
        return p651;
    } 
    public void setP651(Double p651) {
         this.p651 = p651;
    } 
    public Double getP652(){
        return p652;
    } 
    public void setP652(Double p652) {
         this.p652 = p652;
    } 
    public Integer getP653(){
        return p653;
    } 
    public void setP653(Integer p653) {
         this.p653 = p653;
    } 
    public Integer getP654(){
        return p654;
    } 
    public void setP654(Integer p654) {
         this.p654 = p654;
    } 
    public Integer getP655(){
        return p655;
    } 
    public void setP655(Integer p655) {
         this.p655 = p655;
    } 
    public Integer getP656(){
        return p656;
    } 
    public void setP656(Integer p656) {
         this.p656 = p656;
    } 
    public Double getP66(){
        return p66;
    } 
    public void setP66(Double p66) {
         this.p66 = p66;
    } 
    public Integer getP681(){
        return p681;
    } 
    public void setP681(Integer p681) {
         this.p681 = p681;
    } 
    public Integer getP67(){
        return p67;
    } 
    public void setP67(Integer p67) {
         this.p67 = p67;
    } 
    public Integer getP731(){
        return p731;
    } 
    public void setP731(Integer p731) {
         this.p731 = p731;
    } 
    public Integer getP732(){
        return p732;
    } 
    public void setP732(Integer p732) {
         this.p732 = p732;
    } 
    public Integer getP733(){
        return p733;
    } 
    public void setP733(Integer p733) {
         this.p733 = p733;
    } 
    public Integer getP734(){
        return p734;
    } 
    public void setP734(Integer p734) {
         this.p734 = p734;
    } 
    public Integer getP72(){
        return p72;
    } 
    public void setP72(Integer p72) {
         this.p72 = p72;
    } 
    public String getP830(){
        return p830;
    } 
    public void setP830(String p830) {
         this.p830 = p830;
    } 
    public String getP831(){
        return p831;
    } 
    public void setP831(String p831) {
         this.p831 = p831;
    } 
    public String getP741(){
        return p741;
    } 
    public void setP741(String p741) {
         this.p741 = p741;
    } 
    public String getP742(){
        return p742;
    } 
    public void setP742(String p742) {
         this.p742 = p742;
    } 
    public String getP743(){
        return p743;
    } 
    public void setP743(String p743) {
         this.p743 = p743;
    } 
    public Double getP782(){
        return p782;
    } 
    public void setP782(Double p782) {
         this.p782 = p782;
    } 
    public Double getP751(){
        return p751;
    } 
    public void setP751(Double p751) {
         this.p751 = p751;
    } 
    public Double getP752(){
        return p752;
    } 
    public void setP752(Double p752) {
         this.p752 = p752;
    } 
    public Double getP754(){
        return p754;
    } 
    public void setP754(Double p754) {
         this.p754 = p754;
    } 
    public Double getP755(){
        return p755;
    } 
    public void setP755(Double p755) {
         this.p755 = p755;
    } 
    public Double getP756(){
        return p756;
    } 
    public void setP756(Double p756) {
         this.p756 = p756;
    } 
    public Double getP757(){
        return p757;
    } 
    public void setP757(Double p757) {
         this.p757 = p757;
    } 
    public Double getP758(){
        return p758;
    } 
    public void setP758(Double p758) {
         this.p758 = p758;
    } 
    public Double getP759(){
        return p759;
    } 
    public void setP759(Double p759) {
         this.p759 = p759;
    } 
    public Double getP760(){
        return p760;
    } 
    public void setP760(Double p760) {
         this.p760 = p760;
    } 
    public Double getP761(){
        return p761;
    } 
    public void setP761(Double p761) {
         this.p761 = p761;
    } 
    public Double getP762(){
        return p762;
    } 
    public void setP762(Double p762) {
         this.p762 = p762;
    } 
    public Double getP763(){
        return p763;
    } 
    public void setP763(Double p763) {
         this.p763 = p763;
    } 
    public Double getP764(){
        return p764;
    } 
    public void setP764(Double p764) {
         this.p764 = p764;
    } 
    public Double getP765(){
        return p765;
    } 
    public void setP765(Double p765) {
         this.p765 = p765;
    } 
    public Double getP767(){
        return p767;
    } 
    public void setP767(Double p767) {
         this.p767 = p767;
    } 
    public Double getP768(){
        return p768;
    } 
    public void setP768(Double p768) {
         this.p768 = p768;
    } 
    public Double getP769(){
        return p769;
    } 
    public void setP769(Double p769) {
         this.p769 = p769;
    } 
    public Double getP770(){
        return p770;
    } 
    public void setP770(Double p770) {
         this.p770 = p770;
    } 
    public Double getP771(){
        return p771;
    } 
    public void setP771(Double p771) {
         this.p771 = p771;
    } 
    public Double getP772(){
        return p772;
    } 
    public void setP772(Double p772) {
         this.p772 = p772;
    } 
    public Double getP773(){
        return p773;
    } 
    public void setP773(Double p773) {
         this.p773 = p773;
    } 
    public Double getP774(){
        return p774;
    } 
    public void setP774(Double p774) {
         this.p774 = p774;
    } 
    public Double getP775(){
        return p775;
    } 
    public void setP775(Double p775) {
         this.p775 = p775;
    } 
    public Double getP776(){
        return p776;
    } 
    public void setP776(Double p776) {
         this.p776 = p776;
    } 
    public Double getP777(){
        return p777;
    } 
    public void setP777(Double p777) {
         this.p777 = p777;
    } 
    public Double getP778(){
        return p778;
    } 
    public void setP778(Double p778) {
         this.p778 = p778;
    } 
    public Double getP779(){
        return p779;
    } 
    public void setP779(Double p779) {
         this.p779 = p779;
    } 
    public Double getP780(){
        return p780;
    } 
    public void setP780(Double p780) {
         this.p780 = p780;
    } 
    public Double getP781(){
        return p781;
    } 
    public void setP781(Double p781) {
         this.p781 = p781;
    } 
    public String getDataVersion(){
        return dataVersion;
    } 
    public void setDataVersion(String dataVersion) {
         this.dataVersion = dataVersion;
    } 
    public String getDataDbSource(){
        return dataDbSource;
    } 
    public void setDataDbSource(String dataDbSource) {
         this.dataDbSource = dataDbSource;
    } 
    public String getDataTableSource(){
        return dataTableSource;
    } 
    public void setDataTableSource(String dataTableSource) {
         this.dataTableSource = dataTableSource;
    } 
    public String getDataFieldSource(){
        return dataFieldSource;
    } 
    public void setDataFieldSource(String dataFieldSource) {
         this.dataFieldSource = dataFieldSource;
    } 
    public Date getCreatedAt(){
        return createdAt;
    } 
    public void setCreatedAt(Date createdAt) {
         this.createdAt = createdAt;
    } 
    public String getCreator(){
        return creator;
    } 
    public void setCreator(String creator) {
         this.creator = creator;
    } 
    public Date getUpdatedAt(){
        return updatedAt;
    } 
    public void setUpdatedAt(Date updatedAt) {
         this.updatedAt = updatedAt;
    } 
}