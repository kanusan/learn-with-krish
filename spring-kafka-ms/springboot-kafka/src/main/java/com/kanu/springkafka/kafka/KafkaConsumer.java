package com.kanu.springkafka.kafka;

import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import ch.qos.logback.classic.Logger;

@Service
public class KafkaConsumer {
	
	
	private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(KafkaConsumer.class);
	
	@KafkaListener(topics="springkafka", groupId = "myGroup")
	public void consume(String message) {
		LOGGER.info(String.format("Message received -> %s", message ));
	}
	
}
