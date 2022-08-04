package com.example.carInventoryControl.model.states;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public abstract class AbstractState {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @Indexed(unique = true)
    private String _class;

    public abstract AbstractState rentCar();

    public abstract AbstractState devolutionCar();

    public abstract AbstractState sendForMaintenance();

}
