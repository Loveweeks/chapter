package com.learn.chapter;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class ChapterApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChapterApplication.class, args);
    }

    // 请求路径
    @GetMapping("/test")
    public String test(HttpServletRequest request) {
// 设置请求属性
        request.setAttribute("name", "张三");
// 返回“test”，这样会映射到Thymeleaf模板（test.html）上，就可以渲染页面了
        return "test";
    }



}

