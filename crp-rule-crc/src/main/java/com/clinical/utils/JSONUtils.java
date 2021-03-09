package com.clinical.utils;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang.StringUtils;

import java.util.*;

/**
 * @Author: mengchao
 * @Date: 2021/2/1 11:09
 */
public class JSONUtils {
    public static final int DUPLICATED_VALUE_TRUE = 1;
    public static final int DUPLICATED_VALUE_FALSE = 2;

    public static void main(String[] args) {
        String json = "{\"afterType1\":[{\"structure_site_std1\":\"18\",\"structure_std1\":\"110\",\"address1\":\"111\"}," +
                "{\"structure_site_std2\":\"28\",\"structure_std2\":\"210\",\"address2\":\"211\"}," +
                "{\"address3\":\"38\",\"structure_std3\":\"\",\"structure_site_std3\":\"311\"}]}";
//        System.out.println(getAllFieldGroupByObj(json, "afterType2", "/", ";"));
        JSONObject root = JSONObject.parseObject(json);
        JSONArray jsonArray = findJSONArray(root, "afterType1");
        String allText = "";
        String fieldSeparate = "/";
        String objSeparate = ";";
        for (Object obj : jsonArray
                ) {
            Map<String, String> objMap = (Map<String, String>) obj;
            Set<String> keySet = objMap.keySet();
            String objText = "";
            String structureStd = "";
            String structureSiteStd = "";
            for (String key : keySet
                    ) {
                String value = objMap.get(key);

                if ("structure_std".equalsIgnoreCase(key.replaceAll("\\d+", ""))) {
                    structureStd = value;
                }
                if ("structure_site_std".equalsIgnoreCase(key.replaceAll("\\d+", ""))) {
                    structureSiteStd = value;
                }
            }
            if (StringUtils.isNotEmpty(structureStd)) {
                objText = structureStd;
            } else {
                objText = structureSiteStd;
            }

            if (StringUtils.isNotEmpty(objText)) {
                allText += objText + objSeparate;
            }

        }
        allText = allText.replace(fieldSeparate + objSeparate, objSeparate);
        allText = allText.substring(0, allText.length()-1);
        System.out.println(allText);
    }

    /**
     * 大肠息肉-肠镜-息肉位置JSON解析专用
     * @param json
     * @return
     */
    public static String cEDSizeStd(String json) {
        JSONObject root = JSONObject.parseObject(json);
        JSONArray jsonArray = findJSONArray(root, "afterType1");
        if (jsonArray != null) {
            String allText = "";
            String fieldSeparate = "*";
            String objSeparate = ";";
            for (Object obj : jsonArray
                    ) {
                Map<String, String> objMap = (Map<String, String>) obj;
                Set<String> keySet = objMap.keySet();
                String objText = "";
                String sizeMaxDiamStd = "";
                String sizeMedianDiamStd = "";
                String sizeMinDiamStd = "";
                String sizeUnitStd = "";
                for (String key : keySet
                        ) {
                    String value = objMap.get(key);

                    if ("size_max_diam_std".equalsIgnoreCase(key.replaceAll("\\d+", ""))) {
                        sizeMaxDiamStd = value;
                    }
                    if ("size_median_diam_std".equalsIgnoreCase(key.replaceAll("\\d+", ""))) {
                        sizeMedianDiamStd = value;
                    }
                    if ("size_min_diam_std".equalsIgnoreCase(key.replaceAll("\\d+", ""))) {
                        sizeMinDiamStd = value;
                    }
                    if ("size_unit_std".equalsIgnoreCase(key.replaceAll("\\d+", ""))) {
                        sizeUnitStd = value;
                    }
                }

                objText = sizeMaxDiamStd + fieldSeparate + sizeMedianDiamStd + fieldSeparate + sizeMinDiamStd + sizeUnitStd;
                if (StringUtils.isNotEmpty(objText)) {
                    allText += objText + objSeparate;
                }

            }
            allText = allText.replace(fieldSeparate + objSeparate, objSeparate);
            allText = allText.substring(0, allText.length()-1);
            return allText;
        }
        return null;
    }

