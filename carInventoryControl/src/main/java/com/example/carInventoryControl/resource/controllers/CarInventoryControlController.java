package com.example.carInventoryControl.resource.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.carInventoryControl.model.Car;
import com.example.carInventoryControl.model.states.AbstractState;
import com.example.carInventoryControl.service.interfaces.AbstractStateService;
import com.example.carInventoryControl.service.interfaces.CarService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/cars")
public class CarInventoryControlController {

    private final CarService carService;

    private final AbstractStateService abstractStateService;

    @GetMapping(path = "/all")
    public ResponseEntity<List<Car>> findAll() {

        return new ResponseEntity<>(carService.listAll(), HttpStatus.OK);
    }

    @GetMapping(path = "/states")
    public ResponseEntity<List<AbstractState>> findAllStates() {

        return new ResponseEntity<>(abstractStateService.findAll(), HttpStatus.OK);

    }

    @PostMapping(path = "/create")
    public ResponseEntity<Car> createCar() {

        return new ResponseEntity<Car>(carService.createNewCar(), HttpStatus.OK);
    }

}
