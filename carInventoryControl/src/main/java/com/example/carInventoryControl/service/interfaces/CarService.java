package com.example.carInventoryControl.service.interfaces;

import java.util.List;

import com.example.carInventoryControl.model.Car;

public interface CarService {

    Car createNewCar();

    List<Car> listAll();

    void rentCar(String carId);

    void devolutionCar(String carId);

    void sendForMaintenance(String carId);

}
