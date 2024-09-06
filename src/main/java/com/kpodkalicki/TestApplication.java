package com.kpodkalicki;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication implements CommandLineRunner {

    private final TestService testService;

    public TestApplication(TestService testService) {
        this.testService = testService;
    }

    @Override
    public void run(String... args) throws Exception {
        testService.doStuff();
    }

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }

}
