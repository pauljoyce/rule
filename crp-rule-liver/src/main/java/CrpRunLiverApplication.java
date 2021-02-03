package com.clinical;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.clinical")
public class CrpRunLiverApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrpRunLiverApplication.class,args);
    }
}
