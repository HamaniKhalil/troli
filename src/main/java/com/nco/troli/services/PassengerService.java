package com.nco.troli.services;

import com.nco.troli.data.daos.PassengerDao;
import com.nco.troli.data.models.Passenger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import static com.nco.troli.env.Constants.PASSENGER_PSQL_QUALIFIER;

@Service
public class PassengerService {

    private final PassengerDao passengerDao;

    // Constructor
    @Autowired
    public PassengerService(@Qualifier(PASSENGER_PSQL_QUALIFIER) PassengerDao passengerDao) {
        this.passengerDao = passengerDao;
    }

    public boolean addPassenger(Passenger passenger) {
        return passengerDao.insertPassenger(passenger);
    }

    public List<Passenger> getAllPassengers() {
        return passengerDao.selectAllPassengers();
    }

    public Optional<Passenger> getPassengerById(UUID id) {
        return passengerDao.selectPassengerById(id);
    }

    public boolean deletePassengerById(UUID id) {
        return passengerDao.deletePassengerById(id);
    }

    public boolean updatePassengerById(UUID id, Passenger passenger) {
        return passengerDao.updatePassengerById(id, passenger);
    }
}
