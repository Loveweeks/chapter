package com.learn.chapter.config;

import com.mysql.cj.jdbc.MysqlDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;


// 标注为Java配置类
@Configuration
// 配置扫描策略
@ComponentScan(basePackages = "com.learn.chapter.*",
// type配置通过注解的方式进行过滤，classes指定通过什么注解进行过滤
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Service.class),lazyInit = true)
public class AppConfig {



    // @Bean表示将initUser()方法返回的对象装配到IoC容器中，该方法的属性name表示Bean的名称

    public User initUser() {
        var user = new User();
        user.setId(1L);
        user.setUserName("user_name_1");
        user.setNote("note_1");
        return user;
    }

    @Bean(name = "dataSource")
    public DataSource getDataSource() {
        var dataSource = new MysqlDataSource();
        try {
            dataSource.setUrl("jdbc:mysql://localhost:3306/chapter3");
            dataSource.setUser("root");
            dataSource.setPassword("root");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dataSource;
    }







}


