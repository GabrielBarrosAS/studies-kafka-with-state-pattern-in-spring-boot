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

        throw new BadRequestException("\n\nNÃO É POSSÍVEL ALUGAR QUE JÁ ESTÁ ALUGADO\n\n");
    }

    @Override
    public AbstractState devolutionCar() {

        log.info("CARRO QUE ESTAVA ALUGADO AGORA ESTARÁ DISPONÍVEL PARA UM NOVO ALUGUEL");

        return CarAvailable.builder().build();
    }

    @Override
    public AbstractState sendForMaintenance() {

        throw new BadRequestException("\n\nNÃO É POSSÍVEL ENVIAR PARA MANUTENÇÃO UM CARRO QUE ESTÁ ALUGADO\n\n");
    }

}