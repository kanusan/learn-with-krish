package com.kanu.springkafka.kafka;

import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import ch.qos.logback.classic.Logger;

@Service
public class KafkaProducer {
	
	private static final Logger LOGGER =  (Logger) LoggerFactory.getLogger(KafkaProducer.class); 
	
	private KafkaTemplate<String, String> kafkaTemplate;

	
	public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
		
		this.kafkaTemplate = kafkaTemplate;
	}
	
	public void sendMessage(String message) {
		LOGGER.info(String.format("message send %s", message));
		
		kafkaTemplate.send("springkafka", message);
	}
	
}
