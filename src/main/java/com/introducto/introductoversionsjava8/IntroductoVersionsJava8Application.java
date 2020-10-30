package com.introducto.introductoversionsjava8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class IntroductoVersionsJava8Application {

    @GetMapping
    public String hello(){
        return "Hello from Project using Java8";
    }

    public static void main(String[] args) {
        SpringApplication.run(IntroductoVersionsJava8Application.class, args);
    }

}
