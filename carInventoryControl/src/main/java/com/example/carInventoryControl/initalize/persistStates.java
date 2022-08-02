package com.example.carInventoryControl.initalize;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.example.carInventoryControl.model.states.impl.CarAvailable;
import com.example.carInventoryControl.model.states.impl.CarInMaintenance;
import com.example.carInventoryControl.model.states.impl.CarNotAvailable;
import com.example.carInventoryControl.repository.AbstractStateRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RequiredArgsConstructor
@Log4j2
@Configuration
public class persistStates implements CommandLineRunner {

    private final AbstractStateRepository abstractStateRepository;

    @Override
    public void run(String... args) throws Exception {

        CarAvailable carAvailable = CarAvailable.builder().build();
        CarInMaintenance carInMaintenance = CarInMaintenance.builder().build();
        CarNotAvailable carNotAvailable = CarNotAvailable.builder().build();

        abstractStateRepository.save(carAvailable);
        abstractStateRepository.save(carInMaintenance);
        abstractStateRepository.save(carNotAvailable);

        abstractStateRepository.findAll().stream().forEach(stateCar -> {

            log.info(stateCar.getClass());

        });

    }

}
