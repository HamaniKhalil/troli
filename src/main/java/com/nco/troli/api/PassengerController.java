package com.nco.troli.api;

import com.nco.troli.data.models.Passenger;
import com.nco.troli.services.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;

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

    // ==== POST ====
    @PostMapping
    public void insertPassenger(@Valid @NotNull @RequestBody Passenger passenger) {
        passengerService.insertPassenger(passenger);
    }

    // ==== GET ====
    @GetMapping
    public List<Passenger> selectAllPassengers() {
        return passengerService.selectAllPassengers();
    }

    @GetMapping("/{id}")
    public Passenger selectPassengerById(@PathVariable("id") UUID id) {
        return passengerService.selectPassengerById(id).orElse(null);
    }

    // ==== PUT ====
    @PutMapping("/{id}")
    public void updatePassengerById(
            @PathVariable("id") UUID id,
            @Valid @NotNull @RequestBody Passenger passenger
    ) {
        passengerService.updatePassengerById(id, passenger);
    }

    // ==== DELETE ====
    @DeleteMapping("/{id}")
    public void deletePassengerById(@PathVariable("id") UUID id) {
        passengerService.deletePassengerById(id);
    }

    @DeleteMapping
    public void deleteAllPassengers() {
        passengerService.deleteAllPassengers();
    }
}
