package org.example.config;


import org.example.Animal;
import org.example.Cat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean(name = "animal")
    public Animal animal(){
        return new Cat();
    }




}
