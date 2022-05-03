package com.mycompany;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyWebAppApplication {

    public static void main(String[] args) {
        System.out.println("main controller");
        SpringApplication.run(MyWebAppApplication.class, args);
    }

}
