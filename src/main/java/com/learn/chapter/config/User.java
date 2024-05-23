package com.learn.chapter.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// 标注这个类将被IoC容器扫描、装配，其中配置的“user”则作为Bean的名称，
// 当然也可以不配置这个字符串，那么IoC容器就会把类名的第一个字母改为小写
// 其他不变，作为Bean的名称放入IoC容器中
@Component("user")
public class User {
    //指定类属性的值，使得IoC容器给对应的Bean属性设置对应的值。
    @Value("1")
    private Long id; // 编号
    @Value("user_name_1")
    private String userName;// 用户名
    @Value("note_1")
    private String note; // 备注

    /**
     * setters and getters
     **/
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
