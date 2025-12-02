package org.example;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;


public class LifeCyceUsingAnnotation {

    @PostConstruct
    public void init() throws Exception {
        System.out.println("postconstruct");
    }

    @PreDestroy
    public void destroy() throws Exception {
        System.out.println("destroy");
    }
}
