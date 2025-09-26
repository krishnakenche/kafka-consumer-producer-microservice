package com.kafka.topicrw.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
	
	@Autowired
	private KafkaProducer kafkaProducer;
	
	
	@KafkaListener(topics="consumer-topic", groupId="consumer-group")
		void readKafkaTopic(String message) {
		
		System.out.println("Message received is " + message);
		this.kafkaProducer.sendToTopic(message);
		
		
		
	}

}
