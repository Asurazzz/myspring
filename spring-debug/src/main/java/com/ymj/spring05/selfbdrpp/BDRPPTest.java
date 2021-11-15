package com.ymj.spring05.selfbdrpp;

import com.ymj.spring04.MyClassPathXmlApplicationContext;

public class BDRPPTest {

    public static void main(String[] args) {
        MyClassPathXmlApplicationContext ac =
                new MyClassPathXmlApplicationContext("/ymj/spring05/applicationContext.xml");
    }
}
