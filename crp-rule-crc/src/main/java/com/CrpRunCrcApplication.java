package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.clinical")
public class CrpRunCrcApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrpRunCrcApplication.class,args);
    }
}
