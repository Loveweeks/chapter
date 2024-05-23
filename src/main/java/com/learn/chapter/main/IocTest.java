package com.learn.chapter.main;

import com.learn.chapter.config.AppConfig;
import com.learn.chapter.config.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IocTest {
    public static void main(String[] args) {
// 使用配置文件AppConfig.java创建IoC容器
        var ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        try {
// 通过getBean()方法获取Bean
            var user = ctx.getBean(User.class);
            System.out.println(user.getUserName());
        } finally {
// 关闭IoC容器
            ctx.close();
        }
    }
}
