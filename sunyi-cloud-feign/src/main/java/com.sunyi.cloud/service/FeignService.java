package com.sunyi.cloud.service;

import com.sunyi.cloud.config.FeignConfig;
import com.sunyi.cloud.config.HystrixConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eureka-client", configuration = FeignConfig.class, fallback = HystrixConfig.class)
public interface FeignService {

    @GetMapping("/hello")
    String hello(@RequestParam(value = "name") String name);
}