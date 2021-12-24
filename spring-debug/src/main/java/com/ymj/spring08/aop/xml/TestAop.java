package com.ymj.spring08.aop.xml;

import com.ymj.spring08.aop.xml.service.MyCalculator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {

    public static void main(String[] args) throws Exception{
        ApplicationContext ac = new ClassPathXmlApplicationContext("ymj/spring08.aop/xml/aop.xml");
        MyCalculator bean = ac.getBean(MyCalculator.class);
        bean.add(1, 1);
    }
}
