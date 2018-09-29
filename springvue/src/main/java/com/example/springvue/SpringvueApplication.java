package com.example.springvue;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@EnableSwagger2Doc


//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
//@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class SpringvueApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringvueApplication.class, args);

    }
}
