package com.learn.chapter.pojo;

import com.learn.chapter.pojo.def.Animal;
import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal {
    @Override
    public void use()
    {
        System.out.println(Dog.class.getSimpleName()+"Dog is using");
    }
}
