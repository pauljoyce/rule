package com.clinical;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.clinical")
public class CrpRuleLungApplication {


    public static void main(String[] args) {
        SpringApplication.run(CrpRuleLungApplication.class,args);
    }

}
