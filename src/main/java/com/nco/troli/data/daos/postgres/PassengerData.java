package com.nco.troli.data.daos.postgres;

import com.nco.troli.data.daos.PassengerDao;
import com.nco.troli.data.models.Passenger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import static com.nco.troli.env.Constants.PASSENGER_PSQL_QUALIFIER;

@Repository(PASSENGER_PSQL_QUALIFIER)
public class PassengerData implements PassengerDao {

    private final JdbcTemplate jdbcTemplate;

    // Constructor
    @Autowired
    public PassengerData(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public boolean insertPassenger(UUID id, Passenger passenger) {
        return false;
    }

    @Override
    public List<Passenger> getAllPassengers() {
        return null;
    }

    @Override
    public boolean deletePassengerById(UUID id) {
        return false;
    }

    @Override
    public boolean updatePassengerById(UUID id, Passenger passenger) {
        return false;
    }

    @Override
    public Optional<Passenger> selectPassengerById(UUID id) {
        return Optional.empty();
    }
}
