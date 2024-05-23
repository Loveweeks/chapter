package com.learn.chapter.service;

import com.learn.chapter.config.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public void printUser(User user) {
        System.out.println("编号:" + user.getId());
        System.out.println("用户名:" + user.getUserName());
        System.out.println("备注:" + user.getNote());
    }
}
