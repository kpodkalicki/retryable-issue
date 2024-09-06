package com.kpodkalicki;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.retry.annotation.EnableRetry;

@Configuration(proxyBeanMethods = false)
@EnableRetry
public class TestConfig {

    @Primary
    @Bean
    public TestService testService(TestServiceImpl impl) {
        return impl;
    }
}
