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
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Movie  movieFirst = context.getBean("movieA", Movie.class);
        System.out.println(movieFirst.toString());
        Movie movieSecond = context.getBean("movieB", Movie.class);
        System.out.println(movieSecond.toString());
        System.out.println(movieFirst == movieSecond);
    }
}
