package com.example.carRentalShop.resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.carRentalShop.service.interfaces.MessageService;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/manipulateCar")
@Log4j2
public class CarRenralShopController {

    private final MessageService messageService;

    @PostMapping(path = "/rent/{carId}")
    public ResponseEntity<String> rentCar(@PathVariable String carId) {

        log.info("Solicitação de aluguel recebida. Inicicando processo...");
        messageService.rentCar(carId);
        return new ResponseEntity<>("Solicitação de aluguel feita com sucesso", HttpStatus.OK);

    }

    @PostMapping(path = "/devolution/{carId}")
    public ResponseEntity<String> returnCar(@PathVariable String carId) {

        log.info("Solicitação de devolução recebida. Inicicando processo...");
        messageService.rentCar(carId);
        return new ResponseEntity<>("Solicitação devolução feita com sucesso", HttpStatus.OK);

    }

    @PostMapping(path = "/maintenance/{carId}")
    public ResponseEntity<String> sendCarForMaintenance(@PathVariable String carId) {

        log.info("Solicitação de envio a manutenção recebida. Inicicando processo...");
        messageService.sendCarForMaintenance(carId);
        return new ResponseEntity<>("Solicitação de manutenção feita com sucesso", HttpStatus.OK);

    }

}
