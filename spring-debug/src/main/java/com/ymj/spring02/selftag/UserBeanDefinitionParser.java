package com.ymj.spring02.selftag;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.beans.factory.xml.ParserContext;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

public class UserBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {

    @Override
    protected Class<?> getBeanClass(Element element) {
        return User.class;
    }

    @Override
    protected void doParse(Element element, ParserContext parserContext, BeanDefinitionBuilder builder) {
        // 获取标签具体的属性值
        String userName = element.getAttribute("username");
        String email = element.getAttribute("email");
        String password = element.getAttribute("password");

        if (StringUtils.hasText(userName)) {
            builder.addPropertyValue("username", userName);
        }
        if (StringUtils.hasText(email)) {
            builder.addPropertyValue("email", email);
        }
        if (StringUtils.hasText(password)) {
            builder.addPropertyValue("password", password);
        }
    }
}
