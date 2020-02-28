package com.nco.troli.services;

import com.nco.troli.data.daos.PassengerDao;
import com.nco.troli.data.models.Passenger;
import com.nco.troli.data.repositories.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PassengerService implements PassengerDao {

    private final PassengerRepository passengerRepository;

    // Constructor
    @Autowired
    public PassengerService(PassengerRepository passengerRepository) {
        this.passengerRepository = passengerRepository;
    }

    @Override
    public boolean insertPassenger(Passenger passenger) {
        return passengerRepository.save(passenger) == null;
    }

    @Override
    public List<Passenger> selectAllPassengers() {
        return passengerRepository.findAll();
    }

    @Override
    public Optional<Passenger> selectPassengerById(UUID id) {
        return passengerRepository.findById(id);
    }

    @Override
    public boolean deletePassengerById(UUID id) {
        passengerRepository.deleteById(id);
        return true;
    }

    @Override
    public boolean updatePassengerById(UUID id, Passenger passenger) {
        if(passengerRepository.findById(id).isPresent()) {
            passenger.setId(id);
            passengerRepository.save(passenger);

            return true;
        }
        else {
            return false;
        }
    }
}
