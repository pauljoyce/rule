package com.clinical;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication(scanBasePackages="com.clinical")
//@EnableScheduling
public class CrpRunLiverApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrpRunLiverApplication.class,args);
    }
}
