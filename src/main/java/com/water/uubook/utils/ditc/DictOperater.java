package com.water.uubook.utils.ditc;

import java.util.Map;

/**
 * Created by admin on 2017/11/23.
 */
public class DictOperater {

    public static String getDictionaryDesc(String code, String itemcode) {
        return DictionaryMap.getDictItemName(code, itemcode);
    }

    public static void main(String[] args) {
        System.out.println(getDictionaryDesc("CUSTOMIZE_RULE", "1"));
    }

    public static Map<String, String> getDictMap(String type) {
        return DictionaryMap.getDictItemMap(type);
    }
}
