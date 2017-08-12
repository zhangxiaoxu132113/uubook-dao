package com.water.uubook.test;

import com.water.uubook.service.CategoryService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by mrwater on 2017/8/12.
 */
public class SpringTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        CategoryService categoryService = (CategoryService) applicationContext.getBean("categoryService");

    }
}
