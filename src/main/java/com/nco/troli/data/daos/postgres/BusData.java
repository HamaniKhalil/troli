package com.nco.troli.data.daos.postgres;

import com.nco.troli.data.daos.BusDao;
import com.nco.troli.data.models.Bus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import static com.nco.troli.env.Constants.BUS_PSQL_QUALIFIER;

@Repository(BUS_PSQL_QUALIFIER)
public class BusData implements BusDao {

    private final JdbcTemplate jdbcTemplate;

    // Constructor
    @Autowired
    public BusData(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public boolean insertBus(UUID id, Bus bus) {
        return false;
    }

    @Override
    public List<Bus> getAllBuses() {
        return null;
    }

    @Override
    public boolean deleteBusById(UUID id) {
        return false;
    }

    @Override
    public boolean updateBusById(UUID id, Bus bus) {
        return false;
    }

    @Override
    public Optional<Bus> selectBusById(UUID id) {
        return Optional.empty();
    }
}
