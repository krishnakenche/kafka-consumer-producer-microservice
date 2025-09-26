package com.kafka.topicrw.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {
	
	
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	
	void sendToTopic(String message) {
		
		this.kafkaTemplate.send("producer-topic", message);
		
	}

}
