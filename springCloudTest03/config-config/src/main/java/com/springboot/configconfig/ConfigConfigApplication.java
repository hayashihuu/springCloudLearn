package com.springboot.configconfig;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ConfigConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigConfigApplication.class, args);
    }

    @Value("${foo}")
    String foo;
    @RequestMapping(value = "/hi")
    public  String hi(){
        System.out.println(foo);
        return foo;
    }
}
