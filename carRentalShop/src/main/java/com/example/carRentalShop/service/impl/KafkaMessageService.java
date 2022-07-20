package com.example.carRentalShop.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.example.carRentalShop.service.interfaces.MessageService;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@RequiredArgsConstructor
@Log4j2
public class KafkaMessageService implements MessageService{

    @Value("${topics.rent-car}")
    private String topicRentCar;

    @Value("${topics.return-car}")
    private String topicReturnCar;

    @Value("${topics.send-car-for-maintenance}")
    private String topicSendCarForMaintenanceCar;

    private final KafkaTemplate<String, String> kafkaTemplate;

    @Override
    public void rentCar(Long carId) {
        
        log.info("(RentCar) Enviando solicitação");
        kafkaTemplate.send(topicRentCar,carId.toString());
        
    }
    
    @Override
    public void returnCar(Long carId) {

        log.info("(ReturnCar) Enviando solicitação");
        kafkaTemplate.send(topicReturnCar,carId.toString());
         
    }
    
    @Override
    public void sendCarForMaintenance(Long carId) {

        log.info("(SendCarForMaintenance) Enviando solicitação");
        kafkaTemplate.send(topicSendCarForMaintenanceCar,carId.toString());
        
    }
    
}
