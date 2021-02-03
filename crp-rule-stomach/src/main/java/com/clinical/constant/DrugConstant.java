package com.clinical.constant;

import com.clinical.model.master.IMAGING;
import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DrugConstant {
    public static final String[] PD_1 ={"特瑞普利单抗","Keytruda","pembrolizumab","健痊得","派姆单抗","可瑞达","帕博利珠单抗","Opdivo","纳武利尤单抗","欧狄沃","Nivolumab","奥德武"};
    public static final String[] PDL_1 ={"Tecentriq","atezolizumab","阿特朱单抗","Imfinzi","durvalumab","德瓦鲁单抗"};
    public static final String[] KGZYY ={"双膦酸盐","地诺单抗","xgeva","denosumab"};
    public static final String[] BXYW ={"CD30单抗","GA101","PD1","PDL1","TDM1","阿法替尼","afatinib","吉泰瑞","Gilotrif","阿来替尼","Alectinib","阿雷替尼",
                                        "艾乐替尼","安圣莎","阿伦单抗","阿帕替尼","艾坦","阿法替尼","Apatinib","Mesylate","Tablets","阿曲曲单抗","阿西替尼","Axitinib",
                                        "英立达","Inlyta","埃克替尼","安罗替尼","AL3818","Anlotinib Hydrochloride","福可维","奥拉帕尼","奥西替尼","AZD9291","泰瑞沙","TAGRISSO",
                                        "贝伐珠单抗","Bevacizumab","Avastin","安维汀","贝利司他","Belinostat","Beleodaq","吡咯替尼","布格替尼","布吉他滨","AP26113","达可替尼",
                                        "达拉菲尼","Dabrafenib","泰菲乐","Tafinlar","达雷木单抗","地尼白介素","厄罗替尼","特罗凯","Tarceva","恩度","ENDOSTAR","重组人血管内皮抑制素注射液",
                                        "凡德他尼","Vandetanib","Caprelsa","伏立诺他","吉非替尼","Gefitinib","伊瑞可","易瑞沙","卡博替尼","Cabozanix","Cometriq","XL184",
                                        "克唑替尼","赛可瑞","Xalkori","Crizotinib","拉罗替尼","Larotrectinib","LOXO-101","Vitrakvi","拉帕替尼","来那替尼","劳拉替尼","Lorlatinib",
                                        "PF0643922","alunbrig","雷莫芦单抗","Cyramza","Ramucirumab","利妥昔单抗","Rituximab","美罗华","仑伐替尼","乐伐替尼","Lenvatinib","乐卫玛",
                                        "Lenvima","罗米地辛","Romidepsin","洛普替尼","Ropotrectinib","TPX-0005","纳武单抗","纳武利尤单抗","Nivolumab","OPDIVO","欧狄沃","O药",
                                        "帕博利珠单抗","帕姆单抗","Pembrolizumab","Keytruda","可瑞达","K药","帕博西尼","帕姆单抗","帕妥珠单抗","帕唑帕尼","Pazopanib","维全特",
                                        "Votrient","硼替佐米","Bortezomib","波替单抗","保特佐米","万珂","曲美替尼","trametinib","曲妥珠单抗","Trastuzumab","Herceptin","赫赛汀",
                                        "色瑞替尼","Ceritinib","赞可达","Zykadia","塞瑞替尼","LDK378","曲美替尼","舒尼替尼","索坦","Sutent","Sunitinib Malate Capsules","索拉非尼",
                                        "Sorafenib","多吉美","Sorafenat","维罗非尼","Vemurafenib","佐博伏","Zelboraf","西达苯胺","爱谱沙","西妥昔单抗","Cetuximab","爱必妥",
                                        "伊布替尼","Ibrutinib","亿珂","伊沙佐米","依维莫司","飞尼妥","Everolimus","西罗莫司","SDZRAD","Certican","Zortress","Afinitor",
                                        "RAD-001","泽布替尼"};
    public static final String[] KXXBYW = {"阿司匹林","拜阿司匹林","阿司匹林肠溶片","氯吡格雷","泰嘉","波立维","替格瑞洛","倍林达","普拉格雷","替罗非班","欣维宁","依替巴肽"};
    public static final String[] KNYW = {"肝素","低分子肝素","低分子肝素钙","那曲肝素","依诺肝素","达肝素","比伐卢定","黄达肝葵钠","利伐沙班","依度沙班","达比加群酯","阿哌沙班","艾多沙班","华法林"};
    public static final String[] YYZCYW = {"肠内营养剂(SP)","肠内营养剂(TP)","肠内营养剂(TP)","肠内营养剂(TPF)","肠内营养剂(TPF-D)","肠内营养剂(TPF-DM)","肠内营养剂(TPF-FOS)","肠内营养剂(TPF-T)","肠内营养剂(TP-HE)","肠内营养剂(TP-MCT)","肠内营养剂(TPSPA)","肠内营养剂Ⅱ(TP)","肠内营养粉(AA)","短肽型肠内营养剂","整蛋白型肠内营养剂","肠内营养粉(AA-PA)","多种微量元素","多种微量元素Ⅰ","多种微量元素Ⅱ","辅酶A","辅酶Q10","复方α-酮酸","环磷腺苷","三磷酸腺苷"};
    public static final String[] KSSYW = {"多西环素","米诺环素","替加环素","氯霉素","阿莫西林","氨苄西林","哌拉西林","阿洛西林","美洛西林","苄星青霉素","青霉素","青霉素V","普鲁卡因青霉素",
                                        "苯唑西林","氯唑西林","舒巴坦","阿莫西林克拉维酸","氨苄西林舒巴坦","哌拉西林舒巴坦","哌拉西林他唑巴坦","替卡西林克拉维酸","头孢氨苄","头孢拉定","头孢唑林",
                                        "头孢拉定","头孢硫脒","头孢羟氨苄","头孢呋辛","头孢呋辛酯","头孢丙烯","头孢呋辛酯","头孢克洛","头孢克洛Ⅱ","头孢替安","头孢美唑","头孢西丁","头孢米诺","拉氧头孢","头孢曲松","头孢噻肟","头孢地尼",
                                        "头孢克肟","头孢克肟","头孢克肟","头孢哌酮舒巴坦","头孢他啶","头孢唑肟","头孢吡肟","头孢匹罗","氨曲南","厄他培南","比阿培南","美罗培南","亚胺培南西司他丁","法罗培南","甲氧苄啶","磺胺嘧啶",
                                        "磺胺多辛","复方磺胺甲噁唑","小儿复方磺胺甲噁唑","复方磺胺甲噁唑","联磺甲氧苄啶","小儿复方磺胺甲噁唑","阿奇霉素","红霉素","阿奇霉素","琥乙红霉素","环酯红霉素","克拉霉素","罗红霉素","克林霉素",
                                        "克林霉素磷酸酯","克林霉素棕榈酸酯","林可霉素","克林霉素棕榈酸酯","林可霉素","链霉素","阿米卡星","庆大霉素","奈替米星","庆大霉素","妥布霉素","依替米星","异帕米星","环丙沙星","诺氟沙星",
                                        "左氧氟沙星","氟罗沙星","环丙沙星葡萄糖","环丙沙星氯化钠","吉米沙星","洛美沙星","莫西沙星","莫西沙星氯化钠","左氧氟沙星葡萄糖","左氧氟沙星氯化钠","吡哌酸","去甲万古霉素","替考拉宁",
                                        "万古霉素","多粘菌素B","多粘菌素","夫西地酸","甲硝唑","替硝唑","奥硝唑","奥硝唑氯化钠","奥硝唑葡萄糖","甲硝唑氯化钠","甲硝唑葡萄糖","替硝唑","替硝唑氯化钠","替硝唑葡萄糖","左奥硝唑氯化钠",
                                        "呋喃妥因","呋喃唑酮","磷霉素","鱼腥草素","达托霉素","大观霉素","大蒜素","抗敌素","硫酸黏菌素","利奈唑胺","利奈唑胺葡萄糖","磷霉素","磷霉素氨丁三醇","磷霉素氨丁三醇","黏菌素",
                                        "青霉素皮试剂","两性霉素B","氟康唑伏立康唑","氟康唑","氟康唑氯化钠","氟康唑葡萄糖","伊曲康唑","制霉素","氟胞嘧啶","卡泊芬净","米卡芬净","小檗碱","利福昔明","新霉素","柳氮磺吡啶","美沙拉秦","美沙拉嗪"};
    public static final String[] NSHWYW = {"复方氢氧化铝","枸橼酸铋钾","碳酸氢钠","胶体果胶铋","复方铝酸铋","铝碳酸镁","法莫替丁","雷尼替丁","奥美拉唑","埃索美拉唑","艾司奥美拉唑","艾普拉唑","奥美拉唑","兰索拉唑","兰索拉唑",
                                        "雷贝拉唑","泮托拉唑","吉法酯","硫糖铝","瑞巴派特","替普瑞酮"};

    public static final String[] HLYW = { "T-DM1"," Kadcyla","阿糖胞苷","Cytarabine","爱力生","阿糖胞嘧啶 赛德萨","赛德威","艾瑞布林","eribulin","艾立布林",
                                        "奥沙利铂","Oxaliplatin","草铂","奥正南","艾恒","奥铂","艾克博康","乐沙定","苯达莫司汀","Bendamustine","苯丁酸氮芥","Chlorambucil","瘤可宁","留可然",
                                        "吡柔比星","Pirarubicin","4'-O-四氢吡喃阿霉素","吡喃阿霉素","THP","THP-ADM","表阿霉素","Epirubicin","EPI","E-ADM","艾达生","法玛新","表柔比星",
                                        "丙卡巴肼","Procarbazine","甲基苄肼","博来霉素","Bleomycin","争光霉素","达卡巴嗪","Dacarbazine","甲氮咪胺","氮烯咪胺","氮烯唑胺","DTIC","氮芥","Chlormethine","莫司汀",
                                        "多柔比星","Doxorubicin","14-羟基正定霉素","阿霉素","多西他赛","Docetaxel","多烯紫杉醇","多西紫杉醇","DOC","TXT 奥名润","艾素","多帕菲","希存","斯曲帝","易优瑞康","泰索帝",
                                        "氟达拉滨","Fludarabine","氟尿嘧啶","Fluorouracil","氟二氧嘧啶","氟脲嘧啶","5氟尿嘧啶","5-氟尿嘧啶","5-FU","5-fu","5-Fu","5氟","格芬特","中人氟安","宁兰欣","扶时可",
                                        "环磷酰胺","Cyclophosphamide","癌得星","CTX 护贞","安道生","吉西他滨","Gemcitabine","GEM","gem","Gem","誉捷","泽菲","健择","甲氨蝶呤","Methotrexate","氨甲蝶呤","氨甲叶酸","甲氨喋呤","MTX","能达","美素生","密都",
                                        "卡巴他赛","Cabazitaxel","卡铂","Carboplatin","CBP","carbo","carb","carboplatin","波贝","伯尔定","卡莫司汀","Carmustine","卡氮芥","亚硝脲氮芥","卡培他滨","洛铂",
                                        "美法仑","Melphalan","米尔法兰","左旋溶肉瘤素","左旋苯丙氨酸氮芥","苯丙氨酸氮芥","爱克兰","米托蒽醌","Mitoxantrone","二羟基蒽酮","奥麦","恒恩","米西宁","奈达铂","培美曲塞","Pemetrexed",
                                        "普拉曲沙","Pralatrexate","去甲长春花碱酰胺","柔红霉素","Daunorubicin","正定霉素","柔红比星","顺铂","Cisplatin","顺氯氨铂","DDP","cis","Cis","cisplatin","诺欣","铂龙","科鼎",
                                        "丝裂霉素","替吉奥","替莫唑胺","Temozolomide","蒂清","泰道","托泊替康","Topotecan","拓扑替康","伊立替康","伊沙匹隆","Ixabepilone","依托泊苷","Etoposide","足叶乙甙","依托泊甙","足叶乙苷","VP-16","vp-16","拉司太特","威克","泊瑞",
                                        "异环磷酰胺","Ifosfamide","和乐生","IFO","匹服平","和乐生","鲁迈","长春地辛","长春碱","Vinblastine","长春花碱","长春灭瘟碱","长春瑞滨","Vinorelbine","去甲脱水长春碱","NVB","nvb",
                                        "长春新碱","incristine","VCR","vcr","脂质体紫杉醇","紫杉醇脂质体","紫杉醇","Paclitaxel","紫衫醇","PTX","特素","奥素","泰素","紫素","安素泰","复能"};

    public static final String[] ATZLYW = {"可待因","强痛定","曲马多","吗啡","吗啡缓释片","吗啡控释片","芬太尼透皮贴剂","羟考酮控释片"};

    public static final Map<String, String> DRUG_TYPE_INFO = new HashMap<>();
    static {
        // Head 相关
        DRUG_TYPE_INFO.put("PD_1", "PD-1单抗类免疫治疗药物");
        DRUG_TYPE_INFO.put("PDL_1", "PDL-1单抗免疫治疗药物");
        DRUG_TYPE_INFO.put("KGZYY", "抗骨转移药");
        DRUG_TYPE_INFO.put("BXYW", "靶向药物");
        DRUG_TYPE_INFO.put("KXXBYW", "抗血小板药物");
        DRUG_TYPE_INFO.put("KNYW", "抗凝药物");
        DRUG_TYPE_INFO.put("YYZCYW", "营养支持药物");
        DRUG_TYPE_INFO.put("KSSYW", "抗生素药物");
        DRUG_TYPE_INFO.put("NSHWYW", "抑酸护胃药物");
        DRUG_TYPE_INFO.put("HLYW", "化疗药物");
        DRUG_TYPE_INFO.put("ATZLYW", "癌痛治疗药物");
    }

    private static String[] getDrugArray(String key){
        if(key.equals("PD_1")){
            return PD_1;
        }else if(key.equals("PDL_1")){
            return PDL_1;
        }else if(key.equals("KGZYY")) {
            return KGZYY;
        }else if(key.equals("BXYW")){
            return BXYW;
        }else if(key.equals("KXXBYW")){
            return KXXBYW;
        }else if(key.equals("KNYW")){
            return KNYW;
        }else if(key.equals("YYZCYW")){
            return YYZCYW;
        }else if(key.equals("KSSYW")){
            return KSSYW;
        }else if(key.equals("NSHWYW")){
            return NSHWYW;
        }else if(key.equals("HLYW")){
            return HLYW;
        }else if(key.equals("ATZLYW")){
            return ATZLYW;
        }else{
            return null;
        }
    }

    public static String getDrugType(String drug){
        if(StringUtils.isEmpty(drug)){
            return "";
        }
        String[] strArr;
        for(String key:DRUG_TYPE_INFO.keySet()){
            strArr = getDrugArray(key);
            if(strArr != null){
                for(String drugName : strArr){
                    if(drug.contains(drugName)){
                        return DRUG_TYPE_INFO.get(key);
                    }
                }
            }else{
                return "其他";
            }
        }
        return "";
    }

    /**
     * 靶区部位
     * @param desc
     * @return
     */
    public static String getTargetSite(String desc){
        if(desc == null){
           return "";
        }
        String[] filter = new String[]{"肿瘤区(GTV)", "肿瘤原发灶(GTV-T)", "淋巴结转移灶(GTVnd)","临床靶区(CTV)","邻近肿瘤的软组织或淋巴结(CTV1)","淋巴结预防照射区(CTV2)","计划靶区(PTV)","内移动靶区(IVT)","危及器官(OAR)","计划危及器官(PRV)"};
        String result = "其他";
        for (String s : filter) {
            if (s.contains(desc)) {
                result = s;
                break;
            }
        }
        return result;
    }

    /**
     * 放疗方式
     * @param desc
     * @return
     */
    public static String getWay(String desc){
        if(desc == null){
            return "";
        }
        if(desc.contains("立体定向体部放疗")){
            return "立体定向放疗(SBRT)";
        }else if(desc.contains("调强放疗")){
            return "调强适形放疗(IMRT)";
        }
        String[] filter = new String[]{"二维放疗(2DRT)", "三维适形放疗(3DCRT)", "调强适形放疗(IMRT)","立体定向放疗(SBRT)","图像引导调强适形放疗(IGRT)","剂量引导调强适形放疗(DGRT)","容积调强弧形放疗(VMAT)","螺旋断层放疗(TOMO)"};
        String result = "其他";
        for (String s : filter) {
            if (s.contains(desc)) {
                result = s;
                break;
            }
        }
        return result;
    }

    /**
     * 射线类型
     * @param desc
     * @return
     */
    public static String getRayType(String desc){
        if(desc == null){
            return "";
        }
        String[] filter = new String[]{"X线","电子线","γ射线","质子","重离子"};
        String result = "其他";
        for (String s : filter) {
            if (desc.contains(s)) {
                result = s;
                break;
            }
        }
        return result;
    }

    /**
     * 提取TNM分期
     * @param  desc
     * @return
     */
    public static String getTNM(String desc){
        if(desc == null){
            return "";
        }
        Pattern p = Pattern.compile("T(.*?)N(.*?)M(.*?)");//正则表达式，取T和N和M之间的字符串
        Matcher m = p.matcher(desc);
        while(m.find()) {
            String mGroup = m.group(0);
            if(!"TNM".equals(mGroup)){
                int begin = desc.indexOf(mGroup)+ mGroup.length();
                if(begin == desc.length()){
                    return mGroup;
                }
                String M = desc.substring(begin,begin + 1);
                return mGroup + M;
            }
        }
        return "";
    }
    /**
     * 提取T分期
     * @param  desc
     * @return
     */
    public static String getT(String desc){
        Pattern p = Pattern.compile("T(.*?)N");//正则表达式，取T和N之间的字符串
        Matcher m = p.matcher(desc);
        while(m.find()) {
            return "T" + m.group(1);
        }
        return "";
    }

    /**
     * 提取N分期
     * @param  desc
     * @return
     */
    public static String getN(String desc){
        Pattern p = Pattern.compile("N(.*?)M");//正则表达式，取N和M之间的字符串
        Matcher m = p.matcher(desc);
        while(m.find()) {
            return "N" + m.group(1);
        }
        return "";
    }
    /**
     * 提取M分期
     * @param  desc
     * @return
     */
    public static String getM(String desc){
        if(!desc.endsWith("M")){
            try{
                return "M" + desc.substring(desc.length()-1);
            }catch (Exception e){
                e.printStackTrace();
                return "";
            }
        }
        return "";
    }

    /**
     * 提取综合分期
     * @param  desc
     * @return
     */
    public static String getTNM_a(String desc){
        if(desc == null){
            return "";
        }
        String[] filter = new String[]{"IV","IIIC","IIIB","IIIA","III","IIB","IIA","II","IB","IA","I"};
        String result = "";
        for (String s : filter) {
            if (desc.contains(s)) {
                result = s;
                break;
            }
        }
        return result;
    }

    /**
     * 淋巴结清扫范围
     * @param  desc
     * @return
     */
    public static String getSubStructure(String desc){
        // D0，D1，D1+，D2，D2+
        if(desc == null){
            return "";
        }
        String[] filter = new String[]{"D0","D1","D1+","D2","D2+"};
        String result = "";
        for (String s : filter) {
            if (desc.contains(s)) {
                result = s;
                break;
            }
        }
        return result;
    }

    /**
     * 输血输入成分
     * @param  desc
     * @return
     */
    public static String getInputComponents(String desc){
        // 血浆，普通血浆，新鲜血浆，冰冻血浆，红细胞悬液，浓缩红细胞，洗涤红细胞
        if(desc == null){
            return "";
        }
        String[] filter = new String[]{"血浆","新鲜血浆","普通血浆","冰冻血浆","红细胞悬液","浓缩红细胞","洗涤红细胞","红细胞"};
        String result = "";
        for (String s : filter) {
            if (desc.contains(s)) {
                result = s;
            }
        }
        return result;
    }

    /**
     * 从字符串文本中获得数字
     *@param text
     *@return
     */
    public static String getDigit(String text) {
        if(text == null){
            return "0";
        }
        Pattern p = Pattern.compile("(\\d+)");
        Matcher m = p.matcher(text);
        while(m.find()) {
            String find = m.group(1);
            return find;
        }
        return "0";
    }

    /**
     * 胃镜病灶位置
     * @param  desc
     * @return
     */
    public static String getStructure(String desc){
        // 1.食管，2.贲门，3.胃底，4.胃体，5.胃角，6.胃窦，7.幽门，8.十二指肠
        if(desc == null){
            return "";
        }
        String[] filter = new String[]{"食管","贲门","胃底","胃体","胃角","胃窦","幽门","十二指肠"};
        String result = "";
        for (String s : filter) {
            if (strTrim(desc).contains(s)) {
                result = s;
            }
        }
        return result;
    }

    /**
     * 肠镜病灶位置
     * @param  desc
     * @return
     */
    public static String getStructure_colonoscopy(String desc){
        // 盲肠，升结肠，横结肠，降结肠，乙状结肠，肝曲，脾曲，直肠
        if(desc == null){
            return "";
        }
        String[] filter = new String[]{"盲肠","升结肠","横结肠","降结肠","乙状结肠","肝曲","脾曲","直肠"};
        String result = "";
        for (String s : filter) {
            if (strTrim(desc).contains(s)) {
                result = s;
            }
        }
        return result;
    }

    public static String strTrim(String desc) {
        if (desc != null) {
            String result = desc.replace(" ","");
            return result.replace(" ","");
        }
        return null;
    }

    /**
     * 拼接影像记录病灶位置
      */
    public static String getStructure_imaging(IMAGING imaging){
       String simaging = imaging.getSTRUCTURE1_STD() + "," + imaging.getSITE1_STD() + "," + imaging.getSTRUCTURE2_STD() + "," + imaging.getSITE2_STD() + ","
               + imaging.getSTRUCTURE3_STD() + "," + imaging.getSITE3_STD() + "," + imaging.getSTRUCTURE4_STD() + "," + imaging.getSITE4_STD() + ","
               + imaging.getSTRUCTURE5_STD() + "," + imaging.getSITE5_STD() + "," + imaging.getSTRUCTURE6_STD() + "," + imaging.getSITE6_STD() + ","
               + imaging.getSTRUCTURE7_STD() + "," + imaging.getSITE7_STD() + "," + imaging.getSTRUCTURE8_STD() + "," + imaging.getSITE8_STD();
        simaging = simaging.replace(",null","");
       String[] sArr = simaging.split(",");
       List<String> list = new ArrayList<>();
       for(String s:sArr){
            if(StringUtils.isNotEmpty(strTrim(s))){
                list.add(s);
            }
       }
        if(list.size() == 0){
            return null;
        }
       return String.join(",", list);
    }

    /**
     * 拼接影像记录病灶大小
     */
    public static String getStructure_size(IMAGING imaging){
        String simaging = imaging.getMAX_DIAM1_STD() + "," + imaging.getMEDIAN_DIAM1_STD() + "," + imaging.getMIN_DIAM1_STD() + "" + imaging.getUNIT1_STD() + ","
                + imaging.getMAX_DIAM2_STD() + "," + imaging.getMEDIAN_DIAM2_STD() + "," + imaging.getMIN_DIAM2_STD() + "" + imaging.getUNIT2_STD() + ","
                + imaging.getMAX_DIAM3_STD() + "," + imaging.getMEDIAN_DIAM3_STD() + "," + imaging.getMIN_DIAM3_STD() + "" + imaging.getUNIT3_STD();
        simaging = simaging.replace("null","");
        String[] sArr = simaging.split(",");
        List<String> list = new ArrayList<>();
        for(String s:sArr){
            if(StringUtils.isNotEmpty(strTrim(s))){
                list.add(s);
            }
        }
        if(list.size() == 0){
            return null;
        }
        return String.join(",", list);
    }

    /**
     * 多个String参数，返回逗号分割的连接后的String
     * @param strings
     * @return
     */
    public static String getConcatString(String... strings){
        StringBuilder stringBuilder = new StringBuilder();
        for (String s:strings
             ) {
            if (s==null||"".equals(s)){
                continue;
            }
            stringBuilder.append(s).append(",");
        }
        if (stringBuilder.length()==0){
            return "";
        }
        if (stringBuilder.charAt(stringBuilder.length() - 1)==','){
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
//        System.out.println(DrugConstant.getM("T2aN0M0"));
//        String s = " 111, fgfgf ";
//        System.out.println(strTrim(s));
    }

}
