package org.example.config;


import org.example.Animal;
import org.example.Cat;
import org.example.College;
import org.example.Principal;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("org.example")
public class AppConfig {
//    @Bean(name = "animal")
//    public Animal animal(){
//        return new Cat();
//    }
    @Bean
    public Principal PrincipalBean(){
        return new Principal();
    }

    @Bean
    public College CollegeBean(){
        return new College(PrincipalBean());
    }





}
