package com.example.carInventoryControl.consumer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@RequiredArgsConstructor
@Log4j2
public class CarInventoryControlConsumer {

    @KafkaListener(topics = "${topics.rent-car}", groupId = "${spring.kafka.consumer.group-id}")
    public void rentCar(String message) {
        log.info("Solicitação recebida no tópico: rent-car");
        log.info(message);

    }

    @KafkaListener(topics = "${topics.return-car}", groupId = "${spring.kafka.consumer.group-id}")
    public void returnCar(String message) {
        log.info("Solicitação recebida no tópico: return-car");
        log.info(message);

    }

    @KafkaListener(topics = "${topics.send-car-for-maintenance}", groupId = "${spring.kafka.consumer.group-id}")
    public void sendCarForMaintenance(String message) {
        log.info("Solicitação recebida no tópico: send-car-for-maintenance");
        log.info(message);

    }

}
