package com.kpodkalicki;

import org.springframework.retry.annotation.Retryable;
import org.springframework.retry.support.RetrySynchronizationManager;
import org.springframework.stereotype.Component;

@Component
public class TestServiceImpl implements TestService {

    @Retryable(maxAttempts = 4)
    public String doStuff() {
        System.out.println("doing stuff, retryContext: " + RetrySynchronizationManager.getContext());
        throw new RuntimeException();
    }
}
