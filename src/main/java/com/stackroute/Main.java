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


public class Main {
    public static void main(String[] args) {
        beanFactory();
        appContext();
        beanDefinition();
    }

    public  static void beanFactory(){
        System.out.println("BeanFactory");
        XmlBeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
        Movie movie = (Movie) beanFactory.getBean("movie");
        System.out.println(movie.getActor());
    }

    private static void beanDefinition() {
        System.out.println("BeanDefinition");
        StaticApplicationContext staticApplicationContext = new StaticApplicationContext();
        BeanDefinitionReader reader = new XmlBeanDefinitionReader(staticApplicationContext);
        reader.loadBeanDefinitions("beans.xml");
    }

    private static void appContext() {
        System.out.println("ApplicationContext");
        ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext(
                "beans.xml");
        Movie movie = (Movie) appContext.getBean("movie");
        System.out.println(movie.getActor());
    }


}