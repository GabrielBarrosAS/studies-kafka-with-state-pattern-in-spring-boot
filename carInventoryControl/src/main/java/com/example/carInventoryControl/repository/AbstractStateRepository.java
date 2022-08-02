package com.example.carInventoryControl.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.carInventoryControl.model.states.AbstractState;

public interface AbstractStateRepository extends MongoRepository<AbstractState, String> {

    AbstractState findBy_class(String _class);

}
