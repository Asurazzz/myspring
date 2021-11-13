package com.ymj;


import com.ymj.spring01.MyClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        //ApplicationContext ac = new ClassPathXmlApplicationContext("/ymj/spring01/spring-${username}.xml");
        MyClassPathXmlApplicationContext ac = new MyClassPathXmlApplicationContext("/ymj/spring01/spring.xml");

    }
}
