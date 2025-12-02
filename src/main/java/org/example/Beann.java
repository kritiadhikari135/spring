package org.example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Beann {
    @Autowired
    private Annotationss ann;

    public void test(){
        ann.info();
        System.out.println("test method from Bean class");
    }



}
