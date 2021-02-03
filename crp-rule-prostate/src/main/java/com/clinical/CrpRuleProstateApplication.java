package com.clinical;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.clinical")
public class CrpRuleProstateApplication {


    public static void main(String[] args) {
        SpringApplication.run(CrpRuleProstateApplication.class,args);
    }
}
