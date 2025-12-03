package org.example;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class CollegesConfig {


    @Bean
    public Colleges collegesBean(){
        return new Colleges();
    }

}
