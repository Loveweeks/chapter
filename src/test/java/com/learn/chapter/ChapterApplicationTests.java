package com.learn.chapter;

import com.learn.chapter.config.AppConfig;
import com.learn.chapter.pojo.BussinessPerson;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class ChapterApplicationTests {

    @Test
    void contextLoads() {
    }
    @Test
    public void test() {
        var ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        try {
            var person = ctx.getBean(BussinessPerson.class);
            person.service();
        } finally {
            ctx.close();
        }

    }

}
