package com.example.carInventoryControl.service.impl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.carInventoryControl.exceptions.NotFoundException;
import com.example.carInventoryControl.model.Car;
import com.example.carInventoryControl.repository.CarRepository;
import com.example.carInventoryControl.service.interfaces.AbstractStateService;
import com.example.carInventoryControl.service.interfaces.CarService;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@RequiredArgsConstructor
@Log4j2
public class CarServiceMongoImpl implements CarService {

    private final CarRepository carRepository;

    private final AbstractStateService abstractStateService;

    public Car findCarByIdOrThrowNotFoundException(String carId) {

        Car car = carRepository.findById(carId).orElseThrow(
                () -> new NotFoundException("Car not found"));

        return car;

    }

    @Override
    public void rentCar(String carId) {
        log.info("Function rent car");
    }

    @Override
    public void devolutionCar(String carId) {

        log.info("Function devolution car");
    }

    @Override
    public void sendForMaintenance(String carId) {
        log.info("Function maintenance car");

    }

    @Override
    public Car createNewCar() {

        return carRepository.save(
                Car.builder()
                        .createdAt(LocalDateTime.now())
                        .updateAt(LocalDateTime.now())
                        .state(abstractStateService.getCarAvaliableState())
                        .build());
    }

    @Override
    public List<Car> listAll() {

        return carRepository.findAll();
    }

}
