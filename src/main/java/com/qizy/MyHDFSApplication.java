package com.qizy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class MyHDFSApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyHDFSApplication.class, args);

    }
}
