package com.stackroute;

import com.stackroute.domain.Movie;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.context.support.StaticApplicationContext;


public class Main
{
    public static void main( String[] args )
    {
       System.out.println("In application context");
        
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        BeanLifecycleDemoBean beanLifecycleDemoBean = context.getBean("lifecycleBean", BeanLifecycleDemoBean.class);
        
        System.out.println("Output using getter");
        System.out.println(beanLifecycleDemoBean.getMessage());
        context.close();
    }
}
