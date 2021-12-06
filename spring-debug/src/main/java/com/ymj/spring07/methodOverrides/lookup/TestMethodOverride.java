package com.ymj.spring07.methodOverrides.lookup;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Spring中默认的对象都是单例的，spring会在一级缓存中持有该对象，
 * 方便下次获取，那么如果是原型作用域的话，会创建一个新的对象
 * 如果想在一个单例模式的bean下引用一个原型模式的bean，怎么办？
 * 在此时就需要引用lookup-mothod标签来解决问题。
 */
public class TestMethodOverride {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("/ymj/spring07/lookup/methodOverride.xml");
        FruitPlate fruitPlate1 = (FruitPlate) ac.getBean("fruitplate1");
        fruitPlate1.getFruit();
        FruitPlate fruitPlate2 = (FruitPlate) ac.getBean("fruitplate2");
        fruitPlate2.getFruit();
    }
}
