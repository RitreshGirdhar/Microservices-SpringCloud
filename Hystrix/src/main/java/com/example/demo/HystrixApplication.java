package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@EnableCircuitBreaker
@EnableHystrix
//@EnableTurbineStream
//@EnableTurbine
@EnableHystrixDashboard
@RestController
@SpringBootApplication
public class HystrixApplication {

	@Autowired
	HystrixService hystrixService;

	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

	@RequestMapping("/test")
	public String test() {
		return hystrixService.test();
	}

	public static void main(String[] args) {
		SpringApplication.run(HystrixApplication.class, args);
	}

}
