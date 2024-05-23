package com.learn.chapter.pojo;

import com.learn.chapter.pojo.def.Animal;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class Cat implements Animal {
    @Override
    public void use() {
        System.out.println("猫"+Cat.class.getSimpleName()+"吃鱼");
    }
}
