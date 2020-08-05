package com.feign.fallback;

import org.springframework.stereotype.Component;

import com.feign.client.ExampleClient;

import feign.hystrix.FallbackFactory;

// Error fallback
@Component
public class ExampleFallback implements FallbackFactory<ExampleClient> {

    @Override
    public ExampleClient create(Throwable cause) {
        return new ExampleClient() {

            @Override
            public String status(String status, String test) {
                System.out.println(cause.getMessage());
                return "Error fallBack";
            }

            @Override
            public void anything(String test) {
            }
        };
    }

}
