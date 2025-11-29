package org.example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args ) {
        BeanFactory factory = new ClassPathXmlApplicationContext("Spring.xml");
        Student student = (Student) factory.getBean("student");
        System.out.println(student);


    }
}
