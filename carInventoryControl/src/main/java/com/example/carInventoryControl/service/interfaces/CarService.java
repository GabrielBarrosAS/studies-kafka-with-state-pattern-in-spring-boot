package com.example.carInventoryControl.service.interfaces;

public interface CarService {

    void rentCar(Long carId);

    void devolutionCar(Long carId);

    void sendForMaintenance(Long carId);

}
