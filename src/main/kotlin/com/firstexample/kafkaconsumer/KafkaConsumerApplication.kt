package com.firstexample.kafkaconsumer

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.stream.annotation.EnableBinding
import org.springframework.cloud.stream.messaging.Sink
import org.springframework.kafka.annotation.EnableKafka


@SpringBootApplication
@EnableKafka
@EnableBinding(Sink::class)
class KafkaConsumerApplication
 fun main(args: Array<String>) {

            SpringApplication.run(KafkaConsumerApplication::class.java, *args)
        }


