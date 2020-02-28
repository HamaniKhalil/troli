package com.nco.troli.data.daos;

import com.nco.troli.data.models.Passenger;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PassengerDao {

    boolean insertPassenger(Passenger passenger);

    List<Passenger> selectAllPassengers();

    boolean deletePassengerById(UUID id);

    boolean updatePassengerById(UUID id, Passenger passenger);

    Optional<Passenger> selectPassengerById(UUID id);
}
