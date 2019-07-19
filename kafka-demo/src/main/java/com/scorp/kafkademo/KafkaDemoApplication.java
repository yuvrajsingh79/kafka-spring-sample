package com.scorp.kafkademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaDemoApplication.class, args);
	}
	
	/*
	 * Kafka- commands to run kafka and zookeper servers
	 * 
	 * 1. sudo systemctl start kafka
	 * 2. ./bin/zookeeper-server-start.sh config/zookeeper.properties
	 * 3. ./bin/kafka-server-start.sh config/server.properties
	 * 4. ./bin/kafka-console-producer.sh --broker-list localhost:9092 --topic myTopic
	 * 5. ./bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic myTopic --from-beginning
	 */

}
