package com.clinical;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication(scanBasePackages="com.clinical")
public class CrpStomachApplication {
    public static void main(String[] args) {
        SpringApplication.run(CrpStomachApplication.class,args);
    }
}
