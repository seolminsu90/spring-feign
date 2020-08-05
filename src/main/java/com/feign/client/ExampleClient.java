package com.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import com.feign.config.HeaderConfiguration;

// Default FeignClientsConfiguration.class
@FeignClient(value = "example", url = "http://localhost:8181/example", configuration = { HeaderConfiguration.class })
public interface ExampleClient {
    @GetMapping("/status/{status}")
    String status(@PathVariable("status") String status, @RequestHeader("test") String test);

    @PostMapping(value = "/anything")
    void anything(@RequestBody String test);
}
