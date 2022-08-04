package com.example.carInventoryControl.model.states.impl;

import com.example.carInventoryControl.exceptions.BadRequestException;
import com.example.carInventoryControl.model.states.AbstractState;

import lombok.Builder;
import lombok.extern.log4j.Log4j2;

@Builder
@Log4j2
public class CarInMaintenance extends AbstractState {

    @Override
    public AbstractState rentCar() {

        throw new BadRequestException("\n\nNÃO É POSSÍVEL ALUGAR UM CARRO QUE ESTÁ EM MANUTENÇÃO\n\n");
    }

    @Override
    public AbstractState devolutionCar() {

        log.info("\n\nCARRO QUE ESTAVA EM MANUTENÇÃO AGORA ESTÁ DISPONÍVEL PARA ALUGUEL\n\n");

        return CarAvailable.builder().build();
    }

    @Override
    public AbstractState sendForMaintenance() {

        throw new BadRequestException("\n\nNÃO É POSSÍVEL ENVIAR UM CARRO PARA MANUTENÇÃO NOVAMENTE\n\n");
    }

}
