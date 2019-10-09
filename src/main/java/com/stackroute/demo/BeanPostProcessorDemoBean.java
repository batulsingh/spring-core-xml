package com.stackroute.demo;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.BeansException;


public class BeanPostProcessorDemoBean implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("In postProcessBeforeInitialization for bean: " + bean + ": beanName: " + beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("In postProcessAfterInitialization for bean: " + bean + ": beanName: " + beanName);
        return bean;
    }
}
