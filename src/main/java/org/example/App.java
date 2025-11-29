package org.example;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args ) {
//       BeanFactory beanFactory = new ClassPathXmlApplicationContext("Spring.xml");
//       Student student = (Student) beanFactory.getBean("student");
//       System.out.println(student);

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
        Animal animal = (Animal) context.getBean("animal");
        animal.sound();
        animal.feature();

    }
}
