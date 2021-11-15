package com.ymj.spring05.selfbdrpp;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValue;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;

public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {


    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        System.out.println("执行postProcessBeanDefinitionRegistry-----MyBeanDefinitionRegistryPostProcessor");
        // registry.registerBeanDefinition("teacher", new RootBeanDefinition(Teacher.class));
//        BeanDefinitionBuilder builder = BeanDefinitionBuilder.rootBeanDefinition(Teacher.class);
//        builder.addPropertyValue("name", "zhangsan");
//        registry.registerBeanDefinition("teacher", builder.getBeanDefinition());

        BeanDefinitionBuilder builder = BeanDefinitionBuilder.rootBeanDefinition(MySelfBeanDefinitionRegistryPostProcessor.class);
        builder.addPropertyValue("name", "张三");
        registry.registerBeanDefinition("ymj", builder.getBeanDefinition());

    }


    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("执行postProcessBeanFactory-----MyBeanDefinitionRegistryPostProcessor");
        BeanDefinition ymj = beanFactory.getBeanDefinition("ymj");
        PropertyValue name = ymj.getPropertyValues().getPropertyValue("name");
        name.setConvertedValue("lisi");
        System.out.println("------------------");
    }
}
