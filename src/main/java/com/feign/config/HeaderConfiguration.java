package com.feign.config;

import org.springframework.context.annotation.Bean;

import feign.RequestInterceptor;

public class HeaderConfiguration {
    @Bean
    public RequestInterceptor requestInterceptor() {
        return requestTemplate -> requestTemplate.header("headerKey", "headerValues1");
    }
}
