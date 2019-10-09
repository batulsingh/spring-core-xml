package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie implements ApplicationContextAware, BeanFactoryAware, BeanNameAware{
    
    private ApplicationContext context;
    private BeanFactory beanFactory;
    private String beanName;
    
    private Actor actor;

    public void setActor(Actor actor) {
        this.actor = actor;
    }
    
    @Autowired
    public Movie(Actor actor) {
        this.actor = actor;
    }
    
    public Movie() {
    }
    
    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor + ", context=" + context + ", beanFactory=" + beanFactory + ", beanName='" + beanName + '\'' + '}';
                               
    }
   
    @Override
    public void setBeanName(String s) {
        this.beanName = s;
    }
    
     @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }
}
