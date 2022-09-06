package com.kanu.springkafka.kafka;

import org.apache.kafka.common.protocol.Message;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import com.kanu.springkafka.payload.User;

import ch.qos.logback.classic.Logger;

@Service
public class JsonKafkaProducer {
	private static Logger LOGGER = (Logger) LoggerFactory.getLogger(JsonKafkaProducer.class);
	
	private KafkaTemplate<String, User> kafkaTemplate;
	
	
	public JsonKafkaProducer(KafkaTemplate<String, User> kafkaTemplate) {
		this.kafkaTemplate = kafkaTemplate;
	}
	
	public void sendMessage(User data) {
		
		LOGGER.info(String.format("Message Sent -> %s", data.toString()));
		
		Message message = (Message) MessageBuilder
					.withPayload(data)
					.setHeader(KafkaHeaders.TOPIC, "springkafka")
					.build();
		
		kafkaTemplate.send("springkafka",(User) message);
		
				
	}
}
