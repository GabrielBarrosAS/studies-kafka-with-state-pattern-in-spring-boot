package com.example.carInventoryControl.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.carInventoryControl.model.Car;

public interface CarRepository extends MongoRepository<Car, String> {

}
