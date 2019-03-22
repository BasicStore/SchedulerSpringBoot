package com.annotations.scheduler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SchedulerSpringBootAnnotationsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SchedulerSpringBootAnnotationsApplication.class);
    }
}

