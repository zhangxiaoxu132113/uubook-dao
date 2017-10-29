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
        BLOG(0, "技术博文"),
        ZI_XUN(1, "资讯"),
        TOU_TIAO(11, "头条"),
        RUANJIAN_GENGXIN(12, "软件更新"),
        IT_HANGYE(13, "IT行业"),
        JIAO_CHENG(3, "教程"),
        ZHI_SHI_KU(4, "知识库");

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
