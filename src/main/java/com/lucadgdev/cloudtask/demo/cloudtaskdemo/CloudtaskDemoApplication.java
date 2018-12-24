package com.lucadgdev.cloudtask.demo.cloudtaskdemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableTask
public class CloudtaskDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudtaskDemoApplication.class, args);
    }


    @Bean
    public CommandLineRunner commandLineRunner() {
        return new HelloWorldCommandLineRunner();
    }


    private class HelloWorldCommandLineRunner implements CommandLineRunner {
        @Override
        public void run(String... args) throws Exception {
            System.out.println("Hello world!");
        }
    }
}

