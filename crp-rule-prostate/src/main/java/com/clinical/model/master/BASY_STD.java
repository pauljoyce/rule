package com.clinical.model.master;
import java.util.Date;
public class BASY_STD{
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
    //门（急）诊诊断编码
    private String P28;
    //门（急）诊诊断描述
    private String P281;
    //入院时情况
    private String P29;
    //入院诊断编码
    private String P30;
    //入院诊断描述
    private String P301;
    //入院后确诊日期
    private Date P31;
    //主要诊断编码
    private String P321;
    //主要诊断疾病描述
    private String P322;
    //主要诊断入院病情
    private String P805;
    //主要诊断出院情况
    private String P323;
    //其他诊断编码1
    private String P324;
    //其他诊断疾病描述1
    private String P325;
    //其他诊断入院病情1
    private String P806;
    //其他诊断出院情况1
    private String P326;
    //其他诊断编码2
    private String P327;
    //其他诊断疾病描述2
    private String P328;
    //其他诊断入院病情2
    private String P807;
    //其他诊断出院情况2
    private String P329;
    //其他诊断编码3
    private String P3291;
    //其他诊断疾病描述3
    private String P3292;
    //其他诊断入院病情3
    private String P808;
    //其他诊断出院情况3
    private String P3293;
    //其他诊断编码4
    private String P3294;
    //其他诊断疾病描述4
    private String P3295;
    //其他诊断入院病情4
    private String P809;
    //其他诊断出院情况4
    private String P3296;
    //其他诊断编码5
    private String P3297;
    //其他诊断疾病描述5
    private String P3298;
    //其他诊断入院病情5
    private String P810;
    //其他诊断出院情况5
    private String P3299;
    //其他诊断编码6
    private String P3281;
    //其他诊断疾病描述6
    private String P3282;
    //其他诊断入院病情6
    private String P811;
    //其他诊断出院情况6
    private String P3283;
    //其他诊断编码7
    private String P3284;
    //其他诊断疾病描述7
    private String P3285;
    //其他诊断入院病情7
    private String P812;
    //其他诊断出院情况7
    private String P3286;
    //其他诊断编码8
    private String P3287;
    //其他诊断疾病描述8
    private String P3288;
    //其他诊断入院病情8
    private String P813;
    //其他诊断出院情况8
    private String P3289;
    //其他诊断编码9
    private String P3271;
    //其他诊断疾病描述9
    private String P3272;
    //其他诊断入院病情9
    private String P814;
    //其他诊断出院情况9
    private String P3273;
    //其他诊断编码10
    private String P3274;
    //其他诊断疾病描述10
    private String P3275;
    //其他诊断入院病情10
    private String P815;
    //其他诊断出院情况10
    private String P3276;
    //病理诊断编码1
    private String P351;
    //病理诊断名称1
    private String P352;
    //病理号1
    private String P816;
    //病理诊断编码2
    private String P353;
    //病理诊断名称2
    private String P354;
    //病理号2
    private String P817;
    //病理诊断编码3
    private String P355;
    //病理诊断名称3
    private String P356;
    //病理号3
    private String P818;
    //损伤、中毒的外部因素编码1
    private String P361;
    //损伤、中毒的外部因素名称1
    private String P362;
    //损伤、中毒的外部因素编码2
    private String P363;
    //损伤、中毒的外部因素名称2
    private String P364;
    //损伤、中毒的外部因素编码3
    private String P365;
    //损伤、中毒的外部因素名称3
    private String P366;
    //门诊与出院诊断符合情况
    private String P411;
    //入院与出院诊断符合情况
    private String P412;
    //术前与术后诊断符合情况
    private String P413;
    //临床与病理诊断符合情况
    private String P414;
    //放射与病理诊断符合情况
    private String P415;
    //手术/操作编码1
    private String P490;
    //手术/操作日期1
    private Date P491;
    //手术级别1
    private String P820;
    //手术/操作名称1
    private String P492;
    //手术/操作部位1
    private String P493;
    //手术持续时间1
    private String P494;
    //术者1
    private String P495;
    //Ⅰ助1
    private String P496;
    //Ⅱ助1
    private String P497;
    //麻醉方式1
    private String P498;
    //麻醉分级1
    private String P4981;
    //切口愈合等级1
    private String P499;
    //麻醉医师1
    private String P4910;
    //手术/操作编码2
    private String P4911;
    //手术/操作日期2
    private Date P4912;
    //手术级别2
    private String P821;
    //手术/操作名称2
    private String P4913;
    //手术/操作部位2
    private String P4914;
    //手术持续时间2
    private String P4915;
    //术者2
    private String P4916;
    //Ⅰ助2
    private String P4917;
    //Ⅱ助2
    private String P4918;
    //麻醉方式2
    private String P4919;
    //麻醉分级2
    private String P4982;
    //切口愈合等级2
    private String P4920;
    //麻醉医师2
    private String P4921;
    //手术/操作编码3
    private String P4922;
    //手术/操作日期3
    private Date P4923;
    //手术级别3
    private String P822;
    //手术/操作名称3
    private String P4924;
    //手术/操作部位3
    private String P4925;
    //手术持续时间3
    private String P4526;
    //术者3
    private String P4527;
    //Ⅰ助3
    private String P4528;
    //Ⅱ助3
    private String P4529;
    //麻醉方式3
    private String P4530;
    //麻醉分级3
    private String P4983;
    //切口愈合等级3
    private String P4531;
    //麻醉医师3
    private String P4532;
    //手术/操作编码4
    private String P4533;
    //手术/操作日期4
    private Date P4534;
    //手术级别4
    private String P823;
    //手术/操作名称4
    private String P4535;
    //手术/操作部位4
    private String P4536;
    //手术持续时间4
    private String P4537;
    //术者4
    private String P4538;
    //Ⅰ助4
    private String P4539;
    //Ⅱ助4
    private String P4540;
    //麻醉方式4
    private String P4541;
    //麻醉分级4
    private String P4984;
    //切口愈合等级4
    private String P4542;
    //麻醉医师4
    private String P4543;
    //手术/操作编码5
    private String P4544;
    //手术/操作日期5
    private Date P4545;
    //手术级别5
    private String P824;
    //手术/操作名称5
    private String P4546;
    //手术/操作部位5
    private String P4547;
    //手术持续时间5
    private String P4548;
    //术者5
    private String P4549;
    //Ⅰ助5
    private String P4550;
    //Ⅱ助5
    private String P4551;
    //麻醉方式5
    private String P4552;
    //麻醉分级5
    private String P4985;
    //切口愈合等级5
    private String P4553;
    //麻醉医师5
    private String P4554;
    //手术/操作编码6
    private String P45002;
    //手术/操作日期6
    private Date P45003;
    //手术级别6
    private String P825;
    //手术/操作名称6
    private String P45004;
    //手术/操作部位6
    private String P45005;
    //手术持续时间6
    private String P45006;
    //术者6
    private String P45007;
    //Ⅰ助6
    private String P45008;
    //Ⅱ助6
    private String P45009;
    //麻醉方式6
    private String P45010;
    //麻醉分级6
    private String P45011;
    //切口愈合等级6
    private String P45012;
    //麻醉医师6
    private String P45013;
    //手术/操作编码7
    private String P45014;
    //手术/操作日期7
    private Date P45015;
    //手术级别7
    private String P826;
    //手术/操作名称7
    private String P45016;
    //手术/操作部位7
    private String P45017;
    //手术持续时间7
    private String P45018;
    //术者7
    private String P45019;
    //Ⅰ助7
    private String P45020;
    //Ⅱ助7
    private String P45021;
    //麻醉方式7
    private String P45022;
    //麻醉分级7
    private String P45023;
    //切口愈合等级7
    private String P45024;
    //麻醉医师7
    private String P45025;
    //手术/操作编码8
    private String P45026;
    //手术/操作日期8
    private Date P45027;
    //手术级别8
    private String P827;
    //手术/操作名称8
    private String P45028;
    //手术/操作部位8
    private String P45029;
    //手术持续时间8
    private String P45030;
    //术者8
    private String P45031;
    //Ⅰ助8
    private String P45032;
    //Ⅱ助8
    private String P45033;
    //麻醉方式8
    private String P45034;
    //麻醉分级8
    private String P45035;
    //切口愈合等级8
    private String P45036;
    //麻醉医师8
    private String P45037;
    //手术/操作编码9
    private String P45038;
    //手术/操作日期9
    private Date P45039;
    //手术级别9
    private String P828;
    //手术/操作名称9
    private String P45040;
    //手术/操作部位9
    private String P45041;
    //手术持续时间9
    private String P45042;
    //术者9
    private String P45043;
    //Ⅰ助9
    private String P45044;
    //Ⅱ助9
    private String P45045;
    //麻醉方式9
    private String P45046;
    //麻醉分级9
    private String P45047;
    //切口愈合等级9
    private String P45048;
    //麻醉医师9
    private String P45049;
    //手术/操作编码10
    private String P45050;
    //手术/操作日期10
    private Date P45051;
    //手术级别10
    private String P829;
    //手术/操作名称10
    private String P45052;
    //手术/操作部位10
    private String P45053;
    //手术持续时间10
    private String P45054;
    //术者10
    private String P45055;
    //Ⅰ助10
    private String P45056;
    //Ⅱ助10
    private String P45057;
    //麻醉方式10
    private String P45058;
    //麻醉分级10
    private String P45059;
    //切口愈合等级10
    private String P45060;
    //麻醉医师10
    private String P45061;
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
    //手术/操作名称1标准化手术操作编码1
    private String P492_ICD9_ID1;
    //手术/操作名称1标准化手术操作名称1
    private String P492_ICD9_NAME1;
    //手术/操作名称1标准化手术操作编码2
    private String P492_ICD9_ID2;
    //手术/操作名称1标准化手术操作名称2
    private String P492_ICD9_NAME2;
    //手术/操作名称1标准化手术操作编码3
    private String P492_ICD9_ID3;
    //手术/操作名称1标准化手术操作名称3
    private String P492_ICD9_NAME3;
    //手术/操作名称1标准化手术操作编码4
    private String P492_ICD9_ID4;
    //手术/操作名称1标准化手术操作名称4
    private String P492_ICD9_NAME4;
    //手术/操作名称2标准化手术操作编码1
    private String P4913_ICD9_ID1;
    //手术/操作名称2标准化手术操作名称1
    private String P4913_ICD9_NAME1;
    //手术/操作名称2标准化手术操作编码2
    private String P4913_ICD9_ID2;
    //手术/操作名称2标准化手术操作名称2
    private String P4913_ICD9_NAME2;
    //手术/操作名称2标准化手术操作编码3
    private String P4913_ICD9_ID3;
    //手术/操作名称2标准化手术操作名称3
    private String P4913_ICD9_NAME3;
    //手术/操作名称2标准化手术操作编码4
    private String P4913_ICD9_ID4;
    //手术/操作名称2标准化手术操作名称4
    private String P4913_ICD9_NAME4;
    //手术/操作名称3标准化手术操作编码1
    private String P4924_ICD9_ID1;
    //手术/操作名称3标准化手术操作名称1
    private String P4924_ICD9_NAME1;
    //手术/操作名称3标准化手术操作编码2
    private String P4924_ICD9_ID2;
    //手术/操作名称3标准化手术操作名称2
    private String P4924_ICD9_NAME2;
    //手术/操作名称3标准化手术操作编码3
    private String P4924_ICD9_ID3;
    //手术/操作名称3标准化手术操作名称3
    private String P4924_ICD9_NAME3;
    //手术/操作名称3标准化手术操作编码4
    private String P4924_ICD9_ID4;
    //手术/操作名称3标准化手术操作名称4
    private String P4924_ICD9_NAME4;
    //手术/操作名称4标准化手术操作编码1
    private String P4535_ICD9_ID1;
    //手术/操作名称4标准化手术操作名称1
    private String P4535_ICD9_NAME1;
    //手术/操作名称4标准化手术操作编码2
    private String P4535_ICD9_ID2;
    //手术/操作名称4标准化手术操作名称2
    private String P4535_ICD9_NAME2;
    //手术/操作名称4标准化手术操作编码3
    private String P4535_ICD9_ID3;
    //手术/操作名称4标准化手术操作名称3
    private String P4535_ICD9_NAME3;
    //手术/操作名称4标准化手术操作编码4
    private String P4535_ICD9_ID4;
    //手术/操作名称4标准化手术操作名称4
    private String P4535_ICD9_NAME4;
    //手术/操作名称5标准化手术操作编码1
    private String P4546_ICD9_ID1;
    //手术/操作名称5标准化手术操作名称1
    private String P4546_ICD9_NAME1;
    //手术/操作名称5标准化手术操作编码2
    private String P4546_ICD9_ID2;
    //手术/操作名称5标准化手术操作名称2
    private String P4546_ICD9_NAME2;
    //手术/操作名称5标准化手术操作编码3
    private String P4546_ICD9_ID3;
    //手术/操作名称5标准化手术操作名称3
    private String P4546_ICD9_NAME3;
    //手术/操作名称5标准化手术操作编码4
    private String P4546_ICD9_ID4;
    //手术/操作名称5标准化手术操作名称4
    private String P4546_ICD9_NAME4;
    //手术/操作名称6标准化手术操作编码1
    private String P45004_ICD9_ID1;
    //手术/操作名称6标准化手术操作名称1
    private String P45004_ICD9_NAME1;
    //手术/操作名称6标准化手术操作编码2
    private String P45004_ICD9_ID2;
    //手术/操作名称6标准化手术操作名称2
    private String P45004_ICD9_NAME2;
    //手术/操作名称6标准化手术操作编码3
    private String P45004_ICD9_ID3;
    //手术/操作名称6标准化手术操作名称3
    private String P45004_ICD9_NAME3;
    //手术/操作名称6标准化手术操作编码4
    private String P45004_ICD9_ID4;
    //手术/操作名称6标准化手术操作名称4
    private String P45004_ICD9_NAME4;
    //手术/操作名称7标准化手术操作编码1
    private String P45016_ICD9_ID1;
    //手术/操作名称7标准化手术操作名称1
    private String P45016_ICD9_NAME1;
    //手术/操作名称7标准化手术操作编码2
    private String P45016_ICD9_ID2;
    //手术/操作名称7标准化手术操作名称2
    private String P45016_ICD9_NAME2;
    //手术/操作名称7标准化手术操作编码3
    private String P45016_ICD9_ID3;
    //手术/操作名称7标准化手术操作名称3
    private String P45016_ICD9_NAME3;
    //手术/操作名称7标准化手术操作编码4
    private String P45016_ICD9_ID4;
    //手术/操作名称7标准化手术操作名称4
    private String P45016_ICD9_NAME4;
    //手术/操作名称8标准化手术操作编码1
    private String P45028_ICD9_ID1;
    //手术/操作名称8标准化手术操作名称1
    private String P45028_ICD9_NAME1;
    //手术/操作名称8标准化手术操作编码2
    private String P45028_ICD9_ID2;
    //手术/操作名称8标准化手术操作名称2
    private String P45028_ICD9_NAME2;
    //手术/操作名称8标准化手术操作编码3
    private String P45028_ICD9_ID3;
    //手术/操作名称8标准化手术操作名称3
    private String P45028_ICD9_NAME3;
    //手术/操作名称8标准化手术操作编码4
    private String P45028_ICD9_ID4;
    //手术/操作名称8标准化手术操作名称4
    private String P45028_ICD9_NAME4;
    //手术/操作名称9标准化手术操作编码1
    private String P45040_ICD9_ID1;
    //手术/操作名称9标准化手术操作名称1
    private String P45040_ICD9_NAME1;
    //手术/操作名称9标准化手术操作编码2
    private String P45040_ICD9_ID2;
    //手术/操作名称9标准化手术操作名称2
    private String P45040_ICD9_NAME2;
    //手术/操作名称9标准化手术操作编码3
    private String P45040_ICD9_ID3;
    //手术/操作名称9标准化手术操作名称3
    private String P45040_ICD9_NAME3;
    //手术/操作名称9标准化手术操作编码4
    private String P45040_ICD9_ID4;
    //手术/操作名称9标准化手术操作名称4
    private String P45040_ICD9_NAME4;
    //手术/操作名称10标准化手术操作编码1
    private String P45052_ICD9_ID1;
    //手术/操作名称10标准化手术操作名称1
    private String P45052_ICD9_NAME1;
    //手术/操作名称10标准化手术操作编码2
    private String P45052_ICD9_ID2;
    //手术/操作名称10标准化手术操作名称2
    private String P45052_ICD9_NAME2;
    //手术/操作名称10标准化手术操作编码3
    private String P45052_ICD9_ID3;
    //手术/操作名称10标准化手术操作名称3
    private String P45052_ICD9_NAME3;
    //手术/操作名称10标准化手术操作编码4
    private String P45052_ICD9_ID4;
    //手术/操作名称10标准化手术操作名称4
    private String P45052_ICD9_NAME4;
    //主要诊断标准化诊断编码1
    private String P322_ICD10_ID1;
    //主要诊断标准化诊断名称1
    private String P322_ICD10_NAME1;
    //主要诊断标准化诊断编码2
    private String P322_ICD10_ID2;
    //主要诊断标准化诊断名称2
    private String P322_ICD10_NAME2;
    //主要诊断标准化诊断编码3
    private String P322_ICD10_ID3;
    //主要诊断标准化诊断名称3
    private String P322_ICD10_NAME3;
    //主要诊断标准化诊断编码4
    private String P322_ICD10_ID4;
    //主要诊断标准化诊断名称4
    private String P322_ICD10_NAME4;
    //主要诊断标准化诊断编码5
    private String P322_ICD10_ID5;
    //主要诊断标准化诊断名称5
    private String P322_ICD10_NAME5;
    //主要诊断标准化诊断编码6
    private String P322_ICD10_ID6;
    //主要诊断标准化诊断名称6
    private String P322_ICD10_NAME6;
    //其他诊断1标准化诊断编码1
    private String P325_ICD10_ID1;
    //其他诊断1标准化诊断名称1
    private String P325_ICD10_NAME1;
    //其他诊断1标准化诊断编码2
    private String P325_ICD10_ID2;
    //其他诊断1标准化诊断名称2
    private String P325_ICD10_NAME2;
    //其他诊断1标准化诊断编码3
    private String P325_ICD10_ID3;
    //其他诊断1标准化诊断名称3
    private String P325_ICD10_NAME3;
    //其他诊断1标准化诊断编码4
    private String P325_ICD10_ID4;
    //其他诊断1标准化诊断名称4
    private String P325_ICD10_NAME4;
    //其他诊断1标准化诊断编码5
    private String P325_ICD10_ID5;
    //其他诊断1标准化诊断名称5
    private String P325_ICD10_NAME5;
    //其他诊断1标准化诊断编码6
    private String P325_ICD10_ID6;
    //其他诊断1标准化诊断名称6
    private String P325_ICD10_NAME6;
    //其他诊断2标准化诊断编码1
    private String P328_ICD10_ID1;
    //其他诊断2标准化诊断名称1
    private String P328_ICD10_NAME1;
    //其他诊断2标准化诊断编码2
    private String P328_ICD10_ID2;
    //其他诊断2标准化诊断名称2
    private String P328_ICD10_NAME2;
    //其他诊断2标准化诊断编码3
    private String P328_ICD10_ID3;
    //其他诊断2标准化诊断名称3
    private String P328_ICD10_NAME3;
    //其他诊断2标准化诊断编码4
    private String P328_ICD10_ID4;
    //其他诊断2标准化诊断名称4
    private String P328_ICD10_NAME4;
    //其他诊断2标准化诊断编码5
    private String P328_ICD10_ID5;
    //其他诊断2标准化诊断名称5
    private String P328_ICD10_NAME5;
    //其他诊断2标准化诊断编码6
    private String P328_ICD10_ID6;
    //其他诊断2标准化诊断名称6
    private String P328_ICD10_NAME6;
    //其他诊断3标准化诊断编码1
    private String P3292_ICD10_ID1;
    //其他诊断3标准化诊断名称1
    private String P3292_ICD10_NAME1;
    //其他诊断3标准化诊断编码2
    private String P3292_ICD10_ID2;
    //其他诊断3标准化诊断名称2
    private String P3292_ICD10_NAME2;
    //其他诊断3标准化诊断编码3
    private String P3292_ICD10_ID3;
    //其他诊断3标准化诊断名称3
    private String P3292_ICD10_NAME3;
    //其他诊断3标准化诊断编码4
    private String P3292_ICD10_ID4;
    //其他诊断3标准化诊断名称4
    private String P3292_ICD10_NAME4;
    //其他诊断3标准化诊断编码5
    private String P3292_ICD10_ID5;
    //其他诊断3标准化诊断名称5
    private String P3292_ICD10_NAME5;
    //其他诊断3标准化诊断编码6
    private String P3292_ICD10_ID6;
    //其他诊断3标准化诊断名称6
    private String P3292_ICD10_NAME6;
    //其他诊断4标准化诊断编码1
    private String P3295_ICD10_ID1;
    //其他诊断4标准化诊断名称1
    private String P3295_ICD10_NAME1;
    //其他诊断4标准化诊断编码2
    private String P3295_ICD10_ID2;
    //其他诊断4标准化诊断名称2
    private String P3295_ICD10_NAME2;
    //其他诊断4标准化诊断编码3
    private String P3295_ICD10_ID3;
    //其他诊断4标准化诊断名称3
    private String P3295_ICD10_NAME3;
    //其他诊断4标准化诊断编码4
    private String P3295_ICD10_ID4;
    //其他诊断4标准化诊断名称4
    private String P3295_ICD10_NAME4;
    //其他诊断4标准化诊断编码5
    private String P3295_ICD10_ID5;
    //其他诊断4标准化诊断名称5
    private String P3295_ICD10_NAME5;
    //其他诊断4标准化诊断编码6
    private String P3295_ICD10_ID6;
    //其他诊断4标准化诊断名称6
    private String P3295_ICD10_NAME6;
    //其他诊断5标准化诊断编码1
    private String P3298_ICD10_ID1;
    //其他诊断5标准化诊断名称1
    private String P3298_ICD10_NAME1;
    //其他诊断5标准化诊断编码2
    private String P3298_ICD10_ID2;
    //其他诊断5标准化诊断名称2
    private String P3298_ICD10_NAME2;
    //其他诊断5标准化诊断编码3
    private String P3298_ICD10_ID3;
    //其他诊断5标准化诊断名称3
    private String P3298_ICD10_NAME3;
    //其他诊断5标准化诊断编码4
    private String P3298_ICD10_ID4;
    //其他诊断5标准化诊断名称4
    private String P3298_ICD10_NAME4;
    //其他诊断5标准化诊断编码5
    private String P3298_ICD10_ID5;
    //其他诊断5标准化诊断名称5
    private String P3298_ICD10_NAME5;
    //其他诊断5标准化诊断编码6
    private String P3298_ICD10_ID6;
    //其他诊断5标准化诊断名称6
    private String P3298_ICD10_NAME6;
    //其他诊断6标准化诊断编码1
    private String P3282_ICD10_ID1;
    //其他诊断6标准化诊断名称1
    private String P3282_ICD10_NAME1;
    //其他诊断6标准化诊断编码2
    private String P3282_ICD10_ID2;
    //其他诊断6标准化诊断名称2
    private String P3282_ICD10_NAME2;
    //其他诊断6标准化诊断编码3
    private String P3282_ICD10_ID3;
    //其他诊断6标准化诊断名称3
    private String P3282_ICD10_NAME3;
    //其他诊断6标准化诊断编码4
    private String P3282_ICD10_ID4;
    //其他诊断6标准化诊断名称4
    private String P3282_ICD10_NAME4;
    //其他诊断6标准化诊断编码5
    private String P3282_ICD10_ID5;
    //其他诊断6标准化诊断名称5
    private String P3282_ICD10_NAME5;
    //其他诊断6标准化诊断编码6
    private String P3282_ICD10_ID6;
    //其他诊断6标准化诊断名称6
    private String P3282_ICD10_NAME6;
    //其他诊断7标准化诊断编码1
    private String P3285_ICD10_ID1;
    //其他诊断7标准化诊断名称1
    private String P3285_ICD10_NAME1;
    //其他诊断7标准化诊断编码2
    private String P3285_ICD10_ID2;
    //其他诊断7标准化诊断名称2
    private String P3285_ICD10_NAME2;
    //其他诊断7标准化诊断编码3
    private String P3285_ICD10_ID3;
    //其他诊断7标准化诊断名称3
    private String P3285_ICD10_NAME3;
    //其他诊断7标准化诊断编码4
    private String P3285_ICD10_ID4;
    //其他诊断7标准化诊断名称4
    private String P3285_ICD10_NAME4;
    //其他诊断7标准化诊断编码5
    private String P3285_ICD10_ID5;
    //其他诊断7标准化诊断名称5
    private String P3285_ICD10_NAME5;
    //其他诊断7标准化诊断编码6
    private String P3285_ICD10_ID6;
    //其他诊断7标准化诊断名称6
    private String P3285_ICD10_NAME6;
    //其他诊断8标准化诊断编码1
    private String P3288_ICD10_ID1;
    //其他诊断8标准化诊断名称1
    private String P3288_ICD10_NAME1;
    //其他诊断8标准化诊断编码2
    private String P3288_ICD10_ID2;
    //其他诊断8标准化诊断名称2
    private String P3288_ICD10_NAME2;
    //其他诊断8标准化诊断编码3
    private String P3288_ICD10_ID3;
    //其他诊断8标准化诊断名称3
    private String P3288_ICD10_NAME3;
    //其他诊断8标准化诊断编码4
    private String P3288_ICD10_ID4;
    //其他诊断8标准化诊断名称4
    private String P3288_ICD10_NAME4;
    //其他诊断8标准化诊断编码5
    private String P3288_ICD10_ID5;
    //其他诊断8标准化诊断名称5
    private String P3288_ICD10_NAME5;
    //其他诊断8标准化诊断编码6
    private String P3288_ICD10_ID6;
    //其他诊断8标准化诊断名称6
    private String P3288_ICD10_NAME6;
    //其他诊断9标准化诊断编码1
    private String P3272_ICD10_ID1;
    //其他诊断9标准化诊断名称1
    private String P3272_ICD10_NAME1;
    //其他诊断9标准化诊断编码2
    private String P3272_ICD10_ID2;
    //其他诊断9标准化诊断名称2
    private String P3272_ICD10_NAME2;
    //其他诊断9标准化诊断编码3
    private String P3272_ICD10_ID3;
    //其他诊断9标准化诊断名称3
    private String P3272_ICD10_NAME3;
    //其他诊断9标准化诊断编码4
    private String P3272_ICD10_ID4;
    //其他诊断9标准化诊断名称4
    private String P3272_ICD10_NAME4;
    //其他诊断9标准化诊断编码5
    private String P3272_ICD10_ID5;
    //其他诊断9标准化诊断名称5
    private String P3272_ICD10_NAME5;
    //其他诊断9标准化诊断编码6
    private String P3272_ICD10_ID6;
    //其他诊断9标准化诊断名称6
    private String P3272_ICD10_NAME6;
    //其他诊断10标准化诊断编码1
    private String P3275_ICD10_ID1;
    //其他诊断10标准化诊断名称1
    private String P3275_ICD10_NAME1;
    //其他诊断10标准化诊断编码2
    private String P3275_ICD10_ID2;
    //其他诊断10标准化诊断名称2
    private String P3275_ICD10_NAME2;
    //其他诊断10标准化诊断编码3
    private String P3275_ICD10_ID3;
    //其他诊断10标准化诊断名称3
    private String P3275_ICD10_NAME3;
    //其他诊断10标准化诊断编码4
    private String P3275_ICD10_ID4;
    //其他诊断10标准化诊断名称4
    private String P3275_ICD10_NAME4;
    //其他诊断10标准化诊断编码5
    private String P3275_ICD10_ID5;
    //其他诊断10标准化诊断名称5
    private String P3275_ICD10_NAME5;
    //其他诊断10标准化诊断编码6
    private String P3275_ICD10_ID6;
    //其他诊断10标准化诊断名称6
    private String P3275_ICD10_NAME6;
    //门诊诊断标准化诊断编码1
    private String P281_ICD10_ID1;
    //门诊诊断标准化诊断名称1
    private String P281_ICD10_NAME1;
    //门诊诊断标准化诊断编码2
    private String P281_ICD10_ID2;
    //门诊诊断标准化诊断名称2
    private String P281_ICD10_NAME2;
    //门诊诊断标准化诊断编码3
    private String P281_ICD10_ID3;
    //门诊诊断标准化诊断名称3
    private String P281_ICD10_NAME3;
    //门诊诊断标准化诊断编码4
    private String P281_ICD10_ID4;
    //门诊诊断标准化诊断名称4
    private String P281_ICD10_NAME4;
    //门诊诊断标准化诊断编码5
    private String P281_ICD10_ID5;
    //门诊诊断标准化诊断名称5
    private String P281_ICD10_NAME5;
    //门诊诊断标准化诊断编码6
    private String P281_ICD10_ID6;
    //门诊诊断标准化诊断名称6
    private String P281_ICD10_NAME6;
    //入院诊断标准化诊断编码1
    private String P301_ICD10_ID1;
    //入院诊断标准化诊断名称1
    private String P301_ICD10_NAME1;
    //入院诊断标准化诊断编码2
    private String P301_ICD10_ID2;
    //入院诊断标准化诊断名称2
    private String P301_ICD10_NAME2;
    //入院诊断标准化诊断编码3
    private String P301_ICD10_ID3;
    //入院诊断标准化诊断名称3
    private String P301_ICD10_NAME3;
    //入院诊断标准化诊断编码4
    private String P301_ICD10_ID4;
    //入院诊断标准化诊断名称4
    private String P301_ICD10_NAME4;
    //入院诊断标准化诊断编码5
    private String P301_ICD10_ID5;
    //入院诊断标准化诊断名称5
    private String P301_ICD10_NAME5;
    //入院诊断标准化诊断编码6
    private String P301_ICD10_ID6;
    //入院诊断标准化诊断名称6
    private String P301_ICD10_NAME6;
    //病理诊断名称1标准化诊断编码1
    private String P352_ICD10_ID1;
    //病理诊断名称1标准化诊断名称1
    private String P352_ICD10_NAME1;
    //病理诊断名称1标准化诊断编码2
    private String P352_ICD10_ID2;
    //病理诊断名称1标准化诊断名称2
    private String P352_ICD10_NAME2;
    //病理诊断名称1标准化诊断编码3
    private String P352_ICD10_ID3;
    //病理诊断名称1标准化诊断名称3
    private String P352_ICD10_NAME3;
    //病理诊断名称2标准化诊断编码1
    private String P354_ICD10_ID1;
    //病理诊断名称2标准化诊断名称1
    private String P354_ICD10_NAME1;
    //病理诊断名称2标准化诊断编码2
    private String P354_ICD10_ID2;
    //病理诊断名称2标准化诊断名称2
    private String P354_ICD10_NAME2;
    //病理诊断名称2标准化诊断编码3
    private String P354_ICD10_ID3;
    //病理诊断名称2标准化诊断名称3
    private String P354_ICD10_NAME3;
    //病理诊断名称3标准化诊断编码1
    private String P356_ICD10_ID1;
    //病理诊断名称3标准化诊断名称1
    private String P356_ICD10_NAME1;
    //病理诊断名称3标准化诊断编码2
    private String P356_ICD10_ID2;
    //病理诊断名称3标准化诊断名称2
    private String P356_ICD10_NAME2;
    //病理诊断名称3标准化诊断编码3
    private String P356_ICD10_ID3;
    //病理诊断名称3标准化诊断名称3
    private String P356_ICD10_NAME3;

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
    public String getP28(){
        return P28;
    } 
    public void setP28(String P28) {
         this.P28 = P28;
    } 
    public String getP281(){
        return P281;
    } 
    public void setP281(String P281) {
         this.P281 = P281;
    } 
    public String getP29(){
        return P29;
    } 
    public void setP29(String P29) {
         this.P29 = P29;
    } 
    public String getP30(){
        return P30;
    } 
    public void setP30(String P30) {
         this.P30 = P30;
    } 
    public String getP301(){
        return P301;
    } 
    public void setP301(String P301) {
         this.P301 = P301;
    } 
    public Date getP31(){
        return P31;
    } 
    public void setP31(Date P31) {
         this.P31 = P31;
    } 
    public String getP321(){
        return P321;
    } 
    public void setP321(String P321) {
         this.P321 = P321;
    } 
    public String getP322(){
        return P322;
    } 
    public void setP322(String P322) {
         this.P322 = P322;
    } 
    public String getP805(){
        return P805;
    } 
    public void setP805(String P805) {
         this.P805 = P805;
    } 
    public String getP323(){
        return P323;
    } 
    public void setP323(String P323) {
         this.P323 = P323;
    } 
    public String getP324(){
        return P324;
    } 
    public void setP324(String P324) {
         this.P324 = P324;
    } 
    public String getP325(){
        return P325;
    } 
    public void setP325(String P325) {
         this.P325 = P325;
    } 
    public String getP806(){
        return P806;
    } 
    public void setP806(String P806) {
         this.P806 = P806;
    } 
    public String getP326(){
        return P326;
    } 
    public void setP326(String P326) {
         this.P326 = P326;
    } 
    public String getP327(){
        return P327;
    } 
    public void setP327(String P327) {
         this.P327 = P327;
    } 
    public String getP328(){
        return P328;
    } 
    public void setP328(String P328) {
         this.P328 = P328;
    } 
    public String getP807(){
        return P807;
    } 
    public void setP807(String P807) {
         this.P807 = P807;
    } 
    public String getP329(){
        return P329;
    } 
    public void setP329(String P329) {
         this.P329 = P329;
    } 
    public String getP3291(){
        return P3291;
    } 
    public void setP3291(String P3291) {
         this.P3291 = P3291;
    } 
    public String getP3292(){
        return P3292;
    } 
    public void setP3292(String P3292) {
         this.P3292 = P3292;
    } 
    public String getP808(){
        return P808;
    } 
    public void setP808(String P808) {
         this.P808 = P808;
    } 
    public String getP3293(){
        return P3293;
    } 
    public void setP3293(String P3293) {
         this.P3293 = P3293;
    } 
    public String getP3294(){
        return P3294;
    } 
    public void setP3294(String P3294) {
         this.P3294 = P3294;
    } 
    public String getP3295(){
        return P3295;
    } 
    public void setP3295(String P3295) {
         this.P3295 = P3295;
    } 
    public String getP809(){
        return P809;
    } 
    public void setP809(String P809) {
         this.P809 = P809;
    } 
    public String getP3296(){
        return P3296;
    } 
    public void setP3296(String P3296) {
         this.P3296 = P3296;
    } 
    public String getP3297(){
        return P3297;
    } 
    public void setP3297(String P3297) {
         this.P3297 = P3297;
    } 
    public String getP3298(){
        return P3298;
    } 
    public void setP3298(String P3298) {
         this.P3298 = P3298;
    } 
    public String getP810(){
        return P810;
    } 
    public void setP810(String P810) {
         this.P810 = P810;
    } 
    public String getP3299(){
        return P3299;
    } 
    public void setP3299(String P3299) {
         this.P3299 = P3299;
    } 
    public String getP3281(){
        return P3281;
    } 
    public void setP3281(String P3281) {
         this.P3281 = P3281;
    } 
    public String getP3282(){
        return P3282;
    } 
    public void setP3282(String P3282) {
         this.P3282 = P3282;
    } 
    public String getP811(){
        return P811;
    } 
    public void setP811(String P811) {
         this.P811 = P811;
    } 
    public String getP3283(){
        return P3283;
    } 
    public void setP3283(String P3283) {
         this.P3283 = P3283;
    } 
    public String getP3284(){
        return P3284;
    } 
    public void setP3284(String P3284) {
         this.P3284 = P3284;
    } 
    public String getP3285(){
        return P3285;
    } 
    public void setP3285(String P3285) {
         this.P3285 = P3285;
    } 
    public String getP812(){
        return P812;
    } 
    public void setP812(String P812) {
         this.P812 = P812;
    } 
    public String getP3286(){
        return P3286;
    } 
    public void setP3286(String P3286) {
         this.P3286 = P3286;
    } 
    public String getP3287(){
        return P3287;
    } 
    public void setP3287(String P3287) {
         this.P3287 = P3287;
    } 
    public String getP3288(){
        return P3288;
    } 
    public void setP3288(String P3288) {
         this.P3288 = P3288;
    } 
    public String getP813(){
        return P813;
    } 
    public void setP813(String P813) {
         this.P813 = P813;
    } 
    public String getP3289(){
        return P3289;
    } 
    public void setP3289(String P3289) {
         this.P3289 = P3289;
    } 
    public String getP3271(){
        return P3271;
    } 
    public void setP3271(String P3271) {
         this.P3271 = P3271;
    } 
    public String getP3272(){
        return P3272;
    } 
    public void setP3272(String P3272) {
         this.P3272 = P3272;
    } 
    public String getP814(){
        return P814;
    } 
    public void setP814(String P814) {
         this.P814 = P814;
    } 
    public String getP3273(){
        return P3273;
    } 
    public void setP3273(String P3273) {
         this.P3273 = P3273;
    } 
    public String getP3274(){
        return P3274;
    } 
    public void setP3274(String P3274) {
         this.P3274 = P3274;
    } 
    public String getP3275(){
        return P3275;
    } 
    public void setP3275(String P3275) {
         this.P3275 = P3275;
    } 
    public String getP815(){
        return P815;
    } 
    public void setP815(String P815) {
         this.P815 = P815;
    } 
    public String getP3276(){
        return P3276;
    } 
    public void setP3276(String P3276) {
         this.P3276 = P3276;
    } 
    public String getP351(){
        return P351;
    } 
    public void setP351(String P351) {
         this.P351 = P351;
    } 
    public String getP352(){
        return P352;
    } 
    public void setP352(String P352) {
         this.P352 = P352;
    } 
    public String getP816(){
        return P816;
    } 
    public void setP816(String P816) {
         this.P816 = P816;
    } 
    public String getP353(){
        return P353;
    } 
    public void setP353(String P353) {
         this.P353 = P353;
    } 
    public String getP354(){
        return P354;
    } 
    public void setP354(String P354) {
         this.P354 = P354;
    } 
    public String getP817(){
        return P817;
    } 
    public void setP817(String P817) {
         this.P817 = P817;
    } 
    public String getP355(){
        return P355;
    } 
    public void setP355(String P355) {
         this.P355 = P355;
    } 
    public String getP356(){
        return P356;
    } 
    public void setP356(String P356) {
         this.P356 = P356;
    } 
    public String getP818(){
        return P818;
    } 
    public void setP818(String P818) {
         this.P818 = P818;
    } 
    public String getP361(){
        return P361;
    } 
    public void setP361(String P361) {
         this.P361 = P361;
    } 
    public String getP362(){
        return P362;
    } 
    public void setP362(String P362) {
         this.P362 = P362;
    } 
    public String getP363(){
        return P363;
    } 
    public void setP363(String P363) {
         this.P363 = P363;
    } 
    public String getP364(){
        return P364;
    } 
    public void setP364(String P364) {
         this.P364 = P364;
    } 
    public String getP365(){
        return P365;
    } 
    public void setP365(String P365) {
         this.P365 = P365;
    } 
    public String getP366(){
        return P366;
    } 
    public void setP366(String P366) {
         this.P366 = P366;
    } 
    public String getP411(){
        return P411;
    } 
    public void setP411(String P411) {
         this.P411 = P411;
    } 
    public String getP412(){
        return P412;
    } 
    public void setP412(String P412) {
         this.P412 = P412;
    } 
    public String getP413(){
        return P413;
    } 
    public void setP413(String P413) {
         this.P413 = P413;
    } 
    public String getP414(){
        return P414;
    } 
    public void setP414(String P414) {
         this.P414 = P414;
    } 
    public String getP415(){
        return P415;
    } 
    public void setP415(String P415) {
         this.P415 = P415;
    } 
    public String getP490(){
        return P490;
    } 
    public void setP490(String P490) {
         this.P490 = P490;
    } 
    public Date getP491(){
        return P491;
    } 
    public void setP491(Date P491) {
         this.P491 = P491;
    } 
    public String getP820(){
        return P820;
    } 
    public void setP820(String P820) {
         this.P820 = P820;
    } 
    public String getP492(){
        return P492;
    } 
    public void setP492(String P492) {
         this.P492 = P492;
    } 
    public String getP493(){
        return P493;
    } 
    public void setP493(String P493) {
         this.P493 = P493;
    } 
    public String getP494(){
        return P494;
    } 
    public void setP494(String P494) {
         this.P494 = P494;
    } 
    public String getP495(){
        return P495;
    } 
    public void setP495(String P495) {
         this.P495 = P495;
    } 
    public String getP496(){
        return P496;
    } 
    public void setP496(String P496) {
         this.P496 = P496;
    } 
    public String getP497(){
        return P497;
    } 
    public void setP497(String P497) {
         this.P497 = P497;
    } 
    public String getP498(){
        return P498;
    } 
    public void setP498(String P498) {
         this.P498 = P498;
    } 
    public String getP4981(){
        return P4981;
    } 
    public void setP4981(String P4981) {
         this.P4981 = P4981;
    } 
    public String getP499(){
        return P499;
    } 
    public void setP499(String P499) {
         this.P499 = P499;
    } 
    public String getP4910(){
        return P4910;
    } 
    public void setP4910(String P4910) {
         this.P4910 = P4910;
    } 
    public String getP4911(){
        return P4911;
    } 
    public void setP4911(String P4911) {
         this.P4911 = P4911;
    } 
    public Date getP4912(){
        return P4912;
    } 
    public void setP4912(Date P4912) {
         this.P4912 = P4912;
    } 
    public String getP821(){
        return P821;
    } 
    public void setP821(String P821) {
         this.P821 = P821;
    } 
    public String getP4913(){
        return P4913;
    } 
    public void setP4913(String P4913) {
         this.P4913 = P4913;
    } 
    public String getP4914(){
        return P4914;
    } 
    public void setP4914(String P4914) {
         this.P4914 = P4914;
    } 
    public String getP4915(){
        return P4915;
    } 
    public void setP4915(String P4915) {
         this.P4915 = P4915;
    } 
    public String getP4916(){
        return P4916;
    } 
    public void setP4916(String P4916) {
         this.P4916 = P4916;
    } 
    public String getP4917(){
        return P4917;
    } 
    public void setP4917(String P4917) {
         this.P4917 = P4917;
    } 
    public String getP4918(){
        return P4918;
    } 
    public void setP4918(String P4918) {
         this.P4918 = P4918;
    } 
    public String getP4919(){
        return P4919;
    } 
    public void setP4919(String P4919) {
         this.P4919 = P4919;
    } 
    public String getP4982(){
        return P4982;
    } 
    public void setP4982(String P4982) {
         this.P4982 = P4982;
    } 
    public String getP4920(){
        return P4920;
    } 
    public void setP4920(String P4920) {
         this.P4920 = P4920;
    } 
    public String getP4921(){
        return P4921;
    } 
    public void setP4921(String P4921) {
         this.P4921 = P4921;
    } 
    public String getP4922(){
        return P4922;
    } 
    public void setP4922(String P4922) {
         this.P4922 = P4922;
    } 
    public Date getP4923(){
        return P4923;
    } 
    public void setP4923(Date P4923) {
         this.P4923 = P4923;
    } 
    public String getP822(){
        return P822;
    } 
    public void setP822(String P822) {
         this.P822 = P822;
    } 
    public String getP4924(){
        return P4924;
    } 
    public void setP4924(String P4924) {
         this.P4924 = P4924;
    } 
    public String getP4925(){
        return P4925;
    } 
    public void setP4925(String P4925) {
         this.P4925 = P4925;
    } 
    public String getP4526(){
        return P4526;
    } 
    public void setP4526(String P4526) {
         this.P4526 = P4526;
    } 
    public String getP4527(){
        return P4527;
    } 
    public void setP4527(String P4527) {
         this.P4527 = P4527;
    } 
    public String getP4528(){
        return P4528;
    } 
    public void setP4528(String P4528) {
         this.P4528 = P4528;
    } 
    public String getP4529(){
        return P4529;
    } 
    public void setP4529(String P4529) {
         this.P4529 = P4529;
    } 
    public String getP4530(){
        return P4530;
    } 
    public void setP4530(String P4530) {
         this.P4530 = P4530;
    } 
    public String getP4983(){
        return P4983;
    } 
    public void setP4983(String P4983) {
         this.P4983 = P4983;
    } 
    public String getP4531(){
        return P4531;
    } 
    public void setP4531(String P4531) {
         this.P4531 = P4531;
    } 
    public String getP4532(){
        return P4532;
    } 
    public void setP4532(String P4532) {
         this.P4532 = P4532;
    } 
    public String getP4533(){
        return P4533;
    } 
    public void setP4533(String P4533) {
         this.P4533 = P4533;
    } 
    public Date getP4534(){
        return P4534;
    } 
    public void setP4534(Date P4534) {
         this.P4534 = P4534;
    } 
    public String getP823(){
        return P823;
    } 
    public void setP823(String P823) {
         this.P823 = P823;
    } 
    public String getP4535(){
        return P4535;
    } 
    public void setP4535(String P4535) {
         this.P4535 = P4535;
    } 
    public String getP4536(){
        return P4536;
    } 
    public void setP4536(String P4536) {
         this.P4536 = P4536;
    } 
    public String getP4537(){
        return P4537;
    } 
    public void setP4537(String P4537) {
         this.P4537 = P4537;
    } 
    public String getP4538(){
        return P4538;
    } 
    public void setP4538(String P4538) {
         this.P4538 = P4538;
    } 
    public String getP4539(){
        return P4539;
    } 
    public void setP4539(String P4539) {
         this.P4539 = P4539;
    } 
    public String getP4540(){
        return P4540;
    } 
    public void setP4540(String P4540) {
         this.P4540 = P4540;
    } 
    public String getP4541(){
        return P4541;
    } 
    public void setP4541(String P4541) {
         this.P4541 = P4541;
    } 
    public String getP4984(){
        return P4984;
    } 
    public void setP4984(String P4984) {
         this.P4984 = P4984;
    } 
    public String getP4542(){
        return P4542;
    } 
    public void setP4542(String P4542) {
         this.P4542 = P4542;
    } 
    public String getP4543(){
        return P4543;
    } 
    public void setP4543(String P4543) {
         this.P4543 = P4543;
    } 
    public String getP4544(){
        return P4544;
    } 
    public void setP4544(String P4544) {
         this.P4544 = P4544;
    } 
    public Date getP4545(){
        return P4545;
    } 
    public void setP4545(Date P4545) {
         this.P4545 = P4545;
    } 
    public String getP824(){
        return P824;
    } 
    public void setP824(String P824) {
         this.P824 = P824;
    } 
    public String getP4546(){
        return P4546;
    } 
    public void setP4546(String P4546) {
         this.P4546 = P4546;
    } 
    public String getP4547(){
        return P4547;
    } 
    public void setP4547(String P4547) {
         this.P4547 = P4547;
    } 
    public String getP4548(){
        return P4548;
    } 
    public void setP4548(String P4548) {
         this.P4548 = P4548;
    } 
    public String getP4549(){
        return P4549;
    } 
    public void setP4549(String P4549) {
         this.P4549 = P4549;
    } 
    public String getP4550(){
        return P4550;
    } 
    public void setP4550(String P4550) {
         this.P4550 = P4550;
    } 
    public String getP4551(){
        return P4551;
    } 
    public void setP4551(String P4551) {
         this.P4551 = P4551;
    } 
    public String getP4552(){
        return P4552;
    } 
    public void setP4552(String P4552) {
         this.P4552 = P4552;
    } 
    public String getP4985(){
        return P4985;
    } 
    public void setP4985(String P4985) {
         this.P4985 = P4985;
    } 
    public String getP4553(){
        return P4553;
    } 
    public void setP4553(String P4553) {
         this.P4553 = P4553;
    } 
    public String getP4554(){
        return P4554;
    } 
    public void setP4554(String P4554) {
         this.P4554 = P4554;
    } 
    public String getP45002(){
        return P45002;
    } 
    public void setP45002(String P45002) {
         this.P45002 = P45002;
    } 
    public Date getP45003(){
        return P45003;
    } 
    public void setP45003(Date P45003) {
         this.P45003 = P45003;
    } 
    public String getP825(){
        return P825;
    } 
    public void setP825(String P825) {
         this.P825 = P825;
    } 
    public String getP45004(){
        return P45004;
    } 
    public void setP45004(String P45004) {
         this.P45004 = P45004;
    } 
    public String getP45005(){
        return P45005;
    } 
    public void setP45005(String P45005) {
         this.P45005 = P45005;
    } 
    public String getP45006(){
        return P45006;
    } 
    public void setP45006(String P45006) {
         this.P45006 = P45006;
    } 
    public String getP45007(){
        return P45007;
    } 
    public void setP45007(String P45007) {
         this.P45007 = P45007;
    } 
    public String getP45008(){
        return P45008;
    } 
    public void setP45008(String P45008) {
         this.P45008 = P45008;
    } 
    public String getP45009(){
        return P45009;
    } 
    public void setP45009(String P45009) {
         this.P45009 = P45009;
    } 
    public String getP45010(){
        return P45010;
    } 
    public void setP45010(String P45010) {
         this.P45010 = P45010;
    } 
    public String getP45011(){
        return P45011;
    } 
    public void setP45011(String P45011) {
         this.P45011 = P45011;
    } 
    public String getP45012(){
        return P45012;
    } 
    public void setP45012(String P45012) {
         this.P45012 = P45012;
    } 
    public String getP45013(){
        return P45013;
    } 
    public void setP45013(String P45013) {
         this.P45013 = P45013;
    } 
    public String getP45014(){
        return P45014;
    } 
    public void setP45014(String P45014) {
         this.P45014 = P45014;
    } 
    public Date getP45015(){
        return P45015;
    } 
    public void setP45015(Date P45015) {
         this.P45015 = P45015;
    } 
    public String getP826(){
        return P826;
    } 
    public void setP826(String P826) {
         this.P826 = P826;
    } 
    public String getP45016(){
        return P45016;
    } 
    public void setP45016(String P45016) {
         this.P45016 = P45016;
    } 
    public String getP45017(){
        return P45017;
    } 
    public void setP45017(String P45017) {
         this.P45017 = P45017;
    } 
    public String getP45018(){
        return P45018;
    } 
    public void setP45018(String P45018) {
         this.P45018 = P45018;
    } 
    public String getP45019(){
        return P45019;
    } 
    public void setP45019(String P45019) {
         this.P45019 = P45019;
    } 
    public String getP45020(){
        return P45020;
    } 
    public void setP45020(String P45020) {
         this.P45020 = P45020;
    } 
    public String getP45021(){
        return P45021;
    } 
    public void setP45021(String P45021) {
         this.P45021 = P45021;
    } 
    public String getP45022(){
        return P45022;
    } 
    public void setP45022(String P45022) {
         this.P45022 = P45022;
    } 
    public String getP45023(){
        return P45023;
    } 
    public void setP45023(String P45023) {
         this.P45023 = P45023;
    } 
    public String getP45024(){
        return P45024;
    } 
    public void setP45024(String P45024) {
         this.P45024 = P45024;
    } 
    public String getP45025(){
        return P45025;
    } 
    public void setP45025(String P45025) {
         this.P45025 = P45025;
    } 
    public String getP45026(){
        return P45026;
    } 
    public void setP45026(String P45026) {
         this.P45026 = P45026;
    } 
    public Date getP45027(){
        return P45027;
    } 
    public void setP45027(Date P45027) {
         this.P45027 = P45027;
    } 
    public String getP827(){
        return P827;
    } 
    public void setP827(String P827) {
         this.P827 = P827;
    } 
    public String getP45028(){
        return P45028;
    } 
    public void setP45028(String P45028) {
         this.P45028 = P45028;
    } 
    public String getP45029(){
        return P45029;
    } 
    public void setP45029(String P45029) {
         this.P45029 = P45029;
    } 
    public String getP45030(){
        return P45030;
    } 
    public void setP45030(String P45030) {
         this.P45030 = P45030;
    } 
    public String getP45031(){
        return P45031;
    } 
    public void setP45031(String P45031) {
         this.P45031 = P45031;
    } 
    public String getP45032(){
        return P45032;
    } 
    public void setP45032(String P45032) {
         this.P45032 = P45032;
    } 
    public String getP45033(){
        return P45033;
    } 
    public void setP45033(String P45033) {
         this.P45033 = P45033;
    } 
    public String getP45034(){
        return P45034;
    } 
    public void setP45034(String P45034) {
         this.P45034 = P45034;
    } 
    public String getP45035(){
        return P45035;
    } 
    public void setP45035(String P45035) {
         this.P45035 = P45035;
    } 
    public String getP45036(){
        return P45036;
    } 
    public void setP45036(String P45036) {
         this.P45036 = P45036;
    } 
    public String getP45037(){
        return P45037;
    } 
    public void setP45037(String P45037) {
         this.P45037 = P45037;
    } 
    public String getP45038(){
        return P45038;
    } 
    public void setP45038(String P45038) {
         this.P45038 = P45038;
    } 
    public Date getP45039(){
        return P45039;
    } 
    public void setP45039(Date P45039) {
         this.P45039 = P45039;
    } 
    public String getP828(){
        return P828;
    } 
    public void setP828(String P828) {
         this.P828 = P828;
    } 
    public String getP45040(){
        return P45040;
    } 
    public void setP45040(String P45040) {
         this.P45040 = P45040;
    } 
    public String getP45041(){
        return P45041;
    } 
    public void setP45041(String P45041) {
         this.P45041 = P45041;
    } 
    public String getP45042(){
        return P45042;
    } 
    public void setP45042(String P45042) {
         this.P45042 = P45042;
    } 
    public String getP45043(){
        return P45043;
    } 
    public void setP45043(String P45043) {
         this.P45043 = P45043;
    } 
    public String getP45044(){
        return P45044;
    } 
    public void setP45044(String P45044) {
         this.P45044 = P45044;
    } 
    public String getP45045(){
        return P45045;
    } 
    public void setP45045(String P45045) {
         this.P45045 = P45045;
    } 
    public String getP45046(){
        return P45046;
    } 
    public void setP45046(String P45046) {
         this.P45046 = P45046;
    } 
    public String getP45047(){
        return P45047;
    } 
    public void setP45047(String P45047) {
         this.P45047 = P45047;
    } 
    public String getP45048(){
        return P45048;
    } 
    public void setP45048(String P45048) {
         this.P45048 = P45048;
    } 
    public String getP45049(){
        return P45049;
    } 
    public void setP45049(String P45049) {
         this.P45049 = P45049;
    } 
    public String getP45050(){
        return P45050;
    } 
    public void setP45050(String P45050) {
         this.P45050 = P45050;
    } 
    public Date getP45051(){
        return P45051;
    } 
    public void setP45051(Date P45051) {
         this.P45051 = P45051;
    } 
    public String getP829(){
        return P829;
    } 
    public void setP829(String P829) {
         this.P829 = P829;
    } 
    public String getP45052(){
        return P45052;
    } 
    public void setP45052(String P45052) {
         this.P45052 = P45052;
    } 
    public String getP45053(){
        return P45053;
    } 
    public void setP45053(String P45053) {
         this.P45053 = P45053;
    } 
    public String getP45054(){
        return P45054;
    } 
    public void setP45054(String P45054) {
         this.P45054 = P45054;
    } 
    public String getP45055(){
        return P45055;
    } 
    public void setP45055(String P45055) {
         this.P45055 = P45055;
    } 
    public String getP45056(){
        return P45056;
    } 
    public void setP45056(String P45056) {
         this.P45056 = P45056;
    } 
    public String getP45057(){
        return P45057;
    } 
    public void setP45057(String P45057) {
         this.P45057 = P45057;
    } 
    public String getP45058(){
        return P45058;
    } 
    public void setP45058(String P45058) {
         this.P45058 = P45058;
    } 
    public String getP45059(){
        return P45059;
    } 
    public void setP45059(String P45059) {
         this.P45059 = P45059;
    } 
    public String getP45060(){
        return P45060;
    } 
    public void setP45060(String P45060) {
         this.P45060 = P45060;
    } 
    public String getP45061(){
        return P45061;
    } 
    public void setP45061(String P45061) {
         this.P45061 = P45061;
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
    public String getP492_ICD9_ID1(){
        return P492_ICD9_ID1;
    } 
    public void setP492_ICD9_ID1(String P492_ICD9_ID1) {
         this.P492_ICD9_ID1 = P492_ICD9_ID1;
    } 
    public String getP492_ICD9_NAME1(){
        return P492_ICD9_NAME1;
    } 
    public void setP492_ICD9_NAME1(String P492_ICD9_NAME1) {
         this.P492_ICD9_NAME1 = P492_ICD9_NAME1;
    } 
    public String getP492_ICD9_ID2(){
        return P492_ICD9_ID2;
    } 
    public void setP492_ICD9_ID2(String P492_ICD9_ID2) {
         this.P492_ICD9_ID2 = P492_ICD9_ID2;
    } 
    public String getP492_ICD9_NAME2(){
        return P492_ICD9_NAME2;
    } 
    public void setP492_ICD9_NAME2(String P492_ICD9_NAME2) {
         this.P492_ICD9_NAME2 = P492_ICD9_NAME2;
    } 
    public String getP492_ICD9_ID3(){
        return P492_ICD9_ID3;
    } 
    public void setP492_ICD9_ID3(String P492_ICD9_ID3) {
         this.P492_ICD9_ID3 = P492_ICD9_ID3;
    } 
    public String getP492_ICD9_NAME3(){
        return P492_ICD9_NAME3;
    } 
    public void setP492_ICD9_NAME3(String P492_ICD9_NAME3) {
         this.P492_ICD9_NAME3 = P492_ICD9_NAME3;
    } 
    public String getP492_ICD9_ID4(){
        return P492_ICD9_ID4;
    } 
    public void setP492_ICD9_ID4(String P492_ICD9_ID4) {
         this.P492_ICD9_ID4 = P492_ICD9_ID4;
    } 
    public String getP492_ICD9_NAME4(){
        return P492_ICD9_NAME4;
    } 
    public void setP492_ICD9_NAME4(String P492_ICD9_NAME4) {
         this.P492_ICD9_NAME4 = P492_ICD9_NAME4;
    } 
    public String getP4913_ICD9_ID1(){
        return P4913_ICD9_ID1;
    } 
    public void setP4913_ICD9_ID1(String P4913_ICD9_ID1) {
         this.P4913_ICD9_ID1 = P4913_ICD9_ID1;
    } 
    public String getP4913_ICD9_NAME1(){
        return P4913_ICD9_NAME1;
    } 
    public void setP4913_ICD9_NAME1(String P4913_ICD9_NAME1) {
         this.P4913_ICD9_NAME1 = P4913_ICD9_NAME1;
    } 
    public String getP4913_ICD9_ID2(){
        return P4913_ICD9_ID2;
    } 
    public void setP4913_ICD9_ID2(String P4913_ICD9_ID2) {
         this.P4913_ICD9_ID2 = P4913_ICD9_ID2;
    } 
    public String getP4913_ICD9_NAME2(){
        return P4913_ICD9_NAME2;
    } 
    public void setP4913_ICD9_NAME2(String P4913_ICD9_NAME2) {
         this.P4913_ICD9_NAME2 = P4913_ICD9_NAME2;
    } 
    public String getP4913_ICD9_ID3(){
        return P4913_ICD9_ID3;
    } 
    public void setP4913_ICD9_ID3(String P4913_ICD9_ID3) {
         this.P4913_ICD9_ID3 = P4913_ICD9_ID3;
    } 
    public String getP4913_ICD9_NAME3(){
        return P4913_ICD9_NAME3;
    } 
    public void setP4913_ICD9_NAME3(String P4913_ICD9_NAME3) {
         this.P4913_ICD9_NAME3 = P4913_ICD9_NAME3;
    } 
    public String getP4913_ICD9_ID4(){
        return P4913_ICD9_ID4;
    } 
    public void setP4913_ICD9_ID4(String P4913_ICD9_ID4) {
         this.P4913_ICD9_ID4 = P4913_ICD9_ID4;
    } 
    public String getP4913_ICD9_NAME4(){
        return P4913_ICD9_NAME4;
    } 
    public void setP4913_ICD9_NAME4(String P4913_ICD9_NAME4) {
         this.P4913_ICD9_NAME4 = P4913_ICD9_NAME4;
    } 
    public String getP4924_ICD9_ID1(){
        return P4924_ICD9_ID1;
    } 
    public void setP4924_ICD9_ID1(String P4924_ICD9_ID1) {
         this.P4924_ICD9_ID1 = P4924_ICD9_ID1;
    } 
    public String getP4924_ICD9_NAME1(){
        return P4924_ICD9_NAME1;
    } 
    public void setP4924_ICD9_NAME1(String P4924_ICD9_NAME1) {
         this.P4924_ICD9_NAME1 = P4924_ICD9_NAME1;
    } 
    public String getP4924_ICD9_ID2(){
        return P4924_ICD9_ID2;
    } 
    public void setP4924_ICD9_ID2(String P4924_ICD9_ID2) {
         this.P4924_ICD9_ID2 = P4924_ICD9_ID2;
    } 
    public String getP4924_ICD9_NAME2(){
        return P4924_ICD9_NAME2;
    } 
    public void setP4924_ICD9_NAME2(String P4924_ICD9_NAME2) {
         this.P4924_ICD9_NAME2 = P4924_ICD9_NAME2;
    } 
    public String getP4924_ICD9_ID3(){
        return P4924_ICD9_ID3;
    } 
    public void setP4924_ICD9_ID3(String P4924_ICD9_ID3) {
         this.P4924_ICD9_ID3 = P4924_ICD9_ID3;
    } 
    public String getP4924_ICD9_NAME3(){
        return P4924_ICD9_NAME3;
    } 
    public void setP4924_ICD9_NAME3(String P4924_ICD9_NAME3) {
         this.P4924_ICD9_NAME3 = P4924_ICD9_NAME3;
    } 
    public String getP4924_ICD9_ID4(){
        return P4924_ICD9_ID4;
    } 
    public void setP4924_ICD9_ID4(String P4924_ICD9_ID4) {
         this.P4924_ICD9_ID4 = P4924_ICD9_ID4;
    } 
    public String getP4924_ICD9_NAME4(){
        return P4924_ICD9_NAME4;
    } 
    public void setP4924_ICD9_NAME4(String P4924_ICD9_NAME4) {
         this.P4924_ICD9_NAME4 = P4924_ICD9_NAME4;
    } 
    public String getP4535_ICD9_ID1(){
        return P4535_ICD9_ID1;
    } 
    public void setP4535_ICD9_ID1(String P4535_ICD9_ID1) {
         this.P4535_ICD9_ID1 = P4535_ICD9_ID1;
    } 
    public String getP4535_ICD9_NAME1(){
        return P4535_ICD9_NAME1;
    } 
    public void setP4535_ICD9_NAME1(String P4535_ICD9_NAME1) {
         this.P4535_ICD9_NAME1 = P4535_ICD9_NAME1;
    } 
    public String getP4535_ICD9_ID2(){
        return P4535_ICD9_ID2;
    } 
    public void setP4535_ICD9_ID2(String P4535_ICD9_ID2) {
         this.P4535_ICD9_ID2 = P4535_ICD9_ID2;
    } 
    public String getP4535_ICD9_NAME2(){
        return P4535_ICD9_NAME2;
    } 
    public void setP4535_ICD9_NAME2(String P4535_ICD9_NAME2) {
         this.P4535_ICD9_NAME2 = P4535_ICD9_NAME2;
    } 
    public String getP4535_ICD9_ID3(){
        return P4535_ICD9_ID3;
    } 
    public void setP4535_ICD9_ID3(String P4535_ICD9_ID3) {
         this.P4535_ICD9_ID3 = P4535_ICD9_ID3;
    } 
    public String getP4535_ICD9_NAME3(){
        return P4535_ICD9_NAME3;
    } 
    public void setP4535_ICD9_NAME3(String P4535_ICD9_NAME3) {
         this.P4535_ICD9_NAME3 = P4535_ICD9_NAME3;
    } 
    public String getP4535_ICD9_ID4(){
        return P4535_ICD9_ID4;
    } 
    public void setP4535_ICD9_ID4(String P4535_ICD9_ID4) {
         this.P4535_ICD9_ID4 = P4535_ICD9_ID4;
    } 
    public String getP4535_ICD9_NAME4(){
        return P4535_ICD9_NAME4;
    } 
    public void setP4535_ICD9_NAME4(String P4535_ICD9_NAME4) {
         this.P4535_ICD9_NAME4 = P4535_ICD9_NAME4;
    } 
    public String getP4546_ICD9_ID1(){
        return P4546_ICD9_ID1;
    } 
    public void setP4546_ICD9_ID1(String P4546_ICD9_ID1) {
         this.P4546_ICD9_ID1 = P4546_ICD9_ID1;
    } 
    public String getP4546_ICD9_NAME1(){
        return P4546_ICD9_NAME1;
    } 
    public void setP4546_ICD9_NAME1(String P4546_ICD9_NAME1) {
         this.P4546_ICD9_NAME1 = P4546_ICD9_NAME1;
    } 
    public String getP4546_ICD9_ID2(){
        return P4546_ICD9_ID2;
    } 
    public void setP4546_ICD9_ID2(String P4546_ICD9_ID2) {
         this.P4546_ICD9_ID2 = P4546_ICD9_ID2;
    } 
    public String getP4546_ICD9_NAME2(){
        return P4546_ICD9_NAME2;
    } 
    public void setP4546_ICD9_NAME2(String P4546_ICD9_NAME2) {
         this.P4546_ICD9_NAME2 = P4546_ICD9_NAME2;
    } 
    public String getP4546_ICD9_ID3(){
        return P4546_ICD9_ID3;
    } 
    public void setP4546_ICD9_ID3(String P4546_ICD9_ID3) {
         this.P4546_ICD9_ID3 = P4546_ICD9_ID3;
    } 
    public String getP4546_ICD9_NAME3(){
        return P4546_ICD9_NAME3;
    } 
    public void setP4546_ICD9_NAME3(String P4546_ICD9_NAME3) {
         this.P4546_ICD9_NAME3 = P4546_ICD9_NAME3;
    } 
    public String getP4546_ICD9_ID4(){
        return P4546_ICD9_ID4;
    } 
    public void setP4546_ICD9_ID4(String P4546_ICD9_ID4) {
         this.P4546_ICD9_ID4 = P4546_ICD9_ID4;
    } 
    public String getP4546_ICD9_NAME4(){
        return P4546_ICD9_NAME4;
    } 
    public void setP4546_ICD9_NAME4(String P4546_ICD9_NAME4) {
         this.P4546_ICD9_NAME4 = P4546_ICD9_NAME4;
    } 
    public String getP45004_ICD9_ID1(){
        return P45004_ICD9_ID1;
    } 
    public void setP45004_ICD9_ID1(String P45004_ICD9_ID1) {
         this.P45004_ICD9_ID1 = P45004_ICD9_ID1;
    } 
    public String getP45004_ICD9_NAME1(){
        return P45004_ICD9_NAME1;
    } 
    public void setP45004_ICD9_NAME1(String P45004_ICD9_NAME1) {
         this.P45004_ICD9_NAME1 = P45004_ICD9_NAME1;
    } 
    public String getP45004_ICD9_ID2(){
        return P45004_ICD9_ID2;
    } 
    public void setP45004_ICD9_ID2(String P45004_ICD9_ID2) {
         this.P45004_ICD9_ID2 = P45004_ICD9_ID2;
    } 
    public String getP45004_ICD9_NAME2(){
        return P45004_ICD9_NAME2;
    } 
    public void setP45004_ICD9_NAME2(String P45004_ICD9_NAME2) {
         this.P45004_ICD9_NAME2 = P45004_ICD9_NAME2;
    } 
    public String getP45004_ICD9_ID3(){
        return P45004_ICD9_ID3;
    } 
    public void setP45004_ICD9_ID3(String P45004_ICD9_ID3) {
         this.P45004_ICD9_ID3 = P45004_ICD9_ID3;
    } 
    public String getP45004_ICD9_NAME3(){
        return P45004_ICD9_NAME3;
    } 
    public void setP45004_ICD9_NAME3(String P45004_ICD9_NAME3) {
         this.P45004_ICD9_NAME3 = P45004_ICD9_NAME3;
    } 
    public String getP45004_ICD9_ID4(){
        return P45004_ICD9_ID4;
    } 
    public void setP45004_ICD9_ID4(String P45004_ICD9_ID4) {
         this.P45004_ICD9_ID4 = P45004_ICD9_ID4;
    } 
    public String getP45004_ICD9_NAME4(){
        return P45004_ICD9_NAME4;
    } 
    public void setP45004_ICD9_NAME4(String P45004_ICD9_NAME4) {
         this.P45004_ICD9_NAME4 = P45004_ICD9_NAME4;
    } 
    public String getP45016_ICD9_ID1(){
        return P45016_ICD9_ID1;
    } 
    public void setP45016_ICD9_ID1(String P45016_ICD9_ID1) {
         this.P45016_ICD9_ID1 = P45016_ICD9_ID1;
    } 
    public String getP45016_ICD9_NAME1(){
        return P45016_ICD9_NAME1;
    } 
    public void setP45016_ICD9_NAME1(String P45016_ICD9_NAME1) {
         this.P45016_ICD9_NAME1 = P45016_ICD9_NAME1;
    } 
    public String getP45016_ICD9_ID2(){
        return P45016_ICD9_ID2;
    } 
    public void setP45016_ICD9_ID2(String P45016_ICD9_ID2) {
         this.P45016_ICD9_ID2 = P45016_ICD9_ID2;
    } 
    public String getP45016_ICD9_NAME2(){
        return P45016_ICD9_NAME2;
    } 
    public void setP45016_ICD9_NAME2(String P45016_ICD9_NAME2) {
         this.P45016_ICD9_NAME2 = P45016_ICD9_NAME2;
    } 
    public String getP45016_ICD9_ID3(){
        return P45016_ICD9_ID3;
    } 
    public void setP45016_ICD9_ID3(String P45016_ICD9_ID3) {
         this.P45016_ICD9_ID3 = P45016_ICD9_ID3;
    } 
    public String getP45016_ICD9_NAME3(){
        return P45016_ICD9_NAME3;
    } 
    public void setP45016_ICD9_NAME3(String P45016_ICD9_NAME3) {
         this.P45016_ICD9_NAME3 = P45016_ICD9_NAME3;
    } 
    public String getP45016_ICD9_ID4(){
        return P45016_ICD9_ID4;
    } 
    public void setP45016_ICD9_ID4(String P45016_ICD9_ID4) {
         this.P45016_ICD9_ID4 = P45016_ICD9_ID4;
    } 
    public String getP45016_ICD9_NAME4(){
        return P45016_ICD9_NAME4;
    } 
    public void setP45016_ICD9_NAME4(String P45016_ICD9_NAME4) {
         this.P45016_ICD9_NAME4 = P45016_ICD9_NAME4;
    } 
    public String getP45028_ICD9_ID1(){
        return P45028_ICD9_ID1;
    } 
    public void setP45028_ICD9_ID1(String P45028_ICD9_ID1) {
         this.P45028_ICD9_ID1 = P45028_ICD9_ID1;
    } 
    public String getP45028_ICD9_NAME1(){
        return P45028_ICD9_NAME1;
    } 
    public void setP45028_ICD9_NAME1(String P45028_ICD9_NAME1) {
         this.P45028_ICD9_NAME1 = P45028_ICD9_NAME1;
    } 
    public String getP45028_ICD9_ID2(){
        return P45028_ICD9_ID2;
    } 
    public void setP45028_ICD9_ID2(String P45028_ICD9_ID2) {
         this.P45028_ICD9_ID2 = P45028_ICD9_ID2;
    } 
    public String getP45028_ICD9_NAME2(){
        return P45028_ICD9_NAME2;
    } 
    public void setP45028_ICD9_NAME2(String P45028_ICD9_NAME2) {
         this.P45028_ICD9_NAME2 = P45028_ICD9_NAME2;
    } 
    public String getP45028_ICD9_ID3(){
        return P45028_ICD9_ID3;
    } 
    public void setP45028_ICD9_ID3(String P45028_ICD9_ID3) {
         this.P45028_ICD9_ID3 = P45028_ICD9_ID3;
    } 
    public String getP45028_ICD9_NAME3(){
        return P45028_ICD9_NAME3;
    } 
    public void setP45028_ICD9_NAME3(String P45028_ICD9_NAME3) {
         this.P45028_ICD9_NAME3 = P45028_ICD9_NAME3;
    } 
    public String getP45028_ICD9_ID4(){
        return P45028_ICD9_ID4;
    } 
    public void setP45028_ICD9_ID4(String P45028_ICD9_ID4) {
         this.P45028_ICD9_ID4 = P45028_ICD9_ID4;
    } 
    public String getP45028_ICD9_NAME4(){
        return P45028_ICD9_NAME4;
    } 
    public void setP45028_ICD9_NAME4(String P45028_ICD9_NAME4) {
         this.P45028_ICD9_NAME4 = P45028_ICD9_NAME4;
    } 
    public String getP45040_ICD9_ID1(){
        return P45040_ICD9_ID1;
    } 
    public void setP45040_ICD9_ID1(String P45040_ICD9_ID1) {
         this.P45040_ICD9_ID1 = P45040_ICD9_ID1;
    } 
    public String getP45040_ICD9_NAME1(){
        return P45040_ICD9_NAME1;
    } 
    public void setP45040_ICD9_NAME1(String P45040_ICD9_NAME1) {
         this.P45040_ICD9_NAME1 = P45040_ICD9_NAME1;
    } 
    public String getP45040_ICD9_ID2(){
        return P45040_ICD9_ID2;
    } 
    public void setP45040_ICD9_ID2(String P45040_ICD9_ID2) {
         this.P45040_ICD9_ID2 = P45040_ICD9_ID2;
    } 
    public String getP45040_ICD9_NAME2(){
        return P45040_ICD9_NAME2;
    } 
    public void setP45040_ICD9_NAME2(String P45040_ICD9_NAME2) {
         this.P45040_ICD9_NAME2 = P45040_ICD9_NAME2;
    } 
    public String getP45040_ICD9_ID3(){
        return P45040_ICD9_ID3;
    } 
    public void setP45040_ICD9_ID3(String P45040_ICD9_ID3) {
         this.P45040_ICD9_ID3 = P45040_ICD9_ID3;
    } 
    public String getP45040_ICD9_NAME3(){
        return P45040_ICD9_NAME3;
    } 
    public void setP45040_ICD9_NAME3(String P45040_ICD9_NAME3) {
         this.P45040_ICD9_NAME3 = P45040_ICD9_NAME3;
    } 
    public String getP45040_ICD9_ID4(){
        return P45040_ICD9_ID4;
    } 
    public void setP45040_ICD9_ID4(String P45040_ICD9_ID4) {
         this.P45040_ICD9_ID4 = P45040_ICD9_ID4;
    } 
    public String getP45040_ICD9_NAME4(){
        return P45040_ICD9_NAME4;
    } 
    public void setP45040_ICD9_NAME4(String P45040_ICD9_NAME4) {
         this.P45040_ICD9_NAME4 = P45040_ICD9_NAME4;
    } 
    public String getP45052_ICD9_ID1(){
        return P45052_ICD9_ID1;
    } 
    public void setP45052_ICD9_ID1(String P45052_ICD9_ID1) {
         this.P45052_ICD9_ID1 = P45052_ICD9_ID1;
    } 
    public String getP45052_ICD9_NAME1(){
        return P45052_ICD9_NAME1;
    } 
    public void setP45052_ICD9_NAME1(String P45052_ICD9_NAME1) {
         this.P45052_ICD9_NAME1 = P45052_ICD9_NAME1;
    } 
    public String getP45052_ICD9_ID2(){
        return P45052_ICD9_ID2;
    } 
    public void setP45052_ICD9_ID2(String P45052_ICD9_ID2) {
         this.P45052_ICD9_ID2 = P45052_ICD9_ID2;
    } 
    public String getP45052_ICD9_NAME2(){
        return P45052_ICD9_NAME2;
    } 
    public void setP45052_ICD9_NAME2(String P45052_ICD9_NAME2) {
         this.P45052_ICD9_NAME2 = P45052_ICD9_NAME2;
    } 
    public String getP45052_ICD9_ID3(){
        return P45052_ICD9_ID3;
    } 
    public void setP45052_ICD9_ID3(String P45052_ICD9_ID3) {
         this.P45052_ICD9_ID3 = P45052_ICD9_ID3;
    } 
    public String getP45052_ICD9_NAME3(){
        return P45052_ICD9_NAME3;
    } 
    public void setP45052_ICD9_NAME3(String P45052_ICD9_NAME3) {
         this.P45052_ICD9_NAME3 = P45052_ICD9_NAME3;
    } 
    public String getP45052_ICD9_ID4(){
        return P45052_ICD9_ID4;
    } 
    public void setP45052_ICD9_ID4(String P45052_ICD9_ID4) {
         this.P45052_ICD9_ID4 = P45052_ICD9_ID4;
    } 
    public String getP45052_ICD9_NAME4(){
        return P45052_ICD9_NAME4;
    } 
    public void setP45052_ICD9_NAME4(String P45052_ICD9_NAME4) {
         this.P45052_ICD9_NAME4 = P45052_ICD9_NAME4;
    } 
    public String getP322_ICD10_ID1(){
        return P322_ICD10_ID1;
    } 
    public void setP322_ICD10_ID1(String P322_ICD10_ID1) {
         this.P322_ICD10_ID1 = P322_ICD10_ID1;
    } 
    public String getP322_ICD10_NAME1(){
        return P322_ICD10_NAME1;
    } 
    public void setP322_ICD10_NAME1(String P322_ICD10_NAME1) {
         this.P322_ICD10_NAME1 = P322_ICD10_NAME1;
    } 
    public String getP322_ICD10_ID2(){
        return P322_ICD10_ID2;
    } 
    public void setP322_ICD10_ID2(String P322_ICD10_ID2) {
         this.P322_ICD10_ID2 = P322_ICD10_ID2;
    } 
    public String getP322_ICD10_NAME2(){
        return P322_ICD10_NAME2;
    } 
    public void setP322_ICD10_NAME2(String P322_ICD10_NAME2) {
         this.P322_ICD10_NAME2 = P322_ICD10_NAME2;
    } 
    public String getP322_ICD10_ID3(){
        return P322_ICD10_ID3;
    } 
    public void setP322_ICD10_ID3(String P322_ICD10_ID3) {
         this.P322_ICD10_ID3 = P322_ICD10_ID3;
    } 
    public String getP322_ICD10_NAME3(){
        return P322_ICD10_NAME3;
    } 
    public void setP322_ICD10_NAME3(String P322_ICD10_NAME3) {
         this.P322_ICD10_NAME3 = P322_ICD10_NAME3;
    } 
    public String getP322_ICD10_ID4(){
        return P322_ICD10_ID4;
    } 
    public void setP322_ICD10_ID4(String P322_ICD10_ID4) {
         this.P322_ICD10_ID4 = P322_ICD10_ID4;
    } 
    public String getP322_ICD10_NAME4(){
        return P322_ICD10_NAME4;
    } 
    public void setP322_ICD10_NAME4(String P322_ICD10_NAME4) {
         this.P322_ICD10_NAME4 = P322_ICD10_NAME4;
    } 
    public String getP322_ICD10_ID5(){
        return P322_ICD10_ID5;
    } 
    public void setP322_ICD10_ID5(String P322_ICD10_ID5) {
         this.P322_ICD10_ID5 = P322_ICD10_ID5;
    } 
    public String getP322_ICD10_NAME5(){
        return P322_ICD10_NAME5;
    } 
    public void setP322_ICD10_NAME5(String P322_ICD10_NAME5) {
         this.P322_ICD10_NAME5 = P322_ICD10_NAME5;
    } 
    public String getP322_ICD10_ID6(){
        return P322_ICD10_ID6;
    } 
    public void setP322_ICD10_ID6(String P322_ICD10_ID6) {
         this.P322_ICD10_ID6 = P322_ICD10_ID6;
    } 
    public String getP322_ICD10_NAME6(){
        return P322_ICD10_NAME6;
    } 
    public void setP322_ICD10_NAME6(String P322_ICD10_NAME6) {
         this.P322_ICD10_NAME6 = P322_ICD10_NAME6;
    } 
    public String getP325_ICD10_ID1(){
        return P325_ICD10_ID1;
    } 
    public void setP325_ICD10_ID1(String P325_ICD10_ID1) {
         this.P325_ICD10_ID1 = P325_ICD10_ID1;
    } 
    public String getP325_ICD10_NAME1(){
        return P325_ICD10_NAME1;
    } 
    public void setP325_ICD10_NAME1(String P325_ICD10_NAME1) {
         this.P325_ICD10_NAME1 = P325_ICD10_NAME1;
    } 
    public String getP325_ICD10_ID2(){
        return P325_ICD10_ID2;
    } 
    public void setP325_ICD10_ID2(String P325_ICD10_ID2) {
         this.P325_ICD10_ID2 = P325_ICD10_ID2;
    } 
    public String getP325_ICD10_NAME2(){
        return P325_ICD10_NAME2;
    } 
    public void setP325_ICD10_NAME2(String P325_ICD10_NAME2) {
         this.P325_ICD10_NAME2 = P325_ICD10_NAME2;
    } 
    public String getP325_ICD10_ID3(){
        return P325_ICD10_ID3;
    } 
    public void setP325_ICD10_ID3(String P325_ICD10_ID3) {
         this.P325_ICD10_ID3 = P325_ICD10_ID3;
    } 
    public String getP325_ICD10_NAME3(){
        return P325_ICD10_NAME3;
    } 
    public void setP325_ICD10_NAME3(String P325_ICD10_NAME3) {
         this.P325_ICD10_NAME3 = P325_ICD10_NAME3;
    } 
    public String getP325_ICD10_ID4(){
        return P325_ICD10_ID4;
    } 
    public void setP325_ICD10_ID4(String P325_ICD10_ID4) {
         this.P325_ICD10_ID4 = P325_ICD10_ID4;
    } 
    public String getP325_ICD10_NAME4(){
        return P325_ICD10_NAME4;
    } 
    public void setP325_ICD10_NAME4(String P325_ICD10_NAME4) {
         this.P325_ICD10_NAME4 = P325_ICD10_NAME4;
    } 
    public String getP325_ICD10_ID5(){
        return P325_ICD10_ID5;
    } 
    public void setP325_ICD10_ID5(String P325_ICD10_ID5) {
         this.P325_ICD10_ID5 = P325_ICD10_ID5;
    } 
    public String getP325_ICD10_NAME5(){
        return P325_ICD10_NAME5;
    } 
    public void setP325_ICD10_NAME5(String P325_ICD10_NAME5) {
         this.P325_ICD10_NAME5 = P325_ICD10_NAME5;
    } 
    public String getP325_ICD10_ID6(){
        return P325_ICD10_ID6;
    } 
    public void setP325_ICD10_ID6(String P325_ICD10_ID6) {
         this.P325_ICD10_ID6 = P325_ICD10_ID6;
    } 
    public String getP325_ICD10_NAME6(){
        return P325_ICD10_NAME6;
    } 
    public void setP325_ICD10_NAME6(String P325_ICD10_NAME6) {
         this.P325_ICD10_NAME6 = P325_ICD10_NAME6;
    } 
    public String getP328_ICD10_ID1(){
        return P328_ICD10_ID1;
    } 
    public void setP328_ICD10_ID1(String P328_ICD10_ID1) {
         this.P328_ICD10_ID1 = P328_ICD10_ID1;
    } 
    public String getP328_ICD10_NAME1(){
        return P328_ICD10_NAME1;
    } 
    public void setP328_ICD10_NAME1(String P328_ICD10_NAME1) {
         this.P328_ICD10_NAME1 = P328_ICD10_NAME1;
    } 
    public String getP328_ICD10_ID2(){
        return P328_ICD10_ID2;
    } 
    public void setP328_ICD10_ID2(String P328_ICD10_ID2) {
         this.P328_ICD10_ID2 = P328_ICD10_ID2;
    } 
    public String getP328_ICD10_NAME2(){
        return P328_ICD10_NAME2;
    } 
    public void setP328_ICD10_NAME2(String P328_ICD10_NAME2) {
         this.P328_ICD10_NAME2 = P328_ICD10_NAME2;
    } 
    public String getP328_ICD10_ID3(){
        return P328_ICD10_ID3;
    } 
    public void setP328_ICD10_ID3(String P328_ICD10_ID3) {
         this.P328_ICD10_ID3 = P328_ICD10_ID3;
    } 
    public String getP328_ICD10_NAME3(){
        return P328_ICD10_NAME3;
    } 
    public void setP328_ICD10_NAME3(String P328_ICD10_NAME3) {
         this.P328_ICD10_NAME3 = P328_ICD10_NAME3;
    } 
    public String getP328_ICD10_ID4(){
        return P328_ICD10_ID4;
    } 
    public void setP328_ICD10_ID4(String P328_ICD10_ID4) {
         this.P328_ICD10_ID4 = P328_ICD10_ID4;
    } 
    public String getP328_ICD10_NAME4(){
        return P328_ICD10_NAME4;
    } 
    public void setP328_ICD10_NAME4(String P328_ICD10_NAME4) {
         this.P328_ICD10_NAME4 = P328_ICD10_NAME4;
    } 
    public String getP328_ICD10_ID5(){
        return P328_ICD10_ID5;
    } 
    public void setP328_ICD10_ID5(String P328_ICD10_ID5) {
         this.P328_ICD10_ID5 = P328_ICD10_ID5;
    } 
    public String getP328_ICD10_NAME5(){
        return P328_ICD10_NAME5;
    } 
    public void setP328_ICD10_NAME5(String P328_ICD10_NAME5) {
         this.P328_ICD10_NAME5 = P328_ICD10_NAME5;
    } 
    public String getP328_ICD10_ID6(){
        return P328_ICD10_ID6;
    } 
    public void setP328_ICD10_ID6(String P328_ICD10_ID6) {
         this.P328_ICD10_ID6 = P328_ICD10_ID6;
    } 
    public String getP328_ICD10_NAME6(){
        return P328_ICD10_NAME6;
    } 
    public void setP328_ICD10_NAME6(String P328_ICD10_NAME6) {
         this.P328_ICD10_NAME6 = P328_ICD10_NAME6;
    } 
    public String getP3292_ICD10_ID1(){
        return P3292_ICD10_ID1;
    } 
    public void setP3292_ICD10_ID1(String P3292_ICD10_ID1) {
         this.P3292_ICD10_ID1 = P3292_ICD10_ID1;
    } 
    public String getP3292_ICD10_NAME1(){
        return P3292_ICD10_NAME1;
    } 
    public void setP3292_ICD10_NAME1(String P3292_ICD10_NAME1) {
         this.P3292_ICD10_NAME1 = P3292_ICD10_NAME1;
    } 
    public String getP3292_ICD10_ID2(){
        return P3292_ICD10_ID2;
    } 
    public void setP3292_ICD10_ID2(String P3292_ICD10_ID2) {
         this.P3292_ICD10_ID2 = P3292_ICD10_ID2;
    } 
    public String getP3292_ICD10_NAME2(){
        return P3292_ICD10_NAME2;
    } 
    public void setP3292_ICD10_NAME2(String P3292_ICD10_NAME2) {
         this.P3292_ICD10_NAME2 = P3292_ICD10_NAME2;
    } 
    public String getP3292_ICD10_ID3(){
        return P3292_ICD10_ID3;
    } 
    public void setP3292_ICD10_ID3(String P3292_ICD10_ID3) {
         this.P3292_ICD10_ID3 = P3292_ICD10_ID3;
    } 
    public String getP3292_ICD10_NAME3(){
        return P3292_ICD10_NAME3;
    } 
    public void setP3292_ICD10_NAME3(String P3292_ICD10_NAME3) {
         this.P3292_ICD10_NAME3 = P3292_ICD10_NAME3;
    } 
    public String getP3292_ICD10_ID4(){
        return P3292_ICD10_ID4;
    } 
    public void setP3292_ICD10_ID4(String P3292_ICD10_ID4) {
         this.P3292_ICD10_ID4 = P3292_ICD10_ID4;
    } 
    public String getP3292_ICD10_NAME4(){
        return P3292_ICD10_NAME4;
    } 
    public void setP3292_ICD10_NAME4(String P3292_ICD10_NAME4) {
         this.P3292_ICD10_NAME4 = P3292_ICD10_NAME4;
    } 
    public String getP3292_ICD10_ID5(){
        return P3292_ICD10_ID5;
    } 
    public void setP3292_ICD10_ID5(String P3292_ICD10_ID5) {
         this.P3292_ICD10_ID5 = P3292_ICD10_ID5;
    } 
    public String getP3292_ICD10_NAME5(){
        return P3292_ICD10_NAME5;
    } 
    public void setP3292_ICD10_NAME5(String P3292_ICD10_NAME5) {
         this.P3292_ICD10_NAME5 = P3292_ICD10_NAME5;
    } 
    public String getP3292_ICD10_ID6(){
        return P3292_ICD10_ID6;
    } 
    public void setP3292_ICD10_ID6(String P3292_ICD10_ID6) {
         this.P3292_ICD10_ID6 = P3292_ICD10_ID6;
    } 
    public String getP3292_ICD10_NAME6(){
        return P3292_ICD10_NAME6;
    } 
    public void setP3292_ICD10_NAME6(String P3292_ICD10_NAME6) {
         this.P3292_ICD10_NAME6 = P3292_ICD10_NAME6;
    } 
    public String getP3295_ICD10_ID1(){
        return P3295_ICD10_ID1;
    } 
    public void setP3295_ICD10_ID1(String P3295_ICD10_ID1) {
         this.P3295_ICD10_ID1 = P3295_ICD10_ID1;
    } 
    public String getP3295_ICD10_NAME1(){
        return P3295_ICD10_NAME1;
    } 
    public void setP3295_ICD10_NAME1(String P3295_ICD10_NAME1) {
         this.P3295_ICD10_NAME1 = P3295_ICD10_NAME1;
    } 
    public String getP3295_ICD10_ID2(){
        return P3295_ICD10_ID2;
    } 
    public void setP3295_ICD10_ID2(String P3295_ICD10_ID2) {
         this.P3295_ICD10_ID2 = P3295_ICD10_ID2;
    } 
    public String getP3295_ICD10_NAME2(){
        return P3295_ICD10_NAME2;
    } 
    public void setP3295_ICD10_NAME2(String P3295_ICD10_NAME2) {
         this.P3295_ICD10_NAME2 = P3295_ICD10_NAME2;
    } 
    public String getP3295_ICD10_ID3(){
        return P3295_ICD10_ID3;
    } 
    public void setP3295_ICD10_ID3(String P3295_ICD10_ID3) {
         this.P3295_ICD10_ID3 = P3295_ICD10_ID3;
    } 
    public String getP3295_ICD10_NAME3(){
        return P3295_ICD10_NAME3;
    } 
    public void setP3295_ICD10_NAME3(String P3295_ICD10_NAME3) {
         this.P3295_ICD10_NAME3 = P3295_ICD10_NAME3;
    } 
    public String getP3295_ICD10_ID4(){
        return P3295_ICD10_ID4;
    } 
    public void setP3295_ICD10_ID4(String P3295_ICD10_ID4) {
         this.P3295_ICD10_ID4 = P3295_ICD10_ID4;
    } 
    public String getP3295_ICD10_NAME4(){
        return P3295_ICD10_NAME4;
    } 
    public void setP3295_ICD10_NAME4(String P3295_ICD10_NAME4) {
         this.P3295_ICD10_NAME4 = P3295_ICD10_NAME4;
    } 
    public String getP3295_ICD10_ID5(){
        return P3295_ICD10_ID5;
    } 
    public void setP3295_ICD10_ID5(String P3295_ICD10_ID5) {
         this.P3295_ICD10_ID5 = P3295_ICD10_ID5;
    } 
    public String getP3295_ICD10_NAME5(){
        return P3295_ICD10_NAME5;
    } 
    public void setP3295_ICD10_NAME5(String P3295_ICD10_NAME5) {
         this.P3295_ICD10_NAME5 = P3295_ICD10_NAME5;
    } 
    public String getP3295_ICD10_ID6(){
        return P3295_ICD10_ID6;
    } 
    public void setP3295_ICD10_ID6(String P3295_ICD10_ID6) {
         this.P3295_ICD10_ID6 = P3295_ICD10_ID6;
    } 
    public String getP3295_ICD10_NAME6(){
        return P3295_ICD10_NAME6;
    } 
    public void setP3295_ICD10_NAME6(String P3295_ICD10_NAME6) {
         this.P3295_ICD10_NAME6 = P3295_ICD10_NAME6;
    } 
    public String getP3298_ICD10_ID1(){
        return P3298_ICD10_ID1;
    } 
    public void setP3298_ICD10_ID1(String P3298_ICD10_ID1) {
         this.P3298_ICD10_ID1 = P3298_ICD10_ID1;
    } 
    public String getP3298_ICD10_NAME1(){
        return P3298_ICD10_NAME1;
    } 
    public void setP3298_ICD10_NAME1(String P3298_ICD10_NAME1) {
         this.P3298_ICD10_NAME1 = P3298_ICD10_NAME1;
    } 
    public String getP3298_ICD10_ID2(){
        return P3298_ICD10_ID2;
    } 
    public void setP3298_ICD10_ID2(String P3298_ICD10_ID2) {
         this.P3298_ICD10_ID2 = P3298_ICD10_ID2;
    } 
    public String getP3298_ICD10_NAME2(){
        return P3298_ICD10_NAME2;
    } 
    public void setP3298_ICD10_NAME2(String P3298_ICD10_NAME2) {
         this.P3298_ICD10_NAME2 = P3298_ICD10_NAME2;
    } 
    public String getP3298_ICD10_ID3(){
        return P3298_ICD10_ID3;
    } 
    public void setP3298_ICD10_ID3(String P3298_ICD10_ID3) {
         this.P3298_ICD10_ID3 = P3298_ICD10_ID3;
    } 
    public String getP3298_ICD10_NAME3(){
        return P3298_ICD10_NAME3;
    } 
    public void setP3298_ICD10_NAME3(String P3298_ICD10_NAME3) {
         this.P3298_ICD10_NAME3 = P3298_ICD10_NAME3;
    } 
    public String getP3298_ICD10_ID4(){
        return P3298_ICD10_ID4;
    } 
    public void setP3298_ICD10_ID4(String P3298_ICD10_ID4) {
         this.P3298_ICD10_ID4 = P3298_ICD10_ID4;
    } 
    public String getP3298_ICD10_NAME4(){
        return P3298_ICD10_NAME4;
    } 
    public void setP3298_ICD10_NAME4(String P3298_ICD10_NAME4) {
         this.P3298_ICD10_NAME4 = P3298_ICD10_NAME4;
    } 
    public String getP3298_ICD10_ID5(){
        return P3298_ICD10_ID5;
    } 
    public void setP3298_ICD10_ID5(String P3298_ICD10_ID5) {
         this.P3298_ICD10_ID5 = P3298_ICD10_ID5;
    } 
    public String getP3298_ICD10_NAME5(){
        return P3298_ICD10_NAME5;
    } 
    public void setP3298_ICD10_NAME5(String P3298_ICD10_NAME5) {
         this.P3298_ICD10_NAME5 = P3298_ICD10_NAME5;
    } 
    public String getP3298_ICD10_ID6(){
        return P3298_ICD10_ID6;
    } 
    public void setP3298_ICD10_ID6(String P3298_ICD10_ID6) {
         this.P3298_ICD10_ID6 = P3298_ICD10_ID6;
    } 
    public String getP3298_ICD10_NAME6(){
        return P3298_ICD10_NAME6;
    } 
    public void setP3298_ICD10_NAME6(String P3298_ICD10_NAME6) {
         this.P3298_ICD10_NAME6 = P3298_ICD10_NAME6;
    } 
    public String getP3282_ICD10_ID1(){
        return P3282_ICD10_ID1;
    } 
    public void setP3282_ICD10_ID1(String P3282_ICD10_ID1) {
         this.P3282_ICD10_ID1 = P3282_ICD10_ID1;
    } 
    public String getP3282_ICD10_NAME1(){
        return P3282_ICD10_NAME1;
    } 
    public void setP3282_ICD10_NAME1(String P3282_ICD10_NAME1) {
         this.P3282_ICD10_NAME1 = P3282_ICD10_NAME1;
    } 
    public String getP3282_ICD10_ID2(){
        return P3282_ICD10_ID2;
    } 
    public void setP3282_ICD10_ID2(String P3282_ICD10_ID2) {
         this.P3282_ICD10_ID2 = P3282_ICD10_ID2;
    } 
    public String getP3282_ICD10_NAME2(){
        return P3282_ICD10_NAME2;
    } 
    public void setP3282_ICD10_NAME2(String P3282_ICD10_NAME2) {
         this.P3282_ICD10_NAME2 = P3282_ICD10_NAME2;
    } 
    public String getP3282_ICD10_ID3(){
        return P3282_ICD10_ID3;
    } 
    public void setP3282_ICD10_ID3(String P3282_ICD10_ID3) {
         this.P3282_ICD10_ID3 = P3282_ICD10_ID3;
    } 
    public String getP3282_ICD10_NAME3(){
        return P3282_ICD10_NAME3;
    } 
    public void setP3282_ICD10_NAME3(String P3282_ICD10_NAME3) {
         this.P3282_ICD10_NAME3 = P3282_ICD10_NAME3;
    } 
    public String getP3282_ICD10_ID4(){
        return P3282_ICD10_ID4;
    } 
    public void setP3282_ICD10_ID4(String P3282_ICD10_ID4) {
         this.P3282_ICD10_ID4 = P3282_ICD10_ID4;
    } 
    public String getP3282_ICD10_NAME4(){
        return P3282_ICD10_NAME4;
    } 
    public void setP3282_ICD10_NAME4(String P3282_ICD10_NAME4) {
         this.P3282_ICD10_NAME4 = P3282_ICD10_NAME4;
    } 
    public String getP3282_ICD10_ID5(){
        return P3282_ICD10_ID5;
    } 
    public void setP3282_ICD10_ID5(String P3282_ICD10_ID5) {
         this.P3282_ICD10_ID5 = P3282_ICD10_ID5;
    } 
    public String getP3282_ICD10_NAME5(){
        return P3282_ICD10_NAME5;
    } 
    public void setP3282_ICD10_NAME5(String P3282_ICD10_NAME5) {
         this.P3282_ICD10_NAME5 = P3282_ICD10_NAME5;
    } 
    public String getP3282_ICD10_ID6(){
        return P3282_ICD10_ID6;
    } 
    public void setP3282_ICD10_ID6(String P3282_ICD10_ID6) {
         this.P3282_ICD10_ID6 = P3282_ICD10_ID6;
    } 
    public String getP3282_ICD10_NAME6(){
        return P3282_ICD10_NAME6;
    } 
    public void setP3282_ICD10_NAME6(String P3282_ICD10_NAME6) {
         this.P3282_ICD10_NAME6 = P3282_ICD10_NAME6;
    } 
    public String getP3285_ICD10_ID1(){
        return P3285_ICD10_ID1;
    } 
    public void setP3285_ICD10_ID1(String P3285_ICD10_ID1) {
         this.P3285_ICD10_ID1 = P3285_ICD10_ID1;
    } 
    public String getP3285_ICD10_NAME1(){
        return P3285_ICD10_NAME1;
    } 
    public void setP3285_ICD10_NAME1(String P3285_ICD10_NAME1) {
         this.P3285_ICD10_NAME1 = P3285_ICD10_NAME1;
    } 
    public String getP3285_ICD10_ID2(){
        return P3285_ICD10_ID2;
    } 
    public void setP3285_ICD10_ID2(String P3285_ICD10_ID2) {
         this.P3285_ICD10_ID2 = P3285_ICD10_ID2;
    } 
    public String getP3285_ICD10_NAME2(){
        return P3285_ICD10_NAME2;
    } 
    public void setP3285_ICD10_NAME2(String P3285_ICD10_NAME2) {
         this.P3285_ICD10_NAME2 = P3285_ICD10_NAME2;
    } 
    public String getP3285_ICD10_ID3(){
        return P3285_ICD10_ID3;
    } 
    public void setP3285_ICD10_ID3(String P3285_ICD10_ID3) {
         this.P3285_ICD10_ID3 = P3285_ICD10_ID3;
    } 
    public String getP3285_ICD10_NAME3(){
        return P3285_ICD10_NAME3;
    } 
    public void setP3285_ICD10_NAME3(String P3285_ICD10_NAME3) {
         this.P3285_ICD10_NAME3 = P3285_ICD10_NAME3;
    } 
    public String getP3285_ICD10_ID4(){
        return P3285_ICD10_ID4;
    } 
    public void setP3285_ICD10_ID4(String P3285_ICD10_ID4) {
         this.P3285_ICD10_ID4 = P3285_ICD10_ID4;
    } 
    public String getP3285_ICD10_NAME4(){
        return P3285_ICD10_NAME4;
    } 
    public void setP3285_ICD10_NAME4(String P3285_ICD10_NAME4) {
         this.P3285_ICD10_NAME4 = P3285_ICD10_NAME4;
    } 
    public String getP3285_ICD10_ID5(){
        return P3285_ICD10_ID5;
    } 
    public void setP3285_ICD10_ID5(String P3285_ICD10_ID5) {
         this.P3285_ICD10_ID5 = P3285_ICD10_ID5;
    } 
    public String getP3285_ICD10_NAME5(){
        return P3285_ICD10_NAME5;
    } 
    public void setP3285_ICD10_NAME5(String P3285_ICD10_NAME5) {
         this.P3285_ICD10_NAME5 = P3285_ICD10_NAME5;
    } 
    public String getP3285_ICD10_ID6(){
        return P3285_ICD10_ID6;
    } 
    public void setP3285_ICD10_ID6(String P3285_ICD10_ID6) {
         this.P3285_ICD10_ID6 = P3285_ICD10_ID6;
    } 
    public String getP3285_ICD10_NAME6(){
        return P3285_ICD10_NAME6;
    } 
    public void setP3285_ICD10_NAME6(String P3285_ICD10_NAME6) {
         this.P3285_ICD10_NAME6 = P3285_ICD10_NAME6;
    } 
    public String getP3288_ICD10_ID1(){
        return P3288_ICD10_ID1;
    } 
    public void setP3288_ICD10_ID1(String P3288_ICD10_ID1) {
         this.P3288_ICD10_ID1 = P3288_ICD10_ID1;
    } 
    public String getP3288_ICD10_NAME1(){
        return P3288_ICD10_NAME1;
    } 
    public void setP3288_ICD10_NAME1(String P3288_ICD10_NAME1) {
         this.P3288_ICD10_NAME1 = P3288_ICD10_NAME1;
    } 
    public String getP3288_ICD10_ID2(){
        return P3288_ICD10_ID2;
    } 
    public void setP3288_ICD10_ID2(String P3288_ICD10_ID2) {
         this.P3288_ICD10_ID2 = P3288_ICD10_ID2;
    } 
    public String getP3288_ICD10_NAME2(){
        return P3288_ICD10_NAME2;
    } 
    public void setP3288_ICD10_NAME2(String P3288_ICD10_NAME2) {
         this.P3288_ICD10_NAME2 = P3288_ICD10_NAME2;
    } 
    public String getP3288_ICD10_ID3(){
        return P3288_ICD10_ID3;
    } 
    public void setP3288_ICD10_ID3(String P3288_ICD10_ID3) {
         this.P3288_ICD10_ID3 = P3288_ICD10_ID3;
    } 
    public String getP3288_ICD10_NAME3(){
        return P3288_ICD10_NAME3;
    } 
    public void setP3288_ICD10_NAME3(String P3288_ICD10_NAME3) {
         this.P3288_ICD10_NAME3 = P3288_ICD10_NAME3;
    } 
    public String getP3288_ICD10_ID4(){
        return P3288_ICD10_ID4;
    } 
    public void setP3288_ICD10_ID4(String P3288_ICD10_ID4) {
         this.P3288_ICD10_ID4 = P3288_ICD10_ID4;
    } 
    public String getP3288_ICD10_NAME4(){
        return P3288_ICD10_NAME4;
    } 
    public void setP3288_ICD10_NAME4(String P3288_ICD10_NAME4) {
         this.P3288_ICD10_NAME4 = P3288_ICD10_NAME4;
    } 
    public String getP3288_ICD10_ID5(){
        return P3288_ICD10_ID5;
    } 
    public void setP3288_ICD10_ID5(String P3288_ICD10_ID5) {
         this.P3288_ICD10_ID5 = P3288_ICD10_ID5;
    } 
    public String getP3288_ICD10_NAME5(){
        return P3288_ICD10_NAME5;
    } 
    public void setP3288_ICD10_NAME5(String P3288_ICD10_NAME5) {
         this.P3288_ICD10_NAME5 = P3288_ICD10_NAME5;
    } 
    public String getP3288_ICD10_ID6(){
        return P3288_ICD10_ID6;
    } 
    public void setP3288_ICD10_ID6(String P3288_ICD10_ID6) {
         this.P3288_ICD10_ID6 = P3288_ICD10_ID6;
    } 
    public String getP3288_ICD10_NAME6(){
        return P3288_ICD10_NAME6;
    } 
    public void setP3288_ICD10_NAME6(String P3288_ICD10_NAME6) {
         this.P3288_ICD10_NAME6 = P3288_ICD10_NAME6;
    } 
    public String getP3272_ICD10_ID1(){
        return P3272_ICD10_ID1;
    } 
    public void setP3272_ICD10_ID1(String P3272_ICD10_ID1) {
         this.P3272_ICD10_ID1 = P3272_ICD10_ID1;
    } 
    public String getP3272_ICD10_NAME1(){
        return P3272_ICD10_NAME1;
    } 
    public void setP3272_ICD10_NAME1(String P3272_ICD10_NAME1) {
         this.P3272_ICD10_NAME1 = P3272_ICD10_NAME1;
    } 
    public String getP3272_ICD10_ID2(){
        return P3272_ICD10_ID2;
    } 
    public void setP3272_ICD10_ID2(String P3272_ICD10_ID2) {
         this.P3272_ICD10_ID2 = P3272_ICD10_ID2;
    } 
    public String getP3272_ICD10_NAME2(){
        return P3272_ICD10_NAME2;
    } 
    public void setP3272_ICD10_NAME2(String P3272_ICD10_NAME2) {
         this.P3272_ICD10_NAME2 = P3272_ICD10_NAME2;
    } 
    public String getP3272_ICD10_ID3(){
        return P3272_ICD10_ID3;
    } 
    public void setP3272_ICD10_ID3(String P3272_ICD10_ID3) {
         this.P3272_ICD10_ID3 = P3272_ICD10_ID3;
    } 
    public String getP3272_ICD10_NAME3(){
        return P3272_ICD10_NAME3;
    } 
    public void setP3272_ICD10_NAME3(String P3272_ICD10_NAME3) {
         this.P3272_ICD10_NAME3 = P3272_ICD10_NAME3;
    } 
    public String getP3272_ICD10_ID4(){
        return P3272_ICD10_ID4;
    } 
    public void setP3272_ICD10_ID4(String P3272_ICD10_ID4) {
         this.P3272_ICD10_ID4 = P3272_ICD10_ID4;
    } 
    public String getP3272_ICD10_NAME4(){
        return P3272_ICD10_NAME4;
    } 
    public void setP3272_ICD10_NAME4(String P3272_ICD10_NAME4) {
         this.P3272_ICD10_NAME4 = P3272_ICD10_NAME4;
    } 
    public String getP3272_ICD10_ID5(){
        return P3272_ICD10_ID5;
    } 
    public void setP3272_ICD10_ID5(String P3272_ICD10_ID5) {
         this.P3272_ICD10_ID5 = P3272_ICD10_ID5;
    } 
    public String getP3272_ICD10_NAME5(){
        return P3272_ICD10_NAME5;
    } 
    public void setP3272_ICD10_NAME5(String P3272_ICD10_NAME5) {
         this.P3272_ICD10_NAME5 = P3272_ICD10_NAME5;
    } 
    public String getP3272_ICD10_ID6(){
        return P3272_ICD10_ID6;
    } 
    public void setP3272_ICD10_ID6(String P3272_ICD10_ID6) {
         this.P3272_ICD10_ID6 = P3272_ICD10_ID6;
    } 
    public String getP3272_ICD10_NAME6(){
        return P3272_ICD10_NAME6;
    } 
    public void setP3272_ICD10_NAME6(String P3272_ICD10_NAME6) {
         this.P3272_ICD10_NAME6 = P3272_ICD10_NAME6;
    } 
    public String getP3275_ICD10_ID1(){
        return P3275_ICD10_ID1;
    } 
    public void setP3275_ICD10_ID1(String P3275_ICD10_ID1) {
         this.P3275_ICD10_ID1 = P3275_ICD10_ID1;
    } 
    public String getP3275_ICD10_NAME1(){
        return P3275_ICD10_NAME1;
    } 
    public void setP3275_ICD10_NAME1(String P3275_ICD10_NAME1) {
         this.P3275_ICD10_NAME1 = P3275_ICD10_NAME1;
    } 
    public String getP3275_ICD10_ID2(){
        return P3275_ICD10_ID2;
    } 
    public void setP3275_ICD10_ID2(String P3275_ICD10_ID2) {
         this.P3275_ICD10_ID2 = P3275_ICD10_ID2;
    } 
    public String getP3275_ICD10_NAME2(){
        return P3275_ICD10_NAME2;
    } 
    public void setP3275_ICD10_NAME2(String P3275_ICD10_NAME2) {
         this.P3275_ICD10_NAME2 = P3275_ICD10_NAME2;
    } 
    public String getP3275_ICD10_ID3(){
        return P3275_ICD10_ID3;
    } 
    public void setP3275_ICD10_ID3(String P3275_ICD10_ID3) {
         this.P3275_ICD10_ID3 = P3275_ICD10_ID3;
    } 
    public String getP3275_ICD10_NAME3(){
        return P3275_ICD10_NAME3;
    } 
    public void setP3275_ICD10_NAME3(String P3275_ICD10_NAME3) {
         this.P3275_ICD10_NAME3 = P3275_ICD10_NAME3;
    } 
    public String getP3275_ICD10_ID4(){
        return P3275_ICD10_ID4;
    } 
    public void setP3275_ICD10_ID4(String P3275_ICD10_ID4) {
         this.P3275_ICD10_ID4 = P3275_ICD10_ID4;
    } 
    public String getP3275_ICD10_NAME4(){
        return P3275_ICD10_NAME4;
    } 
    public void setP3275_ICD10_NAME4(String P3275_ICD10_NAME4) {
         this.P3275_ICD10_NAME4 = P3275_ICD10_NAME4;
    } 
    public String getP3275_ICD10_ID5(){
        return P3275_ICD10_ID5;
    } 
    public void setP3275_ICD10_ID5(String P3275_ICD10_ID5) {
         this.P3275_ICD10_ID5 = P3275_ICD10_ID5;
    } 
    public String getP3275_ICD10_NAME5(){
        return P3275_ICD10_NAME5;
    } 
    public void setP3275_ICD10_NAME5(String P3275_ICD10_NAME5) {
         this.P3275_ICD10_NAME5 = P3275_ICD10_NAME5;
    } 
    public String getP3275_ICD10_ID6(){
        return P3275_ICD10_ID6;
    } 
    public void setP3275_ICD10_ID6(String P3275_ICD10_ID6) {
         this.P3275_ICD10_ID6 = P3275_ICD10_ID6;
    } 
    public String getP3275_ICD10_NAME6(){
        return P3275_ICD10_NAME6;
    } 
    public void setP3275_ICD10_NAME6(String P3275_ICD10_NAME6) {
         this.P3275_ICD10_NAME6 = P3275_ICD10_NAME6;
    } 
    public String getP281_ICD10_ID1(){
        return P281_ICD10_ID1;
    } 
    public void setP281_ICD10_ID1(String P281_ICD10_ID1) {
         this.P281_ICD10_ID1 = P281_ICD10_ID1;
    } 
    public String getP281_ICD10_NAME1(){
        return P281_ICD10_NAME1;
    } 
    public void setP281_ICD10_NAME1(String P281_ICD10_NAME1) {
         this.P281_ICD10_NAME1 = P281_ICD10_NAME1;
    } 
    public String getP281_ICD10_ID2(){
        return P281_ICD10_ID2;
    } 
    public void setP281_ICD10_ID2(String P281_ICD10_ID2) {
         this.P281_ICD10_ID2 = P281_ICD10_ID2;
    } 
    public String getP281_ICD10_NAME2(){
        return P281_ICD10_NAME2;
    } 
    public void setP281_ICD10_NAME2(String P281_ICD10_NAME2) {
         this.P281_ICD10_NAME2 = P281_ICD10_NAME2;
    } 
    public String getP281_ICD10_ID3(){
        return P281_ICD10_ID3;
    } 
    public void setP281_ICD10_ID3(String P281_ICD10_ID3) {
         this.P281_ICD10_ID3 = P281_ICD10_ID3;
    } 
    public String getP281_ICD10_NAME3(){
        return P281_ICD10_NAME3;
    } 
    public void setP281_ICD10_NAME3(String P281_ICD10_NAME3) {
         this.P281_ICD10_NAME3 = P281_ICD10_NAME3;
    } 
    public String getP281_ICD10_ID4(){
        return P281_ICD10_ID4;
    } 
    public void setP281_ICD10_ID4(String P281_ICD10_ID4) {
         this.P281_ICD10_ID4 = P281_ICD10_ID4;
    } 
    public String getP281_ICD10_NAME4(){
        return P281_ICD10_NAME4;
    } 
    public void setP281_ICD10_NAME4(String P281_ICD10_NAME4) {
         this.P281_ICD10_NAME4 = P281_ICD10_NAME4;
    } 
    public String getP281_ICD10_ID5(){
        return P281_ICD10_ID5;
    } 
    public void setP281_ICD10_ID5(String P281_ICD10_ID5) {
         this.P281_ICD10_ID5 = P281_ICD10_ID5;
    } 
    public String getP281_ICD10_NAME5(){
        return P281_ICD10_NAME5;
    } 
    public void setP281_ICD10_NAME5(String P281_ICD10_NAME5) {
         this.P281_ICD10_NAME5 = P281_ICD10_NAME5;
    } 
    public String getP281_ICD10_ID6(){
        return P281_ICD10_ID6;
    } 
    public void setP281_ICD10_ID6(String P281_ICD10_ID6) {
         this.P281_ICD10_ID6 = P281_ICD10_ID6;
    } 
    public String getP281_ICD10_NAME6(){
        return P281_ICD10_NAME6;
    } 
    public void setP281_ICD10_NAME6(String P281_ICD10_NAME6) {
         this.P281_ICD10_NAME6 = P281_ICD10_NAME6;
    } 
    public String getP301_ICD10_ID1(){
        return P301_ICD10_ID1;
    } 
    public void setP301_ICD10_ID1(String P301_ICD10_ID1) {
         this.P301_ICD10_ID1 = P301_ICD10_ID1;
    } 
    public String getP301_ICD10_NAME1(){
        return P301_ICD10_NAME1;
    } 
    public void setP301_ICD10_NAME1(String P301_ICD10_NAME1) {
         this.P301_ICD10_NAME1 = P301_ICD10_NAME1;
    } 
    public String getP301_ICD10_ID2(){
        return P301_ICD10_ID2;
    } 
    public void setP301_ICD10_ID2(String P301_ICD10_ID2) {
         this.P301_ICD10_ID2 = P301_ICD10_ID2;
    } 
    public String getP301_ICD10_NAME2(){
        return P301_ICD10_NAME2;
    } 
    public void setP301_ICD10_NAME2(String P301_ICD10_NAME2) {
         this.P301_ICD10_NAME2 = P301_ICD10_NAME2;
    } 
    public String getP301_ICD10_ID3(){
        return P301_ICD10_ID3;
    } 
    public void setP301_ICD10_ID3(String P301_ICD10_ID3) {
         this.P301_ICD10_ID3 = P301_ICD10_ID3;
    } 
    public String getP301_ICD10_NAME3(){
        return P301_ICD10_NAME3;
    } 
    public void setP301_ICD10_NAME3(String P301_ICD10_NAME3) {
         this.P301_ICD10_NAME3 = P301_ICD10_NAME3;
    } 
    public String getP301_ICD10_ID4(){
        return P301_ICD10_ID4;
    } 
    public void setP301_ICD10_ID4(String P301_ICD10_ID4) {
         this.P301_ICD10_ID4 = P301_ICD10_ID4;
    } 
    public String getP301_ICD10_NAME4(){
        return P301_ICD10_NAME4;
    } 
    public void setP301_ICD10_NAME4(String P301_ICD10_NAME4) {
         this.P301_ICD10_NAME4 = P301_ICD10_NAME4;
    } 
    public String getP301_ICD10_ID5(){
        return P301_ICD10_ID5;
    } 
    public void setP301_ICD10_ID5(String P301_ICD10_ID5) {
         this.P301_ICD10_ID5 = P301_ICD10_ID5;
    } 
    public String getP301_ICD10_NAME5(){
        return P301_ICD10_NAME5;
    } 
    public void setP301_ICD10_NAME5(String P301_ICD10_NAME5) {
         this.P301_ICD10_NAME5 = P301_ICD10_NAME5;
    } 
    public String getP301_ICD10_ID6(){
        return P301_ICD10_ID6;
    } 
    public void setP301_ICD10_ID6(String P301_ICD10_ID6) {
         this.P301_ICD10_ID6 = P301_ICD10_ID6;
    } 
    public String getP301_ICD10_NAME6(){
        return P301_ICD10_NAME6;
    } 
    public void setP301_ICD10_NAME6(String P301_ICD10_NAME6) {
         this.P301_ICD10_NAME6 = P301_ICD10_NAME6;
    } 
    public String getP352_ICD10_ID1(){
        return P352_ICD10_ID1;
    } 
    public void setP352_ICD10_ID1(String P352_ICD10_ID1) {
         this.P352_ICD10_ID1 = P352_ICD10_ID1;
    } 
    public String getP352_ICD10_NAME1(){
        return P352_ICD10_NAME1;
    } 
    public void setP352_ICD10_NAME1(String P352_ICD10_NAME1) {
         this.P352_ICD10_NAME1 = P352_ICD10_NAME1;
    } 
    public String getP352_ICD10_ID2(){
        return P352_ICD10_ID2;
    } 
    public void setP352_ICD10_ID2(String P352_ICD10_ID2) {
         this.P352_ICD10_ID2 = P352_ICD10_ID2;
    } 
    public String getP352_ICD10_NAME2(){
        return P352_ICD10_NAME2;
    } 
    public void setP352_ICD10_NAME2(String P352_ICD10_NAME2) {
         this.P352_ICD10_NAME2 = P352_ICD10_NAME2;
    } 
    public String getP352_ICD10_ID3(){
        return P352_ICD10_ID3;
    } 
    public void setP352_ICD10_ID3(String P352_ICD10_ID3) {
         this.P352_ICD10_ID3 = P352_ICD10_ID3;
    } 
    public String getP352_ICD10_NAME3(){
        return P352_ICD10_NAME3;
    } 
    public void setP352_ICD10_NAME3(String P352_ICD10_NAME3) {
         this.P352_ICD10_NAME3 = P352_ICD10_NAME3;
    } 
    public String getP354_ICD10_ID1(){
        return P354_ICD10_ID1;
    } 
    public void setP354_ICD10_ID1(String P354_ICD10_ID1) {
         this.P354_ICD10_ID1 = P354_ICD10_ID1;
    } 
    public String getP354_ICD10_NAME1(){
        return P354_ICD10_NAME1;
    } 
    public void setP354_ICD10_NAME1(String P354_ICD10_NAME1) {
         this.P354_ICD10_NAME1 = P354_ICD10_NAME1;
    } 
    public String getP354_ICD10_ID2(){
        return P354_ICD10_ID2;
    } 
    public void setP354_ICD10_ID2(String P354_ICD10_ID2) {
         this.P354_ICD10_ID2 = P354_ICD10_ID2;
    } 
    public String getP354_ICD10_NAME2(){
        return P354_ICD10_NAME2;
    } 
    public void setP354_ICD10_NAME2(String P354_ICD10_NAME2) {
         this.P354_ICD10_NAME2 = P354_ICD10_NAME2;
    } 
    public String getP354_ICD10_ID3(){
        return P354_ICD10_ID3;
    } 
    public void setP354_ICD10_ID3(String P354_ICD10_ID3) {
         this.P354_ICD10_ID3 = P354_ICD10_ID3;
    } 
    public String getP354_ICD10_NAME3(){
        return P354_ICD10_NAME3;
    } 
    public void setP354_ICD10_NAME3(String P354_ICD10_NAME3) {
         this.P354_ICD10_NAME3 = P354_ICD10_NAME3;
    } 
    public String getP356_ICD10_ID1(){
        return P356_ICD10_ID1;
    } 
    public void setP356_ICD10_ID1(String P356_ICD10_ID1) {
         this.P356_ICD10_ID1 = P356_ICD10_ID1;
    } 
    public String getP356_ICD10_NAME1(){
        return P356_ICD10_NAME1;
    } 
    public void setP356_ICD10_NAME1(String P356_ICD10_NAME1) {
         this.P356_ICD10_NAME1 = P356_ICD10_NAME1;
    } 
    public String getP356_ICD10_ID2(){
        return P356_ICD10_ID2;
    } 
    public void setP356_ICD10_ID2(String P356_ICD10_ID2) {
         this.P356_ICD10_ID2 = P356_ICD10_ID2;
    } 
    public String getP356_ICD10_NAME2(){
        return P356_ICD10_NAME2;
    } 
    public void setP356_ICD10_NAME2(String P356_ICD10_NAME2) {
         this.P356_ICD10_NAME2 = P356_ICD10_NAME2;
    } 
    public String getP356_ICD10_ID3(){
        return P356_ICD10_ID3;
    } 
    public void setP356_ICD10_ID3(String P356_ICD10_ID3) {
         this.P356_ICD10_ID3 = P356_ICD10_ID3;
    } 
    public String getP356_ICD10_NAME3(){
        return P356_ICD10_NAME3;
    } 
    public void setP356_ICD10_NAME3(String P356_ICD10_NAME3) {
         this.P356_ICD10_NAME3 = P356_ICD10_NAME3;
    } 
}