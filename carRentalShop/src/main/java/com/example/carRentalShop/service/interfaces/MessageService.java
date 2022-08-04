package com.example.carRentalShop.service.interfaces;

public interface MessageService {

    void rentCar(String carId);

    void returnCar(String carId);

    void sendCarForMaintenance(String carId);

}
