package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.consumer.Receiver;
import com.example.producer.Sender;

@SpringBootApplication
public class Ms3Application {

	public static void main(String[] args) {
		SpringApplication.run(Ms3Application.class, args);
	}

	@Bean
	public Sender sender() {
		return new Sender();
	}

	@Bean
	public Receiver receiver() {
		return new Receiver();
	}
}

@RestController
class Test {

	private static String BOOT_TOPIC = "tsystem.test";

	@Autowired
	Sender sender;

	@GetMapping("/v1")
	public String test() {
		sender.send(BOOT_TOPIC, "helloo");
		return "ok";
	}
}