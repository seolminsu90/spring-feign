package com.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.feign.client.ExampleClient;

@RestController
public class ExampleController {
    @Autowired
    ExampleClient client;

    @GetMapping("/test")
    public String test() {
        return client.status("123", "value");
    }

}
