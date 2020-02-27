package com.nco.troli.data.daos.postgres;

import com.nco.troli.data.daos.StopDao;
import com.nco.troli.data.models.Stop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import static com.nco.troli.env.Constants.STOP_PSQL_QUALIFIER;

@Repository(STOP_PSQL_QUALIFIER)
public class StopData implements StopDao {

    private final JdbcTemplate jdbcTemplate;

    // Constructor
    @Autowired
    public StopData(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public boolean insertStop(UUID id, Stop stop) {
        return false;
    }

    @Override
    public List<Stop> getAllStops() {
        return null;
    }

    @Override
    public boolean deleteStopById(UUID id) {
        return false;
    }

    @Override
    public boolean updateStopById(UUID id, Stop stop) {
        return false;
    }

    @Override
    public Optional<Stop> selectStopById(UUID id) {
        return Optional.empty();
    }
}
