package com.example.carRentalShop.service.interfaces;

public interface MessageService {

    void rentCar(Long carId);

    void returnCar(Long carId);
    
    void sendCarForMaintenance(Long carId);
    
}
