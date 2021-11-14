package com.ymj.spring03.selfEditor;

import com.ymj.spring01.MyClassPathXmlApplicationContext;

public class SelfEditorTest {
    public static void main(String[] args) {
        MyClassPathXmlApplicationContext ac =
                new MyClassPathXmlApplicationContext("/ymj/spring03/selfEditor.xml");
        //Customer bean = ac.getBean(Customer.class);
        Customer bean  = (Customer) ac.getBean("customer");
        System.out.println(bean);
    }
}
