package com.example.springcloudtask;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableTask
public class SpringCloudTaskApplication {

    @Bean
    public ApplicationRunner applicationRunner() {
        return new SpringCloudTaskRunner();
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudTaskApplication.class, args);
    }


    public static class SpringCloudTaskRunner implements ApplicationRunner {

        @Override
        public void run(ApplicationArguments args) throws Exception {
            System.out.println("Hello, Spring Cloud Task!");

        }
    }

}
