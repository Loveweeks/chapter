package com.learn.chapter.pojo;

import com.learn.chapter.pojo.def.Animal;
import com.learn.chapter.pojo.def.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BussinessPerson implements Person {

    private Animal animal = null;

   /* @Autowired
    public BussinessPerson(@Qualifier("dog") Animal animal) {
        this.animal = animal;
    }*/

    @Override
    public void service() {
        System.out.println("我是一个业务人员，我要用动物");
        this.animal.use();

    }

    @Override
    @Autowired
    @Qualifier("dog")
    public void setAnimal(Animal animal) {
        System.out.println("延迟依赖注入");
        this.animal = animal;
    }
}
