package com.example.demo;

import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuditAdvice {

    
    @AfterReturning(pointcut = "execution(* com.example.demo.SampleController.*(..))", returning = "result")
    public void logAfterMethodExecution(Object result) {
        // Add your custom logic to log after successful method execution (e.g., audit data, result)
        System.out.println("After executing a method in SampleController. Result: " + result);
    }

    
}
