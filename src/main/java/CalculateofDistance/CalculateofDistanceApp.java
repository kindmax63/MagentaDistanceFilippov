package CalculateofDistance;


import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.MultipartConfigElement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.unit.DataSize;
/*
@FilippovController

 */

@Configuration
@SpringBootApplication
public class CalculateofDistanceApp {

    public static void main(String[] args) {
        SpringApplication.run(CalculateofDistance.CalculateofDistanceApp.class, args);
    }

    @Bean
    MultipartConfigElement multipartConfigElement() {
        MultipartConfigFactory factory = new MultipartConfigFactory();
        factory.setMaxFileSize(DataSize.parse("128KB"));
        factory.setMaxRequestSize(DataSize.parse("128KB"));
        return factory.createMultipartConfig();
    }
}
