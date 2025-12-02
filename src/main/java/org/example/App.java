package org.example;

import org.example.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args ) {
//       BeanFactory beanFactory = new ClassPathXmlApplicationContext("Spring.xml");
//       Student student = (Student) beanFactory.getBean("student");
//       System.out.println(student);

//        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
//        Animal animal = (Animal) context.getBean("animal");
//        animal.sound();
//        animal.feature();


//

    //
    //        ConfigurableApplicationContext cap = new ClassPathXmlApplicationContext("Spring.xml");
    //        cap.close();

        ApplicationContext app =new AnnotationConfigApplicationContext(AppConfig.class);
        Beann beann = app.getBean(Beann.class);
        beann.test();


    }
}
