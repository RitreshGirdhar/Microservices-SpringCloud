package com.test.monitoring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableZipkinServer
public class MonitoringApplication {

	public static void main(String[] args) {
		SpringApplication.run(MonitoringApplication.class, args);
	}

//	@Bean
//	public AlwaysSampler defaultSampler() {
//	  return new AlwaysSampler();
//	}

}
