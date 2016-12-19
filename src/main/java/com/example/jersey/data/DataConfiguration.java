package com.example.jersey.data;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataConfiguration {

    @Bean
    public BaseDao demoDao() {
        return new DemoDao();
    }
}
