package com.stackroute.demo;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.DisposableBean;


public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Container destroyed.");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initialized bean - Message : " + message);
    }

    //Custom init-method
    public void customInit(){
        System.out.println("In initialization function");
    }

    //Custome destroy-method
    public void customDestroy(){
        System.out.println("In destroy function");
    }
}
