package com.example.carInventoryControl.model.states.impl;

import com.example.carInventoryControl.exceptions.BadRequestException;
import com.example.carInventoryControl.model.states.AbstractState;

import lombok.Builder;
import lombok.extern.log4j.Log4j2;

@Builder
@Log4j2
public class CarNotAvailable extends AbstractState {

    @Override
    public AbstractState rentCar() {

        log.info("\n\nNÃO É POSSÍVEL ALUGAR QUE JÁ ESTÁ ALUGADO\n\n");

        return CarNotAvailable.builder().build();
    }

    @Override
    public AbstractState devolutionCar() {

        log.info("\n\nCARRO QUE ESTAVA ALUGADO AGORA ESTARÁ DISPONÍVEL PARA UM NOVO ALUGUEL\n\n");

        return CarAvailable.builder().build();
    }

    @Override
    public AbstractState sendForMaintenance() {

        log.info("\n\nNÃO É POSSÍVEL ENVIAR PARA MANUTENÇÃO UM CARRO QUE ESTÁ ALUGADO\n\n");

        return CarNotAvailable.builder().build();
    }

}