    /**
     * 大肠息肉-免疫组标化物-定性结果JSON解析专用
     * @param json
     * @return
     */
    public static String ihcMarkerMarkerQualita(String json) {
        JSONObject root = JSONObject.parseObject(json);
        JSONArray jsonArray = findJSONArray(root, "afterType1");
        if (jsonArray != null) {
            String allText = "";
            String fieldSeparate = "/";
            String objSeparate = ";";
            for (Object obj : jsonArray
                    ) {
                Map<String, String> objMap = (Map<String, String>) obj;
                Set<String> keySet = objMap.keySet();
                String objText = "";
                String testItemValueRoughStd = "";
                String testItemValueNatureStd = "";
                for (String key : keySet
                        ) {
                    String value = objMap.get(key);

                    if ("test_item_value_rough_std".equalsIgnoreCase(key.replaceAll("\\d+", ""))) {
                        testItemValueRoughStd = value;
                    }
                    if ("test_item_value_nature_std".equalsIgnoreCase(key.replaceAll("\\d+", ""))) {
                        testItemValueNatureStd = value;
                    }
                }
                objText = testItemValueRoughStd + fieldSeparate + testItemValueNatureStd;

                if (StringUtils.isNotEmpty(objText)) {
                    allText += objText + objSeparate;
                }

            }
            allText = allText.replace(fieldSeparate + objSeparate, objSeparate);
            allText = allText.substring(0, allText.length()-1);
            return allText;
        }
        return null;
    }

    /**
     * 大肠息肉-肠镜-息肉位置JSON解析专用
     * @param json
     * @return
     */
    public static String structureStd(String json) {
        JSONObject root = JSONObject.parseObject(json);
        JSONArray jsonArray = findJSONArray(root, "afterType1");
        if (jsonArray != null) {
            String allText = "";
            String fieldSeparate = "/";
            String objSeparate = ";";
            for (Object obj : jsonArray
                    ) {
                Map<String, String> objMap = (Map<String, String>) obj;
                Set<String> keySet = objMap.keySet();
                String objText = "";
                String structureStd = "";
                String structureSiteStd = "";
                for (String key : keySet
                        ) {
                    String value = objMap.get(key);

                    if ("structure_std".equalsIgnoreCase(key.replaceAll("\\d+", ""))) {
                        structureStd = value;
                    }
                    if ("structure_site_std".equalsIgnoreCase(key.replaceAll("\\d+", ""))) {
                        structureSiteStd = value;
                    }
                }
                if (StringUtils.isNotEmpty(structureStd)) {
                    objText = structureStd;
                }
                if (StringUtils.isNotEmpty(structureSiteStd)) {
                    objText += fieldSeparate + structureSiteStd;
                }

                if (StringUtils.isNotEmpty(objText)) {
                    allText += objText + objSeparate;
                }

            }
            allText = allText.replace(fieldSeparate + objSeparate, objSeparate);
            allText = allText.substring(0, allText.length()-1);
            return allText;
        }
        return null;
    }

    /**
     * 按照对象分组获取json中字段值
     * @param jsonText          json文本
     * @param arrayField        arrayField
     * @param fieldSeparate     字段分隔符
     * @param objSeparate       对象分隔符
     * @return
     */
    public static String getAllFieldGroupByObj(String jsonText, String arrayField, String fieldSeparate,
                                               String objSeparate, String tableFieldName) {
        JSONObject root = JSONObject.parseObject(jsonText);
        JSONArray jsonArray = findJSONArray(root, arrayField);
        if (jsonArray != null) {
            String allText = "";
            for (Object obj : jsonArray
                    ) {
                Map<String, String> objMap = (Map<String, String>) obj;
                Set<String> keySet = objMap.keySet();
                String objText = "";
                for (String key : keySet
                        ) {

                    String value = objMap.get(key);
                    objText += value + fieldSeparate;
                }

                allText += objText + objSeparate;
            }
            allText = allText.replace(fieldSeparate + objSeparate, objSeparate);
            return allText.substring(0, allText.length()-1);
        }
        return null;
    }

