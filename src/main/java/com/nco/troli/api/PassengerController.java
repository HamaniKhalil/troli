package com.nco.troli.api;

import com.nco.troli.services.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.nco.troli.env.Constants.PASSENGER_PATH;

@RequestMapping(PASSENGER_PATH)
@RestController
public class PassengerController {

    private final PassengerService passengerService;

    // Constructor
    @Autowired
    public PassengerController(PassengerService passengerService) {
        this.passengerService = passengerService;
    }
}
