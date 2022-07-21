package com.example.carInventoryControl.model.states;

public interface StateCar {

    StateCar rentCar();

    StateCar devolutionCar();

    StateCar sendForMaintenance();

}