    /**
     * 按照对象分组获取json中字段值
     * @param jsonText          json文本
     * @param arrayField        arrayField
     * @param fieldSeparate     字段分隔符
     * @param objSeparate       对象分隔符
     * @return
     */
    public static String getAllFieldGroupByObj(String jsonText, String arrayField, String fieldSeparate, String objSeparate) {
        JSONObject root = JSONObject.parseObject(jsonText);
        JSONArray jsonArray = findJSONArray(root, arrayField);
        if (jsonArray != null) {
            String allText = "";
            for (Object obj : jsonArray
                    ) {
                Map<String, String> objMap = (Map<String, String>) obj;
                Set<String> keySet = objMap.keySet();
                String objText = "";
                for (String key : keySet
                        ) {
                    String value = objMap.get(key);
                    objText += value + fieldSeparate;
                }

                allText += objText + objSeparate;
            }
            allText = allText.replace(fieldSeparate + objSeparate, objSeparate);
            return allText.substring(0, allText.length()-1);
        }
        return null;
    }

    public static String getAllFieldGroupByObj2(String jsonText, String arrayField, String fieldSeparate, String objSeparate) {
        JSONObject root = JSONObject.parseObject(jsonText);
        if(jsonText!=null &&!"".equals(jsonText)){
            JSONArray jsonArray = findJSONArray(root, arrayField);
            String allText = "";
            for (Object obj : jsonArray
                    ) {
                Map<String, String> objMap = (Map<String, String>) obj;
                Set<String> keySet = objMap.keySet();

                String objText = "";
                String num1="";
                String num2="";
                String num3="";
                String num4="";
                String num5="";
                for (String key : keySet
                        ) {

                    if(key.contains("drink_type")){
                        num1=objMap.get(key);
                    }
                    if(key.contains("consumption_drink") && !key.contains("consumption_drink_")){
                        num2=objMap.get(key);
                    }
                    if(key.contains("consumption_drink_unit")){
                        num3=objMap.get(key);
                    }
                    if(key.contains("drink_freq")&& !key.contains("drink_freq_")){
                        num4=objMap.get(key);
                    }
                    if(key.contains("drink_freq_unit")){
                        num5=objMap.get(key);
                    }
                    //    String value = objMap.get(key);
                    //  objText += value + fieldSeparate;

                }
                objText=num1+num2+num3+num4+num5;
                allText += objText + objSeparate;
            }
            return allText.replace(fieldSeparate + objSeparate, objSeparate);
        }else{
            return null;
        }
    }

    /**
     * 解析json中的标化字段，返回指定标化字段的values list
     * @param text json原文
     * @param arrayField  json array字段名
     * @param stdField 标化字段 比如有type1_std,type2_std两个字段 -> 传type_std即可
     * @return
     */
    public static List<String> getList(String text, String arrayField, String stdField){
        JSONObject root = JSONObject.parseObject(text);
        JSONArray jsonArray = findJSONArray(root, arrayField);
        if (jsonArray==null){
            return new ArrayList<>();
        }
        return findStdFieldValue(jsonArray, stdField);
    }

    /**
     * 解析json中的标化字段，返回指定标化字段的单个value
     * @param text
     * @param arrayField
     * @param stdField
     * @return
     */
    public static Optional<String> getOne(String text, String arrayField, String stdField){
        List<String> list = getList(text, arrayField, stdField);
        return Optional.ofNullable(list.size() != 0 ? list.get(0) : null);
    }

    public static String getOne2(String text, String arrayField, String stdField){
        if(text!=null && !"".equals(text)){
            List<String> list = getList(text, arrayField, stdField);
            return list.size() != 0 ? list.get(0) : null;
        }else{
            return null;
        }


    }

