package com.water.uubook.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mrwater on 2017/8/11.
 */
public class Constants {

    public static Map<Integer, String> ARTICLE_MODULE_MAP = new HashMap<>(); //文章模块

    static {
        for (ARTICLE_MODULE MODULE : ARTICLE_MODULE.values()) {
            ARTICLE_MODULE_MAP.put(MODULE.getIndex(), MODULE.getName());
        }
    }

    public class CacheKey {
        public static final String ALL_CATEGORY = "all_category";
        public final static String NEWS = "NEWS";
        public final static String GreeArticle = "GreeArticle";
        public final static String ALL_COURSE_SUBJECT = "ALL_COURSE_SUBJECT";
        public final static String ALL_ROOT_COURSE_SUBJECT = "ALL_ROOT_COURSE_SUBJECT";

        public static final String ALL_TAGS = "all_tags";
    }

    public static enum ARTICLE_MODULE {
        E_BLOG(0, "技术博文"),
        E_ZI_XUN(1, "资讯"),
        E_TOU_TIAO(11, "头条"),
        E_RUANJIAN_GENGXIN(12, "软件更新"),
        E_IT_HANGYE(13, "IT行业"),
        E_JIAO_CHENG(3, "教程"),
        E_ZHI_SHI_KU(4, "知识库");

        public static final Integer BLOG = 0;
        public static final Integer ZI_XUN = 1;
        public static final Integer TOU_TIAO = 11;
        public static final Integer RUANJIAN_GENGXIN = 12;
        public static final Integer IT_HANGYE = 13;
        public static final Integer JIAO_CHENG = 3;
        public static final Integer ZHI_SHI_KU = 4;

        public static String getName(int index) {
            for (ARTICLE_MODULE item : ARTICLE_MODULE.values()) {
                if (item.getIndex() == index) {
                    return item.name;
                }
            }
            return null;
        }

        private ARTICLE_MODULE(int index, String name) {
            this.index = index;
            this.name = name;
        }

        public int index;
        public String name;

        public int getIndex() {
            return index;
        }

        public String getName() {
            return name;
        }
    }
}
