package com.example.consumer;

import java.util.concurrent.CountDownLatch;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

	private CountDownLatch latch = new CountDownLatch(1);

	public CountDownLatch getLatch() {
		return latch;
	}

	@KafkaListener(topics = "${kafka.topic.boot}")
	public void receive(ConsumerRecord<?, ?> consumerRecord) {
		System.out.println("recieved:::::::::"+consumerRecord);
		latch.countDown();
	}

}