    /**
     * 解析json中的标化字段到一个字符串(无重复值)
     * @param text
     * @param arrayField
     * @param stdField
     * @return 返回指定标化字段拼装后的的values string，比如 "value1,value2,value3"
     */
    public static String getConcatOne(String text, String arrayField, String stdField){
        JSONObject root = JSONObject.parseObject(text);
        JSONArray jsonArray = findJSONArray(root, arrayField);
        if (jsonArray==null){
            return "";
        }
        return processValuesToString(findStdFieldValue(jsonArray, stdField), DUPLICATED_VALUE_FALSE);
    }

    /**
     * 解析json中的标化字段到一个字符串(有重复值)
     * @param text
     * @param arrayField
     * @param stdField
     * @return 返回指定标化字段拼装后的的values string，比如 "value1,value2,value3,value2"
     */
    public static String getDuplicatedConcatOne(String text, String arrayField, String stdField){
        JSONObject root = JSONObject.parseObject(text);
        JSONArray jsonArray = findJSONArray(root, arrayField);
        if (jsonArray==null){
            return "";
        }
        return processValuesToString(findStdFieldValue(jsonArray, stdField),DUPLICATED_VALUE_TRUE);
    }



    /**
     * 处理标化字段list转为字符串
     * @param strings
     * @return
     */
    private static String processValuesToString(List<String> strings,int duplicated){
        String result;
        if (duplicated==DUPLICATED_VALUE_TRUE){
            Set<String> set = new HashSet<>(strings);
            result = set.stream().reduce("", (a, b) -> a + b + ",");
        }else {
            result = strings.stream().reduce("", (a, b) -> a + b + ",");
        }
        if (result.endsWith(",")){
            result = result.substring(0, result.length() - 1);
        }
        return result;
    }


    private static JSONArray findJSONArray(JSONObject jsonObject,String arrayField){
        if (jsonObject == null) {
            return null;
        }
        for (Map.Entry<String,Object> entry:jsonObject.entrySet()
                ) {
            if (arrayField.equals(entry.getKey())){
                return ((JSONArray) entry.getValue());
            }
        }
        return null;
    }

    private static List<String> findStdFieldValue(JSONArray jsonArray, String stdField){
        List<String> result = new ArrayList<>();
        Map<String, List<String>> processMap = new HashMap<>(16);
        for (Object object:jsonArray
                ) {
            JSONObject jsonObject = ((JSONObject) object);
            List<String> list = processMap.get(stdField);
            if (list==null){
                list = new ArrayList<>();
            }
            List<String> finalList = list;
            jsonObject.forEach((key, value) -> {
                if (stdField.equals(key.replaceAll("\\d+", ""))) {
                    finalList.add(String.valueOf(value));
                    processMap.put(key.replaceAll("\\d+", ""), finalList);
                }
            });
        }
        processMap.forEach((key, value) -> {
            if (key.equals(stdField)) {
                result.addAll(value);
            }
        });
        return result;
    }

    /**
     * 解析json中的标化字段
     * @param text json文本
     * @param arrayField json中的jsonarray字段名
     * @return 返回jsonarray中的各个标化字段Map
     */
    @Deprecated
    public static Map<String,List<String>> getFieldValues(String text, String arrayField){
        JSONObject root = JSONObject.parseObject(text);
        JSONArray jsonArray = findJSONArray(root, arrayField);
        Map<String, List<String>> result = new HashMap<>(16);
        if (jsonArray==null){
            return result;
        }
        List<String> stdFields = findAllStdFields(jsonArray);
        stdFields.forEach(stdField -> result.put(stdField, findStdFieldValue(jsonArray, stdField)));
        return result;
    }

    /**
     * 获取所有标化字段的field
     * @param jsonArray
     * @return
     */
    private static List<String> findAllStdFields(JSONArray jsonArray){
        if (jsonArray.size()==0){
            return new ArrayList<>();
        }
        JSONObject jsonObject = jsonArray.getJSONObject(0);
        return new ArrayList<>(jsonObject.keySet());
    }
}
