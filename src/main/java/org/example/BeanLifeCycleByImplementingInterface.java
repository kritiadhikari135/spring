package org.example;


import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifeCycleByImplementingInterface implements InitializingBean, DisposableBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("implementing afterPropertiesSet");

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("implementing destroy");

    }
}
