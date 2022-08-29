package com.example.carInventoryControl.model.states.impl;

import com.example.carInventoryControl.exceptions.BadRequestException;
import com.example.carInventoryControl.model.states.AbstractState;

import lombok.Builder;
import lombok.extern.log4j.Log4j2;

@Builder
@Log4j2
public class CarAvailable extends AbstractState {

    @Override
    public AbstractState rentCar() {

        log.info("\n\nALUGANDO CARRO QUE ESTA DISPONÍVEL\n\n");

        return CarNotAvailable.builder().build();
    }

    @Override
    public AbstractState devolutionCar() {

        log.info("\n\nNÃO É POSSÍVEL DEVOLVER UM CARRO QUE NÃO ESTÁ ALUGADO\n\n");

        return CarAvailable.builder().build();
    }

    @Override
    public AbstractState sendForMaintenance() {

        log.info("\n\nENVIANDO PARA MANUTENÇÃO UM CARRO QUE ESTA DISPONÍVEL\n\n");

        return CarInMaintenance.builder().build();
    }

}
