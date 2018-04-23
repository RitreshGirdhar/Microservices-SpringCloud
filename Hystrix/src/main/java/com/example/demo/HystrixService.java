package com.example.demo;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class HystrixService {

	@Autowired
	RestTemplate restTemplate;

	@HystrixCommand(fallbackMethod = "reliable")
	public String test() {
		URI uri = URI.create("http://localhost:9001/v1");
		return this.restTemplate.getForObject(uri, String.class);
	}

	public String reliable() {
		return "Cloud Native Java (O'Reilly)";
	}

}
