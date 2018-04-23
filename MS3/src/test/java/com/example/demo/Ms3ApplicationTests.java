package com.example.demo;

import java.util.concurrent.TimeUnit;

import org.junit.ClassRule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.test.rule.KafkaEmbedded;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.consumer.Receiver;
import com.example.producer.Sender;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Ms3ApplicationTests {

	private static String BOOT_TOPIC = "tsystem.test";

	@Autowired
	private Receiver receiver;

	@Autowired
	private Sender sender;
	
	@ClassRule
	public static KafkaEmbedded embeddedKafka = new KafkaEmbedded(1, true, BOOT_TOPIC);

	@Test
	public void testReceive() throws Exception {
		sender.send(BOOT_TOPIC, "Hello Boot!");
		receiver.getLatch().await(10000, TimeUnit.MILLISECONDS);
		//assertThat(receiver.getLatch().getCount()).isEqualTo(0);
	}

}
