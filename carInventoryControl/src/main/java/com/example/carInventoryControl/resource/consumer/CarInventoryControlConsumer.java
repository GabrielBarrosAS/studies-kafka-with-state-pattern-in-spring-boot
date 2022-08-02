package com.example.carInventoryControl.resource.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.example.carInventoryControl.service.interfaces.CarService;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@RequiredArgsConstructor
@Log4j2
public class CarInventoryControlConsumer {

    private final CarService carService;

    @KafkaListener(topics = "${topics.rent-car}", groupId = "${spring.kafka.consumer.group-id}")
    public void rentCar(String carId) {
        log.info("Solicitação recebida no tópico: rent-car");
        carService.rentCar(carId);

    }

    @KafkaListener(topics = "${topics.return-car}", groupId = "${spring.kafka.consumer.group-id}")
    public void returnCar(String carId) {
        log.info("Solicitação recebida no tópico: return-car");
        carService.devolutionCar(carId);

    }

    @KafkaListener(topics = "${topics.send-car-for-maintenance}", groupId = "${spring.kafka.consumer.group-id}")
    public void sendCarForMaintenance(String carId) {
        log.info("Solicitação recebida no tópico: send-car-for-maintenance");
        carService.sendForMaintenance(carId);

    }

}
